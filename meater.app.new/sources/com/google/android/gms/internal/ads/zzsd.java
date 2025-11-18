package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzsd {

    /* renamed from: a */
    private final Map<String, String> f26984a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f26985b;

    /* renamed from: a */
    public final synchronized Map<String, String> m20467a() {
        if (this.f26985b == null) {
            this.f26985b = Collections.unmodifiableMap(new HashMap(this.f26984a));
        }
        return this.f26985b;
    }
}
