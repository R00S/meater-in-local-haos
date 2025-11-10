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
public final class MLDevice extends Message<MLDevice, Builder> {
    public static final String DEFAULT_FIRMWAREREVISION = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MLAmber#ADAPTER", tag = 4)
    public final MLAmber amber;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", tag = 11)
    public final Integer bleSignalLevel;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MLBlock#ADAPTER", tag = 3)
    public final MLBlock block;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ChargeState#ADAPTER", label = WireField.Label.REQUIRED, tag = 7)
    public final ChargeState chargeState;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ConnectionState#ADAPTER", label = WireField.Label.REQUIRED, tag = 9)
    public final ConnectionState connectionState;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.DeviceConnectionType#ADAPTER", label = WireField.Label.REQUIRED, tag = 10)
    public final DeviceConnectionType connectionType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String firmwareRevision;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 5)
    public final Long identifier;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MLPlus#ADAPTER", tag = 2)
    public final MLPlus plus;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MLProbe#ADAPTER", tag = 1)
    public final MLProbe probe;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 6)
    public final Integer probeNumber;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", tag = 12)
    public final Integer wifiSignalLevel;
    public static final ProtoAdapter<MLDevice> ADAPTER = new ProtoAdapter_MLDevice();
    public static final Long DEFAULT_IDENTIFIER = 0L;
    public static final Integer DEFAULT_PROBENUMBER = 0;
    public static final ConnectionState DEFAULT_CONNECTIONSTATE = ConnectionState.CONNECTION_STATE_OFFLINE;
    public static final DeviceConnectionType DEFAULT_CONNECTIONTYPE = DeviceConnectionType.BLE;
    public static final Integer DEFAULT_BLESIGNALLEVEL = 0;
    public static final Integer DEFAULT_WIFISIGNALLEVEL = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MLDevice, Builder> {
        public MLAmber amber;
        public Integer bleSignalLevel;
        public MLBlock block;
        public ChargeState chargeState;
        public ConnectionState connectionState;
        public DeviceConnectionType connectionType;
        public String firmwareRevision;
        public Long identifier;
        public MLPlus plus;
        public MLProbe probe;
        public Integer probeNumber;
        public Integer wifiSignalLevel;

        public Builder amber(MLAmber mLAmber) {
            this.amber = mLAmber;
            this.probe = null;
            this.plus = null;
            this.block = null;
            return this;
        }

        public Builder bleSignalLevel(Integer num) {
            this.bleSignalLevel = num;
            return this;
        }

        public Builder block(MLBlock mLBlock) {
            this.block = mLBlock;
            this.probe = null;
            this.plus = null;
            this.amber = null;
            return this;
        }

        public Builder chargeState(ChargeState chargeState) {
            this.chargeState = chargeState;
            return this;
        }

        public Builder connectionState(ConnectionState connectionState) {
            this.connectionState = connectionState;
            return this;
        }

        public Builder connectionType(DeviceConnectionType deviceConnectionType) {
            this.connectionType = deviceConnectionType;
            return this;
        }

        public Builder firmwareRevision(String str) {
            this.firmwareRevision = str;
            return this;
        }

        public Builder identifier(Long l10) {
            this.identifier = l10;
            return this;
        }

        public Builder plus(MLPlus mLPlus) {
            this.plus = mLPlus;
            this.probe = null;
            this.block = null;
            this.amber = null;
            return this;
        }

        public Builder probe(MLProbe mLProbe) {
            this.probe = mLProbe;
            this.plus = null;
            this.block = null;
            this.amber = null;
            return this;
        }

        public Builder probeNumber(Integer num) {
            this.probeNumber = num;
            return this;
        }

        public Builder wifiSignalLevel(Integer num) {
            this.wifiSignalLevel = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MLDevice m258build() {
            Long l10 = this.identifier;
            if (l10 != null && this.probeNumber != null && this.chargeState != null && this.connectionState != null && this.connectionType != null) {
                return new MLDevice(this.identifier, this.probeNumber, this.chargeState, this.firmwareRevision, this.connectionState, this.connectionType, this.bleSignalLevel, this.wifiSignalLevel, this.probe, this.plus, this.block, this.amber, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "identifier", this.probeNumber, "probeNumber", this.chargeState, "chargeState", this.connectionState, "connectionState", this.connectionType, "connectionType"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MLDevice extends ProtoAdapter<MLDevice> {
        ProtoAdapter_MLDevice() {
            super(FieldEncoding.LENGTH_DELIMITED, MLDevice.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MLDevice m259decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.probe((MLProbe) MLProbe.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.plus((MLPlus) MLPlus.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.block((MLBlock) MLBlock.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.amber((MLAmber) MLAmber.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.identifier((Long) ProtoAdapter.FIXED64.decode(protoReader));
                            break;
                        case 6:
                            builder.probeNumber((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 7:
                            builder.chargeState((ChargeState) ChargeState.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            builder.firmwareRevision((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            try {
                                builder.connectionState((ConnectionState) ConnectionState.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        case 10:
                            try {
                                builder.connectionType((DeviceConnectionType) DeviceConnectionType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e11.value));
                                break;
                            }
                        case 11:
                            builder.bleSignalLevel((Integer) ProtoAdapter.SINT32.decode(protoReader));
                            break;
                        case 12:
                            builder.wifiSignalLevel((Integer) ProtoAdapter.SINT32.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m258build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MLDevice mLDevice) {
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 5, mLDevice.identifier);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 6, mLDevice.probeNumber);
            ChargeState.ADAPTER.encodeWithTag(protoWriter, 7, mLDevice.chargeState);
            String str = mLDevice.firmwareRevision;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, str);
            }
            ConnectionState.ADAPTER.encodeWithTag(protoWriter, 9, mLDevice.connectionState);
            DeviceConnectionType.ADAPTER.encodeWithTag(protoWriter, 10, mLDevice.connectionType);
            Integer num = mLDevice.bleSignalLevel;
            if (num != null) {
                ProtoAdapter.SINT32.encodeWithTag(protoWriter, 11, num);
            }
            Integer num2 = mLDevice.wifiSignalLevel;
            if (num2 != null) {
                ProtoAdapter.SINT32.encodeWithTag(protoWriter, 12, num2);
            }
            MLProbe mLProbe = mLDevice.probe;
            if (mLProbe != null) {
                MLProbe.ADAPTER.encodeWithTag(protoWriter, 1, mLProbe);
            }
            MLPlus mLPlus = mLDevice.plus;
            if (mLPlus != null) {
                MLPlus.ADAPTER.encodeWithTag(protoWriter, 2, mLPlus);
            }
            MLBlock mLBlock = mLDevice.block;
            if (mLBlock != null) {
                MLBlock.ADAPTER.encodeWithTag(protoWriter, 3, mLBlock);
            }
            MLAmber mLAmber = mLDevice.amber;
            if (mLAmber != null) {
                MLAmber.ADAPTER.encodeWithTag(protoWriter, 4, mLAmber);
            }
            protoWriter.writeBytes(mLDevice.unknownFields());
        }

        public int encodedSize(MLDevice mLDevice) {
            int encodedSizeWithTag = ProtoAdapter.FIXED64.encodedSizeWithTag(5, mLDevice.identifier) + ProtoAdapter.UINT32.encodedSizeWithTag(6, mLDevice.probeNumber) + ChargeState.ADAPTER.encodedSizeWithTag(7, mLDevice.chargeState);
            String str = mLDevice.firmwareRevision;
            int encodedSizeWithTag2 = encodedSizeWithTag + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(8, str) : 0) + ConnectionState.ADAPTER.encodedSizeWithTag(9, mLDevice.connectionState) + DeviceConnectionType.ADAPTER.encodedSizeWithTag(10, mLDevice.connectionType);
            Integer num = mLDevice.bleSignalLevel;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + (num != null ? ProtoAdapter.SINT32.encodedSizeWithTag(11, num) : 0);
            Integer num2 = mLDevice.wifiSignalLevel;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + (num2 != null ? ProtoAdapter.SINT32.encodedSizeWithTag(12, num2) : 0);
            MLProbe mLProbe = mLDevice.probe;
            int encodedSizeWithTag5 = encodedSizeWithTag4 + (mLProbe != null ? MLProbe.ADAPTER.encodedSizeWithTag(1, mLProbe) : 0);
            MLPlus mLPlus = mLDevice.plus;
            int encodedSizeWithTag6 = encodedSizeWithTag5 + (mLPlus != null ? MLPlus.ADAPTER.encodedSizeWithTag(2, mLPlus) : 0);
            MLBlock mLBlock = mLDevice.block;
            int encodedSizeWithTag7 = encodedSizeWithTag6 + (mLBlock != null ? MLBlock.ADAPTER.encodedSizeWithTag(3, mLBlock) : 0);
            MLAmber mLAmber = mLDevice.amber;
            return encodedSizeWithTag7 + (mLAmber != null ? MLAmber.ADAPTER.encodedSizeWithTag(4, mLAmber) : 0) + mLDevice.unknownFields().I();
        }

        public MLDevice redact(MLDevice mLDevice) {
            Builder m257newBuilder = mLDevice.m257newBuilder();
            ChargeState chargeState = m257newBuilder.chargeState;
            if (chargeState != null) {
                m257newBuilder.chargeState = (ChargeState) ChargeState.ADAPTER.redact(chargeState);
            }
            MLProbe mLProbe = m257newBuilder.probe;
            if (mLProbe != null) {
                m257newBuilder.probe = (MLProbe) MLProbe.ADAPTER.redact(mLProbe);
            }
            MLPlus mLPlus = m257newBuilder.plus;
            if (mLPlus != null) {
                m257newBuilder.plus = (MLPlus) MLPlus.ADAPTER.redact(mLPlus);
            }
            MLBlock mLBlock = m257newBuilder.block;
            if (mLBlock != null) {
                m257newBuilder.block = (MLBlock) MLBlock.ADAPTER.redact(mLBlock);
            }
            MLAmber mLAmber = m257newBuilder.amber;
            if (mLAmber != null) {
                m257newBuilder.amber = (MLAmber) MLAmber.ADAPTER.redact(mLAmber);
            }
            m257newBuilder.clearUnknownFields();
            return m257newBuilder.m258build();
        }
    }

    public MLDevice(Long l10, Integer num, ChargeState chargeState, String str, ConnectionState connectionState, DeviceConnectionType deviceConnectionType, Integer num2, Integer num3, MLProbe mLProbe, MLPlus mLPlus, MLBlock mLBlock, MLAmber mLAmber) {
        this(l10, num, chargeState, str, connectionState, deviceConnectionType, num2, num3, mLProbe, mLPlus, mLBlock, mLAmber, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MLDevice)) {
            return false;
        }
        MLDevice mLDevice = (MLDevice) obj;
        if (Internal.equals(unknownFields(), mLDevice.unknownFields()) && Internal.equals(this.identifier, mLDevice.identifier) && Internal.equals(this.probeNumber, mLDevice.probeNumber) && Internal.equals(this.chargeState, mLDevice.chargeState) && Internal.equals(this.firmwareRevision, mLDevice.firmwareRevision) && Internal.equals(this.connectionState, mLDevice.connectionState) && Internal.equals(this.connectionType, mLDevice.connectionType) && Internal.equals(this.bleSignalLevel, mLDevice.bleSignalLevel) && Internal.equals(this.wifiSignalLevel, mLDevice.wifiSignalLevel) && Internal.equals(this.probe, mLDevice.probe) && Internal.equals(this.plus, mLDevice.plus) && Internal.equals(this.block, mLDevice.block) && Internal.equals(this.amber, mLDevice.amber)) {
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
            Long l10 = this.identifier;
            int i22 = 0;
            if (l10 != null) {
                i10 = l10.hashCode();
            } else {
                i10 = 0;
            }
            int i23 = (hashCode + i10) * 37;
            Integer num = this.probeNumber;
            if (num != null) {
                i11 = num.hashCode();
            } else {
                i11 = 0;
            }
            int i24 = (i23 + i11) * 37;
            ChargeState chargeState = this.chargeState;
            if (chargeState != null) {
                i12 = chargeState.hashCode();
            } else {
                i12 = 0;
            }
            int i25 = (i24 + i12) * 37;
            String str = this.firmwareRevision;
            if (str != null) {
                i13 = str.hashCode();
            } else {
                i13 = 0;
            }
            int i26 = (i25 + i13) * 37;
            ConnectionState connectionState = this.connectionState;
            if (connectionState != null) {
                i14 = connectionState.hashCode();
            } else {
                i14 = 0;
            }
            int i27 = (i26 + i14) * 37;
            DeviceConnectionType deviceConnectionType = this.connectionType;
            if (deviceConnectionType != null) {
                i15 = deviceConnectionType.hashCode();
            } else {
                i15 = 0;
            }
            int i28 = (i27 + i15) * 37;
            Integer num2 = this.bleSignalLevel;
            if (num2 != null) {
                i16 = num2.hashCode();
            } else {
                i16 = 0;
            }
            int i29 = (i28 + i16) * 37;
            Integer num3 = this.wifiSignalLevel;
            if (num3 != null) {
                i17 = num3.hashCode();
            } else {
                i17 = 0;
            }
            int i30 = (i29 + i17) * 37;
            MLProbe mLProbe = this.probe;
            if (mLProbe != null) {
                i18 = mLProbe.hashCode();
            } else {
                i18 = 0;
            }
            int i31 = (i30 + i18) * 37;
            MLPlus mLPlus = this.plus;
            if (mLPlus != null) {
                i19 = mLPlus.hashCode();
            } else {
                i19 = 0;
            }
            int i32 = (i31 + i19) * 37;
            MLBlock mLBlock = this.block;
            if (mLBlock != null) {
                i20 = mLBlock.hashCode();
            } else {
                i20 = 0;
            }
            int i33 = (i32 + i20) * 37;
            MLAmber mLAmber = this.amber;
            if (mLAmber != null) {
                i22 = mLAmber.hashCode();
            }
            int i34 = i33 + i22;
            ((Message) this).hashCode = i34;
            return i34;
        }
        return i21;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.identifier != null) {
            sb.append(", identifier=");
            sb.append(this.identifier);
        }
        if (this.probeNumber != null) {
            sb.append(", probeNumber=");
            sb.append(this.probeNumber);
        }
        if (this.chargeState != null) {
            sb.append(", chargeState=");
            sb.append(this.chargeState);
        }
        if (this.firmwareRevision != null) {
            sb.append(", firmwareRevision=");
            sb.append(this.firmwareRevision);
        }
        if (this.connectionState != null) {
            sb.append(", connectionState=");
            sb.append(this.connectionState);
        }
        if (this.connectionType != null) {
            sb.append(", connectionType=");
            sb.append(this.connectionType);
        }
        if (this.bleSignalLevel != null) {
            sb.append(", bleSignalLevel=");
            sb.append(this.bleSignalLevel);
        }
        if (this.wifiSignalLevel != null) {
            sb.append(", wifiSignalLevel=");
            sb.append(this.wifiSignalLevel);
        }
        if (this.probe != null) {
            sb.append(", probe=");
            sb.append(this.probe);
        }
        if (this.plus != null) {
            sb.append(", plus=");
            sb.append(this.plus);
        }
        if (this.block != null) {
            sb.append(", block=");
            sb.append(this.block);
        }
        if (this.amber != null) {
            sb.append(", amber=");
            sb.append(this.amber);
        }
        StringBuilder replace = sb.replace(0, 2, "MLDevice{");
        replace.append('}');
        return replace.toString();
    }

    public MLDevice(Long l10, Integer num, ChargeState chargeState, String str, ConnectionState connectionState, DeviceConnectionType deviceConnectionType, Integer num2, Integer num3, MLProbe mLProbe, MLPlus mLPlus, MLBlock mLBlock, MLAmber mLAmber, h hVar) {
        super(ADAPTER, hVar);
        if (Internal.countNonNull(mLProbe, mLPlus, mLBlock, mLAmber, new Object[0]) > 1) {
            throw new IllegalArgumentException("at most one of probe, plus, block, amber may be non-null");
        }
        this.identifier = l10;
        this.probeNumber = num;
        this.chargeState = chargeState;
        this.firmwareRevision = str;
        this.connectionState = connectionState;
        this.connectionType = deviceConnectionType;
        this.bleSignalLevel = num2;
        this.wifiSignalLevel = num3;
        this.probe = mLProbe;
        this.plus = mLPlus;
        this.block = mLBlock;
        this.amber = mLAmber;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m257newBuilder() {
        Builder builder = new Builder();
        builder.identifier = this.identifier;
        builder.probeNumber = this.probeNumber;
        builder.chargeState = this.chargeState;
        builder.firmwareRevision = this.firmwareRevision;
        builder.connectionState = this.connectionState;
        builder.connectionType = this.connectionType;
        builder.bleSignalLevel = this.bleSignalLevel;
        builder.wifiSignalLevel = this.wifiSignalLevel;
        builder.probe = this.probe;
        builder.plus = this.plus;
        builder.block = this.block;
        builder.amber = this.amber;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
