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
public final class RequestNofifyForCharacteristicMessage extends Message<RequestNofifyForCharacteristicMessage, Builder> {
    public static final ProtoAdapter<RequestNofifyForCharacteristicMessage> ADAPTER = new ProtoAdapter_RequestNofifyForCharacteristicMessage();
    public static final h DEFAULT_CHARACTERISTICID = h.u;
    public static final Boolean DEFAULT_SUCCESS = Boolean.FALSE;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 2)
    public final h characteristicID;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeSimulatorHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final ProbeSimulatorHeader header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 3)
    public final Boolean success;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<RequestNofifyForCharacteristicMessage, Builder> {
        public h characteristicID;
        public ProbeSimulatorHeader header;
        public Boolean success;

        public Builder characteristicID(h hVar) {
            this.characteristicID = hVar;
            return this;
        }

        public Builder header(ProbeSimulatorHeader probeSimulatorHeader) {
            this.header = probeSimulatorHeader;
            return this;
        }

        public Builder success(Boolean bool) {
            this.success = bool;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public RequestNofifyForCharacteristicMessage m360build() {
            ProbeSimulatorHeader probeSimulatorHeader = this.header;
            if (probeSimulatorHeader != null && this.characteristicID != null && this.success != null) {
                return new RequestNofifyForCharacteristicMessage(this.header, this.characteristicID, this.success, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{probeSimulatorHeader, "header", this.characteristicID, "characteristicID", this.success, "success"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_RequestNofifyForCharacteristicMessage extends ProtoAdapter<RequestNofifyForCharacteristicMessage> {
        ProtoAdapter_RequestNofifyForCharacteristicMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, RequestNofifyForCharacteristicMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public RequestNofifyForCharacteristicMessage m361decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m360build();
                }
                if (nextTag == 1) {
                    builder.header((ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.characteristicID((h) ProtoAdapter.BYTES.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.success((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, RequestNofifyForCharacteristicMessage requestNofifyForCharacteristicMessage) {
            ProbeSimulatorHeader.ADAPTER.encodeWithTag(protoWriter, 1, requestNofifyForCharacteristicMessage.header);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, requestNofifyForCharacteristicMessage.characteristicID);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, requestNofifyForCharacteristicMessage.success);
            protoWriter.writeBytes(requestNofifyForCharacteristicMessage.unknownFields());
        }

        public int encodedSize(RequestNofifyForCharacteristicMessage requestNofifyForCharacteristicMessage) {
            return ProbeSimulatorHeader.ADAPTER.encodedSizeWithTag(1, requestNofifyForCharacteristicMessage.header) + ProtoAdapter.BYTES.encodedSizeWithTag(2, requestNofifyForCharacteristicMessage.characteristicID) + ProtoAdapter.BOOL.encodedSizeWithTag(3, requestNofifyForCharacteristicMessage.success) + requestNofifyForCharacteristicMessage.unknownFields().I();
        }

        public RequestNofifyForCharacteristicMessage redact(RequestNofifyForCharacteristicMessage requestNofifyForCharacteristicMessage) {
            Builder m359newBuilder = requestNofifyForCharacteristicMessage.m359newBuilder();
            ProbeSimulatorHeader probeSimulatorHeader = m359newBuilder.header;
            if (probeSimulatorHeader != null) {
                m359newBuilder.header = (ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.redact(probeSimulatorHeader);
            }
            m359newBuilder.clearUnknownFields();
            return m359newBuilder.m360build();
        }
    }

    public RequestNofifyForCharacteristicMessage(ProbeSimulatorHeader probeSimulatorHeader, h hVar, Boolean bool) {
        this(probeSimulatorHeader, hVar, bool, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequestNofifyForCharacteristicMessage)) {
            return false;
        }
        RequestNofifyForCharacteristicMessage requestNofifyForCharacteristicMessage = (RequestNofifyForCharacteristicMessage) obj;
        if (Internal.equals(unknownFields(), requestNofifyForCharacteristicMessage.unknownFields()) && Internal.equals(this.header, requestNofifyForCharacteristicMessage.header) && Internal.equals(this.characteristicID, requestNofifyForCharacteristicMessage.characteristicID) && Internal.equals(this.success, requestNofifyForCharacteristicMessage.success)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12 = ((Message) this).hashCode;
        if (i12 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            ProbeSimulatorHeader probeSimulatorHeader = this.header;
            int i13 = 0;
            if (probeSimulatorHeader != null) {
                i10 = probeSimulatorHeader.hashCode();
            } else {
                i10 = 0;
            }
            int i14 = (hashCode + i10) * 37;
            h hVar = this.characteristicID;
            if (hVar != null) {
                i11 = hVar.hashCode();
            } else {
                i11 = 0;
            }
            int i15 = (i14 + i11) * 37;
            Boolean bool = this.success;
            if (bool != null) {
                i13 = bool.hashCode();
            }
            int i16 = i15 + i13;
            ((Message) this).hashCode = i16;
            return i16;
        }
        return i12;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.header != null) {
            sb.append(", header=");
            sb.append(this.header);
        }
        if (this.characteristicID != null) {
            sb.append(", characteristicID=");
            sb.append(this.characteristicID);
        }
        if (this.success != null) {
            sb.append(", success=");
            sb.append(this.success);
        }
        StringBuilder replace = sb.replace(0, 2, "RequestNofifyForCharacteristicMessage{");
        replace.append('}');
        return replace.toString();
    }

    public RequestNofifyForCharacteristicMessage(ProbeSimulatorHeader probeSimulatorHeader, h hVar, Boolean bool, h hVar2) {
        super(ADAPTER, hVar2);
        this.header = probeSimulatorHeader;
        this.characteristicID = hVar;
        this.success = bool;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m359newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.characteristicID = this.characteristicID;
        builder.success = this.success;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
