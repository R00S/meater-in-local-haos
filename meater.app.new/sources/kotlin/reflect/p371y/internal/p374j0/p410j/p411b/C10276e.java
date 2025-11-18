package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C10808p0;
import kotlin.collections.C10810q0;
import kotlin.collections.C10813s;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.C9848l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10601j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10736x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10617d;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10123b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10150b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10215k;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10204a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10206b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10207c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10208d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10209e;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10213i;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10214j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10216l;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10217m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10221q;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10222r;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10225u;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10226v;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10227w;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10228x;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10229y;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10230z;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;

/* compiled from: AnnotationDeserializer.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.e */
/* loaded from: classes3.dex */
public final class C10276e {

    /* renamed from: a */
    private final InterfaceC10592g0 f39750a;

    /* renamed from: b */
    private final C10601j0 f39751b;

    /* compiled from: AnnotationDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.e$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39752a;

        static {
            int[] iArr = new int[C10123b.b.c.EnumC11556c.values().length];
            iArr[C10123b.b.c.EnumC11556c.BYTE.ordinal()] = 1;
            iArr[C10123b.b.c.EnumC11556c.CHAR.ordinal()] = 2;
            iArr[C10123b.b.c.EnumC11556c.SHORT.ordinal()] = 3;
            iArr[C10123b.b.c.EnumC11556c.INT.ordinal()] = 4;
            iArr[C10123b.b.c.EnumC11556c.LONG.ordinal()] = 5;
            iArr[C10123b.b.c.EnumC11556c.FLOAT.ordinal()] = 6;
            iArr[C10123b.b.c.EnumC11556c.DOUBLE.ordinal()] = 7;
            iArr[C10123b.b.c.EnumC11556c.BOOLEAN.ordinal()] = 8;
            iArr[C10123b.b.c.EnumC11556c.STRING.ordinal()] = 9;
            iArr[C10123b.b.c.EnumC11556c.CLASS.ordinal()] = 10;
            iArr[C10123b.b.c.EnumC11556c.ENUM.ordinal()] = 11;
            iArr[C10123b.b.c.EnumC11556c.ANNOTATION.ordinal()] = 12;
            iArr[C10123b.b.c.EnumC11556c.ARRAY.ordinal()] = 13;
            f39752a = iArr;
        }
    }

    public C10276e(InterfaceC10592g0 interfaceC10592g0, C10601j0 c10601j0) {
        C9801m.m32346f(interfaceC10592g0, "module");
        C9801m.m32346f(c10601j0, "notFoundClasses");
        this.f39750a = interfaceC10592g0;
        this.f39751b = c10601j0;
    }

    /* renamed from: b */
    private final boolean m36237b(AbstractC10211g<?> abstractC10211g, AbstractC10344e0 abstractC10344e0, C10123b.b.c cVar) {
        C10123b.b.c.EnumC11556c enumC11556cM34342S = cVar.m34342S();
        int i2 = enumC11556cM34342S == null ? -1 : a.f39752a[enumC11556cM34342S.ordinal()];
        if (i2 == 10) {
            InterfaceC10594h interfaceC10594hMo32891w = abstractC10344e0.mo35993O0().mo32891w();
            InterfaceC10585e interfaceC10585e = interfaceC10594hMo32891w instanceof InterfaceC10585e ? (InterfaceC10585e) interfaceC10594hMo32891w : null;
            if (interfaceC10585e != null && !AbstractC9914h.m32748k0(interfaceC10585e)) {
                return false;
            }
        } else {
            if (i2 != 13) {
                return C9801m.m32341a(abstractC10211g.mo36013a(this.f39750a), abstractC10344e0);
            }
            if (!((abstractC10211g instanceof C10206b) && ((C10206b) abstractC10211g).mo36023b().size() == cVar.m34334J().size())) {
                throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + abstractC10211g).toString());
            }
            AbstractC10344e0 abstractC10344e0M32793k = m36238c().m32793k(abstractC10344e0);
            C9801m.m32345e(abstractC10344e0M32793k, "builtIns.getArrayElementType(expectedType)");
            C10206b c10206b = (C10206b) abstractC10211g;
            Iterable iterableM38889k = C10817u.m38889k(c10206b.mo36023b());
            if (!(iterableM38889k instanceof Collection) || !((Collection) iterableM38889k).isEmpty()) {
                Iterator it = iterableM38889k.iterator();
                while (it.hasNext()) {
                    int iMo32397b = ((IntIterator) it).mo32397b();
                    AbstractC10211g<?> abstractC10211g2 = c10206b.mo36023b().get(iMo32397b);
                    C10123b.b.c cVarM34332H = cVar.m34332H(iMo32397b);
                    C9801m.m32345e(cVarM34332H, "value.getArrayElement(i)");
                    if (!m36237b(abstractC10211g2, abstractC10344e0M32793k, cVarM34332H)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    private final AbstractC9914h m36238c() {
        return this.f39750a.mo37021o();
    }

    /* renamed from: d */
    private final Pair<C10163f, AbstractC10211g<?>> m36239d(C10123b.b bVar, Map<C10163f, ? extends InterfaceC10599i1> map, InterfaceC10151c interfaceC10151c) {
        InterfaceC10599i1 interfaceC10599i1 = map.get(C10314x.m36495b(interfaceC10151c, bVar.m34297w()));
        if (interfaceC10599i1 == null) {
            return null;
        }
        C10163f c10163fM36495b = C10314x.m36495b(interfaceC10151c, bVar.m34297w());
        AbstractC10344e0 type = interfaceC10599i1.getType();
        C9801m.m32345e(type, "parameter.type");
        C10123b.b.c cVarM34298x = bVar.m34298x();
        C9801m.m32345e(cVarM34298x, "proto.value");
        return new Pair<>(c10163fM36495b, m36241g(type, cVarM34298x, interfaceC10151c));
    }

    /* renamed from: e */
    private final InterfaceC10585e m36240e(C10159b c10159b) {
        return C10736x.m38151c(this.f39750a, c10159b, this.f39751b);
    }

    /* renamed from: g */
    private final AbstractC10211g<?> m36241g(AbstractC10344e0 abstractC10344e0, C10123b.b.c cVar, InterfaceC10151c interfaceC10151c) {
        AbstractC10211g<?> abstractC10211gM36243f = m36243f(abstractC10344e0, cVar, interfaceC10151c);
        if (!m36237b(abstractC10211gM36243f, abstractC10344e0, cVar)) {
            abstractC10211gM36243f = null;
        }
        if (abstractC10211gM36243f != null) {
            return abstractC10211gM36243f;
        }
        return AbstractC10215k.f39565b.m36032a("Unexpected argument value: actual type " + cVar.m34342S() + " != expected type " + abstractC10344e0);
    }

    /* renamed from: a */
    public final InterfaceC10616c m36242a(C10123b c10123b, InterfaceC10151c interfaceC10151c) {
        C9801m.m32346f(c10123b, "proto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        InterfaceC10585e interfaceC10585eM36240e = m36240e(C10314x.m36494a(interfaceC10151c, c10123b.m34279A()));
        Map mapM38797i = C10810q0.m38797i();
        if (c10123b.m34284x() != 0 && !C10427k.m37054m(interfaceC10585eM36240e) && C10187d.m35832t(interfaceC10585eM36240e)) {
            Collection<InterfaceC10582d> collectionMo32880k = interfaceC10585eM36240e.mo32880k();
            C9801m.m32345e(collectionMo32880k, "annotationClass.constructors");
            InterfaceC10582d interfaceC10582d = (InterfaceC10582d) C10813s.m38868t0(collectionMo32880k);
            if (interfaceC10582d != null) {
                List<InterfaceC10599i1> listMo37028f = interfaceC10582d.mo37028f();
                C9801m.m32345e(listMo37028f, "constructor.valueParameters");
                LinkedHashMap linkedHashMap = new LinkedHashMap(C9848l.m32419b(C10808p0.m38793e(C10819v.m38911u(listMo37028f, 10)), 16));
                for (Object obj : listMo37028f) {
                    linkedHashMap.put(((InterfaceC10599i1) obj).getName(), obj);
                }
                List<C10123b.b> listM34285y = c10123b.m34285y();
                C9801m.m32345e(listM34285y, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (C10123b.b bVar : listM34285y) {
                    C9801m.m32345e(bVar, "it");
                    Pair<C10163f, AbstractC10211g<?>> pairM36239d = m36239d(bVar, linkedHashMap, interfaceC10151c);
                    if (pairM36239d != null) {
                        arrayList.add(pairM36239d);
                    }
                }
                mapM38797i = C10810q0.m38805q(arrayList);
            }
        }
        return new C10617d(interfaceC10585eM36240e.mo36400s(), mapM38797i, InterfaceC10741z0.f41247a);
    }

    /* renamed from: f */
    public final AbstractC10211g<?> m36243f(AbstractC10344e0 abstractC10344e0, C10123b.b.c cVar, InterfaceC10151c interfaceC10151c) {
        AbstractC10211g<?> c10209e;
        C9801m.m32346f(abstractC10344e0, "expectedType");
        C9801m.m32346f(cVar, "value");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        Boolean boolMo35368d = C10150b.f39203O.mo35368d(cVar.m34338O());
        C9801m.m32345e(boolMo35368d, "IS_UNSIGNED.get(value.flags)");
        boolean zBooleanValue = boolMo35368d.booleanValue();
        C10123b.b.c.EnumC11556c enumC11556cM34342S = cVar.m34342S();
        switch (enumC11556cM34342S == null ? -1 : a.f39752a[enumC11556cM34342S.ordinal()]) {
            case 1:
                byte bM34340Q = (byte) cVar.m34340Q();
                return zBooleanValue ? new C10227w(bM34340Q) : new C10208d(bM34340Q);
            case 2:
                c10209e = new C10209e((char) cVar.m34340Q());
                break;
            case 3:
                short sM34340Q = (short) cVar.m34340Q();
                return zBooleanValue ? new C10230z(sM34340Q) : new C10225u(sM34340Q);
            case 4:
                int iM34340Q = (int) cVar.m34340Q();
                if (zBooleanValue) {
                    c10209e = new C10228x(iM34340Q);
                    break;
                } else {
                    c10209e = new C10217m(iM34340Q);
                    break;
                }
            case 5:
                long jM34340Q = cVar.m34340Q();
                return zBooleanValue ? new C10229y(jM34340Q) : new C10222r(jM34340Q);
            case 6:
                c10209e = new C10216l(cVar.m34339P());
                break;
            case 7:
                c10209e = new C10213i(cVar.m34336M());
                break;
            case 8:
                c10209e = new C10207c(cVar.m34340Q() != 0);
                break;
            case 9:
                c10209e = new C10226v(interfaceC10151c.getString(cVar.m34341R()));
                break;
            case 10:
                c10209e = new C10221q(C10314x.m36494a(interfaceC10151c, cVar.m34335K()), cVar.m34331G());
                break;
            case 11:
                c10209e = new C10214j(C10314x.m36494a(interfaceC10151c, cVar.m34335K()), C10314x.m36495b(interfaceC10151c, cVar.m34337N()));
                break;
            case 12:
                C10123b c10123bM34330F = cVar.m34330F();
                C9801m.m32345e(c10123bM34330F, "value.annotation");
                c10209e = new C10204a(m36242a(c10123bM34330F, interfaceC10151c));
                break;
            case 13:
                List<C10123b.b.c> listM34334J = cVar.m34334J();
                C9801m.m32345e(listM34334J, "value.arrayElementList");
                ArrayList arrayList = new ArrayList(C10819v.m38911u(listM34334J, 10));
                for (C10123b.b.c cVar2 : listM34334J) {
                    AbstractC10368m0 abstractC10368m0M32791i = m36238c().m32791i();
                    C9801m.m32345e(abstractC10368m0M32791i, "builtIns.anyType");
                    C9801m.m32345e(cVar2, "it");
                    arrayList.add(m36243f(abstractC10368m0M32791i, cVar2, interfaceC10151c));
                }
                return new C10304n(arrayList, abstractC10344e0);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + cVar.m34342S() + " (expected " + abstractC10344e0 + ')').toString());
        }
        return c10209e;
    }
}
