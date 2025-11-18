package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: Exceptions.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u0015\u0010\u0007\u001a\u00020\b*\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0080\b*\n\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\n"}, m32267d2 = {"CancellationException", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "message", HttpUrl.FRAGMENT_ENCODE_SET, "cause", HttpUrl.FRAGMENT_ENCODE_SET, "addSuppressedThrowable", HttpUrl.FRAGMENT_ENCODE_SET, "other", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.n1 */
/* loaded from: classes3.dex */
public final class C11026n1 {
    /* renamed from: a */
    public static final CancellationException m39640a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
