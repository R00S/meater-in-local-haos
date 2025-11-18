package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p241e.p254e.p256b.p257a.p258i.AbstractC8874q;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8825j0;
import p241e.p254e.p256b.p257a.p258i.p263d0.C8861a;
import p241e.p254e.p256b.p257a.p258i.p268z.C8891a;

/* compiled from: JobInfoScheduler.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.s */
/* loaded from: classes2.dex */
public class C6289s implements InterfaceC6295y {

    /* renamed from: a */
    private final Context f16830a;

    /* renamed from: b */
    private final InterfaceC8825j0 f16831b;

    /* renamed from: c */
    private final AbstractC6290t f16832c;

    public C6289s(Context context, InterfaceC8825j0 interfaceC8825j0, AbstractC6290t abstractC6290t) {
        this.f16830a = context;
        this.f16831b = interfaceC8825j0;
        this.f16832c = abstractC6290t;
    }

    /* renamed from: d */
    private boolean m13552d(JobScheduler jobScheduler, int i2, int i3) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i4 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i2) {
                return i4 >= i3;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6295y
    /* renamed from: a */
    public void mo13540a(AbstractC8874q abstractC8874q, int i2) {
        mo13541b(abstractC8874q, i2, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6295y
    /* renamed from: b */
    public void mo13541b(AbstractC8874q abstractC8874q, int i2, boolean z) {
        ComponentName componentName = new ComponentName(this.f16830a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f16830a.getSystemService("jobscheduler");
        int iM13553c = m13553c(abstractC8874q);
        if (!z && m13552d(jobScheduler, iM13553c, i2)) {
            C8891a.m28230b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC8874q);
            return;
        }
        long jMo27998W0 = this.f16831b.mo27998W0(abstractC8874q);
        JobInfo.Builder builderM13560c = this.f16832c.m13560c(new JobInfo.Builder(iM13553c, componentName), abstractC8874q.mo28136d(), jMo27998W0, i2);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i2);
        persistableBundle.putString("backendName", abstractC8874q.mo28134b());
        persistableBundle.putInt("priority", C8861a.m28132a(abstractC8874q.mo28136d()));
        if (abstractC8874q.mo28135c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC8874q.mo28135c(), 0));
        }
        builderM13560c.setExtras(persistableBundle);
        C8891a.m28231c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC8874q, Integer.valueOf(iM13553c), Long.valueOf(this.f16832c.m13561g(abstractC8874q.mo28136d(), jMo27998W0, i2)), Long.valueOf(jMo27998W0), Integer.valueOf(i2));
        jobScheduler.schedule(builderM13560c.build());
    }

    /* renamed from: c */
    int m13553c(AbstractC8874q abstractC8874q) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f16830a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC8874q.mo28134b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C8861a.m28132a(abstractC8874q.mo28136d())).array());
        if (abstractC8874q.mo28135c() != null) {
            adler32.update(abstractC8874q.mo28135c());
        }
        return (int) adler32.getValue();
    }
}
