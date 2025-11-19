package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import l8.InterfaceC3914g;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class F3 {

    /* renamed from: a, reason: collision with root package name */
    final String f33721a;

    /* renamed from: b, reason: collision with root package name */
    final Uri f33722b;

    /* renamed from: c, reason: collision with root package name */
    final String f33723c;

    /* renamed from: d, reason: collision with root package name */
    final String f33724d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f33725e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f33726f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f33727g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f33728h;

    /* renamed from: i, reason: collision with root package name */
    final InterfaceC3914g<Context, Boolean> f33729i;

    public F3(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final AbstractC2610w3<Double> a(String str, double d10) {
        return AbstractC2610w3.b(this, str, Double.valueOf(-3.0d), true);
    }

    public final AbstractC2610w3<Long> b(String str, long j10) {
        return AbstractC2610w3.c(this, str, Long.valueOf(j10), true);
    }

    public final AbstractC2610w3<String> c(String str, String str2) {
        return AbstractC2610w3.d(this, str, str2, true);
    }

    public final AbstractC2610w3<Boolean> d(String str, boolean z10) {
        return AbstractC2610w3.a(this, str, Boolean.valueOf(z10), true);
    }

    public final F3 e() {
        return new F3(this.f33721a, this.f33722b, this.f33723c, this.f33724d, this.f33725e, this.f33726f, true, this.f33728h, this.f33729i);
    }

    public final F3 f() {
        if (!this.f33723c.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        InterfaceC3914g<Context, Boolean> interfaceC3914g = this.f33729i;
        if (interfaceC3914g == null) {
            return new F3(this.f33721a, this.f33722b, this.f33723c, this.f33724d, true, this.f33726f, this.f33727g, this.f33728h, interfaceC3914g);
        }
        throw new IllegalStateException("Cannot skip gservices both always and conditionally");
    }

    private F3(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, InterfaceC3914g<Context, Boolean> interfaceC3914g) {
        this.f33721a = str;
        this.f33722b = uri;
        this.f33723c = str2;
        this.f33724d = str3;
        this.f33725e = z10;
        this.f33726f = z11;
        this.f33727g = z12;
        this.f33728h = z13;
        this.f33729i = interfaceC3914g;
    }
}
