package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes2.dex */
public final class zzays {

    /* renamed from: a */
    public final String f22691a;

    /* renamed from: b */
    private final double f22692b;

    /* renamed from: c */
    private final double f22693c;

    /* renamed from: d */
    public final double f22694d;

    /* renamed from: e */
    public final int f22695e;

    public zzays(String str, double d2, double d3, double d4, int i2) {
        this.f22691a = str;
        this.f22693c = d2;
        this.f22692b = d3;
        this.f22694d = d4;
        this.f22695e = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzays)) {
            return false;
        }
        zzays zzaysVar = (zzays) obj;
        return Objects.m14355a(this.f22691a, zzaysVar.f22691a) && this.f22692b == zzaysVar.f22692b && this.f22693c == zzaysVar.f22693c && this.f22695e == zzaysVar.f22695e && Double.compare(this.f22694d, zzaysVar.f22694d) == 0;
    }

    public final int hashCode() {
        return Objects.m14356b(this.f22691a, Double.valueOf(this.f22692b), Double.valueOf(this.f22693c), Double.valueOf(this.f22694d), Integer.valueOf(this.f22695e));
    }

    public final String toString() {
        return Objects.m14357c(this).m14358a("name", this.f22691a).m14358a("minBound", Double.valueOf(this.f22693c)).m14358a("maxBound", Double.valueOf(this.f22692b)).m14358a("percent", Double.valueOf(this.f22694d)).m14358a("count", Integer.valueOf(this.f22695e)).toString();
    }
}
