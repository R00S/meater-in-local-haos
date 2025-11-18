package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.load.InterfaceC5429l;
import com.bumptech.glide.load.engine.p126z.InterfaceC5410b;
import com.bumptech.glide.p145r.C5593g;
import com.bumptech.glide.p145r.C5597k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: ResourceCacheKey.java */
/* renamed from: com.bumptech.glide.load.engine.w */
/* loaded from: classes.dex */
final class C5406w implements InterfaceC5423f {

    /* renamed from: b */
    private static final C5593g<Class<?>, byte[]> f13492b = new C5593g<>(50);

    /* renamed from: c */
    private final InterfaceC5410b f13493c;

    /* renamed from: d */
    private final InterfaceC5423f f13494d;

    /* renamed from: e */
    private final InterfaceC5423f f13495e;

    /* renamed from: f */
    private final int f13496f;

    /* renamed from: g */
    private final int f13497g;

    /* renamed from: h */
    private final Class<?> f13498h;

    /* renamed from: i */
    private final C5426i f13499i;

    /* renamed from: j */
    private final InterfaceC5429l<?> f13500j;

    C5406w(InterfaceC5410b interfaceC5410b, InterfaceC5423f interfaceC5423f, InterfaceC5423f interfaceC5423f2, int i2, int i3, InterfaceC5429l<?> interfaceC5429l, Class<?> cls, C5426i c5426i) {
        this.f13493c = interfaceC5410b;
        this.f13494d = interfaceC5423f;
        this.f13495e = interfaceC5423f2;
        this.f13496f = i2;
        this.f13497g = i3;
        this.f13500j = interfaceC5429l;
        this.f13498h = cls;
        this.f13499i = c5426i;
    }

    /* renamed from: a */
    private byte[] m10359a() {
        C5593g<Class<?>, byte[]> c5593g = f13492b;
        byte[] bArrM11031g = c5593g.m11031g(this.f13498h);
        if (bArrM11031g != null) {
            return bArrM11031g;
        }
        byte[] bytes = this.f13498h.getName().getBytes(InterfaceC5423f.f13555a);
        c5593g.m11033k(this.f13498h, bytes);
        return bytes;
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public boolean equals(Object obj) {
        if (!(obj instanceof C5406w)) {
            return false;
        }
        C5406w c5406w = (C5406w) obj;
        return this.f13497g == c5406w.f13497g && this.f13496f == c5406w.f13496f && C5597k.m11047d(this.f13500j, c5406w.f13500j) && this.f13498h.equals(c5406w.f13498h) && this.f13494d.equals(c5406w.f13494d) && this.f13495e.equals(c5406w.f13495e) && this.f13499i.equals(c5406w.f13499i);
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public int hashCode() {
        int iHashCode = (((((this.f13494d.hashCode() * 31) + this.f13495e.hashCode()) * 31) + this.f13496f) * 31) + this.f13497g;
        InterfaceC5429l<?> interfaceC5429l = this.f13500j;
        if (interfaceC5429l != null) {
            iHashCode = (iHashCode * 31) + interfaceC5429l.hashCode();
        }
        return (((iHashCode * 31) + this.f13498h.hashCode()) * 31) + this.f13499i.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f13494d + ", signature=" + this.f13495e + ", width=" + this.f13496f + ", height=" + this.f13497g + ", decodedResourceClass=" + this.f13498h + ", transformation='" + this.f13500j + "', options=" + this.f13499i + '}';
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f13493c.mo10367c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f13496f).putInt(this.f13497g).array();
        this.f13495e.updateDiskCacheKey(messageDigest);
        this.f13494d.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        InterfaceC5429l<?> interfaceC5429l = this.f13500j;
        if (interfaceC5429l != null) {
            interfaceC5429l.updateDiskCacheKey(messageDigest);
        }
        this.f13499i.updateDiskCacheKey(messageDigest);
        messageDigest.update(m10359a());
        this.f13493c.mo10368d(bArr);
    }
}
