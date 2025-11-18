package com.bumptech.glide.load;

import com.bumptech.glide.p145r.C5588b;
import java.security.MessageDigest;
import p024c.p041e.C0867a;

/* compiled from: Options.java */
/* renamed from: com.bumptech.glide.load.i */
/* loaded from: classes.dex */
public final class C5426i implements InterfaceC5423f {

    /* renamed from: b */
    private final C0867a<C5425h<?>, Object> f13562b = new C5588b();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private static <T> void m10448d(C5425h<T> c5425h, Object obj, MessageDigest messageDigest) {
        c5425h.m10446g(obj, messageDigest);
    }

    /* renamed from: a */
    public <T> T m10449a(C5425h<T> c5425h) {
        return this.f13562b.containsKey(c5425h) ? (T) this.f13562b.get(c5425h) : c5425h.m10445c();
    }

    /* renamed from: b */
    public void m10450b(C5426i c5426i) {
        this.f13562b.mo5474k(c5426i.f13562b);
    }

    /* renamed from: c */
    public <T> C5426i m10451c(C5425h<T> c5425h, T t) {
        this.f13562b.put(c5425h, t);
        return this;
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public boolean equals(Object obj) {
        if (obj instanceof C5426i) {
            return this.f13562b.equals(((C5426i) obj).f13562b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public int hashCode() {
        return this.f13562b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f13562b + '}';
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        for (int i2 = 0; i2 < this.f13562b.size(); i2++) {
            m10448d(this.f13562b.m5473j(i2), this.f13562b.m5477n(i2), messageDigest);
        }
    }
}
