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
public final class OngoingRecipeSubscriptionMessage extends Message<OngoingRecipeSubscriptionMessage, Builder> {
    public static final ProtoAdapter<OngoingRecipeSubscriptionMessage> ADAPTER = new ProtoAdapter_OngoingRecipeSubscriptionMessage();
    public static final Long DEFAULT_ONGOINGRECIPEID = 0L;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long ongoingRecipeID;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<OngoingRecipeSubscriptionMessage, Builder> {
        public Long ongoingRecipeID;

        public Builder ongoingRecipeID(Long l10) {
            this.ongoingRecipeID = l10;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public OngoingRecipeSubscriptionMessage m309build() {
            Long l10 = this.ongoingRecipeID;
            if (l10 != null) {
                return new OngoingRecipeSubscriptionMessage(this.ongoingRecipeID, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "ongoingRecipeID"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_OngoingRecipeSubscriptionMessage extends ProtoAdapter<OngoingRecipeSubscriptionMessage> {
        ProtoAdapter_OngoingRecipeSubscriptionMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, OngoingRecipeSubscriptionMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public OngoingRecipeSubscriptionMessage m310decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m309build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.ongoingRecipeID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, OngoingRecipeSubscriptionMessage ongoingRecipeSubscriptionMessage) {
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, ongoingRecipeSubscriptionMessage.ongoingRecipeID);
            protoWriter.writeBytes(ongoingRecipeSubscriptionMessage.unknownFields());
        }

        public int encodedSize(OngoingRecipeSubscriptionMessage ongoingRecipeSubscriptionMessage) {
            return ProtoAdapter.FIXED64.encodedSizeWithTag(1, ongoingRecipeSubscriptionMessage.ongoingRecipeID) + ongoingRecipeSubscriptionMessage.unknownFields().I();
        }

        public OngoingRecipeSubscriptionMessage redact(OngoingRecipeSubscriptionMessage ongoingRecipeSubscriptionMessage) {
            Builder m308newBuilder = ongoingRecipeSubscriptionMessage.m308newBuilder();
            m308newBuilder.clearUnknownFields();
            return m308newBuilder.m309build();
        }
    }

    public OngoingRecipeSubscriptionMessage(Long l10) {
        this(l10, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OngoingRecipeSubscriptionMessage)) {
            return false;
        }
        OngoingRecipeSubscriptionMessage ongoingRecipeSubscriptionMessage = (OngoingRecipeSubscriptionMessage) obj;
        if (Internal.equals(unknownFields(), ongoingRecipeSubscriptionMessage.unknownFields()) && Internal.equals(this.ongoingRecipeID, ongoingRecipeSubscriptionMessage.ongoingRecipeID)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Long l10 = this.ongoingRecipeID;
            if (l10 != null) {
                i10 = l10.hashCode();
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
        if (this.ongoingRecipeID != null) {
            sb.append(", ongoingRecipeID=");
            sb.append(this.ongoingRecipeID);
        }
        StringBuilder replace = sb.replace(0, 2, "OngoingRecipeSubscriptionMessage{");
        replace.append('}');
        return replace.toString();
    }

    public OngoingRecipeSubscriptionMessage(Long l10, h hVar) {
        super(ADAPTER, hVar);
        this.ongoingRecipeID = l10;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m308newBuilder() {
        Builder builder = new Builder();
        builder.ongoingRecipeID = this.ongoingRecipeID;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
