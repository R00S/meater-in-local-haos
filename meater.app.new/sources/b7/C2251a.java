package b7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import h7.AbstractC3492a;
import h7.C3493b;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* renamed from: b7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2251a extends AbstractC3492a {
    public static final Parcelable.Creator<C2251a> CREATOR = new C2254d();

    /* renamed from: B, reason: collision with root package name */
    final Intent f30636B;

    public C2251a(Intent intent) {
        this.f30636B = intent;
    }

    public Intent f0() {
        return this.f30636B;
    }

    public String h0() {
        String stringExtra = this.f30636B.getStringExtra("google.message_id");
        return stringExtra == null ? this.f30636B.getStringExtra("message_id") : stringExtra;
    }

    final Integer r0() {
        if (this.f30636B.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f30636B.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.p(parcel, 1, this.f30636B, i10, false);
        C3493b.b(parcel, iA);
    }
}
