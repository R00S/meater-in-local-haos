package S3;

/* compiled from: RoundedCorners.java */
/* loaded from: classes.dex */
public class n implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f15408a;

    /* renamed from: b, reason: collision with root package name */
    private final R3.m<Float, Float> f15409b;

    public n(String str, R3.m<Float, Float> mVar) {
        this.f15408a = str;
        this.f15409b = mVar;
    }

    @Override // S3.c
    public N3.c a(com.airbnb.lottie.n nVar, L3.i iVar, T3.b bVar) {
        return new N3.q(nVar, bVar, this);
    }

    public R3.m<Float, Float> b() {
        return this.f15409b;
    }

    public String c() {
        return this.f15408a;
    }
}
