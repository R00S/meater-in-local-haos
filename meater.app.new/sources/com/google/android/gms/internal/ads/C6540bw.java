package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.bw */
/* loaded from: classes2.dex */
final class C6540bw<T> implements InterfaceC6910lw<T> {

    /* renamed from: a */
    private final zzdpk f18366a;

    /* renamed from: b */
    private final AbstractC6578cx<?, ?> f18367b;

    /* renamed from: c */
    private final boolean f18368c;

    /* renamed from: d */
    private final AbstractC7278vu<?> f18369d;

    private C6540bw(AbstractC6578cx<?, ?> abstractC6578cx, AbstractC7278vu<?> abstractC7278vu, zzdpk zzdpkVar) {
        this.f18367b = abstractC6578cx;
        this.f18368c = abstractC7278vu.mo15964h(zzdpkVar);
        this.f18369d = abstractC7278vu;
        this.f18366a = zzdpkVar;
    }

    /* renamed from: k */
    static <T> C6540bw<T> m14953k(AbstractC6578cx<?, ?> abstractC6578cx, AbstractC7278vu<?> abstractC7278vu, zzdpk zzdpkVar) {
        return new C6540bw<>(abstractC6578cx, abstractC7278vu, zzdpkVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: a */
    public final void mo14821a(T t, T t2) {
        C6984nw.m15638h(this.f18367b, t, t2);
        if (this.f18368c) {
            C6984nw.m15636f(this.f18369d, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: b */
    public final boolean mo14822b(T t, T t2) {
        if (!this.f18367b.mo15005j(t).equals(this.f18367b.mo15005j(t2))) {
            return false;
        }
        if (this.f18368c) {
            return this.f18369d.mo15965i(t).equals(this.f18369d.mo15965i(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: c */
    public final T mo14823c() {
        return (T) this.f18366a.mo19726d().mo19733a1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: d */
    public final int mo14824d(T t) {
        int iHashCode = this.f18367b.mo15005j(t).hashCode();
        return this.f18368c ? (iHashCode * 53) + this.f18369d.mo15965i(t).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: e */
    public final void mo14825e(T t, InterfaceC7244ux interfaceC7244ux) throws IOException {
        Iterator itM16124e = this.f18369d.mo15965i(t).m16124e();
        while (itM16124e.hasNext()) {
            Map.Entry entry = (Map.Entry) itM16124e.next();
            zzdnu zzdnuVar = (zzdnu) entry.getKey();
            if (zzdnuVar.m19709s() != zzdrn.MESSAGE || zzdnuVar.m19710t() || zzdnuVar.m19711w()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C6798iv) {
                interfaceC7244ux.mo15860G(zzdnuVar.m19706i(), ((C6798iv) entry).m15352a().m19762a());
            } else {
                interfaceC7244ux.mo15860G(zzdnuVar.m19706i(), entry.getValue());
            }
        }
        AbstractC6578cx<?, ?> abstractC6578cx = this.f18367b;
        abstractC6578cx.mo15011p(abstractC6578cx.mo15005j(t), interfaceC7244ux);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: f */
    public final void mo14826f(T t) {
        this.f18367b.mo15002g(t);
        this.f18369d.mo15963g(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8 A[EDGE_INSN: B:61:0x00a8->B:37:0x00a8 BREAK  A[LOOP:1: B:21:0x0062->B:65:0x0062], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo14827g(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.ads.C6538bu r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.ads.zzdob r0 = (com.google.android.gms.internal.ads.zzdob) r0
            com.google.android.gms.internal.ads.zzdqu r1 = r0.zzhhd
            com.google.android.gms.internal.ads.zzdqu r2 = com.google.android.gms.internal.ads.zzdqu.m19782f()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.ads.zzdqu r1 = com.google.android.gms.internal.ads.zzdqu.m19784i()
            r0.zzhhd = r1
        L11:
            com.google.android.gms.internal.ads.zzdob$zzc r10 = (com.google.android.gms.internal.ads.zzdob.zzc) r10
            com.google.android.gms.internal.ads.yu<java.lang.Object> r0 = r10.zzhhj
            boolean r0 = r0.m16122c()
            if (r0 == 0) goto L25
            com.google.android.gms.internal.ads.yu<java.lang.Object> r0 = r10.zzhhj
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.ads.yu r0 = (com.google.android.gms.internal.ads.C7389yu) r0
            r10.zzhhj = r0
        L25:
            r10 = 0
            r0 = r10
        L27:
            if (r12 >= r13) goto Lb3
            int r4 = com.google.android.gms.internal.ads.C6501au.m14773h(r11, r12, r14)
            int r2 = r14.f18356a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L60
            r12 = r2 & 7
            if (r12 != r3) goto L5b
            com.google.android.gms.internal.ads.vu<?> r12 = r9.f18369d
            com.google.android.gms.internal.ads.zzdno r0 = r14.f18359d
            com.google.android.gms.internal.ads.zzdpk r3 = r9.f18366a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.mo15958b(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.ads.zzdob$zzd r0 = (com.google.android.gms.internal.ads.zzdob.zzd) r0
            if (r0 != 0) goto L52
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.ads.C6501au.m14768c(r2, r3, r4, r5, r6, r7)
            goto L27
        L52:
            com.google.android.gms.internal.ads.C6725gw.m15176b()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L5b:
            int r12 = com.google.android.gms.internal.ads.C6501au.m14766a(r2, r11, r4, r13, r14)
            goto L27
        L60:
            r12 = 0
            r2 = r10
        L62:
            if (r4 >= r13) goto La8
            int r4 = com.google.android.gms.internal.ads.C6501au.m14773h(r11, r4, r14)
            int r5 = r14.f18356a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L8a
            r8 = 3
            if (r6 == r8) goto L74
            goto L9f
        L74:
            if (r0 != 0) goto L81
            if (r7 != r3) goto L9f
            int r4 = com.google.android.gms.internal.ads.C6501au.m14778m(r11, r4, r14)
            java.lang.Object r2 = r14.f18358c
            com.google.android.gms.internal.ads.zzdmr r2 = (com.google.android.gms.internal.ads.zzdmr) r2
            goto L62
        L81:
            com.google.android.gms.internal.ads.C6725gw.m15176b()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L8a:
            if (r7 != 0) goto L9f
            int r4 = com.google.android.gms.internal.ads.C6501au.m14773h(r11, r4, r14)
            int r12 = r14.f18356a
            com.google.android.gms.internal.ads.vu<?> r0 = r9.f18369d
            com.google.android.gms.internal.ads.zzdno r5 = r14.f18359d
            com.google.android.gms.internal.ads.zzdpk r6 = r9.f18366a
            java.lang.Object r0 = r0.mo15958b(r5, r6, r12)
            com.google.android.gms.internal.ads.zzdob$zzd r0 = (com.google.android.gms.internal.ads.zzdob.zzd) r0
            goto L62
        L9f:
            r6 = 12
            if (r5 == r6) goto La8
            int r4 = com.google.android.gms.internal.ads.C6501au.m14766a(r5, r11, r4, r13, r14)
            goto L62
        La8:
            if (r2 == 0) goto Lb0
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.m19791k(r12, r2)
        Lb0:
            r12 = r4
            goto L27
        Lb3:
            if (r12 != r13) goto Lb6
            return
        Lb6:
            com.google.android.gms.internal.ads.zzdok r10 = com.google.android.gms.internal.ads.zzdok.m19756g()
            goto Lbc
        Lbb:
            throw r10
        Lbc:
            goto Lbb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6540bw.mo14827g(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.bu):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:0: B:46:0x000c->B:54:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo14828h(T r11, com.google.android.gms.internal.ads.InterfaceC6873kw r12, com.google.android.gms.internal.ads.zzdno r13) throws java.io.IOException {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.cx<?, ?> r0 = r10.f18367b
            com.google.android.gms.internal.ads.vu<?> r1 = r10.f18369d
            java.lang.Object r2 = r0.mo15006k(r11)
            com.google.android.gms.internal.ads.yu r3 = r1.mo15966j(r11)
        Lc:
            int r4 = r12.mo15456N()     // Catch: java.lang.Throwable -> L8e
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L19
            r0.mo15013r(r11, r2)
            return
        L19:
            int r4 = r12.getTag()     // Catch: java.lang.Throwable -> L8e
            r6 = 11
            if (r4 == r6) goto L3e
            r5 = r4 & 7
            r6 = 2
            if (r5 != r6) goto L39
            com.google.android.gms.internal.ads.zzdpk r5 = r10.f18366a     // Catch: java.lang.Throwable -> L8e
            int r4 = r4 >>> 3
            java.lang.Object r4 = r1.mo15958b(r13, r5, r4)     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L34
            r1.mo15961e(r12, r4, r13, r3)     // Catch: java.lang.Throwable -> L8e
            goto L82
        L34:
            boolean r4 = r0.m15001f(r2, r12)     // Catch: java.lang.Throwable -> L8e
            goto L83
        L39:
            boolean r4 = r12.mo15461S()     // Catch: java.lang.Throwable -> L8e
            goto L83
        L3e:
            r4 = 0
            r6 = 0
            r7 = r6
        L41:
            int r8 = r12.mo15456N()     // Catch: java.lang.Throwable -> L8e
            if (r8 == r5) goto L6f
            int r8 = r12.getTag()     // Catch: java.lang.Throwable -> L8e
            r9 = 16
            if (r8 != r9) goto L5a
            int r4 = r12.mo15464V()     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzdpk r6 = r10.f18366a     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r6 = r1.mo15958b(r13, r6, r4)     // Catch: java.lang.Throwable -> L8e
            goto L41
        L5a:
            r9 = 26
            if (r8 != r9) goto L69
            if (r6 == 0) goto L64
            r1.mo15961e(r12, r6, r13, r3)     // Catch: java.lang.Throwable -> L8e
            goto L41
        L64:
            com.google.android.gms.internal.ads.zzdmr r7 = r12.mo15462T()     // Catch: java.lang.Throwable -> L8e
            goto L41
        L69:
            boolean r8 = r12.mo15461S()     // Catch: java.lang.Throwable -> L8e
            if (r8 != 0) goto L41
        L6f:
            int r5 = r12.getTag()     // Catch: java.lang.Throwable -> L8e
            r8 = 12
            if (r5 != r8) goto L89
            if (r7 == 0) goto L82
            if (r6 == 0) goto L7f
            r1.mo15960d(r7, r6, r13, r3)     // Catch: java.lang.Throwable -> L8e
            goto L82
        L7f:
            r0.mo14997b(r2, r4, r7)     // Catch: java.lang.Throwable -> L8e
        L82:
            r4 = 1
        L83:
            if (r4 != 0) goto Lc
            r0.mo15013r(r11, r2)
            return
        L89:
            com.google.android.gms.internal.ads.zzdok r12 = com.google.android.gms.internal.ads.zzdok.m19754e()     // Catch: java.lang.Throwable -> L8e
            throw r12     // Catch: java.lang.Throwable -> L8e
        L8e:
            r12 = move-exception
            r0.mo15013r(r11, r2)
            goto L94
        L93:
            throw r12
        L94:
            goto L93
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6540bw.mo14828h(java.lang.Object, com.google.android.gms.internal.ads.kw, com.google.android.gms.internal.ads.zzdno):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: i */
    public final int mo14829i(T t) {
        AbstractC6578cx<?, ?> abstractC6578cx = this.f18367b;
        int iMo15007l = abstractC6578cx.mo15007l(abstractC6578cx.mo15005j(t)) + 0;
        return this.f18368c ? iMo15007l + this.f18369d.mo15965i(t).m16128o() : iMo15007l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6910lw
    /* renamed from: j */
    public final boolean mo14830j(T t) {
        return this.f18369d.mo15965i(t).m16123d();
    }
}
