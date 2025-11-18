package com.flurry.sdk;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.flurry.sdk.m7 */
/* loaded from: classes2.dex */
public final class C6109m7 {

    /* renamed from: a */
    private static SimpleDateFormat f16147a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);

    /* renamed from: b */
    public String f16148b;

    /* renamed from: c */
    public long f16149c;

    public C6109m7(String str, long j2) {
        this.f16148b = str;
        this.f16149c = j2;
    }

    public final String toString() {
        return f16147a.format(Long.valueOf(this.f16149c)) + ": " + this.f16148b + "\n";
    }
}
