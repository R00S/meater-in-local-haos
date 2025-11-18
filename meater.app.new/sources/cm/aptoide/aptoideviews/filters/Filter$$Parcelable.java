package cm.aptoide.aptoideviews.filters;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C11184a;
import org.parceler.InterfaceC11186c;
import org.parceler.ParcelerRuntimeException;

/* loaded from: classes.dex */
public class Filter$$Parcelable implements Parcelable, InterfaceC11186c<Filter> {
    public static final Parcelable.Creator<Filter$$Parcelable> CREATOR = new Parcelable.Creator<Filter$$Parcelable>() { // from class: cm.aptoide.aptoideviews.filters.Filter$$Parcelable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Filter$$Parcelable createFromParcel(Parcel parcel) {
            return new Filter$$Parcelable(Filter$$Parcelable.read(parcel, new C11184a()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Filter$$Parcelable[] newArray(int i2) {
            return new Filter$$Parcelable[i2];
        }
    };
    private Filter filter$$0;

    public Filter$$Parcelable(Filter filter) {
        this.filter$$0 = filter;
    }

    public static Filter read(Parcel parcel, C11184a c11184a) {
        int i2 = parcel.readInt();
        if (c11184a.m39861a(i2)) {
            if (c11184a.m39864d(i2)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return (Filter) c11184a.m39862b(i2);
        }
        int iM39867g = c11184a.m39867g();
        Filter filter = new Filter();
        c11184a.m39866f(iM39867g, filter);
        filter.setId$aptoide_views_prodRelease(parcel.readInt());
        c11184a.m39866f(i2, filter);
        return filter;
    }

    public static void write(Filter filter, Parcel parcel, int i2, C11184a c11184a) {
        int iM39863c = c11184a.m39863c(filter);
        if (iM39863c != -1) {
            parcel.writeInt(iM39863c);
        } else {
            parcel.writeInt(c11184a.m39865e(filter));
            parcel.writeInt(filter.getId());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        write(this.filter$$0, parcel, i2, new C11184a());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.parceler.InterfaceC11186c
    public Filter getParcel() {
        return this.filter$$0;
    }
}
