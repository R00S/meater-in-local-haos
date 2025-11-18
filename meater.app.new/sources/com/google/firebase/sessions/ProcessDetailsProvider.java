package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
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
@Metadata(m32266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0002J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\r\u0010\u0011\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, m32267d2 = {"Lcom/google/firebase/sessions/ProcessDetailsProvider;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "buildProcessDetails", "Lcom/google/firebase/sessions/ProcessDetails;", "processName", HttpUrl.FRAGMENT_ENCODE_SET, "pid", HttpUrl.FRAGMENT_ENCODE_SET, "importance", "isDefaultProcess", HttpUrl.FRAGMENT_ENCODE_SET, "getAppProcessDetails", HttpUrl.FRAGMENT_ENCODE_SET, "context", "Landroid/content/Context;", "getCurrentProcessDetails", "getProcessName", "getProcessName$com_google_firebase_firebase_sessions", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.u, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class ProcessDetailsProvider {

    /* renamed from: a */
    public static final ProcessDetailsProvider f32355a = new ProcessDetailsProvider();

    private ProcessDetailsProvider() {
    }

    /* renamed from: a */
    private final ProcessDetails m26857a(String str, int i2, int i3, boolean z) {
        return new ProcessDetails(str, i2, i3, z);
    }

    /* renamed from: b */
    static /* synthetic */ ProcessDetails m26858b(ProcessDetailsProvider processDetailsProvider, String str, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        if ((i4 & 8) != 0) {
            z = false;
        }
        return processDetailsProvider.m26857a(str, i2, i3, z);
    }

    /* renamed from: c */
    public final List<ProcessDetails> m26859c(Context context) {
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
            String str2 = runningAppProcessInfo.processName;
            C9801m.m32345e(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new ProcessDetails(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, C9801m.m32341a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    /* renamed from: d */
    public final ProcessDetails m26860d(Context context) {
        Object next;
        C9801m.m32346f(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = m26859c(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ProcessDetails) next).getPid() == iMyPid) {
                break;
            }
        }
        ProcessDetails processDetails = (ProcessDetails) next;
        return processDetails == null ? m26858b(this, m26861e(), iMyPid, 0, false, 12, null) : processDetails;
    }

    /* renamed from: e */
    public final String m26861e() throws Throwable {
        String processName;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            String strMyProcessName = Process.myProcessName();
            C9801m.m32345e(strMyProcessName, "myProcessName()");
            return strMyProcessName;
        }
        if (i2 >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String strM14653a = ProcessUtils.m14653a();
        return strM14653a != null ? strM14653a : HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
