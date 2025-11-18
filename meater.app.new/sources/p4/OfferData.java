package p4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: OfferData.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f¨\u0006 "}, d2 = {"Lp4/j;", "", "", "id", "", "name", "title", "thumbnailUrl", "offerUrl", "", "isNew", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "getName", "c", "getTitle", "d", "e", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: p4.j, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class OfferData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String thumbnailUrl;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String offerUrl;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isNew;

    public OfferData(int i10, String str, String str2, String str3, String str4, Boolean bool) {
        this.id = i10;
        this.name = str;
        this.title = str2;
        this.thumbnailUrl = str3;
        this.offerUrl = str4;
        this.isNew = bool;
    }

    /* renamed from: a, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: b, reason: from getter */
    public final String getOfferUrl() {
        return this.offerUrl;
    }

    /* renamed from: c, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* renamed from: d, reason: from getter */
    public final Boolean getIsNew() {
        return this.isNew;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfferData)) {
            return false;
        }
        OfferData offerData = (OfferData) other;
        return this.id == offerData.id && C3862t.b(this.name, offerData.name) && C3862t.b(this.title, offerData.title) && C3862t.b(this.thumbnailUrl, offerData.thumbnailUrl) && C3862t.b(this.offerUrl, offerData.offerUrl) && C3862t.b(this.isNew, offerData.isNew);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.thumbnailUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.offerUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isNew;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "OfferData(id=" + this.id + ", name=" + this.name + ", title=" + this.title + ", thumbnailUrl=" + this.thumbnailUrl + ", offerUrl=" + this.offerUrl + ", isNew=" + this.isNew + ")";
    }
}
