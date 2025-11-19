package A;

import j1.C3719d;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.r1;
import s1.C4469y0;

/* compiled from: WindowInsets.android.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R+\u0010+\u001a\u00020$2\u0006\u0010%\u001a\u00020$8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R+\u0010,\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001a8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010&\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00060"}, d2 = {"LA/a;", "LA/d0;", "", "type", "", "name", "<init>", "(ILjava/lang/String;)V", "LU0/d;", "density", "LU0/t;", "layoutDirection", "c", "(LU0/d;LU0/t;)I", "b", "(LU0/d;)I", "a", "d", "Ls1/y0;", "windowInsetsCompat", "typeMask", "Loa/F;", "h", "(Ls1/y0;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "I", "getType$foundation_layout_release", "Ljava/lang/String;", "Lj1/d;", "<set-?>", "LO/p0;", "e", "()Lj1/d;", "f", "(Lj1/d;)V", "insets", "isVisible", "()Z", "g", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0793a implements d0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 insets = r1.c(C3719d.f43449e, null, 2, null);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 isVisible = r1.c(Boolean.TRUE, null, 2, null);

    public C0793a(int i10, String str) {
        this.type = i10;
        this.name = str;
    }

    private final void g(boolean z10) {
        this.isVisible.setValue(Boolean.valueOf(z10));
    }

    @Override // A.d0
    public int a(U0.d density, U0.t layoutDirection) {
        return e().f43452c;
    }

    @Override // A.d0
    public int b(U0.d density) {
        return e().f43451b;
    }

    @Override // A.d0
    public int c(U0.d density, U0.t layoutDirection) {
        return e().f43450a;
    }

    @Override // A.d0
    public int d(U0.d density) {
        return e().f43453d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C3719d e() {
        return (C3719d) this.insets.getValue();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C0793a) && this.type == ((C0793a) other).type;
    }

    public final void f(C3719d c3719d) {
        this.insets.setValue(c3719d);
    }

    public final void h(C4469y0 windowInsetsCompat, int typeMask) {
        if (typeMask == 0 || (typeMask & this.type) != 0) {
            f(windowInsetsCompat.f(this.type));
            g(windowInsetsCompat.p(this.type));
        }
    }

    /* renamed from: hashCode, reason: from getter */
    public int getType() {
        return this.type;
    }

    public String toString() {
        return this.name + '(' + e().f43450a + ", " + e().f43451b + ", " + e().f43452c + ", " + e().f43453d + ')';
    }
}
