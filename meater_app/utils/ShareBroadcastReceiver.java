package com.apptionlabs.meater_app.utils;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Objects;
import lm.b;

/* loaded from: /tmp/meat/meat/classes.dex */
public class ShareBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ComponentName componentName;
        PackageManager packageManager;
        Bundle extras = intent.getExtras();
        Objects.requireNonNull(extras);
        Iterator<String> it = extras.keySet().iterator();
        while (it.hasNext()) {
            try {
                componentName = (ComponentName) intent.getExtras().get(it.next());
                packageManager = context.getPackageManager();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (componentName == null) {
                return;
            }
            b.g(b.EnumC0292b.f17360x.title, "", (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(componentName.getPackageName(), 128)));
        }
    }
}
