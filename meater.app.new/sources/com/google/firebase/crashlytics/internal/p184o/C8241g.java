package com.google.firebase.crashlytics.internal.p184o;

import cm.aptoide.p092pt.account.AndroidAccountManagerPersistence;
import com.google.firebase.crashlytics.internal.C8179h;
import com.google.firebase.crashlytics.internal.p183n.C8228t;
import com.google.firebase.crashlytics.internal.p188r.C8298f;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MetaDataStore.java */
/* renamed from: com.google.firebase.crashlytics.h.o.g */
/* loaded from: classes2.dex */
class C8241g {

    /* renamed from: a */
    private static final Charset f31082a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final C8298f f31083b;

    /* compiled from: MetaDataStore.java */
    /* renamed from: com.google.firebase.crashlytics.h.o.g$a */
    class a extends JSONObject {

        /* renamed from: a */
        final /* synthetic */ String f31084a;

        a(String str) throws JSONException {
            this.f31084a = str;
            put(AndroidAccountManagerPersistence.ACCOUNT_ID, str);
        }
    }

    public C8241g(C8298f c8298f) {
        this.f31083b = c8298f;
    }

    /* renamed from: e */
    private static Map<String, String> m25480e(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, m25487o(jSONObject, next));
        }
        return map;
    }

    /* renamed from: f */
    private static List<AbstractC8244j> m25481f(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            try {
                arrayList.add(AbstractC8244j.m25529a(string));
            } catch (Exception e2) {
                C8179h.m25176f().m25186l("Failed de-serializing rollouts state. " + string, e2);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private String m25482g(String str) throws JSONException {
        return m25487o(new JSONObject(str), AndroidAccountManagerPersistence.ACCOUNT_ID);
    }

    /* renamed from: h */
    private static String m25483h(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    /* renamed from: l */
    private static String m25484l(List<AbstractC8244j> list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < list.size(); i2++) {
            try {
                jSONArray.put(new JSONObject(AbstractC8244j.f31110a.mo26075b(list.get(i2))));
            } catch (JSONException e2) {
                C8179h.m25176f().m25186l("Exception parsing rollout assignment!", e2);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    /* renamed from: m */
    private static void m25485m(File file) {
        if (file.exists() && file.delete()) {
            C8179h.m25176f().m25181g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* renamed from: n */
    private static String m25486n(String str) throws JSONException {
        return new a(str).toString();
    }

    /* renamed from: o */
    private static String m25487o(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    /* renamed from: a */
    public File m25488a(String str) {
        return this.f31083b.m26007o(str, "internal-keys");
    }

    /* renamed from: b */
    public File m25489b(String str) {
        return this.f31083b.m26007o(str, "keys");
    }

    /* renamed from: c */
    public File m25490c(String str) {
        return this.f31083b.m26007o(str, "rollouts-state");
    }

    /* renamed from: d */
    public File m25491d(String str) {
        return this.f31083b.m26007o(str, "user-data");
    }

    /* renamed from: i */
    Map<String, String> m25492i(String str, boolean z) throws Throwable {
        FileInputStream fileInputStream;
        Exception e2;
        File fileM25488a = z ? m25488a(str) : m25489b(str);
        if (!fileM25488a.exists() || fileM25488a.length() == 0) {
            m25485m(fileM25488a);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(fileM25488a);
        } catch (Exception e3) {
            fileInputStream = null;
            e2 = e3;
        } catch (Throwable th) {
            th = th;
            C8228t.m25335f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                Map<String, String> mapM25480e = m25480e(C8228t.m25329A(fileInputStream));
                C8228t.m25335f(fileInputStream, "Failed to close user metadata file.");
                return mapM25480e;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                C8228t.m25335f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e4) {
            e2 = e4;
            C8179h.m25176f().m25186l("Error deserializing user metadata.", e2);
            m25485m(fileM25488a);
            C8228t.m25335f(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        }
    }

    /* renamed from: j */
    public List<AbstractC8244j> m25493j(String str) throws Throwable {
        File fileM25490c = m25490c(str);
        if (!fileM25490c.exists() || fileM25490c.length() == 0) {
            m25485m(fileM25490c);
            return Collections.emptyList();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileM25490c);
                try {
                    List<AbstractC8244j> listM25481f = m25481f(C8228t.m25329A(fileInputStream2));
                    C8179h.m25176f().m25177b("Loaded rollouts state:\n" + listM25481f + "\nfor session " + str);
                    C8228t.m25335f(fileInputStream2, "Failed to close rollouts state file.");
                    return listM25481f;
                } catch (Exception e2) {
                    e = e2;
                    fileInputStream = fileInputStream2;
                    C8179h.m25176f().m25186l("Error deserializing rollouts state.", e);
                    m25485m(fileM25490c);
                    C8228t.m25335f(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.emptyList();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    C8228t.m25335f(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* renamed from: k */
    public String m25494k(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileM25491d = m25491d(str);
        FileInputStream fileInputStream2 = null;
        if (!fileM25491d.exists() || fileM25491d.length() == 0) {
            C8179h.m25176f().m25177b("No userId set for session " + str);
            m25485m(fileM25491d);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileM25491d);
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            C8228t.m25335f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                String strM25482g = m25482g(C8228t.m25329A(fileInputStream));
                C8179h.m25176f().m25177b("Loaded userId " + strM25482g + " for session " + str);
                C8228t.m25335f(fileInputStream, "Failed to close user metadata file.");
                return strM25482g;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                C8228t.m25335f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            C8179h.m25176f().m25186l("Error deserializing user metadata.", e);
            m25485m(fileM25491d);
            C8228t.m25335f(fileInputStream, "Failed to close user metadata file.");
            return null;
        }
    }

    /* renamed from: p */
    public void m25495p(String str, Map<String, String> map) throws Throwable {
        m25496q(str, map, false);
    }

    /* renamed from: q */
    public void m25496q(String str, Map<String, String> map, boolean z) throws Throwable {
        File fileM25488a = z ? m25488a(str) : m25489b(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strM25483h = m25483h(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM25488a), f31082a));
                try {
                    bufferedWriter2.write(strM25483h);
                    bufferedWriter2.flush();
                    C8228t.m25335f(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e2) {
                    e = e2;
                    bufferedWriter = bufferedWriter2;
                    C8179h.m25176f().m25186l("Error serializing key/value metadata.", e);
                    m25485m(fileM25488a);
                    C8228t.m25335f(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    C8228t.m25335f(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: r */
    public void m25497r(String str, List<AbstractC8244j> list) throws Throwable {
        File fileM25490c = m25490c(str);
        if (list.isEmpty()) {
            m25485m(fileM25490c);
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strM25484l = m25484l(list);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM25490c), f31082a));
                try {
                    bufferedWriter2.write(strM25484l);
                    bufferedWriter2.flush();
                    C8228t.m25335f(bufferedWriter2, "Failed to close rollouts state file.");
                } catch (Exception e2) {
                    e = e2;
                    bufferedWriter = bufferedWriter2;
                    C8179h.m25176f().m25186l("Error serializing rollouts state.", e);
                    m25485m(fileM25490c);
                    C8228t.m25335f(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    C8228t.m25335f(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: s */
    public void m25498s(String str, String str2) throws Throwable {
        File fileM25491d = m25491d(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strM25486n = m25486n(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM25491d), f31082a));
                try {
                    bufferedWriter2.write(strM25486n);
                    bufferedWriter2.flush();
                    C8228t.m25335f(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e2) {
                    e = e2;
                    bufferedWriter = bufferedWriter2;
                    C8179h.m25176f().m25186l("Error serializing user metadata.", e);
                    C8228t.m25335f(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    C8228t.m25335f(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }
}
