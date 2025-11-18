package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import cm.aptoide.p092pt.FirebaseConstants;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* loaded from: classes2.dex */
public class FirebaseMessagingService extends AbstractServiceC8433g {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        String strValueOf = String.valueOf(str);
        Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Received duplicate message: ".concat(strValueOf) : new String("Received duplicate message: "));
        return true;
    }

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C8436h0.m26550t(extras)) {
            C8436h0 c8436h0 = new C8436h0(extras);
            ExecutorService executorServiceM26615d = C8451p.m26615d();
            try {
                if (new C8425c(this, c8436h0, executorServiceM26615d).m26505a()) {
                    return;
                }
                executorServiceM26615d.shutdown();
                if (C8432f0.m26512B(intent)) {
                    C8432f0.m26533u(intent);
                }
            } finally {
                executorServiceM26615d.shutdown();
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra(FirebaseConstants.FIREBASE_MESSAGE_ID);
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private void handleMessageIntent(Intent intent) {
        if (alreadyReceivedMessage(intent.getStringExtra(FirebaseConstants.FIREBASE_MESSAGE_ID))) {
            return;
        }
        passMessageIntentToSdk(intent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void passMessageIntentToSdk(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "message_type"
            java.lang.String r0 = r7.getStringExtra(r0)
            java.lang.String r1 = "gcm"
            if (r0 != 0) goto Lb
            r0 = r1
        Lb:
            int r2 = r0.hashCode()
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r2) {
                case -2062414158: goto L32;
                case 102161: goto L2a;
                case 814694033: goto L20;
                case 814800675: goto L16;
                default: goto L15;
            }
        L15:
            goto L3c
        L16:
            java.lang.String r1 = "send_event"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3c
            r1 = 2
            goto L3d
        L20:
            java.lang.String r1 = "send_error"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3c
            r1 = 3
            goto L3d
        L2a:
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3c
            r1 = 0
            goto L3d
        L32:
            java.lang.String r1 = "deleted_messages"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3c
            r1 = 1
            goto L3d
        L3c:
            r1 = -1
        L3d:
            if (r1 == 0) goto L7f
            if (r1 == r5) goto L7b
            if (r1 == r4) goto L71
            if (r1 == r3) goto L5e
            java.lang.String r7 = "Received message with unknown type: "
            int r1 = r0.length()
            if (r1 == 0) goto L52
            java.lang.String r7 = r7.concat(r0)
            goto L58
        L52:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7)
            r7 = r0
        L58:
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.w(r0, r7)
            return
        L5e:
            java.lang.String r0 = r6.getMessageId(r7)
            com.google.firebase.messaging.SendException r1 = new com.google.firebase.messaging.SendException
            java.lang.String r2 = "error"
            java.lang.String r7 = r7.getStringExtra(r2)
            r1.<init>(r7)
            r6.onSendError(r0, r1)
            return
        L71:
            java.lang.String r0 = "google.message_id"
            java.lang.String r7 = r7.getStringExtra(r0)
            r6.onMessageSent(r7)
            return
        L7b:
            r6.onDeletedMessages()
            return
        L7f:
            com.google.firebase.messaging.C8432f0.m26535w(r7)
            r6.dispatchMessage(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.passMessageIntentToSdk(android.content.Intent):void");
    }

    @Override // com.google.firebase.messaging.AbstractServiceC8433g
    protected Intent getStartCommandIntent(Intent intent) {
        return C8444l0.m26580b().m26582c();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC8433g
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            handleMessageIntent(intent);
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            onNewToken(intent.getStringExtra("token"));
        } else {
            String strValueOf = String.valueOf(intent.getAction());
            Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Unknown intent action: ".concat(strValueOf) : new String("Unknown intent action: "));
        }
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }
}
