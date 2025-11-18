package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: TintResources.java */
/* renamed from: androidx.appcompat.widget.p0 */
/* loaded from: classes.dex */
class C0183p0 extends C0167h0 {

    /* renamed from: b */
    private final WeakReference<Context> f1232b;

    public C0183p0(Context context, Resources resources) {
        super(resources);
        this.f1232b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.C0167h0, android.content.res.Resources
    public Drawable getDrawable(int i2) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i2);
        Context context = this.f1232b.get();
        if (drawable != null && context != null) {
            C0165g0.m981h().m997x(context, i2, drawable);
        }
        return drawable;
    }
}
