package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* renamed from: com.google.android.gms.common.api.internal.y */
/* loaded from: classes2.dex */
final class C6404y implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a */
    private final /* synthetic */ GoogleApiManager f17473a;

    C6404y(GoogleApiManager googleApiManager) {
        this.f17473a = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    /* renamed from: a */
    public final void mo13927a(boolean z) {
        this.f17473a.f17346v.sendMessage(this.f17473a.f17346v.obtainMessage(1, Boolean.valueOf(z)));
    }
}
