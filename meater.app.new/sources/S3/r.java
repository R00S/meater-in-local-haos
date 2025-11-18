package S3;

/* compiled from: ShapePath.java */
/* loaded from: classes.dex */
public class r implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f15422a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15423b;

    /* renamed from: c, reason: collision with root package name */
    private final R3.h f15424c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15425d;

    public r(String str, int i10, R3.h hVar, boolean z10) {
        this.f15422a = str;
        this.f15423b = i10;
        this.f15424c = hVar;
        this.f15425d = z10;
    }

    @Override // S3.c
    public N3.c a(com.airbnb.lottie.n nVar, L3.i iVar, T3.b bVar) {
        return new N3.r(nVar, bVar, this);
    }

    public String b() {
        return this.f15422a;
    }

    public R3.h c() {
        return this.f15424c;
    }

    public boolean d() {
        return this.f15425d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f15422a + ", index=" + this.f15423b + '}';
    }
}
