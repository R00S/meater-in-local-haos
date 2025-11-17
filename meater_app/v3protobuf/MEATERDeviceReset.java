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
public final class MEATERDeviceReset extends Message<MEATERDeviceReset, Builder> {
    public static final ProtoAdapter<MEATERDeviceReset> ADAPTER = new ProtoAdapter_MEATERDeviceReset();
    public static final Integer DEFAULT_COUNTER = 0;
    public static final Integer DEFAULT_SOURCE = 0;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer counter;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer source;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MEATERDeviceReset, Builder> {
        public Integer counter;
        public Integer source;

        public Builder counter(Integer num) {
            this.counter = num;
            return this;
        }

        public Builder source(Integer num) {
            this.source = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MEATERDeviceReset m213build() {
            Integer num = this.counter;
            if (num != null && this.source != null) {
                return new MEATERDeviceReset(this.counter, this.source, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "counter", this.source, "source"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MEATERDeviceReset extends ProtoAdapter<MEATERDeviceReset> {
        ProtoAdapter_MEATERDeviceReset() {
            super(FieldEncoding.LENGTH_DELIMITED, MEATERDeviceReset.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MEATERDeviceReset m214decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m213build();
                }
                if (nextTag == 1) {
                    builder.counter((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.source((Integer) ProtoAdapter.UINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MEATERDeviceReset mEATERDeviceReset) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, mEATERDeviceReset.counter);
            protoAdapter.encodeWithTag(protoWriter, 2, mEATERDeviceReset.source);
            protoWriter.writeBytes(mEATERDeviceReset.unknownFields());
        }

        public int encodedSize(MEATERDeviceReset mEATERDeviceReset) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            return protoAdapter.encodedSizeWithTag(1, mEATERDeviceReset.counter) + protoAdapter.encodedSizeWithTag(2, mEATERDeviceReset.source) + mEATERDeviceReset.unknownFields().I();
        }

        public MEATERDeviceReset redact(MEATERDeviceReset mEATERDeviceReset) {
            Builder m212newBuilder = mEATERDeviceReset.m212newBuilder();
            m212newBuilder.clearUnknownFields();
            return m212newBuilder.m213build();
        }
    }

    public MEATERDeviceReset(Integer num, Integer num2) {
        this(num, num2, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MEATERDeviceReset)) {
            return false;
        }
        MEATERDeviceReset mEATERDeviceReset = (MEATERDeviceReset) obj;
        if (Internal.equals(unknownFields(), mEATERDeviceReset.unknownFields()) && Internal.equals(this.counter, mEATERDeviceReset.counter) && Internal.equals(this.source, mEATERDeviceReset.source)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.counter;
            int i12 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (hashCode + i10) * 37;
            Integer num2 = this.source;
            if (num2 != null) {
                i12 = num2.hashCode();
            }
            int i14 = i13 + i12;
            ((Message) this).hashCode = i14;
            return i14;
        }
        return i11;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.counter != null) {
            sb.append(", counter=");
            sb.append(this.counter);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        StringBuilder replace = sb.replace(0, 2, "MEATERDeviceReset{");
        replace.append('}');
        return replace.toString();
    }

    public MEATERDeviceReset(Integer num, Integer num2, h hVar) {
        super(ADAPTER, hVar);
        this.counter = num;
        this.source = num2;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m212newBuilder() {
        Builder builder = new Builder();
        builder.counter = this.counter;
        builder.source = this.source;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
