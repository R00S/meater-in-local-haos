package com.bumptech.glide.load.p131o.p132c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.EnumC5366b;
import java.io.File;

/* compiled from: HardwareConfigState.java */
/* renamed from: com.bumptech.glide.load.o.c.q */
/* loaded from: classes.dex */
final class C5496q {

    /* renamed from: a */
    private static final File f13755a = new File("/proc/self/fd");

    /* renamed from: b */
    private static volatile C5496q f13756b;

    /* renamed from: c */
    private volatile int f13757c;

    /* renamed from: d */
    private volatile boolean f13758d = true;

    private C5496q() {
    }

    /* renamed from: a */
    static C5496q m10658a() {
        if (f13756b == null) {
            synchronized (C5496q.class) {
                if (f13756b == null) {
                    f13756b = new C5496q();
                }
            }
        }
        return f13756b;
    }

    /* renamed from: b */
    private synchronized boolean m10659b() {
        boolean z = true;
        int i2 = this.f13757c + 1;
        this.f13757c = i2;
        if (i2 >= 50) {
            this.f13757c = 0;
            int length = f13755a.list().length;
            if (length >= 700) {
                z = false;
            }
            this.f13758d = z;
            if (!this.f13758d && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit 700");
            }
        }
        return this.f13758d;
    }

    @TargetApi(26)
    /* renamed from: c */
    boolean m10660c(int i2, int i3, BitmapFactory.Options options, EnumC5366b enumC5366b, boolean z, boolean z2) {
        if (!z || Build.VERSION.SDK_INT < 26 || z2) {
            return false;
        }
        boolean z3 = i2 >= 128 && i3 >= 128 && m10659b();
        if (z3) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return z3;
    }
}
