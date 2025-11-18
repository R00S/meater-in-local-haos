package nd;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import nd.x;
import oc.C4180D;
import oc.E;
import oc.InterfaceC4185e;
import ta.InterfaceC4588d;

/* compiled from: HttpServiceMethod.java */
/* loaded from: classes3.dex */
abstract class j<ResponseT, ReturnT> extends u<ReturnT> {

    /* renamed from: a, reason: collision with root package name */
    private final r f45884a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4185e.a f45885b;

    /* renamed from: c, reason: collision with root package name */
    private final f<E, ResponseT> f45886c;

    /* compiled from: HttpServiceMethod.java */
    static final class a<ResponseT, ReturnT> extends j<ResponseT, ReturnT> {

        /* renamed from: d, reason: collision with root package name */
        private final nd.c<ResponseT, ReturnT> f45887d;

        a(r rVar, InterfaceC4185e.a aVar, f<E, ResponseT> fVar, nd.c<ResponseT, ReturnT> cVar) {
            super(rVar, aVar, fVar);
            this.f45887d = cVar;
        }

        @Override // nd.j
        protected ReturnT c(nd.b<ResponseT> bVar, Object[] objArr) {
            return this.f45887d.b(bVar);
        }
    }

    /* compiled from: HttpServiceMethod.java */
    static final class b<ResponseT> extends j<ResponseT, Object> {

        /* renamed from: d, reason: collision with root package name */
        private final nd.c<ResponseT, nd.b<ResponseT>> f45888d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f45889e;

        b(r rVar, InterfaceC4185e.a aVar, f<E, ResponseT> fVar, nd.c<ResponseT, nd.b<ResponseT>> cVar, boolean z10) {
            super(rVar, aVar, fVar);
            this.f45888d = cVar;
            this.f45889e = z10;
        }

        @Override // nd.j
        protected Object c(nd.b<ResponseT> bVar, Object[] objArr) {
            nd.b<ResponseT> bVarB = this.f45888d.b(bVar);
            InterfaceC4588d interfaceC4588d = (InterfaceC4588d) objArr[objArr.length - 1];
            try {
                return this.f45889e ? l.b(bVarB, interfaceC4588d) : l.a(bVarB, interfaceC4588d);
            } catch (Exception e10) {
                return l.d(e10, interfaceC4588d);
            }
        }
    }

    /* compiled from: HttpServiceMethod.java */
    static final class c<ResponseT> extends j<ResponseT, Object> {

        /* renamed from: d, reason: collision with root package name */
        private final nd.c<ResponseT, nd.b<ResponseT>> f45890d;

        c(r rVar, InterfaceC4185e.a aVar, f<E, ResponseT> fVar, nd.c<ResponseT, nd.b<ResponseT>> cVar) {
            super(rVar, aVar, fVar);
            this.f45890d = cVar;
        }

        @Override // nd.j
        protected Object c(nd.b<ResponseT> bVar, Object[] objArr) {
            nd.b<ResponseT> bVarB = this.f45890d.b(bVar);
            InterfaceC4588d interfaceC4588d = (InterfaceC4588d) objArr[objArr.length - 1];
            try {
                return l.c(bVarB, interfaceC4588d);
            } catch (Exception e10) {
                return l.d(e10, interfaceC4588d);
            }
        }
    }

    j(r rVar, InterfaceC4185e.a aVar, f<E, ResponseT> fVar) {
        this.f45884a = rVar;
        this.f45885b = aVar;
        this.f45886c = fVar;
    }

    private static <ResponseT, ReturnT> nd.c<ResponseT, ReturnT> d(t tVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (nd.c<ResponseT, ReturnT>) tVar.a(type, annotationArr);
        } catch (RuntimeException e10) {
            throw x.n(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> f<E, ResponseT> e(t tVar, Method method, Type type) {
        try {
            return tVar.h(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw x.n(method, e10, "Unable to create converter for %s", type);
        }
    }

    static <ResponseT, ReturnT> j<ResponseT, ReturnT> f(t tVar, Method method, r rVar) {
        Type genericReturnType;
        boolean z10;
        boolean z11 = rVar.f45996k;
        Annotation[] annotations = method.getAnnotations();
        if (z11) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeF = x.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (x.h(typeF) == s.class && (typeF instanceof ParameterizedType)) {
                typeF = x.g(0, (ParameterizedType) typeF);
                z10 = true;
            } else {
                z10 = false;
            }
            genericReturnType = new x.b(null, nd.b.class, typeF);
            annotations = w.a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z10 = false;
        }
        nd.c cVarD = d(tVar, method, genericReturnType, annotations);
        Type typeA = cVarD.a();
        if (typeA == C4180D.class) {
            throw x.m(method, "'" + x.h(typeA).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeA == s.class) {
            throw x.m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (rVar.f45988c.equals("HEAD") && !Void.class.equals(typeA)) {
            throw x.m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        f fVarE = e(tVar, method, typeA);
        InterfaceC4185e.a aVar = tVar.f46026b;
        return !z11 ? new a(rVar, aVar, fVarE, cVarD) : z10 ? new c(rVar, aVar, fVarE, cVarD) : new b(rVar, aVar, fVarE, cVarD, false);
    }

    @Override // nd.u
    final ReturnT a(Object[] objArr) {
        return c(new m(this.f45884a, objArr, this.f45885b, this.f45886c), objArr);
    }

    protected abstract ReturnT c(nd.b<ResponseT> bVar, Object[] objArr);
}
