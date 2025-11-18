package cm.aptoide.p092pt.apkfy;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;

/* compiled from: ApkfyResponse.kt */
@Metadata(m32266d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m32267d2 = {"mapToApkfyModel", "Lcm/aptoide/pt/apkfy/ApkfyModel;", "Lcm/aptoide/pt/apkfy/ApkfyResponse;", "app_vanillaProdRelease"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class ApkfyResponseKt {
    public static final ApkfyModel mapToApkfyModel(ApkfyResponse apkfyResponse) {
        C9801m.m32346f(apkfyResponse, "<this>");
        return new ApkfyModel(apkfyResponse.getPackageName(), apkfyResponse.getAppId(), apkfyResponse.getOemid(), apkfyResponse.getGuestUId(), apkfyResponse.getUtmSource(), apkfyResponse.getUtmMedium(), apkfyResponse.getUtmCampaign(), apkfyResponse.getUtmTerm(), apkfyResponse.getUtmContent());
    }
}
