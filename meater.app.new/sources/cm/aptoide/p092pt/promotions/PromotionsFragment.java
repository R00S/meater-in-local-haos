package cm.aptoide.p092pt.promotions;

import android.app.AlertDialog;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.app.ActivityC0067d;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.AbstractC0636q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.promotions.PromotionAppClick;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.util.AppBarStateChangeListener;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.view.fragment.NavigationTrackFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import okhttp3.HttpUrl;
import p024c.p025a.p026k.p027a.C0833a;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;
import p456rx.InterfaceC11246k;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class PromotionsFragment extends NavigationTrackFragment implements PromotionsView {
    private AppBarLayout appBarLayout;
    private Drawable backArrow;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private InterfaceC11246k errorMessageSubscription;
    private View genericErrorView;
    private View genericErrorViewRetry;
    private ProgressBar loading;
    private Button promotionAction;
    private C11418b<PromotionAppClick> promotionAppClick;
    private TextView promotionFirstMessage;
    private C11418b<Void> promotionOverDialogClick;
    private TextView promotionTitle;
    private PromotionsAdapter promotionsAdapter;
    private RecyclerView promotionsList;

    @Inject
    PromotionsPresenter promotionsPresenter;
    private View promotionsView;

    @Inject
    ThemeManager themeManager;
    private Toolbar toolbar;
    private ImageView toolbarImage;
    private ImageView toolbarImagePlaceholder;
    private TextView toolbarTitle;
    private View walletActiveView;
    private View walletInactiveView;
    private Window window;

    /* renamed from: cm.aptoide.pt.promotions.PromotionsFragment$2 */
    static /* synthetic */ class C39082 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State;

        static {
            int[] iArr = new int[DownloadModel.Action.values().length];
            $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action = iArr;
            try {
                iArr[DownloadModel.Action.DOWNGRADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.INSTALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.UPDATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[DownloadModel.DownloadState.values().length];
            $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState = iArr2;
            try {
                iArr2[DownloadModel.DownloadState.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.INDETERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[AppBarStateChangeListener.State.values().length];
            $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State = iArr3;
            try {
                iArr3[AppBarStateChangeListener.State.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State[AppBarStateChangeListener.State.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State[AppBarStateChangeListener.State.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State[AppBarStateChangeListener.State.COLLAPSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private int getButtonMessage(int i2) {
        if (i2 == 0) {
            return C1146R.string.appview_button_update;
        }
        if (i2 != 1 && i2 != 3) {
            if (i2 == 4) {
                return C1146R.string.promotion_claim_button;
            }
            if (i2 == 5) {
                return C1146R.string.holidayspromotion_button_claimed;
            }
            if (i2 != 6) {
                throw new IllegalArgumentException("Wrong view type of promotion app");
            }
        }
        return C1146R.string.install;
    }

    private PromotionAppClick.ClickType getClickType(int i2) {
        if (i2 == 0) {
            return PromotionAppClick.ClickType.UPDATE;
        }
        if (i2 == 1) {
            return PromotionAppClick.ClickType.DOWNLOAD;
        }
        if (i2 == 3) {
            return PromotionAppClick.ClickType.INSTALL_APP;
        }
        if (i2 == 4) {
            return PromotionAppClick.ClickType.CLAIM;
        }
        if (i2 == 6) {
            return PromotionAppClick.ClickType.DOWNGRADE;
        }
        throw new IllegalArgumentException("Wrong view type of promotion app");
    }

    private int getState(PromotionViewApp promotionViewApp) {
        DownloadModel downloadModel = promotionViewApp.getDownloadModel();
        if (downloadModel.isDownloading()) {
            return 2;
        }
        int i2 = C39082.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[downloadModel.getAction().ordinal()];
        if (i2 == 1) {
            return 6;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 == 3) {
            return promotionViewApp.isClaimed() ? 5 : 4;
        }
        if (i2 == 4) {
            return 0;
        }
        throw new IllegalArgumentException("Invalid type of download action");
    }

    private void handleDownloadError(DownloadModel.DownloadState downloadState) {
        if (downloadState == DownloadModel.DownloadState.ERROR) {
            showErrorDialog(HttpUrl.FRAGMENT_ENCODE_SET, getContext().getString(C1146R.string.error_occured));
        }
    }

    private SpannableString handleRewardMessage(float f2, String str, double d2, boolean z) {
        String string;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String string2 = Double.toString(Math.floor(f2));
        if (z) {
            string = getString(C1146R.string.FIATpromotion_update_to_get_short, string2, str + decimalFormat.format(d2));
        } else {
            string = getString(C1146R.string.FIATpromotion_install_to_get_short, string2, str + decimalFormat.format(d2));
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(C1146R.color.promotions_reward)), string.indexOf(string2), string.length(), 33);
        return spannableString;
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

    private boolean isWalletInstalled() {
        Iterator<ApplicationInfo> it = getContext().getPackageManager().getInstalledApplications(0).iterator();
        while (it.hasNext()) {
            if (it.next().packageName.equals(AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setWalletItemClickListener$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8507e(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.NAVIGATE));
    }

    static /* synthetic */ void lambda$showErrorDialog$22(GenericDialogs.EResponse eResponse) {
    }

    static /* synthetic */ void lambda$showErrorDialog$23(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showPromotionOverDialog$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8508f(AlertDialog alertDialog, View view) {
        this.promotionOverDialogClick.onNext(null);
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showWallet$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8509g(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.PAUSE_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showWallet$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8510h(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.PAUSE_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showWallet$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8511i(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.CANCEL_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showWallet$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8512j(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.RESUME_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showWallet$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8513k(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.PAUSE_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showWallet$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8514l(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.INSTALL_APP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showWallet$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8515m(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, getClickType(getState(promotionViewApp))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showWallet$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8516n(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, getClickType(getState(promotionViewApp))));
    }

    private void setClaimedButton() {
        this.promotionAction.setEnabled(false);
        this.promotionAction.setBackgroundColor(getResources().getColor(C1146R.color.grey_fog_light));
        this.promotionAction.setTextColor(getResources().getColor(C1146R.color.black));
        SpannableString spannableString = new SpannableString("  " + getResources().getString(C1146R.string.holidayspromotion_button_claimed).toUpperCase());
        Drawable drawableM5262d = C0833a.m5262d(getContext(), C1146R.drawable.ic_promotion_claimed_check);
        drawableM5262d.setBounds(0, 0, drawableM5262d.getIntrinsicWidth(), drawableM5262d.getIntrinsicHeight());
        spannableString.setSpan(new ImageSpan(drawableM5262d, 1), 0, 1, 18);
        this.promotionAction.setTransformationMethod(null);
        this.promotionAction.setText(spannableString);
    }

    private void setWalletItemClickListener(final PromotionViewApp promotionViewApp) {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.j1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10777f.m8507e(promotionViewApp, view);
            }
        };
        this.walletInactiveView.setOnClickListener(onClickListener);
        this.walletActiveView.setOnClickListener(onClickListener);
    }

    private void setupRecyclerView() {
        this.promotionsList.setAdapter(this.promotionsAdapter);
        this.promotionsList.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView.AbstractC0599l itemAnimator = this.promotionsList.getItemAnimator();
        if (itemAnimator instanceof AbstractC0636q) {
            ((AbstractC0636q) itemAnimator).setSupportsChangeAnimations(false);
        }
    }

    private void showErrorDialog(String str, String str2) {
        this.errorMessageSubscription = GenericDialogs.createGenericOkMessage(getContext(), str, str2, this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId).m40065I0(C11250a.m40156b()).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.w1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                PromotionsFragment.lambda$showErrorDialog$22((GenericDialogs.EResponse) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.d2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                PromotionsFragment.lambda$showErrorDialog$23((Throwable) obj);
                throw null;
            }
        });
    }

    private void showWallet(final PromotionViewApp promotionViewApp, boolean z) {
        if (!promotionViewApp.getDownloadModel().isDownloading()) {
            if (promotionViewApp.getDownloadModel().hasError()) {
                handleDownloadError(promotionViewApp.getDownloadModel().getDownloadState());
            }
            this.walletActiveView.setVisibility(8);
            this.walletInactiveView.setVisibility(0);
            ImageView imageView = (ImageView) this.walletInactiveView.findViewById(C1146R.id.app_icon);
            TextView textView = (TextView) this.walletInactiveView.findViewById(C1146R.id.app_name);
            TextView textView2 = (TextView) this.walletInactiveView.findViewById(C1146R.id.app_description);
            TextView textView3 = (TextView) this.walletInactiveView.findViewById(C1146R.id.app_reward);
            ImageLoader.with(getContext()).load(promotionViewApp.getAppIcon(), imageView);
            textView.setText(promotionViewApp.getName());
            textView2.setText(promotionViewApp.getDescription());
            textView3.setText(handleRewardMessage(promotionViewApp.getAppcValue(), promotionViewApp.getFiatSymbol(), promotionViewApp.getFiatValue(), promotionViewApp.getDownloadModel().getAction().equals(DownloadModel.Action.UPDATE)));
            this.promotionAction.setText(getContext().getString(getButtonMessage(getState(promotionViewApp)), Float.valueOf(promotionViewApp.getAppcValue())));
            if (getState(promotionViewApp) == 5) {
                if (isWalletInstalled()) {
                    setClaimedButton();
                } else {
                    this.promotionAction.setEnabled(true);
                    this.promotionAction.setBackgroundDrawable(getContext().getResources().getDrawable(C1146R.drawable.appc_gradient_rounded));
                    this.promotionAction.setText(getContext().getString(C1146R.string.appview_button_install));
                    this.promotionAction.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.b2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f10704f.m8514l(promotionViewApp, view);
                        }
                    });
                }
                this.promotionsAdapter.isWalletInstalled(z);
                return;
            }
            if (getState(promotionViewApp) == 4) {
                this.promotionAction.setEnabled(true);
                this.promotionAction.setBackgroundDrawable(getContext().getResources().getDrawable(C1146R.drawable.card_border_rounded_green));
                this.promotionAction.setTextColor(-1);
                this.promotionAction.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.o1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f10828f.m8515m(promotionViewApp, view);
                    }
                });
                this.promotionsAdapter.isWalletInstalled(true);
                return;
            }
            this.promotionAction.setEnabled(true);
            this.promotionAction.setBackgroundDrawable(getContext().getResources().getDrawable(C1146R.drawable.appc_gradient_rounded));
            if (promotionViewApp.isClaimed()) {
                this.promotionAction.setText(getContext().getString(C1146R.string.appview_button_install));
            }
            this.promotionAction.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.a2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10694f.m8516n(promotionViewApp, view);
                }
            });
            return;
        }
        this.walletActiveView.setVisibility(0);
        this.walletInactiveView.setVisibility(8);
        ImageView imageView2 = (ImageView) this.walletActiveView.findViewById(C1146R.id.app_icon);
        TextView textView4 = (TextView) this.walletActiveView.findViewById(C1146R.id.app_name);
        TextView textView5 = (TextView) this.walletActiveView.findViewById(C1146R.id.app_reward);
        TextView textView6 = (TextView) this.walletActiveView.findViewById(C1146R.id.app_description);
        ProgressBar progressBar = (ProgressBar) this.walletActiveView.findViewById(C1146R.id.promotions_download_progress_bar);
        TextView textView7 = (TextView) this.walletActiveView.findViewById(C1146R.id.promotions_download_progress_number);
        ImageView imageView3 = (ImageView) this.walletActiveView.findViewById(C1146R.id.promotions_download_pause_download);
        ImageView imageView4 = (ImageView) this.walletActiveView.findViewById(C1146R.id.promotions_download_cancel_button);
        ImageView imageView5 = (ImageView) this.walletActiveView.findViewById(C1146R.id.promotions_download_resume_download);
        LinearLayout linearLayout = (LinearLayout) this.walletActiveView.findViewById(C1146R.id.install_controls_layout);
        ImageLoader.with(getContext()).load(promotionViewApp.getAppIcon(), imageView2);
        textView4.setText(promotionViewApp.getName());
        textView6.setText(promotionViewApp.getDescription());
        textView5.setText(handleRewardMessage(promotionViewApp.getAppcValue(), promotionViewApp.getFiatSymbol(), promotionViewApp.getFiatValue(), promotionViewApp.getDownloadModel().getAction().equals(DownloadModel.Action.UPDATE)));
        DownloadModel.DownloadState downloadState = promotionViewApp.getDownloadModel().getDownloadState();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 4.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 2.0f);
        int i2 = C39082.$SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[downloadState.ordinal()];
        if (i2 == 1) {
            progressBar.setIndeterminate(false);
            progressBar.setProgress(promotionViewApp.getDownloadModel().getProgress());
            textView7.setText(promotionViewApp.getDownloadModel().getProgress() + "%");
            imageView3.setVisibility(0);
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.y1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10918f.m8509g(promotionViewApp, view);
                }
            });
            imageView4.setVisibility(8);
            imageView5.setVisibility(8);
            linearLayout.setLayoutParams(layoutParams);
            return;
        }
        if (i2 == 2) {
            progressBar.setIndeterminate(true);
            imageView3.setVisibility(0);
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.s1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10867f.m8510h(promotionViewApp, view);
                }
            });
            imageView4.setVisibility(8);
            imageView5.setVisibility(8);
            linearLayout.setLayoutParams(layoutParams);
            return;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                if (i2 != 5) {
                    return;
                }
                showErrorDialog(HttpUrl.FRAGMENT_ENCODE_SET, getContext().getString(C1146R.string.error_occured));
                return;
            } else {
                progressBar.setIndeterminate(true);
                imageView3.setVisibility(0);
                imageView3.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.u1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f10884f.m8513k(promotionViewApp, view);
                    }
                });
                imageView4.setVisibility(8);
                imageView5.setVisibility(8);
                linearLayout.setLayoutParams(layoutParams);
                return;
            }
        }
        progressBar.setIndeterminate(false);
        progressBar.setProgress(promotionViewApp.getDownloadModel().getProgress());
        textView7.setText(promotionViewApp.getDownloadModel().getProgress() + "%");
        imageView3.setVisibility(8);
        imageView4.setVisibility(0);
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10788f.m8511i(promotionViewApp, view);
            }
        });
        imageView5.setVisibility(0);
        imageView5.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10817f.m8512j(promotionViewApp, view);
            }
        });
        linearLayout.setLayoutParams(layoutParams2);
    }

    @Override // cm.aptoide.p092pt.promotions.PromotionsView
    public C11234e<PromotionAppClick> appCardClick() {
        return this.promotionAppClick.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.m1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((PromotionAppClick) obj).getClickType().equals(PromotionAppClick.ClickType.NAVIGATE));
            }
        });
    }

    @Override // cm.aptoide.p092pt.promotions.PromotionsView
    public C11234e<PromotionViewApp> cancelDownload() {
        return this.promotionAppClick.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.f2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((PromotionAppClick) obj).getClickType() == PromotionAppClick.ClickType.CANCEL_DOWNLOAD);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.x1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((PromotionAppClick) obj).getApp();
            }
        });
    }

    @Override // cm.aptoide.p092pt.promotions.PromotionsView
    public C11234e<PromotionViewApp> claimAppClick() {
        return this.promotionAppClick.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.t1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((PromotionAppClick) obj).getClickType() == PromotionAppClick.ClickType.CLAIM);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.l1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((PromotionAppClick) obj).getApp();
            }
        });
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.p092pt.promotions.PromotionsView
    public C11234e<PromotionViewApp> installButtonClick() {
        return this.promotionAppClick.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.c2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                PromotionAppClick promotionAppClick = (PromotionAppClick) obj;
                return Boolean.valueOf(promotionAppClick.getClickType() == PromotionAppClick.ClickType.UPDATE || promotionAppClick.getClickType() == PromotionAppClick.ClickType.INSTALL_APP || promotionAppClick.getClickType() == PromotionAppClick.ClickType.DOWNLOAD || promotionAppClick.getClickType() == PromotionAppClick.ClickType.DOWNGRADE);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.z1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((PromotionAppClick) obj).getApp();
            }
        });
    }

    @Override // cm.aptoide.p092pt.promotions.PromotionsView
    public void lockPromotionApps(boolean z) {
        this.promotionsAdapter.isWalletInstalled(z);
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.window = getActivity().getWindow();
        this.promotionOverDialogClick = C11418b.m40637g1();
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1146R.layout.fragment_promotions, viewGroup, false);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.window = null;
        this.promotionAppClick = null;
        this.promotionOverDialogClick = null;
        InterfaceC11246k interfaceC11246k = this.errorMessageSubscription;
        if (interfaceC11246k == null || interfaceC11246k.isUnsubscribed()) {
            return;
        }
        this.errorMessageSubscription.unsubscribe();
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.themeManager.resetToBaseTheme();
        if (Build.VERSION.SDK_INT >= 16) {
            this.window.getDecorView().setSystemUiVisibility(256);
        }
        this.toolbarTitle = null;
        this.toolbar = null;
        this.promotionsList = null;
        this.promotionsAdapter = null;
        this.collapsingToolbarLayout = null;
        this.appBarLayout = null;
        this.backArrow = null;
        this.walletActiveView = null;
        this.walletInactiveView = null;
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        super.onViewCreated(view, bundle);
        this.promotionsList = (RecyclerView) view.findViewById(C1146R.id.fragment_promotions_promotions_list);
        this.promotionAppClick = C11418b.m40637g1();
        this.promotionsAdapter = new PromotionsAdapter(new ArrayList(), new PromotionsViewHolderFactory(this.promotionAppClick, this.themeManager));
        this.toolbarImage = (ImageView) view.findViewById(C1146R.id.app_graphic);
        this.toolbarImagePlaceholder = (ImageView) view.findViewById(C1146R.id.app_graphic_placeholder);
        this.promotionTitle = (TextView) view.findViewById(C1146R.id.promotions_title);
        this.promotionFirstMessage = (TextView) view.findViewById(C1146R.id.promotions_message_1);
        this.walletActiveView = view.findViewById(C1146R.id.promotion_wallet_active);
        View viewFindViewById = view.findViewById(C1146R.id.promotion_wallet_inactive);
        this.walletInactiveView = viewFindViewById;
        this.promotionAction = (Button) viewFindViewById.findViewById(C1146R.id.promotion_app_action_button);
        this.loading = (ProgressBar) view.findViewById(C1146R.id.progress_bar);
        this.promotionsView = view.findViewById(C1146R.id.promotions_view);
        View viewFindViewById2 = view.findViewById(C1146R.id.generic_error);
        this.genericErrorView = viewFindViewById2;
        this.genericErrorViewRetry = viewFindViewById2.findViewById(C1146R.id.retry);
        this.toolbarTitle = (TextView) view.findViewById(C1146R.id.toolbar_title);
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
        this.appBarLayout = (AppBarLayout) view.findViewById(C1146R.id.app_bar_layout);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) view.findViewById(C1146R.id.collapsing_toolbar_layout);
        this.collapsingToolbarLayout = collapsingToolbarLayout;
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(C1146R.color.transparent));
        this.collapsingToolbarLayout.setCollapsedTitleTextColor(getResources().getColor(C1146R.color.transparent));
        this.appBarLayout.m23708b(new AppBarStateChangeListener() { // from class: cm.aptoide.pt.promotions.PromotionsFragment.1
            private void configureAppBarLayout(Drawable drawable, int i2, boolean z) {
                PromotionsFragment.this.toolbar.setBackgroundDrawable(drawable);
                PromotionsFragment.this.toolbarTitle.setTextColor(i2);
                if (Build.VERSION.SDK_INT >= 21) {
                    PromotionsFragment.this.handleStatusBar(z);
                }
                if (PromotionsFragment.this.backArrow != null) {
                    PromotionsFragment.this.backArrow.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
                }
            }

            @Override // cm.aptoide.p092pt.util.AppBarStateChangeListener
            public void onStateChanged(AppBarLayout appBarLayout, AppBarStateChangeListener.State state) {
                Resources resources = PromotionsFragment.this.getResources();
                int i2 = C39082.$SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State[state.ordinal()];
                if (i2 != 1) {
                    if (i2 != 4) {
                        PromotionsFragment.this.toolbarTitle.setVisibility(8);
                        configureAppBarLayout(resources.getDrawable(C1146R.drawable.editorial_up_bottom_black_gradient), resources.getColor(C1146R.color.white), false);
                    } else {
                        PromotionsFragment.this.toolbarTitle.setVisibility(0);
                        configureAppBarLayout(resources.getDrawable(C1146R.drawable.transparent), resources.getColor(PromotionsFragment.this.themeManager.getAttributeForTheme(C1146R.attr.textColorBlackAlpha).resourceId), true);
                    }
                }
            }
        });
        setupRecyclerView();
        attachPresenter(this.promotionsPresenter);
    }

    @Override // cm.aptoide.p092pt.promotions.PromotionsView
    public C11234e<PromotionViewApp> pauseDownload() {
        return this.promotionAppClick.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.v1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((PromotionAppClick) obj).getClickType() == PromotionAppClick.ClickType.PAUSE_DOWNLOAD);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.i1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((PromotionAppClick) obj).getApp();
            }
        });
    }

    @Override // cm.aptoide.p092pt.promotions.PromotionsView
    public C11234e<Void> promotionOverDialogClick() {
        return this.promotionOverDialogClick;
    }

    @Override // cm.aptoide.p092pt.promotions.PromotionsView
    public C11234e<PromotionViewApp> resumeDownload() {
        return this.promotionAppClick.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.r1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((PromotionAppClick) obj).getClickType() == PromotionAppClick.ClickType.RESUME_DOWNLOAD);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.p1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((PromotionAppClick) obj).getApp();
            }
        });
    }

    @Override // cm.aptoide.p092pt.promotions.PromotionsView
    public C11234e<Void> retryClicked() {
        return C8975a.m28573a(this.genericErrorViewRetry);
    }

    @Override // cm.aptoide.p092pt.promotions.PromotionsView
    public void setPromotionMessage(String str) {
        this.promotionFirstMessage.setText(str);
    }

    @Override // cm.aptoide.p092pt.promotions.PromotionsView
    public void showDownloadError(PromotionViewApp promotionViewApp) {
        if (promotionViewApp.getDownloadModel().hasError()) {
            handleDownloadError(promotionViewApp.getDownloadModel().getDownloadState());
        }
    }

    @Override // cm.aptoide.p092pt.promotions.PromotionsView
    public void showErrorView() {
        this.toolbarImage.setVisibility(8);
        this.loading.setVisibility(8);
        this.promotionsView.setVisibility(8);
        this.genericErrorView.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.promotions.PromotionsView
    public void showLoading() {
        this.toolbarImagePlaceholder.setVisibility(0);
        this.toolbarImage.setVisibility(8);
        this.promotionsView.setVisibility(8);
        this.genericErrorView.setVisibility(8);
        this.loading.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.promotions.PromotionsView
    public void showPromotionApp(PromotionViewApp promotionViewApp, boolean z) {
        if (promotionViewApp.getPackageName().equals(AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME)) {
            showWallet(promotionViewApp, z);
            setWalletItemClickListener(promotionViewApp);
        } else {
            this.promotionsAdapter.setPromotionApp(promotionViewApp);
        }
        this.loading.setVisibility(8);
        this.toolbarImagePlaceholder.setVisibility(8);
        this.toolbarImage.setVisibility(0);
        this.promotionsView.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.promotions.PromotionsView
    public void showPromotionFeatureGraphic(String str) {
        ImageLoader.with(getContext()).load(str, this.toolbarImage);
    }

    @Override // cm.aptoide.p092pt.promotions.PromotionsView
    public void showPromotionOverDialog() {
        this.loading.setVisibility(8);
        View viewInflate = LayoutInflater.from(getContext()).inflate(C1146R.layout.promotions_promotion_over_dialog, (ViewGroup) null);
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext()).setView(viewInflate).create();
        alertDialogCreate.setCancelable(false);
        viewInflate.findViewById(C1146R.id.dismiss_button).setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10847f.m8508f(alertDialogCreate, view);
            }
        });
        alertDialogCreate.show();
    }

    @Override // cm.aptoide.p092pt.promotions.PromotionsView
    public void showPromotionTitle(String str) {
        this.promotionTitle.setText(str);
        this.toolbarTitle.setText(str);
    }

    @Override // cm.aptoide.p092pt.promotions.PromotionsView
    public C11234e<Boolean> showRootInstallWarningPopup() {
        return GenericDialogs.createGenericYesNoCancelMessage(getContext(), null, getResources().getString(C1146R.string.root_access_dialog), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.e2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((GenericDialogs.EResponse) obj).equals(GenericDialogs.EResponse.YES));
            }
        });
    }

    @Override // cm.aptoide.p092pt.promotions.PromotionsView
    public void updateClaimStatus(String str) {
        if (!str.equals(AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME)) {
            this.promotionsAdapter.updateClaimStatus(str);
        } else {
            setClaimedButton();
            this.promotionsAdapter.isWalletInstalled(true);
        }
    }
}
