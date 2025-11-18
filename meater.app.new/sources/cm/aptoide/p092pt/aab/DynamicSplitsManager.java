package cm.aptoide.p092pt.aab;

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

/* compiled from: DynamicSplitsManager.kt */
@Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m32267d2 = {"Lcm/aptoide/pt/aab/DynamicSplitsManager;", HttpUrl.FRAGMENT_ENCODE_SET, "dynamicSplitsService", "Lcm/aptoide/pt/aab/DynamicSplitsService;", "(Lcm/aptoide/pt/aab/DynamicSplitsService;)V", "getAppSplitsByMd5", "Lio/reactivex/Single;", "Lcm/aptoide/pt/aab/DynamicSplitsModel;", "apkMd5Sum", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public class DynamicSplitsManager {
    private final DynamicSplitsService dynamicSplitsService;

    /* compiled from: DynamicSplitsManager.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", "Lcm/aptoide/pt/aab/DynamicSplitsModel;", "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    @DebugMetadata(m39049c = "cm.aptoide.pt.aab.DynamicSplitsManager$getAppSplitsByMd5$1", m39050f = "DynamicSplitsManager.kt", m39051l = {9}, m39052m = "invokeSuspend")
    /* renamed from: cm.aptoide.pt.aab.DynamicSplitsManager$getAppSplitsByMd5$1 */
    static final class C11501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DynamicSplitsModel>, Object> {
        final /* synthetic */ String $apkMd5Sum;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11501(String str, Continuation<? super C11501> continuation) {
            super(2, continuation);
            this.$apkMd5Sum = str;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return DynamicSplitsManager.this.new C11501(this.$apkMd5Sum, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DynamicSplitsModel> continuation) {
            return ((C11501) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.label;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                DynamicSplitsService dynamicSplitsService = DynamicSplitsManager.this.dynamicSplitsService;
                String str = this.$apkMd5Sum;
                this.label = 1;
                obj = dynamicSplitsService.getDynamicSplitsByMd5(str, this);
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

    public DynamicSplitsManager(DynamicSplitsService dynamicSplitsService) {
        C9801m.m32346f(dynamicSplitsService, "dynamicSplitsService");
        this.dynamicSplitsService = dynamicSplitsService;
    }

    public AbstractC9082s<DynamicSplitsModel> getAppSplitsByMd5(String str) {
        C9801m.m32346f(str, "apkMd5Sum");
        return C10892h.m39135c(null, new C11501(str, null), 1, null);
    }
}
