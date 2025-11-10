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
public final class ProbeTestMessage extends Message<ProbeTestMessage, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 5)
    public final Integer ambientTemp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 6)
    public final Integer battery;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 8)
    public final Boolean chargingState;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 4)
    public final Integer internalTemp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer meaterLinkIdentifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 3)
    public final Integer probeId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long probeSerialNum;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 7)
    public final Integer signalLevel;
    public static final ProtoAdapter<ProbeTestMessage> ADAPTER = new ProtoAdapter_ProbeTestMessage();
    public static final Integer DEFAULT_MEATERLINKIDENTIFIER = 21578;
    public static final Long DEFAULT_PROBESERIALNUM = 0L;
    public static final Integer DEFAULT_PROBEID = 0;
    public static final Integer DEFAULT_INTERNALTEMP = 0;
    public static final Integer DEFAULT_AMBIENTTEMP = 0;
    public static final Integer DEFAULT_BATTERY = 0;
    public static final Integer DEFAULT_SIGNALLEVEL = 0;
    public static final Boolean DEFAULT_CHARGINGSTATE = Boolean.FALSE;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<ProbeTestMessage, Builder> {
        public Integer ambientTemp;
        public Integer battery;
        public Boolean chargingState;
        public Integer internalTemp;
        public Integer meaterLinkIdentifier;
        public Integer probeId;
        public Long probeSerialNum;
        public Integer signalLevel;

        public Builder ambientTemp(Integer num) {
            this.ambientTemp = num;
            return this;
        }

        public Builder battery(Integer num) {
            this.battery = num;
            return this;
        }

        public Builder chargingState(Boolean bool) {
            this.chargingState = bool;
            return this;
        }

        public Builder internalTemp(Integer num) {
            this.internalTemp = num;
            return this;
        }

        public Builder meaterLinkIdentifier(Integer num) {
            this.meaterLinkIdentifier = num;
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

        public Builder signalLevel(Integer num) {
            this.signalLevel = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public ProbeTestMessage m348build() {
            Integer num = this.meaterLinkIdentifier;
            if (num != null && this.probeSerialNum != null) {
                return new ProbeTestMessage(this.meaterLinkIdentifier, this.probeSerialNum, this.probeId, this.internalTemp, this.ambientTemp, this.battery, this.signalLevel, this.chargingState, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "meaterLinkIdentifier", this.probeSerialNum, "probeSerialNum"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_ProbeTestMessage extends ProtoAdapter<ProbeTestMessage> {
        ProtoAdapter_ProbeTestMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, ProbeTestMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public ProbeTestMessage m349decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.meaterLinkIdentifier((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 2:
                            builder.probeSerialNum((Long) ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        case 3:
                            builder.probeId((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 4:
                            builder.internalTemp((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 5:
                            builder.ambientTemp((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 6:
                            builder.battery((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 7:
                            builder.signalLevel((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 8:
                            builder.chargingState((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m348build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, ProbeTestMessage probeTestMessage) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, probeTestMessage.meaterLinkIdentifier);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 2, probeTestMessage.probeSerialNum);
            Integer num = probeTestMessage.probeId;
            if (num != null) {
                protoAdapter.encodeWithTag(protoWriter, 3, num);
            }
            Integer num2 = probeTestMessage.internalTemp;
            if (num2 != null) {
                protoAdapter.encodeWithTag(protoWriter, 4, num2);
            }
            Integer num3 = probeTestMessage.ambientTemp;
            if (num3 != null) {
                protoAdapter.encodeWithTag(protoWriter, 5, num3);
            }
            Integer num4 = probeTestMessage.battery;
            if (num4 != null) {
                protoAdapter.encodeWithTag(protoWriter, 6, num4);
            }
            Integer num5 = probeTestMessage.signalLevel;
            if (num5 != null) {
                protoAdapter.encodeWithTag(protoWriter, 7, num5);
            }
            Boolean bool = probeTestMessage.chargingState;
            if (bool != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, bool);
            }
            protoWriter.writeBytes(probeTestMessage.unknownFields());
        }

        public int encodedSize(ProbeTestMessage probeTestMessage) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, probeTestMessage.meaterLinkIdentifier) + ProtoAdapter.UINT64.encodedSizeWithTag(2, probeTestMessage.probeSerialNum);
            Integer num = probeTestMessage.probeId;
            int encodedSizeWithTag2 = encodedSizeWithTag + (num != null ? protoAdapter.encodedSizeWithTag(3, num) : 0);
            Integer num2 = probeTestMessage.internalTemp;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + (num2 != null ? protoAdapter.encodedSizeWithTag(4, num2) : 0);
            Integer num3 = probeTestMessage.ambientTemp;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + (num3 != null ? protoAdapter.encodedSizeWithTag(5, num3) : 0);
            Integer num4 = probeTestMessage.battery;
            int encodedSizeWithTag5 = encodedSizeWithTag4 + (num4 != null ? protoAdapter.encodedSizeWithTag(6, num4) : 0);
            Integer num5 = probeTestMessage.signalLevel;
            int encodedSizeWithTag6 = encodedSizeWithTag5 + (num5 != null ? protoAdapter.encodedSizeWithTag(7, num5) : 0);
            Boolean bool = probeTestMessage.chargingState;
            return encodedSizeWithTag6 + (bool != null ? ProtoAdapter.BOOL.encodedSizeWithTag(8, bool) : 0) + probeTestMessage.unknownFields().I();
        }

        public ProbeTestMessage redact(ProbeTestMessage probeTestMessage) {
            Builder m347newBuilder = probeTestMessage.m347newBuilder();
            m347newBuilder.clearUnknownFields();
            return m347newBuilder.m348build();
        }
    }

    public ProbeTestMessage(Integer num, Long l10, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Boolean bool) {
        this(num, l10, num2, num3, num4, num5, num6, bool, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProbeTestMessage)) {
            return false;
        }
        ProbeTestMessage probeTestMessage = (ProbeTestMessage) obj;
        if (Internal.equals(unknownFields(), probeTestMessage.unknownFields()) && Internal.equals(this.meaterLinkIdentifier, probeTestMessage.meaterLinkIdentifier) && Internal.equals(this.probeSerialNum, probeTestMessage.probeSerialNum) && Internal.equals(this.probeId, probeTestMessage.probeId) && Internal.equals(this.internalTemp, probeTestMessage.internalTemp) && Internal.equals(this.ambientTemp, probeTestMessage.ambientTemp) && Internal.equals(this.battery, probeTestMessage.battery) && Internal.equals(this.signalLevel, probeTestMessage.signalLevel) && Internal.equals(this.chargingState, probeTestMessage.chargingState)) {
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
            Integer num = this.meaterLinkIdentifier;
            int i18 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i19 = (hashCode + i10) * 37;
            Long l10 = this.probeSerialNum;
            if (l10 != null) {
                i11 = l10.hashCode();
            } else {
                i11 = 0;
            }
            int i20 = (i19 + i11) * 37;
            Integer num2 = this.probeId;
            if (num2 != null) {
                i12 = num2.hashCode();
            } else {
                i12 = 0;
            }
            int i21 = (i20 + i12) * 37;
            Integer num3 = this.internalTemp;
            if (num3 != null) {
                i13 = num3.hashCode();
            } else {
                i13 = 0;
            }
            int i22 = (i21 + i13) * 37;
            Integer num4 = this.ambientTemp;
            if (num4 != null) {
                i14 = num4.hashCode();
            } else {
                i14 = 0;
            }
            int i23 = (i22 + i14) * 37;
            Integer num5 = this.battery;
            if (num5 != null) {
                i15 = num5.hashCode();
            } else {
                i15 = 0;
            }
            int i24 = (i23 + i15) * 37;
            Integer num6 = this.signalLevel;
            if (num6 != null) {
                i16 = num6.hashCode();
            } else {
                i16 = 0;
            }
            int i25 = (i24 + i16) * 37;
            Boolean bool = this.chargingState;
            if (bool != null) {
                i18 = bool.hashCode();
            }
            int i26 = i25 + i18;
            ((Message) this).hashCode = i26;
            return i26;
        }
        return i17;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.meaterLinkIdentifier != null) {
            sb.append(", meaterLinkIdentifier=");
            sb.append(this.meaterLinkIdentifier);
        }
        if (this.probeSerialNum != null) {
            sb.append(", probeSerialNum=");
            sb.append(this.probeSerialNum);
        }
        if (this.probeId != null) {
            sb.append(", probeId=");
            sb.append(this.probeId);
        }
        if (this.internalTemp != null) {
            sb.append(", internalTemp=");
            sb.append(this.internalTemp);
        }
        if (this.ambientTemp != null) {
            sb.append(", ambientTemp=");
            sb.append(this.ambientTemp);
        }
        if (this.battery != null) {
            sb.append(", battery=");
            sb.append(this.battery);
        }
        if (this.signalLevel != null) {
            sb.append(", signalLevel=");
            sb.append(this.signalLevel);
        }
        if (this.chargingState != null) {
            sb.append(", chargingState=");
            sb.append(this.chargingState);
        }
        StringBuilder replace = sb.replace(0, 2, "ProbeTestMessage{");
        replace.append('}');
        return replace.toString();
    }

    public ProbeTestMessage(Integer num, Long l10, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Boolean bool, h hVar) {
        super(ADAPTER, hVar);
        this.meaterLinkIdentifier = num;
        this.probeSerialNum = l10;
        this.probeId = num2;
        this.internalTemp = num3;
        this.ambientTemp = num4;
        this.battery = num5;
        this.signalLevel = num6;
        this.chargingState = bool;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m347newBuilder() {
        Builder builder = new Builder();
        builder.meaterLinkIdentifier = this.meaterLinkIdentifier;
        builder.probeSerialNum = this.probeSerialNum;
        builder.probeId = this.probeId;
        builder.internalTemp = this.internalTemp;
        builder.ambientTemp = this.ambientTemp;
        builder.battery = this.battery;
        builder.signalLevel = this.signalLevel;
        builder.chargingState = this.chargingState;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
