package androidx.compose.ui.viewinterop;

import A0.G;
import A0.m0;
import A0.n0;
import A0.o0;
import F0.x;
import U0.y;
import U0.z;
import Xb.C1841i;
import Xb.I;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.view.InterfaceC2114v;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.C2036q;
import androidx.compose.ui.platform.C2054z0;
import androidx.compose.ui.platform.v1;
import androidx.compose.ui.viewinterop.c;
import b0.i;
import com.apptionlabs.di.BuildConfig;
import h0.C3476g;
import h0.C3477h;
import i0.C3545H;
import i0.InterfaceC3586l0;
import java.util.List;
import kotlin.AbstractC1564q;
import kotlin.InterfaceC1552k;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import s1.F;
import s1.H;
import t3.C4550g;
import t3.InterfaceC4549f;
import ta.InterfaceC4588d;
import u0.C4624J;
import ua.C4696b;
import x0.C5047a;
import y0.InterfaceC5112q;
import y0.InterfaceC5116v;
import y0.J;
import y0.K;
import y0.Z;
import y0.r;

/* compiled from: AndroidViewHolder.android.kt */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 Ò\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001-B9\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010 J\u001f\u0010%\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tH\u0014¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u001e¢\u0006\u0004\b'\u0010 J7\u0010.\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH\u0014¢\u0006\u0004\b.\u0010/J\u0011\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u001e2\u0006\u00103\u001a\u00020(H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u001eH\u0014¢\u0006\u0004\b6\u0010 J\u000f\u00107\u001a\u00020\u001eH\u0014¢\u0006\u0004\b7\u0010 J%\u0010=\u001a\u0004\u0018\u00010<2\b\u00109\u001a\u0004\u0018\u0001082\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020\r2\u0006\u0010@\u001a\u00020\rH\u0016¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u001e¢\u0006\u0004\bC\u0010 J\u0017\u0010E\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020\tH\u0014¢\u0006\u0004\bE\u0010FJ\u0019\u0010I\u001a\u00020(2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020(H\u0016¢\u0006\u0004\bK\u0010LJ/\u0010*\u001a\u00020(2\u0006\u0010?\u001a\u00020\r2\u0006\u0010@\u001a\u00020\r2\u0006\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010OJ\u000f\u0010P\u001a\u00020\tH\u0016¢\u0006\u0004\bP\u0010QJ/\u0010R\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020\r2\u0006\u0010@\u001a\u00020\r2\u0006\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\tH\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010T\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020\r2\u0006\u0010N\u001a\u00020\tH\u0016¢\u0006\u0004\bT\u0010UJG\u0010[\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020\r2\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020\t2\u0006\u0010X\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010N\u001a\u00020\t2\u0006\u0010Z\u001a\u000208H\u0016¢\u0006\u0004\b[\u0010\\J?\u0010]\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020\r2\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020\t2\u0006\u0010X\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010N\u001a\u00020\tH\u0016¢\u0006\u0004\b]\u0010^J7\u0010a\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020\r2\u0006\u0010_\u001a\u00020\t2\u0006\u0010`\u001a\u00020\t2\u0006\u0010Z\u001a\u0002082\u0006\u0010N\u001a\u00020\tH\u0016¢\u0006\u0004\ba\u0010bJ/\u0010f\u001a\u00020(2\u0006\u0010@\u001a\u00020\r2\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020c2\u0006\u0010Z\u001a\u00020(H\u0016¢\u0006\u0004\bf\u0010gJ'\u0010h\u001a\u00020(2\u0006\u0010@\u001a\u00020\r2\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020cH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020(H\u0016¢\u0006\u0004\bj\u0010LR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR6\u0010|\u001a\b\u0012\u0004\u0012\u00020\u001e0t2\f\u0010u\u001a\b\u0012\u0004\u0012\u00020\u001e0t8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u0016\u0010\u007f\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R;\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0t2\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0t8\u0006@DX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010w\u001a\u0005\b\u0082\u0001\u0010y\"\u0005\b\u0083\u0001\u0010{R:\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0t2\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0t8\u0006@DX\u0086\u000e¢\u0006\u0014\n\u0004\bl\u0010w\u001a\u0005\b\u0085\u0001\u0010y\"\u0005\b\u0086\u0001\u0010{R3\u0010\u008f\u0001\u001a\u00030\u0088\u00012\u0007\u0010u\u001a\u00030\u0088\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R9\u0010\u0097\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0088\u0001\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0090\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R3\u0010\u009f\u0001\u001a\u00030\u0098\u00012\u0007\u0010u\u001a\u00030\u0098\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R9\u0010£\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0090\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b \u0001\u0010\u0092\u0001\u001a\u0006\b¡\u0001\u0010\u0094\u0001\"\u0006\b¢\u0001\u0010\u0096\u0001R7\u0010«\u0001\u001a\u0005\u0018\u00010¤\u00012\t\u0010u\u001a\u0005\u0018\u00010¤\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R7\u0010³\u0001\u001a\u0005\u0018\u00010¬\u00012\t\u0010u\u001a\u0005\u0018\u00010¬\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R\u001c\u0010µ\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b´\u0001\u0010wR\u001c\u0010·\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¶\u0001\u0010wR8\u0010»\u0001\u001a\u0011\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0090\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¸\u0001\u0010\u0092\u0001\u001a\u0006\b¹\u0001\u0010\u0094\u0001\"\u0006\bº\u0001\u0010\u0096\u0001R\u0016\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0018\u0010¿\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¾\u0001\u0010lR\u0018\u0010Á\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÀ\u0001\u0010lR\u0018\u0010Å\u0001\u001a\u00030Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u0018\u0010Ç\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÆ\u0001\u0010~R\u001d\u0010Í\u0001\u001a\u00030È\u00018\u0006¢\u0006\u0010\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001R\u0018\u0010Ñ\u0001\u001a\u00030Î\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0016\u0010Ó\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010L¨\u0006Ô\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/c;", "Landroid/view/ViewGroup;", "Ls1/F;", "LO/k;", "LA0/n0;", "Landroid/content/Context;", "context", "LO/q;", "parentContext", "", "compositeKeyHash", "Lt0/b;", "dispatcher", "Landroid/view/View;", "view", "LA0/m0;", "owner", "<init>", "(Landroid/content/Context;LO/q;ILt0/b;Landroid/view/View;LA0/m0;)V", "min", "max", "preferred", "u", "(III)I", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Loa/F;", "p", "()V", "i", "a", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "v", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "child", "target", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "s", "visibility", "onWindowVisibilityChanged", "(I)V", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "(Landroid/graphics/Region;)Z", "shouldDelayChildPressedState", "()Z", "axes", "type", "(Landroid/view/View;Landroid/view/View;II)Z", "getNestedScrollAxes", "()I", "m", "(Landroid/view/View;Landroid/view/View;II)V", "n", "(Landroid/view/View;I)V", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "j", "(Landroid/view/View;IIIII[I)V", "k", "(Landroid/view/View;IIIII)V", "dx", "dy", "o", "(Landroid/view/View;II[II)V", "", "velocityX", "velocityY", "onNestedFling", "(Landroid/view/View;FFZ)Z", "onNestedPreFling", "(Landroid/view/View;FF)Z", "isNestedScrollingEnabled", "B", "I", "C", "Lt0/b;", "D", "Landroid/view/View;", "getView", "E", "LA0/m0;", "Lkotlin/Function0;", "value", "F", "LBa/a;", "getUpdate", "()LBa/a;", "setUpdate", "(LBa/a;)V", "update", "G", "Z", "hasUpdateBlock", "<set-?>", "H", "getReset", "setReset", "reset", "getRelease", "setRelease", BuildConfig.BUILD_TYPE, "Lb0/i;", "J", "Lb0/i;", "getModifier", "()Lb0/i;", "setModifier", "(Lb0/i;)V", "modifier", "Lkotlin/Function1;", "K", "LBa/l;", "getOnModifierChanged$ui_release", "()LBa/l;", "setOnModifierChanged$ui_release", "(LBa/l;)V", "onModifierChanged", "LU0/d;", "L", "LU0/d;", "getDensity", "()LU0/d;", "setDensity", "(LU0/d;)V", "density", "M", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onDensityChanged", "Landroidx/lifecycle/v;", "N", "Landroidx/lifecycle/v;", "getLifecycleOwner", "()Landroidx/lifecycle/v;", "setLifecycleOwner", "(Landroidx/lifecycle/v;)V", "lifecycleOwner", "Lt3/f;", "O", "Lt3/f;", "getSavedStateRegistryOwner", "()Lt3/f;", "setSavedStateRegistryOwner", "(Lt3/f;)V", "savedStateRegistryOwner", "P", "runUpdate", "Q", "runInvalidate", "R", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "onRequestDisallowInterceptTouchEvent", "S", "[I", "T", "lastWidthMeasureSpec", "U", "lastHeightMeasureSpec", "Ls1/H;", "V", "Ls1/H;", "nestedScrollingParentHelper", "W", "isDrawing", "LA0/G;", "a0", "LA0/G;", "getLayoutNode", "()LA0/G;", "layoutNode", "LA0/o0;", "getSnapshotObserver", "()LA0/o0;", "snapshotObserver", "b0", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class c extends ViewGroup implements F, InterfaceC1552k, n0 {

    /* renamed from: c0, reason: collision with root package name */
    public static final int f23517c0 = 8;

    /* renamed from: d0, reason: collision with root package name */
    private static final Ba.l<c, C4153F> f23518d0 = a.f23542B;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int compositeKeyHash;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final t0.b dispatcher;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final m0 owner;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private Ba.a<C4153F> update;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private boolean hasUpdateBlock;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private Ba.a<C4153F> reset;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private Ba.a<C4153F> release;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private b0.i modifier;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super b0.i, C4153F> onModifierChanged;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private U0.d density;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super U0.d, C4153F> onDensityChanged;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private InterfaceC2114v lifecycleOwner;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4549f savedStateRegistryOwner;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<C4153F> runUpdate;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<C4153F> runInvalidate;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super Boolean, C4153F> onRequestDisallowInterceptTouchEvent;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final int[] location;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private int lastWidthMeasureSpec;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private int lastHeightMeasureSpec;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private final H nestedScrollingParentHelper;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private boolean isDrawing;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private final G layoutNode;

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/viewinterop/c;", "it", "Loa/F;", "b", "(Landroidx/compose/ui/viewinterop/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<c, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f23542B = new a();

        a() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Ba.a aVar) {
            aVar.invoke();
        }

        public final void b(c cVar) {
            Handler handler = cVar.getHandler();
            final Ba.a aVar = cVar.runUpdate;
            handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.a.c(aVar);
                }
            });
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(c cVar) {
            b(cVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb0/i;", "it", "Loa/F;", "a", "(Lb0/i;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.viewinterop.c$c, reason: collision with other inner class name */
    static final class C0336c extends AbstractC3864v implements Ba.l<b0.i, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ G f23543B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ b0.i f23544C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0336c(G g10, b0.i iVar) {
            super(1);
            this.f23543B = g10;
            this.f23544C = iVar;
        }

        public final void a(b0.i iVar) {
            this.f23543B.e(iVar.e(this.f23544C));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(b0.i iVar) {
            a(iVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/d;", "it", "Loa/F;", "a", "(LU0/d;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.l<U0.d, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ G f23545B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(G g10) {
            super(1);
            this.f23545B = g10;
        }

        public final void a(U0.d dVar) {
            this.f23545B.c(dVar);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(U0.d dVar) {
            a(dVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/m0;", "owner", "Loa/F;", "a", "(LA0/m0;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements Ba.l<m0, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ G f23547C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(G g10) {
            super(1);
            this.f23547C = g10;
        }

        public final void a(m0 m0Var) {
            C2036q c2036q = m0Var instanceof C2036q ? (C2036q) m0Var : null;
            if (c2036q != null) {
                c2036q.Z(c.this, this.f23547C);
            }
            ViewParent parent = c.this.getView().getParent();
            c cVar = c.this;
            if (parent != cVar) {
                cVar.addView(cVar.getView());
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(m0 m0Var) {
            a(m0Var);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/m0;", "owner", "Loa/F;", "a", "(LA0/m0;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends AbstractC3864v implements Ba.l<m0, C4153F> {
        f() {
            super(1);
        }

        public final void a(m0 m0Var) {
            C2036q c2036q = m0Var instanceof C2036q ? (C2036q) m0Var : null;
            if (c2036q != null) {
                c2036q.I0(c.this);
            }
            c.this.removeAllViewsInLayout();
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(m0 m0Var) {
            a(m0Var);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk0/f;", "Loa/F;", "a", "(Lk0/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends AbstractC3864v implements Ba.l<k0.f, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ G f23556C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ c f23557D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(G g10, c cVar) {
            super(1);
            this.f23556C = g10;
            this.f23557D = cVar;
        }

        public final void a(k0.f fVar) {
            c cVar = c.this;
            G g10 = this.f23556C;
            c cVar2 = this.f23557D;
            InterfaceC3586l0 interfaceC3586l0G = fVar.getDrawContext().G();
            if (cVar.getView().getVisibility() != 8) {
                cVar.isDrawing = true;
                m0 owner = g10.getOwner();
                C2036q c2036q = owner instanceof C2036q ? (C2036q) owner : null;
                if (c2036q != null) {
                    c2036q.i0(cVar2, C3545H.d(interfaceC3586l0G));
                }
                cVar.isDrawing = false;
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(k0.f fVar) {
            a(fVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly0/v;", "it", "Loa/F;", "a", "(Ly0/v;)V"}, k = 3, mv = {1, 8, 0})
    static final class j extends AbstractC3864v implements Ba.l<InterfaceC5116v, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ G f23559C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(G g10) {
            super(1);
            this.f23559C = g10;
        }

        public final void a(InterfaceC5116v interfaceC5116v) {
            androidx.compose.ui.viewinterop.d.f(c.this, this.f23559C);
            c.this.owner.m(c.this);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC5116v interfaceC5116v) {
            a(interfaceC5116v);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {565, 570}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class k extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f23560B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ boolean f23561C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ c f23562D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f23563E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z10, c cVar, long j10, InterfaceC4588d<? super k> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f23561C = z10;
            this.f23562D = cVar;
            this.f23563E = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new k(this.f23561C, this.f23562D, this.f23563E, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((k) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f23560B;
            if (i10 == 0) {
                C4173r.b(obj);
                if (this.f23561C) {
                    t0.b bVar = this.f23562D.dispatcher;
                    long j10 = this.f23563E;
                    long jA = y.INSTANCE.a();
                    this.f23560B = 2;
                    if (bVar.a(j10, jA, this) == objE) {
                        return objE;
                    }
                } else {
                    t0.b bVar2 = this.f23562D.dispatcher;
                    long jA2 = y.INSTANCE.a();
                    long j11 = this.f23563E;
                    this.f23560B = 1;
                    if (bVar2.a(jA2, j11, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {583}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f23564B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f23566D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(long j10, InterfaceC4588d<? super l> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f23566D = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return c.this.new l(this.f23566D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((l) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f23564B;
            if (i10 == 0) {
                C4173r.b(obj);
                t0.b bVar = c.this.dispatcher;
                long j10 = this.f23566D;
                this.f23564B = 1;
                if (bVar.c(j10, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class o extends AbstractC3864v implements Ba.a<C4153F> {
        o() {
            super(0);
        }

        public final void a() {
            c.this.getLayoutNode().D0();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class p extends AbstractC3864v implements Ba.a<C4153F> {
        p() {
            super(0);
        }

        public final void a() {
            if (c.this.hasUpdateBlock && c.this.isAttachedToWindow()) {
                ViewParent parent = c.this.getView().getParent();
                c cVar = c.this;
                if (parent == cVar) {
                    cVar.getSnapshotObserver().i(c.this, c.f23518d0, c.this.getUpdate());
                }
            }
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    public c(Context context, AbstractC1564q abstractC1564q, int i10, t0.b bVar, View view, m0 m0Var) {
        super(context);
        this.compositeKeyHash = i10;
        this.dispatcher = bVar;
        this.view = view;
        this.owner = m0Var;
        if (abstractC1564q != null) {
            v1.i(this, abstractC1564q);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.update = q.f23571B;
        this.reset = n.f23568B;
        this.release = m.f23567B;
        i.Companion companion = b0.i.INSTANCE;
        this.modifier = companion;
        this.density = U0.f.b(1.0f, 0.0f, 2, null);
        this.runUpdate = new p();
        this.runInvalidate = new o();
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new H(this);
        G g10 = new G(false, 0, 3, null);
        g10.C1(this);
        b0.i iVarA = androidx.compose.ui.layout.c.a(androidx.compose.ui.draw.a.a(C4624J.a(F0.o.c(androidx.compose.ui.input.nestedscroll.a.a(companion, androidx.compose.ui.viewinterop.d.f23572a, bVar), true, h.f23554B), this), new i(g10, this)), new j(g10));
        g10.g(i10);
        g10.e(this.modifier.e(iVarA));
        this.onModifierChanged = new C0336c(g10, iVarA);
        g10.c(this.density);
        this.onDensityChanged = new d(g10);
        g10.G1(new e(g10));
        g10.H1(new f());
        g10.f(new g(g10));
        this.layoutNode = g10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o0 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            C5047a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.owner.getSnapshotObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(Ba.a aVar) {
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int u(int min, int max, int preferred) {
        return (preferred >= 0 || min == max) ? View.MeasureSpec.makeMeasureSpec(Ha.g.k(preferred, min, max), 1073741824) : (preferred != -2 || max == Integer.MAX_VALUE) ? (preferred != -1 || max == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(max, 1073741824) : View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
    }

    @Override // kotlin.InterfaceC1552k
    public void a() {
        this.release.invoke();
    }

    @Override // A0.n0
    public boolean b0() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i10 = iArr[0];
        region.op(i10, iArr[1], i10 + getWidth(), this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final U0.d getDensity() {
        return this.density;
    }

    /* renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final G getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC2114v getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final b0.i getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.a();
    }

    public final Ba.l<U0.d, C4153F> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    public final Ba.l<b0.i, C4153F> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    public final Ba.l<Boolean, C4153F> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final Ba.a<C4153F> getRelease() {
        return this.release;
    }

    public final Ba.a<C4153F> getReset() {
        return this.reset;
    }

    public final InterfaceC4549f getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final Ba.a<C4153F> getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    @Override // kotlin.InterfaceC1552k
    public void i() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] location, Rect dirty) {
        super.invalidateChildInParent(location, dirty);
        s();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // s1.F
    public void j(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (isNestedScrollingEnabled()) {
            long jB = this.dispatcher.b(C3477h.a(androidx.compose.ui.viewinterop.d.g(dxConsumed), androidx.compose.ui.viewinterop.d.g(dyConsumed)), C3477h.a(androidx.compose.ui.viewinterop.d.g(dxUnconsumed), androidx.compose.ui.viewinterop.d.g(dyUnconsumed)), androidx.compose.ui.viewinterop.d.i(type));
            consumed[0] = C2054z0.b(C3476g.m(jB));
            consumed[1] = C2054z0.b(C3476g.n(jB));
        }
    }

    @Override // s1.E
    public void k(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (isNestedScrollingEnabled()) {
            this.dispatcher.b(C3477h.a(androidx.compose.ui.viewinterop.d.g(dxConsumed), androidx.compose.ui.viewinterop.d.g(dyConsumed)), C3477h.a(androidx.compose.ui.viewinterop.d.g(dxUnconsumed), androidx.compose.ui.viewinterop.d.g(dyUnconsumed)), androidx.compose.ui.viewinterop.d.i(type));
        }
    }

    @Override // s1.E
    public boolean l(View child, View target, int axes, int type) {
        return ((axes & 2) == 0 && (axes & 1) == 0) ? false : true;
    }

    @Override // s1.E
    public void m(View child, View target, int axes, int type) {
        this.nestedScrollingParentHelper.c(child, target, axes, type);
    }

    @Override // s1.E
    public void n(View target, int type) {
        this.nestedScrollingParentHelper.e(target, type);
    }

    @Override // s1.E
    public void o(View target, int dx, int dy, int[] consumed, int type) {
        if (isNestedScrollingEnabled()) {
            long jD = this.dispatcher.d(C3477h.a(androidx.compose.ui.viewinterop.d.g(dx), androidx.compose.ui.viewinterop.d.g(dy)), androidx.compose.ui.viewinterop.d.i(type));
            consumed[0] = C2054z0.b(C3476g.m(jD));
            consumed[1] = C2054z0.b(C3476g.n(jD));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View child, View target) {
        super.onDescendantInvalidated(child, target);
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
        this.view.layout(0, 0, r10 - l10, b10 - t10);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = widthMeasureSpec;
        this.lastHeightMeasureSpec = heightMeasureSpec;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C1841i.d(this.dispatcher.e(), null, null, new k(consumed, this, z.a(androidx.compose.ui.viewinterop.d.h(velocityX), androidx.compose.ui.viewinterop.d.h(velocityY)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C1841i.d(this.dispatcher.e(), null, null, new l(z.a(androidx.compose.ui.viewinterop.d.h(velocityX), androidx.compose.ui.viewinterop.d.h(velocityY)), null), 3, null);
        return false;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
    }

    @Override // kotlin.InterfaceC1552k
    public void p() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        Ba.l<? super Boolean, C4153F> lVar = this.onRequestDisallowInterceptTouchEvent;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(disallowIntercept));
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public final void s() {
        if (!this.isDrawing) {
            this.layoutNode.D0();
            return;
        }
        View view = this.view;
        final Ba.a<C4153F> aVar = this.runInvalidate;
        view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.a
            @Override // java.lang.Runnable
            public final void run() {
                c.t(aVar);
            }
        });
    }

    public final void setDensity(U0.d dVar) {
        if (dVar != this.density) {
            this.density = dVar;
            Ba.l<? super U0.d, C4153F> lVar = this.onDensityChanged;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC2114v interfaceC2114v) {
        if (interfaceC2114v != this.lifecycleOwner) {
            this.lifecycleOwner = interfaceC2114v;
            android.view.View.b(this, interfaceC2114v);
        }
    }

    public final void setModifier(b0.i iVar) {
        if (iVar != this.modifier) {
            this.modifier = iVar;
            Ba.l<? super b0.i, C4153F> lVar = this.onModifierChanged;
            if (lVar != null) {
                lVar.invoke(iVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Ba.l<? super U0.d, C4153F> lVar) {
        this.onDensityChanged = lVar;
    }

    public final void setOnModifierChanged$ui_release(Ba.l<? super b0.i, C4153F> lVar) {
        this.onModifierChanged = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Ba.l<? super Boolean, C4153F> lVar) {
        this.onRequestDisallowInterceptTouchEvent = lVar;
    }

    protected final void setRelease(Ba.a<C4153F> aVar) {
        this.release = aVar;
    }

    protected final void setReset(Ba.a<C4153F> aVar) {
        this.reset = aVar;
    }

    public final void setSavedStateRegistryOwner(InterfaceC4549f interfaceC4549f) {
        if (interfaceC4549f != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = interfaceC4549f;
            C4550g.b(this, interfaceC4549f);
        }
    }

    protected final void setUpdate(Ba.a<C4153F> aVar) {
        this.update = aVar;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public final void v() {
        int i10;
        int i11 = this.lastWidthMeasureSpec;
        if (i11 == Integer.MIN_VALUE || (i10 = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i11, i10);
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class m extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final m f23567B = new m();

        m() {
            super(0);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }

        public final void a() {
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class n extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final n f23568B = new n();

        n() {
            super(0);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }

        public final void a() {
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class q extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final q f23571B = new q();

        q() {
            super(0);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }

        public final void a() {
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J,\u0010\u000f\u001a\u00020\u000e*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0015\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J)\u0010\u0016\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"androidx/compose/ui/viewinterop/c$g", "Ly0/I;", "", "height", "b", "(I)I", "width", "a", "Ly0/K;", "", "Ly0/H;", "measurables", "LU0/b;", "constraints", "Ly0/J;", "e", "(Ly0/K;Ljava/util/List;J)Ly0/J;", "Ly0/r;", "Ly0/q;", "c", "(Ly0/r;Ljava/util/List;I)I", "d", "h", "i", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g implements y0.I {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G f23550b;

        /* compiled from: AndroidViewHolder.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ c f23552B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ G f23553C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c cVar, G g10) {
                super(1);
                this.f23552B = cVar;
                this.f23553C = g10;
            }

            public final void a(Z.a aVar) {
                androidx.compose.ui.viewinterop.d.f(this.f23552B, this.f23553C);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
                a(aVar);
                return C4153F.f46609a;
            }
        }

        g(G g10) {
            this.f23550b = g10;
        }

        private final int a(int width) {
            c cVar = c.this;
            ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
            C3862t.d(layoutParams);
            cVar.measure(cVar.u(0, width, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return c.this.getMeasuredHeight();
        }

        private final int b(int height) {
            c cVar = c.this;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            c cVar2 = c.this;
            ViewGroup.LayoutParams layoutParams = cVar2.getLayoutParams();
            C3862t.d(layoutParams);
            cVar.measure(iMakeMeasureSpec, cVar2.u(0, height, layoutParams.height));
            return c.this.getMeasuredWidth();
        }

        @Override // y0.I
        public int c(r rVar, List<? extends InterfaceC5112q> list, int i10) {
            return b(i10);
        }

        @Override // y0.I
        public int d(r rVar, List<? extends InterfaceC5112q> list, int i10) {
            return b(i10);
        }

        @Override // y0.I
        public J e(K k10, List<? extends y0.H> list, long j10) {
            if (c.this.getChildCount() == 0) {
                return K.E1(k10, U0.b.n(j10), U0.b.m(j10), null, a.f23551B, 4, null);
            }
            if (U0.b.n(j10) != 0) {
                c.this.getChildAt(0).setMinimumWidth(U0.b.n(j10));
            }
            if (U0.b.m(j10) != 0) {
                c.this.getChildAt(0).setMinimumHeight(U0.b.m(j10));
            }
            c cVar = c.this;
            int iN = U0.b.n(j10);
            int iL = U0.b.l(j10);
            ViewGroup.LayoutParams layoutParams = c.this.getLayoutParams();
            C3862t.d(layoutParams);
            int iU = cVar.u(iN, iL, layoutParams.width);
            c cVar2 = c.this;
            int iM = U0.b.m(j10);
            int iK = U0.b.k(j10);
            ViewGroup.LayoutParams layoutParams2 = c.this.getLayoutParams();
            C3862t.d(layoutParams2);
            cVar.measure(iU, cVar2.u(iM, iK, layoutParams2.height));
            return K.E1(k10, c.this.getMeasuredWidth(), c.this.getMeasuredHeight(), null, new b(c.this, this.f23550b), 4, null);
        }

        @Override // y0.I
        public int h(r rVar, List<? extends InterfaceC5112q> list, int i10) {
            return a(i10);
        }

        @Override // y0.I
        public int i(r rVar, List<? extends InterfaceC5112q> list, int i10) {
            return a(i10);
        }

        /* compiled from: AndroidViewHolder.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final a f23551B = new a();

            a() {
                super(1);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
                a(aVar);
                return C4153F.f46609a;
            }

            public final void a(Z.a aVar) {
            }
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF0/x;", "Loa/F;", "a", "(LF0/x;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends AbstractC3864v implements Ba.l<x, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final h f23554B = new h();

        h() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(x xVar) {
            a(xVar);
            return C4153F.f46609a;
        }

        public final void a(x xVar) {
        }
    }
}
