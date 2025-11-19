package e6;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import o4.Alert;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0019"}, d2 = {"Le6/q;", "", "Lo4/a;", "a", "()Lo4/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "type", "b", "I", "getValue", "value", "c", "getName", "name", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e6.q, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class SetupAlert {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("type")
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("value")
    private final int value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("name")
    private final String name;

    public final Alert a() {
        return new Alert(o4.p.INSTANCE.a(this.type), this.value, this.name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupAlert)) {
            return false;
        }
        SetupAlert setupAlert = (SetupAlert) other;
        return C3862t.b(this.type, setupAlert.type) && this.value == setupAlert.value && C3862t.b(this.name, setupAlert.name);
    }

    public int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + Integer.hashCode(this.value)) * 31;
        String str = this.name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SetupAlert(type=" + this.type + ", value=" + this.value + ", name=" + this.name + ")";
    }
}
