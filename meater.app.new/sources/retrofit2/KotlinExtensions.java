package retrofit2;

import java.lang.reflect.Method;
import kotlin.C10568o;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10854c;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.C10863h;
import kotlin.coroutines.p442j.internal.ContinuationImpl;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.HttpUrl;

/* compiled from: KotlinExtensions.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00060\u000bj\u0002`\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m32267d2 = {"T", "Lretrofit2/Retrofit;", "create", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", HttpUrl.FRAGMENT_ENCODE_SET, "Lretrofit2/Call;", "await", "(Lretrofit2/Call;Lkotlin/y/d;)Ljava/lang/Object;", "awaitNullable", "Lretrofit2/Response;", "awaitResponse", "Ljava/lang/Exception;", "Lkotlin/Exception;", HttpUrl.FRAGMENT_ENCODE_SET, "suspendAndThrow", "(Ljava/lang/Exception;Lkotlin/y/d;)Ljava/lang/Object;", "retrofit"}, m32268k = 2, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class KotlinExtensions {

    /* compiled from: KotlinExtensions.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00060\u0000j\u0002`\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007"}, m32267d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlin/y/d;", HttpUrl.FRAGMENT_ENCODE_SET, "continuation", HttpUrl.FRAGMENT_ENCODE_SET, "suspendAndThrow", "(Ljava/lang/Exception;Lkotlin/y/d;)Ljava/lang/Object;"}, m32268k = 3, m32269mv = {1, 4, 0})
    @DebugMetadata(m39049c = "retrofit2.KotlinExtensions", m39050f = "KotlinExtensions.kt", m39051l = {113}, m39052m = "suspendAndThrow")
    /* renamed from: retrofit2.KotlinExtensions$suspendAndThrow$1 */
    static final class C112101 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C112101(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinExtensions.suspendAndThrow(null, this);
        }
    }

    public static final <T> Object await(Call<T> call, Continuation<? super T> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C10854c.m39044b(continuation), 1);
        cancellableContinuationImpl.mo39632e(new C11206x19835f10(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t) {
                C9801m.m32347g(call2, "call");
                C9801m.m32347g(t, "t");
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                Result.a aVar = Result.f40714f;
                cancellableContinuation.resumeWith(Result.m37650a(C10568o.m37654a(t)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                C9801m.m32347g(call2, "call");
                C9801m.m32347g(response, "response");
                if (!response.isSuccessful()) {
                    CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                    HttpException httpException = new HttpException(response);
                    Result.a aVar = Result.f40714f;
                    cancellableContinuation.resumeWith(Result.m37650a(C10568o.m37654a(httpException)));
                    return;
                }
                T tBody = response.body();
                if (tBody != null) {
                    CancellableContinuation cancellableContinuation2 = cancellableContinuationImpl;
                    Result.a aVar2 = Result.f40714f;
                    cancellableContinuation2.resumeWith(Result.m37650a(tBody));
                    return;
                }
                Object objTag = call2.request().tag(Invocation.class);
                if (objTag == null) {
                    C9801m.m32357q();
                }
                C9801m.m32342b(objTag, "call.request().tag(Invocation::class.java)!!");
                Method method = ((Invocation) objTag).method();
                StringBuilder sb = new StringBuilder();
                sb.append("Response from ");
                C9801m.m32342b(method, "method");
                Class<?> declaringClass = method.getDeclaringClass();
                C9801m.m32342b(declaringClass, "method.declaringClass");
                sb.append(declaringClass.getName());
                sb.append('.');
                sb.append(method.getName());
                sb.append(" was null but response body type was declared as non-null");
                KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
                CancellableContinuation cancellableContinuation3 = cancellableContinuationImpl;
                Result.a aVar3 = Result.f40714f;
                cancellableContinuation3.resumeWith(Result.m37650a(C10568o.m37654a(kotlinNullPointerException)));
            }
        });
        Object objM39664w = cancellableContinuationImpl.m39664w();
        if (objM39664w == C10855d.m39045c()) {
            C10863h.m39060c(continuation);
        }
        return objM39664w;
    }

    public static final <T> Object awaitNullable(Call<T> call, Continuation<? super T> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C10854c.m39044b(continuation), 1);
        cancellableContinuationImpl.mo39632e(new C11207x19835f11(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t) {
                C9801m.m32347g(call2, "call");
                C9801m.m32347g(t, "t");
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                Result.a aVar = Result.f40714f;
                cancellableContinuation.resumeWith(Result.m37650a(C10568o.m37654a(t)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                C9801m.m32347g(call2, "call");
                C9801m.m32347g(response, "response");
                if (response.isSuccessful()) {
                    CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                    T tBody = response.body();
                    Result.a aVar = Result.f40714f;
                    cancellableContinuation.resumeWith(Result.m37650a(tBody));
                    return;
                }
                CancellableContinuation cancellableContinuation2 = cancellableContinuationImpl;
                HttpException httpException = new HttpException(response);
                Result.a aVar2 = Result.f40714f;
                cancellableContinuation2.resumeWith(Result.m37650a(C10568o.m37654a(httpException)));
            }
        });
        Object objM39664w = cancellableContinuationImpl.m39664w();
        if (objM39664w == C10855d.m39045c()) {
            C10863h.m39060c(continuation);
        }
        return objM39664w;
    }

    public static final <T> Object awaitResponse(Call<T> call, Continuation<? super Response<T>> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C10854c.m39044b(continuation), 1);
        cancellableContinuationImpl.mo39632e(new C11208xc95e9eb1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t) {
                C9801m.m32347g(call2, "call");
                C9801m.m32347g(t, "t");
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                Result.a aVar = Result.f40714f;
                cancellableContinuation.resumeWith(Result.m37650a(C10568o.m37654a(t)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                C9801m.m32347g(call2, "call");
                C9801m.m32347g(response, "response");
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                Result.a aVar = Result.f40714f;
                cancellableContinuation.resumeWith(Result.m37650a(response));
            }
        });
        Object objM39664w = cancellableContinuationImpl.m39664w();
        if (objM39664w == C10855d.m39045c()) {
            C10863h.m39060c(continuation);
        }
        return objM39664w;
    }

    public static final /* synthetic */ <T> T create(Retrofit retrofit) {
        C9801m.m32347g(retrofit, "$this$create");
        C9801m.m32351k(4, "T");
        return (T) retrofit.create(Object.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object suspendAndThrow(final java.lang.Exception r4, kotlin.coroutines.Continuation<?> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions.C112101
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions.C112101) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            kotlin.C10568o.m37655b(r5)
            goto L5c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C10568o.m37655b(r5)
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.i0 r5 = kotlinx.coroutines.Dispatchers.m39300a()
            kotlin.y.g r2 = r0.getF41861l()
            retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1 r3 = new retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1
            r3.<init>()
            r5.mo39106K(r2, r3)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            if (r4 != r5) goto L59
            kotlin.coroutines.p442j.internal.C10863h.m39060c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            kotlin.u r4 = kotlin.C10775u.f41439a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.suspendAndThrow(java.lang.Exception, kotlin.y.d):java.lang.Object");
    }
}
