package com.bumptech.glide.load.p131o.p134e;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.InterfaceC5400q;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.load.p131o.p136g.C5517c;
import com.bumptech.glide.p145r.C5596j;

/* compiled from: DrawableResource.java */
/* renamed from: com.bumptech.glide.load.o.e.b */
/* loaded from: classes.dex */
public abstract class AbstractC5508b<T extends Drawable> implements InterfaceC5404u<T>, InterfaceC5400q {

    /* renamed from: f */
    protected final T f13792f;

    public AbstractC5508b(T t) {
        this.f13792f = (T) C5596j.m11042d(t);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5400q
    /* renamed from: a */
    public void mo10346a() {
        T t = this.f13792f;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof C5517c) {
            ((C5517c) t).m10741e().prepareToDraw();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5404u
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f13792f.getConstantState();
        return constantState == null ? this.f13792f : (T) constantState.newDrawable();
    }
}
