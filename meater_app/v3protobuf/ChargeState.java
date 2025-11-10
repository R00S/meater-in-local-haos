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
public final class ChargeState extends Message<ChargeState, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer batteryLevelPercent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer batteryMinutesRemaining;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ChargingStatus#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final ChargingStatus chargingStatus;
    public static final ProtoAdapter<ChargeState> ADAPTER = new ProtoAdapter_ChargeState();
    public static final ChargingStatus DEFAULT_CHARGINGSTATUS = ChargingStatus.UNKNOWN;
    public static final Integer DEFAULT_BATTERYLEVELPERCENT = 0;
    public static final Integer DEFAULT_BATTERYMINUTESREMAINING = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<ChargeState, Builder> {
        public Integer batteryLevelPercent;
        public Integer batteryMinutesRemaining;
        public ChargingStatus chargingStatus;

        public Builder batteryLevelPercent(Integer num) {
            this.batteryLevelPercent = num;
            return this;
        }

        public Builder batteryMinutesRemaining(Integer num) {
            this.batteryMinutesRemaining = num;
            return this;
        }

        public Builder chargingStatus(ChargingStatus chargingStatus) {
            this.chargingStatus = chargingStatus;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public ChargeState m162build() {
            ChargingStatus chargingStatus = this.chargingStatus;
            if (chargingStatus != null && this.batteryLevelPercent != null && this.batteryMinutesRemaining != null) {
                return new ChargeState(this.chargingStatus, this.batteryLevelPercent, this.batteryMinutesRemaining, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{chargingStatus, "chargingStatus", this.batteryLevelPercent, "batteryLevelPercent", this.batteryMinutesRemaining, "batteryMinutesRemaining"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_ChargeState extends ProtoAdapter<ChargeState> {
        ProtoAdapter_ChargeState() {
            super(FieldEncoding.LENGTH_DELIMITED, ChargeState.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public ChargeState m163decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m162build();
                }
                if (nextTag == 1) {
                    try {
                        builder.chargingStatus((ChargingStatus) ChargingStatus.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                } else if (nextTag == 2) {
                    builder.batteryLevelPercent((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.batteryMinutesRemaining((Integer) ProtoAdapter.UINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, ChargeState chargeState) {
            ChargingStatus.ADAPTER.encodeWithTag(protoWriter, 1, chargeState.chargingStatus);
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 2, chargeState.batteryLevelPercent);
            protoAdapter.encodeWithTag(protoWriter, 3, chargeState.batteryMinutesRemaining);
            protoWriter.writeBytes(chargeState.unknownFields());
        }

        public int encodedSize(ChargeState chargeState) {
            int encodedSizeWithTag = ChargingStatus.ADAPTER.encodedSizeWithTag(1, chargeState.chargingStatus);
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            return encodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, chargeState.batteryLevelPercent) + protoAdapter.encodedSizeWithTag(3, chargeState.batteryMinutesRemaining) + chargeState.unknownFields().I();
        }

        public ChargeState redact(ChargeState chargeState) {
            Builder m161newBuilder = chargeState.m161newBuilder();
            m161newBuilder.clearUnknownFields();
            return m161newBuilder.m162build();
        }
    }

    public ChargeState(ChargingStatus chargingStatus, Integer num, Integer num2) {
        this(chargingStatus, num, num2, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChargeState)) {
            return false;
        }
        ChargeState chargeState = (ChargeState) obj;
        if (Internal.equals(unknownFields(), chargeState.unknownFields()) && Internal.equals(this.chargingStatus, chargeState.chargingStatus) && Internal.equals(this.batteryLevelPercent, chargeState.batteryLevelPercent) && Internal.equals(this.batteryMinutesRemaining, chargeState.batteryMinutesRemaining)) {
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
            ChargingStatus chargingStatus = this.chargingStatus;
            int i13 = 0;
            if (chargingStatus != null) {
                i10 = chargingStatus.hashCode();
            } else {
                i10 = 0;
            }
            int i14 = (hashCode + i10) * 37;
            Integer num = this.batteryLevelPercent;
            if (num != null) {
                i11 = num.hashCode();
            } else {
                i11 = 0;
            }
            int i15 = (i14 + i11) * 37;
            Integer num2 = this.batteryMinutesRemaining;
            if (num2 != null) {
                i13 = num2.hashCode();
            }
            int i16 = i15 + i13;
            ((Message) this).hashCode = i16;
            return i16;
        }
        return i12;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.chargingStatus != null) {
            sb.append(", chargingStatus=");
            sb.append(this.chargingStatus);
        }
        if (this.batteryLevelPercent != null) {
            sb.append(", batteryLevelPercent=");
            sb.append(this.batteryLevelPercent);
        }
        if (this.batteryMinutesRemaining != null) {
            sb.append(", batteryMinutesRemaining=");
            sb.append(this.batteryMinutesRemaining);
        }
        StringBuilder replace = sb.replace(0, 2, "ChargeState{");
        replace.append('}');
        return replace.toString();
    }

    public ChargeState(ChargingStatus chargingStatus, Integer num, Integer num2, h hVar) {
        super(ADAPTER, hVar);
        this.chargingStatus = chargingStatus;
        this.batteryLevelPercent = num;
        this.batteryMinutesRemaining = num2;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m161newBuilder() {
        Builder builder = new Builder();
        builder.chargingStatus = this.chargingStatus;
        builder.batteryLevelPercent = this.batteryLevelPercent;
        builder.batteryMinutesRemaining = this.batteryMinutesRemaining;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
