package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10813s;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10547v;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FetchedAppSettings.kt */
/* renamed from: com.facebook.internal.c0 */
/* loaded from: classes2.dex */
public final class C5670c0 {

    /* renamed from: a */
    public static final a f14364a = new a(null);

    /* renamed from: b */
    private final boolean f14365b;

    /* renamed from: c */
    private final String f14366c;

    /* renamed from: d */
    private final boolean f14367d;

    /* renamed from: e */
    private final int f14368e;

    /* renamed from: f */
    private final EnumSet<EnumC5694o0> f14369f;

    /* renamed from: g */
    private final Map<String, Map<String, b>> f14370g;

    /* renamed from: h */
    private final boolean f14371h;

    /* renamed from: i */
    private final C5738x f14372i;

    /* renamed from: j */
    private final String f14373j;

    /* renamed from: k */
    private final String f14374k;

    /* renamed from: l */
    private final boolean f14375l;

    /* renamed from: m */
    private final boolean f14376m;

    /* renamed from: n */
    private final JSONArray f14377n;

    /* renamed from: o */
    private final String f14378o;

    /* renamed from: p */
    private final boolean f14379p;

    /* renamed from: q */
    private final boolean f14380q;

    /* renamed from: r */
    private final String f14381r;

    /* renamed from: s */
    private final String f14382s;

    /* renamed from: t */
    private final String f14383t;

    /* renamed from: u */
    private final JSONArray f14384u;

    /* renamed from: v */
    private final JSONArray f14385v;

    /* compiled from: FetchedAppSettings.kt */
    /* renamed from: com.facebook.internal.c0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: FetchedAppSettings.kt */
    /* renamed from: com.facebook.internal.c0$b */
    public static final class b {

        /* renamed from: a */
        public static final a f14386a = new a(null);

        /* renamed from: b */
        private final String f14387b;

        /* renamed from: c */
        private final String f14388c;

        /* renamed from: d */
        private final Uri f14389d;

        /* renamed from: e */
        private final int[] f14390e;

        /* compiled from: FetchedAppSettings.kt */
        /* renamed from: com.facebook.internal.c0$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9789g c9789g) {
                this();
            }

            /* renamed from: b */
            private final int[] m11413b(JSONArray jSONArray) throws NumberFormatException {
                if (jSONArray == null) {
                    return null;
                }
                int length = jSONArray.length();
                int[] iArr = new int[length];
                int i2 = 0;
                if (length <= 0) {
                    return iArr;
                }
                while (true) {
                    int i3 = i2 + 1;
                    int i4 = -1;
                    int iOptInt = jSONArray.optInt(i2, -1);
                    if (iOptInt == -1) {
                        String strOptString = jSONArray.optString(i2);
                        C5696p0 c5696p0 = C5696p0.f14478a;
                        if (!C5696p0.m11557a0(strOptString)) {
                            try {
                                C9801m.m32345e(strOptString, "versionString");
                                i4 = Integer.parseInt(strOptString);
                            } catch (NumberFormatException e2) {
                                C5696p0 c5696p02 = C5696p0.f14478a;
                                C5696p0.m11573i0("FacebookSDK", e2);
                            }
                            iOptInt = i4;
                        }
                    }
                    iArr[i2] = iOptInt;
                    if (i3 >= length) {
                        return iArr;
                    }
                    i2 = i3;
                }
            }

