package com.facebook.p157o0.p163o0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.C5641a0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10547v;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InAppPurchaseEventManager.kt */
/* renamed from: com.facebook.o0.o0.i */
/* loaded from: classes2.dex */
public final class C5886i {

    /* renamed from: a */
    public static final C5886i f15313a = new C5886i();

    /* renamed from: b */
    private static final HashMap<String, Method> f15314b = new HashMap<>();

    /* renamed from: c */
    private static final HashMap<String, Class<?>> f15315c = new HashMap<>();

    /* renamed from: d */
    private static final String f15316d;

    /* renamed from: e */
    private static final SharedPreferences f15317e;

    /* renamed from: f */
    private static final SharedPreferences f15318f;

    static {
        C5641a0 c5641a0 = C5641a0.f14199a;
        f15316d = C5641a0.m11284c().getPackageName();
        f15317e = C5641a0.m11284c().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
        f15318f = C5641a0.m11284c().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
    }

    private C5886i() {
    }

    /* renamed from: a */
    public static final Object m12540a(Context context, IBinder iBinder) {
        C9801m.m32346f(context, "context");
        return f15313a.m12552n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
    }

    /* renamed from: b */
    public static final void m12541b() {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences sharedPreferences = f15317e;
        long j2 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
        if (j2 == 0) {
            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
        } else if (jCurrentTimeMillis - j2 > 604800) {
            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
        }
    }

