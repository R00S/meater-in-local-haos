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
public final class NetworkSettingsMessage extends Message<NetworkSettingsMessage, Builder> {
    public static final ProtoAdapter<NetworkSettingsMessage> ADAPTER = new ProtoAdapter_NetworkSettingsMessage();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.NetworkSettings#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final NetworkSettings networkSettings;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<NetworkSettingsMessage, Builder> {
        public NetworkSettings networkSettings;

        public Builder networkSettings(NetworkSettings networkSettings) {
            this.networkSettings = networkSettings;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public NetworkSettingsMessage m294build() {
            NetworkSettings networkSettings = this.networkSettings;
            if (networkSettings != null) {
                return new NetworkSettingsMessage(this.networkSettings, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{networkSettings, "networkSettings"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_NetworkSettingsMessage extends ProtoAdapter<NetworkSettingsMessage> {
        ProtoAdapter_NetworkSettingsMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, NetworkSettingsMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public NetworkSettingsMessage m295decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m294build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.networkSettings((NetworkSettings) NetworkSettings.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, NetworkSettingsMessage networkSettingsMessage) {
            NetworkSettings.ADAPTER.encodeWithTag(protoWriter, 1, networkSettingsMessage.networkSettings);
            protoWriter.writeBytes(networkSettingsMessage.unknownFields());
        }

        public int encodedSize(NetworkSettingsMessage networkSettingsMessage) {
            return NetworkSettings.ADAPTER.encodedSizeWithTag(1, networkSettingsMessage.networkSettings) + networkSettingsMessage.unknownFields().I();
        }

        public NetworkSettingsMessage redact(NetworkSettingsMessage networkSettingsMessage) {
            Builder m293newBuilder = networkSettingsMessage.m293newBuilder();
            NetworkSettings networkSettings = m293newBuilder.networkSettings;
            if (networkSettings != null) {
                m293newBuilder.networkSettings = (NetworkSettings) NetworkSettings.ADAPTER.redact(networkSettings);
            }
            m293newBuilder.clearUnknownFields();
            return m293newBuilder.m294build();
        }
    }

    public NetworkSettingsMessage(NetworkSettings networkSettings) {
        this(networkSettings, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkSettingsMessage)) {
            return false;
        }
        NetworkSettingsMessage networkSettingsMessage = (NetworkSettingsMessage) obj;
        if (Internal.equals(unknownFields(), networkSettingsMessage.unknownFields()) && Internal.equals(this.networkSettings, networkSettingsMessage.networkSettings)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            NetworkSettings networkSettings = this.networkSettings;
            if (networkSettings != null) {
                i10 = networkSettings.hashCode();
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
        if (this.networkSettings != null) {
            sb.append(", networkSettings=");
            sb.append(this.networkSettings);
        }
        StringBuilder replace = sb.replace(0, 2, "NetworkSettingsMessage{");
        replace.append('}');
        return replace.toString();
    }

    public NetworkSettingsMessage(NetworkSettings networkSettings, h hVar) {
        super(ADAPTER, hVar);
        this.networkSettings = networkSettings;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m293newBuilder() {
        Builder builder = new Builder();
        builder.networkSettings = this.networkSettings;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
