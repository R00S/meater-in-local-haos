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
public final class V1BlockFirmwareUpdateMessage extends Message<V1BlockFirmwareUpdateMessage, Builder> {
    public static final ProtoAdapter<V1BlockFirmwareUpdateMessage> ADAPTER = new ProtoAdapter_V1BlockFirmwareUpdateMessage();
    public static final String DEFAULT_DOWNLOADURL = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String downloadURL;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1MeaterLinkHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final V1MeaterLinkHeader header;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V1BlockFirmwareUpdateMessage, Builder> {
        public String downloadURL;
        public V1MeaterLinkHeader header;

        public Builder downloadURL(String str) {
            this.downloadURL = str;
            return this;
        }

        public Builder header(V1MeaterLinkHeader v1MeaterLinkHeader) {
            this.header = v1MeaterLinkHeader;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V1BlockFirmwareUpdateMessage m9build() {
            V1MeaterLinkHeader v1MeaterLinkHeader = this.header;
            if (v1MeaterLinkHeader != null && this.downloadURL != null) {
                return new V1BlockFirmwareUpdateMessage(this.header, this.downloadURL, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{v1MeaterLinkHeader, "header", this.downloadURL, "downloadURL"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V1BlockFirmwareUpdateMessage extends ProtoAdapter<V1BlockFirmwareUpdateMessage> {
        ProtoAdapter_V1BlockFirmwareUpdateMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, V1BlockFirmwareUpdateMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V1BlockFirmwareUpdateMessage m10decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m9build();
                }
                if (nextTag == 1) {
                    builder.header((V1MeaterLinkHeader) V1MeaterLinkHeader.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.downloadURL((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V1BlockFirmwareUpdateMessage v1BlockFirmwareUpdateMessage) {
            V1MeaterLinkHeader.ADAPTER.encodeWithTag(protoWriter, 1, v1BlockFirmwareUpdateMessage.header);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, v1BlockFirmwareUpdateMessage.downloadURL);
            protoWriter.writeBytes(v1BlockFirmwareUpdateMessage.unknownFields());
        }

        public int encodedSize(V1BlockFirmwareUpdateMessage v1BlockFirmwareUpdateMessage) {
            return V1MeaterLinkHeader.ADAPTER.encodedSizeWithTag(1, v1BlockFirmwareUpdateMessage.header) + ProtoAdapter.STRING.encodedSizeWithTag(2, v1BlockFirmwareUpdateMessage.downloadURL) + v1BlockFirmwareUpdateMessage.unknownFields().I();
        }

        public V1BlockFirmwareUpdateMessage redact(V1BlockFirmwareUpdateMessage v1BlockFirmwareUpdateMessage) {
            Builder m8newBuilder = v1BlockFirmwareUpdateMessage.m8newBuilder();
            V1MeaterLinkHeader v1MeaterLinkHeader = m8newBuilder.header;
            if (v1MeaterLinkHeader != null) {
                m8newBuilder.header = (V1MeaterLinkHeader) V1MeaterLinkHeader.ADAPTER.redact(v1MeaterLinkHeader);
            }
            m8newBuilder.clearUnknownFields();
            return m8newBuilder.m9build();
        }
    }

    public V1BlockFirmwareUpdateMessage(V1MeaterLinkHeader v1MeaterLinkHeader, String str) {
        this(v1MeaterLinkHeader, str, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1BlockFirmwareUpdateMessage)) {
            return false;
        }
        V1BlockFirmwareUpdateMessage v1BlockFirmwareUpdateMessage = (V1BlockFirmwareUpdateMessage) obj;
        if (Internal.equals(unknownFields(), v1BlockFirmwareUpdateMessage.unknownFields()) && Internal.equals(this.header, v1BlockFirmwareUpdateMessage.header) && Internal.equals(this.downloadURL, v1BlockFirmwareUpdateMessage.downloadURL)) {
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
            String str = this.downloadURL;
            if (str != null) {
                i12 = str.hashCode();
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
        if (this.downloadURL != null) {
            sb.append(", downloadURL=");
            sb.append(this.downloadURL);
        }
        StringBuilder replace = sb.replace(0, 2, "V1BlockFirmwareUpdateMessage{");
        replace.append('}');
        return replace.toString();
    }

    public V1BlockFirmwareUpdateMessage(V1MeaterLinkHeader v1MeaterLinkHeader, String str, h hVar) {
        super(ADAPTER, hVar);
        this.header = v1MeaterLinkHeader;
        this.downloadURL = str;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m8newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.downloadURL = this.downloadURL;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
