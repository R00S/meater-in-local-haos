package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import b7.C2251a;
import b7.C2253c;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class FirebaseMessagingService extends AbstractServiceC2923h {

    /* renamed from: H, reason: collision with root package name */
    private static final Queue<String> f38253H = new ArrayDeque(10);

    /* renamed from: G, reason: collision with root package name */
    private C2253c f38254G;

    private boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = f38253H;
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
        Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        return true;
    }

    private void m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (H.t(extras)) {
            H h10 = new H(extras);
            ExecutorService executorServiceE = C2929n.e();
            try {
                if (new C2920e(this, h10, executorServiceE).a()) {
                    return;
                }
                executorServiceE.shutdown();
                if (F.D(intent)) {
                    F.w(intent);
                }
            } finally {
                executorServiceE.shutdown();
            }
        }
        r(new P(extras));
    }

    private String n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private C2253c o(Context context) {
        if (this.f38254G == null) {
            this.f38254G = new C2253c(context.getApplicationContext());
        }
        return this.f38254G;
    }

    private void p(Intent intent) {
        if (!l(intent.getStringExtra("google.message_id"))) {
            v(intent);
        }
        o(this).b(new C2251a(intent));
    }

    private void v(Intent intent) {
        String stringExtra;
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                q();
                break;
            case "gcm":
                F.y(intent);
                m(intent);
                break;
            case "send_error":
                u(n(intent), new SendException(intent.getStringExtra("error")));
                break;
            case "send_event":
                s(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }

    @Override // com.google.firebase.messaging.AbstractServiceC2923h
    protected Intent e(Intent intent) {
        return U.b().c();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC2923h
    public void f(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            p(intent);
            return;
        }
        if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            t(intent.getStringExtra("token"));
            return;
        }
        Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
    }

    public void q() {
    }

    public void r(P p10) {
    }

    @Deprecated
    public void s(String str) {
    }

    public void t(String str) {
    }

    @Deprecated
    public void u(String str, Exception exc) {
    }
}
