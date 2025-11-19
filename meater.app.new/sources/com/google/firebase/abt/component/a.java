package com.google.firebase.abt.component;

import G8.b;
import android.content.Context;
import j9.InterfaceC3755b;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AbtComponent.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, b> f38073a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f38074b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3755b<I8.a> f38075c;

    protected a(Context context, InterfaceC3755b<I8.a> interfaceC3755b) {
        this.f38074b = context;
        this.f38075c = interfaceC3755b;
    }

    protected b a(String str) {
        return new b(this.f38074b, this.f38075c, str);
    }

    public synchronized b b(String str) {
        try {
            if (!this.f38073a.containsKey(str)) {
                this.f38073a.put(str, a(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f38073a.get(str);
    }
}
