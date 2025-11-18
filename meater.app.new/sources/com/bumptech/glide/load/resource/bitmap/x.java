package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import m6.C3972g;
import m6.InterfaceC3974i;
import o6.InterfaceC4139c;

/* compiled from: ParcelFileDescriptorBitmapDecoder.java */
/* loaded from: classes2.dex */
public final class x implements InterfaceC3974i<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final o f33378a;

    public x(o oVar) {
        this.f33378a = oVar;
    }

    private boolean e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // m6.InterfaceC3974i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4139c<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, C3972g c3972g) {
        return this.f33378a.d(parcelFileDescriptor, i10, i11, c3972g);
    }

    @Override // m6.InterfaceC3974i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ParcelFileDescriptor parcelFileDescriptor, C3972g c3972g) {
        return e(parcelFileDescriptor) && this.f33378a.o(parcelFileDescriptor);
    }
}
