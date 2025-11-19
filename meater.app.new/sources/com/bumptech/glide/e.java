package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: GlideExperiments.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, Object> f32964a;

    /* compiled from: GlideExperiments.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, Object> f32965a = new HashMap();

        a() {
        }

        e b() {
            return new e(this);
        }
    }

    e(a aVar) {
        this.f32964a = Collections.unmodifiableMap(new HashMap(aVar.f32965a));
    }

    public boolean a(Class<Object> cls) {
        return this.f32964a.containsKey(cls);
    }
}
