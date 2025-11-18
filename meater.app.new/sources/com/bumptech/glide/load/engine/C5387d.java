package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.InterfaceC5423f;
import java.security.MessageDigest;

/* compiled from: DataCacheKey.java */
/* renamed from: com.bumptech.glide.load.engine.d */
/* loaded from: classes.dex */
final class C5387d implements InterfaceC5423f {

    /* renamed from: b */
    private final InterfaceC5423f f13313b;

    /* renamed from: c */
    private final InterfaceC5423f f13314c;

    C5387d(InterfaceC5423f interfaceC5423f, InterfaceC5423f interfaceC5423f2) {
        this.f13313b = interfaceC5423f;
        this.f13314c = interfaceC5423f2;
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public boolean equals(Object obj) {
        if (!(obj instanceof C5387d)) {
            return false;
        }
        C5387d c5387d = (C5387d) obj;
        return this.f13313b.equals(c5387d.f13313b) && this.f13314c.equals(c5387d.f13314c);
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public int hashCode() {
        return (this.f13313b.hashCode() * 31) + this.f13314c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f13313b + ", signature=" + this.f13314c + '}';
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f13313b.updateDiskCacheKey(messageDigest);
        this.f13314c.updateDiskCacheKey(messageDigest);
    }
}
