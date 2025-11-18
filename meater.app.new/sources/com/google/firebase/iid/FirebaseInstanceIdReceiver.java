package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C8432f0;
import com.google.firebase.messaging.C8449o;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    /* renamed from: h */
    private static Intent m26195h(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    /* renamed from: b */
    protected final int mo13747b(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.m23659a(new C8449o(context).m26601g(cloudMessage.m13743y()))).intValue();
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e2);
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    /* renamed from: c */
    protected final void mo13748c(Context context, Bundle bundle) {
        Intent intentM26195h = m26195h(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (C8432f0.m26512B(intentM26195h)) {
            C8432f0.m26532t(intentM26195h);
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    /* renamed from: d */
    protected final void mo13749d(Context context, Bundle bundle) {
        Intent intentM26195h = m26195h(context, "com.google.firebase.messaging.NOTIFICATION_OPEN", bundle);
        if (C8432f0.m26512B(intentM26195h)) {
            C8432f0.m26534v(intentM26195h);
        }
    }
}
