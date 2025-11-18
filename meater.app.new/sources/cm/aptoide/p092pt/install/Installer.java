package cm.aptoide.p092pt.install;

import cm.aptoide.p092pt.install.installer.InstallationState;
import p456rx.C11231b;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface Installer {
    void dispatchInstallations();

    C11231b downgrade(String str, boolean z, boolean z2);

    C11234e<InstallationState> getState(String str, int i2);

    C11231b install(String str, boolean z, boolean z2);

    void stopDispatching();

    C11231b uninstall(String str);

    C11231b update(String str, boolean z, boolean z2);
}
