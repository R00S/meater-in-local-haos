package kotlin;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ActionOnlyNavDirections.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Lg3/a;", "Lg3/u;", "", "actionId", "<init>", "(I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "Landroid/os/Bundle;", "b", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "arguments", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g3.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class ActionOnlyNavDirections implements InterfaceC3415u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int actionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bundle arguments = new Bundle();

    public ActionOnlyNavDirections(int i10) {
        this.actionId = i10;
    }

    @Override // kotlin.InterfaceC3415u
    /* renamed from: a, reason: from getter */
    public int getActionId() {
        return this.actionId;
    }

    @Override // kotlin.InterfaceC3415u
    /* renamed from: b, reason: from getter */
    public Bundle getArguments() {
        return this.arguments;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return other != null && C3862t.b(ActionOnlyNavDirections.class, other.getClass()) && getActionId() == ((ActionOnlyNavDirections) other).getActionId();
    }

    public int hashCode() {
        return 31 + getActionId();
    }

    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + getActionId() + ')';
    }
}
