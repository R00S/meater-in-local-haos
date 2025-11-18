package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C10782c0;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348f1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10366l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10395f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.EnumC10435b;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;

/* compiled from: NewCapturedType.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.k */
/* loaded from: classes3.dex */
public final class C10400k {
    /* renamed from: a */
    private static final List<InterfaceC10351g1> m36945a(AbstractC10381q1 abstractC10381q1, EnumC10435b enumC10435b) {
        if (abstractC10381q1.mo35991M0().size() != abstractC10381q1.mo35993O0().getParameters().size()) {
            return null;
        }
        List<InterfaceC10351g1> listMo35991M0 = abstractC10381q1.mo35991M0();
        boolean z = true;
        if (!(listMo35991M0 instanceof Collection) || !listMo35991M0.isEmpty()) {
            Iterator<T> it = listMo35991M0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!(((InterfaceC10351g1) it.next()).mo36708a() == EnumC10384r1.INVARIANT)) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            return null;
        }
        List<InterfaceC10587e1> parameters = abstractC10381q1.mo35993O0().getParameters();
        C9801m.m32345e(parameters, "type.constructor.parameters");
        List<Pair> listM38580L0 = C10782c0.m38580L0(listMo35991M0, parameters);
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM38580L0, 10));
        for (Pair pair : listM38580L0) {
            InterfaceC10351g1 interfaceC10351g1M37135a = (InterfaceC10351g1) pair.m37646a();
            InterfaceC10587e1 interfaceC10587e1 = (InterfaceC10587e1) pair.m37647b();
            if (interfaceC10351g1M37135a.mo36708a() != EnumC10384r1.INVARIANT) {
                AbstractC10381q1 abstractC10381q1Mo36635R0 = (interfaceC10351g1M37135a.mo36710c() || interfaceC10351g1M37135a.mo36708a() != EnumC10384r1.IN_VARIANCE) ? null : interfaceC10351g1M37135a.getType().mo36635R0();
                C9801m.m32345e(interfaceC10587e1, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                interfaceC10351g1M37135a = C10457a.m37135a(new C10398i(enumC10435b, abstractC10381q1Mo36635R0, interfaceC10351g1M37135a, interfaceC10587e1));
            }
            arrayList.add(interfaceC10351g1M37135a);
        }
        C10366l1 c10366l1M36726c = AbstractC10348f1.f40104c.m36682b(abstractC10381q1.mo35993O0(), arrayList).m36726c();
        int size = listMo35991M0.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC10351g1 interfaceC10351g1 = listMo35991M0.get(i2);
            InterfaceC10351g1 interfaceC10351g12 = (InterfaceC10351g1) arrayList.get(i2);
            if (interfaceC10351g1.mo36708a() != EnumC10384r1.INVARIANT) {
                List<AbstractC10344e0> upperBounds = abstractC10381q1.mo35993O0().getParameters().get(i2).getUpperBounds();
                C9801m.m32345e(upperBounds, "type.constructor.parameters[index].upperBounds");
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = upperBounds.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(AbstractC10395f.a.f40182a.mo36711a(c10366l1M36726c.m36758n((AbstractC10344e0) it2.next(), EnumC10384r1.INVARIANT).mo36635R0()));
                }
                if (!interfaceC10351g1.mo36710c() && interfaceC10351g1.mo36708a() == EnumC10384r1.OUT_VARIANCE) {
                    arrayList2.add(AbstractC10395f.a.f40182a.mo36711a(interfaceC10351g1.getType().mo36635R0()));
                }
                AbstractC10344e0 type = interfaceC10351g12.getType();
                C9801m.m32344d(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                ((C10398i) type).mo35993O0().m36943j(arrayList2);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final AbstractC10368m0 m36946b(AbstractC10368m0 abstractC10368m0, EnumC10435b enumC10435b) {
        C9801m.m32346f(abstractC10368m0, "type");
        C9801m.m32346f(enumC10435b, "status");
        List<InterfaceC10351g1> listM36945a = m36945a(abstractC10368m0, enumC10435b);
        if (listM36945a != null) {
            return m36947c(abstractC10368m0, listM36945a);
        }
        return null;
    }

    /* renamed from: c */
    private static final AbstractC10368m0 m36947c(AbstractC10381q1 abstractC10381q1, List<? extends InterfaceC10351g1> list) {
        return C10347f0.m36669i(abstractC10381q1.mo35992N0(), abstractC10381q1.mo35993O0(), list, abstractC10381q1.mo33691P0(), null, 16, null);
    }
}
