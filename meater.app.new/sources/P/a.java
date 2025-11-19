package P;

import Ba.l;
import Ba.p;
import P.d;
import P.g;
import W.IntRef;
import java.util.List;
import kotlin.AbstractC1564q;
import kotlin.C1489A0;
import kotlin.C1536d;
import kotlin.C1551j0;
import kotlin.C1553k0;
import kotlin.InterfaceC1496E;
import kotlin.InterfaceC1542f;
import kotlin.InterfaceC1552k;
import kotlin.InterfaceC1562p;
import kotlin.Metadata;
import kotlin.Q0;
import kotlin.R0;
import kotlin.SlotWriter;
import kotlin.Z0;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.W;
import oa.C4153F;

/* compiled from: ChangeList.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J)\u0010\u0010\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\u0003J\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0003J\u0017\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\b¢\u0006\u0004\b)\u0010\u0003J\u0015\u0010*\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\b¢\u0006\u0004\b,\u0010\u0003J\r\u0010-\u001a\u00020\b¢\u0006\u0004\b-\u0010\u0003J\r\u0010.\u001a\u00020\b¢\u0006\u0004\b.\u0010\u0003J\u001d\u00101\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J%\u00105\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00100\u001a\u00020/2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\b2\u0006\u00107\u001a\u00020\u0017¢\u0006\u0004\b8\u0010#J)\u0010=\u001a\u00020\b2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b092\u0006\u0010<\u001a\u00020:¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\b2\b\u0010?\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b@\u0010(J;\u0010E\u001a\u00020\b\"\u0004\b\u0000\u0010A\"\u0004\b\u0001\u0010B2\u0006\u0010\u0013\u001a\u00028\u00012\u0018\u0010D\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0C¢\u0006\u0004\bE\u0010FJ\u001d\u0010I\u001a\u00020\b2\u0006\u0010G\u001a\u00020\u00172\u0006\u0010H\u001a\u00020\u0017¢\u0006\u0004\bI\u0010JJ%\u0010L\u001a\u00020\b2\u0006\u0010K\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0017¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\b2\u0006\u0010N\u001a\u00020\u0017¢\u0006\u0004\bO\u0010#J\u0015\u0010P\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0017¢\u0006\u0004\bP\u0010#J\u001d\u0010S\u001a\u00020\b2\u000e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160Q¢\u0006\u0004\bS\u0010TJ\u001b\u0010W\u001a\u00020\b2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\b0U¢\u0006\u0004\bW\u0010XJ\u001d\u0010[\u001a\u00020\b2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b[\u0010\\J%\u0010_\u001a\u00020\b2\u000e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160]2\u0006\u0010^\u001a\u00020Y¢\u0006\u0004\b_\u0010`J/\u0010f\u001a\u00020\b2\b\u0010b\u001a\u0004\u0018\u00010a2\u0006\u0010d\u001a\u00020c2\u0006\u00100\u001a\u00020e2\u0006\u0010K\u001a\u00020e¢\u0006\u0004\bf\u0010gJ%\u0010j\u001a\u00020\b2\u0006\u0010<\u001a\u00020h2\u0006\u0010d\u001a\u00020c2\u0006\u0010i\u001a\u00020e¢\u0006\u0004\bj\u0010kJ\r\u0010l\u001a\u00020\b¢\u0006\u0004\bl\u0010\u0003J!\u0010n\u001a\u00020\b2\u0006\u0010m\u001a\u00020\u00002\n\b\u0002\u0010^\u001a\u0004\u0018\u00010Y¢\u0006\u0004\bn\u0010oR\u0014\u0010r\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010q¨\u0006s"}, d2 = {"LP/a;", "LP/h;", "<init>", "()V", "", "c", "()Z", "d", "Loa/F;", "a", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "b", "(LO/f;LO/c1;LO/Q0;)V", "LO/R0;", "value", "w", "(LO/R0;)V", "", "", "groupSlotIndex", "G", "(Ljava/lang/Object;I)V", "LO/d;", "anchor", "D", "(Ljava/lang/Object;LO/d;I)V", "f", "(LO/d;Ljava/lang/Object;)V", "count", "C", "(I)V", "z", "i", "data", "E", "(Ljava/lang/Object;)V", "p", "o", "(LO/d;)V", "m", "B", "x", "LO/Z0;", "from", "r", "(LO/d;LO/Z0;)V", "LP/c;", "fixups", "s", "(LO/d;LO/Z0;LP/c;)V", "offset", "t", "Lkotlin/Function1;", "LO/p;", "action", "composition", "l", "(LBa/l;LO/p;)V", "node", "I", "T", "V", "Lkotlin/Function2;", "block", "F", "(Ljava/lang/Object;LBa/p;)V", "removeFrom", "moveCount", "y", "(II)V", "to", "u", "(III)V", "distance", "e", "H", "", "nodes", "k", "([Ljava/lang/Object;)V", "Lkotlin/Function0;", "effect", "A", "(LBa/a;)V", "LW/d;", "effectiveNodeIndexOut", "j", "(LW/d;LO/d;)V", "", "effectiveNodeIndex", "g", "(Ljava/util/List;LW/d;)V", "LO/j0;", "resolvedState", "LO/q;", "parentContext", "LO/k0;", "h", "(LO/j0;LO/q;LO/k0;LO/k0;)V", "LO/E;", "reference", "v", "(LO/E;LO/q;LO/k0;)V", "n", "changeList", "q", "(LP/a;LW/d;)V", "LP/g;", "LP/g;", "operations", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g operations = new g();

    public final void A(Ba.a<C4153F> effect) {
        g gVar = this.operations;
        d.A a10 = d.A.f13656c;
        gVar.y(a10);
        g.c.d(g.c.a(gVar), d.t.a(0), effect);
        if (gVar.pushedIntMask == gVar.n(a10.getInts()) && gVar.pushedObjectMask == gVar.n(a10.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = a10.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(a10.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = a10.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(a10.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + a10 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void B() {
        this.operations.x(d.B.f13657c);
    }

    public final void C(int count) {
        g gVar = this.operations;
        d.C c10 = d.C.f13658c;
        gVar.y(c10);
        g.c.c(g.c.a(gVar), d.q.a(0), count);
        if (gVar.pushedIntMask == gVar.n(c10.getInts()) && gVar.pushedObjectMask == gVar.n(c10.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = c10.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c10.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = c10.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c10.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + c10 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void D(Object value, C1536d anchor, int groupSlotIndex) {
        g gVar = this.operations;
        d.D d10 = d.D.f13659c;
        gVar.y(d10);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), value);
        g.c.d(gVarA, d.t.a(1), anchor);
        g.c.c(gVarA, d.q.a(0), groupSlotIndex);
        if (gVar.pushedIntMask == gVar.n(d10.getInts()) && gVar.pushedObjectMask == gVar.n(d10.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = d10.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(d10.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = d10.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(d10.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + d10 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void E(Object data) {
        g gVar = this.operations;
        d.E e10 = d.E.f13660c;
        gVar.y(e10);
        g.c.d(g.c.a(gVar), d.t.a(0), data);
        if (gVar.pushedIntMask == gVar.n(e10.getInts()) && gVar.pushedObjectMask == gVar.n(e10.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = e10.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(e10.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = e10.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(e10.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + e10 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final <T, V> void F(V value, p<? super T, ? super V, C4153F> block) {
        g gVar = this.operations;
        d.F f10 = d.F.f13661c;
        gVar.y(f10);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), value);
        int iA = d.t.a(1);
        C3862t.e(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        g.c.d(gVarA, iA, (p) W.f(block, 2));
        if (gVar.pushedIntMask == gVar.n(f10.getInts()) && gVar.pushedObjectMask == gVar.n(f10.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = f10.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(f10.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = f10.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(f10.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + f10 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void G(Object value, int groupSlotIndex) {
        g gVar = this.operations;
        d.G g10 = d.G.f13662c;
        gVar.y(g10);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), value);
        g.c.c(gVarA, d.q.a(0), groupSlotIndex);
        if (gVar.pushedIntMask == gVar.n(g10.getInts()) && gVar.pushedObjectMask == gVar.n(g10.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = g10.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(g10.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = g10.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(g10.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + g10 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void H(int count) {
        g gVar = this.operations;
        d.H h10 = d.H.f13663c;
        gVar.y(h10);
        g.c.c(g.c.a(gVar), d.q.a(0), count);
        if (gVar.pushedIntMask == gVar.n(h10.getInts()) && gVar.pushedObjectMask == gVar.n(h10.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = h10.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(h10.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = h10.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(h10.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + h10 + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void I(Object node) {
        if (node instanceof InterfaceC1552k) {
            this.operations.x(d.I.f13664c);
        }
    }

    public final void a() {
        this.operations.m();
    }

    public final void b(InterfaceC1542f<?> applier, SlotWriter slots, Q0 rememberManager) {
        this.operations.r(applier, slots, rememberManager);
    }

    public final boolean c() {
        return this.operations.t();
    }

    public final boolean d() {
        return this.operations.u();
    }

    public final void e(int distance) {
        g gVar = this.operations;
        d.C1585a c1585a = d.C1585a.f13665c;
        gVar.y(c1585a);
        g.c.c(g.c.a(gVar), d.q.a(0), distance);
        if (gVar.pushedIntMask == gVar.n(c1585a.getInts()) && gVar.pushedObjectMask == gVar.n(c1585a.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = c1585a.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c1585a.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = c1585a.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c1585a.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + c1585a + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void f(C1536d anchor, Object value) {
        g gVar = this.operations;
        d.C1586b c1586b = d.C1586b.f13666c;
        gVar.y(c1586b);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), anchor);
        g.c.d(gVarA, d.t.a(1), value);
        if (gVar.pushedIntMask == gVar.n(c1586b.getInts()) && gVar.pushedObjectMask == gVar.n(c1586b.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = c1586b.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c1586b.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = c1586b.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c1586b.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + c1586b + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void g(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        if (nodes.isEmpty()) {
            return;
        }
        g gVar = this.operations;
        d.C0204d c0204d = d.C0204d.f13668c;
        gVar.y(c0204d);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(1), nodes);
        g.c.d(gVarA, d.t.a(0), effectiveNodeIndex);
        if (gVar.pushedIntMask == gVar.n(c0204d.getInts()) && gVar.pushedObjectMask == gVar.n(c0204d.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = c0204d.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c0204d.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = c0204d.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c0204d.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + c0204d + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void h(C1551j0 resolvedState, AbstractC1564q parentContext, C1553k0 from, C1553k0 to) {
        g gVar = this.operations;
        d.C1588e c1588e = d.C1588e.f13669c;
        gVar.y(c1588e);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), resolvedState);
        g.c.d(gVarA, d.t.a(1), parentContext);
        g.c.d(gVarA, d.t.a(3), to);
        g.c.d(gVarA, d.t.a(2), from);
        if (gVar.pushedIntMask == gVar.n(c1588e.getInts()) && gVar.pushedObjectMask == gVar.n(c1588e.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = c1588e.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c1588e.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = c1588e.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c1588e.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + c1588e + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void i() {
        this.operations.x(d.C1589f.f13670c);
    }

    public final void j(IntRef effectiveNodeIndexOut, C1536d anchor) {
        g gVar = this.operations;
        d.C1590g c1590g = d.C1590g.f13671c;
        gVar.y(c1590g);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), effectiveNodeIndexOut);
        g.c.d(gVarA, d.t.a(1), anchor);
        if (gVar.pushedIntMask == gVar.n(c1590g.getInts()) && gVar.pushedObjectMask == gVar.n(c1590g.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = c1590g.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c1590g.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = c1590g.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c1590g.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + c1590g + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void k(Object[] nodes) {
        if (nodes.length == 0) {
            return;
        }
        g gVar = this.operations;
        d.C1591h c1591h = d.C1591h.f13672c;
        gVar.y(c1591h);
        g.c.d(g.c.a(gVar), d.t.a(0), nodes);
        if (gVar.pushedIntMask == gVar.n(c1591h.getInts()) && gVar.pushedObjectMask == gVar.n(c1591h.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = c1591h.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c1591h.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = c1591h.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c1591h.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + c1591h + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void l(l<? super InterfaceC1562p, C4153F> action, InterfaceC1562p composition) {
        g gVar = this.operations;
        d.C1592i c1592i = d.C1592i.f13673c;
        gVar.y(c1592i);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), action);
        g.c.d(gVarA, d.t.a(1), composition);
        if (gVar.pushedIntMask == gVar.n(c1592i.getInts()) && gVar.pushedObjectMask == gVar.n(c1592i.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = c1592i.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c1592i.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = c1592i.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c1592i.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + c1592i + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void m() {
        this.operations.x(d.j.f13674c);
    }

    public final void n() {
        this.operations.x(d.k.f13675c);
    }

    public final void o(C1536d anchor) {
        g gVar = this.operations;
        d.l lVar = d.l.f13676c;
        gVar.y(lVar);
        g.c.d(g.c.a(gVar), d.t.a(0), anchor);
        if (gVar.pushedIntMask == gVar.n(lVar.getInts()) && gVar.pushedObjectMask == gVar.n(lVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = lVar.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(lVar.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = lVar.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(lVar.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + lVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void p() {
        this.operations.x(d.m.f13677c);
    }

    public final void q(a changeList, IntRef effectiveNodeIndex) {
        if (changeList.d()) {
            g gVar = this.operations;
            d.C1587c c1587c = d.C1587c.f13667c;
            gVar.y(c1587c);
            g gVarA = g.c.a(gVar);
            g.c.d(gVarA, d.t.a(0), changeList);
            g.c.d(gVarA, d.t.a(1), effectiveNodeIndex);
            if (gVar.pushedIntMask == gVar.n(c1587c.getInts()) && gVar.pushedObjectMask == gVar.n(c1587c.getObjects())) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int iB = c1587c.getInts();
            int i10 = 0;
            for (int i11 = 0; i11 < iB; i11++) {
                if (((1 << i11) & gVar.pushedIntMask) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(c1587c.e(d.q.a(i11)));
                    i10++;
                }
            }
            String string = sb2.toString();
            C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int iD = c1587c.getObjects();
            int i12 = 0;
            for (int i13 = 0; i13 < iD; i13++) {
                if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                    if (i10 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(c1587c.f(d.t.a(i13)));
                    i12++;
                }
            }
            String string2 = sb3.toString();
            C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
            C1489A0.b("Error while pushing " + c1587c + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
        }
    }

    public final void r(C1536d anchor, Z0 from) {
        g gVar = this.operations;
        d.o oVar = d.o.f13679c;
        gVar.y(oVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), anchor);
        g.c.d(gVarA, d.t.a(1), from);
        if (gVar.pushedIntMask == gVar.n(oVar.getInts()) && gVar.pushedObjectMask == gVar.n(oVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = oVar.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(oVar.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = oVar.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(oVar.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + oVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void s(C1536d anchor, Z0 from, c fixups) {
        g gVar = this.operations;
        d.p pVar = d.p.f13680c;
        gVar.y(pVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), anchor);
        g.c.d(gVarA, d.t.a(1), from);
        g.c.d(gVarA, d.t.a(2), fixups);
        if (gVar.pushedIntMask == gVar.n(pVar.getInts()) && gVar.pushedObjectMask == gVar.n(pVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = pVar.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(pVar.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = pVar.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(pVar.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + pVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void t(int offset) {
        g gVar = this.operations;
        d.r rVar = d.r.f13681c;
        gVar.y(rVar);
        g.c.c(g.c.a(gVar), d.q.a(0), offset);
        if (gVar.pushedIntMask == gVar.n(rVar.getInts()) && gVar.pushedObjectMask == gVar.n(rVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = rVar.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(rVar.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = rVar.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(rVar.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + rVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void u(int to, int from, int count) {
        g gVar = this.operations;
        d.s sVar = d.s.f13682c;
        gVar.y(sVar);
        g gVarA = g.c.a(gVar);
        g.c.c(gVarA, d.q.a(1), to);
        g.c.c(gVarA, d.q.a(0), from);
        g.c.c(gVarA, d.q.a(2), count);
        if (gVar.pushedIntMask == gVar.n(sVar.getInts()) && gVar.pushedObjectMask == gVar.n(sVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = sVar.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(sVar.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = sVar.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(sVar.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + sVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void v(InterfaceC1496E composition, AbstractC1564q parentContext, C1553k0 reference) {
        g gVar = this.operations;
        d.v vVar = d.v.f13684c;
        gVar.y(vVar);
        g gVarA = g.c.a(gVar);
        g.c.d(gVarA, d.t.a(0), composition);
        g.c.d(gVarA, d.t.a(1), parentContext);
        g.c.d(gVarA, d.t.a(2), reference);
        if (gVar.pushedIntMask == gVar.n(vVar.getInts()) && gVar.pushedObjectMask == gVar.n(vVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = vVar.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(vVar.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = vVar.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(vVar.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + vVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void w(R0 value) {
        g gVar = this.operations;
        d.w wVar = d.w.f13685c;
        gVar.y(wVar);
        g.c.d(g.c.a(gVar), d.t.a(0), value);
        if (gVar.pushedIntMask == gVar.n(wVar.getInts()) && gVar.pushedObjectMask == gVar.n(wVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = wVar.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(wVar.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = wVar.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(wVar.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + wVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void x() {
        this.operations.x(d.x.f13686c);
    }

    public final void y(int removeFrom, int moveCount) {
        g gVar = this.operations;
        d.y yVar = d.y.f13687c;
        gVar.y(yVar);
        g gVarA = g.c.a(gVar);
        g.c.c(gVarA, d.q.a(0), removeFrom);
        g.c.c(gVarA, d.q.a(1), moveCount);
        if (gVar.pushedIntMask == gVar.n(yVar.getInts()) && gVar.pushedObjectMask == gVar.n(yVar.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int iB = yVar.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            if (((1 << i11) & gVar.pushedIntMask) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(yVar.e(d.q.a(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder();
        int iD = yVar.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < iD; i13++) {
            if (((1 << i13) & gVar.pushedObjectMask) != 0) {
                if (i10 > 0) {
                    sb3.append(", ");
                }
                sb3.append(yVar.f(d.t.a(i13)));
                i12++;
            }
        }
        String string2 = sb3.toString();
        C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + yVar + ". Not all arguments were provided. Missing " + i10 + " int arguments (" + string + ") and " + i12 + " object arguments (" + string2 + ").");
    }

    public final void z() {
        this.operations.x(d.z.f13688c);
    }
}
