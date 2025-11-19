package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.B;
import com.google.crypto.tink.shaded.protobuf.C2909t;
import com.google.crypto.tink.shaded.protobuf.r0;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MessageSetSchema.java */
/* loaded from: classes2.dex */
final class U<T> implements f0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final P f37768a;

    /* renamed from: b, reason: collision with root package name */
    private final l0<?, ?> f37769b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37770c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC2906p<?> f37771d;

    private U(l0<?, ?> l0Var, AbstractC2906p<?> abstractC2906p, P p10) {
        this.f37769b = l0Var;
        this.f37770c = abstractC2906p.e(p10);
        this.f37771d = abstractC2906p;
        this.f37768a = p10;
    }

    private <UT, UB> int k(l0<UT, UB> l0Var, T t10) {
        return l0Var.i(l0Var.g(t10));
    }

    private <UT, UB, ET extends C2909t.b<ET>> void l(l0<UT, UB> l0Var, AbstractC2906p<ET> abstractC2906p, T t10, e0 e0Var, C2905o c2905o) {
        UB ubF = l0Var.f(t10);
        C2909t<ET> c2909tD = abstractC2906p.d(t10);
        while (e0Var.w() != Integer.MAX_VALUE) {
            try {
                if (!n(e0Var, c2905o, abstractC2906p, c2909tD, l0Var, ubF)) {
                    return;
                }
            } finally {
                l0Var.o(t10, ubF);
            }
        }
    }

    static <T> U<T> m(l0<?, ?> l0Var, AbstractC2906p<?> abstractC2906p, P p10) {
        return new U<>(l0Var, abstractC2906p, p10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends C2909t.b<ET>> boolean n(e0 e0Var, C2905o c2905o, AbstractC2906p<ET> abstractC2906p, C2909t<ET> c2909t, l0<UT, UB> l0Var, UB ub2) throws InvalidProtocolBufferException {
        int iA = e0Var.a();
        if (iA != r0.f37923a) {
            if (r0.b(iA) != 2) {
                return e0Var.C();
            }
            Object objB = abstractC2906p.b(c2905o, this.f37768a, r0.a(iA));
            if (objB == null) {
                return l0Var.m(ub2, e0Var);
            }
            abstractC2906p.h(e0Var, objB, c2905o, c2909t);
            return true;
        }
        Object objB2 = null;
        int iL = 0;
        AbstractC2898h abstractC2898hZ = null;
        while (e0Var.w() != Integer.MAX_VALUE) {
            int iA2 = e0Var.a();
            if (iA2 == r0.f37925c) {
                iL = e0Var.l();
                objB2 = abstractC2906p.b(c2905o, this.f37768a, iL);
            } else if (iA2 == r0.f37926d) {
                if (objB2 != null) {
                    abstractC2906p.h(e0Var, objB2, c2905o, c2909t);
                } else {
                    abstractC2898hZ = e0Var.z();
                }
            } else if (!e0Var.C()) {
                break;
            }
        }
        if (e0Var.a() != r0.f37924b) {
            throw InvalidProtocolBufferException.b();
        }
        if (abstractC2898hZ != null) {
            if (objB2 != null) {
                abstractC2906p.i(abstractC2898hZ, objB2, c2905o, c2909t);
            } else {
                l0Var.d(ub2, iL, abstractC2898hZ);
            }
        }
        return true;
    }

    private <UT, UB> void o(l0<UT, UB> l0Var, T t10, s0 s0Var) {
        l0Var.s(l0Var.g(t10), s0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void a(T t10, T t11) {
        h0.G(this.f37769b, t10, t11);
        if (this.f37770c) {
            h0.E(this.f37771d, t10, t11);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void b(T t10) {
        this.f37769b.j(t10);
        this.f37771d.f(t10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final boolean c(T t10) {
        return this.f37771d.c(t10).o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public boolean d(T t10, T t11) {
        if (!this.f37769b.g(t10).equals(this.f37769b.g(t11))) {
            return false;
        }
        if (this.f37770c) {
            return this.f37771d.c(t10).equals(this.f37771d.c(t11));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public int e(T t10) {
        int iK = k(this.f37769b, t10);
        return this.f37770c ? iK + this.f37771d.c(t10).j() : iK;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public T f() {
        P p10 = this.f37768a;
        return p10 instanceof AbstractC2913x ? (T) ((AbstractC2913x) p10).N() : (T) p10.g().j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public int g(T t10) {
        int iHashCode = this.f37769b.g(t10).hashCode();
        return this.f37770c ? (iHashCode * 53) + this.f37771d.c(t10).hashCode() : iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb A[EDGE_INSN: B:58:0x00cb->B:34:0x00cb BREAK  A[LOOP:1: B:18:0x006d->B:61:0x006d], SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(T r11, byte[] r12, int r13, int r14, com.google.crypto.tink.shaded.protobuf.C2895e.b r15) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            r10 = this;
            r0 = r11
            com.google.crypto.tink.shaded.protobuf.x r0 = (com.google.crypto.tink.shaded.protobuf.AbstractC2913x) r0
            com.google.crypto.tink.shaded.protobuf.m0 r1 = r0.unknownFields
            com.google.crypto.tink.shaded.protobuf.m0 r2 = com.google.crypto.tink.shaded.protobuf.m0.c()
            if (r1 != r2) goto L11
            com.google.crypto.tink.shaded.protobuf.m0 r1 = com.google.crypto.tink.shaded.protobuf.m0.k()
            r0.unknownFields = r1
        L11:
            com.google.crypto.tink.shaded.protobuf.x$c r11 = (com.google.crypto.tink.shaded.protobuf.AbstractC2913x.c) r11
            com.google.crypto.tink.shaded.protobuf.t r11 = r11.X()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld7
            int r4 = com.google.crypto.tink.shaded.protobuf.C2895e.I(r12, r13, r15)
            int r13 = r15.f37794a
            int r3 = com.google.crypto.tink.shaded.protobuf.r0.f37923a
            r5 = 2
            if (r13 == r3) goto L6b
            int r3 = com.google.crypto.tink.shaded.protobuf.r0.b(r13)
            if (r3 != r5) goto L66
            com.google.crypto.tink.shaded.protobuf.p<?> r2 = r10.f37771d
            com.google.crypto.tink.shaded.protobuf.o r3 = r15.f37797d
            com.google.crypto.tink.shaded.protobuf.P r5 = r10.f37768a
            int r6 = com.google.crypto.tink.shaded.protobuf.r0.a(r13)
            java.lang.Object r2 = r2.b(r3, r5, r6)
            r8 = r2
            com.google.crypto.tink.shaded.protobuf.x$e r8 = (com.google.crypto.tink.shaded.protobuf.AbstractC2913x.e) r8
            if (r8 == 0) goto L5c
            com.google.crypto.tink.shaded.protobuf.b0 r13 = com.google.crypto.tink.shaded.protobuf.b0.a()
            com.google.crypto.tink.shaded.protobuf.P r2 = r8.b()
            java.lang.Class r2 = r2.getClass()
            com.google.crypto.tink.shaded.protobuf.f0 r13 = r13.c(r2)
            int r13 = com.google.crypto.tink.shaded.protobuf.C2895e.p(r13, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.x$d r2 = r8.f38048b
            java.lang.Object r3 = r15.f37796c
            r11.x(r2, r3)
        L5a:
            r2 = r8
            goto L19
        L5c:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.crypto.tink.shaded.protobuf.C2895e.G(r2, r3, r4, r5, r6, r7)
            goto L5a
        L66:
            int r13 = com.google.crypto.tink.shaded.protobuf.C2895e.P(r13, r12, r4, r14, r15)
            goto L19
        L6b:
            r13 = 0
            r3 = r0
        L6d:
            if (r4 >= r14) goto Lcb
            int r4 = com.google.crypto.tink.shaded.protobuf.C2895e.I(r12, r4, r15)
            int r6 = r15.f37794a
            int r7 = com.google.crypto.tink.shaded.protobuf.r0.a(r6)
            int r8 = com.google.crypto.tink.shaded.protobuf.r0.b(r6)
            if (r7 == r5) goto Lac
            r9 = 3
            if (r7 == r9) goto L83
            goto Lc1
        L83:
            if (r2 == 0) goto La1
            com.google.crypto.tink.shaded.protobuf.b0 r6 = com.google.crypto.tink.shaded.protobuf.b0.a()
            com.google.crypto.tink.shaded.protobuf.P r7 = r2.b()
            java.lang.Class r7 = r7.getClass()
            com.google.crypto.tink.shaded.protobuf.f0 r6 = r6.c(r7)
            int r4 = com.google.crypto.tink.shaded.protobuf.C2895e.p(r6, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.x$d r6 = r2.f38048b
            java.lang.Object r7 = r15.f37796c
            r11.x(r6, r7)
            goto L6d
        La1:
            if (r8 != r5) goto Lc1
            int r4 = com.google.crypto.tink.shaded.protobuf.C2895e.b(r12, r4, r15)
            java.lang.Object r3 = r15.f37796c
            com.google.crypto.tink.shaded.protobuf.h r3 = (com.google.crypto.tink.shaded.protobuf.AbstractC2898h) r3
            goto L6d
        Lac:
            if (r8 != 0) goto Lc1
            int r4 = com.google.crypto.tink.shaded.protobuf.C2895e.I(r12, r4, r15)
            int r13 = r15.f37794a
            com.google.crypto.tink.shaded.protobuf.p<?> r2 = r10.f37771d
            com.google.crypto.tink.shaded.protobuf.o r6 = r15.f37797d
            com.google.crypto.tink.shaded.protobuf.P r7 = r10.f37768a
            java.lang.Object r2 = r2.b(r6, r7, r13)
            com.google.crypto.tink.shaded.protobuf.x$e r2 = (com.google.crypto.tink.shaded.protobuf.AbstractC2913x.e) r2
            goto L6d
        Lc1:
            int r7 = com.google.crypto.tink.shaded.protobuf.r0.f37924b
            if (r6 != r7) goto Lc6
            goto Lcb
        Lc6:
            int r4 = com.google.crypto.tink.shaded.protobuf.C2895e.P(r6, r12, r4, r14, r15)
            goto L6d
        Lcb:
            if (r3 == 0) goto Ld4
            int r13 = com.google.crypto.tink.shaded.protobuf.r0.c(r13, r5)
            r1.n(r13, r3)
        Ld4:
            r13 = r4
            goto L19
        Ld7:
            if (r13 != r14) goto Lda
            return
        Lda:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r11 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.h()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.U.h(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void i(T t10, s0 s0Var) {
        Iterator itS = this.f37771d.c(t10).s();
        while (itS.hasNext()) {
            Map.Entry entry = (Map.Entry) itS.next();
            C2909t.b bVar = (C2909t.b) entry.getKey();
            if (bVar.i() != r0.c.MESSAGE || bVar.isRepeated() || bVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof B.b) {
                s0Var.c(bVar.e(), ((B.b) entry).a().e());
            } else {
                s0Var.c(bVar.e(), entry.getValue());
            }
        }
        o(this.f37769b, t10, s0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void j(T t10, e0 e0Var, C2905o c2905o) {
        l(this.f37769b, this.f37771d, t10, e0Var, c2905o);
    }
}
