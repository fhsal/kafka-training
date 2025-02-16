package com.fenago.kafka.producer;

import com.fenago.kafka.model.StockPrice;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class StockSender implements Runnable{

    private final StockPrice stockPriceHigh;
    private final StockPrice stockPriceLow;
    private final Producer<String, StockPrice> producer;
    private final int delayMinMs;
    private final int delayMaxMs;
    private final Logger logger = LoggerFactory.getLogger(StockSender.class);
    private final String topic;

    StockSender(final String topic, final StockPrice stockPriceHigh,
                       final StockPrice stockPriceLow,
                       final Producer<String, StockPrice> producer,
                       final int delayMinMs,
                       final int delayMaxMs) {
        this.stockPriceHigh = stockPriceHigh;
        this.stockPriceLow = stockPriceLow;
        this.producer = producer;
        this.delayMinMs = delayMinMs;
        this.delayMaxMs = delayMaxMs;
        this.topic = topic;
    }


    public void run() {
        final Random random = new Random(System.currentTimeMillis());
        int sentCount = 0;


        while (true) {
            sentCount++;

            final ProducerRecord <String, StockPrice> record =
                                        createRandomRecord(random);
            final int delay = randomIntBetween(random, delayMaxMs, delayMinMs);

            try {
                // TODO SEND THE RECORD
                final Future<RecordMetadata> future = null;
                //producer.send(record);
                if (sentCount % 100 == 0) {displayRecordMetaData(record, future);}
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                if (Thread.interrupted()) {
                    break;
                }
            } catch (ExecutionException e) {
                logger.error("problem sending record to producer", e);
            }
        }
    }

    private void displayRecordMetaData(final ProducerRecord<String, StockPrice> record,
                                       final Future<RecordMetadata> future)
                                throws InterruptedException, ExecutionException {

        //TODO Get the recordMetadata and print out the topic, offset and partition information.
        final RecordMetadata recordMetadata = future.get();

        // HINT
//        logger.info(String.format("\n\t\t\tkey=%s, value=%s " +
//                        "\n\t\t\tsent to topic=%s part=%d off=%d at time=%s",
//                record.key(),
//                record.value().toJson(),
//                recordMetadata.topic(),
//                recordMetadata.partition(),
//                recordMetadata.offset(),
//                new Date(recordMetadata.timestamp())
//                ));
    }

    private int randomIntBetween(final Random random,
                                       final int max,
                                       final int min) {
        return random.nextInt(max - min + 1) + min;
    }

    private ProducerRecord<String, StockPrice> createRandomRecord(
                final Random random) {

        final int dollarAmount = randomIntBetween(random,
                stockPriceHigh.getDollars(), stockPriceLow.getDollars());

        final int centAmount = randomIntBetween(random,
                stockPriceHigh.getCents(), stockPriceLow.getCents());

        final StockPrice stockPrice = new StockPrice(
                stockPriceHigh.getName(), dollarAmount, centAmount);

        // TODO Create a Product Record.

        //return new ProducerRecord<>(topic, stockPrice.getName(),
        //        stockPrice);
        return null;
    }
}
