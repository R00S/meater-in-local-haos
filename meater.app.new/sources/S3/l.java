package S3;

import android.graphics.PointF;

/* compiled from: RectangleShape.java */
/* loaded from: classes.dex */
public class l implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f15398a;

    /* renamed from: b, reason: collision with root package name */
    private final R3.m<PointF, PointF> f15399b;

    /* renamed from: c, reason: collision with root package name */
    private final R3.m<PointF, PointF> f15400c;

    /* renamed from: d, reason: collision with root package name */
    private final R3.b f15401d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15402e;

    public l(String str, R3.m<PointF, PointF> mVar, R3.m<PointF, PointF> mVar2, R3.b bVar, boolean z10) {
        this.f15398a = str;
        this.f15399b = mVar;
        this.f15400c = mVar2;
        this.f15401d = bVar;
        this.f15402e = z10;
    }

    @Override // S3.c
    public N3.c a(com.airbnb.lottie.n nVar, L3.i iVar, T3.b bVar) {
        return new N3.o(nVar, bVar, this);
    }

    public R3.b b() {
        return this.f15401d;
    }

    public String c() {
        return this.f15398a;
    }

    public R3.m<PointF, PointF> d() {
        return this.f15399b;
    }

    public R3.m<PointF, PointF> e() {
        return this.f15400c;
    }

    public boolean f() {
        return this.f15402e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f15399b + ", size=" + this.f15400c + '}';
    }
}
