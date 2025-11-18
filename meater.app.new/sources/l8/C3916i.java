package l8;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* compiled from: MoreObjects.java */
/* renamed from: l8.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3916i {

    /* compiled from: MoreObjects.java */
    /* renamed from: l8.i$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f44438a;

        /* renamed from: b, reason: collision with root package name */
        private final C0593b f44439b;

        /* renamed from: c, reason: collision with root package name */
        private C0593b f44440c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f44441d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f44442e;

        /* compiled from: MoreObjects.java */
        /* renamed from: l8.i$b$a */
        private static final class a extends C0593b {
            private a() {
            }
        }

        /* compiled from: MoreObjects.java */
        /* renamed from: l8.i$b$b, reason: collision with other inner class name */
        static class C0593b {

            /* renamed from: a, reason: collision with root package name */
            String f44443a;

            /* renamed from: b, reason: collision with root package name */
            Object f44444b;

            /* renamed from: c, reason: collision with root package name */
            C0593b f44445c;

            C0593b() {
            }
        }

        private C0593b c() {
            C0593b c0593b = new C0593b();
            this.f44440c.f44445c = c0593b;
            this.f44440c = c0593b;
            return c0593b;
        }

        private b d(Object obj) {
            c().f44444b = obj;
            return this;
        }

        private b e(String str, Object obj) {
            C0593b c0593bC = c();
            c0593bC.f44444b = obj;
            c0593bC.f44443a = (String) m.l(str);
            return this;
        }

        private a f() {
            a aVar = new a();
            this.f44440c.f44445c = aVar;
            this.f44440c = aVar;
            return aVar;
        }

        private b g(String str, Object obj) {
            a aVarF = f();
            aVarF.f44444b = obj;
            aVarF.f44443a = (String) m.l(str);
            return this;
        }

        private static boolean i(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof l ? !((l) obj).c() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b a(String str, int i10) {
            return g(str, String.valueOf(i10));
        }

        public b b(String str, Object obj) {
            return e(str, obj);
        }

        public b h(Object obj) {
            return d(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r7 = this;
                boolean r0 = r7.f44441d
                boolean r1 = r7.f44442e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = 32
                r2.<init>(r3)
                java.lang.String r3 = r7.f44438a
                r2.append(r3)
                r3 = 123(0x7b, float:1.72E-43)
                r2.append(r3)
                l8.i$b$b r3 = r7.f44439b
                l8.i$b$b r3 = r3.f44445c
                java.lang.String r4 = ""
            L1b:
                if (r3 == 0) goto L65
                java.lang.Object r5 = r3.f44444b
                boolean r6 = r3 instanceof l8.C3916i.b.a
                if (r6 != 0) goto L30
                if (r5 != 0) goto L28
                if (r0 != 0) goto L62
                goto L30
            L28:
                if (r1 == 0) goto L30
                boolean r6 = i(r5)
                if (r6 != 0) goto L62
            L30:
                r2.append(r4)
                java.lang.String r4 = r3.f44443a
                if (r4 == 0) goto L3f
                r2.append(r4)
                r4 = 61
                r2.append(r4)
            L3f:
                if (r5 == 0) goto L5d
                java.lang.Class r4 = r5.getClass()
                boolean r4 = r4.isArray()
                if (r4 == 0) goto L5d
                java.lang.Object[] r4 = new java.lang.Object[]{r5}
                java.lang.String r4 = java.util.Arrays.deepToString(r4)
                int r5 = r4.length()
                r6 = 1
                int r5 = r5 - r6
                r2.append(r4, r6, r5)
                goto L60
            L5d:
                r2.append(r5)
            L60:
                java.lang.String r4 = ", "
            L62:
                l8.i$b$b r3 = r3.f44445c
                goto L1b
            L65:
                r0 = 125(0x7d, float:1.75E-43)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: l8.C3916i.b.toString():java.lang.String");
        }

        private b(String str) {
            C0593b c0593b = new C0593b();
            this.f44439b = c0593b;
            this.f44440c = c0593b;
            this.f44441d = false;
            this.f44442e = false;
            this.f44438a = (String) m.l(str);
        }
    }

    public static <T> T a(T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
