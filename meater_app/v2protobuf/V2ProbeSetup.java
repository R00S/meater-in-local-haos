package com.apptionlabs.meater_app.v2protobuf;

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
public final class V2ProbeSetup extends Message<V2ProbeSetup, Builder> {
    public static final String DEFAULT_COOKNAME = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", tag = 7)
    public final Long cookID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String cookName;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2ProbeCookState#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final V2ProbeCookState cookState;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 4)
    public final Integer cutID;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2ProbeAlarm#ADAPTER", label = WireField.Label.REPEATED, tag = 6)
    public final List<V2ProbeAlarm> probeAlarms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer setupSeqNum;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer targetTemperature;
    public static final ProtoAdapter<V2ProbeSetup> ADAPTER = new ProtoAdapter_V2ProbeSetup();
    public static final Integer DEFAULT_SETUPSEQNUM = 0;
    public static final V2ProbeCookState DEFAULT_COOKSTATE = V2ProbeCookState.V2COOK_STATE_NOT_STARTED;
    public static final Integer DEFAULT_TARGETTEMPERATURE = 0;
    public static final Integer DEFAULT_CUTID = 0;
    public static final Long DEFAULT_COOKID = 0L;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2ProbeSetup, Builder> {
        public Long cookID;
        public String cookName;
        public V2ProbeCookState cookState;
        public Integer cutID;
        public List<V2ProbeAlarm> probeAlarms = Internal.newMutableList();
        public Integer setupSeqNum;
        public Integer targetTemperature;

        public Builder cookID(Long l10) {
            this.cookID = l10;
            return this;
        }

        public Builder cookName(String str) {
            this.cookName = str;
            return this;
        }

        public Builder cookState(V2ProbeCookState v2ProbeCookState) {
            this.cookState = v2ProbeCookState;
            return this;
        }

        public Builder cutID(Integer num) {
            this.cutID = num;
            return this;
        }

        public Builder probeAlarms(List<V2ProbeAlarm> list) {
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
        public V2ProbeSetup m111build() {
            Integer num = this.setupSeqNum;
            if (num != null && this.cookState != null && this.targetTemperature != null) {
                return new V2ProbeSetup(this.setupSeqNum, this.cookState, this.targetTemperature, this.cutID, this.cookName, this.probeAlarms, this.cookID, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "setupSeqNum", this.cookState, "cookState", this.targetTemperature, "targetTemperature"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2ProbeSetup extends ProtoAdapter<V2ProbeSetup> {
        ProtoAdapter_V2ProbeSetup() {
            super(FieldEncoding.LENGTH_DELIMITED, V2ProbeSetup.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2ProbeSetup m112decode(ProtoReader protoReader) {
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
                                builder.cookState((V2ProbeCookState) V2ProbeCookState.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        case 3:
                            builder.targetTemperature((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 4:
                            builder.cutID((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 5:
                            builder.cookName((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.probeAlarms.add((V2ProbeAlarm) V2ProbeAlarm.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            builder.cookID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m111build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2ProbeSetup v2ProbeSetup) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, v2ProbeSetup.setupSeqNum);
            V2ProbeCookState.ADAPTER.encodeWithTag(protoWriter, 2, v2ProbeSetup.cookState);
            protoAdapter.encodeWithTag(protoWriter, 3, v2ProbeSetup.targetTemperature);
            Integer num = v2ProbeSetup.cutID;
            if (num != null) {
                protoAdapter.encodeWithTag(protoWriter, 4, num);
            }
            String str = v2ProbeSetup.cookName;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, str);
            }
            if (v2ProbeSetup.probeAlarms != null) {
                V2ProbeAlarm.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, v2ProbeSetup.probeAlarms);
            }
            Long l10 = v2ProbeSetup.cookID;
            if (l10 != null) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 7, l10);
            }
            protoWriter.writeBytes(v2ProbeSetup.unknownFields());
        }

        public int encodedSize(V2ProbeSetup v2ProbeSetup) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, v2ProbeSetup.setupSeqNum) + V2ProbeCookState.ADAPTER.encodedSizeWithTag(2, v2ProbeSetup.cookState) + protoAdapter.encodedSizeWithTag(3, v2ProbeSetup.targetTemperature);
            Integer num = v2ProbeSetup.cutID;
            int encodedSizeWithTag2 = encodedSizeWithTag + (num != null ? protoAdapter.encodedSizeWithTag(4, num) : 0);
            String str = v2ProbeSetup.cookName;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, str) : 0) + V2ProbeAlarm.ADAPTER.asRepeated().encodedSizeWithTag(6, v2ProbeSetup.probeAlarms);
            Long l10 = v2ProbeSetup.cookID;
            return encodedSizeWithTag3 + (l10 != null ? ProtoAdapter.FIXED64.encodedSizeWithTag(7, l10) : 0) + v2ProbeSetup.unknownFields().I();
        }

        public V2ProbeSetup redact(V2ProbeSetup v2ProbeSetup) {
            Builder m110newBuilder = v2ProbeSetup.m110newBuilder();
            Internal.redactElements(m110newBuilder.probeAlarms, V2ProbeAlarm.ADAPTER);
            m110newBuilder.clearUnknownFields();
            return m110newBuilder.m111build();
        }
    }

    public V2ProbeSetup(Integer num, V2ProbeCookState v2ProbeCookState, Integer num2, Integer num3, String str, List<V2ProbeAlarm> list, Long l10) {
        this(num, v2ProbeCookState, num2, num3, str, list, l10, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2ProbeSetup)) {
            return false;
        }
        V2ProbeSetup v2ProbeSetup = (V2ProbeSetup) obj;
        if (Internal.equals(unknownFields(), v2ProbeSetup.unknownFields()) && Internal.equals(this.setupSeqNum, v2ProbeSetup.setupSeqNum) && Internal.equals(this.cookState, v2ProbeSetup.cookState) && Internal.equals(this.targetTemperature, v2ProbeSetup.targetTemperature) && Internal.equals(this.cutID, v2ProbeSetup.cutID) && Internal.equals(this.cookName, v2ProbeSetup.cookName) && Internal.equals(this.probeAlarms, v2ProbeSetup.probeAlarms) && Internal.equals(this.cookID, v2ProbeSetup.cookID)) {
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
        int i16 = ((Message) this).hashCode;
        if (i16 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.setupSeqNum;
            int i17 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i18 = (hashCode + i10) * 37;
            V2ProbeCookState v2ProbeCookState = this.cookState;
            if (v2ProbeCookState != null) {
                i11 = v2ProbeCookState.hashCode();
            } else {
                i11 = 0;
            }
            int i19 = (i18 + i11) * 37;
            Integer num2 = this.targetTemperature;
            if (num2 != null) {
                i12 = num2.hashCode();
            } else {
                i12 = 0;
            }
            int i20 = (i19 + i12) * 37;
            Integer num3 = this.cutID;
            if (num3 != null) {
                i13 = num3.hashCode();
            } else {
                i13 = 0;
            }
            int i21 = (i20 + i13) * 37;
            String str = this.cookName;
            if (str != null) {
                i14 = str.hashCode();
            } else {
                i14 = 0;
            }
            int i22 = (i21 + i14) * 37;
            List<V2ProbeAlarm> list = this.probeAlarms;
            if (list != null) {
                i15 = list.hashCode();
            } else {
                i15 = 1;
            }
            int i23 = (i22 + i15) * 37;
            Long l10 = this.cookID;
            if (l10 != null) {
                i17 = l10.hashCode();
            }
            int i24 = i23 + i17;
            ((Message) this).hashCode = i24;
            return i24;
        }
        return i16;
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
        if (this.cutID != null) {
            sb.append(", cutID=");
            sb.append(this.cutID);
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
        StringBuilder replace = sb.replace(0, 2, "V2ProbeSetup{");
        replace.append('}');
        return replace.toString();
    }

    public V2ProbeSetup(Integer num, V2ProbeCookState v2ProbeCookState, Integer num2, Integer num3, String str, List<V2ProbeAlarm> list, Long l10, h hVar) {
        super(ADAPTER, hVar);
        this.setupSeqNum = num;
        this.cookState = v2ProbeCookState;
        this.targetTemperature = num2;
        this.cutID = num3;
        this.cookName = str;
        this.probeAlarms = Internal.immutableCopyOf("probeAlarms", list);
        this.cookID = l10;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m110newBuilder() {
        Builder builder = new Builder();
        builder.setupSeqNum = this.setupSeqNum;
        builder.cookState = this.cookState;
        builder.targetTemperature = this.targetTemperature;
        builder.cutID = this.cutID;
        builder.cookName = this.cookName;
        builder.probeAlarms = Internal.copyOf("probeAlarms", this.probeAlarms);
        builder.cookID = this.cookID;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
