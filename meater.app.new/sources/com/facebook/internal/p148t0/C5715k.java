package com.facebook.internal.p148t0;

import com.facebook.C5641a0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5696p0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C10546u;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InstrumentUtility.kt */
/* renamed from: com.facebook.internal.t0.k */
/* loaded from: classes2.dex */
public final class C5715k {

    /* renamed from: a */
    public static final C5715k f14590a = new C5715k();

    private C5715k() {
    }

    /* renamed from: a */
    public static final boolean m11742a(String str) {
        File fileM11744c = m11744c();
        if (fileM11744c == null || str == null) {
            return false;
        }
        return new File(fileM11744c, str).delete();
    }

    /* renamed from: b */
    public static final String m11743b(Throwable th) {
        if (th == null) {
            return null;
        }
        return th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
    }

    /* renamed from: c */
    public static final File m11744c() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        File file = new File(C5641a0.m11284c().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* renamed from: d */
    public static final String m11745d(Thread thread) {
        C9801m.m32346f(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        C9801m.m32345e(stackTrace, "stackTrace");
        int length = stackTrace.length;
        int i2 = 0;
        while (i2 < length) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            i2++;
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    /* renamed from: e */
    public static final String m11746e(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            C9801m.m32345e(stackTrace, "t.stackTrace");
            int i2 = 0;
            int length = stackTrace.length;
            while (i2 < length) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                i2++;
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    /* renamed from: f */
    public static final boolean m11747f(StackTraceElement stackTraceElement) {
        C9801m.m32346f(stackTraceElement, "element");
        String className = stackTraceElement.getClassName();
        C9801m.m32345e(className, "element.className");
        if (!C10546u.m37511E(className, "com.facebook", false, 2, null)) {
            String className2 = stackTraceElement.getClassName();
            C9801m.m32345e(className2, "element.className");
            if (!C10546u.m37511E(className2, "com.meta", false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static final boolean m11748g(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            C9801m.m32345e(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i2 = 0;
            while (i2 < length) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                i2++;
                C9801m.m32345e(stackTraceElement, "element");
                if (m11747f(stackTraceElement)) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m11749h(Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                C9801m.m32345e(stackTraceElement, "element");
                if (m11747f(stackTraceElement)) {
                    String className = stackTraceElement.getClassName();
                    C9801m.m32345e(className, "element.className");
                    if (!C10546u.m37511E(className, "com.facebook.appevents.codeless", false, 2, null)) {
                        String className2 = stackTraceElement.getClassName();
                        C9801m.m32345e(className2, "element.className");
                        if (!C10546u.m37511E(className2, "com.facebook.appevents.suggestedevents", false, 2, null)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    C9801m.m32345e(methodName, "element.methodName");
                    if (C10546u.m37511E(methodName, "onClick", false, 2, null)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        C9801m.m32345e(methodName2, "element.methodName");
                        if (C10546u.m37511E(methodName2, "onItemClick", false, 2, null)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            C9801m.m32345e(methodName3, "element.methodName");
                            if (!C10546u.m37511E(methodName3, "onTouch", false, 2, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: l */
    public static final File[] m11753l() {
        File fileM11744c = m11744c();
        if (fileM11744c == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileM11744c.listFiles(new FilenameFilter() { // from class: com.facebook.internal.t0.e
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return C5715k.m11754m(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final boolean m11754m(File file, String str) {
        C9801m.m32345e(str, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String str2 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
        C9801m.m32345e(str2, "java.lang.String.format(format, *args)");
        return new Regex(str2).m37438b(str);
    }

    /* renamed from: n */
    public static final File[] m11755n() {
        File fileM11744c = m11744c();
        if (fileM11744c == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileM11744c.listFiles(new FilenameFilter() { // from class: com.facebook.internal.t0.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return C5715k.m11756o(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final boolean m11756o(File file, String str) {
        C9801m.m32345e(str, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String str2 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
        C9801m.m32345e(str2, "java.lang.String.format(format, *args)");
        return new Regex(str2).m37438b(str);
    }

    /* renamed from: p */
    public static final File[] m11757p() {
        File fileM11744c = m11744c();
        if (fileM11744c == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileM11744c.listFiles(new FilenameFilter() { // from class: com.facebook.internal.t0.g
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return C5715k.m11758q(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final boolean m11758q(File file, String str) {
        C9801m.m32345e(str, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String str2 = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
        C9801m.m32345e(str2, "java.lang.String.format(format, *args)");
        return new Regex(str2).m37438b(str);
    }

    /* renamed from: r */
    public static final JSONObject m11759r(String str, boolean z) {
        File fileM11744c = m11744c();
        if (fileM11744c != null && str != null) {
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(fileM11744c, str));
                C5696p0 c5696p0 = C5696p0.f14478a;
                return new JSONObject(C5696p0.m11593s0(fileInputStream));
            } catch (Exception unused) {
                if (z) {
                    m11742a(str);
                }
            }
        }
        return null;
    }

    /* renamed from: s */
    public static final void m11760s(String str, JSONArray jSONArray, GraphRequest.InterfaceC5631b interfaceC5631b) {
        C9801m.m32346f(jSONArray, "reports");
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            C5696p0 c5696p0 = C5696p0.f14478a;
            JSONObject jSONObjectM11525A = C5696p0.m11525A();
            if (jSONObjectM11525A != null) {
                Iterator<String> itKeys = jSONObjectM11525A.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectM11525A.get(next));
                }
            }
            GraphRequest.C5632c c5632c = GraphRequest.f14159a;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            C5641a0 c5641a0 = C5641a0.f14199a;
            String str2 = String.format("%s/instruments", Arrays.copyOf(new Object[]{C5641a0.m11285d()}, 1));
            C9801m.m32345e(str2, "java.lang.String.format(format, *args)");
            c5632c.m11222A(null, str2, jSONObject, interfaceC5631b).m11180k();
        } catch (JSONException unused) {
        }
    }

    /* renamed from: t */
    public static final void m11761t(String str, String str2) throws IOException {
        File fileM11744c = m11744c();
        if (fileM11744c == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileM11744c, str));
            byte[] bytes = str2.getBytes(Charsets.f40651b);
            C9801m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
