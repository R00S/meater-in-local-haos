package cm.aptoide.p092pt.notification.view;

import cm.aptoide.p092pt.notification.AptoideNotification;
import cm.aptoide.p092pt.presenter.View;
import java.util.List;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface InboxView extends View {
    C11234e<AptoideNotification> notificationSelection();

    void showEmptyState();

    void showNotifications(List<AptoideNotification> list);
}
