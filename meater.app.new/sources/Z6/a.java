package Z6;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import g7.C3445p;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final Lock f19597c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    private static a f19598d;

    /* renamed from: a, reason: collision with root package name */
    private final Lock f19599a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f19600b;

    a(Context context) {
        this.f19600b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        C3445p.k(context);
        Lock lock = f19597c;
        lock.lock();
        try {
            if (f19598d == null) {
                f19598d = new a(context.getApplicationContext());
            }
            a aVar = f19598d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f19597c.unlock();
            throw th;
        }
    }

    private static final String d(String str, String str2) {
        return str + ":" + str2;
    }

    public GoogleSignInAccount b() {
        String strC;
        String strC2 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strC2) || (strC = c(d("googleSignInAccount", strC2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.E1(strC);
        } catch (JSONException unused) {
            return null;
        }
    }

    protected final String c(String str) {
        this.f19599a.lock();
        try {
            return this.f19600b.getString(str, null);
        } finally {
            this.f19599a.unlock();
        }
    }
}
