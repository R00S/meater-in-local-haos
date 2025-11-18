package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.account.AndroidAccountManagerPersistence;
import cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowFragment;
import com.facebook.C5657f0;
import com.facebook.internal.C5696p0;
import com.facebook.internal.C5698q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AccessToken.kt */
/* loaded from: classes.dex */
public final class AccessToken implements Parcelable {
    public static final Parcelable.Creator<AccessToken> CREATOR;

    /* renamed from: f */
    public static final C5603c f14054f = new C5603c(null);

    /* renamed from: g */
    private static final Date f14055g;

    /* renamed from: h */
    private static final Date f14056h;

    /* renamed from: i */
    private static final Date f14057i;

    /* renamed from: j */
    private static final EnumC5956w f14058j;

    /* renamed from: k */
    private final Date f14059k;

    /* renamed from: l */
    private final Set<String> f14060l;

    /* renamed from: m */
    private final Set<String> f14061m;

    /* renamed from: n */
    private final Set<String> f14062n;

    /* renamed from: o */
    private final String f14063o;

    /* renamed from: p */
    private final EnumC5956w f14064p;

    /* renamed from: q */
    private final Date f14065q;

    /* renamed from: r */
    private final String f14066r;

    /* renamed from: s */
    private final String f14067s;

    /* renamed from: t */
    private final Date f14068t;

    /* renamed from: u */
    private final String f14069u;

    /* compiled from: AccessToken.kt */
    /* renamed from: com.facebook.AccessToken$a */
    public interface InterfaceC5601a {
        /* renamed from: a */
        void m11097a(FacebookException facebookException);

        /* renamed from: b */
        void m11098b(AccessToken accessToken);
    }

