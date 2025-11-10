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
public final class DiscoverProbeServicesRequestMessage extends Message<DiscoverProbeServicesRequestMessage, Builder> {
    public static final ProtoAdapter<DiscoverProbeServicesRequestMessage> ADAPTER = new ProtoAdapter_DiscoverProbeServicesRequestMessage();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REPEATED, tag = 2)
    public final List<h> desiredServices;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeSimulatorHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final ProbeSimulatorHeader header;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<DiscoverProbeServicesRequestMessage, Builder> {
        public List<h> desiredServices = Internal.newMutableList();
        public ProbeSimulatorHeader header;

        public Builder desiredServices(List<h> list) {
            Internal.checkElementsNotNull(list);
            this.desiredServices = list;
            return this;
        }

        public Builder header(ProbeSimulatorHeader probeSimulatorHeader) {
            this.header = probeSimulatorHeader;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public DiscoverProbeServicesRequestMessage m174build() {
            ProbeSimulatorHeader probeSimulatorHeader = this.header;
            if (probeSimulatorHeader != null) {
                return new DiscoverProbeServicesRequestMessage(this.header, this.desiredServices, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{probeSimulatorHeader, "header"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_DiscoverProbeServicesRequestMessage extends ProtoAdapter<DiscoverProbeServicesRequestMessage> {
        ProtoAdapter_DiscoverProbeServicesRequestMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, DiscoverProbeServicesRequestMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public DiscoverProbeServicesRequestMessage m175decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m174build();
                }
                if (nextTag == 1) {
                    builder.header((ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.desiredServices.add((h) ProtoAdapter.BYTES.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, DiscoverProbeServicesRequestMessage discoverProbeServicesRequestMessage) {
            ProbeSimulatorHeader.ADAPTER.encodeWithTag(protoWriter, 1, discoverProbeServicesRequestMessage.header);
            if (discoverProbeServicesRequestMessage.desiredServices != null) {
                ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 2, discoverProbeServicesRequestMessage.desiredServices);
            }
            protoWriter.writeBytes(discoverProbeServicesRequestMessage.unknownFields());
        }

        public int encodedSize(DiscoverProbeServicesRequestMessage discoverProbeServicesRequestMessage) {
            return ProbeSimulatorHeader.ADAPTER.encodedSizeWithTag(1, discoverProbeServicesRequestMessage.header) + ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(2, discoverProbeServicesRequestMessage.desiredServices) + discoverProbeServicesRequestMessage.unknownFields().I();
        }

        public DiscoverProbeServicesRequestMessage redact(DiscoverProbeServicesRequestMessage discoverProbeServicesRequestMessage) {
            Builder m173newBuilder = discoverProbeServicesRequestMessage.m173newBuilder();
            ProbeSimulatorHeader probeSimulatorHeader = m173newBuilder.header;
            if (probeSimulatorHeader != null) {
                m173newBuilder.header = (ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.redact(probeSimulatorHeader);
            }
            m173newBuilder.clearUnknownFields();
            return m173newBuilder.m174build();
        }
    }

    public DiscoverProbeServicesRequestMessage(ProbeSimulatorHeader probeSimulatorHeader, List<h> list) {
        this(probeSimulatorHeader, list, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DiscoverProbeServicesRequestMessage)) {
            return false;
        }
        DiscoverProbeServicesRequestMessage discoverProbeServicesRequestMessage = (DiscoverProbeServicesRequestMessage) obj;
        if (Internal.equals(unknownFields(), discoverProbeServicesRequestMessage.unknownFields()) && Internal.equals(this.header, discoverProbeServicesRequestMessage.header) && Internal.equals(this.desiredServices, discoverProbeServicesRequestMessage.desiredServices)) {
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
            List<h> list = this.desiredServices;
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
        if (this.desiredServices != null) {
            sb.append(", desiredServices=");
            sb.append(this.desiredServices);
        }
        StringBuilder replace = sb.replace(0, 2, "DiscoverProbeServicesRequestMessage{");
        replace.append('}');
        return replace.toString();
    }

    public DiscoverProbeServicesRequestMessage(ProbeSimulatorHeader probeSimulatorHeader, List<h> list, h hVar) {
        super(ADAPTER, hVar);
        this.header = probeSimulatorHeader;
        this.desiredServices = Internal.immutableCopyOf("desiredServices", list);
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m173newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.desiredServices = Internal.copyOf("desiredServices", this.desiredServices);
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
