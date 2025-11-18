package cm.aptoide.p092pt.home.bundles.ads;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import cm.aptoide.aptoideviews.skeleton.Skeleton;
import cm.aptoide.aptoideviews.skeleton.SkeletonUtils;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.home.bundles.base.ActionBundle;
import cm.aptoide.p092pt.home.bundles.base.ActionItem;
import cm.aptoide.p092pt.home.bundles.base.AppBundleViewHolder;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class WalletAdsOfferViewHolder extends AppBundleViewHolder {
    private final Button dismissButton;
    private final ImageView icon;
    private View infoLayout;
    private final Button installWalletButton;
    private final TextView message;
    private Skeleton skeleton;
    private final TextView title;
    private final C11418b<HomeEvent> uiEventsListener;

    public WalletAdsOfferViewHolder(View view, C11418b<HomeEvent> c11418b) {
        super(view);
        this.uiEventsListener = c11418b;
        this.installWalletButton = (Button) view.findViewById(C1146R.id.action_button);
        this.dismissButton = (Button) view.findViewById(C1146R.id.dismiss_button);
        this.icon = (ImageView) view.findViewById(C1146R.id.icon);
        this.title = (TextView) view.findViewById(C1146R.id.title);
        this.message = (TextView) view.findViewById(C1146R.id.message);
        View viewFindViewById = view.findViewById(C1146R.id.card_info_layout);
        this.infoLayout = viewFindViewById;
        this.skeleton = SkeletonUtils.applySkeleton(viewFindViewById, (ViewGroup) view.findViewById(C1146R.id.root_layout), C1146R.layout.info_action_item_card_skeleton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setBundle$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8069a(HomeBundle homeBundle, View view) {
        this.uiEventsListener.onNext(new HomeEvent(homeBundle, getAdapterPosition(), HomeEvent.Type.INSTALL_WALLET));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setBundle$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8070b(HomeBundle homeBundle, View view) {
        this.uiEventsListener.onNext(new HomeEvent(homeBundle, getAdapterPosition(), HomeEvent.Type.DISMISS_BUNDLE));
    }

    @Override // cm.aptoide.p092pt.home.bundles.base.AppBundleViewHolder
    public void setBundle(final HomeBundle homeBundle, int i2) {
        ActionItem actionItem = ((ActionBundle) homeBundle).getActionItem();
        if (actionItem == null) {
            this.skeleton.showSkeleton();
            return;
        }
        this.skeleton.showOriginal();
        ImageLoader.with(this.itemView.getContext()).load(actionItem.getIcon(), this.icon);
        this.installWalletButton.setText(C1146R.string.wallet_promotion_install_button);
        this.dismissButton.setText(C1146R.string.wallet_promotion_no_button);
        this.title.setText(actionItem.getTitle());
        this.message.setText(actionItem.getSubTitle());
        this.installWalletButton.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.ads.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9520f.m8069a(homeBundle, view);
            }
        });
        this.dismissButton.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.ads.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9522f.m8070b(homeBundle, view);
            }
        });
    }
}
