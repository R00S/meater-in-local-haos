package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.k */
/* loaded from: classes2.dex */
final class C6337k extends AbstractC6339m<Void> {
    C6337k(int i2, int i3, Bundle bundle) {
        super(i2, 2, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.AbstractC6339m
    /* renamed from: a */
    final void mo13772a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m13776c(null);
        } else {
            m13775b(new zzp(4, "Invalid response to one way request"));
        }
    }

    @Override // com.google.android.gms.cloudmessaging.AbstractC6339m
    /* renamed from: d */
    final boolean mo13773d() {
        return true;
    }
}
