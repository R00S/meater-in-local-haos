package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import v7.C4916s;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends N1.a implements C4916s.a {

    /* renamed from: D, reason: collision with root package name */
    private C4916s f34728D;

    @Override // v7.C4916s.a
    public final void a(Context context, Intent intent) {
        N1.a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f34728D == null) {
            this.f34728D = new C4916s(this);
        }
        this.f34728D.a(context, intent);
    }
}
