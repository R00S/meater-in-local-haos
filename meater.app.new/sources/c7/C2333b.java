package c7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import g7.C3443n;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: c7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2333b extends AbstractC3492a {

    /* renamed from: B, reason: collision with root package name */
    final int f31068B;

    /* renamed from: C, reason: collision with root package name */
    private final int f31069C;

    /* renamed from: D, reason: collision with root package name */
    private final PendingIntent f31070D;

    /* renamed from: E, reason: collision with root package name */
    private final String f31071E;

    /* renamed from: F, reason: collision with root package name */
    public static final C2333b f31067F = new C2333b(0);
    public static final Parcelable.Creator<C2333b> CREATOR = new C2344m();

    C2333b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f31068B = i10;
        this.f31069C = i11;
        this.f31070D = pendingIntent;
        this.f31071E = str;
    }

    static String O0(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return "DEVELOPER_ERROR";
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    public boolean G0() {
        return this.f31069C == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2333b)) {
            return false;
        }
        C2333b c2333b = (C2333b) obj;
        return this.f31069C == c2333b.f31069C && C3443n.a(this.f31070D, c2333b.f31070D) && C3443n.a(this.f31071E, c2333b.f31071E);
    }

    public int f0() {
        return this.f31069C;
    }

    public String h0() {
        return this.f31071E;
    }

    public int hashCode() {
        return C3443n.b(Integer.valueOf(this.f31069C), this.f31070D, this.f31071E);
    }

    public PendingIntent r0() {
        return this.f31070D;
    }

    public String toString() {
        C3443n.a aVarC = C3443n.c(this);
        aVarC.a("statusCode", O0(this.f31069C));
        aVarC.a("resolution", this.f31070D);
        aVarC.a("message", this.f31071E);
        return aVarC.toString();
    }

    public boolean v0() {
        return (this.f31069C == 0 || this.f31070D == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f31068B;
        int iA = C3493b.a(parcel);
        C3493b.k(parcel, 1, i11);
        C3493b.k(parcel, 2, f0());
        C3493b.p(parcel, 3, r0(), i10, false);
        C3493b.q(parcel, 4, h0(), false);
        C3493b.b(parcel, iA);
    }

    public C2333b(int i10) {
        this(i10, null, null);
    }

    public C2333b(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public C2333b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }
}
