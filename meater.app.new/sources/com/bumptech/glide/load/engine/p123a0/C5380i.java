package com.bumptech.glide.load.engine.p123a0;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* compiled from: MemorySizeCalculator.java */
/* renamed from: com.bumptech.glide.load.engine.a0.i */
/* loaded from: classes.dex */
public final class C5380i {

    /* renamed from: a */
    private final int f13268a;

    /* renamed from: b */
    private final int f13269b;

    /* renamed from: c */
    private final Context f13270c;

    /* renamed from: d */
    private final int f13271d;

    /* compiled from: MemorySizeCalculator.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.i$a */
    public static final class a {

        /* renamed from: a */
        static final int f13272a;

        /* renamed from: b */
        final Context f13273b;

        /* renamed from: c */
        ActivityManager f13274c;

        /* renamed from: d */
        c f13275d;

        /* renamed from: f */
        float f13277f;

        /* renamed from: e */
        float f13276e = 2.0f;

        /* renamed from: g */
        float f13278g = 0.4f;

        /* renamed from: h */
        float f13279h = 0.33f;

        /* renamed from: i */
        int f13280i = 4194304;

        static {
            f13272a = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f13277f = f13272a;
            this.f13273b = context;
            this.f13274c = (ActivityManager) context.getSystemService("activity");
            this.f13275d = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !C5380i.m10201e(this.f13274c)) {
                return;
            }
            this.f13277f = 0.0f;
        }

        /* renamed from: a */
        public C5380i m10206a() {
            return new C5380i(this);
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.i$b */
    private static final class b implements c {

        /* renamed from: a */
        private final DisplayMetrics f13281a;

        b(DisplayMetrics displayMetrics) {
            this.f13281a = displayMetrics;
        }

        @Override // com.bumptech.glide.load.engine.p123a0.C5380i.c
        /* renamed from: a */
        public int mo10207a() {
            return this.f13281a.heightPixels;
        }

        @Override // com.bumptech.glide.load.engine.p123a0.C5380i.c
        /* renamed from: b */
        public int mo10208b() {
            return this.f13281a.widthPixels;
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.i$c */
    interface c {
        /* renamed from: a */
        int mo10207a();

        /* renamed from: b */
        int mo10208b();
    }

    C5380i(a aVar) {
        this.f13270c = aVar.f13273b;
        int i2 = m10201e(aVar.f13274c) ? aVar.f13280i / 2 : aVar.f13280i;
        this.f13271d = i2;
        int iM10200c = m10200c(aVar.f13274c, aVar.f13278g, aVar.f13279h);
        float fMo10208b = aVar.f13275d.mo10208b() * aVar.f13275d.mo10207a() * 4;
        int iRound = Math.round(aVar.f13277f * fMo10208b);
        int iRound2 = Math.round(fMo10208b * aVar.f13276e);
        int i3 = iM10200c - i2;
        int i4 = iRound2 + iRound;
        if (i4 <= i3) {
            this.f13269b = iRound2;
            this.f13268a = iRound;
        } else {
            float f2 = i3;
            float f3 = aVar.f13277f;
            float f4 = aVar.f13276e;
            float f5 = f2 / (f3 + f4);
            this.f13269b = Math.round(f4 * f5);
            this.f13268a = Math.round(f5 * aVar.f13277f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m10202f(this.f13269b));
            sb.append(", pool size: ");
            sb.append(m10202f(this.f13268a));
            sb.append(", byte array size: ");
            sb.append(m10202f(i2));
            sb.append(", memory class limited? ");
            sb.append(i4 > iM10200c);
            sb.append(", max size: ");
            sb.append(m10202f(iM10200c));
            sb.append(", memoryClass: ");
            sb.append(aVar.f13274c.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m10201e(aVar.f13274c));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    /* renamed from: c */
    private static int m10200c(ActivityManager activityManager, float f2, float f3) {
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (m10201e(activityManager)) {
            f2 = f3;
        }
        return Math.round(memoryClass * f2);
    }

    @TargetApi(19)
    /* renamed from: e */
    static boolean m10201e(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    /* renamed from: f */
    private String m10202f(int i2) {
        return Formatter.formatFileSize(this.f13270c, i2);
    }

    /* renamed from: a */
    public int m10203a() {
        return this.f13271d;
    }

    /* renamed from: b */
    public int m10204b() {
        return this.f13268a;
    }

    /* renamed from: d */
    public int m10205d() {
        return this.f13269b;
    }
}
