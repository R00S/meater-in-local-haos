package P;

import Ba.p;
import P.d;
import P.g;
import kotlin.C1489A0;
import kotlin.C1536d;
import kotlin.C1560o;
import kotlin.InterfaceC1542f;
import kotlin.Metadata;
import kotlin.Q0;
import kotlin.SlotWriter;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.W;
import oa.C4153F;

/* compiled from: FixupList.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J)\u0010\u000f\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0018\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0003J;\u0010 \u001a\u00020\u0007\"\u0004\b\u0000\u0010\u001b\"\u0004\b\u0001\u0010\u001c2\u0006\u0010\u001d\u001a\u00028\u00002\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#¨\u0006&"}, d2 = {"LP/c;", "LP/h;", "<init>", "()V", "", "e", "()Z", "Loa/F;", "a", "LO/f;", "applier", "LO/c1;", "slots", "LO/Q0;", "rememberManager", "d", "(LO/f;LO/c1;LO/Q0;)V", "Lkotlin/Function0;", "", "factory", "", "insertIndex", "LO/d;", "groupAnchor", "b", "(LBa/a;ILO/d;)V", "c", "V", "T", "value", "Lkotlin/Function2;", "block", "f", "(Ljava/lang/Object;LBa/p;)V", "LP/g;", "LP/g;", "operations", "pendingOperations", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g operations = new g();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g pendingOperations = new g();

    public final void a() {
        this.pendingOperations.m();
        this.operations.m();
    }

    public final void b(Ba.a<? extends Object> factory, int insertIndex, C1536d groupAnchor) {
        g gVar;
        g gVar2;
        g gVar3 = this.operations;
        d.n nVar = d.n.f13678c;
        gVar3.y(nVar);
        g gVarA = g.c.a(gVar3);
        g.c.d(gVarA, d.t.a(0), factory);
        g.c.c(gVarA, d.q.a(0), insertIndex);
        int i10 = 1;
        g.c.d(gVarA, d.t.a(1), groupAnchor);
        if (!(gVar3.pushedIntMask == gVar3.n(nVar.getInts()) && gVar3.pushedObjectMask == gVar3.n(nVar.getObjects()))) {
            StringBuilder sb2 = new StringBuilder();
            int iB = nVar.getInts();
            int i11 = 0;
            int i12 = 0;
            while (i12 < iB) {
                if (((i10 << i12) & gVar3.pushedIntMask) != 0) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(nVar.e(d.q.a(i12)));
                    i11++;
                }
                i12++;
                i10 = 1;
            }
            String string = sb2.toString();
            C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder();
            int iD = nVar.getObjects();
            int i13 = 0;
            int i14 = 0;
            while (i14 < iD) {
                if (((1 << i14) & gVar3.pushedObjectMask) != 0) {
                    if (i11 > 0) {
                        sb3.append(", ");
                    }
                    gVar2 = gVar3;
                    sb3.append(nVar.f(d.t.a(i14)));
                    i13++;
                } else {
                    gVar2 = gVar3;
                }
                i14++;
                gVar3 = gVar2;
            }
            String string2 = sb3.toString();
            C3862t.f(string2, "StringBuilder().apply(builderAction).toString()");
            C1489A0.b("Error while pushing " + nVar + ". Not all arguments were provided. Missing " + i11 + " int arguments (" + string + ") and " + i13 + " object arguments (" + string2 + ").");
        }
        g gVar4 = this.pendingOperations;
        d.u uVar = d.u.f13683c;
        gVar4.y(uVar);
        g gVarA2 = g.c.a(gVar4);
        g.c.c(gVarA2, d.q.a(0), insertIndex);
        g.c.d(gVarA2, d.t.a(0), groupAnchor);
        if (gVar4.pushedIntMask == gVar4.n(uVar.getInts()) && gVar4.pushedObjectMask == gVar4.n(uVar.getObjects())) {
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        int iB2 = uVar.getInts();
        int i15 = 0;
        for (int i16 = 0; i16 < iB2; i16++) {
            if (((1 << i16) & gVar4.pushedIntMask) != 0) {
                if (i15 > 0) {
                    sb4.append(", ");
                }
                sb4.append(uVar.e(d.q.a(i16)));
                i15++;
            }
        }
        String string3 = sb4.toString();
        C3862t.f(string3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder();
        int iD2 = uVar.getObjects();
        int i17 = 0;
        int i18 = 0;
        while (i18 < iD2) {
            if (((1 << i18) & gVar4.pushedObjectMask) != 0) {
                if (i15 > 0) {
                    sb5.append(", ");
                }
                gVar = gVar4;
                sb5.append(uVar.f(d.t.a(i18)));
                i17++;
            } else {
                gVar = gVar4;
            }
            i18++;
            gVar4 = gVar;
        }
        String string4 = sb5.toString();
        C3862t.f(string4, "StringBuilder().apply(builderAction).toString()");
        C1489A0.b("Error while pushing " + uVar + ". Not all arguments were provided. Missing " + i15 + " int arguments (" + string3 + ") and " + i17 + " object arguments (" + string4 + ").");
    }

    public final void c() {
        if (!this.pendingOperations.u()) {
            C1560o.s("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.w(this.operations);
    }

    public final void d(InterfaceC1542f<?> applier, SlotWriter slots, Q0 rememberManager) {
        if (!this.pendingOperations.t()) {
            C1560o.s("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.operations.r(applier, slots, rememberManager);
    }

    public final boolean e() {
        return this.operations.t();
    }

    public final <V, T> void f(V value, p<? super T, ? super V, C4153F> block) {
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
}
