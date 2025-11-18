package cm.aptoide.p092pt.app;

import cm.aptoide.p092pt.app.view.AppCoinsViewModel;

/* loaded from: classes.dex */
public class AppViewModel {
    private AppCoinsViewModel appCoinsViewModel;
    private AppModel appModel;
    private DownloadModel downloadModel;
    private MigrationModel migrationModel;

    public AppViewModel(AppModel appModel, DownloadModel downloadModel, AppCoinsViewModel appCoinsViewModel, MigrationModel migrationModel) {
        this.appModel = appModel;
        this.downloadModel = downloadModel;
        this.appCoinsViewModel = appCoinsViewModel;
        this.migrationModel = migrationModel;
    }

    public AppCoinsViewModel getAppCoinsViewModel() {
        return this.appCoinsViewModel;
    }

    public AppModel getAppModel() {
        return this.appModel;
    }

    public DownloadModel getDownloadModel() {
        return this.downloadModel;
    }

    public MigrationModel getMigrationModel() {
        return this.migrationModel;
    }

    public void setDownloadModel(DownloadModel downloadModel) {
        this.downloadModel = downloadModel;
    }
}
