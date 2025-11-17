package com.apptionlabs.meater_app.v2protobuf;

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
public final class V2SubscriptionMessage extends Message<V2SubscriptionMessage, Builder> {
    public static final String DEFAULT_APPVERSION = "";
    public static final String DEFAULT_DEVICEINFO = "";
    public static final String DEFAULT_EMAILADDRESS = "";
    public static final String DEFAULT_OSVERSION = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String appVersion;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2MasterType#ADAPTER", tag = 2)
    public final V2MasterType clientType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.PACKED, tag = 1)
    public final List<Long> desiredDevices;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String deviceInfo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String emailAddress;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String osVersion;
    public static final ProtoAdapter<V2SubscriptionMessage> ADAPTER = new ProtoAdapter_V2SubscriptionMessage();
    public static final V2MasterType DEFAULT_CLIENTTYPE = V2MasterType.V2MASTER_TYPE_BLOCK;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2SubscriptionMessage, Builder> {
        public String appVersion;
        public V2MasterType clientType;
        public List<Long> desiredDevices = Internal.newMutableList();
        public String deviceInfo;
        public String emailAddress;
        public String osVersion;

        public Builder appVersion(String str) {
            this.appVersion = str;
            return this;
        }

        public Builder clientType(V2MasterType v2MasterType) {
            this.clientType = v2MasterType;
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
        public V2SubscriptionMessage m120build() {
            return new V2SubscriptionMessage(this.desiredDevices, this.clientType, this.emailAddress, this.deviceInfo, this.appVersion, this.osVersion, buildUnknownFields());
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2SubscriptionMessage extends ProtoAdapter<V2SubscriptionMessage> {
        ProtoAdapter_V2SubscriptionMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, V2SubscriptionMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2SubscriptionMessage m121decode(ProtoReader protoReader) {
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
                                builder.clientType((V2MasterType) V2MasterType.ADAPTER.decode(protoReader));
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
                    return builder.m120build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2SubscriptionMessage v2SubscriptionMessage) {
            if (v2SubscriptionMessage.desiredDevices != null) {
                ProtoAdapter.FIXED64.asPacked().encodeWithTag(protoWriter, 1, v2SubscriptionMessage.desiredDevices);
            }
            V2MasterType v2MasterType = v2SubscriptionMessage.clientType;
            if (v2MasterType != null) {
                V2MasterType.ADAPTER.encodeWithTag(protoWriter, 2, v2MasterType);
            }
            String str = v2SubscriptionMessage.emailAddress;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, str);
            }
            String str2 = v2SubscriptionMessage.deviceInfo;
            if (str2 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, str2);
            }
            String str3 = v2SubscriptionMessage.appVersion;
            if (str3 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, str3);
            }
            String str4 = v2SubscriptionMessage.osVersion;
            if (str4 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, str4);
            }
            protoWriter.writeBytes(v2SubscriptionMessage.unknownFields());
        }

        public int encodedSize(V2SubscriptionMessage v2SubscriptionMessage) {
            int encodedSizeWithTag = ProtoAdapter.FIXED64.asPacked().encodedSizeWithTag(1, v2SubscriptionMessage.desiredDevices);
            V2MasterType v2MasterType = v2SubscriptionMessage.clientType;
            int encodedSizeWithTag2 = encodedSizeWithTag + (v2MasterType != null ? V2MasterType.ADAPTER.encodedSizeWithTag(2, v2MasterType) : 0);
            String str = v2SubscriptionMessage.emailAddress;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, str) : 0);
            String str2 = v2SubscriptionMessage.deviceInfo;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + (str2 != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, str2) : 0);
            String str3 = v2SubscriptionMessage.appVersion;
            int encodedSizeWithTag5 = encodedSizeWithTag4 + (str3 != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, str3) : 0);
            String str4 = v2SubscriptionMessage.osVersion;
            return encodedSizeWithTag5 + (str4 != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, str4) : 0) + v2SubscriptionMessage.unknownFields().I();
        }

        public V2SubscriptionMessage redact(V2SubscriptionMessage v2SubscriptionMessage) {
            Builder m119newBuilder = v2SubscriptionMessage.m119newBuilder();
            m119newBuilder.clearUnknownFields();
            return m119newBuilder.m120build();
        }
    }

    public V2SubscriptionMessage(List<Long> list, V2MasterType v2MasterType, String str, String str2, String str3, String str4) {
        this(list, v2MasterType, str, str2, str3, str4, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2SubscriptionMessage)) {
            return false;
        }
        V2SubscriptionMessage v2SubscriptionMessage = (V2SubscriptionMessage) obj;
        if (Internal.equals(unknownFields(), v2SubscriptionMessage.unknownFields()) && Internal.equals(this.desiredDevices, v2SubscriptionMessage.desiredDevices) && Internal.equals(this.clientType, v2SubscriptionMessage.clientType) && Internal.equals(this.emailAddress, v2SubscriptionMessage.emailAddress) && Internal.equals(this.deviceInfo, v2SubscriptionMessage.deviceInfo) && Internal.equals(this.appVersion, v2SubscriptionMessage.appVersion) && Internal.equals(this.osVersion, v2SubscriptionMessage.osVersion)) {
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
            V2MasterType v2MasterType = this.clientType;
            int i17 = 0;
            if (v2MasterType != null) {
                i11 = v2MasterType.hashCode();
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
        StringBuilder replace = sb.replace(0, 2, "V2SubscriptionMessage{");
        replace.append('}');
        return replace.toString();
    }

    public V2SubscriptionMessage(List<Long> list, V2MasterType v2MasterType, String str, String str2, String str3, String str4, h hVar) {
        super(ADAPTER, hVar);
        this.desiredDevices = Internal.immutableCopyOf("desiredDevices", list);
        this.clientType = v2MasterType;
        this.emailAddress = str;
        this.deviceInfo = str2;
        this.appVersion = str3;
        this.osVersion = str4;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m119newBuilder() {
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
