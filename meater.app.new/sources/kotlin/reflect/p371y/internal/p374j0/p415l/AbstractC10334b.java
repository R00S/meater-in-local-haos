package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.utils.C10771e;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: AbstractClassTypeConstructor.java */
/* renamed from: kotlin.f0.y.e.j0.l.b */
/* loaded from: classes3.dex */
public abstract class AbstractC10334b extends AbstractC10349g implements InterfaceC10345e1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10334b(InterfaceC10330n interfaceC10330n) {
        super(interfaceC10330n);
        if (interfaceC10330n == null) {
            m36578v(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m36578v(int r9) {
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
            r5 = 3
            goto L18
        L17:
            r5 = 2
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10334b.m36578v(int):void");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10367m
    /* renamed from: i */
    protected boolean mo36579i(InterfaceC10594h interfaceC10594h) {
        if (interfaceC10594h == null) {
            m36578v(2);
        }
        return (interfaceC10594h instanceof InterfaceC10585e) && m36765g(mo32891w(), interfaceC10594h);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349g
    /* renamed from: m */
    protected AbstractC10344e0 mo36580m() {
        if (AbstractC9914h.m32759t0(mo32891w())) {
            return null;
        }
        return mo36004o().m32791i();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349g
    /* renamed from: n */
    protected Collection<AbstractC10344e0> mo36581n(boolean z) {
        InterfaceC10609m interfaceC10609mMo32876b = mo32891w().mo32876b();
        if (!(interfaceC10609mMo32876b instanceof InterfaceC10585e)) {
            List listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                m36578v(3);
            }
            return listEmptyList;
        }
        C10771e c10771e = new C10771e();
        InterfaceC10585e interfaceC10585e = (InterfaceC10585e) interfaceC10609mMo32876b;
        c10771e.add(interfaceC10585e.mo36400s());
        InterfaceC10585e interfaceC10585eMo32869U = interfaceC10585e.mo32869U();
        if (z && interfaceC10585eMo32869U != null) {
            c10771e.add(interfaceC10585eMo32869U.mo36400s());
        }
        return c10771e;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: o */
    public AbstractC9914h mo36004o() {
        AbstractC9914h abstractC9914hM36072f = C10235a.m36072f(mo32891w());
        if (abstractC9914hM36072f == null) {
            m36578v(1);
        }
        return abstractC9914hM36072f;
    }

    /* renamed from: w */
    public abstract InterfaceC10585e mo32891w();
}
