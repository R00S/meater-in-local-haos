package b1;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: WidgetGroup.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: g, reason: collision with root package name */
    static int f30059g;

    /* renamed from: b, reason: collision with root package name */
    int f30061b;

    /* renamed from: d, reason: collision with root package name */
    int f30063d;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<a1.e> f30060a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    boolean f30062c = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<a> f30064e = null;

    /* renamed from: f, reason: collision with root package name */
    private int f30065f = -1;

    /* compiled from: WidgetGroup.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<a1.e> f30066a;

        /* renamed from: b, reason: collision with root package name */
        int f30067b;

        /* renamed from: c, reason: collision with root package name */
        int f30068c;

        /* renamed from: d, reason: collision with root package name */
        int f30069d;

        /* renamed from: e, reason: collision with root package name */
        int f30070e;

        /* renamed from: f, reason: collision with root package name */
        int f30071f;

        /* renamed from: g, reason: collision with root package name */
        int f30072g;

        a(a1.e eVar, X0.d dVar, int i10) {
            this.f30066a = new WeakReference<>(eVar);
            this.f30067b = dVar.y(eVar.f19800O);
            this.f30068c = dVar.y(eVar.f19801P);
            this.f30069d = dVar.y(eVar.f19802Q);
            this.f30070e = dVar.y(eVar.f19803R);
            this.f30071f = dVar.y(eVar.f19804S);
            this.f30072g = i10;
        }
    }

    public o(int i10) {
        int i11 = f30059g;
        f30059g = i11 + 1;
        this.f30061b = i11;
        this.f30063d = i10;
    }

    private String e() {
        int i10 = this.f30063d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    private int j(X0.d dVar, ArrayList<a1.e> arrayList, int i10) {
        int iY;
        int iY2;
        a1.f fVar = (a1.f) arrayList.get(0).K();
        dVar.E();
        fVar.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).g(dVar, false);
        }
        if (i10 == 0 && fVar.f19880W0 > 0) {
            a1.b.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.f19881X0 > 0) {
            a1.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.A();
        } catch (Exception e10) {
            System.err.println(e10.toString() + "\n" + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f30064e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f30064e.add(new a(arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            iY = dVar.y(fVar.f19800O);
            iY2 = dVar.y(fVar.f19802Q);
            dVar.E();
        } else {
            iY = dVar.y(fVar.f19801P);
            iY2 = dVar.y(fVar.f19803R);
            dVar.E();
        }
        return iY2 - iY;
    }

    public boolean a(a1.e eVar) {
        if (this.f30060a.contains(eVar)) {
            return false;
        }
        this.f30060a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f30060a.size();
        if (this.f30065f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f30065f == oVar.f30061b) {
                    g(this.f30063d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f30061b;
    }

    public int d() {
        return this.f30063d;
    }

    public int f(X0.d dVar, int i10) {
        if (this.f30060a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f30060a, i10);
    }

    public void g(int i10, o oVar) {
        Iterator<a1.e> it = this.f30060a.iterator();
        while (it.hasNext()) {
            a1.e next = it.next();
            oVar.a(next);
            if (i10 == 0) {
                next.f19793I0 = oVar.c();
            } else {
                next.f19795J0 = oVar.c();
            }
        }
        this.f30065f = oVar.f30061b;
    }

    public void h(boolean z10) {
        this.f30062c = z10;
    }

    public void i(int i10) {
        this.f30063d = i10;
    }

    public String toString() {
        String str = e() + " [" + this.f30061b + "] <";
        Iterator<a1.e> it = this.f30060a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().t();
        }
        return str + " >";
    }
}
