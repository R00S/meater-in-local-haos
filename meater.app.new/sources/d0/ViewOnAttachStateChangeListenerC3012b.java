package d0;

import A0.G;
import A0.m0;
import F0.AccessibilityAction;
import F0.m;
import F0.p;
import F0.s;
import F0.w;
import H0.C1060d;
import H0.TextLayoutInput;
import H0.TextLayoutResult;
import U0.v;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.InterfaceC2097e;
import android.view.InterfaceC2114v;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.platform.C2036q;
import androidx.compose.ui.platform.U0;
import androidx.compose.ui.platform.V0;
import androidx.compose.ui.platform.W0;
import d0.ViewOnAttachStateChangeListenerC3012b;
import h0.C3478i;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import r1.C4336c;
import s.AbstractC4405o;
import s.C4380B;
import s.C4381C;
import s.C4392b;
import s.C4406p;
import ta.InterfaceC4588d;
import x0.C5047a;

/* compiled from: AndroidContentCaptureManager.android.kt */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0099\u0001@B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u0004\u0018\u00010$*\u00020\u000bH\u0002¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000fH\u0002¢\u0006\u0004\b-\u0010\u001fJ\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000bH\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000bH\u0002¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000bH\u0002¢\u0006\u0004\b2\u00100J\u000f\u00103\u001a\u00020\u000fH\u0002¢\u0006\u0004\b3\u0010\u001fJ\u000f\u00104\u001a\u00020\u000fH\u0002¢\u0006\u0004\b4\u0010\u001fJ\u000f\u00105\u001a\u00020\u000fH\u0002¢\u0006\u0004\b5\u0010\u001fJ\u0017\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u000f2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b:\u00109J\u0017\u0010=\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b?\u0010>J\u0010\u0010@\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b@\u0010AJ\u000f\u00107\u001a\u00020\u000fH\u0000¢\u0006\u0004\b7\u0010\u001fJ\u0017\u0010B\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\bB\u0010#J\u000f\u0010C\u001a\u00020\u000fH\u0000¢\u0006\u0004\bC\u0010\u001fJ\u000f\u0010D\u001a\u00020\u000fH\u0000¢\u0006\u0004\bD\u0010\u001fJ\u000f\u0010E\u001a\u00020\u000fH\u0000¢\u0006\u0004\bE\u0010\u001fJ/\u0010M\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020H2\u000e\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010K0JH\u0001¢\u0006\u0004\bM\u0010NJ'\u0010S\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u00002\u000e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0PH\u0001¢\u0006\u0004\bS\u0010TR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010U\u001a\u0004\bV\u0010WR*\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R*\u0010c\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b/\u0010]\u0012\u0004\bb\u0010\u001f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020$0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010eR\u0014\u0010i\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010hR\u0016\u0010l\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010kR\u0016\u0010p\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010t\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020 0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010vR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020\u000f0x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u001c\u0010\u0081\u0001\u001a\u00020|8\u0000X\u0080\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R.\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138@@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0005\b\u0086\u0001\u0010\u0017R\u0018\u0010\u0089\u0001\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010kR\u001e\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\r0d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010eR\u0019\u0010\u008e\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u0090\u0001\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010sR\u0018\u0010\u0094\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001e\u0010\u0098\u0001\u001a\u00020q8@X\u0080\u0004¢\u0006\u000f\u0012\u0005\b\u0097\u0001\u0010\u001f\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001¨\u0006\u009a\u0001"}, d2 = {"Ld0/b;", "Ld0/l;", "Landroidx/lifecycle/e;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/q;", "view", "Lkotlin/Function0;", "Landroidx/compose/ui/platform/coreshims/c;", "onContentCaptureSession", "<init>", "(Landroidx/compose/ui/platform/q;LBa/a;)V", "LF0/p;", "newNode", "Landroidx/compose/ui/platform/U0;", "oldNode", "Loa/F;", "A", "(LF0/p;Landroidx/compose/ui/platform/U0;)V", "y", "Ls/o;", "Landroidx/compose/ui/platform/V0;", "newSemanticsNodes", "h", "(Ls/o;)V", "", "id", "", "newText", "z", "(ILjava/lang/String;)V", "F", "()V", "LA0/G;", "layoutNode", "q", "(LA0/G;)V", "Landroidx/compose/ui/platform/coreshims/e;", "C", "(LF0/p;)Landroidx/compose/ui/platform/coreshims/e;", "virtualId", "viewStructure", "c", "(ILandroidx/compose/ui/platform/coreshims/e;)V", "g", "(I)V", "p", "node", "D", "(LF0/p;)V", "E", "G", "B", "n", "i", "Landroid/view/View;", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroidx/lifecycle/v;", "owner", "onStart", "(Landroidx/lifecycle/v;)V", "onStop", "b", "(Lta/d;)Ljava/lang/Object;", "u", "w", "t", "r", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "s", "([J[ILjava/util/function/Consumer;)V", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "x", "(Ld0/b;Landroid/util/LongSparseArray;)V", "Landroidx/compose/ui/platform/q;", "m", "()Landroidx/compose/ui/platform/q;", "LBa/a;", "getOnContentCaptureSession", "()LBa/a;", "setOnContentCaptureSession", "(LBa/a;)V", "Landroidx/compose/ui/platform/coreshims/c;", "getContentCaptureSession$ui_release", "()Landroidx/compose/ui/platform/coreshims/c;", "setContentCaptureSession$ui_release", "(Landroidx/compose/ui/platform/coreshims/c;)V", "getContentCaptureSession$ui_release$annotations", "contentCaptureSession", "Ls/B;", "Ls/B;", "bufferedAppearedNodes", "Ls/C;", "Ls/C;", "bufferedDisappearedNodes", "", "J", "SendRecurringContentCaptureEventsIntervalMillis", "Ld0/b$a;", "H", "Ld0/b$a;", "translateStatus", "", "I", "Z", "currentSemanticsNodesInvalidated", "Ls/b;", "Ls/b;", "subtreeChangedLayoutNodes", "LZb/g;", "K", "LZb/g;", "boundsUpdateChannel", "Landroid/os/Handler;", "L", "Landroid/os/Handler;", "getHandler$ui_release", "()Landroid/os/Handler;", "handler", "M", "Ls/o;", "l", "()Ls/o;", "setCurrentSemanticsNodes$ui_release", "currentSemanticsNodes", "N", "currentSemanticsNodesSnapshotTimestampMillis", "O", "previousSemanticsNodes", "P", "Landroidx/compose/ui/platform/U0;", "previousSemanticsRoot", "Q", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "R", "Ljava/lang/Runnable;", "contentCaptureChangeChecker", "o", "()Z", "isEnabled$ui_release$annotations", "isEnabled", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC3012b implements l, InterfaceC2097e, View.OnAttachStateChangeListener {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final C2036q view;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private Ba.a<? extends androidx.compose.ui.platform.coreshims.c> onContentCaptureSession;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.platform.coreshims.c contentCaptureSession;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final C4380B<androidx.compose.ui.platform.coreshims.e> bufferedAppearedNodes;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final C4381C bufferedDisappearedNodes;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final C4392b<G> subtreeChangedLayoutNodes;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private long currentSemanticsNodesSnapshotTimestampMillis;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private U0 previousSemanticsRoot;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private boolean checkingForSemanticsChanges;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private long SendRecurringContentCaptureEventsIntervalMillis = 100;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private a translateStatus = a.SHOW_ORIGINAL;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private boolean currentSemanticsNodesInvalidated = true;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final Zb.g<C4153F> boundsUpdateChannel = Zb.j.b(1, null, null, 6, null);

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private AbstractC4405o<V0> currentSemanticsNodes = C4406p.a();

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private C4380B<U0> previousSemanticsNodes = C4406p.b();

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private final Runnable contentCaptureChangeChecker = new Runnable() { // from class: d0.a
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnAttachStateChangeListenerC3012b.k(this.f39617B);
        }
    };

    /* compiled from: AndroidContentCaptureManager.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ld0/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d0.b$a */
    private enum a {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidContentCaptureManager.android.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"Ld0/b$b;", "", "<init>", "()V", "Ld0/b;", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "Loa/F;", "b", "(Ld0/b;Landroid/util/LongSparseArray;)V", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "c", "(Ld0/b;[J[ILjava/util/function/Consumer;)V", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d0.b$b, reason: collision with other inner class name */
    static final class C0505b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0505b f39638a = new C0505b();

        private C0505b() {
        }

        private final void b(ViewOnAttachStateChangeListenerC3012b contentCaptureManager, LongSparseArray<ViewTranslationResponse> response) {
            TranslationResponseValue value;
            CharSequence text;
            V0 v0C;
            p pVarB;
            AccessibilityAction accessibilityAction;
            Ba.l lVar;
            K kA = C4336c.a(response);
            while (kA.hasNext()) {
                long jB = kA.b();
                ViewTranslationResponse viewTranslationResponseA = C3018h.a(response.get(jB));
                if (viewTranslationResponseA != null && (value = viewTranslationResponseA.getValue("android:text")) != null && (text = value.getText()) != null && (v0C = contentCaptureManager.l().c((int) jB)) != null && (pVarB = v0C.getSemanticsNode()) != null && (accessibilityAction = (AccessibilityAction) m.a(pVarB.getUnmergedConfig(), F0.k.f4315a.y())) != null && (lVar = (Ba.l) accessibilityAction.a()) != null) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(ViewOnAttachStateChangeListenerC3012b viewOnAttachStateChangeListenerC3012b, LongSparseArray longSparseArray) {
            f39638a.b(viewOnAttachStateChangeListenerC3012b, longSparseArray);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(d0.ViewOnAttachStateChangeListenerC3012b r21, long[] r22, int[] r23, java.util.function.Consumer<android.view.translation.ViewTranslationRequest> r24) {
            /*
                r20 = this;
                r0 = r22
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L78
                r3 = r0[r2]
                s.o r5 = r21.l()
                int r3 = (int) r3
                java.lang.Object r3 = r5.c(r3)
                androidx.compose.ui.platform.V0 r3 = (androidx.compose.ui.platform.V0) r3
                if (r3 == 0) goto L73
                F0.p r3 = r3.getSemanticsNode()
                if (r3 == 0) goto L73
                d0.C3014d.a()
                androidx.compose.ui.platform.q r4 = r21.getView()
                android.view.autofill.AutofillId r4 = r4.getAutofillId()
                int r5 = r3.getId()
                long r5 = (long) r5
                android.view.translation.ViewTranslationRequest$Builder r4 = d0.C3013c.a(r4, r5)
                F0.l r3 = r3.getUnmergedConfig()
                F0.s r5 = F0.s.f4372a
                F0.w r5 = r5.D()
                java.lang.Object r3 = F0.m.a(r3, r5)
                r5 = r3
                java.util.List r5 = (java.util.List) r5
                if (r5 == 0) goto L73
                r12 = 62
                r13 = 0
                java.lang.String r6 = "\n"
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                java.lang.String r15 = W0.a.e(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                if (r15 == 0) goto L73
                H0.d r3 = new H0.d
                r16 = 0
                r17 = 0
                r18 = 6
                r19 = 0
                r14 = r3
                r14.<init>(r15, r16, r17, r18, r19)
                java.lang.String r5 = "android:text"
                android.view.translation.TranslationRequestValue r3 = d0.C3015e.a(r3)
                d0.C3016f.a(r4, r5, r3)
                android.view.translation.ViewTranslationRequest r3 = d0.C3017g.a(r4)
                r4 = r24
                r4.accept(r3)
                goto L75
            L73:
                r4 = r24
            L75:
                int r2 = r2 + 1
                goto L4
            L78:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d0.ViewOnAttachStateChangeListenerC3012b.C0505b.c(d0.b, long[], int[], java.util.function.Consumer):void");
        }

        public final void d(final ViewOnAttachStateChangeListenerC3012b contentCaptureManager, final LongSparseArray<ViewTranslationResponse> response) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (C3862t.b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                b(contentCaptureManager, response);
            } else {
                contentCaptureManager.getView().post(new Runnable() { // from class: d0.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnAttachStateChangeListenerC3012b.C0505b.e(contentCaptureManager, response);
                    }
                });
            }
        }
    }

    /* compiled from: AndroidContentCaptureManager.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", l = {186, 196}, m = "boundsUpdatesEventLoop$ui_release")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d0.b$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f39639B;

        /* renamed from: C, reason: collision with root package name */
        Object f39640C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f39641D;

        /* renamed from: F, reason: collision with root package name */
        int f39643F;

        c(InterfaceC4588d<? super c> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39641D = obj;
            this.f39643F |= Integer.MIN_VALUE;
            return ViewOnAttachStateChangeListenerC3012b.this.b(this);
        }
    }

    public ViewOnAttachStateChangeListenerC3012b(C2036q c2036q, Ba.a<? extends androidx.compose.ui.platform.coreshims.c> aVar) {
        this.view = c2036q;
        this.onContentCaptureSession = aVar;
        int i10 = 0;
        int i11 = 1;
        C3854k c3854k = null;
        this.bufferedAppearedNodes = new C4380B<>(i10, i11, c3854k);
        this.bufferedDisappearedNodes = new C4381C(i10, i11, c3854k);
        this.subtreeChangedLayoutNodes = new C4392b<>(i10, i11, c3854k);
        this.previousSemanticsRoot = new U0(c2036q.getSemanticsOwner().a(), C4406p.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A(F0.p r17, androidx.compose.ui.platform.U0 r18) {
        /*
            r16 = this;
            r0 = r16
            s.C r1 = new s.C
            r2 = 1
            r3 = 0
            r4 = 0
            r1.<init>(r4, r2, r3)
            java.util.List r2 = r17.t()
            int r3 = r2.size()
            r5 = r4
        L13:
            if (r5 >= r3) goto L49
            java.lang.Object r6 = r2.get(r5)
            F0.p r6 = (F0.p) r6
            s.o r7 = r16.l()
            int r8 = r6.getId()
            boolean r7 = r7.a(r8)
            if (r7 == 0) goto L46
            s.C r7 = r18.getChildren()
            int r8 = r6.getId()
            boolean r7 = r7.a(r8)
            if (r7 != 0) goto L3f
            A0.G r1 = r17.getLayoutNode()
            r0.q(r1)
            return
        L3f:
            int r6 = r6.getId()
            r1.f(r6)
        L46:
            int r5 = r5 + 1
            goto L13
        L49:
            s.C r2 = r18.getChildren()
            int[] r3 = r2.elements
            long[] r2 = r2.metadata
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L9a
            r6 = r4
        L57:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L95
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r4
        L71:
            if (r11 >= r9) goto L93
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.32E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L8f
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            boolean r12 = r1.a(r12)
            if (r12 != 0) goto L8f
            A0.G r1 = r17.getLayoutNode()
            r0.q(r1)
            return
        L8f:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L71
        L93:
            if (r9 != r10) goto L9a
        L95:
            if (r6 == r5) goto L9a
            int r6 = r6 + 1
            goto L57
        L9a:
            java.util.List r1 = r17.t()
            int r2 = r1.size()
        La2:
            if (r4 >= r2) goto Ld8
            java.lang.Object r3 = r1.get(r4)
            F0.p r3 = (F0.p) r3
            s.o r5 = r16.l()
            int r6 = r3.getId()
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Ld5
            s.B<androidx.compose.ui.platform.U0> r5 = r0.previousSemanticsNodes
            int r6 = r3.getId()
            java.lang.Object r5 = r5.c(r6)
            if (r5 == 0) goto Lca
            androidx.compose.ui.platform.U0 r5 = (androidx.compose.ui.platform.U0) r5
            r0.A(r3, r5)
            goto Ld5
        Lca:
            java.lang.String r1 = "node not present in pruned tree before this change"
            x0.C5047a.c(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
        Ld5:
            int r4 = r4 + 1
            goto La2
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.ViewOnAttachStateChangeListenerC3012b.A(F0.p, androidx.compose.ui.platform.U0):void");
    }

    private final void B() {
        AccessibilityAction accessibilityAction;
        Ba.l lVar;
        AbstractC4405o<V0> abstractC4405oL = l();
        Object[] objArr = abstractC4405oL.values;
        long[] jArr = abstractC4405oL.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        F0.l lVarW = ((V0) objArr[(i10 << 3) + i12]).getSemanticsNode().getUnmergedConfig();
                        if (C3862t.b(m.a(lVarW, s.f4372a.r()), Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) m.a(lVarW, F0.k.f4315a.z())) != null && (lVar = (Ba.l) accessibilityAction.a()) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final androidx.compose.ui.platform.coreshims.e C(p pVar) {
        androidx.compose.ui.platform.coreshims.a aVarA;
        AutofillId autofillIdA;
        String strI;
        androidx.compose.ui.platform.coreshims.c cVar = this.contentCaptureSession;
        if (cVar == null || Build.VERSION.SDK_INT < 29 || (aVarA = androidx.compose.ui.platform.coreshims.d.a(this.view)) == null) {
            return null;
        }
        if (pVar.r() != null) {
            autofillIdA = cVar.a(r3.getId());
            if (autofillIdA == null) {
                return null;
            }
        } else {
            autofillIdA = aVarA.a();
        }
        androidx.compose.ui.platform.coreshims.e eVarB = cVar.b(autofillIdA, pVar.getId());
        if (eVarB == null) {
            return null;
        }
        F0.l lVarW = pVar.getUnmergedConfig();
        s sVar = s.f4372a;
        if (lVarW.i(sVar.w())) {
            return null;
        }
        Bundle bundleA = eVarB.a();
        if (bundleA != null) {
            bundleA.putLong("android.view.contentcapture.EventTimestamp", this.currentSemanticsNodesSnapshotTimestampMillis);
        }
        String str = (String) m.a(lVarW, sVar.C());
        if (str != null) {
            eVarB.e(pVar.getId(), null, null, str);
        }
        List list = (List) m.a(lVarW, sVar.D());
        if (list != null) {
            eVarB.b("android.widget.TextView");
            eVarB.f(W0.a.e(list, "\n", null, null, 0, null, null, 62, null));
        }
        C1060d c1060d = (C1060d) m.a(lVarW, sVar.g());
        if (c1060d != null) {
            eVarB.b("android.widget.EditText");
            eVarB.f(c1060d);
        }
        List list2 = (List) m.a(lVarW, sVar.d());
        if (list2 != null) {
            eVarB.c(W0.a.e(list2, "\n", null, null, 0, null, null, 62, null));
        }
        F0.i iVar = (F0.i) m.a(lVarW, sVar.y());
        if (iVar != null && (strI = W0.i(iVar.getValue())) != null) {
            eVarB.b(strI);
        }
        TextLayoutResult fE = W0.e(lVarW);
        if (fE != null) {
            TextLayoutInput eK = fE.getLayoutInput();
            eVarB.g(v.h(eK.getStyle().l()) * eK.getDensity().getDensity() * eK.getDensity().getFontScale(), 0, 0, 0);
        }
        C3478i c3478iH = pVar.h();
        eVarB.d((int) c3478iH.getLeft(), (int) c3478iH.getTop(), 0, 0, (int) c3478iH.k(), (int) c3478iH.e());
        return eVarB;
    }

    private final void D(p node) {
        if (o()) {
            G(node);
            c(node.getId(), C(node));
            List<p> listT = node.t();
            int size = listT.size();
            for (int i10 = 0; i10 < size; i10++) {
                D(listT.get(i10));
            }
        }
    }

    private final void E(p node) {
        if (o()) {
            g(node.getId());
            List<p> listT = node.t();
            int size = listT.size();
            for (int i10 = 0; i10 < size; i10++) {
                E(listT.get(i10));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void F() {
        /*
            r16 = this;
            r0 = r16
            s.B<androidx.compose.ui.platform.U0> r1 = r0.previousSemanticsNodes
            r1.i()
            s.o r1 = r16.l()
            int[] r2 = r1.keys
            java.lang.Object[] r3 = r1.values
            long[] r1 = r1.metadata
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r6 = 0
        L17:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5d
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L31:
            if (r11 >= r9) goto L5b
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.32E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L57
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            r12 = r3[r12]
            androidx.compose.ui.platform.V0 r12 = (androidx.compose.ui.platform.V0) r12
            s.B<androidx.compose.ui.platform.U0> r14 = r0.previousSemanticsNodes
            androidx.compose.ui.platform.U0 r15 = new androidx.compose.ui.platform.U0
            F0.p r12 = r12.getSemanticsNode()
            s.o r5 = r16.l()
            r15.<init>(r12, r5)
            r14.t(r13, r15)
        L57:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L31
        L5b:
            if (r9 != r10) goto L62
        L5d:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L17
        L62:
            androidx.compose.ui.platform.U0 r1 = new androidx.compose.ui.platform.U0
            androidx.compose.ui.platform.q r2 = r0.view
            F0.r r2 = r2.getSemanticsOwner()
            F0.p r2 = r2.a()
            s.o r3 = r16.l()
            r1.<init>(r2, r3)
            r0.previousSemanticsRoot = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.ViewOnAttachStateChangeListenerC3012b.F():void");
    }

    private final void G(p node) {
        AccessibilityAction accessibilityAction;
        Ba.l lVar;
        Ba.l lVar2;
        F0.l lVarW = node.getUnmergedConfig();
        Boolean bool = (Boolean) m.a(lVarW, s.f4372a.r());
        if (this.translateStatus == a.SHOW_ORIGINAL && C3862t.b(bool, Boolean.TRUE)) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) m.a(lVarW, F0.k.f4315a.z());
            if (accessibilityAction2 == null || (lVar2 = (Ba.l) accessibilityAction2.a()) == null) {
                return;
            }
            return;
        }
        if (this.translateStatus != a.SHOW_TRANSLATED || !C3862t.b(bool, Boolean.FALSE) || (accessibilityAction = (AccessibilityAction) m.a(lVarW, F0.k.f4315a.z())) == null || (lVar = (Ba.l) accessibilityAction.a()) == null) {
            return;
        }
    }

    private final void c(int virtualId, androidx.compose.ui.platform.coreshims.e viewStructure) {
        if (viewStructure == null) {
            return;
        }
        if (this.bufferedDisappearedNodes.a(virtualId)) {
            this.bufferedDisappearedNodes.q(virtualId);
        } else {
            this.bufferedAppearedNodes.t(virtualId, viewStructure);
        }
    }

    private final void g(int virtualId) {
        if (this.bufferedAppearedNodes.b(virtualId)) {
            this.bufferedAppearedNodes.q(virtualId);
        } else {
            this.bufferedDisappearedNodes.f(virtualId);
        }
    }

    private final void h(AbstractC4405o<V0> newSemanticsNodes) {
        int i10;
        int[] iArr = newSemanticsNodes.keys;
        long[] jArr = newSemanticsNodes.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j10) < 128) {
                        int i15 = iArr[(i11 << 3) + i14];
                        U0 u0C = this.previousSemanticsNodes.c(i15);
                        V0 v0C = newSemanticsNodes.c(i15);
                        p pVarB = v0C != null ? v0C.getSemanticsNode() : null;
                        if (pVarB == null) {
                            C5047a.c("no value for specified key");
                            throw new KotlinNothingValueException();
                        }
                        if (u0C == null) {
                            Iterator<Map.Entry<? extends w<?>, ? extends Object>> it = pVarB.getUnmergedConfig().iterator();
                            while (it.hasNext()) {
                                w<?> key = it.next().getKey();
                                s sVar = s.f4372a;
                                if (C3862t.b(key, sVar.D())) {
                                    List list = (List) m.a(pVarB.getUnmergedConfig(), sVar.D());
                                    z(pVarB.getId(), String.valueOf(list != null ? (C1060d) r.l0(list) : null));
                                }
                            }
                        } else {
                            Iterator<Map.Entry<? extends w<?>, ? extends Object>> it2 = pVarB.getUnmergedConfig().iterator();
                            while (it2.hasNext()) {
                                w<?> key2 = it2.next().getKey();
                                s sVar2 = s.f4372a;
                                if (C3862t.b(key2, sVar2.D())) {
                                    List list2 = (List) m.a(u0C.getUnmergedConfig(), sVar2.D());
                                    C1060d c1060d = list2 != null ? (C1060d) r.l0(list2) : null;
                                    List list3 = (List) m.a(pVarB.getUnmergedConfig(), sVar2.D());
                                    C1060d c1060d2 = list3 != null ? (C1060d) r.l0(list3) : null;
                                    if (!C3862t.b(c1060d, c1060d2)) {
                                        z(pVarB.getId(), String.valueOf(c1060d2));
                                    }
                                }
                            }
                        }
                        i10 = 8;
                    } else {
                        i10 = i12;
                    }
                    j10 >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    private final void i() {
        AccessibilityAction accessibilityAction;
        Ba.a aVar;
        AbstractC4405o<V0> abstractC4405oL = l();
        Object[] objArr = abstractC4405oL.values;
        long[] jArr = abstractC4405oL.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        F0.l lVarW = ((V0) objArr[(i10 << 3) + i12]).getSemanticsNode().getUnmergedConfig();
                        if (m.a(lVarW, s.f4372a.r()) != null && (accessibilityAction = (AccessibilityAction) m.a(lVarW, F0.k.f4315a.a())) != null && (aVar = (Ba.a) accessibilityAction.a()) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(ViewOnAttachStateChangeListenerC3012b viewOnAttachStateChangeListenerC3012b) {
        if (viewOnAttachStateChangeListenerC3012b.o()) {
            m0.y(viewOnAttachStateChangeListenerC3012b.view, false, 1, null);
            viewOnAttachStateChangeListenerC3012b.A(viewOnAttachStateChangeListenerC3012b.view.getSemanticsOwner().a(), viewOnAttachStateChangeListenerC3012b.previousSemanticsRoot);
            viewOnAttachStateChangeListenerC3012b.y(viewOnAttachStateChangeListenerC3012b.view.getSemanticsOwner().a(), viewOnAttachStateChangeListenerC3012b.previousSemanticsRoot);
            viewOnAttachStateChangeListenerC3012b.h(viewOnAttachStateChangeListenerC3012b.l());
            viewOnAttachStateChangeListenerC3012b.F();
            viewOnAttachStateChangeListenerC3012b.checkingForSemanticsChanges = false;
        }
    }

    private final void n() {
        AccessibilityAction accessibilityAction;
        Ba.l lVar;
        AbstractC4405o<V0> abstractC4405oL = l();
        Object[] objArr = abstractC4405oL.values;
        long[] jArr = abstractC4405oL.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        F0.l lVarW = ((V0) objArr[(i10 << 3) + i12]).getSemanticsNode().getUnmergedConfig();
                        if (C3862t.b(m.a(lVarW, s.f4372a.r()), Boolean.TRUE) && (accessibilityAction = (AccessibilityAction) m.a(lVarW, F0.k.f4315a.z())) != null && (lVar = (Ba.l) accessibilityAction.a()) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void p() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.ViewOnAttachStateChangeListenerC3012b.p():void");
    }

    private final void q(G layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.w(C4153F.f46609a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void y(F0.p r14, androidx.compose.ui.platform.U0 r15) {
        /*
            r13 = this;
            java.util.List r0 = r14.t()
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r1) goto L34
            java.lang.Object r4 = r0.get(r3)
            F0.p r4 = (F0.p) r4
            s.o r5 = r13.l()
            int r6 = r4.getId()
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto L31
            s.C r5 = r15.getChildren()
            int r6 = r4.getId()
            boolean r5 = r5.a(r6)
            if (r5 != 0) goto L31
            r13.D(r4)
        L31:
            int r3 = r3 + 1
            goto La
        L34:
            s.B<androidx.compose.ui.platform.U0> r15 = r13.previousSemanticsNodes
            int[] r0 = r15.keys
            long[] r15 = r15.metadata
            int r1 = r15.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L82
            r3 = r2
        L40:
            r4 = r15[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L7d
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L5a:
            if (r8 >= r6) goto L7b
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.32E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L77
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            s.o r10 = r13.l()
            boolean r10 = r10.a(r9)
            if (r10 != 0) goto L77
            r13.g(r9)
        L77:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L5a
        L7b:
            if (r6 != r7) goto L82
        L7d:
            if (r3 == r1) goto L82
            int r3 = r3 + 1
            goto L40
        L82:
            java.util.List r14 = r14.t()
            int r15 = r14.size()
        L8a:
            if (r2 >= r15) goto Lcc
            java.lang.Object r0 = r14.get(r2)
            F0.p r0 = (F0.p) r0
            s.o r1 = r13.l()
            int r3 = r0.getId()
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto Lc9
            s.B<androidx.compose.ui.platform.U0> r1 = r13.previousSemanticsNodes
            int r3 = r0.getId()
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto Lc9
            s.B<androidx.compose.ui.platform.U0> r1 = r13.previousSemanticsNodes
            int r3 = r0.getId()
            java.lang.Object r1 = r1.c(r3)
            if (r1 == 0) goto Lbe
            androidx.compose.ui.platform.U0 r1 = (androidx.compose.ui.platform.U0) r1
            r13.y(r0, r1)
            goto Lc9
        Lbe:
            java.lang.String r14 = "node not present in pruned tree before this change"
            x0.C5047a.c(r14)
            kotlin.KotlinNothingValueException r14 = new kotlin.KotlinNothingValueException
            r14.<init>()
            throw r14
        Lc9:
            int r2 = r2 + 1
            goto L8a
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.ViewOnAttachStateChangeListenerC3012b.y(F0.p, androidx.compose.ui.platform.U0):void");
    }

    private final void z(int id2, String newText) {
        androidx.compose.ui.platform.coreshims.c cVar;
        if (Build.VERSION.SDK_INT >= 29 && (cVar = this.contentCaptureSession) != null) {
            AutofillId autofillIdA = cVar.a(id2);
            if (autofillIdA != null) {
                cVar.c(autofillIdA, newText);
            } else {
                C5047a.c("Invalid content capture ID");
                throw new KotlinNothingValueException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:25:0x0056, B:29:0x0066, B:31:0x006e, B:33:0x0077, B:34:0x007a, B:36:0x007e, B:37:0x0087, B:20:0x0048), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0098 -> B:14:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ta.InterfaceC4588d<? super oa.C4153F> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof d0.ViewOnAttachStateChangeListenerC3012b.c
            if (r0 == 0) goto L13
            r0 = r10
            d0.b$c r0 = (d0.ViewOnAttachStateChangeListenerC3012b.c) r0
            int r1 = r0.f39643F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39643F = r1
            goto L18
        L13:
            d0.b$c r0 = new d0.b$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f39641D
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f39643F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r2 = r0.f39640C
            Zb.i r2 = (Zb.i) r2
            java.lang.Object r5 = r0.f39639B
            d0.b r5 = (d0.ViewOnAttachStateChangeListenerC3012b) r5
            oa.C4173r.b(r10)     // Catch: java.lang.Throwable -> L35
        L33:
            r10 = r2
            goto L56
        L35:
            r10 = move-exception
            goto La5
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L40:
            java.lang.Object r2 = r0.f39640C
            Zb.i r2 = (Zb.i) r2
            java.lang.Object r5 = r0.f39639B
            d0.b r5 = (d0.ViewOnAttachStateChangeListenerC3012b) r5
            oa.C4173r.b(r10)     // Catch: java.lang.Throwable -> L35
            goto L66
        L4c:
            oa.C4173r.b(r10)
            Zb.g<oa.F> r10 = r9.boundsUpdateChannel     // Catch: java.lang.Throwable -> La3
            Zb.i r10 = r10.iterator()     // Catch: java.lang.Throwable -> La3
            r5 = r9
        L56:
            r0.f39639B = r5     // Catch: java.lang.Throwable -> L35
            r0.f39640C = r10     // Catch: java.lang.Throwable -> L35
            r0.f39643F = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L63
            return r1
        L63:
            r8 = r2
            r2 = r10
            r10 = r8
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L9b
            r2.next()     // Catch: java.lang.Throwable -> L35
            boolean r10 = r5.o()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L7a
            r5.p()     // Catch: java.lang.Throwable -> L35
        L7a:
            boolean r10 = r5.checkingForSemanticsChanges     // Catch: java.lang.Throwable -> L35
            if (r10 != 0) goto L87
            r5.checkingForSemanticsChanges = r4     // Catch: java.lang.Throwable -> L35
            android.os.Handler r10 = r5.handler     // Catch: java.lang.Throwable -> L35
            java.lang.Runnable r6 = r5.contentCaptureChangeChecker     // Catch: java.lang.Throwable -> L35
            r10.post(r6)     // Catch: java.lang.Throwable -> L35
        L87:
            s.b<A0.G> r10 = r5.subtreeChangedLayoutNodes     // Catch: java.lang.Throwable -> L35
            r10.clear()     // Catch: java.lang.Throwable -> L35
            long r6 = r5.SendRecurringContentCaptureEventsIntervalMillis     // Catch: java.lang.Throwable -> L35
            r0.f39639B = r5     // Catch: java.lang.Throwable -> L35
            r0.f39640C = r2     // Catch: java.lang.Throwable -> L35
            r0.f39643F = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = Xb.T.a(r6, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L33
            return r1
        L9b:
            s.b<A0.G> r10 = r5.subtreeChangedLayoutNodes
            r10.clear()
            oa.F r10 = oa.C4153F.f46609a
            return r10
        La3:
            r10 = move-exception
            r5 = r9
        La5:
            s.b<A0.G> r0 = r5.subtreeChangedLayoutNodes
            r0.clear()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.ViewOnAttachStateChangeListenerC3012b.b(ta.d):java.lang.Object");
    }

    public final AbstractC4405o<V0> l() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = W0.b(this.view.getSemanticsOwner());
            this.currentSemanticsNodesSnapshotTimestampMillis = System.currentTimeMillis();
        }
        return this.currentSemanticsNodes;
    }

    /* renamed from: m, reason: from getter */
    public final C2036q getView() {
        return this.view;
    }

    public final boolean o() {
        return l.INSTANCE.a() && this.contentCaptureSession != null;
    }

    @Override // android.view.InterfaceC2097e
    public void onStart(InterfaceC2114v owner) {
        this.contentCaptureSession = this.onContentCaptureSession.invoke();
        D(this.view.getSemanticsOwner().a());
        p();
    }

    @Override // android.view.InterfaceC2097e
    public void onStop(InterfaceC2114v owner) {
        E(this.view.getSemanticsOwner().a());
        p();
        this.contentCaptureSession = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v10) {
        this.handler.removeCallbacks(this.contentCaptureChangeChecker);
        this.contentCaptureSession = null;
    }

    public final void r() {
        this.translateStatus = a.SHOW_ORIGINAL;
        i();
    }

    public final void s(long[] virtualIds, int[] supportedFormats, Consumer<ViewTranslationRequest> requestsCollector) {
        C0505b.f39638a.c(this, virtualIds, supportedFormats, requestsCollector);
    }

    public final void t() {
        this.translateStatus = a.SHOW_ORIGINAL;
        n();
    }

    public final void u(G layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (o()) {
            q(layoutNode);
        }
    }

    public final void v() {
        this.currentSemanticsNodesInvalidated = true;
        if (!o() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.contentCaptureChangeChecker);
    }

    public final void w() {
        this.translateStatus = a.SHOW_TRANSLATED;
        B();
    }

    public final void x(ViewOnAttachStateChangeListenerC3012b contentCaptureManager, LongSparseArray<ViewTranslationResponse> response) {
        C0505b.f39638a.d(contentCaptureManager, response);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v10) {
    }
}
