package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: TintResources.java */
/* loaded from: classes.dex */
class Z extends Q {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f21601b;

    public Z(Context context, Resources resources) {
        super(resources);
        this.f21601b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable drawableA = a(i10);
        Context context = this.f21601b.get();
        if (drawableA != null && context != null) {
            P.g().w(context, i10, drawableA);
        }
        return drawableA;
    }
}
