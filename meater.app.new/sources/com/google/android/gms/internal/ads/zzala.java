package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class zzala extends zzbbw<zzajw> {

    /* renamed from: d */
    private zzayp<zzajw> f22097d;

    /* renamed from: c */
    private final Object f22096c = new Object();

    /* renamed from: e */
    private boolean f22098e = false;

    /* renamed from: f */
    private int f22099f = 0;

    public zzala(zzayp<zzajw> zzaypVar) {
        this.f22097d = zzaypVar;
    }

    /* renamed from: j */
    private final void m16648j() {
        synchronized (this.f22096c) {
            Preconditions.m14375n(this.f22099f >= 0);
            if (this.f22098e && this.f22099f == 0) {
                zzawz.m17082m("No reference is left (including root). Cleaning up engine.");
                m17390d(new C6473a2(this), new zzbbu());
            } else {
                zzawz.m17082m("There are still references to the engine. Not destroying.");
            }
        }
    }

    /* renamed from: g */
    public final zzakw m16649g() {
        zzakw zzakwVar = new zzakw(this);
        synchronized (this.f22096c) {
            m17390d(new C7360y1(this, zzakwVar), new C7397z1(this, zzakwVar));
            Preconditions.m14375n(this.f22099f >= 0);
            this.f22099f++;
        }
        return zzakwVar;
    }

    /* renamed from: h */
    protected final void m16650h() {
        synchronized (this.f22096c) {
            Preconditions.m14375n(this.f22099f > 0);
            zzawz.m17082m("Releasing 1 reference for JS Engine");
            this.f22099f--;
            m16648j();
        }
    }

    /* renamed from: i */
    public final void m16651i() {
        synchronized (this.f22096c) {
            Preconditions.m14375n(this.f22099f >= 0);
            zzawz.m17082m("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f22098e = true;
            m16648j();
        }
    }
}
