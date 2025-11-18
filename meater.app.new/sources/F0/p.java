package F0;

import A0.AbstractC0823c0;
import A0.C0832k;
import A0.G;
import A0.InterfaceC0831j;
import A0.e0;
import A0.v0;
import A0.w0;
import b0.i;
import h0.C3476g;
import h0.C3478i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import y0.C5117w;
import y0.InterfaceC5116v;
import y0.InterfaceC5120z;

/* compiled from: SemanticsNode.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\r*\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u00152\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010 \u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\r0\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!J)\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00000\u00152\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b#\u0010$J3\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00000\u00152\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b&\u0010'J\u0011\u0010)\u001a\u0004\u0018\u00010(H\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0000H\u0000¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u00103\u001a\u0004\b4\u00105R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b7\u00108R\"\u0010<\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u00100\u001a\u0004\b9\u00102\"\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010=R\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u00102R\u0014\u0010H\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bG\u00102R\u0011\u0010L\u001a\u00020I8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010P\u001a\u00020M8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0017\u0010T\u001a\u00020Q8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010V\u001a\u00020M8F¢\u0006\u0006\u001a\u0004\bU\u0010OR\u0017\u0010Y\u001a\u00020W8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bX\u0010SR\u0011\u0010[\u001a\u00020M8F¢\u0006\u0006\u001a\u0004\bZ\u0010OR\u0014\u0010]\u001a\u00020M8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010OR\u0014\u0010_\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u00102R\u0011\u0010a\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b`\u00108R\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00000\u00158F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\be\u0010cR\u0013\u0010h\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\bg\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006i"}, d2 = {"LF0/p;", "", "Lb0/i$c;", "outerSemanticsNode", "", "mergingEnabled", "LA0/G;", "layoutNode", "LF0/l;", "unmergedConfig", "<init>", "(Lb0/i$c;ZLA0/G;LF0/l;)V", "mergedConfig", "Loa/F;", "B", "(LF0/l;)V", "", "list", "includeDeactivatedNodes", "d", "(LA0/G;Ljava/util/List;Z)V", "", "f", "(Ljava/util/List;)Ljava/util/List;", "unmergedChildren", "b", "(Ljava/util/List;)V", "LF0/i;", "role", "Lkotlin/Function1;", "LF0/x;", "properties", "c", "(LF0/i;LBa/l;)LF0/p;", "includeFakeNodes", "C", "(ZZ)Ljava/util/List;", "includeReplacedSemantics", "l", "(ZZZ)Ljava/util/List;", "LA0/c0;", "e", "()LA0/c0;", "a", "()LF0/p;", "Lb0/i$c;", "getOuterSemanticsNode$ui_release", "()Lb0/i$c;", "Z", "getMergingEnabled", "()Z", "LA0/G;", "q", "()LA0/G;", "LF0/l;", "w", "()LF0/l;", "x", "setFake$ui_release", "(Z)V", "isFake", "LF0/p;", "fakeNodeParent", "", "g", "I", "o", "()I", "id", "y", "isMergingSemanticsOfDescendants", "A", "isUnmergedLeafNode", "Ly0/z;", "p", "()Ly0/z;", "layoutInfo", "Lh0/i;", "v", "()Lh0/i;", "touchBoundsInRoot", "LU0/r;", "u", "()J", "size", "i", "boundsInRoot", "Lh0/g;", "s", "positionInRoot", "j", "boundsInWindow", "h", "boundsInParent", "z", "isTransparent", "n", "config", "k", "()Ljava/util/List;", "children", "t", "replacedChildren", "r", "parent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i.c outerSemanticsNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean mergingEnabled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final G layoutNode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l unmergedConfig;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isFake;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private p fakeNodeParent;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF0/x;", "Loa/F;", "a", "(LF0/x;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<x, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ i f4353B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar) {
            super(1);
            this.f4353B = iVar;
        }

        public final void a(x xVar) {
            v.H(xVar, this.f4353B.getValue());
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(x xVar) {
            a(xVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF0/x;", "Loa/F;", "a", "(LF0/x;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<x, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f4354B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f4354B = str;
        }

        public final void a(x xVar) {
            v.B(xVar, this.f4354B);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(x xVar) {
            a(xVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"F0/p$c", "LA0/v0;", "Lb0/i$c;", "LF0/x;", "Loa/F;", "m1", "(LF0/x;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends i.c implements v0 {

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ba.l<x, C4153F> f4355O;

        /* JADX WARN: Multi-variable type inference failed */
        c(Ba.l<? super x, C4153F> lVar) {
            this.f4355O = lVar;
        }

        @Override // A0.v0
        public void m1(x xVar) {
            this.f4355O.invoke(xVar);
        }
    }

    /* compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/G;", "it", "", "a", "(LA0/G;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.l<G, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f4356B = new d();

        d() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(G g10) {
            l lVarI = g10.I();
            boolean z10 = false;
            if (lVarI != null && lVarI.getIsMergingSemanticsOfDescendants()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/G;", "it", "", "a", "(LA0/G;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements Ba.l<G, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f4357B = new e();

        e() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(G g10) {
            l lVarI = g10.I();
            boolean z10 = false;
            if (lVarI != null && lVarI.getIsMergingSemanticsOfDescendants()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* compiled from: SemanticsNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/G;", "it", "", "a", "(LA0/G;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class f extends AbstractC3864v implements Ba.l<G, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final f f4358B = new f();

        f() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(G g10) {
            return Boolean.valueOf(g10.getNodes().q(e0.a(8)));
        }
    }

    public p(i.c cVar, boolean z10, G g10, l lVar) {
        this.outerSemanticsNode = cVar;
        this.mergingEnabled = z10;
        this.layoutNode = g10;
        this.unmergedConfig = lVar;
        this.id = g10.getSemanticsId();
    }

    private final void B(l mergedConfig) {
        if (this.unmergedConfig.getIsClearingSemantics()) {
            return;
        }
        List listD = D(this, false, false, 3, null);
        int size = listD.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) listD.get(i10);
            if (!pVar.y()) {
                mergedConfig.D(pVar.unmergedConfig);
                pVar.B(mergedConfig);
            }
        }
    }

    public static /* synthetic */ List D(p pVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return pVar.C(z10, z11);
    }

    private final void b(List<p> unmergedChildren) {
        i iVarH = q.h(this);
        if (iVarH != null && this.unmergedConfig.getIsMergingSemanticsOfDescendants() && !unmergedChildren.isEmpty()) {
            unmergedChildren.add(c(iVarH, new a(iVarH)));
        }
        l lVar = this.unmergedConfig;
        s sVar = s.f4372a;
        if (lVar.i(sVar.d()) && !unmergedChildren.isEmpty() && this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            List list = (List) m.a(this.unmergedConfig, sVar.d());
            String str = list != null ? (String) kotlin.collections.r.l0(list) : null;
            if (str != null) {
                unmergedChildren.add(0, c(null, new b(str)));
            }
        }
    }

    private final p c(i role, Ba.l<? super x, C4153F> properties) {
        l lVar = new l();
        lVar.F(false);
        lVar.E(false);
        properties.invoke(lVar);
        p pVar = new p(new c(properties), false, new G(true, role != null ? q.i(this) : q.e(this)), lVar);
        pVar.isFake = true;
        pVar.fakeNodeParent = this;
        return pVar;
    }

    private final void d(G g10, List<p> list, boolean z10) {
        Q.b<G> bVarV0 = g10.v0();
        int size = bVarV0.getSize();
        if (size > 0) {
            G[] gArrT = bVarV0.t();
            int i10 = 0;
            do {
                G g11 = gArrT[i10];
                if (g11.K0() && (z10 || !g11.getIsDeactivated())) {
                    if (g11.getNodes().q(e0.a(8))) {
                        list.add(q.a(g11, this.mergingEnabled));
                    } else {
                        d(g11, list, z10);
                    }
                }
                i10++;
            } while (i10 < size);
        }
    }

    private final List<p> f(List<p> list) {
        List listD = D(this, false, false, 3, null);
        int size = listD.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) listD.get(i10);
            if (pVar.y()) {
                list.add(pVar);
            } else if (!pVar.unmergedConfig.getIsClearingSemantics()) {
                pVar.f(list);
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List g(p pVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return pVar.f(list);
    }

    public static /* synthetic */ List m(p pVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = !pVar.mergingEnabled;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        return pVar.l(z10, z11, z12);
    }

    private final boolean y() {
        return this.mergingEnabled && this.unmergedConfig.getIsMergingSemanticsOfDescendants();
    }

    public final boolean A() {
        return !this.isFake && t().isEmpty() && q.f(this.layoutNode, d.f4356B) == null;
    }

    public final List<p> C(boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (this.isFake) {
            return kotlin.collections.r.m();
        }
        ArrayList arrayList = new ArrayList();
        d(this.layoutNode, arrayList, includeDeactivatedNodes);
        if (includeFakeNodes) {
            b(arrayList);
        }
        return arrayList;
    }

    public final p a() {
        return new p(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }

    public final AbstractC0823c0 e() {
        if (this.isFake) {
            p pVarR = r();
            if (pVarR != null) {
                return pVarR.e();
            }
            return null;
        }
        InterfaceC0831j interfaceC0831jG = q.g(this.layoutNode);
        if (interfaceC0831jG == null) {
            interfaceC0831jG = this.outerSemanticsNode;
        }
        return C0832k.h(interfaceC0831jG, e0.a(8));
    }

    public final C3478i h() {
        InterfaceC5116v interfaceC5116vW0;
        p pVarR = r();
        if (pVarR == null) {
            return C3478i.INSTANCE.a();
        }
        AbstractC0823c0 abstractC0823c0E = e();
        if (abstractC0823c0E != null) {
            if (!abstractC0823c0E.L()) {
                abstractC0823c0E = null;
            }
            if (abstractC0823c0E != null && (interfaceC5116vW0 = abstractC0823c0E.W0()) != null) {
                return InterfaceC5116v.X(C0832k.h(pVarR.outerSemanticsNode, e0.a(8)), interfaceC5116vW0, false, 2, null);
            }
        }
        return C3478i.INSTANCE.a();
    }

    public final C3478i i() {
        C3478i c3478iB;
        AbstractC0823c0 abstractC0823c0E = e();
        if (abstractC0823c0E != null) {
            if (!abstractC0823c0E.L()) {
                abstractC0823c0E = null;
            }
            if (abstractC0823c0E != null && (c3478iB = C5117w.b(abstractC0823c0E)) != null) {
                return c3478iB;
            }
        }
        return C3478i.INSTANCE.a();
    }

    public final C3478i j() {
        C3478i c3478iC;
        AbstractC0823c0 abstractC0823c0E = e();
        if (abstractC0823c0E != null) {
            if (!abstractC0823c0E.L()) {
                abstractC0823c0E = null;
            }
            if (abstractC0823c0E != null && (c3478iC = C5117w.c(abstractC0823c0E)) != null) {
                return c3478iC;
            }
        }
        return C3478i.INSTANCE.a();
    }

    public final List<p> k() {
        return m(this, false, false, false, 7, null);
    }

    public final List<p> l(boolean includeReplacedSemantics, boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        return (includeReplacedSemantics || !this.unmergedConfig.getIsClearingSemantics()) ? y() ? g(this, null, 1, null) : C(includeFakeNodes, includeDeactivatedNodes) : kotlin.collections.r.m();
    }

    public final l n() {
        if (!y()) {
            return this.unmergedConfig;
        }
        l lVarW = this.unmergedConfig.w();
        B(lVarW);
        return lVarW;
    }

    /* renamed from: o, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final InterfaceC5120z p() {
        return this.layoutNode;
    }

    /* renamed from: q, reason: from getter */
    public final G getLayoutNode() {
        return this.layoutNode;
    }

    public final p r() {
        p pVar = this.fakeNodeParent;
        if (pVar != null) {
            return pVar;
        }
        G gF = this.mergingEnabled ? q.f(this.layoutNode, e.f4357B) : null;
        if (gF == null) {
            gF = q.f(this.layoutNode, f.f4358B);
        }
        if (gF == null) {
            return null;
        }
        return q.a(gF, this.mergingEnabled);
    }

    public final long s() {
        AbstractC0823c0 abstractC0823c0E = e();
        if (abstractC0823c0E != null) {
            if (!abstractC0823c0E.L()) {
                abstractC0823c0E = null;
            }
            if (abstractC0823c0E != null) {
                return C5117w.e(abstractC0823c0E);
            }
        }
        return C3476g.INSTANCE.c();
    }

    public final List<p> t() {
        return m(this, false, true, false, 4, null);
    }

    public final long u() {
        AbstractC0823c0 abstractC0823c0E = e();
        return abstractC0823c0E != null ? abstractC0823c0E.a() : U0.r.INSTANCE.a();
    }

    public final C3478i v() {
        InterfaceC0831j interfaceC0831jG;
        if (!this.unmergedConfig.getIsMergingSemanticsOfDescendants() || (interfaceC0831jG = q.g(this.layoutNode)) == null) {
            interfaceC0831jG = this.outerSemanticsNode;
        }
        return w0.c(interfaceC0831jG.getNode(), w0.a(this.unmergedConfig));
    }

    /* renamed from: w, reason: from getter */
    public final l getUnmergedConfig() {
        return this.unmergedConfig;
    }

    /* renamed from: x, reason: from getter */
    public final boolean getIsFake() {
        return this.isFake;
    }

    public final boolean z() {
        AbstractC0823c0 abstractC0823c0E = e();
        if (abstractC0823c0E != null) {
            return abstractC0823c0E.E2();
        }
        return false;
    }
}
