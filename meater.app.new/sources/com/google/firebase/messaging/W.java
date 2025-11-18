package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: SharedPreferencesQueue.java */
/* loaded from: classes2.dex */
final class W {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f38307a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38308b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38309c;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f38311e;

    /* renamed from: d, reason: collision with root package name */
    final ArrayDeque<String> f38310d = new ArrayDeque<>();

    /* renamed from: f, reason: collision with root package name */
    private boolean f38312f = false;

    private W(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f38307a = sharedPreferences;
        this.f38308b = str;
        this.f38309c = str2;
        this.f38311e = executor;
    }

    private boolean b(boolean z10) {
        if (z10 && !this.f38312f) {
            i();
        }
        return z10;
    }

    static W c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        W w10 = new W(sharedPreferences, str, str2, executor);
        w10.d();
        return w10;
    }

    private void d() {
        synchronized (this.f38310d) {
            try {
                this.f38310d.clear();
                String string = this.f38307a.getString(this.f38308b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f38309c)) {
                    String[] strArrSplit = string.split(this.f38309c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f38310d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        synchronized (this.f38310d) {
            this.f38307a.edit().putString(this.f38308b, g()).commit();
        }
    }

    private void i() {
        this.f38311e.execute(new Runnable() { // from class: com.google.firebase.messaging.V
            @Override // java.lang.Runnable
            public final void run() {
                this.f38306B.h();
            }
        });
    }

    public String e() {
        String strPeek;
        synchronized (this.f38310d) {
            strPeek = this.f38310d.peek();
        }
        return strPeek;
    }

    public boolean f(Object obj) {
        boolean zB;
        synchronized (this.f38310d) {
            zB = b(this.f38310d.remove(obj));
        }
        return zB;
    }

    public String g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f38310d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f38309c);
        }
        return sb2.toString();
    }
}
