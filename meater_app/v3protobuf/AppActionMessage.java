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
public final class AppActionMessage extends Message<AppActionMessage, Builder> {
    public static final ProtoAdapter<AppActionMessage> ADAPTER = new ProtoAdapter_AppActionMessage();
    public static final Boolean DEFAULT_MANUALLYMOVETORESTING = Boolean.FALSE;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean manuallyMoveToResting;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<AppActionMessage, Builder> {
        public Boolean manuallyMoveToResting;

        public Builder manuallyMoveToResting(Boolean bool) {
            this.manuallyMoveToResting = bool;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public AppActionMessage m144build() {
            return new AppActionMessage(this.manuallyMoveToResting, buildUnknownFields());
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_AppActionMessage extends ProtoAdapter<AppActionMessage> {
        ProtoAdapter_AppActionMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, AppActionMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public AppActionMessage m145decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m144build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.manuallyMoveToResting((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, AppActionMessage appActionMessage) {
            Boolean bool = appActionMessage.manuallyMoveToResting;
            if (bool != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, bool);
            }
            protoWriter.writeBytes(appActionMessage.unknownFields());
        }

        public int encodedSize(AppActionMessage appActionMessage) {
            Boolean bool = appActionMessage.manuallyMoveToResting;
            return (bool != null ? ProtoAdapter.BOOL.encodedSizeWithTag(1, bool) : 0) + appActionMessage.unknownFields().I();
        }

        public AppActionMessage redact(AppActionMessage appActionMessage) {
            Builder m143newBuilder = appActionMessage.m143newBuilder();
            m143newBuilder.clearUnknownFields();
            return m143newBuilder.m144build();
        }
    }

    public AppActionMessage(Boolean bool) {
        this(bool, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppActionMessage)) {
            return false;
        }
        AppActionMessage appActionMessage = (AppActionMessage) obj;
        if (Internal.equals(unknownFields(), appActionMessage.unknownFields()) && Internal.equals(this.manuallyMoveToResting, appActionMessage.manuallyMoveToResting)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Boolean bool = this.manuallyMoveToResting;
            if (bool != null) {
                i10 = bool.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = hashCode + i10;
            ((Message) this).hashCode = i12;
            return i12;
        }
        return i11;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.manuallyMoveToResting != null) {
            sb.append(", manuallyMoveToResting=");
            sb.append(this.manuallyMoveToResting);
        }
        StringBuilder replace = sb.replace(0, 2, "AppActionMessage{");
        replace.append('}');
        return replace.toString();
    }

    public AppActionMessage(Boolean bool, h hVar) {
        super(ADAPTER, hVar);
        this.manuallyMoveToResting = bool;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m143newBuilder() {
        Builder builder = new Builder();
        builder.manuallyMoveToResting = this.manuallyMoveToResting;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
