package cm.aptoide.p092pt.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import cm.aptoide.aptoideviews.filters.Filter;
import cm.aptoide.aptoideviews.filters.Filter$$Parcelable;
import java.security.PrivilegedActionException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.parceler.C11184a;
import org.parceler.C11185b;
import org.parceler.InterfaceC11186c;
import org.parceler.ParcelerRuntimeException;

/* loaded from: classes.dex */
public class SearchViewModel$$Parcelable implements Parcelable, InterfaceC11186c<SearchViewModel> {
    public static final Parcelable.Creator<SearchViewModel$$Parcelable> CREATOR = new Parcelable.Creator<SearchViewModel$$Parcelable>() { // from class: cm.aptoide.pt.search.model.SearchViewModel$$Parcelable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SearchViewModel$$Parcelable createFromParcel(Parcel parcel) {
            return new SearchViewModel$$Parcelable(SearchViewModel$$Parcelable.read(parcel, new C11184a()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SearchViewModel$$Parcelable[] newArray(int i2) {
            return new SearchViewModel$$Parcelable[i2];
        }
    };
    private SearchViewModel searchViewModel$$0;

    public SearchViewModel$$Parcelable(SearchViewModel searchViewModel) {
        this.searchViewModel$$0 = searchViewModel;
    }

    public static SearchViewModel read(Parcel parcel, C11184a c11184a) throws PrivilegedActionException {
        ArrayList arrayList;
        int i2 = parcel.readInt();
        if (c11184a.m39861a(i2)) {
            if (c11184a.m39864d(i2)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return (SearchViewModel) c11184a.m39862b(i2);
        }
        int iM39867g = c11184a.m39867g();
        SearchViewModel searchViewModel = new SearchViewModel();
        c11184a.m39866f(iM39867g, searchViewModel);
        searchViewModel.searchQueryModel = (SearchQueryModel) parcel.readParcelable(SearchViewModel$$Parcelable.class.getClassLoader());
        searchViewModel.storeName = parcel.readString();
        searchViewModel.onlyTrustedApps = parcel.readInt() == 1;
        C11185b.m39869b(SearchViewModel.class, searchViewModel, "storeTheme", parcel.readString());
        searchViewModel.loadedAds = parcel.readInt() == 1;
        int i3 = parcel.readInt();
        if (i3 < 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList2.add(Filter$$Parcelable.read(parcel, c11184a));
            }
            arrayList = arrayList2;
        }
        searchViewModel.filters = arrayList;
        searchViewModel.loadedResults = parcel.readInt() == 1;
        c11184a.m39866f(i2, searchViewModel);
        return searchViewModel;
    }

    public static void write(SearchViewModel searchViewModel, Parcel parcel, int i2, C11184a c11184a) {
        int iM39863c = c11184a.m39863c(searchViewModel);
        if (iM39863c != -1) {
            parcel.writeInt(iM39863c);
            return;
        }
        parcel.writeInt(c11184a.m39865e(searchViewModel));
        parcel.writeParcelable(searchViewModel.searchQueryModel, i2);
        parcel.writeString(searchViewModel.storeName);
        parcel.writeInt(searchViewModel.onlyTrustedApps ? 1 : 0);
        parcel.writeString((String) C11185b.m39868a(String.class, SearchViewModel.class, searchViewModel, "storeTheme"));
        parcel.writeInt(searchViewModel.loadedAds ? 1 : 0);
        List<Filter> list = searchViewModel.filters;
        if (list == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(list.size());
            Iterator<Filter> it = searchViewModel.filters.iterator();
            while (it.hasNext()) {
                Filter$$Parcelable.write(it.next(), parcel, i2, c11184a);
            }
        }
        parcel.writeInt(searchViewModel.loadedResults ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        write(this.searchViewModel$$0, parcel, i2, new C11184a());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.parceler.InterfaceC11186c
    public SearchViewModel getParcel() {
        return this.searchViewModel$$0;
    }
}
