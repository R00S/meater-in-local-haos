package com.facebook.internal;

import com.facebook.FacebookRequestError;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.C10773s;
import kotlin.collections.C10810q0;
import kotlin.jvm.internal.C9789g;
import kotlin.text.C10546u;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FacebookRequestErrorClassification.kt */
/* renamed from: com.facebook.internal.x */
/* loaded from: classes2.dex */
public final class C5738x {

    /* renamed from: a */
    public static final a f14638a = new a(null);

    /* renamed from: b */
    private static C5738x f14639b;

    /* renamed from: c */
    private final Map<Integer, Set<Integer>> f14640c;

    /* renamed from: d */
    private final Map<Integer, Set<Integer>> f14641d;

    /* renamed from: e */
    private final Map<Integer, Set<Integer>> f14642e;

    /* renamed from: f */
    private final String f14643f;

    /* renamed from: g */
    private final String f14644g;

    /* renamed from: h */
    private final String f14645h;

    /* compiled from: FacebookRequestErrorClassification.kt */
    /* renamed from: com.facebook.internal.x$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: c */
        private final C5738x m11824c() {
            return new C5738x(null, C10810q0.m38799k(C10773s.m38547a(2, null), C10773s.m38547a(4, null), C10773s.m38547a(9, null), C10773s.m38547a(17, null), C10773s.m38547a(341, null)), C10810q0.m38799k(C10773s.m38547a(102, null), C10773s.m38547a(190, null), C10773s.m38547a(412, null)), null, null, null);
        }

        /* renamed from: d */
        private final Map<Integer, Set<Integer>> m11825d(JSONObject jSONObject) {
            int iOptInt;
            HashSet hashSet;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                return null;
            }
            HashMap map = new HashMap();
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                            hashSet = null;
                        } else {
                            hashSet = new HashSet();
                            int length2 = jSONArrayOptJSONArray2.length();
                            if (length2 > 0) {
                                int i4 = 0;
                                while (true) {
                                    int i5 = i4 + 1;
                                    int iOptInt2 = jSONArrayOptJSONArray2.optInt(i4);
                                    if (iOptInt2 != 0) {
                                        hashSet.add(Integer.valueOf(iOptInt2));
                                    }
                                    if (i5 >= length2) {
                                        break;
                                    }
                                    i4 = i5;
                                }
                            }
                        }
                        map.put(Integer.valueOf(iOptInt), hashSet);
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return map;
        }

        /* renamed from: a */
        public final C5738x m11826a(JSONArray jSONArray) {
            Map<Integer, Set<Integer>> map;
            Map<Integer, Set<Integer>> map2;
            Map<Integer, Set<Integer>> map3;
            String str;
            String str2;
            String str3;
            String strOptString;
            if (jSONArray == null) {
                return null;
            }
            int i2 = 0;
            int length = jSONArray.length();
            if (length > 0) {
                Map<Integer, Set<Integer>> mapM11825d = null;
                Map<Integer, Set<Integer>> mapM11825d2 = null;
                Map<Integer, Set<Integer>> mapM11825d3 = null;
                String strOptString2 = null;
                String strOptString3 = null;
                String strOptString4 = null;
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("name")) != null) {
                        if (C10546u.m37515q(strOptString, "other", true)) {
                            strOptString2 = jSONObjectOptJSONObject.optString("recovery_message", null);
                            mapM11825d = m11825d(jSONObjectOptJSONObject);
                        } else if (C10546u.m37515q(strOptString, "transient", true)) {
                            strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                            mapM11825d2 = m11825d(jSONObjectOptJSONObject);
                        } else if (C10546u.m37515q(strOptString, "login_recoverable", true)) {
                            strOptString4 = jSONObjectOptJSONObject.optString("recovery_message", null);
                            mapM11825d3 = m11825d(jSONObjectOptJSONObject);
                        }
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
                map = mapM11825d;
                map2 = mapM11825d2;
                map3 = mapM11825d3;
                str = strOptString2;
                str2 = strOptString3;
                str3 = strOptString4;
            } else {
                map = null;
                map2 = null;
                map3 = null;
                str = null;
                str2 = null;
                str3 = null;
            }
            return new C5738x(map, map2, map3, str, str2, str3);
        }

        /* renamed from: b */
        public final synchronized C5738x m11827b() {
            C5738x c5738x;
            if (C5738x.f14639b == null) {
                C5738x.f14639b = m11824c();
            }
            c5738x = C5738x.f14639b;
            if (c5738x == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
            return c5738x;
        }
    }

    /* compiled from: FacebookRequestErrorClassification.kt */
    /* renamed from: com.facebook.internal.x$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14646a;

        static {
            int[] iArr = new int[FacebookRequestError.EnumC5622a.valuesCustom().length];
            iArr[FacebookRequestError.EnumC5622a.OTHER.ordinal()] = 1;
            iArr[FacebookRequestError.EnumC5622a.LOGIN_RECOVERABLE.ordinal()] = 2;
            iArr[FacebookRequestError.EnumC5622a.TRANSIENT.ordinal()] = 3;
            f14646a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5738x(Map<Integer, ? extends Set<Integer>> map, Map<Integer, ? extends Set<Integer>> map2, Map<Integer, ? extends Set<Integer>> map3, String str, String str2, String str3) {
        this.f14640c = map;
        this.f14641d = map2;
        this.f14642e = map3;
        this.f14643f = str;
        this.f14644g = str2;
        this.f14645h = str3;
    }

    /* renamed from: c */
    public final FacebookRequestError.EnumC5622a m11822c(int i2, int i3, boolean z) {
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        if (z) {
            return FacebookRequestError.EnumC5622a.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.f14640c;
        if (map != null && map.containsKey(Integer.valueOf(i2)) && ((set3 = this.f14640c.get(Integer.valueOf(i2))) == null || set3.contains(Integer.valueOf(i3)))) {
            return FacebookRequestError.EnumC5622a.OTHER;
        }
        Map<Integer, Set<Integer>> map2 = this.f14642e;
        if (map2 != null && map2.containsKey(Integer.valueOf(i2)) && ((set2 = this.f14642e.get(Integer.valueOf(i2))) == null || set2.contains(Integer.valueOf(i3)))) {
            return FacebookRequestError.EnumC5622a.LOGIN_RECOVERABLE;
        }
        Map<Integer, Set<Integer>> map3 = this.f14641d;
        return (map3 != null && map3.containsKey(Integer.valueOf(i2)) && ((set = this.f14641d.get(Integer.valueOf(i2))) == null || set.contains(Integer.valueOf(i3)))) ? FacebookRequestError.EnumC5622a.TRANSIENT : FacebookRequestError.EnumC5622a.OTHER;
    }

    /* renamed from: d */
    public final String m11823d(FacebookRequestError.EnumC5622a enumC5622a) {
        int i2 = enumC5622a == null ? -1 : b.f14646a[enumC5622a.ordinal()];
        if (i2 == 1) {
            return this.f14643f;
        }
        if (i2 == 2) {
            return this.f14645h;
        }
        if (i2 != 3) {
            return null;
        }
        return this.f14644g;
    }
}
