package D0;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import i0.C3552O;
import i0.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ImageResources.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li0/H0$a;", "Landroid/content/res/Resources;", "res", "", "id", "Li0/H0;", "a", "(Li0/H0$a;Landroid/content/res/Resources;I)Li0/H0;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {
    public static final H0 a(H0.Companion companion, Resources resources, int i10) throws Resources.NotFoundException {
        Drawable drawable = resources.getDrawable(i10, null);
        C3862t.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return C3552O.c(((BitmapDrawable) drawable).getBitmap());
    }
}
