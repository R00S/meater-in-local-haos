package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.AbstractC0807n;
import androidx.work.WorkerParameters;
import androidx.work.impl.C0737j;
import androidx.work.impl.InterfaceC0715b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC0715b {

    /* renamed from: f */
    private static final String f4584f = AbstractC0807n.m5223f("SystemJobService");

    /* renamed from: g */
    private C0737j f4585g;

    /* renamed from: h */
    private final Map<String, JobParameters> f4586h = new HashMap();

    /* renamed from: a */
    private static String m4915a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.InterfaceC0715b
    /* renamed from: d */
    public void mo4869d(String str, boolean z) {
        JobParameters jobParametersRemove;
        AbstractC0807n.m5221c().mo5224a(f4584f, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f4586h) {
            jobParametersRemove = this.f4586h.remove(str);
        }
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, z);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            C0737j c0737jM4979p = C0737j.m4979p(getApplicationContext());
            this.f4585g = c0737jM4979p;
            c0737jM4979p.m4995r().m4932c(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            AbstractC0807n.m5221c().mo5228h(f4584f, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C0737j c0737j = this.f4585g;
        if (c0737j != null) {
            c0737j.m4995r().m4936i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f4585g == null) {
            AbstractC0807n.m5221c().mo5224a(f4584f, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String strM4915a = m4915a(jobParameters);
        if (TextUtils.isEmpty(strM4915a)) {
            AbstractC0807n.m5221c().mo5225b(f4584f, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f4586h) {
            if (this.f4586h.containsKey(strM4915a)) {
                AbstractC0807n.m5221c().mo5224a(f4584f, String.format("Job is already being executed by SystemJobService: %s", strM4915a), new Throwable[0]);
                return false;
            }
            AbstractC0807n.m5221c().mo5224a(f4584f, String.format("onStartJob for %s", strM4915a), new Throwable[0]);
            this.f4586h.put(strM4915a, jobParameters);
            WorkerParameters.C0700a c0700a = null;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                c0700a = new WorkerParameters.C0700a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    c0700a.f4459b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    c0700a.f4458a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i2 >= 28) {
                    c0700a.f4460c = jobParameters.getNetwork();
                }
            }
            this.f4585g.m4981A(strM4915a, c0700a);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f4585g == null) {
            AbstractC0807n.m5221c().mo5224a(f4584f, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String strM4915a = m4915a(jobParameters);
        if (TextUtils.isEmpty(strM4915a)) {
            AbstractC0807n.m5221c().mo5225b(f4584f, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        AbstractC0807n.m5221c().mo5224a(f4584f, String.format("onStopJob for %s", strM4915a), new Throwable[0]);
        synchronized (this.f4586h) {
            this.f4586h.remove(strM4915a);
        }
        this.f4585g.m4983C(strM4915a);
        return !this.f4585g.m4995r().m4933f(strM4915a);
    }
}
