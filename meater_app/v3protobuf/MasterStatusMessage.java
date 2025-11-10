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
public final class MasterStatusMessage extends Message<MasterStatusMessage, Builder> {
    public static final ProtoAdapter<MasterStatusMessage> ADAPTER = new ProtoAdapter_MasterStatusMessage();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MasterStatus#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final MasterStatus masterStatus;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MasterStatusMessage, Builder> {
        public MasterStatus masterStatus;

        public Builder masterStatus(MasterStatus masterStatus) {
            this.masterStatus = masterStatus;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MasterStatusMessage m276build() {
            MasterStatus masterStatus = this.masterStatus;
            if (masterStatus != null) {
                return new MasterStatusMessage(this.masterStatus, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{masterStatus, "masterStatus"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MasterStatusMessage extends ProtoAdapter<MasterStatusMessage> {
        ProtoAdapter_MasterStatusMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, MasterStatusMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MasterStatusMessage m277decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m276build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.masterStatus((MasterStatus) MasterStatus.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MasterStatusMessage masterStatusMessage) {
            MasterStatus.ADAPTER.encodeWithTag(protoWriter, 1, masterStatusMessage.masterStatus);
            protoWriter.writeBytes(masterStatusMessage.unknownFields());
        }

        public int encodedSize(MasterStatusMessage masterStatusMessage) {
            return MasterStatus.ADAPTER.encodedSizeWithTag(1, masterStatusMessage.masterStatus) + masterStatusMessage.unknownFields().I();
        }

        public MasterStatusMessage redact(MasterStatusMessage masterStatusMessage) {
            Builder m275newBuilder = masterStatusMessage.m275newBuilder();
            MasterStatus masterStatus = m275newBuilder.masterStatus;
            if (masterStatus != null) {
                m275newBuilder.masterStatus = (MasterStatus) MasterStatus.ADAPTER.redact(masterStatus);
            }
            m275newBuilder.clearUnknownFields();
            return m275newBuilder.m276build();
        }
    }

    public MasterStatusMessage(MasterStatus masterStatus) {
        this(masterStatus, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MasterStatusMessage)) {
            return false;
        }
        MasterStatusMessage masterStatusMessage = (MasterStatusMessage) obj;
        if (Internal.equals(unknownFields(), masterStatusMessage.unknownFields()) && Internal.equals(this.masterStatus, masterStatusMessage.masterStatus)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            MasterStatus masterStatus = this.masterStatus;
            if (masterStatus != null) {
                i10 = masterStatus.hashCode();
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
        StringBuilder replace = sb.replace(0, 2, "MasterStatusMessage{");
        replace.append('}');
        return replace.toString();
    }

    public MasterStatusMessage(MasterStatus masterStatus, h hVar) {
        super(ADAPTER, hVar);
        this.masterStatus = masterStatus;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m275newBuilder() {
        Builder builder = new Builder();
        builder.masterStatus = this.masterStatus;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
