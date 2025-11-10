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
public final class MasterStatus extends Message<MasterStatus, Builder> {
    public static final String DEFAULT_CLOUDEMAILADDRESS = "";
    public static final String DEFAULT_VERSION = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 4)
    public final Integer batteryLevelPercent;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.CloudDisconnectedState#ADAPTER", tag = 7)
    public final CloudDisconnectedState cloudDisconnectionState;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String cloudEmailAddress;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long deviceID;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MasterSubType#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final MasterSubType subType;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MasterType#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final MasterType type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 6)
    public final String version;
    public static final ProtoAdapter<MasterStatus> ADAPTER = new ProtoAdapter_MasterStatus();
    public static final Long DEFAULT_DEVICEID = 0L;
    public static final MasterType DEFAULT_TYPE = MasterType.MASTER_TYPE_BLOCK;
    public static final MasterSubType DEFAULT_SUBTYPE = MasterSubType.MASTER_SUBTYPE_NONE;
    public static final Integer DEFAULT_BATTERYLEVELPERCENT = 0;
    public static final CloudDisconnectedState DEFAULT_CLOUDDISCONNECTIONSTATE = CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NONE;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MasterStatus, Builder> {
        public Integer batteryLevelPercent;
        public CloudDisconnectedState cloudDisconnectionState;
        public String cloudEmailAddress;
        public Long deviceID;
        public MasterSubType subType;
        public MasterType type;
        public String version;

        public Builder batteryLevelPercent(Integer num) {
            this.batteryLevelPercent = num;
            return this;
        }

        public Builder cloudDisconnectionState(CloudDisconnectedState cloudDisconnectedState) {
            this.cloudDisconnectionState = cloudDisconnectedState;
            return this;
        }

        public Builder cloudEmailAddress(String str) {
            this.cloudEmailAddress = str;
            return this;
        }

        public Builder deviceID(Long l10) {
            this.deviceID = l10;
            return this;
        }

        public Builder subType(MasterSubType masterSubType) {
            this.subType = masterSubType;
            return this;
        }

        public Builder type(MasterType masterType) {
            this.type = masterType;
            return this;
        }

        public Builder version(String str) {
            this.version = str;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MasterStatus m273build() {
            Long l10 = this.deviceID;
            if (l10 != null && this.type != null && this.subType != null && this.batteryLevelPercent != null && this.version != null) {
                return new MasterStatus(this.deviceID, this.type, this.subType, this.batteryLevelPercent, this.cloudEmailAddress, this.version, this.cloudDisconnectionState, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "deviceID", this.type, "type", this.subType, "subType", this.batteryLevelPercent, "batteryLevelPercent", this.version, "version"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MasterStatus extends ProtoAdapter<MasterStatus> {
        ProtoAdapter_MasterStatus() {
            super(FieldEncoding.LENGTH_DELIMITED, MasterStatus.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MasterStatus m274decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.deviceID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                            break;
                        case 2:
                            try {
                                builder.type((MasterType) MasterType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        case 3:
                            try {
                                builder.subType((MasterSubType) MasterSubType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e11.value));
                                break;
                            }
                        case 4:
                            builder.batteryLevelPercent((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 5:
                            builder.cloudEmailAddress((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.version((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            try {
                                builder.cloudDisconnectionState((CloudDisconnectedState) CloudDisconnectedState.ADAPTER.decode(protoReader));
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
                    return builder.m273build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MasterStatus masterStatus) {
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, masterStatus.deviceID);
            MasterType.ADAPTER.encodeWithTag(protoWriter, 2, masterStatus.type);
            MasterSubType.ADAPTER.encodeWithTag(protoWriter, 3, masterStatus.subType);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 4, masterStatus.batteryLevelPercent);
            String str = masterStatus.cloudEmailAddress;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, str);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, masterStatus.version);
            CloudDisconnectedState cloudDisconnectedState = masterStatus.cloudDisconnectionState;
            if (cloudDisconnectedState != null) {
                CloudDisconnectedState.ADAPTER.encodeWithTag(protoWriter, 7, cloudDisconnectedState);
            }
            protoWriter.writeBytes(masterStatus.unknownFields());
        }

        public int encodedSize(MasterStatus masterStatus) {
            int encodedSizeWithTag = ProtoAdapter.FIXED64.encodedSizeWithTag(1, masterStatus.deviceID) + MasterType.ADAPTER.encodedSizeWithTag(2, masterStatus.type) + MasterSubType.ADAPTER.encodedSizeWithTag(3, masterStatus.subType) + ProtoAdapter.UINT32.encodedSizeWithTag(4, masterStatus.batteryLevelPercent);
            String str = masterStatus.cloudEmailAddress;
            int encodedSizeWithTag2 = encodedSizeWithTag + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, str) : 0) + ProtoAdapter.STRING.encodedSizeWithTag(6, masterStatus.version);
            CloudDisconnectedState cloudDisconnectedState = masterStatus.cloudDisconnectionState;
            return encodedSizeWithTag2 + (cloudDisconnectedState != null ? CloudDisconnectedState.ADAPTER.encodedSizeWithTag(7, cloudDisconnectedState) : 0) + masterStatus.unknownFields().I();
        }

        public MasterStatus redact(MasterStatus masterStatus) {
            Builder m272newBuilder = masterStatus.m272newBuilder();
            m272newBuilder.clearUnknownFields();
            return m272newBuilder.m273build();
        }
    }

    public MasterStatus(Long l10, MasterType masterType, MasterSubType masterSubType, Integer num, String str, String str2, CloudDisconnectedState cloudDisconnectedState) {
        this(l10, masterType, masterSubType, num, str, str2, cloudDisconnectedState, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MasterStatus)) {
            return false;
        }
        MasterStatus masterStatus = (MasterStatus) obj;
        if (Internal.equals(unknownFields(), masterStatus.unknownFields()) && Internal.equals(this.deviceID, masterStatus.deviceID) && Internal.equals(this.type, masterStatus.type) && Internal.equals(this.subType, masterStatus.subType) && Internal.equals(this.batteryLevelPercent, masterStatus.batteryLevelPercent) && Internal.equals(this.cloudEmailAddress, masterStatus.cloudEmailAddress) && Internal.equals(this.version, masterStatus.version) && Internal.equals(this.cloudDisconnectionState, masterStatus.cloudDisconnectionState)) {
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
            Long l10 = this.deviceID;
            int i17 = 0;
            if (l10 != null) {
                i10 = l10.hashCode();
            } else {
                i10 = 0;
            }
            int i18 = (hashCode + i10) * 37;
            MasterType masterType = this.type;
            if (masterType != null) {
                i11 = masterType.hashCode();
            } else {
                i11 = 0;
            }
            int i19 = (i18 + i11) * 37;
            MasterSubType masterSubType = this.subType;
            if (masterSubType != null) {
                i12 = masterSubType.hashCode();
            } else {
                i12 = 0;
            }
            int i20 = (i19 + i12) * 37;
            Integer num = this.batteryLevelPercent;
            if (num != null) {
                i13 = num.hashCode();
            } else {
                i13 = 0;
            }
            int i21 = (i20 + i13) * 37;
            String str = this.cloudEmailAddress;
            if (str != null) {
                i14 = str.hashCode();
            } else {
                i14 = 0;
            }
            int i22 = (i21 + i14) * 37;
            String str2 = this.version;
            if (str2 != null) {
                i15 = str2.hashCode();
            } else {
                i15 = 0;
            }
            int i23 = (i22 + i15) * 37;
            CloudDisconnectedState cloudDisconnectedState = this.cloudDisconnectionState;
            if (cloudDisconnectedState != null) {
                i17 = cloudDisconnectedState.hashCode();
            }
            int i24 = i23 + i17;
            ((Message) this).hashCode = i24;
            return i24;
        }
        return i16;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.deviceID != null) {
            sb.append(", deviceID=");
            sb.append(this.deviceID);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.subType != null) {
            sb.append(", subType=");
            sb.append(this.subType);
        }
        if (this.batteryLevelPercent != null) {
            sb.append(", batteryLevelPercent=");
            sb.append(this.batteryLevelPercent);
        }
        if (this.cloudEmailAddress != null) {
            sb.append(", cloudEmailAddress=");
            sb.append(this.cloudEmailAddress);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.cloudDisconnectionState != null) {
            sb.append(", cloudDisconnectionState=");
            sb.append(this.cloudDisconnectionState);
        }
        StringBuilder replace = sb.replace(0, 2, "MasterStatus{");
        replace.append('}');
        return replace.toString();
    }

    public MasterStatus(Long l10, MasterType masterType, MasterSubType masterSubType, Integer num, String str, String str2, CloudDisconnectedState cloudDisconnectedState, h hVar) {
        super(ADAPTER, hVar);
        this.deviceID = l10;
        this.type = masterType;
        this.subType = masterSubType;
        this.batteryLevelPercent = num;
        this.cloudEmailAddress = str;
        this.version = str2;
        this.cloudDisconnectionState = cloudDisconnectedState;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m272newBuilder() {
        Builder builder = new Builder();
        builder.deviceID = this.deviceID;
        builder.type = this.type;
        builder.subType = this.subType;
        builder.batteryLevelPercent = this.batteryLevelPercent;
        builder.cloudEmailAddress = this.cloudEmailAddress;
        builder.version = this.version;
        builder.cloudDisconnectionState = this.cloudDisconnectionState;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
