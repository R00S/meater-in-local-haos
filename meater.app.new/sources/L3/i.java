package L3;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s.C4411v;
import s.Y;

/* compiled from: LottieComposition.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    private Map<String, List<T3.e>> f9162c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, u> f9163d;

    /* renamed from: e, reason: collision with root package name */
    private float f9164e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, Q3.c> f9165f;

    /* renamed from: g, reason: collision with root package name */
    private List<Q3.h> f9166g;

    /* renamed from: h, reason: collision with root package name */
    private Y<Q3.d> f9167h;

    /* renamed from: i, reason: collision with root package name */
    private C4411v<T3.e> f9168i;

    /* renamed from: j, reason: collision with root package name */
    private List<T3.e> f9169j;

    /* renamed from: k, reason: collision with root package name */
    private Rect f9170k;

    /* renamed from: l, reason: collision with root package name */
    private float f9171l;

    /* renamed from: m, reason: collision with root package name */
    private float f9172m;

    /* renamed from: n, reason: collision with root package name */
    private float f9173n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f9174o;

    /* renamed from: a, reason: collision with root package name */
    private final C f9160a = new C();

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<String> f9161b = new HashSet<>();

    /* renamed from: p, reason: collision with root package name */
    private int f9175p = 0;

    public void a(String str) {
        X3.d.c(str);
        this.f9161b.add(str);
    }

    public Rect b() {
        return this.f9170k;
    }

    public Y<Q3.d> c() {
        return this.f9167h;
    }

    public float d() {
        return (long) ((e() / this.f9173n) * 1000.0f);
    }

    public float e() {
        return this.f9172m - this.f9171l;
    }

    public float f() {
        return this.f9172m;
    }

    public Map<String, Q3.c> g() {
        return this.f9165f;
    }

    public float h(float f10) {
        return X3.i.i(this.f9171l, this.f9172m, f10);
    }

    public float i() {
        return this.f9173n;
    }

    public Map<String, u> j() {
        float fE = X3.j.e();
        if (fE != this.f9164e) {
            for (Map.Entry<String, u> entry : this.f9163d.entrySet()) {
                this.f9163d.put(entry.getKey(), entry.getValue().a(this.f9164e / fE));
            }
        }
        this.f9164e = fE;
        return this.f9163d;
    }

    public List<T3.e> k() {
        return this.f9169j;
    }

    public Q3.h l(String str) {
        int size = this.f9166g.size();
        for (int i10 = 0; i10 < size; i10++) {
            Q3.h hVar = this.f9166g.get(i10);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.f9175p;
    }

    public C n() {
        return this.f9160a;
    }

    public List<T3.e> o(String str) {
        return this.f9162c.get(str);
    }

    public float p() {
        return this.f9171l;
    }

    public boolean q() {
        return this.f9174o;
    }

    public void r(int i10) {
        this.f9175p += i10;
    }

    public void s(Rect rect, float f10, float f11, float f12, List<T3.e> list, C4411v<T3.e> c4411v, Map<String, List<T3.e>> map, Map<String, u> map2, float f13, Y<Q3.d> y10, Map<String, Q3.c> map3, List<Q3.h> list2) {
        this.f9170k = rect;
        this.f9171l = f10;
        this.f9172m = f11;
        this.f9173n = f12;
        this.f9169j = list;
        this.f9168i = c4411v;
        this.f9162c = map;
        this.f9163d = map2;
        this.f9164e = f13;
        this.f9167h = y10;
        this.f9165f = map3;
        this.f9166g = list2;
    }

    public T3.e t(long j10) {
        return this.f9168i.f(j10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<T3.e> it = this.f9169j.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().z("\t"));
        }
        return sb2.toString();
    }

    public void u(boolean z10) {
        this.f9174o = z10;
    }

    public void v(boolean z10) {
        this.f9160a.b(z10);
    }
}
