package androidx.work.impl.p016n;

import android.database.Cursor;
import android.database.SQLException;
import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.AbstractC0658q;
import androidx.room.C0654m;
import androidx.room.p010t.C0662b;
import androidx.room.p010t.C0663c;
import androidx.room.p010t.C0666f;
import androidx.work.C0704c;
import androidx.work.C0706e;
import androidx.work.C0817x;
import androidx.work.impl.p016n.C0775p;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import java.util.ArrayList;
import java.util.List;
import p024c.p082u.p083a.InterfaceC1012f;

/* compiled from: WorkSpecDao_Impl.java */
/* renamed from: androidx.work.impl.n.r */
/* loaded from: classes.dex */
public final class C0777r implements InterfaceC0776q {

    /* renamed from: a */
    private final AbstractC0651j f4825a;

    /* renamed from: b */
    private final AbstractC0644c<C0775p> f4826b;

    /* renamed from: c */
    private final AbstractC0658q f4827c;

    /* renamed from: d */
    private final AbstractC0658q f4828d;

    /* renamed from: e */
    private final AbstractC0658q f4829e;

    /* renamed from: f */
    private final AbstractC0658q f4830f;

    /* renamed from: g */
    private final AbstractC0658q f4831g;

    /* renamed from: h */
    private final AbstractC0658q f4832h;

    /* renamed from: i */
    private final AbstractC0658q f4833i;

    /* renamed from: j */
    private final AbstractC0658q f4834j;

