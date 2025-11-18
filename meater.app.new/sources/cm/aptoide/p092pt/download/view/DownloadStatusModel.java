package cm.aptoide.p092pt.download.view;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: DownloadStatusModel.kt */
@Metadata(m32266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u001d\u001e\u001fB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0016\u001a\u00020\u0014J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u0018\u001a\u00020\u0014J\u0006\u0010\u0019\u001a\u00020\u0014J\u0006\u0010\u001a\u001a\u00020\u0014J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m32267d2 = {"Lcm/aptoide/pt/download/view/DownloadStatusModel;", HttpUrl.FRAGMENT_ENCODE_SET, "action", "Lcm/aptoide/pt/download/view/DownloadStatusModel$Action;", "progress", HttpUrl.FRAGMENT_ENCODE_SET, "downloadState", "Lcm/aptoide/pt/download/view/DownloadStatusModel$DownloadState;", "(Lcm/aptoide/pt/download/view/DownloadStatusModel$Action;ILcm/aptoide/pt/download/view/DownloadStatusModel$DownloadState;)V", "getAction", "()Lcm/aptoide/pt/download/view/DownloadStatusModel$Action;", "getDownloadState", "()Lcm/aptoide/pt/download/view/DownloadStatusModel$DownloadState;", "getProgress", "()I", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hasError", "hashCode", "isDownloadable", "isDownloading", "isDownloadingOrInstalling", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "Action", "DownloadState", "Error", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DownloadStatusModel {
    private final Action action;
    private final DownloadState downloadState;
    private final int progress;

    /* compiled from: DownloadStatusModel.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m32267d2 = {"Lcm/aptoide/pt/download/view/DownloadStatusModel$Action;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "UPDATE", "INSTALL", "DOWNGRADE", "OPEN", "MIGRATE", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public enum Action {
        UPDATE,
        INSTALL,
        DOWNGRADE,
        OPEN,
        MIGRATE
    }

    /* compiled from: DownloadStatusModel.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m32267d2 = {"Lcm/aptoide/pt/download/view/DownloadStatusModel$DownloadState;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "STANDBY", "IN_QUEUE", "GENERIC_ERROR", "NOT_ENOUGH_STORAGE_ERROR", "PAUSE", "ACTIVE", "INSTALLING", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public enum DownloadState {
        STANDBY,
        IN_QUEUE,
        GENERIC_ERROR,
        NOT_ENOUGH_STORAGE_ERROR,
        PAUSE,
        ACTIVE,
        INSTALLING
    }

    /* compiled from: DownloadStatusModel.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m32267d2 = {"Lcm/aptoide/pt/download/view/DownloadStatusModel$Error;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "NETWORK", "GENERIC", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public enum Error {
        NETWORK,
        GENERIC
    }

    public DownloadStatusModel(Action action, int i2, DownloadState downloadState) {
        C9801m.m32346f(action, "action");
        C9801m.m32346f(downloadState, "downloadState");
        this.action = action;
        this.progress = i2;
        this.downloadState = downloadState;
    }

    public static /* synthetic */ DownloadStatusModel copy$default(DownloadStatusModel downloadStatusModel, Action action, int i2, DownloadState downloadState, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            action = downloadStatusModel.action;
        }
        if ((i3 & 2) != 0) {
            i2 = downloadStatusModel.progress;
        }
        if ((i3 & 4) != 0) {
            downloadState = downloadStatusModel.downloadState;
        }
        return downloadStatusModel.copy(action, i2, downloadState);
    }

    /* renamed from: component1, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* renamed from: component3, reason: from getter */
    public final DownloadState getDownloadState() {
        return this.downloadState;
    }

    public final DownloadStatusModel copy(Action action, int progress, DownloadState downloadState) {
        C9801m.m32346f(action, "action");
        C9801m.m32346f(downloadState, "downloadState");
        return new DownloadStatusModel(action, progress, downloadState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadStatusModel)) {
            return false;
        }
        DownloadStatusModel downloadStatusModel = (DownloadStatusModel) other;
        return this.action == downloadStatusModel.action && this.progress == downloadStatusModel.progress && this.downloadState == downloadStatusModel.downloadState;
    }

    public final Action getAction() {
        return this.action;
    }

    public final DownloadState getDownloadState() {
        return this.downloadState;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final boolean hasError() {
        DownloadState downloadState = this.downloadState;
        return downloadState == DownloadState.GENERIC_ERROR || downloadState == DownloadState.NOT_ENOUGH_STORAGE_ERROR;
    }

    public int hashCode() {
        return (((this.action.hashCode() * 31) + this.progress) * 31) + this.downloadState.hashCode();
    }

    public final boolean isDownloadable() {
        Action action = this.action;
        return action == Action.INSTALL || action == Action.UPDATE || action == Action.DOWNGRADE;
    }

    public final boolean isDownloading() {
        DownloadState downloadState = this.downloadState;
        return downloadState == DownloadState.ACTIVE || downloadState == DownloadState.PAUSE || downloadState == DownloadState.IN_QUEUE;
    }

    public final boolean isDownloadingOrInstalling() {
        return isDownloading() || this.downloadState == DownloadState.INSTALLING;
    }

    public String toString() {
        return "DownloadStatusModel(action=" + this.action + ", progress=" + this.progress + ", downloadState=" + this.downloadState + ')';
    }
}
