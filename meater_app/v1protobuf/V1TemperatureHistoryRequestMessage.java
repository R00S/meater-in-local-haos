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
public final class V1TemperatureHistoryRequestMessage extends Message<V1TemperatureHistoryRequestMessage, Builder> {
    public static final ProtoAdapter<V1TemperatureHistoryRequestMessage> ADAPTER = new ProtoAdapter_LegacyTemperatureHistoryRequestMessage();
    public static final Long DEFAULT_PROBESERIALNUM = 0L;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1MeaterLinkHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final V1MeaterLinkHeader header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long probeSerialNum;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V1TemperatureHistoryRequestMessage, Builder> {
        public V1MeaterLinkHeader header;
        public Long probeSerialNum;

        public Builder header(V1MeaterLinkHeader v1MeaterLinkHeader) {
            this.header = v1MeaterLinkHeader;
            return this;
        }

        public Builder probeSerialNum(Long l10) {
            this.probeSerialNum = l10;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V1TemperatureHistoryRequestMessage m45build() {
            V1MeaterLinkHeader v1MeaterLinkHeader = this.header;
            if (v1MeaterLinkHeader != null && this.probeSerialNum != null) {
                return new V1TemperatureHistoryRequestMessage(this.header, this.probeSerialNum, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{v1MeaterLinkHeader, "header", this.probeSerialNum, "probeSerialNum"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_LegacyTemperatureHistoryRequestMessage extends ProtoAdapter<V1TemperatureHistoryRequestMessage> {
        ProtoAdapter_LegacyTemperatureHistoryRequestMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, V1TemperatureHistoryRequestMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V1TemperatureHistoryRequestMessage m46decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m45build();
                }
                if (nextTag == 1) {
                    builder.header((V1MeaterLinkHeader) V1MeaterLinkHeader.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.probeSerialNum((Long) ProtoAdapter.UINT64.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V1TemperatureHistoryRequestMessage v1TemperatureHistoryRequestMessage) {
            V1MeaterLinkHeader.ADAPTER.encodeWithTag(protoWriter, 1, v1TemperatureHistoryRequestMessage.header);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 2, v1TemperatureHistoryRequestMessage.probeSerialNum);
            protoWriter.writeBytes(v1TemperatureHistoryRequestMessage.unknownFields());
        }

        public int encodedSize(V1TemperatureHistoryRequestMessage v1TemperatureHistoryRequestMessage) {
            return V1MeaterLinkHeader.ADAPTER.encodedSizeWithTag(1, v1TemperatureHistoryRequestMessage.header) + ProtoAdapter.UINT64.encodedSizeWithTag(2, v1TemperatureHistoryRequestMessage.probeSerialNum) + v1TemperatureHistoryRequestMessage.unknownFields().I();
        }

        public V1TemperatureHistoryRequestMessage redact(V1TemperatureHistoryRequestMessage v1TemperatureHistoryRequestMessage) {
            Builder m44newBuilder = v1TemperatureHistoryRequestMessage.m44newBuilder();
            V1MeaterLinkHeader v1MeaterLinkHeader = m44newBuilder.header;
            if (v1MeaterLinkHeader != null) {
                m44newBuilder.header = (V1MeaterLinkHeader) V1MeaterLinkHeader.ADAPTER.redact(v1MeaterLinkHeader);
            }
            m44newBuilder.clearUnknownFields();
            return m44newBuilder.m45build();
        }
    }

    public V1TemperatureHistoryRequestMessage(V1MeaterLinkHeader v1MeaterLinkHeader, Long l10) {
        this(v1MeaterLinkHeader, l10, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1TemperatureHistoryRequestMessage)) {
            return false;
        }
        V1TemperatureHistoryRequestMessage v1TemperatureHistoryRequestMessage = (V1TemperatureHistoryRequestMessage) obj;
        if (Internal.equals(unknownFields(), v1TemperatureHistoryRequestMessage.unknownFields()) && Internal.equals(this.header, v1TemperatureHistoryRequestMessage.header) && Internal.equals(this.probeSerialNum, v1TemperatureHistoryRequestMessage.probeSerialNum)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            V1MeaterLinkHeader v1MeaterLinkHeader = this.header;
            int i12 = 0;
            if (v1MeaterLinkHeader != null) {
                i10 = v1MeaterLinkHeader.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (hashCode + i10) * 37;
            Long l10 = this.probeSerialNum;
            if (l10 != null) {
                i12 = l10.hashCode();
            }
            int i14 = i13 + i12;
            ((Message) this).hashCode = i14;
            return i14;
        }
        return i11;
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
        StringBuilder replace = sb.replace(0, 2, "V1TemperatureHistoryRequestMessage{");
        replace.append('}');
        return replace.toString();
    }

    public V1TemperatureHistoryRequestMessage(V1MeaterLinkHeader v1MeaterLinkHeader, Long l10, h hVar) {
        super(ADAPTER, hVar);
        this.header = v1MeaterLinkHeader;
        this.probeSerialNum = l10;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m44newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.probeSerialNum = this.probeSerialNum;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
