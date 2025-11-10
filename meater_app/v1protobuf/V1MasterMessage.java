package com.apptionlabs.meater_app.v1protobuf;

import com.apptionlabs.meater_app.data.ProtocolParameters;
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
public final class V1MasterMessage extends Message<V1MasterMessage, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1CloudConnectionState#ADAPTER", tag = 7)
    public final V1CloudConnectionState cloudConnectionState;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1ConnectionState#ADAPTER", tag = 3)
    public final V1ConnectionState connectionState;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1MeaterLinkHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final V1MeaterLinkHeader header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 5)
    public final Integer masterBatteryLevel;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1MasterType#ADAPTER", tag = 4)
    public final V1MasterType masterType;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1MLProbe#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<V1MLProbe> probes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 6)
    public final Integer wifiSignalLevel;
    public static final ProtoAdapter<V1MasterMessage> ADAPTER = new ProtoAdapter_LegacyMasterMessage();
    public static final V1ConnectionState DEFAULT_CONNECTIONSTATE = V1ConnectionState.CONNECTION_STATE_OFFLINE;
    public static final V1MasterType DEFAULT_MASTERTYPE = V1MasterType.MASTER_TYPE_BLOCK;
    public static final Integer DEFAULT_MASTERBATTERYLEVEL = 0;
    public static final Integer DEFAULT_WIFISIGNALLEVEL = 0;
    public static final V1CloudConnectionState DEFAULT_CLOUDCONNECTIONSTATE = V1CloudConnectionState.CLOUD_CONNECTION_STATE_DISABLED;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V1MasterMessage, Builder> {
        public V1CloudConnectionState cloudConnectionState;
        public V1ConnectionState connectionState;
        public V1MeaterLinkHeader header;
        public Integer masterBatteryLevel;
        public V1MasterType masterType;
        public List<V1MLProbe> probes = Internal.newMutableList();
        public Integer wifiSignalLevel;

        public Builder cloudConnectionState(V1CloudConnectionState v1CloudConnectionState) {
            this.cloudConnectionState = v1CloudConnectionState;
            return this;
        }

        public Builder connectionState(V1ConnectionState v1ConnectionState) {
            this.connectionState = v1ConnectionState;
            return this;
        }

        public Builder header(V1MeaterLinkHeader v1MeaterLinkHeader) {
            this.header = v1MeaterLinkHeader;
            return this;
        }

        public Builder masterBatteryLevel(Integer num) {
            this.masterBatteryLevel = num;
            return this;
        }

        public Builder masterType(V1MasterType v1MasterType) {
            this.masterType = v1MasterType;
            return this;
        }

        public Builder probes(List<V1MLProbe> list) {
            Internal.checkElementsNotNull(list);
            this.probes = list;
            return this;
        }

        public Builder wifiSignalLevel(Integer num) {
            this.wifiSignalLevel = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V1MasterMessage m15build() {
            V1MeaterLinkHeader v1MeaterLinkHeader = this.header;
            if (v1MeaterLinkHeader != null) {
                return new V1MasterMessage(this.header, this.probes, this.connectionState, this.masterType, this.masterBatteryLevel, this.wifiSignalLevel, this.cloudConnectionState, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{v1MeaterLinkHeader, "header"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_LegacyMasterMessage extends ProtoAdapter<V1MasterMessage> {
        ProtoAdapter_LegacyMasterMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, V1MasterMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V1MasterMessage m16decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.header((V1MeaterLinkHeader) V1MeaterLinkHeader.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.probes.add((V1MLProbe) V1MLProbe.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            try {
                                builder.connectionState((V1ConnectionState) V1ConnectionState.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        case 4:
                            try {
                                builder.masterType((V1MasterType) V1MasterType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e11.value));
                                break;
                            }
                        case 5:
                            builder.masterBatteryLevel((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 6:
                            builder.wifiSignalLevel((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 7:
                            try {
                                builder.cloudConnectionState((V1CloudConnectionState) V1CloudConnectionState.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e12.value));
                                break;
                            }
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m15build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V1MasterMessage v1MasterMessage) {
            V1MeaterLinkHeader.ADAPTER.encodeWithTag(protoWriter, 1, v1MasterMessage.header);
            if (v1MasterMessage.probes != null) {
                V1MLProbe.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, v1MasterMessage.probes);
            }
            V1ConnectionState v1ConnectionState = v1MasterMessage.connectionState;
            if (v1ConnectionState != null) {
                V1ConnectionState.ADAPTER.encodeWithTag(protoWriter, 3, v1ConnectionState);
            }
            V1MasterType v1MasterType = v1MasterMessage.masterType;
            if (v1MasterType != null) {
                V1MasterType.ADAPTER.encodeWithTag(protoWriter, 4, v1MasterType);
            }
            Integer num = v1MasterMessage.masterBatteryLevel;
            if (num != null) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 5, num);
            }
            Integer num2 = v1MasterMessage.wifiSignalLevel;
            if (num2 != null) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 6, num2);
            }
            V1CloudConnectionState v1CloudConnectionState = v1MasterMessage.cloudConnectionState;
            if (v1CloudConnectionState != null) {
                V1CloudConnectionState.ADAPTER.encodeWithTag(protoWriter, 7, v1CloudConnectionState);
            }
            protoWriter.writeBytes(v1MasterMessage.unknownFields());
        }

        public int encodedSize(V1MasterMessage v1MasterMessage) {
            int encodedSizeWithTag = V1MeaterLinkHeader.ADAPTER.encodedSizeWithTag(1, v1MasterMessage.header) + V1MLProbe.ADAPTER.asRepeated().encodedSizeWithTag(2, v1MasterMessage.probes);
            V1ConnectionState v1ConnectionState = v1MasterMessage.connectionState;
            int encodedSizeWithTag2 = encodedSizeWithTag + (v1ConnectionState != null ? V1ConnectionState.ADAPTER.encodedSizeWithTag(3, v1ConnectionState) : 0);
            V1MasterType v1MasterType = v1MasterMessage.masterType;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + (v1MasterType != null ? V1MasterType.ADAPTER.encodedSizeWithTag(4, v1MasterType) : 0);
            Integer num = v1MasterMessage.masterBatteryLevel;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + (num != null ? ProtoAdapter.UINT32.encodedSizeWithTag(5, num) : 0);
            Integer num2 = v1MasterMessage.wifiSignalLevel;
            int encodedSizeWithTag5 = encodedSizeWithTag4 + (num2 != null ? ProtoAdapter.UINT32.encodedSizeWithTag(6, num2) : 0);
            V1CloudConnectionState v1CloudConnectionState = v1MasterMessage.cloudConnectionState;
            return encodedSizeWithTag5 + (v1CloudConnectionState != null ? V1CloudConnectionState.ADAPTER.encodedSizeWithTag(7, v1CloudConnectionState) : 0) + v1MasterMessage.unknownFields().I();
        }

        public V1MasterMessage redact(V1MasterMessage v1MasterMessage) {
            Builder m14newBuilder = v1MasterMessage.m14newBuilder();
            V1MeaterLinkHeader v1MeaterLinkHeader = m14newBuilder.header;
            if (v1MeaterLinkHeader != null) {
                m14newBuilder.header = (V1MeaterLinkHeader) V1MeaterLinkHeader.ADAPTER.redact(v1MeaterLinkHeader);
            }
            Internal.redactElements(m14newBuilder.probes, V1MLProbe.ADAPTER);
            m14newBuilder.clearUnknownFields();
            return m14newBuilder.m15build();
        }
    }

    public V1MasterMessage(V1MeaterLinkHeader v1MeaterLinkHeader, List<V1MLProbe> list, V1ConnectionState v1ConnectionState, V1MasterType v1MasterType, Integer num, Integer num2, V1CloudConnectionState v1CloudConnectionState) {
        this(v1MeaterLinkHeader, list, v1ConnectionState, v1MasterType, num, num2, v1CloudConnectionState, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1MasterMessage)) {
            return false;
        }
        V1MasterMessage v1MasterMessage = (V1MasterMessage) obj;
        if (Internal.equals(unknownFields(), v1MasterMessage.unknownFields()) && Internal.equals(this.header, v1MasterMessage.header) && Internal.equals(this.probes, v1MasterMessage.probes) && Internal.equals(this.connectionState, v1MasterMessage.connectionState) && Internal.equals(this.masterType, v1MasterMessage.masterType) && Internal.equals(this.masterBatteryLevel, v1MasterMessage.masterBatteryLevel) && Internal.equals(this.wifiSignalLevel, v1MasterMessage.wifiSignalLevel) && Internal.equals(this.cloudConnectionState, v1MasterMessage.cloudConnectionState)) {
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
        int i16 = ((Message) this).hashCode;
        if (i16 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            V1MeaterLinkHeader v1MeaterLinkHeader = this.header;
            int i17 = 0;
            if (v1MeaterLinkHeader != null) {
                i10 = v1MeaterLinkHeader.hashCode();
            } else {
                i10 = 0;
            }
            int i18 = (hashCode + i10) * 37;
            List<V1MLProbe> list = this.probes;
            if (list != null) {
                i11 = list.hashCode();
            } else {
                i11 = 1;
            }
            int i19 = (i18 + i11) * 37;
            V1ConnectionState v1ConnectionState = this.connectionState;
            if (v1ConnectionState != null) {
                i12 = v1ConnectionState.hashCode();
            } else {
                i12 = 0;
            }
            int i20 = (i19 + i12) * 37;
            V1MasterType v1MasterType = this.masterType;
            if (v1MasterType != null) {
                i13 = v1MasterType.hashCode();
            } else {
                i13 = 0;
            }
            int i21 = (i20 + i13) * 37;
            Integer num = this.masterBatteryLevel;
            if (num != null) {
                i14 = num.hashCode();
            } else {
                i14 = 0;
            }
            int i22 = (i21 + i14) * 37;
            Integer num2 = this.wifiSignalLevel;
            if (num2 != null) {
                i15 = num2.hashCode();
            } else {
                i15 = 0;
            }
            int i23 = (i22 + i15) * 37;
            V1CloudConnectionState v1CloudConnectionState = this.cloudConnectionState;
            if (v1CloudConnectionState != null) {
                i17 = v1CloudConnectionState.hashCode();
            }
            int i24 = i23 + i17;
            ((Message) this).hashCode = i24;
            return i24;
        }
        return i16;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.header != null) {
            sb.append(", header=");
            sb.append(this.header);
        }
        if (this.probes != null) {
            sb.append(", probes=");
            sb.append(this.probes);
        }
        if (this.connectionState != null) {
            sb.append(", connectionState=");
            sb.append(this.connectionState);
        }
        if (this.masterType != null) {
            sb.append(", masterType=");
            sb.append(this.masterType);
        }
        if (this.masterBatteryLevel != null) {
            sb.append(", masterBatteryLevel=");
            sb.append(this.masterBatteryLevel);
        }
        if (this.wifiSignalLevel != null) {
            sb.append(", wifiSignalLevel=");
            sb.append(this.wifiSignalLevel);
        }
        if (this.cloudConnectionState != null) {
            sb.append(", cloudConnectionState=");
            sb.append(this.cloudConnectionState);
        }
        StringBuilder replace = sb.replace(0, 2, "V1MasterMessage{");
        replace.append('}');
        return replace.toString();
    }

    public V1MasterMessage(V1MeaterLinkHeader v1MeaterLinkHeader, List<V1MLProbe> list, V1ConnectionState v1ConnectionState, V1MasterType v1MasterType, Integer num, Integer num2, V1CloudConnectionState v1CloudConnectionState, h hVar) {
        super(ADAPTER, hVar);
        this.header = v1MeaterLinkHeader;
        this.probes = Internal.immutableCopyOf(ProtocolParameters.MEATER_NOTIF_PROBES, list);
        this.connectionState = v1ConnectionState;
        this.masterType = v1MasterType;
        this.masterBatteryLevel = num;
        this.wifiSignalLevel = num2;
        this.cloudConnectionState = v1CloudConnectionState;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m14newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.probes = Internal.copyOf(ProtocolParameters.MEATER_NOTIF_PROBES, this.probes);
        builder.connectionState = this.connectionState;
        builder.masterType = this.masterType;
        builder.masterBatteryLevel = this.masterBatteryLevel;
        builder.wifiSignalLevel = this.wifiSignalLevel;
        builder.cloudConnectionState = this.cloudConnectionState;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
