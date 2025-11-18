package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzakw extends zzbbw<zzalf> {

    /* renamed from: c */
    private final Object f22088c = new Object();

    /* renamed from: d */
    private final zzala f22089d;

    /* renamed from: e */
    private boolean f22090e;

    public zzakw(zzala zzalaVar) {
        this.f22089d = zzalaVar;
    }

    /* renamed from: f */
    public final void m16643f() {
        synchronized (this.f22088c) {
            if (this.f22090e) {
                return;
            }
            this.f22090e = true;
            m17390d(new C7249v1(this), new zzbbu());
            m17390d(new C7286w1(this), new C7323x1(this));
        }
    }
}
