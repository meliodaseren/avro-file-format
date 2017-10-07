/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.iii.fileformat101;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Stock extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Stock\",\"namespace\":\"com.iii.fileformat101\",\"fields\":[{\"name\":\"symbol\",\"type\":\"string\"},{\"name\":\"date\",\"type\":\"string\"},{\"name\":\"open\",\"type\":\"double\"},{\"name\":\"high\",\"type\":\"double\"},{\"name\":\"low\",\"type\":\"double\"},{\"name\":\"close\",\"type\":\"double\"},{\"name\":\"volume\",\"type\":\"int\"},{\"name\":\"adjClose\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence symbol;
  @Deprecated public CharSequence date;
  @Deprecated public double open;
  @Deprecated public double high;
  @Deprecated public double low;
  @Deprecated public double close;
  @Deprecated public int volume;
  @Deprecated public double adjClose;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Stock() {}

  /**
   * All-args constructor.
   */
  public Stock(CharSequence symbol, CharSequence date, Double open, Double high, Double low, Double close, Integer volume, Double adjClose) {
    this.symbol = symbol;
    this.date = date;
    this.open = open;
    this.high = high;
    this.low = low;
    this.close = close;
    this.volume = volume;
    this.adjClose = adjClose;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public Object get(int field$) {
    switch (field$) {
    case 0: return symbol;
    case 1: return date;
    case 2: return open;
    case 3: return high;
    case 4: return low;
    case 5: return close;
    case 6: return volume;
    case 7: return adjClose;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: symbol = (CharSequence)value$; break;
    case 1: date = (CharSequence)value$; break;
    case 2: open = (Double)value$; break;
    case 3: high = (Double)value$; break;
    case 4: low = (Double)value$; break;
    case 5: close = (Double)value$; break;
    case 6: volume = (Integer)value$; break;
    case 7: adjClose = (Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'symbol' field.
   */
  public CharSequence getSymbol() {
    return symbol;
  }

  /**
   * Sets the value of the 'symbol' field.
   * @param value the value to set.
   */
  public void setSymbol(CharSequence value) {
    this.symbol = value;
  }

  /**
   * Gets the value of the 'date' field.
   */
  public CharSequence getDate() {
    return date;
  }

  /**
   * Sets the value of the 'date' field.
   * @param value the value to set.
   */
  public void setDate(CharSequence value) {
    this.date = value;
  }

  /**
   * Gets the value of the 'open' field.
   */
  public Double getOpen() {
    return open;
  }

  /**
   * Sets the value of the 'open' field.
   * @param value the value to set.
   */
  public void setOpen(Double value) {
    this.open = value;
  }

  /**
   * Gets the value of the 'high' field.
   */
  public Double getHigh() {
    return high;
  }

  /**
   * Sets the value of the 'high' field.
   * @param value the value to set.
   */
  public void setHigh(Double value) {
    this.high = value;
  }

  /**
   * Gets the value of the 'low' field.
   */
  public Double getLow() {
    return low;
  }

  /**
   * Sets the value of the 'low' field.
   * @param value the value to set.
   */
  public void setLow(Double value) {
    this.low = value;
  }

  /**
   * Gets the value of the 'close' field.
   */
  public Double getClose() {
    return close;
  }

  /**
   * Sets the value of the 'close' field.
   * @param value the value to set.
   */
  public void setClose(Double value) {
    this.close = value;
  }

  /**
   * Gets the value of the 'volume' field.
   */
  public Integer getVolume() {
    return volume;
  }

  /**
   * Sets the value of the 'volume' field.
   * @param value the value to set.
   */
  public void setVolume(Integer value) {
    this.volume = value;
  }

  /**
   * Gets the value of the 'adjClose' field.
   */
  public Double getAdjClose() {
    return adjClose;
  }

  /**
   * Sets the value of the 'adjClose' field.
   * @param value the value to set.
   */
  public void setAdjClose(Double value) {
    this.adjClose = value;
  }

  /**
   * Creates a new Stock RecordBuilder.
   * @return A new Stock RecordBuilder
   */
  public static Builder newBuilder() {
    return new Builder();
  }
  
  /**
   * Creates a new Stock RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Stock RecordBuilder
   */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }
  
  /**
   * Creates a new Stock RecordBuilder by copying an existing Stock instance.
   * @param other The existing instance to copy.
   * @return A new Stock RecordBuilder
   */
  public static Builder newBuilder(Stock other) {
    return new Builder(other);
  }
  
  /**
   * RecordBuilder for Stock instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Stock>
    implements org.apache.avro.data.RecordBuilder<Stock> {

    private CharSequence symbol;
    private CharSequence date;
    private double open;
    private double high;
    private double low;
    private double close;
    private int volume;
    private double adjClose;

    /** Creates a new Builder */
    private Builder() {
      super(Stock.SCHEMA$);
    }
    
    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.symbol)) {
        this.symbol = data().deepCopy(fields()[0].schema(), other.symbol);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.date)) {
        this.date = data().deepCopy(fields()[1].schema(), other.date);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.open)) {
        this.open = data().deepCopy(fields()[2].schema(), other.open);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.high)) {
        this.high = data().deepCopy(fields()[3].schema(), other.high);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.low)) {
        this.low = data().deepCopy(fields()[4].schema(), other.low);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.close)) {
        this.close = data().deepCopy(fields()[5].schema(), other.close);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.volume)) {
        this.volume = data().deepCopy(fields()[6].schema(), other.volume);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.adjClose)) {
        this.adjClose = data().deepCopy(fields()[7].schema(), other.adjClose);
        fieldSetFlags()[7] = true;
      }
    }
    
    /**
     * Creates a Builder by copying an existing Stock instance
     * @param other The existing instance to copy.
     */
    private Builder(Stock other) {
            super(Stock.SCHEMA$);
      if (isValidValue(fields()[0], other.symbol)) {
        this.symbol = data().deepCopy(fields()[0].schema(), other.symbol);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.date)) {
        this.date = data().deepCopy(fields()[1].schema(), other.date);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.open)) {
        this.open = data().deepCopy(fields()[2].schema(), other.open);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.high)) {
        this.high = data().deepCopy(fields()[3].schema(), other.high);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.low)) {
        this.low = data().deepCopy(fields()[4].schema(), other.low);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.close)) {
        this.close = data().deepCopy(fields()[5].schema(), other.close);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.volume)) {
        this.volume = data().deepCopy(fields()[6].schema(), other.volume);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.adjClose)) {
        this.adjClose = data().deepCopy(fields()[7].schema(), other.adjClose);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'symbol' field.
      * @return The value.
      */
    public CharSequence getSymbol() {
      return symbol;
    }

    /**
      * Sets the value of the 'symbol' field.
      * @param value The value of 'symbol'.
      * @return This builder.
      */
    public Builder setSymbol(CharSequence value) {
      validate(fields()[0], value);
      this.symbol = value;
      fieldSetFlags()[0] = true;
      return this; 
    }

    /**
      * Checks whether the 'symbol' field has been set.
      * @return True if the 'symbol' field has been set, false otherwise.
      */
    public boolean hasSymbol() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'symbol' field.
      * @return This builder.
      */
    public Builder clearSymbol() {
      symbol = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'date' field.
      * @return The value.
      */
    public CharSequence getDate() {
      return date;
    }

    /**
      * Sets the value of the 'date' field.
      * @param value The value of 'date'.
      * @return This builder.
      */
    public Builder setDate(CharSequence value) {
      validate(fields()[1], value);
      this.date = value;
      fieldSetFlags()[1] = true;
      return this; 
    }

    /**
      * Checks whether the 'date' field has been set.
      * @return True if the 'date' field has been set, false otherwise.
      */
    public boolean hasDate() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'date' field.
      * @return This builder.
      */
    public Builder clearDate() {
      date = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'open' field.
      * @return The value.
      */
    public Double getOpen() {
      return open;
    }

    /**
      * Sets the value of the 'open' field.
      * @param value The value of 'open'.
      * @return This builder.
      */
    public Builder setOpen(double value) {
      validate(fields()[2], value);
      this.open = value;
      fieldSetFlags()[2] = true;
      return this; 
    }

    /**
      * Checks whether the 'open' field has been set.
      * @return True if the 'open' field has been set, false otherwise.
      */
    public boolean hasOpen() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'open' field.
      * @return This builder.
      */
    public Builder clearOpen() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'high' field.
      * @return The value.
      */
    public Double getHigh() {
      return high;
    }

    /**
      * Sets the value of the 'high' field.
      * @param value The value of 'high'.
      * @return This builder.
      */
    public Builder setHigh(double value) {
      validate(fields()[3], value);
      this.high = value;
      fieldSetFlags()[3] = true;
      return this; 
    }

    /**
      * Checks whether the 'high' field has been set.
      * @return True if the 'high' field has been set, false otherwise.
      */
    public boolean hasHigh() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'high' field.
      * @return This builder.
      */
    public Builder clearHigh() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'low' field.
      * @return The value.
      */
    public Double getLow() {
      return low;
    }

    /**
      * Sets the value of the 'low' field.
      * @param value The value of 'low'.
      * @return This builder.
      */
    public Builder setLow(double value) {
      validate(fields()[4], value);
      this.low = value;
      fieldSetFlags()[4] = true;
      return this; 
    }

    /**
      * Checks whether the 'low' field has been set.
      * @return True if the 'low' field has been set, false otherwise.
      */
    public boolean hasLow() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'low' field.
      * @return This builder.
      */
    public Builder clearLow() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'close' field.
      * @return The value.
      */
    public Double getClose() {
      return close;
    }

    /**
      * Sets the value of the 'close' field.
      * @param value The value of 'close'.
      * @return This builder.
      */
    public Builder setClose(double value) {
      validate(fields()[5], value);
      this.close = value;
      fieldSetFlags()[5] = true;
      return this; 
    }

    /**
      * Checks whether the 'close' field has been set.
      * @return True if the 'close' field has been set, false otherwise.
      */
    public boolean hasClose() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'close' field.
      * @return This builder.
      */
    public Builder clearClose() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'volume' field.
      * @return The value.
      */
    public Integer getVolume() {
      return volume;
    }

    /**
      * Sets the value of the 'volume' field.
      * @param value The value of 'volume'.
      * @return This builder.
      */
    public Builder setVolume(int value) {
      validate(fields()[6], value);
      this.volume = value;
      fieldSetFlags()[6] = true;
      return this; 
    }

    /**
      * Checks whether the 'volume' field has been set.
      * @return True if the 'volume' field has been set, false otherwise.
      */
    public boolean hasVolume() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'volume' field.
      * @return This builder.
      */
    public Builder clearVolume() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'adjClose' field.
      * @return The value.
      */
    public Double getAdjClose() {
      return adjClose;
    }

    /**
      * Sets the value of the 'adjClose' field.
      * @param value The value of 'adjClose'.
      * @return This builder.
      */
    public Builder setAdjClose(double value) {
      validate(fields()[7], value);
      this.adjClose = value;
      fieldSetFlags()[7] = true;
      return this; 
    }

    /**
      * Checks whether the 'adjClose' field has been set.
      * @return True if the 'adjClose' field has been set, false otherwise.
      */
    public boolean hasAdjClose() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'adjClose' field.
      * @return This builder.
      */
    public Builder clearAdjClose() {
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public Stock build() {
      try {
        Stock record = new Stock();
        record.symbol = fieldSetFlags()[0] ? this.symbol : (CharSequence) defaultValue(fields()[0]);
        record.date = fieldSetFlags()[1] ? this.date : (CharSequence) defaultValue(fields()[1]);
        record.open = fieldSetFlags()[2] ? this.open : (Double) defaultValue(fields()[2]);
        record.high = fieldSetFlags()[3] ? this.high : (Double) defaultValue(fields()[3]);
        record.low = fieldSetFlags()[4] ? this.low : (Double) defaultValue(fields()[4]);
        record.close = fieldSetFlags()[5] ? this.close : (Double) defaultValue(fields()[5]);
        record.volume = fieldSetFlags()[6] ? this.volume : (Integer) defaultValue(fields()[6]);
        record.adjClose = fieldSetFlags()[7] ? this.adjClose : (Double) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
