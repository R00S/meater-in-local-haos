package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import ql.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public final class TemperatureRange extends Message<TemperatureRange, Builder> {
    public static final ProtoAdapter<TemperatureRange> ADAPTER = new ProtoAdapter_TemperatureRange();
    public static final Integer DEFAULT_LOW = 0;
    public static final Integer DEFAULT_OFFSET = 0;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer low;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer offset;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<TemperatureRange, Builder> {
        public Integer low;
        public Integer offset;

        public Builder low(Integer num) {
            this.low = num;
            return this;
        }

        public Builder offset(Integer num) {
            this.offset = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public TemperatureRange m381build() {
            Integer num = this.low;
            if (num != null && this.offset != null) {
                return new TemperatureRange(this.low, this.offset, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "low", this.offset, "offset"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_TemperatureRange extends ProtoAdapter<TemperatureRange> {
        ProtoAdapter_TemperatureRange() {
            super(FieldEncoding.LENGTH_DELIMITED, TemperatureRange.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public TemperatureRange m382decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m381build();
                }
                if (nextTag == 1) {
                    builder.low((Integer) ProtoAdapter.SINT32.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.offset((Integer) ProtoAdapter.SINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, TemperatureRange temperatureRange) {
            ProtoAdapter protoAdapter = ProtoAdapter.SINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, temperatureRange.low);
            protoAdapter.encodeWithTag(protoWriter, 2, temperatureRange.offset);
            protoWriter.writeBytes(temperatureRange.unknownFields());
        }

        public int encodedSize(TemperatureRange temperatureRange) {
            ProtoAdapter protoAdapter = ProtoAdapter.SINT32;
            return protoAdapter.encodedSizeWithTag(1, temperatureRange.low) + protoAdapter.encodedSizeWithTag(2, temperatureRange.offset) + temperatureRange.unknownFields().I();
        }

        public TemperatureRange redact(TemperatureRange temperatureRange) {
            Builder m380newBuilder = temperatureRange.m380newBuilder();
            m380newBuilder.clearUnknownFields();
            return m380newBuilder.m381build();
        }
    }

    public TemperatureRange(Integer num, Integer num2) {
        this(num, num2, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TemperatureRange)) {
            return false;
        }
        TemperatureRange temperatureRange = (TemperatureRange) obj;
        if (Internal.equals(unknownFields(), temperatureRange.unknownFields()) && Internal.equals(this.low, temperatureRange.low) && Internal.equals(this.offset, temperatureRange.offset)) {
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
            Integer num2 = this.offset;
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
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        StringBuilder replace = sb.replace(0, 2, "TemperatureRange{");
        replace.append('}');
        return replace.toString();
    }

    public TemperatureRange(Integer num, Integer num2, h hVar) {
        super(ADAPTER, hVar);
        this.low = num;
        this.offset = num2;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m380newBuilder() {
        Builder builder = new Builder();
        builder.low = this.low;
        builder.offset = this.offset;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
