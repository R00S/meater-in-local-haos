package kotlin.reflect.p371y.internal.p374j0.p375b.p377q;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9909c;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p375b.EnumC9915i;
import kotlin.reflect.p371y.internal.p374j0.p375b.p376p.EnumC9924c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10161d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10162e;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10165h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10166i;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.EnumC10240e;
import kotlin.text.C10545t;
import kotlin.text.C10547v;
import okhttp3.HttpUrl;

/* compiled from: JavaToKotlinClassMap.kt */
/* renamed from: kotlin.f0.y.e.j0.b.q.c */
/* loaded from: classes2.dex */
public final class C9929c {

    /* renamed from: a */
    public static final C9929c f37667a;

    /* renamed from: b */
    private static final String f37668b;

    /* renamed from: c */
    private static final String f37669c;

    /* renamed from: d */
    private static final String f37670d;

    /* renamed from: e */
    private static final String f37671e;

    /* renamed from: f */
    private static final C10159b f37672f;

    /* renamed from: g */
    private static final C10160c f37673g;

    /* renamed from: h */
    private static final C10159b f37674h;

    /* renamed from: i */
    private static final C10159b f37675i;

    /* renamed from: j */
    private static final C10159b f37676j;

    /* renamed from: k */
    private static final HashMap<C10161d, C10159b> f37677k;

    /* renamed from: l */
    private static final HashMap<C10161d, C10159b> f37678l;

    /* renamed from: m */
    private static final HashMap<C10161d, C10160c> f37679m;

    /* renamed from: n */
    private static final HashMap<C10161d, C10160c> f37680n;

    /* renamed from: o */
    private static final HashMap<C10159b, C10159b> f37681o;

    /* renamed from: p */
    private static final HashMap<C10159b, C10159b> f37682p;

    /* renamed from: q */
    private static final List<a> f37683q;

    /* compiled from: JavaToKotlinClassMap.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.c$a */
    public static final class a {

        /* renamed from: a */
        private final C10159b f37684a;

        /* renamed from: b */
        private final C10159b f37685b;

        /* renamed from: c */
        private final C10159b f37686c;

        public a(C10159b c10159b, C10159b c10159b2, C10159b c10159b3) {
            C9801m.m32346f(c10159b, "javaClass");
            C9801m.m32346f(c10159b2, "kotlinReadOnly");
            C9801m.m32346f(c10159b3, "kotlinMutable");
            this.f37684a = c10159b;
            this.f37685b = c10159b2;
            this.f37686c = c10159b3;
        }

        /* renamed from: a */
        public final C10159b m32932a() {
            return this.f37684a;
        }

        /* renamed from: b */
        public final C10159b m32933b() {
            return this.f37685b;
        }

        /* renamed from: c */
        public final C10159b m32934c() {
            return this.f37686c;
        }

        /* renamed from: d */
        public final C10159b m32935d() {
            return this.f37684a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C9801m.m32341a(this.f37684a, aVar.f37684a) && C9801m.m32341a(this.f37685b, aVar.f37685b) && C9801m.m32341a(this.f37686c, aVar.f37686c);
        }

        public int hashCode() {
            return (((this.f37684a.hashCode() * 31) + this.f37685b.hashCode()) * 31) + this.f37686c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f37684a + ", kotlinReadOnly=" + this.f37685b + ", kotlinMutable=" + this.f37686c + ')';
        }
    }

