package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import m6.C3972g;
import m6.InterfaceC3974i;
import o6.InterfaceC4139c;
import p6.InterfaceC4239d;

/* compiled from: ResourceBitmapDecoder.java */
/* loaded from: classes2.dex */
public class z implements InterfaceC3974i<Uri, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final w6.l f33385a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4239d f33386b;

    public z(w6.l lVar, InterfaceC4239d interfaceC4239d) {
        this.f33385a = lVar;
        this.f33386b = interfaceC4239d;
    }

    @Override // m6.InterfaceC3974i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4139c<Bitmap> a(Uri uri, int i10, int i11, C3972g c3972g) {
        InterfaceC4139c<Drawable> interfaceC4139cA = this.f33385a.a(uri, i10, i11, c3972g);
        if (interfaceC4139cA == null) {
            return null;
        }
        return p.a(this.f33386b, interfaceC4139cA.get(), i10, i11);
    }

    @Override // m6.InterfaceC3974i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri, C3972g c3972g) {
        return "android.resource".equals(uri.getScheme());
    }
}
