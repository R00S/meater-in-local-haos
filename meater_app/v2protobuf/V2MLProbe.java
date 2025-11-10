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
public final class V2MLProbe extends Message<V2MLProbe, Builder> {
    public static final String DEFAULT_FIRMWAREREVISION = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 4)
    public final Integer batteryLevel;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 5)
    public final Integer bleSignalLevel;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2ConnectionState#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final V2ConnectionState connectionState;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public final String firmwareRevision;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long parentIdentifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer probeNum;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2ProbeSetup#ADAPTER", label = WireField.Label.REQUIRED, tag = 7)
    public final V2ProbeSetup setup;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2ProbeStatus#ADAPTER", label = WireField.Label.REQUIRED, tag = 8)
    public final V2ProbeStatus status;
    public static final ProtoAdapter<V2MLProbe> ADAPTER = new ProtoAdapter_V2MLProbe();
    public static final Long DEFAULT_IDENTIFIER = 0L;
    public static final Long DEFAULT_PARENTIDENTIFIER = 0L;
    public static final Integer DEFAULT_PROBENUM = 0;
    public static final Integer DEFAULT_BATTERYLEVEL = 0;
    public static final Integer DEFAULT_BLESIGNALLEVEL = 0;
    public static final V2ConnectionState DEFAULT_CONNECTIONSTATE = V2ConnectionState.V2CONNECTION_STATE_OFFLINE;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2MLProbe, Builder> {
        public Integer batteryLevel;
        public Integer bleSignalLevel;
        public V2ConnectionState connectionState;
        public String firmwareRevision;
        public Long identifier;
        public Long parentIdentifier;
        public Integer probeNum;
        public V2ProbeSetup setup;
        public V2ProbeStatus status;

        public Builder batteryLevel(Integer num) {
            this.batteryLevel = num;
            return this;
        }

        public Builder bleSignalLevel(Integer num) {
            this.bleSignalLevel = num;
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

        public Builder parentIdentifier(Long l10) {
            this.parentIdentifier = l10;
            return this;
        }

        public Builder probeNum(Integer num) {
            this.probeNum = num;
            return this;
        }

        public Builder setup(V2ProbeSetup v2ProbeSetup) {
            this.setup = v2ProbeSetup;
            return this;
        }

        public Builder status(V2ProbeStatus v2ProbeStatus) {
            this.status = v2ProbeStatus;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2MLProbe m78build() {
            Long l10 = this.identifier;
            if (l10 != null && this.parentIdentifier != null && this.probeNum != null && this.batteryLevel != null && this.bleSignalLevel != null && this.connectionState != null && this.setup != null && this.status != null) {
                return new V2MLProbe(this.identifier, this.parentIdentifier, this.probeNum, this.batteryLevel, this.bleSignalLevel, this.connectionState, this.setup, this.status, this.firmwareRevision, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "identifier", this.parentIdentifier, "parentIdentifier", this.probeNum, "probeNum", this.batteryLevel, "batteryLevel", this.bleSignalLevel, "bleSignalLevel", this.connectionState, "connectionState", this.setup, "setup", this.status, "status"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2MLProbe extends ProtoAdapter<V2MLProbe> {
        ProtoAdapter_V2MLProbe() {
            super(FieldEncoding.LENGTH_DELIMITED, V2MLProbe.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2MLProbe m79decode(ProtoReader protoReader) {
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
                            builder.parentIdentifier((Long) ProtoAdapter.FIXED64.decode(protoReader));
                            break;
                        case 3:
                            builder.probeNum((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 4:
                            builder.batteryLevel((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 5:
                            builder.bleSignalLevel((Integer) ProtoAdapter.SINT32.decode(protoReader));
                            break;
                        case 6:
                            try {
                                builder.connectionState((V2ConnectionState) V2ConnectionState.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        case 7:
                            builder.setup((V2ProbeSetup) V2ProbeSetup.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            builder.status((V2ProbeStatus) V2ProbeStatus.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            builder.firmwareRevision((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m78build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2MLProbe v2MLProbe) {
            ProtoAdapter protoAdapter = ProtoAdapter.FIXED64;
            protoAdapter.encodeWithTag(protoWriter, 1, v2MLProbe.identifier);
            protoAdapter.encodeWithTag(protoWriter, 2, v2MLProbe.parentIdentifier);
            ProtoAdapter protoAdapter2 = ProtoAdapter.UINT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, v2MLProbe.probeNum);
            protoAdapter2.encodeWithTag(protoWriter, 4, v2MLProbe.batteryLevel);
            ProtoAdapter.SINT32.encodeWithTag(protoWriter, 5, v2MLProbe.bleSignalLevel);
            V2ConnectionState.ADAPTER.encodeWithTag(protoWriter, 6, v2MLProbe.connectionState);
            V2ProbeSetup.ADAPTER.encodeWithTag(protoWriter, 7, v2MLProbe.setup);
            V2ProbeStatus.ADAPTER.encodeWithTag(protoWriter, 8, v2MLProbe.status);
            String str = v2MLProbe.firmwareRevision;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, str);
            }
            protoWriter.writeBytes(v2MLProbe.unknownFields());
        }

        public int encodedSize(V2MLProbe v2MLProbe) {
            ProtoAdapter protoAdapter = ProtoAdapter.FIXED64;
            int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, v2MLProbe.identifier) + protoAdapter.encodedSizeWithTag(2, v2MLProbe.parentIdentifier);
            ProtoAdapter protoAdapter2 = ProtoAdapter.UINT32;
            int encodedSizeWithTag2 = encodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, v2MLProbe.probeNum) + protoAdapter2.encodedSizeWithTag(4, v2MLProbe.batteryLevel) + ProtoAdapter.SINT32.encodedSizeWithTag(5, v2MLProbe.bleSignalLevel) + V2ConnectionState.ADAPTER.encodedSizeWithTag(6, v2MLProbe.connectionState) + V2ProbeSetup.ADAPTER.encodedSizeWithTag(7, v2MLProbe.setup) + V2ProbeStatus.ADAPTER.encodedSizeWithTag(8, v2MLProbe.status);
            String str = v2MLProbe.firmwareRevision;
            return encodedSizeWithTag2 + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(9, str) : 0) + v2MLProbe.unknownFields().I();
        }

        public V2MLProbe redact(V2MLProbe v2MLProbe) {
            Builder m77newBuilder = v2MLProbe.m77newBuilder();
            V2ProbeSetup v2ProbeSetup = m77newBuilder.setup;
            if (v2ProbeSetup != null) {
                m77newBuilder.setup = (V2ProbeSetup) V2ProbeSetup.ADAPTER.redact(v2ProbeSetup);
            }
            V2ProbeStatus v2ProbeStatus = m77newBuilder.status;
            if (v2ProbeStatus != null) {
                m77newBuilder.status = (V2ProbeStatus) V2ProbeStatus.ADAPTER.redact(v2ProbeStatus);
            }
            m77newBuilder.clearUnknownFields();
            return m77newBuilder.m78build();
        }
    }

    public V2MLProbe(Long l10, Long l11, Integer num, Integer num2, Integer num3, V2ConnectionState v2ConnectionState, V2ProbeSetup v2ProbeSetup, V2ProbeStatus v2ProbeStatus, String str) {
        this(l10, l11, num, num2, num3, v2ConnectionState, v2ProbeSetup, v2ProbeStatus, str, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2MLProbe)) {
            return false;
        }
        V2MLProbe v2MLProbe = (V2MLProbe) obj;
        if (Internal.equals(unknownFields(), v2MLProbe.unknownFields()) && Internal.equals(this.identifier, v2MLProbe.identifier) && Internal.equals(this.parentIdentifier, v2MLProbe.parentIdentifier) && Internal.equals(this.probeNum, v2MLProbe.probeNum) && Internal.equals(this.batteryLevel, v2MLProbe.batteryLevel) && Internal.equals(this.bleSignalLevel, v2MLProbe.bleSignalLevel) && Internal.equals(this.connectionState, v2MLProbe.connectionState) && Internal.equals(this.setup, v2MLProbe.setup) && Internal.equals(this.status, v2MLProbe.status) && Internal.equals(this.firmwareRevision, v2MLProbe.firmwareRevision)) {
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
            Long l10 = this.identifier;
            int i19 = 0;
            if (l10 != null) {
                i10 = l10.hashCode();
            } else {
                i10 = 0;
            }
            int i20 = (hashCode + i10) * 37;
            Long l11 = this.parentIdentifier;
            if (l11 != null) {
                i11 = l11.hashCode();
            } else {
                i11 = 0;
            }
            int i21 = (i20 + i11) * 37;
            Integer num = this.probeNum;
            if (num != null) {
                i12 = num.hashCode();
            } else {
                i12 = 0;
            }
            int i22 = (i21 + i12) * 37;
            Integer num2 = this.batteryLevel;
            if (num2 != null) {
                i13 = num2.hashCode();
            } else {
                i13 = 0;
            }
            int i23 = (i22 + i13) * 37;
            Integer num3 = this.bleSignalLevel;
            if (num3 != null) {
                i14 = num3.hashCode();
            } else {
                i14 = 0;
            }
            int i24 = (i23 + i14) * 37;
            V2ConnectionState v2ConnectionState = this.connectionState;
            if (v2ConnectionState != null) {
                i15 = v2ConnectionState.hashCode();
            } else {
                i15 = 0;
            }
            int i25 = (i24 + i15) * 37;
            V2ProbeSetup v2ProbeSetup = this.setup;
            if (v2ProbeSetup != null) {
                i16 = v2ProbeSetup.hashCode();
            } else {
                i16 = 0;
            }
            int i26 = (i25 + i16) * 37;
            V2ProbeStatus v2ProbeStatus = this.status;
            if (v2ProbeStatus != null) {
                i17 = v2ProbeStatus.hashCode();
            } else {
                i17 = 0;
            }
            int i27 = (i26 + i17) * 37;
            String str = this.firmwareRevision;
            if (str != null) {
                i19 = str.hashCode();
            }
            int i28 = i27 + i19;
            ((Message) this).hashCode = i28;
            return i28;
        }
        return i18;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.identifier != null) {
            sb.append(", identifier=");
            sb.append(this.identifier);
        }
        if (this.parentIdentifier != null) {
            sb.append(", parentIdentifier=");
            sb.append(this.parentIdentifier);
        }
        if (this.probeNum != null) {
            sb.append(", probeNum=");
            sb.append(this.probeNum);
        }
        if (this.batteryLevel != null) {
            sb.append(", batteryLevel=");
            sb.append(this.batteryLevel);
        }
        if (this.bleSignalLevel != null) {
            sb.append(", bleSignalLevel=");
            sb.append(this.bleSignalLevel);
        }
        if (this.connectionState != null) {
            sb.append(", connectionState=");
            sb.append(this.connectionState);
        }
        if (this.setup != null) {
            sb.append(", setup=");
            sb.append(this.setup);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.firmwareRevision != null) {
            sb.append(", firmwareRevision=");
            sb.append(this.firmwareRevision);
        }
        StringBuilder replace = sb.replace(0, 2, "V2MLProbe{");
        replace.append('}');
        return replace.toString();
    }

    public V2MLProbe(Long l10, Long l11, Integer num, Integer num2, Integer num3, V2ConnectionState v2ConnectionState, V2ProbeSetup v2ProbeSetup, V2ProbeStatus v2ProbeStatus, String str, h hVar) {
        super(ADAPTER, hVar);
        this.identifier = l10;
        this.parentIdentifier = l11;
        this.probeNum = num;
        this.batteryLevel = num2;
        this.bleSignalLevel = num3;
        this.connectionState = v2ConnectionState;
        this.setup = v2ProbeSetup;
        this.status = v2ProbeStatus;
        this.firmwareRevision = str;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m77newBuilder() {
        Builder builder = new Builder();
        builder.identifier = this.identifier;
        builder.parentIdentifier = this.parentIdentifier;
        builder.probeNum = this.probeNum;
        builder.batteryLevel = this.batteryLevel;
        builder.bleSignalLevel = this.bleSignalLevel;
        builder.connectionState = this.connectionState;
        builder.setup = this.setup;
        builder.status = this.status;
        builder.firmwareRevision = this.firmwareRevision;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
