package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes2.dex */
public final class zzma {

    /* renamed from: a */
    private final Handler f26523a;

    /* renamed from: b */
    private final zzlz f26524b;

    public zzma(Handler handler, zzlz zzlzVar) {
        this.f26523a = zzlzVar != null ? (Handler) zzsk.m20480d(handler) : null;
        this.f26524b = zzlzVar;
    }

    /* renamed from: b */
    public final void m20233b(int i2) {
        if (this.f26524b != null) {
            this.f26523a.post(new z00(this, i2));
        }
    }

    /* renamed from: c */
    public final void m20234c(zzlh zzlhVar) {
        if (this.f26524b != null) {
            this.f26523a.post(new w00(this, zzlhVar));
        }
    }

    /* renamed from: d */
    public final void m20235d(zznc zzncVar) {
        if (this.f26524b != null) {
            this.f26523a.post(new u00(this, zzncVar));
        }
    }

    /* renamed from: e */
    public final void m20236e(String str, long j2, long j3) {
        if (this.f26524b != null) {
            this.f26523a.post(new v00(this, str, j2, j3));
        }
    }

    /* renamed from: f */
    public final void m20237f(int i2, long j2, long j3) {
        if (this.f26524b != null) {
            this.f26523a.post(new x00(this, i2, j2, j3));
        }
    }

    /* renamed from: g */
    public final void m20238g(zznc zzncVar) {
        if (this.f26524b != null) {
            this.f26523a.post(new y00(this, zzncVar));
        }
    }
}
