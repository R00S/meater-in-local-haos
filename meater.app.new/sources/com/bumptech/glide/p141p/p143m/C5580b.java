package com.bumptech.glide.p141p.p143m;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.bumptech.glide.p141p.p143m.InterfaceC5582d;

/* compiled from: DrawableCrossFadeTransition.java */
/* renamed from: com.bumptech.glide.p.m.b */
/* loaded from: classes.dex */
public class C5580b implements InterfaceC5582d<Drawable> {

    /* renamed from: a */
    private final int f14015a;

    /* renamed from: b */
    private final boolean f14016b;

    public C5580b(int i2, boolean z) {
        this.f14015a = i2;
        this.f14016b = z;
    }

    @Override // com.bumptech.glide.p141p.p143m.InterfaceC5582d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean mo11005a(Drawable drawable, InterfaceC5582d.a aVar) {
        Drawable drawableMo10983b = aVar.mo10983b();
        if (drawableMo10983b == null) {
            drawableMo10983b = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawableMo10983b, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f14016b);
        transitionDrawable.startTransition(this.f14015a);
        aVar.mo10982a(transitionDrawable);
        return true;
    }
}
