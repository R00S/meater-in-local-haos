package com.flurry.sdk;

import java.io.PrintStream;
import java.io.PrintWriter;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.f2 */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC6041f2 implements Runnable {

    /* renamed from: f */
    private PrintStream f15849f;

    /* renamed from: g */
    private PrintWriter f15850g;

    /* renamed from: a */
    public abstract void mo12950a() throws Exception;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo12950a();
        } catch (Throwable th) {
            if (this.f15849f != null) {
                th.printStackTrace(this.f15849f);
            } else {
                PrintWriter printWriter = this.f15850g;
                if (printWriter != null) {
                    th.printStackTrace(printWriter);
                } else {
                    th.printStackTrace();
                }
            }
            C6021d1.m13031d(6, "SafeRunnable", HttpUrl.FRAGMENT_ENCODE_SET, th);
            C6048g0.m13065a();
            C6048g0.m13066c("SafeRunnableException", "Exception caught by SafeRunnable", th);
        }
    }
}
