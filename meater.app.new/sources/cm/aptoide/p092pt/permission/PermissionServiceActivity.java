package cm.aptoide.p092pt.permission;

import android.R;
import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.os.Bundle;
import androidx.core.app.C0237a;
import androidx.core.content.C0255a;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.actions.PermissionService;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.utils.SimpleSubscriber;
import cm.aptoide.p092pt.utils.design.ShowMessage;
import com.facebook.C5641a0;
import okhttp3.HttpUrl;
import p456rx.p460m.InterfaceC11252a;

@Deprecated
/* loaded from: classes.dex */
public abstract class PermissionServiceActivity extends ActivityResultNavigator implements PermissionService {
    private static final int ACCESS_TO_ACCOUNTS_REQUEST_ID = 62;
    private static final int ACCESS_TO_EXTERNAL_FS_REQUEST_ID = 61;
    private static final int PERMISSIONS_REQUEST_ACCESS_CAMERA = 101;
    private static final String TAG = PermissionServiceActivity.class.getName();
    private ConnectivityManager connectivityManager;
    private SharedPreferences sharedPreferences;
    private InterfaceC11252a toRunWhenAccessToAccountsIsDenied;
    private InterfaceC11252a toRunWhenAccessToAccountsIsGranted;
    private InterfaceC11252a toRunWhenAccessToFileSystemIsDenied;
    private InterfaceC11252a toRunWhenAccessToFileSystemIsGranted;

    private void showBypassWifiMessage(long j2, SimpleSubscriber<GenericDialogs.EResponse> simpleSubscriber) {
        GenericDialogs.createGenericOkCancelMessageWithColorButton(this, HttpUrl.FRAGMENT_ENCODE_SET, getString(C1146R.string.general_downloads_dialog_only_wifi_message), getString(C1146R.string.general_downloads_dialog_only_wifi_install_button, new Object[]{AptoideUtils.StringU.formatBytes(j2, false)}), getString(C1146R.string.cancel)).m40058E0(simpleSubscriber);
    }

