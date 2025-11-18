package cm.aptoide.p092pt.home.bundles.editorial;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import cm.aptoide.aptoideviews.appcoins.BonusAppcView;
import cm.aptoide.aptoideviews.skeleton.Skeleton;
import cm.aptoide.aptoideviews.skeleton.SkeletonUtils;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.bonus.BonusAppcModel;
import cm.aptoide.p092pt.editorial.CaptionBackgroundPainter;
import cm.aptoide.p092pt.editorialList.CurationCard;
import cm.aptoide.p092pt.home.bundles.base.ActionBundle;
import cm.aptoide.p092pt.home.bundles.base.ActionItem;
import cm.aptoide.p092pt.home.bundles.base.EditorialActionBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.reactions.ReactionMapper;
import cm.aptoide.p092pt.reactions.ReactionsHomeEvent;
import cm.aptoide.p092pt.reactions.TopReactionsPreview;
import cm.aptoide.p092pt.reactions.data.ReactionType;
import cm.aptoide.p092pt.reactions.data.TopReaction;
import cm.aptoide.p092pt.reactions.p103ui.ReactionsPopup;
import cm.aptoide.p092pt.reactions.p103ui.ReactionsView;
import cm.aptoide.p092pt.themes.ThemeManager;
import com.google.android.material.snackbar.Snackbar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class EditorialBundleViewHolder extends EditorialViewHolder {
    private final ImageView backgroundImage;
    private final BonusAppcView bonusAppcView;
    private final CaptionBackgroundPainter captionBackgroundPainter;
    private final CardView curationTypeCaption;
    private final TextView curationTypeCaptionText;
    private final View editorialCard;
    private final TextView editorialDate;
    private final TextView editorialTitle;
    private final ImageButton reactButton;
    private Skeleton skeleton;
    private final ThemeManager themeAttributeProvider;
    private TopReactionsPreview topReactionsPreview;
    private final C11418b<HomeEvent> uiEventsListener;

    public EditorialBundleViewHolder(View view, C11418b<HomeEvent> c11418b, CaptionBackgroundPainter captionBackgroundPainter, ThemeManager themeManager) {
        super(view);
        this.uiEventsListener = c11418b;
        View viewFindViewById = view.findViewById(C1146R.id.editorial_card);
        this.editorialCard = viewFindViewById;
        this.editorialTitle = (TextView) view.findViewById(C1146R.id.editorial_title);
        this.editorialDate = (TextView) view.findViewById(C1146R.id.editorial_date);
        this.backgroundImage = (ImageView) view.findViewById(C1146R.id.background_image);
        this.reactButton = (ImageButton) view.findViewById(C1146R.id.add_reactions);
        this.curationTypeCaption = (CardView) view.findViewById(C1146R.id.curation_type_bubble);
        this.curationTypeCaptionText = (TextView) view.findViewById(C1146R.id.curation_type_bubble_text);
        this.bonusAppcView = (BonusAppcView) view.findViewById(C1146R.id.bonus_appc_view);
        this.captionBackgroundPainter = captionBackgroundPainter;
        this.themeAttributeProvider = themeManager;
        TopReactionsPreview topReactionsPreview = new TopReactionsPreview();
        this.topReactionsPreview = topReactionsPreview;
        topReactionsPreview.initialReactionsSetup(view);
        this.skeleton = SkeletonUtils.applySkeleton(viewFindViewById, (ViewGroup) view.findViewById(C1146R.id.root_cardview), C1146R.layout.editorial_action_item_skeleton);
    }

    private void clearReactions() {
        this.reactButton.setImageResource(this.themeAttributeProvider.getAttributeForTheme(C1146R.attr.reactionInputDrawable).resourceId);
        this.topReactionsPreview.clearReactions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setBundleInformation$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8079a(String str, String str2, HomeBundle homeBundle, int i2, View view) {
        this.uiEventsListener.onNext(new EditorialHomeEvent(str, str2, homeBundle, i2, HomeEvent.Type.REACT_SINGLE_PRESS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setBundleInformation$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ boolean m8080b(String str, String str2, HomeBundle homeBundle, int i2, View view) {
        this.uiEventsListener.onNext(new EditorialHomeEvent(str, str2, homeBundle, i2, HomeEvent.Type.REACT_LONG_PRESS));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setBundleInformation$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8081c(String str, String str2, HomeBundle homeBundle, int i2, View view) {
        this.uiEventsListener.onNext(new EditorialHomeEvent(str, str2, homeBundle, i2, HomeEvent.Type.EDITORIAL));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showReactions$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8082d(String str, String str2, int i2, ReactionsPopup reactionsPopup, ReactionType reactionType) {
        this.uiEventsListener.onNext(new ReactionsHomeEvent(str, str2, null, i2, HomeEvent.Type.REACTION, ReactionMapper.mapUserReaction(reactionType)));
        reactionsPopup.dismiss();
        reactionsPopup.setOnReactionsItemClickListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showReactions$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8083e(String str, String str2, int i2, ReactionsPopup reactionsPopup, ReactionsView reactionsView) {
        this.uiEventsListener.onNext(new EditorialHomeEvent(str, str2, null, i2, HomeEvent.Type.POPUP_DISMISS));
        reactionsPopup.setOnDismissListener(null);
    }

    private void setBundleInformation(String str, String str2, String str3, final String str4, final String str5, String str6, final int i2, final HomeBundle homeBundle, List<TopReaction> list, int i3, String str7, String str8, String str9, boolean z, int i4) {
        clearReactions();
        setReactions(list, i3, str7);
        ImageLoader.with(this.itemView.getContext()).load(str, this.backgroundImage);
        this.editorialTitle.setText(str2);
        this.curationTypeCaptionText.setText(str3);
        this.captionBackgroundPainter.addColorBackgroundToCaption(this.curationTypeCaption, str8);
        setupCalendarDateString(str6);
        this.reactButton.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.editorial.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9568f.m8079a(str4, str5, homeBundle, i2, view);
            }
        });
        this.reactButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: cm.aptoide.pt.home.bundles.editorial.c
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f9563f.m8080b(str4, str5, homeBundle, i2, view);
            }
        });
        this.editorialCard.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.editorial.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9553f.m8081c(str4, str5, homeBundle, i2, view);
            }
        });
        if (z) {
            setFlair(str9, i4);
        } else {
            this.bonusAppcView.setVisibility(8);
        }
    }

    private void setFlair(String str, int i2) {
        if (!str.equals("appc-bonus-25")) {
            this.bonusAppcView.setVisibility(8);
        } else {
            this.bonusAppcView.setVisibility(0);
            this.bonusAppcView.setPercentage(i2);
        }
    }

    private void setReactions(List<TopReaction> list, int i2, String str) {
        setUserReaction(str);
        this.topReactionsPreview.setReactions(list, i2, this.itemView.getContext());
    }

    private void setUserReaction(String str) {
        if (this.topReactionsPreview.isReactionValid(str)) {
            this.reactButton.setImageResource(ReactionMapper.mapReaction(str));
        } else {
            this.reactButton.setImageResource(this.themeAttributeProvider.getAttributeForTheme(C1146R.attr.reactionInputDrawable).resourceId);
        }
    }

    private void setupCalendarDateString(String str) {
        Date date;
        try {
            date = new SimpleDateFormat("yyyy/MM/dd").parse(str.split(" ")[0].replace("-", "/"));
        } catch (ParseException unused) {
            Snackbar.m24764a0(this.editorialCard, this.itemView.getContext().getString(C1146R.string.unknown_error), -1).mo24744P();
            date = null;
        }
        if (date != null) {
            this.editorialDate.setText(DateFormat.getDateInstance(3).format(date));
        }
    }

    @Override // cm.aptoide.p092pt.home.bundles.editorial.EditorialViewHolder, cm.aptoide.p092pt.home.bundles.base.AppBundleViewHolder
    public void setBundle(HomeBundle homeBundle, int i2) {
        boolean z;
        int bonusPercentage;
        ActionBundle actionBundle = (ActionBundle) homeBundle;
        ActionItem actionItem = actionBundle.getActionItem();
        if (actionBundle instanceof EditorialActionBundle) {
            BonusAppcModel bonusAppcModel = ((EditorialActionBundle) actionBundle).getBonusAppcModel();
            boolean hasBonusAppc = bonusAppcModel.getHasBonusAppc();
            bonusPercentage = bonusAppcModel.getBonusPercentage();
            z = hasBonusAppc;
        } else {
            z = false;
            bonusPercentage = 0;
        }
        if (actionItem == null) {
            this.skeleton.showSkeleton();
        } else {
            this.skeleton.showOriginal();
            setBundleInformation(actionItem.getIcon(), actionItem.getTitle(), actionItem.getSubTitle(), actionItem.getCardId(), actionItem.getType(), actionItem.getDate(), getAdapterPosition(), homeBundle, actionItem.getReactionList(), actionItem.getTotal(), actionItem.getUserReaction(), actionItem.getCaptionColor(), actionItem.getFlair(), z, bonusPercentage);
        }
    }

    public void setEditorialCard(CurationCard curationCard, int i2, BonusAppcModel bonusAppcModel) {
        this.skeleton.showOriginal();
        setBundleInformation(curationCard.getIcon(), curationCard.getTitle(), curationCard.getSubTitle(), curationCard.getId(), curationCard.getType(), curationCard.getDate(), i2, null, curationCard.getReactions(), curationCard.getNumberOfReactions(), curationCard.getUserReaction(), curationCard.getCaptionColor(), curationCard.getFlair(), bonusAppcModel.getHasBonusAppc(), bonusAppcModel.getBonusPercentage());
    }

    public void showReactions(final String str, final String str2, final int i2) {
        final ReactionsPopup reactionsPopup = new ReactionsPopup(this.itemView.getContext(), this.reactButton);
        reactionsPopup.show();
        reactionsPopup.setOnReactionsItemClickListener(new ReactionsPopup.OnReactionClickListener() { // from class: cm.aptoide.pt.home.bundles.editorial.e
            @Override // cm.aptoide.pt.reactions.ui.ReactionsPopup.OnReactionClickListener
            public final void onReactionItemClick(ReactionType reactionType) {
                this.f9573a.m8082d(str, str2, i2, reactionsPopup, reactionType);
            }
        });
        reactionsPopup.setOnDismissListener(new ReactionsPopup.OnDismissListener() { // from class: cm.aptoide.pt.home.bundles.editorial.b
            @Override // cm.aptoide.pt.reactions.ui.ReactionsPopup.OnDismissListener
            public final void onDismiss(ReactionsView reactionsView) {
                this.f9558a.m8083e(str, str2, i2, reactionsPopup, reactionsView);
            }
        });
    }
}
