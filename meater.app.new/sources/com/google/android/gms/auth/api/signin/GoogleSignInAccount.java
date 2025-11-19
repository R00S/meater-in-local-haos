package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import g7.C3445p;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@Deprecated
/* loaded from: classes2.dex */
public class GoogleSignInAccount extends AbstractC3492a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();

    /* renamed from: O, reason: collision with root package name */
    public static final e f33409O = h.d();

    /* renamed from: B, reason: collision with root package name */
    final int f33410B;

    /* renamed from: C, reason: collision with root package name */
    private final String f33411C;

    /* renamed from: D, reason: collision with root package name */
    private final String f33412D;

    /* renamed from: E, reason: collision with root package name */
    private final String f33413E;

    /* renamed from: F, reason: collision with root package name */
    private final String f33414F;

    /* renamed from: G, reason: collision with root package name */
    private final Uri f33415G;

    /* renamed from: H, reason: collision with root package name */
    private String f33416H;

    /* renamed from: I, reason: collision with root package name */
    private final long f33417I;

    /* renamed from: J, reason: collision with root package name */
    private final String f33418J;

    /* renamed from: K, reason: collision with root package name */
    final List f33419K;

    /* renamed from: L, reason: collision with root package name */
    private final String f33420L;

    /* renamed from: M, reason: collision with root package name */
    private final String f33421M;

    /* renamed from: N, reason: collision with root package name */
    private final Set f33422N = new HashSet();

    GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f33410B = i10;
        this.f33411C = str;
        this.f33412D = str2;
        this.f33413E = str3;
        this.f33414F = str4;
        this.f33415G = uri;
        this.f33416H = str5;
        this.f33417I = j10;
        this.f33418J = str6;
        this.f33419K = list;
        this.f33420L = str7;
        this.f33421M = str8;
    }

    public static GoogleSignInAccount D1(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), C3445p.e(str7), new ArrayList((Collection) C3445p.k(set)), str5, str6);
    }

    public static GoogleSignInAccount E1(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount googleSignInAccountD1 = D1(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j10), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountD1.f33416H = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountD1;
    }

    public Set<Scope> B1() {
        HashSet hashSet = new HashSet(this.f33419K);
        hashSet.addAll(this.f33422N);
        return hashSet;
    }

    public String C1() {
        return this.f33416H;
    }

    public String G0() {
        return this.f33420L;
    }

    public String O0() {
        return this.f33412D;
    }

    public Uri U0() {
        return this.f33415G;
    }

    public String c() {
        return this.f33411C;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f33418J.equals(this.f33418J) && googleSignInAccount.B1().equals(B1());
    }

    public Account f0() {
        String str = this.f33413E;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String h0() {
        return this.f33414F;
    }

    public int hashCode() {
        return ((this.f33418J.hashCode() + 527) * 31) + B1().hashCode();
    }

    public String r0() {
        return this.f33413E;
    }

    public String v0() {
        return this.f33421M;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, this.f33410B);
        C3493b.q(parcel, 2, c(), false);
        C3493b.q(parcel, 3, O0(), false);
        C3493b.q(parcel, 4, r0(), false);
        C3493b.q(parcel, 5, h0(), false);
        C3493b.p(parcel, 6, U0(), i10, false);
        C3493b.q(parcel, 7, C1(), false);
        C3493b.n(parcel, 8, this.f33417I);
        C3493b.q(parcel, 9, this.f33418J, false);
        C3493b.u(parcel, 10, this.f33419K, false);
        C3493b.q(parcel, 11, G0(), false);
        C3493b.q(parcel, 12, v0(), false);
        C3493b.b(parcel, iA);
    }
}