    private void showMessageOKCancel(int i2, SimpleSubscriber<GenericDialogs.EResponse> simpleSubscriber) {
        showMessageOKCancel(getString(i2), simpleSubscriber);
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void hasDownloadAccess(InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2) {
        if (C0255a.m1672a(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0 || (AptoideUtils.SystemU.getConnectionType(this.connectivityManager).equals("mobile") && !ManagerPreferences.getDownloadsWifiOnly(this.sharedPreferences))) {
            if (interfaceC11252a2 != null) {
                interfaceC11252a2.call();
            }
        } else if (interfaceC11252a != null) {
            interfaceC11252a.call();
        }
    }

    @Override // cm.aptoide.p092pt.navigator.ActivityResultNavigator, cm.aptoide.p092pt.view.BaseActivity, com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        this.sharedPreferences = ((AptoideApplication) getApplicationContext()).getDefaultSharedPreferences();
        if (C5641a0.m11304w()) {
            return;
        }
        C5641a0.m11273M(getApplicationContext());
    }

    @Override // androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, android.app.Activity
    @TargetApi(23)
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (iArr.length == 0) {
            super.onRequestPermissionsResult(i2, strArr, iArr);
        }
        if (i2 == 61) {
            if (iArr[0] != 0) {
                InterfaceC11252a interfaceC11252a = this.toRunWhenAccessToFileSystemIsDenied;
                if (interfaceC11252a != null) {
                    interfaceC11252a.call();
                }
                ShowMessage.asSnack(findViewById(R.id.content), "access to read and write to external storage was denied");
                return;
            }
            Logger.getInstance().m8283v(TAG, "access to read and write to external storage was granted");
            InterfaceC11252a interfaceC11252a2 = this.toRunWhenAccessToFileSystemIsGranted;
            if (interfaceC11252a2 != null) {
                interfaceC11252a2.call();
                return;
            }
            return;
        }
        if (i2 != 62) {
            super.onRequestPermissionsResult(i2, strArr, iArr);
            return;
        }
        if (iArr[0] != 0) {
            InterfaceC11252a interfaceC11252a3 = this.toRunWhenAccessToAccountsIsDenied;
            if (interfaceC11252a3 != null) {
                interfaceC11252a3.call();
            }
            ShowMessage.asSnack(findViewById(R.id.content), "access to get accounts was denied");
            return;
        }
        Logger.getInstance().m8283v(TAG, "access to get accounts was granted");
        InterfaceC11252a interfaceC11252a4 = this.toRunWhenAccessToAccountsIsGranted;
        if (interfaceC11252a4 != null) {
            interfaceC11252a4.call();
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToAccounts(InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2) {
        requestAccessToAccounts(true, interfaceC11252a, interfaceC11252a2);
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    public void requestAccessToCamera(InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2) {
        if (C0255a.m1672a(this, "android.permission.CAMERA") == 0) {
            Logger.getInstance().m8283v(TAG, "already has permission to access camera");
            if (interfaceC11252a != null) {
                interfaceC11252a.call();
                return;
            }
            return;
        }
        this.toRunWhenAccessToFileSystemIsGranted = interfaceC11252a;
        this.toRunWhenAccessToFileSystemIsDenied = interfaceC11252a2;
        if (C0237a.m1528t(this, "android.permission.CAMERA")) {
            Logger.getInstance().m8283v(TAG, "showing rationale and requesting permission to access camera");
            showMessageOKCancel(C1146R.string.camera_access_permission_request_message, new SimpleSubscriber<GenericDialogs.EResponse>() { // from class: cm.aptoide.pt.permission.PermissionServiceActivity.4
                @Override // cm.aptoide.p092pt.utils.SimpleSubscriber, p456rx.InterfaceC11241f
                public void onNext(GenericDialogs.EResponse eResponse) {
                    super.onNext((C37624) eResponse);
                    if (eResponse == GenericDialogs.EResponse.YES) {
                        C0237a.m1525q(PermissionServiceActivity.this, new String[]{"android.permission.CAMERA"}, 101);
                    } else if (PermissionServiceActivity.this.toRunWhenAccessToFileSystemIsDenied != null) {
                        PermissionServiceActivity.this.toRunWhenAccessToFileSystemIsDenied.call();
                    }
                }
            });
        } else {
            C0237a.m1525q(this, new String[]{"android.permission.CAMERA"}, 101);
            Logger.getInstance().m8283v(TAG, "requesting permission to access camera");
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToExternalFileSystem(InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2) {
        requestAccessToExternalFileSystem(true, interfaceC11252a, interfaceC11252a2);
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    public void requestDownloadAccess(final InterfaceC11252a interfaceC11252a, final InterfaceC11252a interfaceC11252a2, boolean z, boolean z2, long j2) {
        if (z || !AptoideUtils.SystemU.getConnectionType(this.connectivityManager).equals("mobile") || ManagerPreferences.getDownloadsWifiOnly(this.sharedPreferences)) {
            if (interfaceC11252a != null) {
                interfaceC11252a.call();
            }
        } else if (z2) {
            showBypassWifiMessage(j2, new SimpleSubscriber<GenericDialogs.EResponse>() { // from class: cm.aptoide.pt.permission.PermissionServiceActivity.2
                @Override // cm.aptoide.p092pt.utils.SimpleSubscriber, p456rx.InterfaceC11241f
                public void onNext(GenericDialogs.EResponse eResponse) {
                    super.onNext((C37602) eResponse);
                    if (eResponse == GenericDialogs.EResponse.YES) {
                        InterfaceC11252a interfaceC11252a3 = interfaceC11252a;
                        if (interfaceC11252a3 != null) {
                            interfaceC11252a3.call();
                            return;
                        }
                        return;
                    }
                    InterfaceC11252a interfaceC11252a4 = interfaceC11252a2;
                    if (interfaceC11252a4 != null) {
                        interfaceC11252a4.call();
                    }
                }
            });
        } else {
            showMessageOKCancel(C1146R.string.general_downloads_dialog_only_wifi_message, new SimpleSubscriber<GenericDialogs.EResponse>() { // from class: cm.aptoide.pt.permission.PermissionServiceActivity.3
                @Override // cm.aptoide.p092pt.utils.SimpleSubscriber, p456rx.InterfaceC11241f
                public void onNext(GenericDialogs.EResponse eResponse) {
                    super.onNext((C37613) eResponse);
                    if (eResponse == GenericDialogs.EResponse.YES) {
                        PermissionServiceActivity.this.getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newSettingsFragment(), true);
                        return;
                    }
                    InterfaceC11252a interfaceC11252a3 = interfaceC11252a2;
                    if (interfaceC11252a3 != null) {
                        interfaceC11252a3.call();
                    }
                }
            });
        }
    }

    private void showMessageOKCancel(String str, SimpleSubscriber<GenericDialogs.EResponse> simpleSubscriber) {
        GenericDialogs.createGenericOkCancelMessage(this, HttpUrl.FRAGMENT_ENCODE_SET, str, this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId).m40058E0(simpleSubscriber);
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToAccounts(boolean z, InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2) {
        if (C0255a.m1672a(this, "android.permission.GET_ACCOUNTS") == 0) {
            Logger.getInstance().m8283v(TAG, "already has permission to access accounts");
            if (interfaceC11252a != null) {
                interfaceC11252a.call();
                return;
            }
            return;
        }
        this.toRunWhenAccessToAccountsIsGranted = interfaceC11252a;
        this.toRunWhenAccessToAccountsIsDenied = interfaceC11252a2;
        if (z || C0237a.m1528t(this, "android.permission.GET_ACCOUNTS")) {
            Logger.getInstance().m8283v(TAG, "showing rationale and requesting permission to access accounts");
            showMessageOKCancel(C1146R.string.access_to_get_accounts_rationale, new SimpleSubscriber<GenericDialogs.EResponse>() { // from class: cm.aptoide.pt.permission.PermissionServiceActivity.1
                @Override // cm.aptoide.p092pt.utils.SimpleSubscriber, p456rx.InterfaceC11241f
                public void onNext(GenericDialogs.EResponse eResponse) {
                    super.onNext((C37591) eResponse);
                    if (eResponse == GenericDialogs.EResponse.YES) {
                        C0237a.m1525q(PermissionServiceActivity.this, new String[]{"android.permission.GET_ACCOUNTS"}, 62);
                    } else if (PermissionServiceActivity.this.toRunWhenAccessToAccountsIsDenied != null) {
                        PermissionServiceActivity.this.toRunWhenAccessToAccountsIsDenied.call();
                    }
                }
            });
        } else {
            C0237a.m1525q(this, new String[]{"android.permission.GET_ACCOUNTS"}, 62);
            Logger.getInstance().m8283v(TAG, "requesting permission to access accounts");
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToExternalFileSystem(boolean z, InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2) {
        requestAccessToExternalFileSystem(z, C1146R.string.storage_access_permission_request_message, interfaceC11252a, interfaceC11252a2);
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToExternalFileSystem(boolean z, int i2, InterfaceC11252a interfaceC11252a, InterfaceC11252a interfaceC11252a2) {
        if (C0255a.m1672a(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.toRunWhenAccessToFileSystemIsGranted = interfaceC11252a;
            this.toRunWhenAccessToFileSystemIsDenied = interfaceC11252a2;
            if (!z && !C0237a.m1528t(this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                C0237a.m1525q(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 61);
                Logger.getInstance().m8283v(TAG, "requesting permission to access external storage");
                return;
            } else {
                Logger.getInstance().m8283v(TAG, "showing rationale and requesting permission to access external storage");
                showMessageOKCancel(i2, new SimpleSubscriber<GenericDialogs.EResponse>() { // from class: cm.aptoide.pt.permission.PermissionServiceActivity.5
                    @Override // cm.aptoide.p092pt.utils.SimpleSubscriber, p456rx.InterfaceC11241f
                    public void onNext(GenericDialogs.EResponse eResponse) {
                        super.onNext((C37635) eResponse);
                        if (eResponse == GenericDialogs.EResponse.YES) {
                            C0237a.m1525q(PermissionServiceActivity.this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 61);
                        } else if (PermissionServiceActivity.this.toRunWhenAccessToFileSystemIsDenied != null) {
                            PermissionServiceActivity.this.toRunWhenAccessToFileSystemIsDenied.call();
                        }
                    }
                });
                return;
            }
        }
        Logger.getInstance().m8283v(TAG, "already has permission to access external storage");
        if (interfaceC11252a != null) {
            interfaceC11252a.call();
        }
    }
}
