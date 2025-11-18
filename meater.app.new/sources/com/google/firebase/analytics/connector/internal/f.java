package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import u7.C4685a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.2.0 */
/* loaded from: classes2.dex */
final class f implements C4685a.InterfaceC0721a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d f38093a;

    public f(d dVar) {
        this.f38093a = dVar;
    }

    @Override // v7.K
    public final void a(String str, String str2, Bundle bundle, long j10) {
        if (str == null || !c.i(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j10);
        bundle2.putBundle("params", bundle);
        this.f38093a.f38089a.a(3, bundle2);
    }
}
