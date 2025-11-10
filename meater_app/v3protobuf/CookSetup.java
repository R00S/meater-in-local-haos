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
public final class CookSetup extends Message<CookSetup, Builder> {
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.Alarm#ADAPTER", label = WireField.Label.REPEATED, tag = 10)
    public final List<Alarm> alarms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 11)
    public final Integer clipNumber;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", tag = 12)
    public final Long cookID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 5)
    public final Integer cutID;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.EstimatorConfig#ADAPTER", tag = 8)
    public final EstimatorConfig estimatorConfig;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.AlarmState#ADAPTER", tag = 15)
    public final AlarmState flareUpAlert;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 99)
    public final Integer lastItem;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", tag = 7)
    public final Long ongoingRecipeID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 6)
    public final Integer presetID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 13)
    public final Integer recipeID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 14)
    public final Integer recipeStepID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer sequenceNumber;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.DeviceCookState#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final DeviceCookState state;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.TemperatureRange#ADAPTER", tag = 4)
    public final TemperatureRange targetAmbientTemperature;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer targetInternalTemperature;
    public static final ProtoAdapter<CookSetup> ADAPTER = new ProtoAdapter_CookSetup();
    public static final Integer DEFAULT_SEQUENCENUMBER = 0;
    public static final DeviceCookState DEFAULT_STATE = DeviceCookState.COOK_STATE_NOT_STARTED;
    public static final Integer DEFAULT_TARGETINTERNALTEMPERATURE = 0;
    public static final Integer DEFAULT_CUTID = 0;
    public static final Integer DEFAULT_PRESETID = 0;
    public static final Long DEFAULT_ONGOINGRECIPEID = 0L;
    public static final Integer DEFAULT_CLIPNUMBER = 0;
    public static final Long DEFAULT_COOKID = 0L;
    public static final Integer DEFAULT_RECIPEID = 0;
    public static final Integer DEFAULT_RECIPESTEPID = 0;
    public static final AlarmState DEFAULT_FLAREUPALERT = AlarmState.ALARM_STATE_NOT_READY;
    public static final Integer DEFAULT_LASTITEM = 96;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<CookSetup, Builder> {
        public List<Alarm> alarms = Internal.newMutableList();
        public Integer clipNumber;
        public Long cookID;
        public Integer cutID;
        public EstimatorConfig estimatorConfig;
        public AlarmState flareUpAlert;
        public Integer lastItem;
        public String name;
        public Long ongoingRecipeID;
        public Integer presetID;
        public Integer recipeID;
        public Integer recipeStepID;
        public Integer sequenceNumber;
        public DeviceCookState state;
        public TemperatureRange targetAmbientTemperature;
        public Integer targetInternalTemperature;

        public Builder alarms(List<Alarm> list) {
            Internal.checkElementsNotNull(list);
            this.alarms = list;
            return this;
        }

        public Builder clipNumber(Integer num) {
            this.clipNumber = num;
            return this;
        }

        public Builder cookID(Long l10) {
            this.cookID = l10;
            return this;
        }

        public Builder cutID(Integer num) {
            this.cutID = num;
            return this;
        }

        public Builder estimatorConfig(EstimatorConfig estimatorConfig) {
            this.estimatorConfig = estimatorConfig;
            return this;
        }

        public Builder flareUpAlert(AlarmState alarmState) {
            this.flareUpAlert = alarmState;
            return this;
        }

        public Builder lastItem(Integer num) {
            this.lastItem = num;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder ongoingRecipeID(Long l10) {
            this.ongoingRecipeID = l10;
            return this;
        }

        public Builder presetID(Integer num) {
            this.presetID = num;
            return this;
        }

        public Builder recipeID(Integer num) {
            this.recipeID = num;
            return this;
        }

        public Builder recipeStepID(Integer num) {
            this.recipeStepID = num;
            return this;
        }

        public Builder sequenceNumber(Integer num) {
            this.sequenceNumber = num;
            return this;
        }

        public Builder state(DeviceCookState deviceCookState) {
            this.state = deviceCookState;
            return this;
        }

        public Builder targetAmbientTemperature(TemperatureRange temperatureRange) {
            this.targetAmbientTemperature = temperatureRange;
            return this;
        }

        public Builder targetInternalTemperature(Integer num) {
            this.targetInternalTemperature = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public CookSetup m168build() {
            Integer num = this.sequenceNumber;
            if (num != null && this.state != null && this.targetInternalTemperature != null && this.lastItem != null) {
                return new CookSetup(this.sequenceNumber, this.state, this.targetInternalTemperature, this.targetAmbientTemperature, this.cutID, this.presetID, this.ongoingRecipeID, this.estimatorConfig, this.name, this.alarms, this.clipNumber, this.cookID, this.recipeID, this.recipeStepID, this.flareUpAlert, this.lastItem, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "sequenceNumber", this.state, "state", this.targetInternalTemperature, "targetInternalTemperature", this.lastItem, "lastItem"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_CookSetup extends ProtoAdapter<CookSetup> {
        ProtoAdapter_CookSetup() {
            super(FieldEncoding.LENGTH_DELIMITED, CookSetup.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public CookSetup m169decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m168build();
                }
                if (nextTag != 99) {
                    switch (nextTag) {
                        case 1:
                            builder.sequenceNumber((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 2:
                            try {
                                builder.state((DeviceCookState) DeviceCookState.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        case 3:
                            builder.targetInternalTemperature((Integer) ProtoAdapter.SINT32.decode(protoReader));
                            break;
                        case 4:
                            builder.targetAmbientTemperature((TemperatureRange) TemperatureRange.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.cutID((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 6:
                            builder.presetID((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 7:
                            builder.ongoingRecipeID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                            break;
                        case 8:
                            builder.estimatorConfig((EstimatorConfig) EstimatorConfig.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            builder.name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            builder.alarms.add((Alarm) Alarm.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            builder.clipNumber((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 12:
                            builder.cookID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                            break;
                        case 13:
                            builder.recipeID((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 14:
                            builder.recipeStepID((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 15:
                            try {
                                builder.flareUpAlert((AlarmState) AlarmState.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e11.value));
                                break;
                            }
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    builder.lastItem((Integer) ProtoAdapter.UINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, CookSetup cookSetup) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, cookSetup.sequenceNumber);
            DeviceCookState.ADAPTER.encodeWithTag(protoWriter, 2, cookSetup.state);
            ProtoAdapter.SINT32.encodeWithTag(protoWriter, 3, cookSetup.targetInternalTemperature);
            TemperatureRange temperatureRange = cookSetup.targetAmbientTemperature;
            if (temperatureRange != null) {
                TemperatureRange.ADAPTER.encodeWithTag(protoWriter, 4, temperatureRange);
            }
            Integer num = cookSetup.cutID;
            if (num != null) {
                protoAdapter.encodeWithTag(protoWriter, 5, num);
            }
            Integer num2 = cookSetup.presetID;
            if (num2 != null) {
                protoAdapter.encodeWithTag(protoWriter, 6, num2);
            }
            Long l10 = cookSetup.ongoingRecipeID;
            if (l10 != null) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 7, l10);
            }
            EstimatorConfig estimatorConfig = cookSetup.estimatorConfig;
            if (estimatorConfig != null) {
                EstimatorConfig.ADAPTER.encodeWithTag(protoWriter, 8, estimatorConfig);
            }
            String str = cookSetup.name;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, str);
            }
            if (cookSetup.alarms != null) {
                Alarm.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, cookSetup.alarms);
            }
            Integer num3 = cookSetup.clipNumber;
            if (num3 != null) {
                protoAdapter.encodeWithTag(protoWriter, 11, num3);
            }
            Long l11 = cookSetup.cookID;
            if (l11 != null) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 12, l11);
            }
            Integer num4 = cookSetup.recipeID;
            if (num4 != null) {
                protoAdapter.encodeWithTag(protoWriter, 13, num4);
            }
            Integer num5 = cookSetup.recipeStepID;
            if (num5 != null) {
                protoAdapter.encodeWithTag(protoWriter, 14, num5);
            }
            AlarmState alarmState = cookSetup.flareUpAlert;
            if (alarmState != null) {
                AlarmState.ADAPTER.encodeWithTag(protoWriter, 15, alarmState);
            }
            protoAdapter.encodeWithTag(protoWriter, 99, cookSetup.lastItem);
            protoWriter.writeBytes(cookSetup.unknownFields());
        }

        public int encodedSize(CookSetup cookSetup) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, cookSetup.sequenceNumber) + DeviceCookState.ADAPTER.encodedSizeWithTag(2, cookSetup.state) + ProtoAdapter.SINT32.encodedSizeWithTag(3, cookSetup.targetInternalTemperature);
            TemperatureRange temperatureRange = cookSetup.targetAmbientTemperature;
            int encodedSizeWithTag2 = encodedSizeWithTag + (temperatureRange != null ? TemperatureRange.ADAPTER.encodedSizeWithTag(4, temperatureRange) : 0);
            Integer num = cookSetup.cutID;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + (num != null ? protoAdapter.encodedSizeWithTag(5, num) : 0);
            Integer num2 = cookSetup.presetID;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + (num2 != null ? protoAdapter.encodedSizeWithTag(6, num2) : 0);
            Long l10 = cookSetup.ongoingRecipeID;
            int encodedSizeWithTag5 = encodedSizeWithTag4 + (l10 != null ? ProtoAdapter.FIXED64.encodedSizeWithTag(7, l10) : 0);
            EstimatorConfig estimatorConfig = cookSetup.estimatorConfig;
            int encodedSizeWithTag6 = encodedSizeWithTag5 + (estimatorConfig != null ? EstimatorConfig.ADAPTER.encodedSizeWithTag(8, estimatorConfig) : 0);
            String str = cookSetup.name;
            int encodedSizeWithTag7 = encodedSizeWithTag6 + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(9, str) : 0) + Alarm.ADAPTER.asRepeated().encodedSizeWithTag(10, cookSetup.alarms);
            Integer num3 = cookSetup.clipNumber;
            int encodedSizeWithTag8 = encodedSizeWithTag7 + (num3 != null ? protoAdapter.encodedSizeWithTag(11, num3) : 0);
            Long l11 = cookSetup.cookID;
            int encodedSizeWithTag9 = encodedSizeWithTag8 + (l11 != null ? ProtoAdapter.FIXED64.encodedSizeWithTag(12, l11) : 0);
            Integer num4 = cookSetup.recipeID;
            int encodedSizeWithTag10 = encodedSizeWithTag9 + (num4 != null ? protoAdapter.encodedSizeWithTag(13, num4) : 0);
            Integer num5 = cookSetup.recipeStepID;
            int encodedSizeWithTag11 = encodedSizeWithTag10 + (num5 != null ? protoAdapter.encodedSizeWithTag(14, num5) : 0);
            AlarmState alarmState = cookSetup.flareUpAlert;
            return encodedSizeWithTag11 + (alarmState != null ? AlarmState.ADAPTER.encodedSizeWithTag(15, alarmState) : 0) + protoAdapter.encodedSizeWithTag(99, cookSetup.lastItem) + cookSetup.unknownFields().I();
        }

        public CookSetup redact(CookSetup cookSetup) {
            Builder m167newBuilder = cookSetup.m167newBuilder();
            TemperatureRange temperatureRange = m167newBuilder.targetAmbientTemperature;
            if (temperatureRange != null) {
                m167newBuilder.targetAmbientTemperature = (TemperatureRange) TemperatureRange.ADAPTER.redact(temperatureRange);
            }
            EstimatorConfig estimatorConfig = m167newBuilder.estimatorConfig;
            if (estimatorConfig != null) {
                m167newBuilder.estimatorConfig = (EstimatorConfig) EstimatorConfig.ADAPTER.redact(estimatorConfig);
            }
            Internal.redactElements(m167newBuilder.alarms, Alarm.ADAPTER);
            m167newBuilder.clearUnknownFields();
            return m167newBuilder.m168build();
        }
    }

    public CookSetup(Integer num, DeviceCookState deviceCookState, Integer num2, TemperatureRange temperatureRange, Integer num3, Integer num4, Long l10, EstimatorConfig estimatorConfig, String str, List<Alarm> list, Integer num5, Long l11, Integer num6, Integer num7, AlarmState alarmState, Integer num8) {
        this(num, deviceCookState, num2, temperatureRange, num3, num4, l10, estimatorConfig, str, list, num5, l11, num6, num7, alarmState, num8, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CookSetup)) {
            return false;
        }
        CookSetup cookSetup = (CookSetup) obj;
        if (Internal.equals(unknownFields(), cookSetup.unknownFields()) && Internal.equals(this.sequenceNumber, cookSetup.sequenceNumber) && Internal.equals(this.state, cookSetup.state) && Internal.equals(this.targetInternalTemperature, cookSetup.targetInternalTemperature) && Internal.equals(this.targetAmbientTemperature, cookSetup.targetAmbientTemperature) && Internal.equals(this.cutID, cookSetup.cutID) && Internal.equals(this.presetID, cookSetup.presetID) && Internal.equals(this.ongoingRecipeID, cookSetup.ongoingRecipeID) && Internal.equals(this.estimatorConfig, cookSetup.estimatorConfig) && Internal.equals(this.name, cookSetup.name) && Internal.equals(this.alarms, cookSetup.alarms) && Internal.equals(this.clipNumber, cookSetup.clipNumber) && Internal.equals(this.cookID, cookSetup.cookID) && Internal.equals(this.recipeID, cookSetup.recipeID) && Internal.equals(this.recipeStepID, cookSetup.recipeStepID) && Internal.equals(this.flareUpAlert, cookSetup.flareUpAlert) && Internal.equals(this.lastItem, cookSetup.lastItem)) {
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
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25 = ((Message) this).hashCode;
        if (i25 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.sequenceNumber;
            int i26 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i27 = (hashCode + i10) * 37;
            DeviceCookState deviceCookState = this.state;
            if (deviceCookState != null) {
                i11 = deviceCookState.hashCode();
            } else {
                i11 = 0;
            }
            int i28 = (i27 + i11) * 37;
            Integer num2 = this.targetInternalTemperature;
            if (num2 != null) {
                i12 = num2.hashCode();
            } else {
                i12 = 0;
            }
            int i29 = (i28 + i12) * 37;
            TemperatureRange temperatureRange = this.targetAmbientTemperature;
            if (temperatureRange != null) {
                i13 = temperatureRange.hashCode();
            } else {
                i13 = 0;
            }
            int i30 = (i29 + i13) * 37;
            Integer num3 = this.cutID;
            if (num3 != null) {
                i14 = num3.hashCode();
            } else {
                i14 = 0;
            }
            int i31 = (i30 + i14) * 37;
            Integer num4 = this.presetID;
            if (num4 != null) {
                i15 = num4.hashCode();
            } else {
                i15 = 0;
            }
            int i32 = (i31 + i15) * 37;
            Long l10 = this.ongoingRecipeID;
            if (l10 != null) {
                i16 = l10.hashCode();
            } else {
                i16 = 0;
            }
            int i33 = (i32 + i16) * 37;
            EstimatorConfig estimatorConfig = this.estimatorConfig;
            if (estimatorConfig != null) {
                i17 = estimatorConfig.hashCode();
            } else {
                i17 = 0;
            }
            int i34 = (i33 + i17) * 37;
            String str = this.name;
            if (str != null) {
                i18 = str.hashCode();
            } else {
                i18 = 0;
            }
            int i35 = (i34 + i18) * 37;
            List<Alarm> list = this.alarms;
            if (list != null) {
                i19 = list.hashCode();
            } else {
                i19 = 1;
            }
            int i36 = (i35 + i19) * 37;
            Integer num5 = this.clipNumber;
            if (num5 != null) {
                i20 = num5.hashCode();
            } else {
                i20 = 0;
            }
            int i37 = (i36 + i20) * 37;
            Long l11 = this.cookID;
            if (l11 != null) {
                i21 = l11.hashCode();
            } else {
                i21 = 0;
            }
            int i38 = (i37 + i21) * 37;
            Integer num6 = this.recipeID;
            if (num6 != null) {
                i22 = num6.hashCode();
            } else {
                i22 = 0;
            }
            int i39 = (i38 + i22) * 37;
            Integer num7 = this.recipeStepID;
            if (num7 != null) {
                i23 = num7.hashCode();
            } else {
                i23 = 0;
            }
            int i40 = (i39 + i23) * 37;
            AlarmState alarmState = this.flareUpAlert;
            if (alarmState != null) {
                i24 = alarmState.hashCode();
            } else {
                i24 = 0;
            }
            int i41 = (i40 + i24) * 37;
            Integer num8 = this.lastItem;
            if (num8 != null) {
                i26 = num8.hashCode();
            }
            int i42 = i41 + i26;
            ((Message) this).hashCode = i42;
            return i42;
        }
        return i25;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sequenceNumber != null) {
            sb.append(", sequenceNumber=");
            sb.append(this.sequenceNumber);
        }
        if (this.state != null) {
            sb.append(", state=");
            sb.append(this.state);
        }
        if (this.targetInternalTemperature != null) {
            sb.append(", targetInternalTemperature=");
            sb.append(this.targetInternalTemperature);
        }
        if (this.targetAmbientTemperature != null) {
            sb.append(", targetAmbientTemperature=");
            sb.append(this.targetAmbientTemperature);
        }
        if (this.cutID != null) {
            sb.append(", cutID=");
            sb.append(this.cutID);
        }
        if (this.presetID != null) {
            sb.append(", presetID=");
            sb.append(this.presetID);
        }
        if (this.ongoingRecipeID != null) {
            sb.append(", ongoingRecipeID=");
            sb.append(this.ongoingRecipeID);
        }
        if (this.estimatorConfig != null) {
            sb.append(", estimatorConfig=");
            sb.append(this.estimatorConfig);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.alarms != null) {
            sb.append(", alarms=");
            sb.append(this.alarms);
        }
        if (this.clipNumber != null) {
            sb.append(", clipNumber=");
            sb.append(this.clipNumber);
        }
        if (this.cookID != null) {
            sb.append(", cookID=");
            sb.append(this.cookID);
        }
        if (this.recipeID != null) {
            sb.append(", recipeID=");
            sb.append(this.recipeID);
        }
        if (this.recipeStepID != null) {
            sb.append(", recipeStepID=");
            sb.append(this.recipeStepID);
        }
        if (this.flareUpAlert != null) {
            sb.append(", flareUpAlert=");
            sb.append(this.flareUpAlert);
        }
        if (this.lastItem != null) {
            sb.append(", lastItem=");
            sb.append(this.lastItem);
        }
        StringBuilder replace = sb.replace(0, 2, "CookSetup{");
        replace.append('}');
        return replace.toString();
    }

    public CookSetup(Integer num, DeviceCookState deviceCookState, Integer num2, TemperatureRange temperatureRange, Integer num3, Integer num4, Long l10, EstimatorConfig estimatorConfig, String str, List<Alarm> list, Integer num5, Long l11, Integer num6, Integer num7, AlarmState alarmState, Integer num8, h hVar) {
        super(ADAPTER, hVar);
        this.sequenceNumber = num;
        this.state = deviceCookState;
        this.targetInternalTemperature = num2;
        this.targetAmbientTemperature = temperatureRange;
        this.cutID = num3;
        this.presetID = num4;
        this.ongoingRecipeID = l10;
        this.estimatorConfig = estimatorConfig;
        this.name = str;
        this.alarms = Internal.immutableCopyOf("alarms", list);
        this.clipNumber = num5;
        this.cookID = l11;
        this.recipeID = num6;
        this.recipeStepID = num7;
        this.flareUpAlert = alarmState;
        this.lastItem = num8;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m167newBuilder() {
        Builder builder = new Builder();
        builder.sequenceNumber = this.sequenceNumber;
        builder.state = this.state;
        builder.targetInternalTemperature = this.targetInternalTemperature;
        builder.targetAmbientTemperature = this.targetAmbientTemperature;
        builder.cutID = this.cutID;
        builder.presetID = this.presetID;
        builder.ongoingRecipeID = this.ongoingRecipeID;
        builder.estimatorConfig = this.estimatorConfig;
        builder.name = this.name;
        builder.alarms = Internal.copyOf("alarms", this.alarms);
        builder.clipNumber = this.clipNumber;
        builder.cookID = this.cookID;
        builder.recipeID = this.recipeID;
        builder.recipeStepID = this.recipeStepID;
        builder.flareUpAlert = this.flareUpAlert;
        builder.lastItem = this.lastItem;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
