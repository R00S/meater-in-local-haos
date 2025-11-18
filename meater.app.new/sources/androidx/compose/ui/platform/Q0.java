package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import h0.C3476g;
import h0.MutableRect;
import i0.C3545H;
import i0.C3555S;
import i0.C3588m0;
import i0.C3606v0;
import i0.InterfaceC3586l0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import l0.C3870c;
import oa.C4153F;

/* compiled from: RenderNodeLayer.android.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0001.B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010\u000fJ!\u0010$\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u000fJ\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\u000fJ\"\u0010*\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020\u0019H\u0016¢\u0006\u0004\b.\u0010/J9\u00100\u001a\u00020\b2\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016¢\u0006\u0004\b0\u00101R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R,\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R$\u0010?\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u00198\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010<R\u0016\u0010G\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010<R\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020M0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001c\u0010W\u001a\u00020U8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bV\u0010NR\u0014\u0010Z\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010]\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010I\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006_"}, d2 = {"Landroidx/compose/ui/platform/Q0;", "LA0/l0;", "", "Landroidx/compose/ui/platform/q;", "ownerView", "Lkotlin/Function2;", "Li0/l0;", "Ll0/c;", "Loa/F;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/q;LBa/p;LBa/a;)V", "m", "()V", "canvas", "k", "(Li0/l0;)V", "Landroidx/compose/ui/graphics/d;", "scope", "f", "(Landroidx/compose/ui/graphics/d;)V", "Lh0/g;", "position", "", "e", "(J)Z", "LU0/r;", "size", "h", "(J)V", "LU0/n;", "i", "invalidate", "parentLayer", "a", "(Li0/l0;Ll0/c;)V", "j", "d", "point", "inverse", "g", "(JZ)J", "Lh0/e;", "rect", "b", "(Lh0/e;Z)V", "c", "(LBa/p;LBa/a;)V", "B", "Landroidx/compose/ui/platform/q;", "getOwnerView", "()Landroidx/compose/ui/platform/q;", "C", "LBa/p;", "D", "LBa/a;", "value", "E", "Z", "l", "(Z)V", "isDirty", "Landroidx/compose/ui/platform/A0;", "F", "Landroidx/compose/ui/platform/A0;", "outlineResolver", "G", "isDestroyed", "H", "drawnWithZ", "Li0/P0;", "I", "Li0/P0;", "softwareLayerPaint", "Landroidx/compose/ui/platform/w0;", "Landroidx/compose/ui/platform/g0;", "J", "Landroidx/compose/ui/platform/w0;", "matrixCache", "Li0/m0;", "K", "Li0/m0;", "canvasHolder", "Landroidx/compose/ui/graphics/f;", "L", "transformOrigin", "M", "Landroidx/compose/ui/platform/g0;", "renderNode", "", "N", "mutatedFields", "O", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Q0 implements A0.l0 {

    /* renamed from: P, reason: collision with root package name */
    public static final int f22984P = 8;

    /* renamed from: Q, reason: collision with root package name */
    private static final Ba.p<InterfaceC2017g0, Matrix, C4153F> f22985Q = a.f22999B;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final C2036q ownerView;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private Ba.p<? super InterfaceC3586l0, ? super C3870c, C4153F> drawBlock;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Ba.a<C4153F> invalidateParentLayer;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private boolean isDestroyed;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private boolean drawnWithZ;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private i0.P0 softwareLayerPaint;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2017g0 renderNode;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final A0 outlineResolver = new A0();

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final C2048w0<InterfaceC2017g0> matrixCache = new C2048w0<>(f22985Q);

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final C3588m0 canvasHolder = new C3588m0();

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin = androidx.compose.ui.graphics.f.INSTANCE.a();

    /* compiled from: RenderNodeLayer.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/platform/g0;", "rn", "Landroid/graphics/Matrix;", "matrix", "Loa/F;", "a", "(Landroidx/compose/ui/platform/g0;Landroid/graphics/Matrix;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.p<InterfaceC2017g0, Matrix, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f22999B = new a();

        a() {
            super(2);
        }

        public final void a(InterfaceC2017g0 interfaceC2017g0, Matrix matrix) {
            interfaceC2017g0.K(matrix);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC2017g0 interfaceC2017g0, Matrix matrix) {
            a(interfaceC2017g0, matrix);
            return C4153F.f46609a;
        }
    }

    /* compiled from: RenderNodeLayer.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/l0;", "it", "Loa/F;", "a", "(Li0/l0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.l<InterfaceC3586l0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.p<InterfaceC3586l0, C3870c, C4153F> f23000B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Ba.p<? super InterfaceC3586l0, ? super C3870c, C4153F> pVar) {
            super(1);
            this.f23000B = pVar;
        }

        public final void a(InterfaceC3586l0 interfaceC3586l0) {
            this.f23000B.invoke(interfaceC3586l0, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC3586l0 interfaceC3586l0) {
            a(interfaceC3586l0);
            return C4153F.f46609a;
        }
    }

    public Q0(C2036q c2036q, Ba.p<? super InterfaceC3586l0, ? super C3870c, C4153F> pVar, Ba.a<C4153F> aVar) {
        this.ownerView = c2036q;
        this.drawBlock = pVar;
        this.invalidateParentLayer = aVar;
        InterfaceC2017g0 o02 = Build.VERSION.SDK_INT >= 29 ? new O0(c2036q) : new B0(c2036q);
        o02.I(true);
        o02.w(false);
        this.renderNode = o02;
    }

    private final void k(InterfaceC3586l0 canvas) {
        if (this.renderNode.G() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.a(canvas);
        }
    }

    private final void l(boolean z10) {
        if (z10 != this.isDirty) {
            this.isDirty = z10;
            this.ownerView.y0(this, z10);
        }
    }

    private final void m() {
        x1.f23486a.a(this.ownerView);
    }

    @Override // A0.l0
    public void a(InterfaceC3586l0 canvas, C3870c parentLayer) {
        Canvas canvasD = C3545H.d(canvas);
        if (canvasD.isHardwareAccelerated()) {
            j();
            boolean z10 = this.renderNode.L() > 0.0f;
            this.drawnWithZ = z10;
            if (z10) {
                canvas.u();
            }
            this.renderNode.t(canvasD);
            if (this.drawnWithZ) {
                canvas.j();
                return;
            }
            return;
        }
        float fN = this.renderNode.getLeft();
        float fE = this.renderNode.getTop();
        float fP = this.renderNode.getRight();
        float fS = this.renderNode.getBottom();
        if (this.renderNode.d() < 1.0f) {
            i0.P0 p0A = this.softwareLayerPaint;
            if (p0A == null) {
                p0A = C3555S.a();
                this.softwareLayerPaint = p0A;
            }
            p0A.c(this.renderNode.d());
            canvasD.saveLayer(fN, fE, fP, fS, p0A.getInternalPaint());
        } else {
            canvas.h();
        }
        canvas.b(fN, fE);
        canvas.k(this.matrixCache.b(this.renderNode));
        k(canvas);
        Ba.p<? super InterfaceC3586l0, ? super C3870c, C4153F> pVar = this.drawBlock;
        if (pVar != null) {
            pVar.invoke(canvas, null);
        }
        canvas.t();
        l(false);
    }

    @Override // A0.l0
    public void b(MutableRect rect, boolean inverse) {
        if (!inverse) {
            i0.L0.g(this.matrixCache.b(this.renderNode), rect);
            return;
        }
        float[] fArrA = this.matrixCache.a(this.renderNode);
        if (fArrA == null) {
            rect.g(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            i0.L0.g(fArrA, rect);
        }
    }

    @Override // A0.l0
    public void c(Ba.p<? super InterfaceC3586l0, ? super C3870c, C4153F> drawBlock, Ba.a<C4153F> invalidateParentLayer) {
        l(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = androidx.compose.ui.graphics.f.INSTANCE.a();
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
    }

    @Override // A0.l0
    public void d() {
        if (this.renderNode.q()) {
            this.renderNode.o();
        }
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        l(false);
        this.ownerView.J0();
        this.ownerView.H0(this);
    }

    @Override // A0.l0
    public boolean e(long position) {
        float fM = C3476g.m(position);
        float fN = C3476g.n(position);
        if (this.renderNode.getClipToBounds()) {
            return 0.0f <= fM && fM < ((float) this.renderNode.b()) && 0.0f <= fN && fN < ((float) this.renderNode.a());
        }
        if (this.renderNode.G()) {
            return this.outlineResolver.f(position);
        }
        return true;
    }

    @Override // A0.l0
    public void f(androidx.compose.ui.graphics.d scope) {
        Ba.a<C4153F> aVar;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        int i10 = mutatedFields & 4096;
        if (i10 != 0) {
            this.transformOrigin = scope.getTransformOrigin();
        }
        boolean z10 = false;
        boolean z11 = this.renderNode.G() && !this.outlineResolver.e();
        if ((mutatedFields & 1) != 0) {
            this.renderNode.j(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.renderNode.i(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.renderNode.c(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.renderNode.k(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.renderNode.g(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.renderNode.z(scope.getShadowElevation());
        }
        if ((mutatedFields & 64) != 0) {
            this.renderNode.F(C3606v0.j(scope.getAmbientShadowColor()));
        }
        if ((mutatedFields & 128) != 0) {
            this.renderNode.J(C3606v0.j(scope.getSpotShadowColor()));
        }
        if ((mutatedFields & 1024) != 0) {
            this.renderNode.f(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.renderNode.m(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.renderNode.e(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            this.renderNode.l(scope.getCameraDistance());
        }
        if (i10 != 0) {
            this.renderNode.u(androidx.compose.ui.graphics.f.f(this.transformOrigin) * this.renderNode.b());
            this.renderNode.y(androidx.compose.ui.graphics.f.g(this.transformOrigin) * this.renderNode.a());
        }
        boolean z12 = scope.getClip() && scope.getShape() != i0.Y0.a();
        if ((mutatedFields & 24576) != 0) {
            this.renderNode.H(z12);
            this.renderNode.w(scope.getClip() && scope.getShape() == i0.Y0.a());
        }
        if ((131072 & mutatedFields) != 0) {
            InterfaceC2017g0 interfaceC2017g0 = this.renderNode;
            scope.F();
            interfaceC2017g0.h(null);
        }
        if ((32768 & mutatedFields) != 0) {
            this.renderNode.v(scope.getCompositingStrategy());
        }
        boolean zH = this.outlineResolver.h(scope.getOutline(), scope.getAlpha(), z12, scope.getShadowElevation(), scope.getSize());
        if (this.outlineResolver.getCacheIsDirty()) {
            this.renderNode.B(this.outlineResolver.b());
        }
        if (z12 && !this.outlineResolver.e()) {
            z10 = true;
        }
        if (z11 != z10 || (z10 && zH)) {
            invalidate();
        } else {
            m();
        }
        if (!this.drawnWithZ && this.renderNode.L() > 0.0f && (aVar = this.invalidateParentLayer) != null) {
            aVar.invoke();
        }
        if ((mutatedFields & 7963) != 0) {
            this.matrixCache.c();
        }
        this.mutatedFields = scope.getMutatedFields();
    }

    @Override // A0.l0
    public long g(long point, boolean inverse) {
        if (!inverse) {
            return i0.L0.f(this.matrixCache.b(this.renderNode), point);
        }
        float[] fArrA = this.matrixCache.a(this.renderNode);
        return fArrA != null ? i0.L0.f(fArrA, point) : C3476g.INSTANCE.a();
    }

    @Override // A0.l0
    public void h(long size) {
        int iG = U0.r.g(size);
        int iF = U0.r.f(size);
        this.renderNode.u(androidx.compose.ui.graphics.f.f(this.transformOrigin) * iG);
        this.renderNode.y(androidx.compose.ui.graphics.f.g(this.transformOrigin) * iF);
        InterfaceC2017g0 interfaceC2017g0 = this.renderNode;
        if (interfaceC2017g0.x(interfaceC2017g0.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + iG, this.renderNode.getTop() + iF)) {
            this.renderNode.B(this.outlineResolver.b());
            invalidate();
            this.matrixCache.c();
        }
    }

    @Override // A0.l0
    public void i(long position) {
        int iN = this.renderNode.getLeft();
        int iE = this.renderNode.getTop();
        int iH = U0.n.h(position);
        int i10 = U0.n.i(position);
        if (iN == iH && iE == i10) {
            return;
        }
        if (iN != iH) {
            this.renderNode.r(iH - iN);
        }
        if (iE != i10) {
            this.renderNode.A(i10 - iE);
        }
        m();
        this.matrixCache.c();
    }

    @Override // A0.l0
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        l(true);
    }

    @Override // A0.l0
    public void j() {
        if (this.isDirty || !this.renderNode.q()) {
            i0.R0 r0D = (!this.renderNode.G() || this.outlineResolver.e()) ? null : this.outlineResolver.d();
            Ba.p<? super InterfaceC3586l0, ? super C3870c, C4153F> pVar = this.drawBlock;
            if (pVar != null) {
                this.renderNode.C(this.canvasHolder, r0D, new c(pVar));
            }
            l(false);
        }
    }
}
