package cm.aptoide.p092pt.app.mmpcampaigns;

import java.io.IOException;
import javax.inject.Inject;
import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10854c;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.C10863h;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.C10961h;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: CampaignApiRepository.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m32267d2 = {"Lcm/aptoide/pt/app/mmpcampaigns/CampaignApiRepository;", "Lcm/aptoide/pt/app/mmpcampaigns/CampaignRepository;", "client", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "knock", HttpUrl.FRAGMENT_ENCODE_SET, "url", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class CampaignApiRepository implements CampaignRepository {
    private final OkHttpClient client;

    /* compiled from: CampaignApiRepository.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    @DebugMetadata(m39049c = "cm.aptoide.pt.app.mmpcampaigns.CampaignApiRepository$knock$2", m39050f = "CampaignApiRepository.kt", m39051l = {33}, m39052m = "invokeSuspend")
    /* renamed from: cm.aptoide.pt.app.mmpcampaigns.CampaignApiRepository$knock$2 */
    static final class C14782 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C10775u>, Object> {
        final /* synthetic */ String $url;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14782(String str, Continuation<? super C14782> continuation) {
            super(2, continuation);
            this.$url = str;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return CampaignApiRepository.this.new C14782(this.$url, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C10775u> continuation) {
            return ((C14782) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.label;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                CampaignApiRepository campaignApiRepository = CampaignApiRepository.this;
                String str = this.$url;
                this.L$0 = campaignApiRepository;
                this.L$1 = str;
                this.label = 1;
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C10854c.m39044b(this), 1);
                cancellableContinuationImpl.m39666z();
                campaignApiRepository.client.newCall(new Request.Builder().url(str).build()).enqueue(new Callback() { // from class: cm.aptoide.pt.app.mmpcampaigns.CampaignApiRepository$knock$2$1$1
                    @Override // okhttp3.Callback
                    public void onFailure(Call call, IOException e2) {
                        C9801m.m32346f(call, "call");
                        C9801m.m32346f(e2, "e");
                        if (cancellableContinuationImpl.mo39631b()) {
                            CancellableContinuation<C10775u> cancellableContinuation = cancellableContinuationImpl;
                            Result.a aVar = Result.f40714f;
                            cancellableContinuation.resumeWith(Result.m37650a(C10775u.f41439a));
                        }
                    }

                    @Override // okhttp3.Callback
                    public void onResponse(Call call, Response response) throws IOException {
                        C9801m.m32346f(call, "call");
                        C9801m.m32346f(response, "response");
                        if (cancellableContinuationImpl.mo39631b()) {
                            CancellableContinuation<C10775u> cancellableContinuation = cancellableContinuationImpl;
                            Result.a aVar = Result.f40714f;
                            cancellableContinuation.resumeWith(Result.m37650a(C10775u.f41439a));
                        }
                        ResponseBody responseBodyBody = response.body();
                        if (responseBodyBody != null) {
                            responseBodyBody.close();
                        }
                    }
                });
                Object objM39664w = cancellableContinuationImpl.m39664w();
                if (objM39664w == C10855d.m39045c()) {
                    C10863h.m39060c(this);
                }
                if (objM39664w == objM39045c) {
                    return objM39045c;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C10568o.m37655b(obj);
            }
            return C10775u.f41439a;
        }
    }

    @Inject
    public CampaignApiRepository(OkHttpClient okHttpClient) {
        C9801m.m32346f(okHttpClient, "client");
        this.client = okHttpClient;
    }

    @Override // cm.aptoide.p092pt.app.mmpcampaigns.CampaignRepository
    public Object knock(String str, Continuation<? super C10775u> continuation) {
        Object objM39412e = C10961h.m39412e(Dispatchers.m39301b(), new C14782(str, null), continuation);
        return objM39412e == C10855d.m39045c() ? objM39412e : C10775u.f41439a;
    }
}
