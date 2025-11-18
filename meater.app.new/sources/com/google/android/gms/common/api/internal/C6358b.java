package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.b */
/* loaded from: classes2.dex */
final class C6358b implements PendingResult.StatusListener {

    /* renamed from: a */
    private final /* synthetic */ BasePendingResult f17393a;

    /* renamed from: b */
    private final /* synthetic */ zaab f17394b;

    C6358b(zaab zaabVar, BasePendingResult basePendingResult) {
        this.f17394b = zaabVar;
        this.f17393a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    /* renamed from: a */
    public final void mo13901a(Status status) {
        this.f17394b.f17478a.remove(this.f17393a);
    }
}
