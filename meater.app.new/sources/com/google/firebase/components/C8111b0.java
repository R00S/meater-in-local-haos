package com.google.firebase.components;

import java.lang.annotation.Annotation;

/* compiled from: Qualified.java */
/* renamed from: com.google.firebase.components.b0 */
/* loaded from: classes2.dex */
public final class C8111b0<T> {

    /* renamed from: a */
    private final Class<? extends Annotation> f30674a;

    /* renamed from: b */
    private final Class<T> f30675b;

    /* compiled from: Qualified.java */
    /* renamed from: com.google.firebase.components.b0$a */
    private @interface a {
    }

    public C8111b0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f30674a = cls;
        this.f30675b = cls2;
    }

    /* renamed from: a */
    public static <T> C8111b0<T> m24971a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new C8111b0<>(cls, cls2);
    }

    /* renamed from: b */
    public static <T> C8111b0<T> m24972b(Class<T> cls) {
        return new C8111b0<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8111b0.class != obj.getClass()) {
            return false;
        }
        C8111b0 c8111b0 = (C8111b0) obj;
        if (this.f30675b.equals(c8111b0.f30675b)) {
            return this.f30674a.equals(c8111b0.f30674a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f30675b.hashCode() * 31) + this.f30674a.hashCode();
    }

    public String toString() {
        if (this.f30674a == a.class) {
            return this.f30675b.getName();
        }
        return "@" + this.f30674a.getName() + " " + this.f30675b.getName();
    }
}
