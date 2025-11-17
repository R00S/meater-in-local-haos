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
public final class MCCookStatsMessage extends Message<MCCookStatsMessage, Builder> {
    public static final String DEFAULT_APPVERSION = "";
    public static final String DEFAULT_DEVICEINFO = "";
    public static final String DEFAULT_EMAILADDRESS = "";
    public static final String DEFAULT_OSVERSION = "";
    public static final String DEFAULT_PARENTDEVICEFIRMWAREREVISION = "";
    public static final String DEFAULT_PROBEFIRMWAREREVISION = "";
    public static final String DEFAULT_SENDINGDEVICECLOUDID = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 13)
    public final String appVersion;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 11)
    public final String deviceInfo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 15)
    public final String emailAddress;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.TemperatureHistory#ADAPTER", label = WireField.Label.REQUIRED, tag = 9)
    public final TemperatureHistory history;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MasterType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final MasterType masterType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 14)
    public final String osVersion;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String parentDeviceFirmwareRevision;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", tag = 5)
    public final Long parentDeviceID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 6)
    public final Integer parentDeviceProbeNumber;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 12)
    public final Integer peak;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public final String probeFirmwareRevision;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long probeID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer probeNumber;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 16)
    public final String sendingDeviceCloudID;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.CookSetup#ADAPTER", label = WireField.Label.REQUIRED, tag = 8)
    public final CookSetup setup;
    public static final ProtoAdapter<MCCookStatsMessage> ADAPTER = new ProtoAdapter_MCCookStatsMessage();
    public static final MasterType DEFAULT_MASTERTYPE = MasterType.MASTER_TYPE_BLOCK;
    public static final Long DEFAULT_PROBEID = 0L;
    public static final Integer DEFAULT_PROBENUMBER = 0;
    public static final Long DEFAULT_PARENTDEVICEID = 0L;
    public static final Integer DEFAULT_PARENTDEVICEPROBENUMBER = 0;
    public static final Integer DEFAULT_PEAK = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MCCookStatsMessage, Builder> {
        public String appVersion;
        public String deviceInfo;
        public String emailAddress;
        public TemperatureHistory history;
        public MasterType masterType;
        public String osVersion;
        public String parentDeviceFirmwareRevision;
        public Long parentDeviceID;
        public Integer parentDeviceProbeNumber;
        public Integer peak;
        public String probeFirmwareRevision;
        public Long probeID;
        public Integer probeNumber;
        public String sendingDeviceCloudID;
        public CookSetup setup;

        public Builder appVersion(String str) {
            this.appVersion = str;
            return this;
        }

        public Builder deviceInfo(String str) {
            this.deviceInfo = str;
            return this;
        }

        public Builder emailAddress(String str) {
            this.emailAddress = str;
            return this;
        }

        public Builder history(TemperatureHistory temperatureHistory) {
            this.history = temperatureHistory;
            return this;
        }

        public Builder masterType(MasterType masterType) {
            this.masterType = masterType;
            return this;
        }

        public Builder osVersion(String str) {
            this.osVersion = str;
            return this;
        }

        public Builder parentDeviceFirmwareRevision(String str) {
            this.parentDeviceFirmwareRevision = str;
            return this;
        }

        public Builder parentDeviceID(Long l10) {
            this.parentDeviceID = l10;
            return this;
        }

        public Builder parentDeviceProbeNumber(Integer num) {
            this.parentDeviceProbeNumber = num;
            return this;
        }

        public Builder peak(Integer num) {
            this.peak = num;
            return this;
        }

        public Builder probeFirmwareRevision(String str) {
            this.probeFirmwareRevision = str;
            return this;
        }

        public Builder probeID(Long l10) {
            this.probeID = l10;
            return this;
        }

        public Builder probeNumber(Integer num) {
            this.probeNumber = num;
            return this;
        }

        public Builder sendingDeviceCloudID(String str) {
            this.sendingDeviceCloudID = str;
            return this;
        }

        public Builder setup(CookSetup cookSetup) {
            this.setup = cookSetup;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MCCookStatsMessage m198build() {
            MasterType masterType = this.masterType;
            if (masterType != null && this.probeID != null && this.probeNumber != null && this.probeFirmwareRevision != null && this.setup != null && this.history != null && this.deviceInfo != null && this.peak != null && this.appVersion != null && this.osVersion != null && this.sendingDeviceCloudID != null) {
                return new MCCookStatsMessage(this.masterType, this.probeID, this.probeNumber, this.probeFirmwareRevision, this.parentDeviceID, this.parentDeviceProbeNumber, this.parentDeviceFirmwareRevision, this.setup, this.history, this.deviceInfo, this.peak, this.appVersion, this.osVersion, this.emailAddress, this.sendingDeviceCloudID, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{masterType, "masterType", this.probeID, "probeID", this.probeNumber, "probeNumber", this.probeFirmwareRevision, "probeFirmwareRevision", this.setup, "setup", this.history, "history", this.deviceInfo, "deviceInfo", this.peak, "peak", this.appVersion, "appVersion", this.osVersion, "osVersion", this.sendingDeviceCloudID, "sendingDeviceCloudID"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MCCookStatsMessage extends ProtoAdapter<MCCookStatsMessage> {
        ProtoAdapter_MCCookStatsMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, MCCookStatsMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MCCookStatsMessage m199decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                builder.masterType((MasterType) MasterType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        case 2:
                            builder.probeID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                            break;
                        case 3:
                            builder.probeNumber((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 4:
                            builder.probeFirmwareRevision((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.parentDeviceID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                            break;
                        case 6:
                            builder.parentDeviceProbeNumber((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 7:
                            builder.parentDeviceFirmwareRevision((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.setup((CookSetup) CookSetup.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            builder.history((TemperatureHistory) TemperatureHistory.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 11:
                            builder.deviceInfo((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 12:
                            builder.peak((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 13:
                            builder.appVersion((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 14:
                            builder.osVersion((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            builder.emailAddress((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 16:
                            builder.sendingDeviceCloudID((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m198build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MCCookStatsMessage mCCookStatsMessage) {
            MasterType.ADAPTER.encodeWithTag(protoWriter, 1, mCCookStatsMessage.masterType);
            ProtoAdapter protoAdapter = ProtoAdapter.FIXED64;
            protoAdapter.encodeWithTag(protoWriter, 2, mCCookStatsMessage.probeID);
            ProtoAdapter protoAdapter2 = ProtoAdapter.UINT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, mCCookStatsMessage.probeNumber);
            ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(protoWriter, 4, mCCookStatsMessage.probeFirmwareRevision);
            Long l10 = mCCookStatsMessage.parentDeviceID;
            if (l10 != null) {
                protoAdapter.encodeWithTag(protoWriter, 5, l10);
            }
            Integer num = mCCookStatsMessage.parentDeviceProbeNumber;
            if (num != null) {
                protoAdapter2.encodeWithTag(protoWriter, 6, num);
            }
            String str = mCCookStatsMessage.parentDeviceFirmwareRevision;
            if (str != null) {
                protoAdapter3.encodeWithTag(protoWriter, 7, str);
            }
            CookSetup.ADAPTER.encodeWithTag(protoWriter, 8, mCCookStatsMessage.setup);
            TemperatureHistory.ADAPTER.encodeWithTag(protoWriter, 9, mCCookStatsMessage.history);
            protoAdapter3.encodeWithTag(protoWriter, 11, mCCookStatsMessage.deviceInfo);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, mCCookStatsMessage.peak);
            protoAdapter3.encodeWithTag(protoWriter, 13, mCCookStatsMessage.appVersion);
            protoAdapter3.encodeWithTag(protoWriter, 14, mCCookStatsMessage.osVersion);
            String str2 = mCCookStatsMessage.emailAddress;
            if (str2 != null) {
                protoAdapter3.encodeWithTag(protoWriter, 15, str2);
            }
            protoAdapter3.encodeWithTag(protoWriter, 16, mCCookStatsMessage.sendingDeviceCloudID);
            protoWriter.writeBytes(mCCookStatsMessage.unknownFields());
        }

        public int encodedSize(MCCookStatsMessage mCCookStatsMessage) {
            int encodedSizeWithTag = MasterType.ADAPTER.encodedSizeWithTag(1, mCCookStatsMessage.masterType);
            ProtoAdapter protoAdapter = ProtoAdapter.FIXED64;
            int encodedSizeWithTag2 = encodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, mCCookStatsMessage.probeID);
            ProtoAdapter protoAdapter2 = ProtoAdapter.UINT32;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, mCCookStatsMessage.probeNumber);
            ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(4, mCCookStatsMessage.probeFirmwareRevision);
            Long l10 = mCCookStatsMessage.parentDeviceID;
            int encodedSizeWithTag5 = encodedSizeWithTag4 + (l10 != null ? protoAdapter.encodedSizeWithTag(5, l10) : 0);
            Integer num = mCCookStatsMessage.parentDeviceProbeNumber;
            int encodedSizeWithTag6 = encodedSizeWithTag5 + (num != null ? protoAdapter2.encodedSizeWithTag(6, num) : 0);
            String str = mCCookStatsMessage.parentDeviceFirmwareRevision;
            int encodedSizeWithTag7 = encodedSizeWithTag6 + (str != null ? protoAdapter3.encodedSizeWithTag(7, str) : 0) + CookSetup.ADAPTER.encodedSizeWithTag(8, mCCookStatsMessage.setup) + TemperatureHistory.ADAPTER.encodedSizeWithTag(9, mCCookStatsMessage.history) + protoAdapter3.encodedSizeWithTag(11, mCCookStatsMessage.deviceInfo) + ProtoAdapter.INT32.encodedSizeWithTag(12, mCCookStatsMessage.peak) + protoAdapter3.encodedSizeWithTag(13, mCCookStatsMessage.appVersion) + protoAdapter3.encodedSizeWithTag(14, mCCookStatsMessage.osVersion);
            String str2 = mCCookStatsMessage.emailAddress;
            return encodedSizeWithTag7 + (str2 != null ? protoAdapter3.encodedSizeWithTag(15, str2) : 0) + protoAdapter3.encodedSizeWithTag(16, mCCookStatsMessage.sendingDeviceCloudID) + mCCookStatsMessage.unknownFields().I();
        }

        public MCCookStatsMessage redact(MCCookStatsMessage mCCookStatsMessage) {
            Builder m197newBuilder = mCCookStatsMessage.m197newBuilder();
            CookSetup cookSetup = m197newBuilder.setup;
            if (cookSetup != null) {
                m197newBuilder.setup = (CookSetup) CookSetup.ADAPTER.redact(cookSetup);
            }
            TemperatureHistory temperatureHistory = m197newBuilder.history;
            if (temperatureHistory != null) {
                m197newBuilder.history = (TemperatureHistory) TemperatureHistory.ADAPTER.redact(temperatureHistory);
            }
            m197newBuilder.clearUnknownFields();
            return m197newBuilder.m198build();
        }
    }

    public MCCookStatsMessage(MasterType masterType, Long l10, Integer num, String str, Long l11, Integer num2, String str2, CookSetup cookSetup, TemperatureHistory temperatureHistory, String str3, Integer num3, String str4, String str5, String str6, String str7) {
        this(masterType, l10, num, str, l11, num2, str2, cookSetup, temperatureHistory, str3, num3, str4, str5, str6, str7, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MCCookStatsMessage)) {
            return false;
        }
        MCCookStatsMessage mCCookStatsMessage = (MCCookStatsMessage) obj;
        if (Internal.equals(unknownFields(), mCCookStatsMessage.unknownFields()) && Internal.equals(this.masterType, mCCookStatsMessage.masterType) && Internal.equals(this.probeID, mCCookStatsMessage.probeID) && Internal.equals(this.probeNumber, mCCookStatsMessage.probeNumber) && Internal.equals(this.probeFirmwareRevision, mCCookStatsMessage.probeFirmwareRevision) && Internal.equals(this.parentDeviceID, mCCookStatsMessage.parentDeviceID) && Internal.equals(this.parentDeviceProbeNumber, mCCookStatsMessage.parentDeviceProbeNumber) && Internal.equals(this.parentDeviceFirmwareRevision, mCCookStatsMessage.parentDeviceFirmwareRevision) && Internal.equals(this.setup, mCCookStatsMessage.setup) && Internal.equals(this.history, mCCookStatsMessage.history) && Internal.equals(this.deviceInfo, mCCookStatsMessage.deviceInfo) && Internal.equals(this.peak, mCCookStatsMessage.peak) && Internal.equals(this.appVersion, mCCookStatsMessage.appVersion) && Internal.equals(this.osVersion, mCCookStatsMessage.osVersion) && Internal.equals(this.emailAddress, mCCookStatsMessage.emailAddress) && Internal.equals(this.sendingDeviceCloudID, mCCookStatsMessage.sendingDeviceCloudID)) {
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
            MasterType masterType = this.masterType;
            int i25 = 0;
            if (masterType != null) {
                i10 = masterType.hashCode();
            } else {
                i10 = 0;
            }
            int i26 = (hashCode + i10) * 37;
            Long l10 = this.probeID;
            if (l10 != null) {
                i11 = l10.hashCode();
            } else {
                i11 = 0;
            }
            int i27 = (i26 + i11) * 37;
            Integer num = this.probeNumber;
            if (num != null) {
                i12 = num.hashCode();
            } else {
                i12 = 0;
            }
            int i28 = (i27 + i12) * 37;
            String str = this.probeFirmwareRevision;
            if (str != null) {
                i13 = str.hashCode();
            } else {
                i13 = 0;
            }
            int i29 = (i28 + i13) * 37;
            Long l11 = this.parentDeviceID;
            if (l11 != null) {
                i14 = l11.hashCode();
            } else {
                i14 = 0;
            }
            int i30 = (i29 + i14) * 37;
            Integer num2 = this.parentDeviceProbeNumber;
            if (num2 != null) {
                i15 = num2.hashCode();
            } else {
                i15 = 0;
            }
            int i31 = (i30 + i15) * 37;
            String str2 = this.parentDeviceFirmwareRevision;
            if (str2 != null) {
                i16 = str2.hashCode();
            } else {
                i16 = 0;
            }
            int i32 = (i31 + i16) * 37;
            CookSetup cookSetup = this.setup;
            if (cookSetup != null) {
                i17 = cookSetup.hashCode();
            } else {
                i17 = 0;
            }
            int i33 = (i32 + i17) * 37;
            TemperatureHistory temperatureHistory = this.history;
            if (temperatureHistory != null) {
                i18 = temperatureHistory.hashCode();
            } else {
                i18 = 0;
            }
            int i34 = (i33 + i18) * 37;
            String str3 = this.deviceInfo;
            if (str3 != null) {
                i19 = str3.hashCode();
            } else {
                i19 = 0;
            }
            int i35 = (i34 + i19) * 37;
            Integer num3 = this.peak;
            if (num3 != null) {
                i20 = num3.hashCode();
            } else {
                i20 = 0;
            }
            int i36 = (i35 + i20) * 37;
            String str4 = this.appVersion;
            if (str4 != null) {
                i21 = str4.hashCode();
            } else {
                i21 = 0;
            }
            int i37 = (i36 + i21) * 37;
            String str5 = this.osVersion;
            if (str5 != null) {
                i22 = str5.hashCode();
            } else {
                i22 = 0;
            }
            int i38 = (i37 + i22) * 37;
            String str6 = this.emailAddress;
            if (str6 != null) {
                i23 = str6.hashCode();
            } else {
                i23 = 0;
            }
            int i39 = (i38 + i23) * 37;
            String str7 = this.sendingDeviceCloudID;
            if (str7 != null) {
                i25 = str7.hashCode();
            }
            int i40 = i39 + i25;
            ((Message) this).hashCode = i40;
            return i40;
        }
        return i24;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.masterType != null) {
            sb.append(", masterType=");
            sb.append(this.masterType);
        }
        if (this.probeID != null) {
            sb.append(", probeID=");
            sb.append(this.probeID);
        }
        if (this.probeNumber != null) {
            sb.append(", probeNumber=");
            sb.append(this.probeNumber);
        }
        if (this.probeFirmwareRevision != null) {
            sb.append(", probeFirmwareRevision=");
            sb.append(this.probeFirmwareRevision);
        }
        if (this.parentDeviceID != null) {
            sb.append(", parentDeviceID=");
            sb.append(this.parentDeviceID);
        }
        if (this.parentDeviceProbeNumber != null) {
            sb.append(", parentDeviceProbeNumber=");
            sb.append(this.parentDeviceProbeNumber);
        }
        if (this.parentDeviceFirmwareRevision != null) {
            sb.append(", parentDeviceFirmwareRevision=");
            sb.append(this.parentDeviceFirmwareRevision);
        }
        if (this.setup != null) {
            sb.append(", setup=");
            sb.append(this.setup);
        }
        if (this.history != null) {
            sb.append(", history=");
            sb.append(this.history);
        }
        if (this.deviceInfo != null) {
            sb.append(", deviceInfo=");
            sb.append(this.deviceInfo);
        }
        if (this.peak != null) {
            sb.append(", peak=");
            sb.append(this.peak);
        }
        if (this.appVersion != null) {
            sb.append(", appVersion=");
            sb.append(this.appVersion);
        }
        if (this.osVersion != null) {
            sb.append(", osVersion=");
            sb.append(this.osVersion);
        }
        if (this.emailAddress != null) {
            sb.append(", emailAddress=");
            sb.append(this.emailAddress);
        }
        if (this.sendingDeviceCloudID != null) {
            sb.append(", sendingDeviceCloudID=");
            sb.append(this.sendingDeviceCloudID);
        }
        StringBuilder replace = sb.replace(0, 2, "MCCookStatsMessage{");
        replace.append('}');
        return replace.toString();
    }

    public MCCookStatsMessage(MasterType masterType, Long l10, Integer num, String str, Long l11, Integer num2, String str2, CookSetup cookSetup, TemperatureHistory temperatureHistory, String str3, Integer num3, String str4, String str5, String str6, String str7, h hVar) {
        super(ADAPTER, hVar);
        this.masterType = masterType;
        this.probeID = l10;
        this.probeNumber = num;
        this.probeFirmwareRevision = str;
        this.parentDeviceID = l11;
        this.parentDeviceProbeNumber = num2;
        this.parentDeviceFirmwareRevision = str2;
        this.setup = cookSetup;
        this.history = temperatureHistory;
        this.deviceInfo = str3;
        this.peak = num3;
        this.appVersion = str4;
        this.osVersion = str5;
        this.emailAddress = str6;
        this.sendingDeviceCloudID = str7;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m197newBuilder() {
        Builder builder = new Builder();
        builder.masterType = this.masterType;
        builder.probeID = this.probeID;
        builder.probeNumber = this.probeNumber;
        builder.probeFirmwareRevision = this.probeFirmwareRevision;
        builder.parentDeviceID = this.parentDeviceID;
        builder.parentDeviceProbeNumber = this.parentDeviceProbeNumber;
        builder.parentDeviceFirmwareRevision = this.parentDeviceFirmwareRevision;
        builder.setup = this.setup;
        builder.history = this.history;
        builder.deviceInfo = this.deviceInfo;
        builder.peak = this.peak;
        builder.appVersion = this.appVersion;
        builder.osVersion = this.osVersion;
        builder.emailAddress = this.emailAddress;
        builder.sendingDeviceCloudID = this.sendingDeviceCloudID;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
