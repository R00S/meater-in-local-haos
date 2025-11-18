package cm.aptoide.p092pt.home.apps.list.models;

import cm.aptoide.p092pt.home.apps.AppClick;
import cm.aptoide.p092pt.home.apps.model.DownloadApp;
import cm.aptoide.p092pt.home.apps.model.StateApp;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import p456rx.p473s.C11418b;

/* compiled from: DownloadCardModel.kt */
@Metadata(m32266d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
final class DownloadCardModel$setupListeners$1$1 extends Lambda implements Function0<C10775u> {
    final /* synthetic */ DownloadApp $app;
    final /* synthetic */ DownloadCardModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadCardModel$setupListeners$1$1(DownloadApp downloadApp, DownloadCardModel downloadCardModel) {
        super(0);
        this.$app = downloadApp;
        this.this$0 = downloadCardModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C10775u invoke() {
        invoke2();
        return C10775u.f41439a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AppClick.ClickType clickType = AppClick.ClickType.CARD_CLICK;
        StateApp.Status status = this.$app.getStatus();
        if (status != null && status == StateApp.Status.STANDBY) {
            clickType = AppClick.ClickType.INSTALL_CLICK;
        }
        C11418b<AppClick> eventSubject = this.this$0.getEventSubject();
        if (eventSubject != null) {
            eventSubject.onNext(new AppClick(this.$app, clickType));
        }
    }
}