    static {
        C9929c c9929c = new C9929c();
        f37667a = c9929c;
        StringBuilder sb = new StringBuilder();
        EnumC9924c enumC9924c = EnumC9924c.f37650g;
        sb.append(enumC9924c.m32895q().toString());
        sb.append('.');
        sb.append(enumC9924c.m32894k());
        f37668b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        EnumC9924c enumC9924c2 = EnumC9924c.f37652i;
        sb2.append(enumC9924c2.m32895q().toString());
        sb2.append('.');
        sb2.append(enumC9924c2.m32894k());
        f37669c = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        EnumC9924c enumC9924c3 = EnumC9924c.f37651h;
        sb3.append(enumC9924c3.m32895q().toString());
        sb3.append('.');
        sb3.append(enumC9924c3.m32894k());
        f37670d = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        EnumC9924c enumC9924c4 = EnumC9924c.f37653j;
        sb4.append(enumC9924c4.m32895q().toString());
        sb4.append('.');
        sb4.append(enumC9924c4.m32894k());
        f37671e = sb4.toString();
        C10159b c10159bM35408m = C10159b.m35408m(new C10160c("kotlin.jvm.functions.FunctionN"));
        C9801m.m32345e(c10159bM35408m, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))");
        f37672f = c10159bM35408m;
        C10160c c10160cM35409b = c10159bM35408m.m35409b();
        C9801m.m32345e(c10160cM35409b, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f37673g = c10160cM35409b;
        C10166i c10166i = C10166i.f39305a;
        f37674h = c10166i.m35470i();
        f37675i = c10166i.m35469h();
        f37676j = c9929c.m32922g(Class.class);
        f37677k = new HashMap<>();
        f37678l = new HashMap<>();
        f37679m = new HashMap<>();
        f37680n = new HashMap<>();
        f37681o = new HashMap<>();
        f37682p = new HashMap<>();
        C10159b c10159bM35408m2 = C10159b.m35408m(C9917k.a.f37553T);
        C9801m.m32345e(c10159bM35408m2, "topLevel(FqNames.iterable)");
        C10160c c10160c = C9917k.a.f37563b0;
        C10160c c10160cM35413h = c10159bM35408m2.m35413h();
        C10160c c10160cM35413h2 = c10159bM35408m2.m35413h();
        C9801m.m32345e(c10160cM35413h2, "kotlinReadOnly.packageFqName");
        C10160c c10160cM35449g = C10162e.m35449g(c10160c, c10160cM35413h2);
        C10159b c10159b = new C10159b(c10160cM35413h, c10160cM35449g, false);
        C10159b c10159bM35408m3 = C10159b.m35408m(C9917k.a.f37552S);
        C9801m.m32345e(c10159bM35408m3, "topLevel(FqNames.iterator)");
        C10160c c10160c2 = C9917k.a.f37561a0;
        C10160c c10160cM35413h3 = c10159bM35408m3.m35413h();
        C10160c c10160cM35413h4 = c10159bM35408m3.m35413h();
        C9801m.m32345e(c10160cM35413h4, "kotlinReadOnly.packageFqName");
        C10159b c10159b2 = new C10159b(c10160cM35413h3, C10162e.m35449g(c10160c2, c10160cM35413h4), false);
        C10159b c10159bM35408m4 = C10159b.m35408m(C9917k.a.f37554U);
        C9801m.m32345e(c10159bM35408m4, "topLevel(FqNames.collection)");
        C10160c c10160c3 = C9917k.a.f37565c0;
        C10160c c10160cM35413h5 = c10159bM35408m4.m35413h();
        C10160c c10160cM35413h6 = c10159bM35408m4.m35413h();
        C9801m.m32345e(c10160cM35413h6, "kotlinReadOnly.packageFqName");
        C10159b c10159b3 = new C10159b(c10160cM35413h5, C10162e.m35449g(c10160c3, c10160cM35413h6), false);
        C10159b c10159bM35408m5 = C10159b.m35408m(C9917k.a.f37555V);
        C9801m.m32345e(c10159bM35408m5, "topLevel(FqNames.list)");
        C10160c c10160c4 = C9917k.a.f37567d0;
        C10160c c10160cM35413h7 = c10159bM35408m5.m35413h();
        C10160c c10160cM35413h8 = c10159bM35408m5.m35413h();
        C9801m.m32345e(c10160cM35413h8, "kotlinReadOnly.packageFqName");
        C10159b c10159b4 = new C10159b(c10160cM35413h7, C10162e.m35449g(c10160c4, c10160cM35413h8), false);
        C10159b c10159bM35408m6 = C10159b.m35408m(C9917k.a.f37557X);
        C9801m.m32345e(c10159bM35408m6, "topLevel(FqNames.set)");
        C10160c c10160c5 = C9917k.a.f37571f0;
        C10160c c10160cM35413h9 = c10159bM35408m6.m35413h();
        C10160c c10160cM35413h10 = c10159bM35408m6.m35413h();
        C9801m.m32345e(c10160cM35413h10, "kotlinReadOnly.packageFqName");
        C10159b c10159b5 = new C10159b(c10160cM35413h9, C10162e.m35449g(c10160c5, c10160cM35413h10), false);
        C10159b c10159bM35408m7 = C10159b.m35408m(C9917k.a.f37556W);
        C9801m.m32345e(c10159bM35408m7, "topLevel(FqNames.listIterator)");
        C10160c c10160c6 = C9917k.a.f37569e0;
        C10160c c10160cM35413h11 = c10159bM35408m7.m35413h();
        C10160c c10160cM35413h12 = c10159bM35408m7.m35413h();
        C9801m.m32345e(c10160cM35413h12, "kotlinReadOnly.packageFqName");
        C10159b c10159b6 = new C10159b(c10160cM35413h11, C10162e.m35449g(c10160c6, c10160cM35413h12), false);
        C10160c c10160c7 = C9917k.a.f37558Y;
        C10159b c10159bM35408m8 = C10159b.m35408m(c10160c7);
        C9801m.m32345e(c10159bM35408m8, "topLevel(FqNames.map)");
        C10160c c10160c8 = C9917k.a.f37573g0;
        C10160c c10160cM35413h13 = c10159bM35408m8.m35413h();
        C10160c c10160cM35413h14 = c10159bM35408m8.m35413h();
        C9801m.m32345e(c10160cM35413h14, "kotlinReadOnly.packageFqName");
        C10159b c10159b7 = new C10159b(c10160cM35413h13, C10162e.m35449g(c10160c8, c10160cM35413h14), false);
        C10159b c10159bM35411d = C10159b.m35408m(c10160c7).m35411d(C9917k.a.f37559Z.m35425g());
        C9801m.m32345e(c10159bM35411d, "topLevel(FqNames.map).cr…mes.mapEntry.shortName())");
        C10160c c10160c9 = C9917k.a.f37575h0;
        C10160c c10160cM35413h15 = c10159bM35411d.m35413h();
        C10160c c10160cM35413h16 = c10159bM35411d.m35413h();
        C9801m.m32345e(c10160cM35413h16, "kotlinReadOnly.packageFqName");
        List<a> listM38891m = C10817u.m38891m(new a(c9929c.m32922g(Iterable.class), c10159bM35408m2, c10159b), new a(c9929c.m32922g(Iterator.class), c10159bM35408m3, c10159b2), new a(c9929c.m32922g(Collection.class), c10159bM35408m4, c10159b3), new a(c9929c.m32922g(List.class), c10159bM35408m5, c10159b4), new a(c9929c.m32922g(Set.class), c10159bM35408m6, c10159b5), new a(c9929c.m32922g(ListIterator.class), c10159bM35408m7, c10159b6), new a(c9929c.m32922g(Map.class), c10159bM35408m8, c10159b7), new a(c9929c.m32922g(Map.Entry.class), c10159bM35411d, new C10159b(c10160cM35413h15, C10162e.m35449g(c10160c9, c10160cM35413h16), false)));
        f37683q = listM38891m;
        c9929c.m32921f(Object.class, C9917k.a.f37562b);
        c9929c.m32921f(String.class, C9917k.a.f37574h);
        c9929c.m32921f(CharSequence.class, C9917k.a.f37572g);
        c9929c.m32920e(Throwable.class, C9917k.a.f37600u);
        c9929c.m32921f(Cloneable.class, C9917k.a.f37566d);
        c9929c.m32921f(Number.class, C9917k.a.f37594r);
        c9929c.m32920e(Comparable.class, C9917k.a.f37602v);
        c9929c.m32921f(Enum.class, C9917k.a.f37596s);
        c9929c.m32920e(Annotation.class, C9917k.a.f37536G);
        Iterator<a> it = listM38891m.iterator();
        while (it.hasNext()) {
            f37667a.m32919d(it.next());
        }
        for (EnumC10240e enumC10240e : EnumC10240e.values()) {
            C9929c c9929c2 = f37667a;
            C10159b c10159bM35408m9 = C10159b.m35408m(enumC10240e.m36119y());
            C9801m.m32345e(c10159bM35408m9, "topLevel(jvmType.wrapperFqName)");
            EnumC9915i enumC9915iM36118x = enumC10240e.m36118x();
            C9801m.m32345e(enumC9915iM36118x, "jvmType.primitiveType");
            C10159b c10159bM35408m10 = C10159b.m35408m(C9917k.m32828c(enumC9915iM36118x));
            C9801m.m32345e(c10159bM35408m10, "topLevel(StandardNames.g…e(jvmType.primitiveType))");
            c9929c2.m32916a(c10159bM35408m9, c10159bM35408m10);
        }
        for (C10159b c10159b8 : C9909c.f37450a.m32700a()) {
            C9929c c9929c3 = f37667a;
            C10159b c10159bM35408m11 = C10159b.m35408m(new C10160c("kotlin.jvm.internal." + c10159b8.m35415j().m35455k() + "CompanionObject"));
            C9801m.m32345e(c10159bM35408m11, "topLevel(FqName(\"kotlin.…g() + \"CompanionObject\"))");
            C10159b c10159bM35411d2 = c10159b8.m35411d(C10165h.f39268d);
            C9801m.m32345e(c10159bM35411d2, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            c9929c3.m32916a(c10159bM35408m11, c10159bM35411d2);
        }
        for (int i2 = 0; i2 < 23; i2++) {
            C9929c c9929c4 = f37667a;
            C10159b c10159bM35408m12 = C10159b.m35408m(new C10160c("kotlin.jvm.functions.Function" + i2));
            C9801m.m32345e(c10159bM35408m12, "topLevel(FqName(\"kotlin.…m.functions.Function$i\"))");
            c9929c4.m32916a(c10159bM35408m12, C9917k.m32826a(i2));
            c9929c4.m32918c(new C10160c(f37669c + i2), f37674h);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            EnumC9924c enumC9924c5 = EnumC9924c.f37653j;
            f37667a.m32918c(new C10160c((enumC9924c5.m32895q().toString() + '.' + enumC9924c5.m32894k()) + i3), f37674h);
        }
        C9929c c9929c5 = f37667a;
        C10160c c10160cM35441l = C9917k.a.f37564c.m35441l();
        C9801m.m32345e(c10160cM35441l, "nothing.toSafe()");
        c9929c5.m32918c(c10160cM35441l, c9929c5.m32922g(Void.class));
    }

    private C9929c() {
    }

    /* renamed from: a */
    private final void m32916a(C10159b c10159b, C10159b c10159b2) {
        m32917b(c10159b, c10159b2);
        C10160c c10160cM35409b = c10159b2.m35409b();
        C9801m.m32345e(c10160cM35409b, "kotlinClassId.asSingleFqName()");
        m32918c(c10160cM35409b, c10159b);
    }

    /* renamed from: b */
    private final void m32917b(C10159b c10159b, C10159b c10159b2) {
        HashMap<C10161d, C10159b> map = f37677k;
        C10161d c10161dM35428j = c10159b.m35409b().m35428j();
        C9801m.m32345e(c10161dM35428j, "javaClassId.asSingleFqName().toUnsafe()");
        map.put(c10161dM35428j, c10159b2);
    }

    /* renamed from: c */
    private final void m32918c(C10160c c10160c, C10159b c10159b) {
        HashMap<C10161d, C10159b> map = f37678l;
        C10161d c10161dM35428j = c10160c.m35428j();
        C9801m.m32345e(c10161dM35428j, "kotlinFqNameUnsafe.toUnsafe()");
        map.put(c10161dM35428j, c10159b);
    }

    /* renamed from: d */
    private final void m32919d(a aVar) {
        C10159b c10159bM32932a = aVar.m32932a();
        C10159b c10159bM32933b = aVar.m32933b();
        C10159b c10159bM32934c = aVar.m32934c();
        m32916a(c10159bM32932a, c10159bM32933b);
        C10160c c10160cM35409b = c10159bM32934c.m35409b();
        C9801m.m32345e(c10160cM35409b, "mutableClassId.asSingleFqName()");
        m32918c(c10160cM35409b, c10159bM32932a);
        f37681o.put(c10159bM32934c, c10159bM32933b);
        f37682p.put(c10159bM32933b, c10159bM32934c);
        C10160c c10160cM35409b2 = c10159bM32933b.m35409b();
        C9801m.m32345e(c10160cM35409b2, "readOnlyClassId.asSingleFqName()");
        C10160c c10160cM35409b3 = c10159bM32934c.m35409b();
        C9801m.m32345e(c10160cM35409b3, "mutableClassId.asSingleFqName()");
        HashMap<C10161d, C10160c> map = f37679m;
        C10161d c10161dM35428j = c10159bM32934c.m35409b().m35428j();
        C9801m.m32345e(c10161dM35428j, "mutableClassId.asSingleFqName().toUnsafe()");
        map.put(c10161dM35428j, c10160cM35409b2);
        HashMap<C10161d, C10160c> map2 = f37680n;
        C10161d c10161dM35428j2 = c10160cM35409b2.m35428j();
        C9801m.m32345e(c10161dM35428j2, "readOnlyFqName.toUnsafe()");
        map2.put(c10161dM35428j2, c10160cM35409b3);
    }

    /* renamed from: e */
    private final void m32920e(Class<?> cls, C10160c c10160c) {
        C10159b c10159bM32922g = m32922g(cls);
        C10159b c10159bM35408m = C10159b.m35408m(c10160c);
        C9801m.m32345e(c10159bM35408m, "topLevel(kotlinFqName)");
        m32916a(c10159bM32922g, c10159bM35408m);
    }

    /* renamed from: f */
    private final void m32921f(Class<?> cls, C10161d c10161d) {
        C10160c c10160cM35441l = c10161d.m35441l();
        C9801m.m32345e(c10160cM35441l, "kotlinFqName.toSafe()");
        m32920e(cls, c10160cM35441l);
    }

    /* renamed from: g */
    private final C10159b m32922g(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            C10159b c10159bM35408m = C10159b.m35408m(new C10160c(cls.getCanonicalName()));
            C9801m.m32345e(c10159bM35408m, "topLevel(FqName(clazz.canonicalName))");
            return c10159bM35408m;
        }
        C10159b c10159bM35411d = m32922g(declaringClass).m35411d(C10163f.m35454x(cls.getSimpleName()));
        C9801m.m32345e(c10159bM35411d, "classId(outer).createNes…tifier(clazz.simpleName))");
        return c10159bM35411d;
    }

