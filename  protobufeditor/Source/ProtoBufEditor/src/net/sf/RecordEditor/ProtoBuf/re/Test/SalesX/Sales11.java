// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Sales11.proto

package net.sf.RecordEditor.ProtoBuf.re.Test.SalesX;

/*
 *                 Warning           Warning        Warning      Warning 
 *                *------------------------------------------------------------*
 * 
 * This was generated using Protocol Buffers 2.3.0 There will be errors if
 * using other version of Protocol Buffers.
 * 
 * You can regenerate from the proto file in the copybook directory
 * 
 * Note: This package comes with the protocol buffers 2.2.0 Jar file
 * 
 */

public final class Sales11 {
  private Sales11() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum SaleType
      implements com.google.protobuf.ProtocolMessageEnum {
    RETURN(0, -1),
    OTHER(1, 0),
    SALE(2, 1),
    ;
    
    
    public final int getNumber() { return value; }
    
    public static SaleType valueOf(int value) {
      switch (value) {
        case -1: return RETURN;
        case 0: return OTHER;
        case 1: return SALE;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<SaleType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<SaleType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SaleType>() {
            public SaleType findValueByNumber(int number) {
              return SaleType.valueOf(number)
    ;        }
          };
    
    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final SaleType[] VALUES = {
      RETURN, OTHER, SALE, 
    };
    public static SaleType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    private final int index;
    private final int value;
    private SaleType(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    static {
      net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.getDescriptor();
    }
    
    // @@protoc_insertion_point(enum_scope:net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.SaleType)
  }
  
  public enum PaymentType
      implements com.google.protobuf.ProtocolMessageEnum {
    CASH(0, 1),
    CREDIT_CARD(1, 2),
    DEBIT_CARD(2, 3),
    CHEQUE(3, 4),
    ;
    
    
    public final int getNumber() { return value; }
    
    public static PaymentType valueOf(int value) {
      switch (value) {
        case 1: return CASH;
        case 2: return CREDIT_CARD;
        case 3: return DEBIT_CARD;
        case 4: return CHEQUE;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<PaymentType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<PaymentType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PaymentType>() {
            public PaymentType findValueByNumber(int number) {
              return PaymentType.valueOf(number)
    ;        }
          };
    
    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.getDescriptor().getEnumTypes().get(1);
    }
    
    private static final PaymentType[] VALUES = {
      CASH, CREDIT_CARD, DEBIT_CARD, CHEQUE, 
    };
    public static PaymentType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    private final int index;
    private final int value;
    private PaymentType(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    static {
      net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.getDescriptor();
    }
    
    // @@protoc_insertion_point(enum_scope:net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.PaymentType)
  }
  
  public static final class sale11 extends
      com.google.protobuf.GeneratedMessage {
    // Use sale11.newBuilder() to construct.
    private sale11() {
      initFields();
    }
    private sale11(boolean noInit) {}
    
    private static final sale11 defaultInstance;
    public static sale11 getDefaultInstance() {
      return defaultInstance;
    }
    
    public sale11 getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.internal_static_net_sf_RecordEditor_ProtoBuf_re_Test_SalesX_sale11_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.internal_static_net_sf_RecordEditor_ProtoBuf_re_Test_SalesX_sale11_fieldAccessorTable;
    }
    
    // required int32 keycode = 1;
    public static final int KEYCODE_FIELD_NUMBER = 1;
    private boolean hasKeycode;
    private int keycode_ = 0;
    public boolean hasKeycode() { return hasKeycode; }
    public int getKeycode() { return keycode_; }
    
    // required int32 store = 2;
    public static final int STORE_FIELD_NUMBER = 2;
    private boolean hasStore;
    private int store_ = 0;
    public boolean hasStore() { return hasStore; }
    public int getStore() { return store_; }
    
    // optional int32 department = 3;
    public static final int DEPARTMENT_FIELD_NUMBER = 3;
    private boolean hasDepartment;
    private int department_ = 0;
    public boolean hasDepartment() { return hasDepartment; }
    public int getDepartment() { return department_; }
    
    // optional int32 saleDate = 4;
    public static final int SALEDATE_FIELD_NUMBER = 4;
    private boolean hasSaleDate;
    private int saleDate_ = 0;
    public boolean hasSaleDate() { return hasSaleDate; }
    public int getSaleDate() { return saleDate_; }
    
    // optional int32 quantity = 5;
    public static final int QUANTITY_FIELD_NUMBER = 5;
    private boolean hasQuantity;
    private int quantity_ = 0;
    public boolean hasQuantity() { return hasQuantity; }
    public int getQuantity() { return quantity_; }
    
    // optional int64 price = 6;
    public static final int PRICE_FIELD_NUMBER = 6;
    private boolean hasPrice;
    private long price_ = 0L;
    public boolean hasPrice() { return hasPrice; }
    public long getPrice() { return price_; }
    
    // optional float priceFloat = 7;
    public static final int PRICEFLOAT_FIELD_NUMBER = 7;
    private boolean hasPriceFloat;
    private float priceFloat_ = 0F;
    public boolean hasPriceFloat() { return hasPriceFloat; }
    public float getPriceFloat() { return priceFloat_; }
    
    // optional double priceDouble = 8;
    public static final int PRICEDOUBLE_FIELD_NUMBER = 8;
    private boolean hasPriceDouble;
    private double priceDouble_ = 0D;
    public boolean hasPriceDouble() { return hasPriceDouble; }
    public double getPriceDouble() { return priceDouble_; }
    
    // required .net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.SaleType saleType = 10;
    public static final int SALETYPE_FIELD_NUMBER = 10;
    private boolean hasSaleType;
    private net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.SaleType saleType_;
    public boolean hasSaleType() { return hasSaleType; }
    public net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.SaleType getSaleType() { return saleType_; }
    
    // optional .net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.PaymentType paymentType = 11;
    public static final int PAYMENTTYPE_FIELD_NUMBER = 11;
    private boolean hasPaymentType;
    private net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.PaymentType paymentType_;
    public boolean hasPaymentType() { return hasPaymentType; }
    public net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.PaymentType getPaymentType() { return paymentType_; }
    
    // repeated string strArray = 21;
    public static final int STRARRAY_FIELD_NUMBER = 21;
    private java.util.List<java.lang.String> strArray_ =
      java.util.Collections.emptyList();
    public java.util.List<java.lang.String> getStrArrayList() {
      return strArray_;
    }
    public int getStrArrayCount() { return strArray_.size(); }
    public java.lang.String getStrArray(int index) {
      return strArray_.get(index);
    }
    
    private void initFields() {
      saleType_ = net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.SaleType.RETURN;
      paymentType_ = net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.PaymentType.CASH;
    }
    public final boolean isInitialized() {
      if (!hasKeycode) return false;
      if (!hasStore) return false;
      if (!hasSaleType) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasKeycode()) {
        output.writeInt32(1, getKeycode());
      }
      if (hasStore()) {
        output.writeInt32(2, getStore());
      }
      if (hasDepartment()) {
        output.writeInt32(3, getDepartment());
      }
      if (hasSaleDate()) {
        output.writeInt32(4, getSaleDate());
      }
      if (hasQuantity()) {
        output.writeInt32(5, getQuantity());
      }
      if (hasPrice()) {
        output.writeInt64(6, getPrice());
      }
      if (hasPriceFloat()) {
        output.writeFloat(7, getPriceFloat());
      }
      if (hasPriceDouble()) {
        output.writeDouble(8, getPriceDouble());
      }
      if (hasSaleType()) {
        output.writeEnum(10, getSaleType().getNumber());
      }
      if (hasPaymentType()) {
        output.writeEnum(11, getPaymentType().getNumber());
      }
      for (java.lang.String element : getStrArrayList()) {
        output.writeString(21, element);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasKeycode()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getKeycode());
      }
      if (hasStore()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, getStore());
      }
      if (hasDepartment()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, getDepartment());
      }
      if (hasSaleDate()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, getSaleDate());
      }
      if (hasQuantity()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, getQuantity());
      }
      if (hasPrice()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, getPrice());
      }
      if (hasPriceFloat()) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(7, getPriceFloat());
      }
      if (hasPriceDouble()) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(8, getPriceDouble());
      }
      if (hasSaleType()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(10, getSaleType().getNumber());
      }
      if (hasPaymentType()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(11, getPaymentType().getNumber());
      }
      {
        int dataSize = 0;
        for (java.lang.String element : getStrArrayList()) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeStringSizeNoTag(element);
        }
        size += dataSize;
        size += 2 * getStrArrayList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11 parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11 prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11 result;
      
      // Construct using net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11();
        return builder;
      }
      
      protected net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11 internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11.getDescriptor();
      }
      
      public net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11 getDefaultInstanceForType() {
        return net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11 build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11 buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11 buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.strArray_ != java.util.Collections.EMPTY_LIST) {
          result.strArray_ =
            java.util.Collections.unmodifiableList(result.strArray_);
        }
        net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11 returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11) {
          return mergeFrom((net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11 other) {
        if (other == net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11.getDefaultInstance()) return this;
        if (other.hasKeycode()) {
          setKeycode(other.getKeycode());
        }
        if (other.hasStore()) {
          setStore(other.getStore());
        }
        if (other.hasDepartment()) {
          setDepartment(other.getDepartment());
        }
        if (other.hasSaleDate()) {
          setSaleDate(other.getSaleDate());
        }
        if (other.hasQuantity()) {
          setQuantity(other.getQuantity());
        }
        if (other.hasPrice()) {
          setPrice(other.getPrice());
        }
        if (other.hasPriceFloat()) {
          setPriceFloat(other.getPriceFloat());
        }
        if (other.hasPriceDouble()) {
          setPriceDouble(other.getPriceDouble());
        }
        if (other.hasSaleType()) {
          setSaleType(other.getSaleType());
        }
        if (other.hasPaymentType()) {
          setPaymentType(other.getPaymentType());
        }
        if (!other.strArray_.isEmpty()) {
          if (result.strArray_.isEmpty()) {
            result.strArray_ = new java.util.ArrayList<java.lang.String>();
          }
          result.strArray_.addAll(other.strArray_);
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setKeycode(input.readInt32());
              break;
            }
            case 16: {
              setStore(input.readInt32());
              break;
            }
            case 24: {
              setDepartment(input.readInt32());
              break;
            }
            case 32: {
              setSaleDate(input.readInt32());
              break;
            }
            case 40: {
              setQuantity(input.readInt32());
              break;
            }
            case 48: {
              setPrice(input.readInt64());
              break;
            }
            case 61: {
              setPriceFloat(input.readFloat());
              break;
            }
            case 65: {
              setPriceDouble(input.readDouble());
              break;
            }
            case 80: {
              int rawValue = input.readEnum();
              net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.SaleType value = net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.SaleType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(10, rawValue);
              } else {
                setSaleType(value);
              }
              break;
            }
            case 88: {
              int rawValue = input.readEnum();
              net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.PaymentType value = net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.PaymentType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(11, rawValue);
              } else {
                setPaymentType(value);
              }
              break;
            }
            case 170: {
              addStrArray(input.readString());
              break;
            }
          }
        }
      }
      
      
      // required int32 keycode = 1;
      public boolean hasKeycode() {
        return result.hasKeycode();
      }
      public int getKeycode() {
        return result.getKeycode();
      }
      public Builder setKeycode(int value) {
        result.hasKeycode = true;
        result.keycode_ = value;
        return this;
      }
      public Builder clearKeycode() {
        result.hasKeycode = false;
        result.keycode_ = 0;
        return this;
      }
      
      // required int32 store = 2;
      public boolean hasStore() {
        return result.hasStore();
      }
      public int getStore() {
        return result.getStore();
      }
      public Builder setStore(int value) {
        result.hasStore = true;
        result.store_ = value;
        return this;
      }
      public Builder clearStore() {
        result.hasStore = false;
        result.store_ = 0;
        return this;
      }
      
      // optional int32 department = 3;
      public boolean hasDepartment() {
        return result.hasDepartment();
      }
      public int getDepartment() {
        return result.getDepartment();
      }
      public Builder setDepartment(int value) {
        result.hasDepartment = true;
        result.department_ = value;
        return this;
      }
      public Builder clearDepartment() {
        result.hasDepartment = false;
        result.department_ = 0;
        return this;
      }
      
      // optional int32 saleDate = 4;
      public boolean hasSaleDate() {
        return result.hasSaleDate();
      }
      public int getSaleDate() {
        return result.getSaleDate();
      }
      public Builder setSaleDate(int value) {
        result.hasSaleDate = true;
        result.saleDate_ = value;
        return this;
      }
      public Builder clearSaleDate() {
        result.hasSaleDate = false;
        result.saleDate_ = 0;
        return this;
      }
      
      // optional int32 quantity = 5;
      public boolean hasQuantity() {
        return result.hasQuantity();
      }
      public int getQuantity() {
        return result.getQuantity();
      }
      public Builder setQuantity(int value) {
        result.hasQuantity = true;
        result.quantity_ = value;
        return this;
      }
      public Builder clearQuantity() {
        result.hasQuantity = false;
        result.quantity_ = 0;
        return this;
      }
      
      // optional int64 price = 6;
      public boolean hasPrice() {
        return result.hasPrice();
      }
      public long getPrice() {
        return result.getPrice();
      }
      public Builder setPrice(long value) {
        result.hasPrice = true;
        result.price_ = value;
        return this;
      }
      public Builder clearPrice() {
        result.hasPrice = false;
        result.price_ = 0L;
        return this;
      }
      
      // optional float priceFloat = 7;
      public boolean hasPriceFloat() {
        return result.hasPriceFloat();
      }
      public float getPriceFloat() {
        return result.getPriceFloat();
      }
      public Builder setPriceFloat(float value) {
        result.hasPriceFloat = true;
        result.priceFloat_ = value;
        return this;
      }
      public Builder clearPriceFloat() {
        result.hasPriceFloat = false;
        result.priceFloat_ = 0F;
        return this;
      }
      
      // optional double priceDouble = 8;
      public boolean hasPriceDouble() {
        return result.hasPriceDouble();
      }
      public double getPriceDouble() {
        return result.getPriceDouble();
      }
      public Builder setPriceDouble(double value) {
        result.hasPriceDouble = true;
        result.priceDouble_ = value;
        return this;
      }
      public Builder clearPriceDouble() {
        result.hasPriceDouble = false;
        result.priceDouble_ = 0D;
        return this;
      }
      
      // required .net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.SaleType saleType = 10;
      public boolean hasSaleType() {
        return result.hasSaleType();
      }
      public net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.SaleType getSaleType() {
        return result.getSaleType();
      }
      public Builder setSaleType(net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.SaleType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasSaleType = true;
        result.saleType_ = value;
        return this;
      }
      public Builder clearSaleType() {
        result.hasSaleType = false;
        result.saleType_ = net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.SaleType.RETURN;
        return this;
      }
      
      // optional .net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.PaymentType paymentType = 11;
      public boolean hasPaymentType() {
        return result.hasPaymentType();
      }
      public net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.PaymentType getPaymentType() {
        return result.getPaymentType();
      }
      public Builder setPaymentType(net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.PaymentType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasPaymentType = true;
        result.paymentType_ = value;
        return this;
      }
      public Builder clearPaymentType() {
        result.hasPaymentType = false;
        result.paymentType_ = net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.PaymentType.CASH;
        return this;
      }
      
      // repeated string strArray = 21;
      public java.util.List<java.lang.String> getStrArrayList() {
        return java.util.Collections.unmodifiableList(result.strArray_);
      }
      public int getStrArrayCount() {
        return result.getStrArrayCount();
      }
      public java.lang.String getStrArray(int index) {
        return result.getStrArray(index);
      }
      public Builder setStrArray(int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.strArray_.set(index, value);
        return this;
      }
      public Builder addStrArray(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  if (result.strArray_.isEmpty()) {
          result.strArray_ = new java.util.ArrayList<java.lang.String>();
        }
        result.strArray_.add(value);
        return this;
      }
      public Builder addAllStrArray(
          java.lang.Iterable<? extends java.lang.String> values) {
        if (result.strArray_.isEmpty()) {
          result.strArray_ = new java.util.ArrayList<java.lang.String>();
        }
        super.addAll(values, result.strArray_);
        return this;
      }
      public Builder clearStrArray() {
        result.strArray_ = java.util.Collections.emptyList();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.sale11)
    }
    
    static {
      defaultInstance = new sale11(true);
      net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.sale11)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_sf_RecordEditor_ProtoBuf_re_Test_SalesX_sale11_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_sf_RecordEditor_ProtoBuf_re_Test_SalesX_sale11_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rSales11.proto\022+net.sf.RecordEditor.Pro" +
      "toBuf.re.Test.SalesX\"\302\002\n\006sale11\022\017\n\007keyco" +
      "de\030\001 \002(\005\022\r\n\005store\030\002 \002(\005\022\022\n\ndepartment\030\003 " +
      "\001(\005\022\020\n\010saleDate\030\004 \001(\005\022\020\n\010quantity\030\005 \001(\005\022" +
      "\r\n\005price\030\006 \001(\003\022\022\n\npriceFloat\030\007 \001(\002\022\023\n\013pr" +
      "iceDouble\030\010 \001(\001\022G\n\010saleType\030\n \002(\01625.net." +
      "sf.RecordEditor.ProtoBuf.re.Test.SalesX." +
      "SaleType\022M\n\013paymentType\030\013 \001(\01628.net.sf.R" +
      "ecordEditor.ProtoBuf.re.Test.SalesX.Paym" +
      "entType\022\020\n\010strArray\030\025 \003(\t*4\n\010SaleType\022\023\n",
      "\006RETURN\020\377\377\377\377\377\377\377\377\377\001\022\t\n\005OTHER\020\000\022\010\n\004SALE\020\001*" +
      "D\n\013PaymentType\022\010\n\004CASH\020\001\022\017\n\013CREDIT_CARD\020" +
      "\002\022\016\n\nDEBIT_CARD\020\003\022\n\n\006CHEQUE\020\004B\002H\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_net_sf_RecordEditor_ProtoBuf_re_Test_SalesX_sale11_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_net_sf_RecordEditor_ProtoBuf_re_Test_SalesX_sale11_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_sf_RecordEditor_ProtoBuf_re_Test_SalesX_sale11_descriptor,
              new java.lang.String[] { "Keycode", "Store", "Department", "SaleDate", "Quantity", "Price", "PriceFloat", "PriceDouble", "SaleType", "PaymentType", "StrArray", },
              net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11.class,
              net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.Sales11.sale11.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}