package S3;

import S3.s;
import java.util.List;

/* compiled from: GradientStroke.java */
/* loaded from: classes.dex */
public class f implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f15329a;

    /* renamed from: b, reason: collision with root package name */
    private final g f15330b;

    /* renamed from: c, reason: collision with root package name */
    private final R3.c f15331c;

    /* renamed from: d, reason: collision with root package name */
    private final R3.d f15332d;

    /* renamed from: e, reason: collision with root package name */
    private final R3.f f15333e;

    /* renamed from: f, reason: collision with root package name */
    private final R3.f f15334f;

    /* renamed from: g, reason: collision with root package name */
    private final R3.b f15335g;

    /* renamed from: h, reason: collision with root package name */
    private final s.b f15336h;

    /* renamed from: i, reason: collision with root package name */
    private final s.c f15337i;

    /* renamed from: j, reason: collision with root package name */
    private final float f15338j;

    /* renamed from: k, reason: collision with root package name */
    private final List<R3.b> f15339k;

    /* renamed from: l, reason: collision with root package name */
    private final R3.b f15340l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f15341m;

    public f(String str, g gVar, R3.c cVar, R3.d dVar, R3.f fVar, R3.f fVar2, R3.b bVar, s.b bVar2, s.c cVar2, float f10, List<R3.b> list, R3.b bVar3, boolean z10) {
        this.f15329a = str;
        this.f15330b = gVar;
        this.f15331c = cVar;
        this.f15332d = dVar;
        this.f15333e = fVar;
        this.f15334f = fVar2;
        this.f15335g = bVar;
        this.f15336h = bVar2;
        this.f15337i = cVar2;
        this.f15338j = f10;
        this.f15339k = list;
        this.f15340l = bVar3;
        this.f15341m = z10;
    }

    @Override // S3.c
    public N3.c a(com.airbnb.lottie.n nVar, L3.i iVar, T3.b bVar) {
        return new N3.i(nVar, bVar, this);
    }

    public s.b b() {
        return this.f15336h;
    }

    public R3.b c() {
        return this.f15340l;
    }

    public R3.f d() {
        return this.f15334f;
    }

    public R3.c e() {
        return this.f15331c;
    }

    public g f() {
        return this.f15330b;
    }

    public s.c g() {
        return this.f15337i;
    }

    public List<R3.b> h() {
        return this.f15339k;
    }

    public float i() {
        return this.f15338j;
    }

    public String j() {
        return this.f15329a;
    }

    public R3.d k() {
        return this.f15332d;
    }

    public R3.f l() {
        return this.f15333e;
    }

    public R3.b m() {
        return this.f15335g;
    }

    public boolean n() {
        return this.f15341m;
    }
}
