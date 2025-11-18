package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.os.Build;
import androidx.compose.ui.graphics.a;
import h0.C3476g;
import h0.C3477h;
import h0.C3483n;
import h0.MutableRect;
import i0.C3545H;
import i0.C3555S;
import i0.C3561Y;
import i0.InterfaceC3586l0;
import i0.N0;
import k0.C3781a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import l0.C3869b;
import l0.C3870c;
import l0.C3872e;
import oa.C4153F;

/* compiled from: GraphicsLayerOwnerLayer.android.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020%H\u0016ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H\u0016ø\u0001\u0001¢\u0006\u0004\b*\u0010'J!\u0010,\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010\u0012J\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010\u0012J\u000f\u00100\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u0010\u0012J\"\u00103\u001a\u00020 2\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020\"H\u0016ø\u0001\u0001¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\u000b2\u0006\u00106\u001a\u0002052\u0006\u00102\u001a\u00020\"H\u0016¢\u0006\u0004\b7\u00108J9\u00109\u001a\u00020\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016¢\u0006\u0004\b9\u0010:R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R,\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010L\u001a\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bJ\u0010KR\u001e\u0010M\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bF\u0010KR$\u0010R\u001a\u00020\"2\u0006\u0010N\u001a\u00020\"8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bO\u0010H\"\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u001d\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010`\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010JR\u001c\u0010c\u001a\u00020a8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bb\u0010FR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010q\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010HR \u0010v\u001a\u000e\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020\u000b0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010u\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006w"}, d2 = {"Landroidx/compose/ui/platform/m0;", "LA0/l0;", "", "Ll0/c;", "graphicsLayer", "Li0/F0;", "context", "Landroidx/compose/ui/platform/q;", "ownerView", "Lkotlin/Function2;", "Li0/l0;", "Loa/F;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Ll0/c;Li0/F0;Landroidx/compose/ui/platform/q;LBa/p;LBa/a;)V", "p", "()V", "r", "Li0/L0;", "n", "()[F", "m", "q", "canvas", "l", "(Li0/l0;)V", "Landroidx/compose/ui/graphics/d;", "scope", "f", "(Landroidx/compose/ui/graphics/d;)V", "Lh0/g;", "position", "", "e", "(J)Z", "LU0/n;", "i", "(J)V", "LU0/r;", "size", "h", "parentLayer", "a", "(Li0/l0;Ll0/c;)V", "j", "invalidate", "d", "point", "inverse", "g", "(JZ)J", "Lh0/e;", "rect", "b", "(Lh0/e;Z)V", "c", "(LBa/p;LBa/a;)V", "B", "Ll0/c;", "C", "Li0/F0;", "D", "Landroidx/compose/ui/platform/q;", "E", "LBa/p;", "F", "LBa/a;", "G", "J", "H", "Z", "isDestroyed", "I", "[F", "matrixCache", "inverseMatrixCache", "value", "K", "o", "(Z)V", "isDirty", "LU0/d;", "L", "LU0/d;", "density", "LU0/t;", "M", "LU0/t;", "layoutDirection", "Lk0/a;", "N", "Lk0/a;", "", "O", "mutatedFields", "Landroidx/compose/ui/graphics/f;", "P", "transformOrigin", "Li0/N0;", "Q", "Li0/N0;", "outline", "Li0/R0;", "R", "Li0/R0;", "tmpPath", "Li0/P0;", "S", "Li0/P0;", "softwareLayerPaint", "T", "drawnWithEnabledZ", "Lkotlin/Function1;", "Lk0/f;", "U", "LBa/l;", "recordLambda", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2029m0 implements A0.l0 {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private C3870c graphicsLayer;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final i0.F0 context;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final C2036q ownerView;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Ba.p<? super InterfaceC3586l0, ? super C3870c, C4153F> drawBlock;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private Ba.a<C4153F> invalidateParentLayer;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private boolean isDestroyed;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private float[] inverseMatrixCache;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private i0.N0 outline;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private i0.R0 tmpPath;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private i0.P0 softwareLayerPaint;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private boolean drawnWithEnabledZ;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private long size = U0.s.a(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final float[] matrixCache = i0.L0.c(null, 1, null);

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private U0.d density = U0.f.b(1.0f, 0.0f, 2, null);

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private U0.t layoutDirection = U0.t.Ltr;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final C3781a scope = new C3781a();

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin = androidx.compose.ui.graphics.f.INSTANCE.a();

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<k0.f, C4153F> recordLambda = new a();

    /* compiled from: GraphicsLayerOwnerLayer.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk0/f;", "Loa/F;", "a", "(Lk0/f;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.m0$a */
    static final class a extends AbstractC3864v implements Ba.l<k0.f, C4153F> {
        a() {
            super(1);
        }

        public final void a(k0.f fVar) {
            C2029m0 c2029m0 = C2029m0.this;
            InterfaceC3586l0 interfaceC3586l0G = fVar.getDrawContext().G();
            Ba.p pVar = c2029m0.drawBlock;
            if (pVar != null) {
                pVar.invoke(interfaceC3586l0G, fVar.getDrawContext().getGraphicsLayer());
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(k0.f fVar) {
            a(fVar);
            return C4153F.f46609a;
        }
    }

    public C2029m0(C3870c c3870c, i0.F0 f02, C2036q c2036q, Ba.p<? super InterfaceC3586l0, ? super C3870c, C4153F> pVar, Ba.a<C4153F> aVar) {
        this.graphicsLayer = c3870c;
        this.context = f02;
        this.ownerView = c2036q;
        this.drawBlock = pVar;
        this.invalidateParentLayer = aVar;
    }

    private final void l(InterfaceC3586l0 canvas) {
        if (this.graphicsLayer.getClip()) {
            i0.N0 n0N = this.graphicsLayer.n();
            if (n0N instanceof N0.b) {
                InterfaceC3586l0.s(canvas, ((N0.b) n0N).b(), 0, 2, null);
                return;
            }
            if (!(n0N instanceof N0.c)) {
                if (n0N instanceof N0.a) {
                    InterfaceC3586l0.e(canvas, ((N0.a) n0N).getPath(), 0, 2, null);
                    return;
                }
                return;
            }
            i0.R0 r0A = this.tmpPath;
            if (r0A == null) {
                r0A = C3561Y.a();
                this.tmpPath = r0A;
            }
            r0A.b();
            i0.R0.c(r0A, ((N0.c) n0N).getRoundRect(), null, 2, null);
            InterfaceC3586l0.e(canvas, r0A, 0, 2, null);
        }
    }

    private final float[] m() {
        float[] fArrN = n();
        float[] fArrC = this.inverseMatrixCache;
        if (fArrC == null) {
            fArrC = i0.L0.c(null, 1, null);
            this.inverseMatrixCache = fArrC;
        }
        if (C2044u0.a(fArrN, fArrC)) {
            return fArrC;
        }
        return null;
    }

    private final float[] n() {
        q();
        return this.matrixCache;
    }

    private final void o(boolean z10) {
        if (z10 != this.isDirty) {
            this.isDirty = z10;
            this.ownerView.y0(this, z10);
        }
    }

    private final void p() {
        x1.f23486a.a(this.ownerView);
    }

    private final void q() {
        C3870c c3870c = this.graphicsLayer;
        long jB = C3477h.d(c3870c.getPivotOffset()) ? C3483n.b(U0.s.d(this.size)) : c3870c.getPivotOffset();
        i0.L0.h(this.matrixCache);
        float[] fArr = this.matrixCache;
        float[] fArrC = i0.L0.c(null, 1, null);
        i0.L0.q(fArrC, -C3476g.m(jB), -C3476g.n(jB), 0.0f, 4, null);
        i0.L0.n(fArr, fArrC);
        float[] fArr2 = this.matrixCache;
        float[] fArrC2 = i0.L0.c(null, 1, null);
        i0.L0.q(fArrC2, c3870c.x(), c3870c.y(), 0.0f, 4, null);
        i0.L0.i(fArrC2, c3870c.p());
        i0.L0.j(fArrC2, c3870c.q());
        i0.L0.k(fArrC2, c3870c.r());
        i0.L0.m(fArrC2, c3870c.s(), c3870c.t(), 0.0f, 4, null);
        i0.L0.n(fArr2, fArrC2);
        float[] fArr3 = this.matrixCache;
        float[] fArrC3 = i0.L0.c(null, 1, null);
        i0.L0.q(fArrC3, C3476g.m(jB), C3476g.n(jB), 0.0f, 4, null);
        i0.L0.n(fArr3, fArrC3);
    }

    private final void r() {
        Ba.a<C4153F> aVar;
        i0.N0 n02 = this.outline;
        if (n02 == null) {
            return;
        }
        C3872e.b(this.graphicsLayer, n02);
        if (!(n02 instanceof N0.a) || Build.VERSION.SDK_INT >= 33 || (aVar = this.invalidateParentLayer) == null) {
            return;
        }
        aVar.invoke();
    }

    @Override // A0.l0
    public void a(InterfaceC3586l0 canvas, C3870c parentLayer) {
        Canvas canvasD = C3545H.d(canvas);
        if (canvasD.isHardwareAccelerated()) {
            j();
            this.drawnWithEnabledZ = this.graphicsLayer.u() > 0.0f;
            k0.d drawContext = this.scope.getDrawContext();
            drawContext.H(canvas);
            drawContext.I(parentLayer);
            C3872e.a(this.scope, this.graphicsLayer);
            return;
        }
        float fH = U0.n.h(this.graphicsLayer.getTopLeft());
        float fI = U0.n.i(this.graphicsLayer.getTopLeft());
        float fG = fH + U0.r.g(this.size);
        float f10 = fI + U0.r.f(this.size);
        if (this.graphicsLayer.i() < 1.0f) {
            i0.P0 p0A = this.softwareLayerPaint;
            if (p0A == null) {
                p0A = C3555S.a();
                this.softwareLayerPaint = p0A;
            }
            p0A.c(this.graphicsLayer.i());
            canvasD.saveLayer(fH, fI, fG, f10, p0A.getInternalPaint());
        } else {
            canvas.h();
        }
        canvas.b(fH, fI);
        canvas.k(n());
        if (this.graphicsLayer.getClip()) {
            l(canvas);
        }
        Ba.p<? super InterfaceC3586l0, ? super C3870c, C4153F> pVar = this.drawBlock;
        if (pVar != null) {
            pVar.invoke(canvas, null);
        }
        canvas.t();
    }

    @Override // A0.l0
    public void b(MutableRect rect, boolean inverse) {
        if (!inverse) {
            i0.L0.g(n(), rect);
            return;
        }
        float[] fArrM = m();
        if (fArrM == null) {
            rect.g(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            i0.L0.g(fArrM, rect);
        }
    }

    @Override // A0.l0
    public void c(Ba.p<? super InterfaceC3586l0, ? super C3870c, C4153F> drawBlock, Ba.a<C4153F> invalidateParentLayer) {
        i0.F0 f02 = this.context;
        if (f02 == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.graphicsLayer.getIsReleased()) {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
        this.graphicsLayer = f02.b();
        this.isDestroyed = false;
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
        this.transformOrigin = androidx.compose.ui.graphics.f.INSTANCE.a();
        this.drawnWithEnabledZ = false;
        this.size = U0.s.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // A0.l0
    public void d() {
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        o(false);
        i0.F0 f02 = this.context;
        if (f02 != null) {
            f02.a(this.graphicsLayer);
            this.ownerView.H0(this);
        }
    }

    @Override // A0.l0
    public boolean e(long position) {
        float fM = C3476g.m(position);
        float fN = C3476g.n(position);
        if (this.graphicsLayer.getClip()) {
            return X0.c(this.graphicsLayer.n(), fM, fN, null, null, 24, null);
        }
        return true;
    }

    @Override // A0.l0
    public void f(androidx.compose.ui.graphics.d scope) {
        boolean z10;
        int iB;
        Ba.a<C4153F> aVar;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        this.layoutDirection = scope.getLayoutDirection();
        this.density = scope.getGraphicsDensity();
        int i10 = mutatedFields & 4096;
        if (i10 != 0) {
            this.transformOrigin = scope.getTransformOrigin();
        }
        if ((mutatedFields & 1) != 0) {
            this.graphicsLayer.X(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.graphicsLayer.Y(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.graphicsLayer.J(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.graphicsLayer.d0(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.graphicsLayer.e0(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.graphicsLayer.Z(scope.getShadowElevation());
            if (scope.getShadowElevation() > 0.0f && !this.drawnWithEnabledZ && (aVar = this.invalidateParentLayer) != null) {
                aVar.invoke();
            }
        }
        if ((mutatedFields & 64) != 0) {
            this.graphicsLayer.K(scope.getAmbientShadowColor());
        }
        if ((mutatedFields & 128) != 0) {
            this.graphicsLayer.b0(scope.getSpotShadowColor());
        }
        if ((mutatedFields & 1024) != 0) {
            this.graphicsLayer.V(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.graphicsLayer.T(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.graphicsLayer.U(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            this.graphicsLayer.L(scope.getCameraDistance());
        }
        if (i10 != 0) {
            if (androidx.compose.ui.graphics.f.e(this.transformOrigin, androidx.compose.ui.graphics.f.INSTANCE.a())) {
                this.graphicsLayer.P(C3476g.INSTANCE.b());
            } else {
                this.graphicsLayer.P(C3477h.a(androidx.compose.ui.graphics.f.f(this.transformOrigin) * U0.r.g(this.size), androidx.compose.ui.graphics.f.g(this.transformOrigin) * U0.r.f(this.size)));
            }
        }
        if ((mutatedFields & 16384) != 0) {
            this.graphicsLayer.M(scope.getClip());
        }
        if ((131072 & mutatedFields) != 0) {
            C3870c c3870c = this.graphicsLayer;
            scope.F();
            c3870c.S(null);
        }
        if ((32768 & mutatedFields) != 0) {
            C3870c c3870c2 = this.graphicsLayer;
            int compositingStrategy = scope.getCompositingStrategy();
            a.Companion companion = androidx.compose.ui.graphics.a.INSTANCE;
            if (androidx.compose.ui.graphics.a.e(compositingStrategy, companion.a())) {
                iB = C3869b.INSTANCE.a();
            } else if (androidx.compose.ui.graphics.a.e(compositingStrategy, companion.c())) {
                iB = C3869b.INSTANCE.c();
            } else {
                if (!androidx.compose.ui.graphics.a.e(compositingStrategy, companion.b())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                iB = C3869b.INSTANCE.b();
            }
            c3870c2.N(iB);
        }
        if (C3862t.b(this.outline, scope.getOutline())) {
            z10 = false;
        } else {
            this.outline = scope.getOutline();
            r();
            z10 = true;
        }
        this.mutatedFields = scope.getMutatedFields();
        if (mutatedFields != 0 || z10) {
            p();
        }
    }

    @Override // A0.l0
    public long g(long point, boolean inverse) {
        if (!inverse) {
            return i0.L0.f(n(), point);
        }
        float[] fArrM = m();
        return fArrM != null ? i0.L0.f(fArrM, point) : C3476g.INSTANCE.a();
    }

    @Override // A0.l0
    public void h(long size) {
        if (U0.r.e(size, this.size)) {
            return;
        }
        this.size = size;
        invalidate();
    }

    @Override // A0.l0
    public void i(long position) {
        this.graphicsLayer.c0(position);
        p();
    }

    @Override // A0.l0
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        o(true);
    }

    @Override // A0.l0
    public void j() {
        if (this.isDirty) {
            if (!androidx.compose.ui.graphics.f.e(this.transformOrigin, androidx.compose.ui.graphics.f.INSTANCE.a()) && !U0.r.e(this.graphicsLayer.getSize(), this.size)) {
                this.graphicsLayer.P(C3477h.a(androidx.compose.ui.graphics.f.f(this.transformOrigin) * U0.r.g(this.size), androidx.compose.ui.graphics.f.g(this.transformOrigin) * U0.r.f(this.size)));
            }
            this.graphicsLayer.E(this.density, this.layoutDirection, this.size, this.recordLambda);
            o(false);
        }
    }
}
