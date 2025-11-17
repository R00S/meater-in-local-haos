package com.apptionlabs.meater_app.v2protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import ql.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public final class V2TemperatureRange extends Message<V2TemperatureRange, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer high;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer low;
    public static final ProtoAdapter<V2TemperatureRange> ADAPTER = new ProtoAdapter_V2TemperatureRange();
    public static final Integer DEFAULT_LOW = 0;
    public static final Integer DEFAULT_HIGH = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2TemperatureRange, Builder> {
        public Integer high;
        public Integer low;

        public Builder high(Integer num) {
            this.high = num;
            return this;
        }

        public Builder low(Integer num) {
            this.low = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2TemperatureRange m132build() {
            Integer num = this.low;
            if (num != null && this.high != null) {
                return new V2TemperatureRange(this.low, this.high, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "low", this.high, "high"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2TemperatureRange extends ProtoAdapter<V2TemperatureRange> {
        ProtoAdapter_V2TemperatureRange() {
            super(FieldEncoding.LENGTH_DELIMITED, V2TemperatureRange.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2TemperatureRange m133decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m132build();
                }
                if (nextTag == 1) {
                    builder.low((Integer) ProtoAdapter.SINT32.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.high((Integer) ProtoAdapter.SINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2TemperatureRange v2TemperatureRange) {
            ProtoAdapter protoAdapter = ProtoAdapter.SINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, v2TemperatureRange.low);
            protoAdapter.encodeWithTag(protoWriter, 2, v2TemperatureRange.high);
            protoWriter.writeBytes(v2TemperatureRange.unknownFields());
        }

        public int encodedSize(V2TemperatureRange v2TemperatureRange) {
            ProtoAdapter protoAdapter = ProtoAdapter.SINT32;
            return protoAdapter.encodedSizeWithTag(1, v2TemperatureRange.low) + protoAdapter.encodedSizeWithTag(2, v2TemperatureRange.high) + v2TemperatureRange.unknownFields().I();
        }

        public V2TemperatureRange redact(V2TemperatureRange v2TemperatureRange) {
            Builder m131newBuilder = v2TemperatureRange.m131newBuilder();
            m131newBuilder.clearUnknownFields();
            return m131newBuilder.m132build();
        }
    }

    public V2TemperatureRange(Integer num, Integer num2) {
        this(num, num2, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2TemperatureRange)) {
            return false;
        }
        V2TemperatureRange v2TemperatureRange = (V2TemperatureRange) obj;
        if (Internal.equals(unknownFields(), v2TemperatureRange.unknownFields()) && Internal.equals(this.low, v2TemperatureRange.low) && Internal.equals(this.high, v2TemperatureRange.high)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.low;
            int i12 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (hashCode + i10) * 37;
            Integer num2 = this.high;
            if (num2 != null) {
                i12 = num2.hashCode();
            }
            int i14 = i13 + i12;
            ((Message) this).hashCode = i14;
            return i14;
        }
        return i11;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.low != null) {
            sb.append(", low=");
            sb.append(this.low);
        }
        if (this.high != null) {
            sb.append(", high=");
            sb.append(this.high);
        }
        StringBuilder replace = sb.replace(0, 2, "V2TemperatureRange{");
        replace.append('}');
        return replace.toString();
    }

    public V2TemperatureRange(Integer num, Integer num2, h hVar) {
        super(ADAPTER, hVar);
        this.low = num;
        this.high = num2;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m131newBuilder() {
        Builder builder = new Builder();
        builder.low = this.low;
        builder.high = this.high;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
