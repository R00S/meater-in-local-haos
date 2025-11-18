package o4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Alert.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u001b"}, d2 = {"Lo4/a;", "", "Lo4/p;", "type", "", "value", "", "name", "<init>", "(Lo4/p;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo4/p;", "b", "()Lo4/p;", "setType", "(Lo4/p;)V", "I", "c", "Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o4.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class Alert {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private p type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    public Alert(p type, int i10, String str) {
        C3862t.g(type, "type");
        this.type = type;
        this.value = i10;
        this.name = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: b, reason: from getter */
    public final p getType() {
        return this.type;
    }

    /* renamed from: c, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Alert)) {
            return false;
        }
        Alert alert = (Alert) other;
        return this.type == alert.type && this.value == alert.value && C3862t.b(this.name, alert.name);
    }

    public int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + Integer.hashCode(this.value)) * 31;
        String str = this.name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Alert(type=" + this.type + ", value=" + this.value + ", name=" + this.name + ")";
    }
}
