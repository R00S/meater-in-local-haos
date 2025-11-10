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
public final class SetupMessage extends Message<SetupMessage, Builder> {
    public static final ProtoAdapter<SetupMessage> ADAPTER = new ProtoAdapter_SetupMessage();
    public static final Long DEFAULT_DEVICEID = 0L;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long deviceID;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.CookSetup#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final CookSetup setup;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<SetupMessage, Builder> {
        public Long deviceID;
        public CookSetup setup;

        public Builder deviceID(Long l10) {
            this.deviceID = l10;
            return this;
        }

        public Builder setup(CookSetup cookSetup) {
            this.setup = cookSetup;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public SetupMessage m363build() {
            Long l10 = this.deviceID;
            if (l10 != null && this.setup != null) {
                return new SetupMessage(this.deviceID, this.setup, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "deviceID", this.setup, "setup"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_SetupMessage extends ProtoAdapter<SetupMessage> {
        ProtoAdapter_SetupMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, SetupMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public SetupMessage m364decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m363build();
                }
                if (nextTag == 1) {
                    builder.deviceID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.setup((CookSetup) CookSetup.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, SetupMessage setupMessage) {
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, setupMessage.deviceID);
            CookSetup.ADAPTER.encodeWithTag(protoWriter, 2, setupMessage.setup);
            protoWriter.writeBytes(setupMessage.unknownFields());
        }

        public int encodedSize(SetupMessage setupMessage) {
            return ProtoAdapter.FIXED64.encodedSizeWithTag(1, setupMessage.deviceID) + CookSetup.ADAPTER.encodedSizeWithTag(2, setupMessage.setup) + setupMessage.unknownFields().I();
        }

        public SetupMessage redact(SetupMessage setupMessage) {
            Builder m362newBuilder = setupMessage.m362newBuilder();
            CookSetup cookSetup = m362newBuilder.setup;
            if (cookSetup != null) {
                m362newBuilder.setup = (CookSetup) CookSetup.ADAPTER.redact(cookSetup);
            }
            m362newBuilder.clearUnknownFields();
            return m362newBuilder.m363build();
        }
    }

    public SetupMessage(Long l10, CookSetup cookSetup) {
        this(l10, cookSetup, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetupMessage)) {
            return false;
        }
        SetupMessage setupMessage = (SetupMessage) obj;
        if (Internal.equals(unknownFields(), setupMessage.unknownFields()) && Internal.equals(this.deviceID, setupMessage.deviceID) && Internal.equals(this.setup, setupMessage.setup)) {
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
            CookSetup cookSetup = this.setup;
            if (cookSetup != null) {
                i12 = cookSetup.hashCode();
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
        StringBuilder replace = sb.replace(0, 2, "SetupMessage{");
        replace.append('}');
        return replace.toString();
    }

    public SetupMessage(Long l10, CookSetup cookSetup, h hVar) {
        super(ADAPTER, hVar);
        this.deviceID = l10;
        this.setup = cookSetup;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m362newBuilder() {
        Builder builder = new Builder();
        builder.deviceID = this.deviceID;
        builder.setup = this.setup;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
