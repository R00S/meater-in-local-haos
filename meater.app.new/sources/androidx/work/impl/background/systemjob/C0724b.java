package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.SQLException;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.AbstractC0807n;
import androidx.work.C0817x;
import androidx.work.EnumC0811r;
import androidx.work.impl.C0737j;
import androidx.work.impl.InterfaceC0727e;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p016n.C0766g;
import androidx.work.impl.p016n.C0775p;
import androidx.work.impl.p016n.InterfaceC0776q;
import androidx.work.impl.utils.C0784c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: SystemJobScheduler.java */
/* renamed from: androidx.work.impl.background.systemjob.b */
/* loaded from: classes.dex */
public class C0724b implements InterfaceC0727e {

    /* renamed from: f */
    private static final String f4590f = AbstractC0807n.m5223f("SystemJobScheduler");

    /* renamed from: g */
    private final Context f4591g;

    /* renamed from: h */
    private final JobScheduler f4592h;

    /* renamed from: i */
    private final C0737j f4593i;

    /* renamed from: j */
    private final C0723a f4594j;

    public C0724b(Context context, C0737j c0737j) {
        this(context, c0737j, (JobScheduler) context.getSystemService("jobscheduler"), new C0723a(context));
    }

    /* renamed from: b */
    public static void m4920b(Context context) {
        List<JobInfo> listM4923f;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listM4923f = m4923f(context, jobScheduler)) == null || listM4923f.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = listM4923f.iterator();
        while (it.hasNext()) {
            m4921d(jobScheduler, it.next().getId());
        }
    }

    /* renamed from: d */
    private static void m4921d(JobScheduler jobScheduler, int i2) {
        try {
            jobScheduler.cancel(i2);
        } catch (Throwable th) {
            AbstractC0807n.m5221c().mo5225b(f4590f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i2)), th);
        }
    }

    /* renamed from: e */
    private static List<Integer> m4922e(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listM4923f = m4923f(context, jobScheduler);
        if (listM4923f == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listM4923f) {
            if (str.equals(m4924g(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private static List<JobInfo> m4923f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            AbstractC0807n.m5221c().mo5225b(f4590f, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private static String m4924g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static boolean m4925h(Context context, C0737j c0737j) throws SQLException {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listM4923f = m4923f(context, jobScheduler);
        List<String> listMo5079a = c0737j.m4997t().mo4851g().mo5079a();
        boolean z = false;
        HashSet hashSet = new HashSet(listM4923f != null ? listM4923f.size() : 0);
        if (listM4923f != null && !listM4923f.isEmpty()) {
            for (JobInfo jobInfo : listM4923f) {
                String strM4924g = m4924g(jobInfo);
                if (TextUtils.isEmpty(strM4924g)) {
                    m4921d(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(strM4924g);
                }
            }
        }
        Iterator<String> it = listMo5079a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                AbstractC0807n.m5221c().mo5224a(f4590f, "Reconciling jobs", new Throwable[0]);
                z = true;
                break;
            }
        }
        if (z) {
            WorkDatabase workDatabaseM4997t = c0737j.m4997t();
            workDatabaseM4997t.beginTransaction();
            try {
                InterfaceC0776q interfaceC0776qMo4854j = workDatabaseM4997t.mo4854j();
                Iterator<String> it2 = listMo5079a.iterator();
                while (it2.hasNext()) {
                    interfaceC0776qMo4854j.mo5099b(it2.next(), -1L);
                }
                workDatabaseM4997t.setTransactionSuccessful();
            } finally {
                workDatabaseM4997t.endTransaction();
            }
        }
        return z;
    }

    @Override // androidx.work.impl.InterfaceC0727e
    /* renamed from: a */
    public void mo4913a(C0775p... c0775pArr) throws SQLException {
        List<Integer> listM4922e;
        WorkDatabase workDatabaseM4997t = this.f4593i.m4997t();
        C0784c c0784c = new C0784c(workDatabaseM4997t);
        for (C0775p c0775p : c0775pArr) {
            workDatabaseM4997t.beginTransaction();
            try {
                C0775p c0775pMo5110m = workDatabaseM4997t.mo4854j().mo5110m(c0775p.f4799c);
                if (c0775pMo5110m == null) {
                    AbstractC0807n.m5221c().mo5228h(f4590f, "Skipping scheduling " + c0775p.f4799c + " because it's no longer in the DB", new Throwable[0]);
                    workDatabaseM4997t.setTransactionSuccessful();
                } else if (c0775pMo5110m.f4800d != C0817x.a.ENQUEUED) {
                    AbstractC0807n.m5221c().mo5228h(f4590f, "Skipping scheduling " + c0775p.f4799c + " because it is no longer enqueued", new Throwable[0]);
                    workDatabaseM4997t.setTransactionSuccessful();
                } else {
                    C0766g c0766gMo5081c = workDatabaseM4997t.mo4851g().mo5081c(c0775p.f4799c);
                    int iM5161d = c0766gMo5081c != null ? c0766gMo5081c.f4777b : c0784c.m5161d(this.f4593i.m4993n().m4790i(), this.f4593i.m4993n().m4788g());
                    if (c0766gMo5081c == null) {
                        this.f4593i.m4997t().mo4851g().mo5080b(new C0766g(c0775p.f4799c, iM5161d));
                    }
                    m4926i(c0775p, iM5161d);
                    if (Build.VERSION.SDK_INT == 23 && (listM4922e = m4922e(this.f4591g, this.f4592h, c0775p.f4799c)) != null) {
                        int iIndexOf = listM4922e.indexOf(Integer.valueOf(iM5161d));
                        if (iIndexOf >= 0) {
                            listM4922e.remove(iIndexOf);
                        }
                        m4926i(c0775p, !listM4922e.isEmpty() ? listM4922e.get(0).intValue() : c0784c.m5161d(this.f4593i.m4993n().m4790i(), this.f4593i.m4993n().m4788g()));
                    }
                    workDatabaseM4997t.setTransactionSuccessful();
                }
                workDatabaseM4997t.endTransaction();
            } catch (Throwable th) {
                workDatabaseM4997t.endTransaction();
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC0727e
    /* renamed from: c */
    public boolean mo4914c() {
        return true;
    }

    @Override // androidx.work.impl.InterfaceC0727e
    public void cancel(String str) {
        List<Integer> listM4922e = m4922e(this.f4591g, this.f4592h, str);
        if (listM4922e == null || listM4922e.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listM4922e.iterator();
        while (it.hasNext()) {
            m4921d(this.f4592h, it.next().intValue());
        }
        this.f4593i.m4997t().mo4851g().mo5082d(str);
    }

    /* renamed from: i */
    public void m4926i(C0775p c0775p, int i2) {
        JobInfo jobInfoM4919a = this.f4594j.m4919a(c0775p, i2);
        AbstractC0807n abstractC0807nM5221c = AbstractC0807n.m5221c();
        String str = f4590f;
        abstractC0807nM5221c.mo5224a(str, String.format("Scheduling work ID %s Job ID %s", c0775p.f4799c, Integer.valueOf(i2)), new Throwable[0]);
        try {
            if (this.f4592h.schedule(jobInfoM4919a) == 0) {
                AbstractC0807n.m5221c().mo5228h(str, String.format("Unable to schedule work ID %s", c0775p.f4799c), new Throwable[0]);
                if (c0775p.f4815s && c0775p.f4816t == EnumC0811r.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    c0775p.f4815s = false;
                    AbstractC0807n.m5221c().mo5224a(str, String.format("Scheduling a non-expedited job (work ID %s)", c0775p.f4799c), new Throwable[0]);
                    m4926i(c0775p, i2);
                }
            }
        } catch (IllegalStateException e2) {
            List<JobInfo> listM4923f = m4923f(this.f4591g, this.f4592h);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listM4923f != null ? listM4923f.size() : 0), Integer.valueOf(this.f4593i.m4997t().mo4854j().mo5104g().size()), Integer.valueOf(this.f4593i.m4993n().m4789h()));
            AbstractC0807n.m5221c().mo5225b(f4590f, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e2);
        } catch (Throwable th) {
            AbstractC0807n.m5221c().mo5225b(f4590f, String.format("Unable to schedule %s", c0775p), th);
        }
    }

    public C0724b(Context context, C0737j c0737j, JobScheduler jobScheduler, C0723a c0723a) {
        this.f4591g = context;
        this.f4593i = c0737j;
        this.f4592h = jobScheduler;
        this.f4594j = c0723a;
    }
}
