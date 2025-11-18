package S3;

import android.graphics.PointF;

/* compiled from: CircleShape.java */
/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f15312a;

    /* renamed from: b, reason: collision with root package name */
    private final R3.m<PointF, PointF> f15313b;

    /* renamed from: c, reason: collision with root package name */
    private final R3.f f15314c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15315d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15316e;

    public b(String str, R3.m<PointF, PointF> mVar, R3.f fVar, boolean z10, boolean z11) {
        this.f15312a = str;
        this.f15313b = mVar;
        this.f15314c = fVar;
        this.f15315d = z10;
        this.f15316e = z11;
    }

    @Override // S3.c
    public N3.c a(com.airbnb.lottie.n nVar, L3.i iVar, T3.b bVar) {
        return new N3.f(nVar, bVar, this);
    }

    public String b() {
        return this.f15312a;
    }

    public R3.m<PointF, PointF> c() {
        return this.f15313b;
    }

    public R3.f d() {
        return this.f15314c;
    }

    public boolean e() {
        return this.f15316e;
    }

    public boolean f() {
        return this.f15315d;
    }
}
