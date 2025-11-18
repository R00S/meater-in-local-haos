package U4;

import com.apptionlabs.meater_app.data.DateExtensionKt;
import com.apptionlabs.meater_app.data.Log;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Calendar;
import x4.g;

/* compiled from: CrashReporter.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f17546a = false;

    public static void a(Thread thread, Throwable th, String str) throws IOException {
        if (f17546a) {
            return;
        }
        f17546a = true;
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        c(new String[]{"MeaterVersion: " + g.i(), "MeaterDevice: " + g.n(), "CrashType: " + str, "Thread: " + thread.getName(), "CrashTime: " + b(), stringWriter.toString()});
        th.printStackTrace();
    }

    private static String b() {
        return DateExtensionKt.getServerDateFormat().format(Calendar.getInstance().getTime());
    }

    private static boolean c(String[] strArr) throws IOException {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(g.h().openFileOutput("crash_ui.txt", 32768));
            for (String str : strArr) {
                outputStreamWriter.write(str + "\n");
            }
            outputStreamWriter.flush();
            outputStreamWriter.close();
            return true;
        } catch (Exception e10) {
            Log.error("CreashReporter", e10.toString());
            return false;
        }
    }
}
