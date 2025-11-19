package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2497i1;
import java.util.List;
import java.util.Map;
import v7.W;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.2.0 */
/* loaded from: classes2.dex */
final class a implements W {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2497i1 f38078a;

    a(C2497i1 c2497i1) {
        this.f38078a = c2497i1;
    }

    @Override // v7.W
    public final void a(String str, String str2, Bundle bundle) {
        this.f38078a.t(str, str2, bundle);
    }

    @Override // v7.W
    public final void b(String str) {
        this.f38078a.B(str);
    }

    @Override // v7.W
    public final int c(String str) {
        return this.f38078a.a(str);
    }

    @Override // v7.W
    public final List<Bundle> d(String str, String str2) {
        return this.f38078a.g(str, str2);
    }

    @Override // v7.W
    public final String e() {
        return this.f38078a.K();
    }

    @Override // v7.W
    public final Map<String, Object> f(String str, String str2, boolean z10) {
        return this.f38078a.h(str, str2, z10);
    }

    @Override // v7.W
    public final String g() {
        return this.f38078a.I();
    }

    @Override // v7.W
    public final void h(Bundle bundle) {
        this.f38078a.k(bundle);
    }

    @Override // v7.W
    public final long i() {
        return this.f38078a.b();
    }

    @Override // v7.W
    public final String j() {
        return this.f38078a.J();
    }

    @Override // v7.W
    public final String k() {
        return this.f38078a.L();
    }

    @Override // v7.W
    public final void l(String str, String str2, Bundle bundle) {
        this.f38078a.D(str, str2, bundle);
    }

    @Override // v7.W
    public final void r(String str) {
        this.f38078a.F(str);
    }
}
