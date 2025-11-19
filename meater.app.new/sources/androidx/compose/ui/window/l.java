package androidx.compose.ui.window;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.C2098e0;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractC2004a;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.window.l;
import h0.C3476g;
import java.util.UUID;
import kotlin.AbstractC1564q;
import kotlin.C1509K0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.N;
import kotlin.m1;
import kotlin.r1;
import kotlin.x1;
import oa.C4153F;
import t3.C4550g;
import y0.C5117w;
import y0.InterfaceC5116v;

/* compiled from: AndroidPopup.android.kt */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\u000e\b\u0001\u0018\u0000 «\u00012\u00020\u00012\u00020\u0002:\u0002¬\u0001BQ\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u0017J#\u0010&\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0017¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0004H\u0014¢\u0006\u0004\b*\u0010\u0017J\u000f\u0010+\u001a\u00020\u0004H\u0014¢\u0006\u0004\b+\u0010\u0017J\u001f\u0010/\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,H\u0010¢\u0006\u0004\b/\u00100J7\u00107\u001a\u00020\u00042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020,2\u0006\u00105\u001a\u00020,2\u0006\u00106\u001a\u00020,H\u0010¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u0002012\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J5\u0010=\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b=\u0010>J\u0015\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u0004¢\u0006\u0004\bC\u0010\u0017J\u000f\u0010D\u001a\u00020\u0004H\u0001¢\u0006\u0004\bD\u0010\u0017J\r\u0010E\u001a\u00020\u0004¢\u0006\u0004\bE\u0010\u0017J\r\u0010F\u001a\u00020\u0004¢\u0006\u0004\bF\u0010\u0017J\u0019\u0010H\u001a\u0002012\b\u0010:\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020,H\u0016¢\u0006\u0004\bJ\u0010KR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R \u0010b\u001a\u00020\u001f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b^\u0010_\u0012\u0004\ba\u0010\u0017\u001a\u0004\b`\u0010!R\"\u0010i\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010o\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010\u001eR5\u0010x\u001a\u0004\u0018\u00010p2\b\u0010q\u001a\u0004\u0018\u00010p8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR/\u0010@\u001a\u0004\u0018\u00010?2\b\u0010q\u001a\u0004\u0018\u00010?8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\by\u0010s\u001a\u0004\bz\u0010{\"\u0004\b|\u0010BR\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR \u0010\u0085\u0001\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001e\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R<\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b\u0096\u0001\u0010s\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R)\u0010\u009e\u0001\u001a\u0002012\u0006\u0010q\u001a\u0002018\u0014@RX\u0094\u000e¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u0084\u0001R\u0018\u0010¢\u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0017\u0010¥\u0001\u001a\u00020,8BX\u0082\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0017\u0010§\u0001\u001a\u00020,8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010¤\u0001R\u0017\u0010ª\u0001\u001a\u00020\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u00ad\u0001"}, d2 = {"Landroidx/compose/ui/window/l;", "Landroidx/compose/ui/platform/a;", "Landroidx/compose/ui/platform/n1;", "Lkotlin/Function0;", "Loa/F;", "onDismissRequest", "Landroidx/compose/ui/window/s;", "properties", "", "testTag", "Landroid/view/View;", "composeView", "LU0/d;", "density", "Landroidx/compose/ui/window/r;", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "Landroidx/compose/ui/window/n;", "popupLayoutHelper", "<init>", "(LBa/a;Landroidx/compose/ui/window/s;Ljava/lang/String;Landroid/view/View;LU0/d;Landroidx/compose/ui/window/r;Ljava/util/UUID;Landroidx/compose/ui/window/n;)V", "n", "()V", "o", "w", "(Landroidx/compose/ui/window/s;)V", "LU0/t;", "layoutDirection", "s", "(LU0/t;)V", "Landroid/view/WindowManager$LayoutParams;", "l", "()Landroid/view/WindowManager$LayoutParams;", "r", "LO/q;", "parent", "content", "q", "(LO/q;LBa/p;)V", "a", "(LO/l;I)V", "onAttachedToWindow", "onDetachedFromWindow", "", "widthMeasureSpec", "heightMeasureSpec", "h", "(II)V", "", "changed", "left", "top", "right", "bottom", "g", "(ZIIII)V", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "t", "(LBa/a;Landroidx/compose/ui/window/s;Ljava/lang/String;LU0/t;)V", "Ly0/v;", "parentLayoutCoordinates", "v", "(Ly0/v;)V", "p", "u", "x", "m", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "setLayoutDirection", "(I)V", "J", "LBa/a;", "K", "Landroidx/compose/ui/window/s;", "L", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "M", "Landroid/view/View;", "N", "Landroidx/compose/ui/window/n;", "Landroid/view/WindowManager;", "O", "Landroid/view/WindowManager;", "windowManager", "P", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release", "getParams$ui_release$annotations", "params", "Q", "Landroidx/compose/ui/window/r;", "getPositionProvider", "()Landroidx/compose/ui/window/r;", "setPositionProvider", "(Landroidx/compose/ui/window/r;)V", "positionProvider", "R", "LU0/t;", "getParentLayoutDirection", "()LU0/t;", "setParentLayoutDirection", "parentLayoutDirection", "LU0/r;", "<set-?>", "S", "LO/p0;", "getPopupContentSize-bOM6tXw", "()LU0/r;", "setPopupContentSize-fhxjrPA", "(LU0/r;)V", "popupContentSize", "T", "getParentLayoutCoordinates", "()Ly0/v;", "setParentLayoutCoordinates", "LU0/p;", "U", "LU0/p;", "parentBounds", "V", "LO/x1;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "LU0/h;", "W", "F", "maxSupportedElevation", "Landroid/graphics/Rect;", "a0", "Landroid/graphics/Rect;", "previousWindowVisibleFrame", "Landroidx/compose/runtime/snapshots/l;", "b0", "Landroidx/compose/runtime/snapshots/l;", "snapshotStateObserver", "", "c0", "Ljava/lang/Object;", "backCallback", "d0", "getContent", "()LBa/p;", "setContent", "(LBa/p;)V", "e0", "Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "", "f0", "[I", "locationOnScreen", "getDisplayWidth", "()I", "displayWidth", "getDisplayHeight", "displayHeight", "getSubCompositionView", "()Landroidx/compose/ui/platform/a;", "subCompositionView", "g0", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class l extends AbstractC2004a implements n1 {

    /* renamed from: g0, reason: collision with root package name */
    private static final c f23714g0 = new c(null);

    /* renamed from: h0, reason: collision with root package name */
    public static final int f23715h0 = 8;

    /* renamed from: i0, reason: collision with root package name */
    private static final Ba.l<l, C4153F> f23716i0 = b.f23737B;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private Ba.a<C4153F> onDismissRequest;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private s properties;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private String testTag;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final View composeView;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final n popupLayoutHelper;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final WindowManager windowManager;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final WindowManager.LayoutParams params;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private r positionProvider;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private U0.t parentLayoutDirection;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 popupContentSize;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 parentLayoutCoordinates;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private U0.p parentBounds;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private final x1 canCalculatePosition;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private final float maxSupportedElevation;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private final Rect previousWindowVisibleFrame;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.runtime.snapshots.l snapshotStateObserver;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private Object backCallback;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 content;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private final int[] locationOnScreen;

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/window/l$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "result", "Loa/F;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline result) {
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(0.0f);
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/window/l;", "popupLayout", "Loa/F;", "a", "(Landroidx/compose/ui/window/l;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<l, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f23737B = new b();

        b() {
            super(1);
        }

        public final void a(l lVar) {
            if (lVar.isAttachedToWindow()) {
                lVar.x();
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(l lVar) {
            a(lVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/window/l$c;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/window/l;", "Loa/F;", "onCommitAffectingPopupPosition", "LBa/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c {
        public /* synthetic */ c(C3854k c3854k) {
            this();
        }

        private c() {
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f23739C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10) {
            super(2);
            this.f23739C = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            l.this.a(interfaceC1554l, C1509K0.a(this.f23739C | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23740a;

        static {
            int[] iArr = new int[U0.t.values().length];
            try {
                iArr[U0.t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[U0.t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f23740a = iArr;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class f extends AbstractC3864v implements Ba.a<Boolean> {
        f() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            InterfaceC5116v parentLayoutCoordinates = l.this.getParentLayoutCoordinates();
            if (parentLayoutCoordinates == null || !parentLayoutCoordinates.L()) {
                parentLayoutCoordinates = null;
            }
            return Boolean.valueOf((parentLayoutCoordinates == null || l.this.m0getPopupContentSizebOM6tXw() == null) ? false : true);
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Loa/F;", "command", "b", "(LBa/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends AbstractC3864v implements Ba.l<Ba.a<? extends C4153F>, C4153F> {
        g() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Ba.a aVar) {
            aVar.invoke();
        }

        public final void b(final Ba.a<C4153F> aVar) {
            Handler handler = l.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                aVar.invoke();
                return;
            }
            Handler handler2 = l.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.window.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.g.c(aVar);
                    }
                });
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Ba.a<? extends C4153F> aVar) {
            b(aVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class h extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ N f23743B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ l f23744C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ U0.p f23745D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f23746E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f23747F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(N n10, l lVar, U0.p pVar, long j10, long j11) {
            super(0);
            this.f23743B = n10;
            this.f23744C = lVar;
            this.f23745D = pVar;
            this.f23746E = j10;
            this.f23747F = j11;
        }

        public final void a() {
            this.f23743B.f43977B = this.f23744C.getPositionProvider().a(this.f23745D, this.f23746E, this.f23744C.getParentLayoutDirection(), this.f23747F);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l(Ba.a aVar, s sVar, String str, View view, U0.d dVar, r rVar, UUID uuid, n nVar, int i10, C3854k c3854k) {
        n pVar;
        if ((i10 & 128) != 0) {
            pVar = Build.VERSION.SDK_INT >= 29 ? new p() : new q();
        } else {
            pVar = nVar;
        }
        this(aVar, sVar, str, view, dVar, rVar, uuid, pVar);
    }

    private final Ba.p<InterfaceC1554l, Integer, C4153F> getContent() {
        return (Ba.p) this.content.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC5116v getParentLayoutCoordinates() {
        return (InterfaceC5116v) this.parentLayoutCoordinates.getValue();
    }

    private final WindowManager.LayoutParams l() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = androidx.compose.ui.window.c.i(this.properties, androidx.compose.ui.window.c.j(this.composeView));
        layoutParams.type = 1002;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(b0.m.f29976d));
        return layoutParams;
    }

    private final void n() {
        if (!this.properties.getDismissOnBackPress() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.backCallback == null) {
            this.backCallback = androidx.compose.ui.window.f.b(this.onDismissRequest);
        }
        androidx.compose.ui.window.f.d(this, this.backCallback);
    }

    private final void o() {
        if (Build.VERSION.SDK_INT >= 33) {
            androidx.compose.ui.window.f.e(this, this.backCallback);
        }
        this.backCallback = null;
    }

    private final void s(U0.t layoutDirection) {
        int i10 = e.f23740a[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i11);
    }

    private final void setContent(Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
        this.content.setValue(pVar);
    }

    private final void setParentLayoutCoordinates(InterfaceC5116v interfaceC5116v) {
        this.parentLayoutCoordinates.setValue(interfaceC5116v);
    }

    private final void w(s properties) {
        if (C3862t.b(this.properties, properties)) {
            return;
        }
        if (properties.getUsePlatformDefaultWidth() && !this.properties.getUsePlatformDefaultWidth()) {
            WindowManager.LayoutParams layoutParams = this.params;
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        this.properties = properties;
        this.params.flags = androidx.compose.ui.window.c.i(properties, androidx.compose.ui.window.c.j(this.composeView));
        this.popupLayoutHelper.a(this.windowManager, this, this.params);
    }

    @Override // androidx.compose.ui.platform.AbstractC2004a
    public void a(InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-857613600);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.l(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(-857613600, i11, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
            }
            getContent().invoke(interfaceC1554lR, 0);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new d(i10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (event.getKeyCode() == 4 && this.properties.getDismissOnBackPress()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            }
            if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                Ba.a<C4153F> aVar = this.onDismissRequest;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // androidx.compose.ui.platform.AbstractC2004a
    public void g(boolean changed, int left, int top, int right, int bottom) {
        View childAt;
        super.g(changed, left, top, right, bottom);
        if (this.properties.getUsePlatformDefaultWidth() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.params.width = childAt.getMeasuredWidth();
        this.params.height = childAt.getMeasuredHeight();
        this.popupLayoutHelper.a(this.windowManager, this, this.params);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition.getValue()).booleanValue();
    }

    /* renamed from: getParams$ui_release, reason: from getter */
    public final WindowManager.LayoutParams getParams() {
        return this.params;
    }

    public final U0.t getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final U0.r m0getPopupContentSizebOM6tXw() {
        return (U0.r) this.popupContentSize.getValue();
    }

    public final r getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.ui.platform.AbstractC2004a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    @Override // androidx.compose.ui.platform.n1
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return super.getViewRoot();
    }

    @Override // androidx.compose.ui.platform.AbstractC2004a
    public void h(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.properties.getUsePlatformDefaultWidth()) {
            super.h(widthMeasureSpec, heightMeasureSpec);
        } else {
            super.h(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final void m() {
        android.view.View.b(this, null);
        this.windowManager.removeViewImmediate(this);
    }

    @Override // androidx.compose.ui.platform.AbstractC2004a, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotStateObserver.s();
        n();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.snapshotStateObserver.t();
        this.snapshotStateObserver.j();
        o();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (!this.properties.getDismissOnClickOutside()) {
            return super.onTouchEvent(event);
        }
        if (event != null && event.getAction() == 0 && (event.getX() < 0.0f || event.getX() >= getWidth() || event.getY() < 0.0f || event.getY() >= getHeight())) {
            Ba.a<C4153F> aVar = this.onDismissRequest;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (event == null || event.getAction() != 4) {
            return super.onTouchEvent(event);
        }
        Ba.a<C4153F> aVar2 = this.onDismissRequest;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    public final void p() {
        int[] iArr = this.locationOnScreen;
        int i10 = iArr[0];
        int i11 = iArr[1];
        this.composeView.getLocationOnScreen(iArr);
        int[] iArr2 = this.locationOnScreen;
        if (i10 == iArr2[0] && i11 == iArr2[1]) {
            return;
        }
        u();
    }

    public final void q(AbstractC1564q parent, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public final void r() {
        this.windowManager.addView(this, this.params);
    }

    public final void setParentLayoutDirection(U0.t tVar) {
        this.parentLayoutDirection = tVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m1setPopupContentSizefhxjrPA(U0.r rVar) {
        this.popupContentSize.setValue(rVar);
    }

    public final void setPositionProvider(r rVar) {
        this.positionProvider = rVar;
    }

    public final void setTestTag(String str) {
        this.testTag = str;
    }

    public final void t(Ba.a<C4153F> onDismissRequest, s properties, String testTag, U0.t layoutDirection) {
        this.onDismissRequest = onDismissRequest;
        this.testTag = testTag;
        w(properties);
        s(layoutDirection);
    }

    public final void u() {
        InterfaceC5116v parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.L()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jA = parentLayoutCoordinates.a();
            long jF = C5117w.f(parentLayoutCoordinates);
            U0.p pVarA = U0.q.a(U0.o.a(Math.round(C3476g.m(jF)), Math.round(C3476g.n(jF))), jA);
            if (C3862t.b(pVarA, this.parentBounds)) {
                return;
            }
            this.parentBounds = pVarA;
            x();
        }
    }

    public final void v(InterfaceC5116v parentLayoutCoordinates) {
        setParentLayoutCoordinates(parentLayoutCoordinates);
        u();
    }

    public final void x() {
        U0.r rVarM0getPopupContentSizebOM6tXw;
        U0.p pVar = this.parentBounds;
        if (pVar == null || (rVarM0getPopupContentSizebOM6tXw = m0getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long packedValue = rVarM0getPopupContentSizebOM6tXw.getPackedValue();
        Rect rect = this.previousWindowVisibleFrame;
        this.popupLayoutHelper.c(this.composeView, rect);
        U0.p pVarK = androidx.compose.ui.window.c.k(rect);
        long jA = U0.s.a(pVarK.l(), pVarK.f());
        N n10 = new N();
        n10.f43977B = U0.n.INSTANCE.a();
        this.snapshotStateObserver.o(this, f23716i0, new h(n10, this, pVar, jA, packedValue));
        this.params.x = U0.n.h(n10.f43977B);
        this.params.y = U0.n.i(n10.f43977B);
        if (this.properties.getExcludeFromSystemGesture()) {
            this.popupLayoutHelper.b(this, U0.r.g(jA), U0.r.f(jA));
        }
        this.popupLayoutHelper.a(this.windowManager, this, this.params);
    }

    public l(Ba.a<C4153F> aVar, s sVar, String str, View view, U0.d dVar, r rVar, UUID uuid, n nVar) {
        super(view.getContext(), null, 0, 6, null);
        this.onDismissRequest = aVar;
        this.properties = sVar;
        this.testTag = str;
        this.composeView = view;
        this.popupLayoutHelper = nVar;
        Object systemService = view.getContext().getSystemService("window");
        C3862t.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        this.params = l();
        this.positionProvider = rVar;
        this.parentLayoutDirection = U0.t.Ltr;
        this.popupContentSize = r1.c(null, null, 2, null);
        this.parentLayoutCoordinates = r1.c(null, null, 2, null);
        this.canCalculatePosition = m1.d(new f());
        float fU = U0.h.u(8);
        this.maxSupportedElevation = fU;
        this.previousWindowVisibleFrame = new Rect();
        this.snapshotStateObserver = new androidx.compose.runtime.snapshots.l(new g());
        setId(R.id.content);
        android.view.View.b(this, android.view.View.a(view));
        C2098e0.b(this, C2098e0.a(view));
        C4550g.b(this, C4550g.a(view));
        setTag(b0.l.f29942H, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.X0(fU));
        setOutlineProvider(new a());
        this.content = r1.c(androidx.compose.ui.window.h.f23692a.a(), null, 2, null);
        this.locationOnScreen = new int[2];
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    @Override // androidx.compose.ui.platform.n1
    public AbstractC2004a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }
}
