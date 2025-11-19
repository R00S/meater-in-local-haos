package U4;

import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.DateExtensionKt;
import com.apptionlabs.meater_app.data.Log;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import x4.g;

/* compiled from: MEATERLogger.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f17548a = false;

    /* renamed from: b, reason: collision with root package name */
    private static long f17549b;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f17553f;

    /* renamed from: j, reason: collision with root package name */
    private static FileOutputStream f17557j;

    /* renamed from: k, reason: collision with root package name */
    private static OutputStreamWriter f17558k;

    /* renamed from: c, reason: collision with root package name */
    private static final Date f17550c = new Date();

    /* renamed from: d, reason: collision with root package name */
    private static final DateFormat f17551d = DateExtensionKt.getFormatWithYearHourMinSec();

    /* renamed from: e, reason: collision with root package name */
    private static final DateFormat f17552e = DateExtensionKt.getFormatWithHourMinSec();

    /* renamed from: g, reason: collision with root package name */
    public static String f17554g = e();

    /* renamed from: h, reason: collision with root package name */
    private static List<String> f17555h = null;

    /* renamed from: i, reason: collision with root package name */
    public static int f17556i = 5000;

    /* renamed from: l, reason: collision with root package name */
    private static int f17559l = 0;

    public static void a() {
        if (f17555h == null) {
            return;
        }
        c(1, null);
    }

    public static void b() {
        f(3, null);
    }

    private static synchronized List<String> c(int i10, String str) {
        try {
            if (!Config.getInstance().DEBUG_UI_ENABLED) {
                return null;
            }
            if (i10 == 0) {
                ArrayList arrayList = new ArrayList();
                int i11 = f17559l;
                for (int i12 = 0; i12 < f17555h.size(); i12++) {
                    arrayList.add(f17555h.get(i11));
                    i11 = (i11 + 1) % f17556i;
                }
                return f17555h;
            }
            if (i10 == 1) {
                f17559l = 0;
                f17555h.clear();
            } else if (i10 == 2) {
                if (f17555h == null) {
                    f17555h = new ArrayList();
                }
                if (f17555h.size() < f17556i) {
                    f17555h.add(str);
                } else {
                    f17555h.set(f17559l, str);
                    int i13 = f17559l + 1;
                    f17559l = i13;
                    f17559l = i13 % f17556i;
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static List<String> d() {
        if (f17555h == null) {
            return null;
        }
        return c(0, null);
    }

    private static String e() {
        return DateExtensionKt.getFormatWithYearHourMinSec().format(new Date()) + ".txt";
    }

    private static synchronized boolean f(int i10, String str) {
        try {
            if (i10 == 0) {
                try {
                    f17557j = g.h().openFileOutput(str, 0);
                    f17558k = new OutputStreamWriter(f17557j);
                } catch (IOException e10) {
                    e10.printStackTrace();
                    return false;
                }
            } else if (i10 == 1) {
                try {
                    OutputStreamWriter outputStreamWriter = f17558k;
                    if (outputStreamWriter != null) {
                        outputStreamWriter.write(str + "\n");
                    }
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            } else if (i10 == 2) {
                try {
                    OutputStreamWriter outputStreamWriter2 = f17558k;
                    if (outputStreamWriter2 != null) {
                        outputStreamWriter2.flush();
                    }
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            } else if (i10 == 3) {
                try {
                    OutputStreamWriter outputStreamWriter3 = f17558k;
                    if (outputStreamWriter3 != null) {
                        outputStreamWriter3.close();
                    }
                    f17558k = null;
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return true;
    }

    public static void g() {
        if (f17548a || !Config.getInstance().DEBUG_UI_ENABLED) {
            return;
        }
        h();
        f17548a = true;
    }

    private static void h() {
        boolean zF = f(0, f17554g);
        if (zF) {
            f17549b = 0L;
            Log.info("MEATERLogger", "Android " + f17551d.format(f17550c));
            f17548a = zF;
            Log.info("MEATERLogger", g.n());
            Log.info("MEATERLogger", g.i());
        }
    }

    public static void i() {
        f17553f = true;
    }

    public static void j() {
        f17553f = false;
    }
}
