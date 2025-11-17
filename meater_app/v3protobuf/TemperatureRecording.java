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
public final class TemperatureRecording extends Message<TemperatureRecording, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer ambient;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer internal;
    public static final ProtoAdapter<TemperatureRecording> ADAPTER = new ProtoAdapter_TemperatureRecording();
    public static final Integer DEFAULT_INTERNAL = 0;
    public static final Integer DEFAULT_AMBIENT = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<TemperatureRecording, Builder> {
        public Integer ambient;
        public Integer internal;

        public Builder ambient(Integer num) {
            this.ambient = num;
            return this;
        }

        public Builder internal(Integer num) {
            this.internal = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public TemperatureRecording m384build() {
            Integer num = this.internal;
            if (num != null && this.ambient != null) {
                return new TemperatureRecording(this.internal, this.ambient, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "internal", this.ambient, "ambient"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_TemperatureRecording extends ProtoAdapter<TemperatureRecording> {
        ProtoAdapter_TemperatureRecording() {
            super(FieldEncoding.LENGTH_DELIMITED, TemperatureRecording.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public TemperatureRecording m385decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m384build();
                }
                if (nextTag == 1) {
                    builder.internal((Integer) ProtoAdapter.SINT32.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.ambient((Integer) ProtoAdapter.SINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, TemperatureRecording temperatureRecording) {
            ProtoAdapter protoAdapter = ProtoAdapter.SINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, temperatureRecording.internal);
            protoAdapter.encodeWithTag(protoWriter, 2, temperatureRecording.ambient);
            protoWriter.writeBytes(temperatureRecording.unknownFields());
        }

        public int encodedSize(TemperatureRecording temperatureRecording) {
            ProtoAdapter protoAdapter = ProtoAdapter.SINT32;
            return protoAdapter.encodedSizeWithTag(1, temperatureRecording.internal) + protoAdapter.encodedSizeWithTag(2, temperatureRecording.ambient) + temperatureRecording.unknownFields().I();
        }

        public TemperatureRecording redact(TemperatureRecording temperatureRecording) {
            Builder m383newBuilder = temperatureRecording.m383newBuilder();
            m383newBuilder.clearUnknownFields();
            return m383newBuilder.m384build();
        }
    }

    public TemperatureRecording(Integer num, Integer num2) {
        this(num, num2, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TemperatureRecording)) {
            return false;
        }
        TemperatureRecording temperatureRecording = (TemperatureRecording) obj;
        if (Internal.equals(unknownFields(), temperatureRecording.unknownFields()) && Internal.equals(this.internal, temperatureRecording.internal) && Internal.equals(this.ambient, temperatureRecording.ambient)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.internal;
            int i12 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (hashCode + i10) * 37;
            Integer num2 = this.ambient;
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
        if (this.internal != null) {
            sb.append(", internal=");
            sb.append(this.internal);
        }
        if (this.ambient != null) {
            sb.append(", ambient=");
            sb.append(this.ambient);
        }
        StringBuilder replace = sb.replace(0, 2, "TemperatureRecording{");
        replace.append('}');
        return replace.toString();
    }

    public TemperatureRecording(Integer num, Integer num2, h hVar) {
        super(ADAPTER, hVar);
        this.internal = num;
        this.ambient = num2;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m383newBuilder() {
        Builder builder = new Builder();
        builder.internal = this.internal;
        builder.ambient = this.ambient;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
