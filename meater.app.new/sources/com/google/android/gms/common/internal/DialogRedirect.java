package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* loaded from: classes2.dex */
public abstract class DialogRedirect implements DialogInterface.OnClickListener {
    /* renamed from: a */
    public static DialogRedirect m14321a(Activity activity, Intent intent, int i2) {
        return new C6418a(intent, activity, i2);
    }

    /* renamed from: b */
    public static DialogRedirect m14322b(Fragment fragment, Intent intent, int i2) {
        return new C6419b(intent, fragment, i2);
    }

    /* renamed from: c */
    public static DialogRedirect m14323c(LifecycleFragment lifecycleFragment, Intent intent, int i2) {
        return new C6420c(intent, lifecycleFragment, i2);
    }

    /* renamed from: d */
    protected abstract void mo14324d();

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        try {
            mo14324d();
        } catch (ActivityNotFoundException e2) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e2);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
