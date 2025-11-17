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
public final class V1TemperatureHistory extends Message<V1TemperatureHistory, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer interval;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer startTime;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1TemperatureRecording#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public final List<V1TemperatureRecording> values;
    public static final ProtoAdapter<V1TemperatureHistory> ADAPTER = new ProtoAdapter_LegacyTemperatureHistory();
    public static final Integer DEFAULT_STARTTIME = 0;
    public static final Integer DEFAULT_INTERVAL = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V1TemperatureHistory, Builder> {
        public Integer interval;
        public Integer startTime;
        public List<V1TemperatureRecording> values = Internal.newMutableList();

        public Builder interval(Integer num) {
            this.interval = num;
            return this;
        }

        public Builder startTime(Integer num) {
            this.startTime = num;
            return this;
        }

        public Builder values(List<V1TemperatureRecording> list) {
            Internal.checkElementsNotNull(list);
            this.values = list;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V1TemperatureHistory m39build() {
            Integer num = this.startTime;
            if (num != null && this.interval != null) {
                return new V1TemperatureHistory(this.startTime, this.interval, this.values, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "startTime", this.interval, "interval"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_LegacyTemperatureHistory extends ProtoAdapter<V1TemperatureHistory> {
        ProtoAdapter_LegacyTemperatureHistory() {
            super(FieldEncoding.LENGTH_DELIMITED, V1TemperatureHistory.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V1TemperatureHistory m40decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m39build();
                }
                if (nextTag == 1) {
                    builder.startTime((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.interval((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.values.add((V1TemperatureRecording) V1TemperatureRecording.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V1TemperatureHistory v1TemperatureHistory) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, v1TemperatureHistory.startTime);
            protoAdapter.encodeWithTag(protoWriter, 2, v1TemperatureHistory.interval);
            if (v1TemperatureHistory.values != null) {
                V1TemperatureRecording.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, v1TemperatureHistory.values);
            }
            protoWriter.writeBytes(v1TemperatureHistory.unknownFields());
        }

        public int encodedSize(V1TemperatureHistory v1TemperatureHistory) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            return protoAdapter.encodedSizeWithTag(1, v1TemperatureHistory.startTime) + protoAdapter.encodedSizeWithTag(2, v1TemperatureHistory.interval) + V1TemperatureRecording.ADAPTER.asRepeated().encodedSizeWithTag(3, v1TemperatureHistory.values) + v1TemperatureHistory.unknownFields().I();
        }

        public V1TemperatureHistory redact(V1TemperatureHistory v1TemperatureHistory) {
            Builder m38newBuilder = v1TemperatureHistory.m38newBuilder();
            Internal.redactElements(m38newBuilder.values, V1TemperatureRecording.ADAPTER);
            m38newBuilder.clearUnknownFields();
            return m38newBuilder.m39build();
        }
    }

    public V1TemperatureHistory(Integer num, Integer num2, List<V1TemperatureRecording> list) {
        this(num, num2, list, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1TemperatureHistory)) {
            return false;
        }
        V1TemperatureHistory v1TemperatureHistory = (V1TemperatureHistory) obj;
        if (Internal.equals(unknownFields(), v1TemperatureHistory.unknownFields()) && Internal.equals(this.startTime, v1TemperatureHistory.startTime) && Internal.equals(this.interval, v1TemperatureHistory.interval) && Internal.equals(this.values, v1TemperatureHistory.values)) {
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
            Integer num = this.startTime;
            int i13 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i14 = (hashCode + i10) * 37;
            Integer num2 = this.interval;
            if (num2 != null) {
                i13 = num2.hashCode();
            }
            int i15 = (i14 + i13) * 37;
            List<V1TemperatureRecording> list = this.values;
            if (list != null) {
                i11 = list.hashCode();
            } else {
                i11 = 1;
            }
            int i16 = i15 + i11;
            ((Message) this).hashCode = i16;
            return i16;
        }
        return i12;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.startTime != null) {
            sb.append(", startTime=");
            sb.append(this.startTime);
        }
        if (this.interval != null) {
            sb.append(", interval=");
            sb.append(this.interval);
        }
        if (this.values != null) {
            sb.append(", values=");
            sb.append(this.values);
        }
        StringBuilder replace = sb.replace(0, 2, "V1TemperatureHistory{");
        replace.append('}');
        return replace.toString();
    }

    public V1TemperatureHistory(Integer num, Integer num2, List<V1TemperatureRecording> list, h hVar) {
        super(ADAPTER, hVar);
        this.startTime = num;
        this.interval = num2;
        this.values = Internal.immutableCopyOf("values", list);
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m38newBuilder() {
        Builder builder = new Builder();
        builder.startTime = this.startTime;
        builder.interval = this.interval;
        builder.values = Internal.copyOf("values", this.values);
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
