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
public final class MLProbe extends Message<MLProbe, Builder> {
    public static final ProtoAdapter<MLProbe> ADAPTER = new ProtoAdapter_MLProbe();
    public static final Long DEFAULT_PARENTIDENTIFIER = 0L;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long parentIdentifier;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.CookSetup#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final CookSetup setup;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.CookStatus#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final CookStatus status;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MLProbe, Builder> {
        public Long parentIdentifier;
        public CookSetup setup;
        public CookStatus status;

        public Builder parentIdentifier(Long l10) {
            this.parentIdentifier = l10;
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
        public MLProbe m264build() {
            Long l10 = this.parentIdentifier;
            if (l10 != null && this.setup != null && this.status != null) {
                return new MLProbe(this.parentIdentifier, this.setup, this.status, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "parentIdentifier", this.setup, "setup", this.status, "status"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MLProbe extends ProtoAdapter<MLProbe> {
        ProtoAdapter_MLProbe() {
            super(FieldEncoding.LENGTH_DELIMITED, MLProbe.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MLProbe m265decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m264build();
                }
                if (nextTag == 1) {
                    builder.parentIdentifier((Long) ProtoAdapter.FIXED64.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.setup((CookSetup) CookSetup.ADAPTER.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.status((CookStatus) CookStatus.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MLProbe mLProbe) {
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, mLProbe.parentIdentifier);
            CookSetup.ADAPTER.encodeWithTag(protoWriter, 3, mLProbe.setup);
            CookStatus.ADAPTER.encodeWithTag(protoWriter, 4, mLProbe.status);
            protoWriter.writeBytes(mLProbe.unknownFields());
        }

        public int encodedSize(MLProbe mLProbe) {
            return ProtoAdapter.FIXED64.encodedSizeWithTag(1, mLProbe.parentIdentifier) + CookSetup.ADAPTER.encodedSizeWithTag(3, mLProbe.setup) + CookStatus.ADAPTER.encodedSizeWithTag(4, mLProbe.status) + mLProbe.unknownFields().I();
        }

        public MLProbe redact(MLProbe mLProbe) {
            Builder m263newBuilder = mLProbe.m263newBuilder();
            CookSetup cookSetup = m263newBuilder.setup;
            if (cookSetup != null) {
                m263newBuilder.setup = (CookSetup) CookSetup.ADAPTER.redact(cookSetup);
            }
            CookStatus cookStatus = m263newBuilder.status;
            if (cookStatus != null) {
                m263newBuilder.status = (CookStatus) CookStatus.ADAPTER.redact(cookStatus);
            }
            m263newBuilder.clearUnknownFields();
            return m263newBuilder.m264build();
        }
    }

    public MLProbe(Long l10, CookSetup cookSetup, CookStatus cookStatus) {
        this(l10, cookSetup, cookStatus, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MLProbe)) {
            return false;
        }
        MLProbe mLProbe = (MLProbe) obj;
        if (Internal.equals(unknownFields(), mLProbe.unknownFields()) && Internal.equals(this.parentIdentifier, mLProbe.parentIdentifier) && Internal.equals(this.setup, mLProbe.setup) && Internal.equals(this.status, mLProbe.status)) {
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
            Long l10 = this.parentIdentifier;
            int i13 = 0;
            if (l10 != null) {
                i10 = l10.hashCode();
            } else {
                i10 = 0;
            }
            int i14 = (hashCode + i10) * 37;
            CookSetup cookSetup = this.setup;
            if (cookSetup != null) {
                i11 = cookSetup.hashCode();
            } else {
                i11 = 0;
            }
            int i15 = (i14 + i11) * 37;
            CookStatus cookStatus = this.status;
            if (cookStatus != null) {
                i13 = cookStatus.hashCode();
            }
            int i16 = i15 + i13;
            ((Message) this).hashCode = i16;
            return i16;
        }
        return i12;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.parentIdentifier != null) {
            sb.append(", parentIdentifier=");
            sb.append(this.parentIdentifier);
        }
        if (this.setup != null) {
            sb.append(", setup=");
            sb.append(this.setup);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "MLProbe{");
        replace.append('}');
        return replace.toString();
    }

    public MLProbe(Long l10, CookSetup cookSetup, CookStatus cookStatus, h hVar) {
        super(ADAPTER, hVar);
        this.parentIdentifier = l10;
        this.setup = cookSetup;
        this.status = cookStatus;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m263newBuilder() {
        Builder builder = new Builder();
        builder.parentIdentifier = this.parentIdentifier;
        builder.setup = this.setup;
        builder.status = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
