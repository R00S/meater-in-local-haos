package androidx.compose.ui.window;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: AndroidDialog.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB'\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/window/j;", "", "", "dismissOnBackPress", "dismissOnClickOutside", "Landroidx/compose/ui/window/t;", "securePolicy", "usePlatformDefaultWidth", "decorFitsSystemWindows", "<init>", "(ZZLandroidx/compose/ui/window/t;ZZ)V", "(ZZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "b", "()Z", "c", "Landroidx/compose/ui/window/t;", "d", "()Landroidx/compose/ui/window/t;", "e", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean dismissOnBackPress;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean dismissOnClickOutside;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t securePolicy;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean usePlatformDefaultWidth;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean decorFitsSystemWindows;

    public j() {
        this(false, false, null, false, false, 31, null);
    }

    /* renamed from: a, reason: from getter */
    public final boolean getDecorFitsSystemWindows() {
        return this.decorFitsSystemWindows;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    /* renamed from: d, reason: from getter */
    public final t getSecurePolicy() {
        return this.securePolicy;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof j)) {
            return false;
        }
        j jVar = (j) other;
        return this.dismissOnBackPress == jVar.dismissOnBackPress && this.dismissOnClickOutside == jVar.dismissOnClickOutside && this.securePolicy == jVar.securePolicy && this.usePlatformDefaultWidth == jVar.usePlatformDefaultWidth && this.decorFitsSystemWindows == jVar.decorFitsSystemWindows;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.dismissOnBackPress) * 31) + Boolean.hashCode(this.dismissOnClickOutside)) * 31) + this.securePolicy.hashCode()) * 31) + Boolean.hashCode(this.usePlatformDefaultWidth)) * 31) + Boolean.hashCode(this.decorFitsSystemWindows);
    }

    public j(boolean z10, boolean z11, t tVar, boolean z12, boolean z13) {
        this.dismissOnBackPress = z10;
        this.dismissOnClickOutside = z11;
        this.securePolicy = tVar;
        this.usePlatformDefaultWidth = z12;
        this.decorFitsSystemWindows = z13;
    }

    public /* synthetic */ j(boolean z10, boolean z11, t tVar, boolean z12, boolean z13, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? t.Inherit : tVar, (i10 & 8) != 0 ? true : z12, (i10 & 16) != 0 ? true : z13);
    }

    public /* synthetic */ j(boolean z10, boolean z11, boolean z12, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12);
    }

    public j(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, t.Inherit, z12, true);
    }
}
