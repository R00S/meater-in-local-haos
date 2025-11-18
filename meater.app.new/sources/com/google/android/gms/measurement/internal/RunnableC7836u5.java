package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.u5 */
/* loaded from: classes2.dex */
final class RunnableC7836u5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ boolean f28934f;

    /* renamed from: g */
    private final /* synthetic */ zzig f28935g;

    /* renamed from: h */
    private final /* synthetic */ zzig f28936h;

    /* renamed from: i */
    private final /* synthetic */ zzif f28937i;

    RunnableC7836u5(zzif zzifVar, boolean z, zzig zzigVar, zzig zzigVar2) {
        this.f28937i = zzifVar;
        this.f28934f = z;
        this.f28935g = zzigVar;
        this.f28936h = zzigVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.IllegalStateException, java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r10 = this;
            com.google.android.gms.measurement.internal.zzif r0 = r10.f28937i
            com.google.android.gms.measurement.internal.zzx r0 = r0.mo22841n()
            com.google.android.gms.measurement.internal.zzif r1 = r10.f28937i
            com.google.android.gms.measurement.internal.zzeq r1 = r1.mo22795q()
            java.lang.String r1 = r1.m23110C()
            boolean r0 = r0.m23580T(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            boolean r0 = r10.f28934f
            if (r0 == 0) goto L24
            com.google.android.gms.measurement.internal.zzif r0 = r10.f28937i
            com.google.android.gms.measurement.internal.zzig r0 = r0.f29328c
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            if (r0 == 0) goto L3d
            com.google.android.gms.measurement.internal.zzif r3 = r10.f28937i
            com.google.android.gms.measurement.internal.zzig r4 = r3.f29328c
            com.google.android.gms.measurement.internal.zzif.m23330H(r3, r4, r2)
            goto L3d
        L2f:
            boolean r0 = r10.f28934f
            if (r0 == 0) goto L3c
            com.google.android.gms.measurement.internal.zzif r0 = r10.f28937i
            com.google.android.gms.measurement.internal.zzig r3 = r0.f29328c
            if (r3 == 0) goto L3c
            com.google.android.gms.measurement.internal.zzif.m23330H(r0, r3, r2)
        L3c:
            r0 = 0
        L3d:
            com.google.android.gms.measurement.internal.zzig r3 = r10.f28935g
            if (r3 == 0) goto L63
            long r4 = r3.f29336c
            com.google.android.gms.measurement.internal.zzig r6 = r10.f28936h
            long r7 = r6.f29336c
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 != 0) goto L63
            java.lang.String r3 = r3.f29335b
            java.lang.String r4 = r6.f29335b
            boolean r3 = com.google.android.gms.measurement.internal.zzkk.m23514t0(r3, r4)
            if (r3 == 0) goto L63
            com.google.android.gms.measurement.internal.zzig r3 = r10.f28935g
            java.lang.String r3 = r3.f29334a
            com.google.android.gms.measurement.internal.zzig r4 = r10.f28936h
            java.lang.String r4 = r4.f29334a
            boolean r3 = com.google.android.gms.measurement.internal.zzkk.m23514t0(r3, r4)
            if (r3 != 0) goto L64
        L63:
            r1 = 1
        L64:
            if (r1 == 0) goto Lcf
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.google.android.gms.measurement.internal.zzig r3 = r10.f28936h
            com.google.android.gms.measurement.internal.zzif.m23331I(r3, r1, r2)
            com.google.android.gms.measurement.internal.zzig r2 = r10.f28935g
            if (r2 == 0) goto L8f
            java.lang.String r2 = r2.f29334a
            if (r2 == 0) goto L7d
            java.lang.String r3 = "_pn"
            r1.putString(r3, r2)
        L7d:
            com.google.android.gms.measurement.internal.zzig r2 = r10.f28935g
            java.lang.String r2 = r2.f29335b
            java.lang.String r3 = "_pc"
            r1.putString(r3, r2)
            com.google.android.gms.measurement.internal.zzig r2 = r10.f28935g
            long r2 = r2.f29336c
            java.lang.String r4 = "_pi"
            r1.putLong(r4, r2)
        L8f:
            com.google.android.gms.measurement.internal.zzif r2 = r10.f28937i
            com.google.android.gms.measurement.internal.zzx r2 = r2.mo22841n()
            com.google.android.gms.measurement.internal.zzif r3 = r10.f28937i
            com.google.android.gms.measurement.internal.zzeq r3 = r3.mo22795q()
            java.lang.String r3 = r3.m23110C()
            boolean r2 = r2.m23580T(r3)
            if (r2 == 0) goto Lc2
            if (r0 == 0) goto Lc2
            com.google.android.gms.measurement.internal.zzif r0 = r10.f28937i
            com.google.android.gms.measurement.internal.zzjl r0 = r0.mo22799u()
            com.google.android.gms.measurement.internal.y6 r0 = r0.f29351e
            long r2 = r0.m22880e()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lc2
            com.google.android.gms.measurement.internal.zzif r0 = r10.f28937i
            com.google.android.gms.measurement.internal.zzkk r0 = r0.mo22839l()
            r0.m23528J(r1, r2)
        Lc2:
            com.google.android.gms.measurement.internal.zzif r0 = r10.f28937i
            com.google.android.gms.measurement.internal.zzhc r0 = r0.mo22794p()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_vs"
            r0.m23303u0(r2, r3, r1)
        Lcf:
            com.google.android.gms.measurement.internal.zzif r0 = r10.f28937i
            com.google.android.gms.measurement.internal.zzig r1 = r10.f28936h
            r0.f29328c = r1
            com.google.android.gms.measurement.internal.zzik r0 = r0.mo22796r()
            com.google.android.gms.measurement.internal.zzig r1 = r10.f28936h
            r0.m23364N(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.RunnableC7836u5.run():void");
    }
}
