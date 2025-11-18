package cm.aptoide.p092pt.home;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationActivity;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationItem;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.promotions.PromotionsHomeDialog;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.fragment.NavigationTrackFragment;
import com.google.android.material.appbar.AppBarLayout;
import javax.inject.Inject;
import okhttp3.HttpUrl;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class HomeContainerFragment extends NavigationTrackFragment implements HomeContainerView {
    private static final BottomNavigationItem BOTTOM_NAVIGATION_ITEM = BottomNavigationItem.HOME;
    private AppBarLayout appBarLayout;
    private CheckBox appsChip;
    private BottomNavigationActivity bottomNavigationActivity;
    private C11418b<ChipsEvents> chipCheckedEvent;
    private CheckBox gamesChip;
    private LoggedInTermsAndConditionsDialog gdprDialog;

    @Inject
    HomeContainerPresenter presenter;
    private PromotionsHomeDialog promotionsHomeDialog;
    private ImageView promotionsIcon;
    private TextView promotionsTicker;

    @Inject
    ThemeManager themeManager;
    private ImageView userAvatar;

    public enum ChipsEvents {
        GAMES,
        APPS,
        HOME
    }

    private void hideChipCancelButton(CheckBox checkBox) {
        if (Build.VERSION.SDK_INT >= 17) {
            checkBox.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            checkBox.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$appsChipClicked$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m7823e(Void r1) {
        return Boolean.valueOf(this.appsChip.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$appsChipClicked$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7824f(Boolean bool) {
        if (this.gamesChip.isChecked()) {
            this.gamesChip.setChecked(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$gamesChipClicked$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m7825g(Void r1) {
        return Boolean.valueOf(this.gamesChip.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$gamesChipClicked$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7826h(Boolean bool) {
        if (this.appsChip.isChecked()) {
            this.appsChip.setChecked(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupChipsListeners$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7827i(CompoundButton compoundButton, boolean z) throws Resources.NotFoundException {
        if (z) {
            showChipCancelButton(this.gamesChip);
        } else {
            hideChipCancelButton(this.gamesChip);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupChipsListeners$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7828j(CompoundButton compoundButton, boolean z) throws Resources.NotFoundException {
        if (z) {
            showChipCancelButton(this.appsChip);
        } else {
            hideChipCancelButton(this.appsChip);
        }
    }

    private void setupChipsListeners() {
        this.gamesChip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cm.aptoide.pt.home.o
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) throws Resources.NotFoundException {
                this.f9926a.m7827i(compoundButton, z);
            }
        });
        this.appsChip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cm.aptoide.pt.home.p
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) throws Resources.NotFoundException {
                this.f9937a.m7828j(compoundButton, z);
            }
        });
    }

    private void showChipCancelButton(CheckBox checkBox) throws Resources.NotFoundException {
        Drawable drawable = getResources().getDrawable(this.themeManager.getAttributeForTheme(C1146R.attr.cancelChipDrawable).resourceId);
        if (Build.VERSION.SDK_INT >= 17) {
            checkBox.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else {
            checkBox.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    @Override // cm.aptoide.p092pt.home.HomeContainerView
    public C11234e<Boolean> appsChipClicked() {
        return C8975a.m28573a(this.appsChip).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.s
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9971f.m7823e((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.r
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9960f.m7824f((Boolean) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.home.HomeContainerView
    public void dismissPromotionsDialog() {
        this.promotionsHomeDialog.dismissDialog();
    }

    @Override // cm.aptoide.p092pt.home.HomeContainerView
    public void expandChips() {
        this.appBarLayout.m23720r(true, true);
    }

    @Override // cm.aptoide.p092pt.home.HomeContainerView
    public C11234e<Boolean> gamesChipClicked() {
        return C8975a.m28573a(this.gamesChip).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.q
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9948f.m7825g((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.n
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9915f.m7826h((Boolean) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.home.HomeContainerView
    public C11234e<String> gdprDialogClicked() {
        return this.gdprDialog.dialogClicked();
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName(), HttpUrl.FRAGMENT_ENCODE_SET, StoreContext.home.name());
    }

    @Override // cm.aptoide.p092pt.home.HomeContainerView
    public void hidePromotionsIcon() {
        this.promotionsIcon.setVisibility(8);
        this.promotionsTicker.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.home.HomeContainerView
    public C11234e<ChipsEvents> isChipChecked() {
        return this.chipCheckedEvent;
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof BottomNavigationActivity) {
            this.bottomNavigationActivity = (BottomNavigationActivity) activity;
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.chipCheckedEvent = C11418b.m40637g1();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1146R.layout.fragment_home_container, viewGroup, false);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        PromotionsHomeDialog promotionsHomeDialog = this.promotionsHomeDialog;
        if (promotionsHomeDialog != null) {
            promotionsHomeDialog.destroyDialog();
            this.promotionsHomeDialog = null;
        }
        LoggedInTermsAndConditionsDialog loggedInTermsAndConditionsDialog = this.gdprDialog;
        if (loggedInTermsAndConditionsDialog != null) {
            loggedInTermsAndConditionsDialog.destroyDialog();
            this.gdprDialog = null;
        }
        this.promotionsIcon = null;
        this.promotionsTicker = null;
        this.userAvatar = null;
        this.gamesChip = null;
        this.appsChip = null;
    }

    @Override // cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDetach() {
        this.bottomNavigationActivity = null;
        super.onDetach();
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ChipsEvents chipsEvents = ChipsEvents.HOME;
        if (this.gamesChip.isChecked()) {
            chipsEvents = ChipsEvents.GAMES;
        } else if (this.appsChip.isChecked()) {
            chipsEvents = ChipsEvents.APPS;
        }
        this.chipCheckedEvent.onNext(chipsEvents);
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.userAvatar = (ImageView) view.findViewById(C1146R.id.user_actionbar_icon);
        this.promotionsIcon = (ImageView) view.findViewById(C1146R.id.promotions_icon);
        this.promotionsTicker = (TextView) view.findViewById(C1146R.id.promotions_ticker);
        this.promotionsHomeDialog = new PromotionsHomeDialog(getContext());
        this.gdprDialog = new LoggedInTermsAndConditionsDialog(getContext());
        BottomNavigationActivity bottomNavigationActivity = this.bottomNavigationActivity;
        if (bottomNavigationActivity != null) {
            bottomNavigationActivity.requestFocus(BOTTOM_NAVIGATION_ITEM);
        }
        this.gamesChip = (CheckBox) view.findViewById(C1146R.id.games_chip);
        this.appsChip = (CheckBox) view.findViewById(C1146R.id.apps_chip);
        this.appBarLayout = (AppBarLayout) view.findViewById(C1146R.id.app_bar_layout);
        setupChipsListeners();
        attachPresenter(this.presenter);
    }

    @Override // cm.aptoide.p092pt.home.HomeContainerView
    public C11234e<String> promotionsHomeDialogClicked() {
        return this.promotionsHomeDialog.dialogClicked();
    }

    @Override // cm.aptoide.p092pt.home.HomeContainerView
    public void setDefaultUserImage() {
        ImageLoader.with(getContext()).loadUsingCircleTransform(C1146R.drawable.ic_account_circle, this.userAvatar);
    }

    @Override // cm.aptoide.p092pt.home.HomeContainerView
    public void setUserImage(String str) {
        ImageLoader.with(getContext()).loadWithShadowCircleTransformWithPlaceholder(str, this.userAvatar, C1146R.drawable.ic_account_circle);
    }

    @Override // cm.aptoide.p092pt.home.HomeContainerView
    public void showAvatar() {
        this.userAvatar.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.home.HomeContainerView
    public void showPromotionsHomeDialog(HomePromotionsWrapper homePromotionsWrapper) {
        this.promotionsHomeDialog.showDialog(homePromotionsWrapper);
    }

    @Override // cm.aptoide.p092pt.home.HomeContainerView
    public void showPromotionsHomeIcon(HomePromotionsWrapper homePromotionsWrapper) {
        this.promotionsIcon.setVisibility(0);
        if (homePromotionsWrapper.getPromotions() > 0) {
            if (homePromotionsWrapper.getPromotions() >= 10 || homePromotionsWrapper.getTotalUnclaimedAppcValue() <= 0.0f) {
                this.promotionsTicker.setText("9+");
            } else {
                this.promotionsTicker.setText(Integer.toString(homePromotionsWrapper.getPromotions()));
            }
            this.promotionsTicker.setVisibility(0);
        }
    }

    @Override // cm.aptoide.p092pt.home.HomeContainerView
    public void showTermsAndConditionsDialog() {
        this.gdprDialog.showDialog();
    }

    @Override // cm.aptoide.p092pt.home.HomeContainerView
    public C11234e<Void> toolbarPromotionsClick() {
        return C8975a.m28573a(this.promotionsIcon);
    }

    @Override // cm.aptoide.p092pt.home.HomeContainerView
    public C11234e<Void> toolbarUserClick() {
        return C8975a.m28573a(this.userAvatar);
    }

    @Override // cm.aptoide.p092pt.home.HomeContainerView
    public void uncheckChips() {
        this.gamesChip.setChecked(false);
        this.appsChip.setChecked(false);
    }
}
