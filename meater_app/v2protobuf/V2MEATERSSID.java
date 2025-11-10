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
public final class V2MEATERSSID extends Message<V2MEATERSSID, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer RSSI;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2MEATERSSIDEncryptionType#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final V2MEATERSSIDEncryptionType encryptionType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 1)
    public final h name;
    public static final ProtoAdapter<V2MEATERSSID> ADAPTER = new ProtoAdapter_V2MEATERSSID();
    public static final h DEFAULT_NAME = h.u;
    public static final V2MEATERSSIDEncryptionType DEFAULT_ENCRYPTIONTYPE = V2MEATERSSIDEncryptionType.V2MEATER_SSID_ENCRYPTION_TYPE_NONE;
    public static final Integer DEFAULT_RSSI = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2MEATERSSID, Builder> {
        public Integer RSSI;
        public V2MEATERSSIDEncryptionType encryptionType;
        public h name;

        public Builder RSSI(Integer num) {
            this.RSSI = num;
            return this;
        }

        public Builder encryptionType(V2MEATERSSIDEncryptionType v2MEATERSSIDEncryptionType) {
            this.encryptionType = v2MEATERSSIDEncryptionType;
            return this;
        }

        public Builder name(h hVar) {
            this.name = hVar;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2MEATERSSID m60build() {
            h hVar = this.name;
            if (hVar != null && this.encryptionType != null && this.RSSI != null) {
                return new V2MEATERSSID(this.name, this.encryptionType, this.RSSI, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{hVar, "name", this.encryptionType, "encryptionType", this.RSSI, "RSSI"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2MEATERSSID extends ProtoAdapter<V2MEATERSSID> {
        ProtoAdapter_V2MEATERSSID() {
            super(FieldEncoding.LENGTH_DELIMITED, V2MEATERSSID.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2MEATERSSID m61decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m60build();
                }
                if (nextTag == 1) {
                    builder.name((h) ProtoAdapter.BYTES.decode(protoReader));
                } else if (nextTag == 2) {
                    try {
                        builder.encryptionType((V2MEATERSSIDEncryptionType) V2MEATERSSIDEncryptionType.ADAPTER.decode(protoReader));
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

        public void encode(ProtoWriter protoWriter, V2MEATERSSID v2meaterssid) {
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, v2meaterssid.name);
            V2MEATERSSIDEncryptionType.ADAPTER.encodeWithTag(protoWriter, 2, v2meaterssid.encryptionType);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, v2meaterssid.RSSI);
            protoWriter.writeBytes(v2meaterssid.unknownFields());
        }

        public int encodedSize(V2MEATERSSID v2meaterssid) {
            return ProtoAdapter.BYTES.encodedSizeWithTag(1, v2meaterssid.name) + V2MEATERSSIDEncryptionType.ADAPTER.encodedSizeWithTag(2, v2meaterssid.encryptionType) + ProtoAdapter.INT32.encodedSizeWithTag(3, v2meaterssid.RSSI) + v2meaterssid.unknownFields().I();
        }

        public V2MEATERSSID redact(V2MEATERSSID v2meaterssid) {
            Builder m59newBuilder = v2meaterssid.m59newBuilder();
            m59newBuilder.clearUnknownFields();
            return m59newBuilder.m60build();
        }
    }

    public V2MEATERSSID(h hVar, V2MEATERSSIDEncryptionType v2MEATERSSIDEncryptionType, Integer num) {
        this(hVar, v2MEATERSSIDEncryptionType, num, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2MEATERSSID)) {
            return false;
        }
        V2MEATERSSID v2meaterssid = (V2MEATERSSID) obj;
        if (Internal.equals(unknownFields(), v2meaterssid.unknownFields()) && Internal.equals(this.name, v2meaterssid.name) && Internal.equals(this.encryptionType, v2meaterssid.encryptionType) && Internal.equals(this.RSSI, v2meaterssid.RSSI)) {
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
            V2MEATERSSIDEncryptionType v2MEATERSSIDEncryptionType = this.encryptionType;
            if (v2MEATERSSIDEncryptionType != null) {
                i11 = v2MEATERSSIDEncryptionType.hashCode();
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
        StringBuilder replace = sb.replace(0, 2, "V2MEATERSSID{");
        replace.append('}');
        return replace.toString();
    }

    public V2MEATERSSID(h hVar, V2MEATERSSIDEncryptionType v2MEATERSSIDEncryptionType, Integer num, h hVar2) {
        super(ADAPTER, hVar2);
        this.name = hVar;
        this.encryptionType = v2MEATERSSIDEncryptionType;
        this.RSSI = num;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m59newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.encryptionType = this.encryptionType;
        builder.RSSI = this.RSSI;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
