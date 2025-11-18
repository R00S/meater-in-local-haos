package cm.aptoide.p092pt.home.apps;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.database.room.RoomUpdate;
import cm.aptoide.p092pt.home.apps.model.DownloadApp;
import cm.aptoide.p092pt.home.apps.model.InstalledApp;
import cm.aptoide.p092pt.home.apps.model.StateApp;
import cm.aptoide.p092pt.home.apps.model.UpdateApp;
import cm.aptoide.p092pt.install.Install;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class AppMapper {

    /* renamed from: cm.aptoide.pt.home.apps.AppMapper$1 */
    static /* synthetic */ class C28271 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus;

        static {
            int[] iArr = new int[Install.InstallationStatus.values().length];
            $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus = iArr;
            try {
                iArr[Install.InstallationStatus.GENERIC_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[Install.InstallationStatus.INSTALLATION_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[Install.InstallationStatus.NOT_ENOUGH_SPACE_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[Install.InstallationStatus.IN_QUEUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[Install.InstallationStatus.PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[Install.InstallationStatus.DOWNLOADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[Install.InstallationStatus.INSTALLING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[Install.InstallationStatus.UNINSTALLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[Install.InstallationStatus.INITIAL_STATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private StateApp.Status mapDownloadStatus(Install.InstallationStatus installationStatus, boolean z) {
        if (z && installationStatus != Install.InstallationStatus.INSTALLING) {
            return StateApp.Status.IN_QUEUE;
        }
        switch (C28271.$SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[installationStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return StateApp.Status.ERROR;
            case 4:
                return StateApp.Status.IN_QUEUE;
            case 5:
                return StateApp.Status.PAUSE;
            case 6:
                return StateApp.Status.ACTIVE;
            case 7:
                return StateApp.Status.INSTALLING;
            default:
                return StateApp.Status.STANDBY;
        }
    }

    public List<DownloadApp> getDownloadApps(List<Install> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Install install = list.get(i2);
            arrayList.add(new DownloadApp(install.getAppName(), install.getMd5(), install.getIcon(), install.getPackageName(), install.getProgress(), install.getVersionName(), install.getVersionCode(), mapDownloadStatus(install.getState(), install.isIndeterminate()), -1L));
        }
        Collections.sort(arrayList, new Comparator() { // from class: cm.aptoide.pt.home.apps.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((DownloadApp) obj).getName().compareToIgnoreCase(((DownloadApp) obj2).getName());
            }
        });
        return arrayList;
    }

    public UpdateApp mapInstallToUpdateApp(Install install, boolean z) {
        return new UpdateApp(install.getAppName(), install.getMd5(), install.getIcon(), install.getPackageName(), install.getProgress(), install.getVersionName(), install.getVersionCode(), mapDownloadStatus(install.getState(), install.isIndeterminate()), -1L, z);
    }

    public List<InstalledApp> mapInstalledToInstalledApps(List<RoomInstalled> list) {
        ArrayList arrayList = new ArrayList();
        for (RoomInstalled roomInstalled : list) {
            arrayList.add(new InstalledApp(roomInstalled.getName(), roomInstalled.getPackageName(), roomInstalled.getVersionName(), roomInstalled.getIcon()));
        }
        return arrayList;
    }

    public UpdateApp mapUpdateToUpdateApp(RoomUpdate roomUpdate, boolean z) {
        return new UpdateApp(roomUpdate.getLabel(), roomUpdate.getMd5(), roomUpdate.getIcon(), roomUpdate.getPackageName(), 0, roomUpdate.getUpdateVersionName(), roomUpdate.getUpdateVersionCode(), StateApp.Status.STANDBY, roomUpdate.getAppId(), z);
    }
}
