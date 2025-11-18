package cm.aptoide.p092pt.aab;

import cm.aptoide.p092pt.aab.DynamicSplitsResponse;
import java.util.Collections;
import java.util.List;
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
import retrofit2.http.Query;

/* compiled from: DynamicSplitsRemoteService.kt */
@Metadata(m32266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m32267d2 = {"Lcm/aptoide/pt/aab/DynamicSplitsRemoteService;", "Lcm/aptoide/pt/aab/DynamicSplitsService;", "dynamicSplitsApi", "Lcm/aptoide/pt/aab/DynamicSplitsRemoteService$DynamicSplitsApi;", "mapper", "Lcm/aptoide/pt/aab/DynamicSplitsMapper;", "(Lcm/aptoide/pt/aab/DynamicSplitsRemoteService$DynamicSplitsApi;Lcm/aptoide/pt/aab/DynamicSplitsMapper;)V", "getDynamicSplitsByMd5", "Lcm/aptoide/pt/aab/DynamicSplitsModel;", "apkMd5Sum", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapErrorResponse", "mapResponse", "dynamicSplitsResponseBody", "Lcm/aptoide/pt/aab/DynamicSplitsResponse;", "DynamicSplitsApi", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class DynamicSplitsRemoteService implements DynamicSplitsService {
    private final DynamicSplitsApi dynamicSplitsApi;
    private final DynamicSplitsMapper mapper;

    /* compiled from: DynamicSplitsRemoteService.kt */
    @Metadata(m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m32267d2 = {"Lcm/aptoide/pt/aab/DynamicSplitsRemoteService$DynamicSplitsApi;", HttpUrl.FRAGMENT_ENCODE_SET, "getDynamicSplitsByMd5", "Lretrofit2/Response;", "Lcm/aptoide/pt/aab/DynamicSplitsResponse;", "md5", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public interface DynamicSplitsApi {
        @GET("app/getDynamicSplits")
        Object getDynamicSplitsByMd5(@Query("apk_md5sum") String str, Continuation<? super Response<DynamicSplitsResponse>> continuation);
    }

    /* compiled from: DynamicSplitsRemoteService.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", "Lcm/aptoide/pt/aab/DynamicSplitsModel;", "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    @DebugMetadata(m39049c = "cm.aptoide.pt.aab.DynamicSplitsRemoteService$getDynamicSplitsByMd5$2", m39050f = "DynamicSplitsRemoteService.kt", m39051l = {18}, m39052m = "invokeSuspend")
    /* renamed from: cm.aptoide.pt.aab.DynamicSplitsRemoteService$getDynamicSplitsByMd5$2 */
    static final class C11512 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DynamicSplitsModel>, Object> {
        final /* synthetic */ String $apkMd5Sum;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11512(String str, Continuation<? super C11512> continuation) {
            super(2, continuation);
            this.$apkMd5Sum = str;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return DynamicSplitsRemoteService.this.new C11512(this.$apkMd5Sum, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DynamicSplitsModel> continuation) {
            return ((C11512) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.label;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                DynamicSplitsApi dynamicSplitsApi = DynamicSplitsRemoteService.this.dynamicSplitsApi;
                String str = this.$apkMd5Sum;
                this.label = 1;
                obj = dynamicSplitsApi.getDynamicSplitsByMd5(str, this);
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
            DynamicSplitsResponse dynamicSplitsResponse = (DynamicSplitsResponse) response.body();
            return (!response.isSuccessful() || dynamicSplitsResponse == null) ? DynamicSplitsRemoteService.this.mapErrorResponse() : DynamicSplitsRemoteService.this.mapResponse(dynamicSplitsResponse);
        }
    }

    public DynamicSplitsRemoteService(DynamicSplitsApi dynamicSplitsApi, DynamicSplitsMapper dynamicSplitsMapper) {
        C9801m.m32346f(dynamicSplitsApi, "dynamicSplitsApi");
        C9801m.m32346f(dynamicSplitsMapper, "mapper");
        this.dynamicSplitsApi = dynamicSplitsApi;
        this.mapper = dynamicSplitsMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DynamicSplitsModel mapErrorResponse() {
        List listEmptyList = Collections.emptyList();
        C9801m.m32345e(listEmptyList, "emptyList()");
        return new DynamicSplitsModel(listEmptyList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DynamicSplitsModel mapResponse(DynamicSplitsResponse dynamicSplitsResponseBody) {
        DynamicSplitsMapper dynamicSplitsMapper = this.mapper;
        List<DynamicSplitsResponse.DynamicSplit> dynamicSplitList = dynamicSplitsResponseBody.getDynamicSplitList();
        C9801m.m32345e(dynamicSplitList, "dynamicSplitsResponseBody.dynamicSplitList");
        return new DynamicSplitsModel(dynamicSplitsMapper.mapDynamicSplits(dynamicSplitList));
    }

    @Override // cm.aptoide.p092pt.aab.DynamicSplitsService
    public Object getDynamicSplitsByMd5(String str, Continuation<? super DynamicSplitsModel> continuation) {
        return C10961h.m39412e(Dispatchers.m39301b(), new C11512(str, null), continuation);
    }
}
