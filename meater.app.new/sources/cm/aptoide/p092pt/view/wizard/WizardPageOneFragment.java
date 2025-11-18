package cm.aptoide.p092pt.view.wizard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.view.BackButton;
import cm.aptoide.p092pt.view.BackButtonFragment;

/* loaded from: classes.dex */
public class WizardPageOneFragment extends BackButtonFragment {
    private BackButton.ClickHandler clickHandler;

    static /* synthetic */ boolean lambda$onViewCreated$0() {
        return false;
    }

    public static Fragment newInstance() {
        return new WizardPageOneFragment();
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1146R.layout.fragment_wizard_model_page, viewGroup, false);
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        unregisterClickHandler(this.clickHandler);
        super.onDestroyView();
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C5049d c5049d = new BackButton.ClickHandler() { // from class: cm.aptoide.pt.view.wizard.d
            @Override // cm.aptoide.pt.view.BackButton.ClickHandler
            public final boolean handle() {
                return WizardPageOneFragment.lambda$onViewCreated$0();
            }
        };
        this.clickHandler = c5049d;
        registerClickHandler(c5049d);
    }
}
