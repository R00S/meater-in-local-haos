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
public final class MeaterLinkHeader extends Message<MeaterLinkHeader, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 5)
    public final Long deviceID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer meaterLinkIdentifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 4)
    public final Integer messageNumber;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer versionMajor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer versionMinor;
    public static final ProtoAdapter<MeaterLinkHeader> ADAPTER = new ProtoAdapter_MeaterLinkHeader();
    public static final Integer DEFAULT_MEATERLINKIDENTIFIER = 21578;
    public static final Integer DEFAULT_VERSIONMAJOR = 2;
    public static final Integer DEFAULT_VERSIONMINOR = 1;
    public static final Integer DEFAULT_MESSAGENUMBER = 0;
    public static final Long DEFAULT_DEVICEID = 0L;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MeaterLinkHeader, Builder> {
        public Long deviceID;
        public Integer meaterLinkIdentifier;
        public Integer messageNumber;
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

        public Builder messageNumber(Integer num) {
            this.messageNumber = num;
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
        public MeaterLinkHeader m282build() {
            Integer num = this.meaterLinkIdentifier;
            if (num != null && this.versionMajor != null && this.versionMinor != null && this.messageNumber != null && this.deviceID != null) {
                return new MeaterLinkHeader(this.meaterLinkIdentifier, this.versionMajor, this.versionMinor, this.messageNumber, this.deviceID, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "meaterLinkIdentifier", this.versionMajor, "versionMajor", this.versionMinor, "versionMinor", this.messageNumber, "messageNumber", this.deviceID, "deviceID"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MeaterLinkHeader extends ProtoAdapter<MeaterLinkHeader> {
        ProtoAdapter_MeaterLinkHeader() {
            super(FieldEncoding.LENGTH_DELIMITED, MeaterLinkHeader.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MeaterLinkHeader m283decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m282build();
                }
                if (nextTag == 1) {
                    builder.meaterLinkIdentifier((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.versionMajor((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.versionMinor((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.messageNumber((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.deviceID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MeaterLinkHeader meaterLinkHeader) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, meaterLinkHeader.meaterLinkIdentifier);
            protoAdapter.encodeWithTag(protoWriter, 2, meaterLinkHeader.versionMajor);
            protoAdapter.encodeWithTag(protoWriter, 3, meaterLinkHeader.versionMinor);
            protoAdapter.encodeWithTag(protoWriter, 4, meaterLinkHeader.messageNumber);
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 5, meaterLinkHeader.deviceID);
            protoWriter.writeBytes(meaterLinkHeader.unknownFields());
        }

        public int encodedSize(MeaterLinkHeader meaterLinkHeader) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            return protoAdapter.encodedSizeWithTag(1, meaterLinkHeader.meaterLinkIdentifier) + protoAdapter.encodedSizeWithTag(2, meaterLinkHeader.versionMajor) + protoAdapter.encodedSizeWithTag(3, meaterLinkHeader.versionMinor) + protoAdapter.encodedSizeWithTag(4, meaterLinkHeader.messageNumber) + ProtoAdapter.FIXED64.encodedSizeWithTag(5, meaterLinkHeader.deviceID) + meaterLinkHeader.unknownFields().I();
        }

        public MeaterLinkHeader redact(MeaterLinkHeader meaterLinkHeader) {
            Builder m281newBuilder = meaterLinkHeader.m281newBuilder();
            m281newBuilder.clearUnknownFields();
            return m281newBuilder.m282build();
        }
    }

    public MeaterLinkHeader(Integer num, Integer num2, Integer num3, Integer num4, Long l10) {
        this(num, num2, num3, num4, l10, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MeaterLinkHeader)) {
            return false;
        }
        MeaterLinkHeader meaterLinkHeader = (MeaterLinkHeader) obj;
        if (Internal.equals(unknownFields(), meaterLinkHeader.unknownFields()) && Internal.equals(this.meaterLinkIdentifier, meaterLinkHeader.meaterLinkIdentifier) && Internal.equals(this.versionMajor, meaterLinkHeader.versionMajor) && Internal.equals(this.versionMinor, meaterLinkHeader.versionMinor) && Internal.equals(this.messageNumber, meaterLinkHeader.messageNumber) && Internal.equals(this.deviceID, meaterLinkHeader.deviceID)) {
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
            Integer num4 = this.messageNumber;
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
        if (this.messageNumber != null) {
            sb.append(", messageNumber=");
            sb.append(this.messageNumber);
        }
        if (this.deviceID != null) {
            sb.append(", deviceID=");
            sb.append(this.deviceID);
        }
        StringBuilder replace = sb.replace(0, 2, "MeaterLinkHeader{");
        replace.append('}');
        return replace.toString();
    }

    public MeaterLinkHeader(Integer num, Integer num2, Integer num3, Integer num4, Long l10, h hVar) {
        super(ADAPTER, hVar);
        this.meaterLinkIdentifier = num;
        this.versionMajor = num2;
        this.versionMinor = num3;
        this.messageNumber = num4;
        this.deviceID = l10;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m281newBuilder() {
        Builder builder = new Builder();
        builder.meaterLinkIdentifier = this.meaterLinkIdentifier;
        builder.versionMajor = this.versionMajor;
        builder.versionMinor = this.versionMinor;
        builder.messageNumber = this.messageNumber;
        builder.deviceID = this.deviceID;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
