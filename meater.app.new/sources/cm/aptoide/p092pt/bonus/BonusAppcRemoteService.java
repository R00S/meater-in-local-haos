package cm.aptoide.p092pt.bonus;

import cm.aptoide.p092pt.bonus.BonusAppcResponse;
import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.collections.C10813s;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import kotlinx.coroutines.C10961h;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.HttpUrl;
import retrofit2.Response;
import retrofit2.http.GET;

/* compiled from: BonusAppcRemoteService.kt */
@Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m32267d2 = {"Lcm/aptoide/pt/bonus/BonusAppcRemoteService;", "Lcm/aptoide/pt/bonus/BonusAppcService;", "serviceApi", "Lcm/aptoide/pt/bonus/BonusAppcRemoteService$ServiceApi;", "(Lcm/aptoide/pt/bonus/BonusAppcRemoteService$ServiceApi;)V", "getBonusAppc", "Lcm/aptoide/pt/bonus/BonusAppcModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapErrorResponse", "mapResponse", "response", "Lcm/aptoide/pt/bonus/BonusAppcResponse;", "ServiceApi", "appcoins"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class BonusAppcRemoteService implements BonusAppcService {
    private final ServiceApi serviceApi;

    /* compiled from: BonusAppcRemoteService.kt */
    @Metadata(m32266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m32267d2 = {"Lcm/aptoide/pt/bonus/BonusAppcRemoteService$ServiceApi;", HttpUrl.FRAGMENT_ENCODE_SET, "getAppcBonus", "Lretrofit2/Response;", "Lcm/aptoide/pt/bonus/BonusAppcResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "appcoins"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public interface ServiceApi {
        @GET("gamification/levels")
        Object getAppcBonus(Continuation<? super Response<BonusAppcResponse>> continuation);
    }

    /* compiled from: BonusAppcRemoteService.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", "Lcm/aptoide/pt/bonus/BonusAppcModel;", "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    @DebugMetadata(m39049c = "cm.aptoide.pt.bonus.BonusAppcRemoteService$getBonusAppc$2", m39050f = "BonusAppcRemoteService.kt", m39051l = {14}, m39052m = "invokeSuspend")
    /* renamed from: cm.aptoide.pt.bonus.BonusAppcRemoteService$getBonusAppc$2 */
    static final class C19952 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BonusAppcModel>, Object> {
        int label;

        C19952(Continuation<? super C19952> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return BonusAppcRemoteService.this.new C19952(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BonusAppcModel> continuation) {
            return ((C19952) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.label;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                ServiceApi serviceApi = BonusAppcRemoteService.this.serviceApi;
                this.label = 1;
                obj = serviceApi.getAppcBonus(this);
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
            BonusAppcResponse bonusAppcResponse = (BonusAppcResponse) response.body();
            return (!response.isSuccessful() || bonusAppcResponse == null) ? BonusAppcRemoteService.this.mapErrorResponse() : BonusAppcRemoteService.this.mapResponse(bonusAppcResponse);
        }
    }

    public BonusAppcRemoteService(ServiceApi serviceApi) {
        C9801m.m32346f(serviceApi, "serviceApi");
        this.serviceApi = serviceApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BonusAppcModel mapErrorResponse() {
        return new BonusAppcModel(false, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BonusAppcModel mapResponse(BonusAppcResponse response) {
        return (C10546u.m37516r(response.getStatus(), "ACTIVE", false, 2, null) && (response.getResult().isEmpty() ^ true)) ? new BonusAppcModel(true, ((BonusAppcResponse.Result) C10813s.m38844g0(response.getResult())).getBonus()) : mapErrorResponse();
    }

    @Override // cm.aptoide.p092pt.bonus.BonusAppcService
    public Object getBonusAppc(Continuation<? super BonusAppcModel> continuation) {
        return C10961h.m39412e(Dispatchers.m39301b(), new C19952(null), continuation);
    }
}
