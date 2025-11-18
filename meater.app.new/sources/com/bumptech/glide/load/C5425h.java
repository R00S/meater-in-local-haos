package com.bumptech.glide.load;

import com.bumptech.glide.p145r.C5596j;
import java.security.MessageDigest;

/* compiled from: Option.java */
/* renamed from: com.bumptech.glide.load.h */
/* loaded from: classes.dex */
public final class C5425h<T> {

    /* renamed from: a */
    private static final b<Object> f13557a = new a();

    /* renamed from: b */
    private final T f13558b;

    /* renamed from: c */
    private final b<T> f13559c;

    /* renamed from: d */
    private final String f13560d;

    /* renamed from: e */
    private volatile byte[] f13561e;

    /* compiled from: Option.java */
    /* renamed from: com.bumptech.glide.load.h$a */
    class a implements b<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.C5425h.b
        /* renamed from: a */
        public void mo10447a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* compiled from: Option.java */
    /* renamed from: com.bumptech.glide.load.h$b */
    public interface b<T> {
        /* renamed from: a */
        void mo10447a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private C5425h(String str, T t, b<T> bVar) {
        this.f13560d = C5596j.m11040b(str);
        this.f13558b = t;
        this.f13559c = (b) C5596j.m11042d(bVar);
    }

    /* renamed from: a */
    public static <T> C5425h<T> m10440a(String str, T t, b<T> bVar) {
        return new C5425h<>(str, t, bVar);
    }

    /* renamed from: b */
    private static <T> b<T> m10441b() {
        return (b<T>) f13557a;
    }

    /* renamed from: d */
    private byte[] m10442d() {
        if (this.f13561e == null) {
            this.f13561e = this.f13560d.getBytes(InterfaceC5423f.f13555a);
        }
        return this.f13561e;
    }

    /* renamed from: e */
    public static <T> C5425h<T> m10443e(String str) {
        return new C5425h<>(str, null, m10441b());
    }

    /* renamed from: f */
    public static <T> C5425h<T> m10444f(String str, T t) {
        return new C5425h<>(str, t, m10441b());
    }

    /* renamed from: c */
    public T m10445c() {
        return this.f13558b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5425h) {
            return this.f13560d.equals(((C5425h) obj).f13560d);
        }
        return false;
    }

    /* renamed from: g */
    public void m10446g(T t, MessageDigest messageDigest) {
        this.f13559c.mo10447a(m10442d(), t, messageDigest);
    }

    public int hashCode() {
        return this.f13560d.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f13560d + "'}";
    }
}
