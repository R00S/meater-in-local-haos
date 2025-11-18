package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import m6.InterfaceC3970e;

/* compiled from: DataCacheKey.java */
/* loaded from: classes2.dex */
final class d implements InterfaceC3970e {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3970e f33090b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3970e f33091c;

    d(InterfaceC3970e interfaceC3970e, InterfaceC3970e interfaceC3970e2) {
        this.f33090b = interfaceC3970e;
        this.f33091c = interfaceC3970e2;
    }

    @Override // m6.InterfaceC3970e
    public void b(MessageDigest messageDigest) {
        this.f33090b.b(messageDigest);
        this.f33091c.b(messageDigest);
    }

    @Override // m6.InterfaceC3970e
    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f33090b.equals(dVar.f33090b) && this.f33091c.equals(dVar.f33091c);
    }

    @Override // m6.InterfaceC3970e
    public int hashCode() {
        return (this.f33090b.hashCode() * 31) + this.f33091c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f33090b + ", signature=" + this.f33091c + '}';
    }
}
