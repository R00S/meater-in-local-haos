package cm.aptoide.p092pt.notification.policies;

import cm.aptoide.p092pt.install.InstalledAppsRepository;
import cm.aptoide.p092pt.notification.Policy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p319g.p320a.p321a.p322a.C9059d;
import p323h.p324a.AbstractC9073j;
import p323h.p324a.AbstractC9082s;
import p323h.p324a.InterfaceC9075l;
import p323h.p324a.InterfaceC9086w;
import p323h.p324a.p328y.InterfaceC9098f;
import p456rx.Single;

/* compiled from: CampaignPolicy.kt */
@Metadata(m32266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m32267d2 = {"Lcm/aptoide/pt/notification/policies/CampaignPolicy;", "Lcm/aptoide/pt/notification/Policy;", "whitelistedPackages", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "installedAppsRepository", "Lcm/aptoide/pt/install/InstalledAppsRepository;", "(Ljava/util/List;Lcm/aptoide/pt/install/InstalledAppsRepository;)V", "getCommonPackages", "Lio/reactivex/Maybe;", "installed", "shouldShow", "Lrx/Single;", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class CampaignPolicy implements Policy {
    private final InstalledAppsRepository installedAppsRepository;
    private final List<String> whitelistedPackages;

    public CampaignPolicy(List<String> list, InstalledAppsRepository installedAppsRepository) {
        C9801m.m32346f(list, "whitelistedPackages");
        C9801m.m32346f(installedAppsRepository, "installedAppsRepository");
        this.whitelistedPackages = list;
        this.installedAppsRepository = installedAppsRepository;
    }

    private final AbstractC9073j<String> getCommonPackages(String str) {
        for (String str2 : this.whitelistedPackages) {
            if (C9801m.m32341a(str, str2)) {
                AbstractC9073j<String> abstractC9073jM29182d = AbstractC9073j.m29182d(str2);
                C9801m.m32345e(abstractC9073jM29182d, "just(it)");
                return abstractC9073jM29182d;
            }
        }
        AbstractC9073j<String> abstractC9073jM29180b = AbstractC9073j.m29180b();
        C9801m.m32345e(abstractC9073jM29180b, "empty()");
        return abstractC9073jM29180b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldShow$lambda-0, reason: not valid java name */
    public static final Iterable m40967shouldShow$lambda0(List list) {
        C9801m.m32346f(list, "it");
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldShow$lambda-1, reason: not valid java name */
    public static final InterfaceC9075l m40968shouldShow$lambda1(CampaignPolicy campaignPolicy, String str) {
        C9801m.m32346f(campaignPolicy, "this$0");
        C9801m.m32346f(str, "installed");
        return campaignPolicy.getCommonPackages(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldShow$lambda-2, reason: not valid java name */
    public static final InterfaceC9086w m40969shouldShow$lambda2(List list) {
        C9801m.m32346f(list, "it");
        return AbstractC9082s.m29227f(Boolean.valueOf(!list.isEmpty()));
    }

    @Override // cm.aptoide.p092pt.notification.Policy
    public Single<Boolean> shouldShow() {
        if (this.whitelistedPackages.isEmpty()) {
            Single<Boolean> singleM39913m = Single.m39913m(Boolean.TRUE);
            C9801m.m32345e(singleM39913m, "just(true)");
            return singleM39913m;
        }
        Single<Boolean> singleM29126d = C9059d.m29126d(this.installedAppsRepository.getInstalledAppsNames().m29233j().m29208p(new InterfaceC9098f() { // from class: cm.aptoide.pt.notification.policies.a
            @Override // p323h.p324a.p328y.InterfaceC9098f
            /* renamed from: a */
            public final Object mo4660a(Object obj) {
                return CampaignPolicy.m40967shouldShow$lambda0((List) obj);
            }
        }).m29209q(new InterfaceC9098f() { // from class: cm.aptoide.pt.notification.policies.c
            @Override // p323h.p324a.p328y.InterfaceC9098f
            /* renamed from: a */
            public final Object mo4660a(Object obj) {
                return CampaignPolicy.m40968shouldShow$lambda1(this.f10444f, (String) obj);
            }
        }).m29196A().m29229d(new InterfaceC9098f() { // from class: cm.aptoide.pt.notification.policies.b
            @Override // p323h.p324a.p328y.InterfaceC9098f
            /* renamed from: a */
            public final Object mo4660a(Object obj) {
                return CampaignPolicy.m40969shouldShow$lambda2((List) obj);
            }
        }));
        C9801m.m32345e(singleM29126d, "toV1Single(installedApps…tEmpty())\n        }\n    )");
        return singleM29126d;
    }
}
