package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzfl<T> {

    /* renamed from: a */
    private final Map<String, AtomicReference<T>> f26096a = new HashMap();

    /* renamed from: a */
    public final AtomicReference<T> m19942a(String str) {
        synchronized (this) {
            if (!this.f26096a.containsKey(str)) {
                this.f26096a.put(str, new AtomicReference<>());
            }
        }
        return this.f26096a.get(str);
    }
}
