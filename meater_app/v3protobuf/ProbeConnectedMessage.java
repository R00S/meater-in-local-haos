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
public final class ProbeConnectedMessage extends Message<ProbeConnectedMessage, Builder> {
    public static final ProtoAdapter<ProbeConnectedMessage> ADAPTER = new ProtoAdapter_ProbeConnectedMessage();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeSimulatorHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final ProbeSimulatorHeader header;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<ProbeConnectedMessage, Builder> {
        public ProbeSimulatorHeader header;

        public Builder header(ProbeSimulatorHeader probeSimulatorHeader) {
            this.header = probeSimulatorHeader;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public ProbeConnectedMessage m327build() {
            ProbeSimulatorHeader probeSimulatorHeader = this.header;
            if (probeSimulatorHeader != null) {
                return new ProbeConnectedMessage(this.header, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{probeSimulatorHeader, "header"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_ProbeConnectedMessage extends ProtoAdapter<ProbeConnectedMessage> {
        ProtoAdapter_ProbeConnectedMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, ProbeConnectedMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public ProbeConnectedMessage m328decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m327build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.header((ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, ProbeConnectedMessage probeConnectedMessage) {
            ProbeSimulatorHeader.ADAPTER.encodeWithTag(protoWriter, 1, probeConnectedMessage.header);
            protoWriter.writeBytes(probeConnectedMessage.unknownFields());
        }

        public int encodedSize(ProbeConnectedMessage probeConnectedMessage) {
            return ProbeSimulatorHeader.ADAPTER.encodedSizeWithTag(1, probeConnectedMessage.header) + probeConnectedMessage.unknownFields().I();
        }

        public ProbeConnectedMessage redact(ProbeConnectedMessage probeConnectedMessage) {
            Builder m326newBuilder = probeConnectedMessage.m326newBuilder();
            ProbeSimulatorHeader probeSimulatorHeader = m326newBuilder.header;
            if (probeSimulatorHeader != null) {
                m326newBuilder.header = (ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.redact(probeSimulatorHeader);
            }
            m326newBuilder.clearUnknownFields();
            return m326newBuilder.m327build();
        }
    }

    public ProbeConnectedMessage(ProbeSimulatorHeader probeSimulatorHeader) {
        this(probeSimulatorHeader, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProbeConnectedMessage)) {
            return false;
        }
        ProbeConnectedMessage probeConnectedMessage = (ProbeConnectedMessage) obj;
        if (Internal.equals(unknownFields(), probeConnectedMessage.unknownFields()) && Internal.equals(this.header, probeConnectedMessage.header)) {
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
        StringBuilder replace = sb.replace(0, 2, "ProbeConnectedMessage{");
        replace.append('}');
        return replace.toString();
    }

    public ProbeConnectedMessage(ProbeSimulatorHeader probeSimulatorHeader, h hVar) {
        super(ADAPTER, hVar);
        this.header = probeSimulatorHeader;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m326newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
