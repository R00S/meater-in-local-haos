package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C10782c0;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10660l0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10005k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: util.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.k0.h */
/* loaded from: classes2.dex */
public final class C9982h {
    /* renamed from: a */
    public static final List<InterfaceC10599i1> m33225a(Collection<? extends AbstractC10344e0> collection, Collection<? extends InterfaceC10599i1> collection2, InterfaceC10573a interfaceC10573a) {
        C9801m.m32346f(collection, "newValueParameterTypes");
        C9801m.m32346f(collection2, "oldValueParameters");
        C9801m.m32346f(interfaceC10573a, "newOwner");
        collection.size();
        collection2.size();
        List<Pair> listM38580L0 = C10782c0.m38580L0(collection, collection2);
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM38580L0, 10));
        for (Pair pair : listM38580L0) {
            AbstractC10344e0 abstractC10344e0 = (AbstractC10344e0) pair.m37646a();
            InterfaceC10599i1 interfaceC10599i1 = (InterfaceC10599i1) pair.m37647b();
            int iMo37696g = interfaceC10599i1.mo37696g();
            InterfaceC10620g annotations = interfaceC10599i1.getAnnotations();
            C10163f name = interfaceC10599i1.getName();
            C9801m.m32345e(name, "oldParameter.name");
            boolean zMo37698u0 = interfaceC10599i1.mo37698u0();
            boolean zMo37695b0 = interfaceC10599i1.mo37695b0();
            boolean zMo37694Y = interfaceC10599i1.mo37694Y();
            AbstractC10344e0 abstractC10344e0M32793k = interfaceC10599i1.mo37697l0() != null ? C10235a.m36078l(interfaceC10573a).mo37021o().m32793k(abstractC10344e0) : null;
            InterfaceC10741z0 interfaceC10741z0Mo32883t = interfaceC10599i1.mo32883t();
            C9801m.m32345e(interfaceC10741z0Mo32883t, "oldParameter.source");
            arrayList.add(new C10660l0(interfaceC10573a, null, iMo37696g, annotations, name, abstractC10344e0, zMo37698u0, zMo37695b0, zMo37694Y, abstractC10344e0M32793k, interfaceC10741z0Mo32883t));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final C10005k m33226b(InterfaceC10585e interfaceC10585e) {
        C9801m.m32346f(interfaceC10585e, "<this>");
        InterfaceC10585e interfaceC10585eM36082p = C10235a.m36082p(interfaceC10585e);
        if (interfaceC10585eM36082p == null) {
            return null;
        }
        InterfaceC10251h interfaceC10251hMo32866S = interfaceC10585eM36082p.mo32866S();
        C10005k c10005k = interfaceC10251hMo32866S instanceof C10005k ? (C10005k) interfaceC10251hMo32866S : null;
        return c10005k == null ? m33226b(interfaceC10585eM36082p) : c10005k;
    }
}
