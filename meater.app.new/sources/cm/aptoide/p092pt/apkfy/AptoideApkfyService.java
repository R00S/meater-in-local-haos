package cm.aptoide.p092pt.apkfy;

import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.C10961h;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.HttpUrl;
import retrofit2.Response;
import retrofit2.http.GET;

/* compiled from: AptoideApkfyService.kt */
@Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m32267d2 = {"Lcm/aptoide/pt/apkfy/AptoideApkfyService;", "Lcm/aptoide/pt/apkfy/ApkfyService;", "serviceApi", "Lcm/aptoide/pt/apkfy/AptoideApkfyService$ServiceApi;", "(Lcm/aptoide/pt/apkfy/AptoideApkfyService$ServiceApi;)V", "getApkfy", "Lcm/aptoide/pt/apkfy/ApkfyModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapErrorResponse", "ServiceApi", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class AptoideApkfyService implements ApkfyService {
    private final ServiceApi serviceApi;

    /* compiled from: AptoideApkfyService.kt */
    @Metadata(m32266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m32267d2 = {"Lcm/aptoide/pt/apkfy/AptoideApkfyService$ServiceApi;", HttpUrl.FRAGMENT_ENCODE_SET, "getApkfyModel", "Lretrofit2/Response;", "Lcm/aptoide/pt/apkfy/ApkfyResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public interface ServiceApi {
        @GET("apkfy")
        Object getApkfyModel(Continuation<? super Response<ApkfyResponse>> continuation);
    }

    /* compiled from: AptoideApkfyService.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", "Lcm/aptoide/pt/apkfy/ApkfyModel;", "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    @DebugMetadata(m39049c = "cm.aptoide.pt.apkfy.AptoideApkfyService$getApkfy$2", m39050f = "AptoideApkfyService.kt", m39051l = {12}, m39052m = "invokeSuspend")
    /* renamed from: cm.aptoide.pt.apkfy.AptoideApkfyService$getApkfy$2 */
    static final class C14472 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApkfyModel>, Object> {
        int label;

        C14472(Continuation<? super C14472> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return AptoideApkfyService.this.new C14472(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApkfyModel> continuation) {
            return ((C14472) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.label;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                ServiceApi serviceApi = AptoideApkfyService.this.serviceApi;
                this.label = 1;
                obj = serviceApi.getApkfyModel(this);
                if (obj == objM39045c) {
                    return objM39045c;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C10568o.m37655b(obj);
            }
            Response response = (Response) obj;
            ApkfyResponse apkfyResponse = (ApkfyResponse) response.body();
            return (!response.isSuccessful() || apkfyResponse == null) ? AptoideApkfyService.this.mapErrorResponse() : ApkfyResponseKt.mapToApkfyModel(apkfyResponse);
        }
    }

    public AptoideApkfyService(ServiceApi serviceApi) {
        C9801m.m32346f(serviceApi, "serviceApi");
        this.serviceApi = serviceApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ApkfyModel mapErrorResponse() {
        return new ApkfyModel(HttpUrl.FRAGMENT_ENCODE_SET, null, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    @Override // cm.aptoide.p092pt.apkfy.ApkfyService
    public Object getApkfy(Continuation<? super ApkfyModel> continuation) {
        return C10961h.m39412e(Dispatchers.m39301b(), new C14472(null), continuation);
    }
}
