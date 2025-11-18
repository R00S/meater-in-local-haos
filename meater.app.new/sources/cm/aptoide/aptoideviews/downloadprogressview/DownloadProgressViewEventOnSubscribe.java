package cm.aptoide.aptoideviews.downloadprogressview;

import cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p457l.AbstractC11247a;

/* compiled from: EventObservable.kt */
@Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressViewEventOnSubscribe;", "Lrx/Observable$OnSubscribe;", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action;", "view", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", "(Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;)V", "getView", "()Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", "call", HttpUrl.FRAGMENT_ENCODE_SET, "subscriber", "Lrx/Subscriber;", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class DownloadProgressViewEventOnSubscribe implements C11234e.a<DownloadEventListener.Action> {
    private final DownloadProgressView view;

    public DownloadProgressViewEventOnSubscribe(DownloadProgressView downloadProgressView) {
        C9801m.m32346f(downloadProgressView, "view");
        this.view = downloadProgressView;
    }

    public final DownloadProgressView getView() {
        return this.view;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    public void call(final AbstractC11245j<? super DownloadEventListener.Action> abstractC11245j) {
        C9801m.m32346f(abstractC11245j, "subscriber");
        AbstractC11247a.verifyMainThread();
        DownloadEventListener downloadEventListener = new DownloadEventListener() { // from class: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressViewEventOnSubscribe$call$eventListener$1
            @Override // cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener
            public void onActionClick(DownloadEventListener.Action action) {
                C9801m.m32346f(action, "action");
                if (abstractC11245j.isUnsubscribed()) {
                    return;
                }
                abstractC11245j.onNext(action);
            }
        };
        abstractC11245j.add(new AbstractC11247a() { // from class: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressViewEventOnSubscribe.call.1
            @Override // p456rx.p457l.AbstractC11247a
            protected void onUnsubscribe() {
                DownloadProgressViewEventOnSubscribe.this.getView().setEventListener(null);
            }
        });
        this.view.setEventListener(downloadEventListener);
    }
}
