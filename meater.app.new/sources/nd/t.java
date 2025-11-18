package nd;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import nd.a;
import nd.c;
import nd.f;
import oc.AbstractC4179C;
import oc.E;
import oc.InterfaceC4185e;
import oc.z;

/* compiled from: Retrofit.java */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Method, u<?>> f46025a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC4185e.a f46026b;

    /* renamed from: c, reason: collision with root package name */
    final oc.v f46027c;

    /* renamed from: d, reason: collision with root package name */
    final List<f.a> f46028d;

    /* renamed from: e, reason: collision with root package name */
    final List<c.a> f46029e;

    /* renamed from: f, reason: collision with root package name */
    final Executor f46030f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f46031g;

    /* compiled from: Retrofit.java */
    class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final p f46032a = p.f();

        /* renamed from: b, reason: collision with root package name */
        private final Object[] f46033b = new Object[0];

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class f46034c;

        a(Class cls) {
            this.f46034c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f46033b;
            }
            return this.f46032a.h(method) ? this.f46032a.g(method, this.f46034c, obj, objArr) : t.this.c(method).a(objArr);
        }
    }

    t(InterfaceC4185e.a aVar, oc.v vVar, List<f.a> list, List<c.a> list2, Executor executor, boolean z10) {
        this.f46026b = aVar;
        this.f46027c = vVar;
        this.f46028d = list;
        this.f46029e = list2;
        this.f46030f = executor;
        this.f46031g = z10;
    }

    private void j(Class<?> cls) throws SecurityException {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f46031g) {
            p pVarF = p.f();
            for (Method method : cls.getDeclaredMethods()) {
                if (!pVarF.h(method) && !Modifier.isStatic(method.getModifiers())) {
                    c(method);
                }
            }
        }
    }

    public c<?, ?> a(Type type, Annotation[] annotationArr) {
        return d(null, type, annotationArr);
    }

    public <T> T b(Class<T> cls) throws SecurityException {
        j(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    u<?> c(Method method) {
        u<?> uVarB;
        u<?> uVar = this.f46025a.get(method);
        if (uVar != null) {
            return uVar;
        }
        synchronized (this.f46025a) {
            try {
                uVarB = this.f46025a.get(method);
                if (uVarB == null) {
                    uVarB = u.b(this, method);
                    this.f46025a.put(method, uVarB);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return uVarB;
    }

    public c<?, ?> d(c.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f46029e.indexOf(aVar) + 1;
        int size = this.f46029e.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            c<?, ?> cVarA = this.f46029e.get(i10).a(type, annotationArr, this);
            if (cVarA != null) {
                return cVarA;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f46029e.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f46029e.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f46029e.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<T, AbstractC4179C> e(f.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f46028d.indexOf(aVar) + 1;
        int size = this.f46028d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            f<T, AbstractC4179C> fVar = (f<T, AbstractC4179C>) this.f46028d.get(i10).c(type, annotationArr, annotationArr2, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f46028d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f46028d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f46028d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<E, T> f(f.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f46028d.indexOf(aVar) + 1;
        int size = this.f46028d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            f<E, T> fVar = (f<E, T>) this.f46028d.get(i10).d(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f46028d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f46028d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f46028d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<T, AbstractC4179C> g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return e(null, type, annotationArr, annotationArr2);
    }

    public <T> f<E, T> h(Type type, Annotation[] annotationArr) {
        return f(null, type, annotationArr);
    }

    public <T> f<T, String> i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f46028d.size();
        for (int i10 = 0; i10 < size; i10++) {
            f<T, String> fVar = (f<T, String>) this.f46028d.get(i10).e(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        return a.d.f45859a;
    }

    /* compiled from: Retrofit.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final p f46036a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC4185e.a f46037b;

        /* renamed from: c, reason: collision with root package name */
        private oc.v f46038c;

        /* renamed from: d, reason: collision with root package name */
        private final List<f.a> f46039d;

        /* renamed from: e, reason: collision with root package name */
        private final List<c.a> f46040e;

        /* renamed from: f, reason: collision with root package name */
        private Executor f46041f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f46042g;

        b(p pVar) {
            this.f46039d = new ArrayList();
            this.f46040e = new ArrayList();
            this.f46036a = pVar;
        }

        public b a(f.a aVar) {
            List<f.a> list = this.f46039d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return c(oc.v.h(str));
        }

        public b c(oc.v vVar) {
            Objects.requireNonNull(vVar, "baseUrl == null");
            if ("".equals(vVar.n().get(r0.size() - 1))) {
                this.f46038c = vVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + vVar);
        }

        public t d() {
            if (this.f46038c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            InterfaceC4185e.a zVar = this.f46037b;
            if (zVar == null) {
                zVar = new z();
            }
            InterfaceC4185e.a aVar = zVar;
            Executor executorB = this.f46041f;
            if (executorB == null) {
                executorB = this.f46036a.b();
            }
            Executor executor = executorB;
            ArrayList arrayList = new ArrayList(this.f46040e);
            arrayList.addAll(this.f46036a.a(executor));
            ArrayList arrayList2 = new ArrayList(this.f46039d.size() + 1 + this.f46036a.d());
            arrayList2.add(new nd.a());
            arrayList2.addAll(this.f46039d);
            arrayList2.addAll(this.f46036a.c());
            return new t(aVar, this.f46038c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.f46042g);
        }

        public b e(InterfaceC4185e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f46037b = aVar;
            return this;
        }

        public b f(Executor executor) {
            Objects.requireNonNull(executor, "executor == null");
            this.f46041f = executor;
            return this;
        }

        public b g(z zVar) {
            Objects.requireNonNull(zVar, "client == null");
            return e(zVar);
        }

        public b() {
            this(p.f());
        }
    }
}
