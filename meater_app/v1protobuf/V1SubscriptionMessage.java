package com.apptionlabs.meater_app.v1protobuf;

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
public final class V1SubscriptionMessage extends Message<V1SubscriptionMessage, Builder> {
    public static final String DEFAULT_APPVERSION = "";
    public static final String DEFAULT_DEVICEINFO = "";
    public static final String DEFAULT_EMAILADDRESS = "";
    public static final String DEFAULT_OSVERSION = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String appVersion;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1MasterType#ADAPTER", tag = 3)
    public final V1MasterType clientType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REPEATED, tag = 2)
    public final List<Long> desiredProbes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String deviceInfo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String emailAddress;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1MeaterLinkHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final V1MeaterLinkHeader header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String osVersion;
    public static final ProtoAdapter<V1SubscriptionMessage> ADAPTER = new ProtoAdapter_LegacySubscriptionMessage();
    public static final V1MasterType DEFAULT_CLIENTTYPE = V1MasterType.MASTER_TYPE_BLOCK;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V1SubscriptionMessage, Builder> {
        public String appVersion;
        public V1MasterType clientType;
        public List<Long> desiredProbes = Internal.newMutableList();
        public String deviceInfo;
        public String emailAddress;
        public V1MeaterLinkHeader header;
        public String osVersion;

        public Builder appVersion(String str) {
            this.appVersion = str;
            return this;
        }

        public Builder clientType(V1MasterType v1MasterType) {
            this.clientType = v1MasterType;
            return this;
        }

        public Builder desiredProbes(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.desiredProbes = list;
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

        public Builder header(V1MeaterLinkHeader v1MeaterLinkHeader) {
            this.header = v1MeaterLinkHeader;
            return this;
        }

        public Builder osVersion(String str) {
            this.osVersion = str;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V1SubscriptionMessage m36build() {
            V1MeaterLinkHeader v1MeaterLinkHeader = this.header;
            if (v1MeaterLinkHeader != null) {
                return new V1SubscriptionMessage(this.header, this.desiredProbes, this.clientType, this.emailAddress, this.deviceInfo, this.appVersion, this.osVersion, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{v1MeaterLinkHeader, "header"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_LegacySubscriptionMessage extends ProtoAdapter<V1SubscriptionMessage> {
        ProtoAdapter_LegacySubscriptionMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, V1SubscriptionMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V1SubscriptionMessage m37decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.header((V1MeaterLinkHeader) V1MeaterLinkHeader.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.desiredProbes.add((Long) ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        case 3:
                            try {
                                builder.clientType((V1MasterType) V1MasterType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
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
                    return builder.m36build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V1SubscriptionMessage v1SubscriptionMessage) {
            V1MeaterLinkHeader.ADAPTER.encodeWithTag(protoWriter, 1, v1SubscriptionMessage.header);
            if (v1SubscriptionMessage.desiredProbes != null) {
                ProtoAdapter.UINT64.asRepeated().encodeWithTag(protoWriter, 2, v1SubscriptionMessage.desiredProbes);
            }
            V1MasterType v1MasterType = v1SubscriptionMessage.clientType;
            if (v1MasterType != null) {
                V1MasterType.ADAPTER.encodeWithTag(protoWriter, 3, v1MasterType);
            }
            String str = v1SubscriptionMessage.emailAddress;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, str);
            }
            String str2 = v1SubscriptionMessage.deviceInfo;
            if (str2 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, str2);
            }
            String str3 = v1SubscriptionMessage.appVersion;
            if (str3 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, str3);
            }
            String str4 = v1SubscriptionMessage.osVersion;
            if (str4 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, str4);
            }
            protoWriter.writeBytes(v1SubscriptionMessage.unknownFields());
        }

        public int encodedSize(V1SubscriptionMessage v1SubscriptionMessage) {
            int encodedSizeWithTag = V1MeaterLinkHeader.ADAPTER.encodedSizeWithTag(1, v1SubscriptionMessage.header) + ProtoAdapter.UINT64.asRepeated().encodedSizeWithTag(2, v1SubscriptionMessage.desiredProbes);
            V1MasterType v1MasterType = v1SubscriptionMessage.clientType;
            int encodedSizeWithTag2 = encodedSizeWithTag + (v1MasterType != null ? V1MasterType.ADAPTER.encodedSizeWithTag(3, v1MasterType) : 0);
            String str = v1SubscriptionMessage.emailAddress;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, str) : 0);
            String str2 = v1SubscriptionMessage.deviceInfo;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + (str2 != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, str2) : 0);
            String str3 = v1SubscriptionMessage.appVersion;
            int encodedSizeWithTag5 = encodedSizeWithTag4 + (str3 != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, str3) : 0);
            String str4 = v1SubscriptionMessage.osVersion;
            return encodedSizeWithTag5 + (str4 != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, str4) : 0) + v1SubscriptionMessage.unknownFields().I();
        }

        public V1SubscriptionMessage redact(V1SubscriptionMessage v1SubscriptionMessage) {
            Builder m35newBuilder = v1SubscriptionMessage.m35newBuilder();
            V1MeaterLinkHeader v1MeaterLinkHeader = m35newBuilder.header;
            if (v1MeaterLinkHeader != null) {
                m35newBuilder.header = (V1MeaterLinkHeader) V1MeaterLinkHeader.ADAPTER.redact(v1MeaterLinkHeader);
            }
            m35newBuilder.clearUnknownFields();
            return m35newBuilder.m36build();
        }
    }

    public V1SubscriptionMessage(V1MeaterLinkHeader v1MeaterLinkHeader, List<Long> list, V1MasterType v1MasterType, String str, String str2, String str3, String str4) {
        this(v1MeaterLinkHeader, list, v1MasterType, str, str2, str3, str4, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1SubscriptionMessage)) {
            return false;
        }
        V1SubscriptionMessage v1SubscriptionMessage = (V1SubscriptionMessage) obj;
        if (Internal.equals(unknownFields(), v1SubscriptionMessage.unknownFields()) && Internal.equals(this.header, v1SubscriptionMessage.header) && Internal.equals(this.desiredProbes, v1SubscriptionMessage.desiredProbes) && Internal.equals(this.clientType, v1SubscriptionMessage.clientType) && Internal.equals(this.emailAddress, v1SubscriptionMessage.emailAddress) && Internal.equals(this.deviceInfo, v1SubscriptionMessage.deviceInfo) && Internal.equals(this.appVersion, v1SubscriptionMessage.appVersion) && Internal.equals(this.osVersion, v1SubscriptionMessage.osVersion)) {
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
            V1MeaterLinkHeader v1MeaterLinkHeader = this.header;
            int i17 = 0;
            if (v1MeaterLinkHeader != null) {
                i10 = v1MeaterLinkHeader.hashCode();
            } else {
                i10 = 0;
            }
            int i18 = (hashCode + i10) * 37;
            List<Long> list = this.desiredProbes;
            if (list != null) {
                i11 = list.hashCode();
            } else {
                i11 = 1;
            }
            int i19 = (i18 + i11) * 37;
            V1MasterType v1MasterType = this.clientType;
            if (v1MasterType != null) {
                i12 = v1MasterType.hashCode();
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
        if (this.header != null) {
            sb.append(", header=");
            sb.append(this.header);
        }
        if (this.desiredProbes != null) {
            sb.append(", desiredProbes=");
            sb.append(this.desiredProbes);
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
        StringBuilder replace = sb.replace(0, 2, "V1SubscriptionMessage{");
        replace.append('}');
        return replace.toString();
    }

    public V1SubscriptionMessage(V1MeaterLinkHeader v1MeaterLinkHeader, List<Long> list, V1MasterType v1MasterType, String str, String str2, String str3, String str4, h hVar) {
        super(ADAPTER, hVar);
        this.header = v1MeaterLinkHeader;
        this.desiredProbes = Internal.immutableCopyOf("desiredProbes", list);
        this.clientType = v1MasterType;
        this.emailAddress = str;
        this.deviceInfo = str2;
        this.appVersion = str3;
        this.osVersion = str4;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m35newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.desiredProbes = Internal.copyOf("desiredProbes", this.desiredProbes);
        builder.clientType = this.clientType;
        builder.emailAddress = this.emailAddress;
        builder.deviceInfo = this.deviceInfo;
        builder.appVersion = this.appVersion;
        builder.osVersion = this.osVersion;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
