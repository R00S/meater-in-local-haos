package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbp;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public abstract class zzdd implements zzdc {

    /* renamed from: f */
    protected static volatile zzdy f25486f;

    /* renamed from: g */
    protected MotionEvent f25487g;

    /* renamed from: p */
    protected double f25496p;

    /* renamed from: q */
    private double f25497q;

    /* renamed from: r */
    private double f25498r;

    /* renamed from: s */
    protected float f25499s;

    /* renamed from: t */
    protected float f25500t;

    /* renamed from: u */
    protected float f25501u;

    /* renamed from: v */
    protected float f25502v;

    /* renamed from: y */
    protected DisplayMetrics f25505y;

    /* renamed from: h */
    protected LinkedList<MotionEvent> f25488h = new LinkedList<>();

    /* renamed from: i */
    protected long f25489i = 0;

    /* renamed from: j */
    protected long f25490j = 0;

    /* renamed from: k */
    protected long f25491k = 0;

    /* renamed from: l */
    protected long f25492l = 0;

    /* renamed from: m */
    protected long f25493m = 0;

    /* renamed from: n */
    protected long f25494n = 0;

    /* renamed from: o */
    protected long f25495o = 0;

    /* renamed from: w */
    private boolean f25503w = false;

    /* renamed from: x */
    protected boolean f25504x = false;

    protected zzdd(Context context) {
        try {
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21871t2)).booleanValue()) {
                C6786ij.m15348f();
            } else {
                C7097qy.m15813a(f25486f);
            }
            this.f25505y = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String m19222d(android.content.Context r10, java.lang.String r11, boolean r12, android.view.View r13, android.app.Activity r14, byte[] r15) {
        /*
            r9 = this;
            r0 = 0
            if (r15 == 0) goto Lf
            int r1 = r15.length
            if (r1 <= 0) goto Lf
            com.google.android.gms.internal.ads.zzdno r1 = com.google.android.gms.internal.ads.zzdno.m19703e()     // Catch: com.google.android.gms.internal.ads.zzdok -> Lf
            com.google.android.gms.internal.ads.zzbk$zza r15 = com.google.android.gms.internal.ads.zzbk.zza.m17803x(r15, r1)     // Catch: com.google.android.gms.internal.ads.zzdok -> Lf
            goto L10
        Lf:
            r15 = r0
        L10:
            com.google.android.gms.internal.ads.zzdy r1 = com.google.android.gms.internal.ads.zzdd.f25486f
            if (r1 == 0) goto L2d
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.zzacu.f21811j2
            com.google.android.gms.internal.ads.zzacr r2 = com.google.android.gms.internal.ads.zzyt.m20848e()
            java.lang.Object r1 = r2.m16421c(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2d
            com.google.android.gms.internal.ads.zzdy r1 = com.google.android.gms.internal.ads.zzdd.f25486f
            com.google.android.gms.internal.ads.zzda r1 = r1.m19913w()
            goto L2e
        L2d:
            r1 = r0
        L2e:
            long r2 = java.lang.System.currentTimeMillis()
            r8 = -1
            if (r12 == 0) goto L3d
            com.google.android.gms.internal.ads.zzbp$zza$zza r0 = r9.mo19224b(r10, r13, r14)     // Catch: java.lang.Exception -> L54
            r10 = 1
            r9.f25503w = r10     // Catch: java.lang.Exception -> L54
            goto L42
        L3d:
            com.google.android.gms.internal.ads.zzbp$zza$zza r10 = r9.mo19225c(r10, r15)     // Catch: java.lang.Exception -> L54
            r0 = r10
        L42:
            if (r1 == 0) goto L6b
            if (r12 == 0) goto L49
            r10 = 1002(0x3ea, float:1.404E-42)
            goto L4b
        L49:
            r10 = 1000(0x3e8, float:1.401E-42)
        L4b:
            long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L54
            long r13 = r13 - r2
            r1.m19126b(r10, r8, r13)     // Catch: java.lang.Exception -> L54
            goto L6b
        L54:
            r10 = move-exception
            r7 = r10
            if (r1 == 0) goto L6b
            if (r12 == 0) goto L5d
            r10 = 1003(0x3eb, float:1.406E-42)
            goto L5f
        L5d:
            r10 = 1001(0x3e9, float:1.403E-42)
        L5f:
            r4 = -1
            long r13 = java.lang.System.currentTimeMillis()
            long r5 = r13 - r2
            r2 = r1
            r3 = r10
            r2.m19127c(r3, r4, r5, r7)
        L6b:
            long r13 = java.lang.System.currentTimeMillis()
            if (r0 == 0) goto L9e
            com.google.android.gms.internal.ads.zzdpk r10 = r0.mo19736p0()     // Catch: java.lang.Exception -> La4
            com.google.android.gms.internal.ads.zzdob r10 = (com.google.android.gms.internal.ads.zzdob) r10     // Catch: java.lang.Exception -> La4
            com.google.android.gms.internal.ads.zzbp$zza r10 = (com.google.android.gms.internal.ads.zzbp.zza) r10     // Catch: java.lang.Exception -> La4
            int r10 = r10.mo19729i()     // Catch: java.lang.Exception -> La4
            if (r10 != 0) goto L80
            goto L9e
        L80:
            com.google.android.gms.internal.ads.zzdpk r10 = r0.mo19736p0()     // Catch: java.lang.Exception -> La4
            com.google.android.gms.internal.ads.zzdob r10 = (com.google.android.gms.internal.ads.zzdob) r10     // Catch: java.lang.Exception -> La4
            com.google.android.gms.internal.ads.zzbp$zza r10 = (com.google.android.gms.internal.ads.zzbp.zza) r10     // Catch: java.lang.Exception -> La4
            java.lang.String r10 = com.google.android.gms.internal.ads.C6786ij.m15350h(r10, r11)     // Catch: java.lang.Exception -> La4
            if (r1 == 0) goto Lc3
            if (r12 == 0) goto L93
            r11 = 1006(0x3ee, float:1.41E-42)
            goto L95
        L93:
            r11 = 1004(0x3ec, float:1.407E-42)
        L95:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> La4
            long r2 = r2 - r13
            r1.m19126b(r11, r8, r2)     // Catch: java.lang.Exception -> La4
            goto Lc3
        L9e:
            r10 = 5
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch: java.lang.Exception -> La4
            goto Lc3
        La4:
            r10 = move-exception
            r7 = r10
            r10 = 7
            java.lang.String r10 = java.lang.Integer.toString(r10)
            if (r1 == 0) goto Lc3
            if (r12 == 0) goto Lb4
            r11 = 1007(0x3ef, float:1.411E-42)
            r3 = 1007(0x3ef, float:1.411E-42)
            goto Lb8
        Lb4:
            r11 = 1005(0x3ed, float:1.408E-42)
            r3 = 1005(0x3ed, float:1.408E-42)
        Lb8:
            r4 = -1
            long r11 = java.lang.System.currentTimeMillis()
            long r5 = r11 - r13
            r2 = r1
            r2.m19127c(r3, r4, r5, r7)
        Lc3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdd.m19222d(android.content.Context, java.lang.String, boolean, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    /* renamed from: a */
    protected abstract long mo19223a(StackTraceElement[] stackTraceElementArr) throws zzdv;

    /* renamed from: b */
    protected abstract zzbp.zza.C11479zza mo19224b(Context context, View view, Activity activity);

    /* renamed from: c */
    protected abstract zzbp.zza.C11479zza mo19225c(Context context, zzbk.zza zzaVar);

    /* renamed from: e */
    protected abstract zzee mo19226e(MotionEvent motionEvent) throws zzdv;

    @Override // com.google.android.gms.internal.ads.zzdc
    public final String zza(Context context) {
        if (zzef.m19917a()) {
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21883v2)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return m19222d(context, null, false, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public void zzb(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final String zza(Context context, String str, View view, Activity activity) {
        return m19222d(context, str, true, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final void zza(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f25503w) {
            this.f25492l = 0L;
            this.f25491k = 0L;
            this.f25490j = 0L;
            this.f25489i = 0L;
            this.f25493m = 0L;
            this.f25495o = 0L;
            this.f25494n = 0L;
            Iterator<MotionEvent> it = this.f25488h.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.f25488h.clear();
            this.f25487g = null;
            this.f25503w = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f25496p = 0.0d;
            this.f25497q = motionEvent.getRawX();
            this.f25498r = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d2 = this.f25497q;
            Double.isNaN(rawX);
            double d3 = rawX - d2;
            double d4 = this.f25498r;
            Double.isNaN(rawY);
            double d5 = rawY - d4;
            this.f25496p += Math.sqrt((d3 * d3) + (d5 * d5));
            this.f25497q = rawX;
            this.f25498r = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    this.f25487g = motionEventObtain;
                    this.f25488h.add(motionEventObtain);
                    if (this.f25488h.size() > 6) {
                        this.f25488h.remove().recycle();
                    }
                    this.f25491k++;
                    this.f25493m = mo19223a(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.f25490j += motionEvent.getHistorySize() + 1;
                    zzee zzeeVarMo19226e = mo19226e(motionEvent);
                    if ((zzeeVarMo19226e == null || zzeeVarMo19226e.f26030e == null || zzeeVarMo19226e.f26033h == null) ? false : true) {
                        this.f25494n += zzeeVarMo19226e.f26030e.longValue() + zzeeVarMo19226e.f26033h.longValue();
                    }
                    if (this.f25505y != null && zzeeVarMo19226e != null && zzeeVarMo19226e.f26031f != null && zzeeVarMo19226e.f26034i != null) {
                        z = true;
                    }
                    if (z) {
                        this.f25495o += zzeeVarMo19226e.f26031f.longValue() + zzeeVarMo19226e.f26034i.longValue();
                    }
                } else if (action2 == 3) {
                    this.f25492l++;
                }
            } catch (zzdv unused) {
            }
        } else {
            this.f25499s = motionEvent.getX();
            this.f25500t = motionEvent.getY();
            this.f25501u = motionEvent.getRawX();
            this.f25502v = motionEvent.getRawY();
            this.f25489i++;
        }
        this.f25504x = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final void zza(int i2, int i3, int i4) {
        MotionEvent motionEvent = this.f25487g;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        DisplayMetrics displayMetrics = this.f25505y;
        if (displayMetrics != null) {
            float f2 = displayMetrics.density;
            this.f25487g = MotionEvent.obtain(0L, i4, 1, i2 * f2, i3 * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.f25487g = null;
        }
        this.f25504x = false;
    }
}
