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
public final class MLAmber extends Message<MLAmber, Builder> {
    public static final ProtoAdapter<MLAmber> ADAPTER = new ProtoAdapter_MLAmber();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MLChildDevice#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public final List<MLChildDevice> childProbes;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.CookSetup#ADAPTER", tag = 1)
    public final CookSetup setup;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.CookStatus#ADAPTER", tag = 2)
    public final CookStatus status;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MLAmber, Builder> {
        public List<MLChildDevice> childProbes = Internal.newMutableList();
        public CookSetup setup;
        public CookStatus status;

        public Builder childProbes(List<MLChildDevice> list) {
            Internal.checkElementsNotNull(list);
            this.childProbes = list;
            return this;
        }

        public Builder setup(CookSetup cookSetup) {
            this.setup = cookSetup;
            return this;
        }

        public Builder status(CookStatus cookStatus) {
            this.status = cookStatus;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MLAmber m249build() {
            return new MLAmber(this.setup, this.status, this.childProbes, buildUnknownFields());
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MLAmber extends ProtoAdapter<MLAmber> {
        ProtoAdapter_MLAmber() {
            super(FieldEncoding.LENGTH_DELIMITED, MLAmber.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MLAmber m250decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m249build();
                }
                if (nextTag == 1) {
                    builder.setup((CookSetup) CookSetup.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.status((CookStatus) CookStatus.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.childProbes.add((MLChildDevice) MLChildDevice.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MLAmber mLAmber) {
            CookSetup cookSetup = mLAmber.setup;
            if (cookSetup != null) {
                CookSetup.ADAPTER.encodeWithTag(protoWriter, 1, cookSetup);
            }
            CookStatus cookStatus = mLAmber.status;
            if (cookStatus != null) {
                CookStatus.ADAPTER.encodeWithTag(protoWriter, 2, cookStatus);
            }
            if (mLAmber.childProbes != null) {
                MLChildDevice.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, mLAmber.childProbes);
            }
            protoWriter.writeBytes(mLAmber.unknownFields());
        }

        public int encodedSize(MLAmber mLAmber) {
            CookSetup cookSetup = mLAmber.setup;
            int encodedSizeWithTag = cookSetup != null ? CookSetup.ADAPTER.encodedSizeWithTag(1, cookSetup) : 0;
            CookStatus cookStatus = mLAmber.status;
            return encodedSizeWithTag + (cookStatus != null ? CookStatus.ADAPTER.encodedSizeWithTag(2, cookStatus) : 0) + MLChildDevice.ADAPTER.asRepeated().encodedSizeWithTag(3, mLAmber.childProbes) + mLAmber.unknownFields().I();
        }

        public MLAmber redact(MLAmber mLAmber) {
            Builder m248newBuilder = mLAmber.m248newBuilder();
            CookSetup cookSetup = m248newBuilder.setup;
            if (cookSetup != null) {
                m248newBuilder.setup = (CookSetup) CookSetup.ADAPTER.redact(cookSetup);
            }
            CookStatus cookStatus = m248newBuilder.status;
            if (cookStatus != null) {
                m248newBuilder.status = (CookStatus) CookStatus.ADAPTER.redact(cookStatus);
            }
            Internal.redactElements(m248newBuilder.childProbes, MLChildDevice.ADAPTER);
            m248newBuilder.clearUnknownFields();
            return m248newBuilder.m249build();
        }
    }

    public MLAmber(CookSetup cookSetup, CookStatus cookStatus, List<MLChildDevice> list) {
        this(cookSetup, cookStatus, list, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MLAmber)) {
            return false;
        }
        MLAmber mLAmber = (MLAmber) obj;
        if (Internal.equals(unknownFields(), mLAmber.unknownFields()) && Internal.equals(this.setup, mLAmber.setup) && Internal.equals(this.status, mLAmber.status) && Internal.equals(this.childProbes, mLAmber.childProbes)) {
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
            CookSetup cookSetup = this.setup;
            int i13 = 0;
            if (cookSetup != null) {
                i10 = cookSetup.hashCode();
            } else {
                i10 = 0;
            }
            int i14 = (hashCode + i10) * 37;
            CookStatus cookStatus = this.status;
            if (cookStatus != null) {
                i13 = cookStatus.hashCode();
            }
            int i15 = (i14 + i13) * 37;
            List<MLChildDevice> list = this.childProbes;
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
        if (this.setup != null) {
            sb.append(", setup=");
            sb.append(this.setup);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.childProbes != null) {
            sb.append(", childProbes=");
            sb.append(this.childProbes);
        }
        StringBuilder replace = sb.replace(0, 2, "MLAmber{");
        replace.append('}');
        return replace.toString();
    }

    public MLAmber(CookSetup cookSetup, CookStatus cookStatus, List<MLChildDevice> list, h hVar) {
        super(ADAPTER, hVar);
        this.setup = cookSetup;
        this.status = cookStatus;
        this.childProbes = Internal.immutableCopyOf("childProbes", list);
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m248newBuilder() {
        Builder builder = new Builder();
        builder.setup = this.setup;
        builder.status = this.status;
        builder.childProbes = Internal.copyOf("childProbes", this.childProbes);
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
