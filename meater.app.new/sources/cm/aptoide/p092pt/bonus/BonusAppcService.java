package cm.aptoide.p092pt.bonus;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.HttpUrl;

/* compiled from: BonusAppcService.kt */
@Metadata(m32266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, m32267d2 = {"Lcm/aptoide/pt/bonus/BonusAppcService;", HttpUrl.FRAGMENT_ENCODE_SET, "getBonusAppc", "Lcm/aptoide/pt/bonus/BonusAppcModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "appcoins"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public interface BonusAppcService {
    Object getBonusAppc(Continuation<? super BonusAppcModel> continuation);
}
