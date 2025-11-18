package cm.aptoide.p092pt.view.recycler.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0468d;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.FullReview;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetAppMeta;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.reviews.RowReviewDisplayable;
import cm.aptoide.p092pt.utils.AptoideUtils;
import java.util.Locale;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class RowReviewWidget extends Widget<RowReviewDisplayable> {
    public ImageView appIcon;
    public TextView appName;
    private ImageView avatar;
    public TextView rating;
    private TextView reviewBody;
    private TextView reviewer;

    public RowReviewWidget(View view) {
        super(view);
    }

    static /* synthetic */ void lambda$bindView$0(RowReviewDisplayable rowReviewDisplayable, FragmentNavigator fragmentNavigator, GetAppMeta.App app, FullReview fullReview, Void r14) {
        if (rowReviewDisplayable.getStoreAnalytics() != null) {
            rowReviewDisplayable.getStoreAnalytics().sendStoreInteractEvent("View Review", "Latest Reviews", rowReviewDisplayable.getPojo().getData().getApp().getStore().getName());
        }
        fragmentNavigator.navigateTo(AptoideApplication.getFragmentProvider().newRateAndReviewsFragment(app.getId(), app.getName(), app.getStore().getName(), app.getPackageName(), fullReview.getId()), true);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.appIcon = (ImageView) view.findViewById(C1146R.id.app_icon);
        this.rating = (TextView) view.findViewById(C1146R.id.rating);
        this.appName = (TextView) view.findViewById(C1146R.id.app_name);
        this.avatar = (ImageView) view.findViewById(C1146R.id.avatar);
        this.reviewer = (TextView) view.findViewById(C1146R.id.reviewer);
        this.reviewBody = (TextView) view.findViewById(C1146R.id.description);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(final RowReviewDisplayable rowReviewDisplayable, int i2) {
        ActivityC0468d context = getContext();
        final FullReview pojo = rowReviewDisplayable.getPojo();
        final GetAppMeta.App app = pojo.getData().getApp();
        if (app != null) {
            this.appName.setText(app.getName());
            ImageLoader.with(context).load(app.getIcon(), this.appIcon);
        } else {
            this.appName.setVisibility(4);
            this.appIcon.setVisibility(4);
        }
        this.reviewBody.setText(pojo.getBody());
        this.reviewer.setText(AptoideUtils.StringU.getFormattedString(C1146R.string.reviewed_by, getContext().getResources(), pojo.getUser().getName()));
        this.rating.setText(String.format(Locale.getDefault(), "%d", Long.valueOf((long) pojo.getStats().getRating())));
        ImageLoader.with(context).loadWithCircleTransformAndPlaceHolderAvatarSize(pojo.getUser().getAvatar(), this.avatar, C1146R.drawable.layer_1);
        final FragmentNavigator fragmentNavigator = getFragmentNavigator();
        this.compositeSubscription.m40667a(C8975a.m28573a(this.itemView).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.recycler.widget.e
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                RowReviewWidget.lambda$bindView$0(rowReviewDisplayable, fragmentNavigator, app, pojo, (Void) obj);
            }
        }));
    }
}
