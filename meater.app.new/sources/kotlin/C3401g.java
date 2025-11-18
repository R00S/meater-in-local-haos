package kotlin;

import android.os.Bundle;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: NavAction.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0013\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lg3/g;", "", "", "destinationId", "Lg3/z;", "navOptions", "Landroid/os/Bundle;", "defaultArguments", "<init>", "(ILg3/z;Landroid/os/Bundle;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "b", "Lg3/z;", "c", "()Lg3/z;", "e", "(Lg3/z;)V", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "d", "(Landroid/os/Bundle;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3401g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int destinationId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C3420z navOptions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Bundle defaultArguments;

    public C3401g(int i10, C3420z c3420z, Bundle bundle) {
        this.destinationId = i10;
        this.navOptions = c3420z;
        this.defaultArguments = bundle;
    }

    /* renamed from: a, reason: from getter */
    public final Bundle getDefaultArguments() {
        return this.defaultArguments;
    }

    /* renamed from: b, reason: from getter */
    public final int getDestinationId() {
        return this.destinationId;
    }

    /* renamed from: c, reason: from getter */
    public final C3420z getNavOptions() {
        return this.navOptions;
    }

    public final void d(Bundle bundle) {
        this.defaultArguments = bundle;
    }

    public final void e(C3420z c3420z) {
        this.navOptions = c3420z;
    }

    public boolean equals(Object other) {
        Set<String> setKeySet;
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof C3401g)) {
            return false;
        }
        C3401g c3401g = (C3401g) other;
        if (this.destinationId == c3401g.destinationId && C3862t.b(this.navOptions, c3401g.navOptions)) {
            if (C3862t.b(this.defaultArguments, c3401g.defaultArguments)) {
                return true;
            }
            Bundle bundle = this.defaultArguments;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                Set<String> set = setKeySet;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return true;
                }
                for (String str : set) {
                    Bundle bundle2 = this.defaultArguments;
                    Object obj = bundle2 != null ? bundle2.get(str) : null;
                    Bundle bundle3 = c3401g.defaultArguments;
                    if (!C3862t.b(obj, bundle3 != null ? bundle3.get(str) : null)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = Integer.hashCode(this.destinationId) * 31;
        C3420z c3420z = this.navOptions;
        int iHashCode2 = iHashCode + (c3420z != null ? c3420z.hashCode() : 0);
        Bundle bundle = this.defaultArguments;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                int i10 = iHashCode2 * 31;
                Bundle bundle2 = this.defaultArguments;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                iHashCode2 = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return iHashCode2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C3401g.class.getSimpleName());
        sb2.append("(0x");
        sb2.append(Integer.toHexString(this.destinationId));
        sb2.append(")");
        if (this.navOptions != null) {
            sb2.append(" navOptions=");
            sb2.append(this.navOptions);
        }
        String string = sb2.toString();
        C3862t.f(string, "sb.toString()");
        return string;
    }

    public /* synthetic */ C3401g(int i10, C3420z c3420z, Bundle bundle, int i11, C3854k c3854k) {
        this(i10, (i11 & 2) != 0 ? null : c3420z, (i11 & 4) != 0 ? null : bundle);
    }
}
