/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.avro.service;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class OrderFailure extends org.apache.avro.specific.SpecificExceptionBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4147867850028292639L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"error\",\"name\":\"OrderFailure\",\"namespace\":\"com.example.avro.service\",\"fields\":[{\"name\":\"message\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();


  @Deprecated public java.lang.CharSequence message$;

  public OrderFailure() {
    super();
  }

  public OrderFailure(Object value) {
    super(value);
  }

  public OrderFailure(Throwable cause) {
    super(cause);
  }

  public OrderFailure(Object value, Throwable cause) {
    super(value, cause);
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return message$;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: message$ = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'message$' field.
   * @return The value of the 'message$' field.
   */
  public java.lang.CharSequence getMessage$() {
    return message$;
  }


  /**
   * Sets the value of the 'message$' field.
   * @param value the value to set.
   */
  public void setMessage$(java.lang.CharSequence value) {
    this.message$ = value;
  }

  /**
   * Creates a new OrderFailure RecordBuilder.
   * @return A new OrderFailure RecordBuilder
   */
  public static com.example.avro.service.OrderFailure.Builder newBuilder() {
    return new com.example.avro.service.OrderFailure.Builder();
  }

  /**
   * Creates a new OrderFailure RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OrderFailure RecordBuilder
   */
  public static com.example.avro.service.OrderFailure.Builder newBuilder(com.example.avro.service.OrderFailure.Builder other) {
    if (other == null) {
      return new com.example.avro.service.OrderFailure.Builder();
    } else {
      return new com.example.avro.service.OrderFailure.Builder(other);
    }
  }

  /**
   * Creates a new OrderFailure RecordBuilder by copying an existing OrderFailure instance.
   * @param other The existing instance to copy.
   * @return A new OrderFailure RecordBuilder
   */
  public static com.example.avro.service.OrderFailure.Builder newBuilder(com.example.avro.service.OrderFailure other) {
    if (other == null) {
      return new com.example.avro.service.OrderFailure.Builder();
    } else {
      return new com.example.avro.service.OrderFailure.Builder(other);
    }
  }

  /**
   * RecordBuilder for OrderFailure instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificErrorBuilderBase<OrderFailure>
    implements org.apache.avro.data.ErrorBuilder<OrderFailure> {

    private java.lang.CharSequence message$;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.avro.service.OrderFailure.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.message$)) {
        this.message$ = data().deepCopy(fields()[0].schema(), other.message$);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing OrderFailure instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.avro.service.OrderFailure other) {
      super(other);
      if (isValidValue(fields()[0], other.message$)) {
        this.message$ = data().deepCopy(fields()[0].schema(), other.message$);
        fieldSetFlags()[0] = true;
      }
    }

    @Override
    public com.example.avro.service.OrderFailure.Builder setValue(Object value) {
      super.setValue(value);
      return this;
    }

    @Override
    public com.example.avro.service.OrderFailure.Builder clearValue() {
      super.clearValue();
      return this;
    }

    @Override
    public com.example.avro.service.OrderFailure.Builder setCause(Throwable cause) {
      super.setCause(cause);
      return this;
    }

    @Override
    public com.example.avro.service.OrderFailure.Builder clearCause() {
      super.clearCause();
      return this;
    }

    /**
      * Gets the value of the 'message$' field.
      * @return The value.
      */
    public java.lang.CharSequence getMessage$() {
      return message$;
    }


    /**
      * Sets the value of the 'message$' field.
      * @param value The value of 'message$'.
      * @return This builder.
      */
    public com.example.avro.service.OrderFailure.Builder setMessage$(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.message$ = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'message$' field has been set.
      * @return True if the 'message$' field has been set, false otherwise.
      */
    public boolean hasMessage$() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'message$' field.
      * @return This builder.
      */
    public com.example.avro.service.OrderFailure.Builder clearMessage$() {
      message$ = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OrderFailure build() {
      try {
        OrderFailure record = new OrderFailure(getValue(), getCause());
        record.message$ = fieldSetFlags()[0] ? this.message$ : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OrderFailure>
    WRITER$ = (org.apache.avro.io.DatumWriter<OrderFailure>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OrderFailure>
    READER$ = (org.apache.avro.io.DatumReader<OrderFailure>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










