package l0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import h0.C3476g;
import h0.C3477h;
import h0.C3482m;
import i0.C3544G;
import i0.C3545H;
import i0.C3566b0;
import i0.C3588m0;
import i0.C3602t0;
import i0.C3604u0;
import i0.C3606v0;
import i0.InterfaceC3586l0;
import i0.Z0;
import k0.C3781a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import l0.C3869b;
import oa.C4153F;
import w.C4965j;

/* compiled from: GraphicsLayerV29.android.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\n*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J*\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010!\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J;\u0010,\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\n0)H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b\u0018\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010\u001b\u001a\u00020@8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bA\u00106R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR*\u0010Q\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010,\u001a\u0004\b;\u0010O\"\u0004\b9\u0010PR0\u0010X\u001a\u00020R2\u0006\u0010M\u001a\u00020R8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\b5\u0010U\"\u0004\bV\u0010WR.\u0010`\u001a\u0004\u0018\u00010Y2\b\u0010M\u001a\u0004\u0018\u00010Y8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R0\u0010f\u001a\u00020a2\u0006\u0010M\u001a\u00020a8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bb\u00106\u001a\u0004\bc\u00108\"\u0004\bd\u0010eR*\u0010h\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bg\u0010,\u001a\u0004\bg\u0010O\"\u0004\bN\u0010PR*\u0010j\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b4\u0010,\u001a\u0004\bi\u0010O\"\u0004\bI\u0010PR*\u0010m\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bk\u0010,\u001a\u0004\bl\u0010O\"\u0004\bS\u0010PR*\u0010p\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bn\u0010,\u001a\u0004\bo\u0010O\"\u0004\bC\u0010PR*\u0010s\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bq\u0010,\u001a\u0004\br\u0010O\"\u0004\bk\u0010PR0\u0010x\u001a\u00020t2\u0006\u0010M\u001a\u00020t8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bu\u00106\u001a\u0004\bv\u00108\"\u0004\bw\u0010eR0\u0010y\u001a\u00020t2\u0006\u0010M\u001a\u00020t8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u00106\u001a\u0004\b6\u00108\"\u0004\bT\u0010eR*\u0010|\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bz\u0010,\u001a\u0004\b{\u0010O\"\u0004\bb\u0010PR*\u0010~\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010,\u001a\u0004\b}\u0010O\"\u0004\b=\u0010PR*\u0010\u007f\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b}\u0010,\u001a\u0004\b\u0019\u0010O\"\u0004\bA\u0010PR,\u0010\u0081\u0001\u001a\u00020L2\u0006\u0010M\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b\u0018\u0010,\u001a\u0005\b\u0080\u0001\u0010O\"\u0004\bZ\u0010PR.\u0010\u0085\u0001\u001a\u00020\u00132\u0006\u0010M\u001a\u00020\u00138\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0004\b\u0019\u0010J\u001a\u0005\b\u0082\u0001\u0010\u0015\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0086\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010JR\u0017\u0010\u0087\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010JR1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u000e8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0013\n\u0004\bw\u0010T\u001a\u0004\bz\u0010U\"\u0005\b\u0088\u0001\u0010WR%\u0010\u0089\u0001\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0014\n\u0004\bv\u0010J\u001a\u0005\b\u0089\u0001\u0010\u0015\"\u0005\bq\u0010\u0084\u0001R5\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00012\t\u0010M\u001a\u0005\u0018\u00010\u008a\u00018\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0005\bu\u0010\u008d\u0001\"\u0005\bF\u0010\u008e\u0001R\u0015\u0010\u008f\u0001\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0090\u0001"}, d2 = {"Ll0/D;", "Ll0/d;", "", "ownerId", "Li0/m0;", "canvasHolder", "Lk0/a;", "canvasDrawScope", "<init>", "(JLi0/m0;Lk0/a;)V", "Loa/F;", "O", "()V", "Landroid/graphics/RenderNode;", "Ll0/b;", "compositingStrategy", "P", "(Landroid/graphics/RenderNode;I)V", "T", "", "R", "()Z", "S", "", "x", "y", "LU0/r;", "size", "v", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "t", "(Landroid/graphics/Outline;J)V", "LU0/d;", "density", "LU0/t;", "layoutDirection", "Ll0/c;", "layer", "Lkotlin/Function1;", "Lk0/f;", "block", "F", "(LU0/d;LU0/t;Ll0/c;LBa/l;)V", "Li0/l0;", "canvas", "(Li0/l0;)V", "Landroid/graphics/Matrix;", "M", "()Landroid/graphics/Matrix;", "o", "b", "J", "getOwnerId", "()J", "c", "Li0/m0;", "d", "Lk0/a;", "e", "Landroid/graphics/RenderNode;", "renderNode", "Lh0/m;", "f", "Landroid/graphics/Paint;", "g", "Landroid/graphics/Paint;", "layerPaint", "h", "Landroid/graphics/Matrix;", "matrix", "i", "Z", "outlineIsProvided", "", "value", "j", "()F", "(F)V", "alpha", "Li0/b0;", "k", "I", "()I", "setBlendMode-s9anfk8", "(I)V", "blendMode", "Li0/u0;", "l", "Li0/u0;", "a", "()Li0/u0;", "setColorFilter", "(Li0/u0;)V", "colorFilter", "Lh0/g;", "m", "getPivotOffset-F1C5BW0", "z", "(J)V", "pivotOffset", "n", "scaleX", "K", "scaleY", "p", "E", "translationX", "q", "A", "translationY", "r", "N", "shadowElevation", "Li0/t0;", "s", "C", "B", "ambientShadowColor", "spotShadowColor", "u", "H", "rotationX", "w", "rotationY", "rotationZ", "D", "cameraDistance", "Q", "G", "(Z)V", "clip", "clipToBounds", "clipToOutline", "L", "isInvalidated", "Li0/Z0;", "renderEffect", "Li0/Z0;", "()Li0/Z0;", "(Li0/Z0;)V", "hasDisplayList", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D implements InterfaceC3871d {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private boolean clipToOutline;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private int compositingStrategy;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidated;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long ownerId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C3588m0 canvasHolder;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C3781a canvasDrawScope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final RenderNode renderNode;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Paint layerPaint;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Matrix matrix;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean outlineIsProvided;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int blendMode;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private C3604u0 colorFilter;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long pivotOffset;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float shadowElevation;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long ambientShadowColor;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long spotShadowColor;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean clip;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    public D(long j10, C3588m0 c3588m0, C3781a c3781a) {
        this.ownerId = j10;
        this.canvasHolder = c3588m0;
        this.canvasDrawScope = c3781a;
        RenderNode renderNodeA = C4965j.a("graphicsLayer");
        this.renderNode = renderNodeA;
        this.size = C3482m.INSTANCE.b();
        renderNodeA.setClipToBounds(false);
        C3869b.Companion companion = C3869b.INSTANCE;
        P(renderNodeA, companion.a());
        this.alpha = 1.0f;
        this.blendMode = C3566b0.INSTANCE.B();
        this.pivotOffset = C3476g.INSTANCE.b();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        C3602t0.Companion companion2 = C3602t0.INSTANCE;
        this.ambientShadowColor = companion2.a();
        this.spotShadowColor = companion2.a();
        this.cameraDistance = 8.0f;
        this.compositingStrategy = companion.a();
        this.isInvalidated = true;
    }

    private final void O() {
        boolean z10 = false;
        boolean z11 = getClip() && !this.outlineIsProvided;
        if (getClip() && this.outlineIsProvided) {
            z10 = true;
        }
        if (z11 != this.clipToBounds) {
            this.clipToBounds = z11;
            this.renderNode.setClipToBounds(z11);
        }
        if (z10 != this.clipToOutline) {
            this.clipToOutline = z10;
            this.renderNode.setClipToOutline(z10);
        }
    }

    private final void P(RenderNode renderNode, int i10) {
        C3869b.Companion companion = C3869b.INSTANCE;
        if (C3869b.e(i10, companion.c())) {
            renderNode.setUseCompositingLayer(true, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (C3869b.e(i10, companion.b())) {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final boolean R() {
        if (C3869b.e(getCompositingStrategy(), C3869b.INSTANCE.c()) || S()) {
            return true;
        }
        s();
        return false;
    }

    private final boolean S() {
        return (C3566b0.E(getBlendMode(), C3566b0.INSTANCE.B()) && getColorFilter() == null) ? false : true;
    }

    private final void T() {
        if (R()) {
            P(this.renderNode, C3869b.INSTANCE.c());
        } else {
            P(this.renderNode, getCompositingStrategy());
        }
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: A, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // l0.InterfaceC3871d
    public void B(long j10) {
        this.ambientShadowColor = j10;
        this.renderNode.setAmbientShadowColor(C3606v0.j(j10));
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: C, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: D, reason: from getter */
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: E, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // l0.InterfaceC3871d
    public void F(U0.d density, U0.t layoutDirection, C3870c layer, Ba.l<? super k0.f, C4153F> block) {
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        try {
            C3588m0 c3588m0 = this.canvasHolder;
            Canvas internalCanvas = c3588m0.getAndroidCanvas().getInternalCanvas();
            c3588m0.getAndroidCanvas().w(recordingCanvasBeginRecording);
            C3544G androidCanvas = c3588m0.getAndroidCanvas();
            k0.d drawContext = this.canvasDrawScope.getDrawContext();
            drawContext.c(density);
            drawContext.b(layoutDirection);
            drawContext.I(layer);
            drawContext.E(this.size);
            drawContext.H(androidCanvas);
            block.invoke(this.canvasDrawScope);
            c3588m0.getAndroidCanvas().w(internalCanvas);
            this.renderNode.endRecording();
            r(false);
        } catch (Throwable th) {
            this.renderNode.endRecording();
            throw th;
        }
    }

    @Override // l0.InterfaceC3871d
    public void G(boolean z10) {
        this.clip = z10;
        O();
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: H, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // l0.InterfaceC3871d
    public void I(long j10) {
        this.spotShadowColor = j10;
        this.renderNode.setSpotShadowColor(C3606v0.j(j10));
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: J, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: K, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // l0.InterfaceC3871d
    public void L(int i10) {
        this.compositingStrategy = i10;
        T();
    }

    @Override // l0.InterfaceC3871d
    public Matrix M() {
        Matrix matrix = this.matrix;
        if (matrix == null) {
            matrix = new Matrix();
            this.matrix = matrix;
        }
        this.renderNode.getMatrix(matrix);
        return matrix;
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: N, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    /* renamed from: Q, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: a, reason: from getter */
    public C3604u0 getColorFilter() {
        return this.colorFilter;
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: b, reason: from getter */
    public int getBlendMode() {
        return this.blendMode;
    }

    @Override // l0.InterfaceC3871d
    public void c(float f10) {
        this.alpha = f10;
        this.renderNode.setAlpha(f10);
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: d, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // l0.InterfaceC3871d
    public void e(float f10) {
        this.rotationY = f10;
        this.renderNode.setRotationY(f10);
    }

    @Override // l0.InterfaceC3871d
    public void f(float f10) {
        this.rotationZ = f10;
        this.renderNode.setRotationZ(f10);
    }

    @Override // l0.InterfaceC3871d
    public void g(float f10) {
        this.translationY = f10;
        this.renderNode.setTranslationY(f10);
    }

    @Override // l0.InterfaceC3871d
    public void h(Z0 z02) {
        if (Build.VERSION.SDK_INT >= 31) {
            Q.f44253a.a(this.renderNode, z02);
        }
    }

    @Override // l0.InterfaceC3871d
    public void i(float f10) {
        this.scaleY = f10;
        this.renderNode.setScaleY(f10);
    }

    @Override // l0.InterfaceC3871d
    public void j(float f10) {
        this.scaleX = f10;
        this.renderNode.setScaleX(f10);
    }

    @Override // l0.InterfaceC3871d
    public void k(float f10) {
        this.translationX = f10;
        this.renderNode.setTranslationX(f10);
    }

    @Override // l0.InterfaceC3871d
    public void l(float f10) {
        this.cameraDistance = f10;
        this.renderNode.setCameraDistance(f10);
    }

    @Override // l0.InterfaceC3871d
    public void m(float f10) {
        this.rotationX = f10;
        this.renderNode.setRotationX(f10);
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: n, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // l0.InterfaceC3871d
    public void o() {
        this.renderNode.discardDisplayList();
    }

    @Override // l0.InterfaceC3871d
    public void p(float f10) {
        this.shadowElevation = f10;
        this.renderNode.setElevation(f10);
    }

    @Override // l0.InterfaceC3871d
    public boolean q() {
        return this.renderNode.hasDisplayList();
    }

    @Override // l0.InterfaceC3871d
    public void r(boolean z10) {
        this.isInvalidated = z10;
    }

    @Override // l0.InterfaceC3871d
    public Z0 s() {
        return null;
    }

    @Override // l0.InterfaceC3871d
    public void t(Outline outline, long outlineSize) {
        this.renderNode.setOutline(outline);
        this.outlineIsProvided = outline != null;
        O();
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: u, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // l0.InterfaceC3871d
    public void v(int x10, int y10, long size) {
        this.renderNode.setPosition(x10, y10, U0.r.g(size) + x10, U0.r.f(size) + y10);
        this.size = U0.s.d(size);
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: w, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // l0.InterfaceC3871d
    public void x(InterfaceC3586l0 canvas) {
        C3545H.d(canvas).drawRenderNode(this.renderNode);
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: y, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // l0.InterfaceC3871d
    public void z(long j10) {
        this.pivotOffset = j10;
        if (C3477h.d(j10)) {
            this.renderNode.resetPivot();
        } else {
            this.renderNode.setPivotX(C3476g.m(j10));
            this.renderNode.setPivotY(C3476g.n(j10));
        }
    }

    public /* synthetic */ D(long j10, C3588m0 c3588m0, C3781a c3781a, int i10, C3854k c3854k) {
        this(j10, (i10 & 2) != 0 ? new C3588m0() : c3588m0, (i10 & 4) != 0 ? new C3781a() : c3781a);
    }
}
