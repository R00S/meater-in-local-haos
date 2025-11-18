package cm.aptoide.p092pt.view.fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.FlavourFragmentModule;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.BaseActivity;
import cm.aptoide.p092pt.view.FragmentComponent;
import cm.aptoide.p092pt.view.FragmentModule;
import cm.aptoide.p092pt.view.MainActivity;
import com.trello.rxlifecycle.p235h.p236a.AbstractC8766c;
import javax.inject.Inject;

/* loaded from: classes.dex */
public class BaseDialogFragment extends AbstractC8766c {
    private FragmentComponent fragmentComponent;

    @Inject
    public ThemeManager themeManager;

    private FragmentModule getFragmentModule(BaseDialogFragment baseDialogFragment, Bundle bundle, Bundle bundle2, boolean z, String str) {
        return new FragmentModule(baseDialogFragment, bundle, bundle2, z, str);
    }

    public int getDialogStyle() {
        return C1146R.attr.dialogsTheme;
    }

    public FragmentComponent getFragmentComponent(Bundle bundle) {
        if (this.fragmentComponent == null) {
            this.fragmentComponent = ((BaseActivity) getActivity()).getActivityComponent().plus(getFragmentModule(this, bundle, getArguments(), ((AptoideApplication) getContext().getApplicationContext()).isCreateStoreUserPrivacyEnabled(), getActivity().getApplicationContext().getPackageName()), new FlavourFragmentModule());
        }
        return this.fragmentComponent;
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((MainActivity) getContext()).getActivityComponent().inject(this);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c
    public Dialog onCreateDialog(Bundle bundle) {
        if (getActivity() != null && shouldUseDefaultDialogStyle()) {
            setStyle(1, this.themeManager.getAttributeForTheme(getDialogStyle()).resourceId);
        }
        return super.onCreateDialog(bundle);
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
        attributes.dimAmount = 0.6f;
        getDialog().getWindow().setAttributes(attributes);
        getDialog().getWindow().addFlags(2);
    }

    public boolean shouldUseDefaultDialogStyle() {
        return true;
    }
}
