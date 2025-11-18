package o4;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Meta.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lo4/g;", "", "", "isWrapped", "", "Lo4/a;", "setupAlerts", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "b", "Ljava/util/List;", "()Ljava/util/List;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o4.g, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class Meta {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isWrapped;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Alert> setupAlerts;

    public Meta(Boolean bool, List<Alert> list) {
        this.isWrapped = bool;
        this.setupAlerts = list;
    }

    public final List<Alert> a() {
        return this.setupAlerts;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Meta)) {
            return false;
        }
        Meta meta = (Meta) other;
        return C3862t.b(this.isWrapped, meta.isWrapped) && C3862t.b(this.setupAlerts, meta.setupAlerts);
    }

    public int hashCode() {
        Boolean bool = this.isWrapped;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<Alert> list = this.setupAlerts;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "Meta(isWrapped=" + this.isWrapped + ", setupAlerts=" + this.setupAlerts + ")";
    }
}
