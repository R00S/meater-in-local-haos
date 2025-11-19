package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.graphics.a;
import i0.C3544G;
import i0.C3588m0;
import i0.InterfaceC3586l0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: RenderNodeApi23.android.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b0\b\u0001\u0018\u0000 _2\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ5\u0010$\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00060!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010:\u001a\u0002088\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b9\u0010/R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b;\u0010/\u001a\u0004\b<\u0010=\"\u0004\b>\u0010\u001bR\"\u0010\u0013\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010/\u001a\u0004\b@\u0010=\"\u0004\bA\u0010\u001bR\"\u0010\u0014\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bB\u0010/\u001a\u0004\bC\u0010=\"\u0004\bD\u0010\u001bR\"\u0010\u0015\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010/\u001a\u0004\bF\u0010=\"\u0004\bG\u0010\u001bR*\u0010O\u001a\u00020\u00162\u0006\u0010H\u001a\u00020\u00168\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010=R\u0014\u0010Q\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010=R$\u0010S\u001a\u0004\u0018\u00010R8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bI\u0010WR$\u0010]\u001a\u00020X2\u0006\u0010H\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010`\u001a\u00020X2\u0006\u0010H\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b^\u0010Z\"\u0004\b_\u0010\\R$\u0010c\u001a\u00020X2\u0006\u0010H\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\ba\u0010Z\"\u0004\bb\u0010\\R$\u0010e\u001a\u00020X2\u0006\u0010H\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bd\u0010Z\"\u0004\bE\u0010\\R$\u0010h\u001a\u00020X2\u0006\u0010H\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bf\u0010Z\"\u0004\bg\u0010\\R$\u0010k\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bi\u0010=\"\u0004\bj\u0010\u001bR$\u0010n\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bl\u0010=\"\u0004\bm\u0010\u001bR$\u0010p\u001a\u00020X2\u0006\u0010H\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bo\u0010Z\"\u0004\bB\u0010\\R$\u0010s\u001a\u00020X2\u0006\u0010H\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bq\u0010Z\"\u0004\br\u0010\\R$\u0010u\u001a\u00020X2\u0006\u0010H\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bt\u0010Z\"\u0004\b?\u0010\\R$\u0010x\u001a\u00020X2\u0006\u0010H\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bv\u0010Z\"\u0004\bw\u0010\\R$\u0010{\u001a\u00020X2\u0006\u0010H\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\by\u0010Z\"\u0004\bz\u0010\\R$\u0010~\u001a\u00020X2\u0006\u0010H\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b|\u0010Z\"\u0004\b}\u0010\\R&\u0010\u0081\u0001\u001a\u00020\u00162\u0006\u0010H\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\r\u001a\u0004\b\u007f\u0010L\"\u0005\b\u0080\u0001\u0010NR%\u0010\u0082\u0001\u001a\u00020X2\u0006\u0010H\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b;\u0010Z\"\u0004\b9\u0010\\R-\u0010\u0085\u0001\u001a\u0002082\u0006\u0010H\u001a\u0002088V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b\u0083\u0001\u0010=\"\u0005\b\u0084\u0001\u0010\u001bR\u0016\u0010\u0087\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010L\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0088\u0001"}, d2 = {"Landroidx/compose/ui/platform/B0;", "Landroidx/compose/ui/platform/g0;", "Landroidx/compose/ui/platform/q;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/q;)V", "Loa/F;", "M", "()V", "Landroid/view/RenderNode;", "renderNode", "R", "(Landroid/view/RenderNode;)V", "Landroid/graphics/Outline;", "outline", "B", "(Landroid/graphics/Outline;)V", "", "left", "top", "right", "bottom", "", "x", "(IIII)Z", "offset", "r", "(I)V", "A", "Li0/m0;", "canvasHolder", "Li0/R0;", "clipPath", "Lkotlin/Function1;", "Li0/l0;", "drawBlock", "C", "(Li0/m0;Li0/R0;LBa/l;)V", "Landroid/graphics/Matrix;", "matrix", "K", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/Canvas;", "canvas", "t", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "I", "(Z)Z", "o", "a", "Landroidx/compose/ui/platform/q;", "getOwnerView", "()Landroidx/compose/ui/platform/q;", "b", "Landroid/view/RenderNode;", "Landroidx/compose/ui/graphics/a;", "c", "internalCompositingStrategy", "d", "n", "()I", "O", "e", "E", "Q", "f", "p", "P", "g", "s", "N", "value", "h", "Z", "D", "()Z", "w", "(Z)V", "clipToBounds", "width", "height", "Li0/Z0;", "renderEffect", "Li0/Z0;", "getRenderEffect", "()Li0/Z0;", "(Li0/Z0;)V", "", "getScaleX", "()F", "j", "(F)V", "scaleX", "getScaleY", "i", "scaleY", "getTranslationX", "k", "translationX", "getTranslationY", "translationY", "L", "z", "elevation", "getAmbientShadowColor", "F", "ambientShadowColor", "getSpotShadowColor", "J", "spotShadowColor", "getRotationZ", "rotationZ", "getRotationX", "m", "rotationX", "getRotationY", "rotationY", "getCameraDistance", "l", "cameraDistance", "getPivotX", "u", "pivotX", "getPivotY", "y", "pivotY", "G", "H", "clipToOutline", "alpha", "getCompositingStrategy--NrFUSI", "v", "compositingStrategy", "q", "hasDisplayList", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class B0 implements InterfaceC2017g0 {

    /* renamed from: k, reason: collision with root package name */
    private static boolean f22894k;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C2036q ownerView;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final RenderNode renderNode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int internalCompositingStrategy;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int left;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int top;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int right;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int bottom;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* renamed from: j, reason: collision with root package name */
    public static final int f22893j = 8;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f22895l = true;

    public B0(C2036q c2036q) {
        this.ownerView = c2036q;
        RenderNode renderNodeCreate = RenderNode.create("Compose", c2036q);
        this.renderNode = renderNodeCreate;
        this.internalCompositingStrategy = androidx.compose.ui.graphics.a.INSTANCE.a();
        if (f22895l) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            R(renderNodeCreate);
            M();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f22895l = false;
        }
        if (f22894k) {
            throw new NoClassDefFoundError();
        }
    }

    private final void M() {
        R0.f23001a.a(this.renderNode);
    }

    private final void R(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            S0 s02 = S0.f23002a;
            s02.c(renderNode, s02.a(renderNode));
            s02.d(renderNode, s02.b(renderNode));
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void A(int offset) {
        Q(getTop() + offset);
        N(getBottom() + offset);
        this.renderNode.offsetTopAndBottom(offset);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void B(Outline outline) {
        this.renderNode.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void C(C3588m0 canvasHolder, i0.R0 clipPath, Ba.l<? super InterfaceC3586l0, C4153F> drawBlock) {
        DisplayListCanvas displayListCanvasStart = this.renderNode.start(b(), a());
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().w((Canvas) displayListCanvasStart);
        C3544G androidCanvas = canvasHolder.getAndroidCanvas();
        if (clipPath != null) {
            androidCanvas.h();
            InterfaceC3586l0.e(androidCanvas, clipPath, 0, 2, null);
        }
        drawBlock.invoke(androidCanvas);
        if (clipPath != null) {
            androidCanvas.t();
        }
        canvasHolder.getAndroidCanvas().w(internalCanvas);
        this.renderNode.end(displayListCanvasStart);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    /* renamed from: D, reason: from getter */
    public boolean getClipToBounds() {
        return this.clipToBounds;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    /* renamed from: E, reason: from getter */
    public int getTop() {
        return this.top;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void F(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            S0.f23002a.c(this.renderNode, i10);
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public boolean G() {
        return this.renderNode.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void H(boolean z10) {
        this.renderNode.setClipToOutline(z10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public boolean I(boolean hasOverlappingRendering) {
        return this.renderNode.setHasOverlappingRendering(hasOverlappingRendering);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void J(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            S0.f23002a.d(this.renderNode, i10);
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void K(Matrix matrix) {
        this.renderNode.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public float L() {
        return this.renderNode.getElevation();
    }

    public void N(int i10) {
        this.bottom = i10;
    }

    public void O(int i10) {
        this.left = i10;
    }

    public void P(int i10) {
        this.right = i10;
    }

    public void Q(int i10) {
        this.top = i10;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public int a() {
        return getBottom() - getTop();
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public int b() {
        return getRight() - getLeft();
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void c(float f10) {
        this.renderNode.setAlpha(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public float d() {
        return this.renderNode.getAlpha();
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void e(float f10) {
        this.renderNode.setRotationY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void f(float f10) {
        this.renderNode.setRotation(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void g(float f10) {
        this.renderNode.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void i(float f10) {
        this.renderNode.setScaleY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void j(float f10) {
        this.renderNode.setScaleX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void k(float f10) {
        this.renderNode.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void l(float f10) {
        this.renderNode.setCameraDistance(-f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void m(float f10) {
        this.renderNode.setRotationX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    /* renamed from: n, reason: from getter */
    public int getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void o() {
        M();
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    /* renamed from: p, reason: from getter */
    public int getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public boolean q() {
        return this.renderNode.isValid();
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void r(int offset) {
        O(getLeft() + offset);
        P(getRight() + offset);
        this.renderNode.offsetLeftAndRight(offset);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    /* renamed from: s, reason: from getter */
    public int getBottom() {
        return this.bottom;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void t(Canvas canvas) {
        C3862t.e(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void u(float f10) {
        this.renderNode.setPivotX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void v(int i10) {
        a.Companion companion = androidx.compose.ui.graphics.a.INSTANCE;
        if (androidx.compose.ui.graphics.a.e(i10, companion.c())) {
            this.renderNode.setLayerType(2);
            this.renderNode.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.a.e(i10, companion.b())) {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(false);
        } else {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i10;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void w(boolean z10) {
        this.clipToBounds = z10;
        this.renderNode.setClipToBounds(z10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public boolean x(int left, int top, int right, int bottom) {
        O(left);
        Q(top);
        P(right);
        N(bottom);
        return this.renderNode.setLeftTopRightBottom(left, top, right, bottom);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void y(float f10) {
        this.renderNode.setPivotY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void z(float f10) {
        this.renderNode.setElevation(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void h(i0.Z0 z02) {
    }
}
