package K5;

import android.app.Activity;
import c5.C2316d;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.views.C2421z;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ModernBluetoothPermissionHandler.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LK5/e;", "LK5/h;", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "o", "(Landroid/app/Activity;)Z", "", "", "permissions", "", "grantResults", "Loa/F;", "p", "(Landroid/app/Activity;[Ljava/lang/String;[I)V", "h", "()[Ljava/lang/String;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e extends h {

    /* renamed from: b, reason: collision with root package name */
    public static final e f8698b = new e();

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q() {
        C2316d.B(S4.a.f15462J);
    }

    @Override // K5.h
    public String[] h() {
        return new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"};
    }

    public final boolean o(Activity activity) {
        C3862t.g(activity, "activity");
        return h.d(this, activity, activity.getString(R.string.meater_needs_access_bluetooth), activity.getString(R.string.meater_needs_access_location_alert_detail), 0, 8, null);
    }

    public final void p(Activity activity, String[] permissions, int[] grantResults) {
        C3862t.g(activity, "activity");
        C3862t.g(permissions, "permissions");
        C3862t.g(grantResults, "grantResults");
        if (j(activity, permissions, grantResults)) {
            return;
        }
        C2421z.Companion companion = C2421z.INSTANCE;
        String string = activity.getString(R.string.unable_to_discover_probe_title);
        C3862t.f(string, "getString(...)");
        String string2 = activity.getString(R.string.meater_is_unable_to_discover_probes_without_bluetooth_permission);
        C3862t.f(string2, "getString(...)");
        String string3 = activity.getString(R.string.ok_label);
        C3862t.f(string3, "getString(...)");
        C2421z.AlertPair alertPair = new C2421z.AlertPair(string3, null, 2, null);
        String string4 = activity.getString(R.string.more_info_button_text);
        C3862t.f(string4, "getString(...)");
        m(C2421z.Companion.f(companion, activity, string, string2, false, alertPair, new C2421z.AlertPair(string4, new T4.e() { // from class: K5.d
            @Override // T4.e
            public final void a() {
                e.q();
            }
        }), null, 72, null));
    }
}
