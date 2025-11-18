package com.bumptech.glide.p145r;

import p024c.p041e.C0867a;
import p024c.p041e.C0873g;

/* compiled from: CachedHashCodeArrayMap.java */
/* renamed from: com.bumptech.glide.r.b */
/* loaded from: classes.dex */
public final class C5588b<K, V> extends C0867a<K, V> {

    /* renamed from: n */
    private int f14028n;

    @Override // p024c.p041e.C0873g, java.util.Map
    public void clear() {
        this.f14028n = 0;
        super.clear();
    }

    @Override // p024c.p041e.C0873g, java.util.Map
    public int hashCode() {
        if (this.f14028n == 0) {
            this.f14028n = super.hashCode();
        }
        return this.f14028n;
    }

    @Override // p024c.p041e.C0873g
    /* renamed from: k */
    public void mo5474k(C0873g<? extends K, ? extends V> c0873g) {
        this.f14028n = 0;
        super.mo5474k(c0873g);
    }

    @Override // p024c.p041e.C0873g
    /* renamed from: l */
    public V mo5475l(int i2) {
        this.f14028n = 0;
        return (V) super.mo5475l(i2);
    }

    @Override // p024c.p041e.C0873g
    /* renamed from: m */
    public V mo5476m(int i2, V v) {
        this.f14028n = 0;
        return (V) super.mo5476m(i2, v);
    }

    @Override // p024c.p041e.C0873g, java.util.Map
    public V put(K k2, V v) {
        this.f14028n = 0;
        return (V) super.put(k2, v);
    }
}
