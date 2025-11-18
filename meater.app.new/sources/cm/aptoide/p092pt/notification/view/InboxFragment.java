package cm.aptoide.p092pt.notification.view;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.notification.AptoideNotification;
import cm.aptoide.p092pt.view.NotBottomNavigationView;
import cm.aptoide.p092pt.view.fragment.BaseToolbarFragment;
import java.util.Collections;
import java.util.List;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class InboxFragment extends BaseToolbarFragment implements InboxView, NotBottomNavigationView {
    private InboxAdapter adapter;
    private LinearLayout emptyState;
    private RecyclerView list;
    private C11418b<AptoideNotification> notificationSubject;

    @Override // cm.aptoide.p092pt.view.fragment.BaseToolbarFragment
    protected boolean displayHomeUpAsEnabled() {
        return true;
    }

    @Override // cm.aptoide.p092pt.view.fragment.UiComponent
    public int getContentViewId() {
        return C1146R.layout.fragment_inbox;
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.p092pt.notification.view.InboxView
    public C11234e<AptoideNotification> notificationSelection() {
        return this.notificationSubject;
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.notificationSubject = C11418b.m40637g1();
        this.adapter = new InboxAdapter(Collections.emptyList(), this.notificationSubject);
        setHasOptionsMenu(true);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().onBackPressed();
        return true;
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1146R.id.fragment_inbox_list);
        this.list = recyclerView;
        recyclerView.setAdapter(this.adapter);
        this.list.setLayoutManager(new LinearLayoutManager(getContext()));
        this.emptyState = (LinearLayout) view.findViewById(C1146R.id.empty_state);
        attachPresenter(new InboxPresenter(this, ((AptoideApplication) getContext().getApplicationContext()).getNotificationCenter(), CrashReport.getInstance(), ((AptoideApplication) getContext().getApplicationContext()).getNavigationTracker(), ((AptoideApplication) getContext().getApplicationContext()).getNotificationAnalytics(), C11250a.m40156b()));
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseToolbarFragment
    protected void setupToolbarDetails(Toolbar toolbar) {
        super.setupToolbarDetails(toolbar);
        toolbar.setTitle(getString(C1146R.string.myaccount_header_title));
    }

    @Override // cm.aptoide.p092pt.notification.view.InboxView
    public void showEmptyState() {
        this.emptyState.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.notification.view.InboxView
    public void showNotifications(List<AptoideNotification> list) {
        this.adapter.updateNotifications(list);
    }
}
