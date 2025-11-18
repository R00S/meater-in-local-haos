package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m;

import cm.aptoide.p092pt.database.room.RoomNotification;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.C10773s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C10815t;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.EnumC9973k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10335b0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10350g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10357i1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10426j;

/* compiled from: RawType.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.e */
/* loaded from: classes2.dex */
public final class C10012e extends AbstractC10360j1 {

    /* renamed from: c */
    public static final a f38172c = new a(null);

    /* renamed from: d */
    private static final C10008a f38173d;

    /* renamed from: e */
    private static final C10008a f38174e;

    /* renamed from: f */
    private final C10014g f38175f;

    /* compiled from: RawType.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: RawType.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.e$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38176a;

        static {
            int[] iArr = new int[EnumC10009b.values().length];
            iArr[EnumC10009b.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            iArr[EnumC10009b.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            iArr[EnumC10009b.INFLEXIBLE.ordinal()] = 3;
            f38176a = iArr;
        }
    }

    /* compiled from: RawType.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.e$c */
    static final class c extends Lambda implements Function1<AbstractC10396g, AbstractC10368m0> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10585e f38177f;

        /* renamed from: g */
        final /* synthetic */ C10012e f38178g;

        /* renamed from: h */
        final /* synthetic */ AbstractC10368m0 f38179h;

