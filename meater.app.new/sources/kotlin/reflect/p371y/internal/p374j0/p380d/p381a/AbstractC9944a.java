package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.C10782c0;
import kotlin.collections.C10803n;
import kotlin.collections.C10813s;
import kotlin.collections.C10824x0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.EnumC10627n;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10059i;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10056f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.a */
/* loaded from: classes2.dex */
public abstract class AbstractC9944a<TAnnotation> {

    /* renamed from: a */
    private static final a f37781a = new a(null);

    /* renamed from: b */
    @Deprecated
    private static final Map<String, EnumC9946b> f37782b;

    /* renamed from: c */
    private final C10077w f37783c;

    /* renamed from: d */
    private final ConcurrentHashMap<Object, TAnnotation> f37784d;

    /* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.a$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.a$b */
    static final class b extends Lambda implements Function1<TAnnotation, Boolean> {

        /* renamed from: f */
        public static final b f37785f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(TAnnotation tannotation) {
            C9801m.m32346f(tannotation, "$this$extractNullability");
            return Boolean.FALSE;
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC9946b enumC9946b : EnumC9946b.values()) {
            String strM33045k = enumC9946b.m33045k();
            if (linkedHashMap.get(strM33045k) == null) {
                linkedHashMap.put(strM33045k, enumC9946b);
            }
        }
        f37782b = linkedHashMap;
    }

