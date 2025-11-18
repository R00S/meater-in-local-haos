package kotlin.reflect.p371y.internal.p374j0.p375b.p376p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C10782c0;
import kotlin.collections.C10813s;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10650g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10660l0;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9913g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p422m.C10481q;

/* compiled from: FunctionInvokeDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.b.p.e */
/* loaded from: classes2.dex */
public final class C9926e extends C10650g0 {

    /* renamed from: J */
    public static final a f37662J = new a(null);

    /* compiled from: FunctionInvokeDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.p.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: b */
        private final InterfaceC10599i1 m32909b(C9926e c9926e, int i2, InterfaceC10587e1 interfaceC10587e1) {
            String lowerCase;
            String strM35455k = interfaceC10587e1.getName().m35455k();
            C9801m.m32345e(strM35455k, "typeParameter.name.asString()");
            if (C9801m.m32341a(strM35455k, "T")) {
                lowerCase = "instance";
            } else if (C9801m.m32341a(strM35455k, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strM35455k.toLowerCase(Locale.ROOT);
                C9801m.m32345e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            InterfaceC10620g interfaceC10620gM37735b = InterfaceC10620g.f40808c.m37735b();
            C10163f c10163fM35454x = C10163f.m35454x(lowerCase);
            C9801m.m32345e(c10163fM35454x, "identifier(name)");
            AbstractC10368m0 abstractC10368m0Mo36400s = interfaceC10587e1.mo36400s();
            C9801m.m32345e(abstractC10368m0Mo36400s, "typeParameter.defaultType");
            InterfaceC10741z0 interfaceC10741z0 = InterfaceC10741z0.f41247a;
            C9801m.m32345e(interfaceC10741z0, "NO_SOURCE");
            return new C10660l0(c9926e, null, i2, interfaceC10620gM37735b, c10163fM35454x, abstractC10368m0Mo36400s, false, false, false, null, interfaceC10741z0);
        }

        /* renamed from: a */
        public final C9926e m32910a(C9923b c9923b, boolean z) {
            C9801m.m32346f(c9923b, "functionClass");
            List<InterfaceC10587e1> listMo32884w = c9923b.mo32884w();
            C9926e c9926e = new C9926e(c9923b, null, InterfaceC10576b.a.DECLARATION, z, null);
            InterfaceC10735w0 interfaceC10735w0Mo37677K0 = c9923b.mo37677K0();
            List<InterfaceC10735w0> listM38888j = C10817u.m38888j();
            List<? extends InterfaceC10587e1> listM38888j2 = C10817u.m38888j();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listMo32884w) {
                if (!(((InterfaceC10587e1) obj).mo37672n() == EnumC10384r1.IN_VARIANCE)) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<IndexedValue> iterableM38578K0 = C10782c0.m38578K0(arrayList);
            ArrayList arrayList2 = new ArrayList(C10819v.m38911u(iterableM38578K0, 10));
            for (IndexedValue indexedValue : iterableM38578K0) {
                arrayList2.add(C9926e.f37662J.m32909b(c9926e, indexedValue.m38649c(), (InterfaceC10587e1) indexedValue.m38650d()));
            }
            c9926e.mo37850S0(null, interfaceC10735w0Mo37677K0, listM38888j, listM38888j2, arrayList2, ((InterfaceC10587e1) C10813s.m38844g0(listMo32884w)).mo36400s(), EnumC10583d0.ABSTRACT, C10728t.f41220e);
            c9926e.mo33207a1(true);
            return c9926e;
        }
    }

    private C9926e(InterfaceC10609m interfaceC10609m, C9926e c9926e, InterfaceC10576b.a aVar, boolean z) {
        super(interfaceC10609m, c9926e, InterfaceC10620g.f40808c.m37735b(), C10481q.f40464i, aVar, InterfaceC10741z0.f41247a);
        m37927g1(true);
        m37929i1(z);
        mo33206Z0(false);
    }

    public /* synthetic */ C9926e(InterfaceC10609m interfaceC10609m, C9926e c9926e, InterfaceC10576b.a aVar, boolean z, C9789g c9789g) {
        this(interfaceC10609m, c9926e, aVar, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[RETURN] */
    /* renamed from: q1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y m32905q1(java.util.List<kotlin.reflect.p371y.internal.p374j0.p397f.C10163f> r10) {
        /*
            r9 = this;
            java.util.List r0 = r9.mo37028f()
            int r0 = r0.size()
            int r1 = r10.size()
            int r0 = r0 - r1
            r1 = 1
            java.lang.String r2 = "valueParameters"
            r3 = 0
            if (r0 != 0) goto L54
            java.util.List r4 = r9.mo37028f()
            kotlin.jvm.internal.C9801m.m32345e(r4, r2)
            java.util.List r4 = kotlin.collections.C10813s.m38824L0(r10, r4)
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L2a
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L2a
        L28:
            r4 = 1
            goto L51
        L2a:
            java.util.Iterator r4 = r4.iterator()
        L2e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L28
            java.lang.Object r5 = r4.next()
            kotlin.m r5 = (kotlin.Pair) r5
            java.lang.Object r6 = r5.m37646a()
            kotlin.f0.y.e.j0.f.f r6 = (kotlin.reflect.p371y.internal.p374j0.p397f.C10163f) r6
            java.lang.Object r5 = r5.m37647b()
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1) r5
            kotlin.f0.y.e.j0.f.f r5 = r5.getName()
            boolean r5 = kotlin.jvm.internal.C9801m.m32341a(r6, r5)
            if (r5 != 0) goto L2e
            r4 = 0
        L51:
            if (r4 == 0) goto L54
            return r9
        L54:
            java.util.List r4 = r9.mo37028f()
            kotlin.jvm.internal.C9801m.m32345e(r4, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C10813s.m38869u(r4, r5)
            r2.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L6a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L98
            java.lang.Object r5 = r4.next()
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1) r5
            kotlin.f0.y.e.j0.f.f r6 = r5.getName()
            java.lang.String r7 = "it.name"
            kotlin.jvm.internal.C9801m.m32345e(r6, r7)
            int r7 = r5.mo37696g()
            int r8 = r7 - r0
            if (r8 < 0) goto L90
            java.lang.Object r8 = r10.get(r8)
            kotlin.f0.y.e.j0.f.f r8 = (kotlin.reflect.p371y.internal.p374j0.p397f.C10163f) r8
            if (r8 == 0) goto L90
            r6 = r8
        L90:
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r5 = r5.mo37693G0(r9, r6, r7)
            r2.add(r5)
            goto L6a
        L98:
            kotlin.f0.y.e.j0.l.l1 r0 = kotlin.reflect.p371y.internal.p374j0.p415l.C10366l1.f40139a
            kotlin.reflect.jvm.internal.impl.descriptors.p1.p$c r0 = r9.m37920T0(r0)
            boolean r4 = r10.isEmpty()
            if (r4 == 0) goto La6
        La4:
            r1 = 0
            goto Lbd
        La6:
            java.util.Iterator r10 = r10.iterator()
        Laa:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto La4
            java.lang.Object r4 = r10.next()
            kotlin.f0.y.e.j0.f.f r4 = (kotlin.reflect.p371y.internal.p374j0.p397f.C10163f) r4
            if (r4 != 0) goto Lba
            r4 = 1
            goto Lbb
        Lba:
            r4 = 0
        Lbb:
            if (r4 == 0) goto Laa
        Lbd:
            kotlin.reflect.jvm.internal.impl.descriptors.p1.p$c r10 = r0.m37946H(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.p1.p$c r10 = r10.mo36995b(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r0 = r9.mo37019a()
            kotlin.reflect.jvm.internal.impl.descriptors.p1.p$c r10 = r10.mo37001h(r0)
            java.lang.String r0 = "newCopyBuilder(TypeSubst…   .setOriginal(original)"
            kotlin.jvm.internal.C9801m.m32345e(r10, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.y r10 = super.mo32907N0(r10)
            kotlin.jvm.internal.C9801m.m32343c(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p375b.p376p.C9926e.m32905q1(java.util.List):kotlin.reflect.jvm.internal.impl.descriptors.y");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10650g0, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p
    /* renamed from: M0 */
    protected AbstractC10666p mo32906M0(InterfaceC10609m interfaceC10609m, InterfaceC10738y interfaceC10738y, InterfaceC10576b.a aVar, C10163f c10163f, InterfaceC10620g interfaceC10620g, InterfaceC10741z0 interfaceC10741z0) {
        C9801m.m32346f(interfaceC10609m, "newOwner");
        C9801m.m32346f(aVar, "kind");
        C9801m.m32346f(interfaceC10620g, "annotations");
        C9801m.m32346f(interfaceC10741z0, "source");
        return new C9926e(interfaceC10609m, (C9926e) interfaceC10738y, aVar, isSuspend());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p
    /* renamed from: N0 */
    protected InterfaceC10738y mo32907N0(AbstractC10666p.c cVar) {
        C9801m.m32346f(cVar, "configuration");
        C9926e c9926e = (C9926e) super.mo32907N0(cVar);
        if (c9926e == null) {
            return null;
        }
        List<InterfaceC10599i1> listMo37028f = c9926e.mo37028f();
        C9801m.m32345e(listMo37028f, "substituted.valueParameters");
        boolean z = false;
        if ((listMo37028f instanceof Collection) && listMo37028f.isEmpty()) {
            z = true;
        } else {
            Iterator<T> it = listMo37028f.iterator();
            while (it.hasNext()) {
                AbstractC10344e0 type = ((InterfaceC10599i1) it.next()).getType();
                C9801m.m32345e(type, "it.type");
                if (C9913g.m32708d(type) != null) {
                    break;
                }
            }
            z = true;
        }
        if (z) {
            return c9926e;
        }
        List<InterfaceC10599i1> listMo37028f2 = c9926e.mo37028f();
        C9801m.m32345e(listMo37028f2, "substituted.valueParameters");
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listMo37028f2, 10));
        Iterator<T> it2 = listMo37028f2.iterator();
        while (it2.hasNext()) {
            AbstractC10344e0 type2 = ((InterfaceC10599i1) it2.next()).getType();
            C9801m.m32345e(type2, "it.type");
            arrayList.add(C9913g.m32708d(type2));
        }
        return c9926e.m32905q1(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y
    /* renamed from: P */
    public boolean mo32908P() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: z */
    public boolean mo32885z() {
        return false;
    }
}
