package com.facebook.internal;

import android.os.Bundle;
import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C9801m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BundleJSONConverter.kt */
/* renamed from: com.facebook.internal.s */
/* loaded from: classes2.dex */
public final class C5701s {

    /* renamed from: a */
    public static final C5701s f14535a = new C5701s();

    /* renamed from: b */
    private static final Map<Class<?>, h> f14536b;

    /* compiled from: BundleJSONConverter.kt */
    /* renamed from: com.facebook.internal.s$a */
    public static final class a implements h {
        a() {
        }

        @Override // com.facebook.internal.C5701s.h
        /* renamed from: a */
        public void mo11700a(Bundle bundle, String str, Object obj) throws JSONException {
            C9801m.m32346f(bundle, "bundle");
            C9801m.m32346f(str, RoomNotification.KEY);
            C9801m.m32346f(obj, "value");
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* compiled from: BundleJSONConverter.kt */
    /* renamed from: com.facebook.internal.s$b */
    public static final class b implements h {
        b() {
        }

        @Override // com.facebook.internal.C5701s.h
        /* renamed from: a */
        public void mo11700a(Bundle bundle, String str, Object obj) throws JSONException {
            C9801m.m32346f(bundle, "bundle");
            C9801m.m32346f(str, RoomNotification.KEY);
            C9801m.m32346f(obj, "value");
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* compiled from: BundleJSONConverter.kt */
    /* renamed from: com.facebook.internal.s$c */
    public static final class c implements h {
        c() {
        }

        @Override // com.facebook.internal.C5701s.h
        /* renamed from: a */
        public void mo11700a(Bundle bundle, String str, Object obj) throws JSONException {
            C9801m.m32346f(bundle, "bundle");
            C9801m.m32346f(str, RoomNotification.KEY);
            C9801m.m32346f(obj, "value");
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* compiled from: BundleJSONConverter.kt */
    /* renamed from: com.facebook.internal.s$d */
    public static final class d implements h {
        d() {
        }

        @Override // com.facebook.internal.C5701s.h
        /* renamed from: a */
        public void mo11700a(Bundle bundle, String str, Object obj) throws JSONException {
            C9801m.m32346f(bundle, "bundle");
            C9801m.m32346f(str, RoomNotification.KEY);
            C9801m.m32346f(obj, "value");
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* compiled from: BundleJSONConverter.kt */
    /* renamed from: com.facebook.internal.s$e */
    public static final class e implements h {
        e() {
        }

        @Override // com.facebook.internal.C5701s.h
        /* renamed from: a */
        public void mo11700a(Bundle bundle, String str, Object obj) throws JSONException {
            C9801m.m32346f(bundle, "bundle");
            C9801m.m32346f(str, RoomNotification.KEY);
            C9801m.m32346f(obj, "value");
            bundle.putString(str, (String) obj);
        }
    }

    /* compiled from: BundleJSONConverter.kt */
    /* renamed from: com.facebook.internal.s$f */
    public static final class f implements h {
        f() {
        }

        @Override // com.facebook.internal.C5701s.h
        /* renamed from: a */
        public void mo11700a(Bundle bundle, String str, Object obj) throws JSONException {
            C9801m.m32346f(bundle, "bundle");
            C9801m.m32346f(str, RoomNotification.KEY);
            C9801m.m32346f(obj, "value");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* compiled from: BundleJSONConverter.kt */
    /* renamed from: com.facebook.internal.s$g */
    public static final class g implements h {
        g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.internal.C5701s.h
        /* renamed from: a */
        public void mo11700a(Bundle bundle, String str, Object obj) throws JSONException {
            C9801m.m32346f(bundle, "bundle");
            C9801m.m32346f(str, RoomNotification.KEY);
            C9801m.m32346f(obj, "value");
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int i2 = 0;
            int length = jSONArray.length();
            if (length > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    Object obj2 = jSONArray.get(i2);
                    if (!(obj2 instanceof String)) {
                        throw new IllegalArgumentException(C9801m.m32354n("Unexpected type in an array: ", obj2.getClass()));
                    }
                    arrayList.add(obj2);
                    if (i3 >= length) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    /* compiled from: BundleJSONConverter.kt */
    /* renamed from: com.facebook.internal.s$h */
    public interface h {
        /* renamed from: a */
        void mo11700a(Bundle bundle, String str, Object obj) throws JSONException;
    }

    static {
        HashMap map = new HashMap();
        f14536b = map;
        map.put(Boolean.class, new a());
        map.put(Integer.class, new b());
        map.put(Long.class, new c());
        map.put(Double.class, new d());
        map.put(String.class, new e());
        map.put(String[].class, new f());
        map.put(JSONArray.class, new g());
    }

    private C5701s() {
    }

    /* renamed from: a */
    public static final Bundle m11699a(JSONObject jSONObject) throws JSONException {
        C9801m.m32346f(jSONObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, m11699a((JSONObject) obj));
                } else {
                    h hVar = f14536b.get(obj.getClass());
                    if (hVar == null) {
                        throw new IllegalArgumentException(C9801m.m32354n("Unsupported type: ", obj.getClass()));
                    }
                    C9801m.m32345e(next, RoomNotification.KEY);
                    C9801m.m32345e(obj, "value");
                    hVar.mo11700a(bundle, next, obj);
                }
            }
        }
        return bundle;
    }
}
