package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: MemberScope.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.d */
/* loaded from: classes3.dex */
public final class C10247d {

    /* renamed from: a */
    public static final a f39630a;

    /* renamed from: b */
    private static int f39631b;

    /* renamed from: c */
    private static final int f39632c;

    /* renamed from: d */
    private static final int f39633d;

    /* renamed from: e */
    private static final int f39634e;

    /* renamed from: f */
    private static final int f39635f;

    /* renamed from: g */
    private static final int f39636g;

    /* renamed from: h */
    private static final int f39637h;

    /* renamed from: i */
    private static final int f39638i;

    /* renamed from: j */
    private static final int f39639j;

    /* renamed from: k */
    private static final int f39640k;

    /* renamed from: l */
    private static final int f39641l;

    /* renamed from: m */
    public static final C10247d f39642m;

    /* renamed from: n */
    public static final C10247d f39643n;

    /* renamed from: o */
    public static final C10247d f39644o;

    /* renamed from: p */
    public static final C10247d f39645p;

    /* renamed from: q */
    public static final C10247d f39646q;

    /* renamed from: r */
    public static final C10247d f39647r;

    /* renamed from: s */
    public static final C10247d f39648s;

    /* renamed from: t */
    public static final C10247d f39649t;

    /* renamed from: u */
    public static final C10247d f39650u;

    /* renamed from: v */
    public static final C10247d f39651v;

    /* renamed from: w */
    private static final List<a.C11562a> f39652w;

    /* renamed from: x */
    private static final List<a.C11562a> f39653x;

    /* renamed from: y */
    private final List<AbstractC10246c> f39654y;

    /* renamed from: z */
    private final int f39655z;

    /* compiled from: MemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.d$a */
    public static final class a {

        /* compiled from: MemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.i.w.d$a$a, reason: collision with other inner class name */
        private static final class C11562a {

            /* renamed from: a */
            private final int f39656a;

            /* renamed from: b */
            private final String f39657b;

            public C11562a(int i2, String str) {
                C9801m.m32346f(str, "name");
                this.f39656a = i2;
                this.f39657b = str;
            }

            /* renamed from: a */
            public final int m36151a() {
                return this.f39656a;
            }

            /* renamed from: b */
            public final String m36152b() {
                return this.f39657b;
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public final int m36142j() {
            int i2 = C10247d.f39631b;
            a aVar = C10247d.f39630a;
            C10247d.f39631b <<= 1;
            return i2;
        }

        /* renamed from: b */
        public final int m36143b() {
            return C10247d.f39638i;
        }

        /* renamed from: c */
        public final int m36144c() {
            return C10247d.f39639j;
        }

        /* renamed from: d */
        public final int m36145d() {
            return C10247d.f39636g;
        }

        /* renamed from: e */
        public final int m36146e() {
            return C10247d.f39632c;
        }

        /* renamed from: f */
        public final int m36147f() {
            return C10247d.f39635f;
        }

        /* renamed from: g */
        public final int m36148g() {
            return C10247d.f39633d;
        }

        /* renamed from: h */
        public final int m36149h() {
            return C10247d.f39634e;
        }

        /* renamed from: i */
        public final int m36150i() {
            return C10247d.f39637h;
        }
    }

