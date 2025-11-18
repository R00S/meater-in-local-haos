package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2601v2;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class M5 {

    /* renamed from: a, reason: collision with root package name */
    private long f35053a;

    /* renamed from: b, reason: collision with root package name */
    private C2601v2 f35054b;

    /* renamed from: c, reason: collision with root package name */
    private String f35055c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f35056d;

    /* renamed from: e, reason: collision with root package name */
    private v7.X f35057e;

    /* renamed from: f, reason: collision with root package name */
    private long f35058f;

    public final long a() {
        return this.f35053a;
    }

    public final C2845t5 b() {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : this.f35056d.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return new C2845t5(this.f35053a, this.f35054b.m(), this.f35055c, bundle, this.f35057e.a(), this.f35058f);
    }

    public final C2887z5 c() {
        return new C2887z5(this.f35055c, this.f35056d, this.f35057e);
    }

    public final C2601v2 d() {
        return this.f35054b;
    }

    public final String e() {
        return this.f35055c;
    }

    private M5(long j10, C2601v2 c2601v2, String str, Map<String, String> map, v7.X x10, long j11, long j12) {
        this.f35053a = j10;
        this.f35054b = c2601v2;
        this.f35055c = str;
        this.f35056d = map;
        this.f35057e = x10;
        this.f35058f = j12;
    }
}
