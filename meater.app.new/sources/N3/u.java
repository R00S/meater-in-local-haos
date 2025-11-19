package N3;

import O3.a;
import S3.t;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrimPathContent.java */
/* loaded from: classes.dex */
public class u implements c, a.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f12506a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12507b;

    /* renamed from: c, reason: collision with root package name */
    private final List<a.b> f12508c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final t.a f12509d;

    /* renamed from: e, reason: collision with root package name */
    private final O3.a<?, Float> f12510e;

    /* renamed from: f, reason: collision with root package name */
    private final O3.a<?, Float> f12511f;

    /* renamed from: g, reason: collision with root package name */
    private final O3.a<?, Float> f12512g;

    public u(T3.b bVar, S3.t tVar) {
        this.f12506a = tVar.c();
        this.f12507b = tVar.g();
        this.f12509d = tVar.f();
        O3.a<Float, Float> aVarH = tVar.e().h();
        this.f12510e = aVarH;
        O3.a<Float, Float> aVarH2 = tVar.b().h();
        this.f12511f = aVarH2;
        O3.a<Float, Float> aVarH3 = tVar.d().h();
        this.f12512g = aVarH3;
        bVar.j(aVarH);
        bVar.j(aVarH2);
        bVar.j(aVarH3);
        aVarH.a(this);
        aVarH2.a(this);
        aVarH3.a(this);
    }

    @Override // O3.a.b
    public void a() {
        for (int i10 = 0; i10 < this.f12508c.size(); i10++) {
            this.f12508c.get(i10).a();
        }
    }

    void c(a.b bVar) {
        this.f12508c.add(bVar);
    }

    public O3.a<?, Float> d() {
        return this.f12511f;
    }

    public O3.a<?, Float> f() {
        return this.f12512g;
    }

    public O3.a<?, Float> j() {
        return this.f12510e;
    }

    t.a k() {
        return this.f12509d;
    }

    public boolean l() {
        return this.f12507b;
    }

    @Override // N3.c
    public void b(List<c> list, List<c> list2) {
    }
}
