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
public final class SubscriptionMessage extends Message<SubscriptionMessage, Builder> {
    public static final String DEFAULT_APPVERSION = "";
    public static final String DEFAULT_DEVICEINFO = "";
    public static final String DEFAULT_EMAILADDRESS = "";
    public static final String DEFAULT_OSVERSION = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String appVersion;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MasterType#ADAPTER", tag = 2)
    public final MasterType clientType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.PACKED, tag = 1)
    public final List<Long> desiredDevices;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String deviceInfo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String emailAddress;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String osVersion;
    public static final ProtoAdapter<SubscriptionMessage> ADAPTER = new ProtoAdapter_SubscriptionMessage();
    public static final MasterType DEFAULT_CLIENTTYPE = MasterType.MASTER_TYPE_BLOCK;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<SubscriptionMessage, Builder> {
        public String appVersion;
        public MasterType clientType;
        public List<Long> desiredDevices = Internal.newMutableList();
        public String deviceInfo;
        public String emailAddress;
        public String osVersion;

        public Builder appVersion(String str) {
            this.appVersion = str;
            return this;
        }

        public Builder clientType(MasterType masterType) {
            this.clientType = masterType;
            return this;
        }

        public Builder desiredDevices(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.desiredDevices = list;
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

        public Builder osVersion(String str) {
            this.osVersion = str;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public SubscriptionMessage m369build() {
            return new SubscriptionMessage(this.desiredDevices, this.clientType, this.emailAddress, this.deviceInfo, this.appVersion, this.osVersion, buildUnknownFields());
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_SubscriptionMessage extends ProtoAdapter<SubscriptionMessage> {
        ProtoAdapter_SubscriptionMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, SubscriptionMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public SubscriptionMessage m370decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.desiredDevices.add((Long) ProtoAdapter.FIXED64.decode(protoReader));
                            break;
                        case 2:
                            try {
                                builder.clientType((MasterType) MasterType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        case 3:
                            builder.emailAddress((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.deviceInfo((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.appVersion((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.osVersion((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m369build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, SubscriptionMessage subscriptionMessage) {
            if (subscriptionMessage.desiredDevices != null) {
                ProtoAdapter.FIXED64.asPacked().encodeWithTag(protoWriter, 1, subscriptionMessage.desiredDevices);
            }
            MasterType masterType = subscriptionMessage.clientType;
            if (masterType != null) {
                MasterType.ADAPTER.encodeWithTag(protoWriter, 2, masterType);
            }
            String str = subscriptionMessage.emailAddress;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, str);
            }
            String str2 = subscriptionMessage.deviceInfo;
            if (str2 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, str2);
            }
            String str3 = subscriptionMessage.appVersion;
            if (str3 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, str3);
            }
            String str4 = subscriptionMessage.osVersion;
            if (str4 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, str4);
            }
            protoWriter.writeBytes(subscriptionMessage.unknownFields());
        }

        public int encodedSize(SubscriptionMessage subscriptionMessage) {
            int encodedSizeWithTag = ProtoAdapter.FIXED64.asPacked().encodedSizeWithTag(1, subscriptionMessage.desiredDevices);
            MasterType masterType = subscriptionMessage.clientType;
            int encodedSizeWithTag2 = encodedSizeWithTag + (masterType != null ? MasterType.ADAPTER.encodedSizeWithTag(2, masterType) : 0);
            String str = subscriptionMessage.emailAddress;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, str) : 0);
            String str2 = subscriptionMessage.deviceInfo;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + (str2 != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, str2) : 0);
            String str3 = subscriptionMessage.appVersion;
            int encodedSizeWithTag5 = encodedSizeWithTag4 + (str3 != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, str3) : 0);
            String str4 = subscriptionMessage.osVersion;
            return encodedSizeWithTag5 + (str4 != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, str4) : 0) + subscriptionMessage.unknownFields().I();
        }

        public SubscriptionMessage redact(SubscriptionMessage subscriptionMessage) {
            Builder m368newBuilder = subscriptionMessage.m368newBuilder();
            m368newBuilder.clearUnknownFields();
            return m368newBuilder.m369build();
        }
    }

    public SubscriptionMessage(List<Long> list, MasterType masterType, String str, String str2, String str3, String str4) {
        this(list, masterType, str, str2, str3, str4, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubscriptionMessage)) {
            return false;
        }
        SubscriptionMessage subscriptionMessage = (SubscriptionMessage) obj;
        if (Internal.equals(unknownFields(), subscriptionMessage.unknownFields()) && Internal.equals(this.desiredDevices, subscriptionMessage.desiredDevices) && Internal.equals(this.clientType, subscriptionMessage.clientType) && Internal.equals(this.emailAddress, subscriptionMessage.emailAddress) && Internal.equals(this.deviceInfo, subscriptionMessage.deviceInfo) && Internal.equals(this.appVersion, subscriptionMessage.appVersion) && Internal.equals(this.osVersion, subscriptionMessage.osVersion)) {
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
            List<Long> list = this.desiredDevices;
            if (list != null) {
                i10 = list.hashCode();
            } else {
                i10 = 1;
            }
            int i16 = (hashCode + i10) * 37;
            MasterType masterType = this.clientType;
            int i17 = 0;
            if (masterType != null) {
                i11 = masterType.hashCode();
            } else {
                i11 = 0;
            }
            int i18 = (i16 + i11) * 37;
            String str = this.emailAddress;
            if (str != null) {
                i12 = str.hashCode();
            } else {
                i12 = 0;
            }
            int i19 = (i18 + i12) * 37;
            String str2 = this.deviceInfo;
            if (str2 != null) {
                i13 = str2.hashCode();
            } else {
                i13 = 0;
            }
            int i20 = (i19 + i13) * 37;
            String str3 = this.appVersion;
            if (str3 != null) {
                i14 = str3.hashCode();
            } else {
                i14 = 0;
            }
            int i21 = (i20 + i14) * 37;
            String str4 = this.osVersion;
            if (str4 != null) {
                i17 = str4.hashCode();
            }
            int i22 = i21 + i17;
            ((Message) this).hashCode = i22;
            return i22;
        }
        return i15;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.desiredDevices != null) {
            sb.append(", desiredDevices=");
            sb.append(this.desiredDevices);
        }
        if (this.clientType != null) {
            sb.append(", clientType=");
            sb.append(this.clientType);
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
        StringBuilder replace = sb.replace(0, 2, "SubscriptionMessage{");
        replace.append('}');
        return replace.toString();
    }

    public SubscriptionMessage(List<Long> list, MasterType masterType, String str, String str2, String str3, String str4, h hVar) {
        super(ADAPTER, hVar);
        this.desiredDevices = Internal.immutableCopyOf("desiredDevices", list);
        this.clientType = masterType;
        this.emailAddress = str;
        this.deviceInfo = str2;
        this.appVersion = str3;
        this.osVersion = str4;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m368newBuilder() {
        Builder builder = new Builder();
        builder.desiredDevices = Internal.copyOf("desiredDevices", this.desiredDevices);
        builder.clientType = this.clientType;
        builder.emailAddress = this.emailAddress;
        builder.deviceInfo = this.deviceInfo;
        builder.appVersion = this.appVersion;
        builder.osVersion = this.osVersion;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
