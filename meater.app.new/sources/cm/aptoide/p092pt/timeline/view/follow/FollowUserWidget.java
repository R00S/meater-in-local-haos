package cm.aptoide.p092pt.timeline.view.follow;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0468d;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.timeline.view.displayable.FollowUserDisplayable;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class FollowUserWidget extends Widget<FollowUserDisplayable> {
    private LinearLayout followNumbers;
    private TextView followersNumber;
    private TextView followingNumber;
    private ImageView mainIcon;
    private ImageView secondaryIcon;
    private View separatorView;
    private TextView storeNameTv;
    private TextView userNameTv;

    public FollowUserWidget(View view) {
        super(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8863a(FollowUserDisplayable followUserDisplayable, Void r2) {
        followUserDisplayable.viewClicked(getFragmentNavigator());
    }

    private void setupStoreNameTv(String str) {
        this.storeNameTv.setText(str);
        this.storeNameTv.setVisibility(0);
        Drawable drawable = Build.VERSION.SDK_INT >= 21 ? getContext().getResources().getDrawable(C1146R.drawable.ic_store, null) : getContext().getResources().getDrawable(C1146R.drawable.ic_store);
        drawable.setBounds(0, 0, 30, 30);
        drawable.mutate();
        this.storeNameTv.setCompoundDrawablePadding(5);
        this.storeNameTv.setCompoundDrawables(drawable, null, null, null);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.userNameTv = (TextView) view.findViewById(C1146R.id.user_name);
        this.storeNameTv = (TextView) view.findViewById(C1146R.id.store_name);
        this.followingNumber = (TextView) view.findViewById(C1146R.id.following_number);
        this.followersNumber = (TextView) view.findViewById(C1146R.id.followers_number);
        this.mainIcon = (ImageView) view.findViewById(C1146R.id.main_icon);
        this.secondaryIcon = (ImageView) view.findViewById(C1146R.id.secondary_icon);
        this.followNumbers = (LinearLayout) view.findViewById(C1146R.id.followers_following_numbers);
        this.separatorView = view.findViewById(C1146R.id.separator_vertical);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(final FollowUserDisplayable followUserDisplayable, int i2) {
        this.followNumbers.setVisibility(0);
        this.separatorView.setVisibility(0);
        this.followingNumber.setText(followUserDisplayable.getFollowing());
        this.followersNumber.setText(followUserDisplayable.getFollowers());
        ActivityC0468d context = getContext();
        if (followUserDisplayable.hasStoreAndUser()) {
            ImageLoader.with(context).loadUsingCircleTransform(followUserDisplayable.getStoreAvatar(), this.mainIcon);
            ImageLoader.with(context).loadUsingCircleTransform(followUserDisplayable.getUserAvatar(), this.secondaryIcon);
            this.mainIcon.setVisibility(0);
            this.secondaryIcon.setVisibility(0);
        } else if (followUserDisplayable.hasUser()) {
            ImageLoader.with(context).loadUsingCircleTransform(followUserDisplayable.getUserAvatar(), this.mainIcon);
            this.secondaryIcon.setVisibility(8);
        } else if (followUserDisplayable.hasStore()) {
            ImageLoader.with(context).loadUsingCircleTransform(followUserDisplayable.getStoreAvatar(), this.mainIcon);
            this.secondaryIcon.setVisibility(8);
        } else {
            this.mainIcon.setVisibility(8);
            this.secondaryIcon.setVisibility(8);
        }
        if (followUserDisplayable.hasUser()) {
            this.userNameTv.setText(followUserDisplayable.getUserName());
            this.userNameTv.setVisibility(0);
        } else {
            this.userNameTv.setVisibility(8);
        }
        if (followUserDisplayable.hasStore()) {
            setupStoreNameTv(followUserDisplayable.storeName());
        } else {
            this.storeNameTv.setVisibility(8);
        }
        this.compositeSubscription.m40667a(C8975a.m28573a(this.itemView).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.timeline.view.follow.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11516f.m8863a(followUserDisplayable, (Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.timeline.view.follow.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }));
    }
}
