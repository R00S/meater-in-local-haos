package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import m6.InterfaceC3970e;
import p6.InterfaceC4239d;

/* compiled from: CenterCrop.java */
/* loaded from: classes2.dex */
public class l extends h {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f33326b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC3970e.f45117a);

    @Override // m6.InterfaceC3970e
    public void b(MessageDigest messageDigest) {
        messageDigest.update(f33326b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    protected Bitmap c(InterfaceC4239d interfaceC4239d, Bitmap bitmap, int i10, int i11) {
        return B.b(interfaceC4239d, bitmap, i10, i11);
    }

    @Override // m6.InterfaceC3970e
    public boolean equals(Object obj) {
        return obj instanceof l;
    }

    @Override // m6.InterfaceC3970e
    public int hashCode() {
        return -599754482;
    }
}
