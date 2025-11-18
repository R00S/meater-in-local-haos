package com.facebook.internal.p148t0.p152o;

import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import com.facebook.C5641a0;
import com.facebook.C5653d0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5696p0;
import com.facebook.internal.p148t0.C5715k;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.collections.C10825y;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ErrorReportHandler.kt */
/* renamed from: com.facebook.internal.t0.o.e */
/* loaded from: classes2.dex */
public final class C5729e {

    /* renamed from: a */
    public static final C5729e f14617a = new C5729e();

    private C5729e() {
    }

    /* renamed from: a */
    public static final void m11787a() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C5641a0.m11288g()) {
            m11794h();
        }
    }

    /* renamed from: e */
    public static final File[] m11791e() {
        C5715k c5715k = C5715k.f14590a;
        File fileM11744c = C5715k.m11744c();
        if (fileM11744c == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileM11744c.listFiles(new FilenameFilter() { // from class: com.facebook.internal.t0.o.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return C5729e.m11792f(file, str);
            }
        });
        C9801m.m32345e(fileArrListFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
        return fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final boolean m11792f(File file, String str) {
        C9801m.m32345e(str, "name");
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String str2 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
        C9801m.m32345e(str2, "java.lang.String.format(format, *args)");
        return new Regex(str2).m37438b(str);
    }

    /* renamed from: g */
    public static final void m11793g(String str) {
        try {
            new C5728d(str).m11786e();
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public static final void m11794h() {
        C5696p0 c5696p0 = C5696p0.f14478a;
        if (C5696p0.m11553X()) {
            return;
        }
        File[] fileArrM11791e = m11791e();
        final ArrayList arrayList = new ArrayList();
        int length = fileArrM11791e.length;
        int i2 = 0;
        while (i2 < length) {
            File file = fileArrM11791e[i2];
            i2++;
            C5728d c5728d = new C5728d(file);
            if (c5728d.m11785d()) {
                arrayList.add(c5728d);
            }
        }
        C10825y.m38928y(arrayList, new Comparator() { // from class: com.facebook.internal.t0.o.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C5729e.m11795i((C5728d) obj, (C5728d) obj2);
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i3 = 0; i3 < arrayList.size() && i3 < 1000; i3++) {
            jSONArray.put(arrayList.get(i3));
        }
        C5715k c5715k = C5715k.f14590a;
        C5715k.m11760s("error_reports", jSONArray, new GraphRequest.InterfaceC5631b() { // from class: com.facebook.internal.t0.o.b
            @Override // com.facebook.GraphRequest.InterfaceC5631b
            /* renamed from: b */
            public final void mo11196b(C5653d0 c5653d0) {
                C5729e.m11796j(arrayList, c5653d0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final int m11795i(C5728d c5728d, C5728d c5728d2) {
        C9801m.m32345e(c5728d2, "o2");
        return c5728d.m11783b(c5728d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m11796j(ArrayList arrayList, C5653d0 c5653d0) {
        C9801m.m32346f(arrayList, "$validReports");
        C9801m.m32346f(c5653d0, "response");
        try {
            if (c5653d0.m11338b() == null) {
                JSONObject jSONObjectM11340d = c5653d0.m11340d();
                if (C9801m.m32341a(jSONObjectM11340d == null ? null : Boolean.valueOf(jSONObjectM11340d.getBoolean(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION)), Boolean.TRUE)) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C5728d) it.next()).m11782a();
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }
}
