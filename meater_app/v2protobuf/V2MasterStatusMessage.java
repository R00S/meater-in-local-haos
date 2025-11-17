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
public final class V2MasterStatusMessage extends Message<V2MasterStatusMessage, Builder> {
    public static final ProtoAdapter<V2MasterStatusMessage> ADAPTER = new ProtoAdapter_V2MasterStatusMessage();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2MasterStatus#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final V2MasterStatus masterStatus;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2MasterStatusMessage, Builder> {
        public V2MasterStatus masterStatus;

        public Builder masterStatus(V2MasterStatus v2MasterStatus) {
            this.masterStatus = v2MasterStatus;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2MasterStatusMessage m87build() {
            V2MasterStatus v2MasterStatus = this.masterStatus;
            if (v2MasterStatus != null) {
                return new V2MasterStatusMessage(this.masterStatus, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{v2MasterStatus, "masterStatus"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2MasterStatusMessage extends ProtoAdapter<V2MasterStatusMessage> {
        ProtoAdapter_V2MasterStatusMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, V2MasterStatusMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2MasterStatusMessage m88decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m87build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.masterStatus((V2MasterStatus) V2MasterStatus.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2MasterStatusMessage v2MasterStatusMessage) {
            V2MasterStatus.ADAPTER.encodeWithTag(protoWriter, 1, v2MasterStatusMessage.masterStatus);
            protoWriter.writeBytes(v2MasterStatusMessage.unknownFields());
        }

        public int encodedSize(V2MasterStatusMessage v2MasterStatusMessage) {
            return V2MasterStatus.ADAPTER.encodedSizeWithTag(1, v2MasterStatusMessage.masterStatus) + v2MasterStatusMessage.unknownFields().I();
        }

        public V2MasterStatusMessage redact(V2MasterStatusMessage v2MasterStatusMessage) {
            Builder m86newBuilder = v2MasterStatusMessage.m86newBuilder();
            V2MasterStatus v2MasterStatus = m86newBuilder.masterStatus;
            if (v2MasterStatus != null) {
                m86newBuilder.masterStatus = (V2MasterStatus) V2MasterStatus.ADAPTER.redact(v2MasterStatus);
            }
            m86newBuilder.clearUnknownFields();
            return m86newBuilder.m87build();
        }
    }

    public V2MasterStatusMessage(V2MasterStatus v2MasterStatus) {
        this(v2MasterStatus, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2MasterStatusMessage)) {
            return false;
        }
        V2MasterStatusMessage v2MasterStatusMessage = (V2MasterStatusMessage) obj;
        if (Internal.equals(unknownFields(), v2MasterStatusMessage.unknownFields()) && Internal.equals(this.masterStatus, v2MasterStatusMessage.masterStatus)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            V2MasterStatus v2MasterStatus = this.masterStatus;
            if (v2MasterStatus != null) {
                i10 = v2MasterStatus.hashCode();
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
        if (this.masterStatus != null) {
            sb.append(", masterStatus=");
            sb.append(this.masterStatus);
        }
        StringBuilder replace = sb.replace(0, 2, "V2MasterStatusMessage{");
        replace.append('}');
        return replace.toString();
    }

    public V2MasterStatusMessage(V2MasterStatus v2MasterStatus, h hVar) {
        super(ADAPTER, hVar);
        this.masterStatus = v2MasterStatus;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m86newBuilder() {
        Builder builder = new Builder();
        builder.masterStatus = this.masterStatus;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
