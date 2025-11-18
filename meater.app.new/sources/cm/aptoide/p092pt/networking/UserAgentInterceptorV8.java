package cm.aptoide.p092pt.networking;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.preferences.AptoideMd5Manager;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes.dex */
public class UserAgentInterceptorV8 implements Interceptor {
    private final String androidVersion;
    private final int apiLevel;
    private final AptoideMd5Manager aptoideMd5Manager;
    private final String aptoidePackage;
    private final int aptoideVersionCode;
    private final String architecture;
    private final AuthenticationPersistence authenticationPersistence;
    private final DisplayMetrics displayMetrics;
    private final IdsRepository idsRepository;
    private final String model;
    private final String productCode;
    private final String versionName;

    public UserAgentInterceptorV8(IdsRepository idsRepository, String str, int i2, String str2, String str3, String str4, DisplayMetrics displayMetrics, String str5, String str6, AptoideMd5Manager aptoideMd5Manager, int i3, AuthenticationPersistence authenticationPersistence) {
        this.idsRepository = idsRepository;
        this.androidVersion = str;
        this.apiLevel = i2;
        this.model = str2;
        this.productCode = str3;
        this.architecture = str4;
        this.displayMetrics = displayMetrics;
        this.versionName = str5;
        this.aptoidePackage = str6;
        this.aptoideMd5Manager = aptoideMd5Manager;
        this.aptoideVersionCode = i3;
        this.authenticationPersistence = authenticationPersistence;
    }

    public String getDefaultUserAgent() throws InterruptedException {
        StringBuilder sb = new StringBuilder("Aptoide/" + this.versionName + " (Linux; Android " + this.androidVersion + "; " + this.apiLevel + "; " + this.model + " Build/" + this.productCode + "; " + this.architecture + "; " + this.aptoidePackage + "; " + this.aptoideVersionCode + "; " + this.aptoideMd5Manager.getAptoideMd5() + "; " + (this.displayMetrics.widthPixels + "x" + this.displayMetrics.heightPixels) + "; ");
        String strM40633b = this.idsRepository.getUniqueIdentifier().m39933y().m40633b();
        if (strM40633b != null) {
            sb.append(strM40633b);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws InterruptedException, IOException {
        String defaultUserAgent;
        Request request = chain.request();
        try {
            defaultUserAgent = getDefaultUserAgent();
        } catch (Exception e2) {
            CrashReport.getInstance().log(e2);
            defaultUserAgent = null;
        }
        try {
            Authentication authenticationM40633b = this.authenticationPersistence.getAuthentication().m39933y().m40633b();
            Request.Builder builderNewBuilder = request.newBuilder();
            if (!authenticationM40633b.isAuthenticated() && TextUtils.isEmpty(defaultUserAgent)) {
                return chain.proceed(request);
            }
            if (authenticationM40633b.isAuthenticated()) {
                builderNewBuilder.header("AUTHORIZATION", authenticationM40633b.getAccessToken());
            }
            if (!TextUtils.isEmpty(defaultUserAgent)) {
                builderNewBuilder.header("User-Agent", defaultUserAgent);
            }
            return chain.proceed(builderNewBuilder.build());
        } catch (IOException e3) {
            CrashReport.getInstance().log(e3);
            throw e3;
        }
    }
}
