package cm.aptoide.p092pt.install.installer;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.C0245i;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.install.Install;
import java.util.List;

/* loaded from: classes.dex */
public class RootInstallErrorNotificationFactory {
    private final PendingIntent dismissAction;
    private final Bitmap icon;
    private final C0245i.a notificationAction;
    private final int notificationId;

    public RootInstallErrorNotificationFactory(int i2, Bitmap bitmap, C0245i.a aVar, PendingIntent pendingIntent) {
        this.notificationId = i2;
        this.icon = bitmap;
        this.notificationAction = aVar;
        this.dismissAction = pendingIntent;
    }

    private String getNotificationTitle(Context context, List<Install> list) {
        return list.size() == 1 ? context.getString(C1146R.string.generalscreen_short_root_install_single_app_timeout_error_message) : context.getString(C1146R.string.generalscreen_short_root_install_timeout_error_message, Integer.valueOf(list.size()));
    }

    public RootInstallErrorNotification create(Context context, List<Install> list) {
        return new RootInstallErrorNotification(this.notificationId, this.icon, getNotificationTitle(context, list), this.notificationAction, this.dismissAction);
    }
}
