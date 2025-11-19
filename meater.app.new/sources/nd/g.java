package nd;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import nd.c;
import oc.C4178B;

/* compiled from: DefaultCallAdapterFactory.java */
/* loaded from: classes3.dex */
final class g extends c.a {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f45870a;

    /* compiled from: DefaultCallAdapterFactory.java */
    class a implements c<Object, nd.b<?>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f45871a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f45872b;

        a(Type type, Executor executor) {
            this.f45871a = type;
            this.f45872b = executor;
        }

        @Override // nd.c
        public Type a() {
            return this.f45871a;
        }

        @Override // nd.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public nd.b<Object> b(nd.b<Object> bVar) {
            Executor executor = this.f45872b;
            return executor == null ? bVar : new b(executor, bVar);
        }
    }

    /* compiled from: DefaultCallAdapterFactory.java */
    static final class b<T> implements nd.b<T> {

        /* renamed from: B, reason: collision with root package name */
        final Executor f45874B;

        /* renamed from: C, reason: collision with root package name */
        final nd.b<T> f45875C;

        /* compiled from: DefaultCallAdapterFactory.java */
        class a implements d<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f45876a;

            a(d dVar) {
                this.f45876a = dVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void c(d dVar, Throwable th) {
                dVar.onFailure(b.this, th);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void d(d dVar, s sVar) {
                if (b.this.f45875C.isCanceled()) {
                    dVar.onFailure(b.this, new IOException("Canceled"));
                } else {
                    dVar.onResponse(b.this, sVar);
                }
            }

            @Override // nd.d
            public void onFailure(nd.b<T> bVar, final Throwable th) {
                Executor executor = b.this.f45874B;
                final d dVar = this.f45876a;
                executor.execute(new Runnable() { // from class: nd.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f45881B.c(dVar, th);
                    }
                });
            }

            @Override // nd.d
            public void onResponse(nd.b<T> bVar, final s<T> sVar) {
                Executor executor = b.this.f45874B;
                final d dVar = this.f45876a;
                executor.execute(new Runnable() { // from class: nd.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f45878B.d(dVar, sVar);
                    }
                });
            }
        }

        b(Executor executor, nd.b<T> bVar) {
            this.f45874B = executor;
            this.f45875C = bVar;
        }

        @Override // nd.b
        public void cancel() {
            this.f45875C.cancel();
        }

        @Override // nd.b
        public void enqueue(d<T> dVar) {
            Objects.requireNonNull(dVar, "callback == null");
            this.f45875C.enqueue(new a(dVar));
        }

        @Override // nd.b
        public s<T> execute() {
            return this.f45875C.execute();
        }

        @Override // nd.b
        public boolean isCanceled() {
            return this.f45875C.isCanceled();
        }

        @Override // nd.b
        public C4178B request() {
            return this.f45875C.request();
        }

        @Override // nd.b
        public nd.b<T> clone() {
            return new b(this.f45874B, this.f45875C.clone());
        }
    }

    g(Executor executor) {
        this.f45870a = executor;
    }

    @Override // nd.c.a
    public c<?, ?> a(Type type, Annotation[] annotationArr, t tVar) {
        if (c.a.c(type) != nd.b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(x.g(0, (ParameterizedType) type), x.l(annotationArr, v.class) ? null : this.f45870a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
