package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.k0 */
/* loaded from: classes2.dex */
final class C7534k0 extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ zzbx f27784a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7534k0(zzbx zzbxVar, Handler handler) {
        super(null);
        this.f27784a = zzbxVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f27784a.m22093c();
    }
}
