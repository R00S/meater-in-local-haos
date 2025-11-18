package cm.aptoide.p092pt.apkfy;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: ApkfyManager.kt */
@Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m32267d2 = {"Lcm/aptoide/pt/apkfy/ApkfyManager;", HttpUrl.FRAGMENT_ENCODE_SET, "apkfyService", "Lcm/aptoide/pt/apkfy/ApkfyService;", "(Lcm/aptoide/pt/apkfy/ApkfyService;)V", "getApkfy", "Lcm/aptoide/pt/apkfy/ApkfyModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class ApkfyManager {
    private final ApkfyService apkfyService;

    public ApkfyManager(ApkfyService apkfyService) {
        C9801m.m32346f(apkfyService, "apkfyService");
        this.apkfyService = apkfyService;
    }

    public final Object getApkfy(Continuation<? super ApkfyModel> continuation) {
        return this.apkfyService.getApkfy(continuation);
    }
}
