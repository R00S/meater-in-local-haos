package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class S3 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f35167B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f35168C;

    S3(C2843t3 c2843t3, com.google.android.gms.internal.measurement.U0 u02) {
        this.f35167B = u02;
        this.f35168C = c2843t3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.t3 r0 = r7.f35168C
            com.google.android.gms.measurement.internal.c5 r0 = r0.w()
            com.google.android.gms.measurement.internal.s2 r1 = r0.h()
            com.google.android.gms.measurement.internal.q3 r1 = r1.N()
            boolean r1 = r1.x()
            r2 = 0
            if (r1 != 0) goto L24
            com.google.android.gms.measurement.internal.h2 r0 = r0.k()
            com.google.android.gms.measurement.internal.i2 r0 = r0.N()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            r0.a(r1)
        L22:
            r0 = r2
            goto L55
        L24:
            com.google.android.gms.measurement.internal.s2 r1 = r0.h()
            com.google.android.gms.common.util.e r3 = r0.b()
            long r3 = r3.a()
            boolean r1 = r1.z(r3)
            if (r1 != 0) goto L22
            com.google.android.gms.measurement.internal.s2 r1 = r0.h()
            com.google.android.gms.measurement.internal.x2 r1 = r1.f35613s
            long r3 = r1.a()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L47
            goto L22
        L47:
            com.google.android.gms.measurement.internal.s2 r0 = r0.h()
            com.google.android.gms.measurement.internal.x2 r0 = r0.f35613s
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L55:
            if (r0 == 0) goto L69
            com.google.android.gms.measurement.internal.t3 r1 = r7.f35168C
            com.google.android.gms.measurement.internal.P2 r1 = r1.f35457a
            com.google.android.gms.measurement.internal.Q5 r1 = r1.P()
            com.google.android.gms.internal.measurement.U0 r2 = r7.f35167B
            long r3 = r0.longValue()
            r1.R(r2, r3)
            return
        L69:
            com.google.android.gms.internal.measurement.U0 r0 = r7.f35167B     // Catch: android.os.RemoteException -> L6f
            r0.h(r2)     // Catch: android.os.RemoteException -> L6f
            return
        L6f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.t3 r1 = r7.f35168C
            com.google.android.gms.measurement.internal.P2 r1 = r1.f35457a
            com.google.android.gms.measurement.internal.h2 r1 = r1.k()
            com.google.android.gms.measurement.internal.i2 r1 = r1.H()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.S3.run():void");
    }
}
