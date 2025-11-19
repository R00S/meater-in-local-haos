package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: AccessibilityIterators.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/f;", "Landroidx/compose/ui/platform/b;", "<init>", "()V", "", "index", "", "j", "(I)Z", "i", "current", "", "a", "(I)[I", "b", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2014f extends AbstractC2006b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static C2014f f23132d;

    /* compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/f$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/f;", "a", "()Landroidx/compose/ui/platform/f;", "instance", "Landroidx/compose/ui/platform/f;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final C2014f a() {
            if (C2014f.f23132d == null) {
                C2014f.f23132d = new C2014f(null);
            }
            C2014f c2014f = C2014f.f23132d;
            C3862t.e(c2014f, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return c2014f;
        }

        private Companion() {
        }
    }

    public /* synthetic */ C2014f(C3854k c3854k) {
        this();
    }

    private final boolean i(int index) {
        return index > 0 && d().charAt(index + (-1)) != '\n' && (index == d().length() || d().charAt(index) == '\n');
    }

    private final boolean j(int index) {
        return d().charAt(index) != '\n' && (index == 0 || d().charAt(index - 1) == '\n');
    }

    @Override // androidx.compose.ui.platform.InterfaceC2016g
    public int[] a(int current) {
        int length = d().length();
        if (length <= 0 || current >= length) {
            return null;
        }
        if (current < 0) {
            current = 0;
        }
        while (current < length && d().charAt(current) == '\n' && !j(current)) {
            current++;
        }
        if (current >= length) {
            return null;
        }
        int i10 = current + 1;
        while (i10 < length && !i(i10)) {
            i10++;
        }
        return c(current, i10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2016g
    public int[] b(int current) {
        int length = d().length();
        if (length <= 0 || current <= 0) {
            return null;
        }
        if (current > length) {
            current = length;
        }
        while (current > 0 && d().charAt(current - 1) == '\n' && !i(current)) {
            current--;
        }
        if (current <= 0) {
            return null;
        }
        int i10 = current - 1;
        while (i10 > 0 && !j(i10)) {
            i10--;
        }
        return c(i10, current);
    }

    private C2014f() {
    }
}
