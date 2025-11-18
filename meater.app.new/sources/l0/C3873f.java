package l0;

import U0.r;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import h0.C3476g;
import h0.C3477h;
import i0.C3544G;
import i0.C3545H;
import i0.C3566b0;
import i0.C3588m0;
import i0.C3602t0;
import i0.C3604u0;
import i0.C3606v0;
import i0.InterfaceC3586l0;
import i0.Z0;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.C3781a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import l0.C3869b;
import oa.C4153F;

/* compiled from: GraphicsLayerV23.android.kt */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 02\u00020\u0001:\u0001]B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010 \u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J$\u0010%\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J;\u00100\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000e0-H\u0016¢\u0006\u0004\b0\u00101J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b\u001c\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u0010\u0015J\u000f\u00109\u001a\u00020\u000eH\u0000¢\u0006\u0004\b9\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bD\u0010;R\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010K\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010N\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001c\u0010$\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bO\u0010;R0\u0010\r\u001a\u00020\f2\u0006\u0010P\u001a\u00020\f8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010\u0010R0\u0010Y\u001a\u00020V2\u0006\u0010P\u001a\u00020V8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bW\u0010R\u001a\u0004\b:\u0010T\"\u0004\bX\u0010\u0010R.\u0010a\u001a\u0004\u0018\u00010Z2\b\u0010P\u001a\u0004\u0018\u00010Z8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R*\u0010f\u001a\u00020b2\u0006\u0010P\u001a\u00020b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bc\u00100\u001a\u0004\b@\u0010d\"\u0004\b>\u0010eR\u0016\u0010g\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010MR0\u0010m\u001a\u00020h2\u0006\u0010P\u001a\u00020h8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bi\u0010;\u001a\u0004\bj\u0010=\"\u0004\bk\u0010lR*\u0010o\u001a\u00020b2\u0006\u0010P\u001a\u00020b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bn\u00100\u001a\u0004\bc\u0010d\"\u0004\bO\u0010eR*\u0010r\u001a\u00020b2\u0006\u0010P\u001a\u00020b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bp\u00100\u001a\u0004\bq\u0010d\"\u0004\bL\u0010eR*\u0010u\u001a\u00020b2\u0006\u0010P\u001a\u00020b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bs\u00100\u001a\u0004\bt\u0010d\"\u0004\bQ\u0010eR*\u0010w\u001a\u00020b2\u0006\u0010P\u001a\u00020b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b%\u00100\u001a\u0004\bv\u0010d\"\u0004\bF\u0010eR*\u0010y\u001a\u00020b2\u0006\u0010P\u001a\u00020b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bS\u00100\u001a\u0004\bx\u0010d\"\u0004\bi\u0010eR0\u0010}\u001a\u00020z2\u0006\u0010P\u001a\u00020z8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b \u0010;\u001a\u0004\b{\u0010=\"\u0004\b|\u0010lR0\u0010\u007f\u001a\u00020z2\u0006\u0010P\u001a\u00020z8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b~\u0010;\u001a\u0004\b;\u0010=\"\u0004\bR\u0010lR,\u0010\u0081\u0001\u001a\u00020b2\u0006\u0010P\u001a\u00020b8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b\u001c\u00100\u001a\u0005\b\u0080\u0001\u0010d\"\u0004\b[\u0010eR+\u0010\u0082\u0001\u001a\u00020b2\u0006\u0010P\u001a\u00020b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u00100\u001a\u0004\b~\u0010d\"\u0004\bB\u0010eR+\u0010\u0083\u0001\u001a\u00020b2\u0006\u0010P\u001a\u00020b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bk\u00100\u001a\u0004\b\u001d\u0010d\"\u0004\bD\u0010eR,\u0010\u0085\u0001\u001a\u00020b2\u0006\u0010P\u001a\u00020b8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\bv\u00100\u001a\u0005\b\u0084\u0001\u0010d\"\u0004\bW\u0010eR.\u0010\u0089\u0001\u001a\u00020\u00112\u0006\u0010P\u001a\u00020\u00118\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0004\b|\u0010M\u001a\u0005\b\u0086\u0001\u0010\u0013\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u008a\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010MR\u0018\u0010\u008b\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010MR%\u0010\u008c\u0001\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0014\n\u0004\bt\u0010M\u001a\u0005\b\u008c\u0001\u0010\u0013\"\u0005\bp\u0010\u0088\u0001R*\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0005\bs\u0010\u0090\u0001\"\u0005\bI\u0010\u0091\u0001R\u0015\u0010\u0092\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0093\u0001"}, d2 = {"Ll0/f;", "Ll0/d;", "Landroid/view/View;", "ownerView", "", "ownerId", "Li0/m0;", "canvasHolder", "Lk0/a;", "canvasDrawScope", "<init>", "(Landroid/view/View;JLi0/m0;Lk0/a;)V", "Ll0/b;", "compositingStrategy", "Loa/F;", "P", "(I)V", "", "S", "()Z", "T", "()V", "O", "Landroid/view/RenderNode;", "renderNode", "U", "(Landroid/view/RenderNode;)V", "", "x", "y", "LU0/r;", "size", "v", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "t", "(Landroid/graphics/Outline;J)V", "LU0/d;", "density", "LU0/t;", "layoutDirection", "Ll0/c;", "layer", "Lkotlin/Function1;", "Lk0/f;", "block", "F", "(LU0/d;LU0/t;Ll0/c;LBa/l;)V", "Li0/l0;", "canvas", "(Li0/l0;)V", "Landroid/graphics/Matrix;", "M", "()Landroid/graphics/Matrix;", "o", "Q", "b", "J", "getOwnerId", "()J", "c", "Li0/m0;", "d", "Lk0/a;", "e", "Landroid/view/RenderNode;", "f", "Landroid/graphics/Paint;", "g", "Landroid/graphics/Paint;", "layerPaint", "h", "Landroid/graphics/Matrix;", "matrix", "i", "Z", "outlineIsProvided", "j", "value", "k", "I", "u", "()I", "L", "Li0/b0;", "l", "setBlendMode-s9anfk8", "blendMode", "Li0/u0;", "m", "Li0/u0;", "a", "()Li0/u0;", "setColorFilter", "(Li0/u0;)V", "colorFilter", "", "n", "()F", "(F)V", "alpha", "shouldManuallySetCenterPivot", "Lh0/g;", "p", "getPivotOffset-F1C5BW0", "z", "(J)V", "pivotOffset", "q", "scaleX", "r", "K", "scaleY", "s", "E", "translationX", "A", "translationY", "N", "shadowElevation", "Li0/t0;", "C", "B", "ambientShadowColor", "w", "spotShadowColor", "H", "rotationX", "rotationY", "rotationZ", "D", "cameraDistance", "R", "G", "(Z)V", "clip", "clipToBounds", "clipToOutline", "isInvalidated", "Li0/Z0;", "renderEffect", "Li0/Z0;", "()Li0/Z0;", "(Li0/Z0;)V", "hasDisplayList", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3873f implements InterfaceC3871d {

    /* renamed from: G, reason: collision with root package name */
    private static boolean f44310G;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private boolean clip;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean clipToOutline;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
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
    private long outlineSize;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int compositingStrategy;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int blendMode;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private C3604u0 colorFilter;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean shouldManuallySetCenterPivot;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long pivotOffset;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private float shadowElevation;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long ambientShadowColor;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private long spotShadowColor;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* renamed from: H, reason: collision with root package name */
    private static final AtomicBoolean f44311H = new AtomicBoolean(true);

    public C3873f(View view, long j10, C3588m0 c3588m0, C3781a c3781a) {
        this.ownerId = j10;
        this.canvasHolder = c3588m0;
        this.canvasDrawScope = c3781a;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view);
        this.renderNode = renderNodeCreate;
        r.Companion companion = U0.r.INSTANCE;
        this.size = companion.a();
        this.outlineSize = companion.a();
        if (f44311H.getAndSet(false)) {
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
            U(renderNodeCreate);
            Q();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        if (f44310G) {
            throw new NoClassDefFoundError();
        }
        renderNodeCreate.setClipToBounds(false);
        C3869b.Companion companion2 = C3869b.INSTANCE;
        P(companion2.a());
        this.compositingStrategy = companion2.a();
        this.blendMode = C3566b0.INSTANCE.B();
        this.alpha = 1.0f;
        this.pivotOffset = C3476g.INSTANCE.b();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        C3602t0.Companion companion3 = C3602t0.INSTANCE;
        this.ambientShadowColor = companion3.a();
        this.spotShadowColor = companion3.a();
        this.cameraDistance = 8.0f;
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

    private final void P(int compositingStrategy) {
        RenderNode renderNode = this.renderNode;
        C3869b.Companion companion = C3869b.INSTANCE;
        if (C3869b.e(compositingStrategy, companion.c())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (C3869b.e(compositingStrategy, companion.b())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final boolean S() {
        return (!C3869b.e(getCompositingStrategy(), C3869b.INSTANCE.c()) && C3566b0.E(getBlendMode(), C3566b0.INSTANCE.B()) && getColorFilter() == null) ? false : true;
    }

    private final void T() {
        if (S()) {
            P(C3869b.INSTANCE.c());
        } else {
            P(getCompositingStrategy());
        }
    }

    private final void U(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            P p10 = P.f44252a;
            p10.c(renderNode, p10.a(renderNode));
            p10.d(renderNode, p10.b(renderNode));
        }
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: A, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // l0.InterfaceC3871d
    public void B(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.ambientShadowColor = j10;
            P.f44252a.c(this.renderNode, C3606v0.j(j10));
        }
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
        Canvas canvasStart = this.renderNode.start(Math.max(U0.r.g(this.size), U0.r.g(this.outlineSize)), Math.max(U0.r.f(this.size), U0.r.f(this.outlineSize)));
        try {
            C3588m0 c3588m0 = this.canvasHolder;
            Canvas internalCanvas = c3588m0.getAndroidCanvas().getInternalCanvas();
            c3588m0.getAndroidCanvas().w(canvasStart);
            C3544G androidCanvas = c3588m0.getAndroidCanvas();
            C3781a c3781a = this.canvasDrawScope;
            long jD = U0.s.d(this.size);
            U0.d density2 = c3781a.getDrawContext().getDensity();
            U0.t layoutDirection2 = c3781a.getDrawContext().getLayoutDirection();
            InterfaceC3586l0 interfaceC3586l0G = c3781a.getDrawContext().G();
            long jC = c3781a.getDrawContext().C();
            C3870c graphicsLayer = c3781a.getDrawContext().getGraphicsLayer();
            k0.d drawContext = c3781a.getDrawContext();
            drawContext.c(density);
            drawContext.b(layoutDirection);
            drawContext.H(androidCanvas);
            drawContext.E(jD);
            drawContext.I(layer);
            androidCanvas.h();
            try {
                block.invoke(c3781a);
                androidCanvas.t();
                k0.d drawContext2 = c3781a.getDrawContext();
                drawContext2.c(density2);
                drawContext2.b(layoutDirection2);
                drawContext2.H(interfaceC3586l0G);
                drawContext2.E(jC);
                drawContext2.I(graphicsLayer);
                c3588m0.getAndroidCanvas().w(internalCanvas);
                this.renderNode.end(canvasStart);
                r(false);
            } catch (Throwable th) {
                androidCanvas.t();
                k0.d drawContext3 = c3781a.getDrawContext();
                drawContext3.c(density2);
                drawContext3.b(layoutDirection2);
                drawContext3.H(interfaceC3586l0G);
                drawContext3.E(jC);
                drawContext3.I(graphicsLayer);
                throw th;
            }
        } catch (Throwable th2) {
            this.renderNode.end(canvasStart);
            throw th2;
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
        if (Build.VERSION.SDK_INT >= 28) {
            this.spotShadowColor = j10;
            P.f44252a.d(this.renderNode, C3606v0.j(j10));
        }
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

    public final void Q() {
        O.f44251a.a(this.renderNode);
    }

    /* renamed from: R, reason: from getter */
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
        this.renderNode.setRotation(f10);
    }

    @Override // l0.InterfaceC3871d
    public void g(float f10) {
        this.translationY = f10;
        this.renderNode.setTranslationY(f10);
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
        this.renderNode.setCameraDistance(-f10);
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
        Q();
    }

    @Override // l0.InterfaceC3871d
    public void p(float f10) {
        this.shadowElevation = f10;
        this.renderNode.setElevation(f10);
    }

    @Override // l0.InterfaceC3871d
    public boolean q() {
        return this.renderNode.isValid();
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
        this.outlineSize = outlineSize;
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
        this.renderNode.setLeftTopRightBottom(x10, y10, U0.r.g(size) + x10, U0.r.f(size) + y10);
        if (U0.r.e(this.size, size)) {
            return;
        }
        if (this.shouldManuallySetCenterPivot) {
            this.renderNode.setPivotX(U0.r.g(size) / 2.0f);
            this.renderNode.setPivotY(U0.r.f(size) / 2.0f);
        }
        this.size = size;
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: w, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // l0.InterfaceC3871d
    public void x(InterfaceC3586l0 canvas) {
        DisplayListCanvas displayListCanvasD = C3545H.d(canvas);
        C3862t.e(displayListCanvasD, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasD.drawRenderNode(this.renderNode);
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
            this.shouldManuallySetCenterPivot = true;
            this.renderNode.setPivotX(U0.r.g(this.size) / 2.0f);
            this.renderNode.setPivotY(U0.r.f(this.size) / 2.0f);
        } else {
            this.shouldManuallySetCenterPivot = false;
            this.renderNode.setPivotX(C3476g.m(j10));
            this.renderNode.setPivotY(C3476g.n(j10));
        }
    }

    @Override // l0.InterfaceC3871d
    public void h(Z0 z02) {
    }

    public /* synthetic */ C3873f(View view, long j10, C3588m0 c3588m0, C3781a c3781a, int i10, C3854k c3854k) {
        this(view, j10, (i10 & 4) != 0 ? new C3588m0() : c3588m0, (i10 & 8) != 0 ? new C3781a() : c3781a);
    }
}
