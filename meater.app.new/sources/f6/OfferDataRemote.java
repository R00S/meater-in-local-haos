package f6;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import p4.OfferData;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\nR\u001a\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0007R\u001a\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0007R\u001a\u0010\u001e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0007R\u001a\u0010!\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lf6/k;", "", "Lp4/j;", "a", "()Lp4/j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "id", "b", "Ljava/lang/String;", "getName", "name", "c", "getTitle", "title", "d", "getImage_url", "image_url", "e", "getProduct_url", "product_url", "f", "Z", "is_new", "()Z", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: f6.k, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class OfferDataRemote {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("id")
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("name")
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("title")
    private final String title;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("image_url")
    private final String image_url;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("product_url")
    private final String product_url;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("is_new")
    private final boolean is_new;

    public final OfferData a() {
        return new OfferData(this.id, this.name, this.title, this.image_url, this.product_url, Boolean.valueOf(this.is_new));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfferDataRemote)) {
            return false;
        }
        OfferDataRemote offerDataRemote = (OfferDataRemote) other;
        return this.id == offerDataRemote.id && C3862t.b(this.name, offerDataRemote.name) && C3862t.b(this.title, offerDataRemote.title) && C3862t.b(this.image_url, offerDataRemote.image_url) && C3862t.b(this.product_url, offerDataRemote.product_url) && this.is_new == offerDataRemote.is_new;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.title.hashCode()) * 31) + this.image_url.hashCode()) * 31) + this.product_url.hashCode()) * 31) + Boolean.hashCode(this.is_new);
    }

    public String toString() {
        return "OfferDataRemote(id=" + this.id + ", name=" + this.name + ", title=" + this.title + ", image_url=" + this.image_url + ", product_url=" + this.product_url + ", is_new=" + this.is_new + ")";
    }
}
