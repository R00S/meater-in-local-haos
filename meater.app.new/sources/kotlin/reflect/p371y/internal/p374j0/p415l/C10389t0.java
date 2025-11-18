package kotlin.reflect.p371y.internal.p374j0.p415l;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10813s;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;

/* compiled from: StarProjectionImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t0 */
/* loaded from: classes3.dex */
public final class C10389t0 {

    /* compiled from: StarProjectionImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t0$a */
    public static final class a extends AbstractC10348f1 {

        /* renamed from: d */
        final /* synthetic */ List<InterfaceC10345e1> f40178d;

        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends InterfaceC10345e1> list) {
            this.f40178d = list;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348f1
        /* renamed from: k */
        public InterfaceC10351g1 mo36679k(InterfaceC10345e1 interfaceC10345e1) {
            C9801m.m32346f(interfaceC10345e1, RoomNotification.KEY);
            if (!this.f40178d.contains(interfaceC10345e1)) {
                return null;
            }
            InterfaceC10594h interfaceC10594hMo32887c = interfaceC10345e1.mo32887c();
            C9801m.m32344d(interfaceC10594hMo32887c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return C10372n1.m36786s((InterfaceC10587e1) interfaceC10594hMo32887c);
        }
    }

    /* renamed from: a */
    private static final AbstractC10344e0 m36827a(List<? extends InterfaceC10345e1> list, List<? extends AbstractC10344e0> list2, AbstractC9914h abstractC9914h) {
        AbstractC10344e0 abstractC10344e0M36759p = C10366l1.m36747g(new a(list)).m36759p((AbstractC10344e0) C10813s.m38830U(list2), EnumC10384r1.OUT_VARIANCE);
        if (abstractC10344e0M36759p == null) {
            abstractC10344e0M36759p = abstractC9914h.m32805y();
        }
        C9801m.m32345e(abstractC10344e0M36759p, "typeParameters: List<Typ… ?: builtIns.defaultBound");
        return abstractC10344e0M36759p;
    }

    /* renamed from: b */
    public static final AbstractC10344e0 m36828b(InterfaceC10587e1 interfaceC10587e1) {
        C9801m.m32346f(interfaceC10587e1, "<this>");
        InterfaceC10609m interfaceC10609mMo32876b = interfaceC10587e1.mo32876b();
        C9801m.m32345e(interfaceC10609mMo32876b, "this.containingDeclaration");
        if (interfaceC10609mMo32876b instanceof InterfaceC10597i) {
            List<InterfaceC10587e1> parameters = ((InterfaceC10597i) interfaceC10609mMo32876b).mo32877h().getParameters();
            C9801m.m32345e(parameters, "descriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C10819v.m38911u(parameters, 10));
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                InterfaceC10345e1 interfaceC10345e1Mo32877h = ((InterfaceC10587e1) it.next()).mo32877h();
                C9801m.m32345e(interfaceC10345e1Mo32877h, "it.typeConstructor");
                arrayList.add(interfaceC10345e1Mo32877h);
            }
            List<AbstractC10344e0> upperBounds = interfaceC10587e1.getUpperBounds();
            C9801m.m32345e(upperBounds, "upperBounds");
            return m36827a(arrayList, upperBounds, C10235a.m36072f(interfaceC10587e1));
        }
        if (!(interfaceC10609mMo32876b instanceof InterfaceC10738y)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List<InterfaceC10587e1> typeParameters = ((InterfaceC10738y) interfaceC10609mMo32876b).getTypeParameters();
        C9801m.m32345e(typeParameters, "descriptor.typeParameters");
        ArrayList arrayList2 = new ArrayList(C10819v.m38911u(typeParameters, 10));
        Iterator<T> it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            InterfaceC10345e1 interfaceC10345e1Mo32877h2 = ((InterfaceC10587e1) it2.next()).mo32877h();
            C9801m.m32345e(interfaceC10345e1Mo32877h2, "it.typeConstructor");
            arrayList2.add(interfaceC10345e1Mo32877h2);
        }
        List<AbstractC10344e0> upperBounds2 = interfaceC10587e1.getUpperBounds();
        C9801m.m32345e(upperBounds2, "upperBounds");
        return m36827a(arrayList2, upperBounds2, C10235a.m36072f(interfaceC10587e1));
    }
}
