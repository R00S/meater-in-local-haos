package cm.aptoide.p092pt.networking;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import cm.aptoide.p092pt.crashreports.CrashReport;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes.dex */
public class UserAgentInterceptorDownloads implements Interceptor {
    private final DisplayMetrics displayMetrics;
    private final IdsRepository idsRepository;
    private final String oemid;
    private final String terminalInfo;
    private final String versionName;

    public UserAgentInterceptorDownloads(IdsRepository idsRepository, String str, DisplayMetrics displayMetrics, String str2, String str3) {
        this.idsRepository = idsRepository;
        this.oemid = str;
        this.displayMetrics = displayMetrics;
        this.terminalInfo = str2;
        this.versionName = str3;
    }

    private String getDefaultUserAgent() throws InterruptedException {
        StringBuilder sb = new StringBuilder(this.versionName + ";" + this.terminalInfo + ";" + (this.displayMetrics.widthPixels + "x" + this.displayMetrics.heightPixels) + ";id:");
        String strM40633b = this.idsRepository.getUniqueIdentifier().m39933y().m40633b();
        if (strM40633b != null) {
            sb.append(strM40633b);
        }
        sb.append(";");
        sb.append(";");
        if (!TextUtils.isEmpty(this.oemid)) {
            sb.append(this.oemid);
        }
        return sb.toString();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        String defaultUserAgent;
        Request request = chain.request();
        try {
            defaultUserAgent = getDefaultUserAgent();
        } catch (Exception e2) {
            CrashReport.getInstance().log(e2);
            defaultUserAgent = null;
        }
        try {
            return !TextUtils.isEmpty(defaultUserAgent) ? chain.proceed(request.newBuilder().header("User-Agent", defaultUserAgent).build()) : chain.proceed(request);
        } catch (IOException e3) {
            CrashReport.getInstance().log(e3);
            throw e3;
        }
    }
}
