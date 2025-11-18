package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.s3 */
/* loaded from: classes2.dex */
final class CallableC7140s3 implements Callable<zzase> {

    /* renamed from: f */
    private final /* synthetic */ Context f20497f;

    /* renamed from: g */
    private final /* synthetic */ zzasg f20498g;

    CallableC7140s3(zzasg zzasgVar, Context context) {
        this.f20498g = zzasgVar;
        this.f20497f = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzase call() throws java.lang.Exception {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzasg r0 = r6.f20498g
            java.util.WeakHashMap r0 = com.google.android.gms.internal.ads.zzasg.m16915a(r0)
            android.content.Context r1 = r6.f20497f
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.t3 r0 = (com.google.android.gms.internal.ads.C7177t3) r0
            if (r0 == 0) goto L42
            long r1 = r0.f20551a
            com.google.android.gms.internal.ads.zzacj<java.lang.Long> r3 = com.google.android.gms.internal.ads.zzacu.f21708T1
            com.google.android.gms.internal.ads.zzacr r4 = com.google.android.gms.internal.ads.zzyt.m20848e()
            java.lang.Object r3 = r4.m16421c(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            long r1 = r1 + r3
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzk.zzln()
            long r3 = r3.mo14608a()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L31
            r1 = 1
            goto L32
        L31:
            r1 = 0
        L32:
            if (r1 != 0) goto L42
            com.google.android.gms.internal.ads.zzasf r1 = new com.google.android.gms.internal.ads.zzasf
            android.content.Context r2 = r6.f20497f
            com.google.android.gms.internal.ads.zzase r0 = r0.f20552b
            r1.<init>(r2, r0)
            com.google.android.gms.internal.ads.zzase r0 = r1.m16914g()
            goto L4d
        L42:
            com.google.android.gms.internal.ads.zzasf r0 = new com.google.android.gms.internal.ads.zzasf
            android.content.Context r1 = r6.f20497f
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzase r0 = r0.m16914g()
        L4d:
            com.google.android.gms.internal.ads.zzasg r1 = r6.f20498g
            java.util.WeakHashMap r1 = com.google.android.gms.internal.ads.zzasg.m16915a(r1)
            android.content.Context r2 = r6.f20497f
            com.google.android.gms.internal.ads.t3 r3 = new com.google.android.gms.internal.ads.t3
            com.google.android.gms.internal.ads.zzasg r4 = r6.f20498g
            r3.<init>(r4, r0)
            r1.put(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CallableC7140s3.call():java.lang.Object");
    }
}
