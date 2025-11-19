package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.q5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2565q5<T> implements C5<T> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2517k5 f34274a;

    /* renamed from: b, reason: collision with root package name */
    private final R5<?, ?> f34275b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34276c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC2587t4<?> f34277d;

    private C2565q5(R5<?, ?> r52, AbstractC2587t4<?> abstractC2587t4, InterfaceC2517k5 interfaceC2517k5) {
        this.f34275b = r52;
        this.f34276c = abstractC2587t4.e(interfaceC2517k5);
        this.f34277d = abstractC2587t4;
        this.f34274a = interfaceC2517k5;
    }

    static <T> C2565q5<T> j(R5<?, ?> r52, AbstractC2587t4<?> abstractC2587t4, InterfaceC2517k5 interfaceC2517k5) {
        return new C2565q5<>(r52, abstractC2587t4, interfaceC2517k5);
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final T a() {
        InterfaceC2517k5 interfaceC2517k5 = this.f34274a;
        return interfaceC2517k5 instanceof F4 ? (T) ((F4) interfaceC2517k5).D() : (T) interfaceC2517k5.f().y();
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final int b(T t10) {
        R5<?, ?> r52 = this.f34275b;
        int iE = r52.e(r52.k(t10));
        return this.f34276c ? iE + this.f34277d.b(t10).a() : iE;
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final int c(T t10) {
        int iHashCode = this.f34275b.k(t10).hashCode();
        return this.f34276c ? (iHashCode * 53) + this.f34277d.b(t10).hashCode() : iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099 A[EDGE_INSN: B:56:0x0099->B:34:0x0099 BREAK  A[LOOP:1: B:18:0x0053->B:61:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.C5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.T3 r14) throws com.google.android.gms.internal.measurement.zzkp {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.F4 r0 = (com.google.android.gms.internal.measurement.F4) r0
            com.google.android.gms.internal.measurement.T5 r1 = r0.zzb
            com.google.android.gms.internal.measurement.T5 r2 = com.google.android.gms.internal.measurement.T5.k()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.measurement.T5 r1 = com.google.android.gms.internal.measurement.T5.l()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.measurement.F4$b r10 = (com.google.android.gms.internal.measurement.F4.b) r10
            r10.K()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.measurement.U3.s(r11, r12, r14)
            int r2 = r14.f33875a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.measurement.t4<?> r12 = r9.f34277d
            com.google.android.gms.internal.measurement.r4 r0 = r14.f33878d
            com.google.android.gms.internal.measurement.k5 r3 = r9.f34274a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.c(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.F4$d r0 = (com.google.android.gms.internal.measurement.F4.d) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.U3.d(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.measurement.C2628y5.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.measurement.U3.b(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.measurement.U3.s(r11, r4, r14)
            int r5 = r14.f33875a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.measurement.U3.l(r11, r4, r14)
            java.lang.Object r2 = r14.f33877c
            com.google.android.gms.internal.measurement.Y3 r2 = (com.google.android.gms.internal.measurement.Y3) r2
            goto L53
        L72:
            com.google.android.gms.internal.measurement.C2628y5.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.measurement.U3.s(r11, r4, r14)
            int r12 = r14.f33875a
            com.google.android.gms.internal.measurement.t4<?> r0 = r9.f34277d
            com.google.android.gms.internal.measurement.r4 r5 = r14.f33878d
            com.google.android.gms.internal.measurement.k5 r6 = r9.f34274a
            java.lang.Object r0 = r0.c(r5, r6, r12)
            com.google.android.gms.internal.measurement.F4$d r0 = (com.google.android.gms.internal.measurement.F4.d) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.measurement.U3.b(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.e(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.measurement.zzkp r10 = com.google.android.gms.internal.measurement.zzkp.e()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2565q5.d(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.T3):void");
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final boolean e(T t10) {
        return this.f34277d.b(t10).s();
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final void f(T t10) {
        this.f34275b.l(t10);
        this.f34277d.g(t10);
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final void g(T t10, T t11) {
        D5.n(this.f34275b, t10, t11);
        if (this.f34276c) {
            D5.l(this.f34277d, t10, t11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final void h(T t10, InterfaceC2502i6 interfaceC2502i6) {
        Iterator itP = this.f34277d.b(t10).p();
        while (itP.hasNext()) {
            Map.Entry entry = (Map.Entry) itP.next();
            InterfaceC2611w4 interfaceC2611w4 = (InterfaceC2611w4) entry.getKey();
            if (interfaceC2611w4.d() != EnumC2486g6.MESSAGE || interfaceC2611w4.h() || interfaceC2611w4.f()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof Q4) {
                interfaceC2502i6.q(interfaceC2611w4.a(), ((Q4) entry).a().c());
            } else {
                interfaceC2502i6.q(interfaceC2611w4.a(), entry.getValue());
            }
        }
        R5<?, ?> r52 = this.f34275b;
        r52.d(r52.k(t10), interfaceC2502i6);
    }

    @Override // com.google.android.gms.internal.measurement.C5
    public final boolean i(T t10, T t11) {
        if (!this.f34275b.k(t10).equals(this.f34275b.k(t11))) {
            return false;
        }
        if (this.f34276c) {
            return this.f34277d.b(t10).equals(this.f34277d.b(t11));
        }
        return true;
    }
}
