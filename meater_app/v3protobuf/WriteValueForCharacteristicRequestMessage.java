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
public final class WriteValueForCharacteristicRequestMessage extends Message<WriteValueForCharacteristicRequestMessage, Builder> {
    public static final ProtoAdapter<WriteValueForCharacteristicRequestMessage> ADAPTER = new ProtoAdapter_WriteValueForCharacteristicRequestMessage();
    public static final h DEFAULT_CHARACTERISTICID;
    public static final h DEFAULT_VALUE;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 2)
    public final h characteristicID;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeSimulatorHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final ProbeSimulatorHeader header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 3)
    public final h value;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<WriteValueForCharacteristicRequestMessage, Builder> {
        public h characteristicID;
        public ProbeSimulatorHeader header;
        public h value;

        public Builder characteristicID(h hVar) {
            this.characteristicID = hVar;
            return this;
        }

        public Builder header(ProbeSimulatorHeader probeSimulatorHeader) {
            this.header = probeSimulatorHeader;
            return this;
        }

        public Builder value(h hVar) {
            this.value = hVar;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public WriteValueForCharacteristicRequestMessage m387build() {
            ProbeSimulatorHeader probeSimulatorHeader = this.header;
            if (probeSimulatorHeader != null && this.characteristicID != null && this.value != null) {
                return new WriteValueForCharacteristicRequestMessage(this.header, this.characteristicID, this.value, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{probeSimulatorHeader, "header", this.characteristicID, "characteristicID", this.value, "value"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_WriteValueForCharacteristicRequestMessage extends ProtoAdapter<WriteValueForCharacteristicRequestMessage> {
        ProtoAdapter_WriteValueForCharacteristicRequestMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, WriteValueForCharacteristicRequestMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public WriteValueForCharacteristicRequestMessage m388decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m387build();
                }
                if (nextTag == 1) {
                    builder.header((ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.characteristicID((h) ProtoAdapter.BYTES.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.value((h) ProtoAdapter.BYTES.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, WriteValueForCharacteristicRequestMessage writeValueForCharacteristicRequestMessage) {
            ProbeSimulatorHeader.ADAPTER.encodeWithTag(protoWriter, 1, writeValueForCharacteristicRequestMessage.header);
            ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
            protoAdapter.encodeWithTag(protoWriter, 2, writeValueForCharacteristicRequestMessage.characteristicID);
            protoAdapter.encodeWithTag(protoWriter, 3, writeValueForCharacteristicRequestMessage.value);
            protoWriter.writeBytes(writeValueForCharacteristicRequestMessage.unknownFields());
        }

        public int encodedSize(WriteValueForCharacteristicRequestMessage writeValueForCharacteristicRequestMessage) {
            int encodedSizeWithTag = ProbeSimulatorHeader.ADAPTER.encodedSizeWithTag(1, writeValueForCharacteristicRequestMessage.header);
            ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
            return encodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, writeValueForCharacteristicRequestMessage.characteristicID) + protoAdapter.encodedSizeWithTag(3, writeValueForCharacteristicRequestMessage.value) + writeValueForCharacteristicRequestMessage.unknownFields().I();
        }

        public WriteValueForCharacteristicRequestMessage redact(WriteValueForCharacteristicRequestMessage writeValueForCharacteristicRequestMessage) {
            Builder m386newBuilder = writeValueForCharacteristicRequestMessage.m386newBuilder();
            ProbeSimulatorHeader probeSimulatorHeader = m386newBuilder.header;
            if (probeSimulatorHeader != null) {
                m386newBuilder.header = (ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.redact(probeSimulatorHeader);
            }
            m386newBuilder.clearUnknownFields();
            return m386newBuilder.m387build();
        }
    }

    static {
        h hVar = h.u;
        DEFAULT_CHARACTERISTICID = hVar;
        DEFAULT_VALUE = hVar;
    }

    public WriteValueForCharacteristicRequestMessage(ProbeSimulatorHeader probeSimulatorHeader, h hVar, h hVar2) {
        this(probeSimulatorHeader, hVar, hVar2, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WriteValueForCharacteristicRequestMessage)) {
            return false;
        }
        WriteValueForCharacteristicRequestMessage writeValueForCharacteristicRequestMessage = (WriteValueForCharacteristicRequestMessage) obj;
        if (Internal.equals(unknownFields(), writeValueForCharacteristicRequestMessage.unknownFields()) && Internal.equals(this.header, writeValueForCharacteristicRequestMessage.header) && Internal.equals(this.characteristicID, writeValueForCharacteristicRequestMessage.characteristicID) && Internal.equals(this.value, writeValueForCharacteristicRequestMessage.value)) {
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
            h hVar2 = this.value;
            if (hVar2 != null) {
                i13 = hVar2.hashCode();
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
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        StringBuilder replace = sb.replace(0, 2, "WriteValueForCharacteristicRequestMessage{");
        replace.append('}');
        return replace.toString();
    }

    public WriteValueForCharacteristicRequestMessage(ProbeSimulatorHeader probeSimulatorHeader, h hVar, h hVar2, h hVar3) {
        super(ADAPTER, hVar3);
        this.header = probeSimulatorHeader;
        this.characteristicID = hVar;
        this.value = hVar2;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m386newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.characteristicID = this.characteristicID;
        builder.value = this.value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
