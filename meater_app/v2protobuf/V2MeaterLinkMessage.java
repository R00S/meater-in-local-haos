package com.apptionlabs.meater_app.v2protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import ql.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public final class V2MeaterLinkMessage extends Message<V2MeaterLinkMessage, Builder> {
    public static final ProtoAdapter<V2MeaterLinkMessage> ADAPTER = new ProtoAdapter_V2MeaterLinkMessage();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2AmberSessionMessage#ADAPTER", tag = 8)
    public final V2AmberSessionMessage amberSessionMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2BlockFirmwareUpdateMessage#ADAPTER", tag = 7)
    public final V2BlockFirmwareUpdateMessage blockFirmwareUpdateMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2MeaterLinkHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final V2MeaterLinkHeader header;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2MasterMessage#ADAPTER", tag = 3)
    public final V2MasterMessage masterMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2MasterStatusMessage#ADAPTER", tag = 12)
    public final V2MasterStatusMessage masterStatusMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2MasterStatusRequestMessage#ADAPTER", tag = 11)
    public final V2MasterStatusRequestMessage masterStatusRequestMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2NetworkSettingsMessage#ADAPTER", tag = 10)
    public final V2NetworkSettingsMessage networkSettingsMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2NetworkSettingsRequestMessage#ADAPTER", tag = 9)
    public final V2NetworkSettingsRequestMessage networkSettingsRequestMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2SetupMessage#ADAPTER", tag = 4)
    public final V2SetupMessage setupMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2SubscriptionMessage#ADAPTER", tag = 2)
    public final V2SubscriptionMessage subscriptionMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2TemperatureHistoryMessage#ADAPTER", tag = 6)
    public final V2TemperatureHistoryMessage temperatureHistoryMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2TemperatureHistoryRequestMessage#ADAPTER", tag = 5)
    public final V2TemperatureHistoryRequestMessage temperatureHistoryRequestMessage;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2MeaterLinkMessage, Builder> {
        public V2AmberSessionMessage amberSessionMessage;
        public V2BlockFirmwareUpdateMessage blockFirmwareUpdateMessage;
        public V2MeaterLinkHeader header;
        public V2MasterMessage masterMessage;
        public V2MasterStatusMessage masterStatusMessage;
        public V2MasterStatusRequestMessage masterStatusRequestMessage;
        public V2NetworkSettingsMessage networkSettingsMessage;
        public V2NetworkSettingsRequestMessage networkSettingsRequestMessage;
        public V2SetupMessage setupMessage;
        public V2SubscriptionMessage subscriptionMessage;
        public V2TemperatureHistoryMessage temperatureHistoryMessage;
        public V2TemperatureHistoryRequestMessage temperatureHistoryRequestMessage;

        public Builder amberSessionMessage(V2AmberSessionMessage v2AmberSessionMessage) {
            this.amberSessionMessage = v2AmberSessionMessage;
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
            return this;
        }

        public Builder blockFirmwareUpdateMessage(V2BlockFirmwareUpdateMessage v2BlockFirmwareUpdateMessage) {
            this.blockFirmwareUpdateMessage = v2BlockFirmwareUpdateMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.amberSessionMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            return this;
        }

        public Builder header(V2MeaterLinkHeader v2MeaterLinkHeader) {
            this.header = v2MeaterLinkHeader;
            return this;
        }

        public Builder masterMessage(V2MasterMessage v2MasterMessage) {
            this.masterMessage = v2MasterMessage;
            this.subscriptionMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.amberSessionMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            return this;
        }

        public Builder masterStatusMessage(V2MasterStatusMessage v2MasterStatusMessage) {
            this.masterStatusMessage = v2MasterStatusMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.amberSessionMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            return this;
        }

        public Builder masterStatusRequestMessage(V2MasterStatusRequestMessage v2MasterStatusRequestMessage) {
            this.masterStatusRequestMessage = v2MasterStatusRequestMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.amberSessionMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusMessage = null;
            return this;
        }

        public Builder networkSettingsMessage(V2NetworkSettingsMessage v2NetworkSettingsMessage) {
            this.networkSettingsMessage = v2NetworkSettingsMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.amberSessionMessage = null;
            this.networkSettingsRequestMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            return this;
        }

        public Builder networkSettingsRequestMessage(V2NetworkSettingsRequestMessage v2NetworkSettingsRequestMessage) {
            this.networkSettingsRequestMessage = v2NetworkSettingsRequestMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.amberSessionMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            return this;
        }

        public Builder setupMessage(V2SetupMessage v2SetupMessage) {
            this.setupMessage = v2SetupMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.amberSessionMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            return this;
        }

        public Builder subscriptionMessage(V2SubscriptionMessage v2SubscriptionMessage) {
            this.subscriptionMessage = v2SubscriptionMessage;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.amberSessionMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            return this;
        }

        public Builder temperatureHistoryMessage(V2TemperatureHistoryMessage v2TemperatureHistoryMessage) {
            this.temperatureHistoryMessage = v2TemperatureHistoryMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryRequestMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.amberSessionMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            return this;
        }

        public Builder temperatureHistoryRequestMessage(V2TemperatureHistoryRequestMessage v2TemperatureHistoryRequestMessage) {
            this.temperatureHistoryRequestMessage = v2TemperatureHistoryRequestMessage;
            this.subscriptionMessage = null;
            this.masterMessage = null;
            this.setupMessage = null;
            this.temperatureHistoryMessage = null;
            this.blockFirmwareUpdateMessage = null;
            this.amberSessionMessage = null;
            this.networkSettingsRequestMessage = null;
            this.networkSettingsMessage = null;
            this.masterStatusRequestMessage = null;
            this.masterStatusMessage = null;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2MeaterLinkMessage m96build() {
            V2MeaterLinkHeader v2MeaterLinkHeader = this.header;
            if (v2MeaterLinkHeader != null) {
                return new V2MeaterLinkMessage(this.header, this.subscriptionMessage, this.masterMessage, this.setupMessage, this.temperatureHistoryRequestMessage, this.temperatureHistoryMessage, this.blockFirmwareUpdateMessage, this.amberSessionMessage, this.networkSettingsRequestMessage, this.networkSettingsMessage, this.masterStatusRequestMessage, this.masterStatusMessage, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{v2MeaterLinkHeader, "header"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2MeaterLinkMessage extends ProtoAdapter<V2MeaterLinkMessage> {
        ProtoAdapter_V2MeaterLinkMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, V2MeaterLinkMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2MeaterLinkMessage m97decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.header((V2MeaterLinkHeader) V2MeaterLinkHeader.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.subscriptionMessage((V2SubscriptionMessage) V2SubscriptionMessage.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.masterMessage((V2MasterMessage) V2MasterMessage.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.setupMessage((V2SetupMessage) V2SetupMessage.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.temperatureHistoryRequestMessage((V2TemperatureHistoryRequestMessage) V2TemperatureHistoryRequestMessage.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.temperatureHistoryMessage((V2TemperatureHistoryMessage) V2TemperatureHistoryMessage.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            builder.blockFirmwareUpdateMessage((V2BlockFirmwareUpdateMessage) V2BlockFirmwareUpdateMessage.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            builder.amberSessionMessage((V2AmberSessionMessage) V2AmberSessionMessage.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            builder.networkSettingsRequestMessage((V2NetworkSettingsRequestMessage) V2NetworkSettingsRequestMessage.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            builder.networkSettingsMessage((V2NetworkSettingsMessage) V2NetworkSettingsMessage.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            builder.masterStatusRequestMessage((V2MasterStatusRequestMessage) V2MasterStatusRequestMessage.ADAPTER.decode(protoReader));
                            break;
                        case 12:
                            builder.masterStatusMessage((V2MasterStatusMessage) V2MasterStatusMessage.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m96build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2MeaterLinkMessage v2MeaterLinkMessage) {
            V2MeaterLinkHeader.ADAPTER.encodeWithTag(protoWriter, 1, v2MeaterLinkMessage.header);
            V2SubscriptionMessage v2SubscriptionMessage = v2MeaterLinkMessage.subscriptionMessage;
            if (v2SubscriptionMessage != null) {
                V2SubscriptionMessage.ADAPTER.encodeWithTag(protoWriter, 2, v2SubscriptionMessage);
            }
            V2MasterMessage v2MasterMessage = v2MeaterLinkMessage.masterMessage;
            if (v2MasterMessage != null) {
                V2MasterMessage.ADAPTER.encodeWithTag(protoWriter, 3, v2MasterMessage);
            }
            V2SetupMessage v2SetupMessage = v2MeaterLinkMessage.setupMessage;
            if (v2SetupMessage != null) {
                V2SetupMessage.ADAPTER.encodeWithTag(protoWriter, 4, v2SetupMessage);
            }
            V2TemperatureHistoryRequestMessage v2TemperatureHistoryRequestMessage = v2MeaterLinkMessage.temperatureHistoryRequestMessage;
            if (v2TemperatureHistoryRequestMessage != null) {
                V2TemperatureHistoryRequestMessage.ADAPTER.encodeWithTag(protoWriter, 5, v2TemperatureHistoryRequestMessage);
            }
            V2TemperatureHistoryMessage v2TemperatureHistoryMessage = v2MeaterLinkMessage.temperatureHistoryMessage;
            if (v2TemperatureHistoryMessage != null) {
                V2TemperatureHistoryMessage.ADAPTER.encodeWithTag(protoWriter, 6, v2TemperatureHistoryMessage);
            }
            V2BlockFirmwareUpdateMessage v2BlockFirmwareUpdateMessage = v2MeaterLinkMessage.blockFirmwareUpdateMessage;
            if (v2BlockFirmwareUpdateMessage != null) {
                V2BlockFirmwareUpdateMessage.ADAPTER.encodeWithTag(protoWriter, 7, v2BlockFirmwareUpdateMessage);
            }
            V2AmberSessionMessage v2AmberSessionMessage = v2MeaterLinkMessage.amberSessionMessage;
            if (v2AmberSessionMessage != null) {
                V2AmberSessionMessage.ADAPTER.encodeWithTag(protoWriter, 8, v2AmberSessionMessage);
            }
            V2NetworkSettingsRequestMessage v2NetworkSettingsRequestMessage = v2MeaterLinkMessage.networkSettingsRequestMessage;
            if (v2NetworkSettingsRequestMessage != null) {
                V2NetworkSettingsRequestMessage.ADAPTER.encodeWithTag(protoWriter, 9, v2NetworkSettingsRequestMessage);
            }
            V2NetworkSettingsMessage v2NetworkSettingsMessage = v2MeaterLinkMessage.networkSettingsMessage;
            if (v2NetworkSettingsMessage != null) {
                V2NetworkSettingsMessage.ADAPTER.encodeWithTag(protoWriter, 10, v2NetworkSettingsMessage);
            }
            V2MasterStatusRequestMessage v2MasterStatusRequestMessage = v2MeaterLinkMessage.masterStatusRequestMessage;
            if (v2MasterStatusRequestMessage != null) {
                V2MasterStatusRequestMessage.ADAPTER.encodeWithTag(protoWriter, 11, v2MasterStatusRequestMessage);
            }
            V2MasterStatusMessage v2MasterStatusMessage = v2MeaterLinkMessage.masterStatusMessage;
            if (v2MasterStatusMessage != null) {
                V2MasterStatusMessage.ADAPTER.encodeWithTag(protoWriter, 12, v2MasterStatusMessage);
            }
            protoWriter.writeBytes(v2MeaterLinkMessage.unknownFields());
        }

        public int encodedSize(V2MeaterLinkMessage v2MeaterLinkMessage) {
            int encodedSizeWithTag = V2MeaterLinkHeader.ADAPTER.encodedSizeWithTag(1, v2MeaterLinkMessage.header);
            V2SubscriptionMessage v2SubscriptionMessage = v2MeaterLinkMessage.subscriptionMessage;
            int encodedSizeWithTag2 = encodedSizeWithTag + (v2SubscriptionMessage != null ? V2SubscriptionMessage.ADAPTER.encodedSizeWithTag(2, v2SubscriptionMessage) : 0);
            V2MasterMessage v2MasterMessage = v2MeaterLinkMessage.masterMessage;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + (v2MasterMessage != null ? V2MasterMessage.ADAPTER.encodedSizeWithTag(3, v2MasterMessage) : 0);
            V2SetupMessage v2SetupMessage = v2MeaterLinkMessage.setupMessage;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + (v2SetupMessage != null ? V2SetupMessage.ADAPTER.encodedSizeWithTag(4, v2SetupMessage) : 0);
            V2TemperatureHistoryRequestMessage v2TemperatureHistoryRequestMessage = v2MeaterLinkMessage.temperatureHistoryRequestMessage;
            int encodedSizeWithTag5 = encodedSizeWithTag4 + (v2TemperatureHistoryRequestMessage != null ? V2TemperatureHistoryRequestMessage.ADAPTER.encodedSizeWithTag(5, v2TemperatureHistoryRequestMessage) : 0);
            V2TemperatureHistoryMessage v2TemperatureHistoryMessage = v2MeaterLinkMessage.temperatureHistoryMessage;
            int encodedSizeWithTag6 = encodedSizeWithTag5 + (v2TemperatureHistoryMessage != null ? V2TemperatureHistoryMessage.ADAPTER.encodedSizeWithTag(6, v2TemperatureHistoryMessage) : 0);
            V2BlockFirmwareUpdateMessage v2BlockFirmwareUpdateMessage = v2MeaterLinkMessage.blockFirmwareUpdateMessage;
            int encodedSizeWithTag7 = encodedSizeWithTag6 + (v2BlockFirmwareUpdateMessage != null ? V2BlockFirmwareUpdateMessage.ADAPTER.encodedSizeWithTag(7, v2BlockFirmwareUpdateMessage) : 0);
            V2AmberSessionMessage v2AmberSessionMessage = v2MeaterLinkMessage.amberSessionMessage;
            int encodedSizeWithTag8 = encodedSizeWithTag7 + (v2AmberSessionMessage != null ? V2AmberSessionMessage.ADAPTER.encodedSizeWithTag(8, v2AmberSessionMessage) : 0);
            V2NetworkSettingsRequestMessage v2NetworkSettingsRequestMessage = v2MeaterLinkMessage.networkSettingsRequestMessage;
            int encodedSizeWithTag9 = encodedSizeWithTag8 + (v2NetworkSettingsRequestMessage != null ? V2NetworkSettingsRequestMessage.ADAPTER.encodedSizeWithTag(9, v2NetworkSettingsRequestMessage) : 0);
            V2NetworkSettingsMessage v2NetworkSettingsMessage = v2MeaterLinkMessage.networkSettingsMessage;
            int encodedSizeWithTag10 = encodedSizeWithTag9 + (v2NetworkSettingsMessage != null ? V2NetworkSettingsMessage.ADAPTER.encodedSizeWithTag(10, v2NetworkSettingsMessage) : 0);
            V2MasterStatusRequestMessage v2MasterStatusRequestMessage = v2MeaterLinkMessage.masterStatusRequestMessage;
            int encodedSizeWithTag11 = encodedSizeWithTag10 + (v2MasterStatusRequestMessage != null ? V2MasterStatusRequestMessage.ADAPTER.encodedSizeWithTag(11, v2MasterStatusRequestMessage) : 0);
            V2MasterStatusMessage v2MasterStatusMessage = v2MeaterLinkMessage.masterStatusMessage;
            return encodedSizeWithTag11 + (v2MasterStatusMessage != null ? V2MasterStatusMessage.ADAPTER.encodedSizeWithTag(12, v2MasterStatusMessage) : 0) + v2MeaterLinkMessage.unknownFields().I();
        }

        public V2MeaterLinkMessage redact(V2MeaterLinkMessage v2MeaterLinkMessage) {
            Builder m95newBuilder = v2MeaterLinkMessage.m95newBuilder();
            V2MeaterLinkHeader v2MeaterLinkHeader = m95newBuilder.header;
            if (v2MeaterLinkHeader != null) {
                m95newBuilder.header = (V2MeaterLinkHeader) V2MeaterLinkHeader.ADAPTER.redact(v2MeaterLinkHeader);
            }
            V2SubscriptionMessage v2SubscriptionMessage = m95newBuilder.subscriptionMessage;
            if (v2SubscriptionMessage != null) {
                m95newBuilder.subscriptionMessage = (V2SubscriptionMessage) V2SubscriptionMessage.ADAPTER.redact(v2SubscriptionMessage);
            }
            V2MasterMessage v2MasterMessage = m95newBuilder.masterMessage;
            if (v2MasterMessage != null) {
                m95newBuilder.masterMessage = (V2MasterMessage) V2MasterMessage.ADAPTER.redact(v2MasterMessage);
            }
            V2SetupMessage v2SetupMessage = m95newBuilder.setupMessage;
            if (v2SetupMessage != null) {
                m95newBuilder.setupMessage = (V2SetupMessage) V2SetupMessage.ADAPTER.redact(v2SetupMessage);
            }
            V2TemperatureHistoryRequestMessage v2TemperatureHistoryRequestMessage = m95newBuilder.temperatureHistoryRequestMessage;
            if (v2TemperatureHistoryRequestMessage != null) {
                m95newBuilder.temperatureHistoryRequestMessage = (V2TemperatureHistoryRequestMessage) V2TemperatureHistoryRequestMessage.ADAPTER.redact(v2TemperatureHistoryRequestMessage);
            }
            V2TemperatureHistoryMessage v2TemperatureHistoryMessage = m95newBuilder.temperatureHistoryMessage;
            if (v2TemperatureHistoryMessage != null) {
                m95newBuilder.temperatureHistoryMessage = (V2TemperatureHistoryMessage) V2TemperatureHistoryMessage.ADAPTER.redact(v2TemperatureHistoryMessage);
            }
            V2BlockFirmwareUpdateMessage v2BlockFirmwareUpdateMessage = m95newBuilder.blockFirmwareUpdateMessage;
            if (v2BlockFirmwareUpdateMessage != null) {
                m95newBuilder.blockFirmwareUpdateMessage = (V2BlockFirmwareUpdateMessage) V2BlockFirmwareUpdateMessage.ADAPTER.redact(v2BlockFirmwareUpdateMessage);
            }
            V2AmberSessionMessage v2AmberSessionMessage = m95newBuilder.amberSessionMessage;
            if (v2AmberSessionMessage != null) {
                m95newBuilder.amberSessionMessage = (V2AmberSessionMessage) V2AmberSessionMessage.ADAPTER.redact(v2AmberSessionMessage);
            }
            V2NetworkSettingsRequestMessage v2NetworkSettingsRequestMessage = m95newBuilder.networkSettingsRequestMessage;
            if (v2NetworkSettingsRequestMessage != null) {
                m95newBuilder.networkSettingsRequestMessage = (V2NetworkSettingsRequestMessage) V2NetworkSettingsRequestMessage.ADAPTER.redact(v2NetworkSettingsRequestMessage);
            }
            V2NetworkSettingsMessage v2NetworkSettingsMessage = m95newBuilder.networkSettingsMessage;
            if (v2NetworkSettingsMessage != null) {
                m95newBuilder.networkSettingsMessage = (V2NetworkSettingsMessage) V2NetworkSettingsMessage.ADAPTER.redact(v2NetworkSettingsMessage);
            }
            V2MasterStatusRequestMessage v2MasterStatusRequestMessage = m95newBuilder.masterStatusRequestMessage;
            if (v2MasterStatusRequestMessage != null) {
                m95newBuilder.masterStatusRequestMessage = (V2MasterStatusRequestMessage) V2MasterStatusRequestMessage.ADAPTER.redact(v2MasterStatusRequestMessage);
            }
            V2MasterStatusMessage v2MasterStatusMessage = m95newBuilder.masterStatusMessage;
            if (v2MasterStatusMessage != null) {
                m95newBuilder.masterStatusMessage = (V2MasterStatusMessage) V2MasterStatusMessage.ADAPTER.redact(v2MasterStatusMessage);
            }
            m95newBuilder.clearUnknownFields();
            return m95newBuilder.m96build();
        }
    }

    public V2MeaterLinkMessage(V2MeaterLinkHeader v2MeaterLinkHeader, V2SubscriptionMessage v2SubscriptionMessage, V2MasterMessage v2MasterMessage, V2SetupMessage v2SetupMessage, V2TemperatureHistoryRequestMessage v2TemperatureHistoryRequestMessage, V2TemperatureHistoryMessage v2TemperatureHistoryMessage, V2BlockFirmwareUpdateMessage v2BlockFirmwareUpdateMessage, V2AmberSessionMessage v2AmberSessionMessage, V2NetworkSettingsRequestMessage v2NetworkSettingsRequestMessage, V2NetworkSettingsMessage v2NetworkSettingsMessage, V2MasterStatusRequestMessage v2MasterStatusRequestMessage, V2MasterStatusMessage v2MasterStatusMessage) {
        this(v2MeaterLinkHeader, v2SubscriptionMessage, v2MasterMessage, v2SetupMessage, v2TemperatureHistoryRequestMessage, v2TemperatureHistoryMessage, v2BlockFirmwareUpdateMessage, v2AmberSessionMessage, v2NetworkSettingsRequestMessage, v2NetworkSettingsMessage, v2MasterStatusRequestMessage, v2MasterStatusMessage, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2MeaterLinkMessage)) {
            return false;
        }
        V2MeaterLinkMessage v2MeaterLinkMessage = (V2MeaterLinkMessage) obj;
        if (Internal.equals(unknownFields(), v2MeaterLinkMessage.unknownFields()) && Internal.equals(this.header, v2MeaterLinkMessage.header) && Internal.equals(this.subscriptionMessage, v2MeaterLinkMessage.subscriptionMessage) && Internal.equals(this.masterMessage, v2MeaterLinkMessage.masterMessage) && Internal.equals(this.setupMessage, v2MeaterLinkMessage.setupMessage) && Internal.equals(this.temperatureHistoryRequestMessage, v2MeaterLinkMessage.temperatureHistoryRequestMessage) && Internal.equals(this.temperatureHistoryMessage, v2MeaterLinkMessage.temperatureHistoryMessage) && Internal.equals(this.blockFirmwareUpdateMessage, v2MeaterLinkMessage.blockFirmwareUpdateMessage) && Internal.equals(this.amberSessionMessage, v2MeaterLinkMessage.amberSessionMessage) && Internal.equals(this.networkSettingsRequestMessage, v2MeaterLinkMessage.networkSettingsRequestMessage) && Internal.equals(this.networkSettingsMessage, v2MeaterLinkMessage.networkSettingsMessage) && Internal.equals(this.masterStatusRequestMessage, v2MeaterLinkMessage.masterStatusRequestMessage) && Internal.equals(this.masterStatusMessage, v2MeaterLinkMessage.masterStatusMessage)) {
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
        int i21 = ((Message) this).hashCode;
        if (i21 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            V2MeaterLinkHeader v2MeaterLinkHeader = this.header;
            int i22 = 0;
            if (v2MeaterLinkHeader != null) {
                i10 = v2MeaterLinkHeader.hashCode();
            } else {
                i10 = 0;
            }
            int i23 = (hashCode + i10) * 37;
            V2SubscriptionMessage v2SubscriptionMessage = this.subscriptionMessage;
            if (v2SubscriptionMessage != null) {
                i11 = v2SubscriptionMessage.hashCode();
            } else {
                i11 = 0;
            }
            int i24 = (i23 + i11) * 37;
            V2MasterMessage v2MasterMessage = this.masterMessage;
            if (v2MasterMessage != null) {
                i12 = v2MasterMessage.hashCode();
            } else {
                i12 = 0;
            }
            int i25 = (i24 + i12) * 37;
            V2SetupMessage v2SetupMessage = this.setupMessage;
            if (v2SetupMessage != null) {
                i13 = v2SetupMessage.hashCode();
            } else {
                i13 = 0;
            }
            int i26 = (i25 + i13) * 37;
            V2TemperatureHistoryRequestMessage v2TemperatureHistoryRequestMessage = this.temperatureHistoryRequestMessage;
            if (v2TemperatureHistoryRequestMessage != null) {
                i14 = v2TemperatureHistoryRequestMessage.hashCode();
            } else {
                i14 = 0;
            }
            int i27 = (i26 + i14) * 37;
            V2TemperatureHistoryMessage v2TemperatureHistoryMessage = this.temperatureHistoryMessage;
            if (v2TemperatureHistoryMessage != null) {
                i15 = v2TemperatureHistoryMessage.hashCode();
            } else {
                i15 = 0;
            }
            int i28 = (i27 + i15) * 37;
            V2BlockFirmwareUpdateMessage v2BlockFirmwareUpdateMessage = this.blockFirmwareUpdateMessage;
            if (v2BlockFirmwareUpdateMessage != null) {
                i16 = v2BlockFirmwareUpdateMessage.hashCode();
            } else {
                i16 = 0;
            }
            int i29 = (i28 + i16) * 37;
            V2AmberSessionMessage v2AmberSessionMessage = this.amberSessionMessage;
            if (v2AmberSessionMessage != null) {
                i17 = v2AmberSessionMessage.hashCode();
            } else {
                i17 = 0;
            }
            int i30 = (i29 + i17) * 37;
            V2NetworkSettingsRequestMessage v2NetworkSettingsRequestMessage = this.networkSettingsRequestMessage;
            if (v2NetworkSettingsRequestMessage != null) {
                i18 = v2NetworkSettingsRequestMessage.hashCode();
            } else {
                i18 = 0;
            }
            int i31 = (i30 + i18) * 37;
            V2NetworkSettingsMessage v2NetworkSettingsMessage = this.networkSettingsMessage;
            if (v2NetworkSettingsMessage != null) {
                i19 = v2NetworkSettingsMessage.hashCode();
            } else {
                i19 = 0;
            }
            int i32 = (i31 + i19) * 37;
            V2MasterStatusRequestMessage v2MasterStatusRequestMessage = this.masterStatusRequestMessage;
            if (v2MasterStatusRequestMessage != null) {
                i20 = v2MasterStatusRequestMessage.hashCode();
            } else {
                i20 = 0;
            }
            int i33 = (i32 + i20) * 37;
            V2MasterStatusMessage v2MasterStatusMessage = this.masterStatusMessage;
            if (v2MasterStatusMessage != null) {
                i22 = v2MasterStatusMessage.hashCode();
            }
            int i34 = i33 + i22;
            ((Message) this).hashCode = i34;
            return i34;
        }
        return i21;
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
        if (this.amberSessionMessage != null) {
            sb.append(", amberSessionMessage=");
            sb.append(this.amberSessionMessage);
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
        StringBuilder replace = sb.replace(0, 2, "V2MeaterLinkMessage{");
        replace.append('}');
        return replace.toString();
    }

    public V2MeaterLinkMessage(V2MeaterLinkHeader v2MeaterLinkHeader, V2SubscriptionMessage v2SubscriptionMessage, V2MasterMessage v2MasterMessage, V2SetupMessage v2SetupMessage, V2TemperatureHistoryRequestMessage v2TemperatureHistoryRequestMessage, V2TemperatureHistoryMessage v2TemperatureHistoryMessage, V2BlockFirmwareUpdateMessage v2BlockFirmwareUpdateMessage, V2AmberSessionMessage v2AmberSessionMessage, V2NetworkSettingsRequestMessage v2NetworkSettingsRequestMessage, V2NetworkSettingsMessage v2NetworkSettingsMessage, V2MasterStatusRequestMessage v2MasterStatusRequestMessage, V2MasterStatusMessage v2MasterStatusMessage, h hVar) {
        super(ADAPTER, hVar);
        if (Internal.countNonNull(v2SubscriptionMessage, v2MasterMessage, v2SetupMessage, v2TemperatureHistoryRequestMessage, new Object[]{v2TemperatureHistoryMessage, v2BlockFirmwareUpdateMessage, v2AmberSessionMessage, v2NetworkSettingsRequestMessage, v2NetworkSettingsMessage, v2MasterStatusRequestMessage, v2MasterStatusMessage}) > 1) {
            throw new IllegalArgumentException("at most one of subscriptionMessage, masterMessage, setupMessage, temperatureHistoryRequestMessage, temperatureHistoryMessage, blockFirmwareUpdateMessage, amberSessionMessage, networkSettingsRequestMessage, networkSettingsMessage, masterStatusRequestMessage, masterStatusMessage may be non-null");
        }
        this.header = v2MeaterLinkHeader;
        this.subscriptionMessage = v2SubscriptionMessage;
        this.masterMessage = v2MasterMessage;
        this.setupMessage = v2SetupMessage;
        this.temperatureHistoryRequestMessage = v2TemperatureHistoryRequestMessage;
        this.temperatureHistoryMessage = v2TemperatureHistoryMessage;
        this.blockFirmwareUpdateMessage = v2BlockFirmwareUpdateMessage;
        this.amberSessionMessage = v2AmberSessionMessage;
        this.networkSettingsRequestMessage = v2NetworkSettingsRequestMessage;
        this.networkSettingsMessage = v2NetworkSettingsMessage;
        this.masterStatusRequestMessage = v2MasterStatusRequestMessage;
        this.masterStatusMessage = v2MasterStatusMessage;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m95newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.subscriptionMessage = this.subscriptionMessage;
        builder.masterMessage = this.masterMessage;
        builder.setupMessage = this.setupMessage;
        builder.temperatureHistoryRequestMessage = this.temperatureHistoryRequestMessage;
        builder.temperatureHistoryMessage = this.temperatureHistoryMessage;
        builder.blockFirmwareUpdateMessage = this.blockFirmwareUpdateMessage;
        builder.amberSessionMessage = this.amberSessionMessage;
        builder.networkSettingsRequestMessage = this.networkSettingsRequestMessage;
        builder.networkSettingsMessage = this.networkSettingsMessage;
        builder.masterStatusRequestMessage = this.masterStatusRequestMessage;
        builder.masterStatusMessage = this.masterStatusMessage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
