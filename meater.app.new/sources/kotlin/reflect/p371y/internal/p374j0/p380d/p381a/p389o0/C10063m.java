package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10773s;
import kotlin.C10775u;
import kotlin.Pair;
import kotlin.collections.C10803n;
import kotlin.collections.C10808p0;
import kotlin.collections.C10819v;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.C9848l;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10108x;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.EnumC10240e;

/* compiled from: predefinedEnhancementInfo.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.m */
/* loaded from: classes3.dex */
final class C10063m {

    /* renamed from: a */
    private final Map<String, C10061k> f38278a = new LinkedHashMap();

    /* compiled from: predefinedEnhancementInfo.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o0.m$a */
    public final class a {

        /* renamed from: a */
        private final String f38279a;

        /* renamed from: b */
        final /* synthetic */ C10063m f38280b;

        /* compiled from: predefinedEnhancementInfo.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.a.o0.m$a$a, reason: collision with other inner class name */
        public final class C11546a {

            /* renamed from: a */
            private final String f38281a;

            /* renamed from: b */
            private final List<Pair<String, C10067q>> f38282b;

            /* renamed from: c */
            private Pair<String, C10067q> f38283c;

            /* renamed from: d */
            final /* synthetic */ a f38284d;

            public C11546a(a aVar, String str) {
                C9801m.m32346f(str, "functionName");
                this.f38284d = aVar;
                this.f38281a = str;
                this.f38282b = new ArrayList();
                this.f38283c = C10773s.m38547a("V", null);
            }

            /* renamed from: a */
            public final Pair<String, C10061k> m33757a() {
                C10108x c10108x = C10108x.f38488a;
                String strM33756b = this.f38284d.m33756b();
                String str = this.f38281a;
                List<Pair<String, C10067q>> list = this.f38282b;
                ArrayList arrayList = new ArrayList(C10819v.m38911u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).m37648c());
                }
                String strM34055k = c10108x.m34055k(strM33756b, c10108x.m34054j(str, arrayList, this.f38283c.m37648c()));
                C10067q c10067qM37649d = this.f38283c.m37649d();
                List<Pair<String, C10067q>> list2 = this.f38282b;
                ArrayList arrayList2 = new ArrayList(C10819v.m38911u(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((C10067q) ((Pair) it2.next()).m37649d());
                }
                return C10773s.m38547a(strM34055k, new C10061k(c10067qM37649d, arrayList2));
            }

            /* renamed from: b */
            public final void m33758b(String str, C10055e... c10055eArr) {
                C10067q c10067q;
                C9801m.m32346f(str, "type");
                C9801m.m32346f(c10055eArr, "qualifiers");
                List<Pair<String, C10067q>> list = this.f38282b;
                if (c10055eArr.length == 0) {
                    c10067q = null;
                } else {
                    Iterable<IndexedValue> iterableM38759m0 = C10803n.m38759m0(c10055eArr);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C9848l.m32419b(C10808p0.m38793e(C10819v.m38911u(iterableM38759m0, 10)), 16));
                    for (IndexedValue indexedValue : iterableM38759m0) {
                        linkedHashMap.put(Integer.valueOf(indexedValue.m38649c()), (C10055e) indexedValue.m38650d());
                    }
                    c10067q = new C10067q(linkedHashMap);
                }
                list.add(C10773s.m38547a(str, c10067q));
            }

            /* renamed from: c */
            public final void m33759c(String str, C10055e... c10055eArr) {
                C9801m.m32346f(str, "type");
                C9801m.m32346f(c10055eArr, "qualifiers");
                Iterable<IndexedValue> iterableM38759m0 = C10803n.m38759m0(c10055eArr);
                LinkedHashMap linkedHashMap = new LinkedHashMap(C9848l.m32419b(C10808p0.m38793e(C10819v.m38911u(iterableM38759m0, 10)), 16));
                for (IndexedValue indexedValue : iterableM38759m0) {
                    linkedHashMap.put(Integer.valueOf(indexedValue.m38649c()), (C10055e) indexedValue.m38650d());
                }
                this.f38283c = C10773s.m38547a(str, new C10067q(linkedHashMap));
            }

            /* renamed from: d */
            public final void m33760d(EnumC10240e enumC10240e) {
                C9801m.m32346f(enumC10240e, "type");
                String strM36116u = enumC10240e.m36116u();
                C9801m.m32345e(strM36116u, "type.desc");
                this.f38283c = C10773s.m38547a(strM36116u, null);
            }
        }

        public a(C10063m c10063m, String str) {
            C9801m.m32346f(str, "className");
            this.f38280b = c10063m;
            this.f38279a = str;
        }

        /* renamed from: a */
        public final void m33755a(String str, Function1<? super C11546a, C10775u> function1) {
            C9801m.m32346f(str, "name");
            C9801m.m32346f(function1, "block");
            Map map = this.f38280b.f38278a;
            C11546a c11546a = new C11546a(this, str);
            function1.invoke(c11546a);
            Pair<String, C10061k> pairM33757a = c11546a.m33757a();
            map.put(pairM33757a.m37648c(), pairM33757a.m37649d());
        }

        /* renamed from: b */
        public final String m33756b() {
            return this.f38279a;
        }
    }

    /* renamed from: b */
    public final Map<String, C10061k> m33754b() {
        return this.f38278a;
    }
}
