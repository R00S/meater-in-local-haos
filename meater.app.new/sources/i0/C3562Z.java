package i0;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import j0.AbstractC3703c;
import j0.C3707g;
import kotlin.Metadata;

/* compiled from: AndroidImageBitmap.android.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Li0/Z;", "", "<init>", "()V", "", "width", "height", "Li0/I0;", "bitmapConfig", "", "hasAlpha", "Lj0/c;", "colorSpace", "Landroid/graphics/Bitmap;", "b", "(IIIZLj0/c;)Landroid/graphics/Bitmap;", "a", "(Landroid/graphics/Bitmap;)Lj0/c;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i0.Z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3562Z {

    /* renamed from: a, reason: collision with root package name */
    public static final C3562Z f42897a = new C3562Z();

    private C3562Z() {
    }

    public static final AbstractC3703c a(Bitmap bitmap) {
        AbstractC3703c abstractC3703cB;
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (abstractC3703cB = C3547J.b(colorSpace)) == null) ? C3707g.f43324a.w() : abstractC3703cB;
    }

    public static final Bitmap b(int width, int height, int bitmapConfig, boolean hasAlpha, AbstractC3703c colorSpace) {
        return Bitmap.createBitmap((DisplayMetrics) null, width, height, C3552O.d(bitmapConfig), hasAlpha, C3547J.a(colorSpace));
    }
}
