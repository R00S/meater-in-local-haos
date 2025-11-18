package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();

    /* renamed from: f */
    @VisibleForTesting
    private static Clock f17022f = DefaultClock.m14620c();

    /* renamed from: g */
    @SafeParcelable.VersionField
    private final int f17023g;

    /* renamed from: h */
    @SafeParcelable.Field
    private String f17024h;

    /* renamed from: i */
    @SafeParcelable.Field
    private String f17025i;

    /* renamed from: j */
    @SafeParcelable.Field
    private String f17026j;

    /* renamed from: k */
    @SafeParcelable.Field
    private String f17027k;

    /* renamed from: l */
    @SafeParcelable.Field
    private Uri f17028l;

    /* renamed from: m */
    @SafeParcelable.Field
    private String f17029m;

    /* renamed from: n */
    @SafeParcelable.Field
    private long f17030n;

    /* renamed from: o */
    @SafeParcelable.Field
    private String f17031o;

    /* renamed from: p */
    @SafeParcelable.Field
    private List<Scope> f17032p;

    /* renamed from: q */
    @SafeParcelable.Field
    private String f17033q;

    /* renamed from: r */
    @SafeParcelable.Field
    private String f17034r;

    /* renamed from: s */
    private Set<Scope> f17035s = new HashSet();

    @SafeParcelable.Constructor
    GoogleSignInAccount(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) Uri uri, @SafeParcelable.Param(id = 7) String str5, @SafeParcelable.Param(id = 8) long j2, @SafeParcelable.Param(id = 9) String str6, @SafeParcelable.Param(id = 10) List<Scope> list, @SafeParcelable.Param(id = 11) String str7, @SafeParcelable.Param(id = 12) String str8) {
        this.f17023g = i2;
        this.f17024h = str;
        this.f17025i = str2;
        this.f17026j = str3;
        this.f17027k = str4;
        this.f17028l = uri;
        this.f17029m = str5;
        this.f17030n = j2;
        this.f17031o = str6;
        this.f17032p = list;
        this.f17033q = str7;
        this.f17034r = str8;
    }

    /* renamed from: a1 */
    public static GoogleSignInAccount m13646a1(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl", null);
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j2 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        GoogleSignInAccount googleSignInAccountM13647q1 = m13647q1(jSONObject.optString(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), uri, Long.valueOf(j2), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountM13647q1.f17029m = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccountM13647q1;
    }

    /* renamed from: q1 */
    private static GoogleSignInAccount m13647q1(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, (l == null ? Long.valueOf(f17022f.mo14608a() / 1000) : l).longValue(), Preconditions.m14368g(str7), new ArrayList((Collection) Preconditions.m14372k(set)), str5, str6);
    }

    /* renamed from: t1 */
    private final JSONObject m13648t1() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (m13653e0() != null) {
                jSONObject.put(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, m13653e0());
            }
            if (m13654i0() != null) {
                jSONObject.put("tokenId", m13654i0());
            }
            if (m13659z() != null) {
                jSONObject.put("email", m13659z());
            }
            if (m13658y() != null) {
                jSONObject.put("displayName", m13658y());
            }
            if (m13652Y() != null) {
                jSONObject.put("givenName", m13652Y());
            }
            if (m13651W() != null) {
                jSONObject.put("familyName", m13651W());
            }
            if (m13655p0() != null) {
                jSONObject.put("photoUrl", m13655p0().toString());
            }
            if (m13650M0() != null) {
                jSONObject.put("serverAuthCode", m13650M0());
            }
            jSONObject.put("expirationTime", this.f17030n);
            jSONObject.put("obfuscatedIdentifier", this.f17031o);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.f17032p;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, C6315a.f17071f);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.m13912y());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    @KeepForSdk
    /* renamed from: J0 */
    public Set<Scope> m13649J0() {
        HashSet hashSet = new HashSet(this.f17032p);
        hashSet.addAll(this.f17035s);
        return hashSet;
    }

    /* renamed from: M0 */
    public String m13650M0() {
        return this.f17029m;
    }

    /* renamed from: W */
    public String m13651W() {
        return this.f17034r;
    }

    /* renamed from: Y */
    public String m13652Y() {
        return this.f17033q;
    }

    /* renamed from: e0 */
    public String m13653e0() {
        return this.f17024h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f17031o.equals(this.f17031o) && googleSignInAccount.m13649J0().equals(m13649J0());
    }

    public Account getAccount() {
        if (this.f17026j == null) {
            return null;
        }
        return new Account(this.f17026j, "com.google");
    }

    public int hashCode() {
        return ((this.f17031o.hashCode() + 527) * 31) + m13649J0().hashCode();
    }

    /* renamed from: i0 */
    public String m13654i0() {
        return this.f17025i;
    }

    /* renamed from: p0 */
    public Uri m13655p0() {
        return this.f17028l;
    }

    /* renamed from: r1 */
    public final String m13656r1() {
        return this.f17031o;
    }

    /* renamed from: s1 */
    public final String m13657s1() throws JSONException {
        JSONObject jSONObjectM13648t1 = m13648t1();
        jSONObjectM13648t1.remove("serverAuthCode");
        return jSONObjectM13648t1.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f17023g);
        SafeParcelWriter.m14486u(parcel, 2, m13653e0(), false);
        SafeParcelWriter.m14486u(parcel, 3, m13654i0(), false);
        SafeParcelWriter.m14486u(parcel, 4, m13659z(), false);
        SafeParcelWriter.m14486u(parcel, 5, m13658y(), false);
        SafeParcelWriter.m14484s(parcel, 6, m13655p0(), i2, false);
        SafeParcelWriter.m14486u(parcel, 7, m13650M0(), false);
        SafeParcelWriter.m14481p(parcel, 8, this.f17030n);
        SafeParcelWriter.m14486u(parcel, 9, this.f17031o, false);
        SafeParcelWriter.m14490y(parcel, 10, this.f17032p, false);
        SafeParcelWriter.m14486u(parcel, 11, m13652Y(), false);
        SafeParcelWriter.m14486u(parcel, 12, m13651W(), false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public String m13658y() {
        return this.f17027k;
    }

    /* renamed from: z */
    public String m13659z() {
        return this.f17026j;
    }
}
