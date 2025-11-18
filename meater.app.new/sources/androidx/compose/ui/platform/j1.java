package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.a;
import h0.C3476g;
import h0.MutableRect;
import i0.C3544G;
import i0.C3588m0;
import i0.C3606v0;
import i0.InterfaceC3586l0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import l0.C3870c;
import oa.C4153F;

/* compiled from: ViewLayer.android.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0000\u0018\u0000 \u007f2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002?5BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010\"J!\u0010'\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010\u0012J7\u00103\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u00182\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020.H\u0014¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u0010\u0012J\u000f\u00106\u001a\u00020\u000bH\u0016¢\u0006\u0004\b6\u0010\u0012J\u000f\u00107\u001a\u00020\u000bH\u0016¢\u0006\u0004\b7\u0010\u0012J\"\u0010:\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001f\u00102\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020<2\u0006\u00109\u001a\u00020\u0018H\u0016¢\u0006\u0004\b2\u0010>J9\u0010?\u001a\u00020\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR,\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010S\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR*\u0010\\\u001a\u00020\u00182\u0006\u0010X\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010R\u001a\u0004\b0\u0010\u001a\"\u0004\bZ\u0010[R\u0016\u0010^\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010RR\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00010c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001c\u0010i\u001a\u00020g8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bh\u0010]R\u0016\u0010k\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010RR\u001a\u0010p\u001a\u00020l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010]\u001a\u0004\bn\u0010oR\u0016\u0010r\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010YR\u0016\u0010v\u001a\u0004\u0018\u00010s8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0014\u0010x\u001a\u00020l8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010oR$\u0010~\u001a\u00020y2\u0006\u0010X\u001a\u00020y8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0080\u0001"}, d2 = {"Landroidx/compose/ui/platform/j1;", "Landroid/view/View;", "LA0/l0;", "", "Landroidx/compose/ui/platform/q;", "ownerView", "Landroidx/compose/ui/platform/k0;", "container", "Lkotlin/Function2;", "Li0/l0;", "Ll0/c;", "Loa/F;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/q;Landroidx/compose/ui/platform/k0;LBa/p;LBa/a;)V", "v", "()V", "u", "Landroidx/compose/ui/graphics/d;", "scope", "f", "(Landroidx/compose/ui/graphics/d;)V", "", "hasOverlappingRendering", "()Z", "Lh0/g;", "position", "e", "(J)Z", "LU0/r;", "size", "h", "(J)V", "LU0/n;", "i", "canvas", "parentLayer", "a", "(Li0/l0;Ll0/c;)V", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "invalidate", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "d", "j", "forceLayout", "point", "inverse", "g", "(JZ)J", "Lh0/e;", "rect", "(Lh0/e;Z)V", "c", "(LBa/p;LBa/a;)V", "B", "Landroidx/compose/ui/platform/q;", "getOwnerView", "()Landroidx/compose/ui/platform/q;", "C", "Landroidx/compose/ui/platform/k0;", "getContainer", "()Landroidx/compose/ui/platform/k0;", "D", "LBa/p;", "E", "LBa/a;", "Landroidx/compose/ui/platform/A0;", "F", "Landroidx/compose/ui/platform/A0;", "outlineResolver", "G", "Z", "clipToBounds", "Landroid/graphics/Rect;", "H", "Landroid/graphics/Rect;", "clipBoundsCache", "value", "I", "setInvalidated", "(Z)V", "isInvalidated", "J", "drawnWithZ", "Li0/m0;", "K", "Li0/m0;", "canvasHolder", "Landroidx/compose/ui/platform/w0;", "L", "Landroidx/compose/ui/platform/w0;", "matrixCache", "Landroidx/compose/ui/graphics/f;", "M", "mTransformOrigin", "N", "mHasOverlappingRendering", "", "O", "getLayerId", "()J", "layerId", "P", "mutatedFields", "Li0/R0;", "getManualClipPath", "()Li0/R0;", "manualClipPath", "getOwnerViewId", "ownerViewId", "", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "Q", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j1 extends View implements A0.l0 {

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: R, reason: collision with root package name */
    public static final int f23154R = 8;

    /* renamed from: S, reason: collision with root package name */
    private static final Ba.p<View, Matrix, C4153F> f23155S = b.f23176B;

    /* renamed from: T, reason: collision with root package name */
    private static final ViewOutlineProvider f23156T = new a();

    /* renamed from: U, reason: collision with root package name */
    private static Method f23157U;

    /* renamed from: V, reason: collision with root package name */
    private static Field f23158V;

    /* renamed from: W, reason: collision with root package name */
    private static boolean f23159W;

    /* renamed from: a0, reason: collision with root package name */
    private static boolean f23160a0;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final C2036q ownerView;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final C2025k0 container;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Ba.p<? super InterfaceC3586l0, ? super C3870c, C4153F> drawBlock;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Ba.a<C4153F> invalidateParentLayer;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final A0 outlineResolver;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private Rect clipBoundsCache;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidated;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private boolean drawnWithZ;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final C3588m0 canvasHolder;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final C2048w0<View> matrixCache;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private long mTransformOrigin;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private boolean mHasOverlappingRendering;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long layerId;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    /* compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/j1$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "Loa/F;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            C3862t.e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline outlineB = ((j1) view).outlineResolver.b();
            C3862t.d(outlineB);
            outline.set(outlineB);
        }
    }

    /* compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "view", "Landroid/graphics/Matrix;", "matrix", "Loa/F;", "a", "(Landroid/view/View;Landroid/graphics/Matrix;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.p<View, Matrix, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f23176B = new b();

        b() {
            super(2);
        }

        public final void a(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(View view, Matrix matrix) {
            a(view, matrix);
            return C4153F.f46609a;
        }
    }

    /* compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R&\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/platform/j1$c;", "", "<init>", "()V", "Landroid/view/View;", "view", "Loa/F;", "d", "(Landroid/view/View;)V", "", "<set-?>", "hasRetrievedMethod", "Z", "a", "()Z", "shouldUseDispatchDraw", "b", "c", "(Z)V", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "getMatrix", "LBa/p;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.j1$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final boolean a() {
            return j1.f23159W;
        }

        public final boolean b() {
            return j1.f23160a0;
        }

        public final void c(boolean z10) {
            j1.f23160a0 = z10;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void d(View view) {
            try {
                if (!a()) {
                    j1.f23159W = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        j1.f23157U = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        j1.f23158V = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        j1.f23157U = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        j1.f23158V = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = j1.f23157U;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = j1.f23158V;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = j1.f23158V;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = j1.f23157U;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                c(true);
            }
        }

        private Companion() {
        }
    }

    /* compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/j1$d;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f23177a = new d();

        private d() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public j1(C2036q c2036q, C2025k0 c2025k0, Ba.p<? super InterfaceC3586l0, ? super C3870c, C4153F> pVar, Ba.a<C4153F> aVar) {
        super(c2036q.getContext());
        this.ownerView = c2036q;
        this.container = c2025k0;
        this.drawBlock = pVar;
        this.invalidateParentLayer = aVar;
        this.outlineResolver = new A0();
        this.canvasHolder = new C3588m0();
        this.matrixCache = new C2048w0<>(f23155S);
        this.mTransformOrigin = androidx.compose.ui.graphics.f.INSTANCE.a();
        this.mHasOverlappingRendering = true;
        setWillNotDraw(false);
        c2025k0.addView(this);
        this.layerId = View.generateViewId();
    }

    private final i0.R0 getManualClipPath() {
        if (!getClipToOutline() || this.outlineResolver.e()) {
            return null;
        }
        return this.outlineResolver.d();
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.isInvalidated) {
            this.isInvalidated = z10;
            this.ownerView.y0(this, z10);
        }
    }

    private final void u() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                C3862t.d(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void v() {
        setOutlineProvider(this.outlineResolver.b() != null ? f23156T : null);
    }

    @Override // A0.l0
    public void a(InterfaceC3586l0 canvas, C3870c parentLayer) {
        boolean z10 = getElevation() > 0.0f;
        this.drawnWithZ = z10;
        if (z10) {
            canvas.u();
        }
        this.container.a(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.j();
        }
    }

    @Override // A0.l0
    public void b(MutableRect rect, boolean inverse) {
        if (!inverse) {
            i0.L0.g(this.matrixCache.b(this), rect);
            return;
        }
        float[] fArrA = this.matrixCache.a(this);
        if (fArrA != null) {
            i0.L0.g(fArrA, rect);
        } else {
            rect.g(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    @Override // A0.l0
    public void c(Ba.p<? super InterfaceC3586l0, ? super C3870c, C4153F> drawBlock, Ba.a<C4153F> invalidateParentLayer) {
        this.container.addView(this);
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = androidx.compose.ui.graphics.f.INSTANCE.a();
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
    }

    @Override // A0.l0
    public void d() {
        setInvalidated(false);
        this.ownerView.J0();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.H0(this);
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        boolean z10;
        C3588m0 c3588m0 = this.canvasHolder;
        Canvas canvasV = c3588m0.getAndroidCanvas().getInternalCanvas();
        c3588m0.getAndroidCanvas().w(canvas);
        C3544G c3544gA = c3588m0.getAndroidCanvas();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z10 = false;
        } else {
            c3544gA.h();
            this.outlineResolver.a(c3544gA);
            z10 = true;
        }
        Ba.p<? super InterfaceC3586l0, ? super C3870c, C4153F> pVar = this.drawBlock;
        if (pVar != null) {
            pVar.invoke(c3544gA, null);
        }
        if (z10) {
            c3544gA.t();
        }
        c3588m0.getAndroidCanvas().w(canvasV);
        setInvalidated(false);
    }

    @Override // A0.l0
    public boolean e(long position) {
        float fM = C3476g.m(position);
        float fN = C3476g.n(position);
        if (this.clipToBounds) {
            return 0.0f <= fM && fM < ((float) getWidth()) && 0.0f <= fN && fN < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.f(position);
        }
        return true;
    }

    @Override // A0.l0
    public void f(androidx.compose.ui.graphics.d scope) {
        Ba.a<C4153F> aVar;
        int iU = scope.getMutatedFields() | this.mutatedFields;
        if ((iU & 4096) != 0) {
            long jF1 = scope.getTransformOrigin();
            this.mTransformOrigin = jF1;
            setPivotX(androidx.compose.ui.graphics.f.f(jF1) * getWidth());
            setPivotY(androidx.compose.ui.graphics.f.g(this.mTransformOrigin) * getHeight());
        }
        if ((iU & 1) != 0) {
            setScaleX(scope.getScaleX());
        }
        if ((iU & 2) != 0) {
            setScaleY(scope.getScaleY());
        }
        if ((iU & 4) != 0) {
            setAlpha(scope.getAlpha());
        }
        if ((iU & 8) != 0) {
            setTranslationX(scope.getTranslationX());
        }
        if ((iU & 16) != 0) {
            setTranslationY(scope.getTranslationY());
        }
        if ((iU & 32) != 0) {
            setElevation(scope.getShadowElevation());
        }
        if ((iU & 1024) != 0) {
            setRotation(scope.getRotationZ());
        }
        if ((iU & 256) != 0) {
            setRotationX(scope.getRotationX());
        }
        if ((iU & 512) != 0) {
            setRotationY(scope.getRotationY());
        }
        if ((iU & 2048) != 0) {
            setCameraDistancePx(scope.getCameraDistance());
        }
        boolean z10 = false;
        boolean z11 = getManualClipPath() != null;
        boolean z12 = scope.getClip() && scope.getShape() != i0.Y0.a();
        if ((iU & 24576) != 0) {
            this.clipToBounds = scope.getClip() && scope.getShape() == i0.Y0.a();
            u();
            setClipToOutline(z12);
        }
        boolean zH = this.outlineResolver.h(scope.getOutline(), scope.getAlpha(), z12, scope.getShadowElevation(), scope.getSize());
        if (this.outlineResolver.getCacheIsDirty()) {
            v();
        }
        boolean z13 = getManualClipPath() != null;
        if (z11 != z13 || (z13 && zH)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (aVar = this.invalidateParentLayer) != null) {
            aVar.invoke();
        }
        if ((iU & 7963) != 0) {
            this.matrixCache.c();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            if ((iU & 64) != 0) {
                l1.f23189a.a(this, C3606v0.j(scope.getAmbientShadowColor()));
            }
            if ((iU & 128) != 0) {
                l1.f23189a.b(this, C3606v0.j(scope.getSpotShadowColor()));
            }
        }
        if (i10 >= 31 && (131072 & iU) != 0) {
            m1 m1Var = m1.f23212a;
            scope.F();
            m1Var.a(this, null);
        }
        if ((iU & 32768) != 0) {
            int iQ = scope.getCompositingStrategy();
            a.Companion companion = androidx.compose.ui.graphics.a.INSTANCE;
            if (androidx.compose.ui.graphics.a.e(iQ, companion.c())) {
                setLayerType(2, null);
            } else if (androidx.compose.ui.graphics.a.e(iQ, companion.b())) {
                setLayerType(0, null);
                this.mHasOverlappingRendering = z10;
            } else {
                setLayerType(0, null);
            }
            z10 = true;
            this.mHasOverlappingRendering = z10;
        }
        this.mutatedFields = scope.getMutatedFields();
    }

    @Override // A0.l0
    public long g(long point, boolean inverse) {
        if (!inverse) {
            return i0.L0.f(this.matrixCache.b(this), point);
        }
        float[] fArrA = this.matrixCache.a(this);
        return fArrA != null ? i0.L0.f(fArrA, point) : C3476g.INSTANCE.a();
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final C2025k0 getContainer() {
        return this.container;
    }

    public long getLayerId() {
        return this.layerId;
    }

    public final C2036q getOwnerView() {
        return this.ownerView;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(this.ownerView);
        }
        return -1L;
    }

    @Override // A0.l0
    public void h(long size) {
        int iG = U0.r.g(size);
        int iF = U0.r.f(size);
        if (iG == getWidth() && iF == getHeight()) {
            return;
        }
        setPivotX(androidx.compose.ui.graphics.f.f(this.mTransformOrigin) * iG);
        setPivotY(androidx.compose.ui.graphics.f.g(this.mTransformOrigin) * iF);
        v();
        layout(getLeft(), getTop(), getLeft() + iG, getTop() + iF);
        u();
        this.matrixCache.c();
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // A0.l0
    public void i(long position) {
        int iH = U0.n.h(position);
        if (iH != getLeft()) {
            offsetLeftAndRight(iH - getLeft());
            this.matrixCache.c();
        }
        int i10 = U0.n.i(position);
        if (i10 != getTop()) {
            offsetTopAndBottom(i10 - getTop());
            this.matrixCache.c();
        }
    }

    @Override // android.view.View, A0.l0
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // A0.l0
    public void j() {
        if (!this.isInvalidated || f23160a0) {
            return;
        }
        INSTANCE.d(this);
        setInvalidated(false);
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }

    /* renamed from: t, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
    }
}
