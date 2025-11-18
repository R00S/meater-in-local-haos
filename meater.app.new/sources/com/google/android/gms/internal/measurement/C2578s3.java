package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.s3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2578s3 {

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.s3$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static volatile l8.l<InterfaceC2563q3> f34306a;

        private a() {
        }

        public static l8.l<InterfaceC2563q3> a(Context context) {
            l8.l<InterfaceC2563q3> lVarC;
            l8.l<InterfaceC2563q3> lVar = f34306a;
            if (lVar == null) {
                synchronized (a.class) {
                    try {
                        lVar = f34306a;
                        if (lVar == null) {
                            new C2578s3();
                            if (C2586t3.c(Build.TYPE, Build.TAGS)) {
                                if (C2475f3.a() && !context.isDeviceProtectedStorage()) {
                                    context = context.createDeviceProtectedStorageContext();
                                }
                                lVarC = C2578s3.c(context);
                            } else {
                                lVarC = l8.l.a();
                            }
                            f34306a = lVarC;
                            lVar = lVarC;
                        }
                    } finally {
                    }
                }
            }
            return lVar;
        }
    }

    private static InterfaceC2563q3 a(Context context, File file) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                s.X x10 = new s.X();
                HashMap map = new HashMap();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                        C2523l3 c2523l3 = new C2523l3(x10);
                        bufferedReader.close();
                        return c2523l3;
                    }
                    String[] strArrSplit = line.split(" ", 3);
                    if (strArrSplit.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + line);
                    } else {
                        String strB = b(strArrSplit[0]);
                        String strDecode = Uri.decode(b(strArrSplit[1]));
                        String strDecode2 = (String) map.get(strArrSplit[2]);
                        if (strDecode2 == null) {
                            String strB2 = b(strArrSplit[2]);
                            strDecode2 = Uri.decode(strB2);
                            if (strDecode2.length() < 1024 || strDecode2 == strB2) {
                                map.put(strB2, strDecode2);
                            }
                        }
                        s.X x11 = (s.X) x10.get(strB);
                        if (x11 == null) {
                            x11 = new s.X();
                            x10.put(strB, x11);
                        }
                        x11.put(strDecode, strDecode2);
                    }
                }
            } finally {
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static final String b(String str) {
        return new String(str);
    }

    static l8.l<InterfaceC2563q3> c(Context context) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            l8.l<File> lVarD = d(context);
            l8.l<InterfaceC2563q3> lVarD2 = lVarD.c() ? l8.l.d(a(context, lVarD.b())) : l8.l.a();
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return lVarD2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    private static l8.l<File> d(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? l8.l.d(file) : l8.l.a();
        } catch (RuntimeException e10) {
            Log.e("HermeticFileOverrides", "no data dir", e10);
            return l8.l.a();
        }
    }
}
