package cm.aptoide.p092pt.view.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.view.LifecycleSchim;
import cm.aptoide.p092pt.view.recycler.BaseAdapter;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseRecyclerViewFragment<T extends BaseAdapter> extends BaseLoaderToolbarFragment implements LifecycleSchim, DisplayableManager {
    private T adapter;
    private ArrayList<Displayable> displayables = new ArrayList<>();
    private RecyclerView.AbstractC0602o layoutManager;
    private RecyclerView recyclerView;

    public BaseRecyclerViewFragment addDisplayableWithAnimation(int i2, Displayable displayable) {
        this.adapter.addDisplayableWithAnimation(i2, displayable);
        this.displayables.add(i2, displayable);
        return this;
    }

    @Override // cm.aptoide.p092pt.view.fragment.DisplayableManager
    public /* bridge */ /* synthetic */ DisplayableManager addDisplayables(int i2, List list, boolean z) {
        return addDisplayables(i2, (List<? extends Displayable>) list, z);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void bindViews(View view) {
        super.bindViews(view);
        this.recyclerView = (RecyclerView) view.findViewById(C1146R.id.recycler_view);
    }

    public boolean contains(Displayable displayable) {
        ArrayList<Displayable> arrayList = this.displayables;
        return arrayList != null && arrayList.contains(displayable);
    }

    protected abstract T createAdapter();

    protected abstract RecyclerView.AbstractC0602o createLayoutManager();

    public T getAdapter() {
        return this.adapter;
    }

    public int getContentViewId() {
        return C1146R.layout.recycler_fragment;
    }

    @Override // cm.aptoide.p092pt.view.fragment.DisplayableManager
    public int getDisplayablesSize() {
        return this.displayables.size();
    }

    public RecyclerView.AbstractC0602o getLayoutManager() {
        return this.layoutManager;
    }

    public RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    @Override // cm.aptoide.p092pt.view.fragment.DisplayableManager
    public boolean hasDisplayables() {
        ArrayList<Displayable> arrayList = this.displayables;
        return arrayList != null && arrayList.size() > 0;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.LoadInterface
    public void load(boolean z, boolean z2, Bundle bundle) {
        if (z || z2) {
            clearDisplayables();
            return;
        }
        LinkedList linkedList = new LinkedList(this.displayables);
        this.displayables.clear();
        this.adapter.clearDisplayables();
        this.displayables.addAll(linkedList);
        this.adapter.addDisplayables(linkedList);
        finishLoading();
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        T t = this.adapter;
        if (t != null) {
            t.onDestroyView();
        }
        this.layoutManager = null;
        this.recyclerView.clearOnScrollListeners();
        this.recyclerView.setAdapter(null);
        this.recyclerView = null;
        this.adapter = null;
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        T t = this.adapter;
        if (t != null) {
            t.onPause();
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        T t = this.adapter;
        if (t != null) {
            t.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        T t = this.adapter;
        if (t != null) {
            t.onSaveInstanceState(bundle);
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (this.adapter == null) {
            this.adapter = (T) createAdapter();
        }
        super.onViewCreated(view, bundle);
        onViewCreated();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        T t = this.adapter;
        if (t != null) {
            t.onViewStateRestored(bundle);
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.DisplayableManager
    public void removeDisplayables(int i2, int i3) {
        Iterator<Displayable> it = this.displayables.iterator();
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0 || !it.hasNext()) {
                break;
            }
            i3--;
            it.next();
            i2 = i4;
        }
        while (true) {
            int i5 = i3 - 1;
            if (i3 < 0 || !it.hasNext()) {
                break;
            }
            it.next();
            it.remove();
            i3 = i5;
        }
        this.adapter.clearDisplayables();
        this.adapter.addDisplayables(this.displayables);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void setupViews() {
        super.setupViews();
        this.recyclerView.setAdapter(this.adapter);
        RecyclerView.AbstractC0602o abstractC0602oCreateLayoutManager = createLayoutManager();
        this.layoutManager = abstractC0602oCreateLayoutManager;
        this.recyclerView.setLayoutManager(abstractC0602oCreateLayoutManager);
        this.recyclerView.setSaveEnabled(true);
    }

    @Override // cm.aptoide.p092pt.view.fragment.DisplayableManager
    public /* bridge */ /* synthetic */ DisplayableManager addDisplayables(List list, boolean z) {
        return addDisplayables((List<? extends Displayable>) list, z);
    }

    @Override // cm.aptoide.p092pt.view.fragment.DisplayableManager
    public BaseRecyclerViewFragment clearDisplayables() {
        this.adapter.clearDisplayables();
        this.displayables.clear();
        return this;
    }

    @Deprecated
    public void addDisplayable(Displayable displayable) {
        addDisplayable(displayable, true);
    }

    @Deprecated
    public void addDisplayables(List<? extends Displayable> list) {
        addDisplayables(list, true);
    }

    @Override // cm.aptoide.p092pt.view.fragment.DisplayableManager
    public BaseRecyclerViewFragment addDisplayable(int i2, Displayable displayable, boolean z) {
        this.adapter.addDisplayable(i2, displayable);
        this.displayables.add(i2, displayable);
        if (z) {
            finishLoading();
        }
        return this;
    }

    @Override // cm.aptoide.p092pt.view.fragment.DisplayableManager
    public BaseRecyclerViewFragment addDisplayables(List<? extends Displayable> list, boolean z) {
        this.adapter.addDisplayables(list);
        this.displayables.addAll(list);
        if (z) {
            finishLoading();
        }
        return this;
    }

    public void onViewCreated() {
        T t = this.adapter;
        if (t != null) {
            t.onViewCreated();
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.DisplayableManager
    public BaseRecyclerViewFragment addDisplayable(Displayable displayable, boolean z) {
        this.adapter.addDisplayable(displayable);
        this.displayables.add(displayable);
        if (z) {
            finishLoading();
        }
        return this;
    }

    @Override // cm.aptoide.p092pt.view.fragment.DisplayableManager
    public BaseRecyclerViewFragment addDisplayables(int i2, List<? extends Displayable> list, boolean z) {
        this.adapter.addDisplayables(i2, list);
        this.displayables.addAll(i2, list);
        if (z) {
            finishLoading();
        }
        return this;
    }
}
