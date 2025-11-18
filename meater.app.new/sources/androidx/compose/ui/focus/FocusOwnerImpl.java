package androidx.compose.ui.focus;

import A0.AbstractC0834m;
import A0.C0819a0;
import A0.C0832k;
import A0.G;
import A0.InterfaceC0831j;
import A0.V;
import A0.e0;
import U0.t;
import android.view.KeyEvent;
import androidx.compose.ui.focus.k;
import b0.i;
import g0.EnumC3376a;
import h0.C3478i;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3860q;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import s.C4383E;
import s0.C4418c;
import s0.C4419d;
import w0.InterfaceC4969a;
import w0.RotaryScrollEvent;
import x0.C5047a;

/* compiled from: FocusOwnerImpl.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u007f\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001e\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u0013J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010#J2\u0010&\u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J:\u0010+\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\t0\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J(\u0010.\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001a\u00100\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b0\u0010\u001bJ\u0017\u00103\u001a\u00020\t2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00042\u0006\u00105\u001a\u00020)H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00042\u0006\u00105\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00042\u0006\u00105\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u0011\u0010>\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b>\u0010?R*\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010@R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010DR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010DR\"\u0010K\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u00107R\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010MR\u001a\u0010R\u001a\u00020O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010P\u001a\u0004\bF\u0010QR\u001a\u0010V\u001a\u00020S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010T\u001a\u0004\bA\u0010UR\u0018\u0010Y\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010XR\u0014\u0010\\\u001a\u00020Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010[\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006]"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Lg0/i;", "Lkotlin/Function1;", "Lkotlin/Function0;", "Loa/F;", "onRequestApplyChangesListener", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/b;", "Lh0/i;", "", "onRequestFocusForOwner", "onMoveFocusInterop", "onClearFocusForOwner", "onFocusRectInterop", "LU0/t;", "onLayoutDirection", "<init>", "(LBa/l;LBa/p;LBa/l;LBa/a;LBa/a;LBa/a;)V", "s", "()V", "LA0/j;", "Lb0/i$c;", "t", "(LA0/j;)Lb0/i$c;", "Ls0/b;", "keyEvent", "u", "(Landroid/view/KeyEvent;)Z", "focusDirection", "previouslyFocusedRect", "j", "(Landroidx/compose/ui/focus/b;Lh0/i;)Z", "l", "force", "p", "(Z)V", "refreshFocusEvents", "clearOwnerFocus", "d", "(ZZZI)Z", "focusedRect", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "g", "(ILh0/i;LBa/l;)Ljava/lang/Boolean;", "onFocusedItem", "m", "(Landroid/view/KeyEvent;LBa/a;)Z", "k", "Lw0/b;", "event", "i", "(Lw0/b;)Z", "node", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Lg0/c;", "o", "(Lg0/c;)V", "Lg0/j;", "n", "(Lg0/j;)V", "h", "()Lh0/i;", "LBa/p;", "b", "LBa/l;", "c", "LBa/a;", "e", "f", "Landroidx/compose/ui/focus/FocusTargetNode;", "r", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setRootFocusNode$ui_release", "rootFocusNode", "Lg0/e;", "Lg0/e;", "focusInvalidationManager", "Lg0/t;", "Lg0/t;", "()Lg0/t;", "focusTransactionManager", "Lb0/i;", "Lb0/i;", "()Lb0/i;", "modifier", "Ls/E;", "Ls/E;", "keysCurrentlyDown", "Lg0/o;", "()Lg0/o;", "rootState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements g0.i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ba.p<androidx.compose.ui.focus.b, C3478i, Boolean> onRequestFocusForOwner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<androidx.compose.ui.focus.b, Boolean> onMoveFocusInterop;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<C4153F> onClearFocusForOwner;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<C3478i> onFocusRectInterop;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<t> onLayoutDirection;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g0.e focusInvalidationManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private C4383E keysCurrentlyDown;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private FocusTargetNode rootFocusNode = new FocusTargetNode();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final g0.t focusTransactionManager = new g0.t();

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final b0.i modifier = i.a(b0.i.INSTANCE, e.f22723B).e(new V<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return this.f22724b.getRootFocusNode().hashCode();
        }

        @Override // A0.V
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode getNode() {
            return this.f22724b.getRootFocusNode();
        }

        @Override // A0.V
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public void n(FocusTargetNode node) {
        }
    });

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22718a;

        static {
            int[] iArr = new int[EnumC3376a.values().length];
            try {
                iArr[EnumC3376a.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3376a.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3376a.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3376a.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f22718a = iArr;
        }
    }

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class c extends C3860q implements Ba.a<C4153F> {
        c(Object obj) {
            super(0, obj, FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0);
        }

        public final void c() {
            ((FocusOwnerImpl) this.receiver).s();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            c();
            return C4153F.f46609a;
        }
    }

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.l<FocusTargetNode, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f22720B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ FocusOwnerImpl f22721C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.l<FocusTargetNode, Boolean> f22722D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, Ba.l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.f22720B = focusTargetNode;
            this.f22721C = focusOwnerImpl;
            this.f22722D = lVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean zBooleanValue;
            if (C3862t.b(focusTargetNode, this.f22720B)) {
                zBooleanValue = false;
            } else {
                if (C3862t.b(focusTargetNode, this.f22721C.getRootFocusNode())) {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                zBooleanValue = this.f22722D.invoke(focusTargetNode).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
    }

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/focus/g;", "Loa/F;", "a", "(Landroidx/compose/ui/focus/g;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements Ba.l<g, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f22723B = new e();

        e() {
            super(1);
        }

        public final void a(g gVar) {
            gVar.y(false);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(g gVar) {
            a(gVar);
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusOwnerImpl(Ba.l<? super Ba.a<C4153F>, C4153F> lVar, Ba.p<? super androidx.compose.ui.focus.b, ? super C3478i, Boolean> pVar, Ba.l<? super androidx.compose.ui.focus.b, Boolean> lVar2, Ba.a<C4153F> aVar, Ba.a<C3478i> aVar2, Ba.a<? extends t> aVar3) {
        this.onRequestFocusForOwner = pVar;
        this.onMoveFocusInterop = lVar2;
        this.onClearFocusForOwner = aVar;
        this.onFocusRectInterop = aVar2;
        this.onLayoutDirection = aVar3;
        this.focusInvalidationManager = new g0.e(lVar, new c(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        if (this.rootFocusNode.q2() == g0.p.Inactive) {
            this.onClearFocusForOwner.invoke();
        }
    }

    private final i.c t(InterfaceC0831j interfaceC0831j) {
        int iA = e0.a(1024) | e0.a(8192);
        if (!interfaceC0831j.getNode().getIsAttached()) {
            C5047a.b("visitLocalDescendants called on an unattached node");
        }
        i.c node = interfaceC0831j.getNode();
        i.c cVar = null;
        if ((node.getAggregateChildKindSet() & iA) != 0) {
            for (i.c child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iA) != 0) {
                    if ((e0.a(1024) & child.getKindSet()) != 0) {
                        return cVar;
                    }
                    cVar = child;
                }
            }
        }
        return cVar;
    }

    private final boolean u(KeyEvent keyEvent) {
        long jA = C4419d.a(keyEvent);
        int iB = C4419d.b(keyEvent);
        C4418c.Companion companion = C4418c.INSTANCE;
        if (C4418c.e(iB, companion.a())) {
            C4383E c4383e = this.keysCurrentlyDown;
            if (c4383e == null) {
                c4383e = new C4383E(3);
                this.keysCurrentlyDown = c4383e;
            }
            c4383e.l(jA);
        } else if (C4418c.e(iB, companion.b())) {
            C4383E c4383e2 = this.keysCurrentlyDown;
            if (c4383e2 == null || !c4383e2.a(jA)) {
                return false;
            }
            C4383E c4383e3 = this.keysCurrentlyDown;
            if (c4383e3 != null) {
                c4383e3.m(jA);
            }
        }
        return true;
    }

    @Override // g0.i
    public void a(FocusTargetNode node) {
        this.focusInvalidationManager.d(node);
    }

    @Override // g0.i
    /* renamed from: b, reason: from getter */
    public b0.i getModifier() {
        return this.modifier;
    }

    @Override // g0.i
    public boolean d(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection) {
        boolean zC;
        g0.t focusTransactionManager = getFocusTransactionManager();
        b bVar = b.f22719B;
        try {
            if (focusTransactionManager.ongoingTransaction) {
                focusTransactionManager.g();
            }
            focusTransactionManager.f();
            if (bVar != null) {
                focusTransactionManager.cancellationListener.c(bVar);
            }
            if (!force) {
                int i10 = a.f22718a[m.e(this.rootFocusNode, focusDirection).ordinal()];
                zC = (i10 == 1 || i10 == 2 || i10 == 3) ? false : m.c(this.rootFocusNode, force, refreshFocusEvents);
            }
            if (zC && clearOwnerFocus) {
                this.onClearFocusForOwner.invoke();
            }
            return zC;
        } finally {
            focusTransactionManager.h();
        }
    }

    @Override // g0.i
    public g0.o e() {
        return this.rootFocusNode.q2();
    }

    @Override // g0.i
    /* renamed from: f, reason: from getter */
    public g0.t getFocusTransactionManager() {
        return this.focusTransactionManager;
    }

    @Override // g0.i
    public Boolean g(int focusDirection, C3478i focusedRect, Ba.l<? super FocusTargetNode, Boolean> onFound) {
        FocusTargetNode focusTargetNodeB = n.b(this.rootFocusNode);
        if (focusTargetNodeB != null) {
            k kVarA = n.a(focusTargetNodeB, focusDirection, this.onLayoutDirection.invoke());
            k.Companion companion = k.INSTANCE;
            if (C3862t.b(kVarA, companion.a())) {
                return null;
            }
            if (!C3862t.b(kVarA, companion.b())) {
                return Boolean.valueOf(kVarA.c(onFound));
            }
        } else {
            focusTargetNodeB = null;
        }
        return n.e(this.rootFocusNode, focusDirection, this.onLayoutDirection.invoke(), focusedRect, new d(focusTargetNodeB, this, onFound));
    }

    @Override // g0.i
    public C3478i h() {
        FocusTargetNode focusTargetNodeB = n.b(this.rootFocusNode);
        if (focusTargetNodeB != null) {
            return n.d(focusTargetNodeB);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r1v6, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r1v7, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // g0.i
    public boolean i(RotaryScrollEvent event) {
        InterfaceC4969a interfaceC4969a;
        int size;
        C0819a0 nodes;
        AbstractC0834m abstractC0834mG;
        C0819a0 nodes2;
        if (this.focusInvalidationManager.b()) {
            throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.");
        }
        FocusTargetNode focusTargetNodeB = n.b(this.rootFocusNode);
        if (focusTargetNodeB != null) {
            int iA = e0.a(16384);
            if (!focusTargetNodeB.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            i.c node = focusTargetNodeB.getNode();
            G gK = C0832k.k(focusTargetNodeB);
            loop0: while (true) {
                if (gK == null) {
                    abstractC0834mG = 0;
                    break;
                }
                if ((gK.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & iA) != 0) {
                            Q.b bVar = null;
                            abstractC0834mG = node;
                            while (abstractC0834mG != 0) {
                                if (abstractC0834mG instanceof InterfaceC4969a) {
                                    break loop0;
                                }
                                if ((abstractC0834mG.getKindSet() & iA) != 0 && (abstractC0834mG instanceof AbstractC0834m)) {
                                    i.c delegate = abstractC0834mG.getDelegate();
                                    int i10 = 0;
                                    abstractC0834mG = abstractC0834mG;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC0834mG = delegate;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new Q.b(new i.c[16], 0);
                                                }
                                                if (abstractC0834mG != 0) {
                                                    bVar.c(abstractC0834mG);
                                                    abstractC0834mG = 0;
                                                }
                                                bVar.c(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        abstractC0834mG = abstractC0834mG;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC0834mG = C0832k.g(bVar);
                            }
                        }
                        node = node.getParent();
                    }
                }
                gK = gK.o0();
                node = (gK == null || (nodes2 = gK.getNodes()) == null) ? null : nodes2.getTail();
            }
            interfaceC4969a = (InterfaceC4969a) abstractC0834mG;
        } else {
            interfaceC4969a = null;
        }
        if (interfaceC4969a != null) {
            int iA2 = e0.a(16384);
            if (!interfaceC4969a.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            i.c parent = interfaceC4969a.getNode().getParent();
            G gK2 = C0832k.k(interfaceC4969a);
            ArrayList arrayList = null;
            while (gK2 != null) {
                if ((gK2.getNodes().getHead().getAggregateChildKindSet() & iA2) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iA2) != 0) {
                            i.c cVarG = parent;
                            Q.b bVar2 = null;
                            while (cVarG != null) {
                                if (cVarG instanceof InterfaceC4969a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarG);
                                } else if ((cVarG.getKindSet() & iA2) != 0 && (cVarG instanceof AbstractC0834m)) {
                                    int i11 = 0;
                                    for (i.c delegate2 = ((AbstractC0834m) cVarG).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & iA2) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVarG = delegate2;
                                            } else {
                                                if (bVar2 == null) {
                                                    bVar2 = new Q.b(new i.c[16], 0);
                                                }
                                                if (cVarG != null) {
                                                    bVar2.c(cVarG);
                                                    cVarG = null;
                                                }
                                                bVar2.c(delegate2);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVarG = C0832k.g(bVar2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                gK2 = gK2.o0();
                parent = (gK2 == null || (nodes = gK2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i12 = size - 1;
                    if (((InterfaceC4969a) arrayList.get(size)).v0(event)) {
                        return true;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    size = i12;
                }
            }
            AbstractC0834m node2 = interfaceC4969a.getNode();
            Q.b bVar3 = null;
            while (node2 != 0) {
                if (node2 instanceof InterfaceC4969a) {
                    if (((InterfaceC4969a) node2).v0(event)) {
                        return true;
                    }
                } else if ((node2.getKindSet() & iA2) != 0 && (node2 instanceof AbstractC0834m)) {
                    i.c delegate3 = node2.getDelegate();
                    int i13 = 0;
                    node2 = node2;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & iA2) != 0) {
                            i13++;
                            if (i13 == 1) {
                                node2 = delegate3;
                            } else {
                                if (bVar3 == null) {
                                    bVar3 = new Q.b(new i.c[16], 0);
                                }
                                if (node2 != 0) {
                                    bVar3.c(node2);
                                    node2 = 0;
                                }
                                bVar3.c(delegate3);
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node2 = node2;
                    }
                    if (i13 == 1) {
                    }
                }
                node2 = C0832k.g(bVar3);
            }
            AbstractC0834m node3 = interfaceC4969a.getNode();
            Q.b bVar4 = null;
            while (node3 != 0) {
                if (node3 instanceof InterfaceC4969a) {
                    if (((InterfaceC4969a) node3).K0(event)) {
                        return true;
                    }
                } else if ((node3.getKindSet() & iA2) != 0 && (node3 instanceof AbstractC0834m)) {
                    i.c delegate4 = node3.getDelegate();
                    int i14 = 0;
                    node3 = node3;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & iA2) != 0) {
                            i14++;
                            if (i14 == 1) {
                                node3 = delegate4;
                            } else {
                                if (bVar4 == null) {
                                    bVar4 = new Q.b(new i.c[16], 0);
                                }
                                if (node3 != 0) {
                                    bVar4.c(node3);
                                    node3 = 0;
                                }
                                bVar4.c(delegate4);
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node3 = node3;
                    }
                    if (i14 == 1) {
                    }
                }
                node3 = C0832k.g(bVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (((InterfaceC4969a) arrayList.get(i15)).K0(event)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // g0.i
    public boolean j(androidx.compose.ui.focus.b focusDirection, C3478i previouslyFocusedRect) {
        return this.onRequestFocusForOwner.invoke(focusDirection, previouslyFocusedRect).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v4, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v5, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r2v7, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // g0.i
    public boolean k(KeyEvent keyEvent) {
        s0.g gVar;
        int size;
        C0819a0 nodes;
        AbstractC0834m abstractC0834mG;
        C0819a0 nodes2;
        if (this.focusInvalidationManager.b()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeB = n.b(this.rootFocusNode);
        if (focusTargetNodeB != null) {
            int iA = e0.a(131072);
            if (!focusTargetNodeB.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            i.c node = focusTargetNodeB.getNode();
            G gK = C0832k.k(focusTargetNodeB);
            loop0: while (true) {
                if (gK == null) {
                    abstractC0834mG = 0;
                    break;
                }
                if ((gK.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & iA) != 0) {
                            Q.b bVar = null;
                            abstractC0834mG = node;
                            while (abstractC0834mG != 0) {
                                if (abstractC0834mG instanceof s0.g) {
                                    break loop0;
                                }
                                if ((abstractC0834mG.getKindSet() & iA) != 0 && (abstractC0834mG instanceof AbstractC0834m)) {
                                    i.c delegate = abstractC0834mG.getDelegate();
                                    int i10 = 0;
                                    abstractC0834mG = abstractC0834mG;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC0834mG = delegate;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new Q.b(new i.c[16], 0);
                                                }
                                                if (abstractC0834mG != 0) {
                                                    bVar.c(abstractC0834mG);
                                                    abstractC0834mG = 0;
                                                }
                                                bVar.c(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        abstractC0834mG = abstractC0834mG;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC0834mG = C0832k.g(bVar);
                            }
                        }
                        node = node.getParent();
                    }
                }
                gK = gK.o0();
                node = (gK == null || (nodes2 = gK.getNodes()) == null) ? null : nodes2.getTail();
            }
            gVar = (s0.g) abstractC0834mG;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            int iA2 = e0.a(131072);
            if (!gVar.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            i.c parent = gVar.getNode().getParent();
            G gK2 = C0832k.k(gVar);
            ArrayList arrayList = null;
            while (gK2 != null) {
                if ((gK2.getNodes().getHead().getAggregateChildKindSet() & iA2) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iA2) != 0) {
                            i.c cVarG = parent;
                            Q.b bVar2 = null;
                            while (cVarG != null) {
                                if (cVarG instanceof s0.g) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(cVarG);
                                } else if ((cVarG.getKindSet() & iA2) != 0 && (cVarG instanceof AbstractC0834m)) {
                                    int i11 = 0;
                                    for (i.c delegate2 = ((AbstractC0834m) cVarG).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & iA2) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVarG = delegate2;
                                            } else {
                                                if (bVar2 == null) {
                                                    bVar2 = new Q.b(new i.c[16], 0);
                                                }
                                                if (cVarG != null) {
                                                    bVar2.c(cVarG);
                                                    cVarG = null;
                                                }
                                                bVar2.c(delegate2);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVarG = C0832k.g(bVar2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                gK2 = gK2.o0();
                parent = (gK2 == null || (nodes = gK2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i12 = size - 1;
                    if (((s0.g) arrayList.get(size)).X(keyEvent)) {
                        return true;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    size = i12;
                }
            }
            AbstractC0834m node2 = gVar.getNode();
            Q.b bVar3 = null;
            while (node2 != 0) {
                if (node2 instanceof s0.g) {
                    if (((s0.g) node2).X(keyEvent)) {
                        return true;
                    }
                } else if ((node2.getKindSet() & iA2) != 0 && (node2 instanceof AbstractC0834m)) {
                    i.c delegate3 = node2.getDelegate();
                    int i13 = 0;
                    node2 = node2;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & iA2) != 0) {
                            i13++;
                            if (i13 == 1) {
                                node2 = delegate3;
                            } else {
                                if (bVar3 == null) {
                                    bVar3 = new Q.b(new i.c[16], 0);
                                }
                                if (node2 != 0) {
                                    bVar3.c(node2);
                                    node2 = 0;
                                }
                                bVar3.c(delegate3);
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node2 = node2;
                    }
                    if (i13 == 1) {
                    }
                }
                node2 = C0832k.g(bVar3);
            }
            AbstractC0834m node3 = gVar.getNode();
            Q.b bVar4 = null;
            while (node3 != 0) {
                if (node3 instanceof s0.g) {
                    if (((s0.g) node3).V0(keyEvent)) {
                        return true;
                    }
                } else if ((node3.getKindSet() & iA2) != 0 && (node3 instanceof AbstractC0834m)) {
                    i.c delegate4 = node3.getDelegate();
                    int i14 = 0;
                    node3 = node3;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & iA2) != 0) {
                            i14++;
                            if (i14 == 1) {
                                node3 = delegate4;
                            } else {
                                if (bVar4 == null) {
                                    bVar4 = new Q.b(new i.c[16], 0);
                                }
                                if (node3 != 0) {
                                    bVar4.c(node3);
                                    node3 = 0;
                                }
                                bVar4.c(delegate4);
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node3 = node3;
                    }
                    if (i14 == 1) {
                    }
                }
                node3 = C0832k.g(bVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (((s0.g) arrayList.get(i15)).V0(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // g0.i
    public void l() {
        g0.t focusTransactionManager = getFocusTransactionManager();
        if (focusTransactionManager.ongoingTransaction) {
            m.c(this.rootFocusNode, true, true);
            return;
        }
        try {
            focusTransactionManager.f();
            m.c(this.rootFocusNode, true, true);
        } finally {
            focusTransactionManager.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v64 */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r5v10, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v4, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v5, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r5v9, types: [b0.i$c] */
    @Override // g0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m(android.view.KeyEvent r17, Ba.a<java.lang.Boolean> r18) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.m(android.view.KeyEvent, Ba.a):boolean");
    }

    @Override // g0.i
    public void n(g0.j node) {
        this.focusInvalidationManager.f(node);
    }

    @Override // g0.i
    public void o(g0.c node) {
        this.focusInvalidationManager.e(node);
    }

    @Override // g0.f
    public void p(boolean force) {
        d(force, true, true, androidx.compose.ui.focus.b.INSTANCE.c());
    }

    /* renamed from: r, reason: from getter */
    public final FocusTargetNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f22719B = new b();

        b() {
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
}
