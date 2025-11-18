package cm.aptoide.p092pt.install.installer;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import androidx.core.app.C0245i;

/* loaded from: classes.dex */
public class RootInstallErrorNotification {
    private final C0245i.a action;
    private final PendingIntent deleteAction;
    private final Bitmap icon;
    private final String message;
    public final int notificationId;

    public RootInstallErrorNotification(int i2, Bitmap bitmap, String str, C0245i.a aVar, PendingIntent pendingIntent) {
        this.notificationId = i2;
        this.icon = bitmap;
        this.message = str;
        this.action = aVar;
        this.deleteAction = pendingIntent;
    }

    public C0245i.a getAction() {
        return this.action;
    }

    public PendingIntent getDeleteAction() {
        return this.deleteAction;
    }

    public Bitmap getIcon() {
        return this.icon;
    }

    public String getMessage() {
        return this.message;
    }

    public int getNotificationId() {
        return this.notificationId;
    }
}
