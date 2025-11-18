package cm.aptoide.p092pt.home.more.base;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.view.app.Application;
import java.util.List;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import p456rx.C11234e;

/* compiled from: ListAppsView.kt */
@Metadata(m32266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\tH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0016\u0010\u0012\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\b\u0010\u0013\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0005H&J\b\u0010\u0015\u001a\u00020\u0005H&J\b\u0010\u0016\u001a\u00020\u0005H&¨\u0006\u0017"}, m32267d2 = {"Lcm/aptoide/pt/home/more/base/ListAppsView;", "T", "Lcm/aptoide/pt/view/app/Application;", "Lcm/aptoide/pt/presenter/View;", "addApps", HttpUrl.FRAGMENT_ENCODE_SET, DeepLinkIntentReceiver.DeepLinksTargets.APPS, HttpUrl.FRAGMENT_ENCODE_SET, "errorRetryClick", "Lrx/Observable;", "Ljava/lang/Void;", "getItemClickEvents", "Lcm/aptoide/pt/home/more/base/ListAppsClickEvent;", "onBottomReached", "refreshEvents", "setToolbarInfo", "title", HttpUrl.FRAGMENT_ENCODE_SET, "showApps", "showGenericError", "showHeader", "showLoading", "showNoNetworkError", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public interface ListAppsView<T extends Application> extends View {
    void addApps(List<? extends T> apps);

    C11234e<Void> errorRetryClick();

    C11234e<ListAppsClickEvent<T>> getItemClickEvents();

    C11234e<Void> onBottomReached();

    C11234e<Void> refreshEvents();

    void setToolbarInfo(String title);

    void showApps(List<? extends T> apps);

    void showGenericError();

    void showHeader();

    void showLoading();

    void showNoNetworkError();
}