    static {
        a.C11562a c11562a;
        a.C11562a c11562a2;
        a aVar = new a(null);
        f39630a = aVar;
        f39631b = 1;
        int iM36142j = aVar.m36142j();
        f39632c = iM36142j;
        int iM36142j2 = aVar.m36142j();
        f39633d = iM36142j2;
        int iM36142j3 = aVar.m36142j();
        f39634e = iM36142j3;
        int iM36142j4 = aVar.m36142j();
        f39635f = iM36142j4;
        int iM36142j5 = aVar.m36142j();
        f39636g = iM36142j5;
        int iM36142j6 = aVar.m36142j();
        f39637h = iM36142j6;
        int iM36142j7 = aVar.m36142j() - 1;
        f39638i = iM36142j7;
        int i2 = iM36142j | iM36142j2 | iM36142j3;
        f39639j = i2;
        int i3 = iM36142j2 | iM36142j5 | iM36142j6;
        f39640k = i3;
        int i4 = iM36142j5 | iM36142j6;
        f39641l = i4;
        int i5 = 2;
        f39642m = new C10247d(iM36142j7, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        f39643n = new C10247d(i4, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        f39644o = new C10247d(iM36142j, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        f39645p = new C10247d(iM36142j2, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        f39646q = new C10247d(iM36142j3, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        f39647r = new C10247d(i2, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        f39648s = new C10247d(iM36142j4, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        f39649t = new C10247d(iM36142j5, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        f39650u = new C10247d(iM36142j6, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        f39651v = new C10247d(i3, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        Field[] fields = C10247d.class.getFields();
        C9801m.m32345e(fields, "T::class.java.fields");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            C10247d c10247d = obj instanceof C10247d ? (C10247d) obj : null;
            if (c10247d != null) {
                int i6 = c10247d.f39655z;
                String name = field2.getName();
                C9801m.m32345e(name, "field.name");
                c11562a2 = new a.C11562a(i6, name);
            } else {
                c11562a2 = null;
            }
            if (c11562a2 != null) {
                arrayList2.add(c11562a2);
            }
        }
        f39652w = arrayList2;
        Field[] fields2 = C10247d.class.getFields();
        C9801m.m32345e(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (C9801m.m32341a(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            C9801m.m32344d(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                C9801m.m32345e(name2, "field.name");
                c11562a = new a.C11562a(iIntValue, name2);
            } else {
                c11562a = null;
            }
            if (c11562a != null) {
                arrayList5.add(c11562a);
            }
        }
        f39653x = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10247d(int i2, List<? extends AbstractC10246c> list) {
        C9801m.m32346f(list, "excludes");
        this.f39654y = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i2 &= ((AbstractC10246c) it.next()).mo36126a() ^ (-1);
        }
        this.f39655z = i2;
    }

    /* renamed from: a */
    public final boolean m36137a(int i2) {
        return (i2 & this.f39655z) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C9801m.m32341a(C10247d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C9801m.m32344d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        C10247d c10247d = (C10247d) obj;
        return C9801m.m32341a(this.f39654y, c10247d.f39654y) && this.f39655z == c10247d.f39655z;
    }

    public int hashCode() {
        return (this.f39654y.hashCode() * 31) + this.f39655z;
    }

    /* renamed from: l */
    public final List<AbstractC10246c> m36138l() {
        return this.f39654y;
    }

    /* renamed from: m */
    public final int m36139m() {
        return this.f39655z;
    }

    /* renamed from: n */
    public final C10247d m36140n(int i2) {
        int i3 = i2 & this.f39655z;
        if (i3 == 0) {
            return null;
        }
        return new C10247d(i3, this.f39654y);
    }

    public String toString() {
        Object next;
        Iterator<T> it = f39652w.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((a.C11562a) next).m36151a() == this.f39655z) {
                break;
            }
        }
        a.C11562a c11562a = (a.C11562a) next;
        String strM36152b = c11562a != null ? c11562a.m36152b() : null;
        if (strM36152b == null) {
            List<a.C11562a> list = f39653x;
            ArrayList arrayList = new ArrayList();
            for (a.C11562a c11562a2 : list) {
                String strM36152b2 = m36137a(c11562a2.m36151a()) ? c11562a2.m36152b() : null;
                if (strM36152b2 != null) {
                    arrayList.add(strM36152b2);
                }
            }
            strM36152b = C10782c0.m38599e0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strM36152b + ", " + this.f39654y + ')';
    }

    public /* synthetic */ C10247d(int i2, List list, int i3, C9789g c9789g) {
        this(i2, (i3 & 2) != 0 ? C10817u.m38888j() : list);
    }
}
