package hb;

import kotlin.jvm.internal.C3862t;

/* compiled from: javaLoading.kt */
/* renamed from: hb.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3523p {
    private static final boolean a(InterfaceC3525r interfaceC3525r) {
        qb.c cVarF;
        InterfaceC3505B interfaceC3505B = (InterfaceC3505B) kotlin.collections.r.L0(interfaceC3525r.k());
        InterfaceC3531x interfaceC3531xA = interfaceC3505B != null ? interfaceC3505B.a() : null;
        InterfaceC3517j interfaceC3517j = interfaceC3531xA instanceof InterfaceC3517j ? (InterfaceC3517j) interfaceC3531xA : null;
        if (interfaceC3517j == null) {
            return false;
        }
        InterfaceC3516i interfaceC3516iD = interfaceC3517j.d();
        return (interfaceC3516iD instanceof InterfaceC3514g) && (cVarF = ((InterfaceC3514g) interfaceC3516iD).f()) != null && C3862t.b(cVarF.b(), "java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r0.equals("hashCode") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r0.equals("toString") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return r3.k().isEmpty();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean b(hb.InterfaceC3525r r3) {
        /*
            qb.f r0 = r3.getName()
            java.lang.String r0 = r0.j()
            int r1 = r0.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r1 == r2) goto L33
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r1 == r2) goto L25
            r2 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r1 == r2) goto L1c
            goto L44
        L1c:
            java.lang.String r1 = "hashCode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            goto L44
        L25:
            java.lang.String r1 = "equals"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            goto L44
        L2e:
            boolean r3 = a(r3)
            goto L45
        L33:
            java.lang.String r1 = "toString"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
        L3b:
            java.util.List r3 = r3.k()
            boolean r3 = r3.isEmpty()
            goto L45
        L44:
            r3 = 0
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.C3523p.b(hb.r):boolean");
    }

    public static final boolean c(InterfaceC3524q interfaceC3524q) {
        C3862t.g(interfaceC3524q, "<this>");
        return interfaceC3524q.P().H() && (interfaceC3524q instanceof InterfaceC3525r) && b((InterfaceC3525r) interfaceC3524q);
    }
}
