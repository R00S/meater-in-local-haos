package cm.aptoide.p092pt.apkfy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.analytics.FirstLaunchAnalytics;
import cm.aptoide.p092pt.preferences.secure.SecurePreferences;
import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import kotlin.text.C10547v;
import kotlinx.coroutines.C11008j;
import kotlinx.coroutines.C11033p0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.HttpUrl;

/* compiled from: ApkFyParser.kt */
@Metadata(m32266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m32267d2 = {"Lcm/aptoide/pt/apkfy/ApkFyParser;", HttpUrl.FRAGMENT_ENCODE_SET, "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "securePreferences", "Landroid/content/SharedPreferences;", "apkfyManager", "Lcm/aptoide/pt/apkfy/ApkfyManager;", "firstLaunchAnalytics", "Lcm/aptoide/pt/analytics/FirstLaunchAnalytics;", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/SharedPreferences;Lcm/aptoide/pt/apkfy/ApkfyManager;Lcm/aptoide/pt/analytics/FirstLaunchAnalytics;)V", "run", HttpUrl.FRAGMENT_ENCODE_SET, "saveGuestUID", "guestUid", HttpUrl.FRAGMENT_ENCODE_SET, "setApkfyUtmProperties", "apkfyModel", "Lcm/aptoide/pt/apkfy/ApkfyModel;", "updateApkfy", "Companion", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class ApkFyParser {
    public static final String APKFY_PACKAGE_APKFY_NO_UTM = "APKFY_BUT_NO_UTM";
    public static final String APKFY_PACKAGE_NO_APKFY = "NO_APKFY";
    public static final String APKFY_PACKAGE_NO_APP = "APKFY_BUT_NO_APP";
    public static final String MMP_GUEST_UID = "MMP_GUEST_UID";
    private final ApkfyManager apkfyManager;
    private final Context context;
    private final FirstLaunchAnalytics firstLaunchAnalytics;
    private final Intent intent;
    private final SharedPreferences securePreferences;

    /* compiled from: ApkFyParser.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    @DebugMetadata(m39049c = "cm.aptoide.pt.apkfy.ApkFyParser$run$1", m39050f = "ApkFyParser.kt", m39051l = {30}, m39052m = "invokeSuspend")
    /* renamed from: cm.aptoide.pt.apkfy.ApkFyParser$run$1 */
    static final class C14461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C10775u>, Object> {
        int label;

        C14461(Continuation<? super C14461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return ApkFyParser.this.new C14461(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C10775u> continuation) {
            return ((C14461) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.label;
            try {
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (i2 == 0) {
                C10568o.m37655b(obj);
                String string = ApkFyParser.this.securePreferences.getString(ApkFyParser.MMP_GUEST_UID, HttpUrl.FRAGMENT_ENCODE_SET);
                boolean z = false;
                boolean z2 = !(string == null || string.length() == 0);
                if (SecurePreferences.shouldRunApkFy(ApkFyParser.this.securePreferences) && !z2) {
                    z = true;
                }
                if (z) {
                    ApkfyManager apkfyManager = ApkFyParser.this.apkfyManager;
                    this.label = 1;
                    obj = apkfyManager.getApkfy(this);
                    if (obj == objM39045c) {
                        return objM39045c;
                    }
                }
                return C10775u.f41439a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C10568o.m37655b(obj);
            ApkfyModel apkfyModel = (ApkfyModel) obj;
            ApkFyParser.this.saveGuestUID(apkfyModel.getGuestUid());
            ApkFyParser.this.updateApkfy(apkfyModel);
            ApkFyParser.this.setApkfyUtmProperties(apkfyModel);
            return C10775u.f41439a;
        }
    }

    public ApkFyParser(Context context, Intent intent, SharedPreferences sharedPreferences, ApkfyManager apkfyManager, FirstLaunchAnalytics firstLaunchAnalytics) {
        C9801m.m32346f(context, "context");
        C9801m.m32346f(intent, "intent");
        C9801m.m32346f(sharedPreferences, "securePreferences");
        C9801m.m32346f(apkfyManager, "apkfyManager");
        C9801m.m32346f(firstLaunchAnalytics, "firstLaunchAnalytics");
        this.context = context;
        this.intent = intent;
        this.securePreferences = sharedPreferences;
        this.apkfyManager = apkfyManager;
        this.firstLaunchAnalytics = firstLaunchAnalytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveGuestUID(String guestUid) {
        this.securePreferences.edit().putString(MMP_GUEST_UID, guestUid).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setApkfyUtmProperties(ApkfyModel apkfyModel) {
        if (apkfyModel.hasUTMs()) {
            String packageName = apkfyModel.getPackageName();
            if ((packageName == null || C10546u.m37518t(packageName)) && apkfyModel.getAppId() == null) {
                this.firstLaunchAnalytics.sendIndicativeFirstLaunchSourceUserProperties(apkfyModel.getUtmContent(), apkfyModel.getUtmSource(), apkfyModel.getUtmCampaign(), apkfyModel.getUtmMedium(), apkfyModel.getUtmTerm(), APKFY_PACKAGE_NO_APP);
                return;
            } else {
                this.firstLaunchAnalytics.sendIndicativeFirstLaunchSourceUserProperties(apkfyModel.getUtmContent(), apkfyModel.getUtmSource(), apkfyModel.getUtmCampaign(), apkfyModel.getUtmMedium(), apkfyModel.getUtmTerm(), apkfyModel.getPackageName());
                return;
            }
        }
        String packageName2 = apkfyModel.getPackageName();
        if ((packageName2 == null || C10546u.m37518t(packageName2)) && apkfyModel.getAppId() == null) {
            this.firstLaunchAnalytics.sendIndicativeFirstLaunchSourceUserProperties(APKFY_PACKAGE_NO_APKFY, APKFY_PACKAGE_NO_APKFY, APKFY_PACKAGE_NO_APKFY, APKFY_PACKAGE_NO_APKFY, APKFY_PACKAGE_NO_APKFY, APKFY_PACKAGE_NO_APKFY);
        } else {
            this.firstLaunchAnalytics.sendIndicativeFirstLaunchSourceUserProperties(apkfyModel.getUtmContent(), apkfyModel.getUtmSource(), apkfyModel.getUtmCampaign(), apkfyModel.getUtmMedium(), apkfyModel.getUtmTerm(), APKFY_PACKAGE_APKFY_NO_UTM);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateApkfy(ApkfyModel apkfyModel) {
        String packageName = apkfyModel.getPackageName();
        if ((packageName == null || C10546u.m37518t(packageName)) || C10547v.m37538J(apkfyModel.getPackageName(), "cm.aptoide.pt", false, 2, null)) {
            return;
        }
        if (apkfyModel.getAppId() != null) {
            this.intent.putExtra(DeepLinkIntentReceiver.DeepLinksTargets.APP_VIEW_FRAGMENT, true);
            this.intent.putExtra("appId", apkfyModel.getAppId().longValue());
            String oemId = apkfyModel.getOemId();
            if (!(oemId == null || C10546u.m37518t(oemId))) {
                this.intent.putExtra(DeepLinkIntentReceiver.DeepLinksKeys.OEM_ID_KEY, apkfyModel.getOemId());
            }
            this.intent.putExtra(DeepLinkIntentReceiver.DeepLinksKeys.APK_FY, true);
            SecurePreferences.setApkFyRun(this.securePreferences);
            this.context.startActivity(this.intent);
            return;
        }
        String packageName2 = apkfyModel.getPackageName();
        if (packageName2 == null || C10546u.m37518t(packageName2)) {
            return;
        }
        this.intent.putExtra(DeepLinkIntentReceiver.DeepLinksTargets.APP_VIEW_FRAGMENT, true);
        this.intent.putExtra("packageName", apkfyModel.getPackageName());
        String oemId2 = apkfyModel.getOemId();
        if (!(oemId2 == null || C10546u.m37518t(oemId2))) {
            this.intent.putExtra(DeepLinkIntentReceiver.DeepLinksKeys.OEM_ID_KEY, apkfyModel.getOemId());
        }
        this.intent.putExtra(DeepLinkIntentReceiver.DeepLinksKeys.APK_FY, true);
        SecurePreferences.setApkFyRun(this.securePreferences);
        this.context.startActivity(this.intent);
    }

    public final void run() {
        C11008j.m39597b(C11033p0.m39668a(Dispatchers.m39302c()), null, null, new C14461(null), 3, null);
    }
}
