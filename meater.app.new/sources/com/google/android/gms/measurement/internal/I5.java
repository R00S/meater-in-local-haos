package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class I5 implements S5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2880y5 f34888a;

    I5(C2880y5 c2880y5) {
        this.f34888a = c2880y5;
    }

    @Override // com.google.android.gms.measurement.internal.S5
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f34888a.o().E(new H5(this, str, str2, bundle));
        } else if (this.f34888a.f35752l != null) {
            this.f34888a.f35752l.k().H().b("AppId not known when logging event", str2);
        }
    }
}
