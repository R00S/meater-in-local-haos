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
public final class DiscoverProbeServicesResponseMessage extends Message<DiscoverProbeServicesResponseMessage, Builder> {
    public static final ProtoAdapter<DiscoverProbeServicesResponseMessage> ADAPTER = new ProtoAdapter_DiscoverProbeServicesResponseMessage();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeSimulatorHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final ProbeSimulatorHeader header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REPEATED, tag = 2)
    public final List<h> services;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<DiscoverProbeServicesResponseMessage, Builder> {
        public ProbeSimulatorHeader header;
        public List<h> services = Internal.newMutableList();

        public Builder header(ProbeSimulatorHeader probeSimulatorHeader) {
            this.header = probeSimulatorHeader;
            return this;
        }

        public Builder services(List<h> list) {
            Internal.checkElementsNotNull(list);
            this.services = list;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public DiscoverProbeServicesResponseMessage m177build() {
            ProbeSimulatorHeader probeSimulatorHeader = this.header;
            if (probeSimulatorHeader != null) {
                return new DiscoverProbeServicesResponseMessage(this.header, this.services, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{probeSimulatorHeader, "header"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_DiscoverProbeServicesResponseMessage extends ProtoAdapter<DiscoverProbeServicesResponseMessage> {
        ProtoAdapter_DiscoverProbeServicesResponseMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, DiscoverProbeServicesResponseMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public DiscoverProbeServicesResponseMessage m178decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m177build();
                }
                if (nextTag == 1) {
                    builder.header((ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.services.add((h) ProtoAdapter.BYTES.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, DiscoverProbeServicesResponseMessage discoverProbeServicesResponseMessage) {
            ProbeSimulatorHeader.ADAPTER.encodeWithTag(protoWriter, 1, discoverProbeServicesResponseMessage.header);
            if (discoverProbeServicesResponseMessage.services != null) {
                ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 2, discoverProbeServicesResponseMessage.services);
            }
            protoWriter.writeBytes(discoverProbeServicesResponseMessage.unknownFields());
        }

        public int encodedSize(DiscoverProbeServicesResponseMessage discoverProbeServicesResponseMessage) {
            return ProbeSimulatorHeader.ADAPTER.encodedSizeWithTag(1, discoverProbeServicesResponseMessage.header) + ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(2, discoverProbeServicesResponseMessage.services) + discoverProbeServicesResponseMessage.unknownFields().I();
        }

        public DiscoverProbeServicesResponseMessage redact(DiscoverProbeServicesResponseMessage discoverProbeServicesResponseMessage) {
            Builder m176newBuilder = discoverProbeServicesResponseMessage.m176newBuilder();
            ProbeSimulatorHeader probeSimulatorHeader = m176newBuilder.header;
            if (probeSimulatorHeader != null) {
                m176newBuilder.header = (ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.redact(probeSimulatorHeader);
            }
            m176newBuilder.clearUnknownFields();
            return m176newBuilder.m177build();
        }
    }

    public DiscoverProbeServicesResponseMessage(ProbeSimulatorHeader probeSimulatorHeader, List<h> list) {
        this(probeSimulatorHeader, list, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DiscoverProbeServicesResponseMessage)) {
            return false;
        }
        DiscoverProbeServicesResponseMessage discoverProbeServicesResponseMessage = (DiscoverProbeServicesResponseMessage) obj;
        if (Internal.equals(unknownFields(), discoverProbeServicesResponseMessage.unknownFields()) && Internal.equals(this.header, discoverProbeServicesResponseMessage.header) && Internal.equals(this.services, discoverProbeServicesResponseMessage.services)) {
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
            List<h> list = this.services;
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
        if (this.services != null) {
            sb.append(", services=");
            sb.append(this.services);
        }
        StringBuilder replace = sb.replace(0, 2, "DiscoverProbeServicesResponseMessage{");
        replace.append('}');
        return replace.toString();
    }

    public DiscoverProbeServicesResponseMessage(ProbeSimulatorHeader probeSimulatorHeader, List<h> list, h hVar) {
        super(ADAPTER, hVar);
        this.header = probeSimulatorHeader;
        this.services = Internal.immutableCopyOf("services", list);
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m176newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.services = Internal.copyOf("services", this.services);
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
