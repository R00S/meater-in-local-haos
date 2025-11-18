package cm.aptoide.p092pt.app;

/* loaded from: classes.dex */
public class DownloadModel {
    private final Action action;
    private final long appSize;
    private final DownloadState downloadState;
    private final int progress;

    public enum Action {
        UPDATE,
        INSTALL,
        DOWNGRADE,
        OPEN,
        MIGRATE
    }

    public enum DownloadState {
        ACTIVE,
        PAUSE,
        COMPLETE,
        INDETERMINATE,
        ERROR,
        NOT_ENOUGH_STORAGE_ERROR,
        INSTALLING
    }

    public enum Error {
        NETWORK,
        GENERIC
    }

    public DownloadModel(Action action, int i2, DownloadState downloadState, long j2) {
        this.action = action;
        this.progress = i2;
        this.downloadState = downloadState;
        this.appSize = j2;
    }

    public Action getAction() {
        return this.action;
    }

    public long getAppSize() {
        return this.appSize;
    }

    public DownloadState getDownloadState() {
        return this.downloadState;
    }

    public int getProgress() {
        return this.progress;
    }

    public boolean hasError() {
        return this.downloadState.equals(DownloadState.ERROR) || this.downloadState.equals(DownloadState.NOT_ENOUGH_STORAGE_ERROR);
    }

    public boolean isDownloadable() {
        return this.action.equals(Action.INSTALL) || this.action.equals(Action.UPDATE) || this.action.equals(Action.DOWNGRADE);
    }

    public boolean isDownloading() {
        return this.downloadState.equals(DownloadState.ACTIVE) || this.downloadState.equals(DownloadState.PAUSE) || this.downloadState.equals(DownloadState.INDETERMINATE);
    }

    public boolean isDownloadingOrInstalling() {
        return isDownloading() || this.downloadState.equals(DownloadState.INSTALLING);
    }
}
