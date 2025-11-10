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
public final class V2MeaterLinkHeader extends Message<V2MeaterLinkHeader, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", tag = 5)
    public final Long deviceID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer meaterLinkIdentifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 4)
    public final Integer messageNum;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer versionMajor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer versionMinor;
    public static final ProtoAdapter<V2MeaterLinkHeader> ADAPTER = new ProtoAdapter_V2MeaterLinkHeader();
    public static final Integer DEFAULT_MEATERLINKIDENTIFIER = 21578;
    public static final Integer DEFAULT_VERSIONMAJOR = 2;
    public static final Integer DEFAULT_VERSIONMINOR = 1;
    public static final Integer DEFAULT_MESSAGENUM = 0;
    public static final Long DEFAULT_DEVICEID = 0L;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2MeaterLinkHeader, Builder> {
        public Long deviceID;
        public Integer meaterLinkIdentifier;
        public Integer messageNum;
        public Integer versionMajor;
        public Integer versionMinor;

        public Builder deviceID(Long l10) {
            this.deviceID = l10;
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
        public V2MeaterLinkHeader m93build() {
            Integer num = this.meaterLinkIdentifier;
            if (num != null && this.versionMajor != null && this.versionMinor != null && this.messageNum != null) {
                return new V2MeaterLinkHeader(this.meaterLinkIdentifier, this.versionMajor, this.versionMinor, this.messageNum, this.deviceID, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "meaterLinkIdentifier", this.versionMajor, "versionMajor", this.versionMinor, "versionMinor", this.messageNum, "messageNum"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2MeaterLinkHeader extends ProtoAdapter<V2MeaterLinkHeader> {
        ProtoAdapter_V2MeaterLinkHeader() {
            super(FieldEncoding.LENGTH_DELIMITED, V2MeaterLinkHeader.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2MeaterLinkHeader m94decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m93build();
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
                    builder.deviceID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2MeaterLinkHeader v2MeaterLinkHeader) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, v2MeaterLinkHeader.meaterLinkIdentifier);
            protoAdapter.encodeWithTag(protoWriter, 2, v2MeaterLinkHeader.versionMajor);
            protoAdapter.encodeWithTag(protoWriter, 3, v2MeaterLinkHeader.versionMinor);
            protoAdapter.encodeWithTag(protoWriter, 4, v2MeaterLinkHeader.messageNum);
            Long l10 = v2MeaterLinkHeader.deviceID;
            if (l10 != null) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 5, l10);
            }
            protoWriter.writeBytes(v2MeaterLinkHeader.unknownFields());
        }

        public int encodedSize(V2MeaterLinkHeader v2MeaterLinkHeader) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, v2MeaterLinkHeader.meaterLinkIdentifier) + protoAdapter.encodedSizeWithTag(2, v2MeaterLinkHeader.versionMajor) + protoAdapter.encodedSizeWithTag(3, v2MeaterLinkHeader.versionMinor) + protoAdapter.encodedSizeWithTag(4, v2MeaterLinkHeader.messageNum);
            Long l10 = v2MeaterLinkHeader.deviceID;
            return encodedSizeWithTag + (l10 != null ? ProtoAdapter.FIXED64.encodedSizeWithTag(5, l10) : 0) + v2MeaterLinkHeader.unknownFields().I();
        }

        public V2MeaterLinkHeader redact(V2MeaterLinkHeader v2MeaterLinkHeader) {
            Builder m92newBuilder = v2MeaterLinkHeader.m92newBuilder();
            m92newBuilder.clearUnknownFields();
            return m92newBuilder.m93build();
        }
    }

    public V2MeaterLinkHeader(Integer num, Integer num2, Integer num3, Integer num4, Long l10) {
        this(num, num2, num3, num4, l10, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2MeaterLinkHeader)) {
            return false;
        }
        V2MeaterLinkHeader v2MeaterLinkHeader = (V2MeaterLinkHeader) obj;
        if (Internal.equals(unknownFields(), v2MeaterLinkHeader.unknownFields()) && Internal.equals(this.meaterLinkIdentifier, v2MeaterLinkHeader.meaterLinkIdentifier) && Internal.equals(this.versionMajor, v2MeaterLinkHeader.versionMajor) && Internal.equals(this.versionMinor, v2MeaterLinkHeader.versionMinor) && Internal.equals(this.messageNum, v2MeaterLinkHeader.messageNum) && Internal.equals(this.deviceID, v2MeaterLinkHeader.deviceID)) {
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
            Long l10 = this.deviceID;
            if (l10 != null) {
                i15 = l10.hashCode();
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
        StringBuilder replace = sb.replace(0, 2, "V2MeaterLinkHeader{");
        replace.append('}');
        return replace.toString();
    }

    public V2MeaterLinkHeader(Integer num, Integer num2, Integer num3, Integer num4, Long l10, h hVar) {
        super(ADAPTER, hVar);
        this.meaterLinkIdentifier = num;
        this.versionMajor = num2;
        this.versionMinor = num3;
        this.messageNum = num4;
        this.deviceID = l10;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m92newBuilder() {
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
