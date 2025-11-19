package e0;

import Ba.l;
import U0.t;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import h0.C3482m;
import i0.C3545H;
import i0.InterfaceC3586l0;
import k0.C3781a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;

/* compiled from: ComposeDragShadowBuilder.android.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Le0/a;", "Landroid/view/View$DragShadowBuilder;", "LU0/d;", "density", "Lh0/m;", "decorationSize", "Lkotlin/Function1;", "Lk0/f;", "Loa/F;", "drawDragDecoration", "<init>", "(LU0/d;JLBa/l;Lkotlin/jvm/internal/k;)V", "Landroid/graphics/Point;", "outShadowSize", "outShadowTouchPoint", "onProvideShadowMetrics", "(Landroid/graphics/Point;Landroid/graphics/Point;)V", "Landroid/graphics/Canvas;", "canvas", "onDrawShadow", "(Landroid/graphics/Canvas;)V", "a", "LU0/d;", "b", "J", "c", "LBa/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3110a extends View.DragShadowBuilder {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final U0.d density;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long decorationSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l<k0.f, C4153F> drawDragDecoration;

    public /* synthetic */ C3110a(U0.d dVar, long j10, l lVar, C3854k c3854k) {
        this(dVar, j10, lVar);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        C3781a c3781a = new C3781a();
        U0.d dVar = this.density;
        long j10 = this.decorationSize;
        t tVar = t.Ltr;
        InterfaceC3586l0 interfaceC3586l0B = C3545H.b(canvas);
        l<k0.f, C4153F> lVar = this.drawDragDecoration;
        C3781a.DrawParams drawParams = c3781a.getDrawParams();
        U0.d density = drawParams.getDensity();
        t layoutDirection = drawParams.getLayoutDirection();
        InterfaceC3586l0 canvas2 = drawParams.getCanvas();
        long size = drawParams.getSize();
        C3781a.DrawParams drawParams2 = c3781a.getDrawParams();
        drawParams2.j(dVar);
        drawParams2.k(tVar);
        drawParams2.i(interfaceC3586l0B);
        drawParams2.l(j10);
        interfaceC3586l0B.h();
        lVar.invoke(c3781a);
        interfaceC3586l0B.t();
        C3781a.DrawParams drawParams3 = c3781a.getDrawParams();
        drawParams3.j(density);
        drawParams3.k(layoutDirection);
        drawParams3.i(canvas2);
        drawParams3.l(size);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point outShadowSize, Point outShadowTouchPoint) {
        U0.d dVar = this.density;
        outShadowSize.set(dVar.i1(dVar.G0(C3482m.i(this.decorationSize))), dVar.i1(dVar.G0(C3482m.g(this.decorationSize))));
        outShadowTouchPoint.set(outShadowSize.x / 2, outShadowSize.y / 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C3110a(U0.d dVar, long j10, l<? super k0.f, C4153F> lVar) {
        this.density = dVar;
        this.decorationSize = j10;
        this.drawDragDecoration = lVar;
    }
}
