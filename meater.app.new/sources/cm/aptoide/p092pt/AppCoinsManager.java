package cm.aptoide.p092pt;

import cm.aptoide.p092pt.bonus.BonusAppcModel;
import cm.aptoide.p092pt.bonus.BonusAppcService;
import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.C10892h;
import okhttp3.HttpUrl;
import p323h.p324a.AbstractC9082s;

/* compiled from: AppCoinsManager.kt */
@Metadata(m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m32267d2 = {"Lcm/aptoide/pt/AppCoinsManager;", HttpUrl.FRAGMENT_ENCODE_SET, "bonusAppcService", "Lcm/aptoide/pt/bonus/BonusAppcService;", "(Lcm/aptoide/pt/bonus/BonusAppcService;)V", "getBonusAppc", "Lio/reactivex/Single;", "Lcm/aptoide/pt/bonus/BonusAppcModel;", "appcoins"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public class AppCoinsManager {
    private final BonusAppcService bonusAppcService;

    /* compiled from: AppCoinsManager.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", "Lcm/aptoide/pt/bonus/BonusAppcModel;", "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    @DebugMetadata(m39049c = "cm.aptoide.pt.AppCoinsManager$getBonusAppc$1", m39050f = "AppCoinsManager.kt", m39051l = {13}, m39052m = "invokeSuspend")
    /* renamed from: cm.aptoide.pt.AppCoinsManager$getBonusAppc$1 */
    static final class C11341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BonusAppcModel>, Object> {
        int label;

        C11341(Continuation<? super C11341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return AppCoinsManager.this.new C11341(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BonusAppcModel> continuation) {
            return ((C11341) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.label;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                BonusAppcService bonusAppcService = AppCoinsManager.this.bonusAppcService;
                this.label = 1;
                obj = bonusAppcService.getBonusAppc(this);
                if (obj == objM39045c) {
                    return objM39045c;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C10568o.m37655b(obj);
            }
            return obj;
        }
    }

    public AppCoinsManager(BonusAppcService bonusAppcService) {
        C9801m.m32346f(bonusAppcService, "bonusAppcService");
        this.bonusAppcService = bonusAppcService;
    }

    public final AbstractC9082s<BonusAppcModel> getBonusAppc() {
        return C10892h.m39135c(null, new C11341(null), 1, null);
    }
}
