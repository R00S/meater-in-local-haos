package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.facebook.AccessToken;
import com.facebook.internal.C5696p0;
import com.facebook.internal.C5698q0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Profile.kt */
/* loaded from: classes.dex */
public final class Profile implements Parcelable {

    /* renamed from: h */
    private final String f14190h;

    /* renamed from: i */
    private final String f14191i;

    /* renamed from: j */
    private final String f14192j;

    /* renamed from: k */
    private final String f14193k;

    /* renamed from: l */
    private final String f14194l;

    /* renamed from: m */
    private final Uri f14195m;

    /* renamed from: n */
    private final Uri f14196n;

    /* renamed from: f */
    public static final C5639b f14188f = new C5639b(null);

    /* renamed from: g */
    private static final String f14189g = Profile.class.getSimpleName();
    public static final Parcelable.Creator<Profile> CREATOR = new C5638a();

    /* compiled from: Profile.kt */
    /* renamed from: com.facebook.Profile$a */
    public static final class C5638a implements Parcelable.Creator<Profile> {
        C5638a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Profile createFromParcel(Parcel parcel) {
            C9801m.m32346f(parcel, "source");
            return new Profile(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Profile[] newArray(int i2) {
            return new Profile[i2];
        }
    }

    /* compiled from: Profile.kt */
    /* renamed from: com.facebook.Profile$b */
    public static final class C5639b {

        /* compiled from: Profile.kt */
        /* renamed from: com.facebook.Profile$b$a */
        public static final class a implements C5696p0.a {
            a() {
            }

            @Override // com.facebook.internal.C5696p0.a
            /* renamed from: a */
            public void mo11259a(JSONObject jSONObject) {
                String strOptString = jSONObject == null ? null : jSONObject.optString(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
                if (strOptString == null) {
                    Log.w(Profile.f14189g, "No user ID returned on Me request");
                    return;
                }
                String strOptString2 = jSONObject.optString("link");
                String strOptString3 = jSONObject.optString("profile_picture", null);
                Profile.f14188f.m11258c(new Profile(strOptString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), strOptString2 != null ? Uri.parse(strOptString2) : null, strOptString3 != null ? Uri.parse(strOptString3) : null));
            }

            @Override // com.facebook.internal.C5696p0.a
            /* renamed from: b */
            public void mo11260b(FacebookException facebookException) {
                Log.e(Profile.f14189g, C9801m.m32354n("Got unexpected exception: ", facebookException));
            }
        }

        private C5639b() {
        }

        public /* synthetic */ C5639b(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final void m11256a() {
            AccessToken.C5603c c5603c = AccessToken.f14054f;
            AccessToken accessTokenM11105e = c5603c.m11105e();
            if (accessTokenM11105e == null) {
                return;
            }
            if (!c5603c.m11107g()) {
                m11258c(null);
            } else {
                C5696p0 c5696p0 = C5696p0.f14478a;
                C5696p0.m11532E(accessTokenM11105e.m11093l(), new a());
            }
        }

        /* renamed from: b */
        public final Profile m11257b() {
            return C5663i0.f14305a.m11370a().m11367c();
        }

        /* renamed from: c */
        public final void m11258c(Profile profile) {
            C5663i0.f14305a.m11370a().m11369f(profile);
        }
    }

    public /* synthetic */ Profile(Parcel parcel, C9789g c9789g) {
        this(parcel);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        C5698q0 c5698q0 = C5698q0.f14500a;
        C5698q0.m11643k(str, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
        this.f14190h = str;
        this.f14191i = str2;
        this.f14192j = str3;
        this.f14193k = str4;
        this.f14194l = str5;
        this.f14195m = uri;
        this.f14196n = uri2;
    }

    /* renamed from: b */
    public final JSONObject m11253b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, this.f14190h);
            jSONObject.put("first_name", this.f14191i);
            jSONObject.put("middle_name", this.f14192j);
            jSONObject.put("last_name", this.f14193k);
            jSONObject.put("name", this.f14194l);
            Uri uri = this.f14195m;
            if (uri != null) {
                jSONObject.put("link_uri", uri.toString());
            }
            Uri uri2 = this.f14196n;
            if (uri2 != null) {
                jSONObject.put("picture_uri", uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        String str5 = this.f14190h;
        return ((str5 == null && ((Profile) obj).f14190h == null) || C9801m.m32341a(str5, ((Profile) obj).f14190h)) && (((str = this.f14191i) == null && ((Profile) obj).f14191i == null) || C9801m.m32341a(str, ((Profile) obj).f14191i)) && ((((str2 = this.f14192j) == null && ((Profile) obj).f14192j == null) || C9801m.m32341a(str2, ((Profile) obj).f14192j)) && ((((str3 = this.f14193k) == null && ((Profile) obj).f14193k == null) || C9801m.m32341a(str3, ((Profile) obj).f14193k)) && ((((str4 = this.f14194l) == null && ((Profile) obj).f14194l == null) || C9801m.m32341a(str4, ((Profile) obj).f14194l)) && ((((uri = this.f14195m) == null && ((Profile) obj).f14195m == null) || C9801m.m32341a(uri, ((Profile) obj).f14195m)) && (((uri2 = this.f14196n) == null && ((Profile) obj).f14196n == null) || C9801m.m32341a(uri2, ((Profile) obj).f14196n))))));
    }

    public int hashCode() {
        String str = this.f14190h;
        int iHashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.f14191i;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.f14192j;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.f14193k;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.f14194l;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f14195m;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f14196n;
        return uri2 != null ? (iHashCode * 31) + uri2.hashCode() : iHashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        C9801m.m32346f(parcel, "dest");
        parcel.writeString(this.f14190h);
        parcel.writeString(this.f14191i);
        parcel.writeString(this.f14192j);
        parcel.writeString(this.f14193k);
        parcel.writeString(this.f14194l);
        Uri uri = this.f14195m;
        parcel.writeString(uri == null ? null : uri.toString());
        Uri uri2 = this.f14196n;
        parcel.writeString(uri2 != null ? uri2.toString() : null);
    }

    public Profile(JSONObject jSONObject) {
        C9801m.m32346f(jSONObject, "jsonObject");
        this.f14190h = jSONObject.optString(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, null);
        this.f14191i = jSONObject.optString("first_name", null);
        this.f14192j = jSONObject.optString("middle_name", null);
        this.f14193k = jSONObject.optString("last_name", null);
        this.f14194l = jSONObject.optString("name", null);
        String strOptString = jSONObject.optString("link_uri", null);
        this.f14195m = strOptString == null ? null : Uri.parse(strOptString);
        String strOptString2 = jSONObject.optString("picture_uri", null);
        this.f14196n = strOptString2 != null ? Uri.parse(strOptString2) : null;
    }

    private Profile(Parcel parcel) {
        this.f14190h = parcel.readString();
        this.f14191i = parcel.readString();
        this.f14192j = parcel.readString();
        this.f14193k = parcel.readString();
        this.f14194l = parcel.readString();
        String string = parcel.readString();
        this.f14195m = string == null ? null : Uri.parse(string);
        String string2 = parcel.readString();
        this.f14196n = string2 != null ? Uri.parse(string2) : null;
    }
}
