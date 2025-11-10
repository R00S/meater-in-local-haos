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
public final class MasterStatusRequestMessage extends Message<MasterStatusRequestMessage, Builder> {
    public static final ProtoAdapter<MasterStatusRequestMessage> ADAPTER = new ProtoAdapter_MasterStatusRequestMessage();
    public static final Long DEFAULT_DEVICEID = 0L;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long deviceID;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MasterStatusRequestMessage, Builder> {
        public Long deviceID;

        public Builder deviceID(Long l10) {
            this.deviceID = l10;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MasterStatusRequestMessage m279build() {
            Long l10 = this.deviceID;
            if (l10 != null) {
                return new MasterStatusRequestMessage(this.deviceID, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "deviceID"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MasterStatusRequestMessage extends ProtoAdapter<MasterStatusRequestMessage> {
        ProtoAdapter_MasterStatusRequestMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, MasterStatusRequestMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MasterStatusRequestMessage m280decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m279build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.deviceID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MasterStatusRequestMessage masterStatusRequestMessage) {
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, masterStatusRequestMessage.deviceID);
            protoWriter.writeBytes(masterStatusRequestMessage.unknownFields());
        }

        public int encodedSize(MasterStatusRequestMessage masterStatusRequestMessage) {
            return ProtoAdapter.FIXED64.encodedSizeWithTag(1, masterStatusRequestMessage.deviceID) + masterStatusRequestMessage.unknownFields().I();
        }

        public MasterStatusRequestMessage redact(MasterStatusRequestMessage masterStatusRequestMessage) {
            Builder m278newBuilder = masterStatusRequestMessage.m278newBuilder();
            m278newBuilder.clearUnknownFields();
            return m278newBuilder.m279build();
        }
    }

    public MasterStatusRequestMessage(Long l10) {
        this(l10, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MasterStatusRequestMessage)) {
            return false;
        }
        MasterStatusRequestMessage masterStatusRequestMessage = (MasterStatusRequestMessage) obj;
        if (Internal.equals(unknownFields(), masterStatusRequestMessage.unknownFields()) && Internal.equals(this.deviceID, masterStatusRequestMessage.deviceID)) {
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
        StringBuilder replace = sb.replace(0, 2, "MasterStatusRequestMessage{");
        replace.append('}');
        return replace.toString();
    }

    public MasterStatusRequestMessage(Long l10, h hVar) {
        super(ADAPTER, hVar);
        this.deviceID = l10;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m278newBuilder() {
        Builder builder = new Builder();
        builder.deviceID = this.deviceID;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
