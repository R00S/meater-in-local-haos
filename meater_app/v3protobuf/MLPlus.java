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
public final class MLPlus extends Message<MLPlus, Builder> {
    public static final ProtoAdapter<MLPlus> ADAPTER = new ProtoAdapter_MLPlus();
    public static final Integer DEFAULT_AMBIENTTEMPERATURE = 0;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", tag = 3)
    public final Integer ambientTemperature;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MLChildDevice#ADAPTER", tag = 1)
    public final MLChildDevice childProbe;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ChargeState#ADAPTER", tag = 2)
    public final ChargeState probeChargingState;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MLPlus, Builder> {
        public Integer ambientTemperature;
        public MLChildDevice childProbe;
        public ChargeState probeChargingState;

        public Builder ambientTemperature(Integer num) {
            this.ambientTemperature = num;
            return this;
        }

        public Builder childProbe(MLChildDevice mLChildDevice) {
            this.childProbe = mLChildDevice;
            return this;
        }

        public Builder probeChargingState(ChargeState chargeState) {
            this.probeChargingState = chargeState;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MLPlus m261build() {
            return new MLPlus(this.childProbe, this.probeChargingState, this.ambientTemperature, buildUnknownFields());
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MLPlus extends ProtoAdapter<MLPlus> {
        ProtoAdapter_MLPlus() {
            super(FieldEncoding.LENGTH_DELIMITED, MLPlus.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MLPlus m262decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m261build();
                }
                if (nextTag == 1) {
                    builder.childProbe((MLChildDevice) MLChildDevice.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.probeChargingState((ChargeState) ChargeState.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.ambientTemperature((Integer) ProtoAdapter.SINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MLPlus mLPlus) {
            MLChildDevice mLChildDevice = mLPlus.childProbe;
            if (mLChildDevice != null) {
                MLChildDevice.ADAPTER.encodeWithTag(protoWriter, 1, mLChildDevice);
            }
            ChargeState chargeState = mLPlus.probeChargingState;
            if (chargeState != null) {
                ChargeState.ADAPTER.encodeWithTag(protoWriter, 2, chargeState);
            }
            Integer num = mLPlus.ambientTemperature;
            if (num != null) {
                ProtoAdapter.SINT32.encodeWithTag(protoWriter, 3, num);
            }
            protoWriter.writeBytes(mLPlus.unknownFields());
        }

        public int encodedSize(MLPlus mLPlus) {
            MLChildDevice mLChildDevice = mLPlus.childProbe;
            int encodedSizeWithTag = mLChildDevice != null ? MLChildDevice.ADAPTER.encodedSizeWithTag(1, mLChildDevice) : 0;
            ChargeState chargeState = mLPlus.probeChargingState;
            int encodedSizeWithTag2 = encodedSizeWithTag + (chargeState != null ? ChargeState.ADAPTER.encodedSizeWithTag(2, chargeState) : 0);
            Integer num = mLPlus.ambientTemperature;
            return encodedSizeWithTag2 + (num != null ? ProtoAdapter.SINT32.encodedSizeWithTag(3, num) : 0) + mLPlus.unknownFields().I();
        }

        public MLPlus redact(MLPlus mLPlus) {
            Builder m260newBuilder = mLPlus.m260newBuilder();
            MLChildDevice mLChildDevice = m260newBuilder.childProbe;
            if (mLChildDevice != null) {
                m260newBuilder.childProbe = (MLChildDevice) MLChildDevice.ADAPTER.redact(mLChildDevice);
            }
            ChargeState chargeState = m260newBuilder.probeChargingState;
            if (chargeState != null) {
                m260newBuilder.probeChargingState = (ChargeState) ChargeState.ADAPTER.redact(chargeState);
            }
            m260newBuilder.clearUnknownFields();
            return m260newBuilder.m261build();
        }
    }

    public MLPlus(MLChildDevice mLChildDevice, ChargeState chargeState, Integer num) {
        this(mLChildDevice, chargeState, num, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MLPlus)) {
            return false;
        }
        MLPlus mLPlus = (MLPlus) obj;
        if (Internal.equals(unknownFields(), mLPlus.unknownFields()) && Internal.equals(this.childProbe, mLPlus.childProbe) && Internal.equals(this.probeChargingState, mLPlus.probeChargingState) && Internal.equals(this.ambientTemperature, mLPlus.ambientTemperature)) {
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
            MLChildDevice mLChildDevice = this.childProbe;
            int i13 = 0;
            if (mLChildDevice != null) {
                i10 = mLChildDevice.hashCode();
            } else {
                i10 = 0;
            }
            int i14 = (hashCode + i10) * 37;
            ChargeState chargeState = this.probeChargingState;
            if (chargeState != null) {
                i11 = chargeState.hashCode();
            } else {
                i11 = 0;
            }
            int i15 = (i14 + i11) * 37;
            Integer num = this.ambientTemperature;
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
        if (this.childProbe != null) {
            sb.append(", childProbe=");
            sb.append(this.childProbe);
        }
        if (this.probeChargingState != null) {
            sb.append(", probeChargingState=");
            sb.append(this.probeChargingState);
        }
        if (this.ambientTemperature != null) {
            sb.append(", ambientTemperature=");
            sb.append(this.ambientTemperature);
        }
        StringBuilder replace = sb.replace(0, 2, "MLPlus{");
        replace.append('}');
        return replace.toString();
    }

    public MLPlus(MLChildDevice mLChildDevice, ChargeState chargeState, Integer num, h hVar) {
        super(ADAPTER, hVar);
        this.childProbe = mLChildDevice;
        this.probeChargingState = chargeState;
        this.ambientTemperature = num;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m260newBuilder() {
        Builder builder = new Builder();
        builder.childProbe = this.childProbe;
        builder.probeChargingState = this.probeChargingState;
        builder.ambientTemperature = this.ambientTemperature;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