    /* compiled from: WorkSpecDao_Impl.java */
    /* renamed from: androidx.work.impl.n.r$a */
    class a extends AbstractC0644c<C0775p> {
        a(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0644c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC1012f interfaceC1012f, C0775p c0775p) throws Throwable {
            String str = c0775p.f4799c;
            if (str == null) {
                interfaceC1012f.mo4646I0(1);
            } else {
                interfaceC1012f.mo4654w(1, str);
            }
            interfaceC1012f.mo4652h0(2, C0781v.m5131j(c0775p.f4800d));
            String str2 = c0775p.f4801e;
            if (str2 == null) {
                interfaceC1012f.mo4646I0(3);
            } else {
                interfaceC1012f.mo4654w(3, str2);
            }
            String str3 = c0775p.f4802f;
            if (str3 == null) {
                interfaceC1012f.mo4646I0(4);
            } else {
                interfaceC1012f.mo4654w(4, str3);
            }
            byte[] bArrM4830l = C0706e.m4830l(c0775p.f4803g);
            if (bArrM4830l == null) {
                interfaceC1012f.mo4646I0(5);
            } else {
                interfaceC1012f.mo4653o0(5, bArrM4830l);
            }
            byte[] bArrM4830l2 = C0706e.m4830l(c0775p.f4804h);
            if (bArrM4830l2 == null) {
                interfaceC1012f.mo4646I0(6);
            } else {
                interfaceC1012f.mo4653o0(6, bArrM4830l2);
            }
            interfaceC1012f.mo4652h0(7, c0775p.f4805i);
            interfaceC1012f.mo4652h0(8, c0775p.f4806j);
            interfaceC1012f.mo4652h0(9, c0775p.f4807k);
            interfaceC1012f.mo4652h0(10, c0775p.f4809m);
            interfaceC1012f.mo4652h0(11, C0781v.m5122a(c0775p.f4810n));
            interfaceC1012f.mo4652h0(12, c0775p.f4811o);
            interfaceC1012f.mo4652h0(13, c0775p.f4812p);
            interfaceC1012f.mo4652h0(14, c0775p.f4813q);
            interfaceC1012f.mo4652h0(15, c0775p.f4814r);
            interfaceC1012f.mo4652h0(16, c0775p.f4815s ? 1L : 0L);
            interfaceC1012f.mo4652h0(17, C0781v.m5130i(c0775p.f4816t));
            C0704c c0704c = c0775p.f4808l;
            if (c0704c == null) {
                interfaceC1012f.mo4646I0(18);
                interfaceC1012f.mo4646I0(19);
                interfaceC1012f.mo4646I0(20);
                interfaceC1012f.mo4646I0(21);
                interfaceC1012f.mo4646I0(22);
                interfaceC1012f.mo4646I0(23);
                interfaceC1012f.mo4646I0(24);
                interfaceC1012f.mo4646I0(25);
                return;
            }
            interfaceC1012f.mo4652h0(18, C0781v.m5129h(c0704c.m4800b()));
            interfaceC1012f.mo4652h0(19, c0704c.m4805g() ? 1L : 0L);
            interfaceC1012f.mo4652h0(20, c0704c.m4806h() ? 1L : 0L);
            interfaceC1012f.mo4652h0(21, c0704c.m4804f() ? 1L : 0L);
            interfaceC1012f.mo4652h0(22, c0704c.m4807i() ? 1L : 0L);
            interfaceC1012f.mo4652h0(23, c0704c.m4801c());
            interfaceC1012f.mo4652h0(24, c0704c.m4802d());
            byte[] bArrM5124c = C0781v.m5124c(c0704c.m4799a());
            if (bArrM5124c == null) {
                interfaceC1012f.mo4646I0(25);
            } else {
                interfaceC1012f.mo4653o0(25, bArrM5124c);
            }
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* renamed from: androidx.work.impl.n.r$b */
    class b extends AbstractC0658q {
        b(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* renamed from: androidx.work.impl.n.r$c */
    class c extends AbstractC0658q {
        c(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* renamed from: androidx.work.impl.n.r$d */
    class d extends AbstractC0658q {
        d(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* renamed from: androidx.work.impl.n.r$e */
    class e extends AbstractC0658q {
        e(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* renamed from: androidx.work.impl.n.r$f */
    class f extends AbstractC0658q {
        f(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* renamed from: androidx.work.impl.n.r$g */
    class g extends AbstractC0658q {
        g(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* renamed from: androidx.work.impl.n.r$h */
    class h extends AbstractC0658q {
        h(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* renamed from: androidx.work.impl.n.r$i */
    class i extends AbstractC0658q {
        i(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public C0777r(AbstractC0651j abstractC0651j) {
        this.f4825a = abstractC0651j;
        this.f4826b = new a(abstractC0651j);
        this.f4827c = new b(abstractC0651j);
        this.f4828d = new c(abstractC0651j);
        this.f4829e = new d(abstractC0651j);
        this.f4830f = new e(abstractC0651j);
        this.f4831g = new f(abstractC0651j);
        this.f4832h = new g(abstractC0651j);
        this.f4833i = new h(abstractC0651j);
        this.f4834j = new i(abstractC0651j);
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: a */
    public int mo5098a(C0817x.a aVar, String... strArr) throws SQLException {
        this.f4825a.assertNotSuspendingTransaction();
        StringBuilder sbM4681b = C0666f.m4681b();
        sbM4681b.append("UPDATE workspec SET state=");
        sbM4681b.append("?");
        sbM4681b.append(" WHERE id IN (");
        C0666f.m4680a(sbM4681b, strArr.length);
        sbM4681b.append(")");
        InterfaceC1012f interfaceC1012fCompileStatement = this.f4825a.compileStatement(sbM4681b.toString());
        interfaceC1012fCompileStatement.mo4652h0(1, C0781v.m5131j(aVar));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                interfaceC1012fCompileStatement.mo4646I0(i2);
            } else {
                interfaceC1012fCompileStatement.mo4654w(i2, str);
            }
            i2++;
        }
        this.f4825a.beginTransaction();
        try {
            int iMo6470E = interfaceC1012fCompileStatement.mo6470E();
            this.f4825a.setTransactionSuccessful();
            return iMo6470E;
        } finally {
            this.f4825a.endTransaction();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: b */
    public int mo5099b(String str, long j2) throws SQLException {
        this.f4825a.assertNotSuspendingTransaction();
        InterfaceC1012f interfaceC1012fAcquire = this.f4832h.acquire();
        interfaceC1012fAcquire.mo4652h0(1, j2);
        if (str == null) {
            interfaceC1012fAcquire.mo4646I0(2);
        } else {
            interfaceC1012fAcquire.mo4654w(2, str);
        }
        this.f4825a.beginTransaction();
        try {
            int iMo6470E = interfaceC1012fAcquire.mo6470E();
            this.f4825a.setTransactionSuccessful();
            return iMo6470E;
        } finally {
            this.f4825a.endTransaction();
            this.f4832h.release(interfaceC1012fAcquire);
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: c */
    public List<C0775p.b> mo5100c(String str) {
        C0654m c0654mM4644c = C0654m.m4644c("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        this.f4825a.assertNotSuspendingTransaction();
        Cursor cursorM4675b = C0663c.m4675b(this.f4825a, c0654mM4644c, false, null);
        try {
            int iM4673b = C0662b.m4673b(cursorM4675b, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
            int iM4673b2 = C0662b.m4673b(cursorM4675b, "state");
            ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
            while (cursorM4675b.moveToNext()) {
                C0775p.b bVar = new C0775p.b();
                bVar.f4817a = cursorM4675b.getString(iM4673b);
                bVar.f4818b = C0781v.m5128g(cursorM4675b.getInt(iM4673b2));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            cursorM4675b.close();
            c0654mM4644c.m4651f();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: d */
    public List<C0775p> mo5101d(long j2) throws Throwable {
        C0654m c0654m;
        int iM4673b;
        int iM4673b2;
        int iM4673b3;
        int iM4673b4;
        int iM4673b5;
        int iM4673b6;
        int iM4673b7;
        int iM4673b8;
        int iM4673b9;
        int iM4673b10;
        int iM4673b11;
        int iM4673b12;
        int iM4673b13;
        int iM4673b14;
        C0654m c0654mM4644c = C0654m.m4644c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        c0654mM4644c.mo4652h0(1, j2);
        this.f4825a.assertNotSuspendingTransaction();
        Cursor cursorM4675b = C0663c.m4675b(this.f4825a, c0654mM4644c, false, null);
        try {
            iM4673b = C0662b.m4673b(cursorM4675b, "required_network_type");
            iM4673b2 = C0662b.m4673b(cursorM4675b, "requires_charging");
            iM4673b3 = C0662b.m4673b(cursorM4675b, "requires_device_idle");
            iM4673b4 = C0662b.m4673b(cursorM4675b, "requires_battery_not_low");
            iM4673b5 = C0662b.m4673b(cursorM4675b, "requires_storage_not_low");
            iM4673b6 = C0662b.m4673b(cursorM4675b, "trigger_content_update_delay");
            iM4673b7 = C0662b.m4673b(cursorM4675b, "trigger_max_content_delay");
            iM4673b8 = C0662b.m4673b(cursorM4675b, "content_uri_triggers");
            iM4673b9 = C0662b.m4673b(cursorM4675b, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
            iM4673b10 = C0662b.m4673b(cursorM4675b, "state");
            iM4673b11 = C0662b.m4673b(cursorM4675b, "worker_class_name");
            iM4673b12 = C0662b.m4673b(cursorM4675b, "input_merger_class_name");
            iM4673b13 = C0662b.m4673b(cursorM4675b, "input");
            iM4673b14 = C0662b.m4673b(cursorM4675b, "output");
            c0654m = c0654mM4644c;
        } catch (Throwable th) {
            th = th;
            c0654m = c0654mM4644c;
        }
        try {
            int iM4673b15 = C0662b.m4673b(cursorM4675b, "initial_delay");
            int iM4673b16 = C0662b.m4673b(cursorM4675b, "interval_duration");
            int iM4673b17 = C0662b.m4673b(cursorM4675b, "flex_duration");
            int iM4673b18 = C0662b.m4673b(cursorM4675b, "run_attempt_count");
            int iM4673b19 = C0662b.m4673b(cursorM4675b, "backoff_policy");
            int iM4673b20 = C0662b.m4673b(cursorM4675b, "backoff_delay_duration");
            int iM4673b21 = C0662b.m4673b(cursorM4675b, "period_start_time");
            int iM4673b22 = C0662b.m4673b(cursorM4675b, "minimum_retention_duration");
            int iM4673b23 = C0662b.m4673b(cursorM4675b, "schedule_requested_at");
            int iM4673b24 = C0662b.m4673b(cursorM4675b, "run_in_foreground");
            int iM4673b25 = C0662b.m4673b(cursorM4675b, "out_of_quota_policy");
            int i2 = iM4673b14;
            ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
            while (cursorM4675b.moveToNext()) {
                String string = cursorM4675b.getString(iM4673b9);
                int i3 = iM4673b9;
                String string2 = cursorM4675b.getString(iM4673b11);
                int i4 = iM4673b11;
                C0704c c0704c = new C0704c();
                int i5 = iM4673b;
                c0704c.m4809k(C0781v.m5126e(cursorM4675b.getInt(iM4673b)));
                c0704c.m4811m(cursorM4675b.getInt(iM4673b2) != 0);
                c0704c.m4812n(cursorM4675b.getInt(iM4673b3) != 0);
                c0704c.m4810l(cursorM4675b.getInt(iM4673b4) != 0);
                c0704c.m4813o(cursorM4675b.getInt(iM4673b5) != 0);
                int i6 = iM4673b2;
                int i7 = iM4673b3;
                c0704c.m4814p(cursorM4675b.getLong(iM4673b6));
                c0704c.m4815q(cursorM4675b.getLong(iM4673b7));
                c0704c.m4808j(C0781v.m5123b(cursorM4675b.getBlob(iM4673b8)));
                C0775p c0775p = new C0775p(string, string2);
                c0775p.f4800d = C0781v.m5128g(cursorM4675b.getInt(iM4673b10));
                c0775p.f4802f = cursorM4675b.getString(iM4673b12);
                c0775p.f4803g = C0706e.m4829g(cursorM4675b.getBlob(iM4673b13));
                int i8 = i2;
                c0775p.f4804h = C0706e.m4829g(cursorM4675b.getBlob(i8));
                int i9 = iM4673b15;
                i2 = i8;
                c0775p.f4805i = cursorM4675b.getLong(i9);
                int i10 = iM4673b12;
                int i11 = iM4673b16;
                c0775p.f4806j = cursorM4675b.getLong(i11);
                int i12 = iM4673b4;
                int i13 = iM4673b17;
                c0775p.f4807k = cursorM4675b.getLong(i13);
                int i14 = iM4673b18;
                c0775p.f4809m = cursorM4675b.getInt(i14);
                int i15 = iM4673b19;
                c0775p.f4810n = C0781v.m5125d(cursorM4675b.getInt(i15));
                iM4673b17 = i13;
                int i16 = iM4673b20;
                c0775p.f4811o = cursorM4675b.getLong(i16);
                int i17 = iM4673b21;
                c0775p.f4812p = cursorM4675b.getLong(i17);
                iM4673b21 = i17;
                int i18 = iM4673b22;
                c0775p.f4813q = cursorM4675b.getLong(i18);
                int i19 = iM4673b23;
                c0775p.f4814r = cursorM4675b.getLong(i19);
                int i20 = iM4673b24;
                c0775p.f4815s = cursorM4675b.getInt(i20) != 0;
                int i21 = iM4673b25;
                c0775p.f4816t = C0781v.m5127f(cursorM4675b.getInt(i21));
                c0775p.f4808l = c0704c;
                arrayList.add(c0775p);
                iM4673b2 = i6;
                iM4673b25 = i21;
                iM4673b12 = i10;
                iM4673b15 = i9;
                iM4673b16 = i11;
                iM4673b18 = i14;
                iM4673b23 = i19;
                iM4673b9 = i3;
                iM4673b11 = i4;
                iM4673b = i5;
                iM4673b24 = i20;
                iM4673b22 = i18;
                iM4673b3 = i7;
                iM4673b20 = i16;
                iM4673b4 = i12;
                iM4673b19 = i15;
            }
            cursorM4675b.close();
            c0654m.m4651f();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorM4675b.close();
            c0654m.m4651f();
            throw th;
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    public void delete(String str) throws SQLException {
        this.f4825a.assertNotSuspendingTransaction();
        InterfaceC1012f interfaceC1012fAcquire = this.f4827c.acquire();
        if (str == null) {
            interfaceC1012fAcquire.mo4646I0(1);
        } else {
            interfaceC1012fAcquire.mo4654w(1, str);
        }
        this.f4825a.beginTransaction();
        try {
            interfaceC1012fAcquire.mo6470E();
            this.f4825a.setTransactionSuccessful();
        } finally {
            this.f4825a.endTransaction();
            this.f4827c.release(interfaceC1012fAcquire);
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: e */
    public List<C0775p> mo5102e(int i2) throws Throwable {
        C0654m c0654m;
        int iM4673b;
        int iM4673b2;
        int iM4673b3;
        int iM4673b4;
        int iM4673b5;
        int iM4673b6;
        int iM4673b7;
        int iM4673b8;
        int iM4673b9;
        int iM4673b10;
        int iM4673b11;
        int iM4673b12;
        int iM4673b13;
        int iM4673b14;
        C0654m c0654mM4644c = C0654m.m4644c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        c0654mM4644c.mo4652h0(1, i2);
        this.f4825a.assertNotSuspendingTransaction();
        Cursor cursorM4675b = C0663c.m4675b(this.f4825a, c0654mM4644c, false, null);
        try {
            iM4673b = C0662b.m4673b(cursorM4675b, "required_network_type");
            iM4673b2 = C0662b.m4673b(cursorM4675b, "requires_charging");
            iM4673b3 = C0662b.m4673b(cursorM4675b, "requires_device_idle");
            iM4673b4 = C0662b.m4673b(cursorM4675b, "requires_battery_not_low");
            iM4673b5 = C0662b.m4673b(cursorM4675b, "requires_storage_not_low");
            iM4673b6 = C0662b.m4673b(cursorM4675b, "trigger_content_update_delay");
            iM4673b7 = C0662b.m4673b(cursorM4675b, "trigger_max_content_delay");
            iM4673b8 = C0662b.m4673b(cursorM4675b, "content_uri_triggers");
            iM4673b9 = C0662b.m4673b(cursorM4675b, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
            iM4673b10 = C0662b.m4673b(cursorM4675b, "state");
            iM4673b11 = C0662b.m4673b(cursorM4675b, "worker_class_name");
            iM4673b12 = C0662b.m4673b(cursorM4675b, "input_merger_class_name");
            iM4673b13 = C0662b.m4673b(cursorM4675b, "input");
            iM4673b14 = C0662b.m4673b(cursorM4675b, "output");
            c0654m = c0654mM4644c;
        } catch (Throwable th) {
            th = th;
            c0654m = c0654mM4644c;
        }
        try {
            int iM4673b15 = C0662b.m4673b(cursorM4675b, "initial_delay");
            int iM4673b16 = C0662b.m4673b(cursorM4675b, "interval_duration");
            int iM4673b17 = C0662b.m4673b(cursorM4675b, "flex_duration");
            int iM4673b18 = C0662b.m4673b(cursorM4675b, "run_attempt_count");
            int iM4673b19 = C0662b.m4673b(cursorM4675b, "backoff_policy");
            int iM4673b20 = C0662b.m4673b(cursorM4675b, "backoff_delay_duration");
            int iM4673b21 = C0662b.m4673b(cursorM4675b, "period_start_time");
            int iM4673b22 = C0662b.m4673b(cursorM4675b, "minimum_retention_duration");
            int iM4673b23 = C0662b.m4673b(cursorM4675b, "schedule_requested_at");
            int iM4673b24 = C0662b.m4673b(cursorM4675b, "run_in_foreground");
            int iM4673b25 = C0662b.m4673b(cursorM4675b, "out_of_quota_policy");
            int i3 = iM4673b14;
            ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
            while (cursorM4675b.moveToNext()) {
                String string = cursorM4675b.getString(iM4673b9);
                int i4 = iM4673b9;
                String string2 = cursorM4675b.getString(iM4673b11);
                int i5 = iM4673b11;
                C0704c c0704c = new C0704c();
                int i6 = iM4673b;
                c0704c.m4809k(C0781v.m5126e(cursorM4675b.getInt(iM4673b)));
                c0704c.m4811m(cursorM4675b.getInt(iM4673b2) != 0);
                c0704c.m4812n(cursorM4675b.getInt(iM4673b3) != 0);
                c0704c.m4810l(cursorM4675b.getInt(iM4673b4) != 0);
                c0704c.m4813o(cursorM4675b.getInt(iM4673b5) != 0);
                int i7 = iM4673b2;
                int i8 = iM4673b3;
                c0704c.m4814p(cursorM4675b.getLong(iM4673b6));
                c0704c.m4815q(cursorM4675b.getLong(iM4673b7));
                c0704c.m4808j(C0781v.m5123b(cursorM4675b.getBlob(iM4673b8)));
                C0775p c0775p = new C0775p(string, string2);
                c0775p.f4800d = C0781v.m5128g(cursorM4675b.getInt(iM4673b10));
                c0775p.f4802f = cursorM4675b.getString(iM4673b12);
                c0775p.f4803g = C0706e.m4829g(cursorM4675b.getBlob(iM4673b13));
                int i9 = i3;
                c0775p.f4804h = C0706e.m4829g(cursorM4675b.getBlob(i9));
                i3 = i9;
                int i10 = iM4673b15;
                c0775p.f4805i = cursorM4675b.getLong(i10);
                int i11 = iM4673b12;
                int i12 = iM4673b16;
                c0775p.f4806j = cursorM4675b.getLong(i12);
                int i13 = iM4673b4;
                int i14 = iM4673b17;
                c0775p.f4807k = cursorM4675b.getLong(i14);
                int i15 = iM4673b18;
                c0775p.f4809m = cursorM4675b.getInt(i15);
                int i16 = iM4673b19;
                c0775p.f4810n = C0781v.m5125d(cursorM4675b.getInt(i16));
                iM4673b17 = i14;
                int i17 = iM4673b20;
                c0775p.f4811o = cursorM4675b.getLong(i17);
                int i18 = iM4673b21;
                c0775p.f4812p = cursorM4675b.getLong(i18);
                iM4673b21 = i18;
                int i19 = iM4673b22;
                c0775p.f4813q = cursorM4675b.getLong(i19);
                int i20 = iM4673b23;
                c0775p.f4814r = cursorM4675b.getLong(i20);
                int i21 = iM4673b24;
                c0775p.f4815s = cursorM4675b.getInt(i21) != 0;
                int i22 = iM4673b25;
                c0775p.f4816t = C0781v.m5127f(cursorM4675b.getInt(i22));
                c0775p.f4808l = c0704c;
                arrayList.add(c0775p);
                iM4673b25 = i22;
                iM4673b2 = i7;
                iM4673b12 = i11;
                iM4673b15 = i10;
                iM4673b16 = i12;
                iM4673b18 = i15;
                iM4673b23 = i20;
                iM4673b9 = i4;
                iM4673b11 = i5;
                iM4673b = i6;
                iM4673b24 = i21;
                iM4673b22 = i19;
                iM4673b3 = i8;
                iM4673b20 = i17;
                iM4673b4 = i13;
                iM4673b19 = i16;
            }
            cursorM4675b.close();
            c0654m.m4651f();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorM4675b.close();
            c0654m.m4651f();
            throw th;
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: f */
    public void mo5103f(C0775p c0775p) throws SQLException {
        this.f4825a.assertNotSuspendingTransaction();
        this.f4825a.beginTransaction();
        try {
            this.f4826b.insert((AbstractC0644c<C0775p>) c0775p);
            this.f4825a.setTransactionSuccessful();
        } finally {
            this.f4825a.endTransaction();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: g */
    public List<C0775p> mo5104g() throws Throwable {
        C0654m c0654m;
        int iM4673b;
        int iM4673b2;
        int iM4673b3;
        int iM4673b4;
        int iM4673b5;
        int iM4673b6;
        int iM4673b7;
        int iM4673b8;
        int iM4673b9;
        int iM4673b10;
        int iM4673b11;
        int iM4673b12;
        int iM4673b13;
        int iM4673b14;
        C0654m c0654mM4644c = C0654m.m4644c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f4825a.assertNotSuspendingTransaction();
        Cursor cursorM4675b = C0663c.m4675b(this.f4825a, c0654mM4644c, false, null);
        try {
            iM4673b = C0662b.m4673b(cursorM4675b, "required_network_type");
            iM4673b2 = C0662b.m4673b(cursorM4675b, "requires_charging");
            iM4673b3 = C0662b.m4673b(cursorM4675b, "requires_device_idle");
            iM4673b4 = C0662b.m4673b(cursorM4675b, "requires_battery_not_low");
            iM4673b5 = C0662b.m4673b(cursorM4675b, "requires_storage_not_low");
            iM4673b6 = C0662b.m4673b(cursorM4675b, "trigger_content_update_delay");
            iM4673b7 = C0662b.m4673b(cursorM4675b, "trigger_max_content_delay");
            iM4673b8 = C0662b.m4673b(cursorM4675b, "content_uri_triggers");
            iM4673b9 = C0662b.m4673b(cursorM4675b, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
            iM4673b10 = C0662b.m4673b(cursorM4675b, "state");
            iM4673b11 = C0662b.m4673b(cursorM4675b, "worker_class_name");
            iM4673b12 = C0662b.m4673b(cursorM4675b, "input_merger_class_name");
            iM4673b13 = C0662b.m4673b(cursorM4675b, "input");
            iM4673b14 = C0662b.m4673b(cursorM4675b, "output");
            c0654m = c0654mM4644c;
        } catch (Throwable th) {
            th = th;
            c0654m = c0654mM4644c;
        }
        try {
            int iM4673b15 = C0662b.m4673b(cursorM4675b, "initial_delay");
            int iM4673b16 = C0662b.m4673b(cursorM4675b, "interval_duration");
            int iM4673b17 = C0662b.m4673b(cursorM4675b, "flex_duration");
            int iM4673b18 = C0662b.m4673b(cursorM4675b, "run_attempt_count");
            int iM4673b19 = C0662b.m4673b(cursorM4675b, "backoff_policy");
            int iM4673b20 = C0662b.m4673b(cursorM4675b, "backoff_delay_duration");
            int iM4673b21 = C0662b.m4673b(cursorM4675b, "period_start_time");
            int iM4673b22 = C0662b.m4673b(cursorM4675b, "minimum_retention_duration");
            int iM4673b23 = C0662b.m4673b(cursorM4675b, "schedule_requested_at");
            int iM4673b24 = C0662b.m4673b(cursorM4675b, "run_in_foreground");
            int iM4673b25 = C0662b.m4673b(cursorM4675b, "out_of_quota_policy");
            int i2 = iM4673b14;
            ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
            while (cursorM4675b.moveToNext()) {
                String string = cursorM4675b.getString(iM4673b9);
                int i3 = iM4673b9;
                String string2 = cursorM4675b.getString(iM4673b11);
                int i4 = iM4673b11;
                C0704c c0704c = new C0704c();
                int i5 = iM4673b;
                c0704c.m4809k(C0781v.m5126e(cursorM4675b.getInt(iM4673b)));
                c0704c.m4811m(cursorM4675b.getInt(iM4673b2) != 0);
                c0704c.m4812n(cursorM4675b.getInt(iM4673b3) != 0);
                c0704c.m4810l(cursorM4675b.getInt(iM4673b4) != 0);
                c0704c.m4813o(cursorM4675b.getInt(iM4673b5) != 0);
                int i6 = iM4673b2;
                int i7 = iM4673b3;
                c0704c.m4814p(cursorM4675b.getLong(iM4673b6));
                c0704c.m4815q(cursorM4675b.getLong(iM4673b7));
                c0704c.m4808j(C0781v.m5123b(cursorM4675b.getBlob(iM4673b8)));
                C0775p c0775p = new C0775p(string, string2);
                c0775p.f4800d = C0781v.m5128g(cursorM4675b.getInt(iM4673b10));
                c0775p.f4802f = cursorM4675b.getString(iM4673b12);
                c0775p.f4803g = C0706e.m4829g(cursorM4675b.getBlob(iM4673b13));
                int i8 = i2;
                c0775p.f4804h = C0706e.m4829g(cursorM4675b.getBlob(i8));
                i2 = i8;
                int i9 = iM4673b15;
                c0775p.f4805i = cursorM4675b.getLong(i9);
                int i10 = iM4673b13;
                int i11 = iM4673b16;
                c0775p.f4806j = cursorM4675b.getLong(i11);
                int i12 = iM4673b4;
                int i13 = iM4673b17;
                c0775p.f4807k = cursorM4675b.getLong(i13);
                int i14 = iM4673b18;
                c0775p.f4809m = cursorM4675b.getInt(i14);
                int i15 = iM4673b19;
                c0775p.f4810n = C0781v.m5125d(cursorM4675b.getInt(i15));
                iM4673b17 = i13;
                int i16 = iM4673b20;
                c0775p.f4811o = cursorM4675b.getLong(i16);
                int i17 = iM4673b21;
                c0775p.f4812p = cursorM4675b.getLong(i17);
                iM4673b21 = i17;
                int i18 = iM4673b22;
                c0775p.f4813q = cursorM4675b.getLong(i18);
                int i19 = iM4673b23;
                c0775p.f4814r = cursorM4675b.getLong(i19);
                int i20 = iM4673b24;
                c0775p.f4815s = cursorM4675b.getInt(i20) != 0;
                int i21 = iM4673b25;
                c0775p.f4816t = C0781v.m5127f(cursorM4675b.getInt(i21));
                c0775p.f4808l = c0704c;
                arrayList.add(c0775p);
                iM4673b25 = i21;
                iM4673b2 = i6;
                iM4673b13 = i10;
                iM4673b15 = i9;
                iM4673b16 = i11;
                iM4673b18 = i14;
                iM4673b23 = i19;
                iM4673b9 = i3;
                iM4673b11 = i4;
                iM4673b = i5;
                iM4673b24 = i20;
                iM4673b22 = i18;
                iM4673b3 = i7;
                iM4673b20 = i16;
                iM4673b4 = i12;
                iM4673b19 = i15;
            }
            cursorM4675b.close();
            c0654m.m4651f();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorM4675b.close();
            c0654m.m4651f();
            throw th;
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: h */
    public void mo5105h(String str, C0706e c0706e) throws Throwable {
        this.f4825a.assertNotSuspendingTransaction();
        InterfaceC1012f interfaceC1012fAcquire = this.f4828d.acquire();
        byte[] bArrM4830l = C0706e.m4830l(c0706e);
        if (bArrM4830l == null) {
            interfaceC1012fAcquire.mo4646I0(1);
        } else {
            interfaceC1012fAcquire.mo4653o0(1, bArrM4830l);
        }
        if (str == null) {
            interfaceC1012fAcquire.mo4646I0(2);
        } else {
            interfaceC1012fAcquire.mo4654w(2, str);
        }
        this.f4825a.beginTransaction();
        try {
            interfaceC1012fAcquire.mo6470E();
            this.f4825a.setTransactionSuccessful();
        } finally {
            this.f4825a.endTransaction();
            this.f4828d.release(interfaceC1012fAcquire);
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: i */
    public List<C0775p> mo5106i() throws Throwable {
        C0654m c0654m;
        int iM4673b;
        int iM4673b2;
        int iM4673b3;
        int iM4673b4;
        int iM4673b5;
        int iM4673b6;
        int iM4673b7;
        int iM4673b8;
        int iM4673b9;
        int iM4673b10;
        int iM4673b11;
        int iM4673b12;
        int iM4673b13;
        int iM4673b14;
        C0654m c0654mM4644c = C0654m.m4644c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f4825a.assertNotSuspendingTransaction();
        Cursor cursorM4675b = C0663c.m4675b(this.f4825a, c0654mM4644c, false, null);
        try {
            iM4673b = C0662b.m4673b(cursorM4675b, "required_network_type");
            iM4673b2 = C0662b.m4673b(cursorM4675b, "requires_charging");
            iM4673b3 = C0662b.m4673b(cursorM4675b, "requires_device_idle");
            iM4673b4 = C0662b.m4673b(cursorM4675b, "requires_battery_not_low");
            iM4673b5 = C0662b.m4673b(cursorM4675b, "requires_storage_not_low");
            iM4673b6 = C0662b.m4673b(cursorM4675b, "trigger_content_update_delay");
            iM4673b7 = C0662b.m4673b(cursorM4675b, "trigger_max_content_delay");
            iM4673b8 = C0662b.m4673b(cursorM4675b, "content_uri_triggers");
            iM4673b9 = C0662b.m4673b(cursorM4675b, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
            iM4673b10 = C0662b.m4673b(cursorM4675b, "state");
            iM4673b11 = C0662b.m4673b(cursorM4675b, "worker_class_name");
            iM4673b12 = C0662b.m4673b(cursorM4675b, "input_merger_class_name");
            iM4673b13 = C0662b.m4673b(cursorM4675b, "input");
            iM4673b14 = C0662b.m4673b(cursorM4675b, "output");
            c0654m = c0654mM4644c;
        } catch (Throwable th) {
            th = th;
            c0654m = c0654mM4644c;
        }
        try {
            int iM4673b15 = C0662b.m4673b(cursorM4675b, "initial_delay");
            int iM4673b16 = C0662b.m4673b(cursorM4675b, "interval_duration");
            int iM4673b17 = C0662b.m4673b(cursorM4675b, "flex_duration");
            int iM4673b18 = C0662b.m4673b(cursorM4675b, "run_attempt_count");
            int iM4673b19 = C0662b.m4673b(cursorM4675b, "backoff_policy");
            int iM4673b20 = C0662b.m4673b(cursorM4675b, "backoff_delay_duration");
            int iM4673b21 = C0662b.m4673b(cursorM4675b, "period_start_time");
            int iM4673b22 = C0662b.m4673b(cursorM4675b, "minimum_retention_duration");
            int iM4673b23 = C0662b.m4673b(cursorM4675b, "schedule_requested_at");
            int iM4673b24 = C0662b.m4673b(cursorM4675b, "run_in_foreground");
            int iM4673b25 = C0662b.m4673b(cursorM4675b, "out_of_quota_policy");
            int i2 = iM4673b14;
            ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
            while (cursorM4675b.moveToNext()) {
                String string = cursorM4675b.getString(iM4673b9);
                int i3 = iM4673b9;
                String string2 = cursorM4675b.getString(iM4673b11);
                int i4 = iM4673b11;
                C0704c c0704c = new C0704c();
                int i5 = iM4673b;
                c0704c.m4809k(C0781v.m5126e(cursorM4675b.getInt(iM4673b)));
                c0704c.m4811m(cursorM4675b.getInt(iM4673b2) != 0);
                c0704c.m4812n(cursorM4675b.getInt(iM4673b3) != 0);
                c0704c.m4810l(cursorM4675b.getInt(iM4673b4) != 0);
                c0704c.m4813o(cursorM4675b.getInt(iM4673b5) != 0);
                int i6 = iM4673b2;
                int i7 = iM4673b3;
                c0704c.m4814p(cursorM4675b.getLong(iM4673b6));
                c0704c.m4815q(cursorM4675b.getLong(iM4673b7));
                c0704c.m4808j(C0781v.m5123b(cursorM4675b.getBlob(iM4673b8)));
                C0775p c0775p = new C0775p(string, string2);
                c0775p.f4800d = C0781v.m5128g(cursorM4675b.getInt(iM4673b10));
                c0775p.f4802f = cursorM4675b.getString(iM4673b12);
                c0775p.f4803g = C0706e.m4829g(cursorM4675b.getBlob(iM4673b13));
                int i8 = i2;
                c0775p.f4804h = C0706e.m4829g(cursorM4675b.getBlob(i8));
                i2 = i8;
                int i9 = iM4673b15;
                c0775p.f4805i = cursorM4675b.getLong(i9);
                int i10 = iM4673b13;
                int i11 = iM4673b16;
                c0775p.f4806j = cursorM4675b.getLong(i11);
                int i12 = iM4673b4;
                int i13 = iM4673b17;
                c0775p.f4807k = cursorM4675b.getLong(i13);
                int i14 = iM4673b18;
                c0775p.f4809m = cursorM4675b.getInt(i14);
                int i15 = iM4673b19;
                c0775p.f4810n = C0781v.m5125d(cursorM4675b.getInt(i15));
                iM4673b17 = i13;
                int i16 = iM4673b20;
                c0775p.f4811o = cursorM4675b.getLong(i16);
                int i17 = iM4673b21;
                c0775p.f4812p = cursorM4675b.getLong(i17);
                iM4673b21 = i17;
                int i18 = iM4673b22;
                c0775p.f4813q = cursorM4675b.getLong(i18);
                int i19 = iM4673b23;
                c0775p.f4814r = cursorM4675b.getLong(i19);
                int i20 = iM4673b24;
                c0775p.f4815s = cursorM4675b.getInt(i20) != 0;
                int i21 = iM4673b25;
                c0775p.f4816t = C0781v.m5127f(cursorM4675b.getInt(i21));
                c0775p.f4808l = c0704c;
                arrayList.add(c0775p);
                iM4673b25 = i21;
                iM4673b2 = i6;
                iM4673b13 = i10;
                iM4673b15 = i9;
                iM4673b16 = i11;
                iM4673b18 = i14;
                iM4673b23 = i19;
                iM4673b9 = i3;
                iM4673b11 = i4;
                iM4673b = i5;
                iM4673b24 = i20;
                iM4673b22 = i18;
                iM4673b3 = i7;
                iM4673b20 = i16;
                iM4673b4 = i12;
                iM4673b19 = i15;
            }
            cursorM4675b.close();
            c0654m.m4651f();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorM4675b.close();
            c0654m.m4651f();
            throw th;
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: j */
    public boolean mo5107j() {
        boolean z = false;
        C0654m c0654mM4644c = C0654m.m4644c("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f4825a.assertNotSuspendingTransaction();
        Cursor cursorM4675b = C0663c.m4675b(this.f4825a, c0654mM4644c, false, null);
        try {
            if (cursorM4675b.moveToFirst()) {
                if (cursorM4675b.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            cursorM4675b.close();
            c0654mM4644c.m4651f();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: k */
    public List<String> mo5108k(String str) {
        C0654m c0654mM4644c = C0654m.m4644c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        this.f4825a.assertNotSuspendingTransaction();
        Cursor cursorM4675b = C0663c.m4675b(this.f4825a, c0654mM4644c, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
            while (cursorM4675b.moveToNext()) {
                arrayList.add(cursorM4675b.getString(0));
            }
            return arrayList;
        } finally {
            cursorM4675b.close();
            c0654mM4644c.m4651f();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: l */
    public C0817x.a mo5109l(String str) {
        C0654m c0654mM4644c = C0654m.m4644c("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        this.f4825a.assertNotSuspendingTransaction();
        Cursor cursorM4675b = C0663c.m4675b(this.f4825a, c0654mM4644c, false, null);
        try {
            return cursorM4675b.moveToFirst() ? C0781v.m5128g(cursorM4675b.getInt(0)) : null;
        } finally {
            cursorM4675b.close();
            c0654mM4644c.m4651f();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: m */
    public C0775p mo5110m(String str) throws Throwable {
        C0654m c0654m;
        int iM4673b;
        int iM4673b2;
        int iM4673b3;
        int iM4673b4;
        int iM4673b5;
        int iM4673b6;
        int iM4673b7;
        int iM4673b8;
        int iM4673b9;
        int iM4673b10;
        int iM4673b11;
        int iM4673b12;
        int iM4673b13;
        int iM4673b14;
        C0775p c0775p;
        C0654m c0654mM4644c = C0654m.m4644c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        this.f4825a.assertNotSuspendingTransaction();
        Cursor cursorM4675b = C0663c.m4675b(this.f4825a, c0654mM4644c, false, null);
        try {
            iM4673b = C0662b.m4673b(cursorM4675b, "required_network_type");
            iM4673b2 = C0662b.m4673b(cursorM4675b, "requires_charging");
            iM4673b3 = C0662b.m4673b(cursorM4675b, "requires_device_idle");
            iM4673b4 = C0662b.m4673b(cursorM4675b, "requires_battery_not_low");
            iM4673b5 = C0662b.m4673b(cursorM4675b, "requires_storage_not_low");
            iM4673b6 = C0662b.m4673b(cursorM4675b, "trigger_content_update_delay");
            iM4673b7 = C0662b.m4673b(cursorM4675b, "trigger_max_content_delay");
            iM4673b8 = C0662b.m4673b(cursorM4675b, "content_uri_triggers");
            iM4673b9 = C0662b.m4673b(cursorM4675b, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
            iM4673b10 = C0662b.m4673b(cursorM4675b, "state");
            iM4673b11 = C0662b.m4673b(cursorM4675b, "worker_class_name");
            iM4673b12 = C0662b.m4673b(cursorM4675b, "input_merger_class_name");
            iM4673b13 = C0662b.m4673b(cursorM4675b, "input");
            iM4673b14 = C0662b.m4673b(cursorM4675b, "output");
            c0654m = c0654mM4644c;
        } catch (Throwable th) {
            th = th;
            c0654m = c0654mM4644c;
        }
        try {
            int iM4673b15 = C0662b.m4673b(cursorM4675b, "initial_delay");
            int iM4673b16 = C0662b.m4673b(cursorM4675b, "interval_duration");
            int iM4673b17 = C0662b.m4673b(cursorM4675b, "flex_duration");
            int iM4673b18 = C0662b.m4673b(cursorM4675b, "run_attempt_count");
            int iM4673b19 = C0662b.m4673b(cursorM4675b, "backoff_policy");
            int iM4673b20 = C0662b.m4673b(cursorM4675b, "backoff_delay_duration");
            int iM4673b21 = C0662b.m4673b(cursorM4675b, "period_start_time");
            int iM4673b22 = C0662b.m4673b(cursorM4675b, "minimum_retention_duration");
            int iM4673b23 = C0662b.m4673b(cursorM4675b, "schedule_requested_at");
            int iM4673b24 = C0662b.m4673b(cursorM4675b, "run_in_foreground");
            int iM4673b25 = C0662b.m4673b(cursorM4675b, "out_of_quota_policy");
            if (cursorM4675b.moveToFirst()) {
                String string = cursorM4675b.getString(iM4673b9);
                String string2 = cursorM4675b.getString(iM4673b11);
                C0704c c0704c = new C0704c();
                c0704c.m4809k(C0781v.m5126e(cursorM4675b.getInt(iM4673b)));
                c0704c.m4811m(cursorM4675b.getInt(iM4673b2) != 0);
                c0704c.m4812n(cursorM4675b.getInt(iM4673b3) != 0);
                c0704c.m4810l(cursorM4675b.getInt(iM4673b4) != 0);
                c0704c.m4813o(cursorM4675b.getInt(iM4673b5) != 0);
                c0704c.m4814p(cursorM4675b.getLong(iM4673b6));
                c0704c.m4815q(cursorM4675b.getLong(iM4673b7));
                c0704c.m4808j(C0781v.m5123b(cursorM4675b.getBlob(iM4673b8)));
                C0775p c0775p2 = new C0775p(string, string2);
                c0775p2.f4800d = C0781v.m5128g(cursorM4675b.getInt(iM4673b10));
                c0775p2.f4802f = cursorM4675b.getString(iM4673b12);
                c0775p2.f4803g = C0706e.m4829g(cursorM4675b.getBlob(iM4673b13));
                c0775p2.f4804h = C0706e.m4829g(cursorM4675b.getBlob(iM4673b14));
                c0775p2.f4805i = cursorM4675b.getLong(iM4673b15);
                c0775p2.f4806j = cursorM4675b.getLong(iM4673b16);
                c0775p2.f4807k = cursorM4675b.getLong(iM4673b17);
                c0775p2.f4809m = cursorM4675b.getInt(iM4673b18);
                c0775p2.f4810n = C0781v.m5125d(cursorM4675b.getInt(iM4673b19));
                c0775p2.f4811o = cursorM4675b.getLong(iM4673b20);
                c0775p2.f4812p = cursorM4675b.getLong(iM4673b21);
                c0775p2.f4813q = cursorM4675b.getLong(iM4673b22);
                c0775p2.f4814r = cursorM4675b.getLong(iM4673b23);
                c0775p2.f4815s = cursorM4675b.getInt(iM4673b24) != 0;
                c0775p2.f4816t = C0781v.m5127f(cursorM4675b.getInt(iM4673b25));
                c0775p2.f4808l = c0704c;
                c0775p = c0775p2;
            } else {
                c0775p = null;
            }
            cursorM4675b.close();
            c0654m.m4651f();
            return c0775p;
        } catch (Throwable th2) {
            th = th2;
            cursorM4675b.close();
            c0654m.m4651f();
            throw th;
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: n */
    public int mo5111n(String str) throws SQLException {
        this.f4825a.assertNotSuspendingTransaction();
        InterfaceC1012f interfaceC1012fAcquire = this.f4831g.acquire();
        if (str == null) {
            interfaceC1012fAcquire.mo4646I0(1);
        } else {
            interfaceC1012fAcquire.mo4654w(1, str);
        }
        this.f4825a.beginTransaction();
        try {
            int iMo6470E = interfaceC1012fAcquire.mo6470E();
            this.f4825a.setTransactionSuccessful();
            return iMo6470E;
        } finally {
            this.f4825a.endTransaction();
            this.f4831g.release(interfaceC1012fAcquire);
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: o */
    public List<String> mo5112o(String str) {
        C0654m c0654mM4644c = C0654m.m4644c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        this.f4825a.assertNotSuspendingTransaction();
        Cursor cursorM4675b = C0663c.m4675b(this.f4825a, c0654mM4644c, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
            while (cursorM4675b.moveToNext()) {
                arrayList.add(cursorM4675b.getString(0));
            }
            return arrayList;
        } finally {
            cursorM4675b.close();
            c0654mM4644c.m4651f();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: p */
    public List<C0706e> mo5113p(String str) {
        C0654m c0654mM4644c = C0654m.m4644c("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            c0654mM4644c.mo4646I0(1);
        } else {
            c0654mM4644c.mo4654w(1, str);
        }
        this.f4825a.assertNotSuspendingTransaction();
        Cursor cursorM4675b = C0663c.m4675b(this.f4825a, c0654mM4644c, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
            while (cursorM4675b.moveToNext()) {
                arrayList.add(C0706e.m4829g(cursorM4675b.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorM4675b.close();
            c0654mM4644c.m4651f();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: q */
    public int mo5114q(String str) throws SQLException {
        this.f4825a.assertNotSuspendingTransaction();
        InterfaceC1012f interfaceC1012fAcquire = this.f4830f.acquire();
        if (str == null) {
            interfaceC1012fAcquire.mo4646I0(1);
        } else {
            interfaceC1012fAcquire.mo4654w(1, str);
        }
        this.f4825a.beginTransaction();
        try {
            int iMo6470E = interfaceC1012fAcquire.mo6470E();
            this.f4825a.setTransactionSuccessful();
            return iMo6470E;
        } finally {
            this.f4825a.endTransaction();
            this.f4830f.release(interfaceC1012fAcquire);
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: r */
    public void mo5115r(String str, long j2) throws SQLException {
        this.f4825a.assertNotSuspendingTransaction();
        InterfaceC1012f interfaceC1012fAcquire = this.f4829e.acquire();
        interfaceC1012fAcquire.mo4652h0(1, j2);
        if (str == null) {
            interfaceC1012fAcquire.mo4646I0(2);
        } else {
            interfaceC1012fAcquire.mo4654w(2, str);
        }
        this.f4825a.beginTransaction();
        try {
            interfaceC1012fAcquire.mo6470E();
            this.f4825a.setTransactionSuccessful();
        } finally {
            this.f4825a.endTransaction();
            this.f4829e.release(interfaceC1012fAcquire);
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: s */
    public List<C0775p> mo5116s(int i2) throws Throwable {
        C0654m c0654m;
        int iM4673b;
        int iM4673b2;
        int iM4673b3;
        int iM4673b4;
        int iM4673b5;
        int iM4673b6;
        int iM4673b7;
        int iM4673b8;
        int iM4673b9;
        int iM4673b10;
        int iM4673b11;
        int iM4673b12;
        int iM4673b13;
        int iM4673b14;
        C0654m c0654mM4644c = C0654m.m4644c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        c0654mM4644c.mo4652h0(1, i2);
        this.f4825a.assertNotSuspendingTransaction();
        Cursor cursorM4675b = C0663c.m4675b(this.f4825a, c0654mM4644c, false, null);
        try {
            iM4673b = C0662b.m4673b(cursorM4675b, "required_network_type");
            iM4673b2 = C0662b.m4673b(cursorM4675b, "requires_charging");
            iM4673b3 = C0662b.m4673b(cursorM4675b, "requires_device_idle");
            iM4673b4 = C0662b.m4673b(cursorM4675b, "requires_battery_not_low");
            iM4673b5 = C0662b.m4673b(cursorM4675b, "requires_storage_not_low");
            iM4673b6 = C0662b.m4673b(cursorM4675b, "trigger_content_update_delay");
            iM4673b7 = C0662b.m4673b(cursorM4675b, "trigger_max_content_delay");
            iM4673b8 = C0662b.m4673b(cursorM4675b, "content_uri_triggers");
            iM4673b9 = C0662b.m4673b(cursorM4675b, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
            iM4673b10 = C0662b.m4673b(cursorM4675b, "state");
            iM4673b11 = C0662b.m4673b(cursorM4675b, "worker_class_name");
            iM4673b12 = C0662b.m4673b(cursorM4675b, "input_merger_class_name");
            iM4673b13 = C0662b.m4673b(cursorM4675b, "input");
            iM4673b14 = C0662b.m4673b(cursorM4675b, "output");
            c0654m = c0654mM4644c;
        } catch (Throwable th) {
            th = th;
            c0654m = c0654mM4644c;
        }
        try {
            int iM4673b15 = C0662b.m4673b(cursorM4675b, "initial_delay");
            int iM4673b16 = C0662b.m4673b(cursorM4675b, "interval_duration");
            int iM4673b17 = C0662b.m4673b(cursorM4675b, "flex_duration");
            int iM4673b18 = C0662b.m4673b(cursorM4675b, "run_attempt_count");
            int iM4673b19 = C0662b.m4673b(cursorM4675b, "backoff_policy");
            int iM4673b20 = C0662b.m4673b(cursorM4675b, "backoff_delay_duration");
            int iM4673b21 = C0662b.m4673b(cursorM4675b, "period_start_time");
            int iM4673b22 = C0662b.m4673b(cursorM4675b, "minimum_retention_duration");
            int iM4673b23 = C0662b.m4673b(cursorM4675b, "schedule_requested_at");
            int iM4673b24 = C0662b.m4673b(cursorM4675b, "run_in_foreground");
            int iM4673b25 = C0662b.m4673b(cursorM4675b, "out_of_quota_policy");
            int i3 = iM4673b14;
            ArrayList arrayList = new ArrayList(cursorM4675b.getCount());
            while (cursorM4675b.moveToNext()) {
                String string = cursorM4675b.getString(iM4673b9);
                int i4 = iM4673b9;
                String string2 = cursorM4675b.getString(iM4673b11);
                int i5 = iM4673b11;
                C0704c c0704c = new C0704c();
                int i6 = iM4673b;
                c0704c.m4809k(C0781v.m5126e(cursorM4675b.getInt(iM4673b)));
                c0704c.m4811m(cursorM4675b.getInt(iM4673b2) != 0);
                c0704c.m4812n(cursorM4675b.getInt(iM4673b3) != 0);
                c0704c.m4810l(cursorM4675b.getInt(iM4673b4) != 0);
                c0704c.m4813o(cursorM4675b.getInt(iM4673b5) != 0);
                int i7 = iM4673b2;
                int i8 = iM4673b3;
                c0704c.m4814p(cursorM4675b.getLong(iM4673b6));
                c0704c.m4815q(cursorM4675b.getLong(iM4673b7));
                c0704c.m4808j(C0781v.m5123b(cursorM4675b.getBlob(iM4673b8)));
                C0775p c0775p = new C0775p(string, string2);
                c0775p.f4800d = C0781v.m5128g(cursorM4675b.getInt(iM4673b10));
                c0775p.f4802f = cursorM4675b.getString(iM4673b12);
                c0775p.f4803g = C0706e.m4829g(cursorM4675b.getBlob(iM4673b13));
                int i9 = i3;
                c0775p.f4804h = C0706e.m4829g(cursorM4675b.getBlob(i9));
                i3 = i9;
                int i10 = iM4673b15;
                c0775p.f4805i = cursorM4675b.getLong(i10);
                int i11 = iM4673b12;
                int i12 = iM4673b16;
                c0775p.f4806j = cursorM4675b.getLong(i12);
                int i13 = iM4673b4;
                int i14 = iM4673b17;
                c0775p.f4807k = cursorM4675b.getLong(i14);
                int i15 = iM4673b18;
                c0775p.f4809m = cursorM4675b.getInt(i15);
                int i16 = iM4673b19;
                c0775p.f4810n = C0781v.m5125d(cursorM4675b.getInt(i16));
                iM4673b17 = i14;
                int i17 = iM4673b20;
                c0775p.f4811o = cursorM4675b.getLong(i17);
                int i18 = iM4673b21;
                c0775p.f4812p = cursorM4675b.getLong(i18);
                iM4673b21 = i18;
                int i19 = iM4673b22;
                c0775p.f4813q = cursorM4675b.getLong(i19);
                int i20 = iM4673b23;
                c0775p.f4814r = cursorM4675b.getLong(i20);
                int i21 = iM4673b24;
                c0775p.f4815s = cursorM4675b.getInt(i21) != 0;
                int i22 = iM4673b25;
                c0775p.f4816t = C0781v.m5127f(cursorM4675b.getInt(i22));
                c0775p.f4808l = c0704c;
                arrayList.add(c0775p);
                iM4673b25 = i22;
                iM4673b2 = i7;
                iM4673b12 = i11;
                iM4673b15 = i10;
                iM4673b16 = i12;
                iM4673b18 = i15;
                iM4673b23 = i20;
                iM4673b9 = i4;
                iM4673b11 = i5;
                iM4673b = i6;
                iM4673b24 = i21;
                iM4673b22 = i19;
                iM4673b3 = i8;
                iM4673b20 = i17;
                iM4673b4 = i13;
                iM4673b19 = i16;
            }
            cursorM4675b.close();
            c0654m.m4651f();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorM4675b.close();
            c0654m.m4651f();
            throw th;
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0776q
    /* renamed from: t */
    public int mo5117t() throws SQLException {
        this.f4825a.assertNotSuspendingTransaction();
        InterfaceC1012f interfaceC1012fAcquire = this.f4833i.acquire();
        this.f4825a.beginTransaction();
        try {
            int iMo6470E = interfaceC1012fAcquire.mo6470E();
            this.f4825a.setTransactionSuccessful();
            return iMo6470E;
        } finally {
            this.f4825a.endTransaction();
            this.f4833i.release(interfaceC1012fAcquire);
        }
    }
}
