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
public final class Alarm extends Message<Alarm, Builder> {
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 5)
    public final Integer lastFireTime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer limit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String name;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.AlarmState#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final AlarmState state;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.AlarmType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final AlarmType type;
    public static final ProtoAdapter<Alarm> ADAPTER = new ProtoAdapter_Alarm();
    public static final AlarmType DEFAULT_TYPE = AlarmType.ALARM_TYPE_MIN_AMBIENT;
    public static final AlarmState DEFAULT_STATE = AlarmState.ALARM_STATE_NOT_READY;
    public static final Integer DEFAULT_LIMIT = 0;
    public static final Integer DEFAULT_LASTFIRETIME = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<Alarm, Builder> {
        public Integer lastFireTime;
        public Integer limit;
        public String name;
        public AlarmState state;
        public AlarmType type;

        public Builder lastFireTime(Integer num) {
            this.lastFireTime = num;
            return this;
        }

        public Builder limit(Integer num) {
            this.limit = num;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder state(AlarmState alarmState) {
            this.state = alarmState;
            return this;
        }

        public Builder type(AlarmType alarmType) {
            this.type = alarmType;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public Alarm m138build() {
            AlarmType alarmType = this.type;
            if (alarmType != null && this.state != null && this.limit != null) {
                return new Alarm(this.type, this.state, this.limit, this.name, this.lastFireTime, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{alarmType, "type", this.state, "state", this.limit, "limit"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_Alarm extends ProtoAdapter<Alarm> {
        ProtoAdapter_Alarm() {
            super(FieldEncoding.LENGTH_DELIMITED, Alarm.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public Alarm m139decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m138build();
                }
                if (nextTag == 1) {
                    try {
                        builder.type((AlarmType) AlarmType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                } else if (nextTag == 2) {
                    try {
                        builder.state((AlarmState) AlarmState.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e11.value));
                    }
                } else if (nextTag == 3) {
                    builder.limit((Integer) ProtoAdapter.SINT32.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.name((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.lastFireTime((Integer) ProtoAdapter.UINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, Alarm alarm) {
            AlarmType.ADAPTER.encodeWithTag(protoWriter, 1, alarm.type);
            AlarmState.ADAPTER.encodeWithTag(protoWriter, 2, alarm.state);
            ProtoAdapter.SINT32.encodeWithTag(protoWriter, 3, alarm.limit);
            String str = alarm.name;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, str);
            }
            Integer num = alarm.lastFireTime;
            if (num != null) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 5, num);
            }
            protoWriter.writeBytes(alarm.unknownFields());
        }

        public int encodedSize(Alarm alarm) {
            int encodedSizeWithTag = AlarmType.ADAPTER.encodedSizeWithTag(1, alarm.type) + AlarmState.ADAPTER.encodedSizeWithTag(2, alarm.state) + ProtoAdapter.SINT32.encodedSizeWithTag(3, alarm.limit);
            String str = alarm.name;
            int encodedSizeWithTag2 = encodedSizeWithTag + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, str) : 0);
            Integer num = alarm.lastFireTime;
            return encodedSizeWithTag2 + (num != null ? ProtoAdapter.UINT32.encodedSizeWithTag(5, num) : 0) + alarm.unknownFields().I();
        }

        public Alarm redact(Alarm alarm) {
            Builder m137newBuilder = alarm.m137newBuilder();
            m137newBuilder.clearUnknownFields();
            return m137newBuilder.m138build();
        }
    }

    public Alarm(AlarmType alarmType, AlarmState alarmState, Integer num, String str, Integer num2) {
        this(alarmType, alarmState, num, str, num2, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Alarm)) {
            return false;
        }
        Alarm alarm = (Alarm) obj;
        if (Internal.equals(unknownFields(), alarm.unknownFields()) && Internal.equals(this.type, alarm.type) && Internal.equals(this.state, alarm.state) && Internal.equals(this.limit, alarm.limit) && Internal.equals(this.name, alarm.name) && Internal.equals(this.lastFireTime, alarm.lastFireTime)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = ((Message) this).hashCode;
        if (i14 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            AlarmType alarmType = this.type;
            int i15 = 0;
            if (alarmType != null) {
                i10 = alarmType.hashCode();
            } else {
                i10 = 0;
            }
            int i16 = (hashCode + i10) * 37;
            AlarmState alarmState = this.state;
            if (alarmState != null) {
                i11 = alarmState.hashCode();
            } else {
                i11 = 0;
            }
            int i17 = (i16 + i11) * 37;
            Integer num = this.limit;
            if (num != null) {
                i12 = num.hashCode();
            } else {
                i12 = 0;
            }
            int i18 = (i17 + i12) * 37;
            String str = this.name;
            if (str != null) {
                i13 = str.hashCode();
            } else {
                i13 = 0;
            }
            int i19 = (i18 + i13) * 37;
            Integer num2 = this.lastFireTime;
            if (num2 != null) {
                i15 = num2.hashCode();
            }
            int i20 = i19 + i15;
            ((Message) this).hashCode = i20;
            return i20;
        }
        return i14;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.state != null) {
            sb.append(", state=");
            sb.append(this.state);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.lastFireTime != null) {
            sb.append(", lastFireTime=");
            sb.append(this.lastFireTime);
        }
        StringBuilder replace = sb.replace(0, 2, "Alarm{");
        replace.append('}');
        return replace.toString();
    }

    public Alarm(AlarmType alarmType, AlarmState alarmState, Integer num, String str, Integer num2, h hVar) {
        super(ADAPTER, hVar);
        this.type = alarmType;
        this.state = alarmState;
        this.limit = num;
        this.name = str;
        this.lastFireTime = num2;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m137newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.state = this.state;
        builder.limit = this.limit;
        builder.name = this.name;
        builder.lastFireTime = this.lastFireTime;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
