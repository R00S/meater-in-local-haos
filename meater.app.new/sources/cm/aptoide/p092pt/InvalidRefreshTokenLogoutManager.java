package cm.aptoide.p092pt;

import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.networking.RefreshTokenInvalidator;
import p456rx.C11231b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class InvalidRefreshTokenLogoutManager {
    private AptoideAccountManager aptoideAccountManager;
    private RefreshTokenInvalidator refreshTokenInvalidator;

    public InvalidRefreshTokenLogoutManager(AptoideAccountManager aptoideAccountManager, RefreshTokenInvalidator refreshTokenInvalidator) {
        this.aptoideAccountManager = aptoideAccountManager;
        this.refreshTokenInvalidator = refreshTokenInvalidator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$start$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6827a(Void r1) {
        return this.aptoideAccountManager.logout();
    }

    public void start() {
        this.refreshTokenInvalidator.getLogoutSubject().m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.k0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10286f.m6827a((Void) obj);
            }
        }).m40056D0();
    }
}
