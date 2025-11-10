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
public final class V2TemperatureHistoryRequestMessage extends Message<V2TemperatureHistoryRequestMessage, Builder> {
    public static final ProtoAdapter<V2TemperatureHistoryRequestMessage> ADAPTER = new ProtoAdapter_V2TemperatureHistoryRequestMessage();
    public static final Long DEFAULT_DEVICEID = 0L;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long deviceID;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2TemperatureHistoryRequestMessage, Builder> {
        public Long deviceID;

        public Builder deviceID(Long l10) {
            this.deviceID = l10;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2TemperatureHistoryRequestMessage m129build() {
            Long l10 = this.deviceID;
            if (l10 != null) {
                return new V2TemperatureHistoryRequestMessage(this.deviceID, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "deviceID"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2TemperatureHistoryRequestMessage extends ProtoAdapter<V2TemperatureHistoryRequestMessage> {
        ProtoAdapter_V2TemperatureHistoryRequestMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, V2TemperatureHistoryRequestMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2TemperatureHistoryRequestMessage m130decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m129build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.deviceID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2TemperatureHistoryRequestMessage v2TemperatureHistoryRequestMessage) {
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, v2TemperatureHistoryRequestMessage.deviceID);
            protoWriter.writeBytes(v2TemperatureHistoryRequestMessage.unknownFields());
        }

        public int encodedSize(V2TemperatureHistoryRequestMessage v2TemperatureHistoryRequestMessage) {
            return ProtoAdapter.FIXED64.encodedSizeWithTag(1, v2TemperatureHistoryRequestMessage.deviceID) + v2TemperatureHistoryRequestMessage.unknownFields().I();
        }

        public V2TemperatureHistoryRequestMessage redact(V2TemperatureHistoryRequestMessage v2TemperatureHistoryRequestMessage) {
            Builder m128newBuilder = v2TemperatureHistoryRequestMessage.m128newBuilder();
            m128newBuilder.clearUnknownFields();
            return m128newBuilder.m129build();
        }
    }

    public V2TemperatureHistoryRequestMessage(Long l10) {
        this(l10, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2TemperatureHistoryRequestMessage)) {
            return false;
        }
        V2TemperatureHistoryRequestMessage v2TemperatureHistoryRequestMessage = (V2TemperatureHistoryRequestMessage) obj;
        if (Internal.equals(unknownFields(), v2TemperatureHistoryRequestMessage.unknownFields()) && Internal.equals(this.deviceID, v2TemperatureHistoryRequestMessage.deviceID)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Long l10 = this.deviceID;
            if (l10 != null) {
                i10 = l10.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = hashCode + i10;
            ((Message) this).hashCode = i12;
            return i12;
        }
        return i11;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.deviceID != null) {
            sb.append(", deviceID=");
            sb.append(this.deviceID);
        }
        StringBuilder replace = sb.replace(0, 2, "V2TemperatureHistoryRequestMessage{");
        replace.append('}');
        return replace.toString();
    }

    public V2TemperatureHistoryRequestMessage(Long l10, h hVar) {
        super(ADAPTER, hVar);
        this.deviceID = l10;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m128newBuilder() {
        Builder builder = new Builder();
        builder.deviceID = this.deviceID;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
