package nd;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nd.o;
import oc.C4178B;
import oc.u;
import oc.y;
import pd.y;
import ta.InterfaceC4588d;

/* compiled from: RequestFactory.java */
/* loaded from: classes3.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Method f45986a;

    /* renamed from: b, reason: collision with root package name */
    private final oc.v f45987b;

    /* renamed from: c, reason: collision with root package name */
    final String f45988c;

    /* renamed from: d, reason: collision with root package name */
    private final String f45989d;

    /* renamed from: e, reason: collision with root package name */
    private final oc.u f45990e;

    /* renamed from: f, reason: collision with root package name */
    private final oc.x f45991f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f45992g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f45993h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f45994i;

    /* renamed from: j, reason: collision with root package name */
    private final o<?>[] f45995j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f45996k;

    /* compiled from: RequestFactory.java */
    static final class a {

        /* renamed from: x, reason: collision with root package name */
        private static final Pattern f45997x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y, reason: collision with root package name */
        private static final Pattern f45998y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a, reason: collision with root package name */
        final t f45999a;

        /* renamed from: b, reason: collision with root package name */
        final Method f46000b;

        /* renamed from: c, reason: collision with root package name */
        final Annotation[] f46001c;

        /* renamed from: d, reason: collision with root package name */
        final Annotation[][] f46002d;

        /* renamed from: e, reason: collision with root package name */
        final Type[] f46003e;

        /* renamed from: f, reason: collision with root package name */
        boolean f46004f;

        /* renamed from: g, reason: collision with root package name */
        boolean f46005g;

        /* renamed from: h, reason: collision with root package name */
        boolean f46006h;

        /* renamed from: i, reason: collision with root package name */
        boolean f46007i;

        /* renamed from: j, reason: collision with root package name */
        boolean f46008j;

        /* renamed from: k, reason: collision with root package name */
        boolean f46009k;

        /* renamed from: l, reason: collision with root package name */
        boolean f46010l;

        /* renamed from: m, reason: collision with root package name */
        boolean f46011m;

        /* renamed from: n, reason: collision with root package name */
        String f46012n;

        /* renamed from: o, reason: collision with root package name */
        boolean f46013o;

        /* renamed from: p, reason: collision with root package name */
        boolean f46014p;

        /* renamed from: q, reason: collision with root package name */
        boolean f46015q;

        /* renamed from: r, reason: collision with root package name */
        String f46016r;

        /* renamed from: s, reason: collision with root package name */
        oc.u f46017s;

        /* renamed from: t, reason: collision with root package name */
        oc.x f46018t;

        /* renamed from: u, reason: collision with root package name */
        Set<String> f46019u;

        /* renamed from: v, reason: collision with root package name */
        o<?>[] f46020v;

        /* renamed from: w, reason: collision with root package name */
        boolean f46021w;

        a(t tVar, Method method) {
            this.f45999a = tVar;
            this.f46000b = method;
            this.f46001c = method.getAnnotations();
            this.f46003e = method.getGenericParameterTypes();
            this.f46002d = method.getParameterAnnotations();
        }

        private static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        private oc.u c(String[] strArr) {
            u.a aVar = new u.a();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw x.m(this.f46000b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f46018t = oc.x.e(strTrim);
                    } catch (IllegalArgumentException e10) {
                        throw x.n(this.f46000b, e10, "Malformed content type: %s", strTrim);
                    }
                } else {
                    aVar.a(strSubstring, strTrim);
                }
            }
            return aVar.e();
        }

        private void d(String str, String str2, boolean z10) {
            String str3 = this.f46012n;
            if (str3 != null) {
                throw x.m(this.f46000b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f46012n = str;
            this.f46013o = z10;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f45997x.matcher(strSubstring).find()) {
                    throw x.m(this.f46000b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f46016r = str2;
            this.f46019u = h(str2);
        }

        private void e(Annotation annotation) {
            if (annotation instanceof pd.b) {
                d("DELETE", ((pd.b) annotation).value(), false);
                return;
            }
            if (annotation instanceof pd.f) {
                d("GET", ((pd.f) annotation).value(), false);
                return;
            }
            if (annotation instanceof pd.g) {
                d("HEAD", ((pd.g) annotation).value(), false);
                return;
            }
            if (annotation instanceof pd.n) {
                d("PATCH", ((pd.n) annotation).value(), true);
                return;
            }
            if (annotation instanceof pd.o) {
                d("POST", ((pd.o) annotation).value(), true);
                return;
            }
            if (annotation instanceof pd.p) {
                d("PUT", ((pd.p) annotation).value(), true);
                return;
            }
            if (annotation instanceof pd.m) {
                d("OPTIONS", ((pd.m) annotation).value(), false);
                return;
            }
            if (annotation instanceof pd.h) {
                pd.h hVar = (pd.h) annotation;
                d(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof pd.k) {
                String[] strArrValue = ((pd.k) annotation).value();
                if (strArrValue.length == 0) {
                    throw x.m(this.f46000b, "@Headers annotation is empty.", new Object[0]);
                }
                this.f46017s = c(strArrValue);
                return;
            }
            if (annotation instanceof pd.l) {
                if (this.f46014p) {
                    throw x.m(this.f46000b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f46015q = true;
            } else if (annotation instanceof pd.e) {
                if (this.f46015q) {
                    throw x.m(this.f46000b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f46014p = true;
            }
        }

        private o<?> f(int i10, Type type, Annotation[] annotationArr, boolean z10) {
            o<?> oVar;
            if (annotationArr != null) {
                oVar = null;
                for (Annotation annotation : annotationArr) {
                    o<?> oVarG = g(i10, type, annotationArr, annotation);
                    if (oVarG != null) {
                        if (oVar != null) {
                            throw x.o(this.f46000b, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        oVar = oVarG;
                    }
                }
            } else {
                oVar = null;
            }
            if (oVar != null) {
                return oVar;
            }
            if (z10) {
                try {
                    if (x.h(type) == InterfaceC4588d.class) {
                        this.f46021w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw x.o(this.f46000b, i10, "No Retrofit annotation found.", new Object[0]);
        }

        private o<?> g(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof y) {
                j(i10, type);
                if (this.f46011m) {
                    throw x.o(this.f46000b, i10, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f46007i) {
                    throw x.o(this.f46000b, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f46008j) {
                    throw x.o(this.f46000b, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f46009k) {
                    throw x.o(this.f46000b, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f46010l) {
                    throw x.o(this.f46000b, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f46016r != null) {
                    throw x.o(this.f46000b, i10, "@Url cannot be used with @%s URL", this.f46012n);
                }
                this.f46011m = true;
                if (type == oc.v.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new o.p(this.f46000b, i10);
                }
                throw x.o(this.f46000b, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof pd.s) {
                j(i10, type);
                if (this.f46008j) {
                    throw x.o(this.f46000b, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f46009k) {
                    throw x.o(this.f46000b, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f46010l) {
                    throw x.o(this.f46000b, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f46011m) {
                    throw x.o(this.f46000b, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f46016r == null) {
                    throw x.o(this.f46000b, i10, "@Path can only be used with relative url on @%s", this.f46012n);
                }
                this.f46007i = true;
                pd.s sVar = (pd.s) annotation;
                String strValue = sVar.value();
                i(i10, strValue);
                return new o.k(this.f46000b, i10, strValue, this.f45999a.i(type, annotationArr), sVar.encoded());
            }
            if (annotation instanceof pd.t) {
                j(i10, type);
                pd.t tVar = (pd.t) annotation;
                String strValue2 = tVar.value();
                boolean zEncoded = tVar.encoded();
                Class<?> clsH = x.h(type);
                this.f46008j = true;
                if (!Iterable.class.isAssignableFrom(clsH)) {
                    if (!clsH.isArray()) {
                        return new o.l(strValue2, this.f45999a.i(type, annotationArr), zEncoded);
                    }
                    return new o.l(strValue2, this.f45999a.i(a(clsH.getComponentType()), annotationArr), zEncoded).b();
                }
                if (type instanceof ParameterizedType) {
                    return new o.l(strValue2, this.f45999a.i(x.g(0, (ParameterizedType) type), annotationArr), zEncoded).c();
                }
                throw x.o(this.f46000b, i10, clsH.getSimpleName() + " must include generic type (e.g., " + clsH.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof pd.v) {
                j(i10, type);
                boolean zEncoded2 = ((pd.v) annotation).encoded();
                Class<?> clsH2 = x.h(type);
                this.f46009k = true;
                if (!Iterable.class.isAssignableFrom(clsH2)) {
                    if (!clsH2.isArray()) {
                        return new o.n(this.f45999a.i(type, annotationArr), zEncoded2);
                    }
                    return new o.n(this.f45999a.i(a(clsH2.getComponentType()), annotationArr), zEncoded2).b();
                }
                if (type instanceof ParameterizedType) {
                    return new o.n(this.f45999a.i(x.g(0, (ParameterizedType) type), annotationArr), zEncoded2).c();
                }
                throw x.o(this.f46000b, i10, clsH2.getSimpleName() + " must include generic type (e.g., " + clsH2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof pd.u) {
                j(i10, type);
                Class<?> clsH3 = x.h(type);
                this.f46010l = true;
                if (!Map.class.isAssignableFrom(clsH3)) {
                    throw x.o(this.f46000b, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeI = x.i(type, clsH3, Map.class);
                if (!(typeI instanceof ParameterizedType)) {
                    throw x.o(this.f46000b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeI;
                Type typeG = x.g(0, parameterizedType);
                if (String.class == typeG) {
                    return new o.m(this.f46000b, i10, this.f45999a.i(x.g(1, parameterizedType), annotationArr), ((pd.u) annotation).encoded());
                }
                throw x.o(this.f46000b, i10, "@QueryMap keys must be of type String: " + typeG, new Object[0]);
            }
            if (annotation instanceof pd.i) {
                j(i10, type);
                String strValue3 = ((pd.i) annotation).value();
                Class<?> clsH4 = x.h(type);
                if (!Iterable.class.isAssignableFrom(clsH4)) {
                    if (!clsH4.isArray()) {
                        return new o.f(strValue3, this.f45999a.i(type, annotationArr));
                    }
                    return new o.f(strValue3, this.f45999a.i(a(clsH4.getComponentType()), annotationArr)).b();
                }
                if (type instanceof ParameterizedType) {
                    return new o.f(strValue3, this.f45999a.i(x.g(0, (ParameterizedType) type), annotationArr)).c();
                }
                throw x.o(this.f46000b, i10, clsH4.getSimpleName() + " must include generic type (e.g., " + clsH4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof pd.j) {
                if (type == oc.u.class) {
                    return new o.h(this.f46000b, i10);
                }
                j(i10, type);
                Class<?> clsH5 = x.h(type);
                if (!Map.class.isAssignableFrom(clsH5)) {
                    throw x.o(this.f46000b, i10, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type typeI2 = x.i(type, clsH5, Map.class);
                if (!(typeI2 instanceof ParameterizedType)) {
                    throw x.o(this.f46000b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeI2;
                Type typeG2 = x.g(0, parameterizedType2);
                if (String.class == typeG2) {
                    return new o.g(this.f46000b, i10, this.f45999a.i(x.g(1, parameterizedType2), annotationArr));
                }
                throw x.o(this.f46000b, i10, "@HeaderMap keys must be of type String: " + typeG2, new Object[0]);
            }
            if (annotation instanceof pd.c) {
                j(i10, type);
                if (!this.f46014p) {
                    throw x.o(this.f46000b, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                pd.c cVar = (pd.c) annotation;
                String strValue4 = cVar.value();
                boolean zEncoded3 = cVar.encoded();
                this.f46004f = true;
                Class<?> clsH6 = x.h(type);
                if (!Iterable.class.isAssignableFrom(clsH6)) {
                    if (!clsH6.isArray()) {
                        return new o.d(strValue4, this.f45999a.i(type, annotationArr), zEncoded3);
                    }
                    return new o.d(strValue4, this.f45999a.i(a(clsH6.getComponentType()), annotationArr), zEncoded3).b();
                }
                if (type instanceof ParameterizedType) {
                    return new o.d(strValue4, this.f45999a.i(x.g(0, (ParameterizedType) type), annotationArr), zEncoded3).c();
                }
                throw x.o(this.f46000b, i10, clsH6.getSimpleName() + " must include generic type (e.g., " + clsH6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof pd.d) {
                j(i10, type);
                if (!this.f46014p) {
                    throw x.o(this.f46000b, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> clsH7 = x.h(type);
                if (!Map.class.isAssignableFrom(clsH7)) {
                    throw x.o(this.f46000b, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeI3 = x.i(type, clsH7, Map.class);
                if (!(typeI3 instanceof ParameterizedType)) {
                    throw x.o(this.f46000b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeI3;
                Type typeG3 = x.g(0, parameterizedType3);
                if (String.class == typeG3) {
                    f fVarI = this.f45999a.i(x.g(1, parameterizedType3), annotationArr);
                    this.f46004f = true;
                    return new o.e(this.f46000b, i10, fVarI, ((pd.d) annotation).encoded());
                }
                throw x.o(this.f46000b, i10, "@FieldMap keys must be of type String: " + typeG3, new Object[0]);
            }
            if (!(annotation instanceof pd.q)) {
                if (annotation instanceof pd.r) {
                    j(i10, type);
                    if (!this.f46015q) {
                        throw x.o(this.f46000b, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f46005g = true;
                    Class<?> clsH8 = x.h(type);
                    if (!Map.class.isAssignableFrom(clsH8)) {
                        throw x.o(this.f46000b, i10, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeI4 = x.i(type, clsH8, Map.class);
                    if (!(typeI4 instanceof ParameterizedType)) {
                        throw x.o(this.f46000b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) typeI4;
                    Type typeG4 = x.g(0, parameterizedType4);
                    if (String.class == typeG4) {
                        Type typeG5 = x.g(1, parameterizedType4);
                        if (y.c.class.isAssignableFrom(x.h(typeG5))) {
                            throw x.o(this.f46000b, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new o.j(this.f46000b, i10, this.f45999a.g(typeG5, annotationArr, this.f46001c), ((pd.r) annotation).encoding());
                    }
                    throw x.o(this.f46000b, i10, "@PartMap keys must be of type String: " + typeG4, new Object[0]);
                }
                if (annotation instanceof pd.a) {
                    j(i10, type);
                    if (this.f46014p || this.f46015q) {
                        throw x.o(this.f46000b, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f46006h) {
                        throw x.o(this.f46000b, i10, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        f fVarG = this.f45999a.g(type, annotationArr, this.f46001c);
                        this.f46006h = true;
                        return new o.c(this.f46000b, i10, fVarG);
                    } catch (RuntimeException e10) {
                        throw x.p(this.f46000b, e10, i10, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof pd.x)) {
                    return null;
                }
                j(i10, type);
                Class<?> clsH9 = x.h(type);
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    o<?> oVar = this.f46020v[i11];
                    if ((oVar instanceof o.q) && ((o.q) oVar).f45966a.equals(clsH9)) {
                        throw x.o(this.f46000b, i10, "@Tag type " + clsH9.getName() + " is duplicate of parameter #" + (i11 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new o.q(clsH9);
            }
            j(i10, type);
            if (!this.f46015q) {
                throw x.o(this.f46000b, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            pd.q qVar = (pd.q) annotation;
            this.f46005g = true;
            String strValue5 = qVar.value();
            Class<?> clsH10 = x.h(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsH10)) {
                    if (clsH10.isArray()) {
                        if (y.c.class.isAssignableFrom(clsH10.getComponentType())) {
                            return o.C0629o.f45963a.b();
                        }
                        throw x.o(this.f46000b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (y.c.class.isAssignableFrom(clsH10)) {
                        return o.C0629o.f45963a;
                    }
                    throw x.o(this.f46000b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (y.c.class.isAssignableFrom(x.h(x.g(0, (ParameterizedType) type)))) {
                        return o.C0629o.f45963a.c();
                    }
                    throw x.o(this.f46000b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw x.o(this.f46000b, i10, clsH10.getSimpleName() + " must include generic type (e.g., " + clsH10.getSimpleName() + "<String>)", new Object[0]);
            }
            oc.u uVarJ = oc.u.j("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
            if (!Iterable.class.isAssignableFrom(clsH10)) {
                if (!clsH10.isArray()) {
                    if (y.c.class.isAssignableFrom(clsH10)) {
                        throw x.o(this.f46000b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new o.i(this.f46000b, i10, uVarJ, this.f45999a.g(type, annotationArr, this.f46001c));
                }
                Class<?> clsA = a(clsH10.getComponentType());
                if (y.c.class.isAssignableFrom(clsA)) {
                    throw x.o(this.f46000b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new o.i(this.f46000b, i10, uVarJ, this.f45999a.g(clsA, annotationArr, this.f46001c)).b();
            }
            if (type instanceof ParameterizedType) {
                Type typeG6 = x.g(0, (ParameterizedType) type);
                if (y.c.class.isAssignableFrom(x.h(typeG6))) {
                    throw x.o(this.f46000b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new o.i(this.f46000b, i10, uVarJ, this.f45999a.g(typeG6, annotationArr, this.f46001c)).c();
            }
            throw x.o(this.f46000b, i10, clsH10.getSimpleName() + " must include generic type (e.g., " + clsH10.getSimpleName() + "<String>)", new Object[0]);
        }

        static Set<String> h(String str) {
            Matcher matcher = f45997x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i10, String str) {
            if (!f45998y.matcher(str).matches()) {
                throw x.o(this.f46000b, i10, "@Path parameter name must match %s. Found: %s", f45997x.pattern(), str);
            }
            if (!this.f46019u.contains(str)) {
                throw x.o(this.f46000b, i10, "URL \"%s\" does not contain \"{%s}\".", this.f46016r, str);
            }
        }

        private void j(int i10, Type type) {
            if (x.j(type)) {
                throw x.o(this.f46000b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        r b() {
            for (Annotation annotation : this.f46001c) {
                e(annotation);
            }
            if (this.f46012n == null) {
                throw x.m(this.f46000b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f46013o) {
                if (this.f46015q) {
                    throw x.m(this.f46000b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f46014p) {
                    throw x.m(this.f46000b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f46002d.length;
            this.f46020v = new o[length];
            int i10 = length - 1;
            int i11 = 0;
            while (i11 < length) {
                this.f46020v[i11] = f(i11, this.f46003e[i11], this.f46002d[i11], i11 == i10);
                i11++;
            }
            if (this.f46016r == null && !this.f46011m) {
                throw x.m(this.f46000b, "Missing either @%s URL or @Url parameter.", this.f46012n);
            }
            boolean z10 = this.f46014p;
            if (!z10 && !this.f46015q && !this.f46013o && this.f46006h) {
                throw x.m(this.f46000b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z10 && !this.f46004f) {
                throw x.m(this.f46000b, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f46015q || this.f46005g) {
                return new r(this);
            }
            throw x.m(this.f46000b, "Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    r(a aVar) {
        this.f45986a = aVar.f46000b;
        this.f45987b = aVar.f45999a.f46027c;
        this.f45988c = aVar.f46012n;
        this.f45989d = aVar.f46016r;
        this.f45990e = aVar.f46017s;
        this.f45991f = aVar.f46018t;
        this.f45992g = aVar.f46013o;
        this.f45993h = aVar.f46014p;
        this.f45994i = aVar.f46015q;
        this.f45995j = aVar.f46020v;
        this.f45996k = aVar.f46021w;
    }

    static r b(t tVar, Method method) {
        return new a(tVar, method).b();
    }

    C4178B a(Object[] objArr) {
        o<?>[] oVarArr = this.f45995j;
        int length = objArr.length;
        if (length != oVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + oVarArr.length + ")");
        }
        q qVar = new q(this.f45988c, this.f45987b, this.f45989d, this.f45990e, this.f45991f, this.f45992g, this.f45993h, this.f45994i);
        if (this.f45996k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            oVarArr[i10].a(qVar, objArr[i10]);
        }
        return qVar.k().h(k.class, new k(this.f45986a, arrayList)).b();
    }
}
