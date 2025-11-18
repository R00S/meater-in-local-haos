package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
@TargetApi(24)
/* loaded from: classes2.dex */
public final class A0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Method f33565b = e();

    /* renamed from: c, reason: collision with root package name */
    private static final Method f33566c = d();

    /* renamed from: a, reason: collision with root package name */
    private final JobScheduler f33567a;

    private A0(JobScheduler jobScheduler) {
        this.f33567a = jobScheduler;
    }

    private static int a() {
        Method method = f33566c;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, null);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e10) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e10);
                }
            }
        }
        return 0;
    }

    private final int b(JobInfo jobInfo, String str, int i10, String str2) {
        Method method = f33565b;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(this.f33567a, jobInfo, str, Integer.valueOf(i10), str2);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e10) {
                Log.e(str2, "error calling scheduleAsPackage", e10);
            }
        }
        return this.f33567a.schedule(jobInfo);
    }

    public static int c(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) l8.m.l((JobScheduler) context.getSystemService("jobscheduler"));
        return (f33565b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new A0(jobScheduler).b(jobInfo, str, a(), str2);
    }

    private static Method d() {
        try {
            return UserHandle.class.getDeclaredMethod("myUserId", null);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
            return null;
        }
    }

    private static Method e() {
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            return null;
        }
    }
}
