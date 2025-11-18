package androidx.core.content.p003d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p024c.p052i.p059j.C0954d;
import p024c.p052i.p059j.C0959i;

/* compiled from: ResourcesCompat.java */
/* renamed from: androidx.core.content.d.f */
/* loaded from: classes.dex */
public final class C0263f {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f2210a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<b, SparseArray<a>> f2211b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f2212c = new Object();

    /* compiled from: ResourcesCompat.java */
    /* renamed from: androidx.core.content.d.f$a */
    private static class a {

        /* renamed from: a */
        final ColorStateList f2213a;

        /* renamed from: b */
        final Configuration f2214b;

        a(ColorStateList colorStateList, Configuration configuration) {
            this.f2213a = colorStateList;
            this.f2214b = configuration;
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* renamed from: androidx.core.content.d.f$b */
    private static final class b {

        /* renamed from: a */
        final Resources f2215a;

        /* renamed from: b */
        final Resources.Theme f2216b;

        b(Resources resources, Resources.Theme theme) {
            this.f2215a = resources;
            this.f2216b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2215a.equals(bVar.f2215a) && C0954d.m6056a(this.f2216b, bVar.f2216b);
        }

        public int hashCode() {
            return C0954d.m6057b(this.f2215a, this.f2216b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* renamed from: androidx.core.content.d.f$c */
    public static abstract class c {

        /* compiled from: ResourcesCompat.java */
        /* renamed from: androidx.core.content.d.f$c$a */
        class a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Typeface f2217f;

            a(Typeface typeface) {
                this.f2217f = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.mo1178e(this.f2217f);
            }
        }

        /* compiled from: ResourcesCompat.java */
        /* renamed from: androidx.core.content.d.f$c$b */
        class b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ int f2219f;

            b(int i2) {
                this.f2219f = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.mo1177d(this.f2219f);
            }
        }

        /* renamed from: c */
        public static Handler m1760c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: a */
        public final void m1761a(int i2, Handler handler) {
            m1760c(handler).post(new b(i2));
        }

        /* renamed from: b */
        public final void m1762b(Typeface typeface, Handler handler) {
            m1760c(handler).post(new a(typeface));
        }

        /* renamed from: d */
        public abstract void mo1177d(int i2);

        /* renamed from: e */
        public abstract void mo1178e(Typeface typeface);
    }

    /* compiled from: ResourcesCompat.java */
    /* renamed from: androidx.core.content.d.f$d */
    public static final class d {

        /* compiled from: ResourcesCompat.java */
        /* renamed from: androidx.core.content.d.f$d$a */
        static class a {

            /* renamed from: a */
            private static final Object f2221a = new Object();

            /* renamed from: b */
            private static Method f2222b;

            /* renamed from: c */
            private static boolean f2223c;

            /* JADX WARN: Removed duplicated region for block: B:30:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            static void m1764a(android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = androidx.core.content.p003d.C0263f.d.a.f2221a
                    monitor-enter(r0)
                    boolean r1 = androidx.core.content.p003d.C0263f.d.a.f2223c     // Catch: java.lang.Throwable -> L3c
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    androidx.core.content.p003d.C0263f.d.a.f2222b = r3     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    r3.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    goto L21
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L3c
                L21:
                    androidx.core.content.p003d.C0263f.d.a.f2223c = r1     // Catch: java.lang.Throwable -> L3c
                L23:
                    java.lang.reflect.Method r1 = androidx.core.content.p003d.C0263f.d.a.f2222b     // Catch: java.lang.Throwable -> L3c
                    if (r1 == 0) goto L3a
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    r1.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    goto L3a
                L2d:
                    r6 = move-exception
                    goto L30
                L2f:
                    r6 = move-exception
                L30:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r2 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r2, r6)     // Catch: java.lang.Throwable -> L3c
                    r6 = 0
                    androidx.core.content.p003d.C0263f.d.a.f2222b = r6     // Catch: java.lang.Throwable -> L3c
                L3a:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    return
                L3c:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p003d.C0263f.d.a.m1764a(android.content.res.Resources$Theme):void");
            }
        }

        /* compiled from: ResourcesCompat.java */
        /* renamed from: androidx.core.content.d.f$d$b */
        static class b {
            /* renamed from: a */
            static void m1765a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m1763a(Resources.Theme theme) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                b.m1765a(theme);
            } else if (i2 >= 23) {
                a.m1764a(theme);
            }
        }
    }

    /* renamed from: a */
    private static void m1748a(b bVar, int i2, ColorStateList colorStateList) {
        synchronized (f2212c) {
            WeakHashMap<b, SparseArray<a>> weakHashMap = f2211b;
            SparseArray<a> sparseArray = weakHashMap.get(bVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(bVar, sparseArray);
            }
            sparseArray.append(i2, new a(colorStateList, bVar.f2215a.getConfiguration()));
        }
    }

    /* renamed from: b */
    private static ColorStateList m1749b(b bVar, int i2) {
        a aVar;
        synchronized (f2212c) {
            SparseArray<a> sparseArray = f2211b.get(bVar);
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i2)) != null) {
                if (aVar.f2214b.equals(bVar.f2215a.getConfiguration())) {
                    return aVar.f2213a;
                }
                sparseArray.remove(i2);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static ColorStateList m1750c(Resources resources, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i2, theme);
        }
        b bVar = new b(resources, theme);
        ColorStateList colorStateListM1749b = m1749b(bVar, i2);
        if (colorStateListM1749b != null) {
            return colorStateListM1749b;
        }
        ColorStateList colorStateListM1756i = m1756i(resources, i2, theme);
        if (colorStateListM1756i == null) {
            return resources.getColorStateList(i2);
        }
        m1748a(bVar, i2, colorStateListM1756i);
        return colorStateListM1756i;
    }

