package cm.aptoide.p092pt.editorial;

import cm.aptoide.p092pt.app.DownloadModel;

/* loaded from: classes.dex */
public class EditorialDownloadModel extends DownloadModel {
    private final int position;

    public EditorialDownloadModel(DownloadModel.Action action, int i2, DownloadModel.DownloadState downloadState, int i3, long j2) {
        super(action, i2, downloadState, j2);
        this.position = i3;
    }

    public int getPosition() {
        return this.position;
    }
}
