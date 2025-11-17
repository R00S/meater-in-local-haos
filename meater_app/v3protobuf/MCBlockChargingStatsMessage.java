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
public final class MCBlockChargingStatsMessage extends Message<MCBlockChargingStatsMessage, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 10)
    public final Integer batteryFaultCount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer batteryPercent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer chargeControllerDeviceID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 4)
    public final Integer chargerConnectCount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer estimatedMinutesRemaining;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 8)
    public final Integer inputFaultCount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 9)
    public final Integer inputManagementCount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 12)
    public final Integer jeitaModeCount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 14)
    public final Integer nowBatteryTemperature_C;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 6)
    public final Integer peakBatteryTemperature_C;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 7)
    public final Integer preChargeCount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 11)
    public final Integer thermalIssueCount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 5)
    public final Integer totalMinutesCharging;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 13)
    public final Integer writeFlashCountBLE;
    public static final ProtoAdapter<MCBlockChargingStatsMessage> ADAPTER = new ProtoAdapter_MCBlockChargingStatsMessage();
    public static final Integer DEFAULT_CHARGECONTROLLERDEVICEID = 0;
    public static final Integer DEFAULT_BATTERYPERCENT = 0;
    public static final Integer DEFAULT_ESTIMATEDMINUTESREMAINING = 0;
    public static final Integer DEFAULT_NOWBATTERYTEMPERATURE_C = 0;
    public static final Integer DEFAULT_PEAKBATTERYTEMPERATURE_C = 0;
    public static final Integer DEFAULT_TOTALMINUTESCHARGING = 0;
    public static final Integer DEFAULT_CHARGERCONNECTCOUNT = 0;
    public static final Integer DEFAULT_PRECHARGECOUNT = 0;
    public static final Integer DEFAULT_INPUTFAULTCOUNT = 0;
    public static final Integer DEFAULT_INPUTMANAGEMENTCOUNT = 0;
    public static final Integer DEFAULT_BATTERYFAULTCOUNT = 0;
    public static final Integer DEFAULT_THERMALISSUECOUNT = 0;
    public static final Integer DEFAULT_JEITAMODECOUNT = 0;
    public static final Integer DEFAULT_WRITEFLASHCOUNTBLE = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MCBlockChargingStatsMessage, Builder> {
        public Integer batteryFaultCount;
        public Integer batteryPercent;
        public Integer chargeControllerDeviceID;
        public Integer chargerConnectCount;
        public Integer estimatedMinutesRemaining;
        public Integer inputFaultCount;
        public Integer inputManagementCount;
        public Integer jeitaModeCount;
        public Integer nowBatteryTemperature_C;
        public Integer peakBatteryTemperature_C;
        public Integer preChargeCount;
        public Integer thermalIssueCount;
        public Integer totalMinutesCharging;
        public Integer writeFlashCountBLE;

        public Builder batteryFaultCount(Integer num) {
            this.batteryFaultCount = num;
            return this;
        }

        public Builder batteryPercent(Integer num) {
            this.batteryPercent = num;
            return this;
        }

        public Builder chargeControllerDeviceID(Integer num) {
            this.chargeControllerDeviceID = num;
            return this;
        }

        public Builder chargerConnectCount(Integer num) {
            this.chargerConnectCount = num;
            return this;
        }

        public Builder estimatedMinutesRemaining(Integer num) {
            this.estimatedMinutesRemaining = num;
            return this;
        }

        public Builder inputFaultCount(Integer num) {
            this.inputFaultCount = num;
            return this;
        }

        public Builder inputManagementCount(Integer num) {
            this.inputManagementCount = num;
            return this;
        }

        public Builder jeitaModeCount(Integer num) {
            this.jeitaModeCount = num;
            return this;
        }

        public Builder nowBatteryTemperature_C(Integer num) {
            this.nowBatteryTemperature_C = num;
            return this;
        }

        public Builder peakBatteryTemperature_C(Integer num) {
            this.peakBatteryTemperature_C = num;
            return this;
        }

        public Builder preChargeCount(Integer num) {
            this.preChargeCount = num;
            return this;
        }

        public Builder thermalIssueCount(Integer num) {
            this.thermalIssueCount = num;
            return this;
        }

        public Builder totalMinutesCharging(Integer num) {
            this.totalMinutesCharging = num;
            return this;
        }

        public Builder writeFlashCountBLE(Integer num) {
            this.writeFlashCountBLE = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MCBlockChargingStatsMessage m189build() {
            Integer num = this.chargeControllerDeviceID;
            if (num != null && this.batteryPercent != null && this.estimatedMinutesRemaining != null && this.nowBatteryTemperature_C != null && this.peakBatteryTemperature_C != null && this.totalMinutesCharging != null && this.chargerConnectCount != null && this.preChargeCount != null && this.inputFaultCount != null && this.inputManagementCount != null && this.batteryFaultCount != null && this.thermalIssueCount != null && this.jeitaModeCount != null && this.writeFlashCountBLE != null) {
                return new MCBlockChargingStatsMessage(this.chargeControllerDeviceID, this.batteryPercent, this.estimatedMinutesRemaining, this.nowBatteryTemperature_C, this.peakBatteryTemperature_C, this.totalMinutesCharging, this.chargerConnectCount, this.preChargeCount, this.inputFaultCount, this.inputManagementCount, this.batteryFaultCount, this.thermalIssueCount, this.jeitaModeCount, this.writeFlashCountBLE, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "chargeControllerDeviceID", this.batteryPercent, "batteryPercent", this.estimatedMinutesRemaining, "estimatedMinutesRemaining", this.nowBatteryTemperature_C, "nowBatteryTemperature_C", this.peakBatteryTemperature_C, "peakBatteryTemperature_C", this.totalMinutesCharging, "totalMinutesCharging", this.chargerConnectCount, "chargerConnectCount", this.preChargeCount, "preChargeCount", this.inputFaultCount, "inputFaultCount", this.inputManagementCount, "inputManagementCount", this.batteryFaultCount, "batteryFaultCount", this.thermalIssueCount, "thermalIssueCount", this.jeitaModeCount, "jeitaModeCount", this.writeFlashCountBLE, "writeFlashCountBLE"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MCBlockChargingStatsMessage extends ProtoAdapter<MCBlockChargingStatsMessage> {
        ProtoAdapter_MCBlockChargingStatsMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, MCBlockChargingStatsMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MCBlockChargingStatsMessage m190decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.chargeControllerDeviceID((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 2:
                            builder.batteryPercent((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 3:
                            builder.estimatedMinutesRemaining((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 4:
                            builder.chargerConnectCount((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 5:
                            builder.totalMinutesCharging((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 6:
                            builder.peakBatteryTemperature_C((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            builder.preChargeCount((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 8:
                            builder.inputFaultCount((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 9:
                            builder.inputManagementCount((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 10:
                            builder.batteryFaultCount((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 11:
                            builder.thermalIssueCount((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 12:
                            builder.jeitaModeCount((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 13:
                            builder.writeFlashCountBLE((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 14:
                            builder.nowBatteryTemperature_C((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m189build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MCBlockChargingStatsMessage mCBlockChargingStatsMessage) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, mCBlockChargingStatsMessage.chargeControllerDeviceID);
            protoAdapter.encodeWithTag(protoWriter, 2, mCBlockChargingStatsMessage.batteryPercent);
            protoAdapter.encodeWithTag(protoWriter, 3, mCBlockChargingStatsMessage.estimatedMinutesRemaining);
            ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 14, mCBlockChargingStatsMessage.nowBatteryTemperature_C);
            protoAdapter2.encodeWithTag(protoWriter, 6, mCBlockChargingStatsMessage.peakBatteryTemperature_C);
            protoAdapter.encodeWithTag(protoWriter, 5, mCBlockChargingStatsMessage.totalMinutesCharging);
            protoAdapter.encodeWithTag(protoWriter, 4, mCBlockChargingStatsMessage.chargerConnectCount);
            protoAdapter.encodeWithTag(protoWriter, 7, mCBlockChargingStatsMessage.preChargeCount);
            protoAdapter.encodeWithTag(protoWriter, 8, mCBlockChargingStatsMessage.inputFaultCount);
            protoAdapter.encodeWithTag(protoWriter, 9, mCBlockChargingStatsMessage.inputManagementCount);
            protoAdapter.encodeWithTag(protoWriter, 10, mCBlockChargingStatsMessage.batteryFaultCount);
            protoAdapter.encodeWithTag(protoWriter, 11, mCBlockChargingStatsMessage.thermalIssueCount);
            protoAdapter.encodeWithTag(protoWriter, 12, mCBlockChargingStatsMessage.jeitaModeCount);
            protoAdapter.encodeWithTag(protoWriter, 13, mCBlockChargingStatsMessage.writeFlashCountBLE);
            protoWriter.writeBytes(mCBlockChargingStatsMessage.unknownFields());
        }

        public int encodedSize(MCBlockChargingStatsMessage mCBlockChargingStatsMessage) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, mCBlockChargingStatsMessage.chargeControllerDeviceID) + protoAdapter.encodedSizeWithTag(2, mCBlockChargingStatsMessage.batteryPercent) + protoAdapter.encodedSizeWithTag(3, mCBlockChargingStatsMessage.estimatedMinutesRemaining);
            ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
            return encodedSizeWithTag + protoAdapter2.encodedSizeWithTag(14, mCBlockChargingStatsMessage.nowBatteryTemperature_C) + protoAdapter2.encodedSizeWithTag(6, mCBlockChargingStatsMessage.peakBatteryTemperature_C) + protoAdapter.encodedSizeWithTag(5, mCBlockChargingStatsMessage.totalMinutesCharging) + protoAdapter.encodedSizeWithTag(4, mCBlockChargingStatsMessage.chargerConnectCount) + protoAdapter.encodedSizeWithTag(7, mCBlockChargingStatsMessage.preChargeCount) + protoAdapter.encodedSizeWithTag(8, mCBlockChargingStatsMessage.inputFaultCount) + protoAdapter.encodedSizeWithTag(9, mCBlockChargingStatsMessage.inputManagementCount) + protoAdapter.encodedSizeWithTag(10, mCBlockChargingStatsMessage.batteryFaultCount) + protoAdapter.encodedSizeWithTag(11, mCBlockChargingStatsMessage.thermalIssueCount) + protoAdapter.encodedSizeWithTag(12, mCBlockChargingStatsMessage.jeitaModeCount) + protoAdapter.encodedSizeWithTag(13, mCBlockChargingStatsMessage.writeFlashCountBLE) + mCBlockChargingStatsMessage.unknownFields().I();
        }

        public MCBlockChargingStatsMessage redact(MCBlockChargingStatsMessage mCBlockChargingStatsMessage) {
            Builder m188newBuilder = mCBlockChargingStatsMessage.m188newBuilder();
            m188newBuilder.clearUnknownFields();
            return m188newBuilder.m189build();
        }
    }

    public MCBlockChargingStatsMessage(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14) {
        this(num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MCBlockChargingStatsMessage)) {
            return false;
        }
        MCBlockChargingStatsMessage mCBlockChargingStatsMessage = (MCBlockChargingStatsMessage) obj;
        if (Internal.equals(unknownFields(), mCBlockChargingStatsMessage.unknownFields()) && Internal.equals(this.chargeControllerDeviceID, mCBlockChargingStatsMessage.chargeControllerDeviceID) && Internal.equals(this.batteryPercent, mCBlockChargingStatsMessage.batteryPercent) && Internal.equals(this.estimatedMinutesRemaining, mCBlockChargingStatsMessage.estimatedMinutesRemaining) && Internal.equals(this.nowBatteryTemperature_C, mCBlockChargingStatsMessage.nowBatteryTemperature_C) && Internal.equals(this.peakBatteryTemperature_C, mCBlockChargingStatsMessage.peakBatteryTemperature_C) && Internal.equals(this.totalMinutesCharging, mCBlockChargingStatsMessage.totalMinutesCharging) && Internal.equals(this.chargerConnectCount, mCBlockChargingStatsMessage.chargerConnectCount) && Internal.equals(this.preChargeCount, mCBlockChargingStatsMessage.preChargeCount) && Internal.equals(this.inputFaultCount, mCBlockChargingStatsMessage.inputFaultCount) && Internal.equals(this.inputManagementCount, mCBlockChargingStatsMessage.inputManagementCount) && Internal.equals(this.batteryFaultCount, mCBlockChargingStatsMessage.batteryFaultCount) && Internal.equals(this.thermalIssueCount, mCBlockChargingStatsMessage.thermalIssueCount) && Internal.equals(this.jeitaModeCount, mCBlockChargingStatsMessage.jeitaModeCount) && Internal.equals(this.writeFlashCountBLE, mCBlockChargingStatsMessage.writeFlashCountBLE)) {
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
        int i23 = ((Message) this).hashCode;
        if (i23 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.chargeControllerDeviceID;
            int i24 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i25 = (hashCode + i10) * 37;
            Integer num2 = this.batteryPercent;
            if (num2 != null) {
                i11 = num2.hashCode();
            } else {
                i11 = 0;
            }
            int i26 = (i25 + i11) * 37;
            Integer num3 = this.estimatedMinutesRemaining;
            if (num3 != null) {
                i12 = num3.hashCode();
            } else {
                i12 = 0;
            }
            int i27 = (i26 + i12) * 37;
            Integer num4 = this.nowBatteryTemperature_C;
            if (num4 != null) {
                i13 = num4.hashCode();
            } else {
                i13 = 0;
            }
            int i28 = (i27 + i13) * 37;
            Integer num5 = this.peakBatteryTemperature_C;
            if (num5 != null) {
                i14 = num5.hashCode();
            } else {
                i14 = 0;
            }
            int i29 = (i28 + i14) * 37;
            Integer num6 = this.totalMinutesCharging;
            if (num6 != null) {
                i15 = num6.hashCode();
            } else {
                i15 = 0;
            }
            int i30 = (i29 + i15) * 37;
            Integer num7 = this.chargerConnectCount;
            if (num7 != null) {
                i16 = num7.hashCode();
            } else {
                i16 = 0;
            }
            int i31 = (i30 + i16) * 37;
            Integer num8 = this.preChargeCount;
            if (num8 != null) {
                i17 = num8.hashCode();
            } else {
                i17 = 0;
            }
            int i32 = (i31 + i17) * 37;
            Integer num9 = this.inputFaultCount;
            if (num9 != null) {
                i18 = num9.hashCode();
            } else {
                i18 = 0;
            }
            int i33 = (i32 + i18) * 37;
            Integer num10 = this.inputManagementCount;
            if (num10 != null) {
                i19 = num10.hashCode();
            } else {
                i19 = 0;
            }
            int i34 = (i33 + i19) * 37;
            Integer num11 = this.batteryFaultCount;
            if (num11 != null) {
                i20 = num11.hashCode();
            } else {
                i20 = 0;
            }
            int i35 = (i34 + i20) * 37;
            Integer num12 = this.thermalIssueCount;
            if (num12 != null) {
                i21 = num12.hashCode();
            } else {
                i21 = 0;
            }
            int i36 = (i35 + i21) * 37;
            Integer num13 = this.jeitaModeCount;
            if (num13 != null) {
                i22 = num13.hashCode();
            } else {
                i22 = 0;
            }
            int i37 = (i36 + i22) * 37;
            Integer num14 = this.writeFlashCountBLE;
            if (num14 != null) {
                i24 = num14.hashCode();
            }
            int i38 = i37 + i24;
            ((Message) this).hashCode = i38;
            return i38;
        }
        return i23;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.chargeControllerDeviceID != null) {
            sb.append(", chargeControllerDeviceID=");
            sb.append(this.chargeControllerDeviceID);
        }
        if (this.batteryPercent != null) {
            sb.append(", batteryPercent=");
            sb.append(this.batteryPercent);
        }
        if (this.estimatedMinutesRemaining != null) {
            sb.append(", estimatedMinutesRemaining=");
            sb.append(this.estimatedMinutesRemaining);
        }
        if (this.nowBatteryTemperature_C != null) {
            sb.append(", nowBatteryTemperature_C=");
            sb.append(this.nowBatteryTemperature_C);
        }
        if (this.peakBatteryTemperature_C != null) {
            sb.append(", peakBatteryTemperature_C=");
            sb.append(this.peakBatteryTemperature_C);
        }
        if (this.totalMinutesCharging != null) {
            sb.append(", totalMinutesCharging=");
            sb.append(this.totalMinutesCharging);
        }
        if (this.chargerConnectCount != null) {
            sb.append(", chargerConnectCount=");
            sb.append(this.chargerConnectCount);
        }
        if (this.preChargeCount != null) {
            sb.append(", preChargeCount=");
            sb.append(this.preChargeCount);
        }
        if (this.inputFaultCount != null) {
            sb.append(", inputFaultCount=");
            sb.append(this.inputFaultCount);
        }
        if (this.inputManagementCount != null) {
            sb.append(", inputManagementCount=");
            sb.append(this.inputManagementCount);
        }
        if (this.batteryFaultCount != null) {
            sb.append(", batteryFaultCount=");
            sb.append(this.batteryFaultCount);
        }
        if (this.thermalIssueCount != null) {
            sb.append(", thermalIssueCount=");
            sb.append(this.thermalIssueCount);
        }
        if (this.jeitaModeCount != null) {
            sb.append(", jeitaModeCount=");
            sb.append(this.jeitaModeCount);
        }
        if (this.writeFlashCountBLE != null) {
            sb.append(", writeFlashCountBLE=");
            sb.append(this.writeFlashCountBLE);
        }
        StringBuilder replace = sb.replace(0, 2, "MCBlockChargingStatsMessage{");
        replace.append('}');
        return replace.toString();
    }

    public MCBlockChargingStatsMessage(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, h hVar) {
        super(ADAPTER, hVar);
        this.chargeControllerDeviceID = num;
        this.batteryPercent = num2;
        this.estimatedMinutesRemaining = num3;
        this.nowBatteryTemperature_C = num4;
        this.peakBatteryTemperature_C = num5;
        this.totalMinutesCharging = num6;
        this.chargerConnectCount = num7;
        this.preChargeCount = num8;
        this.inputFaultCount = num9;
        this.inputManagementCount = num10;
        this.batteryFaultCount = num11;
        this.thermalIssueCount = num12;
        this.jeitaModeCount = num13;
        this.writeFlashCountBLE = num14;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m188newBuilder() {
        Builder builder = new Builder();
        builder.chargeControllerDeviceID = this.chargeControllerDeviceID;
        builder.batteryPercent = this.batteryPercent;
        builder.estimatedMinutesRemaining = this.estimatedMinutesRemaining;
        builder.nowBatteryTemperature_C = this.nowBatteryTemperature_C;
        builder.peakBatteryTemperature_C = this.peakBatteryTemperature_C;
        builder.totalMinutesCharging = this.totalMinutesCharging;
        builder.chargerConnectCount = this.chargerConnectCount;
        builder.preChargeCount = this.preChargeCount;
        builder.inputFaultCount = this.inputFaultCount;
        builder.inputManagementCount = this.inputManagementCount;
        builder.batteryFaultCount = this.batteryFaultCount;
        builder.thermalIssueCount = this.thermalIssueCount;
        builder.jeitaModeCount = this.jeitaModeCount;
        builder.writeFlashCountBLE = this.writeFlashCountBLE;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
