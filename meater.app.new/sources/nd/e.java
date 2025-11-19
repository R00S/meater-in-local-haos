package nd;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import nd.c;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.HttpException;

/* compiled from: CompletableFutureCallAdapterFactory.java */
@IgnoreJRERequirement
/* loaded from: classes3.dex */
final class e extends c.a {

    /* renamed from: a, reason: collision with root package name */
    static final c.a f45862a = new e();

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    private static final class a<R> implements nd.c<R, CompletableFuture<R>> {

        /* renamed from: a, reason: collision with root package name */
        private final Type f45863a;

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        /* renamed from: nd.e$a$a, reason: collision with other inner class name */
        private class C0628a implements d<R> {

            /* renamed from: a, reason: collision with root package name */
            private final CompletableFuture<R> f45864a;

            public C0628a(CompletableFuture<R> completableFuture) {
                this.f45864a = completableFuture;
            }

            @Override // nd.d
            public void onFailure(nd.b<R> bVar, Throwable th) {
                this.f45864a.completeExceptionally(th);
            }

            @Override // nd.d
            public void onResponse(nd.b<R> bVar, s<R> sVar) {
                if (sVar.f()) {
                    this.f45864a.complete(sVar.a());
                } else {
                    this.f45864a.completeExceptionally(new HttpException(sVar));
                }
            }
        }

        a(Type type) {
            this.f45863a = type;
        }

        @Override // nd.c
        public Type a() {
            return this.f45863a;
        }

        @Override // nd.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> b(nd.b<R> bVar) {
            b bVar2 = new b(bVar);
            bVar.enqueue(new C0628a(bVar2));
            return bVar2;
        }
    }

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    private static final class b<T> extends CompletableFuture<T> {

        /* renamed from: B, reason: collision with root package name */
        private final nd.b<?> f45866B;

        b(nd.b<?> bVar) {
            this.f45866B = bVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            if (z10) {
                this.f45866B.cancel();
            }
            return super.cancel(z10);
        }
    }

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    private static final class c<R> implements nd.c<R, CompletableFuture<s<R>>> {

        /* renamed from: a, reason: collision with root package name */
        private final Type f45867a;

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        private class a implements d<R> {

            /* renamed from: a, reason: collision with root package name */
            private final CompletableFuture<s<R>> f45868a;

            public a(CompletableFuture<s<R>> completableFuture) {
                this.f45868a = completableFuture;
            }

            @Override // nd.d
            public void onFailure(nd.b<R> bVar, Throwable th) {
                this.f45868a.completeExceptionally(th);
            }

            @Override // nd.d
            public void onResponse(nd.b<R> bVar, s<R> sVar) {
                this.f45868a.complete(sVar);
            }
        }

        c(Type type) {
            this.f45867a = type;
        }

        @Override // nd.c
        public Type a() {
            return this.f45867a;
        }

        @Override // nd.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<s<R>> b(nd.b<R> bVar) {
            b bVar2 = new b(bVar);
            bVar.enqueue(new a(bVar2));
            return bVar2;
        }
    }

    e() {
    }

    @Override // nd.c.a
    public nd.c<?, ?> a(Type type, Annotation[] annotationArr, t tVar) {
        if (c.a.c(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeB = c.a.b(0, (ParameterizedType) type);
        if (c.a.c(typeB) != s.class) {
            return new a(typeB);
        }
        if (typeB instanceof ParameterizedType) {
            return new c(c.a.b(0, (ParameterizedType) typeB));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
