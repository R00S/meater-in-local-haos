package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.List;
import ql.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public final class DiscoverServiceCharacteristicsResponseMessage extends Message<DiscoverServiceCharacteristicsResponseMessage, Builder> {
    public static final ProtoAdapter<DiscoverServiceCharacteristicsResponseMessage> ADAPTER = new ProtoAdapter_DiscoverServiceCharacteristicsResponseMessage();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REPEATED, tag = 2)
    public final List<h> characteristics;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeSimulatorHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final ProbeSimulatorHeader header;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<DiscoverServiceCharacteristicsResponseMessage, Builder> {
        public List<h> characteristics = Internal.newMutableList();
        public ProbeSimulatorHeader header;

        public Builder characteristics(List<h> list) {
            Internal.checkElementsNotNull(list);
            this.characteristics = list;
            return this;
        }

        public Builder header(ProbeSimulatorHeader probeSimulatorHeader) {
            this.header = probeSimulatorHeader;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public DiscoverServiceCharacteristicsResponseMessage m183build() {
            ProbeSimulatorHeader probeSimulatorHeader = this.header;
            if (probeSimulatorHeader != null) {
                return new DiscoverServiceCharacteristicsResponseMessage(this.header, this.characteristics, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{probeSimulatorHeader, "header"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_DiscoverServiceCharacteristicsResponseMessage extends ProtoAdapter<DiscoverServiceCharacteristicsResponseMessage> {
        ProtoAdapter_DiscoverServiceCharacteristicsResponseMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, DiscoverServiceCharacteristicsResponseMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public DiscoverServiceCharacteristicsResponseMessage m184decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m183build();
                }
                if (nextTag == 1) {
                    builder.header((ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.characteristics.add((h) ProtoAdapter.BYTES.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, DiscoverServiceCharacteristicsResponseMessage discoverServiceCharacteristicsResponseMessage) {
            ProbeSimulatorHeader.ADAPTER.encodeWithTag(protoWriter, 1, discoverServiceCharacteristicsResponseMessage.header);
            if (discoverServiceCharacteristicsResponseMessage.characteristics != null) {
                ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 2, discoverServiceCharacteristicsResponseMessage.characteristics);
            }
            protoWriter.writeBytes(discoverServiceCharacteristicsResponseMessage.unknownFields());
        }

        public int encodedSize(DiscoverServiceCharacteristicsResponseMessage discoverServiceCharacteristicsResponseMessage) {
            return ProbeSimulatorHeader.ADAPTER.encodedSizeWithTag(1, discoverServiceCharacteristicsResponseMessage.header) + ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(2, discoverServiceCharacteristicsResponseMessage.characteristics) + discoverServiceCharacteristicsResponseMessage.unknownFields().I();
        }

        public DiscoverServiceCharacteristicsResponseMessage redact(DiscoverServiceCharacteristicsResponseMessage discoverServiceCharacteristicsResponseMessage) {
            Builder m182newBuilder = discoverServiceCharacteristicsResponseMessage.m182newBuilder();
            ProbeSimulatorHeader probeSimulatorHeader = m182newBuilder.header;
            if (probeSimulatorHeader != null) {
                m182newBuilder.header = (ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.redact(probeSimulatorHeader);
            }
            m182newBuilder.clearUnknownFields();
            return m182newBuilder.m183build();
        }
    }

    public DiscoverServiceCharacteristicsResponseMessage(ProbeSimulatorHeader probeSimulatorHeader, List<h> list) {
        this(probeSimulatorHeader, list, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DiscoverServiceCharacteristicsResponseMessage)) {
            return false;
        }
        DiscoverServiceCharacteristicsResponseMessage discoverServiceCharacteristicsResponseMessage = (DiscoverServiceCharacteristicsResponseMessage) obj;
        if (Internal.equals(unknownFields(), discoverServiceCharacteristicsResponseMessage.unknownFields()) && Internal.equals(this.header, discoverServiceCharacteristicsResponseMessage.header) && Internal.equals(this.characteristics, discoverServiceCharacteristicsResponseMessage.characteristics)) {
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
            if (probeSimulatorHeader != null) {
                i10 = probeSimulatorHeader.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (hashCode + i10) * 37;
            List<h> list = this.characteristics;
            if (list != null) {
                i11 = list.hashCode();
            } else {
                i11 = 1;
            }
            int i14 = i13 + i11;
            ((Message) this).hashCode = i14;
            return i14;
        }
        return i12;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.header != null) {
            sb.append(", header=");
            sb.append(this.header);
        }
        if (this.characteristics != null) {
            sb.append(", characteristics=");
            sb.append(this.characteristics);
        }
        StringBuilder replace = sb.replace(0, 2, "DiscoverServiceCharacteristicsResponseMessage{");
        replace.append('}');
        return replace.toString();
    }

    public DiscoverServiceCharacteristicsResponseMessage(ProbeSimulatorHeader probeSimulatorHeader, List<h> list, h hVar) {
        super(ADAPTER, hVar);
        this.header = probeSimulatorHeader;
        this.characteristics = Internal.immutableCopyOf("characteristics", list);
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m182newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.characteristics = Internal.copyOf("characteristics", this.characteristics);
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
