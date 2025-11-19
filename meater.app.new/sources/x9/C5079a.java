package x9;

import v9.C4925a;

/* compiled from: FirebasePerfApplicationInfoValidator.java */
/* renamed from: x9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5079a extends e {

    /* renamed from: b, reason: collision with root package name */
    private static final C4925a f52902b = C4925a.e();

    /* renamed from: a, reason: collision with root package name */
    private final C9.c f52903a;

    C5079a(C9.c cVar) {
        this.f52903a = cVar;
    }

    private boolean g() {
        C9.c cVar = this.f52903a;
        if (cVar == null) {
            f52902b.j("ApplicationInfo is null");
            return false;
        }
        if (!cVar.m0()) {
            f52902b.j("GoogleAppId is null");
            return false;
        }
        if (!this.f52903a.k0()) {
            f52902b.j("AppInstanceId is null");
            return false;
        }
        if (!this.f52903a.l0()) {
            f52902b.j("ApplicationProcessState is null");
            return false;
        }
        if (!this.f52903a.j0()) {
            return true;
        }
        if (!this.f52903a.g0().f0()) {
            f52902b.j("AndroidAppInfo.packageName is null");
            return false;
        }
        if (this.f52903a.g0().g0()) {
            return true;
        }
        f52902b.j("AndroidAppInfo.sdkVersion is null");
        return false;
    }

    @Override // x9.e
    public boolean c() {
        if (g()) {
            return true;
        }
        f52902b.j("ApplicationInfo is invalid");
        return false;
    }
}
