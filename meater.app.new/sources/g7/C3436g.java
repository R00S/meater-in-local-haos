package g7;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c7.C2335d;
import com.google.android.gms.common.api.Scope;
import g7.InterfaceC3439j;
import h7.AbstractC3492a;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: g7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3436g extends AbstractC3492a {
    public static final Parcelable.Creator<C3436g> CREATOR = new k0();

    /* renamed from: P, reason: collision with root package name */
    static final Scope[] f42036P = new Scope[0];

    /* renamed from: Q, reason: collision with root package name */
    static final C2335d[] f42037Q = new C2335d[0];

    /* renamed from: B, reason: collision with root package name */
    final int f42038B;

    /* renamed from: C, reason: collision with root package name */
    final int f42039C;

    /* renamed from: D, reason: collision with root package name */
    final int f42040D;

    /* renamed from: E, reason: collision with root package name */
    String f42041E;

    /* renamed from: F, reason: collision with root package name */
    IBinder f42042F;

    /* renamed from: G, reason: collision with root package name */
    Scope[] f42043G;

    /* renamed from: H, reason: collision with root package name */
    Bundle f42044H;

    /* renamed from: I, reason: collision with root package name */
    Account f42045I;

    /* renamed from: J, reason: collision with root package name */
    C2335d[] f42046J;

    /* renamed from: K, reason: collision with root package name */
    C2335d[] f42047K;

    /* renamed from: L, reason: collision with root package name */
    final boolean f42048L;

    /* renamed from: M, reason: collision with root package name */
    final int f42049M;

    /* renamed from: N, reason: collision with root package name */
    boolean f42050N;

    /* renamed from: O, reason: collision with root package name */
    private final String f42051O;

    C3436g(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C2335d[] c2335dArr, C2335d[] c2335dArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f42036P : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c2335dArr = c2335dArr == null ? f42037Q : c2335dArr;
        c2335dArr2 = c2335dArr2 == null ? f42037Q : c2335dArr2;
        this.f42038B = i10;
        this.f42039C = i11;
        this.f42040D = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f42041E = "com.google.android.gms";
        } else {
            this.f42041E = str;
        }
        if (i10 < 2) {
            this.f42045I = iBinder != null ? BinderC3430a.k(InterfaceC3439j.a.g(iBinder)) : null;
        } else {
            this.f42042F = iBinder;
            this.f42045I = account;
        }
        this.f42043G = scopeArr;
        this.f42044H = bundle;
        this.f42046J = c2335dArr;
        this.f42047K = c2335dArr2;
        this.f42048L = z10;
        this.f42049M = i13;
        this.f42050N = z11;
        this.f42051O = str2;
    }

    public String f0() {
        return this.f42051O;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        k0.a(this, parcel, i10);
    }
}
