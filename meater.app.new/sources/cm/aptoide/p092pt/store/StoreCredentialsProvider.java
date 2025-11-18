package cm.aptoide.p092pt.store;

import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseRequestWithStore;

/* loaded from: classes.dex */
public interface StoreCredentialsProvider {
    BaseRequestWithStore.StoreCredentials fromUrl(String str);

    BaseRequestWithStore.StoreCredentials get(long j2);

    BaseRequestWithStore.StoreCredentials get(String str);
}
