package cm.aptoide.p092pt.app;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.promotions.Promotion;
import cm.aptoide.p092pt.promotions.WalletApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: PromotionViewModel.kt */
@Metadata(m32266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, m32267d2 = {"Lcm/aptoide/pt/app/PromotionViewModel;", HttpUrl.FRAGMENT_ENCODE_SET, "walletApp", "Lcm/aptoide/pt/promotions/WalletApp;", DeepLinkIntentReceiver.DeepLinksTargets.PROMOTIONS_DEEPLINK, HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/promotions/Promotion;", "appViewModel", "Lcm/aptoide/pt/app/AppViewModel;", "(Lcm/aptoide/pt/promotions/WalletApp;Ljava/util/List;Lcm/aptoide/pt/app/AppViewModel;)V", "getAppViewModel", "()Lcm/aptoide/pt/app/AppViewModel;", "setAppViewModel", "(Lcm/aptoide/pt/app/AppViewModel;)V", "getPromotions", "()Ljava/util/List;", "setPromotions", "(Ljava/util/List;)V", "getWalletApp", "()Lcm/aptoide/pt/promotions/WalletApp;", "setWalletApp", "(Lcm/aptoide/pt/promotions/WalletApp;)V", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PromotionViewModel {
    private AppViewModel appViewModel;
    private List<Promotion> promotions;
    private WalletApp walletApp;

    public PromotionViewModel() {
        this(null, null, null, 7, null);
    }

    public PromotionViewModel(WalletApp walletApp, List<Promotion> list, AppViewModel appViewModel) {
        C9801m.m32346f(walletApp, "walletApp");
        C9801m.m32346f(list, DeepLinkIntentReceiver.DeepLinksTargets.PROMOTIONS_DEEPLINK);
        this.walletApp = walletApp;
        this.promotions = list;
        this.appViewModel = appViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromotionViewModel copy$default(PromotionViewModel promotionViewModel, WalletApp walletApp, List list, AppViewModel appViewModel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            walletApp = promotionViewModel.walletApp;
        }
        if ((i2 & 2) != 0) {
            list = promotionViewModel.promotions;
        }
        if ((i2 & 4) != 0) {
            appViewModel = promotionViewModel.appViewModel;
        }
        return promotionViewModel.copy(walletApp, list, appViewModel);
    }

    /* renamed from: component1, reason: from getter */
    public final WalletApp getWalletApp() {
        return this.walletApp;
    }

    public final List<Promotion> component2() {
        return this.promotions;
    }

    /* renamed from: component3, reason: from getter */
    public final AppViewModel getAppViewModel() {
        return this.appViewModel;
    }

    public final PromotionViewModel copy(WalletApp walletApp, List<Promotion> promotions, AppViewModel appViewModel) {
        C9801m.m32346f(walletApp, "walletApp");
        C9801m.m32346f(promotions, DeepLinkIntentReceiver.DeepLinksTargets.PROMOTIONS_DEEPLINK);
        return new PromotionViewModel(walletApp, promotions, appViewModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromotionViewModel)) {
            return false;
        }
        PromotionViewModel promotionViewModel = (PromotionViewModel) other;
        return C9801m.m32341a(this.walletApp, promotionViewModel.walletApp) && C9801m.m32341a(this.promotions, promotionViewModel.promotions) && C9801m.m32341a(this.appViewModel, promotionViewModel.appViewModel);
    }

    public final AppViewModel getAppViewModel() {
        return this.appViewModel;
    }

    public final List<Promotion> getPromotions() {
        return this.promotions;
    }

    public final WalletApp getWalletApp() {
        return this.walletApp;
    }

    public int hashCode() {
        int iHashCode = ((this.walletApp.hashCode() * 31) + this.promotions.hashCode()) * 31;
        AppViewModel appViewModel = this.appViewModel;
        return iHashCode + (appViewModel == null ? 0 : appViewModel.hashCode());
    }

    public final void setAppViewModel(AppViewModel appViewModel) {
        this.appViewModel = appViewModel;
    }

    public final void setPromotions(List<Promotion> list) {
        C9801m.m32346f(list, "<set-?>");
        this.promotions = list;
    }

    public final void setWalletApp(WalletApp walletApp) {
        C9801m.m32346f(walletApp, "<set-?>");
        this.walletApp = walletApp;
    }

    public String toString() {
        return "PromotionViewModel(walletApp=" + this.walletApp + ", promotions=" + this.promotions + ", appViewModel=" + this.appViewModel + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ PromotionViewModel(cm.aptoide.p092pt.promotions.WalletApp r26, java.util.List r27, cm.aptoide.p092pt.app.AppViewModel r28, int r29, kotlin.jvm.internal.C9789g r30) {
        /*
            r25 = this;
            r0 = r29 & 1
            if (r0 == 0) goto L2b
            cm.aptoide.pt.promotions.WalletApp r0 = new cm.aptoide.pt.promotions.WalletApp
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 524287(0x7ffff, float:7.34683E-40)
            r24 = 0
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L2d
        L2b:
            r0 = r26
        L2d:
            r1 = r29 & 2
            if (r1 == 0) goto L37
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L39
        L37:
            r1 = r27
        L39:
            r2 = r29 & 4
            if (r2 == 0) goto L41
            r2 = 0
            r3 = r25
            goto L45
        L41:
            r3 = r25
            r2 = r28
        L45:
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cm.aptoide.p092pt.app.PromotionViewModel.<init>(cm.aptoide.pt.promotions.WalletApp, java.util.List, cm.aptoide.pt.app.AppViewModel, int, kotlin.a0.d.g):void");
    }
}
