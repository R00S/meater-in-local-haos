package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.internal.common.zzac;
import g7.C3445p;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import r7.C4357b;
import r7.C4361f;
import r7.C4362g;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static String f33527a;

    /* renamed from: b, reason: collision with root package name */
    private static int f33528b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f33529c;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        String str;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
        if (f33527a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f33527a = Application.getProcessName();
            } else {
                int iMyPid = f33528b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f33528b = iMyPid;
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
                            C3445p.k(line);
                            strTrim = line.trim();
                        } catch (IOException unused2) {
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            k.a(bufferedReader2);
                            throw th;
                        }
                        k.a(bufferedReader);
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
                f33527a = strTrim;
            }
        }
        return f33527a;
    }

    public static boolean b() {
        Boolean boolValueOf = f33529c;
        if (boolValueOf == null) {
            if (l.f()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objA = C4362g.a(Process.class, "isIsolated", new C4361f[0]);
                    Object[] objArr = new Object[0];
                    if (objA == null) {
                        throw new zzac(C4357b.a("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objA;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f33529c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
