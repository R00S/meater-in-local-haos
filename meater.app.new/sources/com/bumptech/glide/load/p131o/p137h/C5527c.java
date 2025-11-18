package com.bumptech.glide.load.p131o.p137h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5413e;
import com.bumptech.glide.load.p131o.p132c.C5483d;
import com.bumptech.glide.load.p131o.p136g.C5517c;

/* compiled from: DrawableBytesTranscoder.java */
/* renamed from: com.bumptech.glide.load.o.h.c */
/* loaded from: classes.dex */
public final class C5527c implements InterfaceC5529e<Drawable, byte[]> {

    /* renamed from: a */
    private final InterfaceC5413e f13847a;

    /* renamed from: b */
    private final InterfaceC5529e<Bitmap, byte[]> f13848b;

    /* renamed from: c */
    private final InterfaceC5529e<C5517c, byte[]> f13849c;

    public C5527c(InterfaceC5413e interfaceC5413e, InterfaceC5529e<Bitmap, byte[]> interfaceC5529e, InterfaceC5529e<C5517c, byte[]> interfaceC5529e2) {
        this.f13847a = interfaceC5413e;
        this.f13848b = interfaceC5529e;
        this.f13849c = interfaceC5529e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static InterfaceC5404u<C5517c> m10777b(InterfaceC5404u<Drawable> interfaceC5404u) {
        return interfaceC5404u;
    }

    @Override // com.bumptech.glide.load.p131o.p137h.InterfaceC5529e
    /* renamed from: a */
    public InterfaceC5404u<byte[]> mo10776a(InterfaceC5404u<Drawable> interfaceC5404u, C5426i c5426i) {
        Drawable drawable = interfaceC5404u.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f13848b.mo10776a(C5483d.m10607f(((BitmapDrawable) drawable).getBitmap(), this.f13847a), c5426i);
        }
        if (drawable instanceof C5517c) {
            return this.f13849c.mo10776a(m10777b(interfaceC5404u), c5426i);
        }
        return null;
    }
}
