package com.bumptech.glide.load.p131o.p136g;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.InterfaceC5427j;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5413e;
import com.bumptech.glide.load.p131o.p132c.C5483d;
import com.bumptech.glide.p122l.InterfaceC5360a;

/* compiled from: GifFrameResourceDecoder.java */
/* renamed from: com.bumptech.glide.load.o.g.h */
/* loaded from: classes.dex */
public final class C5522h implements InterfaceC5427j<InterfaceC5360a, Bitmap> {

    /* renamed from: a */
    private final InterfaceC5413e f13838a;

    public C5522h(InterfaceC5413e interfaceC5413e) {
        this.f13838a = interfaceC5413e;
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5404u<Bitmap> mo10453b(InterfaceC5360a interfaceC5360a, int i2, int i3, C5426i c5426i) {
        return C5483d.m10607f(interfaceC5360a.mo10105a(), this.f13838a);
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10452a(InterfaceC5360a interfaceC5360a, C5426i c5426i) {
        return true;
    }
}
