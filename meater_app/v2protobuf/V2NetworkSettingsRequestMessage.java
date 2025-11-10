package com.apptionlabs.meater_app.v2protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import ql.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public final class V2NetworkSettingsRequestMessage extends Message<V2NetworkSettingsRequestMessage, Builder> {
    public static final ProtoAdapter<V2NetworkSettingsRequestMessage> ADAPTER = new ProtoAdapter_V2NetworkSettingsRequestMessage();
    private static final long serialVersionUID = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2NetworkSettingsRequestMessage, Builder> {
        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2NetworkSettingsRequestMessage m105build() {
            return new V2NetworkSettingsRequestMessage(buildUnknownFields());
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2NetworkSettingsRequestMessage extends ProtoAdapter<V2NetworkSettingsRequestMessage> {
        ProtoAdapter_V2NetworkSettingsRequestMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, V2NetworkSettingsRequestMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2NetworkSettingsRequestMessage m106decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m105build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2NetworkSettingsRequestMessage v2NetworkSettingsRequestMessage) {
            protoWriter.writeBytes(v2NetworkSettingsRequestMessage.unknownFields());
        }

        public int encodedSize(V2NetworkSettingsRequestMessage v2NetworkSettingsRequestMessage) {
            return v2NetworkSettingsRequestMessage.unknownFields().I();
        }

        public V2NetworkSettingsRequestMessage redact(V2NetworkSettingsRequestMessage v2NetworkSettingsRequestMessage) {
            Builder m104newBuilder = v2NetworkSettingsRequestMessage.m104newBuilder();
            m104newBuilder.clearUnknownFields();
            return m104newBuilder.m105build();
        }
    }

    public V2NetworkSettingsRequestMessage() {
        this(h.u);
    }

    public boolean equals(Object obj) {
        return obj instanceof V2NetworkSettingsRequestMessage;
    }

    public int hashCode() {
        return unknownFields().hashCode();
    }

    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "V2NetworkSettingsRequestMessage{");
        replace.append('}');
        return replace.toString();
    }

    public V2NetworkSettingsRequestMessage(h hVar) {
        super(ADAPTER, hVar);
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m104newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
