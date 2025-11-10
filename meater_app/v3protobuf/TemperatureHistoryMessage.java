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
public final class TemperatureHistoryMessage extends Message<TemperatureHistoryMessage, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long cookID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long deviceID;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.TemperatureHistory#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final TemperatureHistory history;
    public static final ProtoAdapter<TemperatureHistoryMessage> ADAPTER = new ProtoAdapter_TemperatureHistoryMessage();
    public static final Long DEFAULT_DEVICEID = 0L;
    public static final Long DEFAULT_COOKID = 0L;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<TemperatureHistoryMessage, Builder> {
        public Long cookID;
        public Long deviceID;
        public TemperatureHistory history;

        public Builder cookID(Long l10) {
            this.cookID = l10;
            return this;
        }

        public Builder deviceID(Long l10) {
            this.deviceID = l10;
            return this;
        }

        public Builder history(TemperatureHistory temperatureHistory) {
            this.history = temperatureHistory;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public TemperatureHistoryMessage m375build() {
            Long l10 = this.deviceID;
            if (l10 != null && this.history != null && this.cookID != null) {
                return new TemperatureHistoryMessage(this.deviceID, this.history, this.cookID, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "deviceID", this.history, "history", this.cookID, "cookID"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_TemperatureHistoryMessage extends ProtoAdapter<TemperatureHistoryMessage> {
        ProtoAdapter_TemperatureHistoryMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, TemperatureHistoryMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public TemperatureHistoryMessage m376decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m375build();
                }
                if (nextTag == 1) {
                    builder.deviceID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.history((TemperatureHistory) TemperatureHistory.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.cookID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, TemperatureHistoryMessage temperatureHistoryMessage) {
            ProtoAdapter protoAdapter = ProtoAdapter.FIXED64;
            protoAdapter.encodeWithTag(protoWriter, 1, temperatureHistoryMessage.deviceID);
            TemperatureHistory.ADAPTER.encodeWithTag(protoWriter, 2, temperatureHistoryMessage.history);
            protoAdapter.encodeWithTag(protoWriter, 3, temperatureHistoryMessage.cookID);
            protoWriter.writeBytes(temperatureHistoryMessage.unknownFields());
        }

        public int encodedSize(TemperatureHistoryMessage temperatureHistoryMessage) {
            ProtoAdapter protoAdapter = ProtoAdapter.FIXED64;
            return protoAdapter.encodedSizeWithTag(1, temperatureHistoryMessage.deviceID) + TemperatureHistory.ADAPTER.encodedSizeWithTag(2, temperatureHistoryMessage.history) + protoAdapter.encodedSizeWithTag(3, temperatureHistoryMessage.cookID) + temperatureHistoryMessage.unknownFields().I();
        }

        public TemperatureHistoryMessage redact(TemperatureHistoryMessage temperatureHistoryMessage) {
            Builder m374newBuilder = temperatureHistoryMessage.m374newBuilder();
            TemperatureHistory temperatureHistory = m374newBuilder.history;
            if (temperatureHistory != null) {
                m374newBuilder.history = (TemperatureHistory) TemperatureHistory.ADAPTER.redact(temperatureHistory);
            }
            m374newBuilder.clearUnknownFields();
            return m374newBuilder.m375build();
        }
    }

    public TemperatureHistoryMessage(Long l10, TemperatureHistory temperatureHistory, Long l11) {
        this(l10, temperatureHistory, l11, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TemperatureHistoryMessage)) {
            return false;
        }
        TemperatureHistoryMessage temperatureHistoryMessage = (TemperatureHistoryMessage) obj;
        if (Internal.equals(unknownFields(), temperatureHistoryMessage.unknownFields()) && Internal.equals(this.deviceID, temperatureHistoryMessage.deviceID) && Internal.equals(this.history, temperatureHistoryMessage.history) && Internal.equals(this.cookID, temperatureHistoryMessage.cookID)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12 = ((Message) this).hashCode;
        if (i12 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Long l10 = this.deviceID;
            int i13 = 0;
            if (l10 != null) {
                i10 = l10.hashCode();
            } else {
                i10 = 0;
            }
            int i14 = (hashCode + i10) * 37;
            TemperatureHistory temperatureHistory = this.history;
            if (temperatureHistory != null) {
                i11 = temperatureHistory.hashCode();
            } else {
                i11 = 0;
            }
            int i15 = (i14 + i11) * 37;
            Long l11 = this.cookID;
            if (l11 != null) {
                i13 = l11.hashCode();
            }
            int i16 = i15 + i13;
            ((Message) this).hashCode = i16;
            return i16;
        }
        return i12;
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
        if (this.cookID != null) {
            sb.append(", cookID=");
            sb.append(this.cookID);
        }
        StringBuilder replace = sb.replace(0, 2, "TemperatureHistoryMessage{");
        replace.append('}');
        return replace.toString();
    }

    public TemperatureHistoryMessage(Long l10, TemperatureHistory temperatureHistory, Long l11, h hVar) {
        super(ADAPTER, hVar);
        this.deviceID = l10;
        this.history = temperatureHistory;
        this.cookID = l11;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m374newBuilder() {
        Builder builder = new Builder();
        builder.deviceID = this.deviceID;
        builder.history = this.history;
        builder.cookID = this.cookID;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
