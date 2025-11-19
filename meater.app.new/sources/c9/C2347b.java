package c9;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FieldDescriptor.java */
/* renamed from: c9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2347b {

    /* renamed from: a, reason: collision with root package name */
    private final String f31120a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Object> f31121b;

    /* compiled from: FieldDescriptor.java */
    /* renamed from: c9.b$b, reason: collision with other inner class name */
    public static final class C0434b {

        /* renamed from: a, reason: collision with root package name */
        private final String f31122a;

        /* renamed from: b, reason: collision with root package name */
        private Map<Class<?>, Object> f31123b = null;

        C0434b(String str) {
            this.f31122a = str;
        }

        public C2347b a() {
            return new C2347b(this.f31122a, this.f31123b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f31123b)));
        }

        public <T extends Annotation> C0434b b(T t10) {
            if (this.f31123b == null) {
                this.f31123b = new HashMap();
            }
            this.f31123b.put(t10.annotationType(), t10);
            return this;
        }
    }

    public static C0434b a(String str) {
        return new C0434b(str);
    }

    public static C2347b d(String str) {
        return new C2347b(str, Collections.emptyMap());
    }

    public String b() {
        return this.f31120a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (T) this.f31121b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2347b)) {
            return false;
        }
        C2347b c2347b = (C2347b) obj;
        return this.f31120a.equals(c2347b.f31120a) && this.f31121b.equals(c2347b.f31121b);
    }

    public int hashCode() {
        return (this.f31120a.hashCode() * 31) + this.f31121b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f31120a + ", properties=" + this.f31121b.values() + "}";
    }

    private C2347b(String str, Map<Class<?>, Object> map) {
        this.f31120a = str;
        this.f31121b = map;
    }
}
