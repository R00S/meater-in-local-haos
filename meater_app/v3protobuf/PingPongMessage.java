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
public final class PingPongMessage extends Message<PingPongMessage, Builder> {
    public static final ProtoAdapter<PingPongMessage> ADAPTER = new ProtoAdapter_PingPongMessage();
    public static final PingPongMessageType DEFAULT_TYPE = PingPongMessageType.PING;
    public static final Integer DEFAULT_VALUE = 0;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.PingPongMessageType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final PingPongMessageType type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer value;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<PingPongMessage, Builder> {
        public PingPongMessageType type;
        public Integer value;

        public Builder type(PingPongMessageType pingPongMessageType) {
            this.type = pingPongMessageType;
            return this;
        }

        public Builder value(Integer num) {
            this.value = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public PingPongMessage m312build() {
            PingPongMessageType pingPongMessageType = this.type;
            if (pingPongMessageType != null && this.value != null) {
                return new PingPongMessage(this.type, this.value, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{pingPongMessageType, "type", this.value, "value"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_PingPongMessage extends ProtoAdapter<PingPongMessage> {
        ProtoAdapter_PingPongMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, PingPongMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public PingPongMessage m313decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m312build();
                }
                if (nextTag == 1) {
                    try {
                        builder.type((PingPongMessageType) PingPongMessageType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.value((Integer) ProtoAdapter.UINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, PingPongMessage pingPongMessage) {
            PingPongMessageType.ADAPTER.encodeWithTag(protoWriter, 1, pingPongMessage.type);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, pingPongMessage.value);
            protoWriter.writeBytes(pingPongMessage.unknownFields());
        }

        public int encodedSize(PingPongMessage pingPongMessage) {
            return PingPongMessageType.ADAPTER.encodedSizeWithTag(1, pingPongMessage.type) + ProtoAdapter.UINT32.encodedSizeWithTag(2, pingPongMessage.value) + pingPongMessage.unknownFields().I();
        }

        public PingPongMessage redact(PingPongMessage pingPongMessage) {
            Builder m311newBuilder = pingPongMessage.m311newBuilder();
            m311newBuilder.clearUnknownFields();
            return m311newBuilder.m312build();
        }
    }

    public PingPongMessage(PingPongMessageType pingPongMessageType, Integer num) {
        this(pingPongMessageType, num, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PingPongMessage)) {
            return false;
        }
        PingPongMessage pingPongMessage = (PingPongMessage) obj;
        if (Internal.equals(unknownFields(), pingPongMessage.unknownFields()) && Internal.equals(this.type, pingPongMessage.type) && Internal.equals(this.value, pingPongMessage.value)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            PingPongMessageType pingPongMessageType = this.type;
            int i12 = 0;
            if (pingPongMessageType != null) {
                i10 = pingPongMessageType.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (hashCode + i10) * 37;
            Integer num = this.value;
            if (num != null) {
                i12 = num.hashCode();
            }
            int i14 = i13 + i12;
            ((Message) this).hashCode = i14;
            return i14;
        }
        return i11;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        StringBuilder replace = sb.replace(0, 2, "PingPongMessage{");
        replace.append('}');
        return replace.toString();
    }

    public PingPongMessage(PingPongMessageType pingPongMessageType, Integer num, h hVar) {
        super(ADAPTER, hVar);
        this.type = pingPongMessageType;
        this.value = num;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m311newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.value = this.value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
