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
public final class MeaterLinkMessage extends Message<MeaterLinkMessage, Builder> {
    public static final ProtoAdapter<MeaterLinkMessage> ADAPTER = new ProtoAdapter_MeaterLinkMessage();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.BlockFirmwareUpdateMessage#ADAPTER", tag = 7)
    public final BlockFirmwareUpdateMessage blockFirmwareUpdateMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MeaterLinkHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final MeaterLinkHeader header;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MasterMessage#ADAPTER", tag = 3)
    public final MasterMessage masterMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MasterStatusMessage#ADAPTER", tag = 11)
    public final MasterStatusMessage masterStatusMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MasterStatusRequestMessage#ADAPTER", tag = 10)
    public final MasterStatusRequestMessage masterStatusRequestMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.NetworkSettingsMessage#ADAPTER", tag = 9)
    public final NetworkSettingsMessage networkSettingsMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.NetworkSettingsRequestMessage#ADAPTER", tag = 8)
    public final NetworkSettingsRequestMessage networkSettingsRequestMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.OngoingRecipeDiscoveryMessage#ADAPTER", tag = 12)
    public final OngoingRecipeDiscoveryMessage ongoingRecipeDiscoveryMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.OngoingRecipeMessage#ADAPTER", tag = 14)
    public final OngoingRecipeMessage ongoingRecipeMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.OngoingRecipeSubscriptionMessage#ADAPTER", tag = 13)
    public final OngoingRecipeSubscriptionMessage ongoingRecipeSubscriptionMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.PingPongMessage#ADAPTER", tag = 15)
    public final PingPongMessage pingPongMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.SetupMessage#ADAPTER", tag = 4)
    public final SetupMessage setupMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.SubscriptionMessage#ADAPTER", tag = 2)
    public final SubscriptionMessage subscriptionMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.TemperatureHistoryMessage#ADAPTER", tag = 6)
    public final TemperatureHistoryMessage temperatureHistoryMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.TemperatureHistoryRequestMessage#ADAPTER", tag = 5)
    public final TemperatureHistoryRequestMessage temperatureHistoryRequestMessage;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MeaterLinkMessage, Builder> {
        public BlockFirmwareUpdateMessage blockFirmwareUpdateMessage;
        public MeaterLinkHeader header;
        public MasterMessage masterMessage;
        public MasterStatusMessage masterStatusMessage;
        public MasterStatusRequestMessage masterStatusRequestMessage;
        public NetworkSettingsMessage networkSettingsMessage;
        public NetworkSettingsRequestMessage networkSettingsRequestMessage;
        public OngoingRecipeDiscoveryMessage ongoingRecipeDiscoveryMessage;
        public OngoingRecipeMessage ongoingRecipeMessage;
        public OngoingRecipeSubscriptionMessage ongoingRecipeSubscriptionMessage;
        public PingPongMessage pingPongMessage;
        public SetupMessage setupMessage;
        public SubscriptionMessage subscriptionMessage;
        public TemperatureHistoryMessage temperatureHistoryMessage;
        public TemperatureHistoryRequestMessage temperatureHistoryRequestMessage;

        public Builder blockFirmwareUpdateMessage(BlockFirmwareUpdateMessage blockFirmwareUpdateMessage) {
            this.blockFirmwareUpdateMessage = blockFirmwareUpdateMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            this.ongoingRecipeDiscoveryMessage = null;
            this.ongoingRecipeSubscriptionMessage = null;
            this.ongoingRecipeMessage = null;
            this.pingPongMessage = null;
            return this;
        }

        public Builder header(MeaterLinkHeader meaterLinkHeader) {
            this.header = meaterLinkHeader;
            return this;
        }

        public Builder masterMessage(MasterMessage masterMessage) {
            this.masterMessage = masterMessage;
            this.subscriptionMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            this.ongoingRecipeDiscoveryMessage = null;
            this.ongoingRecipeSubscriptionMessage = null;
            this.ongoingRecipeMessage = null;
            this.pingPongMessage = null;
            return this;
        }

        public Builder masterStatusMessage(MasterStatusMessage masterStatusMessage) {
            this.masterStatusMessage = masterStatusMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            this.ongoingRecipeDiscoveryMessage = null;
            this.ongoingRecipeSubscriptionMessage = null;
            this.ongoingRecipeMessage = null;
            this.pingPongMessage = null;
            return this;
        }

        public Builder masterStatusRequestMessage(MasterStatusRequestMessage masterStatusRequestMessage) {
            this.masterStatusRequestMessage = masterStatusRequestMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusMessage = null;
            this.ongoingRecipeDiscoveryMessage = null;
            this.ongoingRecipeSubscriptionMessage = null;
            this.ongoingRecipeMessage = null;
            this.pingPongMessage = null;
            return this;
        }

        public Builder networkSettingsMessage(NetworkSettingsMessage networkSettingsMessage) {
            this.networkSettingsMessage = networkSettingsMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.networkSettingsRequestMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            this.ongoingRecipeDiscoveryMessage = null;
            this.ongoingRecipeSubscriptionMessage = null;
            this.ongoingRecipeMessage = null;
            this.pingPongMessage = null;
            return this;
        }

        public Builder networkSettingsRequestMessage(NetworkSettingsRequestMessage networkSettingsRequestMessage) {
            this.networkSettingsRequestMessage = networkSettingsRequestMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            this.ongoingRecipeDiscoveryMessage = null;
            this.ongoingRecipeSubscriptionMessage = null;
            this.ongoingRecipeMessage = null;
            this.pingPongMessage = null;
            return this;
        }

        public Builder ongoingRecipeDiscoveryMessage(OngoingRecipeDiscoveryMessage ongoingRecipeDiscoveryMessage) {
            this.ongoingRecipeDiscoveryMessage = ongoingRecipeDiscoveryMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            this.ongoingRecipeSubscriptionMessage = null;
            this.ongoingRecipeMessage = null;
            this.pingPongMessage = null;
            return this;
        }

        public Builder ongoingRecipeMessage(OngoingRecipeMessage ongoingRecipeMessage) {
            this.ongoingRecipeMessage = ongoingRecipeMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            this.ongoingRecipeDiscoveryMessage = null;
            this.ongoingRecipeSubscriptionMessage = null;
            this.pingPongMessage = null;
            return this;
        }

        public Builder ongoingRecipeSubscriptionMessage(OngoingRecipeSubscriptionMessage ongoingRecipeSubscriptionMessage) {
            this.ongoingRecipeSubscriptionMessage = ongoingRecipeSubscriptionMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            this.ongoingRecipeDiscoveryMessage = null;
            this.ongoingRecipeMessage = null;
            this.pingPongMessage = null;
            return this;
        }

        public Builder pingPongMessage(PingPongMessage pingPongMessage) {
            this.pingPongMessage = pingPongMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            this.ongoingRecipeDiscoveryMessage = null;
            this.ongoingRecipeSubscriptionMessage = null;
            this.ongoingRecipeMessage = null;
            return this;
        }

        public Builder setupMessage(SetupMessage setupMessage) {
            this.setupMessage = setupMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            this.ongoingRecipeDiscoveryMessage = null;
            this.ongoingRecipeSubscriptionMessage = null;
            this.ongoingRecipeMessage = null;
            this.pingPongMessage = null;
            return this;
        }

        public Builder subscriptionMessage(SubscriptionMessage subscriptionMessage) {
            this.subscriptionMessage = subscriptionMessage;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            this.ongoingRecipeDiscoveryMessage = null;
            this.ongoingRecipeSubscriptionMessage = null;
            this.ongoingRecipeMessage = null;
            this.pingPongMessage = null;
            return this;
        }

        public Builder temperatureHistoryMessage(TemperatureHistoryMessage temperatureHistoryMessage) {
            this.temperatureHistoryMessage = temperatureHistoryMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            this.ongoingRecipeDiscoveryMessage = null;
            this.ongoingRecipeSubscriptionMessage = null;
            this.ongoingRecipeMessage = null;
            this.pingPongMessage = null;
            return this;
        }

        public Builder temperatureHistoryRequestMessage(TemperatureHistoryRequestMessage temperatureHistoryRequestMessage) {
            this.temperatureHistoryRequestMessage = temperatureHistoryRequestMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            this.ongoingRecipeDiscoveryMessage = null;
            this.ongoingRecipeSubscriptionMessage = null;
            this.ongoingRecipeMessage = null;
            this.pingPongMessage = null;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MeaterLinkMessage m285build() {
            MeaterLinkHeader meaterLinkHeader = this.header;
            if (meaterLinkHeader != null) {
                return new MeaterLinkMessage(this.header, this.subscriptionMessage, this.masterMessage, this.setupMessage, this.temperatureHistoryRequestMessage, this.temperatureHistoryMessage, this.blockFirmwareUpdateMessage, this.networkSettingsRequestMessage, this.networkSettingsMessage, this.masterStatusRequestMessage, this.masterStatusMessage, this.ongoingRecipeDiscoveryMessage, this.ongoingRecipeSubscriptionMessage, this.ongoingRecipeMessage, this.pingPongMessage, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{meaterLinkHeader, "header"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MeaterLinkMessage extends ProtoAdapter<MeaterLinkMessage> {
        ProtoAdapter_MeaterLinkMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, MeaterLinkMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MeaterLinkMessage m286decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.header((MeaterLinkHeader) MeaterLinkHeader.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.subscriptionMessage((SubscriptionMessage) SubscriptionMessage.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.masterMessage((MasterMessage) MasterMessage.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.setupMessage((SetupMessage) SetupMessage.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.temperatureHistoryRequestMessage((TemperatureHistoryRequestMessage) TemperatureHistoryRequestMessage.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.temperatureHistoryMessage((TemperatureHistoryMessage) TemperatureHistoryMessage.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            builder.blockFirmwareUpdateMessage((BlockFirmwareUpdateMessage) BlockFirmwareUpdateMessage.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            builder.networkSettingsRequestMessage((NetworkSettingsRequestMessage) NetworkSettingsRequestMessage.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            builder.networkSettingsMessage((NetworkSettingsMessage) NetworkSettingsMessage.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            builder.masterStatusRequestMessage((MasterStatusRequestMessage) MasterStatusRequestMessage.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            builder.masterStatusMessage((MasterStatusMessage) MasterStatusMessage.ADAPTER.decode(protoReader));
                            break;
                        case 12:
                            builder.ongoingRecipeDiscoveryMessage((OngoingRecipeDiscoveryMessage) OngoingRecipeDiscoveryMessage.ADAPTER.decode(protoReader));
                            break;
                        case 13:
                            builder.ongoingRecipeSubscriptionMessage((OngoingRecipeSubscriptionMessage) OngoingRecipeSubscriptionMessage.ADAPTER.decode(protoReader));
                            break;
                        case 14:
                            builder.ongoingRecipeMessage((OngoingRecipeMessage) OngoingRecipeMessage.ADAPTER.decode(protoReader));
                            break;
                        case 15:
                            builder.pingPongMessage((PingPongMessage) PingPongMessage.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m285build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MeaterLinkMessage meaterLinkMessage) {
            MeaterLinkHeader.ADAPTER.encodeWithTag(protoWriter, 1, meaterLinkMessage.header);
            SubscriptionMessage subscriptionMessage = meaterLinkMessage.subscriptionMessage;
            if (subscriptionMessage != null) {
                SubscriptionMessage.ADAPTER.encodeWithTag(protoWriter, 2, subscriptionMessage);
            }
            MasterMessage masterMessage = meaterLinkMessage.masterMessage;
            if (masterMessage != null) {
                MasterMessage.ADAPTER.encodeWithTag(protoWriter, 3, masterMessage);
            }
            SetupMessage setupMessage = meaterLinkMessage.setupMessage;
            if (setupMessage != null) {
                SetupMessage.ADAPTER.encodeWithTag(protoWriter, 4, setupMessage);
            }
            TemperatureHistoryRequestMessage temperatureHistoryRequestMessage = meaterLinkMessage.temperatureHistoryRequestMessage;
            if (temperatureHistoryRequestMessage != null) {
                TemperatureHistoryRequestMessage.ADAPTER.encodeWithTag(protoWriter, 5, temperatureHistoryRequestMessage);
            }
            TemperatureHistoryMessage temperatureHistoryMessage = meaterLinkMessage.temperatureHistoryMessage;
            if (temperatureHistoryMessage != null) {
                TemperatureHistoryMessage.ADAPTER.encodeWithTag(protoWriter, 6, temperatureHistoryMessage);
            }
            BlockFirmwareUpdateMessage blockFirmwareUpdateMessage = meaterLinkMessage.blockFirmwareUpdateMessage;
            if (blockFirmwareUpdateMessage != null) {
                BlockFirmwareUpdateMessage.ADAPTER.encodeWithTag(protoWriter, 7, blockFirmwareUpdateMessage);
            }
            NetworkSettingsRequestMessage networkSettingsRequestMessage = meaterLinkMessage.networkSettingsRequestMessage;
            if (networkSettingsRequestMessage != null) {
                NetworkSettingsRequestMessage.ADAPTER.encodeWithTag(protoWriter, 8, networkSettingsRequestMessage);
            }
            NetworkSettingsMessage networkSettingsMessage = meaterLinkMessage.networkSettingsMessage;
            if (networkSettingsMessage != null) {
                NetworkSettingsMessage.ADAPTER.encodeWithTag(protoWriter, 9, networkSettingsMessage);
            }
            MasterStatusRequestMessage masterStatusRequestMessage = meaterLinkMessage.masterStatusRequestMessage;
            if (masterStatusRequestMessage != null) {
                MasterStatusRequestMessage.ADAPTER.encodeWithTag(protoWriter, 10, masterStatusRequestMessage);
            }
            MasterStatusMessage masterStatusMessage = meaterLinkMessage.masterStatusMessage;
            if (masterStatusMessage != null) {
                MasterStatusMessage.ADAPTER.encodeWithTag(protoWriter, 11, masterStatusMessage);
            }
            OngoingRecipeDiscoveryMessage ongoingRecipeDiscoveryMessage = meaterLinkMessage.ongoingRecipeDiscoveryMessage;
            if (ongoingRecipeDiscoveryMessage != null) {
                OngoingRecipeDiscoveryMessage.ADAPTER.encodeWithTag(protoWriter, 12, ongoingRecipeDiscoveryMessage);
            }
            OngoingRecipeSubscriptionMessage ongoingRecipeSubscriptionMessage = meaterLinkMessage.ongoingRecipeSubscriptionMessage;
            if (ongoingRecipeSubscriptionMessage != null) {
                OngoingRecipeSubscriptionMessage.ADAPTER.encodeWithTag(protoWriter, 13, ongoingRecipeSubscriptionMessage);
            }
            OngoingRecipeMessage ongoingRecipeMessage = meaterLinkMessage.ongoingRecipeMessage;
            if (ongoingRecipeMessage != null) {
                OngoingRecipeMessage.ADAPTER.encodeWithTag(protoWriter, 14, ongoingRecipeMessage);
            }
            PingPongMessage pingPongMessage = meaterLinkMessage.pingPongMessage;
            if (pingPongMessage != null) {
                PingPongMessage.ADAPTER.encodeWithTag(protoWriter, 15, pingPongMessage);
            }
            protoWriter.writeBytes(meaterLinkMessage.unknownFields());
        }

        public int encodedSize(MeaterLinkMessage meaterLinkMessage) {
            int encodedSizeWithTag = MeaterLinkHeader.ADAPTER.encodedSizeWithTag(1, meaterLinkMessage.header);
            SubscriptionMessage subscriptionMessage = meaterLinkMessage.subscriptionMessage;
            int encodedSizeWithTag2 = encodedSizeWithTag + (subscriptionMessage != null ? SubscriptionMessage.ADAPTER.encodedSizeWithTag(2, subscriptionMessage) : 0);
            MasterMessage masterMessage = meaterLinkMessage.masterMessage;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + (masterMessage != null ? MasterMessage.ADAPTER.encodedSizeWithTag(3, masterMessage) : 0);
            SetupMessage setupMessage = meaterLinkMessage.setupMessage;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + (setupMessage != null ? SetupMessage.ADAPTER.encodedSizeWithTag(4, setupMessage) : 0);
            TemperatureHistoryRequestMessage temperatureHistoryRequestMessage = meaterLinkMessage.temperatureHistoryRequestMessage;
            int encodedSizeWithTag5 = encodedSizeWithTag4 + (temperatureHistoryRequestMessage != null ? TemperatureHistoryRequestMessage.ADAPTER.encodedSizeWithTag(5, temperatureHistoryRequestMessage) : 0);
            TemperatureHistoryMessage temperatureHistoryMessage = meaterLinkMessage.temperatureHistoryMessage;
            int encodedSizeWithTag6 = encodedSizeWithTag5 + (temperatureHistoryMessage != null ? TemperatureHistoryMessage.ADAPTER.encodedSizeWithTag(6, temperatureHistoryMessage) : 0);
            BlockFirmwareUpdateMessage blockFirmwareUpdateMessage = meaterLinkMessage.blockFirmwareUpdateMessage;
            int encodedSizeWithTag7 = encodedSizeWithTag6 + (blockFirmwareUpdateMessage != null ? BlockFirmwareUpdateMessage.ADAPTER.encodedSizeWithTag(7, blockFirmwareUpdateMessage) : 0);
            NetworkSettingsRequestMessage networkSettingsRequestMessage = meaterLinkMessage.networkSettingsRequestMessage;
            int encodedSizeWithTag8 = encodedSizeWithTag7 + (networkSettingsRequestMessage != null ? NetworkSettingsRequestMessage.ADAPTER.encodedSizeWithTag(8, networkSettingsRequestMessage) : 0);
            NetworkSettingsMessage networkSettingsMessage = meaterLinkMessage.networkSettingsMessage;
            int encodedSizeWithTag9 = encodedSizeWithTag8 + (networkSettingsMessage != null ? NetworkSettingsMessage.ADAPTER.encodedSizeWithTag(9, networkSettingsMessage) : 0);
            MasterStatusRequestMessage masterStatusRequestMessage = meaterLinkMessage.masterStatusRequestMessage;
            int encodedSizeWithTag10 = encodedSizeWithTag9 + (masterStatusRequestMessage != null ? MasterStatusRequestMessage.ADAPTER.encodedSizeWithTag(10, masterStatusRequestMessage) : 0);
            MasterStatusMessage masterStatusMessage = meaterLinkMessage.masterStatusMessage;
            int encodedSizeWithTag11 = encodedSizeWithTag10 + (masterStatusMessage != null ? MasterStatusMessage.ADAPTER.encodedSizeWithTag(11, masterStatusMessage) : 0);
            OngoingRecipeDiscoveryMessage ongoingRecipeDiscoveryMessage = meaterLinkMessage.ongoingRecipeDiscoveryMessage;
            int encodedSizeWithTag12 = encodedSizeWithTag11 + (ongoingRecipeDiscoveryMessage != null ? OngoingRecipeDiscoveryMessage.ADAPTER.encodedSizeWithTag(12, ongoingRecipeDiscoveryMessage) : 0);
            OngoingRecipeSubscriptionMessage ongoingRecipeSubscriptionMessage = meaterLinkMessage.ongoingRecipeSubscriptionMessage;
            int encodedSizeWithTag13 = encodedSizeWithTag12 + (ongoingRecipeSubscriptionMessage != null ? OngoingRecipeSubscriptionMessage.ADAPTER.encodedSizeWithTag(13, ongoingRecipeSubscriptionMessage) : 0);
            OngoingRecipeMessage ongoingRecipeMessage = meaterLinkMessage.ongoingRecipeMessage;
            int encodedSizeWithTag14 = encodedSizeWithTag13 + (ongoingRecipeMessage != null ? OngoingRecipeMessage.ADAPTER.encodedSizeWithTag(14, ongoingRecipeMessage) : 0);
            PingPongMessage pingPongMessage = meaterLinkMessage.pingPongMessage;
            return encodedSizeWithTag14 + (pingPongMessage != null ? PingPongMessage.ADAPTER.encodedSizeWithTag(15, pingPongMessage) : 0) + meaterLinkMessage.unknownFields().I();
        }

        public MeaterLinkMessage redact(MeaterLinkMessage meaterLinkMessage) {
            Builder m284newBuilder = meaterLinkMessage.m284newBuilder();
            MeaterLinkHeader meaterLinkHeader = m284newBuilder.header;
            if (meaterLinkHeader != null) {
                m284newBuilder.header = (MeaterLinkHeader) MeaterLinkHeader.ADAPTER.redact(meaterLinkHeader);
            }
            SubscriptionMessage subscriptionMessage = m284newBuilder.subscriptionMessage;
            if (subscriptionMessage != null) {
                m284newBuilder.subscriptionMessage = (SubscriptionMessage) SubscriptionMessage.ADAPTER.redact(subscriptionMessage);
            }
            MasterMessage masterMessage = m284newBuilder.masterMessage;
            if (masterMessage != null) {
                m284newBuilder.masterMessage = (MasterMessage) MasterMessage.ADAPTER.redact(masterMessage);
            }
            SetupMessage setupMessage = m284newBuilder.setupMessage;
            if (setupMessage != null) {
                m284newBuilder.setupMessage = (SetupMessage) SetupMessage.ADAPTER.redact(setupMessage);
            }
            TemperatureHistoryRequestMessage temperatureHistoryRequestMessage = m284newBuilder.temperatureHistoryRequestMessage;
            if (temperatureHistoryRequestMessage != null) {
                m284newBuilder.temperatureHistoryRequestMessage = (TemperatureHistoryRequestMessage) TemperatureHistoryRequestMessage.ADAPTER.redact(temperatureHistoryRequestMessage);
            }
            TemperatureHistoryMessage temperatureHistoryMessage = m284newBuilder.temperatureHistoryMessage;
            if (temperatureHistoryMessage != null) {
                m284newBuilder.temperatureHistoryMessage = (TemperatureHistoryMessage) TemperatureHistoryMessage.ADAPTER.redact(temperatureHistoryMessage);
            }
            BlockFirmwareUpdateMessage blockFirmwareUpdateMessage = m284newBuilder.blockFirmwareUpdateMessage;
            if (blockFirmwareUpdateMessage != null) {
                m284newBuilder.blockFirmwareUpdateMessage = (BlockFirmwareUpdateMessage) BlockFirmwareUpdateMessage.ADAPTER.redact(blockFirmwareUpdateMessage);
            }
            NetworkSettingsRequestMessage networkSettingsRequestMessage = m284newBuilder.networkSettingsRequestMessage;
            if (networkSettingsRequestMessage != null) {
                m284newBuilder.networkSettingsRequestMessage = (NetworkSettingsRequestMessage) NetworkSettingsRequestMessage.ADAPTER.redact(networkSettingsRequestMessage);
            }
            NetworkSettingsMessage networkSettingsMessage = m284newBuilder.networkSettingsMessage;
            if (networkSettingsMessage != null) {
                m284newBuilder.networkSettingsMessage = (NetworkSettingsMessage) NetworkSettingsMessage.ADAPTER.redact(networkSettingsMessage);
            }
            MasterStatusRequestMessage masterStatusRequestMessage = m284newBuilder.masterStatusRequestMessage;
            if (masterStatusRequestMessage != null) {
                m284newBuilder.masterStatusRequestMessage = (MasterStatusRequestMessage) MasterStatusRequestMessage.ADAPTER.redact(masterStatusRequestMessage);
            }
            MasterStatusMessage masterStatusMessage = m284newBuilder.masterStatusMessage;
            if (masterStatusMessage != null) {
                m284newBuilder.masterStatusMessage = (MasterStatusMessage) MasterStatusMessage.ADAPTER.redact(masterStatusMessage);
            }
            OngoingRecipeDiscoveryMessage ongoingRecipeDiscoveryMessage = m284newBuilder.ongoingRecipeDiscoveryMessage;
            if (ongoingRecipeDiscoveryMessage != null) {
                m284newBuilder.ongoingRecipeDiscoveryMessage = (OngoingRecipeDiscoveryMessage) OngoingRecipeDiscoveryMessage.ADAPTER.redact(ongoingRecipeDiscoveryMessage);
            }
            OngoingRecipeSubscriptionMessage ongoingRecipeSubscriptionMessage = m284newBuilder.ongoingRecipeSubscriptionMessage;
            if (ongoingRecipeSubscriptionMessage != null) {
                m284newBuilder.ongoingRecipeSubscriptionMessage = (OngoingRecipeSubscriptionMessage) OngoingRecipeSubscriptionMessage.ADAPTER.redact(ongoingRecipeSubscriptionMessage);
            }
            OngoingRecipeMessage ongoingRecipeMessage = m284newBuilder.ongoingRecipeMessage;
            if (ongoingRecipeMessage != null) {
                m284newBuilder.ongoingRecipeMessage = (OngoingRecipeMessage) OngoingRecipeMessage.ADAPTER.redact(ongoingRecipeMessage);
            }
            PingPongMessage pingPongMessage = m284newBuilder.pingPongMessage;
            if (pingPongMessage != null) {
                m284newBuilder.pingPongMessage = (PingPongMessage) PingPongMessage.ADAPTER.redact(pingPongMessage);
            }
            m284newBuilder.clearUnknownFields();
            return m284newBuilder.m285build();
        }
    }

    public MeaterLinkMessage(MeaterLinkHeader meaterLinkHeader, SubscriptionMessage subscriptionMessage, MasterMessage masterMessage, SetupMessage setupMessage, TemperatureHistoryRequestMessage temperatureHistoryRequestMessage, TemperatureHistoryMessage temperatureHistoryMessage, BlockFirmwareUpdateMessage blockFirmwareUpdateMessage, NetworkSettingsRequestMessage networkSettingsRequestMessage, NetworkSettingsMessage networkSettingsMessage, MasterStatusRequestMessage masterStatusRequestMessage, MasterStatusMessage masterStatusMessage, OngoingRecipeDiscoveryMessage ongoingRecipeDiscoveryMessage, OngoingRecipeSubscriptionMessage ongoingRecipeSubscriptionMessage, OngoingRecipeMessage ongoingRecipeMessage, PingPongMessage pingPongMessage) {
        this(meaterLinkHeader, subscriptionMessage, masterMessage, setupMessage, temperatureHistoryRequestMessage, temperatureHistoryMessage, blockFirmwareUpdateMessage, networkSettingsRequestMessage, networkSettingsMessage, masterStatusRequestMessage, masterStatusMessage, ongoingRecipeDiscoveryMessage, ongoingRecipeSubscriptionMessage, ongoingRecipeMessage, pingPongMessage, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MeaterLinkMessage)) {
            return false;
        }
        MeaterLinkMessage meaterLinkMessage = (MeaterLinkMessage) obj;
        if (Internal.equals(unknownFields(), meaterLinkMessage.unknownFields()) && Internal.equals(this.header, meaterLinkMessage.header) && Internal.equals(this.subscriptionMessage, meaterLinkMessage.subscriptionMessage) && Internal.equals(this.masterMessage, meaterLinkMessage.masterMessage) && Internal.equals(this.setupMessage, meaterLinkMessage.setupMessage) && Internal.equals(this.temperatureHistoryRequestMessage, meaterLinkMessage.temperatureHistoryRequestMessage) && Internal.equals(this.temperatureHistoryMessage, meaterLinkMessage.temperatureHistoryMessage) && Internal.equals(this.blockFirmwareUpdateMessage, meaterLinkMessage.blockFirmwareUpdateMessage) && Internal.equals(this.networkSettingsRequestMessage, meaterLinkMessage.networkSettingsRequestMessage) && Internal.equals(this.networkSettingsMessage, meaterLinkMessage.networkSettingsMessage) && Internal.equals(this.masterStatusRequestMessage, meaterLinkMessage.masterStatusRequestMessage) && Internal.equals(this.masterStatusMessage, meaterLinkMessage.masterStatusMessage) && Internal.equals(this.ongoingRecipeDiscoveryMessage, meaterLinkMessage.ongoingRecipeDiscoveryMessage) && Internal.equals(this.ongoingRecipeSubscriptionMessage, meaterLinkMessage.ongoingRecipeSubscriptionMessage) && Internal.equals(this.ongoingRecipeMessage, meaterLinkMessage.ongoingRecipeMessage) && Internal.equals(this.pingPongMessage, meaterLinkMessage.pingPongMessage)) {
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
            MeaterLinkHeader meaterLinkHeader = this.header;
            int i25 = 0;
            if (meaterLinkHeader != null) {
                i10 = meaterLinkHeader.hashCode();
            } else {
                i10 = 0;
            }
            int i26 = (hashCode + i10) * 37;
            SubscriptionMessage subscriptionMessage = this.subscriptionMessage;
            if (subscriptionMessage != null) {
                i11 = subscriptionMessage.hashCode();
            } else {
                i11 = 0;
            }
            int i27 = (i26 + i11) * 37;
            MasterMessage masterMessage = this.masterMessage;
            if (masterMessage != null) {
                i12 = masterMessage.hashCode();
            } else {
                i12 = 0;
            }
            int i28 = (i27 + i12) * 37;
            SetupMessage setupMessage = this.setupMessage;
            if (setupMessage != null) {
                i13 = setupMessage.hashCode();
            } else {
                i13 = 0;
            }
            int i29 = (i28 + i13) * 37;
            TemperatureHistoryRequestMessage temperatureHistoryRequestMessage = this.temperatureHistoryRequestMessage;
            if (temperatureHistoryRequestMessage != null) {
                i14 = temperatureHistoryRequestMessage.hashCode();
            } else {
                i14 = 0;
            }
            int i30 = (i29 + i14) * 37;
            TemperatureHistoryMessage temperatureHistoryMessage = this.temperatureHistoryMessage;
            if (temperatureHistoryMessage != null) {
                i15 = temperatureHistoryMessage.hashCode();
            } else {
                i15 = 0;
            }
            int i31 = (i30 + i15) * 37;
            BlockFirmwareUpdateMessage blockFirmwareUpdateMessage = this.blockFirmwareUpdateMessage;
            if (blockFirmwareUpdateMessage != null) {
                i16 = blockFirmwareUpdateMessage.hashCode();
            } else {
                i16 = 0;
            }
            int i32 = (i31 + i16) * 37;
            NetworkSettingsRequestMessage networkSettingsRequestMessage = this.networkSettingsRequestMessage;
            if (networkSettingsRequestMessage != null) {
                i17 = networkSettingsRequestMessage.hashCode();
            } else {
                i17 = 0;
            }
            int i33 = (i32 + i17) * 37;
            NetworkSettingsMessage networkSettingsMessage = this.networkSettingsMessage;
            if (networkSettingsMessage != null) {
                i18 = networkSettingsMessage.hashCode();
            } else {
                i18 = 0;
            }
            int i34 = (i33 + i18) * 37;
            MasterStatusRequestMessage masterStatusRequestMessage = this.masterStatusRequestMessage;
            if (masterStatusRequestMessage != null) {
                i19 = masterStatusRequestMessage.hashCode();
            } else {
                i19 = 0;
            }
            int i35 = (i34 + i19) * 37;
            MasterStatusMessage masterStatusMessage = this.masterStatusMessage;
            if (masterStatusMessage != null) {
                i20 = masterStatusMessage.hashCode();
            } else {
                i20 = 0;
            }
            int i36 = (i35 + i20) * 37;
            OngoingRecipeDiscoveryMessage ongoingRecipeDiscoveryMessage = this.ongoingRecipeDiscoveryMessage;
            if (ongoingRecipeDiscoveryMessage != null) {
                i21 = ongoingRecipeDiscoveryMessage.hashCode();
            } else {
                i21 = 0;
            }
            int i37 = (i36 + i21) * 37;
            OngoingRecipeSubscriptionMessage ongoingRecipeSubscriptionMessage = this.ongoingRecipeSubscriptionMessage;
            if (ongoingRecipeSubscriptionMessage != null) {
                i22 = ongoingRecipeSubscriptionMessage.hashCode();
            } else {
                i22 = 0;
            }
            int i38 = (i37 + i22) * 37;
            OngoingRecipeMessage ongoingRecipeMessage = this.ongoingRecipeMessage;
            if (ongoingRecipeMessage != null) {
                i23 = ongoingRecipeMessage.hashCode();
            } else {
                i23 = 0;
            }
            int i39 = (i38 + i23) * 37;
            PingPongMessage pingPongMessage = this.pingPongMessage;
            if (pingPongMessage != null) {
                i25 = pingPongMessage.hashCode();
            }
            int i40 = i39 + i25;
            ((Message) this).hashCode = i40;
            return i40;
        }
        return i24;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.header != null) {
            sb.append(", header=");
            sb.append(this.header);
        }
        if (this.subscriptionMessage != null) {
            sb.append(", subscriptionMessage=");
            sb.append(this.subscriptionMessage);
        }
        if (this.masterMessage != null) {
            sb.append(", masterMessage=");
            sb.append(this.masterMessage);
        }
        if (this.setupMessage != null) {
            sb.append(", setupMessage=");
            sb.append(this.setupMessage);
        }
        if (this.temperatureHistoryRequestMessage != null) {
            sb.append(", temperatureHistoryRequestMessage=");
            sb.append(this.temperatureHistoryRequestMessage);
        }
        if (this.temperatureHistoryMessage != null) {
            sb.append(", temperatureHistoryMessage=");
            sb.append(this.temperatureHistoryMessage);
        }
        if (this.blockFirmwareUpdateMessage != null) {
            sb.append(", blockFirmwareUpdateMessage=");
            sb.append(this.blockFirmwareUpdateMessage);
        }
        if (this.networkSettingsRequestMessage != null) {
            sb.append(", networkSettingsRequestMessage=");
            sb.append(this.networkSettingsRequestMessage);
        }
        if (this.networkSettingsMessage != null) {
            sb.append(", networkSettingsMessage=");
            sb.append(this.networkSettingsMessage);
        }
        if (this.masterStatusRequestMessage != null) {
            sb.append(", masterStatusRequestMessage=");
            sb.append(this.masterStatusRequestMessage);
        }
        if (this.masterStatusMessage != null) {
            sb.append(", masterStatusMessage=");
            sb.append(this.masterStatusMessage);
        }
        if (this.ongoingRecipeDiscoveryMessage != null) {
            sb.append(", ongoingRecipeDiscoveryMessage=");
            sb.append(this.ongoingRecipeDiscoveryMessage);
        }
        if (this.ongoingRecipeSubscriptionMessage != null) {
            sb.append(", ongoingRecipeSubscriptionMessage=");
            sb.append(this.ongoingRecipeSubscriptionMessage);
        }
        if (this.ongoingRecipeMessage != null) {
            sb.append(", ongoingRecipeMessage=");
            sb.append(this.ongoingRecipeMessage);
        }
        if (this.pingPongMessage != null) {
            sb.append(", pingPongMessage=");
            sb.append(this.pingPongMessage);
        }
        StringBuilder replace = sb.replace(0, 2, "MeaterLinkMessage{");
        replace.append('}');
        return replace.toString();
    }

    public MeaterLinkMessage(MeaterLinkHeader meaterLinkHeader, SubscriptionMessage subscriptionMessage, MasterMessage masterMessage, SetupMessage setupMessage, TemperatureHistoryRequestMessage temperatureHistoryRequestMessage, TemperatureHistoryMessage temperatureHistoryMessage, BlockFirmwareUpdateMessage blockFirmwareUpdateMessage, NetworkSettingsRequestMessage networkSettingsRequestMessage, NetworkSettingsMessage networkSettingsMessage, MasterStatusRequestMessage masterStatusRequestMessage, MasterStatusMessage masterStatusMessage, OngoingRecipeDiscoveryMessage ongoingRecipeDiscoveryMessage, OngoingRecipeSubscriptionMessage ongoingRecipeSubscriptionMessage, OngoingRecipeMessage ongoingRecipeMessage, PingPongMessage pingPongMessage, h hVar) {
        super(ADAPTER, hVar);
        if (Internal.countNonNull(subscriptionMessage, masterMessage, setupMessage, temperatureHistoryRequestMessage, new Object[]{temperatureHistoryMessage, blockFirmwareUpdateMessage, networkSettingsRequestMessage, networkSettingsMessage, masterStatusRequestMessage, masterStatusMessage, ongoingRecipeDiscoveryMessage, ongoingRecipeSubscriptionMessage, ongoingRecipeMessage, pingPongMessage}) > 1) {
            throw new IllegalArgumentException("at most one of subscriptionMessage, masterMessage, setupMessage, temperatureHistoryRequestMessage, temperatureHistoryMessage, blockFirmwareUpdateMessage, networkSettingsRequestMessage, networkSettingsMessage, masterStatusRequestMessage, masterStatusMessage, ongoingRecipeDiscoveryMessage, ongoingRecipeSubscriptionMessage, ongoingRecipeMessage, pingPongMessage may be non-null");
        }
        this.header = meaterLinkHeader;
        this.subscriptionMessage = subscriptionMessage;
        this.masterMessage = masterMessage;
        this.setupMessage = setupMessage;
        this.temperatureHistoryRequestMessage = temperatureHistoryRequestMessage;
        this.temperatureHistoryMessage = temperatureHistoryMessage;
        this.blockFirmwareUpdateMessage = blockFirmwareUpdateMessage;
        this.networkSettingsRequestMessage = networkSettingsRequestMessage;
        this.networkSettingsMessage = networkSettingsMessage;
        this.masterStatusRequestMessage = masterStatusRequestMessage;
        this.masterStatusMessage = masterStatusMessage;
        this.ongoingRecipeDiscoveryMessage = ongoingRecipeDiscoveryMessage;
        this.ongoingRecipeSubscriptionMessage = ongoingRecipeSubscriptionMessage;
        this.ongoingRecipeMessage = ongoingRecipeMessage;
        this.pingPongMessage = pingPongMessage;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m284newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.subscriptionMessage = this.subscriptionMessage;
        builder.masterMessage = this.masterMessage;
        builder.setupMessage = this.setupMessage;
        builder.temperatureHistoryRequestMessage = this.temperatureHistoryRequestMessage;
        builder.temperatureHistoryMessage = this.temperatureHistoryMessage;
        builder.blockFirmwareUpdateMessage = this.blockFirmwareUpdateMessage;
        builder.networkSettingsRequestMessage = this.networkSettingsRequestMessage;
        builder.networkSettingsMessage = this.networkSettingsMessage;
        builder.masterStatusRequestMessage = this.masterStatusRequestMessage;
        builder.masterStatusMessage = this.masterStatusMessage;
        builder.ongoingRecipeDiscoveryMessage = this.ongoingRecipeDiscoveryMessage;
        builder.ongoingRecipeSubscriptionMessage = this.ongoingRecipeSubscriptionMessage;
        builder.ongoingRecipeMessage = this.ongoingRecipeMessage;
        builder.pingPongMessage = this.pingPongMessage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
