package nd;

import Xb.C1849m;
import Xb.InterfaceC1847l;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4172q;
import oa.C4173r;
import retrofit2.HttpException;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: KotlinExtensions.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00060\bj\u0002`\tH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"", "T", "Lnd/b;", "a", "(Lnd/b;Lta/d;)Ljava/lang/Object;", "b", "Lnd/s;", "c", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "d", "(Ljava/lang/Exception;Lta/d;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class l {

    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "", "it", "Loa/F;", "a", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$await$2$1"}, k = 3, mv = {1, 4, 0})
    static final class a extends AbstractC3864v implements Ba.l<Throwable, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ nd.b f45893B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(nd.b bVar) {
            super(1);
            this.f45893B = bVar;
        }

        public final void a(Throwable th) {
            this.f45893B.cancel();
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "", "it", "Loa/F;", "a", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$await$4$1"}, k = 3, mv = {1, 4, 0})
    static final class b extends AbstractC3864v implements Ba.l<Throwable, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ nd.b f45894B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(nd.b bVar) {
            super(1);
            this.f45894B = bVar;
        }

        public final void a(Throwable th) {
            this.f45894B.cancel();
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"nd/l$c", "Lnd/d;", "Lnd/b;", "call", "Lnd/s;", "response", "Loa/F;", "onResponse", "(Lnd/b;Lnd/s;)V", "", "t", "onFailure", "(Lnd/b;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {1, 4, 0})
    public static final class c<T> implements nd.d<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1847l f45895a;

        c(InterfaceC1847l interfaceC1847l) {
            this.f45895a = interfaceC1847l;
        }

        @Override // nd.d
        public void onFailure(nd.b<T> call, Throwable t10) {
            C3862t.h(call, "call");
            C3862t.h(t10, "t");
            InterfaceC1847l interfaceC1847l = this.f45895a;
            C4172q.Companion companion = C4172q.INSTANCE;
            interfaceC1847l.resumeWith(C4172q.a(C4173r.a(t10)));
        }

        @Override // nd.d
        public void onResponse(nd.b<T> call, s<T> response) {
            C3862t.h(call, "call");
            C3862t.h(response, "response");
            if (!response.f()) {
                InterfaceC1847l interfaceC1847l = this.f45895a;
                HttpException httpException = new HttpException(response);
                C4172q.Companion companion = C4172q.INSTANCE;
                interfaceC1847l.resumeWith(C4172q.a(C4173r.a(httpException)));
                return;
            }
            T tA = response.a();
            if (tA != null) {
                this.f45895a.resumeWith(C4172q.a(tA));
                return;
            }
            Object objJ = call.request().j(k.class);
            if (objJ == null) {
                C3862t.q();
            }
            C3862t.c(objJ, "call.request().tag(Invocation::class.java)!!");
            Method method = ((k) objJ).a();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Response from ");
            C3862t.c(method, "method");
            Class<?> declaringClass = method.getDeclaringClass();
            C3862t.c(declaringClass, "method.declaringClass");
            sb2.append(declaringClass.getName());
            sb2.append('.');
            sb2.append(method.getName());
            sb2.append(" was null but response body type was declared as non-null");
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb2.toString());
            InterfaceC1847l interfaceC1847l2 = this.f45895a;
            C4172q.Companion companion2 = C4172q.INSTANCE;
            interfaceC1847l2.resumeWith(C4172q.a(C4173r.a(kotlinNullPointerException)));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J/\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"nd/l$d", "Lnd/d;", "Lnd/b;", "call", "Lnd/s;", "response", "Loa/F;", "onResponse", "(Lnd/b;Lnd/s;)V", "", "t", "onFailure", "(Lnd/b;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {1, 4, 0})
    public static final class d<T> implements nd.d<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1847l f45896a;

        d(InterfaceC1847l interfaceC1847l) {
            this.f45896a = interfaceC1847l;
        }

        @Override // nd.d
        public void onFailure(nd.b<T> call, Throwable t10) {
            C3862t.h(call, "call");
            C3862t.h(t10, "t");
            InterfaceC1847l interfaceC1847l = this.f45896a;
            C4172q.Companion companion = C4172q.INSTANCE;
            interfaceC1847l.resumeWith(C4172q.a(C4173r.a(t10)));
        }

        @Override // nd.d
        public void onResponse(nd.b<T> call, s<T> response) {
            C3862t.h(call, "call");
            C3862t.h(response, "response");
            if (response.f()) {
                this.f45896a.resumeWith(C4172q.a(response.a()));
                return;
            }
            InterfaceC1847l interfaceC1847l = this.f45896a;
            HttpException httpException = new HttpException(response);
            C4172q.Companion companion = C4172q.INSTANCE;
            interfaceC1847l.resumeWith(C4172q.a(C4173r.a(httpException)));
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "L;", "it", "Loa/F;", "invoke", "(L;)V", "kotlin/Throwable", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    static final class e extends AbstractC3864v implements Ba.l<Throwable, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ nd.b f45897B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(nd.b bVar) {
            super(1);
            this.f45897B = bVar;
        }

        public final void a(Throwable th) {
            this.f45897B.cancel();
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"nd/l$f", "Lnd/d;", "Lnd/b;", "call", "Lnd/s;", "response", "Loa/F;", "onResponse", "(Lnd/b;Lnd/s;)V", "", "t", "onFailure", "(Lnd/b;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {1, 4, 0})
    public static final class f<T> implements nd.d<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1847l f45898a;

        f(InterfaceC1847l interfaceC1847l) {
            this.f45898a = interfaceC1847l;
        }

        @Override // nd.d
        public void onFailure(nd.b<T> call, Throwable t10) {
            C3862t.h(call, "call");
            C3862t.h(t10, "t");
            InterfaceC1847l interfaceC1847l = this.f45898a;
            C4172q.Companion companion = C4172q.INSTANCE;
            interfaceC1847l.resumeWith(C4172q.a(C4173r.a(t10)));
        }

        @Override // nd.d
        public void onResponse(nd.b<T> call, s<T> response) {
            C3862t.h(call, "call");
            C3862t.h(response, "response");
            this.f45898a.resumeWith(C4172q.a(response));
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Loa/F;", "run", "()V", "retrofit2/KotlinExtensions$suspendAndThrow$2$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    static final class g implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC4588d f45899B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Exception f45900C;

        g(InterfaceC4588d interfaceC4588d, Exception exc) {
            this.f45899B = interfaceC4588d;
            this.f45900C = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC4588d interfaceC4588dC = C4696b.c(this.f45899B);
            Exception exc = this.f45900C;
            C4172q.Companion companion = C4172q.INSTANCE;
            interfaceC4588dC.resumeWith(C4172q.a(C4173r.a(exc)));
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @kotlin.coroutines.jvm.internal.f(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00060\u0000j\u0002`\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "Lta/d;", "", "continuation", "", "suspendAndThrow", "(Ljava/lang/Exception;Lta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        /* synthetic */ Object f45901B;

        /* renamed from: C, reason: collision with root package name */
        int f45902C;

        /* renamed from: D, reason: collision with root package name */
        Object f45903D;

        h(InterfaceC4588d interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f45901B = obj;
            this.f45902C |= Integer.MIN_VALUE;
            return l.d(null, this);
        }
    }

    public static final <T> Object a(nd.b<T> bVar, InterfaceC4588d<? super T> interfaceC4588d) {
        C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
        c1849m.R(new a(bVar));
        bVar.enqueue(new c(c1849m));
        Object objR = c1849m.r();
        if (objR == C4696b.e()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
        }
        return objR;
    }

    public static final <T> Object b(nd.b<T> bVar, InterfaceC4588d<? super T> interfaceC4588d) {
        C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
        c1849m.R(new b(bVar));
        bVar.enqueue(new d(c1849m));
        Object objR = c1849m.r();
        if (objR == C4696b.e()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
        }
        return objR;
    }

    public static final <T> Object c(nd.b<T> bVar, InterfaceC4588d<? super s<T>> interfaceC4588d) {
        C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
        c1849m.R(new e(bVar));
        bVar.enqueue(new f(c1849m));
        Object objR = c1849m.r();
        if (objR == C4696b.e()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
        }
        return objR;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(java.lang.Exception r4, ta.InterfaceC4588d<?> r5) {
        /*
            boolean r0 = r5 instanceof nd.l.h
            if (r0 == 0) goto L13
            r0 = r5
            nd.l$h r0 = (nd.l.h) r0
            int r1 = r0.f45902C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45902C = r1
            goto L18
        L13:
            nd.l$h r0 = new nd.l$h
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f45901B
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f45902C
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f45903D
            java.lang.Exception r4 = (java.lang.Exception) r4
            oa.C4173r.b(r5)
            goto L5c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            oa.C4173r.b(r5)
            r0.f45903D = r4
            r0.f45902C = r3
            Xb.E r5 = Xb.Z.a()
            ta.g r2 = r0.getContext()
            nd.l$g r3 = new nd.l$g
            r3.<init>(r0, r4)
            r5.p0(r2, r3)
            java.lang.Object r4 = ua.C4696b.e()
            java.lang.Object r5 = ua.C4696b.e()
            if (r4 != r5) goto L59
            kotlin.coroutines.jvm.internal.h.c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            oa.F r4 = oa.C4153F.f46609a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.l.d(java.lang.Exception, ta.d):java.lang.Object");
    }
}
