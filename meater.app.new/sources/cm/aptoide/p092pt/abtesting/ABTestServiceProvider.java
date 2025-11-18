package cm.aptoide.p092pt.abtesting;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.abtesting.ABTestService;
import cm.aptoide.p092pt.abtesting.BaseExperiment;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import cm.aptoide.p092pt.preferences.toolbox.ToolboxManager;
import okhttp3.OkHttpClient;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public class ABTestServiceProvider {
    private Converter.Factory converterFactory;
    private OkHttpClient httpClient;
    private CallAdapter.Factory rxCallAdapterFactory;
    private SharedPreferences sharedPreferences;

    public ABTestServiceProvider(OkHttpClient okHttpClient, Converter.Factory factory, CallAdapter.Factory factory2, SharedPreferences sharedPreferences) {
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.rxCallAdapterFactory = factory2;
        this.sharedPreferences = sharedPreferences;
    }

    private Retrofit createRetrofit(String str) {
        return new Retrofit.Builder().baseUrl(str).client(this.httpClient).addCallAdapterFactory(this.rxCallAdapterFactory).addConverterFactory(this.converterFactory).build();
    }

    private String decorateWithSchemeAndAPI(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(this.sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(str);
        sb.append("/api/v1/");
        return sb.toString();
    }

    private ABTestService.ABTestingService getABTestService(String str) {
        return (ABTestService.ABTestingService) createRetrofit(str).create(ABTestService.ABTestingService.class);
    }

    public ABTestService.ABTestingService getService(BaseExperiment.ExperimentType experimentType) {
        if (experimentType.equals(BaseExperiment.ExperimentType.RAKAM)) {
            return getABTestService(decorateWithSchemeAndAPI(BuildConfig.APTOIDE_WEB_SERVICES_AB_TEST_HOST));
        }
        if (experimentType.equals(BaseExperiment.ExperimentType.WASABI)) {
            return getABTestService(decorateWithSchemeAndAPI(BuildConfig.APTOIDE_WEB_SERVICES_AB_TESTING_HOST));
        }
        throw new IllegalStateException("You need to pass a valid ExperimentType! All experiments must be assigned to an Experiment type so that the base host can be correctly assigned");
    }
}