    /* renamed from: c */
    private final ArrayList<String> m12542c(ArrayList<String> arrayList) throws JSONException {
        ArrayList<String> arrayList2 = new ArrayList<>();
        SharedPreferences.Editor editorEdit = f15318f.edit();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                JSONObject jSONObject = new JSONObject(next);
                String string = jSONObject.getString("productId");
                long j2 = jSONObject.getLong("purchaseTime");
                String string2 = jSONObject.getString("purchaseToken");
                if (jCurrentTimeMillis - (j2 / 1000) <= 86400 && !C9801m.m32341a(f15318f.getString(string, HttpUrl.FRAGMENT_ENCODE_SET), string2)) {
                    editorEdit.putString(string, string2);
                    arrayList2.add(next);
                }
            } catch (JSONException unused) {
            }
        }
        editorEdit.apply();
        return arrayList2;
    }

    /* renamed from: d */
    private final Class<?> m12543d(Context context, String str) {
        HashMap<String, Class<?>> map = f15315c;
        Class<?> cls = map.get(str);
        if (cls != null) {
            return cls;
        }
        C5890m c5890m = C5890m.f15334a;
        Class<?> clsM12575b = C5890m.m12575b(context, str);
        if (clsM12575b != null) {
            map.put(str, clsM12575b);
        }
        return clsM12575b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.reflect.Method m12544e(java.lang.Class<?> r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.util.HashMap<java.lang.String, java.lang.reflect.Method> r1 = com.facebook.p157o0.p163o0.C5886i.f15314b
            java.lang.Object r2 = r1.get(r13)
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto Ld
            return r2
        Ld:
            int r2 = r13.hashCode()
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            java.lang.String r7 = "TYPE"
            r8 = 0
            r9 = 1
            switch(r2) {
                case -1801122596: goto L7f;
                case -1450694211: goto L68;
                case -1123215065: goto L58;
                case -594356707: goto L3a;
                case -573310373: goto L1e;
                default: goto L1c;
            }
        L1c:
            goto L98
        L1e:
            java.lang.String r2 = "getSkuDetails"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L28
            goto L98
        L28:
            java.lang.Class[] r2 = new java.lang.Class[r4]
            java.lang.Class r4 = java.lang.Integer.TYPE
            kotlin.jvm.internal.C9801m.m32345e(r4, r7)
            r2[r8] = r4
            r2[r9] = r0
            r2[r6] = r0
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r2[r5] = r0
            goto L99
        L3a:
            java.lang.String r2 = "getPurchaseHistory"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L43
            goto L98
        L43:
            r2 = 5
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class r10 = java.lang.Integer.TYPE
            kotlin.jvm.internal.C9801m.m32345e(r10, r7)
            r2[r8] = r10
            r2[r9] = r0
            r2[r6] = r0
            r2[r5] = r0
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r2[r4] = r0
            goto L99
        L58:
            java.lang.String r0 = "asInterface"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L61
            goto L98
        L61:
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            r2[r8] = r0
            goto L99
        L68:
            java.lang.String r2 = "isBillingSupported"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L71
            goto L98
        L71:
            java.lang.Class[] r2 = new java.lang.Class[r5]
            java.lang.Class r4 = java.lang.Integer.TYPE
            kotlin.jvm.internal.C9801m.m32345e(r4, r7)
            r2[r8] = r4
            r2[r9] = r0
            r2[r6] = r0
            goto L99
        L7f:
            java.lang.String r2 = "getPurchases"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L88
            goto L98
        L88:
            java.lang.Class[] r2 = new java.lang.Class[r4]
            java.lang.Class r4 = java.lang.Integer.TYPE
            kotlin.jvm.internal.C9801m.m32345e(r4, r7)
            r2[r8] = r4
            r2[r9] = r0
            r2[r6] = r0
            r2[r5] = r0
            goto L99
        L98:
            r2 = r3
        L99:
            if (r2 != 0) goto La6
            com.facebook.o0.o0.m r0 = com.facebook.p157o0.p163o0.C5890m.f15334a
            java.lang.Class[] r0 = new java.lang.Class[r9]
            r0[r8] = r3
            java.lang.reflect.Method r12 = com.facebook.p157o0.p163o0.C5890m.m12576c(r12, r13, r0)
            goto Lb3
        La6:
            com.facebook.o0.o0.m r0 = com.facebook.p157o0.p163o0.C5890m.f15334a
            int r0 = r2.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            java.lang.Class[] r0 = (java.lang.Class[]) r0
            java.lang.reflect.Method r12 = com.facebook.p157o0.p163o0.C5890m.m12576c(r12, r13, r0)
        Lb3:
            if (r12 == 0) goto Lb8
            r1.put(r13, r12)
        Lb8:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p163o0.C5886i.m12544e(java.lang.Class, java.lang.String):java.lang.reflect.Method");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.ArrayList<java.lang.String> m12545f(android.content.Context r19, java.lang.Object r20, java.lang.String r21) {
        /*
            r18 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r18.m12553o(r19, r20, r21)
            if (r1 == 0) goto L95
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = 0
            r5 = 0
        L10:
            r6 = 5
            java.lang.Object[] r12 = new java.lang.Object[r6]
            r6 = 6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r12[r2] = r6
            java.lang.String r6 = com.facebook.p157o0.p163o0.C5886i.f15316d
            r13 = 1
            r12[r13] = r6
            r6 = 2
            r12[r6] = r21
            r6 = 3
            r12[r6] = r3
            r3 = 4
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r12[r3] = r6
            java.lang.String r9 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r10 = "getPurchaseHistory"
            r7 = r18
            r8 = r19
            r11 = r20
            java.lang.Object r3 = r7.m12552n(r8, r9, r10, r11, r12)
            if (r3 == 0) goto L8c
            long r6 = java.lang.System.currentTimeMillis()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r10 = "RESPONSE_CODE"
            int r10 = r3.getInt(r10)
            if (r10 != 0) goto L8c
            java.lang.String r10 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r10 = r3.getStringArrayList(r10)
            if (r10 != 0) goto L57
            goto L8c
        L57:
            java.util.Iterator r10 = r10.iterator()
        L5b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L85
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: org.json.JSONException -> L83
            r12.<init>(r11)     // Catch: org.json.JSONException -> L83
            java.lang.String r14 = "purchaseTime"
            long r14 = r12.getLong(r14)     // Catch: org.json.JSONException -> L83
            long r14 = r14 / r8
            long r14 = r6 - r14
            r16 = 1200(0x4b0, double:5.93E-321)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 <= 0) goto L7d
            r5 = 1
            goto L85
        L7d:
            r0.add(r11)     // Catch: org.json.JSONException -> L83
            int r4 = r4 + 1
            goto L5b
        L83:
            goto L5b
        L85:
            java.lang.String r6 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r6)
            goto L8d
        L8c:
            r3 = r1
        L8d:
            r6 = 30
            if (r4 >= r6) goto L95
            if (r3 == 0) goto L95
            if (r5 == 0) goto L10
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p163o0.C5886i.m12545f(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: g */
    public static final ArrayList<String> m12546g(Context context, Object obj) {
        C5886i c5886i;
        Class<?> clsM12543d;
        C9801m.m32346f(context, "context");
        ArrayList<String> arrayList = new ArrayList<>();
        return (obj == null || (clsM12543d = (c5886i = f15313a).m12543d(context, "com.android.vending.billing.IInAppBillingService")) == null || c5886i.m12544e(clsM12543d, "getPurchaseHistory") == null) ? arrayList : c5886i.m12542c(c5886i.m12545f(context, obj, "inapp"));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.ArrayList<java.lang.String> m12547h(android.content.Context r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r14 != 0) goto L8
            return r0
        L8:
            boolean r1 = r12.m12553o(r13, r14, r15)
            if (r1 == 0) goto L5b
            r1 = 0
            r2 = 0
            r3 = r2
            r4 = 0
        L12:
            r5 = 4
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r11[r1] = r6
            r6 = 1
            java.lang.String r7 = com.facebook.p157o0.p163o0.C5886i.f15316d
            r11[r6] = r7
            r6 = 2
            r11[r6] = r15
            r11[r5] = r3
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r14
            java.lang.Object r3 = r6.m12552n(r7, r8, r9, r10, r11)
            if (r3 == 0) goto L54
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)
            if (r5 != 0) goto L54
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)
            if (r5 == 0) goto L5b
            int r6 = r5.size()
            int r4 = r4 + r6
            r0.addAll(r5)
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)
            goto L55
        L54:
            r3 = r2
        L55:
            r5 = 30
            if (r4 >= r5) goto L5b
            if (r3 != 0) goto L12
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p163o0.C5886i.m12547h(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: i */
    public static final ArrayList<String> m12548i(Context context, Object obj) {
        C9801m.m32346f(context, "context");
        C5886i c5886i = f15313a;
        return c5886i.m12542c(c5886i.m12547h(context, obj, "inapp"));
    }

    /* renamed from: j */
    public static final ArrayList<String> m12549j(Context context, Object obj) {
        C9801m.m32346f(context, "context");
        C5886i c5886i = f15313a;
        return c5886i.m12542c(c5886i.m12547h(context, obj, "subs"));
    }

    /* renamed from: k */
    public static final Map<String, String> m12550k(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        C9801m.m32346f(context, "context");
        C9801m.m32346f(arrayList, "skuList");
        Map<String, String> mapM12554p = f15313a.m12554p(arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!mapM12554p.containsKey(next)) {
                arrayList2.add(next);
            }
        }
        mapM12554p.putAll(f15313a.m12551l(context, arrayList2, obj, z));
        return mapM12554p;
    }

    /* renamed from: l */
    private final Map<String, String> m12551l(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        int size;
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        if (obj != null && !arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Object[] objArr = new Object[4];
            int i2 = 0;
            objArr[0] = 3;
            objArr[1] = f15316d;
            objArr[2] = z ? "subs" : "inapp";
            objArr[3] = bundle;
            Object objM12552n = m12552n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
            if (objM12552n != null) {
                Bundle bundle2 = (Bundle) objM12552n;
                if (bundle2.getInt("RESPONSE_CODE") == 0) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList != null && arrayList.size() == stringArrayList.size() && arrayList.size() - 1 >= 0) {
                        while (true) {
                            int i3 = i2 + 1;
                            String str = arrayList.get(i2);
                            C9801m.m32345e(str, "skuList[i]");
                            String str2 = stringArrayList.get(i2);
                            C9801m.m32345e(str2, "skuDetailsList[i]");
                            linkedHashMap.put(str, str2);
                            if (i3 > size) {
                                break;
                            }
                            i2 = i3;
                        }
                    }
                    m12555q(linkedHashMap);
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: n */
    private final Object m12552n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method methodM12544e;
        Class<?> clsM12543d = m12543d(context, str);
        if (clsM12543d == null || (methodM12544e = m12544e(clsM12543d, str2)) == null) {
            return null;
        }
        C5890m c5890m = C5890m.f15334a;
        return C5890m.m12578e(clsM12543d, methodM12544e, obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: o */
    private final boolean m12553o(Context context, Object obj, String str) {
        Object objM12552n;
        return (obj == null || (objM12552n = m12552n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f15316d, str})) == null || ((Integer) objM12552n).intValue() != 0) ? false : true;
    }

    /* renamed from: p */
    private final Map<String, String> m12554p(ArrayList<String> arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            String string = f15317e.getString(next, null);
            if (string != null) {
                List listM37582v0 = C10547v.m37582v0(string, new String[]{";"}, false, 2, 2, null);
                if (jCurrentTimeMillis - Long.parseLong((String) listM37582v0.get(0)) < 43200) {
                    C9801m.m32345e(next, "sku");
                    linkedHashMap.put(next, listM37582v0.get(1));
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: q */
    private final void m12555q(Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences.Editor editorEdit = f15317e.edit();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            editorEdit.putString(entry.getKey(), jCurrentTimeMillis + ';' + entry.getValue());
        }
        editorEdit.apply();
    }

    /* renamed from: m */
    public final boolean m12556m(String str) {
        C9801m.m32346f(str, "skuDetail");
        try {
            String strOptString = new JSONObject(str).optString("freeTrialPeriod");
            if (strOptString != null) {
                return strOptString.length() > 0;
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }
}
