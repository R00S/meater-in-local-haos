package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.List;
import ql.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public final class MLBlock extends Message<MLBlock, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", tag = 2)
    public final Integer ambientTemperature;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", tag = 5)
    public final Integer batteryTemperature;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MLChildDevice#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<MLChildDevice> childProbes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", tag = 4)
    public final Long macAddress;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ChargeState#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public final List<ChargeState> probeChargingStates;
    public static final ProtoAdapter<MLBlock> ADAPTER = new ProtoAdapter_MLBlock();
    public static final Integer DEFAULT_AMBIENTTEMPERATURE = 0;
    public static final Long DEFAULT_MACADDRESS = 0L;
    public static final Integer DEFAULT_BATTERYTEMPERATURE = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MLBlock, Builder> {
        public Integer ambientTemperature;
        public Integer batteryTemperature;
        public Long macAddress;
        public List<MLChildDevice> childProbes = Internal.newMutableList();
        public List<ChargeState> probeChargingStates = Internal.newMutableList();

        public Builder ambientTemperature(Integer num) {
            this.ambientTemperature = num;
            return this;
        }

        public Builder batteryTemperature(Integer num) {
            this.batteryTemperature = num;
            return this;
        }

        public Builder childProbes(List<MLChildDevice> list) {
            Internal.checkElementsNotNull(list);
            this.childProbes = list;
            return this;
        }

        public Builder macAddress(Long l10) {
            this.macAddress = l10;
            return this;
        }

        public Builder probeChargingStates(List<ChargeState> list) {
            Internal.checkElementsNotNull(list);
            this.probeChargingStates = list;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MLBlock m252build() {
            return new MLBlock(this.childProbes, this.ambientTemperature, this.probeChargingStates, this.macAddress, this.batteryTemperature, buildUnknownFields());
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MLBlock extends ProtoAdapter<MLBlock> {
        ProtoAdapter_MLBlock() {
            super(FieldEncoding.LENGTH_DELIMITED, MLBlock.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MLBlock m253decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m252build();
                }
                if (nextTag == 1) {
                    builder.childProbes.add((MLChildDevice) MLChildDevice.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.ambientTemperature((Integer) ProtoAdapter.SINT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.probeChargingStates.add((ChargeState) ChargeState.ADAPTER.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.macAddress((Long) ProtoAdapter.FIXED64.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.batteryTemperature((Integer) ProtoAdapter.SINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MLBlock mLBlock) {
            if (mLBlock.childProbes != null) {
                MLChildDevice.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mLBlock.childProbes);
            }
            Integer num = mLBlock.ambientTemperature;
            if (num != null) {
                ProtoAdapter.SINT32.encodeWithTag(protoWriter, 2, num);
            }
            if (mLBlock.probeChargingStates != null) {
                ChargeState.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, mLBlock.probeChargingStates);
            }
            Long l10 = mLBlock.macAddress;
            if (l10 != null) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 4, l10);
            }
            Integer num2 = mLBlock.batteryTemperature;
            if (num2 != null) {
                ProtoAdapter.SINT32.encodeWithTag(protoWriter, 5, num2);
            }
            protoWriter.writeBytes(mLBlock.unknownFields());
        }

        public int encodedSize(MLBlock mLBlock) {
            int encodedSizeWithTag = MLChildDevice.ADAPTER.asRepeated().encodedSizeWithTag(1, mLBlock.childProbes);
            Integer num = mLBlock.ambientTemperature;
            int encodedSizeWithTag2 = encodedSizeWithTag + (num != null ? ProtoAdapter.SINT32.encodedSizeWithTag(2, num) : 0) + ChargeState.ADAPTER.asRepeated().encodedSizeWithTag(3, mLBlock.probeChargingStates);
            Long l10 = mLBlock.macAddress;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + (l10 != null ? ProtoAdapter.FIXED64.encodedSizeWithTag(4, l10) : 0);
            Integer num2 = mLBlock.batteryTemperature;
            return encodedSizeWithTag3 + (num2 != null ? ProtoAdapter.SINT32.encodedSizeWithTag(5, num2) : 0) + mLBlock.unknownFields().I();
        }

        public MLBlock redact(MLBlock mLBlock) {
            Builder m251newBuilder = mLBlock.m251newBuilder();
            Internal.redactElements(m251newBuilder.childProbes, MLChildDevice.ADAPTER);
            Internal.redactElements(m251newBuilder.probeChargingStates, ChargeState.ADAPTER);
            m251newBuilder.clearUnknownFields();
            return m251newBuilder.m252build();
        }
    }

    public MLBlock(List<MLChildDevice> list, Integer num, List<ChargeState> list2, Long l10, Integer num2) {
        this(list, num, list2, l10, num2, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MLBlock)) {
            return false;
        }
        MLBlock mLBlock = (MLBlock) obj;
        if (Internal.equals(unknownFields(), mLBlock.unknownFields()) && Internal.equals(this.childProbes, mLBlock.childProbes) && Internal.equals(this.ambientTemperature, mLBlock.ambientTemperature) && Internal.equals(this.probeChargingStates, mLBlock.probeChargingStates) && Internal.equals(this.macAddress, mLBlock.macAddress) && Internal.equals(this.batteryTemperature, mLBlock.batteryTemperature)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((Message) this).hashCode;
        if (i13 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            List<MLChildDevice> list = this.childProbes;
            int i14 = 1;
            if (list != null) {
                i10 = list.hashCode();
            } else {
                i10 = 1;
            }
            int i15 = (hashCode + i10) * 37;
            Integer num = this.ambientTemperature;
            int i16 = 0;
            if (num != null) {
                i11 = num.hashCode();
            } else {
                i11 = 0;
            }
            int i17 = (i15 + i11) * 37;
            List<ChargeState> list2 = this.probeChargingStates;
            if (list2 != null) {
                i14 = list2.hashCode();
            }
            int i18 = (i17 + i14) * 37;
            Long l10 = this.macAddress;
            if (l10 != null) {
                i12 = l10.hashCode();
            } else {
                i12 = 0;
            }
            int i19 = (i18 + i12) * 37;
            Integer num2 = this.batteryTemperature;
            if (num2 != null) {
                i16 = num2.hashCode();
            }
            int i20 = i19 + i16;
            ((Message) this).hashCode = i20;
            return i20;
        }
        return i13;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.childProbes != null) {
            sb.append(", childProbes=");
            sb.append(this.childProbes);
        }
        if (this.ambientTemperature != null) {
            sb.append(", ambientTemperature=");
            sb.append(this.ambientTemperature);
        }
        if (this.probeChargingStates != null) {
            sb.append(", probeChargingStates=");
            sb.append(this.probeChargingStates);
        }
        if (this.macAddress != null) {
            sb.append(", macAddress=");
            sb.append(this.macAddress);
        }
        if (this.batteryTemperature != null) {
            sb.append(", batteryTemperature=");
            sb.append(this.batteryTemperature);
        }
        StringBuilder replace = sb.replace(0, 2, "MLBlock{");
        replace.append('}');
        return replace.toString();
    }

    public MLBlock(List<MLChildDevice> list, Integer num, List<ChargeState> list2, Long l10, Integer num2, h hVar) {
        super(ADAPTER, hVar);
        this.childProbes = Internal.immutableCopyOf("childProbes", list);
        this.ambientTemperature = num;
        this.probeChargingStates = Internal.immutableCopyOf("probeChargingStates", list2);
        this.macAddress = l10;
        this.batteryTemperature = num2;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m251newBuilder() {
        Builder builder = new Builder();
        builder.childProbes = Internal.copyOf("childProbes", this.childProbes);
        builder.ambientTemperature = this.ambientTemperature;
        builder.probeChargingStates = Internal.copyOf("probeChargingStates", this.probeChargingStates);
        builder.macAddress = this.macAddress;
        builder.batteryTemperature = this.batteryTemperature;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
