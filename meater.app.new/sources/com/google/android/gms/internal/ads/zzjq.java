package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class zzjq {

    /* renamed from: a */
    public final Uri f26371a;

    /* renamed from: b */
    public final long f26372b;

    /* renamed from: c */
    public final long f26373c;

    /* renamed from: d */
    public final long f26374d;

    /* renamed from: e */
    public final String f26375e;

    /* renamed from: f */
    public final int f26376f;

    public zzjq(Uri uri) {
        this(uri, 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f26371a);
        long j2 = this.f26372b;
        long j3 = this.f26373c;
        long j4 = this.f26374d;
        String str = this.f26375e;
        int i2 = this.f26376f;
        StringBuilder sb = new StringBuilder(strValueOf.length() + 91 + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    private zzjq(Uri uri, int i2) {
        this(uri, 0L, -1L, null, 0);
    }

    public zzjq(Uri uri, long j2, long j3, String str) {
        this(uri, j2, j2, j3, null, 0);
    }

    private zzjq(Uri uri, long j2, long j3, String str, int i2) {
        this(uri, 0L, 0L, -1L, null, 0);
    }

    public zzjq(Uri uri, long j2, long j3, long j4, String str, int i2) {
        boolean z = true;
        zzkh.m20126a(j2 >= 0);
        zzkh.m20126a(j3 >= 0);
        if (j4 <= 0 && j4 != -1) {
            z = false;
        }
        zzkh.m20126a(z);
        this.f26371a = uri;
        this.f26372b = j2;
        this.f26373c = j3;
        this.f26374d = j4;
        this.f26375e = str;
        this.f26376f = i2;
    }
}
