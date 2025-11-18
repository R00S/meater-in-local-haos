package cm.aptoide.p092pt.downloadmanager;

import p456rx.C11231b;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface AppDownloader {
    C11234e<AppDownloadStatus> observeDownloadProgress();

    C11231b pauseAppDownload();

    C11231b removeAppDownload();

    void startAppDownload();

    void stop();
}
