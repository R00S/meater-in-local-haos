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
public final class V2MLAmber extends Message<V2MLAmber, Builder> {
    public static final String DEFAULT_FIRMWAREREVISION = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer batteryLevel;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer bleSignalLevel;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 5)
    public final Integer chipTemperature;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2ConnectionState#ADAPTER", label = WireField.Label.REQUIRED, tag = 7)
    public final V2ConnectionState connectionState;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String firmwareRevision;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 6)
    public final Integer grillTemperature;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long identifier;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2AmberSession#ADAPTER", label = WireField.Label.REQUIRED, tag = 8)
    public final V2AmberSession session;
    public static final ProtoAdapter<V2MLAmber> ADAPTER = new ProtoAdapter_V2MLAmber();
    public static final Long DEFAULT_IDENTIFIER = 0L;
    public static final Integer DEFAULT_BATTERYLEVEL = 0;
    public static final Integer DEFAULT_BLESIGNALLEVEL = 0;
    public static final Integer DEFAULT_CHIPTEMPERATURE = 0;
    public static final Integer DEFAULT_GRILLTEMPERATURE = 0;
    public static final V2ConnectionState DEFAULT_CONNECTIONSTATE = V2ConnectionState.V2CONNECTION_STATE_OFFLINE;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2MLAmber, Builder> {
        public Integer batteryLevel;
        public Integer bleSignalLevel;
        public Integer chipTemperature;
        public V2ConnectionState connectionState;
        public String firmwareRevision;
        public Integer grillTemperature;
        public Long identifier;
        public V2AmberSession session;

        public Builder batteryLevel(Integer num) {
            this.batteryLevel = num;
            return this;
        }

        public Builder bleSignalLevel(Integer num) {
            this.bleSignalLevel = num;
            return this;
        }

        public Builder chipTemperature(Integer num) {
            this.chipTemperature = num;
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

        public Builder grillTemperature(Integer num) {
            this.grillTemperature = num;
            return this;
        }

        public Builder identifier(Long l10) {
            this.identifier = l10;
            return this;
        }

        public Builder session(V2AmberSession v2AmberSession) {
            this.session = v2AmberSession;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2MLAmber m66build() {
            Long l10 = this.identifier;
            if (l10 != null && this.batteryLevel != null && this.bleSignalLevel != null && this.chipTemperature != null && this.grillTemperature != null && this.connectionState != null && this.session != null) {
                return new V2MLAmber(this.identifier, this.batteryLevel, this.bleSignalLevel, this.firmwareRevision, this.chipTemperature, this.grillTemperature, this.connectionState, this.session, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "identifier", this.batteryLevel, "batteryLevel", this.bleSignalLevel, "bleSignalLevel", this.chipTemperature, "chipTemperature", this.grillTemperature, "grillTemperature", this.connectionState, "connectionState", this.session, "session"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2MLAmber extends ProtoAdapter<V2MLAmber> {
        ProtoAdapter_V2MLAmber() {
            super(FieldEncoding.LENGTH_DELIMITED, V2MLAmber.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2MLAmber m67decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.identifier((Long) ProtoAdapter.FIXED64.decode(protoReader));
                            break;
                        case 2:
                            builder.batteryLevel((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 3:
                            builder.bleSignalLevel((Integer) ProtoAdapter.SINT32.decode(protoReader));
                            break;
                        case 4:
                            builder.firmwareRevision((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.chipTemperature((Integer) ProtoAdapter.SINT32.decode(protoReader));
                            break;
                        case 6:
                            builder.grillTemperature((Integer) ProtoAdapter.SINT32.decode(protoReader));
                            break;
                        case 7:
                            try {
                                builder.connectionState((V2ConnectionState) V2ConnectionState.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        case 8:
                            builder.session((V2AmberSession) V2AmberSession.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m66build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2MLAmber v2MLAmber) {
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, v2MLAmber.identifier);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, v2MLAmber.batteryLevel);
            ProtoAdapter protoAdapter = ProtoAdapter.SINT32;
            protoAdapter.encodeWithTag(protoWriter, 3, v2MLAmber.bleSignalLevel);
            String str = v2MLAmber.firmwareRevision;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, str);
            }
            protoAdapter.encodeWithTag(protoWriter, 5, v2MLAmber.chipTemperature);
            protoAdapter.encodeWithTag(protoWriter, 6, v2MLAmber.grillTemperature);
            V2ConnectionState.ADAPTER.encodeWithTag(protoWriter, 7, v2MLAmber.connectionState);
            V2AmberSession.ADAPTER.encodeWithTag(protoWriter, 8, v2MLAmber.session);
            protoWriter.writeBytes(v2MLAmber.unknownFields());
        }

        public int encodedSize(V2MLAmber v2MLAmber) {
            int encodedSizeWithTag = ProtoAdapter.FIXED64.encodedSizeWithTag(1, v2MLAmber.identifier) + ProtoAdapter.UINT32.encodedSizeWithTag(2, v2MLAmber.batteryLevel);
            ProtoAdapter protoAdapter = ProtoAdapter.SINT32;
            int encodedSizeWithTag2 = encodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, v2MLAmber.bleSignalLevel);
            String str = v2MLAmber.firmwareRevision;
            return encodedSizeWithTag2 + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, str) : 0) + protoAdapter.encodedSizeWithTag(5, v2MLAmber.chipTemperature) + protoAdapter.encodedSizeWithTag(6, v2MLAmber.grillTemperature) + V2ConnectionState.ADAPTER.encodedSizeWithTag(7, v2MLAmber.connectionState) + V2AmberSession.ADAPTER.encodedSizeWithTag(8, v2MLAmber.session) + v2MLAmber.unknownFields().I();
        }

        public V2MLAmber redact(V2MLAmber v2MLAmber) {
            Builder m65newBuilder = v2MLAmber.m65newBuilder();
            V2AmberSession v2AmberSession = m65newBuilder.session;
            if (v2AmberSession != null) {
                m65newBuilder.session = (V2AmberSession) V2AmberSession.ADAPTER.redact(v2AmberSession);
            }
            m65newBuilder.clearUnknownFields();
            return m65newBuilder.m66build();
        }
    }

    public V2MLAmber(Long l10, Integer num, Integer num2, String str, Integer num3, Integer num4, V2ConnectionState v2ConnectionState, V2AmberSession v2AmberSession) {
        this(l10, num, num2, str, num3, num4, v2ConnectionState, v2AmberSession, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2MLAmber)) {
            return false;
        }
        V2MLAmber v2MLAmber = (V2MLAmber) obj;
        if (Internal.equals(unknownFields(), v2MLAmber.unknownFields()) && Internal.equals(this.identifier, v2MLAmber.identifier) && Internal.equals(this.batteryLevel, v2MLAmber.batteryLevel) && Internal.equals(this.bleSignalLevel, v2MLAmber.bleSignalLevel) && Internal.equals(this.firmwareRevision, v2MLAmber.firmwareRevision) && Internal.equals(this.chipTemperature, v2MLAmber.chipTemperature) && Internal.equals(this.grillTemperature, v2MLAmber.grillTemperature) && Internal.equals(this.connectionState, v2MLAmber.connectionState) && Internal.equals(this.session, v2MLAmber.session)) {
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
        int i16;
        int i17 = ((Message) this).hashCode;
        if (i17 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Long l10 = this.identifier;
            int i18 = 0;
            if (l10 != null) {
                i10 = l10.hashCode();
            } else {
                i10 = 0;
            }
            int i19 = (hashCode + i10) * 37;
            Integer num = this.batteryLevel;
            if (num != null) {
                i11 = num.hashCode();
            } else {
                i11 = 0;
            }
            int i20 = (i19 + i11) * 37;
            Integer num2 = this.bleSignalLevel;
            if (num2 != null) {
                i12 = num2.hashCode();
            } else {
                i12 = 0;
            }
            int i21 = (i20 + i12) * 37;
            String str = this.firmwareRevision;
            if (str != null) {
                i13 = str.hashCode();
            } else {
                i13 = 0;
            }
            int i22 = (i21 + i13) * 37;
            Integer num3 = this.chipTemperature;
            if (num3 != null) {
                i14 = num3.hashCode();
            } else {
                i14 = 0;
            }
            int i23 = (i22 + i14) * 37;
            Integer num4 = this.grillTemperature;
            if (num4 != null) {
                i15 = num4.hashCode();
            } else {
                i15 = 0;
            }
            int i24 = (i23 + i15) * 37;
            V2ConnectionState v2ConnectionState = this.connectionState;
            if (v2ConnectionState != null) {
                i16 = v2ConnectionState.hashCode();
            } else {
                i16 = 0;
            }
            int i25 = (i24 + i16) * 37;
            V2AmberSession v2AmberSession = this.session;
            if (v2AmberSession != null) {
                i18 = v2AmberSession.hashCode();
            }
            int i26 = i25 + i18;
            ((Message) this).hashCode = i26;
            return i26;
        }
        return i17;
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
        if (this.bleSignalLevel != null) {
            sb.append(", bleSignalLevel=");
            sb.append(this.bleSignalLevel);
        }
        if (this.firmwareRevision != null) {
            sb.append(", firmwareRevision=");
            sb.append(this.firmwareRevision);
        }
        if (this.chipTemperature != null) {
            sb.append(", chipTemperature=");
            sb.append(this.chipTemperature);
        }
        if (this.grillTemperature != null) {
            sb.append(", grillTemperature=");
            sb.append(this.grillTemperature);
        }
        if (this.connectionState != null) {
            sb.append(", connectionState=");
            sb.append(this.connectionState);
        }
        if (this.session != null) {
            sb.append(", session=");
            sb.append(this.session);
        }
        StringBuilder replace = sb.replace(0, 2, "V2MLAmber{");
        replace.append('}');
        return replace.toString();
    }

    public V2MLAmber(Long l10, Integer num, Integer num2, String str, Integer num3, Integer num4, V2ConnectionState v2ConnectionState, V2AmberSession v2AmberSession, h hVar) {
        super(ADAPTER, hVar);
        this.identifier = l10;
        this.batteryLevel = num;
        this.bleSignalLevel = num2;
        this.firmwareRevision = str;
        this.chipTemperature = num3;
        this.grillTemperature = num4;
        this.connectionState = v2ConnectionState;
        this.session = v2AmberSession;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m65newBuilder() {
        Builder builder = new Builder();
        builder.identifier = this.identifier;
        builder.batteryLevel = this.batteryLevel;
        builder.bleSignalLevel = this.bleSignalLevel;
        builder.firmwareRevision = this.firmwareRevision;
        builder.chipTemperature = this.chipTemperature;
        builder.grillTemperature = this.grillTemperature;
        builder.connectionState = this.connectionState;
        builder.session = this.session;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
