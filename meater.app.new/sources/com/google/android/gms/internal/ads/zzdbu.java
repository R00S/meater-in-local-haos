package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzdbu {

    /* renamed from: a */
    private zzdha f25463a;

    private zzdbu(zzdha zzdhaVar) {
        this.f25463a = zzdhaVar;
    }

    /* renamed from: a */
    static final zzdbu m19188a(zzdha zzdhaVar) throws GeneralSecurityException {
        if (zzdhaVar == null || zzdhaVar.m19461z() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzdbu(zzdhaVar);
    }

    /* renamed from: b */
    final zzdha m19189b() {
        return this.f25463a;
    }

    public final String toString() {
        return C6572cr.m14984a(this.f25463a).toString();
    }
}
