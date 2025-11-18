package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.h3 */
/* loaded from: classes2.dex */
final class C7519h3<T> implements InterfaceC7567p3<T> {

    /* renamed from: a */
    private final zzgo f27759a;

    /* renamed from: b */
    private final AbstractC7520h4<?, ?> f27760b;

    /* renamed from: c */
    private final boolean f27761c;

    /* renamed from: d */
    private final AbstractC7494d2<?> f27762d;

    private C7519h3(AbstractC7520h4<?, ?> abstractC7520h4, AbstractC7494d2<?> abstractC7494d2, zzgo zzgoVar) {
        this.f27760b = abstractC7520h4;
        this.f27761c = abstractC7494d2.mo21038h(zzgoVar);
        this.f27762d = abstractC7494d2;
        this.f27759a = zzgoVar;
    }

    /* renamed from: k */
    static <T> C7519h3<T> m21124k(AbstractC7520h4<?, ?> abstractC7520h4, AbstractC7494d2<?> abstractC7494d2, zzgo zzgoVar) {
        return new C7519h3<>(abstractC7520h4, abstractC7494d2, zzgoVar);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: a */
    public final T mo21095a() {
        return (T) this.f27759a.mo22270f().mo22282x();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: b */
    public final int mo21096b(T t) {
        AbstractC7520h4<?, ?> abstractC7520h4 = this.f27760b;
        int iMo21142r = abstractC7520h4.mo21142r(abstractC7520h4.mo21135k(t)) + 0;
        return this.f27761c ? iMo21142r + this.f27762d.mo21032b(t).m21123r() : iMo21142r;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: c */
    public final int mo21097c(T t) {
        int iHashCode = this.f27760b.mo21135k(t).hashCode();
        return this.f27761c ? (iHashCode * 53) + this.f27762d.mo21032b(t).hashCode() : iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099 A[EDGE_INSN: B:57:0x0099->B:34:0x0099 BREAK  A[LOOP:1: B:18:0x0053->B:62:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo21098d(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.C7547m1 r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.zzfd r0 = (com.google.android.gms.internal.measurement.zzfd) r0
            com.google.android.gms.internal.measurement.zzhy r1 = r0.zzb
            com.google.android.gms.internal.measurement.zzhy r2 = com.google.android.gms.internal.measurement.zzhy.m22330a()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.measurement.zzhy r1 = com.google.android.gms.internal.measurement.zzhy.m22333g()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.measurement.zzfd$zzd r10 = (com.google.android.gms.internal.measurement.zzfd.zzd) r10
            r10.m22284B()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.measurement.C7529j1.m21157i(r11, r12, r14)
            int r2 = r14.f27837a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.measurement.d2<?> r12 = r9.f27762d
            com.google.android.gms.internal.measurement.zzeq r0 = r14.f27840d
            com.google.android.gms.internal.measurement.zzgo r3 = r9.f27759a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.mo21033c(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.zzfd$zzf r0 = (com.google.android.gms.internal.measurement.zzfd.zzf) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.C7529j1.m21151c(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.measurement.C7543l3.m21234a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.measurement.C7529j1.m21149a(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.measurement.C7529j1.m21157i(r11, r4, r14)
            int r5 = r14.f27837a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.measurement.C7529j1.m21165q(r11, r4, r14)
            java.lang.Object r2 = r14.f27839c
            com.google.android.gms.internal.measurement.zzdu r2 = (com.google.android.gms.internal.measurement.zzdu) r2
            goto L53
        L72:
            com.google.android.gms.internal.measurement.C7543l3.m21234a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.measurement.C7529j1.m21157i(r11, r4, r14)
            int r12 = r14.f27837a
            com.google.android.gms.internal.measurement.d2<?> r0 = r9.f27762d
            com.google.android.gms.internal.measurement.zzeq r5 = r14.f27840d
            com.google.android.gms.internal.measurement.zzgo r6 = r9.f27759a
            java.lang.Object r0 = r0.mo21033c(r5, r6, r12)
            com.google.android.gms.internal.measurement.zzfd$zzf r0 = (com.google.android.gms.internal.measurement.zzfd.zzf) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.measurement.C7529j1.m21149a(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.m22334c(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.measurement.zzfo r10 = com.google.android.gms.internal.measurement.zzfo.m22302g()
            goto Lad
        Lac:
            throw r10
        Lad:
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7519h3.mo21098d(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.m1):void");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: e */
    public final boolean mo21099e(T t) {
        return this.f27762d.mo21032b(t).m21122q();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: f */
    public final void mo21100f(T t) {
        this.f27760b.mo21141q(t);
        this.f27762d.mo21040j(t);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: g */
    public final boolean mo21101g(T t, T t2) {
        if (!this.f27760b.mo21135k(t).equals(this.f27760b.mo21135k(t2))) {
            return false;
        }
        if (this.f27761c) {
            return this.f27762d.mo21032b(t).equals(this.f27762d.mo21032b(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: h */
    public final void mo21102h(T t, InterfaceC7622y4 interfaceC7622y4) throws IOException {
        Iterator itM21120o = this.f27762d.mo21032b(t).m21120o();
        while (itM21120o.hasNext()) {
            Map.Entry entry = (Map.Entry) itM21120o.next();
            zzey zzeyVar = (zzey) entry.getKey();
            if (zzeyVar.mo22252c() != zzip.MESSAGE || zzeyVar.mo22253d() || zzeyVar.mo22254e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C7560o2) {
                interfaceC7622y4.mo21008f(zzeyVar.mo22250a(), ((C7560o2) entry).m21265a().m22309d());
            } else {
                interfaceC7622y4.mo21008f(zzeyVar.mo22250a(), entry.getValue());
            }
        }
        AbstractC7520h4<?, ?> abstractC7520h4 = this.f27760b;
        abstractC7520h4.mo21137m(abstractC7520h4.mo21135k(t), interfaceC7622y4);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:0: B:46:0x000c->B:54:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo21103i(T r11, com.google.android.gms.internal.measurement.InterfaceC7573q3 r12, com.google.android.gms.internal.measurement.zzeq r13) throws java.io.IOException {
        /*
            r10 = this;
            com.google.android.gms.internal.measurement.h4<?, ?> r0 = r10.f27760b
            com.google.android.gms.internal.measurement.d2<?> r1 = r10.f27762d
            java.lang.Object r2 = r0.mo21139o(r11)
            com.google.android.gms.internal.measurement.h2 r3 = r1.mo21039i(r11)
        Lc:
            int r4 = r12.mo21306a()     // Catch: java.lang.Throwable -> L8e
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L19
            r0.mo21138n(r11, r2)
            return
        L19:
            int r4 = r12.mo21307b()     // Catch: java.lang.Throwable -> L8e
            r6 = 11
            if (r4 == r6) goto L3e
            r5 = r4 & 7
            r6 = 2
            if (r5 != r6) goto L39
            com.google.android.gms.internal.measurement.zzgo r5 = r10.f27759a     // Catch: java.lang.Throwable -> L8e
            int r4 = r4 >>> 3
            java.lang.Object r4 = r1.mo21033c(r13, r5, r4)     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L34
            r1.mo21036f(r12, r4, r13, r3)     // Catch: java.lang.Throwable -> L8e
            goto L82
        L34:
            boolean r4 = r0.m21134j(r2, r12)     // Catch: java.lang.Throwable -> L8e
            goto L83
        L39:
            boolean r4 = r12.mo21308c()     // Catch: java.lang.Throwable -> L8e
            goto L83
        L3e:
            r4 = 0
            r6 = 0
            r7 = r6
        L41:
            int r8 = r12.mo21306a()     // Catch: java.lang.Throwable -> L8e
            if (r8 == r5) goto L6f
            int r8 = r12.mo21307b()     // Catch: java.lang.Throwable -> L8e
            r9 = 16
            if (r8 != r9) goto L5a
            int r4 = r12.mo21321p()     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.measurement.zzgo r6 = r10.f27759a     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r6 = r1.mo21033c(r13, r6, r4)     // Catch: java.lang.Throwable -> L8e
            goto L41
        L5a:
            r9 = 26
            if (r8 != r9) goto L69
            if (r6 == 0) goto L64
            r1.mo21036f(r12, r6, r13, r3)     // Catch: java.lang.Throwable -> L8e
            goto L41
        L64:
            com.google.android.gms.internal.measurement.zzdu r7 = r12.mo21311f()     // Catch: java.lang.Throwable -> L8e
            goto L41
        L69:
            boolean r8 = r12.mo21308c()     // Catch: java.lang.Throwable -> L8e
            if (r8 != 0) goto L41
        L6f:
            int r5 = r12.mo21307b()     // Catch: java.lang.Throwable -> L8e
            r8 = 12
            if (r5 != r8) goto L89
            if (r7 == 0) goto L82
            if (r6 == 0) goto L7f
            r1.mo21035e(r7, r6, r13, r3)     // Catch: java.lang.Throwable -> L8e
            goto L82
        L7f:
            r0.mo21129e(r2, r4, r7)     // Catch: java.lang.Throwable -> L8e
        L82:
            r4 = 1
        L83:
            if (r4 != 0) goto Lc
            r0.mo21138n(r11, r2)
            return
        L89:
            com.google.android.gms.internal.measurement.zzfo r12 = com.google.android.gms.internal.measurement.zzfo.m22300e()     // Catch: java.lang.Throwable -> L8e
            throw r12     // Catch: java.lang.Throwable -> L8e
        L8e:
            r12 = move-exception
            r0.mo21138n(r11, r2)
            goto L94
        L93:
            throw r12
        L94:
            goto L93
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7519h3.mo21103i(java.lang.Object, com.google.android.gms.internal.measurement.q3, com.google.android.gms.internal.measurement.zzeq):void");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7567p3
    /* renamed from: j */
    public final void mo21104j(T t, T t2) {
        C7579r3.m21380o(this.f27760b, t, t2);
        if (this.f27761c) {
            C7579r3.m21378m(this.f27762d, t, t2);
        }
    }
}
