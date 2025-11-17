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
public final class V2NetworkSettingsMessage extends Message<V2NetworkSettingsMessage, Builder> {
    public static final ProtoAdapter<V2NetworkSettingsMessage> ADAPTER = new ProtoAdapter_V2NetworkSettingsMessage();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2NetworkSettings#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final V2NetworkSettings networkSettings;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2NetworkSettingsMessage, Builder> {
        public V2NetworkSettings networkSettings;

        public Builder networkSettings(V2NetworkSettings v2NetworkSettings) {
            this.networkSettings = v2NetworkSettings;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2NetworkSettingsMessage m102build() {
            V2NetworkSettings v2NetworkSettings = this.networkSettings;
            if (v2NetworkSettings != null) {
                return new V2NetworkSettingsMessage(this.networkSettings, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{v2NetworkSettings, "networkSettings"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2NetworkSettingsMessage extends ProtoAdapter<V2NetworkSettingsMessage> {
        ProtoAdapter_V2NetworkSettingsMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, V2NetworkSettingsMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2NetworkSettingsMessage m103decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m102build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.networkSettings((V2NetworkSettings) V2NetworkSettings.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2NetworkSettingsMessage v2NetworkSettingsMessage) {
            V2NetworkSettings.ADAPTER.encodeWithTag(protoWriter, 1, v2NetworkSettingsMessage.networkSettings);
            protoWriter.writeBytes(v2NetworkSettingsMessage.unknownFields());
        }

        public int encodedSize(V2NetworkSettingsMessage v2NetworkSettingsMessage) {
            return V2NetworkSettings.ADAPTER.encodedSizeWithTag(1, v2NetworkSettingsMessage.networkSettings) + v2NetworkSettingsMessage.unknownFields().I();
        }

        public V2NetworkSettingsMessage redact(V2NetworkSettingsMessage v2NetworkSettingsMessage) {
            Builder m101newBuilder = v2NetworkSettingsMessage.m101newBuilder();
            V2NetworkSettings v2NetworkSettings = m101newBuilder.networkSettings;
            if (v2NetworkSettings != null) {
                m101newBuilder.networkSettings = (V2NetworkSettings) V2NetworkSettings.ADAPTER.redact(v2NetworkSettings);
            }
            m101newBuilder.clearUnknownFields();
            return m101newBuilder.m102build();
        }
    }

    public V2NetworkSettingsMessage(V2NetworkSettings v2NetworkSettings) {
        this(v2NetworkSettings, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2NetworkSettingsMessage)) {
            return false;
        }
        V2NetworkSettingsMessage v2NetworkSettingsMessage = (V2NetworkSettingsMessage) obj;
        if (Internal.equals(unknownFields(), v2NetworkSettingsMessage.unknownFields()) && Internal.equals(this.networkSettings, v2NetworkSettingsMessage.networkSettings)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            V2NetworkSettings v2NetworkSettings = this.networkSettings;
            if (v2NetworkSettings != null) {
                i10 = v2NetworkSettings.hashCode();
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
        StringBuilder replace = sb.replace(0, 2, "V2NetworkSettingsMessage{");
        replace.append('}');
        return replace.toString();
    }

    public V2NetworkSettingsMessage(V2NetworkSettings v2NetworkSettings, h hVar) {
        super(ADAPTER, hVar);
        this.networkSettings = v2NetworkSettings;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m101newBuilder() {
        Builder builder = new Builder();
        builder.networkSettings = this.networkSettings;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
