package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C10726s;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10614a;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9929c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.EnumC9946b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9984a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9990g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10000f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C9999e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10365l0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;

/* compiled from: signatureEnhancement.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.l */
/* loaded from: classes3.dex */
public final class C10062l {

    /* renamed from: a */
    private final C10054d f38272a;

    /* compiled from: signatureEnhancement.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.l$a */
    static final class a extends Lambda implements Function1<AbstractC10381q1, Boolean> {

        /* renamed from: f */
        public static final a f38273f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC10381q1 abstractC10381q1) {
            InterfaceC10594h interfaceC10594hMo32891w = abstractC10381q1.mo35993O0().mo32891w();
            if (interfaceC10594hMo32891w == null) {
                return Boolean.FALSE;
            }
            C10163f name = interfaceC10594hMo32891w.getName();
            C9929c c9929c = C9929c.f37667a;
            return Boolean.valueOf(C9801m.m32341a(name, c9929c.m32924h().m35425g()) && C9801m.m32341a(C10235a.m36070d(interfaceC10594hMo32891w), c9929c.m32924h()));
        }
    }

    /* compiled from: signatureEnhancement.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.l$b */
    static final class b extends Lambda implements Function1<InterfaceC10576b, AbstractC10344e0> {

        /* renamed from: f */
        public static final b f38274f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10344e0 invoke(InterfaceC10576b interfaceC10576b) {
            C9801m.m32346f(interfaceC10576b, "it");
            InterfaceC10735w0 interfaceC10735w0Mo37032m0 = interfaceC10576b.mo37032m0();
            C9801m.m32343c(interfaceC10735w0Mo37032m0);
            AbstractC10344e0 type = interfaceC10735w0Mo37032m0.getType();
            C9801m.m32345e(type, "it.extensionReceiverParameter!!.type");
            return type;
        }
    }

    /* compiled from: signatureEnhancement.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.l$c */
    static final class c extends Lambda implements Function1<InterfaceC10576b, AbstractC10344e0> {

        /* renamed from: f */
        public static final c f38275f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10344e0 invoke(InterfaceC10576b interfaceC10576b) {
            C9801m.m32346f(interfaceC10576b, "it");
            AbstractC10344e0 returnType = interfaceC10576b.getReturnType();
            C9801m.m32343c(returnType);
            return returnType;
        }
    }

    /* compiled from: signatureEnhancement.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.l$d */
    static final class d extends Lambda implements Function1<InterfaceC10576b, AbstractC10344e0> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10599i1 f38276f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC10599i1 interfaceC10599i1) {
            super(1);
            this.f38276f = interfaceC10599i1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10344e0 invoke(InterfaceC10576b interfaceC10576b) {
            C9801m.m32346f(interfaceC10576b, "it");
            AbstractC10344e0 type = interfaceC10576b.mo37028f().get(this.f38276f.mo37696g()).getType();
            C9801m.m32345e(type, "it.valueParameters[p.index].type");
            return type;
        }
    }

    /* compiled from: signatureEnhancement.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.l$e */
    static final class e extends Lambda implements Function1<AbstractC10381q1, Boolean> {

        /* renamed from: f */
        public static final e f38277f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AbstractC10381q1 abstractC10381q1) {
            C9801m.m32346f(abstractC10381q1, "it");
            return Boolean.valueOf(abstractC10381q1 instanceof InterfaceC10365l0);
        }
    }

    public C10062l(C10054d c10054d) {
        C9801m.m32346f(c10054d, "typeEnhancement");
        this.f38272a = c10054d;
    }

    /* renamed from: a */
    private final boolean m33737a(AbstractC10344e0 abstractC10344e0) {
        return C10372n1.m36770c(abstractC10344e0, a.f38273f);
    }

    /* renamed from: b */
    private final AbstractC10344e0 m33738b(InterfaceC10576b interfaceC10576b, InterfaceC10614a interfaceC10614a, boolean z, C9990g c9990g, EnumC9946b enumC9946b, C10067q c10067q, boolean z2, Function1<? super InterfaceC10576b, ? extends AbstractC10344e0> function1) {
        C10064n c10064n = new C10064n(interfaceC10614a, z, c9990g, enumC9946b, false, 16, null);
        AbstractC10344e0 abstractC10344e0Invoke = function1.invoke(interfaceC10576b);
        Collection<? extends InterfaceC10576b> collectionMo37027e = interfaceC10576b.mo37027e();
        C9801m.m32345e(collectionMo37027e, "overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C10819v.m38911u(collectionMo37027e, 10));
        for (InterfaceC10576b interfaceC10576b2 : collectionMo37027e) {
            C9801m.m32345e(interfaceC10576b2, "it");
            arrayList.add(function1.invoke(interfaceC10576b2));
        }
        return m33739c(c10064n, abstractC10344e0Invoke, arrayList, c10067q, z2);
    }

    /* renamed from: c */
    private final AbstractC10344e0 m33739c(C10064n c10064n, AbstractC10344e0 abstractC10344e0, List<? extends AbstractC10344e0> list, C10067q c10067q, boolean z) {
        return this.f38272a.m33675a(abstractC10344e0, c10064n.m33645b(abstractC10344e0, list, c10067q, z), c10064n.mo33657u());
    }

    /* renamed from: d */
    static /* synthetic */ AbstractC10344e0 m33740d(C10062l c10062l, InterfaceC10576b interfaceC10576b, InterfaceC10614a interfaceC10614a, boolean z, C9990g c9990g, EnumC9946b enumC9946b, C10067q c10067q, boolean z2, Function1 function1, int i2, Object obj) {
        return c10062l.m33738b(interfaceC10576b, interfaceC10614a, z, c9990g, enumC9946b, c10067q, (i2 & 32) != 0 ? false : z2, function1);
    }

    /* renamed from: e */
    static /* synthetic */ AbstractC10344e0 m33741e(C10062l c10062l, C10064n c10064n, AbstractC10344e0 abstractC10344e0, List list, C10067q c10067q, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            c10067q = null;
        }
        return c10062l.m33739c(c10064n, abstractC10344e0, list, c10067q, (i2 & 8) != 0 ? false : z);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b> D m33742f(D r21, kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9990g r22) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10062l.m33742f(kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.f0.y.e.j0.d.a.l0.g):kotlin.reflect.jvm.internal.impl.descriptors.b");
    }

    /* renamed from: j */
    private final AbstractC10344e0 m33743j(InterfaceC10576b interfaceC10576b, InterfaceC10599i1 interfaceC10599i1, C9990g c9990g, C10067q c10067q, boolean z, Function1<? super InterfaceC10576b, ? extends AbstractC10344e0> function1) {
        C9990g c9990gM33237h;
        return m33738b(interfaceC10576b, interfaceC10599i1, false, (interfaceC10599i1 == null || (c9990gM33237h = C9984a.m33237h(c9990g, interfaceC10599i1.getAnnotations())) == null) ? c9990g : c9990gM33237h, EnumC9946b.VALUE_PARAMETER, c10067q, z, function1);
    }

    /* renamed from: k */
    private final <D extends InterfaceC10576b> InterfaceC10620g m33744k(D d2, C9990g c9990g) {
        InterfaceC10594h interfaceC10594hM38123a = C10726s.m38123a(d2);
        if (interfaceC10594hM38123a == null) {
            return d2.getAnnotations();
        }
        C10000f c10000f = interfaceC10594hM38123a instanceof C10000f ? (C10000f) interfaceC10594hM38123a : null;
        List<InterfaceC10019a> listM33344R0 = c10000f != null ? c10000f.m33344R0() : null;
        if (listM33344R0 == null || listM33344R0.isEmpty()) {
            return d2.getAnnotations();
        }
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM33344R0, 10));
        Iterator<T> it = listM33344R0.iterator();
        while (it.hasNext()) {
            arrayList.add(new C9999e(c9990g, (InterfaceC10019a) it.next(), true));
        }
        return InterfaceC10620g.f40808c.m37734a(C10782c0.m38607m0(d2.getAnnotations(), arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public final <D extends InterfaceC10576b> Collection<D> m33745g(C9990g c9990g, Collection<? extends D> collection) {
        C9801m.m32346f(c9990g, "c");
        C9801m.m32346f(collection, "platformSignatures");
        ArrayList arrayList = new ArrayList(C10819v.m38911u(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m33742f((InterfaceC10576b) it.next(), c9990g));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final AbstractC10344e0 m33746h(AbstractC10344e0 abstractC10344e0, C9990g c9990g) {
        C9801m.m32346f(abstractC10344e0, "type");
        C9801m.m32346f(c9990g, "context");
        AbstractC10344e0 abstractC10344e0M33741e = m33741e(this, new C10064n(null, false, c9990g, EnumC9946b.TYPE_USE, true), abstractC10344e0, C10817u.m38888j(), null, false, 12, null);
        return abstractC10344e0M33741e == null ? abstractC10344e0 : abstractC10344e0M33741e;
    }

    /* renamed from: i */
    public final List<AbstractC10344e0> m33747i(InterfaceC10587e1 interfaceC10587e1, List<? extends AbstractC10344e0> list, C9990g c9990g) {
        AbstractC10344e0 abstractC10344e0M33741e;
        C9801m.m32346f(interfaceC10587e1, "typeParameter");
        C9801m.m32346f(list, "bounds");
        C9801m.m32346f(c9990g, "context");
        ArrayList arrayList = new ArrayList(C10819v.m38911u(list, 10));
        for (AbstractC10344e0 abstractC10344e0 : list) {
            if (!C10457a.m37136b(abstractC10344e0, e.f38277f) && (abstractC10344e0M33741e = m33741e(this, new C10064n(interfaceC10587e1, false, c9990g, EnumC9946b.TYPE_PARAMETER_BOUNDS, false, 16, null), abstractC10344e0, C10817u.m38888j(), null, false, 12, null)) != null) {
                abstractC10344e0 = abstractC10344e0M33741e;
            }
            arrayList.add(abstractC10344e0);
        }
        return arrayList;
    }
}
