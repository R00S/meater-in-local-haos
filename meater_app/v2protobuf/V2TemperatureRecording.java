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
public final class V2TemperatureRecording extends Message<V2TemperatureRecording, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer ambient;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer internal;
    public static final ProtoAdapter<V2TemperatureRecording> ADAPTER = new ProtoAdapter_V2TemperatureRecording();
    public static final Integer DEFAULT_INTERNAL = 0;
    public static final Integer DEFAULT_AMBIENT = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2TemperatureRecording, Builder> {
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
        public V2TemperatureRecording m135build() {
            Integer num = this.internal;
            if (num != null && this.ambient != null) {
                return new V2TemperatureRecording(this.internal, this.ambient, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "internal", this.ambient, "ambient"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2TemperatureRecording extends ProtoAdapter<V2TemperatureRecording> {
        ProtoAdapter_V2TemperatureRecording() {
            super(FieldEncoding.LENGTH_DELIMITED, V2TemperatureRecording.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2TemperatureRecording m136decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m135build();
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

        public void encode(ProtoWriter protoWriter, V2TemperatureRecording v2TemperatureRecording) {
            ProtoAdapter protoAdapter = ProtoAdapter.SINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, v2TemperatureRecording.internal);
            protoAdapter.encodeWithTag(protoWriter, 2, v2TemperatureRecording.ambient);
            protoWriter.writeBytes(v2TemperatureRecording.unknownFields());
        }

        public int encodedSize(V2TemperatureRecording v2TemperatureRecording) {
            ProtoAdapter protoAdapter = ProtoAdapter.SINT32;
            return protoAdapter.encodedSizeWithTag(1, v2TemperatureRecording.internal) + protoAdapter.encodedSizeWithTag(2, v2TemperatureRecording.ambient) + v2TemperatureRecording.unknownFields().I();
        }

        public V2TemperatureRecording redact(V2TemperatureRecording v2TemperatureRecording) {
            Builder m134newBuilder = v2TemperatureRecording.m134newBuilder();
            m134newBuilder.clearUnknownFields();
            return m134newBuilder.m135build();
        }
    }

    public V2TemperatureRecording(Integer num, Integer num2) {
        this(num, num2, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2TemperatureRecording)) {
            return false;
        }
        V2TemperatureRecording v2TemperatureRecording = (V2TemperatureRecording) obj;
        if (Internal.equals(unknownFields(), v2TemperatureRecording.unknownFields()) && Internal.equals(this.internal, v2TemperatureRecording.internal) && Internal.equals(this.ambient, v2TemperatureRecording.ambient)) {
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
        StringBuilder replace = sb.replace(0, 2, "V2TemperatureRecording{");
        replace.append('}');
        return replace.toString();
    }

    public V2TemperatureRecording(Integer num, Integer num2, h hVar) {
        super(ADAPTER, hVar);
        this.internal = num;
        this.ambient = num2;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m134newBuilder() {
        Builder builder = new Builder();
        builder.internal = this.internal;
        builder.ambient = this.ambient;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
