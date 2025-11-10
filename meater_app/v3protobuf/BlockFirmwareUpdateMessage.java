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
public final class BlockFirmwareUpdateMessage extends Message<BlockFirmwareUpdateMessage, Builder> {
    public static final ProtoAdapter<BlockFirmwareUpdateMessage> ADAPTER = new ProtoAdapter_BlockFirmwareUpdateMessage();
    public static final String DEFAULT_DOWNLOADURL = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String downloadURL;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<BlockFirmwareUpdateMessage, Builder> {
        public String downloadURL;

        public Builder downloadURL(String str) {
            this.downloadURL = str;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public BlockFirmwareUpdateMessage m159build() {
            String str = this.downloadURL;
            if (str != null) {
                return new BlockFirmwareUpdateMessage(this.downloadURL, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{str, "downloadURL"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_BlockFirmwareUpdateMessage extends ProtoAdapter<BlockFirmwareUpdateMessage> {
        ProtoAdapter_BlockFirmwareUpdateMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, BlockFirmwareUpdateMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public BlockFirmwareUpdateMessage m160decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m159build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.downloadURL((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, BlockFirmwareUpdateMessage blockFirmwareUpdateMessage) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, blockFirmwareUpdateMessage.downloadURL);
            protoWriter.writeBytes(blockFirmwareUpdateMessage.unknownFields());
        }

        public int encodedSize(BlockFirmwareUpdateMessage blockFirmwareUpdateMessage) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, blockFirmwareUpdateMessage.downloadURL) + blockFirmwareUpdateMessage.unknownFields().I();
        }

        public BlockFirmwareUpdateMessage redact(BlockFirmwareUpdateMessage blockFirmwareUpdateMessage) {
            Builder m158newBuilder = blockFirmwareUpdateMessage.m158newBuilder();
            m158newBuilder.clearUnknownFields();
            return m158newBuilder.m159build();
        }
    }

    public BlockFirmwareUpdateMessage(String str) {
        this(str, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlockFirmwareUpdateMessage)) {
            return false;
        }
        BlockFirmwareUpdateMessage blockFirmwareUpdateMessage = (BlockFirmwareUpdateMessage) obj;
        if (Internal.equals(unknownFields(), blockFirmwareUpdateMessage.unknownFields()) && Internal.equals(this.downloadURL, blockFirmwareUpdateMessage.downloadURL)) {
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
        StringBuilder replace = sb.replace(0, 2, "BlockFirmwareUpdateMessage{");
        replace.append('}');
        return replace.toString();
    }

    public BlockFirmwareUpdateMessage(String str, h hVar) {
        super(ADAPTER, hVar);
        this.downloadURL = str;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m158newBuilder() {
        Builder builder = new Builder();
        builder.downloadURL = this.downloadURL;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
