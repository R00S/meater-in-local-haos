package cm.aptoide.p092pt.account.view;

import android.app.Dialog;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.View;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.permission.PermissionServiceFragment;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

/* loaded from: classes.dex */
public abstract class GooglePlayServicesFragment extends PermissionServiceFragment implements GooglePlayServicesView {
    private static final int RESOLVE_CONNECTION_ERROR_REQUEST_CODE = 1;
    private GoogleApiAvailability apiAvailability;
    private Dialog errorDialog;

    private void showConnectionErrorMessage(int i2) {
        Dialog dialog = this.errorDialog;
        if (dialog == null || !dialog.isShowing()) {
            Dialog dialogM13815n = this.apiAvailability.m13815n(getActivity(), i2, 1);
            this.errorDialog = dialogM13815n;
            dialogM13815n.show();
        }
    }

    private void showResolution(ConnectionResult connectionResult) {
        try {
            connectionResult.m13796i0(getActivity(), 1);
        } catch (IntentSender.SendIntentException e2) {
            CrashReport.getInstance().log(e2);
        }
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.errorDialog;
        if (dialog != null) {
            dialog.dismiss();
            this.errorDialog = null;
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.apiAvailability = GoogleApiAvailability.m13803q();
    }

    @Override // cm.aptoide.p092pt.account.view.GooglePlayServicesView
    public void showConnectionError(ConnectionResult connectionResult) {
        if (connectionResult.m13794Y()) {
            showResolution(connectionResult);
        } else {
            showConnectionErrorMessage(connectionResult.m13797y());
        }
    }
}
