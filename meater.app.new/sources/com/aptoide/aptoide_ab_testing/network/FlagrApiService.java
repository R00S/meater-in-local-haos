package com.aptoide.aptoide_ab_testing.network;

import com.aptoide.aptoide_ab_testing.FlagrException;
import com.aptoide.aptoide_ab_testing.model.EvalContext;
import com.aptoide.aptoide_ab_testing.model.Flag;
import com.aptoide.aptoide_ab_testing.model.PostEvaluationResponseJson;
import com.aptoide.aptoide_ab_testing.service.FlagrService;
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
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: FlagrApiService.kt */
@Metadata(m32266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m32267d2 = {"Lcom/aptoide/aptoide_ab_testing/network/FlagrApiService;", "Lcom/aptoide/aptoide_ab_testing/service/FlagrService;", "flagrBaseHost", HttpUrl.FRAGMENT_ENCODE_SET, "okHttpClient", "Lokhttp3/OkHttpClient;", "(Ljava/lang/String;Lokhttp3/OkHttpClient;)V", "flagr", "Lcom/aptoide/aptoide_ab_testing/network/FlagrApiService$Flagr;", "getFlag", "Lcom/aptoide/aptoide_ab_testing/model/Flag;", "flagID", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postEvaluation", "Lcom/aptoide/aptoide_ab_testing/model/PostEvaluationResponseJson;", "body", "Lcom/aptoide/aptoide_ab_testing/model/EvalContext;", "(Lcom/aptoide/aptoide_ab_testing/model/EvalContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Flagr", "aptoide-ab-testing"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class FlagrApiService implements FlagrService {
    private final Flagr flagr;
    private final String flagrBaseHost;

    /* compiled from: FlagrApiService.kt */
    @Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m32267d2 = {"Lcom/aptoide/aptoide_ab_testing/network/FlagrApiService$Flagr;", HttpUrl.FRAGMENT_ENCODE_SET, "getFlag", "Lretrofit2/Response;", "Lcom/aptoide/aptoide_ab_testing/model/Flag;", "flagID", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postEvaluation", "Lcom/aptoide/aptoide_ab_testing/model/PostEvaluationResponseJson;", "body", "Lcom/aptoide/aptoide_ab_testing/model/EvalContext;", "(Lcom/aptoide/aptoide_ab_testing/model/EvalContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aptoide-ab-testing"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public interface Flagr {
        @GET("/api/v1/flags/{flagID}")
        Object getFlag(@Path("flagID") String str, Continuation<? super Response<Flag>> continuation);

        @POST("/api/v1/evaluation")
        Object postEvaluation(@Body EvalContext evalContext, Continuation<? super Response<PostEvaluationResponseJson>> continuation);
    }

    /* compiled from: FlagrApiService.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", "Lcom/aptoide/aptoide_ab_testing/model/Flag;", "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.aptoide.aptoide_ab_testing.network.FlagrApiService$getFlag$2", m39050f = "FlagrApiService.kt", m39051l = {33}, m39052m = "invokeSuspend")
    /* renamed from: com.aptoide.aptoide_ab_testing.network.FlagrApiService$getFlag$2 */
    static final class C53282 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Flag>, Object> {
        final /* synthetic */ String $flagID;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53282(String str, Continuation<? super C53282> continuation) {
            super(2, continuation);
            this.$flagID = str;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return FlagrApiService.this.new C53282(this.$flagID, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Flag> continuation) {
            return ((C53282) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.label;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                Flagr flagr = FlagrApiService.this.flagr;
                String str = this.$flagID;
                this.label = 1;
                obj = flagr.getFlag(str, this);
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
            Flag flag = (Flag) response.body();
            if (response.isSuccessful() && flag != null) {
                return flag;
            }
            String strMessage = response.message();
            C9801m.m32345e(strMessage, "getFlagResponse.message()");
            throw new FlagrException(strMessage, response.code());
        }
    }

    /* compiled from: FlagrApiService.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", "Lcom/aptoide/aptoide_ab_testing/model/PostEvaluationResponseJson;", "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.aptoide.aptoide_ab_testing.network.FlagrApiService$postEvaluation$2", m39050f = "FlagrApiService.kt", m39051l = {47}, m39052m = "invokeSuspend")
    /* renamed from: com.aptoide.aptoide_ab_testing.network.FlagrApiService$postEvaluation$2 */
    static final class C53292 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PostEvaluationResponseJson>, Object> {
        final /* synthetic */ EvalContext $body;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C53292(EvalContext evalContext, Continuation<? super C53292> continuation) {
            super(2, continuation);
            this.$body = evalContext;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return FlagrApiService.this.new C53292(this.$body, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PostEvaluationResponseJson> continuation) {
            return ((C53292) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.label;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                Flagr flagr = FlagrApiService.this.flagr;
                EvalContext evalContext = this.$body;
                this.label = 1;
                obj = flagr.postEvaluation(evalContext, this);
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
            PostEvaluationResponseJson postEvaluationResponseJson = (PostEvaluationResponseJson) response.body();
            if (response.isSuccessful() && postEvaluationResponseJson != null) {
                return postEvaluationResponseJson;
            }
            String strMessage = response.message();
            C9801m.m32345e(strMessage, "postEvaluationResult.message()");
            throw new FlagrException(strMessage, response.code());
        }
    }

    public FlagrApiService(String str, OkHttpClient okHttpClient) throws SecurityException {
        C9801m.m32346f(str, "flagrBaseHost");
        C9801m.m32346f(okHttpClient, "okHttpClient");
        this.flagrBaseHost = str;
        Object objCreate = new Retrofit.Builder().baseUrl(str).addConverterFactory(GsonConverterFactory.create()).client(okHttpClient).build().create(Flagr.class);
        C9801m.m32345e(objCreate, "Builder()\n            .b…create(Flagr::class.java)");
        this.flagr = (Flagr) objCreate;
    }

    @Override // com.aptoide.aptoide_ab_testing.service.FlagrService
    public Object getFlag(String str, Continuation<? super Flag> continuation) {
        return C10961h.m39412e(Dispatchers.m39301b(), new C53282(str, null), continuation);
    }

    @Override // com.aptoide.aptoide_ab_testing.service.FlagrService
    public Object postEvaluation(EvalContext evalContext, Continuation<? super PostEvaluationResponseJson> continuation) {
        return C10961h.m39412e(Dispatchers.m39301b(), new C53292(evalContext, null), continuation);
    }
}
