package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import m6.C3972g;
import m6.InterfaceC3974i;
import o6.InterfaceC4139c;

/* compiled from: BitmapDrawableDecoder.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2422a<DataType> implements InterfaceC3974i<DataType, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3974i<DataType, Bitmap> f33314a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f33315b;

    public C2422a(Resources resources, InterfaceC3974i<DataType, Bitmap> interfaceC3974i) {
        this.f33315b = (Resources) H6.k.d(resources);
        this.f33314a = (InterfaceC3974i) H6.k.d(interfaceC3974i);
    }

    @Override // m6.InterfaceC3974i
    public InterfaceC4139c<BitmapDrawable> a(DataType datatype, int i10, int i11, C3972g c3972g) {
        return w.f(this.f33315b, this.f33314a.a(datatype, i10, i11, c3972g));
    }

    @Override // m6.InterfaceC3974i
    public boolean b(DataType datatype, C3972g c3972g) {
        return this.f33314a.b(datatype, c3972g);
    }
}
