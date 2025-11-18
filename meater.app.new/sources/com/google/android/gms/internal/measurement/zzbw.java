package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public class zzbw {

    /* renamed from: f */
    private static HashMap<String, String> f27986f;

    /* renamed from: k */
    private static Object f27991k;

    /* renamed from: l */
    private static boolean f27992l;

    /* renamed from: a */
    public static final Uri f27981a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    private static final Uri f27982b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f27983c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f27984d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    private static final AtomicBoolean f27985e = new AtomicBoolean();

    /* renamed from: g */
    private static final HashMap<String, Boolean> f27987g = new HashMap<>();

    /* renamed from: h */
    private static final HashMap<String, Integer> f27988h = new HashMap<>();

    /* renamed from: i */
    private static final HashMap<String, Long> f27989i = new HashMap<>();

    /* renamed from: j */
    private static final HashMap<String, Float> f27990j = new HashMap<>();

    /* renamed from: m */
    private static String[] f27993m = new String[0];

    /* renamed from: a */
    public static String m22084a(ContentResolver contentResolver, String str, String str2) {
        synchronized (zzbw.class) {
            m22087d(contentResolver);
            Object obj = f27991k;
            if (f27986f.containsKey(str)) {
                String str3 = f27986f.get(str);
                return str3 != null ? str3 : null;
            }
            for (String str4 : f27993m) {
                if (str.startsWith(str4)) {
                    if (!f27992l || f27986f.isEmpty()) {
                        f27986f.putAll(m22085b(contentResolver, f27993m));
                        f27992l = true;
                        if (f27986f.containsKey(str)) {
                            String str5 = f27986f.get(str);
                            return str5 != null ? str5 : null;
                        }
                    }
                    return null;
                }
            }
            Cursor cursorQuery = contentResolver.query(f27981a, null, null, new String[]{str}, null);
            if (cursorQuery == null) {
                if (cursorQuery != null) {
                }
                return null;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    m22088e(obj, str, null);
                    return null;
                }
                String string = cursorQuery.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                m22088e(obj, str, string);
                return string != null ? string : null;
            } finally {
                cursorQuery.close();
            }
        }
    }

    /* renamed from: b */
    private static Map<String, String> m22085b(ContentResolver contentResolver, String... strArr) {
        Cursor cursorQuery = contentResolver.query(f27982b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (cursorQuery == null) {
            return treeMap;
        }
        while (cursorQuery.moveToNext()) {
            try {
                treeMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
            } finally {
                cursorQuery.close();
            }
        }
        return treeMap;
    }

    /* renamed from: d */
    private static void m22087d(ContentResolver contentResolver) {
        if (f27986f == null) {
            f27985e.set(false);
            f27986f = new HashMap<>();
            f27991k = new Object();
            f27992l = false;
            contentResolver.registerContentObserver(f27981a, true, new C7528j0(null));
            return;
        }
        if (f27985e.getAndSet(false)) {
            f27986f.clear();
            f27987g.clear();
            f27988h.clear();
            f27989i.clear();
            f27990j.clear();
            f27991k = new Object();
            f27992l = false;
        }
    }

    /* renamed from: e */
    private static void m22088e(Object obj, String str, String str2) {
        synchronized (zzbw.class) {
            if (obj == f27991k) {
                f27986f.put(str, str2);
            }
        }
    }
}
