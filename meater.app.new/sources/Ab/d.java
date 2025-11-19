package Ab;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: MemberScope.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f1109c;

    /* renamed from: d, reason: collision with root package name */
    private static int f1110d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f1111e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f1112f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f1113g;

    /* renamed from: h, reason: collision with root package name */
    private static final int f1114h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f1115i;

    /* renamed from: j, reason: collision with root package name */
    private static final int f1116j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f1117k;

    /* renamed from: l, reason: collision with root package name */
    private static final int f1118l;

    /* renamed from: m, reason: collision with root package name */
    private static final int f1119m;

    /* renamed from: n, reason: collision with root package name */
    private static final int f1120n;

    /* renamed from: o, reason: collision with root package name */
    public static final d f1121o;

    /* renamed from: p, reason: collision with root package name */
    public static final d f1122p;

    /* renamed from: q, reason: collision with root package name */
    public static final d f1123q;

    /* renamed from: r, reason: collision with root package name */
    public static final d f1124r;

    /* renamed from: s, reason: collision with root package name */
    public static final d f1125s;

    /* renamed from: t, reason: collision with root package name */
    public static final d f1126t;

    /* renamed from: u, reason: collision with root package name */
    public static final d f1127u;

    /* renamed from: v, reason: collision with root package name */
    public static final d f1128v;

    /* renamed from: w, reason: collision with root package name */
    public static final d f1129w;

    /* renamed from: x, reason: collision with root package name */
    public static final d f1130x;

    /* renamed from: y, reason: collision with root package name */
    private static final List<a.C0020a> f1131y;

    /* renamed from: z, reason: collision with root package name */
    private static final List<a.C0020a> f1132z;

    /* renamed from: a, reason: collision with root package name */
    private final List<c> f1133a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1134b;

    /* compiled from: MemberScope.kt */
    public static final class a {

        /* compiled from: MemberScope.kt */
        /* renamed from: Ab.d$a$a, reason: collision with other inner class name */
        private static final class C0020a {

            /* renamed from: a, reason: collision with root package name */
            private final int f1135a;

            /* renamed from: b, reason: collision with root package name */
            private final String f1136b;

            public C0020a(int i10, String name) {
                C3862t.g(name, "name");
                this.f1135a = i10;
                this.f1136b = name;
            }

            public final int a() {
                return this.f1135a;
            }

            public final String b() {
                return this.f1136b;
            }
        }

        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int j() {
            int i10 = d.f1110d;
            d.f1110d <<= 1;
            return i10;
        }

        public final int b() {
            return d.f1117k;
        }

        public final int c() {
            return d.f1118l;
        }

        public final int d() {
            return d.f1115i;
        }

        public final int e() {
            return d.f1111e;
        }

        public final int f() {
            return d.f1114h;
        }

        public final int g() {
            return d.f1112f;
        }

        public final int h() {
            return d.f1113g;
        }

        public final int i() {
            return d.f1116j;
        }

        private a() {
        }
    }

    static {
        a.C0020a c0020a;
        a.C0020a c0020a2;
        a aVar = new a(null);
        f1109c = aVar;
        f1110d = 1;
        int iJ = aVar.j();
        f1111e = iJ;
        int iJ2 = aVar.j();
        f1112f = iJ2;
        int iJ3 = aVar.j();
        f1113g = iJ3;
        int iJ4 = aVar.j();
        f1114h = iJ4;
        int iJ5 = aVar.j();
        f1115i = iJ5;
        int iJ6 = aVar.j();
        f1116j = iJ6;
        int iJ7 = aVar.j() - 1;
        f1117k = iJ7;
        int i10 = iJ | iJ2 | iJ3;
        f1118l = i10;
        int i11 = iJ2 | iJ5 | iJ6;
        f1119m = i11;
        int i12 = iJ5 | iJ6;
        f1120n = i12;
        int i13 = 2;
        f1121o = new d(iJ7, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f1122p = new d(i12, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f1123q = new d(iJ, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f1124r = new d(iJ2, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f1125s = new d(iJ3, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f1126t = new d(i10, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f1127u = new d(iJ4, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f1128v = new d(iJ5, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f1129w = new d(iJ6, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f1130x = new d(i11, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        Field[] fields = d.class.getFields();
        C3862t.f(fields, "getFields(...)");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                int i14 = dVar.f1134b;
                String name = field2.getName();
                C3862t.f(name, "getName(...)");
                c0020a2 = new a.C0020a(i14, name);
            } else {
                c0020a2 = null;
            }
            if (c0020a2 != null) {
                arrayList2.add(c0020a2);
            }
        }
        f1131y = arrayList2;
        Field[] fields2 = d.class.getFields();
        C3862t.f(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (C3862t.b(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            C3862t.e(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                C3862t.f(name2, "getName(...)");
                c0020a = new a.C0020a(iIntValue, name2);
            } else {
                c0020a = null;
            }
            if (c0020a != null) {
                arrayList5.add(c0020a);
            }
        }
        f1132z = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i10, List<? extends c> excludes) {
        C3862t.g(excludes, "excludes");
        this.f1133a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i10 &= ~((c) it.next()).a();
        }
        this.f1134b = i10;
    }

    public final boolean a(int i10) {
        return (i10 & this.f1134b) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C3862t.b(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C3862t.e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        d dVar = (d) obj;
        return C3862t.b(this.f1133a, dVar.f1133a) && this.f1134b == dVar.f1134b;
    }

    public int hashCode() {
        return (this.f1133a.hashCode() * 31) + this.f1134b;
    }

    public final List<c> l() {
        return this.f1133a;
    }

    public final int m() {
        return this.f1134b;
    }

    public final d n(int i10) {
        int i11 = i10 & this.f1134b;
        if (i11 == 0) {
            return null;
        }
        return new d(i11, this.f1133a);
    }

    public String toString() {
        Object next;
        Iterator<T> it = f1131y.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((a.C0020a) next).a() == this.f1134b) {
                break;
            }
        }
        a.C0020a c0020a = (a.C0020a) next;
        String strB = c0020a != null ? c0020a.b() : null;
        if (strB == null) {
            List<a.C0020a> list = f1132z;
            ArrayList arrayList = new ArrayList();
            for (a.C0020a c0020a2 : list) {
                String strB2 = a(c0020a2.a()) ? c0020a2.b() : null;
                if (strB2 != null) {
                    arrayList.add(strB2);
                }
            }
            strB = kotlin.collections.r.s0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strB + ", " + this.f1133a + ')';
    }

    public /* synthetic */ d(int i10, List list, int i11, C3854k c3854k) {
        this(i10, (i11 & 2) != 0 ? kotlin.collections.r.m() : list);
    }
}
