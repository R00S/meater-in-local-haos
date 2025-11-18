package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.internal.C5698q0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AuthenticationTokenHeader.kt */
/* loaded from: classes.dex */
public final class AuthenticationTokenHeader implements Parcelable {

    /* renamed from: g */
    private final String f14099g;

    /* renamed from: h */
    private final String f14100h;

    /* renamed from: i */
    private final String f14101i;

    /* renamed from: f */
    public static final C5610b f14098f = new C5610b(null);
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new C5609a();

    /* compiled from: AuthenticationTokenHeader.kt */
    /* renamed from: com.facebook.AuthenticationTokenHeader$a */
    public static final class C5609a implements Parcelable.Creator<AuthenticationTokenHeader> {
        C5609a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenHeader createFromParcel(Parcel parcel) {
            C9801m.m32346f(parcel, "source");
            return new AuthenticationTokenHeader(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenHeader[] newArray(int i2) {
            return new AuthenticationTokenHeader[i2];
        }
    }

    /* compiled from: AuthenticationTokenHeader.kt */
    /* renamed from: com.facebook.AuthenticationTokenHeader$b */
    public static final class C5610b {
        private C5610b() {
        }

        public /* synthetic */ C5610b(C9789g c9789g) {
            this();
        }
    }

    public AuthenticationTokenHeader(String str) throws JSONException {
        C9801m.m32346f(str, "encodedHeaderString");
        if (!m11119b(str)) {
            throw new IllegalArgumentException("Invalid Header".toString());
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        C9801m.m32345e(bArrDecode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(bArrDecode, Charsets.f40651b));
        String string = jSONObject.getString("alg");
        C9801m.m32345e(string, "jsonObj.getString(\"alg\")");
        this.f14099g = string;
        String string2 = jSONObject.getString("typ");
        C9801m.m32345e(string2, "jsonObj.getString(\"typ\")");
        this.f14100h = string2;
        String string3 = jSONObject.getString("kid");
        C9801m.m32345e(string3, "jsonObj.getString(\"kid\")");
        this.f14101i = string3;
    }

    /* renamed from: b */
    private final boolean m11119b(String str) {
        C5698q0 c5698q0 = C5698q0.f14500a;
        C5698q0.m11639g(str, "encodedHeaderString");
        byte[] bArrDecode = Base64.decode(str, 0);
        C9801m.m32345e(bArrDecode, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, Charsets.f40651b));
            String strOptString = jSONObject.optString("alg");
            C9801m.m32345e(strOptString, "alg");
            boolean z = (strOptString.length() > 0) && C9801m.m32341a(strOptString, "RS256");
            String strOptString2 = jSONObject.optString("kid");
            C9801m.m32345e(strOptString2, "jsonObj.optString(\"kid\")");
            boolean z2 = strOptString2.length() > 0;
            String strOptString3 = jSONObject.optString("typ");
            C9801m.m32345e(strOptString3, "jsonObj.optString(\"typ\")");
            return z && z2 && (strOptString3.length() > 0);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final String m11120a() {
        return this.f14101i;
    }

    /* renamed from: c */
    public final JSONObject m11121c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f14099g);
        jSONObject.put("typ", this.f14100h);
        jSONObject.put("kid", this.f14101i);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) obj;
        return C9801m.m32341a(this.f14099g, authenticationTokenHeader.f14099g) && C9801m.m32341a(this.f14100h, authenticationTokenHeader.f14100h) && C9801m.m32341a(this.f14101i, authenticationTokenHeader.f14101i);
    }

    public int hashCode() {
        return ((((527 + this.f14099g.hashCode()) * 31) + this.f14100h.hashCode()) * 31) + this.f14101i.hashCode();
    }

    public String toString() {
        String string = m11121c().toString();
        C9801m.m32345e(string, "headerJsonObject.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        C9801m.m32346f(parcel, "dest");
        parcel.writeString(this.f14099g);
        parcel.writeString(this.f14100h);
        parcel.writeString(this.f14101i);
    }

    public AuthenticationTokenHeader(Parcel parcel) {
        C9801m.m32346f(parcel, "parcel");
        String string = parcel.readString();
        C5698q0 c5698q0 = C5698q0.f14500a;
        this.f14099g = C5698q0.m11643k(string, "alg");
        this.f14100h = C5698q0.m11643k(parcel.readString(), "typ");
        this.f14101i = C5698q0.m11643k(parcel.readString(), "kid");
    }
}
