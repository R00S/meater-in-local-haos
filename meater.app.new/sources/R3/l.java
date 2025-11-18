package R3;

import O3.p;
import android.graphics.PointF;

/* compiled from: AnimatableTransform.java */
/* loaded from: classes.dex */
public class l implements S3.c {

    /* renamed from: a, reason: collision with root package name */
    private final e f14784a;

    /* renamed from: b, reason: collision with root package name */
    private final m<PointF, PointF> f14785b;

    /* renamed from: c, reason: collision with root package name */
    private final g f14786c;

    /* renamed from: d, reason: collision with root package name */
    private final b f14787d;

    /* renamed from: e, reason: collision with root package name */
    private final d f14788e;

    /* renamed from: f, reason: collision with root package name */
    private final b f14789f;

    /* renamed from: g, reason: collision with root package name */
    private final b f14790g;

    /* renamed from: h, reason: collision with root package name */
    private final b f14791h;

    /* renamed from: i, reason: collision with root package name */
    private final b f14792i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14793j;

    public l() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // S3.c
    public N3.c a(com.airbnb.lottie.n nVar, L3.i iVar, T3.b bVar) {
        return null;
    }

    public p b() {
        return new p(this);
    }

    public e c() {
        return this.f14784a;
    }

    public b d() {
        return this.f14792i;
    }

    public d e() {
        return this.f14788e;
    }

    public m<PointF, PointF> f() {
        return this.f14785b;
    }

    public b g() {
        return this.f14787d;
    }

    public g h() {
        return this.f14786c;
    }

    public b i() {
        return this.f14789f;
    }

    public b j() {
        return this.f14790g;
    }

    public b k() {
        return this.f14791h;
    }

    public boolean l() {
        return this.f14793j;
    }

    public void m(boolean z10) {
        this.f14793j = z10;
    }

    public l(e eVar, m<PointF, PointF> mVar, g gVar, b bVar, d dVar, b bVar2, b bVar3, b bVar4, b bVar5) {
        this.f14793j = false;
        this.f14784a = eVar;
        this.f14785b = mVar;
        this.f14786c = gVar;
        this.f14787d = bVar;
        this.f14788e = dVar;
        this.f14791h = bVar2;
        this.f14792i = bVar3;
        this.f14789f = bVar4;
        this.f14790g = bVar5;
    }
}
