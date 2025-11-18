package a1;

import X0.i;
import b1.C2204i;
import b1.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintAnchor.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private int f19757b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19758c;

    /* renamed from: d, reason: collision with root package name */
    public final e f19759d;

    /* renamed from: e, reason: collision with root package name */
    public final a f19760e;

    /* renamed from: f, reason: collision with root package name */
    public d f19761f;

    /* renamed from: i, reason: collision with root package name */
    X0.i f19764i;

    /* renamed from: a, reason: collision with root package name */
    private HashSet<d> f19756a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f19762g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f19763h = Integer.MIN_VALUE;

    /* compiled from: ConstraintAnchor.java */
    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, a aVar) {
        this.f19759d = eVar;
        this.f19760e = aVar;
    }

    public boolean a(d dVar, int i10) {
        return b(dVar, i10, Integer.MIN_VALUE, false);
    }

    public boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            q();
            return true;
        }
        if (!z10 && !p(dVar)) {
            return false;
        }
        this.f19761f = dVar;
        if (dVar.f19756a == null) {
            dVar.f19756a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f19761f.f19756a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f19762g = i10;
        this.f19763h = i11;
        return true;
    }

    public void c(int i10, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f19756a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                C2204i.a(it.next().f19759d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet<d> d() {
        return this.f19756a;
    }

    public int e() {
        if (this.f19758c) {
            return this.f19757b;
        }
        return 0;
    }

    public int f() {
        d dVar;
        if (this.f19759d.V() == 8) {
            return 0;
        }
        return (this.f19763h == Integer.MIN_VALUE || (dVar = this.f19761f) == null || dVar.f19759d.V() != 8) ? this.f19762g : this.f19763h;
    }

    public final d g() {
        switch (this.f19760e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f19759d.f19802Q;
            case TOP:
                return this.f19759d.f19803R;
            case RIGHT:
                return this.f19759d.f19800O;
            case BOTTOM:
                return this.f19759d.f19801P;
            default:
                throw new AssertionError(this.f19760e.name());
        }
    }

    public e h() {
        return this.f19759d;
    }

    public X0.i i() {
        return this.f19764i;
    }

    public d j() {
        return this.f19761f;
    }

    public a k() {
        return this.f19760e;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f19756a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet<d> hashSet = this.f19756a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.f19758c;
    }

    public boolean o() {
        return this.f19761f != null;
    }

    public boolean p(d dVar) {
        if (dVar == null) {
            return false;
        }
        a aVarK = dVar.k();
        a aVar = this.f19760e;
        if (aVarK == aVar) {
            return aVar != a.BASELINE || (dVar.h().Z() && h().Z());
        }
        switch (aVar) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z10 = aVarK == a.LEFT || aVarK == a.RIGHT;
                if (dVar.h() instanceof h) {
                    return z10 || aVarK == a.CENTER_X;
                }
                return z10;
            case TOP:
            case BOTTOM:
                boolean z11 = aVarK == a.TOP || aVarK == a.BOTTOM;
                if (dVar.h() instanceof h) {
                    return z11 || aVarK == a.CENTER_Y;
                }
                return z11;
            case BASELINE:
                return (aVarK == a.LEFT || aVarK == a.RIGHT) ? false : true;
            case CENTER:
                return (aVarK == a.BASELINE || aVarK == a.CENTER_X || aVarK == a.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f19760e.name());
        }
    }

    public void q() {
        HashSet<d> hashSet;
        d dVar = this.f19761f;
        if (dVar != null && (hashSet = dVar.f19756a) != null) {
            hashSet.remove(this);
            if (this.f19761f.f19756a.size() == 0) {
                this.f19761f.f19756a = null;
            }
        }
        this.f19756a = null;
        this.f19761f = null;
        this.f19762g = 0;
        this.f19763h = Integer.MIN_VALUE;
        this.f19758c = false;
        this.f19757b = 0;
    }

    public void r() {
        this.f19758c = false;
        this.f19757b = 0;
    }

    public void s(X0.c cVar) {
        X0.i iVar = this.f19764i;
        if (iVar == null) {
            this.f19764i = new X0.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.s();
        }
    }

    public void t(int i10) {
        this.f19757b = i10;
        this.f19758c = true;
    }

    public String toString() {
        return this.f19759d.t() + ":" + this.f19760e.toString();
    }

    public void u(int i10) {
        if (o()) {
            this.f19763h = i10;
        }
    }
}
