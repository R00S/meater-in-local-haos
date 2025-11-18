package cm.aptoide.p092pt.notification.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.notification.AptoideNotification;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
class InboxViewHolder extends RecyclerView.AbstractC0590c0 {
    private TextView body;
    private C11418b<AptoideNotification> notificationSubject;
    private final TextView title;
    private ImageView userAvatar;

    protected InboxViewHolder(View view, C11418b<AptoideNotification> c11418b) {
        super(view);
        this.notificationSubject = c11418b;
        this.title = (TextView) view.findViewById(C1146R.id.fragment_inbox_list_title);
        this.body = (TextView) view.findViewById(C1146R.id.fragment_inbox_list_body);
        this.userAvatar = (ImageView) view.findViewById(C1146R.id.fragment_inbox_list_item_image);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setNotification$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8388a(AptoideNotification aptoideNotification, View view) {
        this.notificationSubject.onNext(aptoideNotification);
    }

    public void setNotification(final AptoideNotification aptoideNotification) {
        this.title.setText(aptoideNotification.getTitle());
        this.body.setText(aptoideNotification.getBody());
        ImageLoader.with(this.itemView.getContext()).loadWithShadowCircleTransform(aptoideNotification.getImg(), this.userAvatar);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.notification.view.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10483f.m8388a(aptoideNotification, view);
            }
        });
    }
}
