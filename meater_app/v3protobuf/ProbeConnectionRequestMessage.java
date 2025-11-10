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
public final class ProbeConnectionRequestMessage extends Message<ProbeConnectionRequestMessage, Builder> {
    public static final ProtoAdapter<ProbeConnectionRequestMessage> ADAPTER = new ProtoAdapter_ProbeConnectionRequestMessage();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeSimulatorHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final ProbeSimulatorHeader header;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<ProbeConnectionRequestMessage, Builder> {
        public ProbeSimulatorHeader header;

        public Builder header(ProbeSimulatorHeader probeSimulatorHeader) {
            this.header = probeSimulatorHeader;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public ProbeConnectionRequestMessage m330build() {
            ProbeSimulatorHeader probeSimulatorHeader = this.header;
            if (probeSimulatorHeader != null) {
                return new ProbeConnectionRequestMessage(this.header, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{probeSimulatorHeader, "header"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_ProbeConnectionRequestMessage extends ProtoAdapter<ProbeConnectionRequestMessage> {
        ProtoAdapter_ProbeConnectionRequestMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, ProbeConnectionRequestMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public ProbeConnectionRequestMessage m331decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m330build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.header((ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, ProbeConnectionRequestMessage probeConnectionRequestMessage) {
            ProbeSimulatorHeader.ADAPTER.encodeWithTag(protoWriter, 1, probeConnectionRequestMessage.header);
            protoWriter.writeBytes(probeConnectionRequestMessage.unknownFields());
        }

        public int encodedSize(ProbeConnectionRequestMessage probeConnectionRequestMessage) {
            return ProbeSimulatorHeader.ADAPTER.encodedSizeWithTag(1, probeConnectionRequestMessage.header) + probeConnectionRequestMessage.unknownFields().I();
        }

        public ProbeConnectionRequestMessage redact(ProbeConnectionRequestMessage probeConnectionRequestMessage) {
            Builder m329newBuilder = probeConnectionRequestMessage.m329newBuilder();
            ProbeSimulatorHeader probeSimulatorHeader = m329newBuilder.header;
            if (probeSimulatorHeader != null) {
                m329newBuilder.header = (ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.redact(probeSimulatorHeader);
            }
            m329newBuilder.clearUnknownFields();
            return m329newBuilder.m330build();
        }
    }

    public ProbeConnectionRequestMessage(ProbeSimulatorHeader probeSimulatorHeader) {
        this(probeSimulatorHeader, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProbeConnectionRequestMessage)) {
            return false;
        }
        ProbeConnectionRequestMessage probeConnectionRequestMessage = (ProbeConnectionRequestMessage) obj;
        if (Internal.equals(unknownFields(), probeConnectionRequestMessage.unknownFields()) && Internal.equals(this.header, probeConnectionRequestMessage.header)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            ProbeSimulatorHeader probeSimulatorHeader = this.header;
            if (probeSimulatorHeader != null) {
                i10 = probeSimulatorHeader.hashCode();
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
        if (this.header != null) {
            sb.append(", header=");
            sb.append(this.header);
        }
        StringBuilder replace = sb.replace(0, 2, "ProbeConnectionRequestMessage{");
        replace.append('}');
        return replace.toString();
    }

    public ProbeConnectionRequestMessage(ProbeSimulatorHeader probeSimulatorHeader, h hVar) {
        super(ADAPTER, hVar);
        this.header = probeSimulatorHeader;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m329newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
