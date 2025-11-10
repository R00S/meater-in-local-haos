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
public final class V1MLProbe extends Message<V1MLProbe, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 4)
    public final Integer battery;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1ConnectionState#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final V1ConnectionState connectionState;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 8)
    public final Integer meaterPlusBattery;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", tag = 9)
    public final Integer meaterPlusProbeSignalLevel;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer probeId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long probeSerialNum;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1ProbeSetup#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final V1ProbeSetup setup;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 5)
    public final Integer signalLevel;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1ProbeStatus#ADAPTER", label = WireField.Label.REQUIRED, tag = 7)
    public final V1ProbeStatus status;
    public static final ProtoAdapter<V1MLProbe> ADAPTER = new ProtoAdapter_LegacyMLProbe();
    public static final Long DEFAULT_PROBESERIALNUM = 0L;
    public static final Integer DEFAULT_PROBEID = 0;
    public static final V1ConnectionState DEFAULT_CONNECTIONSTATE = V1ConnectionState.CONNECTION_STATE_OFFLINE;
    public static final Integer DEFAULT_BATTERY = 0;
    public static final Integer DEFAULT_SIGNALLEVEL = 0;
    public static final Integer DEFAULT_MEATERPLUSBATTERY = 0;
    public static final Integer DEFAULT_MEATERPLUSPROBESIGNALLEVEL = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V1MLProbe, Builder> {
        public Integer battery;
        public V1ConnectionState connectionState;
        public Integer meaterPlusBattery;
        public Integer meaterPlusProbeSignalLevel;
        public Integer probeId;
        public Long probeSerialNum;
        public V1ProbeSetup setup;
        public Integer signalLevel;
        public V1ProbeStatus status;

        public Builder battery(Integer num) {
            this.battery = num;
            return this;
        }

        public Builder connectionState(V1ConnectionState v1ConnectionState) {
            this.connectionState = v1ConnectionState;
            return this;
        }

        public Builder meaterPlusBattery(Integer num) {
            this.meaterPlusBattery = num;
            return this;
        }

        public Builder meaterPlusProbeSignalLevel(Integer num) {
            this.meaterPlusProbeSignalLevel = num;
            return this;
        }

        public Builder probeId(Integer num) {
            this.probeId = num;
            return this;
        }

        public Builder probeSerialNum(Long l10) {
            this.probeSerialNum = l10;
            return this;
        }

        public Builder setup(V1ProbeSetup v1ProbeSetup) {
            this.setup = v1ProbeSetup;
            return this;
        }

        public Builder signalLevel(Integer num) {
            this.signalLevel = num;
            return this;
        }

        public Builder status(V1ProbeStatus v1ProbeStatus) {
            this.status = v1ProbeStatus;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V1MLProbe m12build() {
            Long l10 = this.probeSerialNum;
            if (l10 != null && this.probeId != null && this.connectionState != null && this.battery != null && this.signalLevel != null && this.setup != null && this.status != null) {
                return new V1MLProbe(this.probeSerialNum, this.probeId, this.connectionState, this.battery, this.signalLevel, this.setup, this.status, this.meaterPlusBattery, this.meaterPlusProbeSignalLevel, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "probeSerialNum", this.probeId, "probeId", this.connectionState, "connectionState", this.battery, "battery", this.signalLevel, "signalLevel", this.setup, "setup", this.status, "status"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_LegacyMLProbe extends ProtoAdapter<V1MLProbe> {
        ProtoAdapter_LegacyMLProbe() {
            super(FieldEncoding.LENGTH_DELIMITED, V1MLProbe.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V1MLProbe m13decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.probeSerialNum((Long) ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        case 2:
                            builder.probeId((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 3:
                            try {
                                builder.connectionState((V1ConnectionState) V1ConnectionState.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        case 4:
                            builder.battery((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 5:
                            builder.signalLevel((Integer) ProtoAdapter.SINT32.decode(protoReader));
                            break;
                        case 6:
                            builder.setup((V1ProbeSetup) V1ProbeSetup.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            builder.status((V1ProbeStatus) V1ProbeStatus.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            builder.meaterPlusBattery((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 9:
                            builder.meaterPlusProbeSignalLevel((Integer) ProtoAdapter.SINT32.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m12build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V1MLProbe v1MLProbe) {
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 1, v1MLProbe.probeSerialNum);
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 2, v1MLProbe.probeId);
            V1ConnectionState.ADAPTER.encodeWithTag(protoWriter, 3, v1MLProbe.connectionState);
            protoAdapter.encodeWithTag(protoWriter, 4, v1MLProbe.battery);
            ProtoAdapter protoAdapter2 = ProtoAdapter.SINT32;
            protoAdapter2.encodeWithTag(protoWriter, 5, v1MLProbe.signalLevel);
            V1ProbeSetup.ADAPTER.encodeWithTag(protoWriter, 6, v1MLProbe.setup);
            V1ProbeStatus.ADAPTER.encodeWithTag(protoWriter, 7, v1MLProbe.status);
            Integer num = v1MLProbe.meaterPlusBattery;
            if (num != null) {
                protoAdapter.encodeWithTag(protoWriter, 8, num);
            }
            Integer num2 = v1MLProbe.meaterPlusProbeSignalLevel;
            if (num2 != null) {
                protoAdapter2.encodeWithTag(protoWriter, 9, num2);
            }
            protoWriter.writeBytes(v1MLProbe.unknownFields());
        }

        public int encodedSize(V1MLProbe v1MLProbe) {
            int encodedSizeWithTag = ProtoAdapter.UINT64.encodedSizeWithTag(1, v1MLProbe.probeSerialNum);
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            int encodedSizeWithTag2 = encodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, v1MLProbe.probeId) + V1ConnectionState.ADAPTER.encodedSizeWithTag(3, v1MLProbe.connectionState) + protoAdapter.encodedSizeWithTag(4, v1MLProbe.battery);
            ProtoAdapter protoAdapter2 = ProtoAdapter.SINT32;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(5, v1MLProbe.signalLevel) + V1ProbeSetup.ADAPTER.encodedSizeWithTag(6, v1MLProbe.setup) + V1ProbeStatus.ADAPTER.encodedSizeWithTag(7, v1MLProbe.status);
            Integer num = v1MLProbe.meaterPlusBattery;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + (num != null ? protoAdapter.encodedSizeWithTag(8, num) : 0);
            Integer num2 = v1MLProbe.meaterPlusProbeSignalLevel;
            return encodedSizeWithTag4 + (num2 != null ? protoAdapter2.encodedSizeWithTag(9, num2) : 0) + v1MLProbe.unknownFields().I();
        }

        public V1MLProbe redact(V1MLProbe v1MLProbe) {
            Builder m11newBuilder = v1MLProbe.m11newBuilder();
            V1ProbeSetup v1ProbeSetup = m11newBuilder.setup;
            if (v1ProbeSetup != null) {
                m11newBuilder.setup = (V1ProbeSetup) V1ProbeSetup.ADAPTER.redact(v1ProbeSetup);
            }
            V1ProbeStatus v1ProbeStatus = m11newBuilder.status;
            if (v1ProbeStatus != null) {
                m11newBuilder.status = (V1ProbeStatus) V1ProbeStatus.ADAPTER.redact(v1ProbeStatus);
            }
            m11newBuilder.clearUnknownFields();
            return m11newBuilder.m12build();
        }
    }

    public V1MLProbe(Long l10, Integer num, V1ConnectionState v1ConnectionState, Integer num2, Integer num3, V1ProbeSetup v1ProbeSetup, V1ProbeStatus v1ProbeStatus, Integer num4, Integer num5) {
        this(l10, num, v1ConnectionState, num2, num3, v1ProbeSetup, v1ProbeStatus, num4, num5, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1MLProbe)) {
            return false;
        }
        V1MLProbe v1MLProbe = (V1MLProbe) obj;
        if (Internal.equals(unknownFields(), v1MLProbe.unknownFields()) && Internal.equals(this.probeSerialNum, v1MLProbe.probeSerialNum) && Internal.equals(this.probeId, v1MLProbe.probeId) && Internal.equals(this.connectionState, v1MLProbe.connectionState) && Internal.equals(this.battery, v1MLProbe.battery) && Internal.equals(this.signalLevel, v1MLProbe.signalLevel) && Internal.equals(this.setup, v1MLProbe.setup) && Internal.equals(this.status, v1MLProbe.status) && Internal.equals(this.meaterPlusBattery, v1MLProbe.meaterPlusBattery) && Internal.equals(this.meaterPlusProbeSignalLevel, v1MLProbe.meaterPlusProbeSignalLevel)) {
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
        int i17;
        int i18 = ((Message) this).hashCode;
        if (i18 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Long l10 = this.probeSerialNum;
            int i19 = 0;
            if (l10 != null) {
                i10 = l10.hashCode();
            } else {
                i10 = 0;
            }
            int i20 = (hashCode + i10) * 37;
            Integer num = this.probeId;
            if (num != null) {
                i11 = num.hashCode();
            } else {
                i11 = 0;
            }
            int i21 = (i20 + i11) * 37;
            V1ConnectionState v1ConnectionState = this.connectionState;
            if (v1ConnectionState != null) {
                i12 = v1ConnectionState.hashCode();
            } else {
                i12 = 0;
            }
            int i22 = (i21 + i12) * 37;
            Integer num2 = this.battery;
            if (num2 != null) {
                i13 = num2.hashCode();
            } else {
                i13 = 0;
            }
            int i23 = (i22 + i13) * 37;
            Integer num3 = this.signalLevel;
            if (num3 != null) {
                i14 = num3.hashCode();
            } else {
                i14 = 0;
            }
            int i24 = (i23 + i14) * 37;
            V1ProbeSetup v1ProbeSetup = this.setup;
            if (v1ProbeSetup != null) {
                i15 = v1ProbeSetup.hashCode();
            } else {
                i15 = 0;
            }
            int i25 = (i24 + i15) * 37;
            V1ProbeStatus v1ProbeStatus = this.status;
            if (v1ProbeStatus != null) {
                i16 = v1ProbeStatus.hashCode();
            } else {
                i16 = 0;
            }
            int i26 = (i25 + i16) * 37;
            Integer num4 = this.meaterPlusBattery;
            if (num4 != null) {
                i17 = num4.hashCode();
            } else {
                i17 = 0;
            }
            int i27 = (i26 + i17) * 37;
            Integer num5 = this.meaterPlusProbeSignalLevel;
            if (num5 != null) {
                i19 = num5.hashCode();
            }
            int i28 = i27 + i19;
            ((Message) this).hashCode = i28;
            return i28;
        }
        return i18;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.probeSerialNum != null) {
            sb.append(", probeSerialNum=");
            sb.append(this.probeSerialNum);
        }
        if (this.probeId != null) {
            sb.append(", probeId=");
            sb.append(this.probeId);
        }
        if (this.connectionState != null) {
            sb.append(", connectionState=");
            sb.append(this.connectionState);
        }
        if (this.battery != null) {
            sb.append(", battery=");
            sb.append(this.battery);
        }
        if (this.signalLevel != null) {
            sb.append(", signalLevel=");
            sb.append(this.signalLevel);
        }
        if (this.setup != null) {
            sb.append(", setup=");
            sb.append(this.setup);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.meaterPlusBattery != null) {
            sb.append(", meaterPlusBattery=");
            sb.append(this.meaterPlusBattery);
        }
        if (this.meaterPlusProbeSignalLevel != null) {
            sb.append(", meaterPlusProbeSignalLevel=");
            sb.append(this.meaterPlusProbeSignalLevel);
        }
        StringBuilder replace = sb.replace(0, 2, "V1MLProbe{");
        replace.append('}');
        return replace.toString();
    }

    public V1MLProbe(Long l10, Integer num, V1ConnectionState v1ConnectionState, Integer num2, Integer num3, V1ProbeSetup v1ProbeSetup, V1ProbeStatus v1ProbeStatus, Integer num4, Integer num5, h hVar) {
        super(ADAPTER, hVar);
        this.probeSerialNum = l10;
        this.probeId = num;
        this.connectionState = v1ConnectionState;
        this.battery = num2;
        this.signalLevel = num3;
        this.setup = v1ProbeSetup;
        this.status = v1ProbeStatus;
        this.meaterPlusBattery = num4;
        this.meaterPlusProbeSignalLevel = num5;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m11newBuilder() {
        Builder builder = new Builder();
        builder.probeSerialNum = this.probeSerialNum;
        builder.probeId = this.probeId;
        builder.connectionState = this.connectionState;
        builder.battery = this.battery;
        builder.signalLevel = this.signalLevel;
        builder.setup = this.setup;
        builder.status = this.status;
        builder.meaterPlusBattery = this.meaterPlusBattery;
        builder.meaterPlusProbeSignalLevel = this.meaterPlusProbeSignalLevel;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
