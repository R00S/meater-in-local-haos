package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import cm.aptoide.p092pt.FirebaseConstants;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.cloudmessaging.zzf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* loaded from: classes2.dex */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private final ExecutorService f17137a = com.google.android.gms.internal.cloudmessaging.zza.m20901a().mo20900b(new NamedThreadFactory("firebase-iid-executor"), zzf.f27592a);

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
    public static final class IntentActionKeys {
        private IntentActionKeys() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
    public static final class IntentKeys {
        private IntentKeys() {
        }
    }

    /* renamed from: e */
    private final int m13744e(Context context, Intent intent) throws PendingIntent.CanceledException {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            mo13749d(context, extras);
            return -1;
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            mo13748c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    /* renamed from: g */
    private final int m13745g(Context context, Intent intent) {
        Task<Void> taskM13786d;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra(FirebaseConstants.FIREBASE_MESSAGE_ID);
        if (TextUtils.isEmpty(stringExtra)) {
            taskM13786d = Tasks.m23663e(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(FirebaseConstants.FIREBASE_MESSAGE_ID, stringExtra);
            taskM13786d = zze.m13783c(context).m13786d(2, bundle);
        }
        int iMo13747b = mo13747b(context, new CloudMessage(intent));
        try {
            Tasks.m23660b(taskM13786d, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
            sb.append("Message ack failed: ");
            sb.append(strValueOf);
            Log.w("CloudMessagingReceiver", sb.toString());
        }
        return iMo13747b;
    }

    /* renamed from: a */
    protected Executor m13746a() {
        return this.f17137a;
    }

    /* renamed from: b */
    protected abstract int mo13747b(Context context, CloudMessage cloudMessage);

    /* renamed from: c */
    protected void mo13748c(Context context, Bundle bundle) {
    }

    /* renamed from: d */
    protected void mo13749d(Context context, Bundle bundle) {
    }

    /* renamed from: f */
    final /* synthetic */ void m13750f(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            int iM13744e = intent2 != null ? m13744e(context, intent2) : m13745g(context, intent);
            if (z) {
                pendingResult.setResultCode(iM13744e);
            }
        } finally {
            pendingResult.finish();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        m13746a().execute(new Runnable(this, intent, context, zIsOrderedBroadcast, pendingResultGoAsync) { // from class: com.google.android.gms.cloudmessaging.b

            /* renamed from: f */
            private final CloudMessagingReceiver f17149f;

            /* renamed from: g */
            private final Intent f17150g;

            /* renamed from: h */
            private final Context f17151h;

            /* renamed from: i */
            private final boolean f17152i;

            /* renamed from: j */
            private final BroadcastReceiver.PendingResult f17153j;

            {
                this.f17149f = this;
                this.f17150g = intent;
                this.f17151h = context;
                this.f17152i = zIsOrderedBroadcast;
                this.f17153j = pendingResultGoAsync;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f17149f.m13750f(this.f17150g, this.f17151h, this.f17152i, this.f17153j);
            }
        });
    }
}
