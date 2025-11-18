package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C10782c0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10342d1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10437d;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10444k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10447n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10449p;

/* compiled from: AbstractTypeChecker.kt */
/* renamed from: kotlin.f0.y.e.j0.l.c */
/* loaded from: classes3.dex */
public final class C10337c {

    /* renamed from: a */
    public static final C10337c f40043a = new C10337c();

    private C10337c() {
    }

    /* renamed from: c */
    private final boolean m36588c(C10342d1 c10342d1, InterfaceC10444k interfaceC10444k, InterfaceC10447n interfaceC10447n) {
        InterfaceC10449p interfaceC10449pM36618j = c10342d1.m36618j();
        if (interfaceC10449pM36618j.mo35944f0(interfaceC10444k)) {
            return true;
        }
        if (interfaceC10449pM36618j.mo35929W(interfaceC10444k)) {
            return false;
        }
        if (c10342d1.m36622n() && interfaceC10449pM36618j.mo35960n0(interfaceC10444k)) {
            return true;
        }
        return interfaceC10449pM36618j.mo35902A0(interfaceC10449pM36618j.mo35937c(interfaceC10444k), interfaceC10447n);
    }

    /* renamed from: e */
    private final boolean m36589e(C10342d1 c10342d1, InterfaceC10444k interfaceC10444k, InterfaceC10444k interfaceC10444k2) {
        InterfaceC10449p interfaceC10449pM36618j = c10342d1.m36618j();
        if (C10346f.f40079b) {
            if (!interfaceC10449pM36618j.mo35935b(interfaceC10444k) && !interfaceC10449pM36618j.mo35932Z(interfaceC10449pM36618j.mo35937c(interfaceC10444k))) {
                c10342d1.m36620l(interfaceC10444k);
            }
            if (!interfaceC10449pM36618j.mo35935b(interfaceC10444k2)) {
                c10342d1.m36620l(interfaceC10444k2);
            }
        }
        if (interfaceC10449pM36618j.mo35929W(interfaceC10444k2) || interfaceC10449pM36618j.mo35905C(interfaceC10444k) || interfaceC10449pM36618j.mo35915I(interfaceC10444k)) {
            return true;
        }
        if ((interfaceC10444k instanceof InterfaceC10437d) && interfaceC10449pM36618j.mo35953k((InterfaceC10437d) interfaceC10444k)) {
            return true;
        }
        C10337c c10337c = f40043a;
        if (c10337c.m36590a(c10342d1, interfaceC10444k, C10342d1.c.b.f40070a)) {
            return true;
        }
        if (interfaceC10449pM36618j.mo35905C(interfaceC10444k2) || c10337c.m36590a(c10342d1, interfaceC10444k2, C10342d1.c.d.f40072a) || interfaceC10449pM36618j.mo35976v0(interfaceC10444k)) {
            return false;
        }
        return c10337c.m36591b(c10342d1, interfaceC10444k, interfaceC10449pM36618j.mo35937c(interfaceC10444k2));
    }

