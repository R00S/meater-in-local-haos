package com.google.android.gms.measurement.internal;

import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class G {

    /* renamed from: a, reason: collision with root package name */
    final String f34845a;

    /* renamed from: b, reason: collision with root package name */
    final String f34846b;

    /* renamed from: c, reason: collision with root package name */
    final long f34847c;

    /* renamed from: d, reason: collision with root package name */
    final long f34848d;

    /* renamed from: e, reason: collision with root package name */
    final long f34849e;

    /* renamed from: f, reason: collision with root package name */
    final long f34850f;

    /* renamed from: g, reason: collision with root package name */
    final long f34851g;

    /* renamed from: h, reason: collision with root package name */
    final Long f34852h;

    /* renamed from: i, reason: collision with root package name */
    final Long f34853i;

    /* renamed from: j, reason: collision with root package name */
    final Long f34854j;

    /* renamed from: k, reason: collision with root package name */
    final Boolean f34855k;

    G(String str, String str2, long j10, long j11, long j12, long j13, Long l10, Long l11, Long l12, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j12, 0L, null, null, null, null);
    }

    final G a(long j10) {
        return new G(this.f34845a, this.f34846b, this.f34847c, this.f34848d, this.f34849e, j10, this.f34851g, this.f34852h, this.f34853i, this.f34854j, this.f34855k);
    }

    final G b(long j10, long j11) {
        return new G(this.f34845a, this.f34846b, this.f34847c, this.f34848d, this.f34849e, this.f34850f, j10, Long.valueOf(j11), this.f34853i, this.f34854j, this.f34855k);
    }

    final G c(Long l10, Long l11, Boolean bool) {
        return new G(this.f34845a, this.f34846b, this.f34847c, this.f34848d, this.f34849e, this.f34850f, this.f34851g, this.f34852h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    G(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        C3445p.e(str);
        C3445p.e(str2);
        C3445p.a(j10 >= 0);
        C3445p.a(j11 >= 0);
        C3445p.a(j12 >= 0);
        C3445p.a(j14 >= 0);
        this.f34845a = str;
        this.f34846b = str2;
        this.f34847c = j10;
        this.f34848d = j11;
        this.f34849e = j12;
        this.f34850f = j13;
        this.f34851g = j14;
        this.f34852h = l10;
        this.f34853i = l11;
        this.f34854j = l12;
        this.f34855k = bool;
    }
}
