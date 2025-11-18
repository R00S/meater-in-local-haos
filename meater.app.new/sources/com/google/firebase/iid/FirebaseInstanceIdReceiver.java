package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import b7.AbstractC2252b;
import b7.C2251a;
import com.apptionlabs.meater_app.data.Temperature;
import com.google.firebase.messaging.C2928m;
import com.google.firebase.messaging.F;
import java.util.concurrent.ExecutionException;
import z7.C5211m;

/* loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC2252b {
    private static Intent f(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // b7.AbstractC2252b
    protected int b(Context context, C2251a c2251a) {
        try {
            return ((Integer) C5211m.a(new C2928m(context).k(c2251a.f0()))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return Temperature.MAX_AMBIENT_SECOND_GEN_PROBE;
        }
    }

    @Override // b7.AbstractC2252b
    protected void c(Context context, Bundle bundle) {
        Intent intentF = f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (F.D(intentF)) {
            F.v(intentF);
        }
    }
}
