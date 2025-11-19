package x9;

import C9.i;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import v9.C4925a;

/* compiled from: PerfMetricValidator.java */
/* loaded from: classes2.dex */
public abstract class e {
    private static List<e> a(i iVar, Context context) {
        ArrayList arrayList = new ArrayList();
        if (iVar.m()) {
            arrayList.add(new d(iVar.n()));
        }
        if (iVar.o()) {
            arrayList.add(new C5081c(iVar.p(), context));
        }
        if (iVar.g0()) {
            arrayList.add(new C5079a(iVar.f0()));
        }
        if (iVar.k()) {
            arrayList.add(new C5080b(iVar.q()));
        }
        return arrayList;
    }

    public static boolean b(i iVar, Context context) {
        List<e> listA = a(iVar, context);
        if (listA.isEmpty()) {
            C4925a.e().a("No validators found for PerfMetric.");
            return false;
        }
        Iterator<e> it = listA.iterator();
        while (it.hasNext()) {
            if (!it.next().c()) {
                return false;
            }
        }
        return true;
    }

    public static void d(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        }
        if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        if (str.length() > 40) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", 40));
        }
        if (str2.length() > 100) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", 100));
        }
        if (!str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    public static String e(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (B9.b bVar : B9.b.values()) {
            if (bVar.toString().equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    public static String f(String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (B9.c cVar : B9.c.values()) {
            if (cVar.toString().equals(str)) {
                return null;
            }
        }
        if (str.startsWith("_st_")) {
            return null;
        }
        return "Trace name must not start with '_'";
    }

    public abstract boolean c();
}
