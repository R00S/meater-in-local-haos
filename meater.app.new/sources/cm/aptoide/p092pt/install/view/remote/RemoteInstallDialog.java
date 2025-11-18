package cm.aptoide.p092pt.install.view.remote;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.install.remote.ReceiverDevice;
import cm.aptoide.p092pt.install.remote.RemoteInstallationSenderListener;
import cm.aptoide.p092pt.install.remote.RemoteInstallationSenderManager;
import cm.aptoide.p092pt.view.fragment.BaseDialogFragment;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class RemoteInstallDialog extends BaseDialogFragment implements RemoteInstallationSenderListener {
    private static final String APP_ID_TAG = "appid";
    private ReceiverDeviceAdapter adapter;
    private String app;
    private TextView aptoideTVInstalledText;
    private LinearLayout errorLayout;
    private TextView errorText;
    private LinearLayout listLayout;
    private ListView listView;
    private ProgressBar pBar;
    private ImageButton refreshBtn;
    private RemoteInstallationSenderManager sManager;

    private enum Error {
        NO_NETWORK,
        NO_DEVICES_FOUND
    }

    public static RemoteInstallDialog newInstance(long j2) {
        RemoteInstallDialog remoteInstallDialog = new RemoteInstallDialog();
        Bundle bundle = new Bundle();
        bundle.putLong(APP_ID_TAG, j2);
        remoteInstallDialog.setArguments(bundle);
        return remoteInstallDialog;
    }

    private void populateDeviceList() {
        ReceiverDeviceAdapter receiverDeviceAdapter = new ReceiverDeviceAdapter(getContext(), C1146R.layout.row_remote_install, new ArrayList());
        this.adapter = receiverDeviceAdapter;
        this.listView.setAdapter((ListAdapter) receiverDeviceAdapter);
    }

    private void showErrorLayout(Error error) {
        this.pBar.setVisibility(8);
        if (error == Error.NO_DEVICES_FOUND) {
            this.aptoideTVInstalledText.setText(C1146R.string.remote_install_notinstallated);
            this.errorText.setText(C1146R.string.remote_install_nodevices);
        } else if (error == Error.NO_NETWORK) {
            this.aptoideTVInstalledText.setText(C1146R.string.remote_install_nowifi_tip);
            this.errorText.setText(C1146R.string.remote_install_nowifi);
        }
        this.listLayout.setVisibility(8);
        this.errorLayout.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseDialogFragment
    public int getDialogStyle() {
        return C1146R.attr.roundedDialogsTheme;
    }

    @Override // cm.aptoide.p092pt.install.remote.RemoteInstallationSenderListener
    public void onAppSendSuccess() {
        if (isAdded()) {
            Toast.makeText(getContext(), C1146R.string.remote_install_success, 1).show();
            dismiss();
        }
    }

    @Override // cm.aptoide.p092pt.install.remote.RemoteInstallationSenderListener
    public void onAppSendUnsuccess() {
        if (isAdded()) {
            Toast.makeText(getContext(), C1146R.string.remote_install_fail, 1).show();
            dismiss();
        }
    }

    @Override // cm.aptoide.p092pt.install.remote.RemoteInstallationSenderListener
    public void onAptoideTVServiceFound(ReceiverDevice receiverDevice) {
        this.adapter.add(receiverDevice);
    }

    @Override // cm.aptoide.p092pt.install.remote.RemoteInstallationSenderListener
    public void onAptoideTVServiceLost(ReceiverDevice receiverDevice) {
        this.adapter.remove(receiverDevice);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseDialogFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.app = HttpUrl.FRAGMENT_ENCODE_SET + getArguments().getLong(APP_ID_TAG);
        this.sManager = new RemoteInstallationSenderManager(getActivity());
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseDialogFragment, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.requestWindowFeature(1);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (getDialog() != null && getDialog().getWindow() != null && getDialog().getWindow().getDecorView() != null) {
            getDialog().getWindow().getDecorView().getBackground().setAlpha(0);
        }
        final View viewInflate = layoutInflater.inflate(C1146R.layout.dialog_remote_install, viewGroup, false);
        this.pBar = (ProgressBar) viewInflate.findViewById(C1146R.id.progressBar);
        this.errorLayout = (LinearLayout) viewInflate.findViewById(C1146R.id.errorLayout);
        this.errorText = (TextView) viewInflate.findViewById(C1146R.id.no_connection_text);
        this.listLayout = (LinearLayout) viewInflate.findViewById(C1146R.id.listLayout);
        Button button = (Button) viewInflate.findViewById(C1146R.id.help_btn);
        this.aptoideTVInstalledText = (TextView) viewInflate.findViewById(C1146R.id.aptoidetv_installed_text);
        this.refreshBtn = (ImageButton) viewInflate.findViewById(C1146R.id.refreshButton);
        button.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.install.view.remote.RemoteInstallDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(RemoteInstallDialog.this.getContext().getString(C1146R.string.remote_install_help_url)));
                intent.setFlags(268435456);
                RemoteInstallDialog.this.startActivity(intent);
            }
        });
        this.refreshBtn.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.install.view.remote.RemoteInstallDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RemoteInstallDialog.this.onRetryClick(viewInflate);
            }
        });
        if (this.adapter == null) {
            ListView listView = (ListView) viewInflate.findViewById(C1146R.id.listView);
            this.listView = listView;
            listView.setEmptyView(viewInflate.findViewById(C1146R.id.emptyListLayout));
            this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: cm.aptoide.pt.install.view.remote.RemoteInstallDialog.3
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                    ReceiverDevice receiverDevice = (ReceiverDevice) adapterView.getItemAtPosition(i2);
                    if (RemoteInstallDialog.this.sManager != null) {
                        RemoteInstallDialog.this.sManager.sendAppId(receiverDevice, RemoteInstallDialog.this.app);
                    }
                }
            });
            populateDeviceList();
            onRetryClick(viewGroup);
        }
        return viewInflate;
    }

    @Override // cm.aptoide.p092pt.install.remote.RemoteInstallationSenderListener
    public void onDiscoveryStarted() {
        this.refreshBtn.setVisibility(8);
        this.pBar.setVisibility(0);
        this.errorLayout.setVisibility(8);
        this.listLayout.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.install.remote.RemoteInstallationSenderListener
    public void onDiscoveryStopped() {
        this.pBar.setVisibility(8);
        this.refreshBtn.setVisibility(0);
        if (this.adapter.getCount() == 0) {
            showErrorLayout(Error.NO_DEVICES_FOUND);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.sManager.stopDiscoveringAptoideTVServices();
        super.onDismiss(dialogInterface);
    }

    @Override // cm.aptoide.p092pt.install.remote.RemoteInstallationSenderListener
    public void onNoNetworkAccess() {
        showErrorLayout(Error.NO_NETWORK);
    }

    public void onRetryClick(View view) {
        populateDeviceList();
        this.sManager.discoverAptoideTVServices(this);
    }
}
