package P;

import Ba.l;
import Ba.p;
import W.IntRef;
import java.util.List;
import kotlin.AbstractC1564q;
import kotlin.C1522V;
import kotlin.C1536d;
import kotlin.C1551j0;
import kotlin.C1553k0;
import kotlin.C1556m;
import kotlin.C1560o;
import kotlin.InterfaceC1496E;
import kotlin.InterfaceC1562p;
import kotlin.Metadata;
import kotlin.R0;
import kotlin.SlotReader;
import kotlin.Z0;
import kotlin.w1;
import oa.C4153F;

/* compiled from: ComposerChangeListWriter.kt */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u00011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\nJ\u0015\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\nJ\u0015\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020\u0018¢\u0006\u0004\b-\u0010.J'\u0010/\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u0018¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b3\u0010%J\r\u00104\u001a\u00020\b¢\u0006\u0004\b4\u0010\nJ\u0017\u00106\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\b¢\u0006\u0004\b8\u0010\nJ\r\u00109\u001a\u00020\b¢\u0006\u0004\b9\u0010\nJ\r\u0010:\u001a\u00020\b¢\u0006\u0004\b:\u0010\nJ\r\u0010;\u001a\u00020\b¢\u0006\u0004\b;\u0010\nJ\u001d\u0010=\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020<¢\u0006\u0004\b=\u0010>J%\u0010A\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020<2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0015\u0010D\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u0018¢\u0006\u0004\bD\u0010%J)\u0010I\u001a\u00020\b2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\b0E2\u0006\u0010H\u001a\u00020F¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\b2\b\u0010K\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bL\u00107J;\u0010Q\u001a\u00020\b\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N2\u0006\u0010)\u001a\u00028\u00012\u0018\u0010P\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0O¢\u0006\u0004\bQ\u0010RJ\u001d\u0010T\u001a\u00020\b2\u0006\u0010S\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\bT\u0010\u001cJ%\u0010U\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\bU\u0010!J\r\u0010V\u001a\u00020\b¢\u0006\u0004\bV\u0010\nJ\r\u0010W\u001a\u00020\b¢\u0006\u0004\bW\u0010\nJ\u001d\u0010Y\u001a\u00020\b2\u0006\u0010S\u001a\u00020\u00182\u0006\u0010X\u001a\u00020\u0018¢\u0006\u0004\bY\u0010\u001cJ\r\u0010Z\u001a\u00020\b¢\u0006\u0004\bZ\u0010\nJ\u0017\u0010[\u001a\u00020\b2\b\u0010K\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b[\u00107J\u001b\u0010N\u001a\u00020\b2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\b0\\¢\u0006\u0004\bN\u0010^J\u001d\u0010a\u001a\u00020\b2\u0006\u0010`\u001a\u00020_2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\ba\u0010bJ%\u0010f\u001a\u00020\b2\u000e\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010c2\u0006\u0010e\u001a\u00020_¢\u0006\u0004\bf\u0010gJ/\u0010m\u001a\u00020\b2\b\u0010i\u001a\u0004\u0018\u00010h2\u0006\u0010k\u001a\u00020j2\u0006\u0010\u001e\u001a\u00020l2\u0006\u0010\u001d\u001a\u00020l¢\u0006\u0004\bm\u0010nJ%\u0010q\u001a\u00020\b2\u0006\u0010H\u001a\u00020o2\u0006\u0010k\u001a\u00020j2\u0006\u0010p\u001a\u00020l¢\u0006\u0004\bq\u0010rJ\r\u0010s\u001a\u00020\b¢\u0006\u0004\bs\u0010\nJ!\u0010u\u001a\u00020\b2\u0006\u0010t\u001a\u00020\u00042\n\b\u0002\u0010e\u001a\u0004\u0018\u00010_¢\u0006\u0004\bu\u0010vJ\r\u0010w\u001a\u00020\b¢\u0006\u0004\bw\u0010\nJ\r\u0010x\u001a\u00020\b¢\u0006\u0004\bx\u0010\nJ\r\u0010y\u001a\u00020\b¢\u0006\u0004\by\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010zR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010{\u001a\u0004\b|\u0010}\"\u0004\bM\u0010~R\u0016\u0010\u007f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u00106R\u0017\u0010\u0082\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\by\u0010\u0081\u0001R&\u0010\u0086\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\ba\u00106\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0005\b\u0085\u0001\u0010\u000fR\u0017\u0010\u0087\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010\u0016R\u0017\u0010\u0088\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010\u0016R!\u0010\u008b\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bs\u0010\u008a\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010\u0016R\u0017\u0010\u008c\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010\u0016R\u0017\u0010\u008d\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0014\u0010\u0093\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0084\u0001¨\u0006\u0094\u0001"}, d2 = {"LP/b;", "", "LO/m;", "composer", "LP/a;", "changeList", "<init>", "(LO/m;LP/a;)V", "Loa/F;", "B", "()V", "D", "", "useParentSlot", "E", "(Z)V", "m", "LO/d;", "anchor", "l", "(LO/d;)V", "forParent", "I", "H", "", "removeFrom", "moveCount", "K", "(II)V", "to", "from", "count", "G", "(III)V", "C", "location", "y", "(I)V", "z", "L", "LO/R0;", "value", "O", "(LO/R0;)V", "groupSlotIndex", "b0", "(Ljava/lang/Object;I)V", "Y", "(Ljava/lang/Object;LO/d;I)V", "a", "(LO/d;Ljava/lang/Object;)V", "X", "R", "data", "Z", "(Ljava/lang/Object;)V", "k", "g", "W", "P", "LO/Z0;", "t", "(LO/d;LO/Z0;)V", "LP/c;", "fixups", "u", "(LO/d;LO/Z0;LP/c;)V", "offset", "v", "Lkotlin/Function1;", "LO/p;", "action", "composition", "f", "(LBa/l;LO/p;)V", "node", "c0", "T", "V", "Lkotlin/Function2;", "block", "a0", "(Ljava/lang/Object;LBa/p;)V", "nodeIndex", "Q", "x", "M", "i", "group", "j", "A", "w", "Lkotlin/Function0;", "effect", "(LBa/a;)V", "LW/d;", "effectiveNodeIndexOut", "e", "(LW/d;LO/d;)V", "", "nodes", "effectiveNodeIndex", "b", "(Ljava/util/List;LW/d;)V", "LO/j0;", "resolvedState", "LO/q;", "parentContext", "LO/k0;", "c", "(LO/j0;LO/q;LO/k0;LO/k0;)V", "LO/E;", "reference", "N", "(LO/E;LO/q;LO/k0;)V", "h", "other", "s", "(LP/a;LW/d;)V", "n", "S", "d", "LO/m;", "LP/a;", "o", "()LP/a;", "(LP/a;)V", "startedGroup", "LO/V;", "LO/V;", "startedGroups", "p", "()Z", "U", "implicitRootStart", "writersReaderDelta", "pendingUps", "LO/w1;", "LO/w1;", "pendingDownNodes", "moveFrom", "moveTo", "LO/Y0;", "r", "()LO/Y0;", "reader", "q", "pastParent", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: n, reason: collision with root package name */
    public static final int f13639n = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C1556m composer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private a changeList;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean startedGroup;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int writersReaderDelta;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int pendingUps;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int moveCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C1522V startedGroups = new C1522V();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean implicitRootStart = true;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private w1<Object> pendingDownNodes = new w1<>();

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int removeFrom = -1;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int moveFrom = -1;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int moveTo = -1;

    public b(C1556m c1556m, a aVar) {
        this.composer = c1556m;
        this.changeList = aVar;
    }

    private final void B() {
        C();
    }

    private final void C() {
        int i10 = this.pendingUps;
        if (i10 > 0) {
            this.changeList.H(i10);
            this.pendingUps = 0;
        }
        if (this.pendingDownNodes.d()) {
            this.changeList.k(this.pendingDownNodes.i());
            this.pendingDownNodes.a();
        }
    }

    private final void D() {
        J(this, false, 1, null);
        L();
    }

    private final void E(boolean useParentSlot) {
        I(useParentSlot);
    }

    static /* synthetic */ void F(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        bVar.E(z10);
    }

    private final void G(int to, int from, int count) {
        B();
        this.changeList.u(to, from, count);
    }

    private final void H() {
        int i10 = this.moveCount;
        if (i10 > 0) {
            int i11 = this.removeFrom;
            if (i11 >= 0) {
                K(i11, i10);
                this.removeFrom = -1;
            } else {
                G(this.moveTo, this.moveFrom, i10);
                this.moveFrom = -1;
                this.moveTo = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void I(boolean forParent) {
        int parent = forParent ? r().getParent() : r().getCurrent();
        int i10 = parent - this.writersReaderDelta;
        if (!(i10 >= 0)) {
            C1560o.s("Tried to seek backward");
        }
        if (i10 > 0) {
            this.changeList.e(i10);
            this.writersReaderDelta = parent;
        }
    }

    static /* synthetic */ void J(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        bVar.I(z10);
    }

    private final void K(int removeFrom, int moveCount) {
        B();
        this.changeList.y(removeFrom, moveCount);
    }

    private final void l(C1536d anchor) {
        F(this, false, 1, null);
        this.changeList.o(anchor);
        this.startedGroup = true;
    }

    private final void m() {
        if (this.startedGroup || !this.implicitRootStart) {
            return;
        }
        F(this, false, 1, null);
        this.changeList.p();
        this.startedGroup = true;
    }

    private final SlotReader r() {
        return this.composer.getReader();
    }

    public final void A() {
        H();
        if (this.pendingDownNodes.d()) {
            this.pendingDownNodes.g();
        } else {
            this.pendingUps++;
        }
    }

    public final void L() {
        SlotReader slotReaderR;
        int parent;
        if (r().getGroupsSize() <= 0 || this.startedGroups.h(-2) == (parent = (slotReaderR = r()).getParent())) {
            return;
        }
        m();
        if (parent > 0) {
            C1536d c1536dA = slotReaderR.a(parent);
            this.startedGroups.j(parent);
            l(c1536dA);
        }
    }

    public final void M() {
        C();
        if (this.startedGroup) {
            W();
            k();
        }
    }

    public final void N(InterfaceC1496E composition, AbstractC1564q parentContext, C1553k0 reference) {
        this.changeList.v(composition, parentContext, reference);
    }

    public final void O(R0 value) {
        this.changeList.w(value);
    }

    public final void P() {
        D();
        this.changeList.x();
        this.writersReaderDelta += r().p();
    }

    public final void Q(int nodeIndex, int count) {
        if (count > 0) {
            if (!(nodeIndex >= 0)) {
                C1560o.s("Invalid remove index " + nodeIndex);
            }
            if (this.removeFrom == nodeIndex) {
                this.moveCount += count;
                return;
            }
            H();
            this.removeFrom = nodeIndex;
            this.moveCount = count;
        }
    }

    public final void R() {
        this.changeList.z();
    }

    public final void S() {
        this.startedGroup = false;
        this.startedGroups.a();
        this.writersReaderDelta = 0;
    }

    public final void T(a aVar) {
        this.changeList = aVar;
    }

    public final void U(boolean z10) {
        this.implicitRootStart = z10;
    }

    public final void V(Ba.a<C4153F> effect) {
        this.changeList.A(effect);
    }

    public final void W() {
        this.changeList.B();
    }

    public final void X(int count) {
        if (count > 0) {
            D();
            this.changeList.C(count);
        }
    }

    public final void Y(Object value, C1536d anchor, int groupSlotIndex) {
        this.changeList.D(value, anchor, groupSlotIndex);
    }

    public final void Z(Object data) {
        F(this, false, 1, null);
        this.changeList.E(data);
    }

    public final void a(C1536d anchor, Object value) {
        this.changeList.f(anchor, value);
    }

    public final <T, V> void a0(V value, p<? super T, ? super V, C4153F> block) {
        B();
        this.changeList.F(value, block);
    }

    public final void b(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        this.changeList.g(nodes, effectiveNodeIndex);
    }

    public final void b0(Object value, int groupSlotIndex) {
        E(true);
        this.changeList.G(value, groupSlotIndex);
    }

    public final void c(C1551j0 resolvedState, AbstractC1564q parentContext, C1553k0 from, C1553k0 to) {
        this.changeList.h(resolvedState, parentContext, from, to);
    }

    public final void c0(Object node) {
        B();
        this.changeList.I(node);
    }

    public final void d() {
        F(this, false, 1, null);
        this.changeList.i();
    }

    public final void e(IntRef effectiveNodeIndexOut, C1536d anchor) {
        C();
        this.changeList.j(effectiveNodeIndexOut, anchor);
    }

    public final void f(l<? super InterfaceC1562p, C4153F> action, InterfaceC1562p composition) {
        this.changeList.l(action, composition);
    }

    public final void g() {
        int parent = r().getParent();
        if (!(this.startedGroups.h(-1) <= parent)) {
            C1560o.s("Missed recording an endGroup");
        }
        if (this.startedGroups.h(-1) == parent) {
            F(this, false, 1, null);
            this.startedGroups.i();
            this.changeList.m();
        }
    }

    public final void h() {
        this.changeList.n();
        this.writersReaderDelta = 0;
    }

    public final void i() {
        H();
    }

    public final void j(int nodeIndex, int group) {
        i();
        C();
        int iN = r().J(group) ? 1 : r().N(group);
        if (iN > 0) {
            Q(nodeIndex, iN);
        }
    }

    public final void k() {
        if (this.startedGroup) {
            F(this, false, 1, null);
            F(this, false, 1, null);
            this.changeList.m();
            this.startedGroup = false;
        }
    }

    public final void n() {
        C();
        if (this.startedGroups.d()) {
            return;
        }
        C1560o.s("Missed recording an endGroup()");
    }

    /* renamed from: o, reason: from getter */
    public final a getChangeList() {
        return this.changeList;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final boolean q() {
        return r().getParent() - this.writersReaderDelta < 0;
    }

    public final void s(a other, IntRef effectiveNodeIndex) {
        this.changeList.q(other, effectiveNodeIndex);
    }

    public final void t(C1536d anchor, Z0 from) {
        C();
        D();
        H();
        this.changeList.r(anchor, from);
    }

    public final void u(C1536d anchor, Z0 from, c fixups) {
        C();
        D();
        H();
        this.changeList.s(anchor, from, fixups);
    }

    public final void v(int offset) {
        D();
        this.changeList.t(offset);
    }

    public final void w(Object node) {
        H();
        this.pendingDownNodes.h(node);
    }

    public final void x(int from, int to, int count) {
        if (count > 0) {
            int i10 = this.moveCount;
            if (i10 > 0 && this.moveFrom == from - i10 && this.moveTo == to - i10) {
                this.moveCount = i10 + count;
                return;
            }
            H();
            this.moveFrom = from;
            this.moveTo = to;
            this.moveCount = count;
        }
    }

    public final void y(int location) {
        this.writersReaderDelta += location - r().getCurrent();
    }

    public final void z(int location) {
        this.writersReaderDelta = location;
    }
}
