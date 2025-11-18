package cm.aptoide.p092pt.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Obb;
import cm.aptoide.p092pt.permissions.ApkPermission;
import cm.aptoide.p092pt.permissions.ApkPermissionGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class AppUtils {
    public static void fillPermissionsForTableLayout(Context context, TableLayout tableLayout, List<ApkPermissionGroup> list) {
        TableRow tableRow = new TableRow(context);
        tableRow.setLayoutParams(new TableRow.LayoutParams(-1, -2));
        int i2 = 0;
        for (int i3 = 0; i3 <= list.size(); i3++) {
            if (i3 < list.size()) {
                i2++;
                ApkPermissionGroup apkPermissionGroup = list.get(i3);
                if (apkPermissionGroup != null) {
                    LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(C1146R.layout.row_permission, (ViewGroup) tableRow, false);
                    ((TextView) linearLayout.findViewById(C1146R.id.permission_name)).setText(apkPermissionGroup.getName());
                    for (String str : apkPermissionGroup.getDescriptions()) {
                        TextView textView = (TextView) LayoutInflater.from(context).inflate(C1146R.layout.row_description, (ViewGroup) linearLayout, false);
                        textView.setText(str);
                        linearLayout.addView(textView);
                    }
                    tableRow.addView(linearLayout, new TableRow.LayoutParams(0, -2, 1.0f));
                    if (i2 % 2 == 0) {
                        tableLayout.addView(tableRow, new TableLayout.LayoutParams(-1, -2));
                        tableRow = new TableRow(context);
                        tableRow.setLayoutParams(new TableRow.LayoutParams(-1, -2));
                    }
                }
            } else if (tableRow.getChildCount() > 0) {
                tableRow.setPadding(0, 0, 0, 20);
                tableLayout.addView(tableRow, new TableLayout.LayoutParams(-1, -2));
            }
        }
    }

    public static ArrayList<ApkPermissionGroup> fillPermissionsGroups(List<ApkPermission> list) {
        ArrayList<ApkPermissionGroup> arrayList = new ArrayList<>();
        String name = null;
        ApkPermissionGroup apkPermissionGroup = null;
        for (int i2 = 0; i2 <= list.size(); i2++) {
            if (i2 < list.size()) {
                ApkPermission apkPermission = list.get(i2);
                if (apkPermission.getName().equals(name)) {
                    apkPermissionGroup.setDescription(apkPermission.getDescription());
                } else {
                    name = apkPermission.getName();
                    apkPermissionGroup = new ApkPermissionGroup(apkPermission.getName(), apkPermission.getDescription());
                    arrayList.add(apkPermissionGroup);
                }
            } else if (!arrayList.contains(apkPermissionGroup)) {
                arrayList.add(apkPermissionGroup);
            }
        }
        return arrayList;
    }

    public static long sumFileSizes(long j2, Obb obb) {
        long filesize;
        if (obb == null || obb.getMain() == null) {
            return j2;
        }
        if (obb.getPatch() == null) {
            filesize = obb.getMain().getFilesize();
        } else {
            j2 += obb.getMain().getFilesize();
            filesize = obb.getPatch().getFilesize();
        }
        return j2 + filesize;
    }
}
