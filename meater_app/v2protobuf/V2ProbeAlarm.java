package com.apptionlabs.meater_app.v2protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import ql.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public final class V2ProbeAlarm extends Message<V2ProbeAlarm, Builder> {
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer limit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String name;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2AlarmState#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final V2AlarmState state;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2AlarmType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final V2AlarmType type;
    public static final ProtoAdapter<V2ProbeAlarm> ADAPTER = new ProtoAdapter_V2ProbeAlarm();
    public static final V2AlarmType DEFAULT_TYPE = V2AlarmType.V2ALARM_TYPE_MIN_AMBIENT;
    public static final V2AlarmState DEFAULT_STATE = V2AlarmState.V2ALARM_STATE_NOT_READY;
    public static final Integer DEFAULT_LIMIT = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2ProbeAlarm, Builder> {
        public Integer limit;
        public String name;
        public V2AlarmState state;
        public V2AlarmType type;

        public Builder limit(Integer num) {
            this.limit = num;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder state(V2AlarmState v2AlarmState) {
            this.state = v2AlarmState;
            return this;
        }

        public Builder type(V2AlarmType v2AlarmType) {
            this.type = v2AlarmType;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2ProbeAlarm m108build() {
            V2AlarmType v2AlarmType = this.type;
            if (v2AlarmType != null && this.state != null && this.limit != null) {
                return new V2ProbeAlarm(this.type, this.state, this.limit, this.name, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{v2AlarmType, "type", this.state, "state", this.limit, "limit"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2ProbeAlarm extends ProtoAdapter<V2ProbeAlarm> {
        ProtoAdapter_V2ProbeAlarm() {
            super(FieldEncoding.LENGTH_DELIMITED, V2ProbeAlarm.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2ProbeAlarm m109decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m108build();
                }
                if (nextTag == 1) {
                    try {
                        builder.type((V2AlarmType) V2AlarmType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                } else if (nextTag == 2) {
                    try {
                        builder.state((V2AlarmState) V2AlarmState.ADAPTER.decode(protoReader));
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

        public void encode(ProtoWriter protoWriter, V2ProbeAlarm v2ProbeAlarm) {
            V2AlarmType.ADAPTER.encodeWithTag(protoWriter, 1, v2ProbeAlarm.type);
            V2AlarmState.ADAPTER.encodeWithTag(protoWriter, 2, v2ProbeAlarm.state);
            ProtoAdapter.SINT32.encodeWithTag(protoWriter, 3, v2ProbeAlarm.limit);
            String str = v2ProbeAlarm.name;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, str);
            }
            protoWriter.writeBytes(v2ProbeAlarm.unknownFields());
        }

        public int encodedSize(V2ProbeAlarm v2ProbeAlarm) {
            int encodedSizeWithTag = V2AlarmType.ADAPTER.encodedSizeWithTag(1, v2ProbeAlarm.type) + V2AlarmState.ADAPTER.encodedSizeWithTag(2, v2ProbeAlarm.state) + ProtoAdapter.SINT32.encodedSizeWithTag(3, v2ProbeAlarm.limit);
            String str = v2ProbeAlarm.name;
            return encodedSizeWithTag + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, str) : 0) + v2ProbeAlarm.unknownFields().I();
        }

        public V2ProbeAlarm redact(V2ProbeAlarm v2ProbeAlarm) {
            Builder m107newBuilder = v2ProbeAlarm.m107newBuilder();
            m107newBuilder.clearUnknownFields();
            return m107newBuilder.m108build();
        }
    }

    public V2ProbeAlarm(V2AlarmType v2AlarmType, V2AlarmState v2AlarmState, Integer num, String str) {
        this(v2AlarmType, v2AlarmState, num, str, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2ProbeAlarm)) {
            return false;
        }
        V2ProbeAlarm v2ProbeAlarm = (V2ProbeAlarm) obj;
        if (Internal.equals(unknownFields(), v2ProbeAlarm.unknownFields()) && Internal.equals(this.type, v2ProbeAlarm.type) && Internal.equals(this.state, v2ProbeAlarm.state) && Internal.equals(this.limit, v2ProbeAlarm.limit) && Internal.equals(this.name, v2ProbeAlarm.name)) {
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
            V2AlarmType v2AlarmType = this.type;
            int i14 = 0;
            if (v2AlarmType != null) {
                i10 = v2AlarmType.hashCode();
            } else {
                i10 = 0;
            }
            int i15 = (hashCode + i10) * 37;
            V2AlarmState v2AlarmState = this.state;
            if (v2AlarmState != null) {
                i11 = v2AlarmState.hashCode();
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
        StringBuilder replace = sb.replace(0, 2, "V2ProbeAlarm{");
        replace.append('}');
        return replace.toString();
    }

    public V2ProbeAlarm(V2AlarmType v2AlarmType, V2AlarmState v2AlarmState, Integer num, String str, h hVar) {
        super(ADAPTER, hVar);
        this.type = v2AlarmType;
        this.state = v2AlarmState;
        this.limit = num;
        this.name = str;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m107newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.state = this.state;
        builder.limit = this.limit;
        builder.name = this.name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
