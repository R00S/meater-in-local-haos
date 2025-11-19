package M6;

/* compiled from: TransportImpl.java */
/* loaded from: classes2.dex */
final class s<T> implements K6.i<T> {

    /* renamed from: a, reason: collision with root package name */
    private final p f12107a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12108b;

    /* renamed from: c, reason: collision with root package name */
    private final K6.c f12109c;

    /* renamed from: d, reason: collision with root package name */
    private final K6.h<T, byte[]> f12110d;

    /* renamed from: e, reason: collision with root package name */
    private final t f12111e;

    s(p pVar, String str, K6.c cVar, K6.h<T, byte[]> hVar, t tVar) {
        this.f12107a = pVar;
        this.f12108b = str;
        this.f12109c = cVar;
        this.f12110d = hVar;
        this.f12111e = tVar;
    }

    @Override // K6.i
    public void a(K6.d<T> dVar, K6.k kVar) {
        this.f12111e.a(o.a().e(this.f12107a).c(dVar).f(this.f12108b).d(this.f12110d).b(this.f12109c).a(), kVar);
    }

    @Override // K6.i
    public void b(K6.d<T> dVar) {
        a(dVar, new K6.k() { // from class: M6.r
            @Override // K6.k
            public final void a(Exception exc) {
                s.e(exc);
            }
        });
    }

    p d() {
        return this.f12107a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Exception exc) {
    }
}
