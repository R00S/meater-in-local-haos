package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes2.dex */
public class HashAccumulator {

    /* renamed from: a */
    @VisibleForTesting
    private static int f17075a = 31;

    /* renamed from: b */
    private int f17076b = 1;

    @KeepForSdk
    /* renamed from: a */
    public HashAccumulator m13697a(Object obj) {
        this.f17076b = (f17075a * this.f17076b) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @KeepForSdk
    /* renamed from: b */
    public int m13698b() {
        return this.f17076b;
    }

    /* renamed from: c */
    public final HashAccumulator m13699c(boolean z) {
        this.f17076b = (f17075a * this.f17076b) + (z ? 1 : 0);
        return this;
    }
}
