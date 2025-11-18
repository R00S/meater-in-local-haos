package S3;

import android.graphics.Path;

/* compiled from: ShapeFill.java */
/* loaded from: classes.dex */
public class p implements c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15413a;

    /* renamed from: b, reason: collision with root package name */
    private final Path.FillType f15414b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15415c;

    /* renamed from: d, reason: collision with root package name */
    private final R3.a f15416d;

    /* renamed from: e, reason: collision with root package name */
    private final R3.d f15417e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15418f;

    public p(String str, boolean z10, Path.FillType fillType, R3.a aVar, R3.d dVar, boolean z11) {
        this.f15415c = str;
        this.f15413a = z10;
        this.f15414b = fillType;
        this.f15416d = aVar;
        this.f15417e = dVar;
        this.f15418f = z11;
    }

    @Override // S3.c
    public N3.c a(com.airbnb.lottie.n nVar, L3.i iVar, T3.b bVar) {
        return new N3.g(nVar, bVar, this);
    }

    public R3.a b() {
        return this.f15416d;
    }

    public Path.FillType c() {
        return this.f15414b;
    }

    public String d() {
        return this.f15415c;
    }

    public R3.d e() {
        return this.f15417e;
    }

    public boolean f() {
        return this.f15418f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f15413a + '}';
    }
}
