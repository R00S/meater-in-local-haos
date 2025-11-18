package cm.aptoide.p092pt.view.fragment;

import android.os.Bundle;
import android.view.View;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.PageViewsAnalytics;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.AptoideApplication;

/* loaded from: classes.dex */
public abstract class NavigationTrackFragment extends FragmentView {
    public static final String SHOULD_REGISTER_VIEW = "should_register_view";
    private AnalyticsManager analyticsManager;
    protected NavigationTracker navigationTracker;
    protected PageViewsAnalytics pageViewsAnalytics;
    protected boolean shouldRegister = true;

    private void getFragmentExtras() {
        if (getArguments() == null || !getArguments().containsKey(SHOULD_REGISTER_VIEW)) {
            return;
        }
        this.shouldRegister = getArguments().getBoolean(SHOULD_REGISTER_VIEW);
    }

    public ScreenTagHistory getHistoryTracker() {
        return null;
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.navigationTracker == null) {
            this.navigationTracker = ((AptoideApplication) getContext().getApplicationContext()).getNavigationTracker();
        }
        if (this.analyticsManager == null) {
            this.analyticsManager = ((AptoideApplication) getContext().getApplicationContext()).getAnalyticsManager();
        }
        this.pageViewsAnalytics = new PageViewsAnalytics(this.analyticsManager);
        getFragmentExtras();
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ScreenTagHistory historyTracker = getHistoryTracker();
        if (this.shouldRegister) {
            if (historyTracker != null) {
                this.navigationTracker.registerScreen(historyTracker);
                return;
            }
            throw new RuntimeException("If " + getClass().getSimpleName() + " should be logged to screen history, it has to return a value on method NavigationTrackFragment#getHistoryTracker");
        }
    }

    @Override // cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    protected void setRegisterFragment(boolean z) {
        this.shouldRegister = z;
    }
}
