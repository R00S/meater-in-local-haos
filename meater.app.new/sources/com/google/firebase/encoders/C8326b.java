package com.google.firebase.encoders;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FieldDescriptor.java */
/* renamed from: com.google.firebase.encoders.b */
/* loaded from: classes2.dex */
public final class C8326b {

    /* renamed from: a */
    private final String f31643a;

    /* renamed from: b */
    private final Map<Class<?>, Object> f31644b;

    /* compiled from: FieldDescriptor.java */
    /* renamed from: com.google.firebase.encoders.b$b */
    public static final class b {

        /* renamed from: a */
        private final String f31645a;

        /* renamed from: b */
        private Map<Class<?>, Object> f31646b = null;

        b(String str) {
            this.f31645a = str;
        }

        /* renamed from: a */
        public C8326b m26080a() {
            return new C8326b(this.f31645a, this.f31646b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f31646b)));
        }

        /* renamed from: b */
        public <T extends Annotation> b m26081b(T t) {
            if (this.f31646b == null) {
                this.f31646b = new HashMap();
            }
            this.f31646b.put(t.annotationType(), t);
            return this;
        }
    }

    /* renamed from: a */
    public static b m26076a(String str) {
        return new b(str);
    }

    /* renamed from: d */
    public static C8326b m26077d(String str) {
        return new C8326b(str, Collections.emptyMap());
    }

    /* renamed from: b */
    public String m26078b() {
        return this.f31643a;
    }

    /* renamed from: c */
    public <T extends Annotation> T m26079c(Class<T> cls) {
        return (T) this.f31644b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8326b)) {
            return false;
        }
        C8326b c8326b = (C8326b) obj;
        return this.f31643a.equals(c8326b.f31643a) && this.f31644b.equals(c8326b.f31644b);
    }

    public int hashCode() {
        return (this.f31643a.hashCode() * 31) + this.f31644b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f31643a + ", properties=" + this.f31644b.values() + "}";
    }

    private C8326b(String str, Map<Class<?>, Object> map) {
        this.f31643a = str;
        this.f31644b = map;
    }
}
