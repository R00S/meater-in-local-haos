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
public final class ReadValueForCharacteristicRequestMessage extends Message<ReadValueForCharacteristicRequestMessage, Builder> {
    public static final ProtoAdapter<ReadValueForCharacteristicRequestMessage> ADAPTER = new ProtoAdapter_ReadValueForCharacteristicRequestMessage();
    public static final h DEFAULT_CHARACTERISTICID = h.u;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 2)
    public final h characteristicID;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeSimulatorHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final ProbeSimulatorHeader header;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<ReadValueForCharacteristicRequestMessage, Builder> {
        public h characteristicID;
        public ProbeSimulatorHeader header;

        public Builder characteristicID(h hVar) {
            this.characteristicID = hVar;
            return this;
        }

        public Builder header(ProbeSimulatorHeader probeSimulatorHeader) {
            this.header = probeSimulatorHeader;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public ReadValueForCharacteristicRequestMessage m354build() {
            ProbeSimulatorHeader probeSimulatorHeader = this.header;
            if (probeSimulatorHeader != null && this.characteristicID != null) {
                return new ReadValueForCharacteristicRequestMessage(this.header, this.characteristicID, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{probeSimulatorHeader, "header", this.characteristicID, "characteristicID"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_ReadValueForCharacteristicRequestMessage extends ProtoAdapter<ReadValueForCharacteristicRequestMessage> {
        ProtoAdapter_ReadValueForCharacteristicRequestMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, ReadValueForCharacteristicRequestMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public ReadValueForCharacteristicRequestMessage m355decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m354build();
                }
                if (nextTag == 1) {
                    builder.header((ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.characteristicID((h) ProtoAdapter.BYTES.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, ReadValueForCharacteristicRequestMessage readValueForCharacteristicRequestMessage) {
            ProbeSimulatorHeader.ADAPTER.encodeWithTag(protoWriter, 1, readValueForCharacteristicRequestMessage.header);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, readValueForCharacteristicRequestMessage.characteristicID);
            protoWriter.writeBytes(readValueForCharacteristicRequestMessage.unknownFields());
        }

        public int encodedSize(ReadValueForCharacteristicRequestMessage readValueForCharacteristicRequestMessage) {
            return ProbeSimulatorHeader.ADAPTER.encodedSizeWithTag(1, readValueForCharacteristicRequestMessage.header) + ProtoAdapter.BYTES.encodedSizeWithTag(2, readValueForCharacteristicRequestMessage.characteristicID) + readValueForCharacteristicRequestMessage.unknownFields().I();
        }

        public ReadValueForCharacteristicRequestMessage redact(ReadValueForCharacteristicRequestMessage readValueForCharacteristicRequestMessage) {
            Builder m353newBuilder = readValueForCharacteristicRequestMessage.m353newBuilder();
            ProbeSimulatorHeader probeSimulatorHeader = m353newBuilder.header;
            if (probeSimulatorHeader != null) {
                m353newBuilder.header = (ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.redact(probeSimulatorHeader);
            }
            m353newBuilder.clearUnknownFields();
            return m353newBuilder.m354build();
        }
    }

    public ReadValueForCharacteristicRequestMessage(ProbeSimulatorHeader probeSimulatorHeader, h hVar) {
        this(probeSimulatorHeader, hVar, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReadValueForCharacteristicRequestMessage)) {
            return false;
        }
        ReadValueForCharacteristicRequestMessage readValueForCharacteristicRequestMessage = (ReadValueForCharacteristicRequestMessage) obj;
        if (Internal.equals(unknownFields(), readValueForCharacteristicRequestMessage.unknownFields()) && Internal.equals(this.header, readValueForCharacteristicRequestMessage.header) && Internal.equals(this.characteristicID, readValueForCharacteristicRequestMessage.characteristicID)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            ProbeSimulatorHeader probeSimulatorHeader = this.header;
            int i12 = 0;
            if (probeSimulatorHeader != null) {
                i10 = probeSimulatorHeader.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (hashCode + i10) * 37;
            h hVar = this.characteristicID;
            if (hVar != null) {
                i12 = hVar.hashCode();
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
        if (this.characteristicID != null) {
            sb.append(", characteristicID=");
            sb.append(this.characteristicID);
        }
        StringBuilder replace = sb.replace(0, 2, "ReadValueForCharacteristicRequestMessage{");
        replace.append('}');
        return replace.toString();
    }

    public ReadValueForCharacteristicRequestMessage(ProbeSimulatorHeader probeSimulatorHeader, h hVar, h hVar2) {
        super(ADAPTER, hVar2);
        this.header = probeSimulatorHeader;
        this.characteristicID = hVar;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m353newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.characteristicID = this.characteristicID;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
