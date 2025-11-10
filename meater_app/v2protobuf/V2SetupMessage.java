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
public final class V2SetupMessage extends Message<V2SetupMessage, Builder> {
    public static final ProtoAdapter<V2SetupMessage> ADAPTER = new ProtoAdapter_V2SetupMessage();
    public static final Long DEFAULT_DEVICEID = 0L;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long deviceID;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2ProbeSetup#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final V2ProbeSetup setup;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2SetupMessage, Builder> {
        public Long deviceID;
        public V2ProbeSetup setup;

        public Builder deviceID(Long l10) {
            this.deviceID = l10;
            return this;
        }

        public Builder setup(V2ProbeSetup v2ProbeSetup) {
            this.setup = v2ProbeSetup;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2SetupMessage m117build() {
            Long l10 = this.deviceID;
            if (l10 != null && this.setup != null) {
                return new V2SetupMessage(this.deviceID, this.setup, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "deviceID", this.setup, "setup"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2SetupMessage extends ProtoAdapter<V2SetupMessage> {
        ProtoAdapter_V2SetupMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, V2SetupMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2SetupMessage m118decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m117build();
                }
                if (nextTag == 1) {
                    builder.deviceID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.setup((V2ProbeSetup) V2ProbeSetup.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2SetupMessage v2SetupMessage) {
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, v2SetupMessage.deviceID);
            V2ProbeSetup.ADAPTER.encodeWithTag(protoWriter, 2, v2SetupMessage.setup);
            protoWriter.writeBytes(v2SetupMessage.unknownFields());
        }

        public int encodedSize(V2SetupMessage v2SetupMessage) {
            return ProtoAdapter.FIXED64.encodedSizeWithTag(1, v2SetupMessage.deviceID) + V2ProbeSetup.ADAPTER.encodedSizeWithTag(2, v2SetupMessage.setup) + v2SetupMessage.unknownFields().I();
        }

        public V2SetupMessage redact(V2SetupMessage v2SetupMessage) {
            Builder m116newBuilder = v2SetupMessage.m116newBuilder();
            V2ProbeSetup v2ProbeSetup = m116newBuilder.setup;
            if (v2ProbeSetup != null) {
                m116newBuilder.setup = (V2ProbeSetup) V2ProbeSetup.ADAPTER.redact(v2ProbeSetup);
            }
            m116newBuilder.clearUnknownFields();
            return m116newBuilder.m117build();
        }
    }

    public V2SetupMessage(Long l10, V2ProbeSetup v2ProbeSetup) {
        this(l10, v2ProbeSetup, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2SetupMessage)) {
            return false;
        }
        V2SetupMessage v2SetupMessage = (V2SetupMessage) obj;
        if (Internal.equals(unknownFields(), v2SetupMessage.unknownFields()) && Internal.equals(this.deviceID, v2SetupMessage.deviceID) && Internal.equals(this.setup, v2SetupMessage.setup)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Long l10 = this.deviceID;
            int i12 = 0;
            if (l10 != null) {
                i10 = l10.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (hashCode + i10) * 37;
            V2ProbeSetup v2ProbeSetup = this.setup;
            if (v2ProbeSetup != null) {
                i12 = v2ProbeSetup.hashCode();
            }
            int i14 = i13 + i12;
            ((Message) this).hashCode = i14;
            return i14;
        }
        return i11;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.deviceID != null) {
            sb.append(", deviceID=");
            sb.append(this.deviceID);
        }
        if (this.setup != null) {
            sb.append(", setup=");
            sb.append(this.setup);
        }
        StringBuilder replace = sb.replace(0, 2, "V2SetupMessage{");
        replace.append('}');
        return replace.toString();
    }

    public V2SetupMessage(Long l10, V2ProbeSetup v2ProbeSetup, h hVar) {
        super(ADAPTER, hVar);
        this.deviceID = l10;
        this.setup = v2ProbeSetup;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m116newBuilder() {
        Builder builder = new Builder();
        builder.deviceID = this.deviceID;
        builder.setup = this.setup;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
