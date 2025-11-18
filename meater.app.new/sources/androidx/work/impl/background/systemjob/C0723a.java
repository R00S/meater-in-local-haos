package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.os.C0272a;
import androidx.work.AbstractC0807n;
import androidx.work.C0704c;
import androidx.work.C0705d;
import androidx.work.EnumC0701a;
import androidx.work.EnumC0808o;
import androidx.work.impl.p016n.C0775p;
import java.util.Iterator;

/* compiled from: SystemJobInfoConverter.java */
/* renamed from: androidx.work.impl.background.systemjob.a */
/* loaded from: classes.dex */
class C0723a {

    /* renamed from: a */
    private static final String f4587a = AbstractC0807n.m5223f("SystemJobInfoConverter");

    /* renamed from: b */
    private final ComponentName f4588b;

    /* compiled from: SystemJobInfoConverter.java */
    /* renamed from: androidx.work.impl.background.systemjob.a$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4589a;

        static {
            int[] iArr = new int[EnumC0808o.values().length];
            f4589a = iArr;
            try {
                iArr[EnumC0808o.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4589a[EnumC0808o.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4589a[EnumC0808o.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4589a[EnumC0808o.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4589a[EnumC0808o.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    C0723a(Context context) {
        this.f4588b = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* renamed from: b */
    private static JobInfo.TriggerContentUri m4916b(C0705d.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.m4821a(), aVar.m4822b() ? 1 : 0);
    }

    /* renamed from: c */
    static int m4917c(EnumC0808o enumC0808o) {
        int i2 = a.f4589a[enumC0808o.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 != 4) {
            if (i2 == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        AbstractC0807n.m5221c().mo5224a(f4587a, String.format("API version too low. Cannot convert network type value %s", enumC0808o), new Throwable[0]);
        return 1;
    }

    /* renamed from: d */
    static void m4918d(JobInfo.Builder builder, EnumC0808o enumC0808o) {
        if (Build.VERSION.SDK_INT < 30 || enumC0808o != EnumC0808o.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(m4917c(enumC0808o));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* renamed from: a */
    JobInfo m4919a(C0775p c0775p, int i2) {
        C0704c c0704c = c0775p.f4808l;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", c0775p.f4799c);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c0775p.m5093d());
        JobInfo.Builder extras = new JobInfo.Builder(i2, this.f4588b).setRequiresCharging(c0704c.m4805g()).setRequiresDeviceIdle(c0704c.m4806h()).setExtras(persistableBundle);
        m4918d(extras, c0704c.m4800b());
        if (!c0704c.m4806h()) {
            extras.setBackoffCriteria(c0775p.f4811o, c0775p.f4810n == EnumC0701a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(c0775p.m5090a() - System.currentTimeMillis(), 0L);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!c0775p.f4815s) {
            extras.setImportantWhileForeground(true);
        }
        if (i3 >= 24 && c0704c.m4803e()) {
            Iterator<C0705d.a> it = c0704c.m4799a().m4819b().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(m4916b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(c0704c.m4801c());
            extras.setTriggerContentMaxDelay(c0704c.m4802d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(c0704c.m4804f());
            extras.setRequiresStorageNotLow(c0704c.m4807i());
        }
        boolean z = c0775p.f4809m > 0;
        boolean z2 = jMax > 0;
        if (C0272a.m1833c() && c0775p.f4815s && !z && !z2) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
