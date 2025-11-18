package cm.aptoide.p092pt.app.mmpcampaigns;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.apkfy.ApkFyParser;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.C10890f;
import okhttp3.HttpUrl;
import p323h.p324a.AbstractC9064b;

/* compiled from: CampaignManager.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m32267d2 = {"Lcm/aptoide/pt/app/mmpcampaigns/CampaignManager;", HttpUrl.FRAGMENT_ENCODE_SET, "campaignRepository", "Lcm/aptoide/pt/app/mmpcampaigns/CampaignRepository;", "securePreferences", "Landroid/content/SharedPreferences;", "(Lcm/aptoide/pt/app/mmpcampaigns/CampaignRepository;Landroid/content/SharedPreferences;)V", "convertCampaign", "Lio/reactivex/Completable;", "campaign", "Lcm/aptoide/pt/app/mmpcampaigns/Campaign;", "medium", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class CampaignManager {
    private final CampaignRepository campaignRepository;
    private final SharedPreferences securePreferences;

    /* compiled from: CampaignManager.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    @DebugMetadata(m39049c = "cm.aptoide.pt.app.mmpcampaigns.CampaignManager$convertCampaign$1", m39050f = "CampaignManager.kt", m39051l = {14}, m39052m = "invokeSuspend")
    /* renamed from: cm.aptoide.pt.app.mmpcampaigns.CampaignManager$convertCampaign$1 */
    static final class C14791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C10775u>, Object> {
        final /* synthetic */ Campaign $campaign;
        final /* synthetic */ String $medium;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ CampaignManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14791(Campaign campaign, CampaignManager campaignManager, String str, Continuation<? super C14791> continuation) {
            super(2, continuation);
            this.$campaign = campaign;
            this.this$0 = campaignManager;
            this.$medium = str;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return new C14791(this.$campaign, this.this$0, this.$medium, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C10775u> continuation) {
            return ((C14791) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            Iterator it;
            CampaignManager campaignManager;
            Object objM39045c = C10855d.m39045c();
            int i2 = this.label;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                List<CampaignUrl> download = this.$campaign.getDownload();
                if (download != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : download) {
                        if (C9801m.m32341a(((CampaignUrl) obj2).getName(), "aptoide-mmp")) {
                            arrayList.add(obj2);
                        }
                    }
                    CampaignManager campaignManager2 = this.this$0;
                    str = this.$medium;
                    it = arrayList.iterator();
                    campaignManager = campaignManager2;
                }
                return C10775u.f41439a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$2;
            str = (String) this.L$1;
            campaignManager = (CampaignManager) this.L$0;
            C10568o.m37655b(obj);
            while (it.hasNext()) {
                CampaignUrl campaignUrl = (CampaignUrl) it.next();
                CampaignRepository campaignRepository = campaignManager.campaignRepository;
                String strInjectCampaignAttributes = CampaignManagerKt.injectCampaignAttributes(campaignUrl.getUrl(), str, campaignManager.securePreferences.getString(ApkFyParser.MMP_GUEST_UID, HttpUrl.FRAGMENT_ENCODE_SET));
                this.L$0 = campaignManager;
                this.L$1 = str;
                this.L$2 = it;
                this.label = 1;
                if (campaignRepository.knock(strInjectCampaignAttributes, this) == objM39045c) {
                    return objM39045c;
                }
            }
            return C10775u.f41439a;
        }
    }

    public CampaignManager(CampaignRepository campaignRepository, SharedPreferences sharedPreferences) {
        C9801m.m32346f(campaignRepository, "campaignRepository");
        C9801m.m32346f(sharedPreferences, "securePreferences");
        this.campaignRepository = campaignRepository;
        this.securePreferences = sharedPreferences;
    }

    public final AbstractC9064b convertCampaign(Campaign campaign, String str) {
        C9801m.m32346f(campaign, "campaign");
        C9801m.m32346f(str, "medium");
        return C10890f.m39130c(null, new C14791(campaign, this, str, null), 1, null);
    }
}