    public AbstractC9944a(C10077w c10077w) {
        C9801m.m32346f(c10077w, "javaTypeEnhancementState");
        this.f37783c = c10077w;
        this.f37784d = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private final Set<EnumC9946b> m33023a(Set<? extends EnumC9946b> set) {
        return set.contains(EnumC9946b.TYPE_USE) ? C10824x0.m38925l(C10824x0.m38924k(C10803n.m38758l0(EnumC9946b.values()), EnumC9946b.TYPE_PARAMETER_BOUNDS), set) : set;
    }

    /* renamed from: d */
    private final C10071q m33024d(TAnnotation tannotation) {
        C10059i c10059iM33025g;
        C10071q c10071qM33032r = m33032r(tannotation);
        if (c10071qM33032r != null) {
            return c10071qM33032r;
        }
        Pair<TAnnotation, Set<EnumC9946b>> pairM33033t = m33033t(tannotation);
        if (pairM33033t == null) {
            return null;
        }
        TAnnotation tannotationM37646a = pairM33033t.m37646a();
        Set<EnumC9946b> setM37647b = pairM33033t.m37647b();
        EnumC9955f0 enumC9955f0M33031q = m33031q(tannotation);
        if (enumC9955f0M33031q == null) {
            enumC9955f0M33031q = m33030p(tannotationM37646a);
        }
        if (enumC9955f0M33031q.m33094q() || (c10059iM33025g = m33025g(tannotationM37646a, b.f37785f)) == null) {
            return null;
        }
        return new C10071q(C10059i.m33699b(c10059iM33025g, null, enumC9955f0M33031q.m33095u(), 1, null), setM37647b, false, 4, null);
    }

    /* renamed from: g */
    private final C10059i m33025g(TAnnotation tannotation, Function1<? super TAnnotation, Boolean> function1) {
        C10059i c10059iM33028n;
        C10059i c10059iM33028n2 = m33028n(tannotation, function1.invoke(tannotation).booleanValue());
        if (c10059iM33028n2 != null) {
            return c10059iM33028n2;
        }
        TAnnotation tannotationM33042s = m33042s(tannotation);
        if (tannotationM33042s == null) {
            return null;
        }
        EnumC9955f0 enumC9955f0M33030p = m33030p(tannotation);
        if (enumC9955f0M33030p.m33094q() || (c10059iM33028n = m33028n(tannotationM33042s, function1.invoke(tannotationM33042s).booleanValue())) == null) {
            return null;
        }
        return C10059i.m33699b(c10059iM33028n, null, enumC9955f0M33030p.m33095u(), 1, null);
    }

    /* renamed from: h */
    private final TAnnotation m33026h(TAnnotation tannotation, C10160c c10160c) {
        for (TAnnotation tannotation2 : mo33040k(tannotation)) {
            if (C9801m.m32341a(mo33038i(tannotation2), c10160c)) {
                return tannotation2;
            }
        }
        return null;
    }

    /* renamed from: l */
    private final boolean m33027l(TAnnotation tannotation, C10160c c10160c) {
        Iterable<TAnnotation> iterableMo33040k = mo33040k(tannotation);
        if ((iterableMo33040k instanceof Collection) && ((Collection) iterableMo33040k).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = iterableMo33040k.iterator();
        while (it.hasNext()) {
            if (C9801m.m32341a(mo33038i(it.next()), c10160c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (r6.equals("NEVER") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        if (r6.equals("MAYBE") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
    
        r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10058h.NULLABLE;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10059i m33028n(TAnnotation r6, boolean r7) {
        /*
            r5 = this;
            kotlin.f0.y.e.j0.f.c r0 = r5.mo33038i(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            kotlin.f0.y.e.j0.d.a.w r2 = r5.f37783c
            kotlin.a0.c.l r2 = r2.m33818c()
            java.lang.Object r2 = r2.invoke(r0)
            kotlin.f0.y.e.j0.d.a.f0 r2 = (kotlin.reflect.p371y.internal.p374j0.p380d.p381a.EnumC9955f0) r2
            boolean r3 = r2.m33094q()
            if (r3 == 0) goto L1b
            return r1
        L1b:
            java.util.List r3 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9947b0.m33057l()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L2a
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10058h.NULLABLE
            goto Ld3
        L2a:
            java.util.List r3 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9947b0.m33056k()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L38
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10058h.NOT_NULL
            goto Ld3
        L38:
            kotlin.f0.y.e.j0.f.c r3 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9947b0.m33052g()
            boolean r3 = kotlin.jvm.internal.C9801m.m32341a(r0, r3)
            if (r3 == 0) goto L46
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10058h.NULLABLE
            goto Ld3
        L46:
            kotlin.f0.y.e.j0.f.c r3 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9947b0.m33053h()
            boolean r3 = kotlin.jvm.internal.C9801m.m32341a(r0, r3)
            if (r3 == 0) goto L54
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10058h.FORCE_FLEXIBILITY
            goto Ld3
        L54:
            kotlin.f0.y.e.j0.f.c r3 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9947b0.m33051f()
            boolean r3 = kotlin.jvm.internal.C9801m.m32341a(r0, r3)
            if (r3 == 0) goto La0
            java.lang.Iterable r6 = r5.mo33034b(r6, r4)
            java.lang.Object r6 = kotlin.collections.C10813s.m38831V(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L9d
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L90;
                case 74175084: goto L87;
                case 433141802: goto L7b;
                case 1933739535: goto L72;
                default: goto L71;
            }
        L71:
            goto L9c
        L72:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L9c
            goto L9d
        L7b:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L84
            goto L9c
        L84:
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10058h.FORCE_FLEXIBILITY
            goto Ld3
        L87:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L99
            goto L9c
        L90:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L99
            goto L9c
        L99:
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10058h.NULLABLE
            goto Ld3
        L9c:
            return r1
        L9d:
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10058h.NOT_NULL
            goto Ld3
        La0:
            kotlin.f0.y.e.j0.f.c r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9947b0.m33049d()
            boolean r6 = kotlin.jvm.internal.C9801m.m32341a(r0, r6)
            if (r6 == 0) goto Lad
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10058h.NULLABLE
            goto Ld3
        Lad:
            kotlin.f0.y.e.j0.f.c r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9947b0.m33048c()
            boolean r6 = kotlin.jvm.internal.C9801m.m32341a(r0, r6)
            if (r6 == 0) goto Lba
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10058h.NOT_NULL
            goto Ld3
        Lba:
            kotlin.f0.y.e.j0.f.c r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9947b0.m33046a()
            boolean r6 = kotlin.jvm.internal.C9801m.m32341a(r0, r6)
            if (r6 == 0) goto Lc7
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10058h.NOT_NULL
            goto Ld3
        Lc7:
            kotlin.f0.y.e.j0.f.c r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9947b0.m33047b()
            boolean r6 = kotlin.jvm.internal.C9801m.m32341a(r0, r6)
            if (r6 == 0) goto Le2
            kotlin.f0.y.e.j0.d.a.o0.h r6 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10058h.NULLABLE
        Ld3:
            kotlin.f0.y.e.j0.d.a.o0.i r0 = new kotlin.f0.y.e.j0.d.a.o0.i
            boolean r1 = r2.m33095u()
            if (r1 != 0) goto Ldd
            if (r7 == 0) goto Lde
        Ldd:
            r4 = 1
        Lde:
            r0.<init>(r6, r4)
            return r0
        Le2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.AbstractC9944a.m33028n(java.lang.Object, boolean):kotlin.f0.y.e.j0.d.a.o0.i");
    }

    /* renamed from: o */
    private final EnumC9955f0 m33029o(TAnnotation tannotation) {
        C10160c c10160cMo33038i = mo33038i(tannotation);
        return (c10160cMo33038i == null || !C9948c.m33061c().containsKey(c10160cMo33038i)) ? m33030p(tannotation) : this.f37783c.m33818c().invoke(c10160cMo33038i);
    }

    /* renamed from: p */
    private final EnumC9955f0 m33030p(TAnnotation tannotation) {
        EnumC9955f0 enumC9955f0M33031q = m33031q(tannotation);
        return enumC9955f0M33031q != null ? enumC9955f0M33031q : this.f37783c.m33819d().m33824a();
    }

    /* renamed from: q */
    private final EnumC9955f0 m33031q(TAnnotation tannotation) {
        Iterable<String> iterableMo33034b;
        String str;
        EnumC9955f0 enumC9955f0 = this.f37783c.m33819d().m33826c().get(mo33038i(tannotation));
        if (enumC9955f0 != null) {
            return enumC9955f0;
        }
        TAnnotation tannotationM33026h = m33026h(tannotation, C9948c.m33062d());
        if (tannotationM33026h == null || (iterableMo33034b = mo33034b(tannotationM33026h, false)) == null || (str = (String) C10813s.m38831V(iterableMo33034b)) == null) {
            return null;
        }
        EnumC9955f0 enumC9955f0M33825b = this.f37783c.m33819d().m33825b();
        if (enumC9955f0M33825b != null) {
            return enumC9955f0M33825b;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return EnumC9955f0.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return EnumC9955f0.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return EnumC9955f0.WARN;
        }
        return null;
    }

    /* renamed from: r */
    private final C10071q m33032r(TAnnotation tannotation) {
        C10071q c10071q;
        if (this.f37783c.m33817b() || (c10071q = C9948c.m33059a().get(mo33038i(tannotation))) == null) {
            return null;
        }
        EnumC9955f0 enumC9955f0M33029o = m33029o(tannotation);
        if (!(enumC9955f0M33029o != EnumC9955f0.IGNORE)) {
            enumC9955f0M33029o = null;
        }
        if (enumC9955f0M33029o == null) {
            return null;
        }
        return C10071q.m33783b(c10071q, C10059i.m33699b(c10071q.m33786d(), null, enumC9955f0M33029o.m33095u(), 1, null), null, false, 6, null);
    }

    /* renamed from: t */
    private final Pair<TAnnotation, Set<EnumC9946b>> m33033t(TAnnotation tannotation) {
        TAnnotation tannotationM33026h;
        TAnnotation next;
        if (this.f37783c.m33819d().m33827d() || (tannotationM33026h = m33026h(tannotation, C9948c.m33063e())) == null) {
            return null;
        }
        Iterator<TAnnotation> it = mo33040k(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (m33042s(next) != null) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        Iterable<String> iterableMo33034b = mo33034b(tannotationM33026h, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it2 = iterableMo33034b.iterator();
        while (it2.hasNext()) {
            EnumC9946b enumC9946b = f37782b.get(it2.next());
            if (enumC9946b != null) {
                linkedHashSet.add(enumC9946b);
            }
        }
        return new Pair<>(next, m33023a(linkedHashSet));
    }

    /* renamed from: b */
    protected abstract Iterable<String> mo33034b(TAnnotation tannotation, boolean z);

    /* renamed from: c */
    public final C10078x m33035c(C10078x c10078x, Iterable<? extends TAnnotation> iterable) {
        EnumMap<EnumC9946b, C10071q> enumMapM33823b;
        C9801m.m32346f(iterable, "annotations");
        if (this.f37783c.m33817b()) {
            return c10078x;
        }
        ArrayList<C10071q> arrayList = new ArrayList();
        Iterator<? extends TAnnotation> it = iterable.iterator();
        while (it.hasNext()) {
            C10071q c10071qM33024d = m33024d(it.next());
            if (c10071qM33024d != null) {
                arrayList.add(c10071qM33024d);
            }
        }
        if (arrayList.isEmpty()) {
            return c10078x;
        }
        EnumMap enumMap = (c10078x == null || (enumMapM33823b = c10078x.m33823b()) == null) ? new EnumMap(EnumC9946b.class) : new EnumMap((EnumMap) enumMapM33823b);
        boolean z = false;
        for (C10071q c10071q : arrayList) {
            Iterator<EnumC9946b> it2 = c10071q.m33787e().iterator();
            while (it2.hasNext()) {
                enumMap.put((EnumMap) it2.next(), (EnumC9946b) c10071q);
                z = true;
            }
        }
        return !z ? c10078x : new C10078x(enumMap);
    }

    /* renamed from: e */
    public final EnumC10056f m33036e(Iterable<? extends TAnnotation> iterable) {
        EnumC10056f enumC10056f;
        C9801m.m32346f(iterable, "annotations");
        Iterator<? extends TAnnotation> it = iterable.iterator();
        EnumC10056f enumC10056f2 = null;
        while (it.hasNext()) {
            C10160c c10160cMo33038i = mo33038i(it.next());
            if (C9947b0.m33058m().contains(c10160cMo33038i)) {
                enumC10056f = EnumC10056f.READ_ONLY;
            } else if (C9947b0.m33055j().contains(c10160cMo33038i)) {
                enumC10056f = EnumC10056f.MUTABLE;
            } else {
                continue;
            }
            if (enumC10056f2 != null && enumC10056f2 != enumC10056f) {
                return null;
            }
            enumC10056f2 = enumC10056f;
        }
        return enumC10056f2;
    }

    /* renamed from: f */
    public final C10059i m33037f(Iterable<? extends TAnnotation> iterable, Function1<? super TAnnotation, Boolean> function1) {
        C9801m.m32346f(iterable, "annotations");
        C9801m.m32346f(function1, "forceWarning");
        Iterator<? extends TAnnotation> it = iterable.iterator();
        C10059i c10059i = null;
        while (it.hasNext()) {
            C10059i c10059iM33025g = m33025g(it.next(), function1);
            if (c10059i != null) {
                if (c10059iM33025g != null && !C9801m.m32341a(c10059iM33025g, c10059i) && (!c10059iM33025g.m33702d() || c10059i.m33702d())) {
                    if (c10059iM33025g.m33702d() || !c10059i.m33702d()) {
                        return null;
                    }
                }
            }
            c10059i = c10059iM33025g;
        }
        return c10059i;
    }

    /* renamed from: i */
    protected abstract C10160c mo33038i(TAnnotation tannotation);

    /* renamed from: j */
    protected abstract Object mo33039j(TAnnotation tannotation);

    /* renamed from: k */
    protected abstract Iterable<TAnnotation> mo33040k(TAnnotation tannotation);

    /* renamed from: m */
    public final boolean m33041m(TAnnotation tannotation) {
        C9801m.m32346f(tannotation, "annotation");
        TAnnotation tannotationM33026h = m33026h(tannotation, C9917k.a.f37538H);
        if (tannotationM33026h == null) {
            return false;
        }
        Iterable<String> iterableMo33034b = mo33034b(tannotationM33026h, false);
        if ((iterableMo33034b instanceof Collection) && ((Collection) iterableMo33034b).isEmpty()) {
            return false;
        }
        Iterator<String> it = iterableMo33034b.iterator();
        while (it.hasNext()) {
            if (C9801m.m32341a(it.next(), EnumC10627n.f40834H.name())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public final TAnnotation m33042s(TAnnotation tannotation) {
        TAnnotation tannotationM33042s;
        C9801m.m32346f(tannotation, "annotation");
        if (this.f37783c.m33819d().m33827d()) {
            return null;
        }
        if (C10782c0.m38577K(C9948c.m33060b(), mo33038i(tannotation)) || m33027l(tannotation, C9948c.m33064f())) {
            return tannotation;
        }
        if (!m33027l(tannotation, C9948c.m33065g())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f37784d;
        Object objMo33039j = mo33039j(tannotation);
        TAnnotation tannotation2 = concurrentHashMap.get(objMo33039j);
        if (tannotation2 != null) {
            return tannotation2;
        }
        Iterator<TAnnotation> it = mo33040k(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotationM33042s = null;
                break;
            }
            tannotationM33042s = m33042s(it.next());
            if (tannotationM33042s != null) {
                break;
            }
        }
        if (tannotationM33042s == null) {
            return null;
        }
        TAnnotation tannotationPutIfAbsent = concurrentHashMap.putIfAbsent(objMo33039j, tannotationM33042s);
        return tannotationPutIfAbsent == null ? tannotationM33042s : tannotationPutIfAbsent;
    }
}
