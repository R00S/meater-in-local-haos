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
public final class DiscoverServiceCharacteristicsRequestMessage extends Message<DiscoverServiceCharacteristicsRequestMessage, Builder> {
    public static final ProtoAdapter<DiscoverServiceCharacteristicsRequestMessage> ADAPTER = new ProtoAdapter_DiscoverServiceCharacteristicsRequestMessage();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REPEATED, tag = 2)
    public final List<h> desiredCharacteristics;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeSimulatorHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final ProbeSimulatorHeader header;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<DiscoverServiceCharacteristicsRequestMessage, Builder> {
        public List<h> desiredCharacteristics = Internal.newMutableList();
        public ProbeSimulatorHeader header;

        public Builder desiredCharacteristics(List<h> list) {
            Internal.checkElementsNotNull(list);
            this.desiredCharacteristics = list;
            return this;
        }

        public Builder header(ProbeSimulatorHeader probeSimulatorHeader) {
            this.header = probeSimulatorHeader;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public DiscoverServiceCharacteristicsRequestMessage m180build() {
            ProbeSimulatorHeader probeSimulatorHeader = this.header;
            if (probeSimulatorHeader != null) {
                return new DiscoverServiceCharacteristicsRequestMessage(this.header, this.desiredCharacteristics, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{probeSimulatorHeader, "header"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_DiscoverServiceCharacteristicsRequestMessage extends ProtoAdapter<DiscoverServiceCharacteristicsRequestMessage> {
        ProtoAdapter_DiscoverServiceCharacteristicsRequestMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, DiscoverServiceCharacteristicsRequestMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public DiscoverServiceCharacteristicsRequestMessage m181decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m180build();
                }
                if (nextTag == 1) {
                    builder.header((ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.desiredCharacteristics.add((h) ProtoAdapter.BYTES.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, DiscoverServiceCharacteristicsRequestMessage discoverServiceCharacteristicsRequestMessage) {
            ProbeSimulatorHeader.ADAPTER.encodeWithTag(protoWriter, 1, discoverServiceCharacteristicsRequestMessage.header);
            if (discoverServiceCharacteristicsRequestMessage.desiredCharacteristics != null) {
                ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 2, discoverServiceCharacteristicsRequestMessage.desiredCharacteristics);
            }
            protoWriter.writeBytes(discoverServiceCharacteristicsRequestMessage.unknownFields());
        }

        public int encodedSize(DiscoverServiceCharacteristicsRequestMessage discoverServiceCharacteristicsRequestMessage) {
            return ProbeSimulatorHeader.ADAPTER.encodedSizeWithTag(1, discoverServiceCharacteristicsRequestMessage.header) + ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(2, discoverServiceCharacteristicsRequestMessage.desiredCharacteristics) + discoverServiceCharacteristicsRequestMessage.unknownFields().I();
        }

        public DiscoverServiceCharacteristicsRequestMessage redact(DiscoverServiceCharacteristicsRequestMessage discoverServiceCharacteristicsRequestMessage) {
            Builder m179newBuilder = discoverServiceCharacteristicsRequestMessage.m179newBuilder();
            ProbeSimulatorHeader probeSimulatorHeader = m179newBuilder.header;
            if (probeSimulatorHeader != null) {
                m179newBuilder.header = (ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.redact(probeSimulatorHeader);
            }
            m179newBuilder.clearUnknownFields();
            return m179newBuilder.m180build();
        }
    }

    public DiscoverServiceCharacteristicsRequestMessage(ProbeSimulatorHeader probeSimulatorHeader, List<h> list) {
        this(probeSimulatorHeader, list, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DiscoverServiceCharacteristicsRequestMessage)) {
            return false;
        }
        DiscoverServiceCharacteristicsRequestMessage discoverServiceCharacteristicsRequestMessage = (DiscoverServiceCharacteristicsRequestMessage) obj;
        if (Internal.equals(unknownFields(), discoverServiceCharacteristicsRequestMessage.unknownFields()) && Internal.equals(this.header, discoverServiceCharacteristicsRequestMessage.header) && Internal.equals(this.desiredCharacteristics, discoverServiceCharacteristicsRequestMessage.desiredCharacteristics)) {
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
            List<h> list = this.desiredCharacteristics;
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
        if (this.desiredCharacteristics != null) {
            sb.append(", desiredCharacteristics=");
            sb.append(this.desiredCharacteristics);
        }
        StringBuilder replace = sb.replace(0, 2, "DiscoverServiceCharacteristicsRequestMessage{");
        replace.append('}');
        return replace.toString();
    }

    public DiscoverServiceCharacteristicsRequestMessage(ProbeSimulatorHeader probeSimulatorHeader, List<h> list, h hVar) {
        super(ADAPTER, hVar);
        this.header = probeSimulatorHeader;
        this.desiredCharacteristics = Internal.immutableCopyOf("desiredCharacteristics", list);
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m179newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.desiredCharacteristics = Internal.copyOf("desiredCharacteristics", this.desiredCharacteristics);
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
