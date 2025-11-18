package com.bumptech.glide.load.p131o.p137h;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.load.p131o.p132c.C5497r;
import com.bumptech.glide.p145r.C5596j;

/* compiled from: BitmapDrawableTranscoder.java */
/* renamed from: com.bumptech.glide.load.o.h.b */
/* loaded from: classes.dex */
public class C5526b implements InterfaceC5529e<Bitmap, BitmapDrawable> {

    /* renamed from: a */
    private final Resources f13846a;

    public C5526b(Resources resources) {
        this.f13846a = (Resources) C5596j.m11042d(resources);
    }

    @Override // com.bumptech.glide.load.p131o.p137h.InterfaceC5529e
    /* renamed from: a */
    public InterfaceC5404u<BitmapDrawable> mo10776a(InterfaceC5404u<Bitmap> interfaceC5404u, C5426i c5426i) {
        return C5497r.m10661f(this.f13846a, interfaceC5404u);
    }
}
