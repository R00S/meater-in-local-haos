package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import ql.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public final class NetworkSettingsRequestMessage extends Message<NetworkSettingsRequestMessage, Builder> {
    public static final ProtoAdapter<NetworkSettingsRequestMessage> ADAPTER = new ProtoAdapter_NetworkSettingsRequestMessage();
    private static final long serialVersionUID = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<NetworkSettingsRequestMessage, Builder> {
        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public NetworkSettingsRequestMessage m297build() {
            return new NetworkSettingsRequestMessage(buildUnknownFields());
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_NetworkSettingsRequestMessage extends ProtoAdapter<NetworkSettingsRequestMessage> {
        ProtoAdapter_NetworkSettingsRequestMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, NetworkSettingsRequestMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public NetworkSettingsRequestMessage m298decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m297build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, NetworkSettingsRequestMessage networkSettingsRequestMessage) {
            protoWriter.writeBytes(networkSettingsRequestMessage.unknownFields());
        }

        public int encodedSize(NetworkSettingsRequestMessage networkSettingsRequestMessage) {
            return networkSettingsRequestMessage.unknownFields().I();
        }

        public NetworkSettingsRequestMessage redact(NetworkSettingsRequestMessage networkSettingsRequestMessage) {
            Builder m296newBuilder = networkSettingsRequestMessage.m296newBuilder();
            m296newBuilder.clearUnknownFields();
            return m296newBuilder.m297build();
        }
    }

    public NetworkSettingsRequestMessage() {
        this(h.u);
    }

    public boolean equals(Object obj) {
        return obj instanceof NetworkSettingsRequestMessage;
    }

    public int hashCode() {
        return unknownFields().hashCode();
    }

    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "NetworkSettingsRequestMessage{");
        replace.append('}');
        return replace.toString();
    }

    public NetworkSettingsRequestMessage(h hVar) {
        super(ADAPTER, hVar);
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m296newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
