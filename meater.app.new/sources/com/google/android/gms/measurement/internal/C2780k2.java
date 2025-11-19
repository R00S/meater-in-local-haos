package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.k2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2780k2 {

    /* renamed from: a, reason: collision with root package name */
    public String f35420a;

    /* renamed from: b, reason: collision with root package name */
    public String f35421b;

    /* renamed from: c, reason: collision with root package name */
    private long f35422c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f35423d;

    public C2780k2(String str, String str2, Bundle bundle, long j10) {
        this.f35420a = str;
        this.f35421b = str2;
        this.f35423d = bundle == null ? new Bundle() : bundle;
        this.f35422c = j10;
    }

    public static C2780k2 b(J j10) {
        return new C2780k2(j10.f34889B, j10.f34891D, j10.f34890C.v0(), j10.f34892E);
    }

    public final J a() {
        return new J(this.f35420a, new F(new Bundle(this.f35423d)), this.f35421b, this.f35422c);
    }

    public final String toString() {
        return "origin=" + this.f35421b + ",name=" + this.f35420a + ",params=" + String.valueOf(this.f35423d);
    }
}