    /* renamed from: j */
    private final boolean m32923j(C10161d c10161d, String str) {
        Integer numM37503j;
        String strM35432b = c10161d.m35432b();
        C9801m.m32345e(strM35432b, "kotlinFqName.asString()");
        String strM37529E0 = C10547v.m37529E0(strM35432b, str, HttpUrl.FRAGMENT_ENCODE_SET);
        return (strM37529E0.length() > 0) && !C10547v.m37525A0(strM37529E0, '0', false, 2, null) && (numM37503j = C10545t.m37503j(strM37529E0)) != null && numM37503j.intValue() >= 23;
    }

    /* renamed from: h */
    public final C10160c m32924h() {
        return f37673g;
    }

    /* renamed from: i */
    public final List<a> m32925i() {
        return f37683q;
    }

    /* renamed from: k */
    public final boolean m32926k(C10161d c10161d) {
        return f37679m.containsKey(c10161d);
    }

    /* renamed from: l */
    public final boolean m32927l(C10161d c10161d) {
        return f37680n.containsKey(c10161d);
    }

    /* renamed from: m */
    public final C10159b m32928m(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        return f37677k.get(c10160c.m35428j());
    }

    /* renamed from: n */
    public final C10159b m32929n(C10161d c10161d) {
        C9801m.m32346f(c10161d, "kotlinFqName");
        if (!m32923j(c10161d, f37668b) && !m32923j(c10161d, f37670d)) {
            if (!m32923j(c10161d, f37669c) && !m32923j(c10161d, f37671e)) {
                return f37678l.get(c10161d);
            }
            return f37674h;
        }
        return f37672f;
    }

    /* renamed from: o */
    public final C10160c m32930o(C10161d c10161d) {
        return f37679m.get(c10161d);
    }

    /* renamed from: p */
    public final C10160c m32931p(C10161d c10161d) {
        return f37680n.get(c10161d);
    }
}
