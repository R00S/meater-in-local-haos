package T6;

import U6.InterfaceC1742d;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* compiled from: JobInfoScheduler.java */
/* loaded from: classes2.dex */
public class d implements x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16168a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1742d f16169b;

    /* renamed from: c, reason: collision with root package name */
    private final f f16170c;

    public d(Context context, InterfaceC1742d interfaceC1742d, f fVar) {
        this.f16168a = context;
        this.f16169b = interfaceC1742d;
        this.f16170c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                return i12 >= i11;
            }
        }
        return false;
    }

    @Override // T6.x
    public void a(M6.p pVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f16168a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f16168a.getSystemService("jobscheduler");
        int iC = c(pVar);
        if (!z10 && d(jobScheduler, iC, i10)) {
            Q6.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
            return;
        }
        long jT0 = this.f16169b.T0(pVar);
        JobInfo.Builder builderC = this.f16170c.c(new JobInfo.Builder(iC, componentName), pVar.d(), jT0, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", pVar.b());
        persistableBundle.putInt("priority", X6.a.a(pVar.d()));
        if (pVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        Q6.a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(iC), Long.valueOf(this.f16170c.g(pVar.d(), jT0, i10)), Long.valueOf(jT0), Integer.valueOf(i10));
        jobScheduler.schedule(builderC.build());
    }

    @Override // T6.x
    public void b(M6.p pVar, int i10) {
        a(pVar, i10, false);
    }

    int c(M6.p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f16168a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(X6.a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }
}
