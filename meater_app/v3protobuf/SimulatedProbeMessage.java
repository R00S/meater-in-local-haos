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
public final class SimulatedProbeMessage extends Message<SimulatedProbeMessage, Builder> {
    public static final ProtoAdapter<SimulatedProbeMessage> ADAPTER = new ProtoAdapter_SimulatedProbeMessage();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.DiscoverProbeServicesRequestMessage#ADAPTER", tag = 6)
    public final DiscoverProbeServicesRequestMessage discoverProbeServicesRequestMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.DiscoverProbeServicesResponseMessage#ADAPTER", tag = 7)
    public final DiscoverProbeServicesResponseMessage discoverProbeServicesResponseMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.DiscoverServiceCharacteristicsRequestMessage#ADAPTER", tag = 8)
    public final DiscoverServiceCharacteristicsRequestMessage discoverServiceCharacteristicsRequestMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.DiscoverServiceCharacteristicsResponseMessage#ADAPTER", tag = 9)
    public final DiscoverServiceCharacteristicsResponseMessage discoverServiceCharacteristicsResponseMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.NotifyStatusResponseMessage#ADAPTER", tag = 13)
    public final NotifyStatusResponseMessage notifyStatusResponseMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeAdvertisingMessage#ADAPTER", tag = 2)
    public final ProbeAdvertisingMessage probeAdvertisingMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeCharacteristicValueUpdatedMessage#ADAPTER", tag = 14)
    public final ProbeCharacteristicValueUpdatedMessage probeCharacteristicValueUpdatedMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeCharacteristicValueWriteStatusMessage#ADAPTER", tag = 15)
    public final ProbeCharacteristicValueWriteStatusMessage probeCharacteristicValueWriteStatusMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeConnectedMessage#ADAPTER", tag = 4)
    public final ProbeConnectedMessage probeConnectedMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeConnectionRequestMessage#ADAPTER", tag = 3)
    public final ProbeConnectionRequestMessage probeConnectionRequestMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeDisconnectedMessage#ADAPTER", tag = 5)
    public final ProbeDisconnectedMessage probeDisconnectedMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeSimulatorHeader#ADAPTER", tag = 1)
    public final ProbeSimulatorHeader probeSimulatorHeader;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ReadValueForCharacteristicRequestMessage#ADAPTER", tag = 10)
    public final ReadValueForCharacteristicRequestMessage readValueForCharacteristicRequestMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.RequestNofifyForCharacteristicMessage#ADAPTER", tag = 12)
    public final RequestNofifyForCharacteristicMessage requestNofifyForCharacteristicMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.WriteValueForCharacteristicRequestMessage#ADAPTER", tag = 11)
    public final WriteValueForCharacteristicRequestMessage writeValueForCharacteristicRequestMessage;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<SimulatedProbeMessage, Builder> {
        public DiscoverProbeServicesRequestMessage discoverProbeServicesRequestMessage;
        public DiscoverProbeServicesResponseMessage discoverProbeServicesResponseMessage;
        public DiscoverServiceCharacteristicsRequestMessage discoverServiceCharacteristicsRequestMessage;
        public DiscoverServiceCharacteristicsResponseMessage discoverServiceCharacteristicsResponseMessage;
        public NotifyStatusResponseMessage notifyStatusResponseMessage;
        public ProbeAdvertisingMessage probeAdvertisingMessage;
        public ProbeCharacteristicValueUpdatedMessage probeCharacteristicValueUpdatedMessage;
        public ProbeCharacteristicValueWriteStatusMessage probeCharacteristicValueWriteStatusMessage;
        public ProbeConnectedMessage probeConnectedMessage;
        public ProbeConnectionRequestMessage probeConnectionRequestMessage;
        public ProbeDisconnectedMessage probeDisconnectedMessage;
        public ProbeSimulatorHeader probeSimulatorHeader;
        public ReadValueForCharacteristicRequestMessage readValueForCharacteristicRequestMessage;
        public RequestNofifyForCharacteristicMessage requestNofifyForCharacteristicMessage;
        public WriteValueForCharacteristicRequestMessage writeValueForCharacteristicRequestMessage;

        public Builder discoverProbeServicesRequestMessage(DiscoverProbeServicesRequestMessage discoverProbeServicesRequestMessage) {
            this.discoverProbeServicesRequestMessage = discoverProbeServicesRequestMessage;
            return this;
        }

        public Builder discoverProbeServicesResponseMessage(DiscoverProbeServicesResponseMessage discoverProbeServicesResponseMessage) {
            this.discoverProbeServicesResponseMessage = discoverProbeServicesResponseMessage;
            return this;
        }

        public Builder discoverServiceCharacteristicsRequestMessage(DiscoverServiceCharacteristicsRequestMessage discoverServiceCharacteristicsRequestMessage) {
            this.discoverServiceCharacteristicsRequestMessage = discoverServiceCharacteristicsRequestMessage;
            return this;
        }

        public Builder discoverServiceCharacteristicsResponseMessage(DiscoverServiceCharacteristicsResponseMessage discoverServiceCharacteristicsResponseMessage) {
            this.discoverServiceCharacteristicsResponseMessage = discoverServiceCharacteristicsResponseMessage;
            return this;
        }

        public Builder notifyStatusResponseMessage(NotifyStatusResponseMessage notifyStatusResponseMessage) {
            this.notifyStatusResponseMessage = notifyStatusResponseMessage;
            return this;
        }

        public Builder probeAdvertisingMessage(ProbeAdvertisingMessage probeAdvertisingMessage) {
            this.probeAdvertisingMessage = probeAdvertisingMessage;
            return this;
        }

        public Builder probeCharacteristicValueUpdatedMessage(ProbeCharacteristicValueUpdatedMessage probeCharacteristicValueUpdatedMessage) {
            this.probeCharacteristicValueUpdatedMessage = probeCharacteristicValueUpdatedMessage;
            return this;
        }

        public Builder probeCharacteristicValueWriteStatusMessage(ProbeCharacteristicValueWriteStatusMessage probeCharacteristicValueWriteStatusMessage) {
            this.probeCharacteristicValueWriteStatusMessage = probeCharacteristicValueWriteStatusMessage;
            return this;
        }

        public Builder probeConnectedMessage(ProbeConnectedMessage probeConnectedMessage) {
            this.probeConnectedMessage = probeConnectedMessage;
            return this;
        }

        public Builder probeConnectionRequestMessage(ProbeConnectionRequestMessage probeConnectionRequestMessage) {
            this.probeConnectionRequestMessage = probeConnectionRequestMessage;
            return this;
        }

        public Builder probeDisconnectedMessage(ProbeDisconnectedMessage probeDisconnectedMessage) {
            this.probeDisconnectedMessage = probeDisconnectedMessage;
            return this;
        }

        public Builder probeSimulatorHeader(ProbeSimulatorHeader probeSimulatorHeader) {
            this.probeSimulatorHeader = probeSimulatorHeader;
            return this;
        }

        public Builder readValueForCharacteristicRequestMessage(ReadValueForCharacteristicRequestMessage readValueForCharacteristicRequestMessage) {
            this.readValueForCharacteristicRequestMessage = readValueForCharacteristicRequestMessage;
            return this;
        }

        public Builder requestNofifyForCharacteristicMessage(RequestNofifyForCharacteristicMessage requestNofifyForCharacteristicMessage) {
            this.requestNofifyForCharacteristicMessage = requestNofifyForCharacteristicMessage;
            return this;
        }

        public Builder writeValueForCharacteristicRequestMessage(WriteValueForCharacteristicRequestMessage writeValueForCharacteristicRequestMessage) {
            this.writeValueForCharacteristicRequestMessage = writeValueForCharacteristicRequestMessage;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public SimulatedProbeMessage m366build() {
            return new SimulatedProbeMessage(this.probeSimulatorHeader, this.probeAdvertisingMessage, this.probeConnectionRequestMessage, this.probeConnectedMessage, this.probeDisconnectedMessage, this.discoverProbeServicesRequestMessage, this.discoverProbeServicesResponseMessage, this.discoverServiceCharacteristicsRequestMessage, this.discoverServiceCharacteristicsResponseMessage, this.readValueForCharacteristicRequestMessage, this.writeValueForCharacteristicRequestMessage, this.requestNofifyForCharacteristicMessage, this.notifyStatusResponseMessage, this.probeCharacteristicValueUpdatedMessage, this.probeCharacteristicValueWriteStatusMessage, buildUnknownFields());
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_SimulatedProbeMessage extends ProtoAdapter<SimulatedProbeMessage> {
        ProtoAdapter_SimulatedProbeMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, SimulatedProbeMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public SimulatedProbeMessage m367decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.probeSimulatorHeader((ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.probeAdvertisingMessage((ProbeAdvertisingMessage) ProbeAdvertisingMessage.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.probeConnectionRequestMessage((ProbeConnectionRequestMessage) ProbeConnectionRequestMessage.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.probeConnectedMessage((ProbeConnectedMessage) ProbeConnectedMessage.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.probeDisconnectedMessage((ProbeDisconnectedMessage) ProbeDisconnectedMessage.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.discoverProbeServicesRequestMessage((DiscoverProbeServicesRequestMessage) DiscoverProbeServicesRequestMessage.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            builder.discoverProbeServicesResponseMessage((DiscoverProbeServicesResponseMessage) DiscoverProbeServicesResponseMessage.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            builder.discoverServiceCharacteristicsRequestMessage((DiscoverServiceCharacteristicsRequestMessage) DiscoverServiceCharacteristicsRequestMessage.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            builder.discoverServiceCharacteristicsResponseMessage((DiscoverServiceCharacteristicsResponseMessage) DiscoverServiceCharacteristicsResponseMessage.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            builder.readValueForCharacteristicRequestMessage((ReadValueForCharacteristicRequestMessage) ReadValueForCharacteristicRequestMessage.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            builder.writeValueForCharacteristicRequestMessage((WriteValueForCharacteristicRequestMessage) WriteValueForCharacteristicRequestMessage.ADAPTER.decode(protoReader));
                            break;
                        case 12:
                            builder.requestNofifyForCharacteristicMessage((RequestNofifyForCharacteristicMessage) RequestNofifyForCharacteristicMessage.ADAPTER.decode(protoReader));
                            break;
                        case 13:
                            builder.notifyStatusResponseMessage((NotifyStatusResponseMessage) NotifyStatusResponseMessage.ADAPTER.decode(protoReader));
                            break;
                        case 14:
                            builder.probeCharacteristicValueUpdatedMessage((ProbeCharacteristicValueUpdatedMessage) ProbeCharacteristicValueUpdatedMessage.ADAPTER.decode(protoReader));
                            break;
                        case 15:
                            builder.probeCharacteristicValueWriteStatusMessage((ProbeCharacteristicValueWriteStatusMessage) ProbeCharacteristicValueWriteStatusMessage.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m366build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, SimulatedProbeMessage simulatedProbeMessage) {
            ProbeSimulatorHeader probeSimulatorHeader = simulatedProbeMessage.probeSimulatorHeader;
            if (probeSimulatorHeader != null) {
                ProbeSimulatorHeader.ADAPTER.encodeWithTag(protoWriter, 1, probeSimulatorHeader);
            }
            ProbeAdvertisingMessage probeAdvertisingMessage = simulatedProbeMessage.probeAdvertisingMessage;
            if (probeAdvertisingMessage != null) {
                ProbeAdvertisingMessage.ADAPTER.encodeWithTag(protoWriter, 2, probeAdvertisingMessage);
            }
            ProbeConnectionRequestMessage probeConnectionRequestMessage = simulatedProbeMessage.probeConnectionRequestMessage;
            if (probeConnectionRequestMessage != null) {
                ProbeConnectionRequestMessage.ADAPTER.encodeWithTag(protoWriter, 3, probeConnectionRequestMessage);
            }
            ProbeConnectedMessage probeConnectedMessage = simulatedProbeMessage.probeConnectedMessage;
            if (probeConnectedMessage != null) {
                ProbeConnectedMessage.ADAPTER.encodeWithTag(protoWriter, 4, probeConnectedMessage);
            }
            ProbeDisconnectedMessage probeDisconnectedMessage = simulatedProbeMessage.probeDisconnectedMessage;
            if (probeDisconnectedMessage != null) {
                ProbeDisconnectedMessage.ADAPTER.encodeWithTag(protoWriter, 5, probeDisconnectedMessage);
            }
            DiscoverProbeServicesRequestMessage discoverProbeServicesRequestMessage = simulatedProbeMessage.discoverProbeServicesRequestMessage;
            if (discoverProbeServicesRequestMessage != null) {
                DiscoverProbeServicesRequestMessage.ADAPTER.encodeWithTag(protoWriter, 6, discoverProbeServicesRequestMessage);
            }
            DiscoverProbeServicesResponseMessage discoverProbeServicesResponseMessage = simulatedProbeMessage.discoverProbeServicesResponseMessage;
            if (discoverProbeServicesResponseMessage != null) {
                DiscoverProbeServicesResponseMessage.ADAPTER.encodeWithTag(protoWriter, 7, discoverProbeServicesResponseMessage);
            }
            DiscoverServiceCharacteristicsRequestMessage discoverServiceCharacteristicsRequestMessage = simulatedProbeMessage.discoverServiceCharacteristicsRequestMessage;
            if (discoverServiceCharacteristicsRequestMessage != null) {
                DiscoverServiceCharacteristicsRequestMessage.ADAPTER.encodeWithTag(protoWriter, 8, discoverServiceCharacteristicsRequestMessage);
            }
            DiscoverServiceCharacteristicsResponseMessage discoverServiceCharacteristicsResponseMessage = simulatedProbeMessage.discoverServiceCharacteristicsResponseMessage;
            if (discoverServiceCharacteristicsResponseMessage != null) {
                DiscoverServiceCharacteristicsResponseMessage.ADAPTER.encodeWithTag(protoWriter, 9, discoverServiceCharacteristicsResponseMessage);
            }
            ReadValueForCharacteristicRequestMessage readValueForCharacteristicRequestMessage = simulatedProbeMessage.readValueForCharacteristicRequestMessage;
            if (readValueForCharacteristicRequestMessage != null) {
                ReadValueForCharacteristicRequestMessage.ADAPTER.encodeWithTag(protoWriter, 10, readValueForCharacteristicRequestMessage);
            }
            WriteValueForCharacteristicRequestMessage writeValueForCharacteristicRequestMessage = simulatedProbeMessage.writeValueForCharacteristicRequestMessage;
            if (writeValueForCharacteristicRequestMessage != null) {
                WriteValueForCharacteristicRequestMessage.ADAPTER.encodeWithTag(protoWriter, 11, writeValueForCharacteristicRequestMessage);
            }
            RequestNofifyForCharacteristicMessage requestNofifyForCharacteristicMessage = simulatedProbeMessage.requestNofifyForCharacteristicMessage;
            if (requestNofifyForCharacteristicMessage != null) {
                RequestNofifyForCharacteristicMessage.ADAPTER.encodeWithTag(protoWriter, 12, requestNofifyForCharacteristicMessage);
            }
            NotifyStatusResponseMessage notifyStatusResponseMessage = simulatedProbeMessage.notifyStatusResponseMessage;
            if (notifyStatusResponseMessage != null) {
                NotifyStatusResponseMessage.ADAPTER.encodeWithTag(protoWriter, 13, notifyStatusResponseMessage);
            }
            ProbeCharacteristicValueUpdatedMessage probeCharacteristicValueUpdatedMessage = simulatedProbeMessage.probeCharacteristicValueUpdatedMessage;
            if (probeCharacteristicValueUpdatedMessage != null) {
                ProbeCharacteristicValueUpdatedMessage.ADAPTER.encodeWithTag(protoWriter, 14, probeCharacteristicValueUpdatedMessage);
            }
            ProbeCharacteristicValueWriteStatusMessage probeCharacteristicValueWriteStatusMessage = simulatedProbeMessage.probeCharacteristicValueWriteStatusMessage;
            if (probeCharacteristicValueWriteStatusMessage != null) {
                ProbeCharacteristicValueWriteStatusMessage.ADAPTER.encodeWithTag(protoWriter, 15, probeCharacteristicValueWriteStatusMessage);
            }
            protoWriter.writeBytes(simulatedProbeMessage.unknownFields());
        }

        public int encodedSize(SimulatedProbeMessage simulatedProbeMessage) {
            ProbeSimulatorHeader probeSimulatorHeader = simulatedProbeMessage.probeSimulatorHeader;
            int encodedSizeWithTag = probeSimulatorHeader != null ? ProbeSimulatorHeader.ADAPTER.encodedSizeWithTag(1, probeSimulatorHeader) : 0;
            ProbeAdvertisingMessage probeAdvertisingMessage = simulatedProbeMessage.probeAdvertisingMessage;
            int encodedSizeWithTag2 = encodedSizeWithTag + (probeAdvertisingMessage != null ? ProbeAdvertisingMessage.ADAPTER.encodedSizeWithTag(2, probeAdvertisingMessage) : 0);
            ProbeConnectionRequestMessage probeConnectionRequestMessage = simulatedProbeMessage.probeConnectionRequestMessage;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + (probeConnectionRequestMessage != null ? ProbeConnectionRequestMessage.ADAPTER.encodedSizeWithTag(3, probeConnectionRequestMessage) : 0);
            ProbeConnectedMessage probeConnectedMessage = simulatedProbeMessage.probeConnectedMessage;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + (probeConnectedMessage != null ? ProbeConnectedMessage.ADAPTER.encodedSizeWithTag(4, probeConnectedMessage) : 0);
            ProbeDisconnectedMessage probeDisconnectedMessage = simulatedProbeMessage.probeDisconnectedMessage;
            int encodedSizeWithTag5 = encodedSizeWithTag4 + (probeDisconnectedMessage != null ? ProbeDisconnectedMessage.ADAPTER.encodedSizeWithTag(5, probeDisconnectedMessage) : 0);
            DiscoverProbeServicesRequestMessage discoverProbeServicesRequestMessage = simulatedProbeMessage.discoverProbeServicesRequestMessage;
            int encodedSizeWithTag6 = encodedSizeWithTag5 + (discoverProbeServicesRequestMessage != null ? DiscoverProbeServicesRequestMessage.ADAPTER.encodedSizeWithTag(6, discoverProbeServicesRequestMessage) : 0);
            DiscoverProbeServicesResponseMessage discoverProbeServicesResponseMessage = simulatedProbeMessage.discoverProbeServicesResponseMessage;
            int encodedSizeWithTag7 = encodedSizeWithTag6 + (discoverProbeServicesResponseMessage != null ? DiscoverProbeServicesResponseMessage.ADAPTER.encodedSizeWithTag(7, discoverProbeServicesResponseMessage) : 0);
            DiscoverServiceCharacteristicsRequestMessage discoverServiceCharacteristicsRequestMessage = simulatedProbeMessage.discoverServiceCharacteristicsRequestMessage;
            int encodedSizeWithTag8 = encodedSizeWithTag7 + (discoverServiceCharacteristicsRequestMessage != null ? DiscoverServiceCharacteristicsRequestMessage.ADAPTER.encodedSizeWithTag(8, discoverServiceCharacteristicsRequestMessage) : 0);
            DiscoverServiceCharacteristicsResponseMessage discoverServiceCharacteristicsResponseMessage = simulatedProbeMessage.discoverServiceCharacteristicsResponseMessage;
            int encodedSizeWithTag9 = encodedSizeWithTag8 + (discoverServiceCharacteristicsResponseMessage != null ? DiscoverServiceCharacteristicsResponseMessage.ADAPTER.encodedSizeWithTag(9, discoverServiceCharacteristicsResponseMessage) : 0);
            ReadValueForCharacteristicRequestMessage readValueForCharacteristicRequestMessage = simulatedProbeMessage.readValueForCharacteristicRequestMessage;
            int encodedSizeWithTag10 = encodedSizeWithTag9 + (readValueForCharacteristicRequestMessage != null ? ReadValueForCharacteristicRequestMessage.ADAPTER.encodedSizeWithTag(10, readValueForCharacteristicRequestMessage) : 0);
            WriteValueForCharacteristicRequestMessage writeValueForCharacteristicRequestMessage = simulatedProbeMessage.writeValueForCharacteristicRequestMessage;
            int encodedSizeWithTag11 = encodedSizeWithTag10 + (writeValueForCharacteristicRequestMessage != null ? WriteValueForCharacteristicRequestMessage.ADAPTER.encodedSizeWithTag(11, writeValueForCharacteristicRequestMessage) : 0);
            RequestNofifyForCharacteristicMessage requestNofifyForCharacteristicMessage = simulatedProbeMessage.requestNofifyForCharacteristicMessage;
            int encodedSizeWithTag12 = encodedSizeWithTag11 + (requestNofifyForCharacteristicMessage != null ? RequestNofifyForCharacteristicMessage.ADAPTER.encodedSizeWithTag(12, requestNofifyForCharacteristicMessage) : 0);
            NotifyStatusResponseMessage notifyStatusResponseMessage = simulatedProbeMessage.notifyStatusResponseMessage;
            int encodedSizeWithTag13 = encodedSizeWithTag12 + (notifyStatusResponseMessage != null ? NotifyStatusResponseMessage.ADAPTER.encodedSizeWithTag(13, notifyStatusResponseMessage) : 0);
            ProbeCharacteristicValueUpdatedMessage probeCharacteristicValueUpdatedMessage = simulatedProbeMessage.probeCharacteristicValueUpdatedMessage;
            int encodedSizeWithTag14 = encodedSizeWithTag13 + (probeCharacteristicValueUpdatedMessage != null ? ProbeCharacteristicValueUpdatedMessage.ADAPTER.encodedSizeWithTag(14, probeCharacteristicValueUpdatedMessage) : 0);
            ProbeCharacteristicValueWriteStatusMessage probeCharacteristicValueWriteStatusMessage = simulatedProbeMessage.probeCharacteristicValueWriteStatusMessage;
            return encodedSizeWithTag14 + (probeCharacteristicValueWriteStatusMessage != null ? ProbeCharacteristicValueWriteStatusMessage.ADAPTER.encodedSizeWithTag(15, probeCharacteristicValueWriteStatusMessage) : 0) + simulatedProbeMessage.unknownFields().I();
        }

        public SimulatedProbeMessage redact(SimulatedProbeMessage simulatedProbeMessage) {
            Builder m365newBuilder = simulatedProbeMessage.m365newBuilder();
            ProbeSimulatorHeader probeSimulatorHeader = m365newBuilder.probeSimulatorHeader;
            if (probeSimulatorHeader != null) {
                m365newBuilder.probeSimulatorHeader = (ProbeSimulatorHeader) ProbeSimulatorHeader.ADAPTER.redact(probeSimulatorHeader);
            }
            ProbeAdvertisingMessage probeAdvertisingMessage = m365newBuilder.probeAdvertisingMessage;
            if (probeAdvertisingMessage != null) {
                m365newBuilder.probeAdvertisingMessage = (ProbeAdvertisingMessage) ProbeAdvertisingMessage.ADAPTER.redact(probeAdvertisingMessage);
            }
            ProbeConnectionRequestMessage probeConnectionRequestMessage = m365newBuilder.probeConnectionRequestMessage;
            if (probeConnectionRequestMessage != null) {
                m365newBuilder.probeConnectionRequestMessage = (ProbeConnectionRequestMessage) ProbeConnectionRequestMessage.ADAPTER.redact(probeConnectionRequestMessage);
            }
            ProbeConnectedMessage probeConnectedMessage = m365newBuilder.probeConnectedMessage;
            if (probeConnectedMessage != null) {
                m365newBuilder.probeConnectedMessage = (ProbeConnectedMessage) ProbeConnectedMessage.ADAPTER.redact(probeConnectedMessage);
            }
            ProbeDisconnectedMessage probeDisconnectedMessage = m365newBuilder.probeDisconnectedMessage;
            if (probeDisconnectedMessage != null) {
                m365newBuilder.probeDisconnectedMessage = (ProbeDisconnectedMessage) ProbeDisconnectedMessage.ADAPTER.redact(probeDisconnectedMessage);
            }
            DiscoverProbeServicesRequestMessage discoverProbeServicesRequestMessage = m365newBuilder.discoverProbeServicesRequestMessage;
            if (discoverProbeServicesRequestMessage != null) {
                m365newBuilder.discoverProbeServicesRequestMessage = (DiscoverProbeServicesRequestMessage) DiscoverProbeServicesRequestMessage.ADAPTER.redact(discoverProbeServicesRequestMessage);
            }
            DiscoverProbeServicesResponseMessage discoverProbeServicesResponseMessage = m365newBuilder.discoverProbeServicesResponseMessage;
            if (discoverProbeServicesResponseMessage != null) {
                m365newBuilder.discoverProbeServicesResponseMessage = (DiscoverProbeServicesResponseMessage) DiscoverProbeServicesResponseMessage.ADAPTER.redact(discoverProbeServicesResponseMessage);
            }
            DiscoverServiceCharacteristicsRequestMessage discoverServiceCharacteristicsRequestMessage = m365newBuilder.discoverServiceCharacteristicsRequestMessage;
            if (discoverServiceCharacteristicsRequestMessage != null) {
                m365newBuilder.discoverServiceCharacteristicsRequestMessage = (DiscoverServiceCharacteristicsRequestMessage) DiscoverServiceCharacteristicsRequestMessage.ADAPTER.redact(discoverServiceCharacteristicsRequestMessage);
            }
            DiscoverServiceCharacteristicsResponseMessage discoverServiceCharacteristicsResponseMessage = m365newBuilder.discoverServiceCharacteristicsResponseMessage;
            if (discoverServiceCharacteristicsResponseMessage != null) {
                m365newBuilder.discoverServiceCharacteristicsResponseMessage = (DiscoverServiceCharacteristicsResponseMessage) DiscoverServiceCharacteristicsResponseMessage.ADAPTER.redact(discoverServiceCharacteristicsResponseMessage);
            }
            ReadValueForCharacteristicRequestMessage readValueForCharacteristicRequestMessage = m365newBuilder.readValueForCharacteristicRequestMessage;
            if (readValueForCharacteristicRequestMessage != null) {
                m365newBuilder.readValueForCharacteristicRequestMessage = (ReadValueForCharacteristicRequestMessage) ReadValueForCharacteristicRequestMessage.ADAPTER.redact(readValueForCharacteristicRequestMessage);
            }
            WriteValueForCharacteristicRequestMessage writeValueForCharacteristicRequestMessage = m365newBuilder.writeValueForCharacteristicRequestMessage;
            if (writeValueForCharacteristicRequestMessage != null) {
                m365newBuilder.writeValueForCharacteristicRequestMessage = (WriteValueForCharacteristicRequestMessage) WriteValueForCharacteristicRequestMessage.ADAPTER.redact(writeValueForCharacteristicRequestMessage);
            }
            RequestNofifyForCharacteristicMessage requestNofifyForCharacteristicMessage = m365newBuilder.requestNofifyForCharacteristicMessage;
            if (requestNofifyForCharacteristicMessage != null) {
                m365newBuilder.requestNofifyForCharacteristicMessage = (RequestNofifyForCharacteristicMessage) RequestNofifyForCharacteristicMessage.ADAPTER.redact(requestNofifyForCharacteristicMessage);
            }
            NotifyStatusResponseMessage notifyStatusResponseMessage = m365newBuilder.notifyStatusResponseMessage;
            if (notifyStatusResponseMessage != null) {
                m365newBuilder.notifyStatusResponseMessage = (NotifyStatusResponseMessage) NotifyStatusResponseMessage.ADAPTER.redact(notifyStatusResponseMessage);
            }
            ProbeCharacteristicValueUpdatedMessage probeCharacteristicValueUpdatedMessage = m365newBuilder.probeCharacteristicValueUpdatedMessage;
            if (probeCharacteristicValueUpdatedMessage != null) {
                m365newBuilder.probeCharacteristicValueUpdatedMessage = (ProbeCharacteristicValueUpdatedMessage) ProbeCharacteristicValueUpdatedMessage.ADAPTER.redact(probeCharacteristicValueUpdatedMessage);
            }
            ProbeCharacteristicValueWriteStatusMessage probeCharacteristicValueWriteStatusMessage = m365newBuilder.probeCharacteristicValueWriteStatusMessage;
            if (probeCharacteristicValueWriteStatusMessage != null) {
                m365newBuilder.probeCharacteristicValueWriteStatusMessage = (ProbeCharacteristicValueWriteStatusMessage) ProbeCharacteristicValueWriteStatusMessage.ADAPTER.redact(probeCharacteristicValueWriteStatusMessage);
            }
            m365newBuilder.clearUnknownFields();
            return m365newBuilder.m366build();
        }
    }

    public SimulatedProbeMessage(ProbeSimulatorHeader probeSimulatorHeader, ProbeAdvertisingMessage probeAdvertisingMessage, ProbeConnectionRequestMessage probeConnectionRequestMessage, ProbeConnectedMessage probeConnectedMessage, ProbeDisconnectedMessage probeDisconnectedMessage, DiscoverProbeServicesRequestMessage discoverProbeServicesRequestMessage, DiscoverProbeServicesResponseMessage discoverProbeServicesResponseMessage, DiscoverServiceCharacteristicsRequestMessage discoverServiceCharacteristicsRequestMessage, DiscoverServiceCharacteristicsResponseMessage discoverServiceCharacteristicsResponseMessage, ReadValueForCharacteristicRequestMessage readValueForCharacteristicRequestMessage, WriteValueForCharacteristicRequestMessage writeValueForCharacteristicRequestMessage, RequestNofifyForCharacteristicMessage requestNofifyForCharacteristicMessage, NotifyStatusResponseMessage notifyStatusResponseMessage, ProbeCharacteristicValueUpdatedMessage probeCharacteristicValueUpdatedMessage, ProbeCharacteristicValueWriteStatusMessage probeCharacteristicValueWriteStatusMessage) {
        this(probeSimulatorHeader, probeAdvertisingMessage, probeConnectionRequestMessage, probeConnectedMessage, probeDisconnectedMessage, discoverProbeServicesRequestMessage, discoverProbeServicesResponseMessage, discoverServiceCharacteristicsRequestMessage, discoverServiceCharacteristicsResponseMessage, readValueForCharacteristicRequestMessage, writeValueForCharacteristicRequestMessage, requestNofifyForCharacteristicMessage, notifyStatusResponseMessage, probeCharacteristicValueUpdatedMessage, probeCharacteristicValueWriteStatusMessage, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SimulatedProbeMessage)) {
            return false;
        }
        SimulatedProbeMessage simulatedProbeMessage = (SimulatedProbeMessage) obj;
        if (Internal.equals(unknownFields(), simulatedProbeMessage.unknownFields()) && Internal.equals(this.probeSimulatorHeader, simulatedProbeMessage.probeSimulatorHeader) && Internal.equals(this.probeAdvertisingMessage, simulatedProbeMessage.probeAdvertisingMessage) && Internal.equals(this.probeConnectionRequestMessage, simulatedProbeMessage.probeConnectionRequestMessage) && Internal.equals(this.probeConnectedMessage, simulatedProbeMessage.probeConnectedMessage) && Internal.equals(this.probeDisconnectedMessage, simulatedProbeMessage.probeDisconnectedMessage) && Internal.equals(this.discoverProbeServicesRequestMessage, simulatedProbeMessage.discoverProbeServicesRequestMessage) && Internal.equals(this.discoverProbeServicesResponseMessage, simulatedProbeMessage.discoverProbeServicesResponseMessage) && Internal.equals(this.discoverServiceCharacteristicsRequestMessage, simulatedProbeMessage.discoverServiceCharacteristicsRequestMessage) && Internal.equals(this.discoverServiceCharacteristicsResponseMessage, simulatedProbeMessage.discoverServiceCharacteristicsResponseMessage) && Internal.equals(this.readValueForCharacteristicRequestMessage, simulatedProbeMessage.readValueForCharacteristicRequestMessage) && Internal.equals(this.writeValueForCharacteristicRequestMessage, simulatedProbeMessage.writeValueForCharacteristicRequestMessage) && Internal.equals(this.requestNofifyForCharacteristicMessage, simulatedProbeMessage.requestNofifyForCharacteristicMessage) && Internal.equals(this.notifyStatusResponseMessage, simulatedProbeMessage.notifyStatusResponseMessage) && Internal.equals(this.probeCharacteristicValueUpdatedMessage, simulatedProbeMessage.probeCharacteristicValueUpdatedMessage) && Internal.equals(this.probeCharacteristicValueWriteStatusMessage, simulatedProbeMessage.probeCharacteristicValueWriteStatusMessage)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = ((Message) this).hashCode;
        if (i24 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            ProbeSimulatorHeader probeSimulatorHeader = this.probeSimulatorHeader;
            int i25 = 0;
            if (probeSimulatorHeader != null) {
                i10 = probeSimulatorHeader.hashCode();
            } else {
                i10 = 0;
            }
            int i26 = (hashCode + i10) * 37;
            ProbeAdvertisingMessage probeAdvertisingMessage = this.probeAdvertisingMessage;
            if (probeAdvertisingMessage != null) {
                i11 = probeAdvertisingMessage.hashCode();
            } else {
                i11 = 0;
            }
            int i27 = (i26 + i11) * 37;
            ProbeConnectionRequestMessage probeConnectionRequestMessage = this.probeConnectionRequestMessage;
            if (probeConnectionRequestMessage != null) {
                i12 = probeConnectionRequestMessage.hashCode();
            } else {
                i12 = 0;
            }
            int i28 = (i27 + i12) * 37;
            ProbeConnectedMessage probeConnectedMessage = this.probeConnectedMessage;
            if (probeConnectedMessage != null) {
                i13 = probeConnectedMessage.hashCode();
            } else {
                i13 = 0;
            }
            int i29 = (i28 + i13) * 37;
            ProbeDisconnectedMessage probeDisconnectedMessage = this.probeDisconnectedMessage;
            if (probeDisconnectedMessage != null) {
                i14 = probeDisconnectedMessage.hashCode();
            } else {
                i14 = 0;
            }
            int i30 = (i29 + i14) * 37;
            DiscoverProbeServicesRequestMessage discoverProbeServicesRequestMessage = this.discoverProbeServicesRequestMessage;
            if (discoverProbeServicesRequestMessage != null) {
                i15 = discoverProbeServicesRequestMessage.hashCode();
            } else {
                i15 = 0;
            }
            int i31 = (i30 + i15) * 37;
            DiscoverProbeServicesResponseMessage discoverProbeServicesResponseMessage = this.discoverProbeServicesResponseMessage;
            if (discoverProbeServicesResponseMessage != null) {
                i16 = discoverProbeServicesResponseMessage.hashCode();
            } else {
                i16 = 0;
            }
            int i32 = (i31 + i16) * 37;
            DiscoverServiceCharacteristicsRequestMessage discoverServiceCharacteristicsRequestMessage = this.discoverServiceCharacteristicsRequestMessage;
            if (discoverServiceCharacteristicsRequestMessage != null) {
                i17 = discoverServiceCharacteristicsRequestMessage.hashCode();
            } else {
                i17 = 0;
            }
            int i33 = (i32 + i17) * 37;
            DiscoverServiceCharacteristicsResponseMessage discoverServiceCharacteristicsResponseMessage = this.discoverServiceCharacteristicsResponseMessage;
            if (discoverServiceCharacteristicsResponseMessage != null) {
                i18 = discoverServiceCharacteristicsResponseMessage.hashCode();
            } else {
                i18 = 0;
            }
            int i34 = (i33 + i18) * 37;
            ReadValueForCharacteristicRequestMessage readValueForCharacteristicRequestMessage = this.readValueForCharacteristicRequestMessage;
            if (readValueForCharacteristicRequestMessage != null) {
                i19 = readValueForCharacteristicRequestMessage.hashCode();
            } else {
                i19 = 0;
            }
            int i35 = (i34 + i19) * 37;
            WriteValueForCharacteristicRequestMessage writeValueForCharacteristicRequestMessage = this.writeValueForCharacteristicRequestMessage;
            if (writeValueForCharacteristicRequestMessage != null) {
                i20 = writeValueForCharacteristicRequestMessage.hashCode();
            } else {
                i20 = 0;
            }
            int i36 = (i35 + i20) * 37;
            RequestNofifyForCharacteristicMessage requestNofifyForCharacteristicMessage = this.requestNofifyForCharacteristicMessage;
            if (requestNofifyForCharacteristicMessage != null) {
                i21 = requestNofifyForCharacteristicMessage.hashCode();
            } else {
                i21 = 0;
            }
            int i37 = (i36 + i21) * 37;
            NotifyStatusResponseMessage notifyStatusResponseMessage = this.notifyStatusResponseMessage;
            if (notifyStatusResponseMessage != null) {
                i22 = notifyStatusResponseMessage.hashCode();
            } else {
                i22 = 0;
            }
            int i38 = (i37 + i22) * 37;
            ProbeCharacteristicValueUpdatedMessage probeCharacteristicValueUpdatedMessage = this.probeCharacteristicValueUpdatedMessage;
            if (probeCharacteristicValueUpdatedMessage != null) {
                i23 = probeCharacteristicValueUpdatedMessage.hashCode();
            } else {
                i23 = 0;
            }
            int i39 = (i38 + i23) * 37;
            ProbeCharacteristicValueWriteStatusMessage probeCharacteristicValueWriteStatusMessage = this.probeCharacteristicValueWriteStatusMessage;
            if (probeCharacteristicValueWriteStatusMessage != null) {
                i25 = probeCharacteristicValueWriteStatusMessage.hashCode();
            }
            int i40 = i39 + i25;
            ((Message) this).hashCode = i40;
            return i40;
        }
        return i24;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.probeSimulatorHeader != null) {
            sb.append(", probeSimulatorHeader=");
            sb.append(this.probeSimulatorHeader);
        }
        if (this.probeAdvertisingMessage != null) {
            sb.append(", probeAdvertisingMessage=");
            sb.append(this.probeAdvertisingMessage);
        }
        if (this.probeConnectionRequestMessage != null) {
            sb.append(", probeConnectionRequestMessage=");
            sb.append(this.probeConnectionRequestMessage);
        }
        if (this.probeConnectedMessage != null) {
            sb.append(", probeConnectedMessage=");
            sb.append(this.probeConnectedMessage);
        }
        if (this.probeDisconnectedMessage != null) {
            sb.append(", probeDisconnectedMessage=");
            sb.append(this.probeDisconnectedMessage);
        }
        if (this.discoverProbeServicesRequestMessage != null) {
            sb.append(", discoverProbeServicesRequestMessage=");
            sb.append(this.discoverProbeServicesRequestMessage);
        }
        if (this.discoverProbeServicesResponseMessage != null) {
            sb.append(", discoverProbeServicesResponseMessage=");
            sb.append(this.discoverProbeServicesResponseMessage);
        }
        if (this.discoverServiceCharacteristicsRequestMessage != null) {
            sb.append(", discoverServiceCharacteristicsRequestMessage=");
            sb.append(this.discoverServiceCharacteristicsRequestMessage);
        }
        if (this.discoverServiceCharacteristicsResponseMessage != null) {
            sb.append(", discoverServiceCharacteristicsResponseMessage=");
            sb.append(this.discoverServiceCharacteristicsResponseMessage);
        }
        if (this.readValueForCharacteristicRequestMessage != null) {
            sb.append(", readValueForCharacteristicRequestMessage=");
            sb.append(this.readValueForCharacteristicRequestMessage);
        }
        if (this.writeValueForCharacteristicRequestMessage != null) {
            sb.append(", writeValueForCharacteristicRequestMessage=");
            sb.append(this.writeValueForCharacteristicRequestMessage);
        }
        if (this.requestNofifyForCharacteristicMessage != null) {
            sb.append(", requestNofifyForCharacteristicMessage=");
            sb.append(this.requestNofifyForCharacteristicMessage);
        }
        if (this.notifyStatusResponseMessage != null) {
            sb.append(", notifyStatusResponseMessage=");
            sb.append(this.notifyStatusResponseMessage);
        }
        if (this.probeCharacteristicValueUpdatedMessage != null) {
            sb.append(", probeCharacteristicValueUpdatedMessage=");
            sb.append(this.probeCharacteristicValueUpdatedMessage);
        }
        if (this.probeCharacteristicValueWriteStatusMessage != null) {
            sb.append(", probeCharacteristicValueWriteStatusMessage=");
            sb.append(this.probeCharacteristicValueWriteStatusMessage);
        }
        StringBuilder replace = sb.replace(0, 2, "SimulatedProbeMessage{");
        replace.append('}');
        return replace.toString();
    }

    public SimulatedProbeMessage(ProbeSimulatorHeader probeSimulatorHeader, ProbeAdvertisingMessage probeAdvertisingMessage, ProbeConnectionRequestMessage probeConnectionRequestMessage, ProbeConnectedMessage probeConnectedMessage, ProbeDisconnectedMessage probeDisconnectedMessage, DiscoverProbeServicesRequestMessage discoverProbeServicesRequestMessage, DiscoverProbeServicesResponseMessage discoverProbeServicesResponseMessage, DiscoverServiceCharacteristicsRequestMessage discoverServiceCharacteristicsRequestMessage, DiscoverServiceCharacteristicsResponseMessage discoverServiceCharacteristicsResponseMessage, ReadValueForCharacteristicRequestMessage readValueForCharacteristicRequestMessage, WriteValueForCharacteristicRequestMessage writeValueForCharacteristicRequestMessage, RequestNofifyForCharacteristicMessage requestNofifyForCharacteristicMessage, NotifyStatusResponseMessage notifyStatusResponseMessage, ProbeCharacteristicValueUpdatedMessage probeCharacteristicValueUpdatedMessage, ProbeCharacteristicValueWriteStatusMessage probeCharacteristicValueWriteStatusMessage, h hVar) {
        super(ADAPTER, hVar);
        this.probeSimulatorHeader = probeSimulatorHeader;
        this.probeAdvertisingMessage = probeAdvertisingMessage;
        this.probeConnectionRequestMessage = probeConnectionRequestMessage;
        this.probeConnectedMessage = probeConnectedMessage;
        this.probeDisconnectedMessage = probeDisconnectedMessage;
        this.discoverProbeServicesRequestMessage = discoverProbeServicesRequestMessage;
        this.discoverProbeServicesResponseMessage = discoverProbeServicesResponseMessage;
        this.discoverServiceCharacteristicsRequestMessage = discoverServiceCharacteristicsRequestMessage;
        this.discoverServiceCharacteristicsResponseMessage = discoverServiceCharacteristicsResponseMessage;
        this.readValueForCharacteristicRequestMessage = readValueForCharacteristicRequestMessage;
        this.writeValueForCharacteristicRequestMessage = writeValueForCharacteristicRequestMessage;
        this.requestNofifyForCharacteristicMessage = requestNofifyForCharacteristicMessage;
        this.notifyStatusResponseMessage = notifyStatusResponseMessage;
        this.probeCharacteristicValueUpdatedMessage = probeCharacteristicValueUpdatedMessage;
        this.probeCharacteristicValueWriteStatusMessage = probeCharacteristicValueWriteStatusMessage;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m365newBuilder() {
        Builder builder = new Builder();
        builder.probeSimulatorHeader = this.probeSimulatorHeader;
        builder.probeAdvertisingMessage = this.probeAdvertisingMessage;
        builder.probeConnectionRequestMessage = this.probeConnectionRequestMessage;
        builder.probeConnectedMessage = this.probeConnectedMessage;
        builder.probeDisconnectedMessage = this.probeDisconnectedMessage;
        builder.discoverProbeServicesRequestMessage = this.discoverProbeServicesRequestMessage;
        builder.discoverProbeServicesResponseMessage = this.discoverProbeServicesResponseMessage;
        builder.discoverServiceCharacteristicsRequestMessage = this.discoverServiceCharacteristicsRequestMessage;
        builder.discoverServiceCharacteristicsResponseMessage = this.discoverServiceCharacteristicsResponseMessage;
        builder.readValueForCharacteristicRequestMessage = this.readValueForCharacteristicRequestMessage;
        builder.writeValueForCharacteristicRequestMessage = this.writeValueForCharacteristicRequestMessage;
        builder.requestNofifyForCharacteristicMessage = this.requestNofifyForCharacteristicMessage;
        builder.notifyStatusResponseMessage = this.notifyStatusResponseMessage;
        builder.probeCharacteristicValueUpdatedMessage = this.probeCharacteristicValueUpdatedMessage;
        builder.probeCharacteristicValueWriteStatusMessage = this.probeCharacteristicValueWriteStatusMessage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
