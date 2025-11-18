package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.common.api.internal.n0 */
/* loaded from: classes2.dex */
final class C6383n0 {

    /* renamed from: a */
    private final int f17431a;

    /* renamed from: b */
    private final ConnectionResult f17432b;

    C6383n0(ConnectionResult connectionResult, int i2) {
        Preconditions.m14372k(connectionResult);
        this.f17432b = connectionResult;
        this.f17431a = i2;
    }

    /* renamed from: a */
    final ConnectionResult m14070a() {
        return this.f17432b;
    }

    /* renamed from: b */
    final int m14071b() {
        return this.f17431a;
    }
}
