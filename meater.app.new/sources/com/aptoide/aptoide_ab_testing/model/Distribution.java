package com.aptoide.aptoide_ab_testing.model;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.aab.C1152a;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: FlagrJson.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m32267d2 = {"Lcom/aptoide/aptoide_ab_testing/model/Distribution;", HttpUrl.FRAGMENT_ENCODE_SET, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, HttpUrl.FRAGMENT_ENCODE_SET, "percent", "variantKey", HttpUrl.FRAGMENT_ENCODE_SET, "variantID", "(JJLjava/lang/String;J)V", "getId", "()J", "getPercent", "getVariantID", "getVariantKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "aptoide-ab-testing"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Distribution {
    private final long id;
    private final long percent;
    private final long variantID;
    private final String variantKey;

    public Distribution(long j2, long j3, String str, long j4) {
        C9801m.m32346f(str, "variantKey");
        this.id = j2;
        this.percent = j3;
        this.variantKey = str;
        this.variantID = j4;
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getPercent() {
        return this.percent;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVariantKey() {
        return this.variantKey;
    }

    /* renamed from: component4, reason: from getter */
    public final long getVariantID() {
        return this.variantID;
    }

    public final Distribution copy(long id, long percent, String variantKey, long variantID) {
        C9801m.m32346f(variantKey, "variantKey");
        return new Distribution(id, percent, variantKey, variantID);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Distribution)) {
            return false;
        }
        Distribution distribution = (Distribution) other;
        return this.id == distribution.id && this.percent == distribution.percent && C9801m.m32341a(this.variantKey, distribution.variantKey) && this.variantID == distribution.variantID;
    }

    public final long getId() {
        return this.id;
    }

    public final long getPercent() {
        return this.percent;
    }

    public final long getVariantID() {
        return this.variantID;
    }

    public final String getVariantKey() {
        return this.variantKey;
    }

    public int hashCode() {
        return (((((C1152a.m6829a(this.id) * 31) + C1152a.m6829a(this.percent)) * 31) + this.variantKey.hashCode()) * 31) + C1152a.m6829a(this.variantID);
    }

    public String toString() {
        return "Distribution(id=" + this.id + ", percent=" + this.percent + ", variantKey=" + this.variantKey + ", variantID=" + this.variantID + ')';
    }
}
