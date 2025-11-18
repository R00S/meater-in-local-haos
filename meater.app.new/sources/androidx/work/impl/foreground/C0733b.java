package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.AbstractC0807n;
import androidx.work.C0709h;
import androidx.work.impl.C0737j;
import androidx.work.impl.InterfaceC0715b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p013m.C0744d;
import androidx.work.impl.p013m.InterfaceC0743c;
import androidx.work.impl.p016n.C0775p;
import androidx.work.impl.utils.p018p.InterfaceC0799a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: SystemForegroundDispatcher.java */
/* renamed from: androidx.work.impl.foreground.b */
/* loaded from: classes.dex */
public class C0733b implements InterfaceC0743c, InterfaceC0715b {

    /* renamed from: f */
    static final String f4629f = AbstractC0807n.m5223f("SystemFgDispatcher");

    /* renamed from: g */
    private Context f4630g;

    /* renamed from: h */
    private C0737j f4631h;

    /* renamed from: i */
    private final InterfaceC0799a f4632i;

    /* renamed from: j */
    final Object f4633j = new Object();

    /* renamed from: k */
    String f4634k;

    /* renamed from: l */
    final Map<String, C0709h> f4635l;

    /* renamed from: m */
    final Map<String, C0775p> f4636m;

    /* renamed from: n */
    final Set<C0775p> f4637n;

    /* renamed from: o */
    final C0744d f4638o;

    /* renamed from: p */
    private b f4639p;

    /* compiled from: SystemForegroundDispatcher.java */
    /* renamed from: androidx.work.impl.foreground.b$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ WorkDatabase f4640f;

        /* renamed from: g */
        final /* synthetic */ String f4641g;

        a(WorkDatabase workDatabase, String str) {
            this.f4640f = workDatabase;
            this.f4641g = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0775p c0775pMo5110m = this.f4640f.mo4854j().mo5110m(this.f4641g);
            if (c0775pMo5110m == null || !c0775pMo5110m.m5091b()) {
                return;
            }
            synchronized (C0733b.this.f4633j) {
                C0733b.this.f4636m.put(this.f4641g, c0775pMo5110m);
                C0733b.this.f4637n.add(c0775pMo5110m);
                C0733b c0733b = C0733b.this;
                c0733b.f4638o.m5034d(c0733b.f4637n);
            }
        }
    }

    /* compiled from: SystemForegroundDispatcher.java */
    /* renamed from: androidx.work.impl.foreground.b$b */
    interface b {
        /* renamed from: b */
        void mo4946b(int i2, int i3, Notification notification);

        /* renamed from: c */
        void mo4947c(int i2, Notification notification);

        /* renamed from: d */
        void mo4948d(int i2);

        void stop();
    }

    C0733b(Context context) {
        this.f4630g = context;
        C0737j c0737jM4979p = C0737j.m4979p(this.f4630g);
        this.f4631h = c0737jM4979p;
        InterfaceC0799a interfaceC0799aM4998u = c0737jM4979p.m4998u();
        this.f4632i = interfaceC0799aM4998u;
        this.f4634k = null;
        this.f4635l = new LinkedHashMap();
        this.f4637n = new HashSet();
        this.f4636m = new HashMap();
        this.f4638o = new C0744d(this.f4630g, interfaceC0799aM4998u, this);
        this.f4631h.m4995r().m4932c(this);
    }

    /* renamed from: a */
    public static Intent m4949a(Context context, String str, C0709h c0709h) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c0709h.m4843c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c0709h.m4841a());
        intent.putExtra("KEY_NOTIFICATION", c0709h.m4842b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    public static Intent m4950c(Context context, String str, C0709h c0709h) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", c0709h.m4843c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c0709h.m4841a());
        intent.putExtra("KEY_NOTIFICATION", c0709h.m4842b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: f */
    public static Intent m4951f(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    /* renamed from: g */
    private void m4952g(Intent intent) {
        AbstractC0807n.m5221c().mo5226d(f4629f, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f4631h.m4989j(UUID.fromString(stringExtra));
    }

    /* renamed from: h */
    private void m4953h(Intent intent) {
        int iM4841a = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AbstractC0807n.m5221c().mo5224a(f4629f, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f4639p == null) {
            return;
        }
        this.f4635l.put(stringExtra, new C0709h(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f4634k)) {
            this.f4634k = stringExtra;
            this.f4639p.mo4946b(intExtra, intExtra2, notification);
            return;
        }
        this.f4639p.mo4947c(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator<Map.Entry<String, C0709h>> it = this.f4635l.entrySet().iterator();
        while (it.hasNext()) {
            iM4841a |= it.next().getValue().m4841a();
        }
        C0709h c0709h = this.f4635l.get(this.f4634k);
        if (c0709h != null) {
            this.f4639p.mo4946b(c0709h.m4843c(), iM4841a, c0709h.m4842b());
        }
    }

    /* renamed from: i */
    private void m4954i(Intent intent) {
        AbstractC0807n.m5221c().mo5226d(f4629f, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f4632i.mo5205b(new a(this.f4631h.m4997t(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // androidx.work.impl.p013m.InterfaceC0743c
    /* renamed from: b */
    public void mo4897b(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            AbstractC0807n.m5221c().mo5224a(f4629f, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f4631h.m4982B(str);
        }
    }

    @Override // androidx.work.impl.InterfaceC0715b
    /* renamed from: d */
    public void mo4869d(String str, boolean z) {
        Map.Entry<String, C0709h> entry;
        synchronized (this.f4633j) {
            C0775p c0775pRemove = this.f4636m.remove(str);
            if (c0775pRemove != null ? this.f4637n.remove(c0775pRemove) : false) {
                this.f4638o.m5034d(this.f4637n);
            }
        }
        C0709h c0709hRemove = this.f4635l.remove(str);
        if (str.equals(this.f4634k) && this.f4635l.size() > 0) {
            Iterator<Map.Entry<String, C0709h>> it = this.f4635l.entrySet().iterator();
            Map.Entry<String, C0709h> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f4634k = entry.getKey();
            if (this.f4639p != null) {
                C0709h value = entry.getValue();
                this.f4639p.mo4946b(value.m4843c(), value.m4841a(), value.m4842b());
                this.f4639p.mo4948d(value.m4843c());
            }
        }
        b bVar = this.f4639p;
        if (c0709hRemove == null || bVar == null) {
            return;
        }
        AbstractC0807n.m5221c().mo5224a(f4629f, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(c0709hRemove.m4843c()), str, Integer.valueOf(c0709hRemove.m4841a())), new Throwable[0]);
        bVar.mo4948d(c0709hRemove.m4843c());
    }

    @Override // androidx.work.impl.p013m.InterfaceC0743c
    /* renamed from: e */
    public void mo4898e(List<String> list) {
    }

    /* renamed from: j */
    void m4955j(Intent intent) {
        AbstractC0807n.m5221c().mo5226d(f4629f, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f4639p;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* renamed from: k */
    void m4956k() {
        this.f4639p = null;
        synchronized (this.f4633j) {
            this.f4638o.m5035e();
        }
        this.f4631h.m4995r().m4936i(this);
    }

    /* renamed from: l */
    void m4957l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m4954i(intent);
            m4953h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            m4953h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            m4952g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            m4955j(intent);
        }
    }

    /* renamed from: m */
    void m4958m(b bVar) {
        if (this.f4639p != null) {
            AbstractC0807n.m5221c().mo5225b(f4629f, "A callback already exists.", new Throwable[0]);
        } else {
            this.f4639p = bVar;
        }
    }
}
