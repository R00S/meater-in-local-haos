package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

@TargetApi(17)
/* loaded from: classes2.dex */
public final class zztd extends Surface {

    /* renamed from: f */
    private static boolean f27043f;

    /* renamed from: g */
    private static boolean f27044g;

    /* renamed from: h */
    private final boolean f27045h;

    /* renamed from: i */
    private final r30 f27046i;

    /* renamed from: j */
    private boolean f27047j;

    private zztd(r30 r30Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f27046i = r30Var;
        this.f27045h = z;
    }

    /* renamed from: a */
    public static zztd m20557a(Context context, boolean z) {
        if (zzsy.f27024a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
        zzsk.m20481e(!z || m20558b(context));
        return new r30().m15817b(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean m20558b(android.content.Context r6) {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.zztd> r0 = com.google.android.gms.internal.ads.zztd.class
            monitor-enter(r0)
            boolean r1 = com.google.android.gms.internal.ads.zztd.f27044g     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L4f
            int r1 = com.google.android.gms.internal.ads.zzsy.f27024a     // Catch: java.lang.Throwable -> L53
            r2 = 17
            r3 = 1
            if (r1 < r2) goto L4d
            r2 = 0
            android.opengl.EGLDisplay r4 = android.opengl.EGL14.eglGetDisplay(r2)     // Catch: java.lang.Throwable -> L53
            r5 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r4 = android.opengl.EGL14.eglQueryString(r4, r5)     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L4b
            java.lang.String r5 = "EGL_EXT_protected_content"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L4b
            r4 = 24
            if (r1 != r4) goto L47
            java.lang.String r1 = com.google.android.gms.internal.ads.zzsy.f27027d     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = "SM-G950"
            boolean r4 = r1.startsWith(r4)     // Catch: java.lang.Throwable -> L53
            if (r4 != 0) goto L39
            java.lang.String r4 = "SM-G955"
            boolean r1 = r1.startsWith(r4)     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L47
        L39:
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = "android.hardware.vr.high_performance"
            boolean r6 = r6.hasSystemFeature(r1)     // Catch: java.lang.Throwable -> L53
            if (r6 != 0) goto L47
            r6 = 1
            goto L48
        L47:
            r6 = 0
        L48:
            if (r6 != 0) goto L4b
            r2 = 1
        L4b:
            com.google.android.gms.internal.ads.zztd.f27043f = r2     // Catch: java.lang.Throwable -> L53
        L4d:
            com.google.android.gms.internal.ads.zztd.f27044g = r3     // Catch: java.lang.Throwable -> L53
        L4f:
            boolean r6 = com.google.android.gms.internal.ads.zztd.f27043f     // Catch: java.lang.Throwable -> L53
            monitor-exit(r0)
            return r6
        L53:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztd.m20558b(android.content.Context):boolean");
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f27046i) {
            if (!this.f27047j) {
                this.f27046i.m15816a();
                this.f27047j = true;
            }
        }
    }
}
