package cm.aptoide.p092pt.install;

import p456rx.Single;

/* loaded from: classes.dex */
public interface AptoideInstallPersistence {
    void insert(String str);

    Single<Boolean> isInstalledWithAptoide(String str);
}
