package S3;

/* compiled from: Repeater.java */
/* loaded from: classes.dex */
public class m implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f15403a;

    /* renamed from: b, reason: collision with root package name */
    private final R3.b f15404b;

    /* renamed from: c, reason: collision with root package name */
    private final R3.b f15405c;

    /* renamed from: d, reason: collision with root package name */
    private final R3.l f15406d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15407e;

    public m(String str, R3.b bVar, R3.b bVar2, R3.l lVar, boolean z10) {
        this.f15403a = str;
        this.f15404b = bVar;
        this.f15405c = bVar2;
        this.f15406d = lVar;
        this.f15407e = z10;
    }

    @Override // S3.c
    public N3.c a(com.airbnb.lottie.n nVar, L3.i iVar, T3.b bVar) {
        return new N3.p(nVar, bVar, this);
    }

    public R3.b b() {
        return this.f15404b;
    }

    public String c() {
        return this.f15403a;
    }

    public R3.b d() {
        return this.f15405c;
    }

    public R3.l e() {
        return this.f15406d;
    }

    public boolean f() {
        return this.f15407e;
    }
}
