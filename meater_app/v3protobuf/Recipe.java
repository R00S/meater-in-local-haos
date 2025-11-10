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
public final class Recipe extends Message<Recipe, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long ongoingRecipeID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer recipeID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer sequenceNumber;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer step;
    public static final ProtoAdapter<Recipe> ADAPTER = new ProtoAdapter_Recipe();
    public static final Integer DEFAULT_SEQUENCENUMBER = 0;
    public static final Integer DEFAULT_RECIPEID = 0;
    public static final Integer DEFAULT_STEP = 0;
    public static final Long DEFAULT_ONGOINGRECIPEID = 0L;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<Recipe, Builder> {
        public Long ongoingRecipeID;
        public Integer recipeID;
        public Integer sequenceNumber;
        public Integer step;

        public Builder ongoingRecipeID(Long l10) {
            this.ongoingRecipeID = l10;
            return this;
        }

        public Builder recipeID(Integer num) {
            this.recipeID = num;
            return this;
        }

        public Builder sequenceNumber(Integer num) {
            this.sequenceNumber = num;
            return this;
        }

        public Builder step(Integer num) {
            this.step = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public Recipe m357build() {
            Integer num = this.sequenceNumber;
            if (num != null && this.recipeID != null && this.step != null && this.ongoingRecipeID != null) {
                return new Recipe(this.sequenceNumber, this.recipeID, this.step, this.ongoingRecipeID, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "sequenceNumber", this.recipeID, "recipeID", this.step, "step", this.ongoingRecipeID, "ongoingRecipeID"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_Recipe extends ProtoAdapter<Recipe> {
        ProtoAdapter_Recipe() {
            super(FieldEncoding.LENGTH_DELIMITED, Recipe.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public Recipe m358decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m357build();
                }
                if (nextTag == 1) {
                    builder.sequenceNumber((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.recipeID((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.step((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.ongoingRecipeID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, Recipe recipe) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, recipe.sequenceNumber);
            protoAdapter.encodeWithTag(protoWriter, 2, recipe.recipeID);
            protoAdapter.encodeWithTag(protoWriter, 3, recipe.step);
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 4, recipe.ongoingRecipeID);
            protoWriter.writeBytes(recipe.unknownFields());
        }

        public int encodedSize(Recipe recipe) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            return protoAdapter.encodedSizeWithTag(1, recipe.sequenceNumber) + protoAdapter.encodedSizeWithTag(2, recipe.recipeID) + protoAdapter.encodedSizeWithTag(3, recipe.step) + ProtoAdapter.FIXED64.encodedSizeWithTag(4, recipe.ongoingRecipeID) + recipe.unknownFields().I();
        }

        public Recipe redact(Recipe recipe) {
            Builder m356newBuilder = recipe.m356newBuilder();
            m356newBuilder.clearUnknownFields();
            return m356newBuilder.m357build();
        }
    }

    public Recipe(Integer num, Integer num2, Integer num3, Long l10) {
        this(num, num2, num3, l10, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Recipe)) {
            return false;
        }
        Recipe recipe = (Recipe) obj;
        if (Internal.equals(unknownFields(), recipe.unknownFields()) && Internal.equals(this.sequenceNumber, recipe.sequenceNumber) && Internal.equals(this.recipeID, recipe.recipeID) && Internal.equals(this.step, recipe.step) && Internal.equals(this.ongoingRecipeID, recipe.ongoingRecipeID)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((Message) this).hashCode;
        if (i13 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.sequenceNumber;
            int i14 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i15 = (hashCode + i10) * 37;
            Integer num2 = this.recipeID;
            if (num2 != null) {
                i11 = num2.hashCode();
            } else {
                i11 = 0;
            }
            int i16 = (i15 + i11) * 37;
            Integer num3 = this.step;
            if (num3 != null) {
                i12 = num3.hashCode();
            } else {
                i12 = 0;
            }
            int i17 = (i16 + i12) * 37;
            Long l10 = this.ongoingRecipeID;
            if (l10 != null) {
                i14 = l10.hashCode();
            }
            int i18 = i17 + i14;
            ((Message) this).hashCode = i18;
            return i18;
        }
        return i13;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sequenceNumber != null) {
            sb.append(", sequenceNumber=");
            sb.append(this.sequenceNumber);
        }
        if (this.recipeID != null) {
            sb.append(", recipeID=");
            sb.append(this.recipeID);
        }
        if (this.step != null) {
            sb.append(", step=");
            sb.append(this.step);
        }
        if (this.ongoingRecipeID != null) {
            sb.append(", ongoingRecipeID=");
            sb.append(this.ongoingRecipeID);
        }
        StringBuilder replace = sb.replace(0, 2, "Recipe{");
        replace.append('}');
        return replace.toString();
    }

    public Recipe(Integer num, Integer num2, Integer num3, Long l10, h hVar) {
        super(ADAPTER, hVar);
        this.sequenceNumber = num;
        this.recipeID = num2;
        this.step = num3;
        this.ongoingRecipeID = l10;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m356newBuilder() {
        Builder builder = new Builder();
        builder.sequenceNumber = this.sequenceNumber;
        builder.recipeID = this.recipeID;
        builder.step = this.step;
        builder.ongoingRecipeID = this.ongoingRecipeID;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
