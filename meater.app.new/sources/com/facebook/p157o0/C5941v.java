package com.facebook.p157o0;

import android.os.Build;
import android.os.Bundle;
import cm.aptoide.p092pt.database.room.RoomNotification;
import com.facebook.EnumC5659g0;
import com.facebook.FacebookException;
import com.facebook.internal.C5684j0;
import com.facebook.internal.C5696p0;
import com.facebook.p157o0.p162n0.C5876a;
import com.facebook.p157o0.p164p0.C5892a;
import com.facebook.p157o0.p165q0.C5902g;
import com.facebook.p157o0.p168t0.C5929a;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.C10775u;
import kotlin.collections.C10825y;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppEvent.kt */
/* renamed from: com.facebook.o0.v */
/* loaded from: classes.dex */
public final class C5941v implements Serializable {

    /* renamed from: f */
    public static final a f15528f = new a(null);

    /* renamed from: g */
    private static final HashSet<String> f15529g = new HashSet<>();

    /* renamed from: h */
    private final JSONObject f15530h;

    /* renamed from: i */
    private final boolean f15531i;

    /* renamed from: j */
    private final boolean f15532j;

    /* renamed from: k */
    private final String f15533k;

    /* renamed from: l */
    private final String f15534l;

    /* compiled from: AppEvent.kt */
    /* renamed from: com.facebook.o0.v$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final String m12843c(String str) throws NoSuchAlgorithmException {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset charsetForName = Charset.forName("UTF-8");
                C9801m.m32345e(charsetForName, "Charset.forName(charsetName)");
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str.getBytes(charsetForName);
                C9801m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] bArrDigest = messageDigest.digest();
                C9801m.m32345e(bArrDigest, "digest.digest()");
                C5902g c5902g = C5902g.f15370a;
                return C5902g.m12626c(bArrDigest);
            } catch (UnsupportedEncodingException e2) {
                C5696p0 c5696p0 = C5696p0.f14478a;
                C5696p0.m11573i0("Failed to generate checksum: ", e2);
                return "1";
            } catch (NoSuchAlgorithmException e3) {
                C5696p0 c5696p02 = C5696p0.f14478a;
                C5696p0.m11573i0("Failed to generate checksum: ", e3);
                return "0";
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final void m12844d(String str) {
            boolean zContains;
            if (str != null) {
                if (!(str.length() == 0) && str.length() <= 40) {
                    synchronized (C5941v.f15529g) {
                        zContains = C5941v.f15529g.contains(str);
                        C10775u c10775u = C10775u.f41439a;
                    }
                    if (zContains) {
                        return;
                    }
                    if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").m37438b(str)) {
                        synchronized (C5941v.f15529g) {
                            C5941v.f15529g.add(str);
                        }
                        return;
                    } else {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                        String str2 = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                        C9801m.m32345e(str2, "java.lang.String.format(format, *args)");
                        throw new FacebookException(str2);
                    }
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.f37185a;
            String str3 = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            C9801m.m32345e(str3, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(str3);
        }
    }

    /* compiled from: AppEvent.kt */
    /* renamed from: com.facebook.o0.v$b */
    public static final class b implements Serializable {

        /* renamed from: f */
        public static final a f15535f = new a(null);

        /* renamed from: g */
        private final String f15536g;

        /* renamed from: h */
        private final boolean f15537h;

        /* renamed from: i */
        private final boolean f15538i;

        /* renamed from: j */
        private final String f15539j;

        /* compiled from: AppEvent.kt */
        /* renamed from: com.facebook.o0.v$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9789g c9789g) {
                this();
            }
        }

        public b(String str, boolean z, boolean z2, String str2) {
            C9801m.m32346f(str, "jsonString");
            this.f15536g = str;
            this.f15537h = z;
            this.f15538i = z2;
            this.f15539j = str2;
        }

        private final Object readResolve() throws ObjectStreamException, JSONException {
            return new C5941v(this.f15536g, this.f15537h, this.f15538i, this.f15539j, null);
        }
    }

    public C5941v(String str, String str2, Double d2, Bundle bundle, boolean z, boolean z2, UUID uuid) throws JSONException, FacebookException {
        C9801m.m32346f(str, "contextName");
        C9801m.m32346f(str2, "eventName");
        this.f15531i = z;
        this.f15532j = z2;
        this.f15533k = str2;
        this.f15530h = m12834d(str, str2, d2, bundle, uuid);
        this.f15534l = m12833b();
    }

    public /* synthetic */ C5941v(String str, boolean z, boolean z2, String str2, C9789g c9789g) {
        this(str, z, z2, str2);
    }

