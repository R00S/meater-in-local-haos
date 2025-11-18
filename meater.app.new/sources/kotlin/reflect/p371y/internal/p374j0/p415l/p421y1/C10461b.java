package kotlin.reflect.p371y.internal.p374j0.p415l.p421y1;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C10782c0;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a.C10203d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a.InterfaceC10201b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348f1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10335b0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10357i1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10363k1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10366l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10378p1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;

/* compiled from: CapturedTypeApproximation.kt */
/* renamed from: kotlin.f0.y.e.j0.l.y1.b */
/* loaded from: classes3.dex */
public final class C10461b {

    /* compiled from: CapturedTypeApproximation.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.y1.b$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40390a;

        static {
            int[] iArr = new int[EnumC10384r1.values().length];
            iArr[EnumC10384r1.INVARIANT.ordinal()] = 1;
            iArr[EnumC10384r1.IN_VARIANCE.ordinal()] = 2;
            iArr[EnumC10384r1.OUT_VARIANCE.ordinal()] = 3;
            f40390a = iArr;
        }
    }

    /* compiled from: CapturedTypeApproximation.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.y1.b$b */
    static final class b extends Lambda implements Function1<AbstractC10381q1, Boolean> {

        /* renamed from: f */
        public static final b f40391f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC10381q1 abstractC10381q1) {
            C9801m.m32345e(abstractC10381q1, "it");
            return Boolean.valueOf(C10203d.m36008d(abstractC10381q1));
        }
    }

    /* compiled from: CapturedTypeApproximation.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.y1.b$c */
    public static final class c extends AbstractC10348f1 {
        c() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348f1
        /* renamed from: k */
        public InterfaceC10351g1 mo36679k(InterfaceC10345e1 interfaceC10345e1) {
            C9801m.m32346f(interfaceC10345e1, RoomNotification.KEY);
            InterfaceC10201b interfaceC10201b = interfaceC10345e1 instanceof InterfaceC10201b ? (InterfaceC10201b) interfaceC10345e1 : null;
            if (interfaceC10201b == null) {
                return null;
            }
            return interfaceC10201b.mo35997f().mo36710c() ? new C10357i1(EnumC10384r1.OUT_VARIANCE, interfaceC10201b.mo35997f().getType()) : interfaceC10201b.mo35997f();
        }
    }

    /* renamed from: a */
    public static final C10460a<AbstractC10344e0> m37167a(AbstractC10344e0 abstractC10344e0) {
        Object objM37171e;
        C9801m.m32346f(abstractC10344e0, "type");
        if (C10335b0.m36583b(abstractC10344e0)) {
            C10460a<AbstractC10344e0> c10460aM37167a = m37167a(C10335b0.m36584c(abstractC10344e0));
            C10460a<AbstractC10344e0> c10460aM37167a2 = m37167a(C10335b0.m36585d(abstractC10344e0));
            return new C10460a<>(C10378p1.m36804b(C10347f0.m36664d(C10335b0.m36584c(c10460aM37167a.m37165c()), C10335b0.m36585d(c10460aM37167a2.m37165c())), abstractC10344e0), C10378p1.m36804b(C10347f0.m36664d(C10335b0.m36584c(c10460aM37167a.m37166d()), C10335b0.m36585d(c10460aM37167a2.m37166d())), abstractC10344e0));
        }
        InterfaceC10345e1 interfaceC10345e1Mo35993O0 = abstractC10344e0.mo35993O0();
        if (C10203d.m36008d(abstractC10344e0)) {
            C9801m.m32344d(interfaceC10345e1Mo35993O0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            InterfaceC10351g1 interfaceC10351g1Mo35997f = ((InterfaceC10201b) interfaceC10345e1Mo35993O0).mo35997f();
            AbstractC10344e0 type = interfaceC10351g1Mo35997f.getType();
            C9801m.m32345e(type, "typeProjection.type");
            AbstractC10344e0 abstractC10344e0M37168b = m37168b(type, abstractC10344e0);
            int i2 = a.f40390a[interfaceC10351g1Mo35997f.mo36708a().ordinal()];
            if (i2 == 2) {
                AbstractC10368m0 abstractC10368m0M32774I = C10457a.m37142h(abstractC10344e0).m32774I();
                C9801m.m32345e(abstractC10368m0M32774I, "type.builtIns.nullableAnyType");
                return new C10460a<>(abstractC10344e0M37168b, abstractC10368m0M32774I);
            }
            if (i2 == 3) {
                AbstractC10368m0 abstractC10368m0M32773H = C10457a.m37142h(abstractC10344e0).m32773H();
                C9801m.m32345e(abstractC10368m0M32773H, "type.builtIns.nothingType");
                return new C10460a<>(m37168b(abstractC10368m0M32773H, abstractC10344e0), abstractC10344e0M37168b);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + interfaceC10351g1Mo35997f);
        }
        if (abstractC10344e0.mo35991M0().isEmpty() || abstractC10344e0.mo35991M0().size() != interfaceC10345e1Mo35993O0.getParameters().size()) {
            return new C10460a<>(abstractC10344e0, abstractC10344e0);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<InterfaceC10351g1> listMo35991M0 = abstractC10344e0.mo35991M0();
        List<InterfaceC10587e1> parameters = interfaceC10345e1Mo35993O0.getParameters();
        C9801m.m32345e(parameters, "typeConstructor.parameters");
        for (Pair pair : C10782c0.m38580L0(listMo35991M0, parameters)) {
            InterfaceC10351g1 interfaceC10351g1 = (InterfaceC10351g1) pair.m37646a();
            InterfaceC10587e1 interfaceC10587e1 = (InterfaceC10587e1) pair.m37647b();
            C9801m.m32345e(interfaceC10587e1, "typeParameter");
            C10462c c10462cM37173g = m37173g(interfaceC10351g1, interfaceC10587e1);
            if (interfaceC10351g1.mo36710c()) {
                arrayList.add(c10462cM37173g);
                arrayList2.add(c10462cM37173g);
            } else {
                C10460a<C10462c> c10460aM37170d = m37170d(c10462cM37173g);
                C10462c c10462cM37163a = c10460aM37170d.m37163a();
                C10462c c10462cM37164b = c10460aM37170d.m37164b();
                arrayList.add(c10462cM37163a);
                arrayList2.add(c10462cM37164b);
            }
        }
        boolean z = true;
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((C10462c) it.next()).m37180d()) {
                    break;
                }
            }
            z = false;
        }
        if (z) {
            objM37171e = C10457a.m37142h(abstractC10344e0).m32773H();
            C9801m.m32345e(objM37171e, "type.builtIns.nothingType");
        } else {
            objM37171e = m37171e(abstractC10344e0, arrayList);
        }
        return new C10460a<>(objM37171e, m37171e(abstractC10344e0, arrayList2));
    }

    /* renamed from: b */
    private static final AbstractC10344e0 m37168b(AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02) {
        AbstractC10344e0 abstractC10344e0M36784q = C10372n1.m36784q(abstractC10344e0, abstractC10344e02.mo33691P0());
        C9801m.m32345e(abstractC10344e0M36784q, "makeNullableIfNeeded(this, type.isMarkedNullable)");
        return abstractC10344e0M36784q;
    }

    /* renamed from: c */
    public static final InterfaceC10351g1 m37169c(InterfaceC10351g1 interfaceC10351g1, boolean z) {
        if (interfaceC10351g1 == null) {
            return null;
        }
        if (interfaceC10351g1.mo36710c()) {
            return interfaceC10351g1;
        }
        AbstractC10344e0 type = interfaceC10351g1.getType();
        C9801m.m32345e(type, "typeProjection.type");
        if (!C10372n1.m36770c(type, b.f40391f)) {
            return interfaceC10351g1;
        }
        EnumC10384r1 enumC10384r1Mo36708a = interfaceC10351g1.mo36708a();
        C9801m.m32345e(enumC10384r1Mo36708a, "typeProjection.projectionKind");
        return enumC10384r1Mo36708a == EnumC10384r1.OUT_VARIANCE ? new C10357i1(enumC10384r1Mo36708a, m37167a(type).m37166d()) : z ? new C10357i1(enumC10384r1Mo36708a, m37167a(type).m37165c()) : m37172f(interfaceC10351g1);
    }

    /* renamed from: d */
    private static final C10460a<C10462c> m37170d(C10462c c10462c) {
        C10460a<AbstractC10344e0> c10460aM37167a = m37167a(c10462c.m37177a());
        AbstractC10344e0 abstractC10344e0M37163a = c10460aM37167a.m37163a();
        AbstractC10344e0 abstractC10344e0M37164b = c10460aM37167a.m37164b();
        C10460a<AbstractC10344e0> c10460aM37167a2 = m37167a(c10462c.m37178b());
        return new C10460a<>(new C10462c(c10462c.m37179c(), abstractC10344e0M37164b, c10460aM37167a2.m37163a()), new C10462c(c10462c.m37179c(), abstractC10344e0M37163a, c10460aM37167a2.m37164b()));
    }

    /* renamed from: e */
    private static final AbstractC10344e0 m37171e(AbstractC10344e0 abstractC10344e0, List<C10462c> list) {
        abstractC10344e0.mo35991M0().size();
        list.size();
        ArrayList arrayList = new ArrayList(C10819v.m38911u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m37174h((C10462c) it.next()));
        }
        return C10363k1.m36738e(abstractC10344e0, arrayList, null, null, 6, null);
    }

    /* renamed from: f */
    private static final InterfaceC10351g1 m37172f(InterfaceC10351g1 interfaceC10351g1) {
        C10366l1 c10366l1M36747g = C10366l1.m36747g(new c());
        C9801m.m32345e(c10366l1M36747g, "create(object : TypeCons…ojection\n        }\n    })");
        return c10366l1M36747g.m36761t(interfaceC10351g1);
    }

    /* renamed from: g */
    private static final C10462c m37173g(InterfaceC10351g1 interfaceC10351g1, InterfaceC10587e1 interfaceC10587e1) {
        int i2 = a.f40390a[C10366l1.m36743c(interfaceC10587e1.mo37672n(), interfaceC10351g1).ordinal()];
        if (i2 == 1) {
            AbstractC10344e0 type = interfaceC10351g1.getType();
            C9801m.m32345e(type, "type");
            AbstractC10344e0 type2 = interfaceC10351g1.getType();
            C9801m.m32345e(type2, "type");
            return new C10462c(interfaceC10587e1, type, type2);
        }
        if (i2 == 2) {
            AbstractC10344e0 type3 = interfaceC10351g1.getType();
            C9801m.m32345e(type3, "type");
            AbstractC10368m0 abstractC10368m0M32774I = C10235a.m36072f(interfaceC10587e1).m32774I();
            C9801m.m32345e(abstractC10368m0M32774I, "typeParameter.builtIns.nullableAnyType");
            return new C10462c(interfaceC10587e1, type3, abstractC10368m0M32774I);
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC10368m0 abstractC10368m0M32773H = C10235a.m36072f(interfaceC10587e1).m32773H();
        C9801m.m32345e(abstractC10368m0M32773H, "typeParameter.builtIns.nothingType");
        AbstractC10344e0 type4 = interfaceC10351g1.getType();
        C9801m.m32345e(type4, "type");
        return new C10462c(interfaceC10587e1, abstractC10368m0M32773H, type4);
    }

    /* renamed from: h */
    private static final InterfaceC10351g1 m37174h(C10462c c10462c) {
        c10462c.m37180d();
        if (!C9801m.m32341a(c10462c.m37177a(), c10462c.m37178b())) {
            EnumC10384r1 enumC10384r1Mo37672n = c10462c.m37179c().mo37672n();
            EnumC10384r1 enumC10384r1 = EnumC10384r1.IN_VARIANCE;
            if (enumC10384r1Mo37672n != enumC10384r1) {
                return (!AbstractC9914h.m32750m0(c10462c.m37177a()) || c10462c.m37179c().mo37672n() == enumC10384r1) ? AbstractC9914h.m32752o0(c10462c.m37178b()) ? new C10357i1(m37175i(c10462c, enumC10384r1), c10462c.m37177a()) : new C10357i1(m37175i(c10462c, EnumC10384r1.OUT_VARIANCE), c10462c.m37178b()) : new C10357i1(m37175i(c10462c, EnumC10384r1.OUT_VARIANCE), c10462c.m37178b());
            }
        }
        return new C10357i1(c10462c.m37177a());
    }

    /* renamed from: i */
    private static final EnumC10384r1 m37175i(C10462c c10462c, EnumC10384r1 enumC10384r1) {
        return enumC10384r1 == c10462c.m37179c().mo37672n() ? EnumC10384r1.INVARIANT : enumC10384r1;
    }
}
