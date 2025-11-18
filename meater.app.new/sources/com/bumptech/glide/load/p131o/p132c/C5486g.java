package com.bumptech.glide.load.p131o.p132c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.load.engine.p126z.InterfaceC5413e;
import java.security.MessageDigest;

/* compiled from: CenterCrop.java */
/* renamed from: com.bumptech.glide.load.o.c.g */
/* loaded from: classes.dex */
public class C5486g extends AbstractC5484e {

    /* renamed from: b */
    private static final byte[] f13719b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC5423f.f13555a);

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public boolean equals(Object obj) {
        return obj instanceof C5486g;
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public int hashCode() {
        return -599754482;
    }

    @Override // com.bumptech.glide.load.p131o.p132c.AbstractC5484e
    protected Bitmap transform(InterfaceC5413e interfaceC5413e, Bitmap bitmap, int i2, int i3) {
        return C5502w.m10672b(interfaceC5413e, bitmap, i2, i3);
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f13719b);
    }
}
