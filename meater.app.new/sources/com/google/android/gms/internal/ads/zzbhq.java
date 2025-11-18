package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzbhq extends zzaas {

    /* renamed from: f */
    private final zzbdf f23050f;

    /* renamed from: h */
    private final boolean f23052h;

    /* renamed from: i */
    private final boolean f23053i;

    /* renamed from: j */
    private int f23054j;

    /* renamed from: k */
    private zzaau f23055k;

    /* renamed from: l */
    private boolean f23056l;

    /* renamed from: n */
    private float f23058n;

    /* renamed from: o */
    private float f23059o;

    /* renamed from: p */
    private float f23060p;

    /* renamed from: q */
    private boolean f23061q;

    /* renamed from: r */
    private boolean f23062r;

    /* renamed from: g */
    private final Object f23051g = new Object();

    /* renamed from: m */
    private boolean f23057m = true;

    public zzbhq(zzbdf zzbdfVar, float f2, boolean z, boolean z2) {
        this.f23050f = zzbdfVar;
        this.f23058n = f2;
        this.f23052h = z;
        this.f23053i = z2;
    }

    /* renamed from: j7 */
    private final void m17705j7(final int i2, final int i3, final boolean z, final boolean z2) {
        zzbbm.f22757a.execute(new Runnable(this, i2, i3, z, z2) { // from class: com.google.android.gms.internal.ads.gb

            /* renamed from: f */
            private final zzbhq f18960f;

            /* renamed from: g */
            private final int f18961g;

            /* renamed from: h */
            private final int f18962h;

            /* renamed from: i */
            private final boolean f18963i;

            /* renamed from: j */
            private final boolean f18964j;

            {
                this.f18960f = this;
                this.f18961g = i2;
                this.f18962h = i3;
                this.f18963i = z;
                this.f18964j = z2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f18960f.m17709l7(this.f18961g, this.f18962h, this.f18963i, this.f18964j);
            }
        });
    }

    /* renamed from: o7 */
    private final void m17706o7(String str, Map<String, String> map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        zzbbm.f22757a.execute(new Runnable(this, map2) { // from class: com.google.android.gms.internal.ads.fb

            /* renamed from: f */
            private final zzbhq f18875f;

            /* renamed from: g */
            private final Map f18876g;

            {
                this.f18875f = this;
                this.f18876g = map2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f18875f.m17712p7(this.f18876g);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: F */
    public final int mo16190F() {
        int i2;
        synchronized (this.f23051g) {
            i2 = this.f23054j;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: G1 */
    public final boolean mo16191G1() {
        boolean z;
        synchronized (this.f23051g) {
            z = this.f23057m;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: Q6 */
    public final float mo16192Q6() {
        float f2;
        synchronized (this.f23051g) {
            f2 = this.f23058n;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: R1 */
    public final void mo16193R1(zzaau zzaauVar) {
        synchronized (this.f23051g) {
            this.f23055k = zzaauVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: S5 */
    public final float mo16194S5() {
        float f2;
        synchronized (this.f23051g) {
            f2 = this.f23059o;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: T */
    public final float mo16195T() {
        float f2;
        synchronized (this.f23051g) {
            f2 = this.f23060p;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: a5 */
    public final zzaau mo16196a5() throws RemoteException {
        zzaau zzaauVar;
        synchronized (this.f23051g) {
            zzaauVar = this.f23055k;
        }
        return zzaauVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: d1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo16197d1() {
        /*
            r2 = this;
            boolean r0 = r2.mo16199l5()
            java.lang.Object r1 = r2.f23051g
            monitor-enter(r1)
            if (r0 != 0) goto L15
            boolean r0 = r2.f23062r     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            boolean r0 = r2.f23053i     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L13:
            r0 = move-exception
            goto L18
        L15:
            r0 = 0
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return r0
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhq.mo16197d1():boolean");
    }

    /* renamed from: i7 */
    public final void m17707i7(float f2, float f3, int i2, boolean z, float f4) {
        boolean z2;
        int i3;
        synchronized (this.f23051g) {
            this.f23058n = f3;
            this.f23059o = f2;
            z2 = this.f23057m;
            this.f23057m = z;
            i3 = this.f23054j;
            this.f23054j = i2;
            float f5 = this.f23060p;
            this.f23060p = f4;
            if (Math.abs(f4 - f5) > 1.0E-4f) {
                this.f23050f.getView().invalidate();
            }
        }
        m17705j7(i3, i2, z2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: k5 */
    public final void mo16198k5() {
        m17706o7("play", null);
    }

    /* renamed from: k7 */
    public final void m17708k7() {
        boolean z;
        int i2;
        synchronized (this.f23051g) {
            z = this.f23057m;
            i2 = this.f23054j;
            this.f23054j = 3;
        }
        m17705j7(i2, 3, z, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: l5 */
    public final boolean mo16199l5() {
        boolean z;
        synchronized (this.f23051g) {
            z = this.f23052h && this.f23061q;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0056 A[Catch: RemoteException -> 0x0040, all -> 0x0073, TryCatch #0 {RemoteException -> 0x0040, blocks: (B:35:0x0038, B:37:0x003c, B:41:0x0044, B:43:0x0048, B:45:0x004d, B:47:0x0051, B:49:0x0056, B:51:0x005a, B:52:0x005d, B:54:0x0064, B:56:0x0068), top: B:64:0x0038, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0071 A[Catch: all -> 0x0073, DONT_GENERATE, TryCatch #1 {, blocks: (B:8:0x000a, B:33:0x0034, B:35:0x0038, B:37:0x003c, B:41:0x0044, B:43:0x0048, B:45:0x004d, B:47:0x0051, B:49:0x0056, B:51:0x005a, B:52:0x005d, B:54:0x0064, B:56:0x0068, B:59:0x0071, B:58:0x006c), top: B:66:0x000a, inners: #0 }] */
    /* renamed from: l7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void m17709l7(int r8, int r9, boolean r10, boolean r11) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f23051g
            monitor-enter(r0)
            r1 = 0
            r2 = 1
            if (r8 == r9) goto L9
            r8 = 1
            goto La
        L9:
            r8 = 0
        La:
            boolean r3 = r7.f23056l     // Catch: java.lang.Throwable -> L73
            if (r3 != 0) goto L12
            if (r9 != r2) goto L12
            r4 = 1
            goto L13
        L12:
            r4 = 0
        L13:
            if (r8 == 0) goto L19
            if (r9 != r2) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = 0
        L1a:
            if (r8 == 0) goto L21
            r6 = 2
            if (r9 != r6) goto L21
            r6 = 1
            goto L22
        L21:
            r6 = 0
        L22:
            if (r8 == 0) goto L29
            r8 = 3
            if (r9 != r8) goto L29
            r8 = 1
            goto L2a
        L29:
            r8 = 0
        L2a:
            if (r10 == r11) goto L2e
            r9 = 1
            goto L2f
        L2e:
            r9 = 0
        L2f:
            if (r3 != 0) goto L33
            if (r4 == 0) goto L34
        L33:
            r1 = 1
        L34:
            r7.f23056l = r1     // Catch: java.lang.Throwable -> L73
            if (r4 == 0) goto L42
            com.google.android.gms.internal.ads.zzaau r10 = r7.f23055k     // Catch: android.os.RemoteException -> L40 java.lang.Throwable -> L73
            if (r10 == 0) goto L42
            r10.onVideoStart()     // Catch: android.os.RemoteException -> L40 java.lang.Throwable -> L73
            goto L42
        L40:
            r8 = move-exception
            goto L6c
        L42:
            if (r5 == 0) goto L4b
            com.google.android.gms.internal.ads.zzaau r10 = r7.f23055k     // Catch: android.os.RemoteException -> L40 java.lang.Throwable -> L73
            if (r10 == 0) goto L4b
            r10.onVideoPlay()     // Catch: android.os.RemoteException -> L40 java.lang.Throwable -> L73
        L4b:
            if (r6 == 0) goto L54
            com.google.android.gms.internal.ads.zzaau r10 = r7.f23055k     // Catch: android.os.RemoteException -> L40 java.lang.Throwable -> L73
            if (r10 == 0) goto L54
            r10.onVideoPause()     // Catch: android.os.RemoteException -> L40 java.lang.Throwable -> L73
        L54:
            if (r8 == 0) goto L62
            com.google.android.gms.internal.ads.zzaau r8 = r7.f23055k     // Catch: android.os.RemoteException -> L40 java.lang.Throwable -> L73
            if (r8 == 0) goto L5d
            r8.mo16203n0()     // Catch: android.os.RemoteException -> L40 java.lang.Throwable -> L73
        L5d:
            com.google.android.gms.internal.ads.zzbdf r8 = r7.f23050f     // Catch: android.os.RemoteException -> L40 java.lang.Throwable -> L73
            r8.mo14885M()     // Catch: android.os.RemoteException -> L40 java.lang.Throwable -> L73
        L62:
            if (r9 == 0) goto L71
            com.google.android.gms.internal.ads.zzaau r8 = r7.f23055k     // Catch: android.os.RemoteException -> L40 java.lang.Throwable -> L73
            if (r8 == 0) goto L71
            r8.mo16202T0(r11)     // Catch: android.os.RemoteException -> L40 java.lang.Throwable -> L73
            goto L71
        L6c:
            java.lang.String r9 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.zzbad.m17350f(r9, r8)     // Catch: java.lang.Throwable -> L73
        L71:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            return
        L73:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhq.m17709l7(int, int, boolean, boolean):void");
    }

    /* renamed from: m7 */
    public final void m17710m7(zzacd zzacdVar) {
        boolean z = zzacdVar.f21574f;
        boolean z2 = zzacdVar.f21575g;
        boolean z3 = zzacdVar.f21576h;
        synchronized (this.f23051g) {
            this.f23061q = z2;
            this.f23062r = z3;
        }
        m17706o7("initialState", CollectionUtils.m14613d("muteStart", z ? "1" : "0", "customControlsRequested", z2 ? "1" : "0", "clickToExpandRequested", z3 ? "1" : "0"));
    }

    /* renamed from: n7 */
    public final void m17711n7(float f2) {
        synchronized (this.f23051g) {
            this.f23059o = f2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* renamed from: o2 */
    public final void mo16200o2(boolean z) {
        m17706o7(z ? "mute" : "unmute", null);
    }

    /* renamed from: p7 */
    final /* synthetic */ void m17712p7(Map map) {
        this.f23050f.mo14940y("pubVideoCmd", map);
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void pause() {
        m17706o7("pause", null);
    }
}
