package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes2.dex */
public final class zai<O extends Api.ApiOptions> {

    /* renamed from: a */
    private final boolean f17586a;

    /* renamed from: b */
    private final int f17587b;

    /* renamed from: c */
    private final Api<O> f17588c;

    /* renamed from: d */
    private final O f17589d;

    private zai(Api<O> api, O o) {
        this.f17586a = false;
        this.f17588c = api;
        this.f17589d = o;
        this.f17587b = Objects.m14356b(api, o);
    }

    /* renamed from: a */
    public static <O extends Api.ApiOptions> zai<O> m14206a(Api<O> api) {
        return new zai<>(api);
    }

    /* renamed from: b */
    public static <O extends Api.ApiOptions> zai<O> m14207b(Api<O> api, O o) {
        return new zai<>(api, o);
    }

    /* renamed from: c */
    public final String m14208c() {
        return this.f17588c.m13839b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zai)) {
            return false;
        }
        zai zaiVar = (zai) obj;
        return !this.f17586a && !zaiVar.f17586a && Objects.m14355a(this.f17588c, zaiVar.f17588c) && Objects.m14355a(this.f17589d, zaiVar.f17589d);
    }

    public final int hashCode() {
        return this.f17587b;
    }

    private zai(Api<O> api) {
        this.f17586a = true;
        this.f17588c = api;
        this.f17589d = null;
        this.f17587b = System.identityHashCode(this);
    }
}
