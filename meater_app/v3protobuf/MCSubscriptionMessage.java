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
public final class MCSubscriptionMessage extends Message<MCSubscriptionMessage, Builder> {
    public static final String DEFAULT_EMAILADDRESS = "";
    public static final String DEFAULT_LANGUAGE = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 4)
    public final h apnsToken;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.PACKED, tag = 2)
    public final List<Long> clientDevices;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 7)
    public final Boolean criticalAlerts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 8)
    public final Integer criticalAlertsVolume;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String emailAddress;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String language;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.PACKED, tag = 1)
    public final List<Long> masterDevices;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MCTemperatureScale#ADAPTER", tag = 6)
    public final MCTemperatureScale temperatureScale;
    public static final ProtoAdapter<MCSubscriptionMessage> ADAPTER = new ProtoAdapter_MCSubscriptionMessage();
    public static final h DEFAULT_APNSTOKEN = h.u;
    public static final MCTemperatureScale DEFAULT_TEMPERATURESCALE = MCTemperatureScale.TEMPERATURE_SCALE_CELSIUS;
    public static final Boolean DEFAULT_CRITICALALERTS = Boolean.FALSE;
    public static final Integer DEFAULT_CRITICALALERTSVOLUME = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MCSubscriptionMessage, Builder> {
        public h apnsToken;
        public Boolean criticalAlerts;
        public Integer criticalAlertsVolume;
        public String emailAddress;
        public String language;
        public MCTemperatureScale temperatureScale;
        public List<Long> masterDevices = Internal.newMutableList();
        public List<Long> clientDevices = Internal.newMutableList();

        public Builder apnsToken(h hVar) {
            this.apnsToken = hVar;
            return this;
        }

        public Builder clientDevices(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.clientDevices = list;
            return this;
        }

        public Builder criticalAlerts(Boolean bool) {
            this.criticalAlerts = bool;
            return this;
        }

        public Builder criticalAlertsVolume(Integer num) {
            this.criticalAlertsVolume = num;
            return this;
        }

        public Builder emailAddress(String str) {
            this.emailAddress = str;
            return this;
        }

        public Builder language(String str) {
            this.language = str;
            return this;
        }

        public Builder masterDevices(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.masterDevices = list;
            return this;
        }

        public Builder temperatureScale(MCTemperatureScale mCTemperatureScale) {
            this.temperatureScale = mCTemperatureScale;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MCSubscriptionMessage m204build() {
            return new MCSubscriptionMessage(this.masterDevices, this.clientDevices, this.emailAddress, this.apnsToken, this.language, this.temperatureScale, this.criticalAlerts, this.criticalAlertsVolume, buildUnknownFields());
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MCSubscriptionMessage extends ProtoAdapter<MCSubscriptionMessage> {
        ProtoAdapter_MCSubscriptionMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, MCSubscriptionMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MCSubscriptionMessage m205decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.masterDevices.add((Long) ProtoAdapter.FIXED64.decode(protoReader));
                            break;
                        case 2:
                            builder.clientDevices.add((Long) ProtoAdapter.FIXED64.decode(protoReader));
                            break;
                        case 3:
                            builder.emailAddress((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.apnsToken((h) ProtoAdapter.BYTES.decode(protoReader));
                            break;
                        case 5:
                            builder.language((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            try {
                                builder.temperatureScale((MCTemperatureScale) MCTemperatureScale.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        case 7:
                            builder.criticalAlerts((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 8:
                            builder.criticalAlertsVolume((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m204build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MCSubscriptionMessage mCSubscriptionMessage) {
            if (mCSubscriptionMessage.masterDevices != null) {
                ProtoAdapter.FIXED64.asPacked().encodeWithTag(protoWriter, 1, mCSubscriptionMessage.masterDevices);
            }
            if (mCSubscriptionMessage.clientDevices != null) {
                ProtoAdapter.FIXED64.asPacked().encodeWithTag(protoWriter, 2, mCSubscriptionMessage.clientDevices);
            }
            String str = mCSubscriptionMessage.emailAddress;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, str);
            }
            h hVar = mCSubscriptionMessage.apnsToken;
            if (hVar != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, hVar);
            }
            String str2 = mCSubscriptionMessage.language;
            if (str2 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, str2);
            }
            MCTemperatureScale mCTemperatureScale = mCSubscriptionMessage.temperatureScale;
            if (mCTemperatureScale != null) {
                MCTemperatureScale.ADAPTER.encodeWithTag(protoWriter, 6, mCTemperatureScale);
            }
            Boolean bool = mCSubscriptionMessage.criticalAlerts;
            if (bool != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, bool);
            }
            Integer num = mCSubscriptionMessage.criticalAlertsVolume;
            if (num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, num);
            }
            protoWriter.writeBytes(mCSubscriptionMessage.unknownFields());
        }

        public int encodedSize(MCSubscriptionMessage mCSubscriptionMessage) {
            ProtoAdapter protoAdapter = ProtoAdapter.FIXED64;
            int encodedSizeWithTag = protoAdapter.asPacked().encodedSizeWithTag(1, mCSubscriptionMessage.masterDevices) + protoAdapter.asPacked().encodedSizeWithTag(2, mCSubscriptionMessage.clientDevices);
            String str = mCSubscriptionMessage.emailAddress;
            int encodedSizeWithTag2 = encodedSizeWithTag + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, str) : 0);
            h hVar = mCSubscriptionMessage.apnsToken;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + (hVar != null ? ProtoAdapter.BYTES.encodedSizeWithTag(4, hVar) : 0);
            String str2 = mCSubscriptionMessage.language;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + (str2 != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, str2) : 0);
            MCTemperatureScale mCTemperatureScale = mCSubscriptionMessage.temperatureScale;
            int encodedSizeWithTag5 = encodedSizeWithTag4 + (mCTemperatureScale != null ? MCTemperatureScale.ADAPTER.encodedSizeWithTag(6, mCTemperatureScale) : 0);
            Boolean bool = mCSubscriptionMessage.criticalAlerts;
            int encodedSizeWithTag6 = encodedSizeWithTag5 + (bool != null ? ProtoAdapter.BOOL.encodedSizeWithTag(7, bool) : 0);
            Integer num = mCSubscriptionMessage.criticalAlertsVolume;
            return encodedSizeWithTag6 + (num != null ? ProtoAdapter.INT32.encodedSizeWithTag(8, num) : 0) + mCSubscriptionMessage.unknownFields().I();
        }

        public MCSubscriptionMessage redact(MCSubscriptionMessage mCSubscriptionMessage) {
            Builder m203newBuilder = mCSubscriptionMessage.m203newBuilder();
            m203newBuilder.clearUnknownFields();
            return m203newBuilder.m204build();
        }
    }

    public MCSubscriptionMessage(List<Long> list, List<Long> list2, String str, h hVar, String str2, MCTemperatureScale mCTemperatureScale, Boolean bool, Integer num) {
        this(list, list2, str, hVar, str2, mCTemperatureScale, bool, num, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MCSubscriptionMessage)) {
            return false;
        }
        MCSubscriptionMessage mCSubscriptionMessage = (MCSubscriptionMessage) obj;
        if (Internal.equals(unknownFields(), mCSubscriptionMessage.unknownFields()) && Internal.equals(this.masterDevices, mCSubscriptionMessage.masterDevices) && Internal.equals(this.clientDevices, mCSubscriptionMessage.clientDevices) && Internal.equals(this.emailAddress, mCSubscriptionMessage.emailAddress) && Internal.equals(this.apnsToken, mCSubscriptionMessage.apnsToken) && Internal.equals(this.language, mCSubscriptionMessage.language) && Internal.equals(this.temperatureScale, mCSubscriptionMessage.temperatureScale) && Internal.equals(this.criticalAlerts, mCSubscriptionMessage.criticalAlerts) && Internal.equals(this.criticalAlertsVolume, mCSubscriptionMessage.criticalAlertsVolume)) {
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
            List<Long> list = this.masterDevices;
            int i17 = 1;
            if (list != null) {
                i10 = list.hashCode();
            } else {
                i10 = 1;
            }
            int i18 = (hashCode + i10) * 37;
            List<Long> list2 = this.clientDevices;
            if (list2 != null) {
                i17 = list2.hashCode();
            }
            int i19 = (i18 + i17) * 37;
            String str = this.emailAddress;
            int i20 = 0;
            if (str != null) {
                i11 = str.hashCode();
            } else {
                i11 = 0;
            }
            int i21 = (i19 + i11) * 37;
            h hVar = this.apnsToken;
            if (hVar != null) {
                i12 = hVar.hashCode();
            } else {
                i12 = 0;
            }
            int i22 = (i21 + i12) * 37;
            String str2 = this.language;
            if (str2 != null) {
                i13 = str2.hashCode();
            } else {
                i13 = 0;
            }
            int i23 = (i22 + i13) * 37;
            MCTemperatureScale mCTemperatureScale = this.temperatureScale;
            if (mCTemperatureScale != null) {
                i14 = mCTemperatureScale.hashCode();
            } else {
                i14 = 0;
            }
            int i24 = (i23 + i14) * 37;
            Boolean bool = this.criticalAlerts;
            if (bool != null) {
                i15 = bool.hashCode();
            } else {
                i15 = 0;
            }
            int i25 = (i24 + i15) * 37;
            Integer num = this.criticalAlertsVolume;
            if (num != null) {
                i20 = num.hashCode();
            }
            int i26 = i25 + i20;
            ((Message) this).hashCode = i26;
            return i26;
        }
        return i16;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.masterDevices != null) {
            sb.append(", masterDevices=");
            sb.append(this.masterDevices);
        }
        if (this.clientDevices != null) {
            sb.append(", clientDevices=");
            sb.append(this.clientDevices);
        }
        if (this.emailAddress != null) {
            sb.append(", emailAddress=");
            sb.append(this.emailAddress);
        }
        if (this.apnsToken != null) {
            sb.append(", apnsToken=");
            sb.append(this.apnsToken);
        }
        if (this.language != null) {
            sb.append(", language=");
            sb.append(this.language);
        }
        if (this.temperatureScale != null) {
            sb.append(", temperatureScale=");
            sb.append(this.temperatureScale);
        }
        if (this.criticalAlerts != null) {
            sb.append(", criticalAlerts=");
            sb.append(this.criticalAlerts);
        }
        if (this.criticalAlertsVolume != null) {
            sb.append(", criticalAlertsVolume=");
            sb.append(this.criticalAlertsVolume);
        }
        StringBuilder replace = sb.replace(0, 2, "MCSubscriptionMessage{");
        replace.append('}');
        return replace.toString();
    }

    public MCSubscriptionMessage(List<Long> list, List<Long> list2, String str, h hVar, String str2, MCTemperatureScale mCTemperatureScale, Boolean bool, Integer num, h hVar2) {
        super(ADAPTER, hVar2);
        this.masterDevices = Internal.immutableCopyOf("masterDevices", list);
        this.clientDevices = Internal.immutableCopyOf("clientDevices", list2);
        this.emailAddress = str;
        this.apnsToken = hVar;
        this.language = str2;
        this.temperatureScale = mCTemperatureScale;
        this.criticalAlerts = bool;
        this.criticalAlertsVolume = num;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m203newBuilder() {
        Builder builder = new Builder();
        builder.masterDevices = Internal.copyOf("masterDevices", this.masterDevices);
        builder.clientDevices = Internal.copyOf("clientDevices", this.clientDevices);
        builder.emailAddress = this.emailAddress;
        builder.apnsToken = this.apnsToken;
        builder.language = this.language;
        builder.temperatureScale = this.temperatureScale;
        builder.criticalAlerts = this.criticalAlerts;
        builder.criticalAlertsVolume = this.criticalAlertsVolume;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
