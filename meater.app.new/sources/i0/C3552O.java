package i0;

import android.graphics.Bitmap;
import i0.I0;
import j0.AbstractC3703c;
import kotlin.Metadata;

/* compiled from: AndroidImageBitmap.android.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a:\u0010\r\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0016\u0010\u0012\u001a\u00020\u0011*\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0007*\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroid/graphics/Bitmap;", "Li0/H0;", "c", "(Landroid/graphics/Bitmap;)Li0/H0;", "", "width", "height", "Li0/I0;", "config", "", "hasAlpha", "Lj0/c;", "colorSpace", "a", "(IIIZLj0/c;)Li0/H0;", "b", "(Li0/H0;)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "d", "(I)Landroid/graphics/Bitmap$Config;", "e", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: i0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3552O {
    public static final H0 a(int i10, int i11, int i12, boolean z10, AbstractC3703c abstractC3703c) {
        d(i12);
        return new C3551N(C3562Z.b(i10, i11, i12, z10, abstractC3703c));
    }

    public static final Bitmap b(H0 h02) {
        if (h02 instanceof C3551N) {
            return ((C3551N) h02).getBitmap();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final H0 c(Bitmap bitmap) {
        return new C3551N(bitmap);
    }

    public static final Bitmap.Config d(int i10) {
        I0.Companion companion = I0.INSTANCE;
        return I0.g(i10, companion.b()) ? Bitmap.Config.ARGB_8888 : I0.g(i10, companion.a()) ? Bitmap.Config.ALPHA_8 : I0.g(i10, companion.e()) ? Bitmap.Config.RGB_565 : I0.g(i10, companion.c()) ? Bitmap.Config.RGBA_F16 : I0.g(i10, companion.d()) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final int e(Bitmap.Config config) {
        return config == Bitmap.Config.ALPHA_8 ? I0.INSTANCE.a() : config == Bitmap.Config.RGB_565 ? I0.INSTANCE.e() : config == Bitmap.Config.ARGB_4444 ? I0.INSTANCE.b() : config == Bitmap.Config.RGBA_F16 ? I0.INSTANCE.c() : config == Bitmap.Config.HARDWARE ? I0.INSTANCE.d() : I0.INSTANCE.b();
    }
}
