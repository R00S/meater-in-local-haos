package c7;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;
import m7.InterfaceC3977a;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class z extends AbstractC3492a {
    public static final Parcelable.Creator<z> CREATOR = new C2323A();

    /* renamed from: B, reason: collision with root package name */
    private final String f31114B;

    /* renamed from: C, reason: collision with root package name */
    private final boolean f31115C;

    /* renamed from: D, reason: collision with root package name */
    private final boolean f31116D;

    /* renamed from: E, reason: collision with root package name */
    private final Context f31117E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f31118F;

    /* renamed from: G, reason: collision with root package name */
    private final boolean f31119G;

    z(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13) {
        this.f31114B = str;
        this.f31115C = z10;
        this.f31116D = z11;
        this.f31117E = (Context) m7.b.k(InterfaceC3977a.AbstractBinderC0607a.g(iBinder));
        this.f31118F = z12;
        this.f31119G = z13;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, m7.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f31114B;
        int iA = C3493b.a(parcel);
        C3493b.q(parcel, 1, str, false);
        C3493b.c(parcel, 2, this.f31115C);
        C3493b.c(parcel, 3, this.f31116D);
        C3493b.j(parcel, 4, m7.b.u1(this.f31117E), false);
        C3493b.c(parcel, 5, this.f31118F);
        C3493b.c(parcel, 6, this.f31119G);
        C3493b.b(parcel, iA);
    }
}
