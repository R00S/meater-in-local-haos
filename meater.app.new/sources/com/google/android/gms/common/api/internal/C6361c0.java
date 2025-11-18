package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: com.google.android.gms.common.api.internal.c0 */
/* loaded from: classes2.dex */
final class C6361c0 implements BaseGmsClient.SignOutCallbacks {

    /* renamed from: a */
    final /* synthetic */ GoogleApiManager.zaa f17399a;

    C6361c0(GoogleApiManager.zaa zaaVar) {
        this.f17399a = zaaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    /* renamed from: a */
    public final void mo14057a() {
        GoogleApiManager.this.f17346v.post(new RunnableC6363d0(this));
    }
}
