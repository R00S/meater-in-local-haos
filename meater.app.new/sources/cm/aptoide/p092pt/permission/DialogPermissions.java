package cm.aptoide.p092pt.permission;

import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0066c;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.permissions.ApkPermissionGroup;
import cm.aptoide.p092pt.util.AppUtils;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.fragment.BaseDialogFragment;
import com.bumptech.glide.ComponentCallbacks2C5349c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DialogPermissions extends BaseDialogFragment {
    private String appName;
    private String icon;
    private String size;
    private List<String> usedPermissions;
    private String versionName;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateDialog$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8389d(View view) {
        dismiss();
    }

    public static DialogPermissions newInstance(String str, String str2, String str3, String str4, List<String> list) {
        DialogPermissions dialogPermissions = new DialogPermissions();
        dialogPermissions.appName = str;
        dialogPermissions.versionName = str2;
        dialogPermissions.icon = str3;
        dialogPermissions.size = str4;
        dialogPermissions.usedPermissions = list;
        return dialogPermissions;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseDialogFragment, androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c
    public Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = LayoutInflater.from(getActivity()).inflate(C1146R.layout.layout_dialog_permissions, (ViewGroup) null);
        DialogInterfaceC0066c dialogInterfaceC0066cM244a = new DialogInterfaceC0066c.a(new ContextThemeWrapper(getContext(), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId)).m266w(viewInflate).m244a();
        viewInflate.findViewById(C1146R.id.dialog_ok_button).setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.permission.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10508f.m8389d(view);
            }
        });
        ((TextView) viewInflate.findViewById(C1146R.id.dialog_app_info)).setText(getString(C1146R.string.dialog_version_size, this.versionName, this.size));
        ((TextView) viewInflate.findViewById(C1146R.id.dialog_app_name)).setText(this.appName);
        ComponentCallbacks2C5349c.m9979u(this).m10042k(this.icon).m10017D0((ImageView) viewInflate.findViewById(C1146R.id.dialog_appview_icon));
        TableLayout tableLayout = (TableLayout) viewInflate.findViewById(C1146R.id.dialog_table_permissions);
        ArrayList<ApkPermissionGroup> arrayListFillPermissionsGroups = AppUtils.fillPermissionsGroups(AptoideUtils.SystemU.parsePermissions(getContext(), this.usedPermissions));
        if (arrayListFillPermissionsGroups.size() == 0) {
            TextView textView = new TextView(getContext());
            textView.setText(getString(C1146R.string.no_permissions_required));
            textView.setPadding(5, 5, 5, 5);
        } else {
            AppUtils.fillPermissionsForTableLayout(getContext(), tableLayout, arrayListFillPermissionsGroups);
        }
        return dialogInterfaceC0066cM244a;
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8766c, androidx.fragment.app.Fragment
    public void onPause() {
        dismiss();
        super.onPause();
    }
}