    /* renamed from: d */
    public static Drawable m1751d(Resources resources, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i2, theme) : resources.getDrawable(i2);
    }

    /* renamed from: e */
    public static Typeface m1752e(Context context, int i2) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m1758k(context, i2, new TypedValue(), 0, null, null, false, false);
    }

    /* renamed from: f */
    public static Typeface m1753f(Context context, int i2, TypedValue typedValue, int i3, c cVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m1758k(context, i2, typedValue, i3, cVar, null, true, false);
    }

    /* renamed from: g */
    public static void m1754g(Context context, int i2, c cVar, Handler handler) throws Resources.NotFoundException {
        C0959i.m6065c(cVar);
        if (context.isRestricted()) {
            cVar.m1761a(-4, handler);
        } else {
            m1758k(context, i2, new TypedValue(), 0, cVar, handler, false, false);
        }
    }

    /* renamed from: h */
    private static TypedValue m1755h() {
        ThreadLocal<TypedValue> threadLocal = f2210a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: i */
    private static ColorStateList m1756i(Resources resources, int i2, Resources.Theme theme) {
        if (m1757j(resources, i2)) {
            return null;
        }
        try {
            return C0258a.m1702a(resources, resources.getXml(i2), theme);
        } catch (Exception e2) {
            Log.e("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    /* renamed from: j */
    private static boolean m1757j(Resources resources, int i2) throws Resources.NotFoundException {
        TypedValue typedValueM1755h = m1755h();
        resources.getValue(i2, typedValueM1755h, true);
        int i3 = typedValueM1755h.type;
        return i3 >= 28 && i3 <= 31;
    }

    /* renamed from: k */
    private static Typeface m1758k(Context context, int i2, TypedValue typedValue, int i3, c cVar, Handler handler, boolean z, boolean z2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        Typeface typefaceM1759l = m1759l(context, resources, typedValue, i2, i3, cVar, handler, z, z2);
        if (typefaceM1759l != null || cVar != null || z2) {
            return typefaceM1759l;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i2) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface m1759l(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, androidx.core.content.p003d.C0263f.c r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Laa
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L26
            if (r9 == 0) goto L25
            r9.m1761a(r13, r10)
        L25:
            return r14
        L26:
            android.graphics.Typeface r1 = p024c.p052i.p053e.C0926d.m5913f(r0, r4, r5)
            if (r1 == 0) goto L32
            if (r9 == 0) goto L31
            r9.m1762b(r1, r10)
        L31:
            return r1
        L32:
            if (r23 == 0) goto L35
            return r14
        L35:
            java.lang.String r1 = r12.toLowerCase()     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r1 == 0) goto L68
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            androidx.core.content.d.c$a r2 = androidx.core.content.p003d.C0260c.m1723b(r1, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r2 != 0) goto L56
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r9 == 0) goto L55
            r9.m1761a(r13, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
        L55:
            return r14
        L56:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = p024c.p052i.p053e.C0926d.m5910c(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            return r0
        L68:
            r1 = r15
            android.graphics.Typeface r0 = p024c.p052i.p053e.C0926d.m5911d(r15, r0, r4, r12, r5)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r9 == 0) goto L78
            if (r0 == 0) goto L75
            r9.m1762b(r0, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            goto L78
        L75:
            r9.m1761a(r13, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
        L78:
            return r0
        L79:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto La4
        L8f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        La4:
            if (r9 == 0) goto La9
            r9.m1761a(r13, r10)
        La9:
            return r14
        Laa:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p003d.C0263f.m1759l(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.d.f$c, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
