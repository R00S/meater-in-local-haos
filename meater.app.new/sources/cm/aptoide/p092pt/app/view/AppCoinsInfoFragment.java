package cm.aptoide.p092pt.app.view;

import android.animation.Animator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.app.ActivityC0067d;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0255a;
import androidx.core.widget.NestedScrollView;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import cm.aptoide.aptoideviews.video.YoutubePlayer;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.editorial.ScrollEvent;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.AppCoinsInfoPresenter;
import cm.aptoide.p092pt.view.BackButtonFragment;
import cm.aptoide.p092pt.view.NotBottomNavigationView;
import com.google.android.material.appbar.AppBarLayout;
import javax.inject.Inject;
import javax.inject.Named;
import p241e.p294g.p295a.p297b.p298a.p299a.C8960b;
import p241e.p294g.p295a.p297b.p300b.p301a.C8964b;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class AppCoinsInfoFragment extends BackButtonFragment implements AppCoinsInfoView, NotBottomNavigationView {
    private AppBarLayout appBarLayout;
    private View appCardView;
    private View appCardViewLayout;

    @Inject
    AppCoinsInfoPresenter appCoinsInfoPresenter;
    private TextView appcMessageAppCoinsSection1;
    private TextView appcMessageAppcoinsSection2a;
    private TextView appcMessageAppcoinsSection3;
    private View bottomAppCardView;
    private View bottomAppCardViewLayout;
    private Button bottomInstallButton;
    private Button catappultDevButton;
    private Button installButton;

    @Inject
    @Named
    float screenHeight;

    @Inject
    @Named
    float screenWidth;
    private NestedScrollView scrollView;
    private SocialMediaView socialMediaView;
    private Toolbar toolbar;
    private YoutubePlayer youtubePlayer;

    private void configureAppCardAnimation(final View view, final View view2, float f2, final int i2, final boolean z) {
        view.animate().scaleY(f2).scaleX(f2).alpha(0.0f).setDuration(i2).setListener(new Animator.AnimatorListener() { // from class: cm.aptoide.pt.app.view.AppCoinsInfoFragment.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (z) {
                    view.setVisibility(4);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                view2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(i2).setListener(new Animator.AnimatorListener() { // from class: cm.aptoide.pt.app.view.AppCoinsInfoFragment.2.1
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

    private String getAppCoinsLogoString() {
        return String.format("<img width='45px' height='45px' style='vertical-align: text-bottom; ' src=\"%1$s\" />", Integer.valueOf(C1146R.drawable.ic_aptoide_balance));
    }

    private Html.ImageGetter getImageGetter() {
        return new Html.ImageGetter() { // from class: cm.aptoide.pt.app.view.f
            @Override // android.text.Html.ImageGetter
            public final Drawable getDrawable(String str) {
                return this.f7765a.m7062f(str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$appItemVisibilityChanged$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m7061e(Object obj) {
        return Boolean.valueOf(isAppItemShown());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getImageGetter$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Drawable m7062f(String str) throws Resources.NotFoundException {
        Drawable drawable = null;
        try {
            drawable = getResources().getDrawable(Integer.parseInt(str));
            drawable.setBounds(0, 0, 45, 45);
            return drawable;
        } catch (Resources.NotFoundException e2) {
            Log.e("log_tag", "Image not found. Check the ID.", e2);
            return drawable;
        } catch (NumberFormatException e3) {
            Log.e("log_tag", "Source string not a valid resource ID.", e3);
            return drawable;
        }
    }

    static /* synthetic */ void lambda$onViewCreated$0(View view, AppBarLayout appBarLayout, int i2) {
        float fAbs = 1.0f - (Math.abs(i2) / appBarLayout.getTotalScrollRange());
        view.findViewById(C1146R.id.appc_header_text).setAlpha(fAbs);
        view.findViewById(C1146R.id.app_graphic_guy).setAlpha(fAbs);
    }

    public static AppCoinsInfoFragment newInstance() {
        Bundle bundle = new Bundle();
        AppCoinsInfoFragment appCoinsInfoFragment = new AppCoinsInfoFragment();
        appCoinsInfoFragment.setArguments(bundle);
        return appCoinsInfoFragment;
    }

    private void setTextWithImage() {
        String strReplaceFirst = getString(C1146R.string.appc_info_view_title_5_variable).replaceFirst("%s%", String.valueOf(25));
        int iLastIndexOf = strReplaceFirst.lastIndexOf("%s");
        if (iLastIndexOf != -1) {
            SpannableString spannableString = new SpannableString(strReplaceFirst);
            Drawable drawableM1677f = C0255a.m1677f(getActivity().getApplicationContext(), C1146R.drawable.ic_aptoide_balance);
            drawableM1677f.setBounds(0, 0, 45, 45);
            spannableString.setSpan(new ImageSpan(drawableM1677f, 1), iLastIndexOf, iLastIndexOf + 2, 33);
            this.appcMessageAppcoinsSection3.setText(spannableString);
        }
    }

    private void setupBottomAppBar() {
        this.bottomAppCardView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: cm.aptoide.pt.app.view.AppCoinsInfoFragment.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (!AppCoinsInfoFragment.this.isAppItemShown()) {
                    AppCoinsInfoFragment.this.addBottomCardAnimation();
                }
                AppCoinsInfoFragment.this.bottomAppCardView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    private void setupTextView(String str, TextView textView, Object... objArr) {
        textView.setText(Html.fromHtml(String.format(str, objArr), getImageGetter(), null));
    }

    private void setupToolbar() {
        this.toolbar.setTitle(C1146R.string.appc_title_about_appcoins);
        this.toolbar.setTitleTextColor(-1);
        this.toolbar.setSubtitleTextColor(-1);
        ActivityC0067d activityC0067d = (ActivityC0067d) getActivity();
        activityC0067d.setSupportActionBar(this.toolbar);
        AbstractC0064a supportActionBar = activityC0067d.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo227r(true);
        }
    }

    @Override // cm.aptoide.p092pt.app.view.AppCoinsInfoView
    public void addBottomCardAnimation() {
        configureAppCardAnimation(this.appCardViewLayout, this.bottomAppCardViewLayout, 0.1f, 300, false);
    }

    @Override // cm.aptoide.p092pt.app.view.AppCoinsInfoView
    public C11234e<Void> appCoinsWalletLinkClick() {
        return C8975a.m28573a(this.appcMessageAppcoinsSection2a);
    }

    @Override // cm.aptoide.p092pt.app.view.AppCoinsInfoView
    public C11234e<ScrollEvent> appItemVisibilityChanged() {
        return C11234e.m40043f0(C8964b.m28560a(this.scrollView), C8960b.m28556a(this.appBarLayout)).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7783f.m7061e(obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return new ScrollEvent((Boolean) obj);
            }
        }).m40113u(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.dg
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((ScrollEvent) obj).getItemShown();
            }
        });
    }

    @Override // cm.aptoide.p092pt.app.view.AppCoinsInfoView
    public C11234e<Void> cardViewClick() {
        return C8975a.m28573a(this.appCardView);
    }

    @Override // cm.aptoide.p092pt.app.view.AppCoinsInfoView
    public C11234e<Void> catappultButtonClick() {
        return C8975a.m28573a(this.catappultDevButton);
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.p092pt.app.view.AppCoinsInfoView
    public C11234e<Void> installButtonClick() {
        return C11234e.m40033a0(C8975a.m28573a(this.installButton), C8975a.m28573a(this.bottomInstallButton));
    }

    public boolean isAppItemShown() {
        Rect rect = new Rect();
        this.appCardView.getLocalVisibleRect(rect);
        return rect.intersect(new Rect(0, 0, (int) this.screenWidth, ((int) this.screenHeight) - (this.appCardView.getHeight() * 2)));
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1146R.layout.fragment_appcoins_info, viewGroup, false);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.toolbar = null;
        this.appCardView = null;
        this.installButton = null;
        this.bottomInstallButton = null;
        this.catappultDevButton = null;
        this.appcMessageAppCoinsSection1 = null;
        this.appcMessageAppcoinsSection2a = null;
        this.appcMessageAppcoinsSection3 = null;
        this.youtubePlayer = null;
        this.scrollView = null;
        this.socialMediaView = null;
        super.onDestroyView();
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.toolbar = (Toolbar) view.findViewById(C1146R.id.toolbar);
        this.catappultDevButton = (Button) view.findViewById(C1146R.id.catappult_dev_button);
        this.scrollView = (NestedScrollView) view.findViewById(C1146R.id.about_appcoins_scroll);
        this.appcMessageAppcoinsSection2a = (TextView) view.findViewById(C1146R.id.appc_message_appcoins_section_2a);
        this.appcMessageAppcoinsSection3 = (TextView) view.findViewById(C1146R.id.appc_message_appcoins_section_3);
        this.youtubePlayer = (YoutubePlayer) view.findViewById(C1146R.id.youtube_player);
        this.appcMessageAppCoinsSection1 = (TextView) view.findViewById(C1146R.id.appc_message_appcoins_section_1);
        View viewFindViewById = view.findViewById(C1146R.id.app_card_layout);
        this.appCardViewLayout = viewFindViewById;
        this.appCardView = viewFindViewById.findViewById(C1146R.id.app_cardview);
        this.installButton = (Button) this.appCardViewLayout.findViewById(C1146R.id.appview_install_button);
        ((TextView) this.appCardView.findViewById(C1146R.id.app_title_textview)).setText(getString(C1146R.string.appc_title_settings_appcoins_wallet));
        ((ImageView) this.appCardView.findViewById(C1146R.id.app_icon_imageview)).setImageDrawable(C0255a.m1677f(getContext(), C1146R.drawable.appcoins_wallet_icon));
        View viewFindViewById2 = view.findViewById(C1146R.id.app_cardview_layout);
        this.bottomAppCardViewLayout = viewFindViewById2;
        this.bottomAppCardView = viewFindViewById2.findViewById(C1146R.id.app_cardview);
        this.bottomInstallButton = (Button) this.bottomAppCardViewLayout.findViewById(C1146R.id.appview_install_button);
        ((TextView) this.bottomAppCardView.findViewById(C1146R.id.app_title_textview)).setText(getString(C1146R.string.appc_title_settings_appcoins_wallet));
        ((ImageView) this.bottomAppCardView.findViewById(C1146R.id.app_icon_imageview)).setImageDrawable(C0255a.m1677f(getContext(), C1146R.drawable.appcoins_wallet_icon));
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(C1146R.id.app_bar_layout);
        this.appBarLayout = appBarLayout;
        appBarLayout.m23708b(new AppBarLayout.InterfaceC7928e() { // from class: cm.aptoide.pt.app.view.e
            @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC7926c
            public final void onOffsetChanged(AppBarLayout appBarLayout2, int i2) {
                AppCoinsInfoFragment.lambda$onViewCreated$0(view, appBarLayout2, i2);
            }
        });
        this.socialMediaView = (SocialMediaView) view.findViewById(C1146R.id.social_media_view);
        setHasOptionsMenu(true);
        setupToolbar();
        setupBottomAppBar();
        this.youtubePlayer.loadVideo("y8YEczs9DJ0", false);
        attachPresenter(this.appCoinsInfoPresenter);
    }

    @Override // cm.aptoide.p092pt.app.view.AppCoinsInfoView
    public void openApp(String str) {
        AptoideUtils.SystemU.openApp(str, getContext().getPackageManager(), getContext());
    }

    @Override // cm.aptoide.p092pt.app.view.AppCoinsInfoView
    public void removeBottomCardAnimation() {
        configureAppCardAnimation(this.bottomAppCardViewLayout, this.appCardViewLayout, 0.0f, 300, true);
    }

    @Override // cm.aptoide.p092pt.app.view.AppCoinsInfoView
    public void setBonusAppc(int i2) {
        this.appcMessageAppCoinsSection1.setText(String.format(getString(C1146R.string.appc_info_view_body_1_variable), Integer.valueOf(i2)));
        setTextWithImage();
    }

    @Override // cm.aptoide.p092pt.app.view.AppCoinsInfoView
    public void setButtonText(boolean z) throws Resources.NotFoundException {
        String string = getResources().getString(C1146R.string.appview_button_install);
        if (z) {
            this.installButton.setText(getResources().getString(C1146R.string.appview_button_open));
            this.bottomInstallButton.setText(getResources().getString(C1146R.string.appview_button_open));
        } else {
            this.installButton.setText(string);
            this.bottomInstallButton.setText(string);
        }
    }

    @Override // cm.aptoide.p092pt.app.view.AppCoinsInfoView
    public void setNoBonusAppcView() {
        this.appcMessageAppCoinsSection1.setText(getString(C1146R.string.appc_info_view_body_1_variable_no_data));
        setupTextView(getString(C1146R.string.appc_info_view_title_5_variable_no_data), this.appcMessageAppcoinsSection3, getAppCoinsLogoString());
    }

    @Override // cm.aptoide.p092pt.app.view.AppCoinsInfoView
    public C11234e<SocialMediaView.SocialMediaType> socialMediaClick() {
        return this.socialMediaView.onSocialMediaClick();
    }
}
