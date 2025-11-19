package X5;

import Z3.a;
import c6.CommonResponse;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oc.E;
import ta.InterfaceC4588d;

@Metadata(d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aj\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Out", "In", "Lkotlin/Function1;", "Lta/d;", "Lnd/s;", "", "call", "Lkotlin/Function2;", "parse", "LZ3/a;", "d", "(LBa/l;LBa/p;Lta/d;)Ljava/lang/Object;", "Loc/E;", "errorBody", "Lc6/a;", "a", "(Loc/E;)Lc6/a;", "T", "", "code", "", "message", "b", "(ILjava/lang/String;)LZ3/a;", "network_playstoreLiveRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e {

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.common.RetrofitApiCallKt", f = "retrofitApiCall.kt", l = {17, 21}, m = "retrofitApiCall")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a<Out, In> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f18762B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f18763C;

        /* renamed from: D, reason: collision with root package name */
        int f18764D;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18763C = obj;
            this.f18764D |= Integer.MIN_VALUE;
            return e.d(null, null, this);
        }
    }

    public static final CommonResponse a(E e10) {
        Gson gson = new Gson();
        C3862t.d(e10);
        Object objK = gson.k(e10.j(), CommonResponse.class);
        C3862t.f(objK, "fromJson(...)");
        return (CommonResponse) objK;
    }

    private static final <T> Z3.a<T> b(int i10, String str) {
        return (399 > i10 || i10 >= 500) ? new a.ServerError(i10, str) : new a.ClientError(i10, str);
    }

    static /* synthetic */ Z3.a c(int i10, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return b(i10, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <Out, In> java.lang.Object d(Ba.l<? super ta.InterfaceC4588d<? super nd.s<In>>, ? extends java.lang.Object> r7, Ba.p<? super In, ? super ta.InterfaceC4588d<? super Out>, ? extends java.lang.Object> r8, ta.InterfaceC4588d<? super Z3.a<Out>> r9) {
        /*
            boolean r0 = r9 instanceof X5.e.a
            if (r0 == 0) goto L13
            r0 = r9
            X5.e$a r0 = (X5.e.a) r0
            int r1 = r0.f18764D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18764D = r1
            goto L18
        L13:
            X5.e$a r0 = new X5.e$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f18763C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f18764D
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r3) goto L35
            if (r2 != r4) goto L2d
            oa.C4173r.b(r9)     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.f18762B
            r8 = r7
            Ba.p r8 = (Ba.p) r8
            oa.C4173r.b(r9)     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            goto L4c
        L3e:
            oa.C4173r.b(r9)
            r0.f18762B = r8     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            r0.f18764D = r3     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            java.lang.Object r9 = r7.invoke(r0)     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            if (r9 != r1) goto L4c
            return r1
        L4c:
            nd.s r9 = (nd.s) r9     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            java.lang.Object r7 = r9.a()     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            int r2 = r9.b()     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            boolean r6 = r9.f()     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            if (r6 == 0) goto L6f
            if (r7 == 0) goto L6f
            r0.f18762B = r5     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            r0.f18764D = r4     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            java.lang.Object r9 = r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            if (r9 != r1) goto L69
            return r1
        L69:
            Z3.a$d r7 = new Z3.a$d     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            r7.<init>(r9)     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            goto Lb3
        L6f:
            boolean r8 = r9.f()     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            if (r8 == 0) goto L7c
            if (r7 != 0) goto L7c
            Z3.a r7 = c(r2, r5, r4, r5)     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            goto Lb3
        L7c:
            r7 = 400(0x190, float:5.6E-43)
            if (r2 != r7) goto L95
            oc.E r7 = r9.d()     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            c6.a r7 = a(r7)     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            int r8 = r7.getErrorCode()     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            Z3.a r7 = b(r8, r7)     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            goto Lb3
        L95:
            oc.E r7 = r9.d()     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            c6.a r7 = a(r7)     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            Z3.a r7 = b(r2, r7)     // Catch: java.lang.Throwable -> La6 java.net.UnknownHostException -> Lae
            goto Lb3
        La6:
            Z3.a$a r7 = new Z3.a$a
            r8 = 404(0x194, float:5.66E-43)
            r7.<init>(r8, r5, r4, r5)
            goto Lb3
        Lae:
            Z3.a$b r7 = new Z3.a$b
            r7.<init>(r5, r3, r5)
        Lb3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X5.e.d(Ba.l, Ba.p, ta.d):java.lang.Object");
    }
}
