package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.apptionlabs.meater_app.data.Temperature;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: HardwareConfigState.java */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f33358e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f33359f;

    /* renamed from: g, reason: collision with root package name */
    private static final File f33360g;

    /* renamed from: h, reason: collision with root package name */
    private static volatile t f33361h;

    /* renamed from: b, reason: collision with root package name */
    private int f33363b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f33364c = true;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f33365d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    private final int f33362a = 20000;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f33358e = i10 < 29;
        f33359f = i10 >= 28;
        f33360g = new File("/proc/self/fd");
    }

    t() {
    }

    private boolean a() {
        return f33358e && !this.f33365d.get();
    }

    public static t b() {
        if (f33361h == null) {
            synchronized (t.class) {
                try {
                    if (f33361h == null) {
                        f33361h = new t();
                    }
                } finally {
                }
            }
        }
        return f33361h;
    }

    private int c() {
        return e() ? Temperature.MAX_AMBIENT_SECOND_GEN_PROBE : this.f33362a;
    }

    private synchronized boolean d() {
        try {
            boolean z10 = true;
            int i10 = this.f33363b + 1;
            this.f33363b = i10;
            if (i10 >= 50) {
                this.f33363b = 0;
                int length = f33360g.list().length;
                long jC = c();
                if (length >= jC) {
                    z10 = false;
                }
                this.f33364c = z10;
                if (!z10 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jC);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f33364c;
    }

    private static boolean e() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i10, int i11, boolean z10, boolean z11) {
        if (!z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f33359f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z11) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i10 < 0 || i11 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (d()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    @TargetApi(26)
    boolean g(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean zF = f(i10, i11, z10, z11);
        if (zF) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zF;
    }

    public void h() {
        H6.l.a();
        this.f33365d.set(true);
    }
}
