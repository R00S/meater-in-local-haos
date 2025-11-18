package cm.aptoide.p092pt.view.fragment;

import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.WindowManager;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.ads.AdNetworkUtils;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.repository.request.RequestFactory;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.view.recycler.BaseAdapter;
import okhttp3.OkHttpClient;
import retrofit2.Converter;

/* loaded from: classes.dex */
public abstract class AptoideBaseFragment<T extends BaseAdapter> extends GridRecyclerFragment<T> {
    protected RequestFactory requestFactoryCdnPool;
    protected RequestFactory requestFactoryCdnWeb;

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        BodyInterceptor<BaseBody> accountSettingsBodyInterceptorPoolV7 = ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7();
        OkHttpClient defaultClient = ((AptoideApplication) getContext().getApplicationContext()).getDefaultClient();
        Converter.Factory defaultConverter = WebService.getDefaultConverter();
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        AptoideAccountManager accountManager = aptoideApplication.getAccountManager();
        StoreCredentialsProvider storeCredentials = ((AptoideApplication) getContext().getApplicationContext()).getStoreCredentials();
        this.requestFactoryCdnPool = new RequestFactory(storeCredentials, accountSettingsBodyInterceptorPoolV7, defaultClient, defaultConverter, ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator(), ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences(), getContext().getResources(), (WindowManager) getContext().getSystemService("window"), aptoideApplication.getIdsRepository().getUniqueIdentifier().m39933y().m40633b(), aptoideApplication.getPartnerId(), accountManager, aptoideApplication.getQManager().getFilters(ManagerPreferences.getHWSpecsFilter(((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences())), (ConnectivityManager) getContext().getSystemService("connectivity"), aptoideApplication.getVersionCodeProvider(), AdNetworkUtils.isGooglePlayServicesAvailable(getContext()), aptoideApplication.getAppCoinsManager());
        this.requestFactoryCdnWeb = new RequestFactory(storeCredentials, ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorWebV7(), defaultClient, defaultConverter, ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator(), ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences(), getContext().getResources(), (WindowManager) getContext().getSystemService("window"), aptoideApplication.getIdsRepository().getUniqueIdentifier().m39933y().m40633b(), aptoideApplication.getPartnerId(), accountManager, aptoideApplication.getQManager().getFilters(ManagerPreferences.getHWSpecsFilter(((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences())), (ConnectivityManager) getContext().getSystemService("connectivity"), aptoideApplication.getVersionCodeProvider(), AdNetworkUtils.isGooglePlayServicesAvailable(getContext()), aptoideApplication.getAppCoinsManager());
        super.onCreate(bundle);
    }
}
