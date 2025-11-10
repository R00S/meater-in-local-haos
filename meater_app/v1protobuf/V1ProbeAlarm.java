package com.apptionlabs.meater_app.v1protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import ql.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public final class V1ProbeAlarm extends Message<V1ProbeAlarm, Builder> {
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer limit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String name;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1AlarmState#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final V1AlarmState state;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1AlarmType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final V1AlarmType type;
    public static final ProtoAdapter<V1ProbeAlarm> ADAPTER = new ProtoAdapter_LegacyProbeAlarm();
    public static final V1AlarmType DEFAULT_TYPE = V1AlarmType.ALARM_TYPE_MIN_AMBIENT;
    public static final V1AlarmState DEFAULT_STATE = V1AlarmState.ALARM_STATE_NOT_READY;
    public static final Integer DEFAULT_LIMIT = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V1ProbeAlarm, Builder> {
        public Integer limit;
        public String name;
        public V1AlarmState state;
        public V1AlarmType type;

        public Builder limit(Integer num) {
            this.limit = num;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder state(V1AlarmState v1AlarmState) {
            this.state = v1AlarmState;
            return this;
        }

        public Builder type(V1AlarmType v1AlarmType) {
            this.type = v1AlarmType;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V1ProbeAlarm m24build() {
            V1AlarmType v1AlarmType = this.type;
            if (v1AlarmType != null && this.state != null && this.limit != null) {
                return new V1ProbeAlarm(this.type, this.state, this.limit, this.name, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{v1AlarmType, "type", this.state, "state", this.limit, "limit"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_LegacyProbeAlarm extends ProtoAdapter<V1ProbeAlarm> {
        ProtoAdapter_LegacyProbeAlarm() {
            super(FieldEncoding.LENGTH_DELIMITED, V1ProbeAlarm.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V1ProbeAlarm m25decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m24build();
                }
                if (nextTag == 1) {
                    try {
                        builder.type((V1AlarmType) V1AlarmType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                } else if (nextTag == 2) {
                    try {
                        builder.state((V1AlarmState) V1AlarmState.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e11.value));
                    }
                } else if (nextTag == 3) {
                    builder.limit((Integer) ProtoAdapter.SINT32.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.name((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V1ProbeAlarm v1ProbeAlarm) {
            V1AlarmType.ADAPTER.encodeWithTag(protoWriter, 1, v1ProbeAlarm.type);
            V1AlarmState.ADAPTER.encodeWithTag(protoWriter, 2, v1ProbeAlarm.state);
            ProtoAdapter.SINT32.encodeWithTag(protoWriter, 3, v1ProbeAlarm.limit);
            String str = v1ProbeAlarm.name;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, str);
            }
            protoWriter.writeBytes(v1ProbeAlarm.unknownFields());
        }

        public int encodedSize(V1ProbeAlarm v1ProbeAlarm) {
            int encodedSizeWithTag = V1AlarmType.ADAPTER.encodedSizeWithTag(1, v1ProbeAlarm.type) + V1AlarmState.ADAPTER.encodedSizeWithTag(2, v1ProbeAlarm.state) + ProtoAdapter.SINT32.encodedSizeWithTag(3, v1ProbeAlarm.limit);
            String str = v1ProbeAlarm.name;
            return encodedSizeWithTag + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, str) : 0) + v1ProbeAlarm.unknownFields().I();
        }

        public V1ProbeAlarm redact(V1ProbeAlarm v1ProbeAlarm) {
            Builder m23newBuilder = v1ProbeAlarm.m23newBuilder();
            m23newBuilder.clearUnknownFields();
            return m23newBuilder.m24build();
        }
    }

    public V1ProbeAlarm(V1AlarmType v1AlarmType, V1AlarmState v1AlarmState, Integer num, String str) {
        this(v1AlarmType, v1AlarmState, num, str, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1ProbeAlarm)) {
            return false;
        }
        V1ProbeAlarm v1ProbeAlarm = (V1ProbeAlarm) obj;
        if (Internal.equals(unknownFields(), v1ProbeAlarm.unknownFields()) && Internal.equals(this.type, v1ProbeAlarm.type) && Internal.equals(this.state, v1ProbeAlarm.state) && Internal.equals(this.limit, v1ProbeAlarm.limit) && Internal.equals(this.name, v1ProbeAlarm.name)) {
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
            V1AlarmType v1AlarmType = this.type;
            int i14 = 0;
            if (v1AlarmType != null) {
                i10 = v1AlarmType.hashCode();
            } else {
                i10 = 0;
            }
            int i15 = (hashCode + i10) * 37;
            V1AlarmState v1AlarmState = this.state;
            if (v1AlarmState != null) {
                i11 = v1AlarmState.hashCode();
            } else {
                i11 = 0;
            }
            int i16 = (i15 + i11) * 37;
            Integer num = this.limit;
            if (num != null) {
                i12 = num.hashCode();
            } else {
                i12 = 0;
            }
            int i17 = (i16 + i12) * 37;
            String str = this.name;
            if (str != null) {
                i14 = str.hashCode();
            }
            int i18 = i17 + i14;
            ((Message) this).hashCode = i18;
            return i18;
        }
        return i13;
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
        StringBuilder replace = sb.replace(0, 2, "V1ProbeAlarm{");
        replace.append('}');
        return replace.toString();
    }

    public V1ProbeAlarm(V1AlarmType v1AlarmType, V1AlarmState v1AlarmState, Integer num, String str, h hVar) {
        super(ADAPTER, hVar);
        this.type = v1AlarmType;
        this.state = v1AlarmState;
        this.limit = num;
        this.name = str;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m23newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.state = this.state;
        builder.limit = this.limit;
        builder.name = this.name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
