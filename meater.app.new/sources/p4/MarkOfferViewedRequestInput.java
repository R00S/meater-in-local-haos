package p4;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: MarkOfferViewedRequestInput.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R'\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp4/h;", "", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "offerIds", "<init>", "(Ljava/util/ArrayList;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: p4.h, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class MarkOfferViewedRequestInput {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ArrayList<Integer> offerIds;

    public MarkOfferViewedRequestInput(ArrayList<Integer> offerIds) {
        C3862t.g(offerIds, "offerIds");
        this.offerIds = offerIds;
    }

    public final ArrayList<Integer> a() {
        return this.offerIds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MarkOfferViewedRequestInput) && C3862t.b(this.offerIds, ((MarkOfferViewedRequestInput) other).offerIds);
    }

    public int hashCode() {
        return this.offerIds.hashCode();
    }

    public String toString() {
        return "MarkOfferViewedRequestInput(offerIds=" + this.offerIds + ")";
    }
}
