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
public final class TemperatureHistory extends Message<TemperatureHistory, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer interval;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REPEATED, tag = 4)
    public final List<Integer> peaks;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer startTime;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.TemperatureRecording#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public final List<TemperatureRecording> values;
    public static final ProtoAdapter<TemperatureHistory> ADAPTER = new ProtoAdapter_TemperatureHistory();
    public static final Integer DEFAULT_STARTTIME = 0;
    public static final Integer DEFAULT_INTERVAL = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<TemperatureHistory, Builder> {
        public Integer interval;
        public Integer startTime;
        public List<TemperatureRecording> values = Internal.newMutableList();
        public List<Integer> peaks = Internal.newMutableList();

        public Builder interval(Integer num) {
            this.interval = num;
            return this;
        }

        public Builder peaks(List<Integer> list) {
            Internal.checkElementsNotNull(list);
            this.peaks = list;
            return this;
        }

        public Builder startTime(Integer num) {
            this.startTime = num;
            return this;
        }

        public Builder values(List<TemperatureRecording> list) {
            Internal.checkElementsNotNull(list);
            this.values = list;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public TemperatureHistory m372build() {
            Integer num = this.startTime;
            if (num != null && this.interval != null) {
                return new TemperatureHistory(this.startTime, this.interval, this.values, this.peaks, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "startTime", this.interval, "interval"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_TemperatureHistory extends ProtoAdapter<TemperatureHistory> {
        ProtoAdapter_TemperatureHistory() {
            super(FieldEncoding.LENGTH_DELIMITED, TemperatureHistory.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public TemperatureHistory m373decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m372build();
                }
                if (nextTag == 1) {
                    builder.startTime((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.interval((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.values.add((TemperatureRecording) TemperatureRecording.ADAPTER.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.peaks.add((Integer) ProtoAdapter.SINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, TemperatureHistory temperatureHistory) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, temperatureHistory.startTime);
            protoAdapter.encodeWithTag(protoWriter, 2, temperatureHistory.interval);
            if (temperatureHistory.values != null) {
                TemperatureRecording.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, temperatureHistory.values);
            }
            if (temperatureHistory.peaks != null) {
                ProtoAdapter.SINT32.asRepeated().encodeWithTag(protoWriter, 4, temperatureHistory.peaks);
            }
            protoWriter.writeBytes(temperatureHistory.unknownFields());
        }

        public int encodedSize(TemperatureHistory temperatureHistory) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            return protoAdapter.encodedSizeWithTag(1, temperatureHistory.startTime) + protoAdapter.encodedSizeWithTag(2, temperatureHistory.interval) + TemperatureRecording.ADAPTER.asRepeated().encodedSizeWithTag(3, temperatureHistory.values) + ProtoAdapter.SINT32.asRepeated().encodedSizeWithTag(4, temperatureHistory.peaks) + temperatureHistory.unknownFields().I();
        }

        public TemperatureHistory redact(TemperatureHistory temperatureHistory) {
            Builder m371newBuilder = temperatureHistory.m371newBuilder();
            Internal.redactElements(m371newBuilder.values, TemperatureRecording.ADAPTER);
            m371newBuilder.clearUnknownFields();
            return m371newBuilder.m372build();
        }
    }

    public TemperatureHistory(Integer num, Integer num2, List<TemperatureRecording> list, List<Integer> list2) {
        this(num, num2, list, list2, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TemperatureHistory)) {
            return false;
        }
        TemperatureHistory temperatureHistory = (TemperatureHistory) obj;
        if (Internal.equals(unknownFields(), temperatureHistory.unknownFields()) && Internal.equals(this.startTime, temperatureHistory.startTime) && Internal.equals(this.interval, temperatureHistory.interval) && Internal.equals(this.values, temperatureHistory.values) && Internal.equals(this.peaks, temperatureHistory.peaks)) {
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
            List<TemperatureRecording> list = this.values;
            int i16 = 1;
            if (list != null) {
                i11 = list.hashCode();
            } else {
                i11 = 1;
            }
            int i17 = (i15 + i11) * 37;
            List<Integer> list2 = this.peaks;
            if (list2 != null) {
                i16 = list2.hashCode();
            }
            int i18 = i17 + i16;
            ((Message) this).hashCode = i18;
            return i18;
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
        if (this.peaks != null) {
            sb.append(", peaks=");
            sb.append(this.peaks);
        }
        StringBuilder replace = sb.replace(0, 2, "TemperatureHistory{");
        replace.append('}');
        return replace.toString();
    }

    public TemperatureHistory(Integer num, Integer num2, List<TemperatureRecording> list, List<Integer> list2, h hVar) {
        super(ADAPTER, hVar);
        this.startTime = num;
        this.interval = num2;
        this.values = Internal.immutableCopyOf("values", list);
        this.peaks = Internal.immutableCopyOf("peaks", list2);
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m371newBuilder() {
        Builder builder = new Builder();
        builder.startTime = this.startTime;
        builder.interval = this.interval;
        builder.values = Internal.copyOf("values", this.values);
        builder.peaks = Internal.copyOf("peaks", this.peaks);
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
