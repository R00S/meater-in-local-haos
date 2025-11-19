package P5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: PowerMonitor.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR0\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0087\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0010\u0010\u0014¨\u0006\u0017"}, d2 = {"LP5/A;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Loa/F;", "c", "(Landroid/content/Context;)V", "d", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "value", "b", "Z", "a", "()Z", "(Z)V", "isConnectedToPower$annotations", "isConnectedToPower", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class A extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static boolean isConnectedToPower;

    /* renamed from: a, reason: collision with root package name */
    public static final A f13978a = new A();

    /* renamed from: c, reason: collision with root package name */
    public static final int f13980c = 8;

    private A() {
    }

    public static final boolean a() {
        return isConnectedToPower;
    }

    private static final void b(boolean z10) {
        if (isConnectedToPower == z10) {
            return;
        }
        isConnectedToPower = z10;
        E.g();
    }

    public static final void c(Context context) {
        C3862t.g(context, "context");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        A a10 = f13978a;
        context.registerReceiver(a10, intentFilter);
        a10.d(context);
    }

    private final void d(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        b(intExtra == 2 || intExtra == 5);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C3862t.g(context, "context");
        C3862t.g(intent, "intent");
        String action = intent.getAction();
        if (C3862t.b(action, "android.intent.action.ACTION_POWER_CONNECTED")) {
            b(true);
        } else if (C3862t.b(action, "android.intent.action.ACTION_POWER_DISCONNECTED")) {
            b(false);
        }
    }
}
