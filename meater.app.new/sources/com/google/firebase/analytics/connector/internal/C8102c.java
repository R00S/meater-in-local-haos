package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzgy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.2.0 */
/* renamed from: com.google.firebase.analytics.connector.internal.c */
/* loaded from: classes2.dex */
public final class C8102c {

    /* renamed from: a */
    private static final Set<String> f30657a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b */
    private static final List<String> f30658b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", "app_open");

    /* renamed from: c */
    private static final List<String> f30659c = Arrays.asList("auto", "app", "am");

    /* renamed from: d */
    private static final List<String> f30660d = Arrays.asList("_r", "_dbg");

    /* renamed from: e */
    private static final List<String> f30661e = Arrays.asList((String[]) ArrayUtils.m14593a(zzgy.f29311a, zzgy.f29312b));

    /* renamed from: f */
    private static final List<String> f30662f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* renamed from: a */
    public static boolean m24959a(String str) {
        return !f30659c.contains(str);
    }

    /* renamed from: b */
    public static boolean m24960b(String str, Bundle bundle) {
        if (f30658b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        Iterator<String> it = f30660d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m24961c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f30661e.contains(str2)) {
            return false;
        }
        Iterator<String> it = f30662f.iterator();
        while (it.hasNext()) {
            if (str2.matches(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m24962d(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!m24959a(str) || bundle == null) {
            return false;
        }
        Iterator<String> it = f30660d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey(it.next())) {
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

    /* renamed from: e */
    public static boolean m24963e(String str) {
        return !f30657a.contains(str);
    }

    /* renamed from: f */
    public static String m24964f(String str) {
        String strM23252a = zzgw.m23252a(str);
        return strM23252a != null ? strM23252a : str;
    }
}
