package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10172c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a.C10203d;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348f1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p421y1.C10461b;

/* compiled from: utils.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.y */
/* loaded from: classes3.dex */
public final class C10414y {
    /* renamed from: a */
    private static final AbstractC10344e0 m36979a(AbstractC10344e0 abstractC10344e0) {
        return C10461b.m37167a(abstractC10344e0).m37166d();
    }

    /* renamed from: b */
    private static final String m36980b(InterfaceC10345e1 interfaceC10345e1) {
        StringBuilder sb = new StringBuilder();
        m36981c("type: " + interfaceC10345e1, sb);
        m36981c("hashCode: " + interfaceC10345e1.hashCode(), sb);
        m36981c("javaClass: " + interfaceC10345e1.getClass().getCanonicalName(), sb);
        for (InterfaceC10609m interfaceC10609mMo32887c = interfaceC10345e1.mo32887c(); interfaceC10609mMo32887c != null; interfaceC10609mMo32887c = interfaceC10609mMo32887c.mo32876b()) {
            m36981c("fqName: " + AbstractC10172c.f39377g.mo35500q(interfaceC10609mMo32887c), sb);
            m36981c("javaClass: " + interfaceC10609mMo32887c.getClass().getCanonicalName(), sb);
        }
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: c */
    private static final StringBuilder m36981c(String str, StringBuilder sb) {
        C9801m.m32346f(str, "<this>");
        sb.append(str);
        C9801m.m32345e(sb, "append(value)");
        sb.append('\n');
        C9801m.m32345e(sb, "append('\\n')");
        return sb;
    }

    /* renamed from: d */
    public static final AbstractC10344e0 m36982d(AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02, InterfaceC10411v interfaceC10411v) {
        boolean z;
        C9801m.m32346f(abstractC10344e0, "subtype");
        C9801m.m32346f(abstractC10344e02, "supertype");
        C9801m.m32346f(interfaceC10411v, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new C10408s(abstractC10344e0, null));
        InterfaceC10345e1 interfaceC10345e1Mo35993O0 = abstractC10344e02.mo35993O0();
        while (!arrayDeque.isEmpty()) {
            C10408s c10408s = (C10408s) arrayDeque.poll();
            AbstractC10344e0 abstractC10344e0M36960b = c10408s.m36960b();
            InterfaceC10345e1 interfaceC10345e1Mo35993O02 = abstractC10344e0M36960b.mo35993O0();
            if (interfaceC10411v.mo36962a(interfaceC10345e1Mo35993O02, interfaceC10345e1Mo35993O0)) {
                boolean zMo33691P0 = abstractC10344e0M36960b.mo33691P0();
                for (C10408s c10408sM36959a = c10408s.m36959a(); c10408sM36959a != null; c10408sM36959a = c10408sM36959a.m36959a()) {
                    AbstractC10344e0 abstractC10344e0M36960b2 = c10408sM36959a.m36960b();
                    List<InterfaceC10351g1> listMo35991M0 = abstractC10344e0M36960b2.mo35991M0();
                    if ((listMo35991M0 instanceof Collection) && listMo35991M0.isEmpty()) {
                        z = false;
                    } else {
                        Iterator<T> it = listMo35991M0.iterator();
                        while (it.hasNext()) {
                            if (((InterfaceC10351g1) it.next()).mo36708a() != EnumC10384r1.INVARIANT) {
                                z = true;
                                break;
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        AbstractC10344e0 abstractC10344e0M36758n = C10203d.m36010f(AbstractC10348f1.f40104c.m36681a(abstractC10344e0M36960b2), false, 1, null).m36726c().m36758n(abstractC10344e0M36960b, EnumC10384r1.INVARIANT);
                        C9801m.m32345e(abstractC10344e0M36758n, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
                        abstractC10344e0M36960b = m36979a(abstractC10344e0M36758n);
                    } else {
                        abstractC10344e0M36960b = AbstractC10348f1.f40104c.m36681a(abstractC10344e0M36960b2).m36726c().m36758n(abstractC10344e0M36960b, EnumC10384r1.INVARIANT);
                        C9801m.m32345e(abstractC10344e0M36960b, "{\n                    Ty…ARIANT)\n                }");
                    }
                    zMo33691P0 = zMo33691P0 || abstractC10344e0M36960b2.mo33691P0();
                }
                InterfaceC10345e1 interfaceC10345e1Mo35993O03 = abstractC10344e0M36960b.mo35993O0();
                if (interfaceC10411v.mo36962a(interfaceC10345e1Mo35993O03, interfaceC10345e1Mo35993O0)) {
                    return C10372n1.m36783p(abstractC10344e0M36960b, zMo33691P0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + m36980b(interfaceC10345e1Mo35993O03) + ", \n\nsupertype: " + m36980b(interfaceC10345e1Mo35993O0) + " \n" + interfaceC10411v.mo36962a(interfaceC10345e1Mo35993O03, interfaceC10345e1Mo35993O0));
            }
            for (AbstractC10344e0 abstractC10344e03 : interfaceC10345e1Mo35993O02.mo35998a()) {
                C9801m.m32345e(abstractC10344e03, "immediateSupertype");
                arrayDeque.add(new C10408s(abstractC10344e03, c10408s));
            }
        }
        return null;
    }
}
