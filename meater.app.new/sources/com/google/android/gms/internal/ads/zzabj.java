package com.google.android.gms.internal.ads;

import android.os.RemoteException;

@zzard
/* loaded from: classes2.dex */
public final class zzabj extends zzaal {

    /* renamed from: f */
    private final String f21565f;

    /* renamed from: g */
    private final String f21566g;

    public zzabj(String str, String str2) {
        this.f21565f = str;
        this.f21566g = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaak
    /* renamed from: Z1 */
    public final String mo16186Z1() throws RemoteException {
        return this.f21566g;
    }

    @Override // com.google.android.gms.internal.ads.zzaak
    public final String getDescription() throws RemoteException {
        return this.f21565f;
    }
}
