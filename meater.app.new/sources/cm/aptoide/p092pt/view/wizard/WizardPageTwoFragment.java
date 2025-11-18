package cm.aptoide.p092pt.view.wizard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.util.MarketResourceFormatter;
import cm.aptoide.p092pt.view.BackButton;
import cm.aptoide.p092pt.view.BackButtonFragment;
import javax.inject.Inject;

/* loaded from: classes.dex */
public class WizardPageTwoFragment extends BackButtonFragment {
    private BackButton.ClickHandler clickHandler;

    @Inject
    MarketResourceFormatter marketResourceFormatter;

    static /* synthetic */ boolean lambda$onViewCreated$0() {
        return false;
    }

    public static Fragment newInstance() {
        return new WizardPageTwoFragment();
    }

    private void setText(View view) {
        ((TextView) view.findViewById(C1146R.id.title)).setText(C1146R.string.wizard_title_viewpager_two);
        ((TextView) view.findViewById(C1146R.id.description)).setText(this.marketResourceFormatter.formatString(getContext(), C1146R.string.wizard_sub_title_viewpager_two, new String[0]));
        ((ImageView) view.findViewById(C1146R.id.wizard_icon)).setImageResource(C1146R.drawable.wizard_2);
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C1146R.layout.fragment_wizard_model_page, viewGroup, false);
        setText(viewInflate);
        return viewInflate;
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        unregisterClickHandler(this.clickHandler);
        super.onDestroyView();
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C5050e c5050e = new BackButton.ClickHandler() { // from class: cm.aptoide.pt.view.wizard.e
            @Override // cm.aptoide.pt.view.BackButton.ClickHandler
            public final boolean handle() {
                return WizardPageTwoFragment.lambda$onViewCreated$0();
            }
        };
        this.clickHandler = c5050e;
        registerClickHandler(c5050e);
    }
}
