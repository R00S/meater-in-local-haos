package w;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.AbstractC2042t0;
import androidx.compose.ui.platform.C2040s0;
import f0.InterfaceC3306g;
import h0.C3476g;
import h0.C3482m;
import i0.C3545H;
import i0.InterfaceC3586l0;
import k0.InterfaceC3783c;
import kotlin.Metadata;
import l0.C3870c;
import oa.C4153F;

/* compiled from: AndroidOverscroll.android.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ#\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J#\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J#\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u0017J+\u0010!\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020\t*\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lw/o;", "Lf0/g;", "Landroidx/compose/ui/platform/t0;", "Lw/a;", "overscrollEffect", "Lw/q;", "edgeEffectWrapper", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/s0;", "Loa/F;", "inspectorInfo", "<init>", "(Lw/a;Lw/q;LBa/l;)V", "", "y", "()Z", "x", "Landroid/widget/EdgeEffect;", "left", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "canvas", "n", "(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "top", "s", "right", "p", "bottom", "m", "", "rotationDegrees", "edgeEffect", "v", "(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "Lk0/c;", "d", "(Lk0/c;)V", "c", "Lw/a;", "Lw/q;", "Landroid/graphics/RenderNode;", "e", "Landroid/graphics/RenderNode;", "_renderNode", "w", "()Landroid/graphics/RenderNode;", "renderNode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class o extends AbstractC2042t0 implements InterfaceC3306g {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C4956a overscrollEffect;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q edgeEffectWrapper;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private RenderNode _renderNode;

    public o(C4956a c4956a, q qVar, Ba.l<? super C2040s0, C4153F> lVar) {
        super(lVar);
        this.overscrollEffect = c4956a;
        this.edgeEffectWrapper = qVar;
    }

    private final boolean m(EdgeEffect bottom, Canvas canvas) {
        return v(180.0f, bottom, canvas);
    }

    private final boolean n(EdgeEffect left, Canvas canvas) {
        return v(270.0f, left, canvas);
    }

    private final boolean p(EdgeEffect right, Canvas canvas) {
        return v(90.0f, right, canvas);
    }

    private final boolean s(EdgeEffect top, Canvas canvas) {
        return v(0.0f, top, canvas);
    }

    private final boolean v(float rotationDegrees, EdgeEffect edgeEffect, Canvas canvas) {
        if (rotationDegrees == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(rotationDegrees);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final RenderNode w() {
        RenderNode renderNode = this._renderNode;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeA = C4965j.a("AndroidEdgeEffectOverscrollEffect");
        this._renderNode = renderNodeA;
        return renderNodeA;
    }

    private final boolean x() {
        q qVar = this.edgeEffectWrapper;
        return qVar.r() || qVar.s() || qVar.u() || qVar.v();
    }

    private final boolean y() {
        q qVar = this.edgeEffectWrapper;
        return qVar.y() || qVar.z() || qVar.o() || qVar.p();
    }

    @Override // f0.InterfaceC3306g
    public void d(InterfaceC3783c interfaceC3783c) {
        boolean zN;
        float f10;
        float f11;
        this.overscrollEffect.r(interfaceC3783c.C());
        if (C3482m.k(interfaceC3783c.C())) {
            interfaceC3783c.C1();
            return;
        }
        this.overscrollEffect.j().getValue();
        float fX0 = interfaceC3783c.X0(C4963h.b());
        Canvas canvasD = C3545H.d(interfaceC3783c.getDrawContext().G());
        q qVar = this.edgeEffectWrapper;
        boolean zY = y();
        boolean zX = x();
        if (zY && zX) {
            w().setPosition(0, 0, canvasD.getWidth(), canvasD.getHeight());
        } else if (zY) {
            w().setPosition(0, 0, canvasD.getWidth() + (Da.a.c(fX0) * 2), canvasD.getHeight());
        } else {
            if (!zX) {
                interfaceC3783c.C1();
                return;
            }
            w().setPosition(0, 0, canvasD.getWidth(), canvasD.getHeight() + (Da.a.c(fX0) * 2));
        }
        RecordingCanvas recordingCanvasBeginRecording = w().beginRecording();
        if (qVar.s()) {
            EdgeEffect edgeEffectI = qVar.i();
            p(edgeEffectI, recordingCanvasBeginRecording);
            edgeEffectI.finish();
        }
        if (qVar.r()) {
            EdgeEffect edgeEffectH = qVar.h();
            zN = n(edgeEffectH, recordingCanvasBeginRecording);
            if (qVar.t()) {
                float fN = C3476g.n(this.overscrollEffect.i());
                p pVar = p.f51723a;
                pVar.d(qVar.i(), pVar.b(edgeEffectH), 1 - fN);
            }
        } else {
            zN = false;
        }
        if (qVar.z()) {
            EdgeEffect edgeEffectM = qVar.m();
            m(edgeEffectM, recordingCanvasBeginRecording);
            edgeEffectM.finish();
        }
        if (qVar.y()) {
            EdgeEffect edgeEffectL = qVar.l();
            zN = s(edgeEffectL, recordingCanvasBeginRecording) || zN;
            if (qVar.A()) {
                float fM = C3476g.m(this.overscrollEffect.i());
                p pVar2 = p.f51723a;
                pVar2.d(qVar.m(), pVar2.b(edgeEffectL), fM);
            }
        }
        if (qVar.v()) {
            EdgeEffect edgeEffectK = qVar.k();
            n(edgeEffectK, recordingCanvasBeginRecording);
            edgeEffectK.finish();
        }
        if (qVar.u()) {
            EdgeEffect edgeEffectJ = qVar.j();
            zN = p(edgeEffectJ, recordingCanvasBeginRecording) || zN;
            if (qVar.w()) {
                float fN2 = C3476g.n(this.overscrollEffect.i());
                p pVar3 = p.f51723a;
                pVar3.d(qVar.k(), pVar3.b(edgeEffectJ), fN2);
            }
        }
        if (qVar.p()) {
            EdgeEffect edgeEffectG = qVar.g();
            s(edgeEffectG, recordingCanvasBeginRecording);
            edgeEffectG.finish();
        }
        if (qVar.o()) {
            EdgeEffect edgeEffectF = qVar.f();
            boolean z10 = m(edgeEffectF, recordingCanvasBeginRecording) || zN;
            if (qVar.q()) {
                float fM2 = C3476g.m(this.overscrollEffect.i());
                p pVar4 = p.f51723a;
                pVar4.d(qVar.g(), pVar4.b(edgeEffectF), 1 - fM2);
            }
            zN = z10;
        }
        if (zN) {
            this.overscrollEffect.k();
        }
        float f12 = zX ? 0.0f : fX0;
        if (zY) {
            fX0 = 0.0f;
        }
        U0.t layoutDirection = interfaceC3783c.getLayoutDirection();
        InterfaceC3586l0 interfaceC3586l0B = C3545H.b(recordingCanvasBeginRecording);
        long jC = interfaceC3783c.C();
        U0.d density = interfaceC3783c.getDrawContext().getDensity();
        U0.t layoutDirection2 = interfaceC3783c.getDrawContext().getLayoutDirection();
        InterfaceC3586l0 interfaceC3586l0G = interfaceC3783c.getDrawContext().G();
        long jC2 = interfaceC3783c.getDrawContext().C();
        C3870c graphicsLayer = interfaceC3783c.getDrawContext().getGraphicsLayer();
        k0.d drawContext = interfaceC3783c.getDrawContext();
        drawContext.c(interfaceC3783c);
        drawContext.b(layoutDirection);
        drawContext.H(interfaceC3586l0B);
        drawContext.E(jC);
        drawContext.I(null);
        interfaceC3586l0B.h();
        try {
            interfaceC3783c.getDrawContext().getTransform().b(f12, fX0);
            try {
                interfaceC3783c.C1();
                interfaceC3586l0B.t();
                k0.d drawContext2 = interfaceC3783c.getDrawContext();
                drawContext2.c(density);
                drawContext2.b(layoutDirection2);
                drawContext2.H(interfaceC3586l0G);
                drawContext2.E(jC2);
                drawContext2.I(graphicsLayer);
                w().endRecording();
                int iSave = canvasD.save();
                canvasD.translate(f10, f11);
                canvasD.drawRenderNode(w());
                canvasD.restoreToCount(iSave);
            } finally {
                interfaceC3783c.getDrawContext().getTransform().b(-f12, -fX0);
            }
        } catch (Throwable th) {
            interfaceC3586l0B.t();
            k0.d drawContext3 = interfaceC3783c.getDrawContext();
            drawContext3.c(density);
            drawContext3.b(layoutDirection2);
            drawContext3.H(interfaceC3586l0G);
            drawContext3.E(jC2);
            drawContext3.I(graphicsLayer);
            throw th;
        }
    }
}
