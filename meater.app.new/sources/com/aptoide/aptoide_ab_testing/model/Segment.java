package com.aptoide.aptoide_ab_testing.model;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.aab.C1152a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: FlagrJson.kt */
@Metadata(m32266d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006$"}, m32267d2 = {"Lcom/aptoide/aptoide_ab_testing/model/Segment;", HttpUrl.FRAGMENT_ENCODE_SET, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, HttpUrl.FRAGMENT_ENCODE_SET, "description", HttpUrl.FRAGMENT_ENCODE_SET, "constraints", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/aptoide/aptoide_ab_testing/model/Constraint;", "distributions", "Lcom/aptoide/aptoide_ab_testing/model/Distribution;", "rank", "rolloutPercent", "(JLjava/lang/String;Ljava/util/List;Ljava/util/List;JJ)V", "getConstraints", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getDistributions", "getId", "()J", "getRank", "getRolloutPercent", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "aptoide-ab-testing"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Segment {
    private final List<Constraint> constraints;
    private final String description;
    private final List<Distribution> distributions;
    private final long id;
    private final long rank;
    private final long rolloutPercent;

    public Segment(long j2, String str, List<Constraint> list, List<Distribution> list2, long j3, long j4) {
        C9801m.m32346f(str, "description");
        C9801m.m32346f(list, "constraints");
        C9801m.m32346f(list2, "distributions");
        this.id = j2;
        this.description = str;
        this.constraints = list;
        this.distributions = list2;
        this.rank = j3;
        this.rolloutPercent = j4;
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<Constraint> component3() {
        return this.constraints;
    }

    public final List<Distribution> component4() {
        return this.distributions;
    }

    /* renamed from: component5, reason: from getter */
    public final long getRank() {
        return this.rank;
    }

    /* renamed from: component6, reason: from getter */
    public final long getRolloutPercent() {
        return this.rolloutPercent;
    }

    public final Segment copy(long id, String description, List<Constraint> constraints, List<Distribution> distributions, long rank, long rolloutPercent) {
        C9801m.m32346f(description, "description");
        C9801m.m32346f(constraints, "constraints");
        C9801m.m32346f(distributions, "distributions");
        return new Segment(id, description, constraints, distributions, rank, rolloutPercent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Segment)) {
            return false;
        }
        Segment segment = (Segment) other;
        return this.id == segment.id && C9801m.m32341a(this.description, segment.description) && C9801m.m32341a(this.constraints, segment.constraints) && C9801m.m32341a(this.distributions, segment.distributions) && this.rank == segment.rank && this.rolloutPercent == segment.rolloutPercent;
    }

    public final List<Constraint> getConstraints() {
        return this.constraints;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<Distribution> getDistributions() {
        return this.distributions;
    }

    public final long getId() {
        return this.id;
    }

    public final long getRank() {
        return this.rank;
    }

    public final long getRolloutPercent() {
        return this.rolloutPercent;
    }

    public int hashCode() {
        return (((((((((C1152a.m6829a(this.id) * 31) + this.description.hashCode()) * 31) + this.constraints.hashCode()) * 31) + this.distributions.hashCode()) * 31) + C1152a.m6829a(this.rank)) * 31) + C1152a.m6829a(this.rolloutPercent);
    }

    public String toString() {
        return "Segment(id=" + this.id + ", description=" + this.description + ", constraints=" + this.constraints + ", distributions=" + this.distributions + ", rank=" + this.rank + ", rolloutPercent=" + this.rolloutPercent + ')';
    }
}
