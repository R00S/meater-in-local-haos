package e6;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import o4.OnCompleteAction;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0018"}, d2 = {"Le6/c;", "", "Lo4/h;", "a", "()Lo4/h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Le6/h;", "Le6/h;", "getMeta", "()Le6/h;", "meta", "b", "Ljava/lang/String;", "getType", "type", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e6.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class Complete {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("meta")
    private final Meta meta;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("type")
    private final String type;

    public final OnCompleteAction a() {
        Meta meta = this.meta;
        return new OnCompleteAction(meta != null ? meta.a() : null, o4.i.INSTANCE.a(this.type));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Complete)) {
            return false;
        }
        Complete complete = (Complete) other;
        return C3862t.b(this.meta, complete.meta) && C3862t.b(this.type, complete.type);
    }

    public int hashCode() {
        Meta meta = this.meta;
        return ((meta == null ? 0 : meta.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "Complete(meta=" + this.meta + ", type=" + this.type + ")";
    }
}
