package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class zzto {

    /* renamed from: a */
    private final Handler f27097a;

    /* renamed from: b */
    private final zztn f27098b;

    public zzto(Handler handler, zztn zztnVar) {
        this.f27097a = zztnVar != null ? (Handler) zzsk.m20480d(handler) : null;
        this.f27098b = zztnVar;
    }

    /* renamed from: b */
    public final void m20581b(int i2, int i3, int i4, float f2) {
        if (this.f27098b != null) {
            this.f27097a.post(new z30(this, i2, i3, i4, f2));
        }
    }

    /* renamed from: c */
    public final void m20582c(Surface surface) {
        if (this.f27098b != null) {
            this.f27097a.post(new a40(this, surface));
        }
    }

    /* renamed from: d */
    public final void m20583d(zzlh zzlhVar) {
        if (this.f27098b != null) {
            this.f27097a.post(new x30(this, zzlhVar));
        }
    }

    /* renamed from: e */
    public final void m20584e(zznc zzncVar) {
        if (this.f27098b != null) {
            this.f27097a.post(new v30(this, zzncVar));
        }
    }

    /* renamed from: f */
    public final void m20585f(String str, long j2, long j3) {
        if (this.f27098b != null) {
            this.f27097a.post(new w30(this, str, j2, j3));
        }
    }

    /* renamed from: g */
    public final void m20586g(zznc zzncVar) {
        if (this.f27098b != null) {
            this.f27097a.post(new b40(this, zzncVar));
        }
    }

    /* renamed from: h */
    public final void m20587h(int i2, long j2) {
        if (this.f27098b != null) {
            this.f27097a.post(new y30(this, i2, j2));
        }
    }
}