            /* renamed from: a */
            public final b m11414a(JSONObject jSONObject) {
                C9801m.m32346f(jSONObject, "dialogConfigJSON");
                String strOptString = jSONObject.optString("name");
                C5696p0 c5696p0 = C5696p0.f14478a;
                if (C5696p0.m11557a0(strOptString)) {
                    return null;
                }
                C9801m.m32345e(strOptString, "dialogNameWithFeature");
                List listM37582v0 = C10547v.m37582v0(strOptString, new String[]{"|"}, false, 0, 6, null);
                if (listM37582v0.size() != 2) {
                    return null;
                }
                String str = (String) C10813s.m38830U(listM37582v0);
                String str2 = (String) C10813s.m38844g0(listM37582v0);
                if (C5696p0.m11557a0(str) || C5696p0.m11557a0(str2)) {
                    return null;
                }
                String strOptString2 = jSONObject.optString("url");
                return new b(str, str2, C5696p0.m11557a0(strOptString2) ? null : Uri.parse(strOptString2), m11413b(jSONObject.optJSONArray("versions")), null);
            }
        }

        private b(String str, String str2, Uri uri, int[] iArr) {
            this.f14387b = str;
            this.f14388c = str2;
            this.f14389d = uri;
            this.f14390e = iArr;
        }

        public /* synthetic */ b(String str, String str2, Uri uri, int[] iArr, C9789g c9789g) {
            this(str, str2, uri, iArr);
        }

        /* renamed from: a */
        public final String m11411a() {
            return this.f14387b;
        }

        /* renamed from: b */
        public final String m11412b() {
            return this.f14388c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5670c0(boolean z, String str, boolean z2, int i2, EnumSet<EnumC5694o0> enumSet, Map<String, ? extends Map<String, b>> map, boolean z3, C5738x c5738x, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6, boolean z7, String str5, String str6, String str7, JSONArray jSONArray2, JSONArray jSONArray3) {
        C9801m.m32346f(str, "nuxContent");
        C9801m.m32346f(enumSet, "smartLoginOptions");
        C9801m.m32346f(map, "dialogConfigurations");
        C9801m.m32346f(c5738x, "errorClassification");
        C9801m.m32346f(str2, "smartLoginBookmarkIconURL");
        C9801m.m32346f(str3, "smartLoginMenuIconURL");
        C9801m.m32346f(str4, "sdkUpdateMessage");
        this.f14365b = z;
        this.f14366c = str;
        this.f14367d = z2;
        this.f14368e = i2;
        this.f14369f = enumSet;
        this.f14370g = map;
        this.f14371h = z3;
        this.f14372i = c5738x;
        this.f14373j = str2;
        this.f14374k = str3;
        this.f14375l = z4;
        this.f14376m = z5;
        this.f14377n = jSONArray;
        this.f14378o = str4;
        this.f14379p = z6;
        this.f14380q = z7;
        this.f14381r = str5;
        this.f14382s = str6;
        this.f14383t = str7;
        this.f14384u = jSONArray2;
        this.f14385v = jSONArray3;
    }

    /* renamed from: a */
    public final boolean m11397a() {
        return this.f14371h;
    }

    /* renamed from: b */
    public final boolean m11398b() {
        return this.f14376m;
    }

    /* renamed from: c */
    public final C5738x m11399c() {
        return this.f14372i;
    }

    /* renamed from: d */
    public final JSONArray m11400d() {
        return this.f14377n;
    }

    /* renamed from: e */
    public final boolean m11401e() {
        return this.f14375l;
    }

    /* renamed from: f */
    public final JSONArray m11402f() {
        return this.f14385v;
    }

    /* renamed from: g */
    public final JSONArray m11403g() {
        return this.f14384u;
    }

    /* renamed from: h */
    public final String m11404h() {
        return this.f14381r;
    }

    /* renamed from: i */
    public final String m11405i() {
        return this.f14383t;
    }

    /* renamed from: j */
    public final String m11406j() {
        return this.f14378o;
    }

    /* renamed from: k */
    public final int m11407k() {
        return this.f14368e;
    }

    /* renamed from: l */
    public final EnumSet<EnumC5694o0> m11408l() {
        return this.f14369f;
    }

    /* renamed from: m */
    public final String m11409m() {
        return this.f14382s;
    }

    /* renamed from: n */
    public final boolean m11410n() {
        return this.f14365b;
    }
}
