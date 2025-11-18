package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.ThreadContextElement;
import okhttp3.HttpUrl;

/* compiled from: ThreadContext.kt */
@Metadata(m32266d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"$\u0010\u0002\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\",\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m32267d2 = {"NO_THREAD_ELEMENTS", "Lkotlinx/coroutines/internal/Symbol;", "countAll", "Lkotlin/Function2;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/coroutines/CoroutineContext$Element;", "findOne", "Lkotlinx/coroutines/ThreadContextElement;", "updateState", "Lkotlinx/coroutines/internal/ThreadState;", "restoreThreadContext", HttpUrl.FRAGMENT_ENCODE_SET, "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "threadContextElements", "updateThreadContext", "countOrElement", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.i0 */
/* loaded from: classes3.dex */
public final class C10986i0 {

    /* renamed from: a */
    public static final Symbol f41784a = new Symbol("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    private static final Function2<Object, CoroutineContext.b, Object> f41785b = a.f41788f;

    /* renamed from: c */
    private static final Function2<ThreadContextElement<?>, CoroutineContext.b, ThreadContextElement<?>> f41786c = b.f41789f;

    /* renamed from: d */
    private static final Function2<ThreadState, CoroutineContext.b, ThreadState> f41787d = c.f41790f;

    /* compiled from: ThreadContext.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<no name provided>", HttpUrl.FRAGMENT_ENCODE_SET, "countOrElement", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.internal.i0$a */
    static final class a extends Lambda implements Function2<Object, CoroutineContext.b, Object> {

        /* renamed from: f */
        public static final a f41788f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, CoroutineContext.b bVar) {
            if (!(bVar instanceof ThreadContextElement)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
        }
    }

    /* compiled from: ThreadContext.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<no name provided>", "Lkotlinx/coroutines/ThreadContextElement;", "found", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.internal.i0$b */
    static final class b extends Lambda implements Function2<ThreadContextElement<?>, CoroutineContext.b, ThreadContextElement<?>> {

        /* renamed from: f */
        public static final b f41789f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ThreadContextElement<?> invoke(ThreadContextElement<?> threadContextElement, CoroutineContext.b bVar) {
            if (threadContextElement != null) {
                return threadContextElement;
            }
            if (bVar instanceof ThreadContextElement) {
                return (ThreadContextElement) bVar;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<no name provided>", "Lkotlinx/coroutines/internal/ThreadState;", "state", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.internal.i0$c */
    static final class c extends Lambda implements Function2<ThreadState, CoroutineContext.b, ThreadState> {

        /* renamed from: f */
        public static final c f41790f = new c();

        c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ThreadState invoke(ThreadState threadState, CoroutineContext.b bVar) {
            if (bVar instanceof ThreadContextElement) {
                ThreadContextElement<?> threadContextElement = (ThreadContextElement) bVar;
                threadState.m39532a(threadContextElement, threadContextElement.mo39623I(threadState.f41801a));
            }
            return threadState;
        }
    }

    /* renamed from: a */
    public static final void m39490a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f41784a) {
            return;
        }
        if (obj instanceof ThreadState) {
            ((ThreadState) obj).m39533b(coroutineContext);
            return;
        }
        Object objFold = coroutineContext.fold(null, f41786c);
        if (objFold == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
        ((ThreadContextElement) objFold).mo39627z(coroutineContext, obj);
    }

    /* renamed from: b */
    public static final Object m39491b(CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, f41785b);
        C9801m.m32343c(objFold);
        return objFold;
    }

    /* renamed from: c */
    public static final Object m39492c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = m39491b(coroutineContext);
        }
        return obj == 0 ? f41784a : obj instanceof Integer ? coroutineContext.fold(new ThreadState(coroutineContext, ((Number) obj).intValue()), f41787d) : ((ThreadContextElement) obj).mo39623I(coroutineContext);
    }
}
