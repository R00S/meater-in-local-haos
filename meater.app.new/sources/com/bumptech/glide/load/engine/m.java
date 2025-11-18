package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import java.util.Map;
import m6.C3972g;
import m6.InterfaceC3970e;
import m6.InterfaceC3976k;

/* compiled from: EngineKey.java */
/* loaded from: classes2.dex */
class m implements InterfaceC3970e {

    /* renamed from: b, reason: collision with root package name */
    private final Object f33231b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33232c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33233d;

    /* renamed from: e, reason: collision with root package name */
    private final Class<?> f33234e;

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f33235f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3970e f33236g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<Class<?>, InterfaceC3976k<?>> f33237h;

    /* renamed from: i, reason: collision with root package name */
    private final C3972g f33238i;

    /* renamed from: j, reason: collision with root package name */
    private int f33239j;

    m(Object obj, InterfaceC3970e interfaceC3970e, int i10, int i11, Map<Class<?>, InterfaceC3976k<?>> map, Class<?> cls, Class<?> cls2, C3972g c3972g) {
        this.f33231b = H6.k.d(obj);
        this.f33236g = (InterfaceC3970e) H6.k.e(interfaceC3970e, "Signature must not be null");
        this.f33232c = i10;
        this.f33233d = i11;
        this.f33237h = (Map) H6.k.d(map);
        this.f33234e = (Class) H6.k.e(cls, "Resource class must not be null");
        this.f33235f = (Class) H6.k.e(cls2, "Transcode class must not be null");
        this.f33238i = (C3972g) H6.k.d(c3972g);
    }

    @Override // m6.InterfaceC3970e
    public void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // m6.InterfaceC3970e
    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f33231b.equals(mVar.f33231b) && this.f33236g.equals(mVar.f33236g) && this.f33233d == mVar.f33233d && this.f33232c == mVar.f33232c && this.f33237h.equals(mVar.f33237h) && this.f33234e.equals(mVar.f33234e) && this.f33235f.equals(mVar.f33235f) && this.f33238i.equals(mVar.f33238i);
    }

    @Override // m6.InterfaceC3970e
    public int hashCode() {
        if (this.f33239j == 0) {
            int iHashCode = this.f33231b.hashCode();
            this.f33239j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f33236g.hashCode()) * 31) + this.f33232c) * 31) + this.f33233d;
            this.f33239j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f33237h.hashCode();
            this.f33239j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f33234e.hashCode();
            this.f33239j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f33235f.hashCode();
            this.f33239j = iHashCode5;
            this.f33239j = (iHashCode5 * 31) + this.f33238i.hashCode();
        }
        return this.f33239j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f33231b + ", width=" + this.f33232c + ", height=" + this.f33233d + ", resourceClass=" + this.f33234e + ", transcodeClass=" + this.f33235f + ", signature=" + this.f33236g + ", hashCode=" + this.f33239j + ", transformations=" + this.f33237h + ", options=" + this.f33238i + '}';
    }
}
