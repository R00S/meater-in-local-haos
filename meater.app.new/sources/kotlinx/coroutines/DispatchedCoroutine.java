package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C10854c;
import kotlin.coroutines.intrinsics.C10855d;
import kotlinx.coroutines.internal.C10985i;
import kotlinx.coroutines.internal.ScopeCoroutine;
import okhttp3.HttpUrl;

/* compiled from: Builders.common.kt */
@Metadata(m32266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0015B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m32267d2 = {"Lkotlinx/coroutines/DispatchedCoroutine;", "T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", HttpUrl.FRAGMENT_ENCODE_SET, "state", HttpUrl.FRAGMENT_ENCODE_SET, "afterCompletion", "(Ljava/lang/Object;)V", "afterResume", "getResult", "()Ljava/lang/Object;", HttpUrl.FRAGMENT_ENCODE_SET, "tryResume", "()Z", "trySuspend", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/ScopeCoroutine;"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.a1, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class DispatchedCoroutine<T> extends ScopeCoroutine<T> {

    /* renamed from: i */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f41565i = AtomicIntegerFieldUpdater.newUpdater(DispatchedCoroutine.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public DispatchedCoroutine(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
        this._decision = 0;
    }

    /* renamed from: I0 */
    private final boolean m39091I0() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f41565i.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: J0 */
    private final boolean m39092J0() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f41565i.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    /* renamed from: C0 */
    protected void mo39077C0(Object obj) {
        if (m39091I0()) {
            return;
        }
        C10985i.m39489c(C10854c.m39044b(this.f41768h), C10937e0.m39296a(obj, this.f41768h), null, 2, null);
    }

    /* renamed from: H0 */
    public final Object m39093H0() {
        if (m39092J0()) {
            return C10855d.m39045c();
        }
        Object objM39407h = C10960g2.m39407h(m39350X());
        if (objM39407h instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) objM39407h).f41577b;
        }
        return objM39407h;
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.JobSupport
    /* renamed from: v */
    protected void mo39094v(Object obj) {
        mo39077C0(obj);
    }
}
