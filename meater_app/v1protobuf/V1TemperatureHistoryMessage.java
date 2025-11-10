package com.apptionlabs.meater_app.v1protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import ql.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public final class V1TemperatureHistoryMessage extends Message<V1TemperatureHistoryMessage, Builder> {
    public static final ProtoAdapter<V1TemperatureHistoryMessage> ADAPTER = new ProtoAdapter_LegacyTemperatureHistoryMessage();
    public static final Long DEFAULT_PROBESERIALNUM = 0L;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1MeaterLinkHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final V1MeaterLinkHeader header;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1TemperatureHistory#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final V1TemperatureHistory history;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long probeSerialNum;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V1TemperatureHistoryMessage, Builder> {
        public V1MeaterLinkHeader header;
        public V1TemperatureHistory history;
        public Long probeSerialNum;

        public Builder header(V1MeaterLinkHeader v1MeaterLinkHeader) {
            this.header = v1MeaterLinkHeader;
            return this;
        }

        public Builder history(V1TemperatureHistory v1TemperatureHistory) {
            this.history = v1TemperatureHistory;
            return this;
        }

        public Builder probeSerialNum(Long l10) {
            this.probeSerialNum = l10;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V1TemperatureHistoryMessage m42build() {
            V1MeaterLinkHeader v1MeaterLinkHeader = this.header;
            if (v1MeaterLinkHeader != null && this.probeSerialNum != null && this.history != null) {
                return new V1TemperatureHistoryMessage(this.header, this.probeSerialNum, this.history, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{v1MeaterLinkHeader, "header", this.probeSerialNum, "probeSerialNum", this.history, "history"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_LegacyTemperatureHistoryMessage extends ProtoAdapter<V1TemperatureHistoryMessage> {
        ProtoAdapter_LegacyTemperatureHistoryMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, V1TemperatureHistoryMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V1TemperatureHistoryMessage m43decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m42build();
                }
                if (nextTag == 1) {
                    builder.header((V1MeaterLinkHeader) V1MeaterLinkHeader.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.probeSerialNum((Long) ProtoAdapter.UINT64.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.history((V1TemperatureHistory) V1TemperatureHistory.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V1TemperatureHistoryMessage v1TemperatureHistoryMessage) {
            V1MeaterLinkHeader.ADAPTER.encodeWithTag(protoWriter, 1, v1TemperatureHistoryMessage.header);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 2, v1TemperatureHistoryMessage.probeSerialNum);
            V1TemperatureHistory.ADAPTER.encodeWithTag(protoWriter, 3, v1TemperatureHistoryMessage.history);
            protoWriter.writeBytes(v1TemperatureHistoryMessage.unknownFields());
        }

        public int encodedSize(V1TemperatureHistoryMessage v1TemperatureHistoryMessage) {
            return V1MeaterLinkHeader.ADAPTER.encodedSizeWithTag(1, v1TemperatureHistoryMessage.header) + ProtoAdapter.UINT64.encodedSizeWithTag(2, v1TemperatureHistoryMessage.probeSerialNum) + V1TemperatureHistory.ADAPTER.encodedSizeWithTag(3, v1TemperatureHistoryMessage.history) + v1TemperatureHistoryMessage.unknownFields().I();
        }

        public V1TemperatureHistoryMessage redact(V1TemperatureHistoryMessage v1TemperatureHistoryMessage) {
            Builder m41newBuilder = v1TemperatureHistoryMessage.m41newBuilder();
            V1MeaterLinkHeader v1MeaterLinkHeader = m41newBuilder.header;
            if (v1MeaterLinkHeader != null) {
                m41newBuilder.header = (V1MeaterLinkHeader) V1MeaterLinkHeader.ADAPTER.redact(v1MeaterLinkHeader);
            }
            V1TemperatureHistory v1TemperatureHistory = m41newBuilder.history;
            if (v1TemperatureHistory != null) {
                m41newBuilder.history = (V1TemperatureHistory) V1TemperatureHistory.ADAPTER.redact(v1TemperatureHistory);
            }
            m41newBuilder.clearUnknownFields();
            return m41newBuilder.m42build();
        }
    }

    public V1TemperatureHistoryMessage(V1MeaterLinkHeader v1MeaterLinkHeader, Long l10, V1TemperatureHistory v1TemperatureHistory) {
        this(v1MeaterLinkHeader, l10, v1TemperatureHistory, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1TemperatureHistoryMessage)) {
            return false;
        }
        V1TemperatureHistoryMessage v1TemperatureHistoryMessage = (V1TemperatureHistoryMessage) obj;
        if (Internal.equals(unknownFields(), v1TemperatureHistoryMessage.unknownFields()) && Internal.equals(this.header, v1TemperatureHistoryMessage.header) && Internal.equals(this.probeSerialNum, v1TemperatureHistoryMessage.probeSerialNum) && Internal.equals(this.history, v1TemperatureHistoryMessage.history)) {
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
            V1MeaterLinkHeader v1MeaterLinkHeader = this.header;
            int i13 = 0;
            if (v1MeaterLinkHeader != null) {
                i10 = v1MeaterLinkHeader.hashCode();
            } else {
                i10 = 0;
            }
            int i14 = (hashCode + i10) * 37;
            Long l10 = this.probeSerialNum;
            if (l10 != null) {
                i11 = l10.hashCode();
            } else {
                i11 = 0;
            }
            int i15 = (i14 + i11) * 37;
            V1TemperatureHistory v1TemperatureHistory = this.history;
            if (v1TemperatureHistory != null) {
                i13 = v1TemperatureHistory.hashCode();
            }
            int i16 = i15 + i13;
            ((Message) this).hashCode = i16;
            return i16;
        }
        return i12;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.header != null) {
            sb.append(", header=");
            sb.append(this.header);
        }
        if (this.probeSerialNum != null) {
            sb.append(", probeSerialNum=");
            sb.append(this.probeSerialNum);
        }
        if (this.history != null) {
            sb.append(", history=");
            sb.append(this.history);
        }
        StringBuilder replace = sb.replace(0, 2, "V1TemperatureHistoryMessage{");
        replace.append('}');
        return replace.toString();
    }

    public V1TemperatureHistoryMessage(V1MeaterLinkHeader v1MeaterLinkHeader, Long l10, V1TemperatureHistory v1TemperatureHistory, h hVar) {
        super(ADAPTER, hVar);
        this.header = v1MeaterLinkHeader;
        this.probeSerialNum = l10;
        this.history = v1TemperatureHistory;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m41newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.probeSerialNum = this.probeSerialNum;
        builder.history = this.history;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
