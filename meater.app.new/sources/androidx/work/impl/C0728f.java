package androidx.work.impl;

import android.content.Context;
import android.database.SQLException;
import android.os.Build;
import androidx.work.AbstractC0807n;
import androidx.work.C0703b;
import androidx.work.impl.background.systemalarm.C0722f;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.C0724b;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.p016n.C0775p;
import androidx.work.impl.p016n.InterfaceC0776q;
import androidx.work.impl.utils.C0785d;
import java.util.Iterator;
import java.util.List;

/* compiled from: Schedulers.java */
/* renamed from: androidx.work.impl.f */
/* loaded from: classes.dex */
public class C0728f {

    /* renamed from: a */
    private static final String f4613a = AbstractC0807n.m5223f("Schedulers");

    /* renamed from: a */
    static InterfaceC0727e m4942a(Context context, C0737j c0737j) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0724b c0724b = new C0724b(context, c0737j);
            C0785d.m5162a(context, SystemJobService.class, true);
            AbstractC0807n.m5221c().mo5224a(f4613a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return c0724b;
        }
        InterfaceC0727e interfaceC0727eM4944c = m4944c(context);
        if (interfaceC0727eM4944c != null) {
            return interfaceC0727eM4944c;
        }
        C0722f c0722f = new C0722f(context);
        C0785d.m5162a(context, SystemAlarmService.class, true);
        AbstractC0807n.m5221c().mo5224a(f4613a, "Created SystemAlarmScheduler", new Throwable[0]);
        return c0722f;
    }

    /* renamed from: b */
    public static void m4943b(C0703b c0703b, WorkDatabase workDatabase, List<InterfaceC0727e> list) throws SQLException {
        if (list == null || list.size() == 0) {
            return;
        }
        InterfaceC0776q interfaceC0776qMo4854j = workDatabase.mo4854j();
        workDatabase.beginTransaction();
        try {
            List<C0775p> listMo5102e = interfaceC0776qMo4854j.mo5102e(c0703b.m4789h());
            List<C0775p> listMo5116s = interfaceC0776qMo4854j.mo5116s(200);
            if (listMo5102e != null && listMo5102e.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator<C0775p> it = listMo5102e.iterator();
                while (it.hasNext()) {
                    interfaceC0776qMo4854j.mo5099b(it.next().f4799c, jCurrentTimeMillis);
                }
            }
            workDatabase.setTransactionSuccessful();
            if (listMo5102e != null && listMo5102e.size() > 0) {
                C0775p[] c0775pArr = (C0775p[]) listMo5102e.toArray(new C0775p[listMo5102e.size()]);
                for (InterfaceC0727e interfaceC0727e : list) {
                    if (interfaceC0727e.mo4914c()) {
                        interfaceC0727e.mo4913a(c0775pArr);
                    }
                }
            }
            if (listMo5116s == null || listMo5116s.size() <= 0) {
                return;
            }
            C0775p[] c0775pArr2 = (C0775p[]) listMo5116s.toArray(new C0775p[listMo5116s.size()]);
            for (InterfaceC0727e interfaceC0727e2 : list) {
                if (!interfaceC0727e2.mo4914c()) {
                    interfaceC0727e2.mo4913a(c0775pArr2);
                }
            }
        } finally {
            workDatabase.endTransaction();
        }
    }

    /* renamed from: c */
    private static InterfaceC0727e m4944c(Context context) {
        try {
            InterfaceC0727e interfaceC0727e = (InterfaceC0727e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            AbstractC0807n.m5221c().mo5224a(f4613a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return interfaceC0727e;
        } catch (Throwable th) {
            AbstractC0807n.m5221c().mo5224a(f4613a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
