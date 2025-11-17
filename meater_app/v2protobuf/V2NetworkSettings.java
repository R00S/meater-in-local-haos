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
public final class V2NetworkSettings extends Message<V2NetworkSettings, Builder> {
    public static final ProtoAdapter<V2NetworkSettings> ADAPTER = new ProtoAdapter_V2NetworkSettings();
    public static final Boolean DEFAULT_CONNECTEDTOCLOUD;
    public static final V2InternetStatus DEFAULT_INTERNETSTATUS;
    public static final h DEFAULT_IPV4ADDRESS;
    public static final h DEFAULT_IPV4DNS;
    public static final h DEFAULT_IPV4GATEWAY;
    public static final h DEFAULT_IPV4MASK;
    public static final h DEFAULT_SSID;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 6)
    public final Boolean connectedToCloud;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2InternetStatus#ADAPTER", label = WireField.Label.REQUIRED, tag = 7)
    public final V2InternetStatus internetStatus;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 2)
    public final h ipv4address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 5)
    public final h ipv4dns;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 4)
    public final h ipv4gateway;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 3)
    public final h ipv4mask;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 1)
    public final h ssid;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2NetworkSettings, Builder> {
        public Boolean connectedToCloud;
        public V2InternetStatus internetStatus;
        public h ipv4address;
        public h ipv4dns;
        public h ipv4gateway;
        public h ipv4mask;
        public h ssid;

        public Builder connectedToCloud(Boolean bool) {
            this.connectedToCloud = bool;
            return this;
        }

        public Builder internetStatus(V2InternetStatus v2InternetStatus) {
            this.internetStatus = v2InternetStatus;
            return this;
        }

        public Builder ipv4address(h hVar) {
            this.ipv4address = hVar;
            return this;
        }

        public Builder ipv4dns(h hVar) {
            this.ipv4dns = hVar;
            return this;
        }

        public Builder ipv4gateway(h hVar) {
            this.ipv4gateway = hVar;
            return this;
        }

        public Builder ipv4mask(h hVar) {
            this.ipv4mask = hVar;
            return this;
        }

        public Builder ssid(h hVar) {
            this.ssid = hVar;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2NetworkSettings m99build() {
            h hVar = this.ssid;
            if (hVar != null && this.connectedToCloud != null && this.internetStatus != null) {
                return new V2NetworkSettings(this.ssid, this.ipv4address, this.ipv4mask, this.ipv4gateway, this.ipv4dns, this.connectedToCloud, this.internetStatus, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{hVar, "ssid", this.connectedToCloud, "connectedToCloud", this.internetStatus, "internetStatus"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2NetworkSettings extends ProtoAdapter<V2NetworkSettings> {
        ProtoAdapter_V2NetworkSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, V2NetworkSettings.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2NetworkSettings m100decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.ssid((h) ProtoAdapter.BYTES.decode(protoReader));
                            break;
                        case 2:
                            builder.ipv4address((h) ProtoAdapter.BYTES.decode(protoReader));
                            break;
                        case 3:
                            builder.ipv4mask((h) ProtoAdapter.BYTES.decode(protoReader));
                            break;
                        case 4:
                            builder.ipv4gateway((h) ProtoAdapter.BYTES.decode(protoReader));
                            break;
                        case 5:
                            builder.ipv4dns((h) ProtoAdapter.BYTES.decode(protoReader));
                            break;
                        case 6:
                            builder.connectedToCloud((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 7:
                            try {
                                builder.internetStatus((V2InternetStatus) V2InternetStatus.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m99build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2NetworkSettings v2NetworkSettings) {
            ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
            protoAdapter.encodeWithTag(protoWriter, 1, v2NetworkSettings.ssid);
            h hVar = v2NetworkSettings.ipv4address;
            if (hVar != null) {
                protoAdapter.encodeWithTag(protoWriter, 2, hVar);
            }
            h hVar2 = v2NetworkSettings.ipv4mask;
            if (hVar2 != null) {
                protoAdapter.encodeWithTag(protoWriter, 3, hVar2);
            }
            h hVar3 = v2NetworkSettings.ipv4gateway;
            if (hVar3 != null) {
                protoAdapter.encodeWithTag(protoWriter, 4, hVar3);
            }
            h hVar4 = v2NetworkSettings.ipv4dns;
            if (hVar4 != null) {
                protoAdapter.encodeWithTag(protoWriter, 5, hVar4);
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, v2NetworkSettings.connectedToCloud);
            V2InternetStatus.ADAPTER.encodeWithTag(protoWriter, 7, v2NetworkSettings.internetStatus);
            protoWriter.writeBytes(v2NetworkSettings.unknownFields());
        }

        public int encodedSize(V2NetworkSettings v2NetworkSettings) {
            ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
            int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, v2NetworkSettings.ssid);
            h hVar = v2NetworkSettings.ipv4address;
            int encodedSizeWithTag2 = encodedSizeWithTag + (hVar != null ? protoAdapter.encodedSizeWithTag(2, hVar) : 0);
            h hVar2 = v2NetworkSettings.ipv4mask;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + (hVar2 != null ? protoAdapter.encodedSizeWithTag(3, hVar2) : 0);
            h hVar3 = v2NetworkSettings.ipv4gateway;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + (hVar3 != null ? protoAdapter.encodedSizeWithTag(4, hVar3) : 0);
            h hVar4 = v2NetworkSettings.ipv4dns;
            return encodedSizeWithTag4 + (hVar4 != null ? protoAdapter.encodedSizeWithTag(5, hVar4) : 0) + ProtoAdapter.BOOL.encodedSizeWithTag(6, v2NetworkSettings.connectedToCloud) + V2InternetStatus.ADAPTER.encodedSizeWithTag(7, v2NetworkSettings.internetStatus) + v2NetworkSettings.unknownFields().I();
        }

        public V2NetworkSettings redact(V2NetworkSettings v2NetworkSettings) {
            Builder m98newBuilder = v2NetworkSettings.m98newBuilder();
            m98newBuilder.clearUnknownFields();
            return m98newBuilder.m99build();
        }
    }

    static {
        h hVar = h.u;
        DEFAULT_SSID = hVar;
        DEFAULT_IPV4ADDRESS = hVar;
        DEFAULT_IPV4MASK = hVar;
        DEFAULT_IPV4GATEWAY = hVar;
        DEFAULT_IPV4DNS = hVar;
        DEFAULT_CONNECTEDTOCLOUD = Boolean.FALSE;
        DEFAULT_INTERNETSTATUS = V2InternetStatus.V2INTERNET_STATUS_NONE;
    }

    public V2NetworkSettings(h hVar, h hVar2, h hVar3, h hVar4, h hVar5, Boolean bool, V2InternetStatus v2InternetStatus) {
        this(hVar, hVar2, hVar3, hVar4, hVar5, bool, v2InternetStatus, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2NetworkSettings)) {
            return false;
        }
        V2NetworkSettings v2NetworkSettings = (V2NetworkSettings) obj;
        if (Internal.equals(unknownFields(), v2NetworkSettings.unknownFields()) && Internal.equals(this.ssid, v2NetworkSettings.ssid) && Internal.equals(this.ipv4address, v2NetworkSettings.ipv4address) && Internal.equals(this.ipv4mask, v2NetworkSettings.ipv4mask) && Internal.equals(this.ipv4gateway, v2NetworkSettings.ipv4gateway) && Internal.equals(this.ipv4dns, v2NetworkSettings.ipv4dns) && Internal.equals(this.connectedToCloud, v2NetworkSettings.connectedToCloud) && Internal.equals(this.internetStatus, v2NetworkSettings.internetStatus)) {
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
            h hVar = this.ssid;
            int i17 = 0;
            if (hVar != null) {
                i10 = hVar.hashCode();
            } else {
                i10 = 0;
            }
            int i18 = (hashCode + i10) * 37;
            h hVar2 = this.ipv4address;
            if (hVar2 != null) {
                i11 = hVar2.hashCode();
            } else {
                i11 = 0;
            }
            int i19 = (i18 + i11) * 37;
            h hVar3 = this.ipv4mask;
            if (hVar3 != null) {
                i12 = hVar3.hashCode();
            } else {
                i12 = 0;
            }
            int i20 = (i19 + i12) * 37;
            h hVar4 = this.ipv4gateway;
            if (hVar4 != null) {
                i13 = hVar4.hashCode();
            } else {
                i13 = 0;
            }
            int i21 = (i20 + i13) * 37;
            h hVar5 = this.ipv4dns;
            if (hVar5 != null) {
                i14 = hVar5.hashCode();
            } else {
                i14 = 0;
            }
            int i22 = (i21 + i14) * 37;
            Boolean bool = this.connectedToCloud;
            if (bool != null) {
                i15 = bool.hashCode();
            } else {
                i15 = 0;
            }
            int i23 = (i22 + i15) * 37;
            V2InternetStatus v2InternetStatus = this.internetStatus;
            if (v2InternetStatus != null) {
                i17 = v2InternetStatus.hashCode();
            }
            int i24 = i23 + i17;
            ((Message) this).hashCode = i24;
            return i24;
        }
        return i16;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ssid != null) {
            sb.append(", ssid=");
            sb.append(this.ssid);
        }
        if (this.ipv4address != null) {
            sb.append(", ipv4address=");
            sb.append(this.ipv4address);
        }
        if (this.ipv4mask != null) {
            sb.append(", ipv4mask=");
            sb.append(this.ipv4mask);
        }
        if (this.ipv4gateway != null) {
            sb.append(", ipv4gateway=");
            sb.append(this.ipv4gateway);
        }
        if (this.ipv4dns != null) {
            sb.append(", ipv4dns=");
            sb.append(this.ipv4dns);
        }
        if (this.connectedToCloud != null) {
            sb.append(", connectedToCloud=");
            sb.append(this.connectedToCloud);
        }
        if (this.internetStatus != null) {
            sb.append(", internetStatus=");
            sb.append(this.internetStatus);
        }
        StringBuilder replace = sb.replace(0, 2, "V2NetworkSettings{");
        replace.append('}');
        return replace.toString();
    }

    public V2NetworkSettings(h hVar, h hVar2, h hVar3, h hVar4, h hVar5, Boolean bool, V2InternetStatus v2InternetStatus, h hVar6) {
        super(ADAPTER, hVar6);
        this.ssid = hVar;
        this.ipv4address = hVar2;
        this.ipv4mask = hVar3;
        this.ipv4gateway = hVar4;
        this.ipv4dns = hVar5;
        this.connectedToCloud = bool;
        this.internetStatus = v2InternetStatus;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m98newBuilder() {
        Builder builder = new Builder();
        builder.ssid = this.ssid;
        builder.ipv4address = this.ipv4address;
        builder.ipv4mask = this.ipv4mask;
        builder.ipv4gateway = this.ipv4gateway;
        builder.ipv4dns = this.ipv4dns;
        builder.connectedToCloud = this.connectedToCloud;
        builder.internetStatus = this.internetStatus;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
