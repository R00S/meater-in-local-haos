package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.load.InterfaceC5429l;
import com.bumptech.glide.p145r.C5596j;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: EngineKey.java */
/* renamed from: com.bumptech.glide.load.engine.n */
/* loaded from: classes.dex */
class C5397n implements InterfaceC5423f {

    /* renamed from: b */
    private final Object f13455b;

    /* renamed from: c */
    private final int f13456c;

    /* renamed from: d */
    private final int f13457d;

    /* renamed from: e */
    private final Class<?> f13458e;

    /* renamed from: f */
    private final Class<?> f13459f;

    /* renamed from: g */
    private final InterfaceC5423f f13460g;

    /* renamed from: h */
    private final Map<Class<?>, InterfaceC5429l<?>> f13461h;

    /* renamed from: i */
    private final C5426i f13462i;

    /* renamed from: j */
    private int f13463j;

    C5397n(Object obj, InterfaceC5423f interfaceC5423f, int i2, int i3, Map<Class<?>, InterfaceC5429l<?>> map, Class<?> cls, Class<?> cls2, C5426i c5426i) {
        this.f13455b = C5596j.m11042d(obj);
        this.f13460g = (InterfaceC5423f) C5596j.m11043e(interfaceC5423f, "Signature must not be null");
        this.f13456c = i2;
        this.f13457d = i3;
        this.f13461h = (Map) C5596j.m11042d(map);
        this.f13458e = (Class) C5596j.m11043e(cls, "Resource class must not be null");
        this.f13459f = (Class) C5596j.m11043e(cls2, "Transcode class must not be null");
        this.f13462i = (C5426i) C5596j.m11042d(c5426i);
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public boolean equals(Object obj) {
        if (!(obj instanceof C5397n)) {
            return false;
        }
        C5397n c5397n = (C5397n) obj;
        return this.f13455b.equals(c5397n.f13455b) && this.f13460g.equals(c5397n.f13460g) && this.f13457d == c5397n.f13457d && this.f13456c == c5397n.f13456c && this.f13461h.equals(c5397n.f13461h) && this.f13458e.equals(c5397n.f13458e) && this.f13459f.equals(c5397n.f13459f) && this.f13462i.equals(c5397n.f13462i);
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public int hashCode() {
        if (this.f13463j == 0) {
            int iHashCode = this.f13455b.hashCode();
            this.f13463j = iHashCode;
            int iHashCode2 = (iHashCode * 31) + this.f13460g.hashCode();
            this.f13463j = iHashCode2;
            int i2 = (iHashCode2 * 31) + this.f13456c;
            this.f13463j = i2;
            int i3 = (i2 * 31) + this.f13457d;
            this.f13463j = i3;
            int iHashCode3 = (i3 * 31) + this.f13461h.hashCode();
            this.f13463j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f13458e.hashCode();
            this.f13463j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f13459f.hashCode();
            this.f13463j = iHashCode5;
            this.f13463j = (iHashCode5 * 31) + this.f13462i.hashCode();
        }
        return this.f13463j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f13455b + ", width=" + this.f13456c + ", height=" + this.f13457d + ", resourceClass=" + this.f13458e + ", transcodeClass=" + this.f13459f + ", signature=" + this.f13460g + ", hashCode=" + this.f13463j + ", transformations=" + this.f13461h + ", options=" + this.f13462i + '}';
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
