package com.bumptech.glide.p144q;

import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.p145r.C5596j;
import java.security.MessageDigest;

/* compiled from: ObjectKey.java */
/* renamed from: com.bumptech.glide.q.c */
/* loaded from: classes.dex */
public final class C5586c implements InterfaceC5423f {

    /* renamed from: b */
    private final Object f14021b;

    public C5586c(Object obj) {
        this.f14021b = C5596j.m11042d(obj);
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public boolean equals(Object obj) {
        if (obj instanceof C5586c) {
            return this.f14021b.equals(((C5586c) obj).f14021b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public int hashCode() {
        return this.f14021b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f14021b + '}';
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.f14021b.toString().getBytes(InterfaceC5423f.f13555a));
    }
}
