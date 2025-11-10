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
public final class CookEstimatorLogRecording extends Message<CookEstimatorLogRecording, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer ambient;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 6)
    public final Boolean cookLogUnavailable;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.DeviceCookState#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    public final DeviceCookState cookState;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer internal;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 4)
    public final Integer target;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer timeRemainingEstimate;
    public static final ProtoAdapter<CookEstimatorLogRecording> ADAPTER = new ProtoAdapter_CookEstimatorLogRecording();
    public static final Integer DEFAULT_TIMEREMAININGESTIMATE = 0;
    public static final Integer DEFAULT_INTERNAL = 0;
    public static final Integer DEFAULT_AMBIENT = 0;
    public static final Integer DEFAULT_TARGET = 0;
    public static final DeviceCookState DEFAULT_COOKSTATE = DeviceCookState.COOK_STATE_NOT_STARTED;
    public static final Boolean DEFAULT_COOKLOGUNAVAILABLE = Boolean.FALSE;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<CookEstimatorLogRecording, Builder> {
        public Integer ambient;
        public Boolean cookLogUnavailable;
        public DeviceCookState cookState;
        public Integer internal;
        public Integer target;
        public Integer timeRemainingEstimate;

        public Builder ambient(Integer num) {
            this.ambient = num;
            return this;
        }

        public Builder cookLogUnavailable(Boolean bool) {
            this.cookLogUnavailable = bool;
            return this;
        }

        public Builder cookState(DeviceCookState deviceCookState) {
            this.cookState = deviceCookState;
            return this;
        }

        public Builder internal(Integer num) {
            this.internal = num;
            return this;
        }

        public Builder target(Integer num) {
            this.target = num;
            return this;
        }

        public Builder timeRemainingEstimate(Integer num) {
            this.timeRemainingEstimate = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public CookEstimatorLogRecording m165build() {
            Integer num = this.timeRemainingEstimate;
            if (num != null && this.internal != null && this.ambient != null && this.target != null && this.cookState != null) {
                return new CookEstimatorLogRecording(this.timeRemainingEstimate, this.internal, this.ambient, this.target, this.cookState, this.cookLogUnavailable, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "timeRemainingEstimate", this.internal, "internal", this.ambient, "ambient", this.target, "target", this.cookState, "cookState"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_CookEstimatorLogRecording extends ProtoAdapter<CookEstimatorLogRecording> {
        ProtoAdapter_CookEstimatorLogRecording() {
            super(FieldEncoding.LENGTH_DELIMITED, CookEstimatorLogRecording.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public CookEstimatorLogRecording m166decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.timeRemainingEstimate((Integer) ProtoAdapter.SINT32.decode(protoReader));
                            break;
                        case 2:
                            builder.internal((Integer) ProtoAdapter.SINT32.decode(protoReader));
                            break;
                        case 3:
                            builder.ambient((Integer) ProtoAdapter.SINT32.decode(protoReader));
                            break;
                        case 4:
                            builder.target((Integer) ProtoAdapter.SINT32.decode(protoReader));
                            break;
                        case 5:
                            try {
                                builder.cookState((DeviceCookState) DeviceCookState.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        case 6:
                            builder.cookLogUnavailable((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.m165build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, CookEstimatorLogRecording cookEstimatorLogRecording) {
            ProtoAdapter protoAdapter = ProtoAdapter.SINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, cookEstimatorLogRecording.timeRemainingEstimate);
            protoAdapter.encodeWithTag(protoWriter, 2, cookEstimatorLogRecording.internal);
            protoAdapter.encodeWithTag(protoWriter, 3, cookEstimatorLogRecording.ambient);
            protoAdapter.encodeWithTag(protoWriter, 4, cookEstimatorLogRecording.target);
            DeviceCookState.ADAPTER.encodeWithTag(protoWriter, 5, cookEstimatorLogRecording.cookState);
            Boolean bool = cookEstimatorLogRecording.cookLogUnavailable;
            if (bool != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, bool);
            }
            protoWriter.writeBytes(cookEstimatorLogRecording.unknownFields());
        }

        public int encodedSize(CookEstimatorLogRecording cookEstimatorLogRecording) {
            ProtoAdapter protoAdapter = ProtoAdapter.SINT32;
            int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, cookEstimatorLogRecording.timeRemainingEstimate) + protoAdapter.encodedSizeWithTag(2, cookEstimatorLogRecording.internal) + protoAdapter.encodedSizeWithTag(3, cookEstimatorLogRecording.ambient) + protoAdapter.encodedSizeWithTag(4, cookEstimatorLogRecording.target) + DeviceCookState.ADAPTER.encodedSizeWithTag(5, cookEstimatorLogRecording.cookState);
            Boolean bool = cookEstimatorLogRecording.cookLogUnavailable;
            return encodedSizeWithTag + (bool != null ? ProtoAdapter.BOOL.encodedSizeWithTag(6, bool) : 0) + cookEstimatorLogRecording.unknownFields().I();
        }

        public CookEstimatorLogRecording redact(CookEstimatorLogRecording cookEstimatorLogRecording) {
            Builder m164newBuilder = cookEstimatorLogRecording.m164newBuilder();
            m164newBuilder.clearUnknownFields();
            return m164newBuilder.m165build();
        }
    }

    public CookEstimatorLogRecording(Integer num, Integer num2, Integer num3, Integer num4, DeviceCookState deviceCookState, Boolean bool) {
        this(num, num2, num3, num4, deviceCookState, bool, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CookEstimatorLogRecording)) {
            return false;
        }
        CookEstimatorLogRecording cookEstimatorLogRecording = (CookEstimatorLogRecording) obj;
        if (Internal.equals(unknownFields(), cookEstimatorLogRecording.unknownFields()) && Internal.equals(this.timeRemainingEstimate, cookEstimatorLogRecording.timeRemainingEstimate) && Internal.equals(this.internal, cookEstimatorLogRecording.internal) && Internal.equals(this.ambient, cookEstimatorLogRecording.ambient) && Internal.equals(this.target, cookEstimatorLogRecording.target) && Internal.equals(this.cookState, cookEstimatorLogRecording.cookState) && Internal.equals(this.cookLogUnavailable, cookEstimatorLogRecording.cookLogUnavailable)) {
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
        int i15 = ((Message) this).hashCode;
        if (i15 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.timeRemainingEstimate;
            int i16 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i17 = (hashCode + i10) * 37;
            Integer num2 = this.internal;
            if (num2 != null) {
                i11 = num2.hashCode();
            } else {
                i11 = 0;
            }
            int i18 = (i17 + i11) * 37;
            Integer num3 = this.ambient;
            if (num3 != null) {
                i12 = num3.hashCode();
            } else {
                i12 = 0;
            }
            int i19 = (i18 + i12) * 37;
            Integer num4 = this.target;
            if (num4 != null) {
                i13 = num4.hashCode();
            } else {
                i13 = 0;
            }
            int i20 = (i19 + i13) * 37;
            DeviceCookState deviceCookState = this.cookState;
            if (deviceCookState != null) {
                i14 = deviceCookState.hashCode();
            } else {
                i14 = 0;
            }
            int i21 = (i20 + i14) * 37;
            Boolean bool = this.cookLogUnavailable;
            if (bool != null) {
                i16 = bool.hashCode();
            }
            int i22 = i21 + i16;
            ((Message) this).hashCode = i22;
            return i22;
        }
        return i15;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.timeRemainingEstimate != null) {
            sb.append(", timeRemainingEstimate=");
            sb.append(this.timeRemainingEstimate);
        }
        if (this.internal != null) {
            sb.append(", internal=");
            sb.append(this.internal);
        }
        if (this.ambient != null) {
            sb.append(", ambient=");
            sb.append(this.ambient);
        }
        if (this.target != null) {
            sb.append(", target=");
            sb.append(this.target);
        }
        if (this.cookState != null) {
            sb.append(", cookState=");
            sb.append(this.cookState);
        }
        if (this.cookLogUnavailable != null) {
            sb.append(", cookLogUnavailable=");
            sb.append(this.cookLogUnavailable);
        }
        StringBuilder replace = sb.replace(0, 2, "CookEstimatorLogRecording{");
        replace.append('}');
        return replace.toString();
    }

    public CookEstimatorLogRecording(Integer num, Integer num2, Integer num3, Integer num4, DeviceCookState deviceCookState, Boolean bool, h hVar) {
        super(ADAPTER, hVar);
        this.timeRemainingEstimate = num;
        this.internal = num2;
        this.ambient = num3;
        this.target = num4;
        this.cookState = deviceCookState;
        this.cookLogUnavailable = bool;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m164newBuilder() {
        Builder builder = new Builder();
        builder.timeRemainingEstimate = this.timeRemainingEstimate;
        builder.internal = this.internal;
        builder.ambient = this.ambient;
        builder.target = this.target;
        builder.cookState = this.cookState;
        builder.cookLogUnavailable = this.cookLogUnavailable;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
