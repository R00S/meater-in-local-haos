package kotlinx.coroutines.rx2;

import kotlin.Metadata;
import kotlinx.coroutines.Job;
import okhttp3.HttpUrl;
import p323h.p324a.p328y.InterfaceC9096d;

/* compiled from: RxCancellable.kt */
@Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m32267d2 = {"Lkotlinx/coroutines/rx2/RxCancellable;", "Lio/reactivex/functions/Cancellable;", "job", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)V", "cancel", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-rx2"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.b3.c, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class RxCancellable implements InterfaceC9096d {

    /* renamed from: a */
    private final Job f41585a;

    public RxCancellable(Job job) {
        this.f41585a = job;
    }

    @Override // p323h.p324a.p328y.InterfaceC9096d
    public void cancel() {
        Job.a.m39712a(this.f41585a, null, 1, null);
    }
}
