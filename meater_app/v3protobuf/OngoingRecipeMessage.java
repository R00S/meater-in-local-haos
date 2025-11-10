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
public final class OngoingRecipeMessage extends Message<OngoingRecipeMessage, Builder> {
    public static final ProtoAdapter<OngoingRecipeMessage> ADAPTER = new ProtoAdapter_OngoingRecipeMessage();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MLRecipe#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<MLRecipe> recipes;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<OngoingRecipeMessage, Builder> {
        public List<MLRecipe> recipes = Internal.newMutableList();

        public Builder recipes(List<MLRecipe> list) {
            Internal.checkElementsNotNull(list);
            this.recipes = list;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public OngoingRecipeMessage m306build() {
            return new OngoingRecipeMessage(this.recipes, buildUnknownFields());
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_OngoingRecipeMessage extends ProtoAdapter<OngoingRecipeMessage> {
        ProtoAdapter_OngoingRecipeMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, OngoingRecipeMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public OngoingRecipeMessage m307decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m306build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.recipes.add((MLRecipe) MLRecipe.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, OngoingRecipeMessage ongoingRecipeMessage) {
            if (ongoingRecipeMessage.recipes != null) {
                MLRecipe.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, ongoingRecipeMessage.recipes);
            }
            protoWriter.writeBytes(ongoingRecipeMessage.unknownFields());
        }

        public int encodedSize(OngoingRecipeMessage ongoingRecipeMessage) {
            return MLRecipe.ADAPTER.asRepeated().encodedSizeWithTag(1, ongoingRecipeMessage.recipes) + ongoingRecipeMessage.unknownFields().I();
        }

        public OngoingRecipeMessage redact(OngoingRecipeMessage ongoingRecipeMessage) {
            Builder m305newBuilder = ongoingRecipeMessage.m305newBuilder();
            Internal.redactElements(m305newBuilder.recipes, MLRecipe.ADAPTER);
            m305newBuilder.clearUnknownFields();
            return m305newBuilder.m306build();
        }
    }

    public OngoingRecipeMessage(List<MLRecipe> list) {
        this(list, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OngoingRecipeMessage)) {
            return false;
        }
        OngoingRecipeMessage ongoingRecipeMessage = (OngoingRecipeMessage) obj;
        if (Internal.equals(unknownFields(), ongoingRecipeMessage.unknownFields()) && Internal.equals(this.recipes, ongoingRecipeMessage.recipes)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            List<MLRecipe> list = this.recipes;
            if (list != null) {
                i10 = list.hashCode();
            } else {
                i10 = 1;
            }
            int i12 = hashCode + i10;
            ((Message) this).hashCode = i12;
            return i12;
        }
        return i11;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.recipes != null) {
            sb.append(", recipes=");
            sb.append(this.recipes);
        }
        StringBuilder replace = sb.replace(0, 2, "OngoingRecipeMessage{");
        replace.append('}');
        return replace.toString();
    }

    public OngoingRecipeMessage(List<MLRecipe> list, h hVar) {
        super(ADAPTER, hVar);
        this.recipes = Internal.immutableCopyOf("recipes", list);
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m305newBuilder() {
        Builder builder = new Builder();
        builder.recipes = Internal.copyOf("recipes", this.recipes);
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
