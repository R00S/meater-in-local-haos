package K5;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: BluetoothPermissionHandler.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LK5/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "d", "(Landroid/content/Context;)Z", "Landroid/app/Activity;", "activity", "a", "(Landroid/app/Activity;)Z", "", "", "permissions", "", "grantResults", "Loa/F;", "c", "(Landroid/app/Activity;[Ljava/lang/String;[I)V", "e", "()[Ljava/lang/String;", "b", "()Z", "useModernPermissions", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8696a = new a();

    private a() {
    }

    public final boolean a(Activity activity) {
        C3862t.g(activity, "activity");
        return b() ? e.f8698b.o(activity) : c.f8697b.o(activity);
    }

    public final boolean b() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public final void c(Activity activity, String[] permissions, int[] grantResults) {
        C3862t.g(activity, "activity");
        C3862t.g(permissions, "permissions");
        C3862t.g(grantResults, "grantResults");
        if (b()) {
            e.f8698b.p(activity, permissions, grantResults);
        } else {
            c.f8697b.p(activity, permissions, grantResults);
        }
    }

    public final boolean d(Context context) {
        C3862t.g(context, "context");
        return (b() ? e.f8698b : c.f8697b).k(context);
    }

    public final String[] e() {
        return b() ? e.f8698b.h() : c.f8697b.h();
    }
}
