package cm.aptoide.p092pt.preferences;

import cm.aptoide.accountmanager.AccountService;
import cm.aptoide.accountmanager.AdultContent;
import p456rx.C11231b;
import p456rx.C11234e;

/* loaded from: classes.dex */
public class AdultContentManager implements AdultContent {
    private final AccountService accountService;
    private final LocalPersistenceAdultContent localContent;

    public AdultContentManager(LocalPersistenceAdultContent localPersistenceAdultContent, AccountService accountService) {
        this.localContent = localPersistenceAdultContent;
        this.accountService = accountService;
    }

    @Override // cm.aptoide.accountmanager.AdultContent
    public C11231b disable(boolean z) {
        return z ? this.accountService.updateAccount(false).m39973a(this.localContent.disable()) : this.localContent.disable();
    }

    @Override // cm.aptoide.accountmanager.AdultContent
    public C11231b enable(boolean z) {
        return z ? this.accountService.updateAccount(true).m39973a(this.localContent.enable()) : this.localContent.enable();
    }

    @Override // cm.aptoide.accountmanager.AdultContent
    public C11234e<Boolean> enabled() {
        return this.localContent.enabled();
    }

    @Override // cm.aptoide.accountmanager.AdultContent
    public C11234e<Boolean> pinRequired() {
        return this.localContent.pinRequired();
    }

    @Override // cm.aptoide.accountmanager.AdultContent
    public C11231b removePin(int i2) {
        return this.localContent.removePin(i2);
    }

    @Override // cm.aptoide.accountmanager.AdultContent
    public C11231b requirePin(int i2) {
        return this.localContent.requirePin(i2);
    }

    @Override // cm.aptoide.accountmanager.AdultContent
    public C11231b enable(int i2) {
        return this.localContent.enable(i2);
    }
}