    /* compiled from: AccessToken.kt */
    /* renamed from: com.facebook.AccessToken$b */
    public static final class C5602b implements Parcelable.Creator<AccessToken> {
        C5602b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccessToken createFromParcel(Parcel parcel) {
            C9801m.m32346f(parcel, "source");
            return new AccessToken(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AccessToken[] newArray(int i2) {
            return new AccessToken[i2];
        }
    }

    /* compiled from: AccessToken.kt */
    /* renamed from: com.facebook.AccessToken$c */
    public static final class C5603c {
        private C5603c() {
        }

        public /* synthetic */ C5603c(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final AccessToken m11101a(AccessToken accessToken) {
            C9801m.m32346f(accessToken, "current");
            return new AccessToken(accessToken.m11093l(), accessToken.m11084c(), accessToken.m11094m(), accessToken.m11091j(), accessToken.m11086e(), accessToken.m11087f(), accessToken.m11092k(), new Date(), new Date(), accessToken.m11085d(), null, 1024, null);
        }

        /* renamed from: b */
        public final AccessToken m11102b(JSONObject jSONObject) throws JSONException {
            C9801m.m32346f(jSONObject, "jsonObject");
            if (jSONObject.getInt("version") > 1) {
                throw new FacebookException("Unknown AccessToken serialization format.");
            }
            String string = jSONObject.getString("token");
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            String string2 = jSONObject.getString("source");
            C9801m.m32345e(string2, "jsonObject.getString(SOURCE_KEY)");
            EnumC5956w enumC5956wValueOf = EnumC5956w.valueOf(string2);
            String string3 = jSONObject.getString("application_id");
            String string4 = jSONObject.getString(TimeLineFollowFragment.BundleKeys.USER_ID);
            Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
            String strOptString = jSONObject.optString("graph_domain", null);
            C9801m.m32345e(string, "token");
            C9801m.m32345e(string3, "applicationId");
            C9801m.m32345e(string4, AndroidAccountManagerPersistence.ACCOUNT_ID);
            C5696p0 c5696p0 = C5696p0.f14478a;
            C9801m.m32345e(jSONArray, "permissionsArray");
            List<String> listM11565e0 = C5696p0.m11565e0(jSONArray);
            C9801m.m32345e(jSONArray2, "declinedPermissionsArray");
            return new AccessToken(string, string3, string4, listM11565e0, C5696p0.m11565e0(jSONArray2), jSONArrayOptJSONArray == null ? new ArrayList() : C5696p0.m11565e0(jSONArrayOptJSONArray), enumC5956wValueOf, date, date2, date3, strOptString);
        }

        /* renamed from: c */
        public final AccessToken m11103c(Bundle bundle) throws JSONException {
            String string;
            C9801m.m32346f(bundle, "bundle");
            List<String> listM11106f = m11106f(bundle, "com.facebook.TokenCachingStrategy.Permissions");
            List<String> listM11106f2 = m11106f(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List<String> listM11106f3 = m11106f(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            C5657f0.a aVar = C5657f0.f14287a;
            String strM11353a = aVar.m11353a(bundle);
            C5696p0 c5696p0 = C5696p0.f14478a;
            if (C5696p0.m11557a0(strM11353a)) {
                C5641a0 c5641a0 = C5641a0.f14199a;
                strM11353a = C5641a0.m11285d();
            }
            String str = strM11353a;
            String strM11357f = aVar.m11357f(bundle);
            if (strM11357f == null) {
                return null;
            }
            JSONObject jSONObjectM11562d = C5696p0.m11562d(strM11357f);
            if (jSONObjectM11562d == null) {
                string = null;
            } else {
                try {
                    string = jSONObjectM11562d.getString(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
                } catch (JSONException unused) {
                    return null;
                }
            }
            if (str == null || string == null) {
                return null;
            }
            return new AccessToken(strM11357f, str, string, listM11106f, listM11106f2, listM11106f3, aVar.m11356e(bundle), aVar.m11354c(bundle), aVar.m11355d(bundle), null, null, 1024, null);
        }

        /* renamed from: d */
        public final void m11104d() {
            AccessToken accessTokenM12914e = C5955v.f15573a.m12923e().m12914e();
            if (accessTokenM12914e != null) {
                m11108h(m11101a(accessTokenM12914e));
            }
        }

        /* renamed from: e */
        public final AccessToken m11105e() {
            return C5955v.f15573a.m12923e().m12914e();
        }

        /* renamed from: f */
        public final List<String> m11106f(Bundle bundle, String str) {
            C9801m.m32346f(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                return C10817u.m38888j();
            }
            List<String> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            C9801m.m32345e(listUnmodifiableList, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
            return listUnmodifiableList;
        }

        /* renamed from: g */
        public final boolean m11107g() {
            AccessToken accessTokenM12914e = C5955v.f15573a.m12923e().m12914e();
            return (accessTokenM12914e == null || accessTokenM12914e.m11095n()) ? false : true;
        }

        /* renamed from: h */
        public final void m11108h(AccessToken accessToken) {
            C5955v.f15573a.m12923e().m12917r(accessToken);
        }
    }

    /* compiled from: AccessToken.kt */
    /* renamed from: com.facebook.AccessToken$d */
    public /* synthetic */ class C5604d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14070a;

        static {
            int[] iArr = new int[EnumC5956w.valuesCustom().length];
            iArr[EnumC5956w.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[EnumC5956w.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[EnumC5956w.WEB_VIEW.ordinal()] = 3;
            f14070a = iArr;
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f14055g = date;
        f14056h = date;
        f14057i = new Date();
        f14058j = EnumC5956w.FACEBOOK_APPLICATION_WEB;
        CREATOR = new C5602b();
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, EnumC5956w enumC5956w, Date date, Date date2, Date date3, String str4, int i2, C9789g c9789g) {
        this(str, str2, str3, collection, collection2, collection3, enumC5956w, date, date2, date3, (i2 & 1024) != 0 ? "facebook" : str4);
    }

    /* renamed from: a */
    private final void m11081a(StringBuilder sb) {
        sb.append(" permissions:");
        sb.append("[");
        sb.append(TextUtils.join(", ", this.f14060l));
        sb.append("]");
    }

    /* renamed from: b */
    private final EnumC5956w m11082b(EnumC5956w enumC5956w, String str) {
        if (str == null || !str.equals("instagram")) {
            return enumC5956w;
        }
        int i2 = C5604d.f14070a[enumC5956w.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? enumC5956w : EnumC5956w.INSTAGRAM_WEB_VIEW : EnumC5956w.INSTAGRAM_CUSTOM_CHROME_TAB : EnumC5956w.INSTAGRAM_APPLICATION_WEB;
    }

    /* renamed from: p */
    private final String m11083p() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        return C5641a0.m11306y(EnumC5659g0.INCLUDE_ACCESS_TOKENS) ? this.f14063o : "ACCESS_TOKEN_REMOVED";
    }

    /* renamed from: c */
    public final String m11084c() {
        return this.f14066r;
    }

    /* renamed from: d */
    public final Date m11085d() {
        return this.f14068t;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Set<String> m11086e() {
        return this.f14061m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (C9801m.m32341a(this.f14059k, accessToken.f14059k) && C9801m.m32341a(this.f14060l, accessToken.f14060l) && C9801m.m32341a(this.f14061m, accessToken.f14061m) && C9801m.m32341a(this.f14062n, accessToken.f14062n) && C9801m.m32341a(this.f14063o, accessToken.f14063o) && this.f14064p == accessToken.f14064p && C9801m.m32341a(this.f14065q, accessToken.f14065q) && C9801m.m32341a(this.f14066r, accessToken.f14066r) && C9801m.m32341a(this.f14067s, accessToken.f14067s) && C9801m.m32341a(this.f14068t, accessToken.f14068t)) {
            String str = this.f14069u;
            String str2 = accessToken.f14069u;
            if (str == null ? str2 == null : C9801m.m32341a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final Set<String> m11087f() {
        return this.f14062n;
    }

    /* renamed from: g */
    public final Date m11088g() {
        return this.f14059k;
    }

    /* renamed from: h */
    public final String m11089h() {
        return this.f14069u;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((((((((527 + this.f14059k.hashCode()) * 31) + this.f14060l.hashCode()) * 31) + this.f14061m.hashCode()) * 31) + this.f14062n.hashCode()) * 31) + this.f14063o.hashCode()) * 31) + this.f14064p.hashCode()) * 31) + this.f14065q.hashCode()) * 31) + this.f14066r.hashCode()) * 31) + this.f14067s.hashCode()) * 31) + this.f14068t.hashCode()) * 31;
        String str = this.f14069u;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: i */
    public final Date m11090i() {
        return this.f14065q;
    }

    /* renamed from: j */
    public final Set<String> m11091j() {
        return this.f14060l;
    }

    /* renamed from: k */
    public final EnumC5956w m11092k() {
        return this.f14064p;
    }

    /* renamed from: l */
    public final String m11093l() {
        return this.f14063o;
    }

    /* renamed from: m */
    public final String m11094m() {
        return this.f14067s;
    }

    /* renamed from: n */
    public final boolean m11095n() {
        return new Date().after(this.f14059k);
    }

    /* renamed from: o */
    public final JSONObject m11096o() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f14063o);
        jSONObject.put("expires_at", this.f14059k.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f14060l));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f14061m));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f14062n));
        jSONObject.put("last_refresh", this.f14065q.getTime());
        jSONObject.put("source", this.f14064p.name());
        jSONObject.put("application_id", this.f14066r);
        jSONObject.put(TimeLineFollowFragment.BundleKeys.USER_ID, this.f14067s);
        jSONObject.put("data_access_expiration_time", this.f14068t.getTime());
        String str = this.f14069u;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(m11083p());
        m11081a(sb);
        sb.append("}");
        String string = sb.toString();
        C9801m.m32345e(string, "builder.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        C9801m.m32346f(parcel, "dest");
        parcel.writeLong(this.f14059k.getTime());
        parcel.writeStringList(new ArrayList(this.f14060l));
        parcel.writeStringList(new ArrayList(this.f14061m));
        parcel.writeStringList(new ArrayList(this.f14062n));
        parcel.writeString(this.f14063o);
        parcel.writeString(this.f14064p.name());
        parcel.writeLong(this.f14065q.getTime());
        parcel.writeString(this.f14066r);
        parcel.writeString(this.f14067s);
        parcel.writeLong(this.f14068t.getTime());
        parcel.writeString(this.f14069u);
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, EnumC5956w enumC5956w, Date date, Date date2, Date date3, String str4) {
        C9801m.m32346f(str, "accessToken");
        C9801m.m32346f(str2, "applicationId");
        C9801m.m32346f(str3, AndroidAccountManagerPersistence.ACCOUNT_ID);
        C5698q0 c5698q0 = C5698q0.f14500a;
        C5698q0.m11639g(str, "accessToken");
        C5698q0.m11639g(str2, "applicationId");
        C5698q0.m11639g(str3, AndroidAccountManagerPersistence.ACCOUNT_ID);
        this.f14059k = date == null ? f14056h : date;
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        C9801m.m32345e(setUnmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.f14060l = setUnmodifiableSet;
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        C9801m.m32345e(setUnmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.f14061m = setUnmodifiableSet2;
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        C9801m.m32345e(setUnmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.f14062n = setUnmodifiableSet3;
        this.f14063o = str;
        this.f14064p = m11082b(enumC5956w == null ? f14058j : enumC5956w, str4);
        this.f14065q = date2 == null ? f14057i : date2;
        this.f14066r = str2;
        this.f14067s = str3;
        this.f14068t = (date3 == null || date3.getTime() == 0) ? f14056h : date3;
        this.f14069u = str4 == null ? "facebook" : str4;
    }

    public AccessToken(Parcel parcel) {
        EnumC5956w enumC5956wValueOf;
        C9801m.m32346f(parcel, "parcel");
        this.f14059k = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        C9801m.m32345e(setUnmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f14060l = setUnmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        C9801m.m32345e(setUnmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f14061m = setUnmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        C9801m.m32345e(setUnmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f14062n = setUnmodifiableSet3;
        String string = parcel.readString();
        C5698q0 c5698q0 = C5698q0.f14500a;
        this.f14063o = C5698q0.m11643k(string, "token");
        String string2 = parcel.readString();
        if (string2 != null) {
            enumC5956wValueOf = EnumC5956w.valueOf(string2);
        } else {
            enumC5956wValueOf = f14058j;
        }
        this.f14064p = enumC5956wValueOf;
        this.f14065q = new Date(parcel.readLong());
        this.f14066r = C5698q0.m11643k(parcel.readString(), "applicationId");
        this.f14067s = C5698q0.m11643k(parcel.readString(), AndroidAccountManagerPersistence.ACCOUNT_ID);
        this.f14068t = new Date(parcel.readLong());
        this.f14069u = parcel.readString();
    }
}
