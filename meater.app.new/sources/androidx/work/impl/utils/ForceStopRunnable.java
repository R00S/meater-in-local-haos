package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.os.C0272a;
import androidx.work.AbstractC0807n;
import androidx.work.C0703b;
import androidx.work.C0817x;
import androidx.work.InterfaceC0803j;
import androidx.work.impl.C0728f;
import androidx.work.impl.C0736i;
import androidx.work.impl.C0737j;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.C0724b;
import androidx.work.impl.p016n.C0775p;
import androidx.work.impl.p016n.InterfaceC0773n;
import androidx.work.impl.p016n.InterfaceC0776q;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: f */
    private static final String f4853f = AbstractC0807n.m5223f("ForceStopRunnable");

    /* renamed from: g */
    private static final long f4854g = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: h */
    private final Context f4855h;

    /* renamed from: i */
    private final C0737j f4856i;

    /* renamed from: j */
    private int f4857j = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        private static final String f4858a = AbstractC0807n.m5223f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            AbstractC0807n.m5221c().mo5227g(f4858a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.m5134g(context);
        }
    }

    public ForceStopRunnable(Context context, C0737j c0737j) {
        this.f4855h = context.getApplicationContext();
        this.f4856i = c0737j;
    }

    /* renamed from: c */
    static Intent m5132c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* renamed from: d */
    private static PendingIntent m5133d(Context context, int i2) {
        return PendingIntent.getBroadcast(context, -1, m5132c(context), i2);
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: g */
    static void m5134g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentM5133d = m5133d(context, C0272a.m1833c() ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f4854g;
        if (alarmManager != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentM5133d);
            } else {
                alarmManager.set(0, jCurrentTimeMillis, pendingIntentM5133d);
            }
        }
    }

    /* renamed from: a */
    public boolean m5135a() throws SQLException {
        boolean zM4925h = Build.VERSION.SDK_INT >= 23 ? C0724b.m4925h(this.f4855h, this.f4856i) : false;
        WorkDatabase workDatabaseM4997t = this.f4856i.m4997t();
        InterfaceC0776q interfaceC0776qMo4854j = workDatabaseM4997t.mo4854j();
        InterfaceC0773n interfaceC0773nMo4853i = workDatabaseM4997t.mo4853i();
        workDatabaseM4997t.beginTransaction();
        try {
            List<C0775p> listMo5106i = interfaceC0776qMo4854j.mo5106i();
            boolean z = (listMo5106i == null || listMo5106i.isEmpty()) ? false : true;
            if (z) {
                for (C0775p c0775p : listMo5106i) {
                    interfaceC0776qMo4854j.mo5098a(C0817x.a.ENQUEUED, c0775p.f4799c);
                    interfaceC0776qMo4854j.mo5099b(c0775p.f4799c, -1L);
                }
            }
            interfaceC0773nMo4853i.mo5087a();
            workDatabaseM4997t.setTransactionSuccessful();
            return z || zM4925h;
        } finally {
            workDatabaseM4997t.endTransaction();
        }
    }

    /* renamed from: b */
    public void m5136b() throws SQLException {
        boolean zM5135a = m5135a();
        if (m5139h()) {
            AbstractC0807n.m5221c().mo5224a(f4853f, "Rescheduling Workers.", new Throwable[0]);
            this.f4856i.m5000x();
            this.f4856i.m4994q().m5165c(false);
        } else if (m5137e()) {
            AbstractC0807n.m5221c().mo5224a(f4853f, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f4856i.m5000x();
        } else if (zM5135a) {
            AbstractC0807n.m5221c().mo5224a(f4853f, "Found unfinished work, scheduling it.", new Throwable[0]);
            C0728f.m4943b(this.f4856i.m4993n(), this.f4856i.m4997t(), this.f4856i.m4996s());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: e */
    public boolean m5137e() {
        try {
            PendingIntent pendingIntentM5133d = m5133d(this.f4855h, C0272a.m1833c() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (pendingIntentM5133d != null) {
                    pendingIntentM5133d.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f4855h.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i2 = 0; i2 < historicalProcessExitReasons.size(); i2++) {
                        if (historicalProcessExitReasons.get(i2).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentM5133d == null) {
                m5134g(this.f4855h);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e2) {
            AbstractC0807n.m5221c().mo5228h(f4853f, "Ignoring exception", e2);
            return true;
        }
    }

    /* renamed from: f */
    public boolean m5138f() {
        C0703b c0703bM4993n = this.f4856i.m4993n();
        if (TextUtils.isEmpty(c0703bM4993n.m4784c())) {
            AbstractC0807n.m5221c().mo5224a(f4853f, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zM5167b = C0787f.m5167b(this.f4855h, c0703bM4993n);
        AbstractC0807n.m5221c().mo5224a(f4853f, String.format("Is default app process = %s", Boolean.valueOf(zM5167b)), new Throwable[0]);
        return zM5167b;
    }

    /* renamed from: h */
    boolean m5139h() {
        return this.f4856i.m4994q().m5164a();
    }

    /* renamed from: i */
    public void m5140i(long j2) throws InterruptedException {
        try {
            Thread.sleep(j2);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i2;
        try {
            if (m5138f()) {
                while (true) {
                    C0736i.m4975e(this.f4855h);
                    AbstractC0807n.m5221c().mo5224a(f4853f, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        m5136b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e2) {
                        i2 = this.f4857j + 1;
                        this.f4857j = i2;
                        if (i2 >= 3) {
                            AbstractC0807n abstractC0807nM5221c = AbstractC0807n.m5221c();
                            String str = f4853f;
                            abstractC0807nM5221c.mo5225b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                            InterfaceC0803j interfaceC0803jM4785d = this.f4856i.m4993n().m4785d();
                            if (interfaceC0803jM4785d == null) {
                                throw illegalStateException;
                            }
                            AbstractC0807n.m5221c().mo5224a(str, "Routing exception to the specified exception handler", illegalStateException);
                            interfaceC0803jM4785d.m5214a(illegalStateException);
                        } else {
                            AbstractC0807n.m5221c().mo5224a(f4853f, String.format("Retrying after %s", Long.valueOf(i2 * 300)), e2);
                            m5140i(this.f4857j * 300);
                        }
                    }
                    AbstractC0807n.m5221c().mo5224a(f4853f, String.format("Retrying after %s", Long.valueOf(i2 * 300)), e2);
                    m5140i(this.f4857j * 300);
                }
            }
        } finally {
            this.f4856i.m4999w();
        }
    }
}
