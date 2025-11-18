package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import com.facebook.internal.C5698q0;
import com.facebook.internal.p156v0.C5736c;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10547v;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AuthenticationToken.kt */
/* loaded from: classes.dex */
public final class AuthenticationToken implements Parcelable {

    /* renamed from: g */
    private final String f14072g;

    /* renamed from: h */
    private final String f14073h;

    /* renamed from: i */
    private final AuthenticationTokenHeader f14074i;

    /* renamed from: j */
    private final AuthenticationTokenClaims f14075j;

    /* renamed from: k */
    private final String f14076k;

    /* renamed from: f */
    public static final C5606b f14071f = new C5606b(null);
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new C5605a();

    /* compiled from: AuthenticationToken.kt */
    /* renamed from: com.facebook.AuthenticationToken$a */
    public static final class C5605a implements Parcelable.Creator<AuthenticationToken> {
        C5605a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationToken createFromParcel(Parcel parcel) {
            C9801m.m32346f(parcel, "source");
            return new AuthenticationToken(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationToken[] newArray(int i2) {
            return new AuthenticationToken[i2];
        }
    }

    /* compiled from: AuthenticationToken.kt */
    /* renamed from: com.facebook.AuthenticationToken$b */
    public static final class C5606b {
        private C5606b() {
        }

        public /* synthetic */ C5606b(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final void m11113a(AuthenticationToken authenticationToken) {
            AuthenticationTokenManager.f14102a.m11130a().m11129e(authenticationToken);
        }
    }

    public AuthenticationToken(String str, String str2) {
        C9801m.m32346f(str, "token");
        C9801m.m32346f(str2, "expectedNonce");
        C5698q0 c5698q0 = C5698q0.f14500a;
        C5698q0.m11639g(str, "token");
        C5698q0.m11639g(str2, "expectedNonce");
        List listM37582v0 = C10547v.m37582v0(str, new String[]{"."}, false, 0, 6, null);
        if (!(listM37582v0.size() == 3)) {
            throw new IllegalArgumentException("Invalid IdToken string".toString());
        }
        String str3 = (String) listM37582v0.get(0);
        String str4 = (String) listM37582v0.get(1);
        String str5 = (String) listM37582v0.get(2);
        this.f14072g = str;
        this.f14073h = str2;
        AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str3);
        this.f14074i = authenticationTokenHeader;
        this.f14075j = new AuthenticationTokenClaims(str4, str2);
        if (!m11109a(str3, str4, str5, authenticationTokenHeader.m11120a())) {
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        this.f14076k = str5;
    }

    /* renamed from: a */
    private final boolean m11109a(String str, String str2, String str3, String str4) {
        try {
            C5736c c5736c = C5736c.f14634a;
            String strM11808b = C5736c.m11808b(str4);
            if (strM11808b == null) {
                return false;
            }
            return C5736c.m11811e(C5736c.m11807a(strM11808b), str + '.' + str2, str3);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final JSONObject m11110b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.f14072g);
        jSONObject.put("expected_nonce", this.f14073h);
        jSONObject.put("header", this.f14074i.m11121c());
        jSONObject.put("claims", this.f14075j.m11115b());
        jSONObject.put(RoomInstalled.SIGNATURE, this.f14076k);
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
        if (!(obj instanceof AuthenticationToken)) {
            return false;
        }
        AuthenticationToken authenticationToken = (AuthenticationToken) obj;
        return C9801m.m32341a(this.f14072g, authenticationToken.f14072g) && C9801m.m32341a(this.f14073h, authenticationToken.f14073h) && C9801m.m32341a(this.f14074i, authenticationToken.f14074i) && C9801m.m32341a(this.f14075j, authenticationToken.f14075j) && C9801m.m32341a(this.f14076k, authenticationToken.f14076k);
    }

    public int hashCode() {
        return ((((((((527 + this.f14072g.hashCode()) * 31) + this.f14073h.hashCode()) * 31) + this.f14074i.hashCode()) * 31) + this.f14075j.hashCode()) * 31) + this.f14076k.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        C9801m.m32346f(parcel, "dest");
        parcel.writeString(this.f14072g);
        parcel.writeString(this.f14073h);
        parcel.writeParcelable(this.f14074i, i2);
        parcel.writeParcelable(this.f14075j, i2);
        parcel.writeString(this.f14076k);
    }

    public AuthenticationToken(Parcel parcel) {
        C9801m.m32346f(parcel, "parcel");
        String string = parcel.readString();
        C5698q0 c5698q0 = C5698q0.f14500a;
        this.f14072g = C5698q0.m11643k(string, "token");
        this.f14073h = C5698q0.m11643k(parcel.readString(), "expectedNonce");
        Parcelable parcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
        if (parcelable != null) {
            this.f14074i = (AuthenticationTokenHeader) parcelable;
            Parcelable parcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
            if (parcelable2 != null) {
                this.f14075j = (AuthenticationTokenClaims) parcelable2;
                this.f14076k = C5698q0.m11643k(parcel.readString(), RoomInstalled.SIGNATURE);
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
