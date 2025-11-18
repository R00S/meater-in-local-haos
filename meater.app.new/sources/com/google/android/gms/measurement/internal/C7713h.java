package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.h */
/* loaded from: classes2.dex */
final class C7713h {

    /* renamed from: a */
    final String f28662a;

    /* renamed from: b */
    final String f28663b;

    /* renamed from: c */
    final long f28664c;

    /* renamed from: d */
    final long f28665d;

    /* renamed from: e */
    final long f28666e;

    /* renamed from: f */
    final long f28667f;

    /* renamed from: g */
    final long f28668g;

    /* renamed from: h */
    final Long f28669h;

    /* renamed from: i */
    final Long f28670i;

    /* renamed from: j */
    final Long f28671j;

    /* renamed from: k */
    final Boolean f28672k;

    C7713h(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l, Long l2, Long l3, Boolean bool) {
        Preconditions.m14368g(str);
        Preconditions.m14368g(str2);
        Preconditions.m14362a(j2 >= 0);
        Preconditions.m14362a(j3 >= 0);
        Preconditions.m14362a(j4 >= 0);
        Preconditions.m14362a(j6 >= 0);
        this.f28662a = str;
        this.f28663b = str2;
        this.f28664c = j2;
        this.f28665d = j3;
        this.f28666e = j4;
        this.f28667f = j5;
        this.f28668g = j6;
        this.f28669h = l;
        this.f28670i = l2;
        this.f28671j = l3;
        this.f28672k = bool;
    }

    /* renamed from: a */
    final C7713h m22780a(long j2) {
        return new C7713h(this.f28662a, this.f28663b, this.f28664c, this.f28665d, this.f28666e, j2, this.f28668g, this.f28669h, this.f28670i, this.f28671j, this.f28672k);
    }

    /* renamed from: b */
    final C7713h m22781b(long j2, long j3) {
        return new C7713h(this.f28662a, this.f28663b, this.f28664c, this.f28665d, this.f28666e, this.f28667f, j2, Long.valueOf(j3), this.f28670i, this.f28671j, this.f28672k);
    }

    /* renamed from: c */
    final C7713h m22782c(Long l, Long l2, Boolean bool) {
        return new C7713h(this.f28662a, this.f28663b, this.f28664c, this.f28665d, this.f28666e, this.f28667f, this.f28668g, this.f28669h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    C7713h(String str, String str2, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        this(str, str2, j2, j3, 0L, j4, 0L, null, null, null, null);
    }
}
