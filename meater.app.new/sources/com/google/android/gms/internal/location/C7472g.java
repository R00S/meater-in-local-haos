package com.google.android.gms.internal.location;

import android.os.DeadObjectException;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.location.g */
/* loaded from: classes2.dex */
final class C7472g implements zzbj<zzao> {

    /* renamed from: a */
    private final /* synthetic */ zzk f27630a;

    C7472g(zzk zzkVar) {
        this.f27630a = zzkVar;
    }

    @Override // com.google.android.gms.internal.location.zzbj
    /* renamed from: a */
    public final void mo20946a() {
        this.f27630a.checkConnected();
    }

    @Override // com.google.android.gms.internal.location.zzbj
    /* renamed from: b */
    public final /* synthetic */ IInterface mo20947b() throws DeadObjectException {
        return (zzao) this.f27630a.getService();
    }
}
