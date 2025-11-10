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
public final class V2AmberSessionMessage extends Message<V2AmberSessionMessage, Builder> {
    public static final ProtoAdapter<V2AmberSessionMessage> ADAPTER = new ProtoAdapter_V2AmberSessionMessage();
    public static final Long DEFAULT_DEVICEID = 0L;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long deviceID;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2AmberSession#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final V2AmberSession session;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2AmberSessionMessage, Builder> {
        public Long deviceID;
        public V2AmberSession session;

        public Builder deviceID(Long l10) {
            this.deviceID = l10;
            return this;
        }

        public Builder session(V2AmberSession v2AmberSession) {
            this.session = v2AmberSession;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2AmberSessionMessage m54build() {
            Long l10 = this.deviceID;
            if (l10 != null && this.session != null) {
                return new V2AmberSessionMessage(this.deviceID, this.session, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "deviceID", this.session, "session"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2AmberSessionMessage extends ProtoAdapter<V2AmberSessionMessage> {
        ProtoAdapter_V2AmberSessionMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, V2AmberSessionMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2AmberSessionMessage m55decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m54build();
                }
                if (nextTag == 1) {
                    builder.deviceID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.session((V2AmberSession) V2AmberSession.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2AmberSessionMessage v2AmberSessionMessage) {
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, v2AmberSessionMessage.deviceID);
            V2AmberSession.ADAPTER.encodeWithTag(protoWriter, 2, v2AmberSessionMessage.session);
            protoWriter.writeBytes(v2AmberSessionMessage.unknownFields());
        }

        public int encodedSize(V2AmberSessionMessage v2AmberSessionMessage) {
            return ProtoAdapter.FIXED64.encodedSizeWithTag(1, v2AmberSessionMessage.deviceID) + V2AmberSession.ADAPTER.encodedSizeWithTag(2, v2AmberSessionMessage.session) + v2AmberSessionMessage.unknownFields().I();
        }

        public V2AmberSessionMessage redact(V2AmberSessionMessage v2AmberSessionMessage) {
            Builder m53newBuilder = v2AmberSessionMessage.m53newBuilder();
            V2AmberSession v2AmberSession = m53newBuilder.session;
            if (v2AmberSession != null) {
                m53newBuilder.session = (V2AmberSession) V2AmberSession.ADAPTER.redact(v2AmberSession);
            }
            m53newBuilder.clearUnknownFields();
            return m53newBuilder.m54build();
        }
    }

    public V2AmberSessionMessage(Long l10, V2AmberSession v2AmberSession) {
        this(l10, v2AmberSession, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2AmberSessionMessage)) {
            return false;
        }
        V2AmberSessionMessage v2AmberSessionMessage = (V2AmberSessionMessage) obj;
        if (Internal.equals(unknownFields(), v2AmberSessionMessage.unknownFields()) && Internal.equals(this.deviceID, v2AmberSessionMessage.deviceID) && Internal.equals(this.session, v2AmberSessionMessage.session)) {
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
            V2AmberSession v2AmberSession = this.session;
            if (v2AmberSession != null) {
                i12 = v2AmberSession.hashCode();
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
        if (this.session != null) {
            sb.append(", session=");
            sb.append(this.session);
        }
        StringBuilder replace = sb.replace(0, 2, "V2AmberSessionMessage{");
        replace.append('}');
        return replace.toString();
    }

    public V2AmberSessionMessage(Long l10, V2AmberSession v2AmberSession, h hVar) {
        super(ADAPTER, hVar);
        this.deviceID = l10;
        this.session = v2AmberSession;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m53newBuilder() {
        Builder builder = new Builder();
        builder.deviceID = this.deviceID;
        builder.session = this.session;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
