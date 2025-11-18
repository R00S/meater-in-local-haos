package cm.aptoide.p092pt.bottomNavigation;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.content.C0255a;
import androidx.fragment.app.Fragment;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.account.view.LoginBottomSheetActivity;
import cm.aptoide.p092pt.home.AptoideBottomNavigator;
import cm.aptoide.p092pt.view.DarkBottomNavigationView;
import cm.aptoide.p092pt.view.NotBottomNavigationView;
import cm.aptoide.p092pt.view.ThemedActivityView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import javax.inject.Inject;
import p456rx.C11234e;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public abstract class BottomNavigationActivity extends LoginBottomSheetActivity implements AptoideBottomNavigator {
    protected static final int LAYOUT = 2131493047;
    private final String ITEMS_LIST_KEY = "BN_ITEMS";
    private Animation animationdown;
    private Animation animationup;

    @Inject
    BottomNavigationMapper bottomNavigationMapper;

    @Inject
    BottomNavigationNavigator bottomNavigationNavigator;
    protected BottomNavigationView bottomNavigationView;
    private Boolean isThemeEnforced;
    private C11418b<Integer> navigationSubject;

    @SuppressLint({"ResourceType"})
    private void forceDarkTheme() {
        if (this.isThemeEnforced.booleanValue()) {
            return;
        }
        this.bottomNavigationView.animate().alpha(0.0f).setDuration(200L).withEndAction(new Runnable() { // from class: cm.aptoide.pt.bottomNavigation.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f8245f.m7342c();
            }
        });
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getActivity().getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(C0255a.m1675d(getBaseContext(), C1146R.color.grey_900));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$forceDarkTheme$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7342c() {
        this.bottomNavigationView.setBackgroundColor(getResources().getColor(C1146R.color.grey_900));
        this.bottomNavigationView.setItemIconTintList(C0255a.m1676e(this, C1146R.drawable.default_nav_item_color_state_dark));
        this.bottomNavigationView.setItemTextColor(C0255a.m1676e(this, C1146R.drawable.default_nav_item_color_state_dark));
        this.isThemeEnforced = Boolean.TRUE;
        this.bottomNavigationView.animate().alpha(1.0f).setDuration(200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreate$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ boolean m7343d(MenuItem menuItem) {
        this.navigationSubject.onNext(Integer.valueOf(menuItem.getItemId()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setDefaultTheme$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7344e() {
        this.bottomNavigationView.setItemIconTintList(C0255a.m1676e(this, C1146R.drawable.default_nav_item_color_state));
        this.bottomNavigationView.setItemTextColor(C0255a.m1676e(this, C1146R.drawable.default_nav_item_color_state));
        this.bottomNavigationView.setBackgroundColor(0);
        this.isThemeEnforced = Boolean.FALSE;
        this.bottomNavigationView.animate().alpha(1.0f).setDuration(200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$toggleBottomNavigation$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ boolean m7345f(MenuItem menuItem) {
        this.navigationSubject.onNext(Integer.valueOf(menuItem.getItemId()));
        return true;
    }

    @SuppressLint({"ResourceType"})
    private void setDefaultTheme() {
        this.bottomNavigationView.animate().alpha(0.0f).setDuration(200L).withEndAction(new Runnable() { // from class: cm.aptoide.pt.bottomNavigation.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f8246f.m7344e();
            }
        });
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getActivity().getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(C0255a.m1675d(getBaseContext(), C1146R.color.status_bar_color));
        }
    }

    @Override // cm.aptoide.p092pt.home.AptoideBottomNavigator
    public void hideBottomNavigation() {
        if (this.bottomNavigationView.getVisibility() != 8) {
            this.bottomNavigationView.setVisibility(8);
        }
    }

    @Override // cm.aptoide.p092pt.home.AptoideBottomNavigator
    public C11234e<Integer> navigationEvent() {
        return this.navigationSubject;
    }

    @Override // cm.aptoide.p092pt.view.BackButtonActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getFragmentNavigator().peekLast() == null && this.bottomNavigationNavigator.canNavigateBack()) {
            this.bottomNavigationNavigator.navigateBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // cm.aptoide.p092pt.account.view.LoginBottomSheetActivity, cm.aptoide.p092pt.view.BackButtonActivity, cm.aptoide.p092pt.view.ThemedActivityView, cm.aptoide.p092pt.analytics.view.AnalyticsActivity, cm.aptoide.p092pt.permission.PermissionProviderActivity, cm.aptoide.p092pt.permission.PermissionServiceActivity, cm.aptoide.p092pt.navigator.ActivityResultNavigator, cm.aptoide.p092pt.view.BaseActivity, com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1146R.layout.frame_layout);
        this.navigationSubject = C11418b.m40637g1();
        this.bottomNavigationView = (BottomNavigationView) findViewById(C1146R.id.bottom_navigation);
        getActivityComponent().inject(this);
        if (bundle != null) {
            this.bottomNavigationNavigator.setBottomNavigationItems(bundle.getIntegerArrayList("BN_ITEMS"));
        }
        this.bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.InterfaceC7959d() { // from class: cm.aptoide.pt.bottomNavigation.d
            @Override // com.google.android.material.bottomnavigation.BottomNavigationView.InterfaceC7959d
            /* renamed from: a */
            public final boolean mo7346a(MenuItem menuItem) {
                return this.f8248a.m7343d(menuItem);
            }
        });
        this.animationup = AnimationUtils.loadAnimation(this, C1146R.anim.slide_up);
        this.animationdown = AnimationUtils.loadAnimation(this, C1146R.anim.slide_down);
        this.isThemeEnforced = Boolean.FALSE;
        toggleBottomNavigation();
    }

    @Override // cm.aptoide.p092pt.view.BaseActivity, com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onDestroy() {
        this.bottomNavigationMapper = null;
        this.bottomNavigationNavigator = null;
        this.navigationSubject = null;
        this.bottomNavigationView = null;
        this.animationdown = null;
        this.animationup = null;
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.ActivityC0067d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putIntegerArrayList("BN_ITEMS", this.bottomNavigationNavigator.getBottomNavigationItems());
    }

    @Override // cm.aptoide.p092pt.home.AptoideBottomNavigator
    public void requestFocus(BottomNavigationItem bottomNavigationItem) {
        this.bottomNavigationView.getMenu().getItem(this.bottomNavigationMapper.mapToBottomNavigationPosition(bottomNavigationItem)).setChecked(true);
    }

    @Override // cm.aptoide.p092pt.home.AptoideBottomNavigator
    public void showFragment(Integer num) {
        this.bottomNavigationNavigator.navigateToBottomNavigationItem(this.bottomNavigationMapper.mapToBottomNavigationPosition(num));
    }

    @Override // cm.aptoide.p092pt.home.AptoideBottomNavigator
    public void toggleBottomNavigation() {
        Fragment fragment = getFragmentNavigator().getFragment();
        if (fragment instanceof NotBottomNavigationView) {
            if (this.bottomNavigationView.getVisibility() != 8) {
                this.bottomNavigationView.startAnimation(this.animationdown);
                this.bottomNavigationView.setVisibility(8);
                return;
            }
            return;
        }
        if ((fragment instanceof DarkBottomNavigationView) && !((ThemedActivityView) this).themeManager.isThemeDark()) {
            forceDarkTheme();
            return;
        }
        if (this.isThemeEnforced.booleanValue() && !((ThemedActivityView) this).themeManager.isThemeDark()) {
            setDefaultTheme();
        }
        if (this.bottomNavigationView.getVisibility() != 0) {
            this.bottomNavigationView.startAnimation(this.animationup);
            this.bottomNavigationView.setVisibility(0);
        }
        getActivityComponent().inject(this);
        this.bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.InterfaceC7959d() { // from class: cm.aptoide.pt.bottomNavigation.c
            @Override // com.google.android.material.bottomnavigation.BottomNavigationView.InterfaceC7959d
            /* renamed from: a */
            public final boolean mo7346a(MenuItem menuItem) {
                return this.f8247a.m7345f(menuItem);
            }
        });
    }
}
