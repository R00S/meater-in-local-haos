package cm.aptoide.p092pt.updates.view.excluded;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.database.room.RoomUpdate;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.updates.UpdatePersistence;
import cm.aptoide.p092pt.utils.design.ShowMessage;
import cm.aptoide.p092pt.view.NotBottomNavigationView;
import cm.aptoide.p092pt.view.fragment.AptoideBaseFragment;
import cm.aptoide.p092pt.view.recycler.BaseAdapter;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import com.trello.rxlifecycle.p234g.EnumC8762b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class ExcludedUpdatesFragment extends AptoideBaseFragment<BaseAdapter> implements NotBottomNavigationView {
    private static final String TAG = ExcludedUpdatesFragment.class.getSimpleName();
    private TextView emptyData;

    @Inject
    UpdatePersistence updatesPersistence;

    private void fetchExcludedUpdates() {
        this.updatesPersistence.getAllSorted(true).m40095j0(C11250a.m40156b()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.updates.view.excluded.g
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11562f.m8876e((List) obj);
            }
        }).m40091f(bindUntilEvent(EnumC8762b.DESTROY_VIEW)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.updates.view.excluded.f
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ExcludedUpdatesFragment.lambda$fetchExcludedUpdates$1((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.updates.view.excluded.d
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11559f.m8877f((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$fetchExcludedUpdates$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8876e(List list) {
        if (list == null || list.isEmpty()) {
            this.emptyData.setText(C1146R.string.no_excluded_updates_msg);
            this.emptyData.setVisibility(0);
            clearDisplayables();
            finishLoading();
            return;
        }
        this.emptyData.setVisibility(8);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ExcludedUpdateDisplayable((RoomUpdate) it.next()));
        }
        clearDisplayables().addDisplayables((List<? extends Displayable>) arrayList, true);
    }

    static /* synthetic */ void lambda$fetchExcludedUpdates$1(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$fetchExcludedUpdates$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8877f(Throwable th) {
        CrashReport.getInstance().log(th);
        this.emptyData.setText(C1146R.string.no_excluded_updates_msg);
        this.emptyData.setVisibility(0);
        clearDisplayables();
        finishLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onOptionsItemSelected$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8878g(List list) {
        return this.updatesPersistence.saveAll(list);
    }

    static /* synthetic */ void lambda$onOptionsItemSelected$5(List list) {
    }

    public static ExcludedUpdatesFragment newInstance() {
        return new ExcludedUpdatesFragment();
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void bindViews(View view) {
        super.bindViews(view);
        this.emptyData = (TextView) view.findViewById(C1146R.id.empty_data);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment
    protected boolean displayHomeUpAsEnabled() {
        return true;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public int getContentViewId() {
        return C1146R.layout.fragment_with_toolbar_no_theme;
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.LoadInterface
    public void load(boolean z, boolean z2, Bundle bundle) {
        super.load(z, z2, bundle);
        Logger logger = Logger.getInstance();
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("refresh excluded updates? ");
        sb.append(z ? "yes" : "no");
        logger.m8273d(str, sb.toString());
        fetchExcludedUpdates();
    }

    @Override // cm.aptoide.p092pt.view.fragment.AptoideBaseFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        setHasOptionsMenu(true);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1146R.menu.menu_excluded_updates_fragment, menu);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [cm.aptoide.pt.view.recycler.BaseAdapter] */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.recyclerview.widget.RecyclerView$g, cm.aptoide.pt.view.recycler.BaseAdapter] */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.recyclerview.widget.RecyclerView$g, cm.aptoide.pt.view.recycler.BaseAdapter] */
    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            getActivity().onBackPressed();
            return true;
        }
        int i2 = 0;
        if (itemId == C1146R.id.menu_restore_updates) {
            LinkedList linkedList = new LinkedList();
            ?? adapter = getAdapter();
            while (i2 < adapter.getItemCount()) {
                ExcludedUpdateDisplayable excludedUpdateDisplayable = (ExcludedUpdateDisplayable) adapter.getDisplayable(i2);
                if (excludedUpdateDisplayable.isSelected()) {
                    linkedList.add(excludedUpdateDisplayable.getPojo());
                }
                i2++;
            }
            if (linkedList.size() == 0) {
                ShowMessage.asSnack(this.emptyData, C1146R.string.no_excluded_updates_selected);
                return true;
            }
            C11234e.m40020N(linkedList).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.updates.view.excluded.c
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    ((RoomUpdate) obj).setExcluded(false);
                }
            }).m40084Y0().m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.updates.view.excluded.h
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return this.f11563f.m8878g((List) obj);
                }
            }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.updates.view.excluded.b
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    ExcludedUpdatesFragment.lambda$onOptionsItemSelected$5((List) obj);
                }
            }, new InterfaceC11253b() { // from class: cm.aptoide.pt.updates.view.excluded.e
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    CrashReport.getInstance().log((Throwable) obj);
                }
            });
            return true;
        }
        if (itemId == C1146R.id.menu_select_all) {
            ?? adapter2 = getAdapter();
            while (i2 < adapter2.getItemCount()) {
                ((ExcludedUpdateDisplayable) adapter2.getDisplayable(i2)).setSelected(true);
                adapter2.notifyDataSetChanged();
                i2++;
            }
            return true;
        }
        if (itemId != C1146R.id.menu_select_none) {
            return super.onOptionsItemSelected(menuItem);
        }
        ?? adapter3 = getAdapter();
        for (int i3 = 0; i3 < adapter3.getItemCount(); i3++) {
            ((ExcludedUpdateDisplayable) adapter3.getDisplayable(i3)).setSelected(false);
            adapter3.notifyDataSetChanged();
        }
        return true;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment
    public void setupToolbarDetails(Toolbar toolbar) {
        toolbar.setTitle(C1146R.string.excluded_updates);
    }
}
