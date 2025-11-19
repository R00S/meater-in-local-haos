package androidx.compose.ui.platform;

import H0.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: AccessibilityIterators.android.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/d;", "Landroidx/compose/ui/platform/b;", "<init>", "()V", "", "lineNumber", "LR0/h;", "direction", "i", "(ILR0/h;)I", "", "text", "LH0/F;", "layoutResult", "Loa/F;", "j", "(Ljava/lang/String;LH0/F;)V", "current", "", "a", "(I)[I", "b", "c", "LH0/F;", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2010d extends AbstractC2006b {

    /* renamed from: f, reason: collision with root package name */
    private static C2010d f23058f;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult layoutResult;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f23057e = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final R0.h f23059g = R0.h.Rtl;

    /* renamed from: h, reason: collision with root package name */
    private static final R0.h f23060h = R0.h.Ltr;

    /* compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/d$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/d;", "a", "()Landroidx/compose/ui/platform/d;", "LR0/h;", "DirectionEnd", "LR0/h;", "DirectionStart", "lineInstance", "Landroidx/compose/ui/platform/d;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final C2010d a() {
            if (C2010d.f23058f == null) {
                C2010d.f23058f = new C2010d(null);
            }
            C2010d c2010d = C2010d.f23058f;
            C3862t.e(c2010d, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return c2010d;
        }

        private Companion() {
        }
    }

    public /* synthetic */ C2010d(C3854k c3854k) {
        this();
    }

    private final int i(int lineNumber, R0.h direction) {
        TextLayoutResult textLayoutResult = this.layoutResult;
        TextLayoutResult textLayoutResult2 = null;
        if (textLayoutResult == null) {
            C3862t.u("layoutResult");
            textLayoutResult = null;
        }
        int iT = textLayoutResult.t(lineNumber);
        TextLayoutResult textLayoutResult3 = this.layoutResult;
        if (textLayoutResult3 == null) {
            C3862t.u("layoutResult");
            textLayoutResult3 = null;
        }
        if (direction != textLayoutResult3.w(iT)) {
            TextLayoutResult textLayoutResult4 = this.layoutResult;
            if (textLayoutResult4 == null) {
                C3862t.u("layoutResult");
            } else {
                textLayoutResult2 = textLayoutResult4;
            }
            return textLayoutResult2.t(lineNumber);
        }
        TextLayoutResult textLayoutResult5 = this.layoutResult;
        if (textLayoutResult5 == null) {
            C3862t.u("layoutResult");
            textLayoutResult5 = null;
        }
        return TextLayoutResult.o(textLayoutResult5, lineNumber, false, 2, null) - 1;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2016g
    public int[] a(int current) {
        int iP;
        if (d().length() <= 0 || current >= d().length()) {
            return null;
        }
        if (current < 0) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                C3862t.u("layoutResult");
                textLayoutResult = null;
            }
            iP = textLayoutResult.p(0);
        } else {
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                C3862t.u("layoutResult");
                textLayoutResult2 = null;
            }
            int iP2 = textLayoutResult2.p(current);
            iP = i(iP2, f23059g) == current ? iP2 : iP2 + 1;
        }
        TextLayoutResult textLayoutResult3 = this.layoutResult;
        if (textLayoutResult3 == null) {
            C3862t.u("layoutResult");
            textLayoutResult3 = null;
        }
        if (iP >= textLayoutResult3.m()) {
            return null;
        }
        return c(i(iP, f23059g), i(iP, f23060h) + 1);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2016g
    public int[] b(int current) {
        int iP;
        if (d().length() <= 0 || current <= 0) {
            return null;
        }
        if (current > d().length()) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                C3862t.u("layoutResult");
                textLayoutResult = null;
            }
            iP = textLayoutResult.p(d().length());
        } else {
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                C3862t.u("layoutResult");
                textLayoutResult2 = null;
            }
            int iP2 = textLayoutResult2.p(current);
            iP = i(iP2, f23060h) + 1 == current ? iP2 : iP2 - 1;
        }
        if (iP < 0) {
            return null;
        }
        return c(i(iP, f23059g), i(iP, f23060h) + 1);
    }

    public final void j(String text, TextLayoutResult layoutResult) {
        f(text);
        this.layoutResult = layoutResult;
    }

    private C2010d() {
    }
}