        /* renamed from: i */
        final /* synthetic */ C10008a f38180i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC10585e interfaceC10585e, C10012e c10012e, AbstractC10368m0 abstractC10368m0, C10008a c10008a) {
            super(1);
            this.f38177f = interfaceC10585e;
            this.f38178g = c10012e;
            this.f38179h = abstractC10368m0;
            this.f38180i = c10008a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10368m0 invoke(AbstractC10396g abstractC10396g) {
            C10159b c10159bM36073g;
            InterfaceC10585e interfaceC10585eMo36924b;
            C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
            InterfaceC10585e interfaceC10585e = this.f38177f;
            if (!(interfaceC10585e instanceof InterfaceC10585e)) {
                interfaceC10585e = null;
            }
            if (interfaceC10585e == null || (c10159bM36073g = C10235a.m36073g(interfaceC10585e)) == null || (interfaceC10585eMo36924b = abstractC10396g.mo36924b(c10159bM36073g)) == null || C9801m.m32341a(interfaceC10585eMo36924b, this.f38177f)) {
                return null;
            }
            return (AbstractC10368m0) this.f38178g.m33533l(this.f38179h, interfaceC10585eMo36924b, this.f38180i).m37648c();
        }
    }

    static {
        EnumC9973k enumC9973k = EnumC9973k.COMMON;
        f38173d = C10011d.m33530d(enumC9973k, false, null, 3, null).m33507i(EnumC10009b.FLEXIBLE_LOWER_BOUND);
        f38174e = C10011d.m33530d(enumC9973k, false, null, 3, null).m33507i(EnumC10009b.FLEXIBLE_UPPER_BOUND);
    }

    public C10012e(C10014g c10014g) {
        this.f38175f = c10014g == null ? new C10014g(this) : c10014g;
    }

    /* renamed from: k */
    public static /* synthetic */ InterfaceC10351g1 m33532k(C10012e c10012e, InterfaceC10587e1 interfaceC10587e1, C10008a c10008a, AbstractC10344e0 abstractC10344e0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            abstractC10344e0 = c10012e.f38175f.m33559c(interfaceC10587e1, true, c10008a);
            C9801m.m32345e(abstractC10344e0, "typeParameterUpperBoundE…eter, isRaw = true, attr)");
        }
        return c10012e.m33538j(interfaceC10587e1, c10008a, abstractC10344e0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final Pair<AbstractC10368m0, Boolean> m33533l(AbstractC10368m0 abstractC10368m0, InterfaceC10585e interfaceC10585e, C10008a c10008a) {
        if (abstractC10368m0.mo35993O0().getParameters().isEmpty()) {
            return C10773s.m38547a(abstractC10368m0, Boolean.FALSE);
        }
        if (AbstractC9914h.m32738c0(abstractC10368m0)) {
            InterfaceC10351g1 interfaceC10351g1 = abstractC10368m0.mo35991M0().get(0);
            EnumC10384r1 enumC10384r1Mo36708a = interfaceC10351g1.mo36708a();
            AbstractC10344e0 type = interfaceC10351g1.getType();
            C9801m.m32345e(type, "componentTypeProjection.type");
            return C10773s.m38547a(C10347f0.m36669i(abstractC10368m0.mo35992N0(), abstractC10368m0.mo35993O0(), C10815t.m38883e(new C10357i1(enumC10384r1Mo36708a, m33534m(type, c10008a))), abstractC10368m0.mo33691P0(), null, 16, null), Boolean.FALSE);
        }
        if (C10350g0.m36706a(abstractC10368m0)) {
            return C10773s.m38547a(C10427k.m37053d(EnumC10426j.f40293N, abstractC10368m0.mo35993O0().toString()), Boolean.FALSE);
        }
        InterfaceC10251h interfaceC10251hMo37678a0 = interfaceC10585e.mo37678a0(this);
        C9801m.m32345e(interfaceC10251hMo37678a0, "declaration.getMemberScope(this)");
        C10333a1 c10333a1Mo35992N0 = abstractC10368m0.mo35992N0();
        InterfaceC10345e1 interfaceC10345e1Mo32877h = interfaceC10585e.mo32877h();
        C9801m.m32345e(interfaceC10345e1Mo32877h, "declaration.typeConstructor");
        List<InterfaceC10587e1> parameters = interfaceC10585e.mo32877h().getParameters();
        C9801m.m32345e(parameters, "declaration.typeConstructor.parameters");
        ArrayList arrayList = new ArrayList(C10819v.m38911u(parameters, 10));
        for (InterfaceC10587e1 interfaceC10587e1 : parameters) {
            C9801m.m32345e(interfaceC10587e1, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
            arrayList.add(m33532k(this, interfaceC10587e1, c10008a, null, 4, null));
        }
        return C10773s.m38547a(C10347f0.m36671k(c10333a1Mo35992N0, interfaceC10345e1Mo32877h, arrayList, abstractC10368m0.mo33691P0(), interfaceC10251hMo37678a0, new c(interfaceC10585e, this, abstractC10368m0, c10008a)), Boolean.TRUE);
    }

    /* renamed from: m */
    private final AbstractC10344e0 m33534m(AbstractC10344e0 abstractC10344e0, C10008a c10008a) {
        InterfaceC10594h interfaceC10594hMo32891w = abstractC10344e0.mo35993O0().mo32891w();
        if (interfaceC10594hMo32891w instanceof InterfaceC10587e1) {
            AbstractC10344e0 abstractC10344e0M33559c = this.f38175f.m33559c((InterfaceC10587e1) interfaceC10594hMo32891w, true, c10008a);
            C9801m.m32345e(abstractC10344e0M33559c, "typeParameterUpperBoundE…tion, isRaw = true, attr)");
            return m33534m(abstractC10344e0M33559c, c10008a);
        }
        if (!(interfaceC10594hMo32891w instanceof InterfaceC10585e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + interfaceC10594hMo32891w).toString());
        }
        InterfaceC10594h interfaceC10594hMo32891w2 = C10335b0.m36585d(abstractC10344e0).mo35993O0().mo32891w();
        if (interfaceC10594hMo32891w2 instanceof InterfaceC10585e) {
            Pair<AbstractC10368m0, Boolean> pairM33533l = m33533l(C10335b0.m36584c(abstractC10344e0), (InterfaceC10585e) interfaceC10594hMo32891w, f38173d);
            AbstractC10368m0 abstractC10368m0M37646a = pairM33533l.m37646a();
            boolean zBooleanValue = pairM33533l.m37647b().booleanValue();
            Pair<AbstractC10368m0, Boolean> pairM33533l2 = m33533l(C10335b0.m36585d(abstractC10344e0), (InterfaceC10585e) interfaceC10594hMo32891w2, f38174e);
            AbstractC10368m0 abstractC10368m0M37646a2 = pairM33533l2.m37646a();
            return (zBooleanValue || pairM33533l2.m37647b().booleanValue()) ? new C10013f(abstractC10368m0M37646a, abstractC10368m0M37646a2) : C10347f0.m36664d(abstractC10368m0M37646a, abstractC10368m0M37646a2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC10594hMo32891w2 + "\" while for lower it's \"" + interfaceC10594hMo32891w + '\"').toString());
    }

    /* renamed from: n */
    static /* synthetic */ AbstractC10344e0 m33535n(C10012e c10012e, AbstractC10344e0 abstractC10344e0, C10008a c10008a, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c10008a = new C10008a(EnumC9973k.COMMON, null, false, null, null, 30, null);
        }
        return c10012e.m33534m(abstractC10344e0, c10008a);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
    /* renamed from: f */
    public boolean mo33537f() {
        return false;
    }

    /* renamed from: j */
    public final InterfaceC10351g1 m33538j(InterfaceC10587e1 interfaceC10587e1, C10008a c10008a, AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(interfaceC10587e1, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        C9801m.m32346f(c10008a, "attr");
        C9801m.m32346f(abstractC10344e0, "erasedUpperBound");
        int i2 = b.f38176a[c10008a.m33502d().ordinal()];
        if (i2 == 1) {
            return new C10357i1(EnumC10384r1.INVARIANT, abstractC10344e0);
        }
        if (i2 != 2 && i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (!interfaceC10587e1.mo37672n().m36819k()) {
            return new C10357i1(EnumC10384r1.INVARIANT, C10235a.m36072f(interfaceC10587e1).m32773H());
        }
        List<InterfaceC10587e1> parameters = abstractC10344e0.mo35993O0().getParameters();
        C9801m.m32345e(parameters, "erasedUpperBound.constructor.parameters");
        return parameters.isEmpty() ^ true ? new C10357i1(EnumC10384r1.OUT_VARIANCE, abstractC10344e0) : C10011d.m33528b(interfaceC10587e1, c10008a);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C10357i1 mo33536e(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, RoomNotification.KEY);
        return new C10357i1(m33535n(this, abstractC10344e0, null, 2, null));
    }

    public /* synthetic */ C10012e(C10014g c10014g, int i2, C9789g c9789g) {
        this((i2 & 1) != 0 ? null : c10014g);
    }
}
