package cm.aptoide.p092pt.root;

import p456rx.C11231b;
import p456rx.Single;

/* loaded from: classes.dex */
public class RootAvailabilityManager {
    private RootValueSaver rootValueSaver;

    public RootAvailabilityManager(RootValueSaver rootValueSaver) {
        this.rootValueSaver = rootValueSaver;
    }

    public Single<Boolean> isRootAvailable() {
        return this.rootValueSaver.isPhoneRoot();
    }

    public C11231b updateRootAvailability() {
        return this.rootValueSaver.save(RootShell.isRootAvailable());
    }
}
