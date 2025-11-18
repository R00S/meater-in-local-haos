package nd;

import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import oc.AbstractC4179C;
import oc.y;

/* compiled from: ParameterHandler.java */
/* loaded from: classes3.dex */
abstract class o<T> {

    /* compiled from: ParameterHandler.java */
    class a extends o<Iterable<T>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // nd.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(nd.q qVar, Iterable<T> iterable) {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                o.this.a(qVar, it.next());
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    class b extends o<Object> {
        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // nd.o
        void a(nd.q qVar, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                o.this.a(qVar, Array.get(obj, i10));
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class c<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f45924a;

        /* renamed from: b, reason: collision with root package name */
        private final int f45925b;

        /* renamed from: c, reason: collision with root package name */
        private final nd.f<T, AbstractC4179C> f45926c;

        c(Method method, int i10, nd.f<T, AbstractC4179C> fVar) {
            this.f45924a = method;
            this.f45925b = i10;
            this.f45926c = fVar;
        }

        @Override // nd.o
        void a(nd.q qVar, T t10) {
            if (t10 == null) {
                throw x.o(this.f45924a, this.f45925b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                qVar.l(this.f45926c.a(t10));
            } catch (IOException e10) {
                throw x.p(this.f45924a, e10, this.f45925b, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class d<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f45927a;

        /* renamed from: b, reason: collision with root package name */
        private final nd.f<T, String> f45928b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f45929c;

        d(String str, nd.f<T, String> fVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f45927a = str;
            this.f45928b = fVar;
            this.f45929c = z10;
        }

        @Override // nd.o
        void a(nd.q qVar, T t10) {
            String strA;
            if (t10 == null || (strA = this.f45928b.a(t10)) == null) {
                return;
            }
            qVar.a(this.f45927a, strA, this.f45929c);
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class e<T> extends o<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f45930a;

        /* renamed from: b, reason: collision with root package name */
        private final int f45931b;

        /* renamed from: c, reason: collision with root package name */
        private final nd.f<T, String> f45932c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f45933d;

        e(Method method, int i10, nd.f<T, String> fVar, boolean z10) {
            this.f45930a = method;
            this.f45931b = i10;
            this.f45932c = fVar;
            this.f45933d = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // nd.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(nd.q qVar, Map<String, T> map) {
            if (map == null) {
                throw x.o(this.f45930a, this.f45931b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw x.o(this.f45930a, this.f45931b, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw x.o(this.f45930a, this.f45931b, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strA = this.f45932c.a(value);
                if (strA == null) {
                    throw x.o(this.f45930a, this.f45931b, "Field map value '" + value + "' converted to null by " + this.f45932c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                qVar.a(key, strA, this.f45933d);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class f<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f45934a;

        /* renamed from: b, reason: collision with root package name */
        private final nd.f<T, String> f45935b;

        f(String str, nd.f<T, String> fVar) {
            Objects.requireNonNull(str, "name == null");
            this.f45934a = str;
            this.f45935b = fVar;
        }

        @Override // nd.o
        void a(nd.q qVar, T t10) {
            String strA;
            if (t10 == null || (strA = this.f45935b.a(t10)) == null) {
                return;
            }
            qVar.b(this.f45934a, strA);
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class g<T> extends o<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f45936a;

        /* renamed from: b, reason: collision with root package name */
        private final int f45937b;

        /* renamed from: c, reason: collision with root package name */
        private final nd.f<T, String> f45938c;

        g(Method method, int i10, nd.f<T, String> fVar) {
            this.f45936a = method;
            this.f45937b = i10;
            this.f45938c = fVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // nd.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(nd.q qVar, Map<String, T> map) {
            if (map == null) {
                throw x.o(this.f45936a, this.f45937b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw x.o(this.f45936a, this.f45937b, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw x.o(this.f45936a, this.f45937b, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                qVar.b(key, this.f45938c.a(value));
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class h extends o<oc.u> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f45939a;

        /* renamed from: b, reason: collision with root package name */
        private final int f45940b;

        h(Method method, int i10) {
            this.f45939a = method;
            this.f45940b = i10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // nd.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(nd.q qVar, oc.u uVar) {
            if (uVar == null) {
                throw x.o(this.f45939a, this.f45940b, "Headers parameter must not be null.", new Object[0]);
            }
            qVar.c(uVar);
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class i<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f45941a;

        /* renamed from: b, reason: collision with root package name */
        private final int f45942b;

        /* renamed from: c, reason: collision with root package name */
        private final oc.u f45943c;

        /* renamed from: d, reason: collision with root package name */
        private final nd.f<T, AbstractC4179C> f45944d;

        i(Method method, int i10, oc.u uVar, nd.f<T, AbstractC4179C> fVar) {
            this.f45941a = method;
            this.f45942b = i10;
            this.f45943c = uVar;
            this.f45944d = fVar;
        }

        @Override // nd.o
        void a(nd.q qVar, T t10) {
            if (t10 == null) {
                return;
            }
            try {
                qVar.d(this.f45943c, this.f45944d.a(t10));
            } catch (IOException e10) {
                throw x.o(this.f45941a, this.f45942b, "Unable to convert " + t10 + " to RequestBody", e10);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class j<T> extends o<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f45945a;

        /* renamed from: b, reason: collision with root package name */
        private final int f45946b;

        /* renamed from: c, reason: collision with root package name */
        private final nd.f<T, AbstractC4179C> f45947c;

        /* renamed from: d, reason: collision with root package name */
        private final String f45948d;

        j(Method method, int i10, nd.f<T, AbstractC4179C> fVar, String str) {
            this.f45945a = method;
            this.f45946b = i10;
            this.f45947c = fVar;
            this.f45948d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // nd.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(nd.q qVar, Map<String, T> map) {
            if (map == null) {
                throw x.o(this.f45945a, this.f45946b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw x.o(this.f45945a, this.f45946b, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw x.o(this.f45945a, this.f45946b, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                qVar.d(oc.u.j("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f45948d), this.f45947c.a(value));
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class k<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f45949a;

        /* renamed from: b, reason: collision with root package name */
        private final int f45950b;

        /* renamed from: c, reason: collision with root package name */
        private final String f45951c;

        /* renamed from: d, reason: collision with root package name */
        private final nd.f<T, String> f45952d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f45953e;

        k(Method method, int i10, String str, nd.f<T, String> fVar, boolean z10) {
            this.f45949a = method;
            this.f45950b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f45951c = str;
            this.f45952d = fVar;
            this.f45953e = z10;
        }

        @Override // nd.o
        void a(nd.q qVar, T t10) throws EOFException {
            if (t10 != null) {
                qVar.f(this.f45951c, this.f45952d.a(t10), this.f45953e);
                return;
            }
            throw x.o(this.f45949a, this.f45950b, "Path parameter \"" + this.f45951c + "\" value must not be null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class l<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f45954a;

        /* renamed from: b, reason: collision with root package name */
        private final nd.f<T, String> f45955b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f45956c;

        l(String str, nd.f<T, String> fVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f45954a = str;
            this.f45955b = fVar;
            this.f45956c = z10;
        }

        @Override // nd.o
        void a(nd.q qVar, T t10) {
            String strA;
            if (t10 == null || (strA = this.f45955b.a(t10)) == null) {
                return;
            }
            qVar.g(this.f45954a, strA, this.f45956c);
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class m<T> extends o<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f45957a;

        /* renamed from: b, reason: collision with root package name */
        private final int f45958b;

        /* renamed from: c, reason: collision with root package name */
        private final nd.f<T, String> f45959c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f45960d;

        m(Method method, int i10, nd.f<T, String> fVar, boolean z10) {
            this.f45957a = method;
            this.f45958b = i10;
            this.f45959c = fVar;
            this.f45960d = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // nd.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(nd.q qVar, Map<String, T> map) {
            if (map == null) {
                throw x.o(this.f45957a, this.f45958b, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw x.o(this.f45957a, this.f45958b, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw x.o(this.f45957a, this.f45958b, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strA = this.f45959c.a(value);
                if (strA == null) {
                    throw x.o(this.f45957a, this.f45958b, "Query map value '" + value + "' converted to null by " + this.f45959c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                qVar.g(key, strA, this.f45960d);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class n<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final nd.f<T, String> f45961a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f45962b;

        n(nd.f<T, String> fVar, boolean z10) {
            this.f45961a = fVar;
            this.f45962b = z10;
        }

        @Override // nd.o
        void a(nd.q qVar, T t10) {
            if (t10 == null) {
                return;
            }
            qVar.g(this.f45961a.a(t10), null, this.f45962b);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* renamed from: nd.o$o, reason: collision with other inner class name */
    static final class C0629o extends o<y.c> {

        /* renamed from: a, reason: collision with root package name */
        static final C0629o f45963a = new C0629o();

        private C0629o() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // nd.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(nd.q qVar, y.c cVar) {
            if (cVar != null) {
                qVar.e(cVar);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class p extends o<Object> {

        /* renamed from: a, reason: collision with root package name */
        private final Method f45964a;

        /* renamed from: b, reason: collision with root package name */
        private final int f45965b;

        p(Method method, int i10) {
            this.f45964a = method;
            this.f45965b = i10;
        }

        @Override // nd.o
        void a(nd.q qVar, Object obj) {
            if (obj == null) {
                throw x.o(this.f45964a, this.f45965b, "@Url parameter is null.", new Object[0]);
            }
            qVar.m(obj);
        }
    }

    /* compiled from: ParameterHandler.java */
    static final class q<T> extends o<T> {

        /* renamed from: a, reason: collision with root package name */
        final Class<T> f45966a;

        q(Class<T> cls) {
            this.f45966a = cls;
        }

        @Override // nd.o
        void a(nd.q qVar, T t10) {
            qVar.h(this.f45966a, t10);
        }
    }

    o() {
    }

    abstract void a(nd.q qVar, T t10);

    final o<Object> b() {
        return new b();
    }

    final o<Iterable<T>> c() {
        return new a();
    }
}
