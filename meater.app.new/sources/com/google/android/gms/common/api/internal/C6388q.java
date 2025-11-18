package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.GmsClientEventManager;

/* renamed from: com.google.android.gms.common.api.internal.q */
/* loaded from: classes2.dex */
final class C6388q implements GmsClientEventManager.GmsClientEventState {

    /* renamed from: a */
    private final /* synthetic */ zaaw f17439a;

    C6388q(zaaw zaawVar) {
        this.f17439a = zaawVar;
    }

    @Override // com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState
    public final Bundle getConnectionHint() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState
    public final boolean isConnected() {
        return this.f17439a.mo13879p();
    }
}
