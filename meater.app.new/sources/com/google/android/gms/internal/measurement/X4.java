package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class X4 {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Callable<? extends AbstractC2535n>> f33941a = new HashMap();

    public final InterfaceC2574s a(String str) {
        if (!this.f33941a.containsKey(str)) {
            return InterfaceC2574s.f34292p;
        }
        try {
            return this.f33941a.get(str).call();
        } catch (Exception unused) {
            throw new IllegalStateException("Failed to create API implementation: " + str);
        }
    }

    public final void b(String str, Callable<? extends AbstractC2535n> callable) {
        this.f33941a.put(str, callable);
    }
}
