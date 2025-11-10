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
public final class EstimatorConfig extends Message<EstimatorConfig, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.EstimatorType#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final EstimatorType estimatorType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer secondsDelayBeforeReady;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer secondsDelayBeforeResting;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer temperatureChangeBeforeReady;
    public static final ProtoAdapter<EstimatorConfig> ADAPTER = new ProtoAdapter_EstimatorConfig();
    public static final Integer DEFAULT_TEMPERATURECHANGEBEFOREREADY = 0;
    public static final Integer DEFAULT_SECONDSDELAYBEFOREREADY = 0;
    public static final Integer DEFAULT_SECONDSDELAYBEFORERESTING = 0;
    public static final EstimatorType DEFAULT_ESTIMATORTYPE = EstimatorType.DEFAULT;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<EstimatorConfig, Builder> {
        public EstimatorType estimatorType;
        public Integer secondsDelayBeforeReady;
        public Integer secondsDelayBeforeResting;
        public Integer temperatureChangeBeforeReady;

        public Builder estimatorType(EstimatorType estimatorType) {
            this.estimatorType = estimatorType;
            return this;
        }

        public Builder secondsDelayBeforeReady(Integer num) {
            this.secondsDelayBeforeReady = num;
            return this;
        }

        public Builder secondsDelayBeforeResting(Integer num) {
            this.secondsDelayBeforeResting = num;
            return this;
        }

        public Builder temperatureChangeBeforeReady(Integer num) {
            this.temperatureChangeBeforeReady = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public EstimatorConfig m186build() {
            Integer num = this.temperatureChangeBeforeReady;
            if (num != null && this.secondsDelayBeforeReady != null && this.secondsDelayBeforeResting != null && this.estimatorType != null) {
                return new EstimatorConfig(this.temperatureChangeBeforeReady, this.secondsDelayBeforeReady, this.secondsDelayBeforeResting, this.estimatorType, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "temperatureChangeBeforeReady", this.secondsDelayBeforeReady, "secondsDelayBeforeReady", this.secondsDelayBeforeResting, "secondsDelayBeforeResting", this.estimatorType, "estimatorType"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_EstimatorConfig extends ProtoAdapter<EstimatorConfig> {
        ProtoAdapter_EstimatorConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, EstimatorConfig.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public EstimatorConfig m187decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m186build();
                }
                if (nextTag == 1) {
                    builder.temperatureChangeBeforeReady((Integer) ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.secondsDelayBeforeReady((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.secondsDelayBeforeResting((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        builder.estimatorType((EstimatorType) EstimatorType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                }
            }
        }

        public void encode(ProtoWriter protoWriter, EstimatorConfig estimatorConfig) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, estimatorConfig.temperatureChangeBeforeReady);
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 2, estimatorConfig.secondsDelayBeforeReady);
            protoAdapter.encodeWithTag(protoWriter, 3, estimatorConfig.secondsDelayBeforeResting);
            EstimatorType.ADAPTER.encodeWithTag(protoWriter, 4, estimatorConfig.estimatorType);
            protoWriter.writeBytes(estimatorConfig.unknownFields());
        }

        public int encodedSize(EstimatorConfig estimatorConfig) {
            int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, estimatorConfig.temperatureChangeBeforeReady);
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            return encodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, estimatorConfig.secondsDelayBeforeReady) + protoAdapter.encodedSizeWithTag(3, estimatorConfig.secondsDelayBeforeResting) + EstimatorType.ADAPTER.encodedSizeWithTag(4, estimatorConfig.estimatorType) + estimatorConfig.unknownFields().I();
        }

        public EstimatorConfig redact(EstimatorConfig estimatorConfig) {
            Builder m185newBuilder = estimatorConfig.m185newBuilder();
            m185newBuilder.clearUnknownFields();
            return m185newBuilder.m186build();
        }
    }

    public EstimatorConfig(Integer num, Integer num2, Integer num3, EstimatorType estimatorType) {
        this(num, num2, num3, estimatorType, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EstimatorConfig)) {
            return false;
        }
        EstimatorConfig estimatorConfig = (EstimatorConfig) obj;
        if (Internal.equals(unknownFields(), estimatorConfig.unknownFields()) && Internal.equals(this.temperatureChangeBeforeReady, estimatorConfig.temperatureChangeBeforeReady) && Internal.equals(this.secondsDelayBeforeReady, estimatorConfig.secondsDelayBeforeReady) && Internal.equals(this.secondsDelayBeforeResting, estimatorConfig.secondsDelayBeforeResting) && Internal.equals(this.estimatorType, estimatorConfig.estimatorType)) {
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
            Integer num = this.temperatureChangeBeforeReady;
            int i14 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i15 = (hashCode + i10) * 37;
            Integer num2 = this.secondsDelayBeforeReady;
            if (num2 != null) {
                i11 = num2.hashCode();
            } else {
                i11 = 0;
            }
            int i16 = (i15 + i11) * 37;
            Integer num3 = this.secondsDelayBeforeResting;
            if (num3 != null) {
                i12 = num3.hashCode();
            } else {
                i12 = 0;
            }
            int i17 = (i16 + i12) * 37;
            EstimatorType estimatorType = this.estimatorType;
            if (estimatorType != null) {
                i14 = estimatorType.hashCode();
            }
            int i18 = i17 + i14;
            ((Message) this).hashCode = i18;
            return i18;
        }
        return i13;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.temperatureChangeBeforeReady != null) {
            sb.append(", temperatureChangeBeforeReady=");
            sb.append(this.temperatureChangeBeforeReady);
        }
        if (this.secondsDelayBeforeReady != null) {
            sb.append(", secondsDelayBeforeReady=");
            sb.append(this.secondsDelayBeforeReady);
        }
        if (this.secondsDelayBeforeResting != null) {
            sb.append(", secondsDelayBeforeResting=");
            sb.append(this.secondsDelayBeforeResting);
        }
        if (this.estimatorType != null) {
            sb.append(", estimatorType=");
            sb.append(this.estimatorType);
        }
        StringBuilder replace = sb.replace(0, 2, "EstimatorConfig{");
        replace.append('}');
        return replace.toString();
    }

    public EstimatorConfig(Integer num, Integer num2, Integer num3, EstimatorType estimatorType, h hVar) {
        super(ADAPTER, hVar);
        this.temperatureChangeBeforeReady = num;
        this.secondsDelayBeforeReady = num2;
        this.secondsDelayBeforeResting = num3;
        this.estimatorType = estimatorType;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m185newBuilder() {
        Builder builder = new Builder();
        builder.temperatureChangeBeforeReady = this.temperatureChangeBeforeReady;
        builder.secondsDelayBeforeReady = this.secondsDelayBeforeReady;
        builder.secondsDelayBeforeResting = this.secondsDelayBeforeResting;
        builder.estimatorType = this.estimatorType;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
