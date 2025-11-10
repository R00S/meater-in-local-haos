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
public final class V2ProbeStatus extends Message<V2ProbeStatus, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer ambientTemperature;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 5)
    public final Integer elapsedTime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer internalTemperature;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer peakTemperature;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 4)
    public final Integer remainingTime;
    public static final ProtoAdapter<V2ProbeStatus> ADAPTER = new ProtoAdapter_V2ProbeStatus();
    public static final Integer DEFAULT_INTERNALTEMPERATURE = 0;
    public static final Integer DEFAULT_AMBIENTTEMPERATURE = 0;
    public static final Integer DEFAULT_PEAKTEMPERATURE = 0;
    public static final Integer DEFAULT_REMAININGTIME = 0;
    public static final Integer DEFAULT_ELAPSEDTIME = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2ProbeStatus, Builder> {
        public Integer ambientTemperature;
        public Integer elapsedTime;
        public Integer internalTemperature;
        public Integer peakTemperature;
        public Integer remainingTime;

        public Builder ambientTemperature(Integer num) {
            this.ambientTemperature = num;
            return this;
        }

        public Builder elapsedTime(Integer num) {
            this.elapsedTime = num;
            return this;
        }

        public Builder internalTemperature(Integer num) {
            this.internalTemperature = num;
            return this;
        }

        public Builder peakTemperature(Integer num) {
            this.peakTemperature = num;
            return this;
        }

        public Builder remainingTime(Integer num) {
            this.remainingTime = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2ProbeStatus m114build() {
            Integer num = this.internalTemperature;
            if (num != null && this.ambientTemperature != null && this.peakTemperature != null && this.remainingTime != null && this.elapsedTime != null) {
                return new V2ProbeStatus(this.internalTemperature, this.ambientTemperature, this.peakTemperature, this.remainingTime, this.elapsedTime, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "internalTemperature", this.ambientTemperature, "ambientTemperature", this.peakTemperature, "peakTemperature", this.remainingTime, "remainingTime", this.elapsedTime, "elapsedTime"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2ProbeStatus extends ProtoAdapter<V2ProbeStatus> {
        ProtoAdapter_V2ProbeStatus() {
            super(FieldEncoding.LENGTH_DELIMITED, V2ProbeStatus.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2ProbeStatus m115decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m114build();
                }
                if (nextTag == 1) {
                    builder.internalTemperature((Integer) ProtoAdapter.SINT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.ambientTemperature((Integer) ProtoAdapter.SINT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.peakTemperature((Integer) ProtoAdapter.SINT32.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.remainingTime((Integer) ProtoAdapter.SINT32.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.elapsedTime((Integer) ProtoAdapter.UINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2ProbeStatus v2ProbeStatus) {
            ProtoAdapter protoAdapter = ProtoAdapter.SINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, v2ProbeStatus.internalTemperature);
            protoAdapter.encodeWithTag(protoWriter, 2, v2ProbeStatus.ambientTemperature);
            protoAdapter.encodeWithTag(protoWriter, 3, v2ProbeStatus.peakTemperature);
            protoAdapter.encodeWithTag(protoWriter, 4, v2ProbeStatus.remainingTime);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 5, v2ProbeStatus.elapsedTime);
            protoWriter.writeBytes(v2ProbeStatus.unknownFields());
        }

        public int encodedSize(V2ProbeStatus v2ProbeStatus) {
            ProtoAdapter protoAdapter = ProtoAdapter.SINT32;
            return protoAdapter.encodedSizeWithTag(1, v2ProbeStatus.internalTemperature) + protoAdapter.encodedSizeWithTag(2, v2ProbeStatus.ambientTemperature) + protoAdapter.encodedSizeWithTag(3, v2ProbeStatus.peakTemperature) + protoAdapter.encodedSizeWithTag(4, v2ProbeStatus.remainingTime) + ProtoAdapter.UINT32.encodedSizeWithTag(5, v2ProbeStatus.elapsedTime) + v2ProbeStatus.unknownFields().I();
        }

        public V2ProbeStatus redact(V2ProbeStatus v2ProbeStatus) {
            Builder m113newBuilder = v2ProbeStatus.m113newBuilder();
            m113newBuilder.clearUnknownFields();
            return m113newBuilder.m114build();
        }
    }

    public V2ProbeStatus(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this(num, num2, num3, num4, num5, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2ProbeStatus)) {
            return false;
        }
        V2ProbeStatus v2ProbeStatus = (V2ProbeStatus) obj;
        if (Internal.equals(unknownFields(), v2ProbeStatus.unknownFields()) && Internal.equals(this.internalTemperature, v2ProbeStatus.internalTemperature) && Internal.equals(this.ambientTemperature, v2ProbeStatus.ambientTemperature) && Internal.equals(this.peakTemperature, v2ProbeStatus.peakTemperature) && Internal.equals(this.remainingTime, v2ProbeStatus.remainingTime) && Internal.equals(this.elapsedTime, v2ProbeStatus.elapsedTime)) {
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
            Integer num = this.internalTemperature;
            int i15 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i16 = (hashCode + i10) * 37;
            Integer num2 = this.ambientTemperature;
            if (num2 != null) {
                i11 = num2.hashCode();
            } else {
                i11 = 0;
            }
            int i17 = (i16 + i11) * 37;
            Integer num3 = this.peakTemperature;
            if (num3 != null) {
                i12 = num3.hashCode();
            } else {
                i12 = 0;
            }
            int i18 = (i17 + i12) * 37;
            Integer num4 = this.remainingTime;
            if (num4 != null) {
                i13 = num4.hashCode();
            } else {
                i13 = 0;
            }
            int i19 = (i18 + i13) * 37;
            Integer num5 = this.elapsedTime;
            if (num5 != null) {
                i15 = num5.hashCode();
            }
            int i20 = i19 + i15;
            ((Message) this).hashCode = i20;
            return i20;
        }
        return i14;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.internalTemperature != null) {
            sb.append(", internalTemperature=");
            sb.append(this.internalTemperature);
        }
        if (this.ambientTemperature != null) {
            sb.append(", ambientTemperature=");
            sb.append(this.ambientTemperature);
        }
        if (this.peakTemperature != null) {
            sb.append(", peakTemperature=");
            sb.append(this.peakTemperature);
        }
        if (this.remainingTime != null) {
            sb.append(", remainingTime=");
            sb.append(this.remainingTime);
        }
        if (this.elapsedTime != null) {
            sb.append(", elapsedTime=");
            sb.append(this.elapsedTime);
        }
        StringBuilder replace = sb.replace(0, 2, "V2ProbeStatus{");
        replace.append('}');
        return replace.toString();
    }

    public V2ProbeStatus(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, h hVar) {
        super(ADAPTER, hVar);
        this.internalTemperature = num;
        this.ambientTemperature = num2;
        this.peakTemperature = num3;
        this.remainingTime = num4;
        this.elapsedTime = num5;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m113newBuilder() {
        Builder builder = new Builder();
        builder.internalTemperature = this.internalTemperature;
        builder.ambientTemperature = this.ambientTemperature;
        builder.peakTemperature = this.peakTemperature;
        builder.remainingTime = this.remainingTime;
        builder.elapsedTime = this.elapsedTime;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