    /* renamed from: a */
    public final boolean m36590a(C10342d1 c10342d1, InterfaceC10444k interfaceC10444k, C10342d1.c cVar) {
        C9801m.m32346f(c10342d1, "<this>");
        C9801m.m32346f(interfaceC10444k, "type");
        C9801m.m32346f(cVar, "supertypesPolicy");
        InterfaceC10449p interfaceC10449pM36618j = c10342d1.m36618j();
        if (!((interfaceC10449pM36618j.mo35976v0(interfaceC10444k) && !interfaceC10449pM36618j.mo35929W(interfaceC10444k)) || interfaceC10449pM36618j.mo35905C(interfaceC10444k))) {
            c10342d1.m36619k();
            ArrayDeque<InterfaceC10444k> arrayDequeM36616h = c10342d1.m36616h();
            C9801m.m32343c(arrayDequeM36616h);
            Set<InterfaceC10444k> setM36617i = c10342d1.m36617i();
            C9801m.m32343c(setM36617i);
            arrayDequeM36616h.push(interfaceC10444k);
            while (!arrayDequeM36616h.isEmpty()) {
                if (setM36617i.size() > 1000) {
                    throw new IllegalStateException(("Too many supertypes for type: " + interfaceC10444k + ". Supertypes = " + C10782c0.m38599e0(setM36617i, null, null, null, 0, null, null, 63, null)).toString());
                }
                InterfaceC10444k interfaceC10444kPop = arrayDequeM36616h.pop();
                C9801m.m32345e(interfaceC10444kPop, "current");
                if (setM36617i.add(interfaceC10444kPop)) {
                    C10342d1.c cVar2 = interfaceC10449pM36618j.mo35929W(interfaceC10444kPop) ? C10342d1.c.C11570c.f40071a : cVar;
                    if (!(!C9801m.m32341a(cVar2, C10342d1.c.C11570c.f40071a))) {
                        cVar2 = null;
                    }
                    if (cVar2 == null) {
                        continue;
                    } else {
                        InterfaceC10449p interfaceC10449pM36618j2 = c10342d1.m36618j();
                        Iterator<InterfaceC10442i> it = interfaceC10449pM36618j2.mo35971t(interfaceC10449pM36618j2.mo35937c(interfaceC10444kPop)).iterator();
                        while (it.hasNext()) {
                            InterfaceC10444k interfaceC10444kMo36629a = cVar2.mo36629a(c10342d1, it.next());
                            if ((interfaceC10449pM36618j.mo35976v0(interfaceC10444kMo36629a) && !interfaceC10449pM36618j.mo35929W(interfaceC10444kMo36629a)) || interfaceC10449pM36618j.mo35905C(interfaceC10444kMo36629a)) {
                                c10342d1.m36614e();
                            } else {
                                arrayDequeM36616h.add(interfaceC10444kMo36629a);
                            }
                        }
                    }
                }
            }
            c10342d1.m36614e();
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m36591b(C10342d1 c10342d1, InterfaceC10444k interfaceC10444k, InterfaceC10447n interfaceC10447n) {
        C9801m.m32346f(c10342d1, "state");
        C9801m.m32346f(interfaceC10444k, "start");
        C9801m.m32346f(interfaceC10447n, "end");
        InterfaceC10449p interfaceC10449pM36618j = c10342d1.m36618j();
        if (f40043a.m36588c(c10342d1, interfaceC10444k, interfaceC10447n)) {
            return true;
        }
        c10342d1.m36619k();
        ArrayDeque<InterfaceC10444k> arrayDequeM36616h = c10342d1.m36616h();
        C9801m.m32343c(arrayDequeM36616h);
        Set<InterfaceC10444k> setM36617i = c10342d1.m36617i();
        C9801m.m32343c(setM36617i);
        arrayDequeM36616h.push(interfaceC10444k);
        while (!arrayDequeM36616h.isEmpty()) {
            if (setM36617i.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + interfaceC10444k + ". Supertypes = " + C10782c0.m38599e0(setM36617i, null, null, null, 0, null, null, 63, null)).toString());
            }
            InterfaceC10444k interfaceC10444kPop = arrayDequeM36616h.pop();
            C9801m.m32345e(interfaceC10444kPop, "current");
            if (setM36617i.add(interfaceC10444kPop)) {
                C10342d1.c cVar = interfaceC10449pM36618j.mo35929W(interfaceC10444kPop) ? C10342d1.c.C11570c.f40071a : C10342d1.c.b.f40070a;
                if (!(!C9801m.m32341a(cVar, C10342d1.c.C11570c.f40071a))) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    InterfaceC10449p interfaceC10449pM36618j2 = c10342d1.m36618j();
                    Iterator<InterfaceC10442i> it = interfaceC10449pM36618j2.mo35971t(interfaceC10449pM36618j2.mo35937c(interfaceC10444kPop)).iterator();
                    while (it.hasNext()) {
                        InterfaceC10444k interfaceC10444kMo36629a = cVar.mo36629a(c10342d1, it.next());
                        if (f40043a.m36588c(c10342d1, interfaceC10444kMo36629a, interfaceC10447n)) {
                            c10342d1.m36614e();
                            return true;
                        }
                        arrayDequeM36616h.add(interfaceC10444kMo36629a);
                    }
                }
            }
        }
        c10342d1.m36614e();
        return false;
    }

    /* renamed from: d */
    public final boolean m36592d(C10342d1 c10342d1, InterfaceC10444k interfaceC10444k, InterfaceC10444k interfaceC10444k2) {
        C9801m.m32346f(c10342d1, "state");
        C9801m.m32346f(interfaceC10444k, "subType");
        C9801m.m32346f(interfaceC10444k2, "superType");
        return m36589e(c10342d1, interfaceC10444k, interfaceC10444k2);
    }
}
