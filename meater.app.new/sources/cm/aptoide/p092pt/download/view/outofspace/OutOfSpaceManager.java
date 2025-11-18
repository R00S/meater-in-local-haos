package cm.aptoide.p092pt.download.view.outofspace;

import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.install.InstallAppSizeValidator;
import cm.aptoide.p092pt.install.InstallManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p473s.C11418b;

/* compiled from: OutOfSpaceManager.kt */
@Metadata(m32266d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eJ\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m32267d2 = {"Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceManager;", HttpUrl.FRAGMENT_ENCODE_SET, "installManager", "Lcm/aptoide/pt/install/InstallManager;", "appSize", HttpUrl.FRAGMENT_ENCODE_SET, "uninstalledEnoughApps", "Lrx/subjects/PublishSubject;", "Ljava/lang/Void;", "installAppSizeValidator", "Lcm/aptoide/pt/install/InstallAppSizeValidator;", "(Lcm/aptoide/pt/install/InstallManager;JLrx/subjects/PublishSubject;Lcm/aptoide/pt/install/InstallAppSizeValidator;)V", "requiredSpace", "getInstalledAppSize", "Lrx/Single;", "packageName", HttpUrl.FRAGMENT_ENCODE_SET, "getInstalledApps", "Lrx/Observable;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/download/view/outofspace/InstalledApp;", "getRequiredStorageSize", "uninstallApp", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class OutOfSpaceManager {
    private final long appSize;
    private final InstallAppSizeValidator installAppSizeValidator;
    private final InstallManager installManager;
    private long requiredSpace;
    private final C11418b<Void> uninstalledEnoughApps;

    public OutOfSpaceManager(InstallManager installManager, long j2, C11418b<Void> c11418b, InstallAppSizeValidator installAppSizeValidator) {
        C9801m.m32346f(installManager, "installManager");
        C9801m.m32346f(c11418b, "uninstalledEnoughApps");
        C9801m.m32346f(installAppSizeValidator, "installAppSizeValidator");
        this.installManager = installManager;
        this.appSize = j2;
        this.uninstalledEnoughApps = c11418b;
        this.installAppSizeValidator = installAppSizeValidator;
        this.requiredSpace = j2;
    }

    private final Single<Long> getInstalledAppSize(String packageName) {
        Single<Long> installedAppSize = this.installManager.getInstalledAppSize(packageName);
        C9801m.m32345e(installedAppSize, "installManager.getInstalledAppSize(packageName)");
        return installedAppSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getInstalledApps$lambda-2, reason: not valid java name */
    public static final C11234e m40815getInstalledApps$lambda2(List list) {
        return C11234e.m40020N(list).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.outofspace.f0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return OutOfSpaceManager.m40816getInstalledApps$lambda2$lambda0((RoomInstalled) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.outofspace.b0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return OutOfSpaceManager.m40817getInstalledApps$lambda2$lambda1((RoomInstalled) obj);
            }
        }).m40084Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getInstalledApps$lambda-2$lambda-0, reason: not valid java name */
    public static final Boolean m40816getInstalledApps$lambda2$lambda0(RoomInstalled roomInstalled) {
        return Boolean.valueOf((roomInstalled.getPackageName().equals("cm.aptoide.pt") || roomInstalled.getPackageName().equals(AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME)) ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getInstalledApps$lambda-2$lambda-1, reason: not valid java name */
    public static final InstalledApp m40817getInstalledApps$lambda2$lambda1(RoomInstalled roomInstalled) {
        String name = roomInstalled.getName();
        C9801m.m32345e(name, "it.name");
        String packageName = roomInstalled.getPackageName();
        C9801m.m32345e(packageName, "it.packageName");
        String icon = roomInstalled.getIcon();
        C9801m.m32345e(icon, "it.icon");
        Long appSize = roomInstalled.getAppSize();
        C9801m.m32345e(appSize, "it.appSize");
        return new InstalledApp(name, packageName, icon, appSize.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRequiredStorageSize$lambda-6, reason: not valid java name */
    public static final void m40818getRequiredStorageSize$lambda6(OutOfSpaceManager outOfSpaceManager, Long l) {
        C9801m.m32346f(outOfSpaceManager, "this$0");
        C9801m.m32345e(l, "it");
        outOfSpaceManager.requiredSpace = l.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uninstallApp$lambda-4, reason: not valid java name */
    public static final Single m40819uninstallApp$lambda4(final OutOfSpaceManager outOfSpaceManager, String str, final Long l) {
        C9801m.m32346f(outOfSpaceManager, "this$0");
        return outOfSpaceManager.installManager.uninstallApp(str).m39975c(Single.m39913m(l)).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.outofspace.e0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                OutOfSpaceManager.m40820uninstallApp$lambda4$lambda3(this.f8720f, l, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uninstallApp$lambda-4$lambda-3, reason: not valid java name */
    public static final void m40820uninstallApp$lambda4$lambda3(OutOfSpaceManager outOfSpaceManager, Long l, Long l2) {
        C9801m.m32346f(outOfSpaceManager, "this$0");
        long j2 = outOfSpaceManager.requiredSpace;
        C9801m.m32345e(l, "appSize");
        if (j2 <= l.longValue()) {
            outOfSpaceManager.uninstalledEnoughApps.onNext(null);
        } else {
            outOfSpaceManager.requiredSpace -= l.longValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uninstallApp$lambda-5, reason: not valid java name */
    public static final Long m40821uninstallApp$lambda5(OutOfSpaceManager outOfSpaceManager, Long l) {
        C9801m.m32346f(outOfSpaceManager, "this$0");
        return Long.valueOf(outOfSpaceManager.requiredSpace);
    }

    public final C11234e<List<InstalledApp>> getInstalledApps() {
        C11234e c11234eM40060G = this.installManager.fetchInstalledExceptSystem().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.outofspace.g0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return OutOfSpaceManager.m40815getInstalledApps$lambda2((List) obj);
            }
        });
        C9801m.m32345e(c11234eM40060G, "installManager.fetchInst…      .toList()\n        }");
        return c11234eM40060G;
    }

    public final Single<Long> getRequiredStorageSize() {
        Single<Long> singleM39919g = Single.m39913m(Long.valueOf(this.appSize - this.installAppSizeValidator.getAvailableSpace())).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.download.view.outofspace.c0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                OutOfSpaceManager.m40818getRequiredStorageSize$lambda6(this.f8716f, (Long) obj);
            }
        });
        C9801m.m32345e(singleM39919g, "just(appSize - installAp…ss { requiredSpace = it }");
        return singleM39919g;
    }

    public final Single<Long> uninstallApp(final String packageName) {
        Single<Long> singleM39923n = getInstalledAppSize(packageName).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.outofspace.h0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return OutOfSpaceManager.m40819uninstallApp$lambda4(this.f8727f, packageName, (Long) obj);
            }
        }).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.download.view.outofspace.d0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return OutOfSpaceManager.m40821uninstallApp$lambda5(this.f8718f, (Long) obj);
            }
        });
        C9801m.m32345e(singleM39923n, "getInstalledAppSize(pack…  }.map { requiredSpace }");
        return singleM39923n;
    }

    public final C11234e<Void> uninstalledEnoughApps() {
        return this.uninstalledEnoughApps;
    }
}
