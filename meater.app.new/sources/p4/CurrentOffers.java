package p4;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import m4.AbstractC3952d;

/* compiled from: CurrentOffers.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000f¨\u0006%"}, d2 = {"Lp4/c;", "Lm4/d;", "", "Lp4/j;", "offers", "", "signedUpToNewsLetter", "", "statusCode", "", "error", "message", "<init>", "(Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Z", "()Z", "c", "Ljava/lang/Integer;", "getStatusCode", "()Ljava/lang/Integer;", "d", "Ljava/lang/String;", "getError", "e", "getMessage", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: p4.c, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class CurrentOffers extends AbstractC3952d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<OfferData> offers;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean signedUpToNewsLetter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer statusCode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String error;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    public CurrentOffers(List<OfferData> offers, boolean z10, Integer num, String str, String str2) {
        C3862t.g(offers, "offers");
        this.offers = offers;
        this.signedUpToNewsLetter = z10;
        this.statusCode = num;
        this.error = str;
        this.message = str2;
    }

    public final List<OfferData> a() {
        return this.offers;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getSignedUpToNewsLetter() {
        return this.signedUpToNewsLetter;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentOffers)) {
            return false;
        }
        CurrentOffers currentOffers = (CurrentOffers) other;
        return C3862t.b(this.offers, currentOffers.offers) && this.signedUpToNewsLetter == currentOffers.signedUpToNewsLetter && C3862t.b(this.statusCode, currentOffers.statusCode) && C3862t.b(this.error, currentOffers.error) && C3862t.b(this.message, currentOffers.message);
    }

    public int hashCode() {
        int iHashCode = ((this.offers.hashCode() * 31) + Boolean.hashCode(this.signedUpToNewsLetter)) * 31;
        Integer num = this.statusCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.error;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CurrentOffers(offers=" + this.offers + ", signedUpToNewsLetter=" + this.signedUpToNewsLetter + ", statusCode=" + this.statusCode + ", error=" + this.error + ", message=" + this.message + ")";
    }
}
