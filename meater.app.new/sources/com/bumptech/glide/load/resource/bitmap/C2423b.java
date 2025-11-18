package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import m6.C3972g;
import m6.EnumC3968c;
import m6.InterfaceC3975j;
import o6.InterfaceC4139c;
import p6.InterfaceC4239d;

/* compiled from: BitmapDrawableEncoder.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2423b implements InterfaceC3975j<BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4239d f33316a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3975j<Bitmap> f33317b;

    public C2423b(InterfaceC4239d interfaceC4239d, InterfaceC3975j<Bitmap> interfaceC3975j) {
        this.f33316a = interfaceC4239d;
        this.f33317b = interfaceC3975j;
    }

    @Override // m6.InterfaceC3975j
    public EnumC3968c b(C3972g c3972g) {
        return this.f33317b.b(c3972g);
    }

    @Override // m6.InterfaceC3969d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(InterfaceC4139c<BitmapDrawable> interfaceC4139c, File file, C3972g c3972g) {
        return this.f33317b.a(new g(interfaceC4139c.get().getBitmap(), this.f33316a), file, c3972g);
    }
}
