package l0;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import h0.C3471b;
import h0.C3476g;
import h0.C3478i;
import h0.C3481l;
import h0.C3482m;
import i0.C3545H;
import i0.C3555S;
import i0.C3556T;
import i0.C3561Y;
import i0.C3566b0;
import i0.C3600s0;
import i0.C3602t0;
import i0.C3604u0;
import i0.InterfaceC3586l0;
import i0.N0;
import i0.P0;
import i0.R0;
import i0.Z0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: AndroidGraphicsLayer.android.kt */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0098\u00012\u00020\u0001:\u0001AB\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u0010J\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010\u0010J\u000f\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010\u0010J<\u0010/\u001a\u00020\f2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\f0,ø\u0001\u0000¢\u0006\u0004\b/\u00100J!\u00104\u001a\u00020\f2\u0006\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\fH\u0000¢\u0006\u0004\b6\u0010\u0010J\u000f\u00107\u001a\u00020\fH\u0000¢\u0006\u0004\b7\u0010\u0010J\u0015\u00108\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b8\u00109J.\u0010>\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020:2\b\b\u0002\u0010\u000b\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020<ø\u0001\u0000¢\u0006\u0004\b>\u0010?J$\u0010@\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020:2\b\b\u0002\u0010\u000b\u001a\u00020;ø\u0001\u0000¢\u0006\u0004\b@\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010J\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\f0,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010IR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\f0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010LR\u0016\u0010P\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010OR\u001c\u0010R\u001a\u00020:8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u0010QR\u001c\u0010T\u001a\u00020;8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bS\u0010QR\u0016\u0010V\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010\u000fR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010_\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010\\R\u0016\u0010a\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010OR\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010h\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010'R\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR$\u0010q\u001a\u00020N2\u0006\u0010m\u001a\u00020N8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bn\u0010O\u001a\u0004\bo\u0010pR0\u0010\t\u001a\u00020\b2\u0006\u0010r\u001a\u00020\b8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bs\u0010Q\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR0\u0010\u000b\u001a\u00020\n2\u0006\u0010r\u001a\u00020\n8\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bx\u0010Q\u001a\u0004\by\u0010u\"\u0004\bz\u0010wR0\u0010}\u001a\u00020:2\u0006\u0010r\u001a\u00020:8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b{\u0010Q\u001a\u0004\bc\u0010u\"\u0004\b|\u0010wR2\u0010\u0081\u0001\u001a\u00020N2\u0006\u0010r\u001a\u00020N8F@FX\u0086\u000e¢\u0006\u0019\n\u0004\by\u0010O\u0012\u0005\b\u0080\u0001\u0010\u0010\u001a\u0004\bX\u0010p\"\u0004\b~\u0010\u007fR\u001a\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bt\u0010\u0082\u0001R0\u0010\u0088\u0001\u001a\u00030\u0084\u00012\u0007\u0010r\u001a\u00030\u0084\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\u001a\u0005\b^\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R'\u0010\u008b\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bS\u0010\u0089\u0001\"\u0005\bQ\u0010\u008a\u0001R0\u0010\u008e\u0001\u001a\u00030\u008c\u00012\u0007\u0010r\u001a\u00030\u008c\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\u001a\u0005\bU\u0010\u0085\u0001\"\u0006\b\u008d\u0001\u0010\u0087\u0001R.\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008f\u00012\t\u0010r\u001a\u0005\u0018\u00010\u008f\u00018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b[\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R(\u0010\u0095\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bs\u0010\u0089\u0001\"\u0006\b\u0094\u0001\u0010\u008a\u0001R(\u0010\u0097\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bx\u0010\u0089\u0001\"\u0006\b\u0096\u0001\u0010\u008a\u0001R)\u0010\u009a\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0098\u0001\u0010\u0089\u0001\"\u0006\b\u0099\u0001\u0010\u008a\u0001R)\u0010\u009d\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009b\u0001\u0010\u0089\u0001\"\u0006\b\u009c\u0001\u0010\u008a\u0001R'\u0010\u009e\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b{\u0010\u0089\u0001\"\u0005\bO\u0010\u008a\u0001R(\u0010 \u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bg\u0010\u0089\u0001\"\u0006\b\u009f\u0001\u0010\u008a\u0001R(\u0010¢\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bj\u0010\u0089\u0001\"\u0006\b¡\u0001\u0010\u008a\u0001R(\u0010¤\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bn\u0010\u0089\u0001\"\u0006\b£\u0001\u0010\u008a\u0001R)\u0010§\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¥\u0001\u0010\u0089\u0001\"\u0006\b¦\u0001\u0010\u008a\u0001R/\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¨\u00012\t\u0010r\u001a\u0005\u0018\u00010¨\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R\u0013\u0010¯\u0001\u001a\u00020W8F¢\u0006\u0007\u001a\u0005\b`\u0010®\u0001R/\u0010³\u0001\u001a\u00030°\u00012\u0007\u0010r\u001a\u00030°\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b±\u0001\u0010u\"\u0005\b²\u0001\u0010wR/\u0010¶\u0001\u001a\u00030°\u00012\u0007\u0010r\u001a\u00030°\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b´\u0001\u0010u\"\u0005\bµ\u0001\u0010w\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006·\u0001"}, d2 = {"Ll0/c;", "", "Ll0/d;", "impl", "Ll0/F;", "layerManager", "<init>", "(Ll0/d;Ll0/F;)V", "LU0/n;", "topLeft", "LU0/r;", "size", "Loa/F;", "Q", "(JJ)V", "F", "()V", "graphicsLayer", "d", "(Ll0/c;)V", "Landroid/graphics/Canvas;", "androidCanvas", "f0", "(Landroid/graphics/Canvas;)V", "G", "C", "D", "Landroid/graphics/RectF;", "B", "()Landroid/graphics/RectF;", "e", "Li0/R0;", "path", "Landroid/graphics/Outline;", "g0", "(Li0/R0;)Landroid/graphics/Outline;", "A", "()Landroid/graphics/Outline;", "f", "I", "LU0/d;", "density", "LU0/t;", "layoutDirection", "Lkotlin/Function1;", "Lk0/f;", "block", "E", "(LU0/d;LU0/t;JLBa/l;)V", "Li0/l0;", "canvas", "parentLayer", "h", "(Li0/l0;Ll0/c;)V", "H", "g", "O", "(Li0/R0;)V", "Lh0/g;", "Lh0/m;", "", "cornerRadius", "W", "(JJF)V", "R", "a", "Ll0/d;", "getImpl$ui_graphics_release", "()Ll0/d;", "b", "LU0/d;", "c", "LU0/t;", "LBa/l;", "drawBlock", "clipDrawBlock", "Landroid/graphics/Outline;", "androidOutline", "", "Z", "outlineDirty", "J", "roundRectOutlineTopLeft", "i", "roundRectOutlineSize", "j", "roundRectCornerRadius", "Li0/N0;", "k", "Li0/N0;", "internalOutline", "l", "Li0/R0;", "outlinePath", "m", "roundRectClipPath", "n", "usePathForClip", "Li0/P0;", "o", "Li0/P0;", "softwareLayerPaint", "", "p", "parentLayerUsages", "Ll0/a;", "q", "Ll0/a;", "childDependenciesTracker", "<set-?>", "r", "z", "()Z", "isReleased", "value", "s", "w", "()J", "c0", "(J)V", "t", "v", "a0", "u", "P", "pivotOffset", "M", "(Z)V", "getClip$annotations", "clip", "Landroid/graphics/RectF;", "pathBounds", "Ll0/b;", "()I", "N", "(I)V", "compositingStrategy", "()F", "(F)V", "alpha", "Li0/b0;", "setBlendMode-s9anfk8", "blendMode", "Li0/u0;", "()Li0/u0;", "setColorFilter", "(Li0/u0;)V", "colorFilter", "X", "scaleX", "Y", "scaleY", "x", "d0", "translationX", "y", "e0", "translationY", "shadowElevation", "T", "rotationX", "U", "rotationY", "V", "rotationZ", "getCameraDistance", "L", "cameraDistance", "Li0/Z0;", "getRenderEffect", "()Li0/Z0;", "S", "(Li0/Z0;)V", "renderEffect", "()Li0/N0;", "outline", "Li0/t0;", "getAmbientShadowColor-0d7_KjU", "K", "ambientShadowColor", "getSpotShadowColor-0d7_KjU", "b0", "spotShadowColor", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3870c {

    /* renamed from: y, reason: collision with root package name */
    private static final G f44279y;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3871d impl;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Outline androidOutline;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long roundRectOutlineTopLeft;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long roundRectOutlineSize;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float roundRectCornerRadius;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private N0 internalOutline;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private R0 outlinePath;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private R0 roundRectClipPath;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean usePathForClip;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private P0 softwareLayerPaint;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int parentLayerUsages;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final C3868a childDependenciesTracker;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isReleased;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long topLeft;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private long pivotOffset;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean clip;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private RectF pathBounds;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private U0.d density = k0.e.a();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private U0.t layoutDirection = U0.t.Ltr;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super k0.f, C4153F> drawBlock = C0586c.f44304B;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<k0.f, C4153F> clipDrawBlock = new b();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean outlineDirty = true;

    /* compiled from: AndroidGraphicsLayer.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk0/f;", "Loa/F;", "a", "(Lk0/f;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: l0.c$b */
    static final class b extends AbstractC3864v implements Ba.l<k0.f, C4153F> {
        b() {
            super(1);
        }

        public final void a(k0.f fVar) {
            R0 r02 = C3870c.this.outlinePath;
            if (!C3870c.this.usePathForClip || !C3870c.this.getClip() || r02 == null) {
                C3870c.this.drawBlock.invoke(fVar);
                return;
            }
            Ba.l lVar = C3870c.this.drawBlock;
            int iB = C3600s0.INSTANCE.b();
            k0.d drawContext = fVar.getDrawContext();
            long jC = drawContext.C();
            drawContext.G().h();
            try {
                drawContext.getTransform().c(r02, iB);
                lVar.invoke(fVar);
            } finally {
                drawContext.G().t();
                drawContext.E(jC);
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(k0.f fVar) {
            a(fVar);
            return C4153F.f46609a;
        }
    }

    static {
        f44279y = F.INSTANCE.a() ? H.f44246a : Build.VERSION.SDK_INT >= 28 ? J.f44248a : S.f44254a.a() ? I.f44247a : H.f44246a;
    }

    public C3870c(InterfaceC3871d interfaceC3871d, F f10) {
        this.impl = interfaceC3871d;
        C3476g.Companion companion = C3476g.INSTANCE;
        this.roundRectOutlineTopLeft = companion.c();
        this.roundRectOutlineSize = C3482m.INSTANCE.a();
        this.childDependenciesTracker = new C3868a();
        interfaceC3871d.G(false);
        this.topLeft = U0.n.INSTANCE.a();
        this.size = U0.r.INSTANCE.a();
        this.pivotOffset = companion.b();
    }

    private final Outline A() {
        Outline outline = this.androidOutline;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.androidOutline = outline2;
        return outline2;
    }

    private final RectF B() {
        RectF rectF = this.pathBounds;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.pathBounds = rectF2;
        return rectF2;
    }

    private final void C() {
        this.parentLayerUsages++;
    }

    private final void D() {
        this.parentLayerUsages--;
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void F() {
        /*
            r15 = this;
            l0.a r0 = r15.childDependenciesTracker
            l0.c r1 = l0.C3868a.b(r0)
            l0.C3868a.g(r0, r1)
            s.K r1 = l0.C3868a.a(r0)
            if (r1 == 0) goto L28
            boolean r2 = r1.e()
            if (r2 == 0) goto L28
            s.K r2 = l0.C3868a.c(r0)
            if (r2 != 0) goto L22
            s.K r2 = s.W.a()
            l0.C3868a.f(r0, r2)
        L22:
            r2.j(r1)
            r1.m()
        L28:
            r1 = 1
            l0.C3868a.h(r0, r1)
            l0.d r1 = r15.impl
            U0.d r2 = r15.density
            U0.t r3 = r15.layoutDirection
            Ba.l<k0.f, oa.F> r4 = r15.clipDrawBlock
            r1.F(r2, r3, r15, r4)
            r1 = 0
            l0.C3868a.h(r0, r1)
            l0.c r2 = l0.C3868a.d(r0)
            if (r2 == 0) goto L44
            r2.D()
        L44:
            s.K r0 = l0.C3868a.c(r0)
            if (r0 == 0) goto L97
            boolean r2 = r0.e()
            if (r2 == 0) goto L97
            java.lang.Object[] r2 = r0.elements
            long[] r3 = r0.metadata
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L94
            r5 = r1
        L5a:
            r6 = r3[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8f
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L74:
            if (r10 >= r8) goto L8d
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L89
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            l0.c r11 = (l0.C3870c) r11
            r11.D()
        L89:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L74
        L8d:
            if (r8 != r9) goto L94
        L8f:
            if (r5 == r4) goto L94
            int r5 = r5 + 1
            goto L5a
        L94:
            r0.m()
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C3870c.F():void");
    }

    private final void G() {
        if (this.impl.q()) {
            return;
        }
        try {
            F();
        } catch (Throwable unused) {
        }
    }

    private final void I() {
        this.internalOutline = null;
        this.outlinePath = null;
        this.roundRectOutlineSize = C3482m.INSTANCE.a();
        this.roundRectOutlineTopLeft = C3476g.INSTANCE.c();
        this.roundRectCornerRadius = 0.0f;
        this.outlineDirty = true;
        this.usePathForClip = false;
    }

    private final void Q(long topLeft, long size) {
        this.impl.v(U0.n.h(topLeft), U0.n.i(topLeft), size);
    }

    private final void a0(long j10) {
        if (U0.r.e(this.size, j10)) {
            return;
        }
        this.size = j10;
        Q(this.topLeft, j10);
        if (this.roundRectOutlineSize == 9205357640488583168L) {
            this.outlineDirty = true;
            e();
        }
    }

    private final void d(C3870c graphicsLayer) {
        if (this.childDependenciesTracker.i(graphicsLayer)) {
            graphicsLayer.C();
        }
    }

    private final void e() {
        if (this.outlineDirty) {
            Outline outline = null;
            if (this.clip || u() > 0.0f) {
                R0 r02 = this.outlinePath;
                if (r02 != null) {
                    RectF rectFB = B();
                    if (!(r02 instanceof C3556T)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((C3556T) r02).getInternalPath().computeBounds(rectFB, false);
                    Outline outlineG0 = g0(r02);
                    if (outlineG0 != null) {
                        outlineG0.setAlpha(i());
                        outline = outlineG0;
                    }
                    this.impl.t(outline, U0.s.a(Math.round(rectFB.width()), Math.round(rectFB.height())));
                    if (this.usePathForClip && this.clip) {
                        this.impl.G(false);
                        this.impl.o();
                    } else {
                        this.impl.G(this.clip);
                    }
                } else {
                    this.impl.G(this.clip);
                    C3482m.INSTANCE.b();
                    Outline outlineA = A();
                    long jD = U0.s.d(this.size);
                    long j10 = this.roundRectOutlineTopLeft;
                    long j11 = this.roundRectOutlineSize;
                    long j12 = j11 == 9205357640488583168L ? jD : j11;
                    outlineA.setRoundRect(Math.round(C3476g.m(j10)), Math.round(C3476g.n(j10)), Math.round(C3476g.m(j10) + C3482m.i(j12)), Math.round(C3476g.n(j10) + C3482m.g(j12)), this.roundRectCornerRadius);
                    outlineA.setAlpha(i());
                    this.impl.t(outlineA, U0.s.c(j12));
                }
            } else {
                this.impl.G(false);
                this.impl.t(null, U0.r.INSTANCE.a());
            }
        }
        this.outlineDirty = false;
    }

    private final void f() {
        if (this.isReleased && this.parentLayerUsages == 0) {
            g();
        }
    }

    private final void f0(Canvas androidCanvas) {
        float fH = U0.n.h(this.topLeft);
        float fI = U0.n.i(this.topLeft);
        float fH2 = U0.n.h(this.topLeft) + U0.r.g(this.size);
        float fI2 = U0.n.i(this.topLeft) + U0.r.f(this.size);
        float fI3 = i();
        C3604u0 c3604u0L = l();
        int iJ = j();
        if (fI3 < 1.0f || !C3566b0.E(iJ, C3566b0.INSTANCE.B()) || c3604u0L != null || C3869b.e(m(), C3869b.INSTANCE.c())) {
            P0 p0A = this.softwareLayerPaint;
            if (p0A == null) {
                p0A = C3555S.a();
                this.softwareLayerPaint = p0A;
            }
            p0A.c(fI3);
            p0A.i(iJ);
            p0A.g(c3604u0L);
            androidCanvas.saveLayer(fH, fI, fH2, fI2, p0A.getInternalPaint());
        } else {
            androidCanvas.save();
        }
        androidCanvas.translate(fH, fI);
        androidCanvas.concat(this.impl.M());
    }

    private final Outline g0(R0 path) {
        Outline outline;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 28 || path.f()) {
            Outline outlineA = A();
            if (i10 >= 30) {
                M.f44250a.a(outlineA, path);
            } else {
                if (!(path instanceof C3556T)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outlineA.setConvexPath(((C3556T) path).getInternalPath());
            }
            this.usePathForClip = !outlineA.canClip();
            outline = outlineA;
        } else {
            Outline outline2 = this.androidOutline;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.usePathForClip = true;
            this.impl.r(true);
            outline = null;
        }
        this.outlinePath = path;
        return outline;
    }

    public final void E(U0.d density, U0.t layoutDirection, long size, Ba.l<? super k0.f, C4153F> block) {
        a0(size);
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = block;
        this.impl.r(true);
        F();
    }

    public final void H() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        f();
    }

    public final void J(float f10) {
        if (this.impl.getAlpha() == f10) {
            return;
        }
        this.impl.c(f10);
    }

    public final void K(long j10) {
        if (C3602t0.m(j10, this.impl.getAmbientShadowColor())) {
            return;
        }
        this.impl.B(j10);
    }

    public final void L(float f10) {
        if (this.impl.getCameraDistance() == f10) {
            return;
        }
        this.impl.l(f10);
    }

    public final void M(boolean z10) {
        if (this.clip != z10) {
            this.clip = z10;
            this.outlineDirty = true;
            e();
        }
    }

    public final void N(int i10) {
        if (C3869b.e(this.impl.getCompositingStrategy(), i10)) {
            return;
        }
        this.impl.L(i10);
    }

    public final void O(R0 path) {
        I();
        this.outlinePath = path;
        e();
    }

    public final void P(long j10) {
        if (C3476g.j(this.pivotOffset, j10)) {
            return;
        }
        this.pivotOffset = j10;
        this.impl.z(j10);
    }

    public final void R(long topLeft, long size) {
        W(topLeft, size, 0.0f);
    }

    public final void S(Z0 z02) {
        this.impl.s();
        if (C3862t.b(null, z02)) {
            return;
        }
        this.impl.h(z02);
    }

    public final void T(float f10) {
        if (this.impl.getRotationX() == f10) {
            return;
        }
        this.impl.m(f10);
    }

    public final void U(float f10) {
        if (this.impl.getRotationY() == f10) {
            return;
        }
        this.impl.e(f10);
    }

    public final void V(float f10) {
        if (this.impl.getRotationZ() == f10) {
            return;
        }
        this.impl.f(f10);
    }

    public final void W(long topLeft, long size, float cornerRadius) {
        if (C3476g.j(this.roundRectOutlineTopLeft, topLeft) && C3482m.f(this.roundRectOutlineSize, size) && this.roundRectCornerRadius == cornerRadius && this.outlinePath == null) {
            return;
        }
        I();
        this.roundRectOutlineTopLeft = topLeft;
        this.roundRectOutlineSize = size;
        this.roundRectCornerRadius = cornerRadius;
        e();
    }

    public final void X(float f10) {
        if (this.impl.getScaleX() == f10) {
            return;
        }
        this.impl.j(f10);
    }

    public final void Y(float f10) {
        if (this.impl.getScaleY() == f10) {
            return;
        }
        this.impl.i(f10);
    }

    public final void Z(float f10) {
        if (this.impl.getShadowElevation() == f10) {
            return;
        }
        this.impl.p(f10);
        this.outlineDirty = true;
        e();
    }

    public final void b0(long j10) {
        if (C3602t0.m(j10, this.impl.getSpotShadowColor())) {
            return;
        }
        this.impl.I(j10);
    }

    public final void c0(long j10) {
        if (U0.n.g(this.topLeft, j10)) {
            return;
        }
        this.topLeft = j10;
        Q(j10, this.size);
    }

    public final void d0(float f10) {
        if (this.impl.getTranslationX() == f10) {
            return;
        }
        this.impl.k(f10);
    }

    public final void e0(float f10) {
        if (this.impl.getTranslationY() == f10) {
            return;
        }
        this.impl.g(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r15 = this;
            l0.a r0 = r15.childDependenciesTracker
            l0.c r1 = l0.C3868a.b(r0)
            if (r1 == 0) goto Lf
            r1.D()
            r1 = 0
            l0.C3868a.e(r0, r1)
        Lf:
            s.K r0 = l0.C3868a.a(r0)
            if (r0 == 0) goto L5d
            java.lang.Object[] r1 = r0.elements
            long[] r2 = r0.metadata
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5a
            r4 = 0
            r5 = r4
        L20:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L55
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L3a:
            if (r10 >= r8) goto L53
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4f
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            l0.c r11 = (l0.C3870c) r11
            r11.D()
        L4f:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L3a
        L53:
            if (r8 != r9) goto L5a
        L55:
            if (r5 == r3) goto L5a
            int r5 = r5 + 1
            goto L20
        L5a:
            r0.m()
        L5d:
            l0.d r0 = r15.impl
            r0.o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C3870c.g():void");
    }

    public final void h(InterfaceC3586l0 canvas, C3870c parentLayer) {
        if (this.isReleased) {
            return;
        }
        e();
        G();
        boolean z10 = u() > 0.0f;
        if (z10) {
            canvas.u();
        }
        Canvas canvasD = C3545H.d(canvas);
        boolean zIsHardwareAccelerated = canvasD.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            canvasD.save();
            f0(canvasD);
        }
        boolean z11 = !zIsHardwareAccelerated && this.clip;
        if (z11) {
            canvas.h();
            N0 n0N = n();
            if (n0N instanceof N0.b) {
                InterfaceC3586l0.s(canvas, n0N.getRect(), 0, 2, null);
            } else if (n0N instanceof N0.c) {
                R0 r0A = this.roundRectClipPath;
                if (r0A != null) {
                    r0A.r();
                } else {
                    r0A = C3561Y.a();
                    this.roundRectClipPath = r0A;
                }
                R0.c(r0A, ((N0.c) n0N).getRoundRect(), null, 2, null);
                InterfaceC3586l0.e(canvas, r0A, 0, 2, null);
            } else if (n0N instanceof N0.a) {
                InterfaceC3586l0.e(canvas, ((N0.a) n0N).getPath(), 0, 2, null);
            }
        }
        if (parentLayer != null) {
            parentLayer.d(this);
        }
        this.impl.x(canvas);
        if (z11) {
            canvas.t();
        }
        if (z10) {
            canvas.j();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasD.restore();
    }

    public final float i() {
        return this.impl.getAlpha();
    }

    public final int j() {
        return this.impl.getBlendMode();
    }

    /* renamed from: k, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    public final C3604u0 l() {
        return this.impl.getColorFilter();
    }

    public final int m() {
        return this.impl.getCompositingStrategy();
    }

    public final N0 n() {
        N0 n02 = this.internalOutline;
        R0 r02 = this.outlinePath;
        if (n02 != null) {
            return n02;
        }
        if (r02 != null) {
            N0.a aVar = new N0.a(r02);
            this.internalOutline = aVar;
            return aVar;
        }
        long jD = U0.s.d(this.size);
        long j10 = this.roundRectOutlineTopLeft;
        long j11 = this.roundRectOutlineSize;
        if (j11 != 9205357640488583168L) {
            jD = j11;
        }
        float fM = C3476g.m(j10);
        float fN = C3476g.n(j10);
        float fI = fM + C3482m.i(jD);
        float fG = fN + C3482m.g(jD);
        float f10 = this.roundRectCornerRadius;
        N0 cVar = f10 > 0.0f ? new N0.c(C3481l.c(fM, fN, fI, fG, C3471b.b(f10, 0.0f, 2, null))) : new N0.b(new C3478i(fM, fN, fI, fG));
        this.internalOutline = cVar;
        return cVar;
    }

    /* renamed from: o, reason: from getter */
    public final long getPivotOffset() {
        return this.pivotOffset;
    }

    public final float p() {
        return this.impl.getRotationX();
    }

    public final float q() {
        return this.impl.getRotationY();
    }

    public final float r() {
        return this.impl.getRotationZ();
    }

    public final float s() {
        return this.impl.getScaleX();
    }

    public final float t() {
        return this.impl.getScaleY();
    }

    public final float u() {
        return this.impl.getShadowElevation();
    }

    /* renamed from: v, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: w, reason: from getter */
    public final long getTopLeft() {
        return this.topLeft;
    }

    public final float x() {
        return this.impl.getTranslationX();
    }

    public final float y() {
        return this.impl.getTranslationY();
    }

    /* renamed from: z, reason: from getter */
    public final boolean getIsReleased() {
        return this.isReleased;
    }

    /* compiled from: AndroidGraphicsLayer.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk0/f;", "Loa/F;", "a", "(Lk0/f;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: l0.c$c, reason: collision with other inner class name */
    static final class C0586c extends AbstractC3864v implements Ba.l<k0.f, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final C0586c f44304B = new C0586c();

        C0586c() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(k0.f fVar) {
            a(fVar);
            return C4153F.f46609a;
        }

        public final void a(k0.f fVar) {
        }
    }
}
