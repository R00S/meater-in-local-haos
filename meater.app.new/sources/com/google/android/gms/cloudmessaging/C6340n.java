package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.n */
/* loaded from: classes2.dex */
final class C6340n extends AbstractC6339m<Bundle> {
    C6340n(int i2, int i3, Bundle bundle) {
        super(i2, 1, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.AbstractC6339m
    /* renamed from: a */
    final void mo13772a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        m13776c(bundle2);
    }

    @Override // com.google.android.gms.cloudmessaging.AbstractC6339m
    /* renamed from: d */
    final boolean mo13773d() {
        return false;
    }
}
