package cm.aptoide.p092pt.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: SearchQueryModel.kt */
@Metadata(m32266d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001e"}, m32267d2 = {"Lcm/aptoide/pt/search/model/SearchQueryModel;", "Landroid/os/Parcelable;", "userQuery", HttpUrl.FRAGMENT_ENCODE_SET, "finalQuery", "source", "Lcm/aptoide/pt/search/model/Source;", "(Ljava/lang/String;Ljava/lang/String;Lcm/aptoide/pt/search/model/Source;)V", "getFinalQuery", "()Ljava/lang/String;", "getSource", "()Lcm/aptoide/pt/search/model/Source;", "getUserQuery", "component1", "component2", "component3", "copy", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "parcel", "Landroid/os/Parcel;", "flags", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SearchQueryModel implements Parcelable {
    public static final Parcelable.Creator<SearchQueryModel> CREATOR = new Creator();
    private final String finalQuery;
    private final Source source;
    private final String userQuery;

    /* compiled from: SearchQueryModel.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class Creator implements Parcelable.Creator<SearchQueryModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchQueryModel createFromParcel(Parcel parcel) {
            C9801m.m32346f(parcel, "parcel");
            return new SearchQueryModel(parcel.readString(), parcel.readString(), Source.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SearchQueryModel[] newArray(int i2) {
            return new SearchQueryModel[i2];
        }
    }

    public SearchQueryModel() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchQueryModel(String str) {
        this(str, null, null, 6, null);
        C9801m.m32346f(str, "userQuery");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchQueryModel(String str, String str2) {
        this(str, str2, null, 4, null);
        C9801m.m32346f(str, "userQuery");
        C9801m.m32346f(str2, "finalQuery");
    }

    public SearchQueryModel(String str, String str2, Source source) {
        C9801m.m32346f(str, "userQuery");
        C9801m.m32346f(str2, "finalQuery");
        C9801m.m32346f(source, "source");
        this.userQuery = str;
        this.finalQuery = str2;
        this.source = source;
    }

    public static /* synthetic */ SearchQueryModel copy$default(SearchQueryModel searchQueryModel, String str, String str2, Source source, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = searchQueryModel.userQuery;
        }
        if ((i2 & 2) != 0) {
            str2 = searchQueryModel.finalQuery;
        }
        if ((i2 & 4) != 0) {
            source = searchQueryModel.source;
        }
        return searchQueryModel.copy(str, str2, source);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserQuery() {
        return this.userQuery;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFinalQuery() {
        return this.finalQuery;
    }

    /* renamed from: component3, reason: from getter */
    public final Source getSource() {
        return this.source;
    }

    public final SearchQueryModel copy(String userQuery, String finalQuery, Source source) {
        C9801m.m32346f(userQuery, "userQuery");
        C9801m.m32346f(finalQuery, "finalQuery");
        C9801m.m32346f(source, "source");
        return new SearchQueryModel(userQuery, finalQuery, source);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchQueryModel)) {
            return false;
        }
        SearchQueryModel searchQueryModel = (SearchQueryModel) other;
        return C9801m.m32341a(this.userQuery, searchQueryModel.userQuery) && C9801m.m32341a(this.finalQuery, searchQueryModel.finalQuery) && this.source == searchQueryModel.source;
    }

    public final String getFinalQuery() {
        return this.finalQuery;
    }

    public final Source getSource() {
        return this.source;
    }

    public final String getUserQuery() {
        return this.userQuery;
    }

    public int hashCode() {
        return (((this.userQuery.hashCode() * 31) + this.finalQuery.hashCode()) * 31) + this.source.hashCode();
    }

    public String toString() {
        return "SearchQueryModel(userQuery=" + this.userQuery + ", finalQuery=" + this.finalQuery + ", source=" + this.source + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        C9801m.m32346f(parcel, "out");
        parcel.writeString(this.userQuery);
        parcel.writeString(this.finalQuery);
        parcel.writeString(this.source.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SearchQueryModel(String str, String str2, Source source, int i2, C9789g c9789g) {
        str = (i2 & 1) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        this(str, (i2 & 2) != 0 ? str : str2, (i2 & 4) != 0 ? Source.MANUAL : source);
    }
}
