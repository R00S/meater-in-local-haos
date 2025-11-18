package androidx.core.os;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* compiled from: UserManagerCompat.java */
/* renamed from: androidx.core.os.e */
/* loaded from: classes.dex */
public class C0276e {
    /* renamed from: a */
    public static boolean m1842a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
