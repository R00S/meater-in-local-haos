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
public final class V2MLBlock extends Message<V2MLBlock, Builder> {
    public static final String DEFAULT_FIRMWAREREVISION = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer batteryLevel;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2ConnectionState#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final V2ConnectionState connectionState;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String firmwareRevision;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer wifiSignalLevel;
    public static final ProtoAdapter<V2MLBlock> ADAPTER = new ProtoAdapter_V2MLBlock();
    public static final Long DEFAULT_IDENTIFIER = 0L;
    public static final Integer DEFAULT_BATTERYLEVEL = 0;
    public static final Integer DEFAULT_WIFISIGNALLEVEL = 0;
    public static final V2ConnectionState DEFAULT_CONNECTIONSTATE = V2ConnectionState.V2CONNECTION_STATE_OFFLINE;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2MLBlock, Builder> {
        public Integer batteryLevel;
        public V2ConnectionState connectionState;
        public String firmwareRevision;
        public Long identifier;
        public Integer wifiSignalLevel;

        public Builder batteryLevel(Integer num) {
            this.batteryLevel = num;
            return this;
        }

        public Builder connectionState(V2ConnectionState v2ConnectionState) {
            this.connectionState = v2ConnectionState;
            return this;
        }

        public Builder firmwareRevision(String str) {
            this.firmwareRevision = str;
            return this;
        }

        public Builder identifier(Long l10) {
            this.identifier = l10;
            return this;
        }

        public Builder wifiSignalLevel(Integer num) {
            this.wifiSignalLevel = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2MLBlock m69build() {
            Long l10 = this.identifier;
            if (l10 != null && this.batteryLevel != null && this.wifiSignalLevel != null && this.connectionState != null) {
                return new V2MLBlock(this.identifier, this.batteryLevel, this.wifiSignalLevel, this.connectionState, this.firmwareRevision, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "identifier", this.batteryLevel, "batteryLevel", this.wifiSignalLevel, "wifiSignalLevel", this.connectionState, "connectionState"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2MLBlock extends ProtoAdapter<V2MLBlock> {
        ProtoAdapter_V2MLBlock() {
            super(FieldEncoding.LENGTH_DELIMITED, V2MLBlock.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2MLBlock m70decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m69build();
                }
                if (nextTag == 1) {
                    builder.identifier((Long) ProtoAdapter.FIXED64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.batteryLevel((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.wifiSignalLevel((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag == 4) {
                    try {
                        builder.connectionState((V2ConnectionState) V2ConnectionState.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.firmwareRevision((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2MLBlock v2MLBlock) {
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, v2MLBlock.identifier);
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 2, v2MLBlock.batteryLevel);
            protoAdapter.encodeWithTag(protoWriter, 3, v2MLBlock.wifiSignalLevel);
            V2ConnectionState.ADAPTER.encodeWithTag(protoWriter, 4, v2MLBlock.connectionState);
            String str = v2MLBlock.firmwareRevision;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, str);
            }
            protoWriter.writeBytes(v2MLBlock.unknownFields());
        }

        public int encodedSize(V2MLBlock v2MLBlock) {
            int encodedSizeWithTag = ProtoAdapter.FIXED64.encodedSizeWithTag(1, v2MLBlock.identifier);
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            int encodedSizeWithTag2 = encodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, v2MLBlock.batteryLevel) + protoAdapter.encodedSizeWithTag(3, v2MLBlock.wifiSignalLevel) + V2ConnectionState.ADAPTER.encodedSizeWithTag(4, v2MLBlock.connectionState);
            String str = v2MLBlock.firmwareRevision;
            return encodedSizeWithTag2 + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, str) : 0) + v2MLBlock.unknownFields().I();
        }

        public V2MLBlock redact(V2MLBlock v2MLBlock) {
            Builder m68newBuilder = v2MLBlock.m68newBuilder();
            m68newBuilder.clearUnknownFields();
            return m68newBuilder.m69build();
        }
    }

    public V2MLBlock(Long l10, Integer num, Integer num2, V2ConnectionState v2ConnectionState, String str) {
        this(l10, num, num2, v2ConnectionState, str, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2MLBlock)) {
            return false;
        }
        V2MLBlock v2MLBlock = (V2MLBlock) obj;
        if (Internal.equals(unknownFields(), v2MLBlock.unknownFields()) && Internal.equals(this.identifier, v2MLBlock.identifier) && Internal.equals(this.batteryLevel, v2MLBlock.batteryLevel) && Internal.equals(this.wifiSignalLevel, v2MLBlock.wifiSignalLevel) && Internal.equals(this.connectionState, v2MLBlock.connectionState) && Internal.equals(this.firmwareRevision, v2MLBlock.firmwareRevision)) {
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
            Long l10 = this.identifier;
            int i15 = 0;
            if (l10 != null) {
                i10 = l10.hashCode();
            } else {
                i10 = 0;
            }
            int i16 = (hashCode + i10) * 37;
            Integer num = this.batteryLevel;
            if (num != null) {
                i11 = num.hashCode();
            } else {
                i11 = 0;
            }
            int i17 = (i16 + i11) * 37;
            Integer num2 = this.wifiSignalLevel;
            if (num2 != null) {
                i12 = num2.hashCode();
            } else {
                i12 = 0;
            }
            int i18 = (i17 + i12) * 37;
            V2ConnectionState v2ConnectionState = this.connectionState;
            if (v2ConnectionState != null) {
                i13 = v2ConnectionState.hashCode();
            } else {
                i13 = 0;
            }
            int i19 = (i18 + i13) * 37;
            String str = this.firmwareRevision;
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
        if (this.identifier != null) {
            sb.append(", identifier=");
            sb.append(this.identifier);
        }
        if (this.batteryLevel != null) {
            sb.append(", batteryLevel=");
            sb.append(this.batteryLevel);
        }
        if (this.wifiSignalLevel != null) {
            sb.append(", wifiSignalLevel=");
            sb.append(this.wifiSignalLevel);
        }
        if (this.connectionState != null) {
            sb.append(", connectionState=");
            sb.append(this.connectionState);
        }
        if (this.firmwareRevision != null) {
            sb.append(", firmwareRevision=");
            sb.append(this.firmwareRevision);
        }
        StringBuilder replace = sb.replace(0, 2, "V2MLBlock{");
        replace.append('}');
        return replace.toString();
    }

    public V2MLBlock(Long l10, Integer num, Integer num2, V2ConnectionState v2ConnectionState, String str, h hVar) {
        super(ADAPTER, hVar);
        this.identifier = l10;
        this.batteryLevel = num;
        this.wifiSignalLevel = num2;
        this.connectionState = v2ConnectionState;
        this.firmwareRevision = str;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m68newBuilder() {
        Builder builder = new Builder();
        builder.identifier = this.identifier;
        builder.batteryLevel = this.batteryLevel;
        builder.wifiSignalLevel = this.wifiSignalLevel;
        builder.connectionState = this.connectionState;
        builder.firmwareRevision = this.firmwareRevision;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
