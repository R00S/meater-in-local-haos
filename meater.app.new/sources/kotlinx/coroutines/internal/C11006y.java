package kotlinx.coroutines.internal;

import kotlin.C10775u;
import kotlin.C9821b;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11017l0;
import okhttp3.HttpUrl;

/* compiled from: OnUndeliveredElement.kt */
@Metadata(m32266d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0004*\u0018\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u0002H\u0004`\u00052\u0006\u0010\u0006\u001a\u0002H\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\u0010\t\u001a=\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\u0018\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u0002H\u0004`\u00052\u0006\u0010\u0006\u001a\u0002H\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\u0010\u000b\u001aC\u0010\f\u001a\u0004\u0018\u00010\r\"\u0004\b\u0000\u0010\u0004*\u0018\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u0002H\u0004`\u00052\u0006\u0010\u0006\u001a\u0002H\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\u0010\u000f**\b\u0000\u0010\u0010\u001a\u0004\b\u0000\u0010\u0004\"\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0011"}, m32267d2 = {"bindCancellationFun", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "E", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)Lkotlin/jvm/functions/Function1;", "callUndeliveredElement", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "callUndeliveredElementCatchingException", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "undeliveredElementException", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlinx/coroutines/internal/UndeliveredElementException;)Lkotlinx/coroutines/internal/UndeliveredElementException;", "OnUndeliveredElement", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.y */
/* loaded from: classes3.dex */
public final class C11006y {

    /* compiled from: OnUndeliveredElement.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "E", "<anonymous parameter 0>", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.internal.y$a */
    static final class a extends Lambda implements Function1<Throwable, C10775u> {

        /* renamed from: f */
        final /* synthetic */ Function1<E, C10775u> f41836f;

        /* renamed from: g */
        final /* synthetic */ E f41837g;

        /* renamed from: h */
        final /* synthetic */ CoroutineContext f41838h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super E, C10775u> function1, E e2, CoroutineContext coroutineContext) {
            super(1);
            this.f41836f = function1;
            this.f41837g = e2;
            this.f41838h = coroutineContext;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(Throwable th) {
            invoke2(th);
            return C10775u.f41439a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C11006y.m39592b(this.f41836f, this.f41837g, this.f41838h);
        }
    }

    /* renamed from: a */
    public static final <E> Function1<Throwable, C10775u> m39591a(Function1<? super E, C10775u> function1, E e2, CoroutineContext coroutineContext) {
        return new a(function1, e2, coroutineContext);
    }

    /* renamed from: b */
    public static final <E> void m39592b(Function1<? super E, C10775u> function1, E e2, CoroutineContext coroutineContext) {
        UndeliveredElementException undeliveredElementExceptionM39593c = m39593c(function1, e2, null);
        if (undeliveredElementExceptionM39593c != null) {
            C11017l0.m39620a(coroutineContext, undeliveredElementExceptionM39593c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final <E> UndeliveredElementException m39593c(Function1<? super E, C10775u> function1, E e2, UndeliveredElementException undeliveredElementException) {
        try {
            function1.invoke(e2);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e2, th);
            }
            C9821b.m32367a(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    /* renamed from: d */
    public static /* synthetic */ UndeliveredElementException m39594d(Function1 function1, Object obj, UndeliveredElementException undeliveredElementException, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            undeliveredElementException = null;
        }
        return m39593c(function1, obj, undeliveredElementException);
    }
}
