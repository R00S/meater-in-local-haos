package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class ProcessUtils {

    /* renamed from: a */
    private static String f17991a;

    /* renamed from: b */
    private static int f17992b;

    private ProcessUtils() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static String m14653a() throws Throwable {
        BufferedReader bufferedReader;
        String str;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
        if (f17991a == null) {
            int iMyPid = f17992b;
            if (iMyPid == 0) {
                iMyPid = Process.myPid();
                f17992b = iMyPid;
            }
            String strTrim = null;
            strTrim = null;
            strTrim = null;
            BufferedReader bufferedReader2 = null;
            if (iMyPid > 0) {
                try {
                    str = "/proc/" + iMyPid + "/cmdline";
                    threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                } catch (IOException unused) {
                    bufferedReader = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    bufferedReader = new BufferedReader(new FileReader(str));
                    try {
                        String line = bufferedReader.readLine();
                        Preconditions.m14372k(line);
                        strTrim = line.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        IOUtils.m14630a(bufferedReader2);
                        throw th;
                    }
                    IOUtils.m14630a(bufferedReader);
                } finally {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                }
            }
            f17991a = strTrim;
        }
        return f17991a;
    }
}
