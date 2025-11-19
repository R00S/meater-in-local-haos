package com.google.firebase.analytics.connector.internal;

import I8.a;
import android.os.Bundle;
import g7.C3445p;
import m8.AbstractC3979B;
import m8.AbstractC4009y;
import v7.D;
import v7.H;
import v7.J;
import v7.Z;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.2.0 */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC3979B<String> f38083a = AbstractC3979B.O("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4009y<String> f38084b = AbstractC4009y.L("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC4009y<String> f38085c = AbstractC4009y.J("auto", "app", "am");

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC4009y<String> f38086d = AbstractC4009y.I("_r", "_dbg");

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC4009y<String> f38087e = new AbstractC4009y.a().i(J.f51514a).i(J.f51515b).k();

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC4009y<String> f38088f = AbstractC4009y.I("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static a.c a(Bundle bundle) {
        C3445p.k(bundle);
        a.c cVar = new a.c();
        cVar.f6735a = (String) C3445p.k((String) D.a(bundle, "origin", String.class, null));
        cVar.f6736b = (String) C3445p.k((String) D.a(bundle, "name", String.class, null));
        cVar.f6737c = D.a(bundle, "value", Object.class, null);
        cVar.f6738d = (String) D.a(bundle, "trigger_event_name", String.class, null);
        cVar.f6739e = ((Long) D.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
        cVar.f6740f = (String) D.a(bundle, "timed_out_event_name", String.class, null);
        cVar.f6741g = (Bundle) D.a(bundle, "timed_out_event_params", Bundle.class, null);
        cVar.f6742h = (String) D.a(bundle, "triggered_event_name", String.class, null);
        cVar.f6743i = (Bundle) D.a(bundle, "triggered_event_params", Bundle.class, null);
        cVar.f6744j = ((Long) D.a(bundle, "time_to_live", Long.class, 0L)).longValue();
        cVar.f6745k = (String) D.a(bundle, "expired_event_name", String.class, null);
        cVar.f6746l = (Bundle) D.a(bundle, "expired_event_params", Bundle.class, null);
        cVar.f6748n = ((Boolean) D.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        cVar.f6747m = ((Long) D.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
        cVar.f6749o = ((Long) D.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        return cVar;
    }

    public static Bundle b(a.c cVar) {
        Bundle bundle = new Bundle();
        String str = cVar.f6735a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = cVar.f6736b;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = cVar.f6737c;
        if (obj != null) {
            D.b(bundle, obj);
        }
        String str3 = cVar.f6738d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", cVar.f6739e);
        String str4 = cVar.f6740f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = cVar.f6741g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = cVar.f6742h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = cVar.f6743i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", cVar.f6744j);
        String str6 = cVar.f6745k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = cVar.f6746l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", cVar.f6747m);
        bundle.putBoolean("active", cVar.f6748n);
        bundle.putLong("triggered_timestamp", cVar.f6749o);
        return bundle;
    }

    public static String c(String str) {
        String strA = H.a(str);
        return strA != null ? strA : str;
    }

    public static void d(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean e(String str, Bundle bundle) {
        if (f38084b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        AbstractC4009y<String> abstractC4009y = f38086d;
        int size = abstractC4009y.size();
        int i10 = 0;
        while (i10 < size) {
            String str2 = abstractC4009y.get(i10);
            i10++;
            if (bundle.containsKey(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f38087e.contains(str2)) {
            return false;
        }
        AbstractC4009y<String> abstractC4009y = f38088f;
        int size = abstractC4009y.size();
        int i10 = 0;
        while (i10 < size) {
            String str3 = abstractC4009y.get(i10);
            i10++;
            if (str2.matches(str3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(a.c cVar) {
        String str;
        if (cVar == null || (str = cVar.f6735a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.f6737c;
        if ((obj != null && Z.a(obj) == null) || !j(str) || !f(str, cVar.f6736b)) {
            return false;
        }
        String str2 = cVar.f6745k;
        if (str2 != null && (!e(str2, cVar.f6746l) || !h(str, cVar.f6745k, cVar.f6746l))) {
            return false;
        }
        String str3 = cVar.f6742h;
        if (str3 != null && (!e(str3, cVar.f6743i) || !h(str, cVar.f6742h, cVar.f6743i))) {
            return false;
        }
        String str4 = cVar.f6740f;
        if (str4 != null) {
            return e(str4, cVar.f6741g) && h(str, cVar.f6740f, cVar.f6741g);
        }
        return true;
    }

    public static boolean h(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!j(str) || bundle == null) {
            return false;
        }
        AbstractC4009y<String> abstractC4009y = f38086d;
        int size = abstractC4009y.size();
        int i10 = 0;
        while (i10 < size) {
            String str3 = abstractC4009y.get(i10);
            i10++;
            if (bundle.containsKey(str3)) {
                return false;
            }
        }
        str.hashCode();
        switch (str) {
            case "fcm":
                bundle.putString("_cis", "fcm_integration");
                return true;
            case "fdl":
                bundle.putString("_cis", "fdl_integration");
                return true;
            case "fiam":
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static boolean i(String str) {
        return !f38083a.contains(str);
    }

    public static boolean j(String str) {
        return !f38085c.contains(str);
    }
}
