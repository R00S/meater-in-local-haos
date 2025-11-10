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
public final class V2AmberSession extends Message<V2AmberSession, Builder> {
    public static final String DEFAULT_SESSIONNAME = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2ProbeAlarm#ADAPTER", label = WireField.Label.REPEATED, tag = 6)
    public final List<V2ProbeAlarm> alarms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long sessionID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String sessionName;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer sessionSeqNum;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2ProbeCookState#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final V2ProbeCookState sessionState;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 5)
    public final Integer startTime;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2TemperatureRange#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final V2TemperatureRange targetTemperature;
    public static final ProtoAdapter<V2AmberSession> ADAPTER = new ProtoAdapter_V2AmberSession();
    public static final Long DEFAULT_SESSIONID = 0L;
    public static final Integer DEFAULT_SESSIONSEQNUM = 0;
    public static final V2ProbeCookState DEFAULT_SESSIONSTATE = V2ProbeCookState.V2COOK_STATE_NOT_STARTED;
    public static final Integer DEFAULT_STARTTIME = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2AmberSession, Builder> {
        public List<V2ProbeAlarm> alarms = Internal.newMutableList();
        public Long sessionID;
        public String sessionName;
        public Integer sessionSeqNum;
        public V2ProbeCookState sessionState;
        public Integer startTime;
        public V2TemperatureRange targetTemperature;

        public Builder alarms(List<V2ProbeAlarm> list) {
            Internal.checkElementsNotNull(list);
            this.alarms = list;
            return this;
        }

        public Builder sessionID(Long l10) {
            this.sessionID = l10;
            return this;
        }

        public Builder sessionName(String str) {
            this.sessionName = str;
            return this;
        }

        public Builder sessionSeqNum(Integer num) {
            this.sessionSeqNum = num;
            return this;
        }

        public Builder sessionState(V2ProbeCookState v2ProbeCookState) {
            this.sessionState = v2ProbeCookState;
            return this;
        }

        public Builder startTime(Integer num) {
            this.startTime = num;
            return this;
        }

        public Builder targetTemperature(V2TemperatureRange v2TemperatureRange) {
            this.targetTemperature = v2TemperatureRange;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2AmberSession m51build() {
            Long l10 = this.sessionID;
            if (l10 != null && this.sessionSeqNum != null && this.sessionState != null && this.targetTemperature != null && this.startTime != null) {
                return new V2AmberSession(this.sessionID, this.sessionSeqNum, this.sessionState, this.targetTemperature, this.startTime, this.alarms, this.sessionName, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "sessionID", this.sessionSeqNum, "sessionSeqNum", this.sessionState, "sessionState", this.targetTemperature, "targetTemperature", this.startTime, "startTime"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2AmberSession extends ProtoAdapter<V2AmberSession> {
        ProtoAdapter_V2AmberSession() {
            super(FieldEncoding.LENGTH_DELIMITED, V2AmberSession.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2AmberSession m52decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.sessionID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                            break;
                        case 2:
                            builder.sessionSeqNum((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 3:
                            try {
                                builder.sessionState((V2ProbeCookState) V2ProbeCookState.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        case 4:
                            builder.targetTemperature((V2TemperatureRange) V2TemperatureRange.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.startTime((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 6:
                            builder.alarms.add((V2ProbeAlarm) V2ProbeAlarm.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            builder.sessionName((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m51build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2AmberSession v2AmberSession) {
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, v2AmberSession.sessionID);
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 2, v2AmberSession.sessionSeqNum);
            V2ProbeCookState.ADAPTER.encodeWithTag(protoWriter, 3, v2AmberSession.sessionState);
            V2TemperatureRange.ADAPTER.encodeWithTag(protoWriter, 4, v2AmberSession.targetTemperature);
            protoAdapter.encodeWithTag(protoWriter, 5, v2AmberSession.startTime);
            if (v2AmberSession.alarms != null) {
                V2ProbeAlarm.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, v2AmberSession.alarms);
            }
            String str = v2AmberSession.sessionName;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, str);
            }
            protoWriter.writeBytes(v2AmberSession.unknownFields());
        }

        public int encodedSize(V2AmberSession v2AmberSession) {
            int encodedSizeWithTag = ProtoAdapter.FIXED64.encodedSizeWithTag(1, v2AmberSession.sessionID);
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            int encodedSizeWithTag2 = encodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, v2AmberSession.sessionSeqNum) + V2ProbeCookState.ADAPTER.encodedSizeWithTag(3, v2AmberSession.sessionState) + V2TemperatureRange.ADAPTER.encodedSizeWithTag(4, v2AmberSession.targetTemperature) + protoAdapter.encodedSizeWithTag(5, v2AmberSession.startTime) + V2ProbeAlarm.ADAPTER.asRepeated().encodedSizeWithTag(6, v2AmberSession.alarms);
            String str = v2AmberSession.sessionName;
            return encodedSizeWithTag2 + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, str) : 0) + v2AmberSession.unknownFields().I();
        }

        public V2AmberSession redact(V2AmberSession v2AmberSession) {
            Builder m50newBuilder = v2AmberSession.m50newBuilder();
            V2TemperatureRange v2TemperatureRange = m50newBuilder.targetTemperature;
            if (v2TemperatureRange != null) {
                m50newBuilder.targetTemperature = (V2TemperatureRange) V2TemperatureRange.ADAPTER.redact(v2TemperatureRange);
            }
            Internal.redactElements(m50newBuilder.alarms, V2ProbeAlarm.ADAPTER);
            m50newBuilder.clearUnknownFields();
            return m50newBuilder.m51build();
        }
    }

    public V2AmberSession(Long l10, Integer num, V2ProbeCookState v2ProbeCookState, V2TemperatureRange v2TemperatureRange, Integer num2, List<V2ProbeAlarm> list, String str) {
        this(l10, num, v2ProbeCookState, v2TemperatureRange, num2, list, str, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2AmberSession)) {
            return false;
        }
        V2AmberSession v2AmberSession = (V2AmberSession) obj;
        if (Internal.equals(unknownFields(), v2AmberSession.unknownFields()) && Internal.equals(this.sessionID, v2AmberSession.sessionID) && Internal.equals(this.sessionSeqNum, v2AmberSession.sessionSeqNum) && Internal.equals(this.sessionState, v2AmberSession.sessionState) && Internal.equals(this.targetTemperature, v2AmberSession.targetTemperature) && Internal.equals(this.startTime, v2AmberSession.startTime) && Internal.equals(this.alarms, v2AmberSession.alarms) && Internal.equals(this.sessionName, v2AmberSession.sessionName)) {
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
            Long l10 = this.sessionID;
            int i17 = 0;
            if (l10 != null) {
                i10 = l10.hashCode();
            } else {
                i10 = 0;
            }
            int i18 = (hashCode + i10) * 37;
            Integer num = this.sessionSeqNum;
            if (num != null) {
                i11 = num.hashCode();
            } else {
                i11 = 0;
            }
            int i19 = (i18 + i11) * 37;
            V2ProbeCookState v2ProbeCookState = this.sessionState;
            if (v2ProbeCookState != null) {
                i12 = v2ProbeCookState.hashCode();
            } else {
                i12 = 0;
            }
            int i20 = (i19 + i12) * 37;
            V2TemperatureRange v2TemperatureRange = this.targetTemperature;
            if (v2TemperatureRange != null) {
                i13 = v2TemperatureRange.hashCode();
            } else {
                i13 = 0;
            }
            int i21 = (i20 + i13) * 37;
            Integer num2 = this.startTime;
            if (num2 != null) {
                i14 = num2.hashCode();
            } else {
                i14 = 0;
            }
            int i22 = (i21 + i14) * 37;
            List<V2ProbeAlarm> list = this.alarms;
            if (list != null) {
                i15 = list.hashCode();
            } else {
                i15 = 1;
            }
            int i23 = (i22 + i15) * 37;
            String str = this.sessionName;
            if (str != null) {
                i17 = str.hashCode();
            }
            int i24 = i23 + i17;
            ((Message) this).hashCode = i24;
            return i24;
        }
        return i16;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sessionID != null) {
            sb.append(", sessionID=");
            sb.append(this.sessionID);
        }
        if (this.sessionSeqNum != null) {
            sb.append(", sessionSeqNum=");
            sb.append(this.sessionSeqNum);
        }
        if (this.sessionState != null) {
            sb.append(", sessionState=");
            sb.append(this.sessionState);
        }
        if (this.targetTemperature != null) {
            sb.append(", targetTemperature=");
            sb.append(this.targetTemperature);
        }
        if (this.startTime != null) {
            sb.append(", startTime=");
            sb.append(this.startTime);
        }
        if (this.alarms != null) {
            sb.append(", alarms=");
            sb.append(this.alarms);
        }
        if (this.sessionName != null) {
            sb.append(", sessionName=");
            sb.append(this.sessionName);
        }
        StringBuilder replace = sb.replace(0, 2, "V2AmberSession{");
        replace.append('}');
        return replace.toString();
    }

    public V2AmberSession(Long l10, Integer num, V2ProbeCookState v2ProbeCookState, V2TemperatureRange v2TemperatureRange, Integer num2, List<V2ProbeAlarm> list, String str, h hVar) {
        super(ADAPTER, hVar);
        this.sessionID = l10;
        this.sessionSeqNum = num;
        this.sessionState = v2ProbeCookState;
        this.targetTemperature = v2TemperatureRange;
        this.startTime = num2;
        this.alarms = Internal.immutableCopyOf("alarms", list);
        this.sessionName = str;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m50newBuilder() {
        Builder builder = new Builder();
        builder.sessionID = this.sessionID;
        builder.sessionSeqNum = this.sessionSeqNum;
        builder.sessionState = this.sessionState;
        builder.targetTemperature = this.targetTemperature;
        builder.startTime = this.startTime;
        builder.alarms = Internal.copyOf("alarms", this.alarms);
        builder.sessionName = this.sessionName;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
