package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class Y2 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ W2 f33947a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y2(W2 w22, Handler handler) {
        super(null);
        this.f33947a = w22;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f33947a.f33922a.set(true);
    }
}
