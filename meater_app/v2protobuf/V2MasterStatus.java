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
public final class V2MasterStatus extends Message<V2MasterStatus, Builder> {
    public static final String DEFAULT_CLOUDEMAILADDRESS = "";
    public static final String DEFAULT_VERSION = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 4)
    public final Integer batteryLevel;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2CloudDisconnectedState#ADAPTER", tag = 7)
    public final V2CloudDisconnectedState cloudDisconnectionState;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String cloudEmailAddress;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long deviceID;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2MasterSubType#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final V2MasterSubType subType;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2MasterType#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final V2MasterType type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 6)
    public final String version;
    public static final ProtoAdapter<V2MasterStatus> ADAPTER = new ProtoAdapter_V2MasterStatus();
    public static final Long DEFAULT_DEVICEID = 0L;
    public static final V2MasterType DEFAULT_TYPE = V2MasterType.V2MASTER_TYPE_BLOCK;
    public static final V2MasterSubType DEFAULT_SUBTYPE = V2MasterSubType.V2MASTER_SUBTYPE_NONE;
    public static final Integer DEFAULT_BATTERYLEVEL = 0;
    public static final V2CloudDisconnectedState DEFAULT_CLOUDDISCONNECTIONSTATE = V2CloudDisconnectedState.V2CLOUD_DISCONNECTED_STATE_NONE;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2MasterStatus, Builder> {
        public Integer batteryLevel;
        public V2CloudDisconnectedState cloudDisconnectionState;
        public String cloudEmailAddress;
        public Long deviceID;
        public V2MasterSubType subType;
        public V2MasterType type;
        public String version;

        public Builder batteryLevel(Integer num) {
            this.batteryLevel = num;
            return this;
        }

        public Builder cloudDisconnectionState(V2CloudDisconnectedState v2CloudDisconnectedState) {
            this.cloudDisconnectionState = v2CloudDisconnectedState;
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

        public Builder subType(V2MasterSubType v2MasterSubType) {
            this.subType = v2MasterSubType;
            return this;
        }

        public Builder type(V2MasterType v2MasterType) {
            this.type = v2MasterType;
            return this;
        }

        public Builder version(String str) {
            this.version = str;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2MasterStatus m84build() {
            Long l10 = this.deviceID;
            if (l10 != null && this.type != null && this.subType != null && this.batteryLevel != null && this.version != null) {
                return new V2MasterStatus(this.deviceID, this.type, this.subType, this.batteryLevel, this.cloudEmailAddress, this.version, this.cloudDisconnectionState, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "deviceID", this.type, "type", this.subType, "subType", this.batteryLevel, "batteryLevel", this.version, "version"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2MasterStatus extends ProtoAdapter<V2MasterStatus> {
        ProtoAdapter_V2MasterStatus() {
            super(FieldEncoding.LENGTH_DELIMITED, V2MasterStatus.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2MasterStatus m85decode(ProtoReader protoReader) {
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
                                builder.type((V2MasterType) V2MasterType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        case 3:
                            try {
                                builder.subType((V2MasterSubType) V2MasterSubType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e11.value));
                                break;
                            }
                        case 4:
                            builder.batteryLevel((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 5:
                            builder.cloudEmailAddress((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.version((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            try {
                                builder.cloudDisconnectionState((V2CloudDisconnectedState) V2CloudDisconnectedState.ADAPTER.decode(protoReader));
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
                    return builder.m84build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2MasterStatus v2MasterStatus) {
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, v2MasterStatus.deviceID);
            V2MasterType.ADAPTER.encodeWithTag(protoWriter, 2, v2MasterStatus.type);
            V2MasterSubType.ADAPTER.encodeWithTag(protoWriter, 3, v2MasterStatus.subType);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 4, v2MasterStatus.batteryLevel);
            String str = v2MasterStatus.cloudEmailAddress;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, str);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, v2MasterStatus.version);
            V2CloudDisconnectedState v2CloudDisconnectedState = v2MasterStatus.cloudDisconnectionState;
            if (v2CloudDisconnectedState != null) {
                V2CloudDisconnectedState.ADAPTER.encodeWithTag(protoWriter, 7, v2CloudDisconnectedState);
            }
            protoWriter.writeBytes(v2MasterStatus.unknownFields());
        }

        public int encodedSize(V2MasterStatus v2MasterStatus) {
            int encodedSizeWithTag = ProtoAdapter.FIXED64.encodedSizeWithTag(1, v2MasterStatus.deviceID) + V2MasterType.ADAPTER.encodedSizeWithTag(2, v2MasterStatus.type) + V2MasterSubType.ADAPTER.encodedSizeWithTag(3, v2MasterStatus.subType) + ProtoAdapter.UINT32.encodedSizeWithTag(4, v2MasterStatus.batteryLevel);
            String str = v2MasterStatus.cloudEmailAddress;
            int encodedSizeWithTag2 = encodedSizeWithTag + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, str) : 0) + ProtoAdapter.STRING.encodedSizeWithTag(6, v2MasterStatus.version);
            V2CloudDisconnectedState v2CloudDisconnectedState = v2MasterStatus.cloudDisconnectionState;
            return encodedSizeWithTag2 + (v2CloudDisconnectedState != null ? V2CloudDisconnectedState.ADAPTER.encodedSizeWithTag(7, v2CloudDisconnectedState) : 0) + v2MasterStatus.unknownFields().I();
        }

        public V2MasterStatus redact(V2MasterStatus v2MasterStatus) {
            Builder m83newBuilder = v2MasterStatus.m83newBuilder();
            m83newBuilder.clearUnknownFields();
            return m83newBuilder.m84build();
        }
    }

    public V2MasterStatus(Long l10, V2MasterType v2MasterType, V2MasterSubType v2MasterSubType, Integer num, String str, String str2, V2CloudDisconnectedState v2CloudDisconnectedState) {
        this(l10, v2MasterType, v2MasterSubType, num, str, str2, v2CloudDisconnectedState, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2MasterStatus)) {
            return false;
        }
        V2MasterStatus v2MasterStatus = (V2MasterStatus) obj;
        if (Internal.equals(unknownFields(), v2MasterStatus.unknownFields()) && Internal.equals(this.deviceID, v2MasterStatus.deviceID) && Internal.equals(this.type, v2MasterStatus.type) && Internal.equals(this.subType, v2MasterStatus.subType) && Internal.equals(this.batteryLevel, v2MasterStatus.batteryLevel) && Internal.equals(this.cloudEmailAddress, v2MasterStatus.cloudEmailAddress) && Internal.equals(this.version, v2MasterStatus.version) && Internal.equals(this.cloudDisconnectionState, v2MasterStatus.cloudDisconnectionState)) {
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
            V2MasterType v2MasterType = this.type;
            if (v2MasterType != null) {
                i11 = v2MasterType.hashCode();
            } else {
                i11 = 0;
            }
            int i19 = (i18 + i11) * 37;
            V2MasterSubType v2MasterSubType = this.subType;
            if (v2MasterSubType != null) {
                i12 = v2MasterSubType.hashCode();
            } else {
                i12 = 0;
            }
            int i20 = (i19 + i12) * 37;
            Integer num = this.batteryLevel;
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
            V2CloudDisconnectedState v2CloudDisconnectedState = this.cloudDisconnectionState;
            if (v2CloudDisconnectedState != null) {
                i17 = v2CloudDisconnectedState.hashCode();
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
        if (this.batteryLevel != null) {
            sb.append(", batteryLevel=");
            sb.append(this.batteryLevel);
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
        StringBuilder replace = sb.replace(0, 2, "V2MasterStatus{");
        replace.append('}');
        return replace.toString();
    }

    public V2MasterStatus(Long l10, V2MasterType v2MasterType, V2MasterSubType v2MasterSubType, Integer num, String str, String str2, V2CloudDisconnectedState v2CloudDisconnectedState, h hVar) {
        super(ADAPTER, hVar);
        this.deviceID = l10;
        this.type = v2MasterType;
        this.subType = v2MasterSubType;
        this.batteryLevel = num;
        this.cloudEmailAddress = str;
        this.version = str2;
        this.cloudDisconnectionState = v2CloudDisconnectedState;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m83newBuilder() {
        Builder builder = new Builder();
        builder.deviceID = this.deviceID;
        builder.type = this.type;
        builder.subType = this.subType;
        builder.batteryLevel = this.batteryLevel;
        builder.cloudEmailAddress = this.cloudEmailAddress;
        builder.version = this.version;
        builder.cloudDisconnectionState = this.cloudDisconnectionState;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
