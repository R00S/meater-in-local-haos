package l0;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.os.Build;
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
import k0.C3781a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import l0.C3869b;
import m0.C3944a;
import oa.C4153F;

/* compiled from: GraphicsViewLayer.android.kt */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 :2\u00020\u0001:\u00017B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J*\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010#\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J;\u0010.\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000e0+H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b\u001a\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b6\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010I\u001a\n F*\u0004\u0018\u00010E0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010U\u001a\u0004\u0018\u00010R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010X\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Z\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010>R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\\R\u001c\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b^\u0010:R\u0016\u0010`\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010_R\"\u0010b\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010_\u001a\u0004\bb\u0010\u0015\"\u0004\bc\u0010dR\u0016\u0010f\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010_R\u0016\u0010g\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010_R\u001a\u0010j\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010:\u001a\u0004\bi\u0010<R0\u0010o\u001a\u00020k2\u0006\u0010l\u001a\u00020k8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b#\u0010\\\u001a\u0004\b7\u0010m\"\u0004\bn\u0010\u0010R.\u0010w\u001a\u0004\u0018\u00010p2\b\u0010l\u001a\u0004\u0018\u00010p8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR0\u0010\r\u001a\u00020\f2\u0006\u0010l\u001a\u00020\f8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\\\u001a\u0004\bq\u0010m\"\u0004\bx\u0010\u0010R*\u0010}\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bz\u0010.\u001a\u0004\b=\u0010{\"\u0004\b9\u0010|R\u0016\u0010~\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010_R4\u0010\u0083\u0001\u001a\u00020\u007f2\u0006\u0010l\u001a\u00020\u007f8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0004\b\u001b\u0010:\u001a\u0005\b\u0080\u0001\u0010<\"\u0006\b\u0081\u0001\u0010\u0082\u0001R,\u0010\u0084\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0005\b\u0081\u0001\u0010.\u001a\u0004\b^\u0010{\"\u0004\bV\u0010|R-\u0010\u0087\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0085\u0001\u0010.\u001a\u0005\b\u0086\u0001\u0010{\"\u0004\bS\u0010|R-\u0010\u008a\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0088\u0001\u0010.\u001a\u0005\b\u0089\u0001\u0010{\"\u0004\bY\u0010|R-\u0010\u008c\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u008b\u0001\u0010.\u001a\u0005\b\u0085\u0001\u0010{\"\u0004\bK\u0010|R-\u0010\u008f\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u008d\u0001\u0010.\u001a\u0005\b\u008e\u0001\u0010{\"\u0004\ba\u0010|R7\u0010\u0091\u0001\u001a\u00030\u0090\u00012\u0007\u0010l\u001a\u00030\u0090\u00018\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0005\b\u0089\u0001\u0010:\u001a\u0005\b\u008b\u0001\u0010<\"\u0006\b\u0088\u0001\u0010\u0082\u0001R4\u0010\u0092\u0001\u001a\u00030\u0090\u00012\u0007\u0010l\u001a\u00030\u0090\u00018\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0013\n\u0004\b.\u0010:\u001a\u0004\b:\u0010<\"\u0005\b\\\u0010\u0082\u0001R-\u0010\u0095\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0093\u0001\u0010.\u001a\u0005\b\u0094\u0001\u0010{\"\u0004\b]\u0010|R,\u0010\u0096\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0005\b\u0094\u0001\u0010.\u001a\u0004\bz\u0010{\"\u0004\bB\u0010|R+\u0010\u0097\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\\\u0010.\u001a\u0004\b\u001b\u0010{\"\u0004\bG\u0010|R&\u0010\u0098\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8V@VX\u0096\u000e¢\u0006\r\u001a\u0005\b\u008d\u0001\u0010{\"\u0004\b[\u0010|R'\u0010\u009a\u0001\u001a\u00020\u00132\u0006\u0010l\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0099\u0001\u0010\u0015\"\u0005\b\u0093\u0001\u0010dR5\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009b\u00012\t\u0010l\u001a\u0005\u0018\u00010\u009b\u00018\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0005\bh\u0010\u009e\u0001\"\u0005\bO\u0010\u009f\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 \u0001"}, d2 = {"Ll0/E;", "Ll0/d;", "Lm0/a;", "layerContainer", "", "ownerId", "Li0/m0;", "canvasHolder", "Lk0/a;", "canvasDrawScope", "<init>", "(Lm0/a;JLi0/m0;Lk0/a;)V", "Ll0/b;", "compositingStrategy", "Loa/F;", "O", "(I)V", "U", "()V", "", "R", "()Z", "S", "Q", "T", "", "x", "y", "LU0/r;", "size", "v", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "t", "(Landroid/graphics/Outline;J)V", "LU0/d;", "density", "LU0/t;", "layoutDirection", "Ll0/c;", "layer", "Lkotlin/Function1;", "Lk0/f;", "block", "F", "(LU0/d;LU0/t;Ll0/c;LBa/l;)V", "Li0/l0;", "canvas", "(Li0/l0;)V", "Landroid/graphics/Matrix;", "M", "()Landroid/graphics/Matrix;", "o", "b", "Lm0/a;", "c", "J", "getOwnerId", "()J", "d", "Li0/m0;", "getCanvasHolder", "()Li0/m0;", "Ll0/T;", "e", "Ll0/T;", "viewLayer", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "f", "Landroid/content/res/Resources;", "resources", "Landroid/graphics/Rect;", "g", "Landroid/graphics/Rect;", "clipRect", "Landroid/graphics/Paint;", "h", "Landroid/graphics/Paint;", "layerPaint", "Landroid/graphics/Picture;", "i", "Landroid/graphics/Picture;", "picture", "j", "Lk0/a;", "pictureDrawScope", "k", "pictureCanvasHolder", "l", "I", "m", "n", "Z", "clipBoundsInvalidated", "p", "isInvalidated", "r", "(Z)V", "q", "outlineIsProvided", "clipToBounds", "s", "getLayerId", "layerId", "Li0/b0;", "value", "()I", "setBlendMode-s9anfk8", "blendMode", "Li0/u0;", "u", "Li0/u0;", "a", "()Li0/u0;", "setColorFilter", "(Li0/u0;)V", "colorFilter", "L", "", "w", "()F", "(F)V", "alpha", "shouldManuallySetCenterPivot", "Lh0/g;", "getPivotOffset-F1C5BW0", "z", "(J)V", "pivotOffset", "scaleX", "A", "K", "scaleY", "B", "E", "translationX", "C", "translationY", "D", "N", "shadowElevation", "Li0/t0;", "ambientShadowColor", "spotShadowColor", "G", "H", "rotationX", "rotationY", "rotationZ", "cameraDistance", "P", "clip", "Li0/Z0;", "renderEffect", "Li0/Z0;", "()Li0/Z0;", "(Li0/Z0;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E implements InterfaceC3871d {

    /* renamed from: K, reason: collision with root package name */
    private static final boolean f44208K = !S.f44254a.a();

    /* renamed from: L, reason: collision with root package name */
    private static final Canvas f44209L = new a();

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private float shadowElevation;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private long ambientShadowColor;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private long spotShadowColor;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C3944a layerContainer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long ownerId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C3588m0 canvasHolder;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final T viewLayer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Resources resources;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Rect clipRect;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Paint layerPaint;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Picture picture;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final C3781a pictureDrawScope;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final C3588m0 pictureCanvasHolder;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int x;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int y;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean clipBoundsInvalidated;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidated;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean outlineIsProvided;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long layerId;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int blendMode;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private C3604u0 colorFilter;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int compositingStrategy;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean shouldManuallySetCenterPivot;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private long pivotOffset;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    /* compiled from: GraphicsViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"l0/E$a", "Landroid/graphics/Canvas;", "", "isHardwareAccelerated", "()Z", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Canvas {
        a() {
        }

        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }
    }

    public E(C3944a c3944a, long j10, C3588m0 c3588m0, C3781a c3781a) {
        this.layerContainer = c3944a;
        this.ownerId = j10;
        this.canvasHolder = c3588m0;
        T t10 = new T(c3944a, c3588m0, c3781a);
        this.viewLayer = t10;
        this.resources = c3944a.getResources();
        this.clipRect = new Rect();
        boolean z10 = f44208K;
        this.picture = z10 ? new Picture() : null;
        this.pictureDrawScope = z10 ? new C3781a() : null;
        this.pictureCanvasHolder = z10 ? new C3588m0() : null;
        c3944a.addView(t10);
        t10.setClipBounds(null);
        this.size = U0.r.INSTANCE.a();
        this.isInvalidated = true;
        this.layerId = View.generateViewId();
        this.blendMode = C3566b0.INSTANCE.B();
        this.compositingStrategy = C3869b.INSTANCE.a();
        this.alpha = 1.0f;
        this.pivotOffset = C3476g.INSTANCE.c();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        C3602t0.Companion companion = C3602t0.INSTANCE;
        this.ambientShadowColor = companion.a();
        this.spotShadowColor = companion.a();
    }

    private final void O(int compositingStrategy) {
        T t10 = this.viewLayer;
        C3869b.Companion companion = C3869b.INSTANCE;
        boolean z10 = true;
        if (C3869b.e(compositingStrategy, companion.c())) {
            this.viewLayer.setLayerType(2, this.layerPaint);
        } else if (C3869b.e(compositingStrategy, companion.b())) {
            this.viewLayer.setLayerType(0, this.layerPaint);
            z10 = false;
        } else {
            this.viewLayer.setLayerType(0, this.layerPaint);
        }
        t10.setCanUseCompositingLayer$ui_graphics_release(z10);
    }

    private final void Q() {
        try {
            C3588m0 c3588m0 = this.canvasHolder;
            Canvas canvas = f44209L;
            Canvas internalCanvas = c3588m0.getAndroidCanvas().getInternalCanvas();
            c3588m0.getAndroidCanvas().w(canvas);
            C3544G androidCanvas = c3588m0.getAndroidCanvas();
            C3944a c3944a = this.layerContainer;
            T t10 = this.viewLayer;
            c3944a.a(androidCanvas, t10, t10.getDrawingTime());
            c3588m0.getAndroidCanvas().w(internalCanvas);
        } catch (Throwable unused) {
        }
    }

    private final boolean R() {
        return C3869b.e(getCompositingStrategy(), C3869b.INSTANCE.c()) || S();
    }

    private final boolean S() {
        return (C3566b0.E(getBlendMode(), C3566b0.INSTANCE.B()) && getColorFilter() == null) ? false : true;
    }

    private final void T() {
        Rect rect;
        if (this.clipBoundsInvalidated) {
            T t10 = this.viewLayer;
            if (!P() || this.outlineIsProvided) {
                rect = null;
            } else {
                rect = this.clipRect;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.viewLayer.getWidth();
                rect.bottom = this.viewLayer.getHeight();
            }
            t10.setClipBounds(rect);
        }
    }

    private final void U() {
        if (R()) {
            O(C3869b.INSTANCE.c());
        } else {
            O(getCompositingStrategy());
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
            X.f44267a.b(this.viewLayer, C3606v0.j(j10));
        }
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: C, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: D */
    public float getCameraDistance() {
        return this.viewLayer.getCameraDistance() / this.resources.getDisplayMetrics().densityDpi;
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: E, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // l0.InterfaceC3871d
    public void F(U0.d density, U0.t layoutDirection, C3870c layer, Ba.l<? super k0.f, C4153F> block) {
        C3588m0 c3588m0;
        Canvas canvas;
        if (this.viewLayer.getParent() == null) {
            this.layerContainer.addView(this.viewLayer);
        }
        this.viewLayer.c(density, layoutDirection, layer, block);
        if (this.viewLayer.isAttachedToWindow()) {
            this.viewLayer.setVisibility(4);
            this.viewLayer.setVisibility(0);
            Q();
            Picture picture = this.picture;
            if (picture != null) {
                Canvas canvasBeginRecording = picture.beginRecording(U0.r.g(this.size), U0.r.f(this.size));
                try {
                    C3588m0 c3588m02 = this.pictureCanvasHolder;
                    if (c3588m02 != null) {
                        Canvas internalCanvas = c3588m02.getAndroidCanvas().getInternalCanvas();
                        c3588m02.getAndroidCanvas().w(canvasBeginRecording);
                        C3544G androidCanvas = c3588m02.getAndroidCanvas();
                        C3781a c3781a = this.pictureDrawScope;
                        if (c3781a != null) {
                            long jD = U0.s.d(this.size);
                            C3781a.DrawParams drawParams = c3781a.getDrawParams();
                            U0.d density2 = drawParams.getDensity();
                            U0.t layoutDirection2 = drawParams.getLayoutDirection();
                            InterfaceC3586l0 canvas2 = drawParams.getCanvas();
                            c3588m0 = c3588m02;
                            canvas = internalCanvas;
                            long size = drawParams.getSize();
                            C3781a.DrawParams drawParams2 = c3781a.getDrawParams();
                            drawParams2.j(density);
                            drawParams2.k(layoutDirection);
                            drawParams2.i(androidCanvas);
                            drawParams2.l(jD);
                            androidCanvas.h();
                            block.invoke(c3781a);
                            androidCanvas.t();
                            C3781a.DrawParams drawParams3 = c3781a.getDrawParams();
                            drawParams3.j(density2);
                            drawParams3.k(layoutDirection2);
                            drawParams3.i(canvas2);
                            drawParams3.l(size);
                        } else {
                            c3588m0 = c3588m02;
                            canvas = internalCanvas;
                        }
                        c3588m0.getAndroidCanvas().w(canvas);
                        C4153F c4153f = C4153F.f46609a;
                    }
                    picture.endRecording();
                } catch (Throwable th) {
                    picture.endRecording();
                    throw th;
                }
            }
        }
    }

    @Override // l0.InterfaceC3871d
    public void G(boolean z10) {
        boolean z11 = false;
        this.clipToBounds = z10 && !this.outlineIsProvided;
        this.clipBoundsInvalidated = true;
        T t10 = this.viewLayer;
        if (z10 && this.outlineIsProvided) {
            z11 = true;
        }
        t10.setClipToOutline(z11);
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
            X.f44267a.c(this.viewLayer, C3606v0.j(j10));
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
        U();
    }

    @Override // l0.InterfaceC3871d
    public Matrix M() {
        return this.viewLayer.getMatrix();
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: N, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    public boolean P() {
        return this.clipToBounds || this.viewLayer.getClipToOutline();
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
        this.viewLayer.setAlpha(f10);
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: d, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // l0.InterfaceC3871d
    public void e(float f10) {
        this.rotationY = f10;
        this.viewLayer.setRotationY(f10);
    }

    @Override // l0.InterfaceC3871d
    public void f(float f10) {
        this.rotationZ = f10;
        this.viewLayer.setRotation(f10);
    }

    @Override // l0.InterfaceC3871d
    public void g(float f10) {
        this.translationY = f10;
        this.viewLayer.setTranslationY(f10);
    }

    @Override // l0.InterfaceC3871d
    public void h(Z0 z02) {
        if (Build.VERSION.SDK_INT >= 31) {
            Z.f44268a.a(this.viewLayer, z02);
        }
    }

    @Override // l0.InterfaceC3871d
    public void i(float f10) {
        this.scaleY = f10;
        this.viewLayer.setScaleY(f10);
    }

    @Override // l0.InterfaceC3871d
    public void j(float f10) {
        this.scaleX = f10;
        this.viewLayer.setScaleX(f10);
    }

    @Override // l0.InterfaceC3871d
    public void k(float f10) {
        this.translationX = f10;
        this.viewLayer.setTranslationX(f10);
    }

    @Override // l0.InterfaceC3871d
    public void l(float f10) {
        this.viewLayer.setCameraDistance(f10 * this.resources.getDisplayMetrics().densityDpi);
    }

    @Override // l0.InterfaceC3871d
    public void m(float f10) {
        this.rotationX = f10;
        this.viewLayer.setRotationX(f10);
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: n, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // l0.InterfaceC3871d
    public void o() {
        this.layerContainer.removeViewInLayout(this.viewLayer);
    }

    @Override // l0.InterfaceC3871d
    public void p(float f10) {
        this.shadowElevation = f10;
        this.viewLayer.setElevation(f10);
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
        boolean zD = this.viewLayer.d(outline);
        if (P() && outline != null) {
            this.viewLayer.setClipToOutline(true);
            if (this.clipToBounds) {
                this.clipToBounds = false;
                this.clipBoundsInvalidated = true;
            }
        }
        this.outlineIsProvided = outline != null;
        if (zD) {
            return;
        }
        this.viewLayer.invalidate();
        Q();
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: u, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // l0.InterfaceC3871d
    public void v(int x10, int y10, long size) {
        if (U0.r.e(this.size, size)) {
            int i10 = this.x;
            if (i10 != x10) {
                this.viewLayer.offsetLeftAndRight(x10 - i10);
            }
            int i11 = this.y;
            if (i11 != y10) {
                this.viewLayer.offsetTopAndBottom(y10 - i11);
            }
        } else {
            if (P()) {
                this.clipBoundsInvalidated = true;
            }
            this.viewLayer.layout(x10, y10, U0.r.g(size) + x10, U0.r.f(size) + y10);
            this.size = size;
            if (this.shouldManuallySetCenterPivot) {
                this.viewLayer.setPivotX(U0.r.g(size) / 2.0f);
                this.viewLayer.setPivotY(U0.r.f(size) / 2.0f);
            }
        }
        this.x = x10;
        this.y = y10;
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: w, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // l0.InterfaceC3871d
    public void x(InterfaceC3586l0 canvas) {
        T();
        Canvas canvasD = C3545H.d(canvas);
        if (canvasD.isHardwareAccelerated()) {
            C3944a c3944a = this.layerContainer;
            T t10 = this.viewLayer;
            c3944a.a(canvas, t10, t10.getDrawingTime());
        } else {
            Picture picture = this.picture;
            if (picture != null) {
                canvasD.drawPicture(picture);
            }
        }
    }

    @Override // l0.InterfaceC3871d
    /* renamed from: y, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // l0.InterfaceC3871d
    public void z(long j10) {
        this.pivotOffset = j10;
        if (!C3477h.d(j10)) {
            this.shouldManuallySetCenterPivot = false;
            this.viewLayer.setPivotX(C3476g.m(j10));
            this.viewLayer.setPivotY(C3476g.n(j10));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                X.f44267a.a(this.viewLayer);
                return;
            }
            this.shouldManuallySetCenterPivot = true;
            this.viewLayer.setPivotX(U0.r.g(this.size) / 2.0f);
            this.viewLayer.setPivotY(U0.r.f(this.size) / 2.0f);
        }
    }

    public /* synthetic */ E(C3944a c3944a, long j10, C3588m0 c3588m0, C3781a c3781a, int i10, C3854k c3854k) {
        this(c3944a, j10, (i10 & 4) != 0 ? new C3588m0() : c3588m0, (i10 & 8) != 0 ? new C3781a() : c3781a);
    }
}
