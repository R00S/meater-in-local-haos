package i0;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.Metadata;

/* compiled from: AndroidColorFilter.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a&\u0010\t\u001a\u00060\u0001j\u0002`\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n*\f\b\u0000\u0010\u000b\"\u00020\u00012\u00020\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Li0/u0;", "Landroid/graphics/ColorFilter;", "b", "(Li0/u0;)Landroid/graphics/ColorFilter;", "Li0/t0;", "color", "Li0/b0;", "blendMode", "Landroidx/compose/ui/graphics/NativeColorFilter;", "a", "(JI)Landroid/graphics/ColorFilter;", "NativeColorFilter", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: i0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3546I {
    public static final ColorFilter a(long j10, int i10) {
        return Build.VERSION.SDK_INT >= 29 ? C3578h0.f42946a.a(j10, i10) : new PorterDuffColorFilter(C3606v0.j(j10), C3543F.c(i10));
    }

    public static final ColorFilter b(C3604u0 c3604u0) {
        return c3604u0.getNativeColorFilter();
    }
}
