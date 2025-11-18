package cm.aptoide.p092pt.editorial;

import android.animation.Animator;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.app.ActivityC0067d;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.aptoideviews.errors.ErrorView;
import cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.editorial.EditorialEvent;
import cm.aptoide.p092pt.editorial.EditorialViewModel;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.reactions.ReactionEvent;
import cm.aptoide.p092pt.reactions.ReactionMapper;
import cm.aptoide.p092pt.reactions.TopReactionsPreview;
import cm.aptoide.p092pt.reactions.data.ReactionType;
import cm.aptoide.p092pt.reactions.data.TopReaction;
import cm.aptoide.p092pt.reactions.p103ui.ReactionsPopup;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.util.AppBarStateChangeListener;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.view.NotBottomNavigationView;
import cm.aptoide.p092pt.view.Translator;
import cm.aptoide.p092pt.view.fragment.NavigationTrackFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.snackbar.Snackbar;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import okhttp3.HttpUrl;
import p241e.p294g.p295a.p297b.p298a.p299a.C8960b;
import p241e.p294g.p295a.p297b.p300b.p301a.C8964b;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;
import p456rx.InterfaceC11246k;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class EditorialFragment extends NavigationTrackFragment implements EditorialView, NotBottomNavigationView {
    public static final String CARD_ID = "cardId";
    public static final String FROM_HOME = "fromHome";
    public static final String SLUG = "slug";
    private static final String TAG = EditorialFragment.class.getName();
    private DownloadModel.Action action;
    private CardView actionItemCard;
    private EditorialItemsAdapter adapter;
    private AppBarLayout appBarLayout;
    private Button appCardButton;
    private ImageView appCardImage;
    private View appCardLayout;
    private TextView appCardTitle;
    private View appCardView;
    private ImageView appImage;
    private Drawable backArrow;
    private ImageView cancelDownload;

    @Inject
    CaptionBackgroundPainter captionBackgroundPainter;
    private RelativeLayout cardInfoLayout;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private View downloadControlsLayout;
    private C11418b<EditorialDownloadEvent> downloadEventListener;
    private LinearLayout downloadInfoLayout;
    private ProgressBar downloadProgressBar;
    private TextView downloadProgressValue;
    private RecyclerView editorialItems;
    private View editorialItemsCard;
    private InterfaceC11246k errorMessageSubscription;
    private ErrorView errorView;
    private C11418b<Void> installClickSubject;
    private TextView itemName;
    private C11418b<Boolean> movingCollapseSubject;
    private DecimalFormat oneDecimalFormatter;
    private ImageView pauseDownload;
    private List<Integer> placeHolderPositions;

    @Inject
    EditorialPresenter presenter;
    private ProgressBar progressBar;
    private ImageButton reactButton;
    private C11418b<ReactionEvent> reactionEventListener;
    private C11418b<Void> ready;
    private ImageView resumeDownload;

    @Inject
    @Named
    float screenHeight;

    @Inject
    @Named
    float screenWidth;
    private NestedScrollView scrollView;
    private boolean shouldAnimate;
    private C11418b<Void> snackListener;
    private SocialMediaView socialMediaView;

    @Inject
    ThemeManager themeManager;
    private Toolbar toolbar;
    private TextView toolbarTitle;
    private TopReactionsPreview topReactionsPreview;
    private C11418b<EditorialEvent> uiEventsListener;
    private Window window;

    /* renamed from: cm.aptoide.pt.editorial.EditorialFragment$3 */
    static /* synthetic */ class C24763 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$editorial$EditorialViewModel$Error;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State;

        static {
            int[] iArr = new int[DownloadModel.DownloadState.values().length];
            $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState = iArr;
            try {
                iArr[DownloadModel.DownloadState.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.INDETERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[DownloadModel.Action.values().length];
            $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action = iArr2;
            try {
                iArr2[DownloadModel.Action.UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.INSTALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.DOWNGRADE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[EditorialViewModel.Error.values().length];
            $SwitchMap$cm$aptoide$pt$editorial$EditorialViewModel$Error = iArr3;
            try {
                iArr3[EditorialViewModel.Error.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$editorial$EditorialViewModel$Error[EditorialViewModel.Error.GENERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr4 = new int[AppBarStateChangeListener.State.values().length];
            $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State = iArr4;
            try {
                iArr4[AppBarStateChangeListener.State.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State[AppBarStateChangeListener.State.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State[AppBarStateChangeListener.State.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State[AppBarStateChangeListener.State.COLLAPSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private void configureAppCardAnimation(final View view, final View view2, float f2, final int i2, final boolean z) {
        view.animate().scaleY(f2).scaleX(f2).alpha(0.0f).setDuration(i2).setListener(new Animator.AnimatorListener() { // from class: cm.aptoide.pt.editorial.EditorialFragment.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (z) {
                    return;
                }
                view.setVisibility(4);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                view2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(i2).setListener(new Animator.AnimatorListener() { // from class: cm.aptoide.pt.editorial.EditorialFragment.2.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator2) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator2) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator2) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator2) {
                        view2.setVisibility(0);
                    }
                }).start();
            }
        }).start();
    }

    private EditorialItemsViewHolder getViewHolderForAdapterPosition(int i2) {
        RecyclerView recyclerView;
        if (i2 == -1 || (recyclerView = this.editorialItems) == null) {
            return null;
        }
        EditorialItemsViewHolder editorialItemsViewHolder = (EditorialItemsViewHolder) recyclerView.findViewHolderForAdapterPosition(i2);
        if (editorialItemsViewHolder == null) {
            Log.e(TAG, "Unable to find editorialViewHolder");
        }
        return editorialItemsViewHolder;
    }

    private void handleDownloadError(DownloadModel.DownloadState downloadState) {
        showErrorDialog(HttpUrl.FRAGMENT_ENCODE_SET, getContext().getString(C1146R.string.error_occured));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleStatusBar(boolean z) {
        if (!z) {
            if (Build.VERSION.SDK_INT >= 21) {
                this.window.setStatusBarColor(getResources().getColor(C1146R.color.black_87_alpha));
                this.window.getDecorView().setSystemUiVisibility(0);
                return;
            }
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            if (i2 > 23 && !this.themeManager.isThemeDark()) {
                this.window.getDecorView().setSystemUiVisibility(8192);
            }
            this.window.setStatusBarColor(getResources().getColor(this.themeManager.getAttributeForTheme(C1146R.attr.statusBarColorSecondary).resourceId));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isItemShown() {
        EditorialItemsViewHolder viewHolderForAdapterPosition;
        List<Integer> list = this.placeHolderPositions;
        return (list == null || list.isEmpty() || (viewHolderForAdapterPosition = getViewHolderForAdapterPosition(this.placeHolderPositions.get(0).intValue())) == null || !viewHolderForAdapterPosition.isVisible(this.screenHeight, this.screenWidth)) ? false : true;
    }

    static /* synthetic */ EditorialEvent lambda$appCardClicked$1(EditorialViewModel editorialViewModel, Void r4) {
        return new EditorialEvent(EditorialEvent.Type.APPCARD, editorialViewModel.getBottomCardAppId(), editorialViewModel.getBottomCardPackageName());
    }

    static /* synthetic */ EditorialDownloadEvent lambda$cancelDownload$11(EditorialViewModel editorialViewModel, Void r8) {
        return new EditorialDownloadEvent(EditorialEvent.Type.CANCEL, editorialViewModel.getBottomCardPackageName(), editorialViewModel.getBottomCardMd5(), editorialViewModel.getBottomCardVersionCode(), editorialViewModel.getBottomCardAppId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$installButtonClick$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ EditorialDownloadEvent m7619e(EditorialViewModel editorialViewModel, Void r3) {
        return new EditorialDownloadEvent(editorialViewModel, this.action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onViewCreated$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7620f(View view) {
        this.installClickSubject.onNext(null);
    }

    static /* synthetic */ EditorialDownloadEvent lambda$pauseDownload$7(EditorialViewModel editorialViewModel, Void r8) {
        return new EditorialDownloadEvent(EditorialEvent.Type.PAUSE, editorialViewModel.getBottomCardPackageName(), editorialViewModel.getBottomCardMd5(), editorialViewModel.getBottomCardVersionCode(), editorialViewModel.getBottomCardAppId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$placeHolderVisibilityChange$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m7621g(Object obj) {
        return Boolean.valueOf(isItemShown());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$placeHolderVisibilityChange$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7622h(Object obj) {
        return C11234e.m40025S(obj).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj2) {
                return this.f9061f.m7621g(obj2);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj2) {
                return new ScrollEvent((Boolean) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ EditorialDownloadEvent m7623i(EditorialViewModel editorialViewModel, Void r10) {
        return new EditorialDownloadEvent(EditorialEvent.Type.RESUME, editorialViewModel.getBottomCardPackageName(), editorialViewModel.getBottomCardMd5(), editorialViewModel.getBottomCardVersionCode(), editorialViewModel.getBottomCardAppId(), this.action);
    }

    static /* synthetic */ void lambda$showErrorDialog$20(GenericDialogs.EResponse eResponse) {
    }

    static /* synthetic */ void lambda$showErrorDialog$21(Throwable th) {
        new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showLoginDialog$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7624j(View view) {
        this.snackListener.onNext(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showReactionsPopup$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7625k(String str, String str2, ReactionsPopup reactionsPopup, ReactionType reactionType) {
        this.reactionEventListener.onNext(new ReactionEvent(str, ReactionMapper.mapUserReaction(reactionType), str2));
        reactionsPopup.dismiss();
        reactionsPopup.setOnReactionsItemClickListener(null);
    }

    private void populateAppContent(EditorialViewModel editorialViewModel) {
        this.placeHolderPositions = editorialViewModel.getPlaceHolderPositions();
        this.shouldAnimate = editorialViewModel.shouldHaveAnimation();
        if (editorialViewModel.hasBackgroundImage()) {
            ImageLoader.with(getContext()).load(editorialViewModel.getBackgroundImage(), this.appImage);
        } else {
            this.appImage.setBackgroundColor(getResources().getColor(C1146R.color.grey_fog_normal));
        }
        String caption = editorialViewModel.getCaption();
        this.toolbar.setTitle(caption);
        this.toolbarTitle.setText(editorialViewModel.getTitle());
        this.appImage.setVisibility(0);
        this.itemName.setText(Translator.translate(caption, getContext(), HttpUrl.FRAGMENT_ENCODE_SET));
        this.captionBackgroundPainter.addColorBackgroundToCaption(this.actionItemCard, editorialViewModel.getCaptionColor());
        this.itemName.setVisibility(0);
        this.actionItemCard.setVisibility(0);
        setBottomAppCardInfo(editorialViewModel);
    }

    private void populateCardContent(EditorialViewModel editorialViewModel) {
        if (editorialViewModel.hasContent()) {
            this.editorialItemsCard.setVisibility(0);
            this.adapter.add(editorialViewModel.getContentList(), editorialViewModel.shouldHaveAnimation());
        }
    }

    private void setBottomAppCardInfo(EditorialViewModel editorialViewModel) {
        if (editorialViewModel.shouldHaveAnimation()) {
            this.appCardTitle.setText(editorialViewModel.getBottomCardAppName());
            this.appCardTitle.setVisibility(0);
            ImageLoader.with(getContext()).load(editorialViewModel.getBottomCardIcon(), this.appCardImage);
            this.appCardView.setVisibility(0);
        }
    }

    private void setButtonText(DownloadModel downloadModel) {
        int i2 = C24763.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[downloadModel.getAction().ordinal()];
        if (i2 == 1) {
            this.appCardButton.setText(getResources().getString(C1146R.string.appview_button_update));
            return;
        }
        if (i2 == 2) {
            this.appCardButton.setText(getResources().getString(C1146R.string.appview_button_install));
        } else if (i2 == 3) {
            this.appCardButton.setText(getResources().getString(C1146R.string.appview_button_open));
        } else {
            if (i2 != 4) {
                return;
            }
            this.appCardButton.setText(getResources().getString(C1146R.string.appview_button_downgrade));
        }
    }

    private void setDownloadState(int i2, DownloadModel.DownloadState downloadState) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 4.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 2.0f);
        int i3 = C24763.$SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[downloadState.ordinal()];
        if (i3 == 1) {
            this.downloadProgressBar.setIndeterminate(false);
            this.downloadProgressBar.setProgress(i2);
            this.downloadProgressValue.setText(i2 + "%");
            this.pauseDownload.setVisibility(0);
            this.cancelDownload.setVisibility(8);
            this.resumeDownload.setVisibility(8);
            this.downloadControlsLayout.setLayoutParams(layoutParams);
            return;
        }
        if (i3 == 2 || i3 == 3) {
            this.downloadProgressBar.setIndeterminate(true);
            this.pauseDownload.setVisibility(0);
            this.cancelDownload.setVisibility(8);
            this.resumeDownload.setVisibility(8);
            this.downloadControlsLayout.setLayoutParams(layoutParams);
            return;
        }
        if (i3 != 4) {
            return;
        }
        this.downloadProgressBar.setIndeterminate(false);
        this.downloadProgressBar.setProgress(i2);
        this.downloadProgressValue.setText(i2 + "%");
        this.pauseDownload.setVisibility(8);
        this.cancelDownload.setVisibility(0);
        this.resumeDownload.setVisibility(0);
        this.downloadControlsLayout.setLayoutParams(layoutParams2);
    }

    private void showErrorDialog(String str, String str2) {
        this.errorMessageSubscription = GenericDialogs.createGenericOkMessage(getContext(), str, str2, this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId).m40065I0(C11250a.m40156b()).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.s
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialFragment.lambda$showErrorDialog$20((GenericDialogs.EResponse) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.v
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialFragment.lambda$showErrorDialog$21((Throwable) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public C11234e<EditorialEvent> actionButtonClicked() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.q
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((EditorialEvent) obj).getClickType().equals(EditorialEvent.Type.ACTION));
            }
        });
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public void addBottomCardAnimation() {
        EditorialItemsViewHolder viewHolderForAdapterPosition;
        View placeHolder;
        List<Integer> list = this.placeHolderPositions;
        if (list == null || list.isEmpty() || (viewHolderForAdapterPosition = getViewHolderForAdapterPosition(this.placeHolderPositions.get(0).intValue())) == null || (placeHolder = viewHolderForAdapterPosition.getPlaceHolder()) == null || !this.shouldAnimate) {
            return;
        }
        configureAppCardAnimation(placeHolder, this.appCardLayout, 0.1f, 300, false);
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public C11234e<EditorialEvent> appCardClicked(final EditorialViewModel editorialViewModel) {
        return C8975a.m28573a(this.appCardView).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EditorialFragment.lambda$appCardClicked$1(editorialViewModel, (Void) obj);
            }
        }).m40093i0(this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.t
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((EditorialEvent) obj).getClickType().equals(EditorialEvent.Type.APPCARD));
            }
        }));
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public C11234e<EditorialDownloadEvent> cancelDownload(final EditorialViewModel editorialViewModel) {
        return C8975a.m28573a(this.cancelDownload).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EditorialFragment.lambda$cancelDownload$11(editorialViewModel, (Void) obj);
            }
        }).m40093i0(this.downloadEventListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.r
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((EditorialDownloadEvent) obj).getClickType().equals(EditorialEvent.Type.CANCEL));
            }
        }));
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public String getAction() {
        return this.action.toString();
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName(), HttpUrl.FRAGMENT_ENCODE_SET, StoreContext.home.name());
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public C11234e<Boolean> handleMovingCollapse() {
        return this.movingCollapseSubject.m40111t();
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public void hideLoading() {
        this.actionItemCard.setVisibility(8);
        this.editorialItemsCard.setVisibility(8);
        this.appCardView.setVisibility(8);
        this.itemName.setVisibility(8);
        this.errorView.setVisibility(8);
        this.progressBar.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public C11234e<EditorialDownloadEvent> installButtonClick(final EditorialViewModel editorialViewModel) {
        return this.installClickSubject.m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8989f.m7619e(editorialViewModel, (Void) obj);
            }
        }).m40093i0(this.downloadEventListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((EditorialDownloadEvent) obj).getClickType().equals(EditorialEvent.Type.BUTTON));
            }
        }));
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public C11234e<Void> isViewReady() {
        return this.ready;
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public void manageMediaListDescriptionAnimationVisibility(EditorialEvent editorialEvent) {
        EditorialItemsViewHolder editorialItemsViewHolder = (EditorialItemsViewHolder) this.editorialItems.findViewHolderForAdapterPosition(editorialEvent.getPosition());
        if (editorialItemsViewHolder != null) {
            editorialItemsViewHolder.manageDescriptionAnimationVisibility(editorialEvent.getFirstVisiblePosition(), editorialEvent.getMedia());
        }
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public void managePlaceHolderVisibity() {
        EditorialItemsViewHolder viewHolderForAdapterPosition;
        List<Integer> list = this.placeHolderPositions;
        if (list == null || list.isEmpty() || (viewHolderForAdapterPosition = getViewHolderForAdapterPosition(this.placeHolderPositions.get(0).intValue())) == null || !viewHolderForAdapterPosition.isVisible(this.screenHeight, this.screenWidth)) {
            return;
        }
        removeBottomCardAnimation();
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public C11234e<EditorialEvent> mediaContentClicked() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((EditorialEvent) obj).getClickType().equals(EditorialEvent.Type.MEDIA));
            }
        });
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public C11234e<EditorialEvent> mediaListDescriptionChanged() {
        return this.uiEventsListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((EditorialEvent) obj).getClickType().equals(EditorialEvent.Type.MEDIA_LIST));
            }
        }).m40113u(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.x6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Integer.valueOf(((EditorialEvent) obj).getFirstVisiblePosition());
            }
        });
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.oneDecimalFormatter = new DecimalFormat("0.0");
        this.window = getActivity().getWindow();
        this.ready = C11418b.m40637g1();
        this.uiEventsListener = C11418b.m40637g1();
        this.downloadEventListener = C11418b.m40637g1();
        this.movingCollapseSubject = C11418b.m40637g1();
        this.reactionEventListener = C11418b.m40637g1();
        this.installClickSubject = C11418b.m40637g1();
        this.snackListener = C11418b.m40637g1();
        this.topReactionsPreview = new TopReactionsPreview();
        setHasOptionsMenu(true);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1146R.menu.menu_empty, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1146R.layout.fragment_editorial, viewGroup, false);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.uiEventsListener = null;
        this.installClickSubject = null;
        this.snackListener = null;
        this.reactionEventListener = null;
        this.downloadEventListener = null;
        super.onDestroy();
        InterfaceC11246k interfaceC11246k = this.errorMessageSubscription;
        if (interfaceC11246k != null && !interfaceC11246k.isUnsubscribed()) {
            this.errorMessageSubscription.unsubscribe();
        }
        this.ready = null;
        this.window = null;
        this.oneDecimalFormatter = null;
        this.movingCollapseSubject = null;
        this.socialMediaView = null;
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.themeManager.resetStatusBarColor();
        if (Build.VERSION.SDK_INT >= 16) {
            this.window.getDecorView().setSystemUiVisibility(256);
        }
        this.toolbar = null;
        this.appImage = null;
        this.itemName = null;
        this.actionItemCard = null;
        this.appCardView = null;
        this.appCardImage = null;
        this.appCardTitle = null;
        this.appCardButton = null;
        this.editorialItemsCard = null;
        this.editorialItems = null;
        this.errorView = null;
        this.progressBar = null;
        this.collapsingToolbarLayout = null;
        this.appBarLayout = null;
        this.adapter = null;
        this.backArrow = null;
        this.reactButton = null;
        this.cardInfoLayout = null;
        this.downloadControlsLayout = null;
        this.downloadInfoLayout = null;
        this.downloadProgressBar = null;
        this.downloadProgressValue = null;
        this.cancelDownload = null;
        this.resumeDownload = null;
        this.pauseDownload = null;
        this.scrollView = null;
        this.appCardLayout = null;
        this.topReactionsPreview.onDestroy();
        super.onDestroyView();
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().onBackPressed();
        return true;
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        super.onViewCreated(view, bundle);
        getFragmentComponent(bundle).inject(this);
        if (Build.VERSION.SDK_INT >= 21) {
            this.window.setStatusBarColor(getResources().getColor(C1146R.color.black_87_alpha));
        }
        Toolbar toolbar = (Toolbar) view.findViewById(C1146R.id.toolbar);
        this.toolbar = toolbar;
        toolbar.setTitle(HttpUrl.FRAGMENT_ENCODE_SET);
        ActivityC0067d activityC0067d = (ActivityC0067d) getActivity();
        activityC0067d.setSupportActionBar(this.toolbar);
        AbstractC0064a supportActionBar = activityC0067d.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo227r(true);
        }
        this.backArrow = this.toolbar.getNavigationIcon();
        this.scrollView = (NestedScrollView) view.findViewById(C1146R.id.nested_scroll_view);
        this.appBarLayout = (AppBarLayout) view.findViewById(C1146R.id.app_bar_layout);
        this.appImage = (ImageView) view.findViewById(C1146R.id.app_graphic);
        this.itemName = (TextView) view.findViewById(C1146R.id.action_item_name);
        this.appCardLayout = view.findViewById(C1146R.id.app_cardview_layout);
        View viewFindViewById = view.findViewById(C1146R.id.app_cardview);
        this.appCardView = viewFindViewById;
        this.appCardImage = (ImageView) viewFindViewById.findViewById(C1146R.id.app_icon_imageview);
        this.appCardTitle = (TextView) this.appCardView.findViewById(C1146R.id.app_title_textview);
        this.appCardButton = (Button) this.appCardView.findViewById(C1146R.id.appview_install_button);
        this.actionItemCard = (CardView) view.findViewById(C1146R.id.action_item_card);
        this.editorialItemsCard = view.findViewById(C1146R.id.card_info_layout);
        this.editorialItems = (RecyclerView) view.findViewById(C1146R.id.editorial_items);
        this.errorView = (ErrorView) view.findViewById(C1146R.id.error_view);
        this.progressBar = (ProgressBar) view.findViewById(C1146R.id.progress_bar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        this.adapter = new EditorialItemsAdapter(new ArrayList(), this.oneDecimalFormatter, this.uiEventsListener, this.downloadEventListener);
        this.editorialItems.setLayoutManager(linearLayoutManager);
        this.editorialItems.setAdapter(this.adapter);
        this.reactButton = (ImageButton) view.findViewById(C1146R.id.add_reactions);
        this.topReactionsPreview.initialReactionsSetup(view);
        this.cardInfoLayout = (RelativeLayout) view.findViewById(C1146R.id.card_info_install_layout);
        this.downloadControlsLayout = view.findViewById(C1146R.id.install_controls_layout);
        this.downloadInfoLayout = (LinearLayout) view.findViewById(C1146R.id.appview_transfer_info);
        this.downloadProgressBar = (ProgressBar) view.findViewById(C1146R.id.appview_download_progress_bar);
        this.downloadProgressValue = (TextView) view.findViewById(C1146R.id.appview_download_progress_number);
        this.cancelDownload = (ImageView) view.findViewById(C1146R.id.appview_download_cancel_button);
        this.resumeDownload = (ImageView) view.findViewById(C1146R.id.appview_download_resume_download);
        this.pauseDownload = (ImageView) view.findViewById(C1146R.id.appview_download_pause_download);
        this.toolbarTitle = (TextView) view.findViewById(C1146R.id.toolbar_title);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) view.findViewById(C1146R.id.collapsing_toolbar_layout);
        this.collapsingToolbarLayout = collapsingToolbarLayout;
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(C1146R.color.transparent));
        this.collapsingToolbarLayout.setCollapsedTitleTextColor(getResources().getColor(C1146R.color.transparent));
        this.appBarLayout.m23708b(new AppBarStateChangeListener() { // from class: cm.aptoide.pt.editorial.EditorialFragment.1
            private void configureAppBarLayout(Drawable drawable, int i2, boolean z) {
                EditorialFragment.this.toolbar.setBackgroundDrawable(drawable);
                EditorialFragment.this.toolbarTitle.setTextColor(i2);
                if (Build.VERSION.SDK_INT >= 21) {
                    EditorialFragment.this.handleStatusBar(z);
                }
                if (EditorialFragment.this.backArrow != null) {
                    EditorialFragment.this.backArrow.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
                }
            }

            @Override // cm.aptoide.p092pt.util.AppBarStateChangeListener
            public void onStateChanged(AppBarLayout appBarLayout, AppBarStateChangeListener.State state) {
                Resources resources = EditorialFragment.this.getResources();
                int i2 = C24763.$SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State[state.ordinal()];
                if (i2 == 1) {
                    EditorialFragment.this.movingCollapseSubject.onNext(Boolean.valueOf(EditorialFragment.this.isItemShown()));
                } else if (i2 != 4) {
                    EditorialFragment.this.movingCollapseSubject.onNext(Boolean.valueOf(EditorialFragment.this.isItemShown()));
                    configureAppBarLayout(resources.getDrawable(C1146R.drawable.editorial_up_bottom_black_gradient), resources.getColor(C1146R.color.white), false);
                } else {
                    EditorialFragment.this.movingCollapseSubject.onNext(Boolean.valueOf(EditorialFragment.this.isItemShown()));
                    configureAppBarLayout(resources.getDrawable(EditorialFragment.this.themeManager.getAttributeForTheme(C1146R.attr.toolbarBackgroundSecondary).resourceId), resources.getColor(EditorialFragment.this.themeManager.getAttributeForTheme(C1146R.attr.textColorBlackAlpha).resourceId), true);
                }
            }
        });
        this.appCardButton.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.editorial.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9025f.m7620f(view2);
            }
        });
        this.socialMediaView = (SocialMediaView) view.findViewById(C1146R.id.social_media_view);
        attachPresenter(this.presenter);
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public void openApp(String str) {
        AptoideUtils.SystemU.openApp(str, getContext().getPackageManager(), getContext());
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public C11234e<EditorialDownloadEvent> pauseDownload(final EditorialViewModel editorialViewModel) {
        return C8975a.m28573a(this.pauseDownload).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EditorialFragment.lambda$pauseDownload$7(editorialViewModel, (Void) obj);
            }
        }).m40093i0(this.downloadEventListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((EditorialDownloadEvent) obj).getClickType().equals(EditorialEvent.Type.PAUSE));
            }
        }));
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public C11234e<ScrollEvent> placeHolderVisibilityChange() {
        return C11234e.m40043f0(C8964b.m28560a(this.scrollView), C8960b.m28556a(this.appBarLayout)).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8913f.m7622h(obj);
            }
        }).m40113u(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.q6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((ScrollEvent) obj).getItemShown();
            }
        });
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public void populateView(EditorialViewModel editorialViewModel) {
        populateAppContent(editorialViewModel);
        populateCardContent(editorialViewModel);
        this.ready.onNext(null);
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public C11234e<ReactionEvent> reactionClicked() {
        return this.reactionEventListener;
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public C11234e<Void> reactionsButtonClicked() {
        return C8975a.m28573a(this.reactButton);
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public C11234e<Void> reactionsButtonLongPressed() {
        return C8975a.m28575c(this.reactButton);
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public void removeBottomCardAnimation() {
        EditorialItemsViewHolder viewHolderForAdapterPosition;
        View placeHolder;
        List<Integer> list = this.placeHolderPositions;
        if (list == null || list.isEmpty() || (viewHolderForAdapterPosition = getViewHolderForAdapterPosition(this.placeHolderPositions.get(0).intValue())) == null || (placeHolder = viewHolderForAdapterPosition.getPlaceHolder()) == null || !this.shouldAnimate) {
            return;
        }
        configureAppCardAnimation(this.appCardLayout, placeHolder, 0.0f, 300, true);
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public C11234e<EditorialDownloadEvent> resumeDownload(final EditorialViewModel editorialViewModel) {
        return C8975a.m28573a(this.resumeDownload).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9014f.m7623i(editorialViewModel, (Void) obj);
            }
        }).m40093i0(this.downloadEventListener.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.x
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((EditorialDownloadEvent) obj).getClickType().equals(EditorialEvent.Type.RESUME));
            }
        }));
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public C11234e<Void> retryClicked() {
        return this.errorView.retryClick();
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public void setMediaListDescriptionsVisible(EditorialEvent editorialEvent) {
        EditorialItemsViewHolder editorialItemsViewHolder = (EditorialItemsViewHolder) this.editorialItems.findViewHolderForAdapterPosition(editorialEvent.getPosition());
        if (editorialItemsViewHolder != null) {
            editorialItemsViewHolder.setAllDescriptionsVisible();
        }
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public void setUserReaction(String str) {
        if (this.topReactionsPreview.isReactionValid(str)) {
            this.reactButton.setImageResource(ReactionMapper.mapReaction(str));
        } else {
            this.reactButton.setImageResource(this.themeManager.getAttributeForTheme(C1146R.attr.reactionInputDrawable).resourceId);
        }
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public C11234e<Boolean> showDowngradeMessage() {
        return GenericDialogs.createGenericContinueCancelMessage(getContext(), null, getContext().getResources().getString(C1146R.string.downgrade_warning_dialog), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.u
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((GenericDialogs.EResponse) obj).equals(GenericDialogs.EResponse.YES));
            }
        });
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public void showDowngradingMessage() {
        Snackbar.m24763Z(getView(), C1146R.string.downgrading_msg, -1).mo24744P();
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public void showDownloadError(EditorialDownloadModel editorialDownloadModel) {
        if (editorialDownloadModel.hasError()) {
            handleDownloadError(editorialDownloadModel.getDownloadState());
        }
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public void showDownloadModel(EditorialDownloadModel editorialDownloadModel) {
        this.action = editorialDownloadModel.getAction();
        EditorialItemsViewHolder viewHolderForAdapterPosition = getViewHolderForAdapterPosition(editorialDownloadModel.getPosition());
        if (editorialDownloadModel.isDownloading()) {
            this.downloadInfoLayout.setVisibility(0);
            this.cardInfoLayout.setVisibility(8);
            setDownloadState(editorialDownloadModel.getProgress(), editorialDownloadModel.getDownloadState());
            if (viewHolderForAdapterPosition != null) {
                viewHolderForAdapterPosition.setPlaceHolderDownloadingInfo(editorialDownloadModel);
                return;
            }
            return;
        }
        this.downloadInfoLayout.setVisibility(8);
        this.cardInfoLayout.setVisibility(0);
        setButtonText(editorialDownloadModel);
        if (viewHolderForAdapterPosition != null) {
            viewHolderForAdapterPosition.setPlaceHolderDefaultStateInfo(editorialDownloadModel, getResources().getString(C1146R.string.appview_button_update), getResources().getString(C1146R.string.appview_button_install), getResources().getString(C1146R.string.appview_button_open), getResources().getString(C1146R.string.appview_button_downgrade));
        }
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public void showError(EditorialViewModel.Error error) {
        int i2 = C24763.$SwitchMap$cm$aptoide$pt$editorial$EditorialViewModel$Error[error.ordinal()];
        if (i2 == 1) {
            this.errorView.setError(ErrorView.Error.NO_NETWORK);
            this.errorView.setVisibility(0);
        } else {
            if (i2 != 2) {
                return;
            }
            this.errorView.setError(ErrorView.Error.GENERIC);
            this.errorView.setVisibility(0);
        }
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public void showGenericErrorToast() {
        Snackbar.m24764a0(getView(), getString(C1146R.string.error_occured), 0).mo24744P();
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public void showLoading() {
        this.actionItemCard.setVisibility(8);
        this.editorialItemsCard.setVisibility(8);
        this.appCardView.setVisibility(8);
        this.itemName.setVisibility(8);
        this.errorView.setVisibility(8);
        this.progressBar.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public void showLoginDialog() {
        Snackbar.m24764a0(getView(), getString(C1146R.string.editorial_reactions_login_short), 0).m24765b0(C1146R.string.login, new View.OnClickListener() { // from class: cm.aptoide.pt.editorial.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8950f.m7624j(view);
            }
        }).mo24744P();
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public void showNetworkErrorToast() {
        Snackbar.m24764a0(getView(), getString(C1146R.string.connection_error), 0).mo24744P();
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public void showReactionsPopup(final String str, final String str2) {
        final ReactionsPopup reactionsPopup = new ReactionsPopup(getContext(), this.reactButton);
        reactionsPopup.show();
        reactionsPopup.setOnReactionsItemClickListener(new ReactionsPopup.OnReactionClickListener() { // from class: cm.aptoide.pt.editorial.w
            @Override // cm.aptoide.pt.reactions.ui.ReactionsPopup.OnReactionClickListener
            public final void onReactionItemClick(ReactionType reactionType) {
                this.f9130a.m7625k(str, str2, reactionsPopup, reactionType);
            }
        });
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public C11234e<Boolean> showRootInstallWarningPopup() {
        return GenericDialogs.createGenericYesNoCancelMessage(getContext(), null, getResources().getString(C1146R.string.root_access_dialog), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((GenericDialogs.EResponse) obj).equals(GenericDialogs.EResponse.YES));
            }
        });
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public void showTopReactions(String str, List<TopReaction> list, int i2) {
        setUserReaction(str);
        this.topReactionsPreview.setReactions(list, i2, getContext());
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public C11234e<Void> snackLoginClick() {
        return this.snackListener;
    }

    @Override // cm.aptoide.p092pt.editorial.EditorialView
    public C11234e<SocialMediaView.SocialMediaType> socialMediaClick() {
        return this.socialMediaView.onSocialMediaClick();
    }
}
