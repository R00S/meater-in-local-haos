package cm.aptoide.p092pt.home.more.apps;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.ads.data.AptoideNativeAd;
import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.app.view.AppViewFragment;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.home.more.base.ListAppsClickEvent;
import cm.aptoide.p092pt.home.more.base.ListAppsPresenter;
import cm.aptoide.p092pt.home.more.base.ListAppsView;
import cm.aptoide.p092pt.search.model.SearchAdResult;
import cm.aptoide.p092pt.view.app.Application;
import java.util.List;
import kotlin.C10550i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.AbstractC11243h;
import p456rx.C11234e;

/* compiled from: ListAppsMorePresenter.kt */
@Metadata(m32266d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\u0016\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0016J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001a0\u0019H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m32267d2 = {"Lcm/aptoide/pt/home/more/apps/ListAppsMorePresenter;", "Lcm/aptoide/pt/home/more/base/ListAppsPresenter;", "Lcm/aptoide/pt/view/app/Application;", "view", "Lcm/aptoide/pt/home/more/base/ListAppsView;", "viewScheduler", "Lrx/Scheduler;", "crashReporter", "Lcm/aptoide/pt/crashreports/CrashReport;", "appNavigator", "Lcm/aptoide/pt/app/AppNavigator;", "sharedPreferences", "Landroid/content/SharedPreferences;", "listAppsConfiguration", "Lcm/aptoide/pt/home/more/apps/ListAppsConfiguration;", "listAppsMoreManager", "Lcm/aptoide/pt/home/more/apps/ListAppsMoreManager;", "(Lcm/aptoide/pt/home/more/base/ListAppsView;Lrx/Scheduler;Lcm/aptoide/pt/crashreports/CrashReport;Lcm/aptoide/pt/app/AppNavigator;Landroid/content/SharedPreferences;Lcm/aptoide/pt/home/more/apps/ListAppsConfiguration;Lcm/aptoide/pt/home/more/apps/ListAppsMoreManager;)V", "url", HttpUrl.FRAGMENT_ENCODE_SET, "getUrl", "()Ljava/lang/String;", "url$delegate", "Lkotlin/Lazy;", "getApps", "Lrx/Observable;", HttpUrl.FRAGMENT_ENCODE_SET, "refresh", HttpUrl.FRAGMENT_ENCODE_SET, "getTitle", "handleAppClick", HttpUrl.FRAGMENT_ENCODE_SET, "appClickEvent", "Lcm/aptoide/pt/home/more/base/ListAppsClickEvent;", "loadMoreApps", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public class ListAppsMorePresenter extends ListAppsPresenter<Application> {
    private final AppNavigator appNavigator;
    private final ListAppsConfiguration listAppsConfiguration;
    private final ListAppsMoreManager listAppsMoreManager;
    private final SharedPreferences sharedPreferences;
    private final Lazy url$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListAppsMorePresenter(ListAppsView<Application> listAppsView, AbstractC11243h abstractC11243h, CrashReport crashReport, AppNavigator appNavigator, SharedPreferences sharedPreferences, ListAppsConfiguration listAppsConfiguration, ListAppsMoreManager listAppsMoreManager) {
        super(listAppsView, abstractC11243h, crashReport);
        C9801m.m32346f(listAppsView, "view");
        C9801m.m32346f(abstractC11243h, "viewScheduler");
        C9801m.m32346f(crashReport, "crashReporter");
        C9801m.m32346f(appNavigator, "appNavigator");
        C9801m.m32346f(sharedPreferences, "sharedPreferences");
        C9801m.m32346f(listAppsConfiguration, "listAppsConfiguration");
        C9801m.m32346f(listAppsMoreManager, "listAppsMoreManager");
        this.appNavigator = appNavigator;
        this.sharedPreferences = sharedPreferences;
        this.listAppsConfiguration = listAppsConfiguration;
        this.listAppsMoreManager = listAppsMoreManager;
        this.url$delegate = C10550i.m37593a(LazyThreadSafetyMode.NONE, new ListAppsMorePresenter$url$2(this));
    }

    private final String getUrl() {
        return (String) this.url$delegate.getValue();
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsPresenter
    public C11234e<List<Application>> getApps(boolean z) {
        return ListAppsMoreManager.loadFreshApps$default(this.listAppsMoreManager, getUrl(), z, this.listAppsConfiguration.getEventName(), null, 8, null);
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsPresenter
    public String getTitle() {
        String title = this.listAppsConfiguration.getTitle();
        return title == null ? HttpUrl.FRAGMENT_ENCODE_SET : title;
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsPresenter
    public void handleAppClick(ListAppsClickEvent<Application> appClickEvent) {
        C9801m.m32346f(appClickEvent, "appClickEvent");
        if (appClickEvent.getApplication() instanceof AptoideNativeAd) {
            this.appNavigator.navigateWithAd(new SearchAdResult((AptoideNativeAd) appClickEvent.getApplication()), this.listAppsConfiguration.getTag());
        } else {
            this.appNavigator.navigateWithAppId(appClickEvent.getApplication().getAppId(), appClickEvent.getApplication().getPackageName(), AppViewFragment.OpenType.OPEN_ONLY, this.listAppsConfiguration.getTag());
        }
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsPresenter
    public C11234e<List<Application>> loadMoreApps() {
        return this.listAppsMoreManager.loadMoreApps(getUrl(), true, this.listAppsConfiguration.getEventName());
    }
}
