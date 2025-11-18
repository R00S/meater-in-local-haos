package com.bumptech.glide.p145r;

/* compiled from: MultiClassKey.java */
/* renamed from: com.bumptech.glide.r.i */
/* loaded from: classes.dex */
public class C5595i {

    /* renamed from: a */
    private Class<?> f14043a;

    /* renamed from: b */
    private Class<?> f14044b;

    /* renamed from: c */
    private Class<?> f14045c;

    public C5595i() {
    }

    /* renamed from: a */
    public void m11038a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f14043a = cls;
        this.f14044b = cls2;
        this.f14045c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5595i.class != obj.getClass()) {
            return false;
        }
        C5595i c5595i = (C5595i) obj;
        return this.f14043a.equals(c5595i.f14043a) && this.f14044b.equals(c5595i.f14044b) && C5597k.m11047d(this.f14045c, c5595i.f14045c);
    }

    public int hashCode() {
        int iHashCode = ((this.f14043a.hashCode() * 31) + this.f14044b.hashCode()) * 31;
        Class<?> cls = this.f14045c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f14043a + ", second=" + this.f14044b + '}';
    }

    public C5595i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        m11038a(cls, cls2, cls3);
    }
}
