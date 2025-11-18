package androidx.compose.ui.window;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: AndroidPopup.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bB1\b\u0016\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000eBE\b\u0016\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0011BO\b\u0016\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0018\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/ui/window/s;", "", "", "flags", "", "inheritSecurePolicy", "dismissOnBackPress", "dismissOnClickOutside", "excludeFromSystemGesture", "usePlatformDefaultWidth", "<init>", "(IZZZZZ)V", "focusable", "clippingEnabled", "(ZZZZ)V", "Landroidx/compose/ui/window/t;", "securePolicy", "(ZZZLandroidx/compose/ui/window/t;ZZ)V", "(ZZZLandroidx/compose/ui/window/t;ZZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "d", "b", "Z", "e", "()Z", "c", "f", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int flags;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean inheritSecurePolicy;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean dismissOnBackPress;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean dismissOnClickOutside;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean excludeFromSystemGesture;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean usePlatformDefaultWidth;

    public s(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.flags = i10;
        this.inheritSecurePolicy = z10;
        this.dismissOnBackPress = z11;
        this.dismissOnClickOutside = z12;
        this.excludeFromSystemGesture = z13;
        this.usePlatformDefaultWidth = z14;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getExcludeFromSystemGesture() {
        return this.excludeFromSystemGesture;
    }

    /* renamed from: d, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getInheritSecurePolicy() {
        return this.inheritSecurePolicy;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof s)) {
            return false;
        }
        s sVar = (s) other;
        return this.flags == sVar.flags && this.inheritSecurePolicy == sVar.inheritSecurePolicy && this.dismissOnBackPress == sVar.dismissOnBackPress && this.dismissOnClickOutside == sVar.dismissOnClickOutside && this.excludeFromSystemGesture == sVar.excludeFromSystemGesture && this.usePlatformDefaultWidth == sVar.usePlatformDefaultWidth;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public int hashCode() {
        return (((((((((this.flags * 31) + Boolean.hashCode(this.inheritSecurePolicy)) * 31) + Boolean.hashCode(this.dismissOnBackPress)) * 31) + Boolean.hashCode(this.dismissOnClickOutside)) * 31) + Boolean.hashCode(this.excludeFromSystemGesture)) * 31) + Boolean.hashCode(this.usePlatformDefaultWidth);
    }

    public /* synthetic */ s(boolean z10, boolean z11, boolean z12, boolean z13, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? true : z13);
    }

    public s(boolean z10, boolean z11, boolean z12, boolean z13) {
        this(z10, z11, z12, t.Inherit, true, z13);
    }

    public /* synthetic */ s(boolean z10, boolean z11, boolean z12, t tVar, boolean z13, boolean z14, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? t.Inherit : tVar, (i10 & 16) != 0 ? true : z13, (i10 & 32) == 0 ? z14 : true);
    }

    public s(boolean z10, boolean z11, boolean z12, t tVar, boolean z13, boolean z14) {
        this(z10, z11, z12, tVar, z13, z14, false);
    }

    public s(boolean z10, boolean z11, boolean z12, t tVar, boolean z13, boolean z14, boolean z15) {
        this(c.h(z10, tVar, z14), tVar == t.Inherit, z11, z12, z13, z15);
    }
}
