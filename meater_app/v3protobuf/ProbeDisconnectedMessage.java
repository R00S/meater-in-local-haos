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
public final class ProbeDisconnectedMessage extends Message<ProbeDisconnectedMessage, Builder> {
    public static final ProtoAdapter<ProbeDisconnectedMessage> ADAPTER = new ProtoAdapter_ProbeDisconnectedMessage();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeSimulatorHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final ProbeSimulatorHeader header;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<ProbeDisconnectedMessage, Builder> {
        public ProbeSimulatorHeader header;

        public Builder header(ProbeSimulatorHeader probeSimulatorHeader) {
            this.header = probeSimulatorHeader;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public ProbeDisconnectedMessage m333build() {
            ProbeSimulatorHeader probeSimulatorHeader = this.header;
            if (probeSimulatorHeader != null) {
                return new ProbeDisconnectedMessage(this.header, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{probeSimulatorHeader, "header"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_ProbeDisconnectedMessage extends ProtoAdapter<ProbeDisconnectedMessage> {
        ProtoAdapter_ProbeDisconnectedMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, ProbeDisconnectedMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public ProbeDisconnectedMessage m334decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m333build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.header((ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, ProbeDisconnectedMessage probeDisconnectedMessage) {
            ProbeSimulatorHeader.ADAPTER.encodeWithTag(protoWriter, 1, probeDisconnectedMessage.header);
            protoWriter.writeBytes(probeDisconnectedMessage.unknownFields());
        }

        public int encodedSize(ProbeDisconnectedMessage probeDisconnectedMessage) {
            return ProbeSimulatorHeader.ADAPTER.encodedSizeWithTag(1, probeDisconnectedMessage.header) + probeDisconnectedMessage.unknownFields().I();
        }

        public ProbeDisconnectedMessage redact(ProbeDisconnectedMessage probeDisconnectedMessage) {
            Builder m332newBuilder = probeDisconnectedMessage.m332newBuilder();
            ProbeSimulatorHeader probeSimulatorHeader = m332newBuilder.header;
            if (probeSimulatorHeader != null) {
                m332newBuilder.header = (ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.redact(probeSimulatorHeader);
            }
            m332newBuilder.clearUnknownFields();
            return m332newBuilder.m333build();
        }
    }

    public ProbeDisconnectedMessage(ProbeSimulatorHeader probeSimulatorHeader) {
        this(probeSimulatorHeader, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProbeDisconnectedMessage)) {
            return false;
        }
        ProbeDisconnectedMessage probeDisconnectedMessage = (ProbeDisconnectedMessage) obj;
        if (Internal.equals(unknownFields(), probeDisconnectedMessage.unknownFields()) && Internal.equals(this.header, probeDisconnectedMessage.header)) {
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
        StringBuilder replace = sb.replace(0, 2, "ProbeDisconnectedMessage{");
        replace.append('}');
        return replace.toString();
    }

    public ProbeDisconnectedMessage(ProbeSimulatorHeader probeSimulatorHeader, h hVar) {
        super(ADAPTER, hVar);
        this.header = probeSimulatorHeader;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m332newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
