package Hb;

import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import xb.C5087e;

/* compiled from: AbstractClassTypeConstructor.java */
/* renamed from: Hb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1073b extends AbstractC1103q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1073b(Gb.n nVar) {
        super(nVar);
        if (nVar == null) {
            I(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void I(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Hb.AbstractC1073b.I(int):void");
    }

    /* renamed from: J */
    public abstract InterfaceC1692e t();

    @Override // Hb.AbstractC1110w
    protected boolean e(InterfaceC1695h interfaceC1695h) {
        if (interfaceC1695h == null) {
            I(2);
        }
        return (interfaceC1695h instanceof InterfaceC1692e) && c(t(), interfaceC1695h);
    }

    @Override // Hb.AbstractC1103q
    protected U o() {
        if (Oa.j.u0(t())) {
            return null;
        }
        return q().i();
    }

    @Override // Hb.AbstractC1103q
    protected Collection<U> p(boolean z10) {
        InterfaceC1700m interfaceC1700mC = t().c();
        if (!(interfaceC1700mC instanceof InterfaceC1692e)) {
            List listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                I(3);
            }
            return listEmptyList;
        }
        Rb.k kVar = new Rb.k();
        InterfaceC1692e interfaceC1692e = (InterfaceC1692e) interfaceC1700mC;
        kVar.add(interfaceC1692e.u());
        InterfaceC1692e interfaceC1692eS = interfaceC1692e.S();
        if (z10 && interfaceC1692eS != null) {
            kVar.add(interfaceC1692eS.u());
        }
        return kVar;
    }

    @Override // Hb.y0
    public Oa.j q() {
        Oa.j jVarM = C5087e.m(t());
        if (jVarM == null) {
            I(1);
        }
        return jVarM;
    }
}
