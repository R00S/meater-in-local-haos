package i0;

import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: AndroidCanvas.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t\"\u0019\u0010\u000e\u001a\u00060\u0005j\u0002`\u000b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\r*\n\u0010\u000f\"\u00020\u00052\u00020\u0005¨\u0006\u0010"}, d2 = {"Li0/H0;", "image", "Li0/l0;", "a", "(Li0/H0;)Li0/l0;", "Landroid/graphics/Canvas;", "c", "b", "(Landroid/graphics/Canvas;)Li0/l0;", "Landroid/graphics/Canvas;", "EmptyCanvas", "Landroidx/compose/ui/graphics/NativeCanvas;", "d", "(Li0/l0;)Landroid/graphics/Canvas;", "nativeCanvas", "NativeCanvas", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: i0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3545H {

    /* renamed from: a, reason: collision with root package name */
    private static final Canvas f42840a = new Canvas();

    public static final InterfaceC3586l0 a(H0 h02) {
        C3544G c3544g = new C3544G();
        c3544g.w(new Canvas(C3552O.b(h02)));
        return c3544g;
    }

    public static final InterfaceC3586l0 b(Canvas canvas) {
        C3544G c3544g = new C3544G();
        c3544g.w(canvas);
        return c3544g;
    }

    public static final Canvas d(InterfaceC3586l0 interfaceC3586l0) {
        C3862t.e(interfaceC3586l0, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((C3544G) interfaceC3586l0).v();
    }
}
