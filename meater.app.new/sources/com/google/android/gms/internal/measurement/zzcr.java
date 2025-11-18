package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzcr {

    /* renamed from: a */
    final String f28017a;

    /* renamed from: b */
    final Uri f28018b;

    /* renamed from: c */
    final String f28019c;

    /* renamed from: d */
    final String f28020d;

    /* renamed from: e */
    final boolean f28021e;

    /* renamed from: f */
    final boolean f28022f;

    /* renamed from: g */
    final boolean f28023g;

    /* renamed from: h */
    final boolean f28024h;

    /* renamed from: i */
    final zzcv<Context, Boolean> f28025i;

    public zzcr(Uri uri) {
        this(null, uri, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, false, null);
    }

    /* renamed from: a */
    public final zzcl<Double> m22119a(String str, double d2) {
        return zzcl.m22111i(this, str, -3.0d);
    }

    /* renamed from: b */
    public final zzcl<Long> m22120b(String str, long j2) {
        return zzcl.m22112j(this, str, j2);
    }

    /* renamed from: c */
    public final zzcl<String> m22121c(String str, String str2) {
        return zzcl.m22113k(this, str, str2);
    }

    /* renamed from: d */
    public final zzcl<Boolean> m22122d(String str, boolean z) {
        return zzcl.m22114l(this, str, z);
    }

    private zzcr(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, zzcv<Context, Boolean> zzcvVar) {
        this.f28017a = null;
        this.f28018b = uri;
        this.f28019c = str2;
        this.f28020d = str3;
        this.f28021e = false;
        this.f28022f = false;
        this.f28023g = false;
        this.f28024h = false;
        this.f28025i = null;
    }
}
