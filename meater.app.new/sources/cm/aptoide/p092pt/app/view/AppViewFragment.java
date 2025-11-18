package cm.aptoide.p092pt.app.view;

import android.R;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.app.ActivityC0067d;
import androidx.appcompat.app.DialogInterfaceC0066c;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0255a;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.aptoideviews.appcoins.BonusAppcView;
import cm.aptoide.aptoideviews.errors.ErrorView;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.ads.AdsRepository;
import cm.aptoide.p092pt.ads.MinimalAdMapper;
import cm.aptoide.p092pt.app.AppModel;
import cm.aptoide.p092pt.app.AppReview;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.app.ReviewsViewModel;
import cm.aptoide.p092pt.app.view.PromotionEvent;
import cm.aptoide.p092pt.app.view.screenshots.ScreenShotClickEvent;
import cm.aptoide.p092pt.app.view.screenshots.ScreenshotsAdapter;
import cm.aptoide.p092pt.app.view.similar.SimilarAppClickEvent;
import cm.aptoide.p092pt.app.view.similar.SimilarAppsBundle;
import cm.aptoide.p092pt.app.view.similar.SimilarAppsBundleAdapter;
import cm.aptoide.p092pt.bonus.BonusAppcModel;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.database.RoomStoredMinimalAdPersistence;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Malware;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.home.SnapToStartHelper;
import cm.aptoide.p092pt.install.view.remote.RemoteInstallDialog;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.permission.DialogPermissions;
import cm.aptoide.p092pt.promotions.Promotion;
import cm.aptoide.p092pt.promotions.WalletApp;
import cm.aptoide.p092pt.reviews.LanguageFilterHelper;
import cm.aptoide.p092pt.search.model.SearchAdResult;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.util.AppUtils;
import cm.aptoide.p092pt.util.ReferrerUtils;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.utils.p106q.QManager;
import cm.aptoide.p092pt.view.app.AppDeveloper;
import cm.aptoide.p092pt.view.app.AppFlags;
import cm.aptoide.p092pt.view.app.AppMedia;
import cm.aptoide.p092pt.view.app.DetailedAppRequestResult;
import cm.aptoide.p092pt.view.app.FlagsVote;
import cm.aptoide.p092pt.view.dialog.DialogBadgeV7;
import cm.aptoide.p092pt.view.dialog.DialogUtils;
import cm.aptoide.p092pt.view.fragment.NavigationTrackFragment;
import cm.aptoide.p092pt.view.recycler.LinearLayoutManagerWithSmoothScroller;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.snackbar.Snackbar;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Named;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p241e.p294g.p295a.p297b.p300b.p301a.C8964b;
import p241e.p294g.p295a.p297b.p302c.p303a.C8971e;
import p241e.p294g.p295a.p304c.C8975a;
import p241e.p294g.p295a.p304c.C8980f;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11246k;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p473s.C11418b;
import p456rx.p474t.C11429e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class AppViewFragment extends NavigationTrackFragment implements AppViewView {
    private static final int APPC_TRANSITION_MS = 1000;
    private static final String BADGE_DIALOG_TAG = "badgeDialog";
    private static final String KEY_SCROLL_Y = "y";
    private DownloadModel.Action action;
    private AbstractC0064a actionBar;
    private AdsRepository adsRepository;
    private C11418b<String> apkfyDialogConfirmSubject;
    private View apkfyElement;
    private ImageView appIcon;
    private TextView appName;
    private View appcInfoView;
    private View appcMigrationWarningMessage;
    private View appview;
    private ViewStub appviewInstall;
    private TextView avgReviewScore;
    private RatingBar avgReviewScoreBar;
    private BonusAppcView bonusAppcView;
    private boolean bumpedUp;
    private C11418b<Void> cancelClickSubject;
    private ImageView cancelDownload;
    private ImageView cancelWalletDownload;
    private View catappultCard;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private Converter.Factory converterFactory;
    private Button descriptionReadMore;
    private TextView descriptionText;

    @Inject
    DialogUtils dialogUtils;
    private View downloadControlsLayout;
    private LinearLayout downloadInfoLayout;
    private ProgressBar downloadProgressBar;
    private TextView downloadProgressValue;
    private ProgressBar downloadWalletProgressBar;
    private TextView downloadWalletProgressValue;
    private TextView downloadsTop;
    private TextView emptyReviewTextView;
    private View emptyReviewsLayout;
    private InterfaceC11246k errorMessageSubscription;
    private ErrorView errorView;
    private View fakeAppLayout;
    private TextView fakeAppText;
    private View flagThisAppSection;
    private View flagsLayoutWrapper;
    private View goodAppLayoutWrapper;
    private OkHttpClient httpClient;
    private View iabInfo;
    private ImageView iconSizeInfo;
    private View infoEmail;
    private View infoPermissions;
    private View infoPrivacy;
    private View infoWebsite;
    private Button install;
    private C11418b<DownloadModel.Action> installClickSubject;
    private TextView installStateText;
    public boolean isEskills;
    private TextView latestVersion;
    private TextView latestVersionTitle;
    private C11418b<Void> loginSnackClick;

    @Inject
    @Named
    String marketName;
    private Menu menu;
    private TextView needsLicenceText;
    private View needsLicenseLayout;

    @Inject
    @Named
    DecimalFormat oneDecimalFormat;
    private TextView otherVersions;
    private View otherVersionsTopSeparator;
    private C11418b<Void> pauseClickSubject;
    private ImageView pauseDownload;
    private ImageView pauseWalletDownload;
    private View poaBudgetElement;
    private TextView poaBudgetMessage;
    private ImageView poaCoinsIcon;
    private TextView poaCountdownHours;
    private View poaCountdownMessage;
    private TextView poaCountdownMinutes;
    private TextView poaCountdownSeconds;
    private CountDownTimer poaCountdownTimer;
    private DecimalFormat poaFiatDecimalFormat;
    private View poaIabInfo;
    private ViewStub poaInstall;
    private TextView poaOfferValue;

    @Inject
    AppViewPresenter presenter;
    private C11418b<PromotionEvent> promotionAppClick;
    private View promotionView;
    private QManager qManager;
    private Button rateAppButton;
    private Button rateAppButtonLarge;
    private TextView ratingInfo;
    private View ratingLayout;
    private C11418b<ReadMoreClickEvent> readMoreClick;
    private C11418b<DownloadModel.Action> resumeClickSubject;
    private ImageView resumeDownload;
    private ImageView resumeWalletDownload;
    private TextView reviewUsers;
    private TopReviewsAdapter reviewsAdapter;
    private C11418b<Integer> reviewsAutoScroll;
    private View reviewsLayout;
    private RecyclerView reviewsView;
    private TextView rewardAppLatestVersion;

    @Inject
    RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence;
    private C11418b<ScreenShotClickEvent> screenShotClick;
    private RecyclerView screenshots;
    private ScreenshotsAdapter screenshotsAdapter;
    private NestedScrollView scrollView;
    private int scrollViewY;
    private Button showAllReviewsButton;
    private C11418b<SimilarAppClickEvent> similarAppClick;
    private C11418b<Boolean> similarAppsVisibilitySubject;
    private View similarBottomPlaceholder;
    private View similarDownloadPlaceholder;
    private SimilarAppsBundleAdapter similarListAdapter;
    private RecyclerView similarListRecyclerView;
    private TextView sizeInfo;
    private TextView storeDownloads;
    private Button storeFollow;
    private TextView storeFollowers;
    private ImageView storeIcon;
    private View storeLayout;
    private TextView storeName;

    @Inject
    ThemeManager themeManager;
    private Toolbar toolbar;
    private View topReviewsLayout;
    private ContentLoadingProgressBar topReviewsProgress;
    private ImageView trustedBadge;
    private View trustedLayout;
    private TextView trustedText;
    private View versionsLayout;
    private ProgressBar viewProgress;
    private View virusLayout;
    private TextView virusText;
    private View walletDownloadControlsLayout;
    private View walletPromotionButtonsLayout;
    private Button walletPromotionCancelButton;
    private Button walletPromotionClaimButton;
    private View walletPromotionClaimLayout;
    private Button walletPromotionDownloadButton;
    private View walletPromotionDownloadLayout;
    private ImageView walletPromotionIcon;
    private Button walletPromotionInstallDisableButton;
    private View walletPromotionInstallDisableLayout;
    private TextView walletPromotionMessage;
    private TextView walletPromotionTitle;
    private View workingWellLayout;
    private TextView workingWellText;

    /* renamed from: cm.aptoide.pt.app.view.AppViewFragment$2 */
    static /* synthetic */ class C15012 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$view$app$DetailedAppRequestResult$Error;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$view$app$FlagsVote$VoteType;

        static {
            int[] iArr = new int[DownloadModel.Action.values().length];
            $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action = iArr;
            try {
                iArr[DownloadModel.Action.UPDATE.ordinal()] = 1;
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
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.DOWNGRADE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.MIGRATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[Malware.Rank.values().length];
            $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank = iArr2;
            try {
                iArr2[Malware.Rank.TRUSTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank[Malware.Rank.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank[Malware.Rank.CRITICAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank[Malware.Rank.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[DownloadModel.DownloadState.values().length];
            $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState = iArr3;
            try {
                iArr3[DownloadModel.DownloadState.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.INDETERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[DownloadModel.DownloadState.INSTALLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr4 = new int[FlagsVote.VoteType.values().length];
            $SwitchMap$cm$aptoide$pt$view$app$FlagsVote$VoteType = iArr4;
            try {
                iArr4[FlagsVote.VoteType.GOOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$view$app$FlagsVote$VoteType[FlagsVote.VoteType.LICENSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$view$app$FlagsVote$VoteType[FlagsVote.VoteType.FAKE.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$view$app$FlagsVote$VoteType[FlagsVote.VoteType.VIRUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$view$app$FlagsVote$VoteType[FlagsVote.VoteType.FREEZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            int[] iArr5 = new int[DetailedAppRequestResult.Error.values().length];
            $SwitchMap$cm$aptoide$pt$view$app$DetailedAppRequestResult$Error = iArr5;
            try {
                iArr5[DetailedAppRequestResult.Error.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$view$app$DetailedAppRequestResult$Error[DetailedAppRequestResult.Error.GENERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public enum BundleKeys {
        APP_ID,
        STORE_NAME,
        STORE_THEME,
        MINIMAL_AD,
        PACKAGE_NAME,
        SHOULD_INSTALL,
        MD5,
        UNAME,
        DOWNLOAD_CONVERSION_URL,
        APPC,
        EDITORS_CHOICE_POSITION,
        ORIGIN_TAG,
        OEM_ID
    }

    public enum OpenType {
        OPEN_ONLY,
        OPEN_AND_INSTALL,
        OPEN_WITH_INSTALL_POPUP,
        APK_FY_INSTALL_POPUP
    }

    private void applyCount(FlagsVote.VoteType voteType, int i2) {
        String string = Integer.toString(i2);
        int i3 = C15012.$SwitchMap$cm$aptoide$pt$view$app$FlagsVote$VoteType[voteType.ordinal()];
        if (i3 == 1) {
            this.workingWellText.setText(NumberFormat.getIntegerInstance().format(Double.parseDouble(string)));
            return;
        }
        if (i3 == 2) {
            this.needsLicenceText.setText(NumberFormat.getIntegerInstance().format(Double.parseDouble(string)));
            return;
        }
        if (i3 == 3) {
            this.fakeAppText.setText(NumberFormat.getIntegerInstance().format(Double.parseDouble(string)));
            return;
        }
        if (i3 == 4) {
            this.virusText.setText(NumberFormat.getIntegerInstance().format(Double.parseDouble(string)));
        } else {
            if (i3 == 5) {
                return;
            }
            throw new IllegalArgumentException("Unable to find Type " + voteType.name());
        }
    }

    private C11234e<GenericDialogs.EResponse> createCustomDialogForApkfy(final String str, final double d2, final float f2, final String str2, final int i2) {
        return C11234e.m40048l(new C11234e.a() { // from class: cm.aptoide.pt.app.view.i
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7825f.m7065f(str, f2, d2, i2, str2, (AbstractC11245j) obj);
            }
        });
    }

    private SpannableString formatAppCoinsRewardMessage(String str) throws Resources.NotFoundException {
        String string;
        SpannableString spannableString;
        if (str.equals("-1.0")) {
            string = getResources().getString(C1146R.string.appc_message_appview_appcoins_reward, "AppCoins Credits");
            spannableString = new SpannableString(string);
        } else {
            string = getResources().getString(C1146R.string.appc_message_appview_appcoins_reward_with_value, str, "AppCoins Credits");
            spannableString = new SpannableString(string);
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(C1146R.color.default_orange_gradient_end)), string.indexOf(str), string.indexOf(str) + str.length(), 33);
        }
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(C1146R.color.default_orange_gradient_end)), string.indexOf("AppCoins Credits"), string.indexOf("AppCoins Credits") + 16, 33);
        return spannableString;
    }

    private int getPromotionMessage(DownloadModel downloadModel) {
        return (downloadModel.getAction().equals(DownloadModel.Action.MIGRATE) || downloadModel.getAction().equals(DownloadModel.Action.UPDATE)) ? C1146R.string.wallet_promotion_wallet_installed_update_message : C1146R.string.wallet_promotion_wallet_notinstalled_message;
    }

    private void handleDownloadError(DownloadModel.DownloadState downloadState) {
        if (downloadState == DownloadModel.DownloadState.ERROR) {
            showGenericErrorDialog();
            return;
        }
        throw new IllegalStateException("Invalid Download State " + downloadState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createCustomDialogForApkfy$47, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7064e(AbstractC11245j abstractC11245j, String str, DialogInterfaceC0066c dialogInterfaceC0066c, View view) {
        abstractC11245j.onNext(GenericDialogs.EResponse.YES);
        this.apkfyDialogConfirmSubject.onNext(str);
        abstractC11245j.onCompleted();
        dialogInterfaceC0066c.dismiss();
    }

    static /* synthetic */ void lambda$createCustomDialogForApkfy$48(AbstractC11245j abstractC11245j, View view) {
        abstractC11245j.onNext(GenericDialogs.EResponse.CANCEL);
        abstractC11245j.onCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createCustomDialogForApkfy$49, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7065f(final String str, float f2, double d2, int i2, String str2, final AbstractC11245j abstractC11245j) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(C1146R.layout.apkfy_new_dialog, (ViewGroup) null);
        final DialogInterfaceC0066c dialogInterfaceC0066cM244a = new DialogInterfaceC0066c.a(getContext()).m266w(viewInflate).m244a();
        ((TextView) viewInflate.findViewById(C1146R.id.app_name)).setText(str);
        ((TextView) viewInflate.findViewById(C1146R.id.app_rating)).setText(this.oneDecimalFormat.format(f2));
        if (d2 > 0.0d) {
            ((TextView) viewInflate.findViewById(C1146R.id.appc_value)).setText(new DecimalFormat("0.00").format(d2));
        } else {
            viewInflate.findViewById(C1146R.id.appc_layout).setVisibility(8);
        }
        ((TextView) viewInflate.findViewById(C1146R.id.app_downloads)).setText(String.format("%s %s", AptoideUtils.StringU.withSuffix(i2), getResources().getString(C1146R.string.downloads)));
        ImageLoader.with(getContext()).load(str2, (ImageView) viewInflate.findViewById(C1146R.id.app_icon));
        viewInflate.findViewById(C1146R.id.positive_button).setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.app.view.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7659f.m7064e(abstractC11245j, str, dialogInterfaceC0066cM244a, view);
            }
        });
        viewInflate.findViewById(C1146R.id.negative_button).setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.app.view.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppViewFragment.lambda$createCustomDialogForApkfy$48(abstractC11245j, view);
            }
        });
        dialogInterfaceC0066cM244a.getClass();
        abstractC11245j.add(C11429e.m40674a(new InterfaceC11252a() { // from class: cm.aptoide.pt.app.view.a
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                dialogInterfaceC0066cM244a.dismiss();
            }
        }));
        dialogInterfaceC0066cM244a.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$displayNotLoggedInSnack$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7066g(View view) {
        this.loginSnackClick.onNext(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$extractReferrer$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7067h(SearchAdResult searchAdResult) {
        ReferrerUtils.extractReferrer(searchAdResult, 2, false, this.adsRepository, this.httpClient, this.converterFactory, this.qManager, getContext().getApplicationContext(), ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences(), new MinimalAdMapper(), this.roomStoredMinimalAdPersistence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$installAppClick$41, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ DownloadModel.Action m7068i(DownloadModel.Action action) {
        return this.action;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onViewCreated$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7069j(View view) {
        this.installClickSubject.onNext(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onViewCreated$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7070k(View view) {
        this.resumeClickSubject.onNext(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onViewCreated$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7071l(View view) {
        this.cancelClickSubject.onNext(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onViewCreated$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7072m(View view) {
        this.pauseClickSubject.onNext(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onViewCreated$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7073n(ViewStub viewStub, View view) {
        this.install = (Button) view.findViewById(C1146R.id.appview_install_button);
        this.downloadInfoLayout = (LinearLayout) view.findViewById(C1146R.id.appview_transfer_info);
        this.downloadProgressBar = (ProgressBar) view.findViewById(C1146R.id.appview_download_progress_bar);
        this.downloadProgressValue = (TextView) view.findViewById(C1146R.id.appview_download_progress_number);
        this.cancelDownload = (ImageView) view.findViewById(C1146R.id.appview_download_cancel_button);
        this.resumeDownload = (ImageView) view.findViewById(C1146R.id.appview_download_resume_download);
        this.pauseDownload = (ImageView) view.findViewById(C1146R.id.appview_download_pause_download);
        this.installStateText = (TextView) view.findViewById(C1146R.id.appview_download_download_state);
        this.downloadControlsLayout = view.findViewById(C1146R.id.install_controls_layout);
        this.install.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.app.view.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f7706f.m7069j(view2);
            }
        });
        this.resumeDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.app.view.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f7856f.m7070k(view2);
            }
        });
        this.cancelDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.app.view.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8034f.m7071l(view2);
            }
        });
        this.pauseDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.app.view.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8121f.m7072m(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onViewCreated$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7074o(View view, AppBarLayout appBarLayout, int i2) {
        float fAbs = Math.abs(i2) / appBarLayout.getTotalScrollRange();
        float f2 = 1.0f - (1.2f * fAbs);
        view.findViewById(C1146R.id.app_icon).setAlpha(f2);
        view.findViewById(C1146R.id.app_name).setAlpha(f2);
        this.bonusAppcView.setAlpha(f2);
        this.bonusAppcView.setTranslationX((-(1.15f * fAbs)) * r4.getMeasuredWidth());
        ((ToolbarArcBackground) view.findViewById(C1146R.id.toolbar_background_arc)).setScale(fAbs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$recoverScrollViewState$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7075p() {
        NestedScrollView nestedScrollView = this.scrollView;
        if (nestedScrollView != null) {
            nestedScrollView.scrollTo(0, this.scrollViewY);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$44, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ DownloadModel.Action m7076q(DownloadModel.Action action) {
        return this.action;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$scrollVisibleSimilarApps$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m7077r(C8980f c8980f) {
        return Boolean.valueOf(isSimilarAppsVisible());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setReadMoreClickListener$40, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7078s(String str, AppMedia appMedia, Store store, boolean z, View view) {
        this.readMoreClick.onNext(new ReadMoreClickEvent(str, appMedia.getDescription(), store.getAppearance().getTheme(), z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupActiveWalletPromotion$35, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7079t(Promotion promotion, WalletApp walletApp, View view) {
        this.promotionAppClick.onNext(new PromotionEvent(promotion, walletApp, PromotionEvent.ClickType.PAUSE_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupActiveWalletPromotion$36, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7080u(Promotion promotion, WalletApp walletApp, View view) {
        this.promotionAppClick.onNext(new PromotionEvent(promotion, walletApp, PromotionEvent.ClickType.PAUSE_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupActiveWalletPromotion$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7081v(Promotion promotion, WalletApp walletApp, View view) {
        this.promotionAppClick.onNext(new PromotionEvent(promotion, walletApp, PromotionEvent.ClickType.CANCEL_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupActiveWalletPromotion$38, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7082w(Promotion promotion, WalletApp walletApp, View view) {
        this.promotionAppClick.onNext(new PromotionEvent(promotion, walletApp, PromotionEvent.ClickType.RESUME_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupActiveWalletPromotion$39, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7083x(Promotion promotion, WalletApp walletApp, View view) {
        this.promotionAppClick.onNext(new PromotionEvent(promotion, walletApp, PromotionEvent.ClickType.PAUSE_DOWNLOAD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupClaimWalletPromotion$33, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7084y(Promotion promotion, WalletApp walletApp, View view) {
        this.promotionAppClick.onNext(new PromotionEvent(promotion, walletApp, PromotionEvent.ClickType.CLAIM));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupInactiveWalletPromotion$34, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7085z(Promotion promotion, WalletApp walletApp, View view) {
        this.promotionAppClick.onNext(new PromotionEvent(promotion, walletApp, PromotionEvent.ClickType.INSTALL_APP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showAppcWalletPromotionView$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7063A(Promotion promotion, WalletApp walletApp, View view) {
        this.promotionAppClick.onNext(new PromotionEvent(promotion, walletApp, PromotionEvent.ClickType.DISMISS));
    }

    static /* synthetic */ void lambda$showErrorDialog$45(GenericDialogs.EResponse eResponse) {
    }

    static /* synthetic */ void lambda$showErrorDialog$46(Throwable th) {
        new OnErrorNotImplementedException(th);
    }

    static /* synthetic */ Void lambda$showOpenAndInstallApkFyDialog$19(GenericDialogs.EResponse eResponse) {
        return null;
    }

    static /* synthetic */ Void lambda$showOpenAndInstallDialog$17(GenericDialogs.EResponse eResponse) {
        return null;
    }

    static /* synthetic */ void lambda$showShareOnTvDialog$12(GenericDialogs.EResponse eResponse) {
    }

    private void manageSimilarAppsVisibility(boolean z, boolean z2) {
        if (this.bumpedUp) {
            return;
        }
        if (z2) {
            this.bumpedUp = true;
        }
        if (!z) {
            hideSimilarApps();
            return;
        }
        this.similarListRecyclerView.setVisibility(0);
        LinearLayout linearLayout = (LinearLayout) this.similarListRecyclerView.getParent();
        if (!z2) {
            linearLayout.removeView(this.similarListRecyclerView);
            LinearLayout linearLayout2 = (LinearLayout) this.similarBottomPlaceholder.getParent();
            linearLayout2.addView(this.similarListRecyclerView, linearLayout2.indexOfChild(this.similarBottomPlaceholder));
            return;
        }
        linearLayout.removeView(this.similarListRecyclerView);
        LinearLayout linearLayout3 = (LinearLayout) this.similarDownloadPlaceholder.getParent();
        linearLayout3.addView(this.similarListRecyclerView, linearLayout3.indexOfChild(this.similarDownloadPlaceholder));
        this.similarAppsVisibilitySubject.onNext(Boolean.TRUE);
    }

    private void setAppFlags(boolean z, AppFlags appFlags) {
        if (z) {
            this.goodAppLayoutWrapper.setVisibility(0);
            this.flagsLayoutWrapper.setVisibility(8);
        } else {
            this.goodAppLayoutWrapper.setVisibility(8);
            this.flagsLayoutWrapper.setVisibility(0);
            setFlagValues(appFlags);
        }
    }

    private void setButtonText(DownloadModel downloadModel) {
        int i2 = C15012.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[downloadModel.getAction().ordinal()];
        if (i2 == 1) {
            this.install.setText(getResources().getString(C1146R.string.appview_button_update));
            return;
        }
        if (i2 == 2) {
            this.install.setText(getResources().getString(C1146R.string.appview_button_install));
            return;
        }
        if (i2 == 3) {
            this.install.setText(getResources().getString(C1146R.string.appview_button_open));
        } else if (i2 == 4) {
            this.install.setText(getResources().getString(C1146R.string.appview_button_downgrade));
        } else {
            if (i2 != 5) {
                return;
            }
            this.install.setText(getResources().getString(C1146R.string.promo_update2appc_appview_update_button));
        }
    }

    private void setCountdownTimer(String str) {
        long time;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        final DecimalFormat decimalFormat = new DecimalFormat("00");
        simpleDateFormat.setLenient(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            time = simpleDateFormat.parse(str).getTime();
        } catch (ParseException e2) {
            e2.printStackTrace();
            time = 0;
        }
        long j2 = time - jCurrentTimeMillis;
        this.poaCountdownHours.setText(decimalFormat.format(0L));
        this.poaCountdownMinutes.setText(decimalFormat.format(0L));
        this.poaCountdownSeconds.setText(decimalFormat.format(0L));
        if (j2 >= 0) {
            this.poaCountdownTimer = new CountDownTimer(j2, 1000L) { // from class: cm.aptoide.pt.app.view.AppViewFragment.1
                @Override // android.os.CountDownTimer
                public void onFinish() {
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j3) {
                    AppViewFragment.this.poaCountdownHours.setText(decimalFormat.format(j3 / 3600000));
                    AppViewFragment.this.poaCountdownMinutes.setText(decimalFormat.format((j3 % 3600000) / 60000));
                    AppViewFragment.this.poaCountdownSeconds.setText(decimalFormat.format(((j3 % 360000) % 60000) / 1000));
                }
            }.start();
        }
    }

    private void setDescription(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.descriptionText.setText(AptoideUtils.HtmlU.parse(str));
        } else {
            this.descriptionText.setText(C1146R.string.description_not_available);
            this.descriptionReadMore.setVisibility(8);
        }
    }

    private void setDeveloperDetails(AppDeveloper appDeveloper) {
        if (TextUtils.isEmpty(appDeveloper.getWebsite())) {
            this.infoWebsite.setVisibility(8);
        } else {
            this.infoWebsite.setVisibility(0);
        }
        if (TextUtils.isEmpty(appDeveloper.getEmail())) {
            this.infoEmail.setVisibility(8);
        } else {
            this.infoEmail.setVisibility(0);
        }
        if (TextUtils.isEmpty(appDeveloper.getPrivacy())) {
            this.infoPrivacy.setVisibility(8);
        } else {
            this.infoPrivacy.setVisibility(0);
        }
    }

    private void setDownloadState(int i2, DownloadModel.DownloadState downloadState, long j2, boolean z) {
        String bytes = AptoideUtils.StringU.formatBytes(j2, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 4.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 2.0f);
        int i3 = C15012.$SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[downloadState.ordinal()];
        if (i3 == 1) {
            this.downloadProgressBar.setIndeterminate(false);
            this.downloadProgressBar.setProgress(i2);
            if (z) {
                this.downloadProgressValue.setText(i2 + "% of " + bytes);
            } else {
                this.downloadProgressValue.setText(i2 + "%");
            }
            this.downloadProgressValue.setVisibility(0);
            this.pauseDownload.setVisibility(0);
            this.cancelDownload.setVisibility(8);
            this.resumeDownload.setVisibility(8);
            this.downloadControlsLayout.setVisibility(0);
            this.downloadControlsLayout.setLayoutParams(layoutParams);
            this.installStateText.setText(getString(C1146R.string.appview_short_downloading));
            return;
        }
        if (i3 == 2) {
            this.downloadProgressBar.setIndeterminate(true);
            this.pauseDownload.setVisibility(0);
            this.downloadProgressValue.setVisibility(8);
            this.cancelDownload.setVisibility(8);
            this.resumeDownload.setVisibility(8);
            this.downloadControlsLayout.setVisibility(0);
            this.downloadControlsLayout.setLayoutParams(layoutParams);
            this.installStateText.setText(getString(C1146R.string.appview_short_downloading));
            return;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                this.downloadProgressBar.setIndeterminate(true);
                this.pauseDownload.setVisibility(0);
                this.downloadProgressValue.setVisibility(8);
                this.cancelDownload.setVisibility(8);
                this.resumeDownload.setVisibility(8);
                this.downloadControlsLayout.setVisibility(0);
                this.downloadControlsLayout.setLayoutParams(layoutParams);
                this.installStateText.setText(getString(C1146R.string.appview_short_downloading));
                return;
            }
            if (i3 != 6) {
                return;
            }
            this.downloadProgressBar.setIndeterminate(true);
            this.pauseDownload.setVisibility(8);
            this.downloadProgressValue.setVisibility(8);
            this.cancelDownload.setVisibility(8);
            this.resumeDownload.setVisibility(8);
            this.downloadControlsLayout.setVisibility(8);
            this.installStateText.setText(getString(C1146R.string.appview_short_installing));
            return;
        }
        this.downloadProgressBar.setIndeterminate(false);
        this.downloadProgressBar.setProgress(i2);
        if (z) {
            this.downloadProgressValue.setText(i2 + "% of " + bytes);
        } else {
            this.downloadProgressValue.setText(i2 + "%");
        }
        this.downloadProgressValue.setVisibility(0);
        this.pauseDownload.setVisibility(8);
        this.cancelDownload.setVisibility(0);
        this.resumeDownload.setVisibility(0);
        this.downloadControlsLayout.setVisibility(0);
        this.downloadControlsLayout.setLayoutParams(layoutParams2);
        this.installStateText.setText(getString(C1146R.string.appview_short_downloading));
    }

    private void setFlagValues(AppFlags appFlags) {
        if (appFlags != null) {
            try {
                if (appFlags.getVotes() == null || appFlags.getVotes().isEmpty()) {
                    return;
                }
                for (FlagsVote flagsVote : appFlags.getVotes()) {
                    applyCount(flagsVote.getVoteType(), flagsVote.getCount());
                }
            } catch (NullPointerException e2) {
                CrashReport.getInstance().log(e2);
            }
        }
    }

    private void setReadMoreClickListener(final String str, final AppMedia appMedia, final Store store, final boolean z) {
        this.descriptionReadMore.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.app.view.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7663f.m7078s(str, appMedia, store, z, view);
            }
        });
    }

    private void setSimilarAppsAdapters() {
        SimilarAppsBundleAdapter similarAppsBundleAdapter = new SimilarAppsBundleAdapter(new ArrayList(), this.oneDecimalFormat, this.similarAppClick);
        this.similarListAdapter = similarAppsBundleAdapter;
        this.similarListRecyclerView.setAdapter(similarAppsBundleAdapter);
    }

    private void setTrustedBadge(Malware malware) {
        int i2;
        int i3;
        int i4 = C15012.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank[(malware.getRank() == null ? Malware.Rank.UNKNOWN : malware.getRank()).ordinal()];
        if (i4 == 1) {
            i2 = C1146R.drawable.ic_badges_trusted;
            i3 = C1146R.string.appview_header_trusted_text;
        } else if (i4 == 2) {
            i2 = C1146R.drawable.ic_badges_warning;
            i3 = C1146R.string.warning;
        } else if (i4 != 3) {
            i2 = C1146R.drawable.ic_badges_unknown;
            i3 = C1146R.string.unknown;
        } else {
            i2 = C1146R.drawable.ic_badges_critical;
            i3 = C1146R.string.critical;
        }
        this.trustedBadge.setImageDrawable(C0255a.m1677f(getContext(), i2));
        this.trustedText.setText(i3);
    }

    private void setupActiveWalletPromotion(final Promotion promotion, final WalletApp walletApp, DownloadModel downloadModel) {
        setupWalletPromotionText(promotion, getPromotionMessage(downloadModel));
        this.walletPromotionDownloadLayout.setVisibility(0);
        this.walletPromotionButtonsLayout.setVisibility(8);
        this.walletPromotionIcon.setVisibility(0);
        DownloadModel.DownloadState downloadState = walletApp.getDownloadModel().getDownloadState();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 4.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 2.0f);
        int i2 = C15012.$SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[downloadState.ordinal()];
        if (i2 == 1) {
            this.downloadWalletProgressBar.setIndeterminate(false);
            this.downloadWalletProgressBar.setProgress(walletApp.getDownloadModel().getProgress());
            this.downloadWalletProgressValue.setText(walletApp.getDownloadModel().getProgress() + "%");
            this.pauseWalletDownload.setVisibility(0);
            this.pauseWalletDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.app.view.z0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8186f.m7079t(promotion, walletApp, view);
                }
            });
            this.cancelWalletDownload.setVisibility(8);
            this.resumeWalletDownload.setVisibility(8);
            this.walletDownloadControlsLayout.setLayoutParams(layoutParams);
            return;
        }
        if (i2 == 2) {
            this.downloadWalletProgressBar.setIndeterminate(true);
            this.pauseWalletDownload.setVisibility(0);
            this.pauseWalletDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.app.view.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7997f.m7080u(promotion, walletApp, view);
                }
            });
            this.cancelWalletDownload.setVisibility(8);
            this.resumeWalletDownload.setVisibility(8);
            this.walletDownloadControlsLayout.setLayoutParams(layoutParams);
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
                this.downloadWalletProgressBar.setIndeterminate(true);
                this.pauseWalletDownload.setVisibility(0);
                this.pauseWalletDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.app.view.o0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f7958f.m7083x(promotion, walletApp, view);
                    }
                });
                this.cancelWalletDownload.setVisibility(8);
                this.resumeWalletDownload.setVisibility(8);
                this.walletDownloadControlsLayout.setLayoutParams(layoutParams);
                return;
            }
        }
        this.downloadWalletProgressBar.setIndeterminate(false);
        this.downloadWalletProgressBar.setProgress(walletApp.getDownloadModel().getProgress());
        this.downloadWalletProgressValue.setText(walletApp.getDownloadModel().getProgress() + "%");
        this.pauseWalletDownload.setVisibility(8);
        this.cancelWalletDownload.setVisibility(0);
        this.cancelWalletDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.app.view.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7684f.m7081v(promotion, walletApp, view);
            }
        });
        this.resumeWalletDownload.setVisibility(0);
        this.resumeWalletDownload.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.app.view.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8183f.m7082w(promotion, walletApp, view);
            }
        });
        this.walletDownloadControlsLayout.setLayoutParams(layoutParams2);
    }

    private void setupClaimWalletPromotion(final Promotion promotion, final WalletApp walletApp) {
        setupWalletPromotionText(promotion, C1146R.string.wallet_promotion_wallet_claim_message);
        this.walletPromotionClaimButton.setText(String.format(getString(C1146R.string.wallet_promotion_button_claim), Float.valueOf(promotion.getAppc())));
        this.walletPromotionDownloadLayout.setVisibility(8);
        this.walletPromotionInstallDisableLayout.setVisibility(8);
        this.walletPromotionButtonsLayout.setVisibility(8);
        this.walletPromotionClaimLayout.setVisibility(0);
        this.walletPromotionClaimButton.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.app.view.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8060f.m7084y(promotion, walletApp, view);
            }
        });
        this.walletPromotionIcon.setVisibility(0);
    }

    private void setupInactiveWalletPromotion(final Promotion promotion, final WalletApp walletApp, DownloadModel downloadModel) {
        setupWalletPromotionText(promotion, getPromotionMessage(downloadModel));
        this.walletPromotionDownloadLayout.setVisibility(8);
        this.walletPromotionInstallDisableLayout.setVisibility(8);
        this.walletPromotionClaimLayout.setVisibility(8);
        this.walletPromotionButtonsLayout.setVisibility(0);
        this.walletPromotionIcon.setVisibility(0);
        this.walletPromotionDownloadButton.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.app.view.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7724f.m7085z(promotion, walletApp, view);
            }
        });
    }

    private void setupInstallDependencyApp(Promotion promotion, DownloadModel downloadModel) {
        setupWalletPromotionText(promotion, (downloadModel.getAction() == DownloadModel.Action.MIGRATE || downloadModel.getAction() == DownloadModel.Action.UPDATE) ? C1146R.string.wallet_promotion_wallet_installed_update_message : C1146R.string.wallet_promotion_wallet_installed_message);
        this.walletPromotionInstallDisableButton.setText(String.format(getString(C1146R.string.wallet_promotion_button_install_disabled), Float.valueOf(promotion.getAppc())));
        this.walletPromotionInstallDisableLayout.setVisibility(0);
        this.walletPromotionDownloadLayout.setVisibility(8);
        this.walletPromotionButtonsLayout.setVisibility(8);
        this.walletPromotionClaimLayout.setVisibility(8);
        this.walletPromotionIcon.setImageResource(C1146R.drawable.ic_promotion_coins);
    }

    private void setupWalletPromotionText(Promotion promotion, int i2) {
        this.walletPromotionTitle.setText(String.format(getString(C1146R.string.wallet_promotion_title), Float.valueOf(promotion.getAppc())));
        this.walletPromotionMessage.setText(String.format(getString(i2), Float.valueOf(promotion.getAppc())));
    }

    private void showAppViewLayout() {
        this.appview.setVisibility(0);
        this.viewProgress.setVisibility(8);
        this.errorView.setVisibility(8);
    }

    private void showAppcInfo(boolean z, boolean z2, double d2, double d3, String str, double d4, String str2) {
        if (z) {
            String str3 = str + this.poaFiatDecimalFormat.format(d3);
            this.appcInfoView.setVisibility(0);
            this.poaOfferValue.setText(String.format(getResources().getString(C1146R.string.poa_app_view_card_body_2), Double.valueOf(d2), str3));
            if (!str2.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
                this.poaCountdownMessage.setVisibility(0);
                setCountdownTimer(str2);
            } else if (d4 != -1.0d) {
                this.poaBudgetElement.setVisibility(0);
                this.poaBudgetMessage.setText(String.format(getResources().getString(C1146R.string.poa_APPCC_left_body), Integer.valueOf((int) (d4 / d2))));
            }
            if (z2) {
                this.poaIabInfo.setVisibility(0);
            }
        }
    }

    private void showErrorDialog(String str, String str2) {
        this.errorMessageSubscription = GenericDialogs.createGenericOkMessage(getContext(), str, str2, this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId).m40065I0(C11250a.m40156b()).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.x
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewFragment.lambda$showErrorDialog$45((GenericDialogs.EResponse) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.t0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewFragment.lambda$showErrorDialog$46((Throwable) obj);
            }
        });
    }

    private void showHideOptionsMenu(boolean z) {
        for (int i2 = 0; i2 < this.menu.size(); i2++) {
            showHideOptionsMenu(this.menu.getItem(i2), z);
        }
    }

    private void showReviews(boolean z, int i2, float f2) {
        this.topReviewsProgress.setVisibility(8);
        this.reviewUsers.setText(AptoideUtils.StringU.withSuffix(i2));
        if (f2 == 0.0f) {
            this.avgReviewScore.setText(C1146R.string.appcardview_title_no_stars);
        } else {
            this.avgReviewScore.setText(String.format(Locale.getDefault(), "%.1f", Float.valueOf(f2)));
        }
        this.avgReviewScoreBar.setRating(f2);
        if (z) {
            this.ratingLayout.setVisibility(0);
            this.emptyReviewsLayout.setVisibility(8);
            this.topReviewsLayout.setVisibility(0);
            this.rateAppButtonLarge.setVisibility(8);
            this.rateAppButton.setVisibility(0);
            return;
        }
        this.ratingLayout.setVisibility(0);
        this.emptyReviewsLayout.setVisibility(0);
        this.topReviewsLayout.setVisibility(8);
        this.rateAppButtonLarge.setVisibility(0);
        this.rateAppButton.setVisibility(8);
        if (i2 == 0) {
            this.emptyReviewTextView.setText(C1146R.string.appview_rate_this_app);
        }
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<String> apkfyDialogPositiveClick() {
        return this.apkfyDialogConfirmSubject;
    }

    @Override // cm.aptoide.p092pt.appview.InstallAppView
    public C11234e<Void> cancelDownload() {
        return this.cancelClickSubject;
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<WalletApp> cancelPromotionDownload() {
        return this.promotionAppClick.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.y
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((PromotionEvent) obj).getClickType() == PromotionEvent.ClickType.CANCEL_DOWNLOAD);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.l0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((PromotionEvent) obj).getWallet();
            }
        });
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Promotion> claimAppClick() {
        return this.promotionAppClick.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.n0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((PromotionEvent) obj).getClickType() == PromotionEvent.ClickType.CLAIM);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.r0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((PromotionEvent) obj).getPromotion();
            }
        });
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> clickBonusAppcFlair() {
        return C8975a.m28573a(this.bonusAppcView);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> clickCatappultCard() {
        return C8975a.m28573a(this.catappultCard);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> clickDeveloperEmail() {
        return C8975a.m28573a(this.infoEmail);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> clickDeveloperPermissions() {
        return C8975a.m28573a(this.infoPermissions);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> clickDeveloperPrivacy() {
        return C8975a.m28573a(this.infoPrivacy);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> clickDeveloperWebsite() {
        return C8975a.m28573a(this.infoWebsite);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> clickErrorRetry() {
        return this.errorView.retryClick();
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<FlagsVote.VoteType> clickFakeFlag() {
        return C8975a.m28573a(this.fakeAppLayout).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.h0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return C11234e.m40025S(FlagsVote.VoteType.FAKE);
            }
        });
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> clickFollowStore() {
        return C8975a.m28573a(this.storeFollow);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> clickGetAppcInfo() {
        return C8975a.m28573a(this.poaCoinsIcon);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<FlagsVote.VoteType> clickLicenseFlag() {
        return C8975a.m28573a(this.needsLicenseLayout).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return C11234e.m40025S(FlagsVote.VoteType.LICENSE);
            }
        });
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> clickLoginSnack() {
        return this.loginSnackClick;
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> clickOtherVersions() {
        return C8975a.m28573a(this.otherVersions);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> clickRateApp() {
        return C8975a.m28573a(this.rateAppButton);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> clickRateAppLarge() {
        return C8975a.m28573a(this.rateAppButtonLarge);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> clickRateAppLayout() {
        return C8975a.m28573a(this.ratingLayout);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> clickReadAllReviews() {
        return C8975a.m28573a(this.showAllReviewsButton);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> clickReviewsLayout() {
        return C8975a.m28573a(this.topReviewsLayout);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<SimilarAppClickEvent> clickSimilarApp() {
        return this.similarAppClick;
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> clickStoreLayout() {
        return C8975a.m28573a(this.storeLayout);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<MenuItem> clickToolbar() {
        return C8971e.m28567a(this.toolbar);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> clickTrustedBadge() {
        return C8975a.m28573a(this.trustedLayout);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<FlagsVote.VoteType> clickVirusFlag() {
        return C8975a.m28573a(this.virusLayout).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.w0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return C11234e.m40025S(FlagsVote.VoteType.VIRUS);
            }
        });
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<FlagsVote.VoteType> clickWorkingFlag() {
        return C8975a.m28573a(this.workingWellLayout).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.v0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return C11234e.m40025S(FlagsVote.VoteType.GOOD);
            }
        });
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<ReadMoreClickEvent> clickedReadMore() {
        return this.readMoreClick;
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void defaultShare(String str, String str2) {
        if (str2 != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", getActivity().getString(C1146R.string.install) + " \"" + str + "\"");
            intent.putExtra("android.intent.extra.TEXT", str2);
            getActivity().startActivity(Intent.createChooser(intent, getActivity().getString(C1146R.string.share)));
        }
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void disableFlags() {
        this.workingWellLayout.setClickable(false);
        this.needsLicenseLayout.setClickable(false);
        this.fakeAppLayout.setClickable(false);
        this.virusLayout.setClickable(false);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Promotion> dismissWalletPromotionClick() {
        return this.promotionAppClick.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.f0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((PromotionEvent) obj).getClickType() == PromotionEvent.ClickType.DISMISS);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.c1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((PromotionEvent) obj).getPromotion();
            }
        });
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void dismissWalletPromotionView() {
        this.promotionView.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void displayNotLoggedInSnack() {
        Snackbar.m24763Z(getView(), C1146R.string.you_need_to_be_logged_in, -1).m24765b0(C1146R.string.login, new View.OnClickListener() { // from class: cm.aptoide.pt.app.view.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7978f.m7066g(view);
            }
        }).mo24744P();
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void displayStoreFollowedSnack(String str) {
        Toast.makeText(getContext(), String.format(getString(C1146R.string.store_followed), str), 0).show();
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void enableFlags() {
        this.workingWellLayout.setClickable(true);
        this.needsLicenseLayout.setClickable(true);
        this.fakeAppLayout.setClickable(true);
        this.virusLayout.setClickable(true);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void extractReferrer(final SearchAdResult searchAdResult) {
        AptoideUtils.ThreadU.runOnUiThread(new Runnable() { // from class: cm.aptoide.pt.app.view.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f7935f.m7067h(searchAdResult);
            }
        });
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build("AppViewFragment", getArguments().getString(BundleKeys.ORIGIN_TAG.name(), HttpUrl.FRAGMENT_ENCODE_SET), StoreContext.meta.name());
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public String getLanguageFilter() {
        return new LanguageFilterHelper(getContext().getResources()).getCurrentLanguageFirst().getCountryCodes().get(0);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<ScreenShotClickEvent> getScreenshotClickEvent() {
        return this.screenShotClick;
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void handleError(DetailedAppRequestResult.Error error) {
        this.viewProgress.setVisibility(8);
        int i2 = C15012.$SwitchMap$cm$aptoide$pt$view$app$DetailedAppRequestResult$Error[error.ordinal()];
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

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void hideReviews() {
        this.reviewsLayout.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void hideSimilarApps() {
        this.similarListRecyclerView.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> iabInfoClick() {
        return C11234e.m40033a0(C8975a.m28573a(this.poaIabInfo), C8975a.m28573a(this.iabInfo));
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void incrementFlags(FlagsVote.VoteType voteType) {
        disableFlags();
        int i2 = C15012.$SwitchMap$cm$aptoide$pt$view$app$FlagsVote$VoteType[voteType.ordinal()];
        if (i2 == 1) {
            this.workingWellText.setText(NumberFormat.getIntegerInstance().format(Double.parseDouble(String.valueOf(new BigDecimal(this.workingWellText.getText().toString()))) + 1.0d));
            this.workingWellLayout.setSelected(true);
            this.workingWellLayout.setPressed(false);
            return;
        }
        if (i2 == 2) {
            this.needsLicenceText.setText(NumberFormat.getIntegerInstance().format(Double.parseDouble(String.valueOf(new BigDecimal(this.needsLicenceText.getText().toString()))) + 1.0d));
            this.needsLicenceText.setSelected(true);
            this.needsLicenceText.setPressed(false);
        } else if (i2 == 3) {
            this.fakeAppText.setText(NumberFormat.getIntegerInstance().format(Double.parseDouble(String.valueOf(new BigDecimal(this.fakeAppText.getText().toString()))) + 1.0d));
            this.fakeAppLayout.setSelected(true);
            this.fakeAppLayout.setPressed(false);
        } else if (i2 == 4) {
            this.virusText.setText(NumberFormat.getIntegerInstance().format(Double.parseDouble(String.valueOf(new BigDecimal(this.virusText.getText().toString()))) + 1.0d));
            this.virusLayout.setSelected(true);
            this.virusLayout.setPressed(false);
        } else {
            throw new IllegalArgumentException("Unable to find Type " + voteType.name());
        }
    }

    @Override // cm.aptoide.p092pt.appview.InstallAppView
    public C11234e<DownloadModel.Action> installAppClick() {
        return this.installClickSubject.m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.m0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7915f.m7068i((DownloadModel.Action) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Pair<Promotion, WalletApp>> installWalletButtonClick() {
        return this.promotionAppClick.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                PromotionEvent promotionEvent = (PromotionEvent) obj;
                return Boolean.valueOf(promotionEvent.getClickType() == PromotionEvent.ClickType.UPDATE || promotionEvent.getClickType() == PromotionEvent.ClickType.INSTALL_APP || promotionEvent.getClickType() == PromotionEvent.ClickType.DOWNLOAD || promotionEvent.getClickType() == PromotionEvent.ClickType.DOWNGRADE);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.q0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                PromotionEvent promotionEvent = (PromotionEvent) obj;
                return Pair.create(promotionEvent.getPromotion(), promotionEvent.getWallet());
            }
        });
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public boolean isSimilarAppsVisible() {
        Rect rect = new Rect();
        this.scrollView.getHitRect(rect);
        return this.similarListRecyclerView.getLocalVisibleRect(rect);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void navigateToDeveloperEmail(AppModel appModel) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("mailto:" + appModel.getDeveloper().getEmail() + "?subject=Feedback&body="));
        getContext().startActivity(intent);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void navigateToDeveloperPermissions(AppModel appModel) {
        DialogPermissions.newInstance(appModel.getAppName(), appModel.getVersionName(), appModel.getIcon(), AptoideUtils.StringU.formatBytes(AppUtils.sumFileSizes(appModel.getFileSize(), appModel.getObb()), false), appModel.getUsedPermissions()).show(getActivity().getSupportFragmentManager(), HttpUrl.FRAGMENT_ENCODE_SET);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void navigateToDeveloperPrivacy(AppModel appModel) {
        getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(appModel.getDeveloper().getPrivacy())));
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void navigateToDeveloperWebsite(AppModel appModel) {
        getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(appModel.getDeveloper().getWebsite())));
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.screenShotClick = C11418b.m40637g1();
        this.readMoreClick = C11418b.m40637g1();
        this.loginSnackClick = C11418b.m40637g1();
        this.similarAppClick = C11418b.m40637g1();
        this.reviewsAutoScroll = C11418b.m40637g1();
        this.apkfyDialogConfirmSubject = C11418b.m40637g1();
        this.similarAppsVisibilitySubject = C11418b.m40637g1();
        this.installClickSubject = C11418b.m40637g1();
        this.resumeClickSubject = C11418b.m40637g1();
        this.cancelClickSubject = C11418b.m40637g1();
        this.pauseClickSubject = C11418b.m40637g1();
        this.promotionAppClick = C11418b.m40637g1();
        this.poaFiatDecimalFormat = new DecimalFormat("0.00");
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        this.qManager = aptoideApplication.getQManager();
        this.httpClient = aptoideApplication.getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        this.adsRepository = aptoideApplication.getAdsRepository();
        setHasOptionsMenu(true);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        this.menu = menu;
        menuInflater.inflate(C1146R.menu.fragment_appview, menu);
        showHideOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewInflate = layoutInflater.inflate(C1146R.layout.fragment_app_view, viewGroup, false);
        if (this.isEskills) {
            viewInflate.getContext().setTheme(C1146R.style.AppBaseThemeDark);
        }
        return viewInflate;
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC11246k interfaceC11246k = this.errorMessageSubscription;
        if (interfaceC11246k != null && !interfaceC11246k.isUnsubscribed()) {
            this.errorMessageSubscription.unsubscribe();
        }
        this.screenShotClick = null;
        this.readMoreClick = null;
        this.loginSnackClick = null;
        this.similarAppClick = null;
        this.reviewsAutoScroll = null;
        this.dialogUtils = null;
        this.presenter = null;
        this.similarAppsVisibilitySubject = null;
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.scrollViewY = this.scrollView.getScrollY();
        this.appviewInstall = null;
        this.poaInstall = null;
        this.appcInfoView = null;
        this.poaIabInfo = null;
        this.poaOfferValue = null;
        this.iabInfo = null;
        this.errorView = null;
        this.appIcon = null;
        this.trustedBadge = null;
        this.appName = null;
        this.trustedLayout = null;
        this.trustedText = null;
        this.downloadsTop = null;
        this.sizeInfo = null;
        this.iconSizeInfo = null;
        this.ratingInfo = null;
        this.latestVersion = null;
        this.otherVersions = null;
        this.screenshots = null;
        this.descriptionText = null;
        this.reviewsAdapter = null;
        this.descriptionReadMore = null;
        this.topReviewsProgress = null;
        this.ratingLayout = null;
        this.emptyReviewsLayout = null;
        this.topReviewsLayout = null;
        this.rateAppButtonLarge = null;
        this.emptyReviewTextView = null;
        this.reviewUsers = null;
        this.avgReviewScore = null;
        this.avgReviewScoreBar = null;
        this.reviewsView = null;
        this.rateAppButton = null;
        this.showAllReviewsButton = null;
        this.goodAppLayoutWrapper = null;
        this.flagsLayoutWrapper = null;
        this.workingWellLayout = null;
        this.needsLicenseLayout = null;
        this.fakeAppLayout = null;
        this.virusLayout = null;
        this.workingWellText = null;
        this.needsLicenceText = null;
        this.fakeAppText = null;
        this.virusText = null;
        this.storeLayout = null;
        this.storeIcon = null;
        this.storeName = null;
        this.storeFollowers = null;
        this.storeDownloads = null;
        this.storeFollow = null;
        this.infoWebsite = null;
        this.infoEmail = null;
        this.infoPrivacy = null;
        this.infoPermissions = null;
        this.viewProgress = null;
        this.appview = null;
        this.screenshotsAdapter = null;
        this.catappultCard = null;
        this.menu = null;
        this.toolbar = null;
        this.actionBar = null;
        this.scrollView = null;
        this.collapsingToolbarLayout = null;
        CountDownTimer countDownTimer = this.poaCountdownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.poaCountdownTimer = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return this.isEskills ? layoutInflaterOnGetLayoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), C1146R.style.AppBaseThemeDark)) : layoutInflaterOnGetLayoutInflater;
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        NestedScrollView nestedScrollView = this.scrollView;
        if (nestedScrollView != null) {
            bundle.putInt(KEY_SCROLL_Y, nestedScrollView.getScrollY());
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle bundle) throws IllegalStateException {
        super.onViewCreated(view, bundle);
        ViewStub.OnInflateListener onInflateListener = new ViewStub.OnInflateListener() { // from class: cm.aptoide.pt.app.view.u0
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view2) {
                this.f8085a.m7073n(viewStub, view2);
            }
        };
        ViewStub viewStub = (ViewStub) view.findViewById(C1146R.id.appview_install_element);
        this.appviewInstall = viewStub;
        viewStub.setLayoutResource(C1146R.layout.install_app_view);
        this.appviewInstall.setOnInflateListener(onInflateListener);
        ViewStub viewStub2 = (ViewStub) view.findViewById(C1146R.id.poa_install_element);
        this.poaInstall = viewStub2;
        viewStub2.setLayoutResource(C1146R.layout.install_app_view);
        this.poaInstall.setOnInflateListener(onInflateListener);
        this.scrollView = (NestedScrollView) view.findViewById(C1146R.id.scroll_view_app);
        this.errorView = (ErrorView) view.findViewById(C1146R.id.error_view);
        this.reviewsLayout = view.findViewById(C1146R.id.reviews_layout);
        this.appIcon = (ImageView) view.findViewById(C1146R.id.app_icon);
        this.trustedBadge = (ImageView) view.findViewById(C1146R.id.trusted_badge);
        this.appName = (TextView) view.findViewById(C1146R.id.app_name);
        this.trustedLayout = view.findViewById(C1146R.id.trusted_layout);
        this.trustedText = (TextView) view.findViewById(C1146R.id.trusted_text);
        this.downloadsTop = (TextView) view.findViewById(C1146R.id.header_downloads);
        this.sizeInfo = (TextView) view.findViewById(C1146R.id.header_size);
        this.iconSizeInfo = (ImageView) view.findViewById(C1146R.id.header_size_icon);
        this.ratingInfo = (TextView) view.findViewById(C1146R.id.header_rating);
        this.appcMigrationWarningMessage = view.findViewById(C1146R.id.migration_warning);
        this.otherVersionsTopSeparator = view.findViewById(C1146R.id.other_versions_top_separator);
        this.appcInfoView = view.findViewById(C1146R.id.poa_appc_layout);
        this.poaCoinsIcon = (ImageView) view.findViewById(C1146R.id.coins_icon);
        this.poaIabInfo = view.findViewById(C1146R.id.inapp_purchases);
        this.poaOfferValue = (TextView) view.findViewById(C1146R.id.offer_value);
        this.poaBudgetElement = view.findViewById(C1146R.id.budget_element);
        this.poaBudgetMessage = (TextView) view.findViewById(C1146R.id.budget_left_message);
        this.poaCountdownMessage = view.findViewById(C1146R.id.countdown_element);
        this.poaCountdownHours = (TextView) view.findViewById(C1146R.id.hours);
        this.poaCountdownMinutes = (TextView) view.findViewById(C1146R.id.minutes);
        this.poaCountdownSeconds = (TextView) view.findViewById(C1146R.id.seconds);
        this.iabInfo = view.findViewById(C1146R.id.iap_appc_label);
        this.versionsLayout = view.findViewById(C1146R.id.versions_layout);
        this.latestVersionTitle = (TextView) view.findViewById(C1146R.id.latest_version_title);
        this.latestVersion = (TextView) this.versionsLayout.findViewById(C1146R.id.latest_version);
        this.rewardAppLatestVersion = (TextView) view.findViewById(C1146R.id.appview_reward_app_versions_element);
        this.otherVersions = (TextView) view.findViewById(C1146R.id.other_versions);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1146R.id.screenshots_list);
        this.screenshots = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        this.screenshots.setNestedScrollingEnabled(false);
        this.descriptionText = (TextView) view.findViewById(C1146R.id.description_text);
        this.descriptionReadMore = (Button) view.findViewById(C1146R.id.description_see_more);
        this.topReviewsProgress = (ContentLoadingProgressBar) view.findViewById(C1146R.id.top_comments_progress);
        this.ratingLayout = view.findViewById(C1146R.id.rating_layout);
        this.emptyReviewsLayout = view.findViewById(C1146R.id.empty_reviews_layout);
        this.topReviewsLayout = view.findViewById(C1146R.id.comments_layout);
        this.rateAppButtonLarge = (Button) view.findViewById(C1146R.id.rate_this_button2);
        this.emptyReviewTextView = (TextView) view.findViewById(C1146R.id.empty_review_text);
        this.reviewUsers = (TextView) view.findViewById(C1146R.id.users_voted);
        this.avgReviewScore = (TextView) view.findViewById(C1146R.id.rating_value);
        this.avgReviewScoreBar = (RatingBar) view.findViewById(C1146R.id.rating_bar);
        this.reviewsView = (RecyclerView) view.findViewById(C1146R.id.top_comments_list);
        this.rateAppButton = (Button) view.findViewById(C1146R.id.rate_this_button);
        this.showAllReviewsButton = (Button) view.findViewById(C1146R.id.read_all_button);
        this.apkfyElement = view.findViewById(C1146R.id.apkfy_element);
        this.flagThisAppSection = view.findViewById(C1146R.id.flag_this_app_section);
        this.goodAppLayoutWrapper = view.findViewById(C1146R.id.good_app_layout);
        this.flagsLayoutWrapper = view.findViewById(C1146R.id.rating_flags_layout);
        this.workingWellLayout = view.findViewById(C1146R.id.working_well_layout);
        this.needsLicenseLayout = view.findViewById(C1146R.id.needs_licence_layout);
        this.fakeAppLayout = view.findViewById(C1146R.id.fake_app_layout);
        this.virusLayout = view.findViewById(C1146R.id.virus_layout);
        this.workingWellText = (TextView) view.findViewById(C1146R.id.working_well_count);
        this.needsLicenceText = (TextView) view.findViewById(C1146R.id.needs_licence_count);
        this.fakeAppText = (TextView) view.findViewById(C1146R.id.fake_app_count);
        this.virusText = (TextView) view.findViewById(C1146R.id.virus_count);
        this.storeLayout = view.findViewById(C1146R.id.store_uploaded_layout);
        this.storeIcon = (ImageView) view.findViewById(C1146R.id.store_icon);
        this.storeName = (TextView) view.findViewById(C1146R.id.store_name);
        this.storeFollowers = (TextView) view.findViewById(C1146R.id.user_count);
        this.storeDownloads = (TextView) view.findViewById(C1146R.id.download_count);
        this.storeFollow = (Button) view.findViewById(C1146R.id.follow_button);
        this.similarListRecyclerView = (RecyclerView) view.findViewById(C1146R.id.similar_list);
        this.similarDownloadPlaceholder = view.findViewById(C1146R.id.similar_download_placeholder);
        this.similarBottomPlaceholder = view.findViewById(C1146R.id.similar_bottom_placeholder);
        this.infoWebsite = view.findViewById(C1146R.id.website_label);
        this.infoEmail = view.findViewById(C1146R.id.email_label);
        this.infoPrivacy = view.findViewById(C1146R.id.privacy_policy_label);
        this.infoPermissions = view.findViewById(C1146R.id.permissions_label);
        this.catappultCard = view.findViewById(C1146R.id.catappult_card);
        this.viewProgress = (ProgressBar) view.findViewById(C1146R.id.appview_progress);
        this.appview = view.findViewById(C1146R.id.appview_full);
        this.toolbar = (Toolbar) view.findViewById(C1146R.id.toolbar);
        this.bonusAppcView = (BonusAppcView) view.findViewById(C1146R.id.bonus_appc_view);
        View viewFindViewById = view.findViewById(C1146R.id.wallet_install_promotion);
        this.promotionView = viewFindViewById;
        this.walletPromotionTitle = (TextView) viewFindViewById.findViewById(C1146R.id.wallet_title);
        this.walletPromotionMessage = (TextView) this.promotionView.findViewById(C1146R.id.wallet_message);
        this.walletPromotionButtonsLayout = this.promotionView.findViewById(C1146R.id.buttons_layout);
        this.walletPromotionCancelButton = (Button) this.promotionView.findViewById(C1146R.id.cancel_button);
        this.walletPromotionDownloadButton = (Button) this.promotionView.findViewById(C1146R.id.download_button);
        View viewFindViewById2 = view.findViewById(C1146R.id.wallet_download_info);
        this.walletPromotionDownloadLayout = viewFindViewById2;
        this.downloadWalletProgressBar = (ProgressBar) viewFindViewById2.findViewById(C1146R.id.wallet_download_progress_bar);
        this.downloadWalletProgressValue = (TextView) this.walletPromotionDownloadLayout.findViewById(C1146R.id.wallet_download_progress_number);
        this.cancelWalletDownload = (ImageView) this.walletPromotionDownloadLayout.findViewById(C1146R.id.wallet_download_cancel_button);
        this.pauseWalletDownload = (ImageView) this.walletPromotionDownloadLayout.findViewById(C1146R.id.wallet_download_pause_download);
        this.resumeWalletDownload = (ImageView) this.walletPromotionDownloadLayout.findViewById(C1146R.id.wallet_download_resume_download);
        this.walletPromotionClaimLayout = view.findViewById(C1146R.id.wallet_claim_appc_layout);
        this.walletPromotionIcon = (ImageView) view.findViewById(C1146R.id.wallet_icon);
        this.walletPromotionClaimButton = (Button) view.findViewById(C1146R.id.wallet_claim_appc_button);
        this.walletDownloadControlsLayout = view.findViewById(C1146R.id.wallet_install_controls_layout);
        this.walletPromotionInstallDisableLayout = view.findViewById(C1146R.id.wallet_install_disabled_layout);
        this.walletPromotionInstallDisableButton = (Button) view.findViewById(C1146R.id.wallet_install_disabled_button);
        ScreenshotsAdapter screenshotsAdapter = new ScreenshotsAdapter(new ArrayList(), new ArrayList(), this.screenShotClick);
        this.screenshotsAdapter = screenshotsAdapter;
        this.screenshots.setAdapter(screenshotsAdapter);
        LinearLayoutManagerWithSmoothScroller linearLayoutManagerWithSmoothScroller = new LinearLayoutManagerWithSmoothScroller(getContext(), 0, false);
        this.similarListRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.similarListRecyclerView.setNestedScrollingEnabled(false);
        setSimilarAppsAdapters();
        this.reviewsView.setLayoutManager(linearLayoutManagerWithSmoothScroller);
        this.reviewsView.setNestedScrollingEnabled(false);
        SnapToStartHelper snapToStartHelper = new SnapToStartHelper();
        SnapToStartHelper snapToStartHelper2 = new SnapToStartHelper();
        snapToStartHelper.attachToRecyclerView(this.reviewsView);
        snapToStartHelper2.attachToRecyclerView(this.screenshots);
        setupToolbar();
        ((AppBarLayout) view.findViewById(C1146R.id.app_bar_layout)).m23708b(new AppBarLayout.InterfaceC7928e() { // from class: cm.aptoide.pt.app.view.g0
            @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC7926c
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i2) {
                this.f7784a.m7074o(view, appBarLayout, i2);
            }
        });
        if (bundle != null) {
            this.scrollViewY = bundle.getInt(KEY_SCROLL_Y, 0);
        }
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) view.findViewById(C1146R.id.collapsing_toolbar_layout);
        this.collapsingToolbarLayout = collapsingToolbarLayout;
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(R.color.transparent));
        attachPresenter(this.presenter);
    }

    @Override // cm.aptoide.p092pt.appview.InstallAppView
    public void openApp(String str) {
        AptoideUtils.SystemU.openApp(str, getContext().getPackageManager(), getContext());
    }

    @Override // cm.aptoide.p092pt.appview.InstallAppView
    public C11234e<Void> pauseDownload() {
        return this.pauseClickSubject;
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<WalletApp> pausePromotionDownload() {
        return this.promotionAppClick.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.u
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((PromotionEvent) obj).getClickType() == PromotionEvent.ClickType.PAUSE_DOWNLOAD);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.b1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((PromotionEvent) obj).getWallet();
            }
        });
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void populateReviews(ReviewsViewModel reviewsViewModel, AppModel appModel) {
        List<AppReview> reviewsList = reviewsViewModel.getReviewsList();
        if (reviewsList == null || reviewsList.isEmpty()) {
            showReviews(false, appModel.getRating().getTotal(), appModel.getRating().getAverage());
            this.reviewsAdapter = new TopReviewsAdapter();
        } else {
            showReviews(true, appModel.getRating().getTotal(), appModel.getRating().getAverage());
            this.reviewsAdapter = new TopReviewsAdapter((AppReview[]) reviewsList.toArray(new AppReview[reviewsList.size()]));
        }
        this.reviewsView.setAdapter(this.reviewsAdapter);
        this.reviewsAutoScroll.onNext(Integer.valueOf(this.reviewsAdapter.getItemCount()));
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void populateSimilar(List<SimilarAppsBundle> list) {
        this.similarListAdapter.add(list);
        manageSimilarAppsVisibility(true, false);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void recoverScrollViewState() {
        this.scrollView.post(new Runnable() { // from class: cm.aptoide.pt.app.view.y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8160f.m7075p();
            }
        });
    }

    @Override // cm.aptoide.p092pt.appview.InstallAppView
    public C11234e<DownloadModel.Action> resumeDownload() {
        return this.resumeClickSubject.m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7914f.m7076q((DownloadModel.Action) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<WalletApp> resumePromotionDownload() {
        return this.promotionAppClick.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.j0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((PromotionEvent) obj).getClickType() == PromotionEvent.ClickType.RESUME_DOWNLOAD);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.e0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((PromotionEvent) obj).getWallet();
            }
        });
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void scrollReviews(Integer num) {
        RecyclerView recyclerView = this.reviewsView;
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(num.intValue());
        }
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Integer> scrollReviewsResponse() {
        return this.reviewsAutoScroll;
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<C8980f> scrollVisibleSimilarApps() {
        return C8964b.m28560a(this.scrollView).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.s
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8033f.m7077r((C8980f) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void setFollowButton(boolean z) {
        if (z) {
            return;
        }
        this.storeFollow.setText(C1146R.string.followed);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void setInstallButton(AppCoinsViewModel appCoinsViewModel) {
        if (!appCoinsViewModel.hasAdvertising()) {
            this.appviewInstall.inflate();
        } else {
            this.poaInstall.inflate();
            this.otherVersionsTopSeparator.setVisibility(4);
        }
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void setupAppcAppView(boolean z, BonusAppcModel bonusAppcModel) {
        getContext().getTheme().resolveAttribute(C1146R.attr.appview_toolbar_bg_appc, new TypedValue(), true);
        if (z && bonusAppcModel.getHasBonusAppc()) {
            this.bonusAppcView.setPercentage(bonusAppcModel.getBonusPercentage());
            this.bonusAppcView.setVisibility(0);
        }
        this.install.setBackgroundDrawable(getContext().getResources().getDrawable(C1146R.color.default_orange_gradient_end));
        this.downloadProgressBar.setProgressDrawable(C0255a.m1677f(getContext(), C1146R.drawable.appc_progress));
        this.flagThisAppSection.setVisibility(8);
    }

    public void setupToolbar() {
        this.toolbar.setTitle(HttpUrl.FRAGMENT_ENCODE_SET);
        ActivityC0067d activityC0067d = (ActivityC0067d) getActivity();
        activityC0067d.setSupportActionBar(this.toolbar);
        AbstractC0064a supportActionBar = activityC0067d.getSupportActionBar();
        this.actionBar = supportActionBar;
        if (supportActionBar != null) {
            supportActionBar.mo227r(true);
            this.actionBar.mo231v(this.toolbar.getTitle());
        }
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void showApkfyElement(String str) {
        this.apkfyElement.setVisibility(0);
        ((TextView) this.apkfyElement.findViewById(C1146R.id.apkfy_message_1)).setText(String.format(getString(C1146R.string.appview_message_apkfy_1), str));
        ((TextView) this.apkfyElement.findViewById(C1146R.id.apkfy_title)).setText(getResources().getString(C1146R.string.appview_title_apkfy));
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void showAppView(AppModel appModel) {
        this.collapsingToolbarLayout.setTitle(appModel.getAppName());
        this.appName.setText(appModel.getAppName());
        ImageLoader.with(getContext()).load(appModel.getIcon(), this.appIcon);
        this.downloadsTop.setText(String.format("%s", AptoideUtils.StringU.withSuffix(appModel.getPackageDownloads())));
        if (appModel.hasSplits()) {
            this.sizeInfo.setVisibility(8);
            this.iconSizeInfo.setVisibility(8);
        } else {
            this.sizeInfo.setText(AptoideUtils.StringU.formatBytes(appModel.getSize(), false));
        }
        if (appModel.getRating().getAverage() == 0.0f) {
            this.ratingInfo.setText(C1146R.string.appcardview_title_no_stars);
        } else {
            this.ratingInfo.setText(this.oneDecimalFormat.format(appModel.getRating().getAverage()));
        }
        if (getArguments().getFloat(BundleKeys.APPC.name(), -1.0f) != -1.0f) {
            this.versionsLayout.setVisibility(8);
            this.rewardAppLatestVersion.setVisibility(0);
            String versionName = appModel.getVersionName();
            String str = String.format(getResources().getString(C1146R.string.appview_latest_version_with_value), versionName);
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(C1146R.color.grey_medium)), str.indexOf(versionName), str.indexOf(versionName) + versionName.length(), 33);
            this.rewardAppLatestVersion.setText(spannableString);
        } else {
            this.latestVersion.setText(appModel.getVersionName());
            if (appModel.isBeta()) {
                this.latestVersion.setCompoundDrawablesWithIntrinsicBounds(C1146R.drawable.ic_beta, 0, 0, 0);
                this.latestVersion.setCompoundDrawablePadding(8);
            }
            if (!appModel.isLatestTrustedVersion()) {
                this.latestVersionTitle.setText(getString(C1146R.string.appview_version_text));
                this.otherVersions.setText(getString(C1146R.string.newer_version_available));
            }
        }
        this.storeName.setText(appModel.getStore().getName());
        ImageLoader.with(getContext()).loadWithShadowCircleTransform(appModel.getStore().getAvatar(), this.storeIcon);
        this.storeDownloads.setText(String.format("%s", AptoideUtils.StringU.withSuffix(appModel.getStore().getStats().getDownloads())));
        this.storeFollowers.setText(String.format("%s", AptoideUtils.StringU.withSuffix(appModel.getStore().getStats().getSubscribers())));
        if (appModel.isStoreFollowed()) {
            this.storeFollow.setText(C1146R.string.followed);
        } else {
            this.storeFollow.setText(C1146R.string.follow);
        }
        if ((appModel.getMedia().getScreenshots() == null || appModel.getMedia().getScreenshots().isEmpty()) && (appModel.getMedia().getVideos() == null || appModel.getMedia().getVideos().isEmpty())) {
            this.screenshots.setVisibility(8);
        } else {
            this.screenshotsAdapter.updateScreenshots(appModel.getMedia().getScreenshots());
            this.screenshotsAdapter.updateVideos(appModel.getMedia().getVideos());
        }
        if (appModel.hasBilling()) {
            this.iabInfo.setVisibility(0);
        }
        setTrustedBadge(appModel.getMalware());
        setDescription(appModel.getMedia().getDescription());
        setAppFlags(appModel.isGoodApp(), appModel.getAppFlags());
        setReadMoreClickListener(appModel.getAppName(), appModel.getMedia(), appModel.getStore(), appModel.isAppCoinApp());
        setDeveloperDetails(appModel.getDeveloper());
        showAppViewLayout();
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void showAppcWalletPromotionView(final Promotion promotion, final WalletApp walletApp, Promotion.ClaimAction claimAction, DownloadModel downloadModel) {
        this.walletPromotionCancelButton.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.app.view.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7802f.m7063A(promotion, walletApp, view);
            }
        });
        if (walletApp.isInstalled()) {
            if (downloadModel.getAction().equals(DownloadModel.Action.OPEN)) {
                setupClaimWalletPromotion(promotion, walletApp);
            } else {
                setupInstallDependencyApp(promotion, downloadModel);
            }
        } else if (walletApp.getDownloadModel().isDownloading()) {
            setupActiveWalletPromotion(promotion, walletApp, downloadModel);
        } else {
            setupInactiveWalletPromotion(promotion, walletApp, downloadModel);
        }
        this.promotionView.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.appview.InstallAppView
    public C11234e<Boolean> showDowngradeMessage() {
        return GenericDialogs.createGenericContinueCancelMessage(getContext(), null, getContext().getResources().getString(C1146R.string.downgrade_warning_dialog), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.i0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((GenericDialogs.EResponse) obj).equals(GenericDialogs.EResponse.YES));
            }
        });
    }

    @Override // cm.aptoide.p092pt.appview.InstallAppView
    public void showDowngradingMessage() {
        Snackbar.m24763Z(getView(), C1146R.string.downgrading_msg, -1).mo24744P();
    }

    @Override // cm.aptoide.p092pt.appview.InstallAppView
    public void showDownloadAppModel(DownloadModel downloadModel, AppCoinsViewModel appCoinsViewModel, boolean z) {
        DownloadModel.Action action = downloadModel.getAction();
        this.action = action;
        DownloadModel.Action action2 = DownloadModel.Action.MIGRATE;
        if (!action.equals(action2)) {
            showAppcInfo(appCoinsViewModel.getAdvertisingModel().getHasAdvertising(), appCoinsViewModel.hasBilling(), appCoinsViewModel.getAdvertisingModel().getAppcReward(), appCoinsViewModel.getAdvertisingModel().getFiatReward(), appCoinsViewModel.getAdvertisingModel().getFiatCurrency(), appCoinsViewModel.getAdvertisingModel().getAppcBudget(), appCoinsViewModel.getAdvertisingModel().getEndDate());
        }
        if (downloadModel.isDownloadingOrInstalling()) {
            this.downloadInfoLayout.setVisibility(0);
            this.install.setVisibility(8);
            setDownloadState(downloadModel.getProgress(), downloadModel.getDownloadState(), downloadModel.getAppSize(), z);
        } else {
            if (this.action.equals(action2)) {
                this.appcInfoView.setVisibility(8);
                this.appcMigrationWarningMessage.setVisibility(0);
            }
            this.downloadInfoLayout.setVisibility(8);
            this.install.setVisibility(0);
            setButtonText(downloadModel);
        }
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void showDownloadError(DownloadModel downloadModel) {
        if (downloadModel.hasError()) {
            handleDownloadError(downloadModel.getDownloadState());
        }
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void showDownloadingSimilarApps(boolean z) {
        manageSimilarAppsVisibility(z, true);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void showFlagVoteSubmittedMessage() {
        Toast.makeText(getContext(), C1146R.string.vote_submitted, 0).show();
    }

    @Override // cm.aptoide.p092pt.appview.InstallAppView
    public void showGenericErrorDialog() {
        showErrorDialog(HttpUrl.FRAGMENT_ENCODE_SET, getContext().getString(C1146R.string.error_occured));
    }

    @Override // cm.aptoide.p092pt.appview.InstallAppView
    public void showInvalidAppInfoErrorDialog() {
        showErrorDialog(HttpUrl.FRAGMENT_ENCODE_SET, getContext().getString(C1146R.string.appview_download_error_missing_splits));
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void showLoading() {
        this.viewProgress.setVisibility(0);
        this.appview.setVisibility(8);
        this.errorView.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> showOpenAndInstallApkFyDialog(String str, String str2, double d2, float f2, String str3, int i2) {
        return createCustomDialogForApkfy(str2, d2, f2, str3, i2).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.d1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((GenericDialogs.EResponse) obj).equals(GenericDialogs.EResponse.YES));
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.k0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppViewFragment.lambda$showOpenAndInstallApkFyDialog$19((GenericDialogs.EResponse) obj);
                return null;
            }
        });
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Void> showOpenAndInstallDialog(String str, String str2) {
        return GenericDialogs.createGenericOkCancelMessage(getContext(), str, getContext().getString(C1146R.string.installapp_alrt, str2), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.r
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((GenericDialogs.EResponse) obj).equals(GenericDialogs.EResponse.YES));
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.e1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppViewFragment.lambda$showOpenAndInstallDialog$17((GenericDialogs.EResponse) obj);
                return null;
            }
        });
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<GenericDialogs.EResponse> showRateDialog(String str, String str2, String str3) {
        return this.dialogUtils.showRateDialog(getActivity(), str, str2, str3);
    }

    @Override // cm.aptoide.p092pt.appview.InstallAppView
    public C11234e<Boolean> showRootInstallWarningPopup() {
        return GenericDialogs.createGenericYesNoCancelMessage(getContext(), null, getResources().getString(C1146R.string.root_access_dialog), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.p0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((GenericDialogs.EResponse) obj).equals(GenericDialogs.EResponse.YES));
            }
        });
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void showShareOnTvDialog(long j2) {
        if (AptoideUtils.SystemU.getConnectionType((ConnectivityManager) getContext().getSystemService("connectivity")).equals("mobile")) {
            GenericDialogs.createGenericOkMessage(getContext(), getContext().getString(C1146R.string.remote_install_menu_title), getContext().getString(C1146R.string.install_on_tv_mobile_error), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.k
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    AppViewFragment.lambda$showShareOnTvDialog$12((GenericDialogs.EResponse) obj);
                }
            }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.v
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    CrashReport.getInstance().log((Throwable) obj);
                }
            });
        } else {
            RemoteInstallDialog.newInstance(j2).show(getActivity().getSupportFragmentManager(), RemoteInstallDialog.class.getSimpleName());
        }
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public void showTrustedDialog(AppModel appModel) {
        DialogBadgeV7.newInstance(this.marketName, appModel.getMalware(), appModel.getAppName(), appModel.getMalware().getRank()).show(getFragmentManager(), BADGE_DIALOG_TAG);
    }

    @Override // cm.aptoide.p092pt.app.view.AppViewView
    public C11234e<Boolean> similarAppsVisibilityFromInstallClick() {
        return this.similarAppsVisibilitySubject;
    }

    protected void showHideOptionsMenu(MenuItem menuItem, boolean z) {
        if (menuItem != null) {
            menuItem.setVisible(z);
        }
    }
}
