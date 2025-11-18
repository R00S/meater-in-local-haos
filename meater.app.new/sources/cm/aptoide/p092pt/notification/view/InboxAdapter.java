package cm.aptoide.p092pt.notification.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.notification.AptoideNotification;
import java.util.List;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class InboxAdapter extends RecyclerView.AbstractC0594g<InboxViewHolder> {
    private C11418b<AptoideNotification> notificationSubject;
    private List<AptoideNotification> notifications;

    public InboxAdapter(List<AptoideNotification> list, C11418b<AptoideNotification> c11418b) {
        this.notifications = list;
        this.notificationSubject = c11418b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.notifications.size();
    }

    public void updateNotifications(List<AptoideNotification> list) {
        this.notifications = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onBindViewHolder(InboxViewHolder inboxViewHolder, int i2) {
        inboxViewHolder.setNotification(this.notifications.get(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public InboxViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new InboxViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.fragment_inbox_list_item, viewGroup, false), this.notificationSubject);
    }
}
