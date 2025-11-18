package com.bumptech.glide.load.engine;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import m6.C3972g;
import m6.InterfaceC3970e;
import m6.InterfaceC3976k;
import p6.InterfaceC4237b;

/* compiled from: ResourceCacheKey.java */
/* loaded from: classes2.dex */
final class t implements InterfaceC3970e {

    /* renamed from: j, reason: collision with root package name */
    private static final H6.h<Class<?>, byte[]> f33268j = new H6.h<>(50);

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4237b f33269b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3970e f33270c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3970e f33271d;

    /* renamed from: e, reason: collision with root package name */
    private final int f33272e;

    /* renamed from: f, reason: collision with root package name */
    private final int f33273f;

    /* renamed from: g, reason: collision with root package name */
    private final Class<?> f33274g;

    /* renamed from: h, reason: collision with root package name */
    private final C3972g f33275h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3976k<?> f33276i;

    t(InterfaceC4237b interfaceC4237b, InterfaceC3970e interfaceC3970e, InterfaceC3970e interfaceC3970e2, int i10, int i11, InterfaceC3976k<?> interfaceC3976k, Class<?> cls, C3972g c3972g) {
        this.f33269b = interfaceC4237b;
        this.f33270c = interfaceC3970e;
        this.f33271d = interfaceC3970e2;
        this.f33272e = i10;
        this.f33273f = i11;
        this.f33276i = interfaceC3976k;
        this.f33274g = cls;
        this.f33275h = c3972g;
    }

    private byte[] c() {
        H6.h<Class<?>, byte[]> hVar = f33268j;
        byte[] bArrG = hVar.g(this.f33274g);
        if (bArrG != null) {
            return bArrG;
        }
        byte[] bytes = this.f33274g.getName().getBytes(InterfaceC3970e.f45117a);
        hVar.k(this.f33274g, bytes);
        return bytes;
    }

    @Override // m6.InterfaceC3970e
    public void b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f33269b.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f33272e).putInt(this.f33273f).array();
        this.f33271d.b(messageDigest);
        this.f33270c.b(messageDigest);
        messageDigest.update(bArr);
        InterfaceC3976k<?> interfaceC3976k = this.f33276i;
        if (interfaceC3976k != null) {
            interfaceC3976k.b(messageDigest);
        }
        this.f33275h.b(messageDigest);
        messageDigest.update(c());
        this.f33269b.d(bArr);
    }

    @Override // m6.InterfaceC3970e
    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f33273f == tVar.f33273f && this.f33272e == tVar.f33272e && H6.l.d(this.f33276i, tVar.f33276i) && this.f33274g.equals(tVar.f33274g) && this.f33270c.equals(tVar.f33270c) && this.f33271d.equals(tVar.f33271d) && this.f33275h.equals(tVar.f33275h);
    }

    @Override // m6.InterfaceC3970e
    public int hashCode() {
        int iHashCode = (((((this.f33270c.hashCode() * 31) + this.f33271d.hashCode()) * 31) + this.f33272e) * 31) + this.f33273f;
        InterfaceC3976k<?> interfaceC3976k = this.f33276i;
        if (interfaceC3976k != null) {
            iHashCode = (iHashCode * 31) + interfaceC3976k.hashCode();
        }
        return (((iHashCode * 31) + this.f33274g.hashCode()) * 31) + this.f33275h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f33270c + ", signature=" + this.f33271d + ", width=" + this.f33272e + ", height=" + this.f33273f + ", decodedResourceClass=" + this.f33274g + ", transformation='" + this.f33276i + "', options=" + this.f33275h + '}';
    }
}
