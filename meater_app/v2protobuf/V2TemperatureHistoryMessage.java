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
public final class V2TemperatureHistoryMessage extends Message<V2TemperatureHistoryMessage, Builder> {
    public static final ProtoAdapter<V2TemperatureHistoryMessage> ADAPTER = new ProtoAdapter_V2TemperatureHistoryMessage();
    public static final Long DEFAULT_DEVICEID = 0L;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long deviceID;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2TemperatureHistory#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final V2TemperatureHistory history;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2TemperatureHistoryMessage, Builder> {
        public Long deviceID;
        public V2TemperatureHistory history;

        public Builder deviceID(Long l10) {
            this.deviceID = l10;
            return this;
        }

        public Builder history(V2TemperatureHistory v2TemperatureHistory) {
            this.history = v2TemperatureHistory;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2TemperatureHistoryMessage m126build() {
            Long l10 = this.deviceID;
            if (l10 != null && this.history != null) {
                return new V2TemperatureHistoryMessage(this.deviceID, this.history, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "deviceID", this.history, "history"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2TemperatureHistoryMessage extends ProtoAdapter<V2TemperatureHistoryMessage> {
        ProtoAdapter_V2TemperatureHistoryMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, V2TemperatureHistoryMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2TemperatureHistoryMessage m127decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m126build();
                }
                if (nextTag == 1) {
                    builder.deviceID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.history((V2TemperatureHistory) V2TemperatureHistory.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2TemperatureHistoryMessage v2TemperatureHistoryMessage) {
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, v2TemperatureHistoryMessage.deviceID);
            V2TemperatureHistory.ADAPTER.encodeWithTag(protoWriter, 2, v2TemperatureHistoryMessage.history);
            protoWriter.writeBytes(v2TemperatureHistoryMessage.unknownFields());
        }

        public int encodedSize(V2TemperatureHistoryMessage v2TemperatureHistoryMessage) {
            return ProtoAdapter.FIXED64.encodedSizeWithTag(1, v2TemperatureHistoryMessage.deviceID) + V2TemperatureHistory.ADAPTER.encodedSizeWithTag(2, v2TemperatureHistoryMessage.history) + v2TemperatureHistoryMessage.unknownFields().I();
        }

        public V2TemperatureHistoryMessage redact(V2TemperatureHistoryMessage v2TemperatureHistoryMessage) {
            Builder m125newBuilder = v2TemperatureHistoryMessage.m125newBuilder();
            V2TemperatureHistory v2TemperatureHistory = m125newBuilder.history;
            if (v2TemperatureHistory != null) {
                m125newBuilder.history = (V2TemperatureHistory) V2TemperatureHistory.ADAPTER.redact(v2TemperatureHistory);
            }
            m125newBuilder.clearUnknownFields();
            return m125newBuilder.m126build();
        }
    }

    public V2TemperatureHistoryMessage(Long l10, V2TemperatureHistory v2TemperatureHistory) {
        this(l10, v2TemperatureHistory, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2TemperatureHistoryMessage)) {
            return false;
        }
        V2TemperatureHistoryMessage v2TemperatureHistoryMessage = (V2TemperatureHistoryMessage) obj;
        if (Internal.equals(unknownFields(), v2TemperatureHistoryMessage.unknownFields()) && Internal.equals(this.deviceID, v2TemperatureHistoryMessage.deviceID) && Internal.equals(this.history, v2TemperatureHistoryMessage.history)) {
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
            int i12 = 0;
            if (l10 != null) {
                i10 = l10.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (hashCode + i10) * 37;
            V2TemperatureHistory v2TemperatureHistory = this.history;
            if (v2TemperatureHistory != null) {
                i12 = v2TemperatureHistory.hashCode();
            }
            int i14 = i13 + i12;
            ((Message) this).hashCode = i14;
            return i14;
        }
        return i11;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.deviceID != null) {
            sb.append(", deviceID=");
            sb.append(this.deviceID);
        }
        if (this.history != null) {
            sb.append(", history=");
            sb.append(this.history);
        }
        StringBuilder replace = sb.replace(0, 2, "V2TemperatureHistoryMessage{");
        replace.append('}');
        return replace.toString();
    }

    public V2TemperatureHistoryMessage(Long l10, V2TemperatureHistory v2TemperatureHistory, h hVar) {
        super(ADAPTER, hVar);
        this.deviceID = l10;
        this.history = v2TemperatureHistory;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m125newBuilder() {
        Builder builder = new Builder();
        builder.deviceID = this.deviceID;
        builder.history = this.history;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
