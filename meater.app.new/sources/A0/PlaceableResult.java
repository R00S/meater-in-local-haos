package A0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: LookaheadDelegate.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LA0/r0;", "LA0/n0;", "Ly0/J;", "result", "LA0/P;", "placeable", "<init>", "(Ly0/J;LA0/P;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "B", "Ly0/J;", "b", "()Ly0/J;", "C", "LA0/P;", "a", "()LA0/P;", "b0", "()Z", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A0.r0, reason: from toString */
/* loaded from: classes.dex */
final /* data */ class PlaceableResult implements n0 {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final y0.J result;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final P placeable;

    public PlaceableResult(y0.J j10, P p10) {
        this.result = j10;
        this.placeable = p10;
    }

    /* renamed from: a, reason: from getter */
    public final P getPlaceable() {
        return this.placeable;
    }

    /* renamed from: b, reason: from getter */
    public final y0.J getResult() {
        return this.result;
    }

    @Override // A0.n0
    public boolean b0() {
        return this.placeable.W0().L();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceableResult)) {
            return false;
        }
        PlaceableResult placeableResult = (PlaceableResult) other;
        return C3862t.b(this.result, placeableResult.result) && C3862t.b(this.placeable, placeableResult.placeable);
    }

    public int hashCode() {
        return (this.result.hashCode() * 31) + this.placeable.hashCode();
    }

    public String toString() {
        return "PlaceableResult(result=" + this.result + ", placeable=" + this.placeable + ')';
    }
}
