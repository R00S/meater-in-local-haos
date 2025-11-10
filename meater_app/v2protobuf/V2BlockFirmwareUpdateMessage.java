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
public final class V2BlockFirmwareUpdateMessage extends Message<V2BlockFirmwareUpdateMessage, Builder> {
    public static final ProtoAdapter<V2BlockFirmwareUpdateMessage> ADAPTER = new ProtoAdapter_V2BlockFirmwareUpdateMessage();
    public static final String DEFAULT_DOWNLOADURL = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String downloadURL;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2BlockFirmwareUpdateMessage, Builder> {
        public String downloadURL;

        public Builder downloadURL(String str) {
            this.downloadURL = str;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2BlockFirmwareUpdateMessage m57build() {
            String str = this.downloadURL;
            if (str != null) {
                return new V2BlockFirmwareUpdateMessage(this.downloadURL, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{str, "downloadURL"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2BlockFirmwareUpdateMessage extends ProtoAdapter<V2BlockFirmwareUpdateMessage> {
        ProtoAdapter_V2BlockFirmwareUpdateMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, V2BlockFirmwareUpdateMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2BlockFirmwareUpdateMessage m58decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m57build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.downloadURL((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2BlockFirmwareUpdateMessage v2BlockFirmwareUpdateMessage) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, v2BlockFirmwareUpdateMessage.downloadURL);
            protoWriter.writeBytes(v2BlockFirmwareUpdateMessage.unknownFields());
        }

        public int encodedSize(V2BlockFirmwareUpdateMessage v2BlockFirmwareUpdateMessage) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, v2BlockFirmwareUpdateMessage.downloadURL) + v2BlockFirmwareUpdateMessage.unknownFields().I();
        }

        public V2BlockFirmwareUpdateMessage redact(V2BlockFirmwareUpdateMessage v2BlockFirmwareUpdateMessage) {
            Builder m56newBuilder = v2BlockFirmwareUpdateMessage.m56newBuilder();
            m56newBuilder.clearUnknownFields();
            return m56newBuilder.m57build();
        }
    }

    public V2BlockFirmwareUpdateMessage(String str) {
        this(str, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2BlockFirmwareUpdateMessage)) {
            return false;
        }
        V2BlockFirmwareUpdateMessage v2BlockFirmwareUpdateMessage = (V2BlockFirmwareUpdateMessage) obj;
        if (Internal.equals(unknownFields(), v2BlockFirmwareUpdateMessage.unknownFields()) && Internal.equals(this.downloadURL, v2BlockFirmwareUpdateMessage.downloadURL)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.downloadURL;
            if (str != null) {
                i10 = str.hashCode();
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
        if (this.downloadURL != null) {
            sb.append(", downloadURL=");
            sb.append(this.downloadURL);
        }
        StringBuilder replace = sb.replace(0, 2, "V2BlockFirmwareUpdateMessage{");
        replace.append('}');
        return replace.toString();
    }

    public V2BlockFirmwareUpdateMessage(String str, h hVar) {
        super(ADAPTER, hVar);
        this.downloadURL = str;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m56newBuilder() {
        Builder builder = new Builder();
        builder.downloadURL = this.downloadURL;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
