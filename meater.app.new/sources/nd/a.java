package nd;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import nd.f;
import oa.C4153F;
import oc.AbstractC4179C;
import oc.E;

/* compiled from: BuiltInConverters.java */
/* loaded from: classes3.dex */
final class a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f45855a = true;

    /* compiled from: BuiltInConverters.java */
    /* renamed from: nd.a$a, reason: collision with other inner class name */
    static final class C0627a implements nd.f<E, E> {

        /* renamed from: a, reason: collision with root package name */
        static final C0627a f45856a = new C0627a();

        C0627a() {
        }

        @Override // nd.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public E a(E e10) throws IOException {
            try {
                return x.a(e10);
            } finally {
                e10.close();
            }
        }
    }

    /* compiled from: BuiltInConverters.java */
    static final class d implements nd.f<Object, String> {

        /* renamed from: a, reason: collision with root package name */
        static final d f45859a = new d();

        d() {
        }

        @Override // nd.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    /* compiled from: BuiltInConverters.java */
    static final class e implements nd.f<E, C4153F> {

        /* renamed from: a, reason: collision with root package name */
        static final e f45860a = new e();

        e() {
        }

        @Override // nd.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4153F a(E e10) throws IOException {
            e10.close();
            return C4153F.f46609a;
        }
    }

    /* compiled from: BuiltInConverters.java */
    static final class f implements nd.f<E, Void> {

        /* renamed from: a, reason: collision with root package name */
        static final f f45861a = new f();

        f() {
        }

        @Override // nd.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(E e10) throws IOException {
            e10.close();
            return null;
        }
    }

    a() {
    }

    @Override // nd.f.a
    public nd.f<?, AbstractC4179C> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, t tVar) {
        if (AbstractC4179C.class.isAssignableFrom(x.h(type))) {
            return b.f45857a;
        }
        return null;
    }

    @Override // nd.f.a
    public nd.f<E, ?> d(Type type, Annotation[] annotationArr, t tVar) {
        if (type == E.class) {
            return x.l(annotationArr, pd.w.class) ? c.f45858a : C0627a.f45856a;
        }
        if (type == Void.class) {
            return f.f45861a;
        }
        if (!this.f45855a || type != C4153F.class) {
            return null;
        }
        try {
            return e.f45860a;
        } catch (NoClassDefFoundError unused) {
            this.f45855a = false;
            return null;
        }
    }

    /* compiled from: BuiltInConverters.java */
    static final class b implements nd.f<AbstractC4179C, AbstractC4179C> {

        /* renamed from: a, reason: collision with root package name */
        static final b f45857a = new b();

        b() {
        }

        @Override // nd.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC4179C a(AbstractC4179C abstractC4179C) {
            return abstractC4179C;
        }
    }

    /* compiled from: BuiltInConverters.java */
    static final class c implements nd.f<E, E> {

        /* renamed from: a, reason: collision with root package name */
        static final c f45858a = new c();

        c() {
        }

        @Override // nd.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public E a(E e10) {
            return e10;
        }
    }
}
