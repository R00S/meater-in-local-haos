package cm.aptoide.p092pt.view.fragment;

import android.content.res.Resources;
import android.view.View;
import androidx.viewpager.widget.AbstractC0694a;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.view.custom.AptoideViewPager;

/* loaded from: classes.dex */
public abstract class BasePagerToolbarFragment extends BaseLoaderToolbarFragment {
    protected AptoideViewPager viewPager;

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void bindViews(View view) {
        super.bindViews(view);
        this.viewPager = (AptoideViewPager) view.findViewById(C1146R.id.pager);
    }

    protected abstract AbstractC0694a createPagerAdapter();

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.viewPager.clearOnPageChangeListeners();
        this.viewPager = null;
        super.onDestroyView();
    }

    protected void setupViewPager() throws Resources.NotFoundException {
        this.viewPager.setAdapter(createPagerAdapter());
    }
}
