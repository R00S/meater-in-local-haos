package cm.aptoide.aptoideviews.downloadprogressview;

import cm.aptoide.aptoideviews.downloadprogressview.Event;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;

/* compiled from: DownloadProgressView.kt */
@Metadata(m32266d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
final class DownloadProgressView$setupClickListeners$1$1 extends Lambda implements Function0<C10775u> {
    final /* synthetic */ DownloadProgressView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadProgressView$setupClickListeners$1$1(DownloadProgressView downloadProgressView) {
        super(0);
        this.this$0 = downloadProgressView;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C10775u invoke() {
        invoke2();
        return C10775u.f41439a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.stateMachine.m29076g(Event.CancelClick.INSTANCE);
    }
}
