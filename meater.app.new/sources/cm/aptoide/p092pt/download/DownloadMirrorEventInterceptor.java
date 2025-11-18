package cm.aptoide.p092pt.download;

import cm.aptoide.p092pt.downloadmanager.Constants;
import cm.aptoide.p092pt.install.InstallAnalytics;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes.dex */
public class DownloadMirrorEventInterceptor implements Interceptor {
    private final DownloadAnalytics downloadAnalytics;
    private final InstallAnalytics installAnalytics;

    public DownloadMirrorEventInterceptor(DownloadAnalytics downloadAnalytics, InstallAnalytics installAnalytics) {
        this.downloadAnalytics = downloadAnalytics;
        this.installAnalytics = installAnalytics;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws NumberFormatException, IOException {
        Request request = chain.request();
        String strHeader = request.header(Constants.VERSION_CODE);
        String strHeader2 = request.header(Constants.PACKAGE);
        int i2 = Integer.parseInt(request.header(Constants.FILE_TYPE));
        Response responseProceed = chain.proceed(request.newBuilder().removeHeader(Constants.VERSION_CODE).removeHeader(Constants.PACKAGE).removeHeader(Constants.FILE_TYPE).build());
        if (responseProceed != null && responseProceed.headers() != null) {
            this.installAnalytics.updateInstallEvents(Integer.valueOf(strHeader).intValue(), strHeader2, i2, request.url().getUrl());
        }
        return responseProceed;
    }
}
