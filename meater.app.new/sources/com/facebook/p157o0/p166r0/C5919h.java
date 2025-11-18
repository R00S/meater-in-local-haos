package com.facebook.p157o0.p166r0;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C5641a0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5666a0;
import com.facebook.internal.C5696p0;
import com.facebook.p157o0.p164p0.C5892a;
import com.facebook.p157o0.p165q0.AsyncTaskC5906k;
import com.facebook.p157o0.p166r0.C5919h;
import com.facebook.p157o0.p169u0.C5938h;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.C9848l;
import kotlin.ranges.IntRange;
import kotlin.text.C10546u;
import kotlin.text.C10547v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ModelManager.kt */
/* renamed from: com.facebook.o0.r0.h */
/* loaded from: classes2.dex */
public final class C5919h {

    /* renamed from: a */
    public static final C5919h f15431a = new C5919h();

    /* renamed from: b */
    private static final Map<String, b> f15432b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final List<String> f15433c = C10817u.m38891m("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* renamed from: d */
    private static final List<String> f15434d = C10817u.m38891m("none", "address", "health");

    /* compiled from: ModelManager.kt */
    /* renamed from: com.facebook.o0.r0.h$a */
    public enum a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* compiled from: ModelManager.kt */
        /* renamed from: com.facebook.o0.r0.h$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C11462a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f15438a;

            static {
                int[] iArr = new int[a.valuesCustom().length];
                iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                f15438a = iArr;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
        }

        /* renamed from: k */
        public final String m12703k() {
            int i2 = C11462a.f15438a[ordinal()];
            if (i2 == 1) {
                return "integrity_detect";
            }
            if (i2 == 2) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: q */
        public final String m12704q() {
            int i2 = C11462a.f15438a[ordinal()];
            if (i2 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i2 == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: ModelManager.kt */
    /* renamed from: com.facebook.o0.r0.h$b */
    public static final class b {

        /* renamed from: a */
        public static final a f15439a = new a(null);

        /* renamed from: b */
        private String f15440b;

        /* renamed from: c */
        private String f15441c;

        /* renamed from: d */
        private String f15442d;

        /* renamed from: e */
        private int f15443e;

        /* renamed from: f */
        private float[] f15444f;

        /* renamed from: g */
        private File f15445g;

        /* renamed from: h */
        private C5918g f15446h;

        /* renamed from: i */
        private Runnable f15447i;

        /* compiled from: ModelManager.kt */
        /* renamed from: com.facebook.o0.r0.h$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9789g c9789g) {
                this();
            }

            /* renamed from: b */
            private final void m12716b(String str, int i2) {
                File[] fileArrListFiles;
                C5921j c5921j = C5921j.f15450a;
                File fileM12736a = C5921j.m12736a();
                if (fileM12736a == null || (fileArrListFiles = fileM12736a.listFiles()) == null) {
                    return;
                }
                if (fileArrListFiles.length == 0) {
                    return;
                }
                String str2 = str + '_' + i2;
                int length = fileArrListFiles.length;
                int i3 = 0;
                while (i3 < length) {
                    File file = fileArrListFiles[i3];
                    i3++;
                    String name = file.getName();
                    C9801m.m32345e(name, "name");
                    if (C10546u.m37511E(name, str, false, 2, null) && !C10546u.m37511E(name, str2, false, 2, null)) {
                        file.delete();
                    }
                }
            }

            /* renamed from: c */
            private final void m12717c(String str, String str2, AsyncTaskC5906k.a aVar) {
                C5921j c5921j = C5921j.f15450a;
                File file = new File(C5921j.m12736a(), str2);
                if (str == null || file.exists()) {
                    aVar.mo12645a(file);
                } else {
                    new AsyncTaskC5906k(str, file, aVar).execute(new String[0]);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public static final void m12718e(List list, File file) {
                C9801m.m32346f(list, "$slaves");
                C9801m.m32346f(file, "file");
                final C5918g c5918gM12682a = C5918g.f15417a.m12682a(file);
                if (c5918gM12682a != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        final b bVar = (b) it.next();
                        b.f15439a.m12717c(bVar.m12709e(), bVar.m12711g() + '_' + bVar.m12712h() + "_rule", new AsyncTaskC5906k.a() { // from class: com.facebook.o0.r0.c
                            @Override // com.facebook.p157o0.p165q0.AsyncTaskC5906k.a
                            /* renamed from: a */
                            public final void mo12645a(File file2) {
                                C5919h.b.a.m12719f(bVar, c5918gM12682a, file2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: f */
            public static final void m12719f(b bVar, C5918g c5918g, File file) {
                C9801m.m32346f(bVar, "$slave");
                C9801m.m32346f(file, "file");
                bVar.m12713i(c5918g);
                bVar.m12715k(file);
                Runnable runnable = bVar.f15447i;
                if (runnable == null) {
                    return;
                }
                runnable.run();
            }

            /* renamed from: a */
            public final b m12722a(JSONObject jSONObject) throws JSONException {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String string = jSONObject.getString("use_case");
                    String string2 = jSONObject.getString("asset_uri");
                    String strOptString = jSONObject.optString("rules_uri", null);
                    int i2 = jSONObject.getInt("version_id");
                    float[] fArrM12697o = C5919h.f15431a.m12697o(jSONObject.getJSONArray("thresholds"));
                    C9801m.m32345e(string, "useCase");
                    C9801m.m32345e(string2, "assetUri");
                    return new b(string, string2, strOptString, i2, fArrM12697o);
                } catch (Exception unused) {
                    return null;
                }
            }

            /* renamed from: d */
            public final void m12723d(b bVar, final List<b> list) {
                C9801m.m32346f(bVar, "master");
                C9801m.m32346f(list, "slaves");
                m12716b(bVar.m12711g(), bVar.m12712h());
                m12717c(bVar.m12706b(), bVar.m12711g() + '_' + bVar.m12712h(), new AsyncTaskC5906k.a() { // from class: com.facebook.o0.r0.b
                    @Override // com.facebook.p157o0.p165q0.AsyncTaskC5906k.a
                    /* renamed from: a */
                    public final void mo12645a(File file) {
                        C5919h.b.a.m12718e(list, file);
                    }
                });
            }
        }

        public b(String str, String str2, String str3, int i2, float[] fArr) {
            C9801m.m32346f(str, "useCase");
            C9801m.m32346f(str2, "assetUri");
            this.f15440b = str;
            this.f15441c = str2;
            this.f15442d = str3;
            this.f15443e = i2;
            this.f15444f = fArr;
        }

        /* renamed from: b */
        public final String m12706b() {
            return this.f15441c;
        }

        /* renamed from: c */
        public final C5918g m12707c() {
            return this.f15446h;
        }

        /* renamed from: d */
        public final File m12708d() {
            return this.f15445g;
        }

        /* renamed from: e */
        public final String m12709e() {
            return this.f15442d;
        }

        /* renamed from: f */
        public final float[] m12710f() {
            return this.f15444f;
        }

        /* renamed from: g */
        public final String m12711g() {
            return this.f15440b;
        }

        /* renamed from: h */
        public final int m12712h() {
            return this.f15443e;
        }

        /* renamed from: i */
        public final void m12713i(C5918g c5918g) {
            this.f15446h = c5918g;
        }

        /* renamed from: j */
        public final b m12714j(Runnable runnable) {
            this.f15447i = runnable;
            return this;
        }

        /* renamed from: k */
        public final void m12715k(File file) {
            this.f15445g = file;
        }
    }

    /* compiled from: ModelManager.kt */
    /* renamed from: com.facebook.o0.r0.h$c */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15448a;

        static {
            int[] iArr = new int[a.valuesCustom().length];
            iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            f15448a = iArr;
        }
    }

    private C5919h() {
    }

    /* renamed from: b */
    private final void m12684b(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                b bVarM12722a = b.f15439a.m12722a(jSONObject.getJSONObject(itKeys.next()));
                if (bVarM12722a != null) {
                    f15432b.put(bVarM12722a.m12711g(), bVarM12722a);
                }
            } catch (JSONException unused) {
                return;
            }
        }
    }

    /* renamed from: c */
    public static final void m12685c() {
        C5696p0 c5696p0 = C5696p0.f14478a;
        C5696p0.m11527B0(new Runnable() { // from class: com.facebook.o0.r0.e
            @Override // java.lang.Runnable
            public final void run() {
                C5919h.m12686d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m12686d() {
        JSONObject jSONObject;
        try {
            C5641a0 c5641a0 = C5641a0.f14199a;
            SharedPreferences sharedPreferences = C5641a0.m11284c().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
            String string = sharedPreferences.getString("models", null);
            if (string != null) {
                jSONObject = string.length() == 0 ? new JSONObject() : new JSONObject(string);
            }
            long j2 = sharedPreferences.getLong("model_request_timestamp", 0L);
            C5666a0 c5666a0 = C5666a0.f14313a;
            if (!C5666a0.m11378g(C5666a0.b.ModelRequest) || jSONObject.length() == 0 || !f15431a.m12693k(j2)) {
                jSONObject = f15431a.m12690h();
                if (jSONObject == null) {
                    return;
                } else {
                    sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                }
            }
            C5919h c5919h = f15431a;
            c5919h.m12684b(jSONObject);
            c5919h.m12687e();
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private final void m12687e() {
        ArrayList arrayList = new ArrayList();
        String strM12706b = null;
        int iMax = 0;
        for (Map.Entry<String, b> entry : f15432b.entrySet()) {
            String key = entry.getKey();
            b value = entry.getValue();
            if (C9801m.m32341a(key, a.MTML_APP_EVENT_PREDICTION.m12704q())) {
                String strM12706b2 = value.m12706b();
                int iMax2 = Math.max(iMax, value.m12712h());
                C5666a0 c5666a0 = C5666a0.f14313a;
                if (C5666a0.m11378g(C5666a0.b.SuggestedEvents) && m12692j()) {
                    arrayList.add(value.m12714j(new Runnable() { // from class: com.facebook.o0.r0.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5919h.m12688f();
                        }
                    }));
                }
                strM12706b = strM12706b2;
                iMax = iMax2;
            }
            if (C9801m.m32341a(key, a.MTML_INTEGRITY_DETECT.m12704q())) {
                strM12706b = value.m12706b();
                iMax = Math.max(iMax, value.m12712h());
                C5666a0 c5666a02 = C5666a0.f14313a;
                if (C5666a0.m11378g(C5666a0.b.IntelligentIntegrity)) {
                    arrayList.add(value.m12714j(new Runnable() { // from class: com.facebook.o0.r0.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5919h.m12689g();
                        }
                    }));
                }
            }
        }
        if (strM12706b == null || iMax <= 0 || arrayList.isEmpty()) {
            return;
        }
        b.f15439a.m12723d(new b("MTML", strM12706b, null, iMax, null), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m12688f() {
        C5938h c5938h = C5938h.f15513a;
        C5938h.m12801a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m12689g() {
        C5892a c5892a = C5892a.f15336a;
        C5892a.m12579a();
    }

    /* renamed from: h */
    private final JSONObject m12690h() {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
        GraphRequest graphRequestM11236x = GraphRequest.f14159a.m11236x(null, "app/model_asset", null);
        graphRequestM11236x.m11177H(bundle);
        JSONObject jSONObjectM11339c = graphRequestM11236x.m11179j().m11339c();
        if (jSONObjectM11339c == null) {
            return null;
        }
        return m12698p(jSONObjectM11339c);
    }

    /* renamed from: i */
    public static final File m12691i(a aVar) {
        C9801m.m32346f(aVar, "task");
        b bVar = f15432b.get(aVar.m12704q());
        if (bVar == null) {
            return null;
        }
        return bVar.m12708d();
    }

    /* renamed from: j */
    private final boolean m12692j() {
        C5696p0 c5696p0 = C5696p0.f14478a;
        Locale localeM11542L = C5696p0.m11542L();
        if (localeM11542L != null) {
            String language = localeM11542L.getLanguage();
            C9801m.m32345e(language, "locale.language");
            if (!C10547v.m37538J(language, "en", false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    private final boolean m12693k(long j2) {
        return j2 != 0 && System.currentTimeMillis() - j2 < 259200000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final float[] m12697o(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        float[] fArr = new float[jSONArray.length()];
        int i2 = 0;
        int length = jSONArray.length();
        if (length > 0) {
            while (true) {
                int i3 = i2 + 1;
                try {
                    String string = jSONArray.getString(i2);
                    C9801m.m32345e(string, "jsonArray.getString(i)");
                    fArr[i2] = Float.parseFloat(string);
                } catch (JSONException unused) {
                }
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return fArr;
    }

    /* renamed from: p */
    private final JSONObject m12698p(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            int i2 = 0;
            int length = jSONArray.length();
            if (length <= 0) {
                return jSONObject2;
            }
            while (true) {
                int i3 = i2 + 1;
                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                if (jSONObject3.has("rules_uri")) {
                    jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                }
                jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                if (i3 >= length) {
                    return jSONObject2;
                }
                i2 = i3;
            }
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: q */
    public static final String[] m12699q(a aVar, float[][] fArr, String[] strArr) {
        C9801m.m32346f(aVar, "task");
        C9801m.m32346f(fArr, "denses");
        C9801m.m32346f(strArr, "texts");
        b bVar = f15432b.get(aVar.m12704q());
        C5918g c5918gM12707c = bVar == null ? null : bVar.m12707c();
        if (c5918gM12707c == null) {
            return null;
        }
        float[] fArrM12710f = bVar.m12710f();
        int length = strArr.length;
        int length2 = fArr[0].length;
        C5917f c5917f = new C5917f(new int[]{length, length2});
        if (length > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                System.arraycopy(fArr[i2], 0, c5917f.m12673a(), i2 * length2, length2);
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        C5917f c5917fM12680b = c5918gM12707c.m12680b(c5917f, strArr, aVar.m12703k());
        if (c5917fM12680b == null || fArrM12710f == null) {
            return null;
        }
        if (c5917fM12680b.m12673a().length == 0) {
            return null;
        }
        if (fArrM12710f.length == 0) {
            return null;
        }
        int i4 = c.f15448a[aVar.ordinal()];
        if (i4 == 1) {
            return f15431a.m12701s(c5917fM12680b, fArrM12710f);
        }
        if (i4 == 2) {
            return f15431a.m12700r(c5917fM12680b, fArrM12710f);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: r */
    private final String[] m12700r(C5917f c5917f, float[] fArr) {
        int iM12674b = c5917f.m12674b(0);
        int iM12674b2 = c5917f.m12674b(1);
        float[] fArrM12673a = c5917f.m12673a();
        if (iM12674b2 != fArr.length) {
            return null;
        }
        IntRange intRangeM32428k = C9848l.m32428k(0, iM12674b);
        ArrayList arrayList = new ArrayList(C10819v.m38911u(intRangeM32428k, 10));
        Iterator<Integer> it = intRangeM32428k.iterator();
        while (it.hasNext()) {
            int iMo32397b = ((IntIterator) it).mo32397b();
            int length = fArr.length;
            String str = "none";
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = i3 + 1;
                if (fArrM12673a[(iMo32397b * iM12674b2) + i3] >= fArr[i2]) {
                    str = f15434d.get(i3);
                }
                i2++;
                i3 = i4;
            }
            arrayList.add(str);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: s */
    private final String[] m12701s(C5917f c5917f, float[] fArr) {
        int iM12674b = c5917f.m12674b(0);
        int iM12674b2 = c5917f.m12674b(1);
        float[] fArrM12673a = c5917f.m12673a();
        if (iM12674b2 != fArr.length) {
            return null;
        }
        IntRange intRangeM32428k = C9848l.m32428k(0, iM12674b);
        ArrayList arrayList = new ArrayList(C10819v.m38911u(intRangeM32428k, 10));
        Iterator<Integer> it = intRangeM32428k.iterator();
        while (it.hasNext()) {
            int iMo32397b = ((IntIterator) it).mo32397b();
            int length = fArr.length;
            String str = "other";
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = i3 + 1;
                if (fArrM12673a[(iMo32397b * iM12674b2) + i3] >= fArr[i2]) {
                    str = f15433c.get(i3);
                }
                i2++;
                i3 = i4;
            }
            arrayList.add(str);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
