package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2882z0 {

    /* renamed from: a, reason: collision with root package name */
    private final v7.E f35779a;

    C2882z0(v7.E e10) {
        this.f35779a = e10;
    }

    static C2882z0 a(String str) {
        return new C2882z0((TextUtils.isEmpty(str) || str.length() > 1) ? v7.E.UNINITIALIZED : C2823q3.i(str.charAt(0)));
    }

    final v7.E b() {
        return this.f35779a;
    }

    final String c() {
        return String.valueOf(C2823q3.a(this.f35779a));
    }
}
