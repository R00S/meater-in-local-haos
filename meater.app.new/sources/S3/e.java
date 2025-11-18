package S3;

import android.graphics.Path;

/* compiled from: GradientFill.java */
/* loaded from: classes.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private final g f15319a;

    /* renamed from: b, reason: collision with root package name */
    private final Path.FillType f15320b;

    /* renamed from: c, reason: collision with root package name */
    private final R3.c f15321c;

    /* renamed from: d, reason: collision with root package name */
    private final R3.d f15322d;

    /* renamed from: e, reason: collision with root package name */
    private final R3.f f15323e;

    /* renamed from: f, reason: collision with root package name */
    private final R3.f f15324f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15325g;

    /* renamed from: h, reason: collision with root package name */
    private final R3.b f15326h;

    /* renamed from: i, reason: collision with root package name */
    private final R3.b f15327i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f15328j;

    public e(String str, g gVar, Path.FillType fillType, R3.c cVar, R3.d dVar, R3.f fVar, R3.f fVar2, R3.b bVar, R3.b bVar2, boolean z10) {
        this.f15319a = gVar;
        this.f15320b = fillType;
        this.f15321c = cVar;
        this.f15322d = dVar;
        this.f15323e = fVar;
        this.f15324f = fVar2;
        this.f15325g = str;
        this.f15326h = bVar;
        this.f15327i = bVar2;
        this.f15328j = z10;
    }

    @Override // S3.c
    public N3.c a(com.airbnb.lottie.n nVar, L3.i iVar, T3.b bVar) {
        return new N3.h(nVar, iVar, bVar, this);
    }

    public R3.f b() {
        return this.f15324f;
    }

    public Path.FillType c() {
        return this.f15320b;
    }

    public R3.c d() {
        return this.f15321c;
    }

    public g e() {
        return this.f15319a;
    }

    public String f() {
        return this.f15325g;
    }

    public R3.d g() {
        return this.f15322d;
    }

    public R3.f h() {
        return this.f15323e;
    }

    public boolean i() {
        return this.f15328j;
    }
}