    /* renamed from: b */
    private final String m12833b() {
        if (Build.VERSION.SDK_INT > 19) {
            a aVar = f15528f;
            String string = this.f15530h.toString();
            C9801m.m32345e(string, "jsonObject.toString()");
            return aVar.m12843c(string);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = this.f15530h.keys();
        while (itKeys.hasNext()) {
            arrayList.add(itKeys.next());
        }
        C10825y.m38927x(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str);
            sb.append(" = ");
            sb.append(this.f15530h.optString(str));
            sb.append('\n');
        }
        a aVar2 = f15528f;
        String string2 = sb.toString();
        C9801m.m32345e(string2, "sb.toString()");
        return aVar2.m12843c(string2);
    }

    /* renamed from: d */
    private final JSONObject m12834d(String str, String str2, Double d2, Bundle bundle, UUID uuid) throws JSONException {
        a aVar = f15528f;
        aVar.m12844d(str2);
        JSONObject jSONObject = new JSONObject();
        C5929a c5929a = C5929a.f15481a;
        String strM12765e = C5929a.m12765e(str2);
        jSONObject.put("_eventName", strM12765e);
        jSONObject.put("_eventName_md5", aVar.m12843c(strM12765e));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map<String, String> mapM12835i = m12835i(bundle);
            for (String str3 : mapM12835i.keySet()) {
                jSONObject.put(str3, mapM12835i.get(str3));
            }
        }
        if (d2 != null) {
            jSONObject.put("_valueToSum", d2.doubleValue());
        }
        if (this.f15532j) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f15531i) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            C5684j0.a aVar2 = C5684j0.f14429a;
            EnumC5659g0 enumC5659g0 = EnumC5659g0.APP_EVENTS;
            String string = jSONObject.toString();
            C9801m.m32345e(string, "eventObject.toString()");
            aVar2.m11455c(enumC5659g0, "AppEvents", "Created app event '%s'", string);
        }
        return jSONObject;
    }

    /* renamed from: i */
    private final Map<String, String> m12835i(Bundle bundle) throws JSONException {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            a aVar = f15528f;
            C9801m.m32345e(str, RoomNotification.KEY);
            aVar.m12844d(str);
            Object obj = bundle.get(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                String str2 = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2));
                C9801m.m32345e(str2, "java.lang.String.format(format, *args)");
                throw new FacebookException(str2);
            }
            map.put(str, obj.toString());
        }
        C5892a c5892a = C5892a.f15336a;
        C5892a.m12581c(map);
        C5929a c5929a = C5929a.f15481a;
        C5929a.m12766f(map, this.f15533k);
        C5876a c5876a = C5876a.f15262a;
        C5876a.m12489c(map, this.f15533k);
        return map;
    }

    private final Object writeReplace() throws ObjectStreamException {
        String string = this.f15530h.toString();
        C9801m.m32345e(string, "jsonObject.toString()");
        return new b(string, this.f15531i, this.f15532j, this.f15534l);
    }

    /* renamed from: c */
    public final boolean m12836c() {
        return this.f15531i;
    }

    /* renamed from: e */
    public final JSONObject m12837e() {
        return this.f15530h;
    }

    /* renamed from: f */
    public final String m12838f() {
        return this.f15533k;
    }

    /* renamed from: g */
    public final boolean m12839g() {
        if (this.f15534l == null) {
            return true;
        }
        return C9801m.m32341a(m12833b(), this.f15534l);
    }

    /* renamed from: h */
    public final boolean m12840h() {
        return this.f15531i;
    }

    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String str = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.f15530h.optString("_eventName"), Boolean.valueOf(this.f15531i), this.f15530h.toString()}, 3));
        C9801m.m32345e(str, "java.lang.String.format(format, *args)");
        return str;
    }

    private C5941v(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f15530h = jSONObject;
        this.f15531i = z;
        String strOptString = jSONObject.optString("_eventName");
        C9801m.m32345e(strOptString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.f15533k = strOptString;
        this.f15534l = str2;
        this.f15532j = z2;
    }
}
