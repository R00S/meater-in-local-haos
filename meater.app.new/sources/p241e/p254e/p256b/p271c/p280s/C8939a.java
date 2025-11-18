package p241e.p254e.p256b.p271c.p280s;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: DrawableUtils.java */
/* renamed from: e.e.b.c.s.a */
/* loaded from: classes2.dex */
public final class C8939a {
    /* renamed from: a */
    public static PorterDuffColorFilter m28477a(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
