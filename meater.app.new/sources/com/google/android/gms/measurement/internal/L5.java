package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C2601v2;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class L5 {

    /* renamed from: a, reason: collision with root package name */
    private long f35041a;

    /* renamed from: b, reason: collision with root package name */
    private C2601v2 f35042b;

    /* renamed from: c, reason: collision with root package name */
    private String f35043c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f35044d;

    /* renamed from: e, reason: collision with root package name */
    private v7.X f35045e;

    /* renamed from: f, reason: collision with root package name */
    private long f35046f;

    /* renamed from: g, reason: collision with root package name */
    private long f35047g;

    L5() {
    }

    public final L5 a(long j10) {
        this.f35047g = j10;
        return this;
    }

    public final L5 b(C2601v2 c2601v2) {
        this.f35042b = c2601v2;
        return this;
    }

    public final L5 c(String str) {
        this.f35043c = str;
        return this;
    }

    public final L5 d(Map<String, String> map) {
        this.f35044d = map;
        return this;
    }

    public final L5 e(v7.X x10) {
        this.f35045e = x10;
        return this;
    }

    public final M5 f() {
        return new M5(this.f35041a, this.f35042b, this.f35043c, this.f35044d, this.f35045e, this.f35046f, this.f35047g);
    }

    public final L5 g(long j10) {
        this.f35046f = j10;
        return this;
    }

    public final L5 h(long j10) {
        this.f35041a = j10;
        return this;
    }
}
