package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import m6.InterfaceC3970e;
import p6.InterfaceC4239d;

/* compiled from: FitCenter.java */
/* loaded from: classes2.dex */
public class s extends h {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f33357b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC3970e.f45117a);

    @Override // m6.InterfaceC3970e
    public void b(MessageDigest messageDigest) {
        messageDigest.update(f33357b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    protected Bitmap c(InterfaceC4239d interfaceC4239d, Bitmap bitmap, int i10, int i11) {
        return B.e(interfaceC4239d, bitmap, i10, i11);
    }

    @Override // m6.InterfaceC3970e
    public boolean equals(Object obj) {
        return obj instanceof s;
    }

    @Override // m6.InterfaceC3970e
    public int hashCode() {
        return 1572326941;
    }
}
