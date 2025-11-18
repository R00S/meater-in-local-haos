package androidx.work.impl;

import android.content.Context;
import androidx.room.AbstractC0651j;
import androidx.room.C0650i;
import androidx.work.impl.C0735h;
import androidx.work.impl.p016n.InterfaceC0761b;
import androidx.work.impl.p016n.InterfaceC0764e;
import androidx.work.impl.p016n.InterfaceC0767h;
import androidx.work.impl.p016n.InterfaceC0770k;
import androidx.work.impl.p016n.InterfaceC0773n;
import androidx.work.impl.p016n.InterfaceC0776q;
import androidx.work.impl.p016n.InterfaceC0779t;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p024c.p082u.p083a.InterfaceC1008b;
import p024c.p082u.p083a.InterfaceC1009c;
import p024c.p082u.p083a.p084g.C1015c;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends AbstractC0651j {

    /* renamed from: a */
    private static final long f4525a = TimeUnit.DAYS.toMillis(1);

    /* renamed from: androidx.work.impl.WorkDatabase$a */
    class C0711a implements InterfaceC1009c.c {

        /* renamed from: a */
        final /* synthetic */ Context f4526a;

        C0711a(Context context) {
            this.f4526a = context;
        }

        @Override // p024c.p082u.p083a.InterfaceC1009c.c
        /* renamed from: a */
        public InterfaceC1009c mo4667a(InterfaceC1009c.b bVar) {
            InterfaceC1009c.b.a aVarM6465a = InterfaceC1009c.b.m6465a(this.f4526a);
            aVarM6465a.m6468c(bVar.f6691b).m6467b(bVar.f6692c).m6469d(true);
            return new C1015c().mo4667a(aVarM6465a.m6466a());
        }
    }

    /* renamed from: androidx.work.impl.WorkDatabase$b */
    class C0712b extends AbstractC0651j.b {
        C0712b() {
        }

        @Override // androidx.room.AbstractC0651j.b
        /* renamed from: c */
        public void mo4626c(InterfaceC1008b interfaceC1008b) {
            super.mo4626c(interfaceC1008b);
            interfaceC1008b.mo6458n();
            try {
                interfaceC1008b.mo6461v(WorkDatabase.m4848e());
                interfaceC1008b.mo6456j0();
            } finally {
                interfaceC1008b.mo6462z0();
            }
        }
    }

    /* renamed from: a */
    public static WorkDatabase m4845a(Context context, Executor executor, boolean z) {
        AbstractC0651j.a aVarM4614a;
        if (z) {
            aVarM4614a = C0650i.m4616c(context, WorkDatabase.class).m4619c();
        } else {
            aVarM4614a = C0650i.m4614a(context, WorkDatabase.class, C0736i.m4974d());
            aVarM4614a.m4622f(new C0711a(context));
        }
        return (WorkDatabase) aVarM4614a.m4623g(executor).m4617a(m4846c()).m4618b(C0735h.f4653a).m4618b(new C0735h.h(context, 2, 3)).m4618b(C0735h.f4654b).m4618b(C0735h.f4655c).m4618b(new C0735h.h(context, 5, 6)).m4618b(C0735h.f4656d).m4618b(C0735h.f4657e).m4618b(C0735h.f4658f).m4618b(new C0735h.i(context)).m4618b(new C0735h.h(context, 10, 11)).m4618b(C0735h.f4659g).m4621e().m4620d();
    }

    /* renamed from: c */
    static AbstractC0651j.b m4846c() {
        return new C0712b();
    }

    /* renamed from: d */
    static long m4847d() {
        return System.currentTimeMillis() - f4525a;
    }

    /* renamed from: e */
    static String m4848e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + m4847d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    /* renamed from: b */
    public abstract InterfaceC0761b mo4849b();

    /* renamed from: f */
    public abstract InterfaceC0764e mo4850f();

    /* renamed from: g */
    public abstract InterfaceC0767h mo4851g();

    /* renamed from: h */
    public abstract InterfaceC0770k mo4852h();

    /* renamed from: i */
    public abstract InterfaceC0773n mo4853i();

    /* renamed from: j */
    public abstract InterfaceC0776q mo4854j();

    /* renamed from: k */
    public abstract InterfaceC0779t mo4855k();
}
