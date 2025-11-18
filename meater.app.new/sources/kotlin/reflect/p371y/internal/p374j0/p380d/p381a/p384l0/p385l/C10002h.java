package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C10773s;
import kotlin.Pair;
import kotlin.collections.C10810q0;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10676z;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9984a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9988e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9990g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10044u;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10100p;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10102r;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10107w;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.p391c0.C10086a;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10239d;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10329m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;

/* compiled from: LazyJavaPackageFragment.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.h */
/* loaded from: classes2.dex */
public final class C10002h extends AbstractC10676z {

    /* renamed from: l */
    static final /* synthetic */ KProperty<Object>[] f38080l = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(C10002h.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(C10002h.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* renamed from: m */
    private final InterfaceC10044u f38081m;

    /* renamed from: n */
    private final C9990g f38082n;

    /* renamed from: o */
    private final InterfaceC10325i f38083o;

    /* renamed from: p */
    private final C9998d f38084p;

    /* renamed from: q */
    private final InterfaceC10325i<List<C10160c>> f38085q;

    /* renamed from: r */
    private final InterfaceC10620g f38086r;

    /* renamed from: s */
    private final InterfaceC10325i f38087s;

    /* compiled from: LazyJavaPackageFragment.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.h$a */
    static final class a extends Lambda implements Function0<Map<String, ? extends InterfaceC10101q>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map<String, InterfaceC10101q> invoke() {
            InterfaceC10107w interfaceC10107wM33255o = C10002h.this.f38082n.m33282a().m33255o();
            String strM35420b = C10002h.this.mo37712d().m35420b();
            C9801m.m32345e(strM35420b, "fqName.asString()");
            List<String> listMo34044a = interfaceC10107wM33255o.mo34044a(strM35420b);
            C10002h c10002h = C10002h.this;
            ArrayList arrayList = new ArrayList();
            for (String str : listMo34044a) {
                C10159b c10159bM35408m = C10159b.m35408m(C10239d.m36109d(str).m36110e());
                C9801m.m32345e(c10159bM35408m, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                InterfaceC10101q interfaceC10101qM34024b = C10100p.m34024b(c10002h.f38082n.m33282a().m33250j(), c10159bM35408m);
                Pair pairM38547a = interfaceC10101qM34024b != null ? C10773s.m38547a(str, interfaceC10101qM34024b) : null;
                if (pairM38547a != null) {
                    arrayList.add(pairM38547a);
                }
            }
            return C10810q0.m38805q(arrayList);
        }
    }

    /* compiled from: LazyJavaPackageFragment.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.h$b */
    static final class b extends Lambda implements Function0<HashMap<C10239d, C10239d>> {

        /* compiled from: LazyJavaPackageFragment.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.h$b$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f38090a;

            static {
                int[] iArr = new int[C10086a.a.values().length];
                iArr[C10086a.a.MULTIFILE_CLASS_PART.ordinal()] = 1;
                iArr[C10086a.a.FILE_FACADE.ordinal()] = 2;
                f38090a = iArr;
            }
        }

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HashMap<C10239d, C10239d> invoke() {
            HashMap<C10239d, C10239d> map = new HashMap<>();
            for (Map.Entry<String, InterfaceC10101q> entry : C10002h.this.m33427N0().entrySet()) {
                String key = entry.getKey();
                InterfaceC10101q value = entry.getValue();
                C10239d c10239dM36109d = C10239d.m36109d(key);
                C9801m.m32345e(c10239dM36109d, "byInternalName(partInternalName)");
                C10086a c10086aMo34025a = value.mo34025a();
                int i2 = a.f38090a[c10086aMo34025a.m33913c().ordinal()];
                if (i2 == 1) {
                    String strM33915e = c10086aMo34025a.m33915e();
                    if (strM33915e != null) {
                        C10239d c10239dM36109d2 = C10239d.m36109d(strM33915e);
                        C9801m.m32345e(c10239dM36109d2, "byInternalName(header.mu…: continue@kotlinClasses)");
                        map.put(c10239dM36109d, c10239dM36109d2);
                    }
                } else if (i2 == 2) {
                    map.put(c10239dM36109d, c10239dM36109d);
                }
            }
            return map;
        }
    }

    /* compiled from: LazyJavaPackageFragment.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.h$c */
    static final class c extends Lambda implements Function0<List<? extends C10160c>> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends C10160c> invoke() {
            Collection<InterfaceC10044u> collectionMo33624A = C10002h.this.f38081m.mo33624A();
            ArrayList arrayList = new ArrayList(C10819v.m38911u(collectionMo33624A, 10));
            Iterator<T> it = collectionMo33624A.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC10044u) it.next()).mo33625d());
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10002h(C9990g c9990g, InterfaceC10044u interfaceC10044u) {
        super(c9990g.m33285d(), interfaceC10044u.mo33625d());
        C9801m.m32346f(c9990g, "outerContext");
        C9801m.m32346f(interfaceC10044u, "jPackage");
        this.f38081m = interfaceC10044u;
        C9990g c9990gM33233d = C9984a.m33233d(c9990g, this, null, 0, 6, null);
        this.f38082n = c9990gM33233d;
        this.f38083o = c9990gM33233d.m33286e().mo36516d(new a());
        this.f38084p = new C9998d(c9990gM33233d, interfaceC10044u, this);
        this.f38085q = c9990gM33233d.m33286e().mo36515c(new c(), C10817u.m38888j());
        this.f38086r = c9990gM33233d.m33282a().m33249i().m33817b() ? InterfaceC10620g.f40808c.m37735b() : C9988e.m33273a(c9990gM33233d, interfaceC10044u);
        this.f38087s = c9990gM33233d.m33286e().mo36516d(new b());
    }

    /* renamed from: M0 */
    public final InterfaceC10585e m33426M0(InterfaceC10030g interfaceC10030g) {
        C9801m.m32346f(interfaceC10030g, "jClass");
        return this.f38084p.m33318j().m33435O(interfaceC10030g);
    }

    /* renamed from: N0 */
    public final Map<String, InterfaceC10101q> m33427N0() {
        return (Map) C10329m.m36555a(this.f38083o, this, f38080l[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public C9998d mo32988q() {
        return this.f38084p;
    }

    /* renamed from: P0 */
    public final List<C10160c> m33429P0() {
        return this.f38085q.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10615b, kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10614a
    public InterfaceC10620g getAnnotations() {
        return this.f38086r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10676z, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10657k, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10635p
    /* renamed from: t */
    public InterfaceC10741z0 mo32883t() {
        return new C10102r(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10676z, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10655j
    public String toString() {
        return "Lazy Java package fragment: " + mo37712d() + " of module " + this.f38082n.m33282a().m33253m();
    }
}
