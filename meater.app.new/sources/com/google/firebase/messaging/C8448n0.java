package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.n0 */
/* loaded from: classes2.dex */
final class C8448n0 {

    /* renamed from: a */
    private final SharedPreferences f32017a;

    /* renamed from: e */
    private final Executor f32021e;

    /* renamed from: d */
    private final ArrayDeque<String> f32020d = new ArrayDeque<>();

    /* renamed from: f */
    private boolean f32022f = false;

    /* renamed from: b */
    private final String f32018b = "topic_operation_queue";

    /* renamed from: c */
    private final String f32019c = ",";

    private C8448n0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f32017a = sharedPreferences;
        this.f32021e = executor;
    }

    /* renamed from: b */
    private boolean m26586b(boolean z) {
        if (!z || this.f32022f) {
            return z;
        }
        m26590i();
        return true;
    }

    /* renamed from: c */
    static C8448n0 m26587c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C8448n0 c8448n0 = new C8448n0(sharedPreferences, "topic_operation_queue", ",", executor);
        c8448n0.m26588d();
        return c8448n0;
    }

    /* renamed from: d */
    private void m26588d() {
        synchronized (this.f32020d) {
            this.f32020d.clear();
            String string = this.f32017a.getString(this.f32018b, HttpUrl.FRAGMENT_ENCODE_SET);
            if (!TextUtils.isEmpty(string) && string.contains(this.f32019c)) {
                String[] strArrSplit = string.split(this.f32019c, -1);
                if (strArrSplit.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f32020d.add(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void m26591a() {
        synchronized (this.f32020d) {
            this.f32017a.edit().putString(this.f32018b, m26594g()).commit();
        }
    }

    /* renamed from: i */
    private void m26590i() {
        this.f32021e.execute(new Runnable(this) { // from class: com.google.firebase.messaging.m0

            /* renamed from: f */
            private final C8448n0 f32015f;

            {
                this.f32015f = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f32015f.m26591a();
            }
        });
    }

    /* renamed from: e */
    public String m26592e() {
        String strPeek;
        synchronized (this.f32020d) {
            strPeek = this.f32020d.peek();
        }
        return strPeek;
    }

    /* renamed from: f */
    public boolean m26593f(Object obj) {
        boolean zRemove;
        synchronized (this.f32020d) {
            zRemove = this.f32020d.remove(obj);
            m26586b(zRemove);
        }
        return zRemove;
    }

    /* renamed from: g */
    public String m26594g() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f32020d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f32019c);
        }
        return sb.toString();
    }
}
