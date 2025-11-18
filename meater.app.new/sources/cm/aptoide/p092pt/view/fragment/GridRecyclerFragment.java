package cm.aptoide.p092pt.view.fragment;

import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.view.recycler.BaseAdapter;
import cm.aptoide.p092pt.view.recycler.BaseGridLayoutManager;

/* loaded from: classes.dex */
public abstract class GridRecyclerFragment<T extends BaseAdapter> extends BaseRecyclerViewFragment<T> {
    private final Class<? extends BaseAdapter> adapterClass;

    public GridRecyclerFragment() {
        this.adapterClass = BaseAdapter.class;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment
    protected T createAdapter() {
        try {
            return (T) this.adapterClass.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
            CrashReport.getInstance().log(e2);
            return null;
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment
    protected RecyclerView.AbstractC0602o createLayoutManager() {
        return new BaseGridLayoutManager(getActivity(), getAdapter(), getContext().getResources(), (WindowManager) getContext().getSystemService("window"));
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderFragment
    protected int getViewToShowAfterLoadingId() {
        return C1146R.id.recycler_view;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderFragment
    protected int[] getViewsToShowAfterLoadingId() {
        return new int[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GridRecyclerFragment(Class<T> cls) {
        this.adapterClass = cls;
    }
}
