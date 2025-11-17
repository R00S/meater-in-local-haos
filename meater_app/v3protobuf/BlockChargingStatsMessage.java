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
public final class BlockChargingStatsMessage extends Message<BlockChargingStatsMessage, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 10)
    public final Integer batteryFaultCount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer batteryStateOfCharge;

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
    public static final ProtoAdapter<BlockChargingStatsMessage> ADAPTER = new ProtoAdapter_BlockChargingStatsMessage();
    public static final Integer DEFAULT_CHARGECONTROLLERDEVICEID = 0;
    public static final Integer DEFAULT_BATTERYSTATEOFCHARGE = 0;
    public static final Integer DEFAULT_ESTIMATEDMINUTESREMAINING = 0;
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
    public static final class Builder extends Message.Builder<BlockChargingStatsMessage, Builder> {
        public Integer batteryFaultCount;
        public Integer batteryStateOfCharge;
        public Integer chargeControllerDeviceID;
        public Integer chargerConnectCount;
        public Integer estimatedMinutesRemaining;
        public Integer inputFaultCount;
        public Integer inputManagementCount;
        public Integer jeitaModeCount;
        public Integer peakBatteryTemperature_C;
        public Integer preChargeCount;
        public Integer thermalIssueCount;
        public Integer totalMinutesCharging;
        public Integer writeFlashCountBLE;

        public Builder batteryFaultCount(Integer num) {
            this.batteryFaultCount = num;
            return this;
        }

        public Builder batteryStateOfCharge(Integer num) {
            this.batteryStateOfCharge = num;
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
        public BlockChargingStatsMessage m156build() {
            Integer num = this.chargeControllerDeviceID;
            if (num != null && this.batteryStateOfCharge != null && this.estimatedMinutesRemaining != null && this.peakBatteryTemperature_C != null && this.totalMinutesCharging != null && this.chargerConnectCount != null && this.preChargeCount != null && this.inputFaultCount != null && this.inputManagementCount != null && this.batteryFaultCount != null && this.thermalIssueCount != null && this.jeitaModeCount != null && this.writeFlashCountBLE != null) {
                return new BlockChargingStatsMessage(this.chargeControllerDeviceID, this.batteryStateOfCharge, this.estimatedMinutesRemaining, this.peakBatteryTemperature_C, this.totalMinutesCharging, this.chargerConnectCount, this.preChargeCount, this.inputFaultCount, this.inputManagementCount, this.batteryFaultCount, this.thermalIssueCount, this.jeitaModeCount, this.writeFlashCountBLE, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "chargeControllerDeviceID", this.batteryStateOfCharge, "batteryStateOfCharge", this.estimatedMinutesRemaining, "estimatedMinutesRemaining", this.peakBatteryTemperature_C, "peakBatteryTemperature_C", this.totalMinutesCharging, "totalMinutesCharging", this.chargerConnectCount, "chargerConnectCount", this.preChargeCount, "preChargeCount", this.inputFaultCount, "inputFaultCount", this.inputManagementCount, "inputManagementCount", this.batteryFaultCount, "batteryFaultCount", this.thermalIssueCount, "thermalIssueCount", this.jeitaModeCount, "jeitaModeCount", this.writeFlashCountBLE, "writeFlashCountBLE"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_BlockChargingStatsMessage extends ProtoAdapter<BlockChargingStatsMessage> {
        ProtoAdapter_BlockChargingStatsMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, BlockChargingStatsMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public BlockChargingStatsMessage m157decode(ProtoReader protoReader) {
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
                            builder.batteryStateOfCharge((Integer) ProtoAdapter.UINT32.decode(protoReader));
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
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m156build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, BlockChargingStatsMessage blockChargingStatsMessage) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, blockChargingStatsMessage.chargeControllerDeviceID);
            protoAdapter.encodeWithTag(protoWriter, 2, blockChargingStatsMessage.batteryStateOfCharge);
            protoAdapter.encodeWithTag(protoWriter, 3, blockChargingStatsMessage.estimatedMinutesRemaining);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, blockChargingStatsMessage.peakBatteryTemperature_C);
            protoAdapter.encodeWithTag(protoWriter, 5, blockChargingStatsMessage.totalMinutesCharging);
            protoAdapter.encodeWithTag(protoWriter, 4, blockChargingStatsMessage.chargerConnectCount);
            protoAdapter.encodeWithTag(protoWriter, 7, blockChargingStatsMessage.preChargeCount);
            protoAdapter.encodeWithTag(protoWriter, 8, blockChargingStatsMessage.inputFaultCount);
            protoAdapter.encodeWithTag(protoWriter, 9, blockChargingStatsMessage.inputManagementCount);
            protoAdapter.encodeWithTag(protoWriter, 10, blockChargingStatsMessage.batteryFaultCount);
            protoAdapter.encodeWithTag(protoWriter, 11, blockChargingStatsMessage.thermalIssueCount);
            protoAdapter.encodeWithTag(protoWriter, 12, blockChargingStatsMessage.jeitaModeCount);
            protoAdapter.encodeWithTag(protoWriter, 13, blockChargingStatsMessage.writeFlashCountBLE);
            protoWriter.writeBytes(blockChargingStatsMessage.unknownFields());
        }

        public int encodedSize(BlockChargingStatsMessage blockChargingStatsMessage) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            return protoAdapter.encodedSizeWithTag(1, blockChargingStatsMessage.chargeControllerDeviceID) + protoAdapter.encodedSizeWithTag(2, blockChargingStatsMessage.batteryStateOfCharge) + protoAdapter.encodedSizeWithTag(3, blockChargingStatsMessage.estimatedMinutesRemaining) + ProtoAdapter.INT32.encodedSizeWithTag(6, blockChargingStatsMessage.peakBatteryTemperature_C) + protoAdapter.encodedSizeWithTag(5, blockChargingStatsMessage.totalMinutesCharging) + protoAdapter.encodedSizeWithTag(4, blockChargingStatsMessage.chargerConnectCount) + protoAdapter.encodedSizeWithTag(7, blockChargingStatsMessage.preChargeCount) + protoAdapter.encodedSizeWithTag(8, blockChargingStatsMessage.inputFaultCount) + protoAdapter.encodedSizeWithTag(9, blockChargingStatsMessage.inputManagementCount) + protoAdapter.encodedSizeWithTag(10, blockChargingStatsMessage.batteryFaultCount) + protoAdapter.encodedSizeWithTag(11, blockChargingStatsMessage.thermalIssueCount) + protoAdapter.encodedSizeWithTag(12, blockChargingStatsMessage.jeitaModeCount) + protoAdapter.encodedSizeWithTag(13, blockChargingStatsMessage.writeFlashCountBLE) + blockChargingStatsMessage.unknownFields().I();
        }

        public BlockChargingStatsMessage redact(BlockChargingStatsMessage blockChargingStatsMessage) {
            Builder m155newBuilder = blockChargingStatsMessage.m155newBuilder();
            m155newBuilder.clearUnknownFields();
            return m155newBuilder.m156build();
        }
    }

    public BlockChargingStatsMessage(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13) {
        this(num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlockChargingStatsMessage)) {
            return false;
        }
        BlockChargingStatsMessage blockChargingStatsMessage = (BlockChargingStatsMessage) obj;
        if (Internal.equals(unknownFields(), blockChargingStatsMessage.unknownFields()) && Internal.equals(this.chargeControllerDeviceID, blockChargingStatsMessage.chargeControllerDeviceID) && Internal.equals(this.batteryStateOfCharge, blockChargingStatsMessage.batteryStateOfCharge) && Internal.equals(this.estimatedMinutesRemaining, blockChargingStatsMessage.estimatedMinutesRemaining) && Internal.equals(this.peakBatteryTemperature_C, blockChargingStatsMessage.peakBatteryTemperature_C) && Internal.equals(this.totalMinutesCharging, blockChargingStatsMessage.totalMinutesCharging) && Internal.equals(this.chargerConnectCount, blockChargingStatsMessage.chargerConnectCount) && Internal.equals(this.preChargeCount, blockChargingStatsMessage.preChargeCount) && Internal.equals(this.inputFaultCount, blockChargingStatsMessage.inputFaultCount) && Internal.equals(this.inputManagementCount, blockChargingStatsMessage.inputManagementCount) && Internal.equals(this.batteryFaultCount, blockChargingStatsMessage.batteryFaultCount) && Internal.equals(this.thermalIssueCount, blockChargingStatsMessage.thermalIssueCount) && Internal.equals(this.jeitaModeCount, blockChargingStatsMessage.jeitaModeCount) && Internal.equals(this.writeFlashCountBLE, blockChargingStatsMessage.writeFlashCountBLE)) {
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
        int i22 = ((Message) this).hashCode;
        if (i22 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.chargeControllerDeviceID;
            int i23 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i24 = (hashCode + i10) * 37;
            Integer num2 = this.batteryStateOfCharge;
            if (num2 != null) {
                i11 = num2.hashCode();
            } else {
                i11 = 0;
            }
            int i25 = (i24 + i11) * 37;
            Integer num3 = this.estimatedMinutesRemaining;
            if (num3 != null) {
                i12 = num3.hashCode();
            } else {
                i12 = 0;
            }
            int i26 = (i25 + i12) * 37;
            Integer num4 = this.peakBatteryTemperature_C;
            if (num4 != null) {
                i13 = num4.hashCode();
            } else {
                i13 = 0;
            }
            int i27 = (i26 + i13) * 37;
            Integer num5 = this.totalMinutesCharging;
            if (num5 != null) {
                i14 = num5.hashCode();
            } else {
                i14 = 0;
            }
            int i28 = (i27 + i14) * 37;
            Integer num6 = this.chargerConnectCount;
            if (num6 != null) {
                i15 = num6.hashCode();
            } else {
                i15 = 0;
            }
            int i29 = (i28 + i15) * 37;
            Integer num7 = this.preChargeCount;
            if (num7 != null) {
                i16 = num7.hashCode();
            } else {
                i16 = 0;
            }
            int i30 = (i29 + i16) * 37;
            Integer num8 = this.inputFaultCount;
            if (num8 != null) {
                i17 = num8.hashCode();
            } else {
                i17 = 0;
            }
            int i31 = (i30 + i17) * 37;
            Integer num9 = this.inputManagementCount;
            if (num9 != null) {
                i18 = num9.hashCode();
            } else {
                i18 = 0;
            }
            int i32 = (i31 + i18) * 37;
            Integer num10 = this.batteryFaultCount;
            if (num10 != null) {
                i19 = num10.hashCode();
            } else {
                i19 = 0;
            }
            int i33 = (i32 + i19) * 37;
            Integer num11 = this.thermalIssueCount;
            if (num11 != null) {
                i20 = num11.hashCode();
            } else {
                i20 = 0;
            }
            int i34 = (i33 + i20) * 37;
            Integer num12 = this.jeitaModeCount;
            if (num12 != null) {
                i21 = num12.hashCode();
            } else {
                i21 = 0;
            }
            int i35 = (i34 + i21) * 37;
            Integer num13 = this.writeFlashCountBLE;
            if (num13 != null) {
                i23 = num13.hashCode();
            }
            int i36 = i35 + i23;
            ((Message) this).hashCode = i36;
            return i36;
        }
        return i22;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.chargeControllerDeviceID != null) {
            sb.append(", chargeControllerDeviceID=");
            sb.append(this.chargeControllerDeviceID);
        }
        if (this.batteryStateOfCharge != null) {
            sb.append(", batteryStateOfCharge=");
            sb.append(this.batteryStateOfCharge);
        }
        if (this.estimatedMinutesRemaining != null) {
            sb.append(", estimatedMinutesRemaining=");
            sb.append(this.estimatedMinutesRemaining);
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
        StringBuilder replace = sb.replace(0, 2, "BlockChargingStatsMessage{");
        replace.append('}');
        return replace.toString();
    }

    public BlockChargingStatsMessage(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, h hVar) {
        super(ADAPTER, hVar);
        this.chargeControllerDeviceID = num;
        this.batteryStateOfCharge = num2;
        this.estimatedMinutesRemaining = num3;
        this.peakBatteryTemperature_C = num4;
        this.totalMinutesCharging = num5;
        this.chargerConnectCount = num6;
        this.preChargeCount = num7;
        this.inputFaultCount = num8;
        this.inputManagementCount = num9;
        this.batteryFaultCount = num10;
        this.thermalIssueCount = num11;
        this.jeitaModeCount = num12;
        this.writeFlashCountBLE = num13;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m155newBuilder() {
        Builder builder = new Builder();
        builder.chargeControllerDeviceID = this.chargeControllerDeviceID;
        builder.batteryStateOfCharge = this.batteryStateOfCharge;
        builder.estimatedMinutesRemaining = this.estimatedMinutesRemaining;
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
