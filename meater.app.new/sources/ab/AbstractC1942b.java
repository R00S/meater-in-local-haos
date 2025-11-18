package ab;

import Oa.p;
import ib.C3678l;
import ib.EnumC3675i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;

/* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
/* renamed from: ab.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1942b<TAnnotation> {

    /* renamed from: c, reason: collision with root package name */
    private static final a f20238c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, EnumC1943c> f20239d;

    /* renamed from: a, reason: collision with root package name */
    private final C1923D f20240a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<Object, TAnnotation> f20241b;

    /* compiled from: AbstractAnnotationTypeQualifierResolver.kt */
    /* renamed from: ab.b$a */
    private static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC1943c enumC1943c : EnumC1943c.values()) {
            String strJ = enumC1943c.j();
            if (linkedHashMap.get(strJ) == null) {
                linkedHashMap.put(strJ, enumC1943c);
            }
        }
        f20239d = linkedHashMap;
    }

    public AbstractC1942b(C1923D javaTypeEnhancementState) {
        C3862t.g(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f20240a = javaTypeEnhancementState;
        this.f20241b = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Set<EnumC1943c> b(Set<? extends EnumC1943c> set) {
        return set.contains(EnumC1943c.f20245F) ? kotlin.collections.V.j(kotlin.collections.V.i(C3831l.U0(EnumC1943c.values()), EnumC1943c.f20246G), set) : set;
    }

    private final C1963w e(TAnnotation tannotation) {
        C3678l c3678lI;
        C1963w c1963wU = u(tannotation);
        if (c1963wU != null) {
            return c1963wU;
        }
        C4170o<TAnnotation, Set<EnumC1943c>> c4170oW = w(tannotation);
        if (c4170oW == null) {
            return null;
        }
        TAnnotation tannotationA = c4170oW.a();
        Set<EnumC1943c> setB = c4170oW.b();
        EnumC1934O enumC1934OT = t(tannotation);
        if (enumC1934OT == null) {
            enumC1934OT = s(tannotationA);
        }
        if (enumC1934OT.n() || (c3678lI = i(tannotationA, C1941a.f20237B)) == null) {
            return null;
        }
        return new C1963w(C3678l.b(c3678lI, null, enumC1934OT.p(), 1, null), setB, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object extractNullability) {
        C3862t.g(extractNullability, "$this$extractNullability");
        return false;
    }

    private final C3678l i(TAnnotation tannotation, Ba.l<? super TAnnotation, Boolean> lVar) {
        C3678l c3678lQ;
        C3678l c3678lQ2 = q(tannotation, lVar.invoke(tannotation).booleanValue());
        if (c3678lQ2 != null) {
            return c3678lQ2;
        }
        TAnnotation tannotationV = v(tannotation);
        if (tannotationV == null) {
            return null;
        }
        EnumC1934O enumC1934OS = s(tannotation);
        if (enumC1934OS.n() || (c3678lQ = q(tannotationV, lVar.invoke(tannotationV).booleanValue())) == null) {
            return null;
        }
        return C3678l.b(c3678lQ, null, enumC1934OS.p(), 1, null);
    }

    private final TAnnotation j(TAnnotation tannotation, qb.c cVar) {
        for (TAnnotation tannotation2 : m(tannotation)) {
            if (C3862t.b(k(tannotation2), cVar)) {
                return tannotation2;
            }
        }
        return null;
    }

    private final boolean n(TAnnotation tannotation, qb.c cVar) {
        Iterable<TAnnotation> iterableM = m(tannotation);
        if ((iterableM instanceof Collection) && ((Collection) iterableM).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = iterableM.iterator();
        while (it.hasNext()) {
            if (C3862t.b(k(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r6.equals("NEVER") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r6.equals("MAYBE") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r6 = ib.EnumC3677k.f43278C;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final ib.C3678l q(TAnnotation r6, boolean r7) {
        /*
            r5 = this;
            qb.c r0 = r5.k(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            ab.D r2 = r5.f20240a
            Ba.l r2 = r2.c()
            java.lang.Object r2 = r2.invoke(r0)
            ab.O r2 = (ab.EnumC1934O) r2
            boolean r3 = r2.n()
            if (r3 == 0) goto L1b
            return r1
        L1b:
            java.util.Set r3 = ab.C1929J.m()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L29
            ib.k r6 = ib.EnumC3677k.f43279D
            goto L8d
        L29:
            java.util.Set r3 = ab.C1929J.n()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L36
            ib.k r6 = ib.EnumC3677k.f43278C
            goto L8d
        L36:
            java.util.Set r3 = ab.C1929J.b()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L43
            ib.k r6 = ib.EnumC3677k.f43277B
            goto L8d
        L43:
            qb.c r3 = ab.C1929J.c()
            boolean r0 = kotlin.jvm.internal.C3862t.b(r0, r3)
            if (r0 == 0) goto L9c
            java.lang.Iterable r6 = r5.c(r6, r4)
            java.lang.Object r6 = kotlin.collections.r.k0(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L8b
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L7f;
                case 74175084: goto L76;
                case 433141802: goto L6a;
                case 1933739535: goto L61;
                default: goto L60;
            }
        L60:
            goto L87
        L61:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L87
            goto L8b
        L6a:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L73
            goto L87
        L73:
            ib.k r6 = ib.EnumC3677k.f43277B
            goto L8d
        L76:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
            goto L87
        L7f:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
        L87:
            return r1
        L88:
            ib.k r6 = ib.EnumC3677k.f43278C
            goto L8d
        L8b:
            ib.k r6 = ib.EnumC3677k.f43279D
        L8d:
            ib.l r0 = new ib.l
            boolean r1 = r2.p()
            if (r1 != 0) goto L97
            if (r7 == 0) goto L98
        L97:
            r4 = 1
        L98:
            r0.<init>(r6, r4)
            return r0
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.AbstractC1942b.q(java.lang.Object, boolean):ib.l");
    }

    private final EnumC1934O r(TAnnotation tannotation) {
        qb.c cVarK = k(tannotation);
        return (cVarK == null || !C1964x.b().containsKey(cVarK)) ? s(tannotation) : this.f20240a.c().invoke(cVarK);
    }

    private final EnumC1934O s(TAnnotation tannotation) {
        EnumC1934O enumC1934OT = t(tannotation);
        return enumC1934OT != null ? enumC1934OT : this.f20240a.d().c();
    }

    private final EnumC1934O t(TAnnotation tannotation) {
        Iterable<String> iterableC;
        String str;
        EnumC1934O enumC1934O = this.f20240a.d().e().get(k(tannotation));
        if (enumC1934O != null) {
            return enumC1934O;
        }
        TAnnotation tannotationJ = j(tannotation, C1929J.p());
        if (tannotationJ == null || (iterableC = c(tannotationJ, false)) == null || (str = (String) kotlin.collections.r.k0(iterableC)) == null) {
            return null;
        }
        EnumC1934O enumC1934OD = this.f20240a.d().d();
        if (enumC1934OD != null) {
            return enumC1934OD;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return EnumC1934O.f20195D;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return EnumC1934O.f20197F;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return EnumC1934O.f20196E;
        }
        return null;
    }

    private final C1963w u(TAnnotation tannotation) {
        C1963w c1963w;
        if (this.f20240a.b() || (c1963w = C1964x.a().get(k(tannotation))) == null) {
            return null;
        }
        EnumC1934O enumC1934OR = r(tannotation);
        if (enumC1934OR == EnumC1934O.f20195D) {
            enumC1934OR = null;
        }
        if (enumC1934OR == null) {
            return null;
        }
        return C1963w.b(c1963w, C3678l.b(c1963w.d(), null, enumC1934OR.p(), 1, null), null, false, 6, null);
    }

    private final C4170o<TAnnotation, Set<EnumC1943c>> w(TAnnotation tannotation) {
        TAnnotation tannotationJ;
        TAnnotation next;
        if (this.f20240a.d().f() || (tannotationJ = j(tannotation, C1929J.g())) == null) {
            return null;
        }
        Iterator<TAnnotation> it = m(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (v(next) != null) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        Iterable<String> iterableC = c(tannotationJ, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it2 = iterableC.iterator();
        while (it2.hasNext()) {
            EnumC1943c enumC1943c = f20239d.get(it2.next());
            if (enumC1943c != null) {
                linkedHashSet.add(enumC1943c);
            }
        }
        return new C4170o<>(next, b(linkedHashSet));
    }

    protected abstract Iterable<String> c(TAnnotation tannotation, boolean z10);

    public final C1924E d(C1924E c1924e, Iterable<? extends TAnnotation> annotations) {
        EnumMap<EnumC1943c, C1963w> enumMapB;
        C3862t.g(annotations, "annotations");
        if (this.f20240a.b()) {
            return c1924e;
        }
        ArrayList<C1963w> arrayList = new ArrayList();
        Iterator<? extends TAnnotation> it = annotations.iterator();
        while (it.hasNext()) {
            C1963w c1963wE = e(it.next());
            if (c1963wE != null) {
                arrayList.add(c1963wE);
            }
        }
        if (arrayList.isEmpty()) {
            return c1924e;
        }
        EnumMap enumMap = new EnumMap(EnumC1943c.class);
        for (C1963w c1963w : arrayList) {
            for (EnumC1943c enumC1943c : c1963w.e()) {
                if (enumMap.containsKey(enumC1943c) && o()) {
                    C1963w c1963w2 = (C1963w) enumMap.get(enumC1943c);
                    if (c1963w2 != null) {
                        C3678l c3678lD = c1963w2.d();
                        C3678l c3678lD2 = c1963w.d();
                        if (!C3862t.b(c3678lD2, c3678lD) && (!c3678lD2.d() || c3678lD.d())) {
                            c1963w2 = (c3678lD2.d() || !c3678lD.d()) ? null : c1963w;
                        }
                        enumMap.put((EnumMap) enumC1943c, (EnumC1943c) c1963w2);
                    }
                } else {
                    enumMap.put((EnumMap) enumC1943c, (EnumC1943c) c1963w);
                }
            }
        }
        EnumMap enumMap2 = (c1924e == null || (enumMapB = c1924e.b()) == null) ? new EnumMap(EnumC1943c.class) : new EnumMap((EnumMap) enumMapB);
        boolean z10 = false;
        for (Map.Entry entry : enumMap.entrySet()) {
            EnumC1943c enumC1943c2 = (EnumC1943c) entry.getKey();
            C1963w c1963w3 = (C1963w) entry.getValue();
            if (c1963w3 != null) {
                enumMap2.put((EnumMap) enumC1943c2, (EnumC1943c) c1963w3);
                z10 = true;
            }
        }
        return !z10 ? c1924e : new C1924E(enumMap2);
    }

    public final EnumC3675i g(Iterable<? extends TAnnotation> annotations) {
        EnumC3675i enumC3675i;
        C3862t.g(annotations, "annotations");
        Iterator<? extends TAnnotation> it = annotations.iterator();
        EnumC3675i enumC3675i2 = null;
        while (it.hasNext()) {
            qb.c cVarK = k(it.next());
            if (kotlin.collections.r.a0(C1929J.o(), cVarK)) {
                enumC3675i = EnumC3675i.f43271B;
            } else if (kotlin.collections.r.a0(C1929J.l(), cVarK)) {
                enumC3675i = EnumC3675i.f43272C;
            } else {
                continue;
            }
            if (enumC3675i2 != null && enumC3675i2 != enumC3675i) {
                return null;
            }
            enumC3675i2 = enumC3675i;
        }
        return enumC3675i2;
    }

    public final C3678l h(Iterable<? extends TAnnotation> annotations, Ba.l<? super TAnnotation, Boolean> forceWarning) {
        C3862t.g(annotations, "annotations");
        C3862t.g(forceWarning, "forceWarning");
        Iterator<? extends TAnnotation> it = annotations.iterator();
        C3678l c3678l = null;
        while (it.hasNext()) {
            C3678l c3678lI = i(it.next(), forceWarning);
            if (c3678l != null) {
                if (c3678lI != null && !C3862t.b(c3678lI, c3678l) && (!c3678lI.d() || c3678l.d())) {
                    if (c3678lI.d() || !c3678l.d()) {
                        return null;
                    }
                }
            }
            c3678l = c3678lI;
        }
        return c3678l;
    }

    protected abstract qb.c k(TAnnotation tannotation);

    protected abstract Object l(TAnnotation tannotation);

    protected abstract Iterable<TAnnotation> m(TAnnotation tannotation);

    public abstract boolean o();

    public final boolean p(TAnnotation annotation) {
        C3862t.g(annotation, "annotation");
        TAnnotation tannotationJ = j(annotation, p.a.f13414H);
        if (tannotationJ == null) {
            return false;
        }
        Iterable<String> iterableC = c(tannotationJ, false);
        if ((iterableC instanceof Collection) && ((Collection) iterableC).isEmpty()) {
            return false;
        }
        Iterator<String> it = iterableC.iterator();
        while (it.hasNext()) {
            if (C3862t.b(it.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    public final TAnnotation v(TAnnotation annotation) {
        TAnnotation tannotationV;
        C3862t.g(annotation, "annotation");
        if (this.f20240a.d().f()) {
            return null;
        }
        if (kotlin.collections.r.a0(C1929J.a(), k(annotation)) || n(annotation, C1929J.f())) {
            return annotation;
        }
        if (!n(annotation, C1929J.h())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f20241b;
        Object objL = l(annotation);
        TAnnotation tannotation = concurrentHashMap.get(objL);
        if (tannotation != null) {
            return tannotation;
        }
        Iterator<TAnnotation> it = m(annotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotationV = null;
                break;
            }
            tannotationV = v(it.next());
            if (tannotationV != null) {
                break;
            }
        }
        if (tannotationV == null) {
            return null;
        }
        TAnnotation tannotationPutIfAbsent = concurrentHashMap.putIfAbsent(objL, tannotationV);
        return tannotationPutIfAbsent == null ? tannotationV : tannotationPutIfAbsent;
    }
}
