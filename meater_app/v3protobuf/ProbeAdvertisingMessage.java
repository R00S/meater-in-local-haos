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
public final class ProbeAdvertisingMessage extends Message<ProbeAdvertisingMessage, Builder> {
    public static final ProtoAdapter<ProbeAdvertisingMessage> ADAPTER = new ProtoAdapter_ProbeAdvertisingMessage();
    public static final h DEFAULT_MANUFACTURERDATA = h.u;
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeSimulatorHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final ProbeSimulatorHeader header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 4)
    public final h manufacturerData;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REPEATED, tag = 3)
    public final List<h> supportedServices;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<ProbeAdvertisingMessage, Builder> {
        public ProbeSimulatorHeader header;
        public h manufacturerData;
        public String name;
        public List<h> supportedServices = Internal.newMutableList();

        public Builder header(ProbeSimulatorHeader probeSimulatorHeader) {
            this.header = probeSimulatorHeader;
            return this;
        }

        public Builder manufacturerData(h hVar) {
            this.manufacturerData = hVar;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder supportedServices(List<h> list) {
            Internal.checkElementsNotNull(list);
            this.supportedServices = list;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public ProbeAdvertisingMessage m315build() {
            ProbeSimulatorHeader probeSimulatorHeader = this.header;
            if (probeSimulatorHeader != null && this.name != null && this.manufacturerData != null) {
                return new ProbeAdvertisingMessage(this.header, this.name, this.supportedServices, this.manufacturerData, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{probeSimulatorHeader, "header", this.name, "name", this.manufacturerData, "manufacturerData"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_ProbeAdvertisingMessage extends ProtoAdapter<ProbeAdvertisingMessage> {
        ProtoAdapter_ProbeAdvertisingMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, ProbeAdvertisingMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public ProbeAdvertisingMessage m316decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m315build();
                }
                if (nextTag == 1) {
                    builder.header((ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.name((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.supportedServices.add((h) ProtoAdapter.BYTES.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.manufacturerData((h) ProtoAdapter.BYTES.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, ProbeAdvertisingMessage probeAdvertisingMessage) {
            ProbeSimulatorHeader.ADAPTER.encodeWithTag(protoWriter, 1, probeAdvertisingMessage.header);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, probeAdvertisingMessage.name);
            if (probeAdvertisingMessage.supportedServices != null) {
                ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 3, probeAdvertisingMessage.supportedServices);
            }
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, probeAdvertisingMessage.manufacturerData);
            protoWriter.writeBytes(probeAdvertisingMessage.unknownFields());
        }

        public int encodedSize(ProbeAdvertisingMessage probeAdvertisingMessage) {
            int encodedSizeWithTag = ProbeSimulatorHeader.ADAPTER.encodedSizeWithTag(1, probeAdvertisingMessage.header) + ProtoAdapter.STRING.encodedSizeWithTag(2, probeAdvertisingMessage.name);
            ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
            return encodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(3, probeAdvertisingMessage.supportedServices) + protoAdapter.encodedSizeWithTag(4, probeAdvertisingMessage.manufacturerData) + probeAdvertisingMessage.unknownFields().I();
        }

        public ProbeAdvertisingMessage redact(ProbeAdvertisingMessage probeAdvertisingMessage) {
            Builder m314newBuilder = probeAdvertisingMessage.m314newBuilder();
            ProbeSimulatorHeader probeSimulatorHeader = m314newBuilder.header;
            if (probeSimulatorHeader != null) {
                m314newBuilder.header = (ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.redact(probeSimulatorHeader);
            }
            m314newBuilder.clearUnknownFields();
            return m314newBuilder.m315build();
        }
    }

    public ProbeAdvertisingMessage(ProbeSimulatorHeader probeSimulatorHeader, String str, List<h> list, h hVar) {
        this(probeSimulatorHeader, str, list, hVar, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProbeAdvertisingMessage)) {
            return false;
        }
        ProbeAdvertisingMessage probeAdvertisingMessage = (ProbeAdvertisingMessage) obj;
        if (Internal.equals(unknownFields(), probeAdvertisingMessage.unknownFields()) && Internal.equals(this.header, probeAdvertisingMessage.header) && Internal.equals(this.name, probeAdvertisingMessage.name) && Internal.equals(this.supportedServices, probeAdvertisingMessage.supportedServices) && Internal.equals(this.manufacturerData, probeAdvertisingMessage.manufacturerData)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((Message) this).hashCode;
        if (i13 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            ProbeSimulatorHeader probeSimulatorHeader = this.header;
            int i14 = 0;
            if (probeSimulatorHeader != null) {
                i10 = probeSimulatorHeader.hashCode();
            } else {
                i10 = 0;
            }
            int i15 = (hashCode + i10) * 37;
            String str = this.name;
            if (str != null) {
                i11 = str.hashCode();
            } else {
                i11 = 0;
            }
            int i16 = (i15 + i11) * 37;
            List<h> list = this.supportedServices;
            if (list != null) {
                i12 = list.hashCode();
            } else {
                i12 = 1;
            }
            int i17 = (i16 + i12) * 37;
            h hVar = this.manufacturerData;
            if (hVar != null) {
                i14 = hVar.hashCode();
            }
            int i18 = i17 + i14;
            ((Message) this).hashCode = i18;
            return i18;
        }
        return i13;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.header != null) {
            sb.append(", header=");
            sb.append(this.header);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.supportedServices != null) {
            sb.append(", supportedServices=");
            sb.append(this.supportedServices);
        }
        if (this.manufacturerData != null) {
            sb.append(", manufacturerData=");
            sb.append(this.manufacturerData);
        }
        StringBuilder replace = sb.replace(0, 2, "ProbeAdvertisingMessage{");
        replace.append('}');
        return replace.toString();
    }

    public ProbeAdvertisingMessage(ProbeSimulatorHeader probeSimulatorHeader, String str, List<h> list, h hVar, h hVar2) {
        super(ADAPTER, hVar2);
        this.header = probeSimulatorHeader;
        this.name = str;
        this.supportedServices = Internal.immutableCopyOf("supportedServices", list);
        this.manufacturerData = hVar;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m314newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.name = this.name;
        builder.supportedServices = Internal.copyOf("supportedServices", this.supportedServices);
        builder.manufacturerData = this.manufacturerData;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
