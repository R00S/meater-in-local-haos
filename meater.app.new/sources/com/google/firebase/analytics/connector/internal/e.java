package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import u7.C4685a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.2.0 */
/* loaded from: classes2.dex */
final class e implements C4685a.InterfaceC0721a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b f38092a;

    public e(b bVar) {
        this.f38092a = bVar;
    }

    @Override // v7.K
    public final void a(String str, String str2, Bundle bundle, long j10) {
        if (this.f38092a.f38079a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", c.c(str2));
            this.f38092a.f38080b.a(2, bundle2);
        }
    }
}
