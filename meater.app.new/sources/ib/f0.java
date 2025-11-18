package ib;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jb.C3762F;
import kotlin.collections.C3831l;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4170o;
import yb.EnumC5149e;

/* compiled from: predefinedEnhancementInfo.kt */
/* loaded from: classes3.dex */
final class f0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, C3665Y> f43241a = new LinkedHashMap();

    /* compiled from: predefinedEnhancementInfo.kt */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f43242a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f43243b;

        /* compiled from: predefinedEnhancementInfo.kt */
        /* renamed from: ib.f0$a$a, reason: collision with other inner class name */
        public final class C0551a {

            /* renamed from: a, reason: collision with root package name */
            private final String f43244a;

            /* renamed from: b, reason: collision with root package name */
            private final String f43245b;

            /* renamed from: c, reason: collision with root package name */
            private final List<C4170o<String, j0>> f43246c;

            /* renamed from: d, reason: collision with root package name */
            private C4170o<String, j0> f43247d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f43248e;

            public C0551a(a aVar, String functionName, String str) {
                C3862t.g(functionName, "functionName");
                this.f43248e = aVar;
                this.f43244a = functionName;
                this.f43245b = str;
                this.f43246c = new ArrayList();
                this.f43247d = oa.v.a("V", null);
            }

            public final C4170o<String, C3665Y> a() {
                C3762F c3762f = C3762F.f43573a;
                String strC = this.f43248e.c();
                String str = this.f43244a;
                List<C4170o<String, j0>> list = this.f43246c;
                ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((C4170o) it.next()).c());
                }
                String strL = c3762f.l(strC, c3762f.j(str, arrayList, this.f43247d.c()));
                j0 j0VarD = this.f43247d.d();
                List<C4170o<String, j0>> list2 = this.f43246c;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((j0) ((C4170o) it2.next()).d());
                }
                return oa.v.a(strL, new C3665Y(j0VarD, arrayList2, this.f43245b));
            }

            public final void b(String type, C3674h... qualifiers) {
                j0 j0Var;
                C3862t.g(type, "type");
                C3862t.g(qualifiers, "qualifiers");
                List<C4170o<String, j0>> list = this.f43246c;
                if (qualifiers.length == 0) {
                    j0Var = null;
                } else {
                    Iterable<IndexedValue> iterableV0 = C3831l.V0(qualifiers);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(Ha.g.d(kotlin.collections.M.d(kotlin.collections.r.x(iterableV0, 10)), 16));
                    for (IndexedValue indexedValue : iterableV0) {
                        linkedHashMap.put(Integer.valueOf(indexedValue.c()), (C3674h) indexedValue.d());
                    }
                    j0Var = new j0(linkedHashMap);
                }
                list.add(oa.v.a(type, j0Var));
            }

            public final void c(String type, C3674h... qualifiers) {
                C3862t.g(type, "type");
                C3862t.g(qualifiers, "qualifiers");
                Iterable<IndexedValue> iterableV0 = C3831l.V0(qualifiers);
                LinkedHashMap linkedHashMap = new LinkedHashMap(Ha.g.d(kotlin.collections.M.d(kotlin.collections.r.x(iterableV0, 10)), 16));
                for (IndexedValue indexedValue : iterableV0) {
                    linkedHashMap.put(Integer.valueOf(indexedValue.c()), (C3674h) indexedValue.d());
                }
                this.f43247d = oa.v.a(type, new j0(linkedHashMap));
            }

            public final void d(EnumC5149e type) {
                C3862t.g(type, "type");
                String strP = type.p();
                C3862t.f(strP, "getDesc(...)");
                this.f43247d = oa.v.a(strP, null);
            }
        }

        public a(f0 f0Var, String className) {
            C3862t.g(className, "className");
            this.f43243b = f0Var;
            this.f43242a = className;
        }

        public static /* synthetic */ void b(a aVar, String str, String str2, Ba.l lVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            aVar.a(str, str2, lVar);
        }

        public final void a(String name, String str, Ba.l<? super C0551a, C4153F> block) {
            C3862t.g(name, "name");
            C3862t.g(block, "block");
            Map map = this.f43243b.f43241a;
            C0551a c0551a = new C0551a(this, name, str);
            block.invoke(c0551a);
            C4170o<String, C3665Y> c4170oA = c0551a.a();
            map.put(c4170oA.c(), c4170oA.d());
        }

        public final String c() {
            return this.f43242a;
        }
    }

    public final Map<String, C3665Y> b() {
        return this.f43241a;
    }
}
