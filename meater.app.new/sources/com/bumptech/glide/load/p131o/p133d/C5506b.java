package com.bumptech.glide.load.p131o.p133d;

import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.p145r.C5596j;

/* compiled from: BytesResource.java */
/* renamed from: com.bumptech.glide.load.o.d.b */
/* loaded from: classes.dex */
public class C5506b implements InterfaceC5404u<byte[]> {

    /* renamed from: f */
    private final byte[] f13790f;

    public C5506b(byte[] bArr) {
        this.f13790f = (byte[]) C5596j.m11042d(bArr);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f13790f;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: c */
    public void mo10340c() {
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: d */
    public int mo10341d() {
        return this.f13790f.length;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: e */
    public Class<byte[]> mo10342e() {
        return byte[].class;
    }
}
