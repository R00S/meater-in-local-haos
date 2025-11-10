package com.apptionlabs.meater_app.v1protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import ql.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public final class V1MeaterLinkMessage extends Message<V1MeaterLinkMessage, Builder> {
    public static final ProtoAdapter<V1MeaterLinkMessage> ADAPTER = new ProtoAdapter_LegacyMeaterLinkMessage();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1BlockFirmwareUpdateMessage#ADAPTER", tag = 6)
    public final V1BlockFirmwareUpdateMessage blockFirmwareUpdateMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1MasterMessage#ADAPTER", tag = 2)
    public final V1MasterMessage masterMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1SetupMessage#ADAPTER", tag = 3)
    public final V1SetupMessage setupMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1SubscriptionMessage#ADAPTER", tag = 1)
    public final V1SubscriptionMessage subscriptionMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1TemperatureHistoryMessage#ADAPTER", tag = 5)
    public final V1TemperatureHistoryMessage temperatureHistoryMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1TemperatureHistoryRequestMessage#ADAPTER", tag = 4)
    public final V1TemperatureHistoryRequestMessage temperatureHistoryRequestMessage;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V1MeaterLinkMessage, Builder> {
        public V1BlockFirmwareUpdateMessage blockFirmwareUpdateMessage;
        public V1MasterMessage masterMessage;
        public V1SetupMessage setupMessage;
        public V1SubscriptionMessage subscriptionMessage;
        public V1TemperatureHistoryMessage temperatureHistoryMessage;
        public V1TemperatureHistoryRequestMessage temperatureHistoryRequestMessage;

        public Builder blockFirmwareUpdateMessage(V1BlockFirmwareUpdateMessage v1BlockFirmwareUpdateMessage) {
            this.blockFirmwareUpdateMessage = v1BlockFirmwareUpdateMessage;
            return this;
        }

        public Builder masterMessage(V1MasterMessage v1MasterMessage) {
            this.masterMessage = v1MasterMessage;
            return this;
        }

        public Builder setupMessage(V1SetupMessage v1SetupMessage) {
            this.setupMessage = v1SetupMessage;
            return this;
        }

        public Builder subscriptionMessage(V1SubscriptionMessage v1SubscriptionMessage) {
            this.subscriptionMessage = v1SubscriptionMessage;
            return this;
        }

        public Builder temperatureHistoryMessage(V1TemperatureHistoryMessage v1TemperatureHistoryMessage) {
            this.temperatureHistoryMessage = v1TemperatureHistoryMessage;
            return this;
        }

        public Builder temperatureHistoryRequestMessage(V1TemperatureHistoryRequestMessage v1TemperatureHistoryRequestMessage) {
            this.temperatureHistoryRequestMessage = v1TemperatureHistoryRequestMessage;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V1MeaterLinkMessage m21build() {
            return new V1MeaterLinkMessage(this.subscriptionMessage, this.masterMessage, this.setupMessage, this.temperatureHistoryRequestMessage, this.temperatureHistoryMessage, this.blockFirmwareUpdateMessage, buildUnknownFields());
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_LegacyMeaterLinkMessage extends ProtoAdapter<V1MeaterLinkMessage> {
        ProtoAdapter_LegacyMeaterLinkMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, V1MeaterLinkMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V1MeaterLinkMessage m22decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.subscriptionMessage((V1SubscriptionMessage) V1SubscriptionMessage.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.masterMessage((V1MasterMessage) V1MasterMessage.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.setupMessage((V1SetupMessage) V1SetupMessage.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.temperatureHistoryRequestMessage((V1TemperatureHistoryRequestMessage) V1TemperatureHistoryRequestMessage.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.temperatureHistoryMessage((V1TemperatureHistoryMessage) V1TemperatureHistoryMessage.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.blockFirmwareUpdateMessage((V1BlockFirmwareUpdateMessage) V1BlockFirmwareUpdateMessage.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m21build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V1MeaterLinkMessage v1MeaterLinkMessage) {
            V1SubscriptionMessage v1SubscriptionMessage = v1MeaterLinkMessage.subscriptionMessage;
            if (v1SubscriptionMessage != null) {
                V1SubscriptionMessage.ADAPTER.encodeWithTag(protoWriter, 1, v1SubscriptionMessage);
            }
            V1MasterMessage v1MasterMessage = v1MeaterLinkMessage.masterMessage;
            if (v1MasterMessage != null) {
                V1MasterMessage.ADAPTER.encodeWithTag(protoWriter, 2, v1MasterMessage);
            }
            V1SetupMessage v1SetupMessage = v1MeaterLinkMessage.setupMessage;
            if (v1SetupMessage != null) {
                V1SetupMessage.ADAPTER.encodeWithTag(protoWriter, 3, v1SetupMessage);
            }
            V1TemperatureHistoryRequestMessage v1TemperatureHistoryRequestMessage = v1MeaterLinkMessage.temperatureHistoryRequestMessage;
            if (v1TemperatureHistoryRequestMessage != null) {
                V1TemperatureHistoryRequestMessage.ADAPTER.encodeWithTag(protoWriter, 4, v1TemperatureHistoryRequestMessage);
            }
            V1TemperatureHistoryMessage v1TemperatureHistoryMessage = v1MeaterLinkMessage.temperatureHistoryMessage;
            if (v1TemperatureHistoryMessage != null) {
                V1TemperatureHistoryMessage.ADAPTER.encodeWithTag(protoWriter, 5, v1TemperatureHistoryMessage);
            }
            V1BlockFirmwareUpdateMessage v1BlockFirmwareUpdateMessage = v1MeaterLinkMessage.blockFirmwareUpdateMessage;
            if (v1BlockFirmwareUpdateMessage != null) {
                V1BlockFirmwareUpdateMessage.ADAPTER.encodeWithTag(protoWriter, 6, v1BlockFirmwareUpdateMessage);
            }
            protoWriter.writeBytes(v1MeaterLinkMessage.unknownFields());
        }

        public int encodedSize(V1MeaterLinkMessage v1MeaterLinkMessage) {
            V1SubscriptionMessage v1SubscriptionMessage = v1MeaterLinkMessage.subscriptionMessage;
            int encodedSizeWithTag = v1SubscriptionMessage != null ? V1SubscriptionMessage.ADAPTER.encodedSizeWithTag(1, v1SubscriptionMessage) : 0;
            V1MasterMessage v1MasterMessage = v1MeaterLinkMessage.masterMessage;
            int encodedSizeWithTag2 = encodedSizeWithTag + (v1MasterMessage != null ? V1MasterMessage.ADAPTER.encodedSizeWithTag(2, v1MasterMessage) : 0);
            V1SetupMessage v1SetupMessage = v1MeaterLinkMessage.setupMessage;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + (v1SetupMessage != null ? V1SetupMessage.ADAPTER.encodedSizeWithTag(3, v1SetupMessage) : 0);
            V1TemperatureHistoryRequestMessage v1TemperatureHistoryRequestMessage = v1MeaterLinkMessage.temperatureHistoryRequestMessage;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + (v1TemperatureHistoryRequestMessage != null ? V1TemperatureHistoryRequestMessage.ADAPTER.encodedSizeWithTag(4, v1TemperatureHistoryRequestMessage) : 0);
            V1TemperatureHistoryMessage v1TemperatureHistoryMessage = v1MeaterLinkMessage.temperatureHistoryMessage;
            int encodedSizeWithTag5 = encodedSizeWithTag4 + (v1TemperatureHistoryMessage != null ? V1TemperatureHistoryMessage.ADAPTER.encodedSizeWithTag(5, v1TemperatureHistoryMessage) : 0);
            V1BlockFirmwareUpdateMessage v1BlockFirmwareUpdateMessage = v1MeaterLinkMessage.blockFirmwareUpdateMessage;
            return encodedSizeWithTag5 + (v1BlockFirmwareUpdateMessage != null ? V1BlockFirmwareUpdateMessage.ADAPTER.encodedSizeWithTag(6, v1BlockFirmwareUpdateMessage) : 0) + v1MeaterLinkMessage.unknownFields().I();
        }

        public V1MeaterLinkMessage redact(V1MeaterLinkMessage v1MeaterLinkMessage) {
            Builder m20newBuilder = v1MeaterLinkMessage.m20newBuilder();
            V1SubscriptionMessage v1SubscriptionMessage = m20newBuilder.subscriptionMessage;
            if (v1SubscriptionMessage != null) {
                m20newBuilder.subscriptionMessage = (V1SubscriptionMessage) V1SubscriptionMessage.ADAPTER.redact(v1SubscriptionMessage);
            }
            V1MasterMessage v1MasterMessage = m20newBuilder.masterMessage;
            if (v1MasterMessage != null) {
                m20newBuilder.masterMessage = (V1MasterMessage) V1MasterMessage.ADAPTER.redact(v1MasterMessage);
            }
            V1SetupMessage v1SetupMessage = m20newBuilder.setupMessage;
            if (v1SetupMessage != null) {
                m20newBuilder.setupMessage = (V1SetupMessage) V1SetupMessage.ADAPTER.redact(v1SetupMessage);
            }
            V1TemperatureHistoryRequestMessage v1TemperatureHistoryRequestMessage = m20newBuilder.temperatureHistoryRequestMessage;
            if (v1TemperatureHistoryRequestMessage != null) {
                m20newBuilder.temperatureHistoryRequestMessage = (V1TemperatureHistoryRequestMessage) V1TemperatureHistoryRequestMessage.ADAPTER.redact(v1TemperatureHistoryRequestMessage);
            }
            V1TemperatureHistoryMessage v1TemperatureHistoryMessage = m20newBuilder.temperatureHistoryMessage;
            if (v1TemperatureHistoryMessage != null) {
                m20newBuilder.temperatureHistoryMessage = (V1TemperatureHistoryMessage) V1TemperatureHistoryMessage.ADAPTER.redact(v1TemperatureHistoryMessage);
            }
            V1BlockFirmwareUpdateMessage v1BlockFirmwareUpdateMessage = m20newBuilder.blockFirmwareUpdateMessage;
            if (v1BlockFirmwareUpdateMessage != null) {
                m20newBuilder.blockFirmwareUpdateMessage = (V1BlockFirmwareUpdateMessage) V1BlockFirmwareUpdateMessage.ADAPTER.redact(v1BlockFirmwareUpdateMessage);
            }
            m20newBuilder.clearUnknownFields();
            return m20newBuilder.m21build();
        }
    }

    public V1MeaterLinkMessage(V1SubscriptionMessage v1SubscriptionMessage, V1MasterMessage v1MasterMessage, V1SetupMessage v1SetupMessage, V1TemperatureHistoryRequestMessage v1TemperatureHistoryRequestMessage, V1TemperatureHistoryMessage v1TemperatureHistoryMessage, V1BlockFirmwareUpdateMessage v1BlockFirmwareUpdateMessage) {
        this(v1SubscriptionMessage, v1MasterMessage, v1SetupMessage, v1TemperatureHistoryRequestMessage, v1TemperatureHistoryMessage, v1BlockFirmwareUpdateMessage, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1MeaterLinkMessage)) {
            return false;
        }
        V1MeaterLinkMessage v1MeaterLinkMessage = (V1MeaterLinkMessage) obj;
        if (Internal.equals(unknownFields(), v1MeaterLinkMessage.unknownFields()) && Internal.equals(this.subscriptionMessage, v1MeaterLinkMessage.subscriptionMessage) && Internal.equals(this.masterMessage, v1MeaterLinkMessage.masterMessage) && Internal.equals(this.setupMessage, v1MeaterLinkMessage.setupMessage) && Internal.equals(this.temperatureHistoryRequestMessage, v1MeaterLinkMessage.temperatureHistoryRequestMessage) && Internal.equals(this.temperatureHistoryMessage, v1MeaterLinkMessage.temperatureHistoryMessage) && Internal.equals(this.blockFirmwareUpdateMessage, v1MeaterLinkMessage.blockFirmwareUpdateMessage)) {
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
        int i15 = ((Message) this).hashCode;
        if (i15 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            V1SubscriptionMessage v1SubscriptionMessage = this.subscriptionMessage;
            int i16 = 0;
            if (v1SubscriptionMessage != null) {
                i10 = v1SubscriptionMessage.hashCode();
            } else {
                i10 = 0;
            }
            int i17 = (hashCode + i10) * 37;
            V1MasterMessage v1MasterMessage = this.masterMessage;
            if (v1MasterMessage != null) {
                i11 = v1MasterMessage.hashCode();
            } else {
                i11 = 0;
            }
            int i18 = (i17 + i11) * 37;
            V1SetupMessage v1SetupMessage = this.setupMessage;
            if (v1SetupMessage != null) {
                i12 = v1SetupMessage.hashCode();
            } else {
                i12 = 0;
            }
            int i19 = (i18 + i12) * 37;
            V1TemperatureHistoryRequestMessage v1TemperatureHistoryRequestMessage = this.temperatureHistoryRequestMessage;
            if (v1TemperatureHistoryRequestMessage != null) {
                i13 = v1TemperatureHistoryRequestMessage.hashCode();
            } else {
                i13 = 0;
            }
            int i20 = (i19 + i13) * 37;
            V1TemperatureHistoryMessage v1TemperatureHistoryMessage = this.temperatureHistoryMessage;
            if (v1TemperatureHistoryMessage != null) {
                i14 = v1TemperatureHistoryMessage.hashCode();
            } else {
                i14 = 0;
            }
            int i21 = (i20 + i14) * 37;
            V1BlockFirmwareUpdateMessage v1BlockFirmwareUpdateMessage = this.blockFirmwareUpdateMessage;
            if (v1BlockFirmwareUpdateMessage != null) {
                i16 = v1BlockFirmwareUpdateMessage.hashCode();
            }
            int i22 = i21 + i16;
            ((Message) this).hashCode = i22;
            return i22;
        }
        return i15;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
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
        StringBuilder replace = sb.replace(0, 2, "V1MeaterLinkMessage{");
        replace.append('}');
        return replace.toString();
    }

    public V1MeaterLinkMessage(V1SubscriptionMessage v1SubscriptionMessage, V1MasterMessage v1MasterMessage, V1SetupMessage v1SetupMessage, V1TemperatureHistoryRequestMessage v1TemperatureHistoryRequestMessage, V1TemperatureHistoryMessage v1TemperatureHistoryMessage, V1BlockFirmwareUpdateMessage v1BlockFirmwareUpdateMessage, h hVar) {
        super(ADAPTER, hVar);
        this.subscriptionMessage = v1SubscriptionMessage;
        this.masterMessage = v1MasterMessage;
        this.setupMessage = v1SetupMessage;
        this.temperatureHistoryRequestMessage = v1TemperatureHistoryRequestMessage;
        this.temperatureHistoryMessage = v1TemperatureHistoryMessage;
        this.blockFirmwareUpdateMessage = v1BlockFirmwareUpdateMessage;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m20newBuilder() {
        Builder builder = new Builder();
        builder.subscriptionMessage = this.subscriptionMessage;
        builder.masterMessage = this.masterMessage;
        builder.setupMessage = this.setupMessage;
        builder.temperatureHistoryRequestMessage = this.temperatureHistoryRequestMessage;
        builder.temperatureHistoryMessage = this.temperatureHistoryMessage;
        builder.blockFirmwareUpdateMessage = this.blockFirmwareUpdateMessage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
