package Y3;

/* compiled from: LottieValueCallback.java */
/* loaded from: classes.dex */
public class c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final b<T> f19409a;

    /* renamed from: b, reason: collision with root package name */
    private O3.a<?, ?> f19410b;

    /* renamed from: c, reason: collision with root package name */
    protected T f19411c;

    public c() {
        this.f19409a = new b<>();
        this.f19411c = null;
    }

    public T a(b<T> bVar) {
        return this.f19411c;
    }

    public final T b(float f10, float f11, T t10, T t11, float f12, float f13, float f14) {
        return a(this.f19409a.h(f10, f11, t10, t11, f12, f13, f14));
    }

    public final void c(O3.a<?, ?> aVar) {
        this.f19410b = aVar;
    }

    public c(T t10) {
        this.f19409a = new b<>();
        this.f19411c = t10;
    }
}
