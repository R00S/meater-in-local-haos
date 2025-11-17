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
public final class MLChildDevice extends Message<MLChildDevice, Builder> {
    public static final ProtoAdapter<MLChildDevice> ADAPTER = new ProtoAdapter_MLChildDevice();
    public static final Long DEFAULT_IDENTIFIER = 0L;
    public static final Integer DEFAULT_PROBENUMBER = 0;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer probeNumber;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MLChildDevice, Builder> {
        public Long identifier;
        public Integer probeNumber;

        public Builder identifier(Long l10) {
            this.identifier = l10;
            return this;
        }

        public Builder probeNumber(Integer num) {
            this.probeNumber = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MLChildDevice m255build() {
            Long l10 = this.identifier;
            if (l10 != null && this.probeNumber != null) {
                return new MLChildDevice(this.identifier, this.probeNumber, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "identifier", this.probeNumber, "probeNumber"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MLChildDevice extends ProtoAdapter<MLChildDevice> {
        ProtoAdapter_MLChildDevice() {
            super(FieldEncoding.LENGTH_DELIMITED, MLChildDevice.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MLChildDevice m256decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m255build();
                }
                if (nextTag == 1) {
                    builder.identifier((Long) ProtoAdapter.FIXED64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.probeNumber((Integer) ProtoAdapter.UINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MLChildDevice mLChildDevice) {
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, mLChildDevice.identifier);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, mLChildDevice.probeNumber);
            protoWriter.writeBytes(mLChildDevice.unknownFields());
        }

        public int encodedSize(MLChildDevice mLChildDevice) {
            return ProtoAdapter.FIXED64.encodedSizeWithTag(1, mLChildDevice.identifier) + ProtoAdapter.UINT32.encodedSizeWithTag(2, mLChildDevice.probeNumber) + mLChildDevice.unknownFields().I();
        }

        public MLChildDevice redact(MLChildDevice mLChildDevice) {
            Builder m254newBuilder = mLChildDevice.m254newBuilder();
            m254newBuilder.clearUnknownFields();
            return m254newBuilder.m255build();
        }
    }

    public MLChildDevice(Long l10, Integer num) {
        this(l10, num, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MLChildDevice)) {
            return false;
        }
        MLChildDevice mLChildDevice = (MLChildDevice) obj;
        if (Internal.equals(unknownFields(), mLChildDevice.unknownFields()) && Internal.equals(this.identifier, mLChildDevice.identifier) && Internal.equals(this.probeNumber, mLChildDevice.probeNumber)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Long l10 = this.identifier;
            int i12 = 0;
            if (l10 != null) {
                i10 = l10.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (hashCode + i10) * 37;
            Integer num = this.probeNumber;
            if (num != null) {
                i12 = num.hashCode();
            }
            int i14 = i13 + i12;
            ((Message) this).hashCode = i14;
            return i14;
        }
        return i11;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.identifier != null) {
            sb.append(", identifier=");
            sb.append(this.identifier);
        }
        if (this.probeNumber != null) {
            sb.append(", probeNumber=");
            sb.append(this.probeNumber);
        }
        StringBuilder replace = sb.replace(0, 2, "MLChildDevice{");
        replace.append('}');
        return replace.toString();
    }

    public MLChildDevice(Long l10, Integer num, h hVar) {
        super(ADAPTER, hVar);
        this.identifier = l10;
        this.probeNumber = num;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m254newBuilder() {
        Builder builder = new Builder();
        builder.identifier = this.identifier;
        builder.probeNumber = this.probeNumber;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
