package com.bumptech.glide.load.p131o.p132c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.load.engine.p126z.InterfaceC5413e;
import com.bumptech.glide.p145r.C5596j;
import com.bumptech.glide.p145r.C5597k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: RoundedCorners.java */
/* renamed from: com.bumptech.glide.load.o.c.u */
/* loaded from: classes.dex */
public final class C5500u extends AbstractC5484e {

    /* renamed from: b */
    private static final byte[] f13769b = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(InterfaceC5423f.f13555a);

    /* renamed from: c */
    private final int f13770c;

    public C5500u(int i2) {
        C5596j.m11039a(i2 > 0, "roundingRadius must be greater than 0.");
        this.f13770c = i2;
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public boolean equals(Object obj) {
        return (obj instanceof C5500u) && this.f13770c == ((C5500u) obj).f13770c;
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public int hashCode() {
        return C5597k.m11057n(-569625254, C5597k.m11056m(this.f13770c));
    }

    @Override // com.bumptech.glide.load.p131o.p132c.AbstractC5484e
    protected Bitmap transform(InterfaceC5413e interfaceC5413e, Bitmap bitmap, int i2, int i3) {
        return C5502w.m10685o(interfaceC5413e, bitmap, this.f13770c);
    }

    @Override // com.bumptech.glide.load.InterfaceC5423f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f13769b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f13770c).array());
    }
}
