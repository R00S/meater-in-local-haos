package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzry {

    /* renamed from: a */
    public final Uri f26947a;

    /* renamed from: b */
    public final byte[] f26948b;

    /* renamed from: c */
    public final long f26949c;

    /* renamed from: d */
    public final long f26950d;

    /* renamed from: e */
    public final long f26951e;

    /* renamed from: f */
    public final String f26952f;

    /* renamed from: g */
    public final int f26953g;

    public zzry(Uri uri) {
        this(uri, 0);
    }

    /* renamed from: a */
    public final boolean m20459a(int i2) {
        return (this.f26953g & 1) == 1;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f26947a);
        String string = Arrays.toString(this.f26948b);
        long j2 = this.f26949c;
        long j3 = this.f26950d;
        long j4 = this.f26951e;
        String str = this.f26952f;
        int i2 = this.f26953g;
        StringBuilder sb = new StringBuilder(strValueOf.length() + 93 + String.valueOf(string).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(string);
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

    private zzry(Uri uri, int i2) {
        this(uri, 0L, -1L, null, 0);
    }

    public zzry(Uri uri, long j2, long j3, String str) {
        this(uri, j2, j2, j3, str, 0);
    }

    private zzry(Uri uri, long j2, long j3, String str, int i2) {
        this(uri, 0L, 0L, -1L, null, 0);
    }

    private zzry(Uri uri, long j2, long j3, long j4, String str, int i2) {
        this(uri, null, j2, j3, j4, str, i2);
    }

    public zzry(Uri uri, byte[] bArr, long j2, long j3, long j4, String str, int i2) {
        boolean z = true;
        zzsk.m20477a(j2 >= 0);
        zzsk.m20477a(j3 >= 0);
        if (j4 <= 0 && j4 != -1) {
            z = false;
        }
        zzsk.m20477a(z);
        this.f26947a = uri;
        this.f26948b = bArr;
        this.f26949c = j2;
        this.f26950d = j3;
        this.f26951e = j4;
        this.f26952f = str;
        this.f26953g = i2;
    }
}
