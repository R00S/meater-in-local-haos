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
public final class MEATERLinkClientSubscriptionEvent extends Message<MEATERLinkClientSubscriptionEvent, Builder> {
    public static final String DEFAULT_APPVERSION = "";
    public static final String DEFAULT_DEVICEINFO = "";
    public static final String DEFAULT_EMAILADDRESS = "";
    public static final String DEFAULT_OSVERSION = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String appVersion;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MasterType#ADAPTER", tag = 3)
    public final MasterType clientType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer currentSubscriberCount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String deviceInfo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String emailAddress;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String osVersion;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MEATERLinkClientSubscriptionState#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final MEATERLinkClientSubscriptionState state;
    public static final ProtoAdapter<MEATERLinkClientSubscriptionEvent> ADAPTER = new ProtoAdapter_MEATERLinkClientSubscriptionEvent();
    public static final MEATERLinkClientSubscriptionState DEFAULT_STATE = MEATERLinkClientSubscriptionState.MEATER_LINK_CLIENT_SUBSCRIPTION_STATE_SUBSCRIBE;
    public static final Integer DEFAULT_CURRENTSUBSCRIBERCOUNT = 0;
    public static final MasterType DEFAULT_CLIENTTYPE = MasterType.MASTER_TYPE_BLOCK;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MEATERLinkClientSubscriptionEvent, Builder> {
        public String appVersion;
        public MasterType clientType;
        public Integer currentSubscriberCount;
        public String deviceInfo;
        public String emailAddress;
        public String osVersion;
        public MEATERLinkClientSubscriptionState state;

        public Builder appVersion(String str) {
            this.appVersion = str;
            return this;
        }

        public Builder clientType(MasterType masterType) {
            this.clientType = masterType;
            return this;
        }

        public Builder currentSubscriberCount(Integer num) {
            this.currentSubscriberCount = num;
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

        public Builder state(MEATERLinkClientSubscriptionState mEATERLinkClientSubscriptionState) {
            this.state = mEATERLinkClientSubscriptionState;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MEATERLinkClientSubscriptionEvent m228build() {
            MEATERLinkClientSubscriptionState mEATERLinkClientSubscriptionState = this.state;
            if (mEATERLinkClientSubscriptionState != null && this.currentSubscriberCount != null) {
                return new MEATERLinkClientSubscriptionEvent(this.state, this.currentSubscriberCount, this.clientType, this.emailAddress, this.deviceInfo, this.appVersion, this.osVersion, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{mEATERLinkClientSubscriptionState, "state", this.currentSubscriberCount, "currentSubscriberCount"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MEATERLinkClientSubscriptionEvent extends ProtoAdapter<MEATERLinkClientSubscriptionEvent> {
        ProtoAdapter_MEATERLinkClientSubscriptionEvent() {
            super(FieldEncoding.LENGTH_DELIMITED, MEATERLinkClientSubscriptionEvent.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MEATERLinkClientSubscriptionEvent m229decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                builder.state((MEATERLinkClientSubscriptionState) MEATERLinkClientSubscriptionState.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        case 2:
                            builder.currentSubscriberCount((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 3:
                            try {
                                builder.clientType((MasterType) MasterType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e11.value));
                                break;
                            }
                        case 4:
                            builder.emailAddress((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.deviceInfo((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.appVersion((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.osVersion((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m228build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MEATERLinkClientSubscriptionEvent mEATERLinkClientSubscriptionEvent) {
            MEATERLinkClientSubscriptionState.ADAPTER.encodeWithTag(protoWriter, 1, mEATERLinkClientSubscriptionEvent.state);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, mEATERLinkClientSubscriptionEvent.currentSubscriberCount);
            MasterType masterType = mEATERLinkClientSubscriptionEvent.clientType;
            if (masterType != null) {
                MasterType.ADAPTER.encodeWithTag(protoWriter, 3, masterType);
            }
            String str = mEATERLinkClientSubscriptionEvent.emailAddress;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, str);
            }
            String str2 = mEATERLinkClientSubscriptionEvent.deviceInfo;
            if (str2 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, str2);
            }
            String str3 = mEATERLinkClientSubscriptionEvent.appVersion;
            if (str3 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, str3);
            }
            String str4 = mEATERLinkClientSubscriptionEvent.osVersion;
            if (str4 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, str4);
            }
            protoWriter.writeBytes(mEATERLinkClientSubscriptionEvent.unknownFields());
        }

        public int encodedSize(MEATERLinkClientSubscriptionEvent mEATERLinkClientSubscriptionEvent) {
            int encodedSizeWithTag = MEATERLinkClientSubscriptionState.ADAPTER.encodedSizeWithTag(1, mEATERLinkClientSubscriptionEvent.state) + ProtoAdapter.UINT32.encodedSizeWithTag(2, mEATERLinkClientSubscriptionEvent.currentSubscriberCount);
            MasterType masterType = mEATERLinkClientSubscriptionEvent.clientType;
            int encodedSizeWithTag2 = encodedSizeWithTag + (masterType != null ? MasterType.ADAPTER.encodedSizeWithTag(3, masterType) : 0);
            String str = mEATERLinkClientSubscriptionEvent.emailAddress;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, str) : 0);
            String str2 = mEATERLinkClientSubscriptionEvent.deviceInfo;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + (str2 != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, str2) : 0);
            String str3 = mEATERLinkClientSubscriptionEvent.appVersion;
            int encodedSizeWithTag5 = encodedSizeWithTag4 + (str3 != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, str3) : 0);
            String str4 = mEATERLinkClientSubscriptionEvent.osVersion;
            return encodedSizeWithTag5 + (str4 != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, str4) : 0) + mEATERLinkClientSubscriptionEvent.unknownFields().I();
        }

        public MEATERLinkClientSubscriptionEvent redact(MEATERLinkClientSubscriptionEvent mEATERLinkClientSubscriptionEvent) {
            Builder m227newBuilder = mEATERLinkClientSubscriptionEvent.m227newBuilder();
            m227newBuilder.clearUnknownFields();
            return m227newBuilder.m228build();
        }
    }

    public MEATERLinkClientSubscriptionEvent(MEATERLinkClientSubscriptionState mEATERLinkClientSubscriptionState, Integer num, MasterType masterType, String str, String str2, String str3, String str4) {
        this(mEATERLinkClientSubscriptionState, num, masterType, str, str2, str3, str4, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MEATERLinkClientSubscriptionEvent)) {
            return false;
        }
        MEATERLinkClientSubscriptionEvent mEATERLinkClientSubscriptionEvent = (MEATERLinkClientSubscriptionEvent) obj;
        if (Internal.equals(unknownFields(), mEATERLinkClientSubscriptionEvent.unknownFields()) && Internal.equals(this.state, mEATERLinkClientSubscriptionEvent.state) && Internal.equals(this.currentSubscriberCount, mEATERLinkClientSubscriptionEvent.currentSubscriberCount) && Internal.equals(this.clientType, mEATERLinkClientSubscriptionEvent.clientType) && Internal.equals(this.emailAddress, mEATERLinkClientSubscriptionEvent.emailAddress) && Internal.equals(this.deviceInfo, mEATERLinkClientSubscriptionEvent.deviceInfo) && Internal.equals(this.appVersion, mEATERLinkClientSubscriptionEvent.appVersion) && Internal.equals(this.osVersion, mEATERLinkClientSubscriptionEvent.osVersion)) {
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
            MEATERLinkClientSubscriptionState mEATERLinkClientSubscriptionState = this.state;
            int i17 = 0;
            if (mEATERLinkClientSubscriptionState != null) {
                i10 = mEATERLinkClientSubscriptionState.hashCode();
            } else {
                i10 = 0;
            }
            int i18 = (hashCode + i10) * 37;
            Integer num = this.currentSubscriberCount;
            if (num != null) {
                i11 = num.hashCode();
            } else {
                i11 = 0;
            }
            int i19 = (i18 + i11) * 37;
            MasterType masterType = this.clientType;
            if (masterType != null) {
                i12 = masterType.hashCode();
            } else {
                i12 = 0;
            }
            int i20 = (i19 + i12) * 37;
            String str = this.emailAddress;
            if (str != null) {
                i13 = str.hashCode();
            } else {
                i13 = 0;
            }
            int i21 = (i20 + i13) * 37;
            String str2 = this.deviceInfo;
            if (str2 != null) {
                i14 = str2.hashCode();
            } else {
                i14 = 0;
            }
            int i22 = (i21 + i14) * 37;
            String str3 = this.appVersion;
            if (str3 != null) {
                i15 = str3.hashCode();
            } else {
                i15 = 0;
            }
            int i23 = (i22 + i15) * 37;
            String str4 = this.osVersion;
            if (str4 != null) {
                i17 = str4.hashCode();
            }
            int i24 = i23 + i17;
            ((Message) this).hashCode = i24;
            return i24;
        }
        return i16;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.state != null) {
            sb.append(", state=");
            sb.append(this.state);
        }
        if (this.currentSubscriberCount != null) {
            sb.append(", currentSubscriberCount=");
            sb.append(this.currentSubscriberCount);
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
        StringBuilder replace = sb.replace(0, 2, "MEATERLinkClientSubscriptionEvent{");
        replace.append('}');
        return replace.toString();
    }

    public MEATERLinkClientSubscriptionEvent(MEATERLinkClientSubscriptionState mEATERLinkClientSubscriptionState, Integer num, MasterType masterType, String str, String str2, String str3, String str4, h hVar) {
        super(ADAPTER, hVar);
        this.state = mEATERLinkClientSubscriptionState;
        this.currentSubscriberCount = num;
        this.clientType = masterType;
        this.emailAddress = str;
        this.deviceInfo = str2;
        this.appVersion = str3;
        this.osVersion = str4;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m227newBuilder() {
        Builder builder = new Builder();
        builder.state = this.state;
        builder.currentSubscriberCount = this.currentSubscriberCount;
        builder.clientType = this.clientType;
        builder.emailAddress = this.emailAddress;
        builder.deviceInfo = this.deviceInfo;
        builder.appVersion = this.appVersion;
        builder.osVersion = this.osVersion;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
