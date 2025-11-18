package q6;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* compiled from: MemorySizeCalculator.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final int f48096a;

    /* renamed from: b, reason: collision with root package name */
    private final int f48097b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f48098c;

    /* renamed from: d, reason: collision with root package name */
    private final int f48099d;

    /* compiled from: MemorySizeCalculator.java */
    public static final class a {

        /* renamed from: i, reason: collision with root package name */
        static final int f48100i = 1;

        /* renamed from: a, reason: collision with root package name */
        final Context f48101a;

        /* renamed from: b, reason: collision with root package name */
        ActivityManager f48102b;

        /* renamed from: c, reason: collision with root package name */
        c f48103c;

        /* renamed from: e, reason: collision with root package name */
        float f48105e;

        /* renamed from: d, reason: collision with root package name */
        float f48104d = 2.0f;

        /* renamed from: f, reason: collision with root package name */
        float f48106f = 0.4f;

        /* renamed from: g, reason: collision with root package name */
        float f48107g = 0.33f;

        /* renamed from: h, reason: collision with root package name */
        int f48108h = 4194304;

        public a(Context context) {
            this.f48105e = f48100i;
            this.f48101a = context;
            this.f48102b = (ActivityManager) context.getSystemService("activity");
            this.f48103c = new b(context.getResources().getDisplayMetrics());
            if (i.e(this.f48102b)) {
                this.f48105e = 0.0f;
            }
        }

        public i a() {
            return new i(this);
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f48109a;

        b(DisplayMetrics displayMetrics) {
            this.f48109a = displayMetrics;
        }

        @Override // q6.i.c
        public int a() {
            return this.f48109a.heightPixels;
        }

        @Override // q6.i.c
        public int b() {
            return this.f48109a.widthPixels;
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        this.f48098c = aVar.f48101a;
        int i10 = e(aVar.f48102b) ? aVar.f48108h / 2 : aVar.f48108h;
        this.f48099d = i10;
        int iC = c(aVar.f48102b, aVar.f48106f, aVar.f48107g);
        float fB = aVar.f48103c.b() * aVar.f48103c.a() * 4;
        int iRound = Math.round(aVar.f48105e * fB);
        int iRound2 = Math.round(fB * aVar.f48104d);
        int i11 = iC - i10;
        int i12 = iRound2 + iRound;
        if (i12 <= i11) {
            this.f48097b = iRound2;
            this.f48096a = iRound;
        } else {
            float f10 = i11;
            float f11 = aVar.f48105e;
            float f12 = aVar.f48104d;
            float f13 = f10 / (f11 + f12);
            this.f48097b = Math.round(f12 * f13);
            this.f48096a = Math.round(f13 * aVar.f48105e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f48097b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f48096a));
            sb2.append(", byte array size: ");
            sb2.append(f(i10));
            sb2.append(", memory class limited? ");
            sb2.append(i12 > iC);
            sb2.append(", max size: ");
            sb2.append(f(iC));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f48102b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f48102b));
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    @TargetApi(19)
    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i10) {
        return Formatter.formatFileSize(this.f48098c, i10);
    }

    public int a() {
        return this.f48099d;
    }

    public int b() {
        return this.f48096a;
    }

    public int d() {
        return this.f48097b;
    }
}
