package S3;

import android.graphics.PointF;

/* compiled from: PolystarShape.java */
/* loaded from: classes.dex */
public class k implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f15383a;

    /* renamed from: b, reason: collision with root package name */
    private final a f15384b;

    /* renamed from: c, reason: collision with root package name */
    private final R3.b f15385c;

    /* renamed from: d, reason: collision with root package name */
    private final R3.m<PointF, PointF> f15386d;

    /* renamed from: e, reason: collision with root package name */
    private final R3.b f15387e;

    /* renamed from: f, reason: collision with root package name */
    private final R3.b f15388f;

    /* renamed from: g, reason: collision with root package name */
    private final R3.b f15389g;

    /* renamed from: h, reason: collision with root package name */
    private final R3.b f15390h;

    /* renamed from: i, reason: collision with root package name */
    private final R3.b f15391i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f15392j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f15393k;

    /* compiled from: PolystarShape.java */
    public enum a {
        STAR(1),
        POLYGON(2);


        /* renamed from: B, reason: collision with root package name */
        private final int f15397B;

        a(int i10) {
            this.f15397B = i10;
        }

        public static a j(int i10) {
            for (a aVar : values()) {
                if (aVar.f15397B == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public k(String str, a aVar, R3.b bVar, R3.m<PointF, PointF> mVar, R3.b bVar2, R3.b bVar3, R3.b bVar4, R3.b bVar5, R3.b bVar6, boolean z10, boolean z11) {
        this.f15383a = str;
        this.f15384b = aVar;
        this.f15385c = bVar;
        this.f15386d = mVar;
        this.f15387e = bVar2;
        this.f15388f = bVar3;
        this.f15389g = bVar4;
        this.f15390h = bVar5;
        this.f15391i = bVar6;
        this.f15392j = z10;
        this.f15393k = z11;
    }

    @Override // S3.c
    public N3.c a(com.airbnb.lottie.n nVar, L3.i iVar, T3.b bVar) {
        return new N3.n(nVar, bVar, this);
    }

    public R3.b b() {
        return this.f15388f;
    }

    public R3.b c() {
        return this.f15390h;
    }

    public String d() {
        return this.f15383a;
    }

    public R3.b e() {
        return this.f15389g;
    }

    public R3.b f() {
        return this.f15391i;
    }

    public R3.b g() {
        return this.f15385c;
    }

    public R3.m<PointF, PointF> h() {
        return this.f15386d;
    }

    public R3.b i() {
        return this.f15387e;
    }

    public a j() {
        return this.f15384b;
    }

    public boolean k() {
        return this.f15392j;
    }

    public boolean l() {
        return this.f15393k;
    }
}
