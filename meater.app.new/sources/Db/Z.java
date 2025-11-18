package Db;

import Ra.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import lb.C3923c;
import lb.C3937q;
import nb.InterfaceC4077c;
import oa.C4170o;

/* compiled from: ValueClassUtil.kt */
/* loaded from: classes3.dex */
public final class Z {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends Lb.j> r0<T> a(C3923c c3923c, InterfaceC4077c nameResolver, nb.g typeTable, Ba.l<? super C3937q, ? extends T> typeDeserializer, Ba.l<? super qb.f, ? extends T> typeOfPublicProperty) {
        T tInvoke;
        List<C3937q> listT0;
        C3862t.g(c3923c, "<this>");
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(typeTable, "typeTable");
        C3862t.g(typeDeserializer, "typeDeserializer");
        C3862t.g(typeOfPublicProperty, "typeOfPublicProperty");
        if (c3923c.N0() <= 0) {
            if (!c3923c.p1()) {
                return null;
            }
            qb.f fVarB = L.b(nameResolver, c3923c.K0());
            C3937q c3937qI = nb.f.i(c3923c, typeTable);
            if ((c3937qI != null && (tInvoke = typeDeserializer.invoke(c3937qI)) != null) || (tInvoke = typeOfPublicProperty.invoke(fVarB)) != null) {
                return new Ra.A(fVarB, tInvoke);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + L.b(nameResolver, c3923c.G0()) + " with property " + fVarB).toString());
        }
        List<Integer> listO0 = c3923c.O0();
        C3862t.f(listO0, "getMultiFieldValueClassUnderlyingNameList(...)");
        List<Integer> list = listO0;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        for (Integer num : list) {
            C3862t.d(num);
            arrayList.add(L.b(nameResolver, num.intValue()));
        }
        C4170o c4170oA = oa.v.a(Integer.valueOf(c3923c.R0()), Integer.valueOf(c3923c.Q0()));
        if (C3862t.b(c4170oA, oa.v.a(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> listS0 = c3923c.S0();
            C3862t.f(listS0, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            List<Integer> list2 = listS0;
            listT0 = new ArrayList<>(kotlin.collections.r.x(list2, 10));
            for (Integer num2 : list2) {
                C3862t.d(num2);
                listT0.add(typeTable.a(num2.intValue()));
            }
        } else {
            if (!C3862t.b(c4170oA, oa.v.a(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + L.b(nameResolver, c3923c.G0()) + " has illegal multi-field value class representation").toString());
            }
            listT0 = c3923c.T0();
        }
        C3862t.d(listT0);
        List<C3937q> list3 = listT0;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(typeDeserializer.invoke(it.next()));
        }
        return new Ra.I(kotlin.collections.r.e1(arrayList, arrayList2));
    }
}
