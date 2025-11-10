package com.apptionlabs.meater_app.v1protobuf;

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
public final class V1ProbeSetup extends Message<V1ProbeSetup, Builder> {
    public static final String DEFAULT_COOKNAME = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1CookType#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final V1CookType cook;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = 9)
    public final Long cookID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String cookName;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1ProbeCookState#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final V1ProbeCookState cookState;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1CutType#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    public final V1CutType cutType;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1MeatType#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final V1MeatType meatType;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1ProbeAlarm#ADAPTER", label = WireField.Label.REPEATED, tag = 8)
    public final List<V1ProbeAlarm> probeAlarms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer setupSeqNum;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer targetTemperature;
    public static final ProtoAdapter<V1ProbeSetup> ADAPTER = new ProtoAdapter_LegacyProbeSetup();
    public static final Integer DEFAULT_SETUPSEQNUM = 0;
    public static final V1ProbeCookState DEFAULT_COOKSTATE = V1ProbeCookState.COOK_STATE_NOT_STARTED;
    public static final Integer DEFAULT_TARGETTEMPERATURE = 0;
    public static final V1MeatType DEFAULT_MEATTYPE = V1MeatType.LAMB;
    public static final V1CutType DEFAULT_CUTTYPE = V1CutType.LOIN;
    public static final V1CookType DEFAULT_COOK = V1CookType.RARE;
    public static final Long DEFAULT_COOKID = 0L;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V1ProbeSetup, Builder> {
        public V1CookType cook;
        public Long cookID;
        public String cookName;
        public V1ProbeCookState cookState;
        public V1CutType cutType;
        public V1MeatType meatType;
        public List<V1ProbeAlarm> probeAlarms = Internal.newMutableList();
        public Integer setupSeqNum;
        public Integer targetTemperature;

        public Builder cook(V1CookType v1CookType) {
            this.cook = v1CookType;
            return this;
        }

        public Builder cookID(Long l10) {
            this.cookID = l10;
            return this;
        }

        public Builder cookName(String str) {
            this.cookName = str;
            return this;
        }

        public Builder cookState(V1ProbeCookState v1ProbeCookState) {
            this.cookState = v1ProbeCookState;
            return this;
        }

        public Builder cutType(V1CutType v1CutType) {
            this.cutType = v1CutType;
            return this;
        }

        public Builder meatType(V1MeatType v1MeatType) {
            this.meatType = v1MeatType;
            return this;
        }

        public Builder probeAlarms(List<V1ProbeAlarm> list) {
            Internal.checkElementsNotNull(list);
            this.probeAlarms = list;
            return this;
        }

        public Builder setupSeqNum(Integer num) {
            this.setupSeqNum = num;
            return this;
        }

        public Builder targetTemperature(Integer num) {
            this.targetTemperature = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V1ProbeSetup m27build() {
            Integer num = this.setupSeqNum;
            if (num != null && this.cookState != null && this.targetTemperature != null && this.meatType != null && this.cutType != null && this.cook != null) {
                return new V1ProbeSetup(this.setupSeqNum, this.cookState, this.targetTemperature, this.meatType, this.cutType, this.cook, this.cookName, this.probeAlarms, this.cookID, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "setupSeqNum", this.cookState, "cookState", this.targetTemperature, "targetTemperature", this.meatType, "meatType", this.cutType, "cutType", this.cook, "cook"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_LegacyProbeSetup extends ProtoAdapter<V1ProbeSetup> {
        ProtoAdapter_LegacyProbeSetup() {
            super(FieldEncoding.LENGTH_DELIMITED, V1ProbeSetup.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V1ProbeSetup m28decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.setupSeqNum((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 2:
                            try {
                                builder.cookState((V1ProbeCookState) V1ProbeCookState.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        case 3:
                            builder.targetTemperature((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 4:
                            try {
                                builder.meatType((V1MeatType) V1MeatType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e11.value));
                                break;
                            }
                        case 5:
                            try {
                                builder.cutType((V1CutType) V1CutType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e12.value));
                                break;
                            }
                        case 6:
                            try {
                                builder.cook((V1CookType) V1CookType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e13.value));
                                break;
                            }
                        case 7:
                            builder.cookName((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.probeAlarms.add((V1ProbeAlarm) V1ProbeAlarm.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            builder.cookID((Long) ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m27build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V1ProbeSetup v1ProbeSetup) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, v1ProbeSetup.setupSeqNum);
            V1ProbeCookState.ADAPTER.encodeWithTag(protoWriter, 2, v1ProbeSetup.cookState);
            protoAdapter.encodeWithTag(protoWriter, 3, v1ProbeSetup.targetTemperature);
            V1MeatType.ADAPTER.encodeWithTag(protoWriter, 4, v1ProbeSetup.meatType);
            V1CutType.ADAPTER.encodeWithTag(protoWriter, 5, v1ProbeSetup.cutType);
            V1CookType.ADAPTER.encodeWithTag(protoWriter, 6, v1ProbeSetup.cook);
            String str = v1ProbeSetup.cookName;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, str);
            }
            if (v1ProbeSetup.probeAlarms != null) {
                V1ProbeAlarm.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, v1ProbeSetup.probeAlarms);
            }
            Long l10 = v1ProbeSetup.cookID;
            if (l10 != null) {
                ProtoAdapter.UINT64.encodeWithTag(protoWriter, 9, l10);
            }
            protoWriter.writeBytes(v1ProbeSetup.unknownFields());
        }

        public int encodedSize(V1ProbeSetup v1ProbeSetup) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, v1ProbeSetup.setupSeqNum) + V1ProbeCookState.ADAPTER.encodedSizeWithTag(2, v1ProbeSetup.cookState) + protoAdapter.encodedSizeWithTag(3, v1ProbeSetup.targetTemperature) + V1MeatType.ADAPTER.encodedSizeWithTag(4, v1ProbeSetup.meatType) + V1CutType.ADAPTER.encodedSizeWithTag(5, v1ProbeSetup.cutType) + V1CookType.ADAPTER.encodedSizeWithTag(6, v1ProbeSetup.cook);
            String str = v1ProbeSetup.cookName;
            int encodedSizeWithTag2 = encodedSizeWithTag + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, str) : 0) + V1ProbeAlarm.ADAPTER.asRepeated().encodedSizeWithTag(8, v1ProbeSetup.probeAlarms);
            Long l10 = v1ProbeSetup.cookID;
            return encodedSizeWithTag2 + (l10 != null ? ProtoAdapter.UINT64.encodedSizeWithTag(9, l10) : 0) + v1ProbeSetup.unknownFields().I();
        }

        public V1ProbeSetup redact(V1ProbeSetup v1ProbeSetup) {
            Builder m26newBuilder = v1ProbeSetup.m26newBuilder();
            Internal.redactElements(m26newBuilder.probeAlarms, V1ProbeAlarm.ADAPTER);
            m26newBuilder.clearUnknownFields();
            return m26newBuilder.m27build();
        }
    }

    public V1ProbeSetup(Integer num, V1ProbeCookState v1ProbeCookState, Integer num2, V1MeatType v1MeatType, V1CutType v1CutType, V1CookType v1CookType, String str, List<V1ProbeAlarm> list, Long l10) {
        this(num, v1ProbeCookState, num2, v1MeatType, v1CutType, v1CookType, str, list, l10, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1ProbeSetup)) {
            return false;
        }
        V1ProbeSetup v1ProbeSetup = (V1ProbeSetup) obj;
        if (Internal.equals(unknownFields(), v1ProbeSetup.unknownFields()) && Internal.equals(this.setupSeqNum, v1ProbeSetup.setupSeqNum) && Internal.equals(this.cookState, v1ProbeSetup.cookState) && Internal.equals(this.targetTemperature, v1ProbeSetup.targetTemperature) && Internal.equals(this.meatType, v1ProbeSetup.meatType) && Internal.equals(this.cutType, v1ProbeSetup.cutType) && Internal.equals(this.cook, v1ProbeSetup.cook) && Internal.equals(this.cookName, v1ProbeSetup.cookName) && Internal.equals(this.probeAlarms, v1ProbeSetup.probeAlarms) && Internal.equals(this.cookID, v1ProbeSetup.cookID)) {
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
            Integer num = this.setupSeqNum;
            int i19 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i20 = (hashCode + i10) * 37;
            V1ProbeCookState v1ProbeCookState = this.cookState;
            if (v1ProbeCookState != null) {
                i11 = v1ProbeCookState.hashCode();
            } else {
                i11 = 0;
            }
            int i21 = (i20 + i11) * 37;
            Integer num2 = this.targetTemperature;
            if (num2 != null) {
                i12 = num2.hashCode();
            } else {
                i12 = 0;
            }
            int i22 = (i21 + i12) * 37;
            V1MeatType v1MeatType = this.meatType;
            if (v1MeatType != null) {
                i13 = v1MeatType.hashCode();
            } else {
                i13 = 0;
            }
            int i23 = (i22 + i13) * 37;
            V1CutType v1CutType = this.cutType;
            if (v1CutType != null) {
                i14 = v1CutType.hashCode();
            } else {
                i14 = 0;
            }
            int i24 = (i23 + i14) * 37;
            V1CookType v1CookType = this.cook;
            if (v1CookType != null) {
                i15 = v1CookType.hashCode();
            } else {
                i15 = 0;
            }
            int i25 = (i24 + i15) * 37;
            String str = this.cookName;
            if (str != null) {
                i16 = str.hashCode();
            } else {
                i16 = 0;
            }
            int i26 = (i25 + i16) * 37;
            List<V1ProbeAlarm> list = this.probeAlarms;
            if (list != null) {
                i17 = list.hashCode();
            } else {
                i17 = 1;
            }
            int i27 = (i26 + i17) * 37;
            Long l10 = this.cookID;
            if (l10 != null) {
                i19 = l10.hashCode();
            }
            int i28 = i27 + i19;
            ((Message) this).hashCode = i28;
            return i28;
        }
        return i18;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.setupSeqNum != null) {
            sb.append(", setupSeqNum=");
            sb.append(this.setupSeqNum);
        }
        if (this.cookState != null) {
            sb.append(", cookState=");
            sb.append(this.cookState);
        }
        if (this.targetTemperature != null) {
            sb.append(", targetTemperature=");
            sb.append(this.targetTemperature);
        }
        if (this.meatType != null) {
            sb.append(", meatType=");
            sb.append(this.meatType);
        }
        if (this.cutType != null) {
            sb.append(", cutType=");
            sb.append(this.cutType);
        }
        if (this.cook != null) {
            sb.append(", cook=");
            sb.append(this.cook);
        }
        if (this.cookName != null) {
            sb.append(", cookName=");
            sb.append(this.cookName);
        }
        if (this.probeAlarms != null) {
            sb.append(", probeAlarms=");
            sb.append(this.probeAlarms);
        }
        if (this.cookID != null) {
            sb.append(", cookID=");
            sb.append(this.cookID);
        }
        StringBuilder replace = sb.replace(0, 2, "V1ProbeSetup{");
        replace.append('}');
        return replace.toString();
    }

    public V1ProbeSetup(Integer num, V1ProbeCookState v1ProbeCookState, Integer num2, V1MeatType v1MeatType, V1CutType v1CutType, V1CookType v1CookType, String str, List<V1ProbeAlarm> list, Long l10, h hVar) {
        super(ADAPTER, hVar);
        this.setupSeqNum = num;
        this.cookState = v1ProbeCookState;
        this.targetTemperature = num2;
        this.meatType = v1MeatType;
        this.cutType = v1CutType;
        this.cook = v1CookType;
        this.cookName = str;
        this.probeAlarms = Internal.immutableCopyOf("probeAlarms", list);
        this.cookID = l10;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m26newBuilder() {
        Builder builder = new Builder();
        builder.setupSeqNum = this.setupSeqNum;
        builder.cookState = this.cookState;
        builder.targetTemperature = this.targetTemperature;
        builder.meatType = this.meatType;
        builder.cutType = this.cutType;
        builder.cook = this.cook;
        builder.cookName = this.cookName;
        builder.probeAlarms = Internal.copyOf("probeAlarms", this.probeAlarms);
        builder.cookID = this.cookID;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
