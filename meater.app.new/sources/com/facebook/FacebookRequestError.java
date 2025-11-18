package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.C5670c0;
import com.facebook.internal.C5672d0;
import com.facebook.internal.C5738x;
import java.net.HttpURLConnection;
import java.util.Arrays;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import org.json.JSONObject;

/* compiled from: FacebookRequestError.kt */
/* loaded from: classes.dex */
public final class FacebookRequestError implements Parcelable {

    /* renamed from: h */
    private final int f14136h;

    /* renamed from: i */
    private final int f14137i;

    /* renamed from: j */
    private final int f14138j;

    /* renamed from: k */
    private final String f14139k;

    /* renamed from: l */
    private final String f14140l;

    /* renamed from: m */
    private final String f14141m;

    /* renamed from: n */
    private final JSONObject f14142n;

    /* renamed from: o */
    private final JSONObject f14143o;

    /* renamed from: p */
    private final Object f14144p;

    /* renamed from: q */
    private final HttpURLConnection f14145q;

    /* renamed from: r */
    private final String f14146r;

    /* renamed from: s */
    private FacebookException f14147s;

    /* renamed from: t */
    private final EnumC5622a f14148t;

    /* renamed from: u */
    private final String f14149u;

    /* renamed from: f */
    public static final C5624c f14134f = new C5624c(null);

    /* renamed from: g */
    private static final C5625d f14135g = new C5625d(200, 299);
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new C5623b();

    /* compiled from: FacebookRequestError.kt */
    /* renamed from: com.facebook.FacebookRequestError$a */
    public enum EnumC5622a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC5622a[] valuesCustom() {
            EnumC5622a[] enumC5622aArrValuesCustom = values();
            return (EnumC5622a[]) Arrays.copyOf(enumC5622aArrValuesCustom, enumC5622aArrValuesCustom.length);
        }
    }

    /* compiled from: FacebookRequestError.kt */
    /* renamed from: com.facebook.FacebookRequestError$b */
    public static final class C5623b implements Parcelable.Creator<FacebookRequestError> {
        C5623b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError createFromParcel(Parcel parcel) {
            C9801m.m32346f(parcel, "parcel");
            return new FacebookRequestError(parcel, (C9789g) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError[] newArray(int i2) {
            return new FacebookRequestError[i2];
        }
    }

    /* compiled from: FacebookRequestError.kt */
    /* renamed from: com.facebook.FacebookRequestError$c */
    public static final class C5624c {
        private C5624c() {
        }

        public /* synthetic */ C5624c(C9789g c9789g) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x00d1 A[Catch: JSONException -> 0x012f, TryCatch #0 {JSONException -> 0x012f, blocks: (B:3:0x0012, B:5:0x0018, B:7:0x0024, B:9:0x0028, B:12:0x0036, B:47:0x00d1, B:33:0x0079, B:30:0x0070, B:27:0x0066, B:24:0x005e, B:21:0x0057, B:18:0x004d, B:15:0x0043, B:35:0x0085, B:38:0x0092, B:40:0x009b, B:44:0x00ac, B:49:0x00f2, B:51:0x00fc, B:53:0x010a, B:55:0x0113), top: B:59:0x0012 }] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.facebook.FacebookRequestError m11149a(org.json.JSONObject r20, java.lang.Object r21, java.net.HttpURLConnection r22) throws org.json.JSONException {
            /*
                Method dump skipped, instructions count: 304
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.C5624c.m11149a(org.json.JSONObject, java.lang.Object, java.net.HttpURLConnection):com.facebook.FacebookRequestError");
        }

        /* renamed from: b */
        public final synchronized C5738x m11150b() {
            C5672d0 c5672d0 = C5672d0.f14392a;
            C5641a0 c5641a0 = C5641a0.f14199a;
            C5670c0 c5670c0M11417c = C5672d0.m11417c(C5641a0.m11285d());
            if (c5670c0M11417c == null) {
                return C5738x.f14638a.m11827b();
            }
            return c5670c0M11417c.m11399c();
        }

        /* renamed from: c */
        public final C5625d m11151c() {
            return FacebookRequestError.f14135g;
        }
    }

    /* compiled from: FacebookRequestError.kt */
    /* renamed from: com.facebook.FacebookRequestError$d */
    public static final class C5625d {

        /* renamed from: a */
        private final int f14154a;

        /* renamed from: b */
        private final int f14155b;

        public C5625d(int i2, int i3) {
            this.f14154a = i2;
            this.f14155b = i3;
        }

        /* renamed from: a */
        public final boolean m11152a(int i2) {
            return i2 <= this.f14155b && this.f14154a <= i2;
        }
    }

    private FacebookRequestError(int i2, int i3, int i4, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z) {
        boolean z2;
        this.f14136h = i2;
        this.f14137i = i3;
        this.f14138j = i4;
        this.f14139k = str;
        this.f14140l = str3;
        this.f14141m = str4;
        this.f14142n = jSONObject;
        this.f14143o = jSONObject2;
        this.f14144p = obj;
        this.f14145q = httpURLConnection;
        this.f14146r = str2;
        if (facebookException != null) {
            this.f14147s = facebookException;
            z2 = true;
        } else {
            this.f14147s = new FacebookServiceException(this, m11141c());
            z2 = false;
        }
        EnumC5622a enumC5622aM11822c = z2 ? EnumC5622a.OTHER : f14134f.m11150b().m11822c(i3, i4, z);
        this.f14148t = enumC5622aM11822c;
        this.f14149u = f14134f.m11150b().m11823d(enumC5622aM11822c);
    }

    public /* synthetic */ FacebookRequestError(int i2, int i3, int i4, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z, C9789g c9789g) {
        this(i2, i3, i4, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, facebookException, z);
    }

    public /* synthetic */ FacebookRequestError(Parcel parcel, C9789g c9789g) {
        this(parcel);
    }

    /* renamed from: b */
    public final int m11140b() {
        return this.f14137i;
    }

    /* renamed from: c */
    public final String m11141c() {
        String str = this.f14146r;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.f14147s;
        if (facebookException == null) {
            return null;
        }
        return facebookException.getLocalizedMessage();
    }

    /* renamed from: d */
    public final String m11142d() {
        return this.f14139k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final FacebookException m11143e() {
        return this.f14147s;
    }

    /* renamed from: f */
    public final int m11144f() {
        return this.f14136h;
    }

    /* renamed from: g */
    public final int m11145g() {
        return this.f14138j;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.f14136h + ", errorCode: " + this.f14137i + ", subErrorCode: " + this.f14138j + ", errorType: " + this.f14139k + ", errorMessage: " + m11141c() + "}";
        C9801m.m32345e(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        C9801m.m32346f(parcel, "out");
        parcel.writeInt(this.f14136h);
        parcel.writeInt(this.f14137i);
        parcel.writeInt(this.f14138j);
        parcel.writeString(this.f14139k);
        parcel.writeString(m11141c());
        parcel.writeString(this.f14140l);
        parcel.writeString(this.f14141m);
    }

    public FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public FacebookRequestError(int i2, String str, String str2) {
        this(-1, i2, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }
}
