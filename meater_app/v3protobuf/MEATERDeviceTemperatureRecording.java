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
public final class MEATERDeviceTemperatureRecording extends Message<MEATERDeviceTemperatureRecording, Builder> {
    public static final ProtoAdapter<MEATERDeviceTemperatureRecording> ADAPTER = new ProtoAdapter_MEATERDeviceTemperatureRecording();
    public static final Integer DEFAULT_AMBIENT = 0;
    public static final Integer DEFAULT_BATTERY = 0;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", tag = 1)
    public final Integer ambient;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", tag = 2)
    public final Integer battery;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MEATERDeviceTemperatureRecording, Builder> {
        public Integer ambient;
        public Integer battery;

        public Builder ambient(Integer num) {
            this.ambient = num;
            return this;
        }

        public Builder battery(Integer num) {
            this.battery = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MEATERDeviceTemperatureRecording m216build() {
            return new MEATERDeviceTemperatureRecording(this.ambient, this.battery, buildUnknownFields());
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MEATERDeviceTemperatureRecording extends ProtoAdapter<MEATERDeviceTemperatureRecording> {
        ProtoAdapter_MEATERDeviceTemperatureRecording() {
            super(FieldEncoding.LENGTH_DELIMITED, MEATERDeviceTemperatureRecording.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MEATERDeviceTemperatureRecording m217decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m216build();
                }
                if (nextTag == 1) {
                    builder.ambient((Integer) ProtoAdapter.SINT32.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.battery((Integer) ProtoAdapter.SINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MEATERDeviceTemperatureRecording mEATERDeviceTemperatureRecording) {
            Integer num = mEATERDeviceTemperatureRecording.ambient;
            if (num != null) {
                ProtoAdapter.SINT32.encodeWithTag(protoWriter, 1, num);
            }
            Integer num2 = mEATERDeviceTemperatureRecording.battery;
            if (num2 != null) {
                ProtoAdapter.SINT32.encodeWithTag(protoWriter, 2, num2);
            }
            protoWriter.writeBytes(mEATERDeviceTemperatureRecording.unknownFields());
        }

        public int encodedSize(MEATERDeviceTemperatureRecording mEATERDeviceTemperatureRecording) {
            Integer num = mEATERDeviceTemperatureRecording.ambient;
            int encodedSizeWithTag = num != null ? ProtoAdapter.SINT32.encodedSizeWithTag(1, num) : 0;
            Integer num2 = mEATERDeviceTemperatureRecording.battery;
            return encodedSizeWithTag + (num2 != null ? ProtoAdapter.SINT32.encodedSizeWithTag(2, num2) : 0) + mEATERDeviceTemperatureRecording.unknownFields().I();
        }

        public MEATERDeviceTemperatureRecording redact(MEATERDeviceTemperatureRecording mEATERDeviceTemperatureRecording) {
            Builder m215newBuilder = mEATERDeviceTemperatureRecording.m215newBuilder();
            m215newBuilder.clearUnknownFields();
            return m215newBuilder.m216build();
        }
    }

    public MEATERDeviceTemperatureRecording(Integer num, Integer num2) {
        this(num, num2, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MEATERDeviceTemperatureRecording)) {
            return false;
        }
        MEATERDeviceTemperatureRecording mEATERDeviceTemperatureRecording = (MEATERDeviceTemperatureRecording) obj;
        if (Internal.equals(unknownFields(), mEATERDeviceTemperatureRecording.unknownFields()) && Internal.equals(this.ambient, mEATERDeviceTemperatureRecording.ambient) && Internal.equals(this.battery, mEATERDeviceTemperatureRecording.battery)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.ambient;
            int i12 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (hashCode + i10) * 37;
            Integer num2 = this.battery;
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
        if (this.ambient != null) {
            sb.append(", ambient=");
            sb.append(this.ambient);
        }
        if (this.battery != null) {
            sb.append(", battery=");
            sb.append(this.battery);
        }
        StringBuilder replace = sb.replace(0, 2, "MEATERDeviceTemperatureRecording{");
        replace.append('}');
        return replace.toString();
    }

    public MEATERDeviceTemperatureRecording(Integer num, Integer num2, h hVar) {
        super(ADAPTER, hVar);
        this.ambient = num;
        this.battery = num2;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m215newBuilder() {
        Builder builder = new Builder();
        builder.ambient = this.ambient;
        builder.battery = this.battery;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
