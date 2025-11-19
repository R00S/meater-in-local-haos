package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class V3 implements S5 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f35191a;

    V3(C2843t3 c2843t3) {
        this.f35191a = c2843t3;
    }

    @Override // com.google.android.gms.measurement.internal.S5
    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f35191a.a1("auto", str2, bundle);
        } else {
            this.f35191a.m0("auto", str2, bundle, str);
        }
    }
}
