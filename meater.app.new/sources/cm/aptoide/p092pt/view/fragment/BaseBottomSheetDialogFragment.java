package cm.aptoide.p092pt.view.fragment;

import android.app.Dialog;
import android.os.Bundle;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.FlavourFragmentModule;
import cm.aptoide.p092pt.view.BaseActivity;
import cm.aptoide.p092pt.view.FragmentComponent;
import cm.aptoide.p092pt.view.FragmentModule;
import cm.aptoide.p092pt.view.MainActivity;
import com.google.android.material.bottomsheet.DialogC7970a;
import com.trello.rxlifecycle.p235h.p236a.AbstractC8765b;

/* loaded from: classes.dex */
public class BaseBottomSheetDialogFragment extends AbstractC8765b {
    private FragmentComponent fragmentComponent;

    private FragmentModule getFragmentModule(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment, Bundle bundle, Bundle bundle2, boolean z, String str) {
        return new FragmentModule(baseBottomSheetDialogFragment, bundle, bundle2, z, str);
    }

    public FragmentComponent getFragmentComponent(Bundle bundle) {
        if (this.fragmentComponent == null) {
            this.fragmentComponent = ((BaseActivity) getActivity()).getActivityComponent().plus(getFragmentModule(this, bundle, getArguments(), ((AptoideApplication) getContext().getApplicationContext()).isCreateStoreUserPrivacyEnabled(), getActivity().getApplicationContext().getPackageName()), new FlavourFragmentModule());
        }
        return this.fragmentComponent;
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8765b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((MainActivity) getContext()).getActivityComponent().inject(this);
    }

    @Override // androidx.appcompat.app.C0072i, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC7970a(requireContext(), getTheme());
    }
}
