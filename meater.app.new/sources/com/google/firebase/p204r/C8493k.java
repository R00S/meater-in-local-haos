package com.google.firebase.p204r;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;

/* compiled from: HeartBeatInfoStorage.java */
/* renamed from: com.google.firebase.r.k */
/* loaded from: classes2.dex */
class C8493k {

    /* renamed from: a */
    private final SharedPreferences f32115a;

    public C8493k(Context context, String str) {
        this.f32115a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    private synchronized void m26694a() {
        long j2 = this.f32115a.getLong("fire-count", 0L);
        String str = null;
        String key = HttpUrl.FRAGMENT_ENCODE_SET;
        for (Map.Entry<String, ?> entry : this.f32115a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str == null || str.compareTo(str2) > 0) {
                        key = entry.getKey();
                        str = str2;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f32115a.getStringSet(key, new HashSet()));
        hashSet.remove(str);
        this.f32115a.edit().putStringSet(key, hashSet).putLong("fire-count", j2 - 1).commit();
    }

    /* renamed from: d */
    private synchronized String m26695d(long j2) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j2).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j2));
    }

    /* renamed from: e */
    private synchronized String m26696e(String str) {
        for (Map.Entry<String, ?> entry : this.f32115a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    private synchronized void m26697h(String str) {
        String strM26696e = m26696e(str);
        if (strM26696e == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f32115a.getStringSet(strM26696e, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.f32115a.edit().remove(strM26696e).commit();
        } else {
            this.f32115a.edit().putStringSet(strM26696e, hashSet).commit();
        }
    }

    /* renamed from: m */
    private synchronized void m26698m(String str, String str2) {
        m26697h(str2);
        HashSet hashSet = new HashSet(this.f32115a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f32115a.edit().putStringSet(str, hashSet).commit();
    }

    /* renamed from: b */
    synchronized void m26699b() {
        SharedPreferences.Editor editorEdit = this.f32115a.edit();
        int i2 = 0;
        for (Map.Entry<String, ?> entry : this.f32115a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Set set = (Set) entry.getValue();
                String strM26695d = m26695d(System.currentTimeMillis());
                String key = entry.getKey();
                if (set.contains(strM26695d)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(strM26695d);
                    i2++;
                    editorEdit.putStringSet(key, hashSet);
                } else {
                    editorEdit.remove(key);
                }
            }
        }
        if (i2 == 0) {
            editorEdit.remove("fire-count");
        } else {
            editorEdit.putLong("fire-count", i2);
        }
        editorEdit.commit();
    }

    /* renamed from: c */
    synchronized List<AbstractC8494l> m26700c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f32115a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(m26695d(System.currentTimeMillis()));
                if (!hashSet.isEmpty()) {
                    arrayList.add(AbstractC8494l.m26707a(entry.getKey(), new ArrayList(hashSet)));
                }
            }
        }
        m26706l(System.currentTimeMillis());
        return arrayList;
    }

    /* renamed from: f */
    synchronized boolean m26701f(long j2, long j3) {
        return m26695d(j2).equals(m26695d(j3));
    }

    /* renamed from: g */
    synchronized void m26702g() {
        String strM26695d = m26695d(System.currentTimeMillis());
        this.f32115a.edit().putString("last-used-date", strM26695d).commit();
        m26697h(strM26695d);
    }

    /* renamed from: i */
    synchronized boolean m26703i(long j2) {
        return m26704j("fire-global", j2);
    }

    /* renamed from: j */
    synchronized boolean m26704j(String str, long j2) {
        if (!this.f32115a.contains(str)) {
            this.f32115a.edit().putLong(str, j2).commit();
            return true;
        }
        if (m26701f(this.f32115a.getLong(str, -1L), j2)) {
            return false;
        }
        this.f32115a.edit().putLong(str, j2).commit();
        return true;
    }

    /* renamed from: k */
    synchronized void m26705k(long j2, String str) {
        String strM26695d = m26695d(j2);
        if (this.f32115a.getString("last-used-date", HttpUrl.FRAGMENT_ENCODE_SET).equals(strM26695d)) {
            String strM26696e = m26696e(strM26695d);
            if (strM26696e == null) {
                return;
            }
            if (strM26696e.equals(str)) {
                return;
            }
            m26698m(str, strM26695d);
            return;
        }
        long j3 = this.f32115a.getLong("fire-count", 0L);
        if (j3 + 1 == 30) {
            m26694a();
            j3 = this.f32115a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f32115a.getStringSet(str, new HashSet()));
        hashSet.add(strM26695d);
        this.f32115a.edit().putStringSet(str, hashSet).putLong("fire-count", j3 + 1).putString("last-used-date", strM26695d).commit();
    }

    /* renamed from: l */
    synchronized void m26706l(long j2) {
        this.f32115a.edit().putLong("fire-global", j2).commit();
    }
}
