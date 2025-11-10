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
public final class V2TemperatureHistory extends Message<V2TemperatureHistory, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer interval;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer startTime;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2TemperatureRecording#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public final List<V2TemperatureRecording> values;
    public static final ProtoAdapter<V2TemperatureHistory> ADAPTER = new ProtoAdapter_V2TemperatureHistory();
    public static final Integer DEFAULT_STARTTIME = 0;
    public static final Integer DEFAULT_INTERVAL = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2TemperatureHistory, Builder> {
        public Integer interval;
        public Integer startTime;
        public List<V2TemperatureRecording> values = Internal.newMutableList();

        public Builder interval(Integer num) {
            this.interval = num;
            return this;
        }

        public Builder startTime(Integer num) {
            this.startTime = num;
            return this;
        }

        public Builder values(List<V2TemperatureRecording> list) {
            Internal.checkElementsNotNull(list);
            this.values = list;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2TemperatureHistory m123build() {
            Integer num = this.startTime;
            if (num != null && this.interval != null) {
                return new V2TemperatureHistory(this.startTime, this.interval, this.values, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "startTime", this.interval, "interval"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2TemperatureHistory extends ProtoAdapter<V2TemperatureHistory> {
        ProtoAdapter_V2TemperatureHistory() {
            super(FieldEncoding.LENGTH_DELIMITED, V2TemperatureHistory.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2TemperatureHistory m124decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m123build();
                }
                if (nextTag == 1) {
                    builder.startTime((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.interval((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.values.add((V2TemperatureRecording) V2TemperatureRecording.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2TemperatureHistory v2TemperatureHistory) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, v2TemperatureHistory.startTime);
            protoAdapter.encodeWithTag(protoWriter, 2, v2TemperatureHistory.interval);
            if (v2TemperatureHistory.values != null) {
                V2TemperatureRecording.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, v2TemperatureHistory.values);
            }
            protoWriter.writeBytes(v2TemperatureHistory.unknownFields());
        }

        public int encodedSize(V2TemperatureHistory v2TemperatureHistory) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            return protoAdapter.encodedSizeWithTag(1, v2TemperatureHistory.startTime) + protoAdapter.encodedSizeWithTag(2, v2TemperatureHistory.interval) + V2TemperatureRecording.ADAPTER.asRepeated().encodedSizeWithTag(3, v2TemperatureHistory.values) + v2TemperatureHistory.unknownFields().I();
        }

        public V2TemperatureHistory redact(V2TemperatureHistory v2TemperatureHistory) {
            Builder m122newBuilder = v2TemperatureHistory.m122newBuilder();
            Internal.redactElements(m122newBuilder.values, V2TemperatureRecording.ADAPTER);
            m122newBuilder.clearUnknownFields();
            return m122newBuilder.m123build();
        }
    }

    public V2TemperatureHistory(Integer num, Integer num2, List<V2TemperatureRecording> list) {
        this(num, num2, list, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2TemperatureHistory)) {
            return false;
        }
        V2TemperatureHistory v2TemperatureHistory = (V2TemperatureHistory) obj;
        if (Internal.equals(unknownFields(), v2TemperatureHistory.unknownFields()) && Internal.equals(this.startTime, v2TemperatureHistory.startTime) && Internal.equals(this.interval, v2TemperatureHistory.interval) && Internal.equals(this.values, v2TemperatureHistory.values)) {
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
            List<V2TemperatureRecording> list = this.values;
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
        StringBuilder replace = sb.replace(0, 2, "V2TemperatureHistory{");
        replace.append('}');
        return replace.toString();
    }

    public V2TemperatureHistory(Integer num, Integer num2, List<V2TemperatureRecording> list, h hVar) {
        super(ADAPTER, hVar);
        this.startTime = num;
        this.interval = num2;
        this.values = Internal.immutableCopyOf("values", list);
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m122newBuilder() {
        Builder builder = new Builder();
        builder.startTime = this.startTime;
        builder.interval = this.interval;
        builder.values = Internal.copyOf("values", this.values);
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
