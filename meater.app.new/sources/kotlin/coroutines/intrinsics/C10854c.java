package kotlin.coroutines.intrinsics;

import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.p442j.internal.BaseContinuationImpl;
import kotlin.coroutines.p442j.internal.C10863h;
import kotlin.coroutines.p442j.internal.ContinuationImpl;
import kotlin.coroutines.p442j.internal.RestrictedContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9800l0;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IntrinsicsJvm.kt */
@Metadata(m32266d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\u001c\b\u0004\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0083\b¢\u0006\u0002\b\b\u001aD\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a]\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u0002H\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007\u001aA\u0010\u0011\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001aZ\u0010\u0011\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u0002H\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001an\u0010\u0011\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0014\"\u0004\b\u0002\u0010\u0003*)\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0015¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u0002H\u000b2\u0006\u0010\u0016\u001a\u0002H\u00142\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0081\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m32267d2 = {"createCoroutineFromSuspendFunction", "Lkotlin/coroutines/Continuation;", HttpUrl.FRAGMENT_ENCODE_SET, "T", "completion", "block", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "createCoroutineUnintercepted", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "intercepted", "startCoroutineUninterceptedOrReturn", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "P", "Lkotlin/Function3;", "param", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, m32268k = 5, m32269mv = {1, 7, 1}, m32271xi = 49, m32272xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
/* renamed from: kotlin.y.i.c */
/* loaded from: classes2.dex */
public class C10854c {

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(m32266d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014ø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t¸\u0006\u0000"}, m32267d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "label", HttpUrl.FRAGMENT_ENCODE_SET, "invokeSuspend", HttpUrl.FRAGMENT_ENCODE_SET, "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.y.i.c$a */
    public static final class a extends RestrictedContinuationImpl {

        /* renamed from: f */
        private int f41536f;

        /* renamed from: g */
        final /* synthetic */ Function2 f41537g;

        /* renamed from: h */
        final /* synthetic */ Object f41538h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Continuation continuation, Function2 function2, Object obj) {
            super(continuation);
            this.f41537g = function2;
            this.f41538h = obj;
            C9801m.m32344d(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        protected Object invokeSuspend(Object result) throws Throwable {
            int i2 = this.f41536f;
            if (i2 == 0) {
                this.f41536f = 1;
                C10568o.m37655b(result);
                C9801m.m32344d(this.f41537g, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                return ((Function2) C9800l0.m32330e(this.f41537g, 2)).invoke(this.f41538h, this);
            }
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f41536f = 2;
            C10568o.m37655b(result);
            return result;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(m32266d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014ø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t¸\u0006\u0000"}, m32267d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "label", HttpUrl.FRAGMENT_ENCODE_SET, "invokeSuspend", HttpUrl.FRAGMENT_ENCODE_SET, "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.y.i.c$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: f */
        private int f41539f;

        /* renamed from: g */
        final /* synthetic */ Function2 f41540g;

        /* renamed from: h */
        final /* synthetic */ Object f41541h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, CoroutineContext coroutineContext, Function2 function2, Object obj) {
            super(continuation, coroutineContext);
            this.f41540g = function2;
            this.f41541h = obj;
            C9801m.m32344d(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        protected Object invokeSuspend(Object result) throws Throwable {
            int i2 = this.f41539f;
            if (i2 == 0) {
                this.f41539f = 1;
                C10568o.m37655b(result);
                C9801m.m32344d(this.f41540g, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                return ((Function2) C9800l0.m32330e(this.f41540g, 2)).invoke(this.f41541h, this);
            }
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f41539f = 2;
            C10568o.m37655b(result);
            return result;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <R, T> Continuation<C10775u> m39043a(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation) {
        C9801m.m32346f(function2, "<this>");
        C9801m.m32346f(continuation, "completion");
        Continuation<?> continuationM39058a = C10863h.m39058a(continuation);
        if (function2 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) function2).create(r, continuationM39058a);
        }
        CoroutineContext context = continuationM39058a.getContext();
        return context == EmptyCoroutineContext.f41531f ? new a(continuationM39058a, function2, r) : new b(continuationM39058a, context, function2, r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static <T> Continuation<T> m39044b(Continuation<? super T> continuation) {
        Continuation<T> continuation2;
        C9801m.m32346f(continuation, "<this>");
        ContinuationImpl continuationImpl = continuation instanceof ContinuationImpl ? (ContinuationImpl) continuation : null;
        return (continuationImpl == null || (continuation2 = (Continuation<T>) continuationImpl.intercepted()) == null) ? continuation : continuation2;
    }
}
