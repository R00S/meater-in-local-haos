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
public final class ProbeSimulatorHeader extends Message<ProbeSimulatorHeader, Builder> {
    public static final ProtoAdapter<ProbeSimulatorHeader> ADAPTER = new ProtoAdapter_ProbeSimulatorHeader();
    public static final Long DEFAULT_PROBESERIALNUM = 0L;
    public static final Integer DEFAULT_RSSI = 0;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long probeSerialNum;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer rssi;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<ProbeSimulatorHeader, Builder> {
        public Long probeSerialNum;
        public Integer rssi;

        public Builder probeSerialNum(Long l10) {
            this.probeSerialNum = l10;
            return this;
        }

        public Builder rssi(Integer num) {
            this.rssi = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public ProbeSimulatorHeader m345build() {
            Long l10 = this.probeSerialNum;
            if (l10 != null && this.rssi != null) {
                return new ProbeSimulatorHeader(this.probeSerialNum, this.rssi, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "probeSerialNum", this.rssi, "rssi"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_ProbeSimulatorHeader extends ProtoAdapter<ProbeSimulatorHeader> {
        ProtoAdapter_ProbeSimulatorHeader() {
            super(FieldEncoding.LENGTH_DELIMITED, ProbeSimulatorHeader.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public ProbeSimulatorHeader m346decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m345build();
                }
                if (nextTag == 1) {
                    builder.probeSerialNum((Long) ProtoAdapter.FIXED64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.rssi((Integer) ProtoAdapter.UINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, ProbeSimulatorHeader probeSimulatorHeader) {
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, probeSimulatorHeader.probeSerialNum);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, probeSimulatorHeader.rssi);
            protoWriter.writeBytes(probeSimulatorHeader.unknownFields());
        }

        public int encodedSize(ProbeSimulatorHeader probeSimulatorHeader) {
            return ProtoAdapter.FIXED64.encodedSizeWithTag(1, probeSimulatorHeader.probeSerialNum) + ProtoAdapter.UINT32.encodedSizeWithTag(2, probeSimulatorHeader.rssi) + probeSimulatorHeader.unknownFields().I();
        }

        public ProbeSimulatorHeader redact(ProbeSimulatorHeader probeSimulatorHeader) {
            Builder m344newBuilder = probeSimulatorHeader.m344newBuilder();
            m344newBuilder.clearUnknownFields();
            return m344newBuilder.m345build();
        }
    }

    public ProbeSimulatorHeader(Long l10, Integer num) {
        this(l10, num, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProbeSimulatorHeader)) {
            return false;
        }
        ProbeSimulatorHeader probeSimulatorHeader = (ProbeSimulatorHeader) obj;
        if (Internal.equals(unknownFields(), probeSimulatorHeader.unknownFields()) && Internal.equals(this.probeSerialNum, probeSimulatorHeader.probeSerialNum) && Internal.equals(this.rssi, probeSimulatorHeader.rssi)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Long l10 = this.probeSerialNum;
            int i12 = 0;
            if (l10 != null) {
                i10 = l10.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (hashCode + i10) * 37;
            Integer num = this.rssi;
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
        if (this.probeSerialNum != null) {
            sb.append(", probeSerialNum=");
            sb.append(this.probeSerialNum);
        }
        if (this.rssi != null) {
            sb.append(", rssi=");
            sb.append(this.rssi);
        }
        StringBuilder replace = sb.replace(0, 2, "ProbeSimulatorHeader{");
        replace.append('}');
        return replace.toString();
    }

    public ProbeSimulatorHeader(Long l10, Integer num, h hVar) {
        super(ADAPTER, hVar);
        this.probeSerialNum = l10;
        this.rssi = num;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m344newBuilder() {
        Builder builder = new Builder();
        builder.probeSerialNum = this.probeSerialNum;
        builder.rssi = this.rssi;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
