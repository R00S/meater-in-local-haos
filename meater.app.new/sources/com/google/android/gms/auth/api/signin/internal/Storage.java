package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class Storage {

    /* renamed from: a */
    private static final Lock f17086a = new ReentrantLock();

    /* renamed from: b */
    private static Storage f17087b;

    /* renamed from: c */
    private final Lock f17088c = new ReentrantLock();

    /* renamed from: d */
    private final SharedPreferences f17089d;

    @VisibleForTesting
    private Storage(Context context) {
        this.f17089d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @KeepForSdk
    /* renamed from: b */
    public static Storage m13705b(Context context) {
        Preconditions.m14372k(context);
        Lock lock = f17086a;
        lock.lock();
        try {
            if (f17087b == null) {
                f17087b = new Storage(context.getApplicationContext());
            }
            Storage storage = f17087b;
            lock.unlock();
            return storage;
        } catch (Throwable th) {
            f17086a.unlock();
            throw th;
        }
    }

    /* renamed from: g */
    private final void m13706g(String str, String str2) {
        this.f17088c.lock();
        try {
            this.f17089d.edit().putString(str, str2).apply();
        } finally {
            this.f17088c.unlock();
        }
    }

    /* renamed from: h */
    private static String m13707h(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @VisibleForTesting
    /* renamed from: i */
    private final GoogleSignInAccount m13708i(String str) {
        String strM13710k;
        if (!TextUtils.isEmpty(str) && (strM13710k = m13710k(m13707h("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.m13646a1(strM13710k);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @VisibleForTesting
    /* renamed from: j */
    private final GoogleSignInOptions m13709j(String str) {
        String strM13710k;
        if (!TextUtils.isEmpty(str) && (strM13710k = m13710k(m13707h("googleSignInOptions", str))) != null) {
            try {
                return GoogleSignInOptions.m13666M0(strM13710k);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: k */
    private final String m13710k(String str) {
        this.f17088c.lock();
        try {
            return this.f17089d.getString(str, null);
        } finally {
            this.f17088c.unlock();
        }
    }

    /* renamed from: m */
    private final void m13711m(String str) {
        this.f17088c.lock();
        try {
            this.f17089d.edit().remove(str).apply();
        } finally {
            this.f17088c.unlock();
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public void m13712a() {
        this.f17088c.lock();
        try {
            this.f17089d.edit().clear().apply();
        } finally {
            this.f17088c.unlock();
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public GoogleSignInAccount m13713c() {
        return m13708i(m13710k("defaultGoogleSignInAccount"));
    }

    @KeepForSdk
    /* renamed from: d */
    public GoogleSignInOptions m13714d() {
        return m13709j(m13710k("defaultGoogleSignInAccount"));
    }

    @KeepForSdk
    /* renamed from: e */
    public String m13715e() {
        return m13710k("refreshToken");
    }

    @KeepForSdk
    /* renamed from: f */
    public void m13716f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        Preconditions.m14372k(googleSignInAccount);
        Preconditions.m14372k(googleSignInOptions);
        m13706g("defaultGoogleSignInAccount", googleSignInAccount.m13656r1());
        Preconditions.m14372k(googleSignInAccount);
        Preconditions.m14372k(googleSignInOptions);
        String strM13656r1 = googleSignInAccount.m13656r1();
        m13706g(m13707h("googleSignInAccount", strM13656r1), googleSignInAccount.m13657s1());
        m13706g(m13707h("googleSignInOptions", strM13656r1), googleSignInOptions.m13681t1());
    }

    /* renamed from: l */
    public final void m13717l() {
        String strM13710k = m13710k("defaultGoogleSignInAccount");
        m13711m("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strM13710k)) {
            return;
        }
        m13711m(m13707h("googleSignInAccount", strM13710k));
        m13711m(m13707h("googleSignInOptions", strM13710k));
    }
}
