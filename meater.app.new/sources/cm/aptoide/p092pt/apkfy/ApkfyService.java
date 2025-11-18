package cm.aptoide.p092pt.apkfy;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.HttpUrl;

/* compiled from: ApkfyService.kt */
@Metadata(m32266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, m32267d2 = {"Lcm/aptoide/pt/apkfy/ApkfyService;", HttpUrl.FRAGMENT_ENCODE_SET, "getApkfy", "Lcm/aptoide/pt/apkfy/ApkfyModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public interface ApkfyService {
    Object getApkfy(Continuation<? super ApkfyModel> continuation);
}
