package com.flurry.sdk;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.flurry.sdk.l */
/* loaded from: classes2.dex */
public final class C6092l {

    /* renamed from: a */
    protected Map<EnumC6101m, String> f16101a;

    /* renamed from: b */
    public boolean f16102b;

    C6092l() {
        this.f16101a = new HashMap();
    }

    /* renamed from: a */
    public final Map<EnumC6101m, String> m13171a() {
        return this.f16101a;
    }

    /* renamed from: b */
    final void m13172b(EnumC6101m enumC6101m, String str) {
        this.f16101a.put(enumC6101m, str);
    }

    /* renamed from: c */
    final C6092l m13173c() {
        return new C6092l(Collections.unmodifiableMap(this.f16101a), this.f16102b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16101a);
        sb.append(this.f16102b);
        return sb.toString();
    }

    private C6092l(Map<EnumC6101m, String> map, boolean z) {
        this.f16101a = map;
        this.f16102b = z;
    }
}
