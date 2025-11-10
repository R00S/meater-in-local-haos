package com.apptionlabs.meater_app.v1protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import ql.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public final class V1MeaterLinkHeader extends Message<V1MeaterLinkHeader, Builder> {
    public static final String DEFAULT_DEVICEID = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String deviceID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer meaterLinkIdentifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 4)
    public final Integer messageNum;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer versionMajor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer versionMinor;
    public static final ProtoAdapter<V1MeaterLinkHeader> ADAPTER = new ProtoAdapter_LegacyMeaterLinkHeader();
    public static final Integer DEFAULT_MEATERLINKIDENTIFIER = 21578;
    public static final Integer DEFAULT_VERSIONMAJOR = 2;
    public static final Integer DEFAULT_VERSIONMINOR = 1;
    public static final Integer DEFAULT_MESSAGENUM = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V1MeaterLinkHeader, Builder> {
        public String deviceID;
        public Integer meaterLinkIdentifier;
        public Integer messageNum;
        public Integer versionMajor;
        public Integer versionMinor;

        public Builder deviceID(String str) {
            this.deviceID = str;
            return this;
        }

        public Builder meaterLinkIdentifier(Integer num) {
            this.meaterLinkIdentifier = num;
            return this;
        }

        public Builder messageNum(Integer num) {
            this.messageNum = num;
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
        public V1MeaterLinkHeader m18build() {
            Integer num = this.meaterLinkIdentifier;
            if (num != null && this.versionMajor != null && this.versionMinor != null && this.messageNum != null) {
                return new V1MeaterLinkHeader(this.meaterLinkIdentifier, this.versionMajor, this.versionMinor, this.messageNum, this.deviceID, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "meaterLinkIdentifier", this.versionMajor, "versionMajor", this.versionMinor, "versionMinor", this.messageNum, "messageNum"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_LegacyMeaterLinkHeader extends ProtoAdapter<V1MeaterLinkHeader> {
        ProtoAdapter_LegacyMeaterLinkHeader() {
            super(FieldEncoding.LENGTH_DELIMITED, V1MeaterLinkHeader.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V1MeaterLinkHeader m19decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m18build();
                }
                if (nextTag == 1) {
                    builder.meaterLinkIdentifier((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.versionMajor((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.versionMinor((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.messageNum((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.deviceID((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V1MeaterLinkHeader v1MeaterLinkHeader) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, v1MeaterLinkHeader.meaterLinkIdentifier);
            protoAdapter.encodeWithTag(protoWriter, 2, v1MeaterLinkHeader.versionMajor);
            protoAdapter.encodeWithTag(protoWriter, 3, v1MeaterLinkHeader.versionMinor);
            protoAdapter.encodeWithTag(protoWriter, 4, v1MeaterLinkHeader.messageNum);
            String str = v1MeaterLinkHeader.deviceID;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, str);
            }
            protoWriter.writeBytes(v1MeaterLinkHeader.unknownFields());
        }

        public int encodedSize(V1MeaterLinkHeader v1MeaterLinkHeader) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, v1MeaterLinkHeader.meaterLinkIdentifier) + protoAdapter.encodedSizeWithTag(2, v1MeaterLinkHeader.versionMajor) + protoAdapter.encodedSizeWithTag(3, v1MeaterLinkHeader.versionMinor) + protoAdapter.encodedSizeWithTag(4, v1MeaterLinkHeader.messageNum);
            String str = v1MeaterLinkHeader.deviceID;
            return encodedSizeWithTag + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, str) : 0) + v1MeaterLinkHeader.unknownFields().I();
        }

        public V1MeaterLinkHeader redact(V1MeaterLinkHeader v1MeaterLinkHeader) {
            Builder m17newBuilder = v1MeaterLinkHeader.m17newBuilder();
            m17newBuilder.clearUnknownFields();
            return m17newBuilder.m18build();
        }
    }

    public V1MeaterLinkHeader(Integer num, Integer num2, Integer num3, Integer num4, String str) {
        this(num, num2, num3, num4, str, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1MeaterLinkHeader)) {
            return false;
        }
        V1MeaterLinkHeader v1MeaterLinkHeader = (V1MeaterLinkHeader) obj;
        if (Internal.equals(unknownFields(), v1MeaterLinkHeader.unknownFields()) && Internal.equals(this.meaterLinkIdentifier, v1MeaterLinkHeader.meaterLinkIdentifier) && Internal.equals(this.versionMajor, v1MeaterLinkHeader.versionMajor) && Internal.equals(this.versionMinor, v1MeaterLinkHeader.versionMinor) && Internal.equals(this.messageNum, v1MeaterLinkHeader.messageNum) && Internal.equals(this.deviceID, v1MeaterLinkHeader.deviceID)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = ((Message) this).hashCode;
        if (i14 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.meaterLinkIdentifier;
            int i15 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i16 = (hashCode + i10) * 37;
            Integer num2 = this.versionMajor;
            if (num2 != null) {
                i11 = num2.hashCode();
            } else {
                i11 = 0;
            }
            int i17 = (i16 + i11) * 37;
            Integer num3 = this.versionMinor;
            if (num3 != null) {
                i12 = num3.hashCode();
            } else {
                i12 = 0;
            }
            int i18 = (i17 + i12) * 37;
            Integer num4 = this.messageNum;
            if (num4 != null) {
                i13 = num4.hashCode();
            } else {
                i13 = 0;
            }
            int i19 = (i18 + i13) * 37;
            String str = this.deviceID;
            if (str != null) {
                i15 = str.hashCode();
            }
            int i20 = i19 + i15;
            ((Message) this).hashCode = i20;
            return i20;
        }
        return i14;
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
        if (this.messageNum != null) {
            sb.append(", messageNum=");
            sb.append(this.messageNum);
        }
        if (this.deviceID != null) {
            sb.append(", deviceID=");
            sb.append(this.deviceID);
        }
        StringBuilder replace = sb.replace(0, 2, "V1MeaterLinkHeader{");
        replace.append('}');
        return replace.toString();
    }

    public V1MeaterLinkHeader(Integer num, Integer num2, Integer num3, Integer num4, String str, h hVar) {
        super(ADAPTER, hVar);
        this.meaterLinkIdentifier = num;
        this.versionMajor = num2;
        this.versionMinor = num3;
        this.messageNum = num4;
        this.deviceID = str;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m17newBuilder() {
        Builder builder = new Builder();
        builder.meaterLinkIdentifier = this.meaterLinkIdentifier;
        builder.versionMajor = this.versionMajor;
        builder.versionMinor = this.versionMinor;
        builder.messageNum = this.messageNum;
        builder.deviceID = this.deviceID;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
