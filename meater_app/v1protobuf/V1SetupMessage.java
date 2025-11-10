package com.apptionlabs.meater_app.v1protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import ql.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public final class V1SetupMessage extends Message<V1SetupMessage, Builder> {
    public static final ProtoAdapter<V1SetupMessage> ADAPTER = new ProtoAdapter_LegacySetupMessage();
    public static final Long DEFAULT_PROBESERIALNUM = 0L;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1MeaterLinkHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final V1MeaterLinkHeader header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long probeSerialNum;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.V1ProbeSetup#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final V1ProbeSetup setup;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V1SetupMessage, Builder> {
        public V1MeaterLinkHeader header;
        public Long probeSerialNum;
        public V1ProbeSetup setup;

        public Builder header(V1MeaterLinkHeader v1MeaterLinkHeader) {
            this.header = v1MeaterLinkHeader;
            return this;
        }

        public Builder probeSerialNum(Long l10) {
            this.probeSerialNum = l10;
            return this;
        }

        public Builder setup(V1ProbeSetup v1ProbeSetup) {
            this.setup = v1ProbeSetup;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V1SetupMessage m33build() {
            V1MeaterLinkHeader v1MeaterLinkHeader = this.header;
            if (v1MeaterLinkHeader != null && this.probeSerialNum != null && this.setup != null) {
                return new V1SetupMessage(this.header, this.probeSerialNum, this.setup, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{v1MeaterLinkHeader, "header", this.probeSerialNum, "probeSerialNum", this.setup, "setup"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_LegacySetupMessage extends ProtoAdapter<V1SetupMessage> {
        ProtoAdapter_LegacySetupMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, V1SetupMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V1SetupMessage m34decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m33build();
                }
                if (nextTag == 1) {
                    builder.header((V1MeaterLinkHeader) V1MeaterLinkHeader.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.probeSerialNum((Long) ProtoAdapter.UINT64.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.setup((V1ProbeSetup) V1ProbeSetup.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V1SetupMessage v1SetupMessage) {
            V1MeaterLinkHeader.ADAPTER.encodeWithTag(protoWriter, 1, v1SetupMessage.header);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 2, v1SetupMessage.probeSerialNum);
            V1ProbeSetup.ADAPTER.encodeWithTag(protoWriter, 3, v1SetupMessage.setup);
            protoWriter.writeBytes(v1SetupMessage.unknownFields());
        }

        public int encodedSize(V1SetupMessage v1SetupMessage) {
            return V1MeaterLinkHeader.ADAPTER.encodedSizeWithTag(1, v1SetupMessage.header) + ProtoAdapter.UINT64.encodedSizeWithTag(2, v1SetupMessage.probeSerialNum) + V1ProbeSetup.ADAPTER.encodedSizeWithTag(3, v1SetupMessage.setup) + v1SetupMessage.unknownFields().I();
        }

        public V1SetupMessage redact(V1SetupMessage v1SetupMessage) {
            Builder m32newBuilder = v1SetupMessage.m32newBuilder();
            V1MeaterLinkHeader v1MeaterLinkHeader = m32newBuilder.header;
            if (v1MeaterLinkHeader != null) {
                m32newBuilder.header = (V1MeaterLinkHeader) V1MeaterLinkHeader.ADAPTER.redact(v1MeaterLinkHeader);
            }
            V1ProbeSetup v1ProbeSetup = m32newBuilder.setup;
            if (v1ProbeSetup != null) {
                m32newBuilder.setup = (V1ProbeSetup) V1ProbeSetup.ADAPTER.redact(v1ProbeSetup);
            }
            m32newBuilder.clearUnknownFields();
            return m32newBuilder.m33build();
        }
    }

    public V1SetupMessage(V1MeaterLinkHeader v1MeaterLinkHeader, Long l10, V1ProbeSetup v1ProbeSetup) {
        this(v1MeaterLinkHeader, l10, v1ProbeSetup, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1SetupMessage)) {
            return false;
        }
        V1SetupMessage v1SetupMessage = (V1SetupMessage) obj;
        if (Internal.equals(unknownFields(), v1SetupMessage.unknownFields()) && Internal.equals(this.header, v1SetupMessage.header) && Internal.equals(this.probeSerialNum, v1SetupMessage.probeSerialNum) && Internal.equals(this.setup, v1SetupMessage.setup)) {
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
            V1MeaterLinkHeader v1MeaterLinkHeader = this.header;
            int i13 = 0;
            if (v1MeaterLinkHeader != null) {
                i10 = v1MeaterLinkHeader.hashCode();
            } else {
                i10 = 0;
            }
            int i14 = (hashCode + i10) * 37;
            Long l10 = this.probeSerialNum;
            if (l10 != null) {
                i11 = l10.hashCode();
            } else {
                i11 = 0;
            }
            int i15 = (i14 + i11) * 37;
            V1ProbeSetup v1ProbeSetup = this.setup;
            if (v1ProbeSetup != null) {
                i13 = v1ProbeSetup.hashCode();
            }
            int i16 = i15 + i13;
            ((Message) this).hashCode = i16;
            return i16;
        }
        return i12;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.header != null) {
            sb.append(", header=");
            sb.append(this.header);
        }
        if (this.probeSerialNum != null) {
            sb.append(", probeSerialNum=");
            sb.append(this.probeSerialNum);
        }
        if (this.setup != null) {
            sb.append(", setup=");
            sb.append(this.setup);
        }
        StringBuilder replace = sb.replace(0, 2, "V1SetupMessage{");
        replace.append('}');
        return replace.toString();
    }

    public V1SetupMessage(V1MeaterLinkHeader v1MeaterLinkHeader, Long l10, V1ProbeSetup v1ProbeSetup, h hVar) {
        super(ADAPTER, hVar);
        this.header = v1MeaterLinkHeader;
        this.probeSerialNum = l10;
        this.setup = v1ProbeSetup;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m32newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.probeSerialNum = this.probeSerialNum;
        builder.setup = this.setup;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
