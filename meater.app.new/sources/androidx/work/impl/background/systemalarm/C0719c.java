package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.AbstractC0807n;
import androidx.work.impl.background.systemalarm.C0721e;
import androidx.work.impl.p013m.C0744d;
import androidx.work.impl.p016n.C0775p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ConstraintsCommandHandler.java */
/* renamed from: androidx.work.impl.background.systemalarm.c */
/* loaded from: classes.dex */
class C0719c {

    /* renamed from: a */
    private static final String f4551a = AbstractC0807n.m5223f("ConstraintsCmdHandler");

    /* renamed from: b */
    private final Context f4552b;

    /* renamed from: c */
    private final int f4553c;

    /* renamed from: d */
    private final C0721e f4554d;

    /* renamed from: e */
    private final C0744d f4555e;

    C0719c(Context context, int i2, C0721e c0721e) {
        this.f4552b = context;
        this.f4553c = i2;
        this.f4554d = c0721e;
        this.f4555e = new C0744d(context, c0721e.m4906f(), null);
    }

    /* renamed from: a */
    void m4893a() {
        List<C0775p> listMo5104g = this.f4554d.m4907g().m4997t().mo4854j().mo5104g();
        ConstraintProxy.m4870a(this.f4552b, listMo5104g);
        this.f4555e.m5034d(listMo5104g);
        ArrayList arrayList = new ArrayList(listMo5104g.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (C0775p c0775p : listMo5104g) {
            String str = c0775p.f4799c;
            if (jCurrentTimeMillis >= c0775p.m5090a() && (!c0775p.m5091b() || this.f4555e.m5033c(str))) {
                arrayList.add(c0775p);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((C0775p) it.next()).f4799c;
            Intent intentM4879b = C0718b.m4879b(this.f4552b, str2);
            AbstractC0807n.m5221c().mo5224a(f4551a, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            C0721e c0721e = this.f4554d;
            c0721e.m4910k(new C0721e.b(c0721e, intentM4879b, this.f4553c));
        }
        this.f4555e.m5035e();
    }
}
