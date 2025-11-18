package cm.aptoide.p092pt.dataprovider.cache;

import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.utils.AptoideUtils;
import java.io.IOException;
import okhttp3.Request;
import p353j.C9703f;

/* loaded from: classes.dex */
public class Sha1KeyAlgorithm implements KeyAlgorithm<Request, String> {
    private static final String TAG = "cm.aptoide.pt.dataprovider.cache.Sha1KeyAlgorithm";

    @Override // cm.aptoide.p092pt.dataprovider.cache.KeyAlgorithm
    public String getKeyFrom(Request request) {
        String url;
        try {
            C9703f c9703f = new C9703f();
            Request requestBuild = request.newBuilder().build();
            if (requestBuild.body() == null || requestBuild.body().contentLength() <= 0) {
                url = requestBuild.url().getUrl();
            } else {
                requestBuild.body().writeTo(c9703f);
                url = requestBuild.url().getUrl() + c9703f.m32021T();
            }
            return AptoideUtils.AlgorithmU.computeSha1(url);
        } catch (IOException e2) {
            CrashReport.getInstance().log(e2);
            return null;
        }
    }
}
