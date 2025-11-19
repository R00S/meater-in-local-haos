package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.B;
import androidx.datastore.preferences.protobuf.C2073t;
import androidx.datastore.preferences.protobuf.r0;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MessageSetSchema.java */
/* loaded from: classes.dex */
final class U<T> implements f0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final P f24888a;

    /* renamed from: b, reason: collision with root package name */
    private final l0<?, ?> f24889b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24890c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC2070p<?> f24891d;

    private U(l0<?, ?> l0Var, AbstractC2070p<?> abstractC2070p, P p10) {
        this.f24889b = l0Var;
        this.f24890c = abstractC2070p.e(p10);
        this.f24891d = abstractC2070p;
        this.f24888a = p10;
    }

    private <UT, UB> int j(l0<UT, UB> l0Var, T t10) {
        return l0Var.i(l0Var.g(t10));
    }

    private <UT, UB, ET extends C2073t.b<ET>> void k(l0<UT, UB> l0Var, AbstractC2070p<ET> abstractC2070p, T t10, e0 e0Var, C2069o c2069o) {
        UB ubF = l0Var.f(t10);
        C2073t<ET> c2073tD = abstractC2070p.d(t10);
        while (e0Var.w() != Integer.MAX_VALUE) {
            try {
                if (!m(e0Var, c2069o, abstractC2070p, c2073tD, l0Var, ubF)) {
                    return;
                }
            } finally {
                l0Var.o(t10, ubF);
            }
        }
    }

    static <T> U<T> l(l0<?, ?> l0Var, AbstractC2070p<?> abstractC2070p, P p10) {
        return new U<>(l0Var, abstractC2070p, p10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends C2073t.b<ET>> boolean m(e0 e0Var, C2069o c2069o, AbstractC2070p<ET> abstractC2070p, C2073t<ET> c2073t, l0<UT, UB> l0Var, UB ub2) throws InvalidProtocolBufferException {
        int iA = e0Var.a();
        if (iA != r0.f25047a) {
            if (r0.b(iA) != 2) {
                return e0Var.C();
            }
            Object objB = abstractC2070p.b(c2069o, this.f24888a, r0.a(iA));
            if (objB == null) {
                return l0Var.m(ub2, e0Var);
            }
            abstractC2070p.h(e0Var, objB, c2069o, c2073t);
            return true;
        }
        Object objB2 = null;
        int iL = 0;
        AbstractC2062h abstractC2062hZ = null;
        while (e0Var.w() != Integer.MAX_VALUE) {
            int iA2 = e0Var.a();
            if (iA2 == r0.f25049c) {
                iL = e0Var.l();
                objB2 = abstractC2070p.b(c2069o, this.f24888a, iL);
            } else if (iA2 == r0.f25050d) {
                if (objB2 != null) {
                    abstractC2070p.h(e0Var, objB2, c2069o, c2073t);
                } else {
                    abstractC2062hZ = e0Var.z();
                }
            } else if (!e0Var.C()) {
                break;
            }
        }
        if (e0Var.a() != r0.f25048b) {
            throw InvalidProtocolBufferException.a();
        }
        if (abstractC2062hZ != null) {
            if (objB2 != null) {
                abstractC2070p.i(abstractC2062hZ, objB2, c2069o, c2073t);
            } else {
                l0Var.d(ub2, iL, abstractC2062hZ);
            }
        }
        return true;
    }

    private <UT, UB> void n(l0<UT, UB> l0Var, T t10, s0 s0Var) {
        l0Var.s(l0Var.g(t10), s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void a(T t10, T t11) {
        h0.G(this.f24889b, t10, t11);
        if (this.f24890c) {
            h0.E(this.f24891d, t10, t11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void b(T t10) {
        this.f24889b.j(t10);
        this.f24891d.f(t10);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final boolean c(T t10) {
        return this.f24891d.c(t10).p();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public boolean d(T t10, T t11) {
        if (!this.f24889b.g(t10).equals(this.f24889b.g(t11))) {
            return false;
        }
        if (this.f24890c) {
            return this.f24891d.c(t10).equals(this.f24891d.c(t11));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public int e(T t10) {
        int iJ = j(this.f24889b, t10);
        return this.f24890c ? iJ + this.f24891d.c(t10).j() : iJ;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public T f() {
        return (T) this.f24888a.g().j();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public int g(T t10) {
        int iHashCode = this.f24889b.g(t10).hashCode();
        return this.f24890c ? (iHashCode * 53) + this.f24891d.c(t10).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void h(T t10, e0 e0Var, C2069o c2069o) {
        k(this.f24889b, this.f24891d, t10, e0Var, c2069o);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void i(T t10, s0 s0Var) {
        Iterator itS = this.f24891d.c(t10).s();
        while (itS.hasNext()) {
            Map.Entry entry = (Map.Entry) itS.next();
            C2073t.b bVar = (C2073t.b) entry.getKey();
            if (bVar.i() != r0.c.MESSAGE || bVar.isRepeated() || bVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof B.b) {
                s0Var.c(bVar.e(), ((B.b) entry).a().e());
            } else {
                s0Var.c(bVar.e(), entry.getValue());
            }
        }
        n(this.f24889b, t10, s0Var);
    }
}
