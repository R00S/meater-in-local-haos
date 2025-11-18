package kotlinx.coroutines.rx2;

import java.util.concurrent.CancellationException;
import kotlin.C9821b;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C11017l0;
import okhttp3.HttpUrl;
import p323h.p324a.p325a0.C9063a;

/* compiled from: RxCancellable.kt */
@Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, m32267d2 = {"handleUndeliverableException", HttpUrl.FRAGMENT_ENCODE_SET, "cause", HttpUrl.FRAGMENT_ENCODE_SET, "context", "Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-rx2"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.b3.d */
/* loaded from: classes3.dex */
public final class C10888d {
    /* renamed from: a */
    public static final void m39126a(Throwable th, CoroutineContext coroutineContext) {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            C9063a.m29147o(th);
        } catch (Throwable th2) {
            C9821b.m32367a(th, th2);
            C11017l0.m39620a(coroutineContext, th);
        }
    }
}
