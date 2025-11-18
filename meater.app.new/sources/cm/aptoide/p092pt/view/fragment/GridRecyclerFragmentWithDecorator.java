package cm.aptoide.p092pt.view.fragment;

import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.ActivityC0468d;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.view.recycler.BaseAdapter;

/* loaded from: classes.dex */
public abstract class GridRecyclerFragmentWithDecorator<T extends BaseAdapter> extends AptoideBaseFragment<T> {
    protected RecyclerView.AbstractC0601n getItemDecoration() {
        return new RecyclerView.AbstractC0601n() { // from class: cm.aptoide.pt.view.fragment.GridRecyclerFragmentWithDecorator.1
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0601n
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0613z c0613z) {
                int iApplyDimension;
                int i2;
                int i3;
                int i4;
                int i5;
                ActivityC0468d activity = GridRecyclerFragmentWithDecorator.this.getActivity();
                int i6 = 0;
                if (activity != null) {
                    iApplyDimension = (int) TypedValue.applyDimension(1, 5.0f, activity.getResources().getDisplayMetrics());
                    i2 = iApplyDimension;
                    i3 = i2;
                    i4 = i3;
                    i5 = i4;
                } else {
                    iApplyDimension = 0;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                }
                if (view.getId() == C1146R.id.brick_app_item) {
                    i2 = iApplyDimension / 2;
                    i3 = i2;
                    i4 = i3;
                    i5 = i4;
                }
                if (view.getId() == C1146R.id.message_white_bg) {
                    i3 = iApplyDimension;
                    i5 = i3;
                } else {
                    i6 = i2;
                    iApplyDimension = i4;
                }
                rect.set(iApplyDimension, i6, i5, i3);
            }
        };
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void setupViews() {
        super.setupViews();
        RecyclerView.AbstractC0601n itemDecoration = getItemDecoration();
        if (itemDecoration != null) {
            getRecyclerView().addItemDecoration(itemDecoration);
        }
    }
}
