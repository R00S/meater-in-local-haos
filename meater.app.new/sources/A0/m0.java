package A0;

import android.view.View;
import androidx.compose.ui.platform.InterfaceC2009c0;
import androidx.compose.ui.platform.InterfaceC2020i;
import androidx.compose.ui.platform.Y0;
import androidx.compose.ui.platform.Z0;
import androidx.compose.ui.platform.i1;
import androidx.compose.ui.platform.q1;
import e0.InterfaceC3112c;
import i0.F0;
import i0.InterfaceC3586l0;
import kotlin.AbstractC1341l;
import kotlin.InterfaceC1340k;
import kotlin.Metadata;
import l0.C3870c;
import oa.C4153F;
import q0.InterfaceC4258a;
import r0.InterfaceC4332b;
import u0.InterfaceC4628N;
import u0.InterfaceC4657w;
import y0.Z;

/* compiled from: Owner.kt */
@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 £\u00012\u00020\u0001:\u0003\u0017£\u0001J5\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H&ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u0004H&¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H&ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u001d\u0010\u001eJE\u0010'\u001a\u00020&2\u001a\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\b0\u001f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010!H&¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\bH&¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b+\u0010\u000eJ\u001b\u0010/\u001a\u00020\b2\n\u0010.\u001a\u00060,j\u0002`-H'¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\u00020\b2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\b0#H&¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\bH&¢\u0006\u0004\b4\u0010*J\u0017\u00106\u001a\u00020\b2\u0006\u00101\u001a\u000205H&¢\u0006\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u001a\u0010[\u001a\u00020W8gX§\u0004¢\u0006\f\u0012\u0004\bZ\u0010*\u001a\u0004\bX\u0010YR\u001c\u0010`\u001a\u0004\u0018\u00010\\8gX§\u0004¢\u0006\f\u0012\u0004\b_\u0010*\u001a\u0004\b]\u0010^R\u0014\u0010d\u001a\u00020a8&X¦\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8&X¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8&X¦\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8&X¦\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020q8&X¦\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0014\u0010x\u001a\u00020u8&X¦\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u001a\u0010}\u001a\u00020y8&X§\u0004¢\u0006\f\u0012\u0004\b|\u0010*\u001a\u0004\bz\u0010{R\u0016\u0010\u0081\u0001\u001a\u00020~8&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R)\u0010\u008a\u0001\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00020\u00048&@gX¦\u000e¢\u0006\u000f\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0005\b\u0089\u0001\u0010\u0018R\u0018\u0010\u008e\u0001\u001a\u00030\u008b\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u008f\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0093\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010¢\u0001\u001a\u00030\u009f\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006¤\u0001À\u0006\u0001"}, d2 = {"LA0/m0;", "Lu0/N;", "LA0/G;", "layoutNode", "", "affectsLookahead", "forceRequest", "scheduleMeasureAndLayout", "Loa/F;", "n", "(LA0/G;ZZZ)V", "z", "(LA0/G;ZZ)V", "i", "(LA0/G;)V", "node", "u", "l", "Lh0/g;", "localPosition", "h", "(J)J", "sendPointerUpdate", "a", "(Z)V", "LU0/b;", "constraints", "A", "(LA0/G;J)V", "g", "(LA0/G;Z)V", "Lkotlin/Function2;", "Li0/l0;", "Ll0/c;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "explicitLayer", "LA0/l0;", "s", "(LBa/p;LBa/a;Ll0/c;)LA0/l0;", "w", "()V", "c", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "view", "m", "(Landroid/view/View;)V", "listener", "k", "(LBa/a;)V", "v", "LA0/m0$b;", "p", "(LA0/m0$b;)V", "getRoot", "()LA0/G;", "root", "LA0/I;", "getSharedDrawScope", "()LA0/I;", "sharedDrawScope", "Lq0/a;", "getHapticFeedBack", "()Lq0/a;", "hapticFeedBack", "Lr0/b;", "getInputModeManager", "()Lr0/b;", "inputModeManager", "Landroidx/compose/ui/platform/c0;", "getClipboardManager", "()Landroidx/compose/ui/platform/c0;", "clipboardManager", "Landroidx/compose/ui/platform/i;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/i;", "accessibilityManager", "Li0/F0;", "getGraphicsContext", "()Li0/F0;", "graphicsContext", "Landroidx/compose/ui/platform/Z0;", "getTextToolbar", "()Landroidx/compose/ui/platform/Z0;", "textToolbar", "Lc0/i;", "getAutofillTree", "()Lc0/i;", "getAutofillTree$annotations", "autofillTree", "Lc0/d;", "getAutofill", "()Lc0/d;", "getAutofill$annotations", "autofill", "LU0/d;", "getDensity", "()LU0/d;", "density", "LM0/G;", "getTextInputService", "()LM0/G;", "textInputService", "Landroidx/compose/ui/platform/Y0;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/Y0;", "softwareKeyboardController", "Lu0/w;", "getPointerIconService", "()Lu0/w;", "pointerIconService", "Lg0/i;", "getFocusOwner", "()Lg0/i;", "focusOwner", "Landroidx/compose/ui/platform/q1;", "getWindowInfo", "()Landroidx/compose/ui/platform/q1;", "windowInfo", "LL0/k$b;", "getFontLoader", "()LL0/k$b;", "getFontLoader$annotations", "fontLoader", "LL0/l$b;", "getFontFamilyResolver", "()LL0/l$b;", "fontFamilyResolver", "LU0/t;", "getLayoutDirection", "()LU0/t;", "layoutDirection", "<set-?>", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "showLayoutBounds", "Landroidx/compose/ui/platform/i1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/i1;", "viewConfiguration", "LA0/o0;", "getSnapshotObserver", "()LA0/o0;", "snapshotObserver", "Lz0/f;", "getModifierLocalManager", "()Lz0/f;", "modifierLocalManager", "Lta/g;", "getCoroutineContext", "()Lta/g;", "coroutineContext", "Ly0/Z$a;", "getPlacementScope", "()Ly0/Z$a;", "placementScope", "Le0/c;", "getDragAndDropManager", "()Le0/c;", "dragAndDropManager", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface m0 extends InterfaceC4628N {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f645a;

    /* compiled from: Owner.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LA0/m0$a;", "", "<init>", "()V", "", "b", "Z", "a", "()Z", "setEnableExtraAssertions", "(Z)V", "enableExtraAssertions", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A0.m0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f645a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static boolean enableExtraAssertions;

        private Companion() {
        }

        public final boolean a() {
            return enableExtraAssertions;
        }
    }

    /* compiled from: Owner.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"LA0/m0$b;", "", "Loa/F;", "d", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        void d();
    }

    static /* synthetic */ void B(m0 m0Var, G g10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        m0Var.g(g10, z10);
    }

    static /* synthetic */ void b(m0 m0Var, G g10, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = true;
        }
        m0Var.n(g10, z10, z11, z12);
    }

    static /* synthetic */ l0 o(m0 m0Var, Ba.p pVar, Ba.a aVar, C3870c c3870c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i10 & 4) != 0) {
            c3870c = null;
        }
        return m0Var.s(pVar, aVar, c3870c);
    }

    static /* synthetic */ void t(m0 m0Var, G g10, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        m0Var.z(g10, z10, z11);
    }

    static /* synthetic */ void y(m0 m0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        m0Var.a(z10);
    }

    void A(G layoutNode, long constraints);

    void a(boolean sendPointerUpdate);

    void c(G layoutNode);

    void g(G layoutNode, boolean affectsLookahead);

    InterfaceC2020i getAccessibilityManager();

    c0.d getAutofill();

    c0.i getAutofillTree();

    InterfaceC2009c0 getClipboardManager();

    ta.g getCoroutineContext();

    U0.d getDensity();

    InterfaceC3112c getDragAndDropManager();

    g0.i getFocusOwner();

    AbstractC1341l.b getFontFamilyResolver();

    InterfaceC1340k.b getFontLoader();

    F0 getGraphicsContext();

    InterfaceC4258a getHapticFeedBack();

    InterfaceC4332b getInputModeManager();

    U0.t getLayoutDirection();

    z0.f getModifierLocalManager();

    default Z.a getPlacementScope() {
        return y0.a0.b(this);
    }

    InterfaceC4657w getPointerIconService();

    G getRoot();

    I getSharedDrawScope();

    boolean getShowLayoutBounds();

    o0 getSnapshotObserver();

    Y0 getSoftwareKeyboardController();

    M0.G getTextInputService();

    Z0 getTextToolbar();

    i1 getViewConfiguration();

    q1 getWindowInfo();

    long h(long localPosition);

    void i(G layoutNode);

    void k(Ba.a<C4153F> listener);

    void l(G node);

    void m(View view);

    void n(G layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout);

    void p(b listener);

    l0 s(Ba.p<? super InterfaceC3586l0, ? super C3870c, C4153F> drawBlock, Ba.a<C4153F> invalidateParentLayer, C3870c explicitLayer);

    void setShowLayoutBounds(boolean z10);

    void u(G node);

    void v();

    void w();

    void z(G layoutNode, boolean affectsLookahead, boolean forceRequest);
}
