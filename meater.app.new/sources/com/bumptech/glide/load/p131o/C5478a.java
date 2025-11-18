package com.bumptech.glide.load.p131o;

import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.p145r.C5596j;

/* compiled from: SimpleResource.java */
/* renamed from: com.bumptech.glide.load.o.a */
/* loaded from: classes.dex */
public class C5478a<T> implements InterfaceC5404u<T> {

    /* renamed from: f */
    protected final T f13707f;

    public C5478a(T t) {
        this.f13707f = (T) C5596j.m11042d(t);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: c */
    public void mo10340c() {
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: d */
    public final int mo10341d() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: e */
    public Class<T> mo10342e() {
        return (Class<T>) this.f13707f.getClass();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    public final T get() {
        return this.f13707f;
    }
}
