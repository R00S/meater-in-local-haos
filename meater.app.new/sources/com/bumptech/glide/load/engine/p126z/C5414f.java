package com.bumptech.glide.load.engine.p126z;

import android.graphics.Bitmap;

/* compiled from: BitmapPoolAdapter.java */
/* renamed from: com.bumptech.glide.load.engine.z.f */
/* loaded from: classes.dex */
public class C5414f implements InterfaceC5413e {
    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5413e
    /* renamed from: a */
    public void mo10385a(int i2) {
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5413e
    /* renamed from: b */
    public void mo10386b() {
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5413e
    /* renamed from: c */
    public void mo10387c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5413e
    /* renamed from: d */
    public Bitmap mo10388d(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5413e
    /* renamed from: e */
    public Bitmap mo10389e(int i2, int i3, Bitmap.Config config) {
        return mo10388d(i2, i3, config);
    }
}
