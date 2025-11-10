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
public final class V2MasterStatusRequestMessage extends Message<V2MasterStatusRequestMessage, Builder> {
    public static final ProtoAdapter<V2MasterStatusRequestMessage> ADAPTER = new ProtoAdapter_V2MasterStatusRequestMessage();
    public static final Long DEFAULT_DEVICEID = 0L;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long deviceID;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2MasterStatusRequestMessage, Builder> {
        public Long deviceID;

        public Builder deviceID(Long l10) {
            this.deviceID = l10;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2MasterStatusRequestMessage m90build() {
            Long l10 = this.deviceID;
            if (l10 != null) {
                return new V2MasterStatusRequestMessage(this.deviceID, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "deviceID"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2MasterStatusRequestMessage extends ProtoAdapter<V2MasterStatusRequestMessage> {
        ProtoAdapter_V2MasterStatusRequestMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, V2MasterStatusRequestMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2MasterStatusRequestMessage m91decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m90build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.deviceID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2MasterStatusRequestMessage v2MasterStatusRequestMessage) {
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, v2MasterStatusRequestMessage.deviceID);
            protoWriter.writeBytes(v2MasterStatusRequestMessage.unknownFields());
        }

        public int encodedSize(V2MasterStatusRequestMessage v2MasterStatusRequestMessage) {
            return ProtoAdapter.FIXED64.encodedSizeWithTag(1, v2MasterStatusRequestMessage.deviceID) + v2MasterStatusRequestMessage.unknownFields().I();
        }

        public V2MasterStatusRequestMessage redact(V2MasterStatusRequestMessage v2MasterStatusRequestMessage) {
            Builder m89newBuilder = v2MasterStatusRequestMessage.m89newBuilder();
            m89newBuilder.clearUnknownFields();
            return m89newBuilder.m90build();
        }
    }

    public V2MasterStatusRequestMessage(Long l10) {
        this(l10, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2MasterStatusRequestMessage)) {
            return false;
        }
        V2MasterStatusRequestMessage v2MasterStatusRequestMessage = (V2MasterStatusRequestMessage) obj;
        if (Internal.equals(unknownFields(), v2MasterStatusRequestMessage.unknownFields()) && Internal.equals(this.deviceID, v2MasterStatusRequestMessage.deviceID)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Long l10 = this.deviceID;
            if (l10 != null) {
                i10 = l10.hashCode();
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
        if (this.deviceID != null) {
            sb.append(", deviceID=");
            sb.append(this.deviceID);
        }
        StringBuilder replace = sb.replace(0, 2, "V2MasterStatusRequestMessage{");
        replace.append('}');
        return replace.toString();
    }

    public V2MasterStatusRequestMessage(Long l10, h hVar) {
        super(ADAPTER, hVar);
        this.deviceID = l10;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m89newBuilder() {
        Builder builder = new Builder();
        builder.deviceID = this.deviceID;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
