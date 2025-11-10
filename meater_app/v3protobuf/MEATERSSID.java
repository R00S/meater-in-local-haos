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
public final class MEATERSSID extends Message<MEATERSSID, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer RSSI;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MEATERSSIDEncryptionType#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final MEATERSSIDEncryptionType encryptionType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 1)
    public final h name;
    public static final ProtoAdapter<MEATERSSID> ADAPTER = new ProtoAdapter_MEATERSSID();
    public static final h DEFAULT_NAME = h.u;
    public static final MEATERSSIDEncryptionType DEFAULT_ENCRYPTIONTYPE = MEATERSSIDEncryptionType.MEATER_SSID_ENCRYPTION_TYPE_NONE;
    public static final Integer DEFAULT_RSSI = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MEATERSSID, Builder> {
        public Integer RSSI;
        public MEATERSSIDEncryptionType encryptionType;
        public h name;

        public Builder RSSI(Integer num) {
            this.RSSI = num;
            return this;
        }

        public Builder encryptionType(MEATERSSIDEncryptionType mEATERSSIDEncryptionType) {
            this.encryptionType = mEATERSSIDEncryptionType;
            return this;
        }

        public Builder name(h hVar) {
            this.name = hVar;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MEATERSSID m243build() {
            h hVar = this.name;
            if (hVar != null && this.encryptionType != null && this.RSSI != null) {
                return new MEATERSSID(this.name, this.encryptionType, this.RSSI, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{hVar, "name", this.encryptionType, "encryptionType", this.RSSI, "RSSI"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MEATERSSID extends ProtoAdapter<MEATERSSID> {
        ProtoAdapter_MEATERSSID() {
            super(FieldEncoding.LENGTH_DELIMITED, MEATERSSID.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MEATERSSID m244decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m243build();
                }
                if (nextTag == 1) {
                    builder.name((h) ProtoAdapter.BYTES.decode(protoReader));
                } else if (nextTag == 2) {
                    try {
                        builder.encryptionType((MEATERSSIDEncryptionType) MEATERSSIDEncryptionType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.RSSI((Integer) ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MEATERSSID meaterssid) {
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, meaterssid.name);
            MEATERSSIDEncryptionType.ADAPTER.encodeWithTag(protoWriter, 2, meaterssid.encryptionType);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, meaterssid.RSSI);
            protoWriter.writeBytes(meaterssid.unknownFields());
        }

        public int encodedSize(MEATERSSID meaterssid) {
            return ProtoAdapter.BYTES.encodedSizeWithTag(1, meaterssid.name) + MEATERSSIDEncryptionType.ADAPTER.encodedSizeWithTag(2, meaterssid.encryptionType) + ProtoAdapter.INT32.encodedSizeWithTag(3, meaterssid.RSSI) + meaterssid.unknownFields().I();
        }

        public MEATERSSID redact(MEATERSSID meaterssid) {
            Builder m242newBuilder = meaterssid.m242newBuilder();
            m242newBuilder.clearUnknownFields();
            return m242newBuilder.m243build();
        }
    }

    public MEATERSSID(h hVar, MEATERSSIDEncryptionType mEATERSSIDEncryptionType, Integer num) {
        this(hVar, mEATERSSIDEncryptionType, num, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MEATERSSID)) {
            return false;
        }
        MEATERSSID meaterssid = (MEATERSSID) obj;
        if (Internal.equals(unknownFields(), meaterssid.unknownFields()) && Internal.equals(this.name, meaterssid.name) && Internal.equals(this.encryptionType, meaterssid.encryptionType) && Internal.equals(this.RSSI, meaterssid.RSSI)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12 = ((Message) this).hashCode;
        if (i12 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            h hVar = this.name;
            int i13 = 0;
            if (hVar != null) {
                i10 = hVar.hashCode();
            } else {
                i10 = 0;
            }
            int i14 = (hashCode + i10) * 37;
            MEATERSSIDEncryptionType mEATERSSIDEncryptionType = this.encryptionType;
            if (mEATERSSIDEncryptionType != null) {
                i11 = mEATERSSIDEncryptionType.hashCode();
            } else {
                i11 = 0;
            }
            int i15 = (i14 + i11) * 37;
            Integer num = this.RSSI;
            if (num != null) {
                i13 = num.hashCode();
            }
            int i16 = i15 + i13;
            ((Message) this).hashCode = i16;
            return i16;
        }
        return i12;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.encryptionType != null) {
            sb.append(", encryptionType=");
            sb.append(this.encryptionType);
        }
        if (this.RSSI != null) {
            sb.append(", RSSI=");
            sb.append(this.RSSI);
        }
        StringBuilder replace = sb.replace(0, 2, "MEATERSSID{");
        replace.append('}');
        return replace.toString();
    }

    public MEATERSSID(h hVar, MEATERSSIDEncryptionType mEATERSSIDEncryptionType, Integer num, h hVar2) {
        super(ADAPTER, hVar2);
        this.name = hVar;
        this.encryptionType = mEATERSSIDEncryptionType;
        this.RSSI = num;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m242newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.encryptionType = this.encryptionType;
        builder.RSSI = this.RSSI;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
