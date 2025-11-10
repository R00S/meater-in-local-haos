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
public final class AlertFiredEvent extends Message<AlertFiredEvent, Builder> {
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer limit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String name;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.AlarmType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final AlarmType type;
    public static final ProtoAdapter<AlertFiredEvent> ADAPTER = new ProtoAdapter_AlertFiredEvent();
    public static final AlarmType DEFAULT_TYPE = AlarmType.ALARM_TYPE_MIN_AMBIENT;
    public static final Integer DEFAULT_LIMIT = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<AlertFiredEvent, Builder> {
        public Integer limit;
        public String name;
        public AlarmType type;

        public Builder limit(Integer num) {
            this.limit = num;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder type(AlarmType alarmType) {
            this.type = alarmType;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public AlertFiredEvent m141build() {
            AlarmType alarmType = this.type;
            if (alarmType != null && this.limit != null) {
                return new AlertFiredEvent(this.type, this.limit, this.name, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{alarmType, "type", this.limit, "limit"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_AlertFiredEvent extends ProtoAdapter<AlertFiredEvent> {
        ProtoAdapter_AlertFiredEvent() {
            super(FieldEncoding.LENGTH_DELIMITED, AlertFiredEvent.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public AlertFiredEvent m142decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m141build();
                }
                if (nextTag == 1) {
                    try {
                        builder.type((AlarmType) AlarmType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                } else if (nextTag == 2) {
                    builder.limit((Integer) ProtoAdapter.SINT32.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.name((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, AlertFiredEvent alertFiredEvent) {
            AlarmType.ADAPTER.encodeWithTag(protoWriter, 1, alertFiredEvent.type);
            ProtoAdapter.SINT32.encodeWithTag(protoWriter, 2, alertFiredEvent.limit);
            String str = alertFiredEvent.name;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, str);
            }
            protoWriter.writeBytes(alertFiredEvent.unknownFields());
        }

        public int encodedSize(AlertFiredEvent alertFiredEvent) {
            int encodedSizeWithTag = AlarmType.ADAPTER.encodedSizeWithTag(1, alertFiredEvent.type) + ProtoAdapter.SINT32.encodedSizeWithTag(2, alertFiredEvent.limit);
            String str = alertFiredEvent.name;
            return encodedSizeWithTag + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, str) : 0) + alertFiredEvent.unknownFields().I();
        }

        public AlertFiredEvent redact(AlertFiredEvent alertFiredEvent) {
            Builder m140newBuilder = alertFiredEvent.m140newBuilder();
            m140newBuilder.clearUnknownFields();
            return m140newBuilder.m141build();
        }
    }

    public AlertFiredEvent(AlarmType alarmType, Integer num, String str) {
        this(alarmType, num, str, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AlertFiredEvent)) {
            return false;
        }
        AlertFiredEvent alertFiredEvent = (AlertFiredEvent) obj;
        if (Internal.equals(unknownFields(), alertFiredEvent.unknownFields()) && Internal.equals(this.type, alertFiredEvent.type) && Internal.equals(this.limit, alertFiredEvent.limit) && Internal.equals(this.name, alertFiredEvent.name)) {
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
            AlarmType alarmType = this.type;
            int i13 = 0;
            if (alarmType != null) {
                i10 = alarmType.hashCode();
            } else {
                i10 = 0;
            }
            int i14 = (hashCode + i10) * 37;
            Integer num = this.limit;
            if (num != null) {
                i11 = num.hashCode();
            } else {
                i11 = 0;
            }
            int i15 = (i14 + i11) * 37;
            String str = this.name;
            if (str != null) {
                i13 = str.hashCode();
            }
            int i16 = i15 + i13;
            ((Message) this).hashCode = i16;
            return i16;
        }
        return i12;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        StringBuilder replace = sb.replace(0, 2, "AlertFiredEvent{");
        replace.append('}');
        return replace.toString();
    }

    public AlertFiredEvent(AlarmType alarmType, Integer num, String str, h hVar) {
        super(ADAPTER, hVar);
        this.type = alarmType;
        this.limit = num;
        this.name = str;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m140newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.limit = this.limit;
        builder.name = this.name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
