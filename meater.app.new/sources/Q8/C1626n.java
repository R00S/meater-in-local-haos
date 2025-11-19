package Q8;

import J9.b;

/* compiled from: CrashlyticsAppQualitySessionsSubscriber.java */
/* renamed from: Q8.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1626n implements J9.b {

    /* renamed from: a, reason: collision with root package name */
    private final G f14478a;

    /* renamed from: b, reason: collision with root package name */
    private final C1625m f14479b;

    public C1626n(G g10, W8.g gVar) {
        this.f14478a = g10;
        this.f14479b = new C1625m(gVar);
    }

    @Override // J9.b
    public void a(b.SessionDetails sessionDetails) {
        N8.g.f().b("App Quality Sessions session changed: " + sessionDetails);
        this.f14479b.h(sessionDetails.getSessionId());
    }

    @Override // J9.b
    public boolean b() {
        return this.f14478a.d();
    }

    @Override // J9.b
    public b.a c() {
        return b.a.CRASHLYTICS;
    }

    public String d(String str) {
        return this.f14479b.c(str);
    }

    public void e(String str) {
        this.f14479b.i(str);
    }
}
