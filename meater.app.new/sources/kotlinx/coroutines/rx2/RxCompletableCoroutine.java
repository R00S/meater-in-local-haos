package kotlinx.coroutines.rx2;

import kotlin.C10775u;
import kotlin.C9821b;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractCoroutine;
import okhttp3.HttpUrl;
import p323h.p324a.InterfaceC9066c;

/* compiled from: RxCompletable.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m32267d2 = {"Lkotlinx/coroutines/rx2/RxCompletableCoroutine;", "Lkotlinx/coroutines/AbstractCoroutine;", HttpUrl.FRAGMENT_ENCODE_SET, "parentContext", "Lkotlin/coroutines/CoroutineContext;", "subscriber", "Lio/reactivex/CompletableEmitter;", "(Lkotlin/coroutines/CoroutineContext;Lio/reactivex/CompletableEmitter;)V", "onCancelled", "cause", HttpUrl.FRAGMENT_ENCODE_SET, "handled", HttpUrl.FRAGMENT_ENCODE_SET, "onCompleted", "value", "(Lkotlin/Unit;)V", "kotlinx-coroutines-rx2"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.b3.e, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
final class RxCompletableCoroutine extends AbstractCoroutine<C10775u> {

    /* renamed from: h */
    private final InterfaceC9066c f41586h;

    public RxCompletableCoroutine(CoroutineContext coroutineContext, InterfaceC9066c interfaceC9066c) {
        super(coroutineContext, false, true);
        this.f41586h = interfaceC9066c;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    /* renamed from: D0 */
    protected void mo39078D0(Throwable th, boolean z) {
        try {
            if (this.f41586h.mo29171c(th)) {
                return;
            }
        } catch (Throwable th2) {
            C9821b.m32367a(th, th2);
        }
        C10888d.m39126a(th, getF41861l());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractCoroutine
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public void mo39079E0(C10775u c10775u) {
        try {
            this.f41586h.mo29169a();
        } catch (Throwable th) {
            C10888d.m39126a(th, getF41861l());
        }
    }
}
