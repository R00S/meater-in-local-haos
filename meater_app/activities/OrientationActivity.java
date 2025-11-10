package com.apptionlabs.meater_app.activities;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* loaded from: /tmp/meat/meat/classes.dex */
public abstract class OrientationActivity extends androidx.appcompat.app.c {
    private boolean K0(Activity activity) {
        if (Build.VERSION.SDK_INT == 26 && ((activity instanceof ProbeHighTemperatureWarningActivity) || (activity instanceof ShareCookActivity))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getResources().getBoolean(2131034115) && K0(this)) {
            setRequestedOrientation(1);
        }
    }
}
