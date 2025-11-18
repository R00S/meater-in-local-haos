package com.google.firebase.crashlytics.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10782c0;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: ProcessDetailsProvider.kt */
@Metadata(m32266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u0006H\u0002¨\u0006\u0012"}, m32267d2 = {"Lcom/google/firebase/crashlytics/internal/ProcessDetailsProvider;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "buildProcessDetails", "Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Event$Application$ProcessDetails;", "processName", HttpUrl.FRAGMENT_ENCODE_SET, "pid", HttpUrl.FRAGMENT_ENCODE_SET, "importance", "isDefaultProcess", HttpUrl.FRAGMENT_ENCODE_SET, "getAppProcessDetails", HttpUrl.FRAGMENT_ENCODE_SET, "context", "Landroid/content/Context;", "getCurrentProcessDetails", "getProcessName", "com.google.firebase-firebase-crashlytics"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.crashlytics.h.j, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class ProcessDetailsProvider {

    /* renamed from: a */
    public static final ProcessDetailsProvider f30863a = new ProcessDetailsProvider();

    private ProcessDetailsProvider() {
    }

    /* renamed from: c */
    public static /* synthetic */ AbstractC8258f0.e.d.a.c m25187c(ProcessDetailsProvider processDetailsProvider, String str, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        if ((i4 & 8) != 0) {
            z = false;
        }
        return processDetailsProvider.m25190b(str, i2, i3, z);
    }

    /* renamed from: f */
    private final String m25188f() {
        String processName;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 33) {
            return (i2 < 28 || (processName = Application.getProcessName()) == null) ? HttpUrl.FRAGMENT_ENCODE_SET : processName;
        }
        String strMyProcessName = Process.myProcessName();
        C9801m.m32345e(strMyProcessName, "{\n      Process.myProcessName()\n    }");
        return strMyProcessName;
    }

    /* renamed from: a */
    public final AbstractC8258f0.e.d.a.c m25189a(String str, int i2, int i3) {
        C9801m.m32346f(str, "processName");
        return m25187c(this, str, i2, i3, false, 8, null);
    }

    /* renamed from: b */
    public final AbstractC8258f0.e.d.a.c m25190b(String str, int i2, int i3, boolean z) {
        C9801m.m32346f(str, "processName");
        AbstractC8258f0.e.d.a.c cVarMo25843a = AbstractC8258f0.e.d.a.c.m25838a().mo25847e(str).mo25846d(i2).mo25845c(i3).mo25844b(z).mo25843a();
        C9801m.m32345e(cVarMo25843a, "builder()\n      .setProc…ltProcess)\n      .build()");
        return cVarMo25843a;
    }

    /* renamed from: d */
    public final List<AbstractC8258f0.e.d.a.c> m25191d(Context context) {
        C9801m.m32346f(context, "context");
        int i2 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = C10817u.m38888j();
        }
        List listM38586R = C10782c0.m38586R(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listM38586R) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i2) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10819v.m38911u(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(AbstractC8258f0.e.d.a.c.m25838a().mo25847e(runningAppProcessInfo.processName).mo25846d(runningAppProcessInfo.pid).mo25845c(runningAppProcessInfo.importance).mo25844b(C9801m.m32341a(runningAppProcessInfo.processName, str)).mo25843a());
        }
        return arrayList2;
    }

    /* renamed from: e */
    public final AbstractC8258f0.e.d.a.c m25192e(Context context) {
        Object next;
        C9801m.m32346f(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = m25191d(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC8258f0.e.d.a.c) next).mo25840c() == iMyPid) {
                break;
            }
        }
        AbstractC8258f0.e.d.a.c cVar = (AbstractC8258f0.e.d.a.c) next;
        return cVar == null ? m25187c(this, m25188f(), iMyPid, 0, false, 12, null) : cVar;
    }
}
