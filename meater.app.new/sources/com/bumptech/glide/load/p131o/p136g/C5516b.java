package com.bumptech.glide.load.p131o.p136g;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.p126z.InterfaceC5410b;
import com.bumptech.glide.load.engine.p126z.InterfaceC5413e;
import com.bumptech.glide.p122l.InterfaceC5360a;

/* compiled from: GifBitmapProvider.java */
/* renamed from: com.bumptech.glide.load.o.g.b */
/* loaded from: classes.dex */
public final class C5516b implements InterfaceC5360a.a {

    /* renamed from: a */
    private final InterfaceC5413e f13802a;

    /* renamed from: b */
    private final InterfaceC5410b f13803b;

    public C5516b(InterfaceC5413e interfaceC5413e, InterfaceC5410b interfaceC5410b) {
        this.f13802a = interfaceC5413e;
        this.f13803b = interfaceC5410b;
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5360a.a
    /* renamed from: a */
    public Bitmap mo10114a(int i2, int i3, Bitmap.Config config) {
        return this.f13802a.mo10389e(i2, i3, config);
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5360a.a
    /* renamed from: b */
    public int[] mo10115b(int i2) {
        InterfaceC5410b interfaceC5410b = this.f13803b;
        return interfaceC5410b == null ? new int[i2] : (int[]) interfaceC5410b.mo10369e(i2, int[].class);
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5360a.a
    /* renamed from: c */
    public void mo10116c(Bitmap bitmap) {
        this.f13802a.mo10387c(bitmap);
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5360a.a
    /* renamed from: d */
    public void mo10117d(byte[] bArr) {
        InterfaceC5410b interfaceC5410b = this.f13803b;
        if (interfaceC5410b == null) {
            return;
        }
        interfaceC5410b.mo10368d(bArr);
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5360a.a
    /* renamed from: e */
    public byte[] mo10118e(int i2) {
        InterfaceC5410b interfaceC5410b = this.f13803b;
        return interfaceC5410b == null ? new byte[i2] : (byte[]) interfaceC5410b.mo10369e(i2, byte[].class);
    }

    @Override // com.bumptech.glide.p122l.InterfaceC5360a.a
    /* renamed from: f */
    public void mo10119f(int[] iArr) {
        InterfaceC5410b interfaceC5410b = this.f13803b;
        if (interfaceC5410b == null) {
            return;
        }
        interfaceC5410b.mo10368d(iArr);
    }
}
