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
public final class MCPushNotificationMessage extends Message<MCPushNotificationMessage, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.CookSetup#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final CookSetup cook;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long deviceID;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MasterType#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final MasterType masterType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer meta;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MCNotificationType#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final MCNotificationType notificationType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer probeNumber;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.CookStatus#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    public final CookStatus status;
    public static final ProtoAdapter<MCPushNotificationMessage> ADAPTER = new ProtoAdapter_MCPushNotificationMessage();
    public static final Long DEFAULT_DEVICEID = 0L;
    public static final Integer DEFAULT_PROBENUMBER = 0;
    public static final MCNotificationType DEFAULT_NOTIFICATIONTYPE = MCNotificationType.NOTIFICATION_TYPE_INFO;
    public static final MasterType DEFAULT_MASTERTYPE = MasterType.MASTER_TYPE_BLOCK;
    public static final Integer DEFAULT_META = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MCPushNotificationMessage, Builder> {
        public CookSetup cook;
        public Long deviceID;
        public MasterType masterType;
        public Integer meta;
        public MCNotificationType notificationType;
        public Integer probeNumber;
        public CookStatus status;

        public Builder cook(CookSetup cookSetup) {
            this.cook = cookSetup;
            return this;
        }

        public Builder deviceID(Long l10) {
            this.deviceID = l10;
            return this;
        }

        public Builder masterType(MasterType masterType) {
            this.masterType = masterType;
            return this;
        }

        public Builder meta(Integer num) {
            this.meta = num;
            return this;
        }

        public Builder notificationType(MCNotificationType mCNotificationType) {
            this.notificationType = mCNotificationType;
            return this;
        }

        public Builder probeNumber(Integer num) {
            this.probeNumber = num;
            return this;
        }

        public Builder status(CookStatus cookStatus) {
            this.status = cookStatus;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MCPushNotificationMessage m201build() {
            Long l10 = this.deviceID;
            if (l10 != null && this.probeNumber != null && this.notificationType != null && this.cook != null && this.status != null && this.masterType != null) {
                return new MCPushNotificationMessage(this.deviceID, this.probeNumber, this.notificationType, this.cook, this.status, this.masterType, this.meta, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "deviceID", this.probeNumber, "probeNumber", this.notificationType, "notificationType", this.cook, "cook", this.status, "status", this.masterType, "masterType"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MCPushNotificationMessage extends ProtoAdapter<MCPushNotificationMessage> {
        ProtoAdapter_MCPushNotificationMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, MCPushNotificationMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MCPushNotificationMessage m202decode(ProtoReader protoReader) {
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
                            builder.probeNumber((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 3:
                            try {
                                builder.notificationType((MCNotificationType) MCNotificationType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        case 4:
                            builder.cook((CookSetup) CookSetup.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.status((CookStatus) CookStatus.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            try {
                                builder.masterType((MasterType) MasterType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e11.value));
                                break;
                            }
                        case 7:
                            builder.meta((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m201build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MCPushNotificationMessage mCPushNotificationMessage) {
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, mCPushNotificationMessage.deviceID);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, mCPushNotificationMessage.probeNumber);
            MCNotificationType.ADAPTER.encodeWithTag(protoWriter, 3, mCPushNotificationMessage.notificationType);
            CookSetup.ADAPTER.encodeWithTag(protoWriter, 4, mCPushNotificationMessage.cook);
            CookStatus.ADAPTER.encodeWithTag(protoWriter, 5, mCPushNotificationMessage.status);
            MasterType.ADAPTER.encodeWithTag(protoWriter, 6, mCPushNotificationMessage.masterType);
            Integer num = mCPushNotificationMessage.meta;
            if (num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, num);
            }
            protoWriter.writeBytes(mCPushNotificationMessage.unknownFields());
        }

        public int encodedSize(MCPushNotificationMessage mCPushNotificationMessage) {
            int encodedSizeWithTag = ProtoAdapter.FIXED64.encodedSizeWithTag(1, mCPushNotificationMessage.deviceID) + ProtoAdapter.UINT32.encodedSizeWithTag(2, mCPushNotificationMessage.probeNumber) + MCNotificationType.ADAPTER.encodedSizeWithTag(3, mCPushNotificationMessage.notificationType) + CookSetup.ADAPTER.encodedSizeWithTag(4, mCPushNotificationMessage.cook) + CookStatus.ADAPTER.encodedSizeWithTag(5, mCPushNotificationMessage.status) + MasterType.ADAPTER.encodedSizeWithTag(6, mCPushNotificationMessage.masterType);
            Integer num = mCPushNotificationMessage.meta;
            return encodedSizeWithTag + (num != null ? ProtoAdapter.INT32.encodedSizeWithTag(7, num) : 0) + mCPushNotificationMessage.unknownFields().I();
        }

        public MCPushNotificationMessage redact(MCPushNotificationMessage mCPushNotificationMessage) {
            Builder m200newBuilder = mCPushNotificationMessage.m200newBuilder();
            CookSetup cookSetup = m200newBuilder.cook;
            if (cookSetup != null) {
                m200newBuilder.cook = (CookSetup) CookSetup.ADAPTER.redact(cookSetup);
            }
            CookStatus cookStatus = m200newBuilder.status;
            if (cookStatus != null) {
                m200newBuilder.status = (CookStatus) CookStatus.ADAPTER.redact(cookStatus);
            }
            m200newBuilder.clearUnknownFields();
            return m200newBuilder.m201build();
        }
    }

    public MCPushNotificationMessage(Long l10, Integer num, MCNotificationType mCNotificationType, CookSetup cookSetup, CookStatus cookStatus, MasterType masterType, Integer num2) {
        this(l10, num, mCNotificationType, cookSetup, cookStatus, masterType, num2, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MCPushNotificationMessage)) {
            return false;
        }
        MCPushNotificationMessage mCPushNotificationMessage = (MCPushNotificationMessage) obj;
        if (Internal.equals(unknownFields(), mCPushNotificationMessage.unknownFields()) && Internal.equals(this.deviceID, mCPushNotificationMessage.deviceID) && Internal.equals(this.probeNumber, mCPushNotificationMessage.probeNumber) && Internal.equals(this.notificationType, mCPushNotificationMessage.notificationType) && Internal.equals(this.cook, mCPushNotificationMessage.cook) && Internal.equals(this.status, mCPushNotificationMessage.status) && Internal.equals(this.masterType, mCPushNotificationMessage.masterType) && Internal.equals(this.meta, mCPushNotificationMessage.meta)) {
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
            Integer num = this.probeNumber;
            if (num != null) {
                i11 = num.hashCode();
            } else {
                i11 = 0;
            }
            int i19 = (i18 + i11) * 37;
            MCNotificationType mCNotificationType = this.notificationType;
            if (mCNotificationType != null) {
                i12 = mCNotificationType.hashCode();
            } else {
                i12 = 0;
            }
            int i20 = (i19 + i12) * 37;
            CookSetup cookSetup = this.cook;
            if (cookSetup != null) {
                i13 = cookSetup.hashCode();
            } else {
                i13 = 0;
            }
            int i21 = (i20 + i13) * 37;
            CookStatus cookStatus = this.status;
            if (cookStatus != null) {
                i14 = cookStatus.hashCode();
            } else {
                i14 = 0;
            }
            int i22 = (i21 + i14) * 37;
            MasterType masterType = this.masterType;
            if (masterType != null) {
                i15 = masterType.hashCode();
            } else {
                i15 = 0;
            }
            int i23 = (i22 + i15) * 37;
            Integer num2 = this.meta;
            if (num2 != null) {
                i17 = num2.hashCode();
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
        if (this.probeNumber != null) {
            sb.append(", probeNumber=");
            sb.append(this.probeNumber);
        }
        if (this.notificationType != null) {
            sb.append(", notificationType=");
            sb.append(this.notificationType);
        }
        if (this.cook != null) {
            sb.append(", cook=");
            sb.append(this.cook);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.masterType != null) {
            sb.append(", masterType=");
            sb.append(this.masterType);
        }
        if (this.meta != null) {
            sb.append(", meta=");
            sb.append(this.meta);
        }
        StringBuilder replace = sb.replace(0, 2, "MCPushNotificationMessage{");
        replace.append('}');
        return replace.toString();
    }

    public MCPushNotificationMessage(Long l10, Integer num, MCNotificationType mCNotificationType, CookSetup cookSetup, CookStatus cookStatus, MasterType masterType, Integer num2, h hVar) {
        super(ADAPTER, hVar);
        this.deviceID = l10;
        this.probeNumber = num;
        this.notificationType = mCNotificationType;
        this.cook = cookSetup;
        this.status = cookStatus;
        this.masterType = masterType;
        this.meta = num2;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m200newBuilder() {
        Builder builder = new Builder();
        builder.deviceID = this.deviceID;
        builder.probeNumber = this.probeNumber;
        builder.notificationType = this.notificationType;
        builder.cook = this.cook;
        builder.status = this.status;
        builder.masterType = this.masterType;
        builder.meta = this.meta;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
