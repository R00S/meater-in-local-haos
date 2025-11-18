package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C9848l;
import kotlinx.coroutines.C10884b2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.Dispatchers;
import okhttp3.HttpUrl;

/* compiled from: HandlerDispatcher.kt */
@Metadata(m32266d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002J\u001c\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0016J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100#H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u0000X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m32267d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/Delay;", "handler", "Landroid/os/Handler;", "name", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/os/Handler;Ljava/lang/String;)V", "invokeImmediately", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/os/Handler;Ljava/lang/String;Z)V", "_immediate", "immediate", "getImmediate", "()Lkotlinx/coroutines/android/HandlerContext;", "cancelOnRejection", HttpUrl.FRAGMENT_ENCODE_SET, "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatch", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", HttpUrl.FRAGMENT_ENCODE_SET, "isDispatchNeeded", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "kotlinx-coroutines-android"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.android.a, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class HandlerContext extends HandlerDispatcher implements Delay {
    private volatile HandlerContext _immediate;

    /* renamed from: g */
    private final Handler f41567g;

    /* renamed from: h */
    private final String f41568h;

    /* renamed from: i */
    private final boolean f41569i;

    /* renamed from: j */
    private final HandlerContext f41570j;

    /* compiled from: Runnable.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "run", "kotlinx/coroutines/RunnableKt$Runnable$1"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.android.a$a */
    public static final class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ CancellableContinuation f41571f;

        /* renamed from: g */
        final /* synthetic */ HandlerContext f41572g;

        public a(CancellableContinuation cancellableContinuation, HandlerContext handlerContext) {
            this.f41571f = cancellableContinuation;
            this.f41572g = handlerContext;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f41571f.mo39634h(this.f41572g, C10775u.f41439a);
        }
    }

    /* compiled from: HandlerDispatcher.kt */
    @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "it", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.android.a$b */
    static final class b extends Lambda implements Function1<Throwable, C10775u> {

        /* renamed from: g */
        final /* synthetic */ Runnable f41574g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.f41574g = runnable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(Throwable th) {
            invoke2(th);
            return C10775u.f41439a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            HandlerContext.this.f41567g.removeCallbacks(this.f41574g);
        }
    }

    private HandlerContext(Handler handler, String str, boolean z) {
        super(null);
        this.f41567g = handler;
        this.f41568h = str;
        this.f41569i = z;
        this._immediate = z ? this : null;
        HandlerContext handlerContext = this._immediate;
        if (handlerContext == null) {
            handlerContext = new HandlerContext(handler, str, true);
            this._immediate = handlerContext;
        }
        this.f41570j = handlerContext;
    }

    /* renamed from: Z */
    private final void m39105Z(CoroutineContext coroutineContext, Runnable runnable) {
        C10884b2.m39122c(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Dispatchers.m39301b().mo39106K(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: K */
    public void mo39106K(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f41567g.post(runnable)) {
            return;
        }
        m39105Z(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: N */
    public boolean mo39107N(CoroutineContext coroutineContext) {
        return (this.f41569i && C9801m.m32341a(Looper.myLooper(), this.f41567g.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    /* renamed from: a0, reason: from getter and merged with bridge method [inline-methods] */
    public HandlerContext mo39108T() {
        return this.f41570j;
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: e */
    public void mo39110e(long j2, CancellableContinuation<? super C10775u> cancellableContinuation) {
        a aVar = new a(cancellableContinuation, this);
        if (this.f41567g.postDelayed(aVar, C9848l.m32422e(j2, 4611686018427387903L))) {
            cancellableContinuation.mo39632e(new b(aVar));
        } else {
            m39105Z(cancellableContinuation.getContext(), aVar);
        }
    }

    public boolean equals(Object other) {
        return (other instanceof HandlerContext) && ((HandlerContext) other).f41567g == this.f41567g;
    }

    public int hashCode() {
        return System.identityHashCode(this.f41567g);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String strM39439W = m39439W();
        if (strM39439W != null) {
            return strM39439W;
        }
        String string = this.f41568h;
        if (string == null) {
            string = this.f41567g.toString();
        }
        if (!this.f41569i) {
            return string;
        }
        return string + ".immediate";
    }

    public /* synthetic */ HandlerContext(Handler handler, String str, int i2, C9789g c9789g) {
        this(handler, (i2 & 2) != 0 ? null : str);
    }

    public HandlerContext(Handler handler, String str) {
        this(handler, str, false);
    }
}
