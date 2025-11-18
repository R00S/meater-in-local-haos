package cm.aptoide.p092pt.app;

import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.GenericResponseV2;
import p456rx.Single;

/* loaded from: classes.dex */
public class FlagManager {
    private final FlagService flagService;

    public FlagManager(FlagService flagService) {
        this.flagService = flagService;
    }

    public Single<GenericResponseV2> flagApk(String str, String str2, String str3) {
        return this.flagService.doApkFlagRequest(str, str2, str3);
    }
}
