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
public final class CookStatus extends Message<CookStatus, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer ambientTemperature;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 5)
    public final Integer elapsedTime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer internalTemperature;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REPEATED, tag = 7)
    public final List<Integer> internalTemperatures;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer peakTemperature;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 4)
    public final Integer remainingCookTime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 6)
    public final Integer totalRemainingTime;
    public static final ProtoAdapter<CookStatus> ADAPTER = new ProtoAdapter_CookStatus();
    public static final Integer DEFAULT_INTERNALTEMPERATURE = 0;
    public static final Integer DEFAULT_AMBIENTTEMPERATURE = 0;
    public static final Integer DEFAULT_PEAKTEMPERATURE = 0;
    public static final Integer DEFAULT_REMAININGCOOKTIME = 0;
    public static final Integer DEFAULT_ELAPSEDTIME = 0;
    public static final Integer DEFAULT_TOTALREMAININGTIME = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<CookStatus, Builder> {
        public Integer ambientTemperature;
        public Integer elapsedTime;
        public Integer internalTemperature;
        public List<Integer> internalTemperatures = Internal.newMutableList();
        public Integer peakTemperature;
        public Integer remainingCookTime;
        public Integer totalRemainingTime;

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

        public Builder internalTemperatures(List<Integer> list) {
            Internal.checkElementsNotNull(list);
            this.internalTemperatures = list;
            return this;
        }

        public Builder peakTemperature(Integer num) {
            this.peakTemperature = num;
            return this;
        }

        public Builder remainingCookTime(Integer num) {
            this.remainingCookTime = num;
            return this;
        }

        public Builder totalRemainingTime(Integer num) {
            this.totalRemainingTime = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public CookStatus m171build() {
            Integer num = this.internalTemperature;
            if (num != null && this.ambientTemperature != null && this.peakTemperature != null && this.remainingCookTime != null && this.elapsedTime != null && this.totalRemainingTime != null) {
                return new CookStatus(this.internalTemperature, this.ambientTemperature, this.peakTemperature, this.remainingCookTime, this.elapsedTime, this.totalRemainingTime, this.internalTemperatures, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "internalTemperature", this.ambientTemperature, "ambientTemperature", this.peakTemperature, "peakTemperature", this.remainingCookTime, "remainingCookTime", this.elapsedTime, "elapsedTime", this.totalRemainingTime, "totalRemainingTime"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_CookStatus extends ProtoAdapter<CookStatus> {
        ProtoAdapter_CookStatus() {
            super(FieldEncoding.LENGTH_DELIMITED, CookStatus.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public CookStatus m172decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.internalTemperature((Integer) ProtoAdapter.SINT32.decode(protoReader));
                            break;
                        case 2:
                            builder.ambientTemperature((Integer) ProtoAdapter.SINT32.decode(protoReader));
                            break;
                        case 3:
                            builder.peakTemperature((Integer) ProtoAdapter.SINT32.decode(protoReader));
                            break;
                        case 4:
                            builder.remainingCookTime((Integer) ProtoAdapter.SINT32.decode(protoReader));
                            break;
                        case 5:
                            builder.elapsedTime((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case 6:
                            builder.totalRemainingTime((Integer) ProtoAdapter.SINT32.decode(protoReader));
                            break;
                        case 7:
                            builder.internalTemperatures.add((Integer) ProtoAdapter.SINT32.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m171build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, CookStatus cookStatus) {
            ProtoAdapter protoAdapter = ProtoAdapter.SINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, cookStatus.internalTemperature);
            protoAdapter.encodeWithTag(protoWriter, 2, cookStatus.ambientTemperature);
            protoAdapter.encodeWithTag(protoWriter, 3, cookStatus.peakTemperature);
            protoAdapter.encodeWithTag(protoWriter, 4, cookStatus.remainingCookTime);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 5, cookStatus.elapsedTime);
            protoAdapter.encodeWithTag(protoWriter, 6, cookStatus.totalRemainingTime);
            if (cookStatus.internalTemperatures != null) {
                protoAdapter.asRepeated().encodeWithTag(protoWriter, 7, cookStatus.internalTemperatures);
            }
            protoWriter.writeBytes(cookStatus.unknownFields());
        }

        public int encodedSize(CookStatus cookStatus) {
            ProtoAdapter protoAdapter = ProtoAdapter.SINT32;
            return protoAdapter.encodedSizeWithTag(1, cookStatus.internalTemperature) + protoAdapter.encodedSizeWithTag(2, cookStatus.ambientTemperature) + protoAdapter.encodedSizeWithTag(3, cookStatus.peakTemperature) + protoAdapter.encodedSizeWithTag(4, cookStatus.remainingCookTime) + ProtoAdapter.UINT32.encodedSizeWithTag(5, cookStatus.elapsedTime) + protoAdapter.encodedSizeWithTag(6, cookStatus.totalRemainingTime) + protoAdapter.asRepeated().encodedSizeWithTag(7, cookStatus.internalTemperatures) + cookStatus.unknownFields().I();
        }

        public CookStatus redact(CookStatus cookStatus) {
            Builder m170newBuilder = cookStatus.m170newBuilder();
            m170newBuilder.clearUnknownFields();
            return m170newBuilder.m171build();
        }
    }

    public CookStatus(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, List<Integer> list) {
        this(num, num2, num3, num4, num5, num6, list, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CookStatus)) {
            return false;
        }
        CookStatus cookStatus = (CookStatus) obj;
        if (Internal.equals(unknownFields(), cookStatus.unknownFields()) && Internal.equals(this.internalTemperature, cookStatus.internalTemperature) && Internal.equals(this.ambientTemperature, cookStatus.ambientTemperature) && Internal.equals(this.peakTemperature, cookStatus.peakTemperature) && Internal.equals(this.remainingCookTime, cookStatus.remainingCookTime) && Internal.equals(this.elapsedTime, cookStatus.elapsedTime) && Internal.equals(this.totalRemainingTime, cookStatus.totalRemainingTime) && Internal.equals(this.internalTemperatures, cookStatus.internalTemperatures)) {
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
            Integer num = this.internalTemperature;
            int i17 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i18 = (hashCode + i10) * 37;
            Integer num2 = this.ambientTemperature;
            if (num2 != null) {
                i11 = num2.hashCode();
            } else {
                i11 = 0;
            }
            int i19 = (i18 + i11) * 37;
            Integer num3 = this.peakTemperature;
            if (num3 != null) {
                i12 = num3.hashCode();
            } else {
                i12 = 0;
            }
            int i20 = (i19 + i12) * 37;
            Integer num4 = this.remainingCookTime;
            if (num4 != null) {
                i13 = num4.hashCode();
            } else {
                i13 = 0;
            }
            int i21 = (i20 + i13) * 37;
            Integer num5 = this.elapsedTime;
            if (num5 != null) {
                i14 = num5.hashCode();
            } else {
                i14 = 0;
            }
            int i22 = (i21 + i14) * 37;
            Integer num6 = this.totalRemainingTime;
            if (num6 != null) {
                i17 = num6.hashCode();
            }
            int i23 = (i22 + i17) * 37;
            List<Integer> list = this.internalTemperatures;
            if (list != null) {
                i15 = list.hashCode();
            } else {
                i15 = 1;
            }
            int i24 = i23 + i15;
            ((Message) this).hashCode = i24;
            return i24;
        }
        return i16;
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
        if (this.remainingCookTime != null) {
            sb.append(", remainingCookTime=");
            sb.append(this.remainingCookTime);
        }
        if (this.elapsedTime != null) {
            sb.append(", elapsedTime=");
            sb.append(this.elapsedTime);
        }
        if (this.totalRemainingTime != null) {
            sb.append(", totalRemainingTime=");
            sb.append(this.totalRemainingTime);
        }
        if (this.internalTemperatures != null) {
            sb.append(", internalTemperatures=");
            sb.append(this.internalTemperatures);
        }
        StringBuilder replace = sb.replace(0, 2, "CookStatus{");
        replace.append('}');
        return replace.toString();
    }

    public CookStatus(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, List<Integer> list, h hVar) {
        super(ADAPTER, hVar);
        this.internalTemperature = num;
        this.ambientTemperature = num2;
        this.peakTemperature = num3;
        this.remainingCookTime = num4;
        this.elapsedTime = num5;
        this.totalRemainingTime = num6;
        this.internalTemperatures = Internal.immutableCopyOf("internalTemperatures", list);
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m170newBuilder() {
        Builder builder = new Builder();
        builder.internalTemperature = this.internalTemperature;
        builder.ambientTemperature = this.ambientTemperature;
        builder.peakTemperature = this.peakTemperature;
        builder.remainingCookTime = this.remainingCookTime;
        builder.elapsedTime = this.elapsedTime;
        builder.totalRemainingTime = this.totalRemainingTime;
        builder.internalTemperatures = Internal.copyOf("internalTemperatures", this.internalTemperatures);
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
