package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzb {

    /* renamed from: a */
    private static volatile ClassLoader f18061a;

    /* renamed from: b */
    private static volatile Thread f18062b;

    /* renamed from: a */
    public static synchronized ClassLoader m14727a() {
        if (f18061a == null) {
            f18061a = m14728b();
        }
        return f18061a;
    }

    /* renamed from: b */
    private static synchronized ClassLoader m14728b() {
        ClassLoader contextClassLoader = null;
        if (f18062b == null) {
            f18062b = m14729c();
            if (f18062b == null) {
                return null;
            }
        }
        synchronized (f18062b) {
            try {
                contextClassLoader = f18062b.getContextClassLoader();
            } catch (SecurityException e2) {
                Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e2.getMessage());
            }
        }
        return contextClassLoader;
    }

    /* renamed from: c */
    private static synchronized Thread m14729c() {
        SecurityException e2;
        Thread c6456a;
        Thread thread;
        ThreadGroup threadGroup;
        ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
        if (threadGroup2 == null) {
            return null;
        }
        synchronized (Void.class) {
            try {
                int iActiveGroupCount = threadGroup2.activeGroupCount();
                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                threadGroup2.enumerate(threadGroupArr);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= iActiveGroupCount) {
                        threadGroup = null;
                        break;
                    }
                    threadGroup = threadGroupArr[i3];
                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                        break;
                    }
                    i3++;
                }
                if (threadGroup == null) {
                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                }
                int iActiveCount = threadGroup.activeCount();
                Thread[] threadArr = new Thread[iActiveCount];
                threadGroup.enumerate(threadArr);
                while (true) {
                    if (i2 >= iActiveCount) {
                        thread = null;
                        break;
                    }
                    thread = threadArr[i2];
                    if ("GmsDynamite".equals(thread.getName())) {
                        break;
                    }
                    i2++;
                }
            } catch (SecurityException e3) {
                e2 = e3;
                c6456a = null;
            }
            if (thread == null) {
                try {
                    c6456a = new C6456a(threadGroup, "GmsDynamite");
                } catch (SecurityException e4) {
                    e2 = e4;
                    c6456a = thread;
                }
                try {
                    c6456a.setContextClassLoader(null);
                    c6456a.start();
                } catch (SecurityException e5) {
                    e2 = e5;
                    Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e2.getMessage());
                    thread = c6456a;
                    return thread;
                }
                thread = c6456a;
            }
        }
        return thread;
    }
}
