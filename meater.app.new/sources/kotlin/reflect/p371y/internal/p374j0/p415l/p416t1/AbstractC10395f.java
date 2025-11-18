package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9793i;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a.C10202c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10220p;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10352h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10458y;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10341d0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10378p1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.EnumC10435b;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;

/* compiled from: KotlinTypePreparator.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.f */
/* loaded from: classes3.dex */
public abstract class AbstractC10395f extends AbstractC10352h {

    /* compiled from: KotlinTypePreparator.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t1.f$a */
    public static final class a extends AbstractC10395f {

        /* renamed from: a */
        public static final a f40182a = new a();

        private a() {
        }
    }

    /* compiled from: KotlinTypePreparator.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t1.f$b */
    /* synthetic */ class b extends C9793i implements Function1<InterfaceC10442i, AbstractC10381q1> {
        b(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "prepareType";
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final KDeclarationContainer getOwner() {
            return C9790g0.m32298b(AbstractC10395f.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final String getSignature() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final AbstractC10381q1 invoke(InterfaceC10442i interfaceC10442i) {
            C9801m.m32346f(interfaceC10442i, "p0");
            return ((AbstractC10395f) this.receiver).mo36711a(interfaceC10442i);
        }
    }

    /* renamed from: c */
    private final AbstractC10368m0 m36921c(AbstractC10368m0 abstractC10368m0) {
        AbstractC10344e0 type;
        InterfaceC10345e1 interfaceC10345e1Mo35993O0 = abstractC10368m0.mo35993O0();
        boolean z = false;
        C10341d0 c10341d0M36606m = null;
        abstractC10381q1Mo36635R0 = null;
        AbstractC10381q1 abstractC10381q1Mo36635R0 = null;
        if (interfaceC10345e1Mo35993O0 instanceof C10202c) {
            C10202c c10202c = (C10202c) interfaceC10345e1Mo35993O0;
            InterfaceC10351g1 interfaceC10351g1Mo35997f = c10202c.mo35997f();
            if (!(interfaceC10351g1Mo35997f.mo36708a() == EnumC10384r1.IN_VARIANCE)) {
                interfaceC10351g1Mo35997f = null;
            }
            if (interfaceC10351g1Mo35997f != null && (type = interfaceC10351g1Mo35997f.getType()) != null) {
                abstractC10381q1Mo36635R0 = type.mo36635R0();
            }
            AbstractC10381q1 abstractC10381q1 = abstractC10381q1Mo36635R0;
            if (c10202c.m36001h() == null) {
                InterfaceC10351g1 interfaceC10351g1Mo35997f2 = c10202c.mo35997f();
                Collection<AbstractC10344e0> collectionMo35998a = c10202c.mo35998a();
                ArrayList arrayList = new ArrayList(C10819v.m38911u(collectionMo35998a, 10));
                Iterator<T> it = collectionMo35998a.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC10344e0) it.next()).mo36635R0());
                }
                c10202c.m36003j(new C10399j(interfaceC10351g1Mo35997f2, arrayList, null, 4, null));
            }
            EnumC10435b enumC10435b = EnumC10435b.FOR_SUBTYPING;
            C10399j c10399jM36001h = c10202c.m36001h();
            C9801m.m32343c(c10399jM36001h);
            return new C10398i(enumC10435b, c10399jM36001h, abstractC10381q1, abstractC10368m0.mo35992N0(), abstractC10368m0.mo33691P0(), false, 32, null);
        }
        if (interfaceC10345e1Mo35993O0 instanceof C10220p) {
            Collection<AbstractC10344e0> collectionMo35998a2 = ((C10220p) interfaceC10345e1Mo35993O0).mo35998a();
            ArrayList arrayList2 = new ArrayList(C10819v.m38911u(collectionMo35998a2, 10));
            Iterator<T> it2 = collectionMo35998a2.iterator();
            while (it2.hasNext()) {
                AbstractC10344e0 abstractC10344e0M36783p = C10372n1.m36783p((AbstractC10344e0) it2.next(), abstractC10368m0.mo33691P0());
                C9801m.m32345e(abstractC10344e0M36783p, "makeNullableAsSpecified(it, type.isMarkedNullable)");
                arrayList2.add(abstractC10344e0M36783p);
            }
            return C10347f0.m36670j(abstractC10368m0.mo35992N0(), new C10341d0(arrayList2), C10817u.m38888j(), false, abstractC10368m0.mo33553q());
        }
        if (!(interfaceC10345e1Mo35993O0 instanceof C10341d0) || !abstractC10368m0.mo33691P0()) {
            return abstractC10368m0;
        }
        C10341d0 c10341d0 = (C10341d0) interfaceC10345e1Mo35993O0;
        Collection<AbstractC10344e0> collectionMo35998a3 = c10341d0.mo35998a();
        ArrayList arrayList3 = new ArrayList(C10819v.m38911u(collectionMo35998a3, 10));
        Iterator<T> it3 = collectionMo35998a3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(C10457a.m37154t((AbstractC10344e0) it3.next()));
            z = true;
        }
        if (z) {
            AbstractC10344e0 abstractC10344e0M36603i = c10341d0.m36603i();
            c10341d0M36606m = new C10341d0(arrayList3).m36606m(abstractC10344e0M36603i != null ? C10457a.m37154t(abstractC10344e0M36603i) : null);
        }
        if (c10341d0M36606m != null) {
            c10341d0 = c10341d0M36606m;
        }
        return c10341d0.m36602h();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10352h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC10381q1 mo36711a(InterfaceC10442i interfaceC10442i) {
        AbstractC10381q1 abstractC10381q1M36664d;
        C9801m.m32346f(interfaceC10442i, "type");
        if (!(interfaceC10442i instanceof AbstractC10344e0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        AbstractC10381q1 abstractC10381q1Mo36635R0 = ((AbstractC10344e0) interfaceC10442i).mo36635R0();
        if (abstractC10381q1Mo36635R0 instanceof AbstractC10368m0) {
            abstractC10381q1M36664d = m36921c((AbstractC10368m0) abstractC10381q1Mo36635R0);
        } else {
            if (!(abstractC10381q1Mo36635R0 instanceof AbstractC10458y)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC10458y abstractC10458y = (AbstractC10458y) abstractC10381q1Mo36635R0;
            AbstractC10368m0 abstractC10368m0M36921c = m36921c(abstractC10458y.m37161W0());
            AbstractC10368m0 abstractC10368m0M36921c2 = m36921c(abstractC10458y.m37162X0());
            abstractC10381q1M36664d = (abstractC10368m0M36921c == abstractC10458y.m37161W0() && abstractC10368m0M36921c2 == abstractC10458y.m37162X0()) ? abstractC10381q1Mo36635R0 : C10347f0.m36664d(abstractC10368m0M36921c, abstractC10368m0M36921c2);
        }
        return C10378p1.m36805c(abstractC10381q1M36664d, abstractC10381q1Mo36635R0, new b(this));
    }
}
