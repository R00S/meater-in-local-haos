package kotlinx.coroutines.rx2;

import kotlin.C9821b;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractCoroutine;
import okhttp3.HttpUrl;
import p323h.p324a.InterfaceC9083t;

/* compiled from: RxSingle.kt */
@Metadata(m32266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m32267d2 = {"Lkotlinx/coroutines/rx2/RxSingleCoroutine;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/AbstractCoroutine;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "subscriber", "Lio/reactivex/SingleEmitter;", "(Lkotlin/coroutines/CoroutineContext;Lio/reactivex/SingleEmitter;)V", "onCancelled", HttpUrl.FRAGMENT_ENCODE_SET, "cause", HttpUrl.FRAGMENT_ENCODE_SET, "handled", HttpUrl.FRAGMENT_ENCODE_SET, "onCompleted", "value", "(Ljava/lang/Object;)V", "kotlinx-coroutines-rx2"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.b3.g, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
final class RxSingleCoroutine<T> extends AbstractCoroutine<T> {

    /* renamed from: h */
    private final InterfaceC9083t<T> f41587h;

    public RxSingleCoroutine(CoroutineContext coroutineContext, InterfaceC9083t<T> interfaceC9083t) {
        super(coroutineContext, false, true);
        this.f41587h = interfaceC9083t;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    /* renamed from: D0 */
    protected void mo39078D0(Throwable th, boolean z) {
        try {
            if (this.f41587h.mo29235c(th)) {
                return;
            }
        } catch (Throwable th2) {
            C9821b.m32367a(th, th2);
        }
        C10888d.m39126a(th, getF41861l());
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    /* renamed from: E0 */
    protected void mo39079E0(T t) {
        try {
            this.f41587h.onSuccess(t);
        } catch (Throwable th) {
            C10888d.m39126a(th, getF41861l());
        }
    }
}
