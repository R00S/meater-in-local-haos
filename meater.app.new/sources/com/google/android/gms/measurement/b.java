package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.C2843t3;
import com.google.android.gms.measurement.internal.P2;
import g7.C3445p;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class b extends AppMeasurement.a {

    /* renamed from: a, reason: collision with root package name */
    private final P2 f34731a;

    /* renamed from: b, reason: collision with root package name */
    private final C2843t3 f34732b;

    public b(P2 p22) {
        super();
        C3445p.k(p22);
        this.f34731a = p22;
        this.f34732b = p22.J();
    }

    @Override // v7.W
    public final void a(String str, String str2, Bundle bundle) {
        this.f34731a.J().l0(str, str2, bundle);
    }

    @Override // v7.W
    public final void b(String str) {
        this.f34731a.A().B(str, this.f34731a.b().c());
    }

    @Override // v7.W
    public final int c(String str) {
        return C2843t3.G(str);
    }

    @Override // v7.W
    public final List<Bundle> d(String str, String str2) {
        return this.f34732b.I(str, str2);
    }

    @Override // v7.W
    public final String e() {
        return this.f34732b.C0();
    }

    @Override // v7.W
    public final Map<String, Object> f(String str, String str2, boolean z10) {
        return this.f34732b.J(str, str2, z10);
    }

    @Override // v7.W
    public final String g() {
        return this.f34732b.A0();
    }

    @Override // v7.W
    public final void h(Bundle bundle) {
        this.f34732b.M(bundle);
    }

    @Override // v7.W
    public final long i() {
        return this.f34731a.P().Q0();
    }

    @Override // v7.W
    public final String j() {
        return this.f34732b.B0();
    }

    @Override // v7.W
    public final String k() {
        return this.f34732b.A0();
    }

    @Override // v7.W
    public final void l(String str, String str2, Bundle bundle) {
        this.f34732b.a1(str, str2, bundle);
    }

    @Override // v7.W
    public final void r(String str) {
        this.f34731a.A().F(str, this.f34731a.b().c());
    }
}
