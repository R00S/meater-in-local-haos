package N3;

import O3.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ContentGroup.java */
/* loaded from: classes.dex */
public class d implements e, m, a.b, Q3.f {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f12379a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f12380b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f12381c;

    /* renamed from: d, reason: collision with root package name */
    private final Path f12382d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f12383e;

    /* renamed from: f, reason: collision with root package name */
    private final String f12384f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f12385g;

    /* renamed from: h, reason: collision with root package name */
    private final List<c> f12386h;

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.n f12387i;

    /* renamed from: j, reason: collision with root package name */
    private List<m> f12388j;

    /* renamed from: k, reason: collision with root package name */
    private O3.p f12389k;

    public d(com.airbnb.lottie.n nVar, T3.b bVar, S3.q qVar, L3.i iVar) {
        this(nVar, bVar, qVar.c(), qVar.d(), f(nVar, iVar, bVar, qVar.b()), j(qVar.b()));
    }

    private static List<c> f(com.airbnb.lottie.n nVar, L3.i iVar, T3.b bVar, List<S3.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVarA = list.get(i10).a(nVar, iVar, bVar);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return arrayList;
    }

    static R3.l j(List<S3.c> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            S3.c cVar = list.get(i10);
            if (cVar instanceof R3.l) {
                return (R3.l) cVar;
            }
        }
        return null;
    }

    private boolean n() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f12386h.size(); i11++) {
            if ((this.f12386h.get(i11) instanceof e) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // O3.a.b
    public void a() {
        this.f12387i.invalidateSelf();
    }

    @Override // N3.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f12386h.size());
        arrayList.addAll(list);
        for (int size = this.f12386h.size() - 1; size >= 0; size--) {
            c cVar = this.f12386h.get(size);
            cVar.b(arrayList, this.f12386h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // Q3.f
    public <T> void c(T t10, Y3.c<T> cVar) {
        O3.p pVar = this.f12389k;
        if (pVar != null) {
            pVar.c(t10, cVar);
        }
    }

    @Override // Q3.f
    public void d(Q3.e eVar, int i10, List<Q3.e> list, Q3.e eVar2) {
        if (eVar.g(getName(), i10) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                int iE = i10 + eVar.e(getName(), i10);
                for (int i11 = 0; i11 < this.f12386h.size(); i11++) {
                    c cVar = this.f12386h.get(i11);
                    if (cVar instanceof Q3.f) {
                        ((Q3.f) cVar).d(eVar, iE, list, eVar2);
                    }
                }
            }
        }
    }

    @Override // N3.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f12381c.set(matrix);
        O3.p pVar = this.f12389k;
        if (pVar != null) {
            this.f12381c.preConcat(pVar.f());
        }
        this.f12383e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f12386h.size() - 1; size >= 0; size--) {
            c cVar = this.f12386h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).e(this.f12383e, this.f12381c, z10);
                rectF.union(this.f12383e);
            }
        }
    }

    @Override // N3.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        if (this.f12385g) {
            return;
        }
        this.f12381c.set(matrix);
        O3.p pVar = this.f12389k;
        if (pVar != null) {
            this.f12381c.preConcat(pVar.f());
            i10 = (int) (((((this.f12389k.h() == null ? 100 : this.f12389k.h().h().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = this.f12387i.e0() && n() && i10 != 255;
        if (z10) {
            this.f12380b.set(0.0f, 0.0f, 0.0f, 0.0f);
            e(this.f12380b, this.f12381c, true);
            this.f12379a.setAlpha(i10);
            X3.j.m(canvas, this.f12380b, this.f12379a);
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.f12386h.size() - 1; size >= 0; size--) {
            c cVar = this.f12386h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).g(canvas, this.f12381c, i10);
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    @Override // N3.c
    public String getName() {
        return this.f12384f;
    }

    @Override // N3.m
    public Path h() {
        this.f12381c.reset();
        O3.p pVar = this.f12389k;
        if (pVar != null) {
            this.f12381c.set(pVar.f());
        }
        this.f12382d.reset();
        if (this.f12385g) {
            return this.f12382d;
        }
        for (int size = this.f12386h.size() - 1; size >= 0; size--) {
            c cVar = this.f12386h.get(size);
            if (cVar instanceof m) {
                this.f12382d.addPath(((m) cVar).h(), this.f12381c);
            }
        }
        return this.f12382d;
    }

    public List<c> k() {
        return this.f12386h;
    }

    List<m> l() {
        if (this.f12388j == null) {
            this.f12388j = new ArrayList();
            for (int i10 = 0; i10 < this.f12386h.size(); i10++) {
                c cVar = this.f12386h.get(i10);
                if (cVar instanceof m) {
                    this.f12388j.add((m) cVar);
                }
            }
        }
        return this.f12388j;
    }

    Matrix m() {
        O3.p pVar = this.f12389k;
        if (pVar != null) {
            return pVar.f();
        }
        this.f12381c.reset();
        return this.f12381c;
    }

    d(com.airbnb.lottie.n nVar, T3.b bVar, String str, boolean z10, List<c> list, R3.l lVar) {
        this.f12379a = new M3.a();
        this.f12380b = new RectF();
        this.f12381c = new Matrix();
        this.f12382d = new Path();
        this.f12383e = new RectF();
        this.f12384f = str;
        this.f12387i = nVar;
        this.f12385g = z10;
        this.f12386h = list;
        if (lVar != null) {
            O3.p pVarB = lVar.b();
            this.f12389k = pVarB;
            pVarB.a(bVar);
            this.f12389k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).f(list.listIterator(list.size()));
        }
    }
}
