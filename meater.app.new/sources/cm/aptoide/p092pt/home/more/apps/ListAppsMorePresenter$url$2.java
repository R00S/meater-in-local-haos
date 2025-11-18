package cm.aptoide.p092pt.home.more.apps;

import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C10546u;
import okhttp3.HttpUrl;

/* compiled from: ListAppsMorePresenter.kt */
@Metadata(m32266d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
final class ListAppsMorePresenter$url$2 extends Lambda implements Function0<String> {
    final /* synthetic */ ListAppsMorePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ListAppsMorePresenter$url$2(ListAppsMorePresenter listAppsMorePresenter) {
        super(0);
        this.this$0 = listAppsMorePresenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        if (this.this$0.listAppsConfiguration.getAction() == null) {
            return null;
        }
        ListAppsMorePresenter listAppsMorePresenter = this.this$0;
        if (AbstractC2229V7.isUrlBaseCache(listAppsMorePresenter.listAppsConfiguration.getAction())) {
            String action = listAppsMorePresenter.listAppsConfiguration.getAction();
            String cacheHost = AbstractC2229V7.getCacheHost(listAppsMorePresenter.sharedPreferences);
            C9801m.m32345e(cacheHost, "getCacheHost(sharedPreferences)");
            return C10546u.m37507A(action, cacheHost, HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null);
        }
        String action2 = listAppsMorePresenter.listAppsConfiguration.getAction();
        String host = AbstractC2229V7.getHost(listAppsMorePresenter.sharedPreferences);
        C9801m.m32345e(host, "getHost(sharedPreferences)");
        return C10546u.m37507A(action2, host, HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null);
    }
}
