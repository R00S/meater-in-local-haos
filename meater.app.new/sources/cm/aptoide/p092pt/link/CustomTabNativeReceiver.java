package cm.aptoide.p092pt.link;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class CustomTabNativeReceiver extends BroadcastReceiver {
    private static final String MOCKUP_URL = "http://www.example.com";
    private static final String REFERER_ATTRIBUTE = "Referer";
    private static final String REFERER_VALUE = "http://m.aptoide.com";

    private Set<String> extractPackagenames(List<ResolveInfo> list) {
        HashSet hashSet = new HashSet();
        Iterator<ResolveInfo> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().activityInfo.packageName);
        }
        return hashSet;
    }

    private Set<String> getNativeAppPackage(Context context, Uri uri) {
        PackageManager packageManager = context.getPackageManager();
        Set<String> setExtractPackagenames = extractPackagenames(packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(MOCKUP_URL)), 0));
        Set<String> setExtractPackagenames2 = extractPackagenames(packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0));
        setExtractPackagenames2.removeAll(setExtractPackagenames);
        return setExtractPackagenames2;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String dataString = intent.getDataString();
        if (dataString != null) {
            Set<String> nativeAppPackage = getNativeAppPackage(context, Uri.parse(dataString));
            if ((nativeAppPackage.iterator().hasNext() ? nativeAppPackage.iterator().next() : null) == null) {
                Toast.makeText(context, "No application to open.", 0).show();
                return;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(dataString));
            Bundle bundle = new Bundle();
            bundle.putString(REFERER_ATTRIBUTE, REFERER_VALUE);
            intent2.putExtra("com.android.browser.headers", bundle);
            intent2.setFlags(268435456);
            context.startActivity(intent2);
        }
    }
}
