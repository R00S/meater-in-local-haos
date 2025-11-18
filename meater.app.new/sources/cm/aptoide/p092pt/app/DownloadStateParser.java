package cm.aptoide.p092pt.app;

import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.download.InstallType;
import cm.aptoide.p092pt.download.Origin;
import cm.aptoide.p092pt.install.Install;

/* loaded from: classes.dex */
public class DownloadStateParser {

    /* renamed from: cm.aptoide.pt.app.DownloadStateParser$1 */
    static /* synthetic */ class C14491 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$install$Install$InstallationType;

        static {
            int[] iArr = new int[DownloadModel.Action.values().length];
            $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action = iArr;
            try {
                iArr[DownloadModel.Action.INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.DOWNGRADE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.MIGRATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Install.InstallationType.values().length];
            $SwitchMap$cm$aptoide$pt$install$Install$InstallationType = iArr2;
            try {
                iArr2[Install.InstallationType.INSTALLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationType[Install.InstallationType.INSTALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationType[Install.InstallationType.DOWNGRADE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationType[Install.InstallationType.UPDATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[Install.InstallationStatus.values().length];
            $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus = iArr3;
            try {
                iArr3[Install.InstallationStatus.DOWNLOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[Install.InstallationStatus.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[Install.InstallationStatus.IN_QUEUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[Install.InstallationStatus.INITIAL_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[Install.InstallationStatus.INSTALLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[Install.InstallationStatus.UNINSTALLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[Install.InstallationStatus.INSTALLATION_TIMEOUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[Install.InstallationStatus.GENERIC_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[Install.InstallationStatus.NOT_ENOUGH_SPACE_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[Install.InstallationStatus.INSTALLING.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public InstallType getInstallType(int i2) {
        return i2 != 1 ? i2 != 2 ? InstallType.INSTALL : InstallType.DOWNGRADE : InstallType.UPDATE;
    }

    public Origin getOrigin(int i2) {
        return i2 != 1 ? i2 != 2 ? Origin.INSTALL : Origin.DOWNGRADE : Origin.UPDATE;
    }

    public int parseDownloadAction(DownloadModel.Action action) {
        int i2 = C14491.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[action.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3 || i2 == 4) {
            return 2;
        }
        throw new IllegalArgumentException("Invalid action " + action.toString());
    }

    public DownloadModel.DownloadState parseDownloadState(Install.InstallationStatus installationStatus, boolean z) {
        if (z && installationStatus != Install.InstallationStatus.INSTALLING) {
            return DownloadModel.DownloadState.INDETERMINATE;
        }
        switch (C14491.$SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[installationStatus.ordinal()]) {
            case 1:
                return DownloadModel.DownloadState.ACTIVE;
            case 2:
                return DownloadModel.DownloadState.PAUSE;
            case 3:
            case 4:
                return DownloadModel.DownloadState.INDETERMINATE;
            case 5:
            case 6:
                return DownloadModel.DownloadState.COMPLETE;
            case 7:
            case 8:
                return DownloadModel.DownloadState.ERROR;
            case 9:
                return DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR;
            case 10:
                return DownloadModel.DownloadState.INSTALLING;
            default:
                throw new IllegalStateException("Wrong type of download state");
        }
    }

    public DownloadModel.Action parseDownloadType(Install.InstallationType installationType, boolean z) {
        if (z) {
            return DownloadModel.Action.MIGRATE;
        }
        int i2 = C14491.$SwitchMap$cm$aptoide$pt$install$Install$InstallationType[installationType.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? DownloadModel.Action.INSTALL : DownloadModel.Action.UPDATE : DownloadModel.Action.DOWNGRADE : DownloadModel.Action.INSTALL : DownloadModel.Action.OPEN;
    }
}
