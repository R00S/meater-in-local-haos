package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.p442j.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9788f0;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;

/* compiled from: CoroutineContext.kt */
@Metadata(m32266d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a8\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\f0\u0012H\u0080\b¢\u0006\u0002\u0010\u0013\u001a4\u0010\u0014\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\f0\u0012H\u0080\b¢\u0006\u0002\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\n*\u00020\u0003H\u0002\u001a\u0014\u0010\u0018\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0018\u001a\u00020\u0003*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0003H\u0007\u001a\u0013\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c*\u00020\u001dH\u0080\u0010\u001a(\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006 "}, m32267d2 = {"DEBUG_THREAD_NAME_SEPARATOR", HttpUrl.FRAGMENT_ENCODE_SET, "coroutineName", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineName", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "foldCopies", "originalContext", "appendContext", "isNewCoroutine", HttpUrl.FRAGMENT_ENCODE_SET, "withContinuationContext", "T", "continuation", "Lkotlin/coroutines/Continuation;", "countOrElement", HttpUrl.FRAGMENT_ENCODE_SET, "block", "Lkotlin/Function0;", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withCoroutineContext", "context", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "hasCopyableElements", "newCoroutineContext", "addedContext", "Lkotlinx/coroutines/CoroutineScope;", "undispatchedCompletion", "Lkotlinx/coroutines/UndispatchedCoroutine;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "updateUndispatchedCompletion", "oldValue", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.h0 */
/* loaded from: classes3.dex */
public final class C10962h0 {

    /* compiled from: CoroutineContext.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "result", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.h0$a */
    static final class a extends Lambda implements Function2<CoroutineContext, CoroutineContext.b, CoroutineContext> {

        /* renamed from: f */
        public static final a f41750f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.b bVar) {
            return bVar instanceof CopyableThreadContextElement ? coroutineContext.plus(((CopyableThreadContextElement) bVar).m39312p()) : coroutineContext.plus(bVar);
        }
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "result", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.h0$b */
    static final class b extends Lambda implements Function2<CoroutineContext, CoroutineContext.b, CoroutineContext> {

        /* renamed from: f */
        final /* synthetic */ C9788f0<CoroutineContext> f41751f;

        /* renamed from: g */
        final /* synthetic */ boolean f41752g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C9788f0<CoroutineContext> c9788f0, boolean z) {
            super(2);
            this.f41751f = c9788f0;
            this.f41752g = z;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlin.y.g] */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.b bVar) {
            if (!(bVar instanceof CopyableThreadContextElement)) {
                return coroutineContext.plus(bVar);
            }
            CoroutineContext.b bVar2 = this.f41751f.f37179f.get(bVar.getKey());
            if (bVar2 != null) {
                C9788f0<CoroutineContext> c9788f0 = this.f41751f;
                c9788f0.f37179f = c9788f0.f37179f.minusKey(bVar.getKey());
                return coroutineContext.plus(((CopyableThreadContextElement) bVar).m39311d(bVar2));
            }
            CopyableThreadContextElement copyableThreadContextElementM39312p = (CopyableThreadContextElement) bVar;
            if (this.f41752g) {
                copyableThreadContextElementM39312p = copyableThreadContextElementM39312p.m39312p();
            }
            return coroutineContext.plus(copyableThreadContextElementM39312p);
        }
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(m32266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "result", "it", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(ZLkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Boolean;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.h0$c */
    static final class c extends Lambda implements Function2<Boolean, CoroutineContext.b, Boolean> {

        /* renamed from: f */
        public static final c f41753f = new c();

        c() {
            super(2);
        }

        /* renamed from: b */
        public final Boolean m39422b(boolean z, CoroutineContext.b bVar) {
            return Boolean.valueOf(z || (bVar instanceof CopyableThreadContextElement));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, CoroutineContext.b bVar) {
            return m39422b(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* renamed from: a */
    private static final CoroutineContext m39413a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        boolean zM39415c = m39415c(coroutineContext);
        boolean zM39415c2 = m39415c(coroutineContext2);
        if (!zM39415c && !zM39415c2) {
            return coroutineContext.plus(coroutineContext2);
        }
        C9788f0 c9788f0 = new C9788f0();
        c9788f0.f37179f = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f41531f;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new b(c9788f0, z));
        if (zM39415c2) {
            c9788f0.f37179f = ((CoroutineContext) c9788f0.f37179f).fold(emptyCoroutineContext, a.f41750f);
        }
        return coroutineContext3.plus((CoroutineContext) c9788f0.f37179f);
    }

    /* renamed from: b */
    public static final String m39414b(CoroutineContext coroutineContext) {
        CoroutineId coroutineId;
        String f41856g;
        if (!C11045s0.m39683c() || (coroutineId = (CoroutineId) coroutineContext.get(CoroutineId.f41851f)) == null) {
            return null;
        }
        CoroutineName coroutineName = (CoroutineName) coroutineContext.get(CoroutineName.f41855f);
        if (coroutineName == null || (f41856g = coroutineName.getF41856g()) == null) {
            f41856g = "coroutine";
        }
        return f41856g + '#' + coroutineId.getF41852g();
    }

    /* renamed from: c */
    private static final boolean m39415c(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, c.f41753f)).booleanValue();
    }

    /* renamed from: d */
    public static final CoroutineContext m39416d(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        return !m39415c(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : m39413a(coroutineContext, coroutineContext2, false);
    }

    /* renamed from: e */
    public static final CoroutineContext m39417e(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextM39413a = m39413a(coroutineScope.getF41775f(), coroutineContext, true);
        CoroutineContext coroutineContextPlus = C11045s0.m39683c() ? coroutineContextM39413a.plus(new CoroutineId(C11045s0.m39682b().incrementAndGet())) : coroutineContextM39413a;
        return (coroutineContextM39413a == Dispatchers.m39300a() || coroutineContextM39413a.get(ContinuationInterceptor.f41528b) != null) ? coroutineContextPlus : coroutineContextPlus.plus(Dispatchers.m39300a());
    }

    /* renamed from: f */
    public static final UndispatchedCoroutine<?> m39418f(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof DispatchedCoroutine) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof UndispatchedCoroutine) {
                return (UndispatchedCoroutine) coroutineStackFrame;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final UndispatchedCoroutine<?> m39419g(Continuation<?> continuation, CoroutineContext coroutineContext, Object obj) {
        if (!(continuation instanceof CoroutineStackFrame)) {
            return null;
        }
        if (!(coroutineContext.get(UndispatchedMarker.f41898f) != null)) {
            return null;
        }
        UndispatchedCoroutine<?> undispatchedCoroutineM39418f = m39418f((CoroutineStackFrame) continuation);
        if (undispatchedCoroutineM39418f != null) {
            undispatchedCoroutineM39418f.m39706I0(coroutineContext, obj);
        }
        return undispatchedCoroutineM39418f;
    }
}
