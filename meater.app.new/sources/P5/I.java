package P5;

import android.content.Context;
import com.apptionlabs.meater_app.R;
import java.util.Locale;

/* compiled from: TimeFormatter.java */
/* loaded from: classes2.dex */
public class I {
    public static String a(long j10) {
        long j11 = j10 / 3600;
        long j12 = (j10 - (3600 * j11)) / 60;
        String strF = f(j10);
        if (j11 > 1 || j12 > 1) {
            return strF + " " + x4.g.h().getString(R.string.have_elapsed_label);
        }
        return strF + " " + x4.g.h().getString(R.string.has_elapsed_label);
    }

    public static String b(double d10) {
        int iFloor = (int) Math.floor((d10 / 60.0d) / 60.0d);
        double d11 = d10 - (iFloor * 3600);
        return String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf(iFloor), Integer.valueOf((int) Math.floor(d11 / 60.0d)), Integer.valueOf((int) Math.floor(d11 - (r0 * 60))));
    }

    public static String c(long j10) {
        long jFloor = j10 - (((int) Math.floor((j10 / 60) / 60)) * 3600);
        return String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf((int) Math.floor(jFloor / 60)), Integer.valueOf((int) Math.floor(jFloor - (r2 * 60))));
    }

    public static String d(long j10) {
        return g(x4.g.h(), j10, R.string.before_cook_end_label);
    }

    public static String e(Context context, double d10) {
        String string = context.getString(R.string.time_string_h);
        String string2 = context.getString(R.string.time_string_m);
        String string3 = context.getString(R.string.time_string_s);
        int iFloor = (int) Math.floor((d10 / 60.0d) / 60.0d);
        double d11 = d10 - (iFloor * 3600);
        int iFloor2 = (int) Math.floor(d11 / 60.0d);
        int iFloor3 = (int) Math.floor(d11 - (iFloor2 * 60));
        return (iFloor <= 0 || iFloor2 <= 0 || iFloor3 <= 0) ? (iFloor <= 0 || iFloor2 <= 0) ? iFloor > 0 ? String.format(Locale.US, "%d%s", Integer.valueOf(iFloor), string) : (iFloor2 <= 0 || iFloor3 <= 0) ? iFloor2 > 0 ? String.format(Locale.US, "%d%s", Integer.valueOf(iFloor2), string2) : String.format(Locale.US, "%d%s", Integer.valueOf(iFloor3), string3) : String.format(Locale.US, "%d%s %d%s", Integer.valueOf(iFloor2), string2, Integer.valueOf(iFloor3), string3) : String.format(Locale.US, "%d%s %d%s", Integer.valueOf(iFloor), string, Integer.valueOf(iFloor2), string2) : String.format(Locale.US, "%d%s %d%s %d%s", Integer.valueOf(iFloor), string, Integer.valueOf(iFloor2), string2, Integer.valueOf(iFloor3), string3);
    }

    public static String f(long j10) {
        return g(x4.g.h(), j10, -1);
    }

    public static String g(Context context, double d10, int i10) {
        String string = context.getString(R.string.time_string_h);
        String string2 = context.getString(R.string.time_string_m);
        int iFloor = (int) Math.floor((d10 / 60.0d) / 60.0d);
        double d11 = d10 - (iFloor * 3600);
        int iFloor2 = (int) Math.floor(d11 / 60.0d);
        if (((int) Math.floor(d11 - (iFloor2 * 60))) > 10) {
            iFloor2++;
        }
        String str = (iFloor <= 0 || iFloor2 <= 0) ? iFloor > 0 ? String.format(Locale.US, "%d%s", Integer.valueOf(iFloor), string) : String.format(Locale.US, "%d%s", Integer.valueOf(iFloor2), string2) : String.format(Locale.US, "%d%s %d%s", Integer.valueOf(iFloor), string, Integer.valueOf(iFloor2), string2);
        return i10 <= 0 ? str : String.format(Locale.US, "%s %s", str, context.getString(i10));
    }

    public static String h(long j10) {
        try {
            String string = x4.g.h().getString(R.string.time_string_h);
            String string2 = x4.g.h().getString(R.string.time_string_m);
            int iFloor = (int) Math.floor(j10 / 60);
            int iFloor2 = (int) Math.floor(j10 % 60);
            return (iFloor <= 0 || iFloor2 <= 0) ? iFloor > 0 ? String.format(Locale.US, "%d%s", Integer.valueOf(iFloor), string) : String.format(Locale.US, "%d%s", Integer.valueOf(iFloor2), string2) : String.format(Locale.US, "%d%s %d%s", Integer.valueOf(iFloor), string, Integer.valueOf(iFloor2), string2);
        } catch (Exception unused) {
            return "";
        }
    }
}
