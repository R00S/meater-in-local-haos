package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.a;
import i0.C3544G;
import i0.C3588m0;
import i0.InterfaceC3586l0;
import kotlin.Metadata;
import oa.C4153F;
import w.C4965j;

/* compiled from: RenderNodeApi29.android.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J5\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00107\u001a\u0002058\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u0010)R\u0014\u0010\f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010\r\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00109R\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u0014\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u00109R\u0014\u0010=\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00109R\u0014\u0010>\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u00109R$\u0010E\u001a\u00020?2\u0006\u0010@\u001a\u00020?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010H\u001a\u00020?2\u0006\u0010@\u001a\u00020?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR$\u0010K\u001a\u00020?2\u0006\u0010@\u001a\u00020?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR$\u0010N\u001a\u00020?2\u0006\u0010@\u001a\u00020?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bL\u0010B\"\u0004\bM\u0010DR$\u0010Q\u001a\u00020?2\u0006\u0010@\u001a\u00020?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bO\u0010B\"\u0004\bP\u0010DR$\u0010T\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bR\u00109\"\u0004\bS\u0010\u0015R$\u0010W\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bU\u00109\"\u0004\bV\u0010\u0015R$\u0010Z\u001a\u00020?2\u0006\u0010@\u001a\u00020?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bX\u0010B\"\u0004\bY\u0010DR$\u0010]\u001a\u00020?2\u0006\u0010@\u001a\u00020?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b[\u0010B\"\u0004\b\\\u0010DR$\u0010`\u001a\u00020?2\u0006\u0010@\u001a\u00020?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b^\u0010B\"\u0004\b_\u0010DR$\u0010c\u001a\u00020?2\u0006\u0010@\u001a\u00020?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\ba\u0010B\"\u0004\bb\u0010DR$\u0010f\u001a\u00020?2\u0006\u0010@\u001a\u00020?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bd\u0010B\"\u0004\be\u0010DR$\u0010i\u001a\u00020?2\u0006\u0010@\u001a\u00020?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bg\u0010B\"\u0004\bh\u0010DR$\u0010n\u001a\u00020\u00102\u0006\u0010@\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010q\u001a\u00020\u00102\u0006\u0010@\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bo\u0010k\"\u0004\bp\u0010mR$\u0010s\u001a\u00020?2\u0006\u0010@\u001a\u00020?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\br\u0010B\"\u0004\b6\u0010DR(\u0010y\u001a\u0004\u0018\u00010t2\b\u0010@\u001a\u0004\u0018\u00010t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR*\u0010|\u001a\u0002052\u0006\u0010@\u001a\u0002058V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bz\u00109\"\u0004\b{\u0010\u0015R\u0014\u0010~\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010k\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u007f"}, d2 = {"Landroidx/compose/ui/platform/O0;", "Landroidx/compose/ui/platform/g0;", "Landroidx/compose/ui/platform/q;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/q;)V", "Landroid/graphics/Outline;", "outline", "Loa/F;", "B", "(Landroid/graphics/Outline;)V", "", "left", "top", "right", "bottom", "", "x", "(IIII)Z", "offset", "r", "(I)V", "A", "Li0/m0;", "canvasHolder", "Li0/R0;", "clipPath", "Lkotlin/Function1;", "Li0/l0;", "drawBlock", "C", "(Li0/m0;Li0/R0;LBa/l;)V", "Landroid/graphics/Matrix;", "matrix", "K", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/Canvas;", "canvas", "t", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "I", "(Z)Z", "o", "()V", "a", "Landroidx/compose/ui/platform/q;", "getOwnerView", "()Landroidx/compose/ui/platform/q;", "Landroid/graphics/RenderNode;", "b", "Landroid/graphics/RenderNode;", "renderNode", "Landroidx/compose/ui/graphics/a;", "c", "internalCompositingStrategy", "n", "()I", "E", "p", "s", "width", "height", "", "value", "getScaleX", "()F", "j", "(F)V", "scaleX", "getScaleY", "i", "scaleY", "getTranslationX", "k", "translationX", "getTranslationY", "g", "translationY", "L", "z", "elevation", "getAmbientShadowColor", "F", "ambientShadowColor", "getSpotShadowColor", "J", "spotShadowColor", "getRotationZ", "f", "rotationZ", "getRotationX", "m", "rotationX", "getRotationY", "e", "rotationY", "getCameraDistance", "l", "cameraDistance", "getPivotX", "u", "pivotX", "getPivotY", "y", "pivotY", "G", "()Z", "H", "(Z)V", "clipToOutline", "D", "w", "clipToBounds", "d", "alpha", "Li0/Z0;", "getRenderEffect", "()Li0/Z0;", "h", "(Li0/Z0;)V", "renderEffect", "getCompositingStrategy--NrFUSI", "v", "compositingStrategy", "q", "hasDisplayList", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O0 implements InterfaceC2017g0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C2036q ownerView;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final RenderNode renderNode = C4965j.a("Compose");

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int internalCompositingStrategy = androidx.compose.ui.graphics.a.INSTANCE.a();

    public O0(C2036q c2036q) {
        this.ownerView = c2036q;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void A(int offset) {
        this.renderNode.offsetTopAndBottom(offset);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void B(Outline outline) {
        this.renderNode.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void C(C3588m0 canvasHolder, i0.R0 clipPath, Ba.l<? super InterfaceC3586l0, C4153F> drawBlock) {
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().w(recordingCanvasBeginRecording);
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
        this.renderNode.endRecording();
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    /* renamed from: D */
    public boolean getClipToBounds() {
        return this.renderNode.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    /* renamed from: E */
    public int getTop() {
        return this.renderNode.getTop();
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void F(int i10) {
        this.renderNode.setAmbientShadowColor(i10);
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
        this.renderNode.setSpotShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void K(Matrix matrix) {
        this.renderNode.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public float L() {
        return this.renderNode.getElevation();
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public int a() {
        return this.renderNode.getHeight();
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public int b() {
        return this.renderNode.getWidth();
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
        this.renderNode.setRotationZ(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void g(float f10) {
        this.renderNode.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void h(i0.Z0 z02) {
        if (Build.VERSION.SDK_INT >= 31) {
            P0.f22965a.a(this.renderNode, z02);
        }
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
        this.renderNode.setCameraDistance(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void m(float f10) {
        this.renderNode.setRotationX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    /* renamed from: n */
    public int getLeft() {
        return this.renderNode.getLeft();
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void o() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    /* renamed from: p */
    public int getRight() {
        return this.renderNode.getRight();
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public boolean q() {
        return this.renderNode.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void r(int offset) {
        this.renderNode.offsetLeftAndRight(offset);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    /* renamed from: s */
    public int getBottom() {
        return this.renderNode.getBottom();
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void t(Canvas canvas) {
        canvas.drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void u(float f10) {
        this.renderNode.setPivotX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void v(int i10) {
        RenderNode renderNode = this.renderNode;
        a.Companion companion = androidx.compose.ui.graphics.a.INSTANCE;
        if (androidx.compose.ui.graphics.a.e(i10, companion.c())) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.a.e(i10, companion.b())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i10;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void w(boolean z10) {
        this.renderNode.setClipToBounds(z10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public boolean x(int left, int top, int right, int bottom) {
        return this.renderNode.setPosition(left, top, right, bottom);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void y(float f10) {
        this.renderNode.setPivotY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2017g0
    public void z(float f10) {
        this.renderNode.setElevation(f10);
    }
}
