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
public final class MEATEREventList extends Message<MEATEREventList, Builder> {
    public static final String DEFAULT_APPVERSION = "";
    public static final String DEFAULT_DEVICEINFO = "";
    public static final String DEFAULT_EMAILADDRESS = "";
    public static final String DEFAULT_OSVERSION = "";
    public static final String DEFAULT_SENDINGDEVICECLOUDID = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 9)
    public final String appVersion;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 6)
    public final Long cookID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 8)
    public final String deviceInfo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 7)
    public final String emailAddress;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MEATEREvent#ADAPTER", label = WireField.Label.REPEATED, tag = 11)
    public final List<MEATEREvent> events;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MasterType#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final MasterType masterType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer meaterLinkIdentifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 10)
    public final String osVersion;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 5)
    public final Long probeSerialNum;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 12)
    public final String sendingDeviceCloudID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer versionMajor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer versionMinor;
    public static final ProtoAdapter<MEATEREventList> ADAPTER = new ProtoAdapter_MEATEREventList();
    public static final Integer DEFAULT_MEATERLINKIDENTIFIER = 21578;
    public static final Integer DEFAULT_VERSIONMAJOR = 2;
    public static final Integer DEFAULT_VERSIONMINOR = 1;
    public static final MasterType DEFAULT_MASTERTYPE = MasterType.MASTER_TYPE_BLOCK;
    public static final Long DEFAULT_PROBESERIALNUM = 0L;
    public static final Long DEFAULT_COOKID = 0L;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MEATEREventList, Builder> {
        public String appVersion;
        public Long cookID;
        public String deviceInfo;
        public String emailAddress;
        public List<MEATEREvent> events = Internal.newMutableList();
        public MasterType masterType;
        public Integer meaterLinkIdentifier;
        public String osVersion;
        public Long probeSerialNum;
        public String sendingDeviceCloudID;
        public Integer versionMajor;
        public Integer versionMinor;

        public Builder appVersion(String str) {
            this.appVersion = str;
            return this;
        }

        public Builder cookID(Long l10) {
            this.cookID = l10;
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

        public Builder events(List<MEATEREvent> list) {
            Internal.checkElementsNotNull(list);
            this.events = list;
            return this;
        }

        public Builder masterType(MasterType masterType) {
            this.masterType = masterType;
            return this;
        }

        public Builder meaterLinkIdentifier(Integer num) {
            this.meaterLinkIdentifier = num;
            return this;
        }

        public Builder osVersion(String str) {
            this.osVersion = str;
            return this;
        }

        public Builder probeSerialNum(Long l10) {
            this.probeSerialNum = l10;
            return this;
        }

        public Builder sendingDeviceCloudID(String str) {
            this.sendingDeviceCloudID = str;
            return this;
        }

        public Builder versionMajor(Integer num) {
            this.versionMajor = num;
            return this;
        }

        public Builder versionMinor(Integer num) {
            this.versionMinor = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MEATEREventList m225build() {
            Integer num = this.meaterLinkIdentifier;
            if (num != null && this.versionMajor != null && this.versionMinor != null && this.masterType != null && this.probeSerialNum != null && this.cookID != null && this.emailAddress != null && this.deviceInfo != null && this.appVersion != null && this.osVersion != null && this.sendingDeviceCloudID != null) {
                return new MEATEREventList(this.meaterLinkIdentifier, this.versionMajor, this.versionMinor, this.masterType, this.probeSerialNum, this.cookID, this.emailAddress, this.deviceInfo, this.appVersion, this.osVersion, this.events, this.sendingDeviceCloudID, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "meaterLinkIdentifier", this.versionMajor, "versionMajor", this.versionMinor, "versionMinor", this.masterType, "masterType", this.probeSerialNum, "probeSerialNum", this.cookID, "cookID", this.emailAddress, "emailAddress", this.deviceInfo, "deviceInfo", this.appVersion, "appVersion", this.osVersion, "osVersion", this.sendingDeviceCloudID, "sendingDeviceCloudID"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MEATEREventList extends ProtoAdapter<MEATEREventList> {
        ProtoAdapter_MEATEREventList() {
            super(FieldEncoding.LENGTH_DELIMITED, MEATEREventList.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MEATEREventList m226decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.meaterLinkIdentifier((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 2:
                            builder.versionMajor((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 3:
                            builder.versionMinor((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 4:
                            try {
                                builder.masterType((MasterType) MasterType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        case 5:
                            builder.probeSerialNum((Long) ProtoAdapter.FIXED64.decode(protoReader));
                            break;
                        case 6:
                            builder.cookID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                            break;
                        case 7:
                            builder.emailAddress((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.deviceInfo((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.appVersion((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            builder.osVersion((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
                            builder.events.add((MEATEREvent) MEATEREvent.ADAPTER.decode(protoReader));
                            break;
                        case 12:
                            builder.sendingDeviceCloudID((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m225build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MEATEREventList mEATEREventList) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, mEATEREventList.meaterLinkIdentifier);
            protoAdapter.encodeWithTag(protoWriter, 2, mEATEREventList.versionMajor);
            protoAdapter.encodeWithTag(protoWriter, 3, mEATEREventList.versionMinor);
            MasterType.ADAPTER.encodeWithTag(protoWriter, 4, mEATEREventList.masterType);
            ProtoAdapter protoAdapter2 = ProtoAdapter.FIXED64;
            protoAdapter2.encodeWithTag(protoWriter, 5, mEATEREventList.probeSerialNum);
            protoAdapter2.encodeWithTag(protoWriter, 6, mEATEREventList.cookID);
            ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(protoWriter, 7, mEATEREventList.emailAddress);
            protoAdapter3.encodeWithTag(protoWriter, 8, mEATEREventList.deviceInfo);
            protoAdapter3.encodeWithTag(protoWriter, 9, mEATEREventList.appVersion);
            protoAdapter3.encodeWithTag(protoWriter, 10, mEATEREventList.osVersion);
            if (mEATEREventList.events != null) {
                MEATEREvent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, mEATEREventList.events);
            }
            protoAdapter3.encodeWithTag(protoWriter, 12, mEATEREventList.sendingDeviceCloudID);
            protoWriter.writeBytes(mEATEREventList.unknownFields());
        }

        public int encodedSize(MEATEREventList mEATEREventList) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, mEATEREventList.meaterLinkIdentifier) + protoAdapter.encodedSizeWithTag(2, mEATEREventList.versionMajor) + protoAdapter.encodedSizeWithTag(3, mEATEREventList.versionMinor) + MasterType.ADAPTER.encodedSizeWithTag(4, mEATEREventList.masterType);
            ProtoAdapter protoAdapter2 = ProtoAdapter.FIXED64;
            int encodedSizeWithTag2 = encodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, mEATEREventList.probeSerialNum) + protoAdapter2.encodedSizeWithTag(6, mEATEREventList.cookID);
            ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
            return encodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(7, mEATEREventList.emailAddress) + protoAdapter3.encodedSizeWithTag(8, mEATEREventList.deviceInfo) + protoAdapter3.encodedSizeWithTag(9, mEATEREventList.appVersion) + protoAdapter3.encodedSizeWithTag(10, mEATEREventList.osVersion) + MEATEREvent.ADAPTER.asRepeated().encodedSizeWithTag(11, mEATEREventList.events) + protoAdapter3.encodedSizeWithTag(12, mEATEREventList.sendingDeviceCloudID) + mEATEREventList.unknownFields().I();
        }

        public MEATEREventList redact(MEATEREventList mEATEREventList) {
            Builder m224newBuilder = mEATEREventList.m224newBuilder();
            Internal.redactElements(m224newBuilder.events, MEATEREvent.ADAPTER);
            m224newBuilder.clearUnknownFields();
            return m224newBuilder.m225build();
        }
    }

    public MEATEREventList(Integer num, Integer num2, Integer num3, MasterType masterType, Long l10, Long l11, String str, String str2, String str3, String str4, List<MEATEREvent> list, String str5) {
        this(num, num2, num3, masterType, l10, l11, str, str2, str3, str4, list, str5, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MEATEREventList)) {
            return false;
        }
        MEATEREventList mEATEREventList = (MEATEREventList) obj;
        if (Internal.equals(unknownFields(), mEATEREventList.unknownFields()) && Internal.equals(this.meaterLinkIdentifier, mEATEREventList.meaterLinkIdentifier) && Internal.equals(this.versionMajor, mEATEREventList.versionMajor) && Internal.equals(this.versionMinor, mEATEREventList.versionMinor) && Internal.equals(this.masterType, mEATEREventList.masterType) && Internal.equals(this.probeSerialNum, mEATEREventList.probeSerialNum) && Internal.equals(this.cookID, mEATEREventList.cookID) && Internal.equals(this.emailAddress, mEATEREventList.emailAddress) && Internal.equals(this.deviceInfo, mEATEREventList.deviceInfo) && Internal.equals(this.appVersion, mEATEREventList.appVersion) && Internal.equals(this.osVersion, mEATEREventList.osVersion) && Internal.equals(this.events, mEATEREventList.events) && Internal.equals(this.sendingDeviceCloudID, mEATEREventList.sendingDeviceCloudID)) {
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
            Integer num = this.meaterLinkIdentifier;
            int i22 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i23 = (hashCode + i10) * 37;
            Integer num2 = this.versionMajor;
            if (num2 != null) {
                i11 = num2.hashCode();
            } else {
                i11 = 0;
            }
            int i24 = (i23 + i11) * 37;
            Integer num3 = this.versionMinor;
            if (num3 != null) {
                i12 = num3.hashCode();
            } else {
                i12 = 0;
            }
            int i25 = (i24 + i12) * 37;
            MasterType masterType = this.masterType;
            if (masterType != null) {
                i13 = masterType.hashCode();
            } else {
                i13 = 0;
            }
            int i26 = (i25 + i13) * 37;
            Long l10 = this.probeSerialNum;
            if (l10 != null) {
                i14 = l10.hashCode();
            } else {
                i14 = 0;
            }
            int i27 = (i26 + i14) * 37;
            Long l11 = this.cookID;
            if (l11 != null) {
                i15 = l11.hashCode();
            } else {
                i15 = 0;
            }
            int i28 = (i27 + i15) * 37;
            String str = this.emailAddress;
            if (str != null) {
                i16 = str.hashCode();
            } else {
                i16 = 0;
            }
            int i29 = (i28 + i16) * 37;
            String str2 = this.deviceInfo;
            if (str2 != null) {
                i17 = str2.hashCode();
            } else {
                i17 = 0;
            }
            int i30 = (i29 + i17) * 37;
            String str3 = this.appVersion;
            if (str3 != null) {
                i18 = str3.hashCode();
            } else {
                i18 = 0;
            }
            int i31 = (i30 + i18) * 37;
            String str4 = this.osVersion;
            if (str4 != null) {
                i19 = str4.hashCode();
            } else {
                i19 = 0;
            }
            int i32 = (i31 + i19) * 37;
            List<MEATEREvent> list = this.events;
            if (list != null) {
                i20 = list.hashCode();
            } else {
                i20 = 1;
            }
            int i33 = (i32 + i20) * 37;
            String str5 = this.sendingDeviceCloudID;
            if (str5 != null) {
                i22 = str5.hashCode();
            }
            int i34 = i33 + i22;
            ((Message) this).hashCode = i34;
            return i34;
        }
        return i21;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.meaterLinkIdentifier != null) {
            sb.append(", meaterLinkIdentifier=");
            sb.append(this.meaterLinkIdentifier);
        }
        if (this.versionMajor != null) {
            sb.append(", versionMajor=");
            sb.append(this.versionMajor);
        }
        if (this.versionMinor != null) {
            sb.append(", versionMinor=");
            sb.append(this.versionMinor);
        }
        if (this.masterType != null) {
            sb.append(", masterType=");
            sb.append(this.masterType);
        }
        if (this.probeSerialNum != null) {
            sb.append(", probeSerialNum=");
            sb.append(this.probeSerialNum);
        }
        if (this.cookID != null) {
            sb.append(", cookID=");
            sb.append(this.cookID);
        }
        if (this.emailAddress != null) {
            sb.append(", emailAddress=");
            sb.append(this.emailAddress);
        }
        if (this.deviceInfo != null) {
            sb.append(", deviceInfo=");
            sb.append(this.deviceInfo);
        }
        if (this.appVersion != null) {
            sb.append(", appVersion=");
            sb.append(this.appVersion);
        }
        if (this.osVersion != null) {
            sb.append(", osVersion=");
            sb.append(this.osVersion);
        }
        if (this.events != null) {
            sb.append(", events=");
            sb.append(this.events);
        }
        if (this.sendingDeviceCloudID != null) {
            sb.append(", sendingDeviceCloudID=");
            sb.append(this.sendingDeviceCloudID);
        }
        StringBuilder replace = sb.replace(0, 2, "MEATEREventList{");
        replace.append('}');
        return replace.toString();
    }

    public MEATEREventList(Integer num, Integer num2, Integer num3, MasterType masterType, Long l10, Long l11, String str, String str2, String str3, String str4, List<MEATEREvent> list, String str5, h hVar) {
        super(ADAPTER, hVar);
        this.meaterLinkIdentifier = num;
        this.versionMajor = num2;
        this.versionMinor = num3;
        this.masterType = masterType;
        this.probeSerialNum = l10;
        this.cookID = l11;
        this.emailAddress = str;
        this.deviceInfo = str2;
        this.appVersion = str3;
        this.osVersion = str4;
        this.events = Internal.immutableCopyOf("events", list);
        this.sendingDeviceCloudID = str5;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m224newBuilder() {
        Builder builder = new Builder();
        builder.meaterLinkIdentifier = this.meaterLinkIdentifier;
        builder.versionMajor = this.versionMajor;
        builder.versionMinor = this.versionMinor;
        builder.masterType = this.masterType;
        builder.probeSerialNum = this.probeSerialNum;
        builder.cookID = this.cookID;
        builder.emailAddress = this.emailAddress;
        builder.deviceInfo = this.deviceInfo;
        builder.appVersion = this.appVersion;
        builder.osVersion = this.osVersion;
        builder.events = Internal.copyOf("events", this.events);
        builder.sendingDeviceCloudID = this.sendingDeviceCloudID;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
