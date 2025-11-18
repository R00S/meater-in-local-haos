package cm.aptoide.p092pt.view.fragment;

import android.view.View;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.app.ActivityC0067d;
import androidx.appcompat.widget.Toolbar;
import cm.aptoide.p092pt.C1146R;

/* loaded from: classes.dex */
public abstract class BaseLoaderToolbarFragment extends BaseLoaderFragment {
    private Toolbar toolbar;

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void bindViews(View view) {
        super.bindViews(view);
        this.toolbar = (Toolbar) view.findViewById(C1146R.id.toolbar);
    }

    protected boolean displayHomeUpAsEnabled() {
        return false;
    }

    protected Toolbar getToolbar() {
        return this.toolbar;
    }

    protected boolean hasToolbar() {
        return this.toolbar != null;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.toolbar = null;
        super.onDestroyView();
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void setupToolbar() {
        if (hasToolbar()) {
            ((ActivityC0067d) getActivity()).setSupportActionBar(this.toolbar);
            boolean zDisplayHomeUpAsEnabled = displayHomeUpAsEnabled();
            AbstractC0064a supportActionBar = ((ActivityC0067d) getActivity()).getSupportActionBar();
            supportActionBar.mo227r(zDisplayHomeUpAsEnabled);
            supportActionBar.mo231v(this.toolbar.getTitle());
            setupToolbarDetails(this.toolbar);
        }
    }

    protected void setupToolbarDetails(Toolbar toolbar) {
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void setupViews() {
        setupToolbar();
    }
}
