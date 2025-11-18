package p4;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import m4.AbstractC3952d;

/* compiled from: MarkOffers.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\f¨\u0006!"}, d2 = {"Lp4/i;", "Lm4/d;", "", "", "offerIds", "statusCode", "", "error", "message", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getOfferIds", "()Ljava/util/List;", "b", "Ljava/lang/Integer;", "getStatusCode", "()Ljava/lang/Integer;", "c", "Ljava/lang/String;", "getError", "d", "getMessage", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: p4.i, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class MarkOffers extends AbstractC3952d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Integer> offerIds;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer statusCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String error;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    public MarkOffers(List<Integer> offerIds, Integer num, String str, String str2) {
        C3862t.g(offerIds, "offerIds");
        this.offerIds = offerIds;
        this.statusCode = num;
        this.error = str;
        this.message = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkOffers)) {
            return false;
        }
        MarkOffers markOffers = (MarkOffers) other;
        return C3862t.b(this.offerIds, markOffers.offerIds) && C3862t.b(this.statusCode, markOffers.statusCode) && C3862t.b(this.error, markOffers.error) && C3862t.b(this.message, markOffers.message);
    }

    public int hashCode() {
        int iHashCode = this.offerIds.hashCode() * 31;
        Integer num = this.statusCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.error;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "MarkOffers(offerIds=" + this.offerIds + ", statusCode=" + this.statusCode + ", error=" + this.error + ", message=" + this.message + ")";
    }
}
