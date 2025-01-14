/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.fenago.phonebook;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PhoneNumber extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3774448219216531380L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PhoneNumber\",\"namespace\":\"com.fenago.phonebook\",\"fields\":[{\"name\":\"areaCode\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"countryCode\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"prefix\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"number\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String areaCode;
   private java.lang.String countryCode;
   private java.lang.String prefix;
   private java.lang.String number;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PhoneNumber() {}

  /**
   * All-args constructor.
   * @param areaCode The new value for areaCode
   * @param countryCode The new value for countryCode
   * @param prefix The new value for prefix
   * @param number The new value for number
   */
  public PhoneNumber(java.lang.String areaCode, java.lang.String countryCode, java.lang.String prefix, java.lang.String number) {
    this.areaCode = areaCode;
    this.countryCode = countryCode;
    this.prefix = prefix;
    this.number = number;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return areaCode;
    case 1: return countryCode;
    case 2: return prefix;
    case 3: return number;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: areaCode = (java.lang.String)value$; break;
    case 1: countryCode = (java.lang.String)value$; break;
    case 2: prefix = (java.lang.String)value$; break;
    case 3: number = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'areaCode' field.
   * @return The value of the 'areaCode' field.
   */
  public java.lang.String getAreaCode() {
    return areaCode;
  }


  /**
   * Gets the value of the 'countryCode' field.
   * @return The value of the 'countryCode' field.
   */
  public java.lang.String getCountryCode() {
    return countryCode;
  }


  /**
   * Gets the value of the 'prefix' field.
   * @return The value of the 'prefix' field.
   */
  public java.lang.String getPrefix() {
    return prefix;
  }


  /**
   * Gets the value of the 'number' field.
   * @return The value of the 'number' field.
   */
  public java.lang.String getNumber() {
    return number;
  }


  /**
   * Creates a new PhoneNumber RecordBuilder.
   * @return A new PhoneNumber RecordBuilder
   */
  public static com.fenago.phonebook.PhoneNumber.Builder newBuilder() {
    return new com.fenago.phonebook.PhoneNumber.Builder();
  }

  /**
   * Creates a new PhoneNumber RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PhoneNumber RecordBuilder
   */
  public static com.fenago.phonebook.PhoneNumber.Builder newBuilder(com.fenago.phonebook.PhoneNumber.Builder other) {
    return new com.fenago.phonebook.PhoneNumber.Builder(other);
  }

  /**
   * Creates a new PhoneNumber RecordBuilder by copying an existing PhoneNumber instance.
   * @param other The existing instance to copy.
   * @return A new PhoneNumber RecordBuilder
   */
  public static com.fenago.phonebook.PhoneNumber.Builder newBuilder(com.fenago.phonebook.PhoneNumber other) {
    return new com.fenago.phonebook.PhoneNumber.Builder(other);
  }

  /**
   * RecordBuilder for PhoneNumber instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PhoneNumber>
    implements org.apache.avro.data.RecordBuilder<PhoneNumber> {

    private java.lang.String areaCode;
    private java.lang.String countryCode;
    private java.lang.String prefix;
    private java.lang.String number;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.fenago.phonebook.PhoneNumber.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.areaCode)) {
        this.areaCode = data().deepCopy(fields()[0].schema(), other.areaCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.countryCode)) {
        this.countryCode = data().deepCopy(fields()[1].schema(), other.countryCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.prefix)) {
        this.prefix = data().deepCopy(fields()[2].schema(), other.prefix);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.number)) {
        this.number = data().deepCopy(fields()[3].schema(), other.number);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing PhoneNumber instance
     * @param other The existing instance to copy.
     */
    private Builder(com.fenago.phonebook.PhoneNumber other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.areaCode)) {
        this.areaCode = data().deepCopy(fields()[0].schema(), other.areaCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.countryCode)) {
        this.countryCode = data().deepCopy(fields()[1].schema(), other.countryCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.prefix)) {
        this.prefix = data().deepCopy(fields()[2].schema(), other.prefix);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.number)) {
        this.number = data().deepCopy(fields()[3].schema(), other.number);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'areaCode' field.
      * @return The value.
      */
    public java.lang.String getAreaCode() {
      return areaCode;
    }

    /**
      * Sets the value of the 'areaCode' field.
      * @param value The value of 'areaCode'.
      * @return This builder.
      */
    public com.fenago.phonebook.PhoneNumber.Builder setAreaCode(java.lang.String value) {
      validate(fields()[0], value);
      this.areaCode = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'areaCode' field has been set.
      * @return True if the 'areaCode' field has been set, false otherwise.
      */
    public boolean hasAreaCode() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'areaCode' field.
      * @return This builder.
      */
    public com.fenago.phonebook.PhoneNumber.Builder clearAreaCode() {
      areaCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'countryCode' field.
      * @return The value.
      */
    public java.lang.String getCountryCode() {
      return countryCode;
    }

    /**
      * Sets the value of the 'countryCode' field.
      * @param value The value of 'countryCode'.
      * @return This builder.
      */
    public com.fenago.phonebook.PhoneNumber.Builder setCountryCode(java.lang.String value) {
      validate(fields()[1], value);
      this.countryCode = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'countryCode' field has been set.
      * @return True if the 'countryCode' field has been set, false otherwise.
      */
    public boolean hasCountryCode() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'countryCode' field.
      * @return This builder.
      */
    public com.fenago.phonebook.PhoneNumber.Builder clearCountryCode() {
      countryCode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'prefix' field.
      * @return The value.
      */
    public java.lang.String getPrefix() {
      return prefix;
    }

    /**
      * Sets the value of the 'prefix' field.
      * @param value The value of 'prefix'.
      * @return This builder.
      */
    public com.fenago.phonebook.PhoneNumber.Builder setPrefix(java.lang.String value) {
      validate(fields()[2], value);
      this.prefix = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'prefix' field has been set.
      * @return True if the 'prefix' field has been set, false otherwise.
      */
    public boolean hasPrefix() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'prefix' field.
      * @return This builder.
      */
    public com.fenago.phonebook.PhoneNumber.Builder clearPrefix() {
      prefix = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'number' field.
      * @return The value.
      */
    public java.lang.String getNumber() {
      return number;
    }

    /**
      * Sets the value of the 'number' field.
      * @param value The value of 'number'.
      * @return This builder.
      */
    public com.fenago.phonebook.PhoneNumber.Builder setNumber(java.lang.String value) {
      validate(fields()[3], value);
      this.number = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'number' field has been set.
      * @return True if the 'number' field has been set, false otherwise.
      */
    public boolean hasNumber() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'number' field.
      * @return This builder.
      */
    public com.fenago.phonebook.PhoneNumber.Builder clearNumber() {
      number = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public PhoneNumber build() {
      try {
        PhoneNumber record = new PhoneNumber();
        record.areaCode = fieldSetFlags()[0] ? this.areaCode : (java.lang.String) defaultValue(fields()[0]);
        record.countryCode = fieldSetFlags()[1] ? this.countryCode : (java.lang.String) defaultValue(fields()[1]);
        record.prefix = fieldSetFlags()[2] ? this.prefix : (java.lang.String) defaultValue(fields()[2]);
        record.number = fieldSetFlags()[3] ? this.number : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
