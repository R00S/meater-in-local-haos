package com.aptoide.aptoide_ab_testing.model;

import cm.aptoide.p092pt.aab.C1152a;
import com.google.gson.C8573l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: FlagrJson.kt */
@Metadata(m32266d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\r\u0010 \u001a\u00060\u0006j\u0002`\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Jc\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\b\u0002\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016¨\u0006,"}, m32267d2 = {"Lcom/aptoide/aptoide_ab_testing/model/EvalContext;", HttpUrl.FRAGMENT_ENCODE_SET, "entityID", HttpUrl.FRAGMENT_ENCODE_SET, "entityType", "entityContext", "Lcom/google/gson/JsonObject;", "Lcom/aptoide/aptoide_ab_testing/model/VariantAttachment;", "enableDebug", HttpUrl.FRAGMENT_ENCODE_SET, "flagID", HttpUrl.FRAGMENT_ENCODE_SET, "flagKey", "flagTags", HttpUrl.FRAGMENT_ENCODE_SET, "flagTagsOperator", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonObject;ZJLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getEnableDebug", "()Z", "getEntityContext", "()Lcom/google/gson/JsonObject;", "getEntityID", "()Ljava/lang/String;", "getEntityType", "getFlagID", "()J", "getFlagKey", "getFlagTags", "()Ljava/util/List;", "getFlagTagsOperator", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "aptoide-ab-testing"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class EvalContext {
    private final boolean enableDebug;
    private final C8573l entityContext;
    private final String entityID;
    private final String entityType;
    private final long flagID;
    private final String flagKey;
    private final List<String> flagTags;
    private final String flagTagsOperator;

    public EvalContext(String str, String str2, C8573l c8573l, boolean z, long j2, String str3, List<String> list, String str4) {
        C9801m.m32346f(str, "entityID");
        C9801m.m32346f(str2, "entityType");
        C9801m.m32346f(c8573l, "entityContext");
        C9801m.m32346f(str3, "flagKey");
        C9801m.m32346f(list, "flagTags");
        C9801m.m32346f(str4, "flagTagsOperator");
        this.entityID = str;
        this.entityType = str2;
        this.entityContext = c8573l;
        this.enableDebug = z;
        this.flagID = j2;
        this.flagKey = str3;
        this.flagTags = list;
        this.flagTagsOperator = str4;
    }

    /* renamed from: component1, reason: from getter */
    public final String getEntityID() {
        return this.entityID;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEntityType() {
        return this.entityType;
    }

    /* renamed from: component3, reason: from getter */
    public final C8573l getEntityContext() {
        return this.entityContext;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnableDebug() {
        return this.enableDebug;
    }

    /* renamed from: component5, reason: from getter */
    public final long getFlagID() {
        return this.flagID;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFlagKey() {
        return this.flagKey;
    }

    public final List<String> component7() {
        return this.flagTags;
    }

    /* renamed from: component8, reason: from getter */
    public final String getFlagTagsOperator() {
        return this.flagTagsOperator;
    }

    public final EvalContext copy(String str, String str2, C8573l c8573l, boolean z, long j2, String str3, List<String> list, String str4) {
        C9801m.m32346f(str, "entityID");
        C9801m.m32346f(str2, "entityType");
        C9801m.m32346f(c8573l, "entityContext");
        C9801m.m32346f(str3, "flagKey");
        C9801m.m32346f(list, "flagTags");
        C9801m.m32346f(str4, "flagTagsOperator");
        return new EvalContext(str, str2, c8573l, z, j2, str3, list, str4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvalContext)) {
            return false;
        }
        EvalContext evalContext = (EvalContext) other;
        return C9801m.m32341a(this.entityID, evalContext.entityID) && C9801m.m32341a(this.entityType, evalContext.entityType) && C9801m.m32341a(this.entityContext, evalContext.entityContext) && this.enableDebug == evalContext.enableDebug && this.flagID == evalContext.flagID && C9801m.m32341a(this.flagKey, evalContext.flagKey) && C9801m.m32341a(this.flagTags, evalContext.flagTags) && C9801m.m32341a(this.flagTagsOperator, evalContext.flagTagsOperator);
    }

    public final boolean getEnableDebug() {
        return this.enableDebug;
    }

    public final C8573l getEntityContext() {
        return this.entityContext;
    }

    public final String getEntityID() {
        return this.entityID;
    }

    public final String getEntityType() {
        return this.entityType;
    }

    public final long getFlagID() {
        return this.flagID;
    }

    public final String getFlagKey() {
        return this.flagKey;
    }

    public final List<String> getFlagTags() {
        return this.flagTags;
    }

    public final String getFlagTagsOperator() {
        return this.flagTagsOperator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((this.entityID.hashCode() * 31) + this.entityType.hashCode()) * 31) + this.entityContext.hashCode()) * 31;
        boolean z = this.enableDebug;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return ((((((((iHashCode + i2) * 31) + C1152a.m6829a(this.flagID)) * 31) + this.flagKey.hashCode()) * 31) + this.flagTags.hashCode()) * 31) + this.flagTagsOperator.hashCode();
    }

    public String toString() {
        return "EvalContext(entityID=" + this.entityID + ", entityType=" + this.entityType + ", entityContext=" + this.entityContext + ", enableDebug=" + this.enableDebug + ", flagID=" + this.flagID + ", flagKey=" + this.flagKey + ", flagTags=" + this.flagTags + ", flagTagsOperator=" + this.flagTagsOperator + ')';
    }
}
