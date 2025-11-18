package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.database.SQLException;
import android.os.Bundle;
import androidx.work.AbstractC0807n;
import androidx.work.impl.InterfaceC0715b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C0721e;
import androidx.work.impl.p016n.C0775p;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CommandHandler.java */
/* renamed from: androidx.work.impl.background.systemalarm.b */
/* loaded from: classes.dex */
public class C0718b implements InterfaceC0715b {

    /* renamed from: f */
    private static final String f4547f = AbstractC0807n.m5223f("CommandHandler");

    /* renamed from: g */
    private final Context f4548g;

    /* renamed from: h */
    private final Map<String, InterfaceC0715b> f4549h = new HashMap();

    /* renamed from: i */
    private final Object f4550i = new Object();

    C0718b(Context context) {
        this.f4548g = context;
    }

    /* renamed from: a */
    static Intent m4878a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* renamed from: b */
    static Intent m4879b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    static Intent m4880c(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    /* renamed from: e */
    static Intent m4881e(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    /* renamed from: f */
    static Intent m4882f(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: g */
    static Intent m4883g(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: h */
    private void m4884h(Intent intent, int i2, C0721e c0721e) {
        AbstractC0807n.m5221c().mo5224a(f4547f, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new C0719c(this.f4548g, i2, c0721e).m4893a();
    }

    /* renamed from: i */
    private void m4885i(Intent intent, int i2, C0721e c0721e) {
        Bundle extras = intent.getExtras();
        synchronized (this.f4550i) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            AbstractC0807n abstractC0807nM5221c = AbstractC0807n.m5221c();
            String str = f4547f;
            abstractC0807nM5221c.mo5224a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
            if (this.f4549h.containsKey(string)) {
                AbstractC0807n.m5221c().mo5224a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
            } else {
                C0720d c0720d = new C0720d(this.f4548g, i2, string, c0721e);
                this.f4549h.put(string, c0720d);
                c0720d.m4899f();
            }
        }
    }

    /* renamed from: j */
    private void m4886j(Intent intent, int i2) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        AbstractC0807n.m5221c().mo5224a(f4547f, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i2)), new Throwable[0]);
        mo4869d(string, z);
    }

    /* renamed from: k */
    private void m4887k(Intent intent, int i2, C0721e c0721e) {
        AbstractC0807n.m5221c().mo5224a(f4547f, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i2)), new Throwable[0]);
        c0721e.m4907g().m5000x();
    }

    /* renamed from: l */
    private void m4888l(Intent intent, int i2, C0721e c0721e) throws SQLException {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        AbstractC0807n abstractC0807nM5221c = AbstractC0807n.m5221c();
        String str = f4547f;
        abstractC0807nM5221c.mo5224a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase workDatabaseM4997t = c0721e.m4907g().m4997t();
        workDatabaseM4997t.beginTransaction();
        try {
            C0775p c0775pMo5110m = workDatabaseM4997t.mo4854j().mo5110m(string);
            if (c0775pMo5110m == null) {
                AbstractC0807n.m5221c().mo5228h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (c0775pMo5110m.f4800d.m5237g()) {
                AbstractC0807n.m5221c().mo5228h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long jM5090a = c0775pMo5110m.m5090a();
            if (c0775pMo5110m.m5091b()) {
                AbstractC0807n.m5221c().mo5224a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jM5090a)), new Throwable[0]);
                C0717a.m4876c(this.f4548g, c0721e.m4907g(), string, jM5090a);
                c0721e.m4910k(new C0721e.b(c0721e, m4878a(this.f4548g), i2));
            } else {
                AbstractC0807n.m5221c().mo5224a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jM5090a)), new Throwable[0]);
                C0717a.m4876c(this.f4548g, c0721e.m4907g(), string, jM5090a);
            }
            workDatabaseM4997t.setTransactionSuccessful();
        } finally {
            workDatabaseM4997t.endTransaction();
        }
    }

    /* renamed from: m */
    private void m4889m(Intent intent, C0721e c0721e) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        AbstractC0807n.m5221c().mo5224a(f4547f, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        c0721e.m4907g().m4983C(string);
        C0717a.m4874a(this.f4548g, c0721e.m4907g(), string);
        c0721e.mo4869d(string, false);
    }

    /* renamed from: n */
    private static boolean m4890n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.work.impl.InterfaceC0715b
    /* renamed from: d */
    public void mo4869d(String str, boolean z) {
        synchronized (this.f4550i) {
            InterfaceC0715b interfaceC0715bRemove = this.f4549h.remove(str);
            if (interfaceC0715bRemove != null) {
                interfaceC0715bRemove.mo4869d(str, z);
            }
        }
    }

    /* renamed from: o */
    boolean m4891o() {
        boolean z;
        synchronized (this.f4550i) {
            z = !this.f4549h.isEmpty();
        }
        return z;
    }

    /* renamed from: p */
    void m4892p(Intent intent, int i2, C0721e c0721e) throws SQLException {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m4884h(intent, i2, c0721e);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            m4887k(intent, i2, c0721e);
            return;
        }
        if (!m4890n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            AbstractC0807n.m5221c().mo5225b(f4547f, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            m4888l(intent, i2, c0721e);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            m4885i(intent, i2, c0721e);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            m4889m(intent, c0721e);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            m4886j(intent, i2);
        } else {
            AbstractC0807n.m5221c().mo5228h(f4547f, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
