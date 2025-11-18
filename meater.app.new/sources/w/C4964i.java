package w;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.AbstractC2042t0;
import androidx.compose.ui.platform.C2040s0;
import f0.InterfaceC3306g;
import h0.C3476g;
import h0.C3477h;
import h0.C3482m;
import i0.C3545H;
import k0.InterfaceC3783c;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: AndroidOverscroll.android.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0016\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J'\u0010\u001b\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J'\u0010\u001d\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u0017J6\u0010#\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020\u000b*\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Lw/i;", "Lf0/g;", "Landroidx/compose/ui/platform/t0;", "Lw/a;", "overscrollEffect", "Lw/q;", "edgeEffectWrapper", "Lw/G;", "overscrollConfig", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/s0;", "Loa/F;", "inspectorInfo", "<init>", "(Lw/a;Lw/q;Lw/G;LBa/l;)V", "Lk0/f;", "Landroid/widget/EdgeEffect;", "left", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "canvas", "", "n", "(Lk0/f;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "top", "s", "right", "p", "bottom", "m", "", "rotationDegrees", "Lh0/g;", "offset", "edgeEffect", "v", "(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "Lk0/c;", "d", "(Lk0/c;)V", "c", "Lw/a;", "Lw/q;", "e", "Lw/G;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: w.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4964i extends AbstractC2042t0 implements InterfaceC3306g {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C4956a overscrollEffect;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q edgeEffectWrapper;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final OverscrollConfiguration overscrollConfig;

    public C4964i(C4956a c4956a, q qVar, OverscrollConfiguration overscrollConfiguration, Ba.l<? super C2040s0, C4153F> lVar) {
        super(lVar);
        this.overscrollEffect = c4956a;
        this.edgeEffectWrapper = qVar;
        this.overscrollConfig = overscrollConfiguration;
    }

    private final boolean m(k0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return v(180.0f, C3477h.a(-C3482m.i(fVar.C()), (-C3482m.g(fVar.C())) + fVar.X0(this.overscrollConfig.getDrawPadding().getBottom())), edgeEffect, canvas);
    }

    private final boolean n(k0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return v(270.0f, C3477h.a(-C3482m.g(fVar.C()), fVar.X0(this.overscrollConfig.getDrawPadding().a(fVar.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean p(k0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return v(90.0f, C3477h.a(0.0f, (-Da.a.c(C3482m.i(fVar.C()))) + fVar.X0(this.overscrollConfig.getDrawPadding().c(fVar.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean s(k0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return v(0.0f, C3477h.a(0.0f, fVar.X0(this.overscrollConfig.getDrawPadding().getTop())), edgeEffect, canvas);
    }

    private final boolean v(float rotationDegrees, long offset, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(rotationDegrees);
        canvas.translate(C3476g.m(offset), C3476g.n(offset));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // f0.InterfaceC3306g
    public void d(InterfaceC3783c interfaceC3783c) {
        this.overscrollEffect.r(interfaceC3783c.C());
        if (C3482m.k(interfaceC3783c.C())) {
            interfaceC3783c.C1();
            return;
        }
        interfaceC3783c.C1();
        this.overscrollEffect.j().getValue();
        Canvas canvasD = C3545H.d(interfaceC3783c.getDrawContext().G());
        q qVar = this.edgeEffectWrapper;
        boolean zN = qVar.r() ? n(interfaceC3783c, qVar.h(), canvasD) : false;
        if (qVar.y()) {
            zN = s(interfaceC3783c, qVar.l(), canvasD) || zN;
        }
        if (qVar.u()) {
            zN = p(interfaceC3783c, qVar.j(), canvasD) || zN;
        }
        if (qVar.o()) {
            zN = m(interfaceC3783c, qVar.f(), canvasD) || zN;
        }
        if (zN) {
            this.overscrollEffect.k();
        }
    }
}
