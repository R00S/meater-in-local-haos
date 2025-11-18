package L;

import U0.p;
import U0.t;
import b0.C2195a;
import b0.c;
import kotlin.Metadata;

/* compiled from: MenuPosition.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0010\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"LL/g;", "", "<init>", "()V", "", "offset", "LL/g$a;", "g", "(I)LL/g$a;", "d", "margin", "e", "f", "LL/g$b;", "h", "(I)LL/g$b;", "a", "c", "i", "b", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f8908a = new g();

    /* compiled from: MenuPosition.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001J2\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"LL/g$a;", "", "LU0/p;", "anchorBounds", "LU0/r;", "windowSize", "", "menuWidth", "LU0/t;", "layoutDirection", "a", "(LU0/p;JILU0/t;)I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        int a(p anchorBounds, long windowSize, int menuWidth, t layoutDirection);
    }

    /* compiled from: MenuPosition.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"LL/g$b;", "", "LU0/p;", "anchorBounds", "LU0/r;", "windowSize", "", "menuHeight", "a", "(LU0/p;JI)I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        int a(p anchorBounds, long windowSize, int menuHeight);
    }

    private g() {
    }

    public final b a(int offset) {
        c.Companion companion = b0.c.INSTANCE;
        return new Vertical(companion.a(), companion.l(), offset);
    }

    public final b b(int margin) {
        return new Vertical(b0.c.INSTANCE.a(), margin);
    }

    public final b c(int offset) {
        c.Companion companion = b0.c.INSTANCE;
        return new Vertical(companion.i(), companion.l(), offset);
    }

    public final a d(int offset) {
        c.Companion companion = b0.c.INSTANCE;
        return new Horizontal(companion.j(), companion.j(), offset);
    }

    public final a e(int margin) {
        return new Horizontal(C2195a.f29878a.a(), margin);
    }

    public final a f(int margin) {
        return new Horizontal(C2195a.f29878a.b(), margin);
    }

    public final a g(int offset) {
        c.Companion companion = b0.c.INSTANCE;
        return new Horizontal(companion.k(), companion.k(), offset);
    }

    public final b h(int offset) {
        c.Companion companion = b0.c.INSTANCE;
        return new Vertical(companion.l(), companion.a(), offset);
    }

    public final b i(int margin) {
        return new Vertical(b0.c.INSTANCE.l(), margin);
    }
}
