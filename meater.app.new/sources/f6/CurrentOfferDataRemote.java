package f6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lf6/c;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lf6/k;", "a", "Ljava/util/List;", "()Ljava/util/List;", "offers", "b", "Z", "()Z", "recieves_newsletter", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: f6.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class CurrentOfferDataRemote {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("offers")
    private final List<OfferDataRemote> offers;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("recieves_newsletter")
    private final boolean recieves_newsletter;

    public final List<OfferDataRemote> a() {
        return this.offers;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getRecieves_newsletter() {
        return this.recieves_newsletter;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentOfferDataRemote)) {
            return false;
        }
        CurrentOfferDataRemote currentOfferDataRemote = (CurrentOfferDataRemote) other;
        return C3862t.b(this.offers, currentOfferDataRemote.offers) && this.recieves_newsletter == currentOfferDataRemote.recieves_newsletter;
    }

    public int hashCode() {
        return (this.offers.hashCode() * 31) + Boolean.hashCode(this.recieves_newsletter);
    }

    public String toString() {
        return "CurrentOfferDataRemote(offers=" + this.offers + ", recieves_newsletter=" + this.recieves_newsletter + ")";
    }
}
