package com.google.protobuf;

import com.google.protobuf.B;
import com.google.protobuf.C2958s;
import com.google.protobuf.r0;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MessageSetSchema.java */
/* loaded from: classes2.dex */
final class U<T> implements f0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final P f39209a;

    /* renamed from: b, reason: collision with root package name */
    private final l0<?, ?> f39210b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f39211c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC2955o<?> f39212d;

    private U(l0<?, ?> l0Var, AbstractC2955o<?> abstractC2955o, P p10) {
        this.f39210b = l0Var;
        this.f39211c = abstractC2955o.e(p10);
        this.f39212d = abstractC2955o;
        this.f39209a = p10;
    }

    private <UT, UB> int j(l0<UT, UB> l0Var, T t10) {
        return l0Var.i(l0Var.g(t10));
    }

    private <UT, UB, ET extends C2958s.b<ET>> void k(l0<UT, UB> l0Var, AbstractC2955o<ET> abstractC2955o, T t10, e0 e0Var, C2954n c2954n) {
        UB ubF = l0Var.f(t10);
        C2958s<ET> c2958sD = abstractC2955o.d(t10);
        while (e0Var.w() != Integer.MAX_VALUE) {
            try {
                if (!m(e0Var, c2954n, abstractC2955o, c2958sD, l0Var, ubF)) {
                    return;
                }
            } finally {
                l0Var.o(t10, ubF);
            }
        }
    }

    static <T> U<T> l(l0<?, ?> l0Var, AbstractC2955o<?> abstractC2955o, P p10) {
        return new U<>(l0Var, abstractC2955o, p10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends C2958s.b<ET>> boolean m(e0 e0Var, C2954n c2954n, AbstractC2955o<ET> abstractC2955o, C2958s<ET> c2958s, l0<UT, UB> l0Var, UB ub2) throws InvalidProtocolBufferException {
        int iA = e0Var.a();
        int iL = 0;
        if (iA != r0.f39353a) {
            if (r0.b(iA) != 2) {
                return e0Var.C();
            }
            Object objB = abstractC2955o.b(c2954n, this.f39209a, r0.a(iA));
            if (objB == null) {
                return l0Var.m(ub2, e0Var, 0);
            }
            abstractC2955o.h(e0Var, objB, c2954n, c2958s);
            return true;
        }
        Object objB2 = null;
        AbstractC2947g abstractC2947gZ = null;
        while (e0Var.w() != Integer.MAX_VALUE) {
            int iA2 = e0Var.a();
            if (iA2 == r0.f39355c) {
                iL = e0Var.l();
                objB2 = abstractC2955o.b(c2954n, this.f39209a, iL);
            } else if (iA2 == r0.f39356d) {
                if (objB2 != null) {
                    abstractC2955o.h(e0Var, objB2, c2954n, c2958s);
                } else {
                    abstractC2947gZ = e0Var.z();
                }
            } else if (!e0Var.C()) {
                break;
            }
        }
        if (e0Var.a() != r0.f39354b) {
            throw InvalidProtocolBufferException.b();
        }
        if (abstractC2947gZ != null) {
            if (objB2 != null) {
                abstractC2955o.i(abstractC2947gZ, objB2, c2954n, c2958s);
            } else {
                l0Var.d(ub2, iL, abstractC2947gZ);
            }
        }
        return true;
    }

    private <UT, UB> void n(l0<UT, UB> l0Var, T t10, s0 s0Var) {
        l0Var.s(l0Var.g(t10), s0Var);
    }

    @Override // com.google.protobuf.f0
    public void a(T t10, T t11) {
        h0.G(this.f39210b, t10, t11);
        if (this.f39211c) {
            h0.E(this.f39212d, t10, t11);
        }
    }

    @Override // com.google.protobuf.f0
    public void b(T t10) {
        this.f39210b.j(t10);
        this.f39212d.f(t10);
    }

    @Override // com.google.protobuf.f0
    public final boolean c(T t10) {
        return this.f39212d.c(t10).p();
    }

    @Override // com.google.protobuf.f0
    public boolean d(T t10, T t11) {
        if (!this.f39210b.g(t10).equals(this.f39210b.g(t11))) {
            return false;
        }
        if (this.f39211c) {
            return this.f39212d.c(t10).equals(this.f39212d.c(t11));
        }
        return true;
    }

    @Override // com.google.protobuf.f0
    public int e(T t10) {
        int iJ = j(this.f39210b, t10);
        return this.f39211c ? iJ + this.f39212d.c(t10).j() : iJ;
    }

    @Override // com.google.protobuf.f0
    public T f() {
        P p10 = this.f39209a;
        return p10 instanceof AbstractC2962w ? (T) ((AbstractC2962w) p10).V() : (T) p10.g().j();
    }

    @Override // com.google.protobuf.f0
    public int g(T t10) {
        int iHashCode = this.f39210b.g(t10).hashCode();
        return this.f39211c ? (iHashCode * 53) + this.f39212d.c(t10).hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.f0
    public void h(T t10, s0 s0Var) {
        Iterator itT = this.f39212d.c(t10).t();
        while (itT.hasNext()) {
            Map.Entry entry = (Map.Entry) itT.next();
            C2958s.b bVar = (C2958s.b) entry.getKey();
            if (bVar.i() != r0.c.MESSAGE || bVar.isRepeated() || bVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof B.b) {
                s0Var.c(bVar.e(), ((B.b) entry).a().e());
            } else {
                s0Var.c(bVar.e(), entry.getValue());
            }
        }
        n(this.f39210b, t10, s0Var);
    }

    @Override // com.google.protobuf.f0
    public void i(T t10, e0 e0Var, C2954n c2954n) {
        k(this.f39210b, this.f39212d, t10, e0Var, c2954n);
    }
}
