package i0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import h0.C3476g;
import h0.C3478i;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: AndroidCanvas.android.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\"\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0014\u0010&\u001a\u00020%*\u00020\u001dø\u0001\u0000¢\u0006\u0004\b&\u0010'J7\u0010(\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010)JG\u0010,\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010-J*\u00101\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102JO\u00107\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u00103\u001a\u00020\r2\u0006\u00104\u001a\u00020\r2\u0006\u00106\u001a\u0002052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b9\u0010:JB\u0010C\u001a\u00020\u00042\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020=2\u0006\u0010B\u001a\u00020?2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0004H\u0016¢\u0006\u0004\bE\u0010\u0003J\u000f\u0010F\u001a\u00020\u0004H\u0016¢\u0006\u0004\bF\u0010\u0003R,\u0010O\u001a\u00060Gj\u0002`H8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010I\u0012\u0004\bN\u0010\u0003\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0018\u0010R\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010Q\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006T"}, d2 = {"Li0/G;", "Li0/l0;", "<init>", "()V", "Loa/F;", "h", "t", "Lh0/i;", "bounds", "Li0/P0;", "paint", "q", "(Lh0/i;Li0/P0;)V", "", "dx", "dy", "b", "(FF)V", "sx", "sy", "f", "Li0/L0;", "matrix", "k", "([F)V", "left", "top", "right", "bottom", "Li0/s0;", "clipOp", "a", "(FFFFI)V", "Li0/R0;", "path", "c", "(Li0/R0;I)V", "Landroid/graphics/Region$Op;", "x", "(I)Landroid/graphics/Region$Op;", "i", "(FFFFLi0/P0;)V", "radiusX", "radiusY", "m", "(FFFFFFLi0/P0;)V", "Lh0/g;", "center", "radius", "n", "(JFLi0/P0;)V", "startAngle", "sweepAngle", "", "useCenter", "r", "(FFFFFFZLi0/P0;)V", "o", "(Li0/R0;Li0/P0;)V", "Li0/H0;", "image", "LU0/n;", "srcOffset", "LU0/r;", "srcSize", "dstOffset", "dstSize", "d", "(Li0/H0;JJJJLi0/P0;)V", "u", "j", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "Landroid/graphics/Canvas;", "v", "()Landroid/graphics/Canvas;", "w", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "internalCanvas", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "srcRect", "dstRect", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3544G implements InterfaceC3586l0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Canvas internalCanvas = C3545H.f42840a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Rect srcRect;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Rect dstRect;

    @Override // i0.InterfaceC3586l0
    public void a(float left, float top, float right, float bottom, int clipOp) {
        this.internalCanvas.clipRect(left, top, right, bottom, x(clipOp));
    }

    @Override // i0.InterfaceC3586l0
    public void b(float dx, float dy) {
        this.internalCanvas.translate(dx, dy);
    }

    @Override // i0.InterfaceC3586l0
    public void c(R0 path, int clipOp) {
        Canvas canvas = this.internalCanvas;
        if (!(path instanceof C3556T)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C3556T) path).getInternalPath(), x(clipOp));
    }

    @Override // i0.InterfaceC3586l0
    public void d(H0 image, long srcOffset, long srcSize, long dstOffset, long dstSize, P0 paint) {
        if (this.srcRect == null) {
            this.srcRect = new Rect();
            this.dstRect = new Rect();
        }
        Canvas canvas = this.internalCanvas;
        Bitmap bitmapB = C3552O.b(image);
        Rect rect = this.srcRect;
        C3862t.d(rect);
        rect.left = U0.n.h(srcOffset);
        rect.top = U0.n.i(srcOffset);
        rect.right = U0.n.h(srcOffset) + U0.r.g(srcSize);
        rect.bottom = U0.n.i(srcOffset) + U0.r.f(srcSize);
        C4153F c4153f = C4153F.f46609a;
        Rect rect2 = this.dstRect;
        C3862t.d(rect2);
        rect2.left = U0.n.h(dstOffset);
        rect2.top = U0.n.i(dstOffset);
        rect2.right = U0.n.h(dstOffset) + U0.r.g(dstSize);
        rect2.bottom = U0.n.i(dstOffset) + U0.r.f(dstSize);
        canvas.drawBitmap(bitmapB, rect, rect2, paint.k());
    }

    @Override // i0.InterfaceC3586l0
    public void f(float sx, float sy) {
        this.internalCanvas.scale(sx, sy);
    }

    @Override // i0.InterfaceC3586l0
    public void h() {
        this.internalCanvas.save();
    }

    @Override // i0.InterfaceC3586l0
    public void i(float left, float top, float right, float bottom, P0 paint) {
        this.internalCanvas.drawRect(left, top, right, bottom, paint.k());
    }

    @Override // i0.InterfaceC3586l0
    public void j() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C3592o0.f42955a.a(this.internalCanvas, false);
    }

    @Override // i0.InterfaceC3586l0
    public void k(float[] matrix) {
        if (M0.c(matrix)) {
            return;
        }
        Matrix matrix2 = new Matrix();
        C3553P.a(matrix2, matrix);
        this.internalCanvas.concat(matrix2);
    }

    @Override // i0.InterfaceC3586l0
    public void m(float left, float top, float right, float bottom, float radiusX, float radiusY, P0 paint) {
        this.internalCanvas.drawRoundRect(left, top, right, bottom, radiusX, radiusY, paint.k());
    }

    @Override // i0.InterfaceC3586l0
    public void n(long center, float radius, P0 paint) {
        this.internalCanvas.drawCircle(C3476g.m(center), C3476g.n(center), radius, paint.k());
    }

    @Override // i0.InterfaceC3586l0
    public void o(R0 path, P0 paint) {
        Canvas canvas = this.internalCanvas;
        if (!(path instanceof C3556T)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C3556T) path).getInternalPath(), paint.k());
    }

    @Override // i0.InterfaceC3586l0
    public void q(C3478i bounds, P0 paint) {
        this.internalCanvas.saveLayer(bounds.getLeft(), bounds.getTop(), bounds.getRight(), bounds.getBottom(), paint.k(), 31);
    }

    @Override // i0.InterfaceC3586l0
    public void r(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, P0 paint) {
        this.internalCanvas.drawArc(left, top, right, bottom, startAngle, sweepAngle, useCenter, paint.k());
    }

    @Override // i0.InterfaceC3586l0
    public void t() {
        this.internalCanvas.restore();
    }

    @Override // i0.InterfaceC3586l0
    public void u() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C3592o0.f42955a.a(this.internalCanvas, true);
    }

    /* renamed from: v, reason: from getter */
    public final Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    public final void w(Canvas canvas) {
        this.internalCanvas = canvas;
    }

    public final Region.Op x(int i10) {
        return C3600s0.d(i10, C3600s0.INSTANCE.a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }
}
