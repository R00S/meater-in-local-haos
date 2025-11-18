package F0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.InterfaceC4160e;

/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"LF0/a;", "Loa/e;", "", "T", "", "", "label", "action", "<init>", "(Ljava/lang/String;Loa/e;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Loa/e;", "()Loa/e;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: F0.a, reason: from toString */
/* loaded from: classes.dex */
public final class AccessibilityAction<T extends InterfaceC4160e<? extends Boolean>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String label;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final T action;

    public AccessibilityAction(String str, T t10) {
        this.label = str;
        this.action = t10;
    }

    public final T a() {
        return this.action;
    }

    /* renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) other;
        return C3862t.b(this.label, accessibilityAction.label) && C3862t.b(this.action, accessibilityAction.action);
    }

    public int hashCode() {
        String str = this.label;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t10 = this.action;
        return iHashCode + (t10 != null ? t10.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}
