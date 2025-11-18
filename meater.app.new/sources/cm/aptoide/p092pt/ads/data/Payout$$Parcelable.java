package cm.aptoide.p092pt.ads.data;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C11184a;
import org.parceler.InterfaceC11186c;
import org.parceler.ParcelerRuntimeException;

/* loaded from: classes.dex */
public class Payout$$Parcelable implements Parcelable, InterfaceC11186c<Payout> {
    public static final Parcelable.Creator<Payout$$Parcelable> CREATOR = new Parcelable.Creator<Payout$$Parcelable>() { // from class: cm.aptoide.pt.ads.data.Payout$$Parcelable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Payout$$Parcelable createFromParcel(Parcel parcel) {
            return new Payout$$Parcelable(Payout$$Parcelable.read(parcel, new C11184a()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Payout$$Parcelable[] newArray(int i2) {
            return new Payout$$Parcelable[i2];
        }
    };
    private Payout payout$$0;

    public Payout$$Parcelable(Payout payout) {
        this.payout$$0 = payout;
    }

    public static Payout read(Parcel parcel, C11184a c11184a) {
        int i2 = parcel.readInt();
        if (c11184a.m39861a(i2)) {
            if (c11184a.m39864d(i2)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return (Payout) c11184a.m39862b(i2);
        }
        int iM39867g = c11184a.m39867g();
        Payout payout = new Payout();
        c11184a.m39866f(iM39867g, payout);
        payout.fiatAmount = parcel.readDouble();
        payout.fiatCurrency = parcel.readString();
        payout.fiatSymbol = parcel.readString();
        payout.appcAmount = parcel.readDouble();
        c11184a.m39866f(i2, payout);
        return payout;
    }

    public static void write(Payout payout, Parcel parcel, int i2, C11184a c11184a) {
        int iM39863c = c11184a.m39863c(payout);
        if (iM39863c != -1) {
            parcel.writeInt(iM39863c);
            return;
        }
        parcel.writeInt(c11184a.m39865e(payout));
        parcel.writeDouble(payout.fiatAmount);
        parcel.writeString(payout.fiatCurrency);
        parcel.writeString(payout.fiatSymbol);
        parcel.writeDouble(payout.appcAmount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        write(this.payout$$0, parcel, i2, new C11184a());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.parceler.InterfaceC11186c
    public Payout getParcel() {
        return this.payout$$0;
    }
}
