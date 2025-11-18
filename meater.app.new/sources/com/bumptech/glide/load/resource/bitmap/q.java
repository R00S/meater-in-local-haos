package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
import m6.InterfaceC3976k;
import o6.InterfaceC4139c;
import p6.InterfaceC4239d;

/* compiled from: DrawableTransformation.java */
/* loaded from: classes2.dex */
public class q implements InterfaceC3976k<Drawable> {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3976k<Bitmap> f33355b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33356c;

    public q(InterfaceC3976k<Bitmap> interfaceC3976k, boolean z10) {
        this.f33355b = interfaceC3976k;
        this.f33356c = z10;
    }

    private InterfaceC4139c<Drawable> d(Context context, InterfaceC4139c<Bitmap> interfaceC4139c) {
        return w.f(context.getResources(), interfaceC4139c);
    }

    @Override // m6.InterfaceC3976k
    public InterfaceC4139c<Drawable> a(Context context, InterfaceC4139c<Drawable> interfaceC4139c, int i10, int i11) {
        InterfaceC4239d interfaceC4239dF = com.bumptech.glide.b.c(context).f();
        Drawable drawable = interfaceC4139c.get();
        InterfaceC4139c<Bitmap> interfaceC4139cA = p.a(interfaceC4239dF, drawable, i10, i11);
        if (interfaceC4139cA != null) {
            InterfaceC4139c<Bitmap> interfaceC4139cA2 = this.f33355b.a(context, interfaceC4139cA, i10, i11);
            if (!interfaceC4139cA2.equals(interfaceC4139cA)) {
                return d(context, interfaceC4139cA2);
            }
            interfaceC4139cA2.c();
            return interfaceC4139c;
        }
        if (!this.f33356c) {
            return interfaceC4139c;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // m6.InterfaceC3970e
    public void b(MessageDigest messageDigest) {
        this.f33355b.b(messageDigest);
    }

    @Override // m6.InterfaceC3970e
    public boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f33355b.equals(((q) obj).f33355b);
        }
        return false;
    }

    @Override // m6.InterfaceC3970e
    public int hashCode() {
        return this.f33355b.hashCode();
    }

    public InterfaceC3976k<BitmapDrawable> c() {
        return this;
    }
}
