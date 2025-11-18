package androidx.compose.ui.platform;

import H0.TextLayoutResult;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: AccessibilityIterators.android.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/e;", "Landroidx/compose/ui/platform/b;", "<init>", "()V", "", "lineNumber", "LR0/h;", "direction", "i", "(ILR0/h;)I", "", "text", "LH0/F;", "layoutResult", "LF0/p;", "node", "Loa/F;", "j", "(Ljava/lang/String;LH0/F;LF0/p;)V", "current", "", "a", "(I)[I", "b", "c", "LH0/F;", "d", "LF0/p;", "Landroid/graphics/Rect;", "e", "Landroid/graphics/Rect;", "tempRect", "f", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2012e extends AbstractC2006b {

    /* renamed from: h, reason: collision with root package name */
    private static C2012e f23068h;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult layoutResult;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private F0.p node;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Rect tempRect;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f23067g = 8;

    /* renamed from: i, reason: collision with root package name */
    private static final R0.h f23069i = R0.h.Rtl;

    /* renamed from: j, reason: collision with root package name */
    private static final R0.h f23070j = R0.h.Ltr;

    /* compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/e$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/e;", "a", "()Landroidx/compose/ui/platform/e;", "LR0/h;", "DirectionEnd", "LR0/h;", "DirectionStart", "pageInstance", "Landroidx/compose/ui/platform/e;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final C2012e a() {
            if (C2012e.f23068h == null) {
                C2012e.f23068h = new C2012e(null);
            }
            C2012e c2012e = C2012e.f23068h;
            C3862t.e(c2012e, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return c2012e;
        }

        private Companion() {
        }
    }

    public /* synthetic */ C2012e(C3854k c3854k) {
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
        int iM;
        TextLayoutResult textLayoutResult = null;
        if (d().length() <= 0 || current >= d().length()) {
            return null;
        }
        try {
            F0.p pVar = this.node;
            if (pVar == null) {
                C3862t.u("node");
                pVar = null;
            }
            int iRound = Math.round(pVar.i().e());
            int iD = Ha.g.d(0, current);
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                C3862t.u("layoutResult");
                textLayoutResult2 = null;
            }
            int iP = textLayoutResult2.p(iD);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                C3862t.u("layoutResult");
                textLayoutResult3 = null;
            }
            float fU = textLayoutResult3.u(iP) + iRound;
            TextLayoutResult textLayoutResult4 = this.layoutResult;
            if (textLayoutResult4 == null) {
                C3862t.u("layoutResult");
                textLayoutResult4 = null;
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                C3862t.u("layoutResult");
                textLayoutResult5 = null;
            }
            if (fU < textLayoutResult4.u(textLayoutResult5.m() - 1)) {
                TextLayoutResult textLayoutResult6 = this.layoutResult;
                if (textLayoutResult6 == null) {
                    C3862t.u("layoutResult");
                } else {
                    textLayoutResult = textLayoutResult6;
                }
                iM = textLayoutResult.q(fU);
            } else {
                TextLayoutResult textLayoutResult7 = this.layoutResult;
                if (textLayoutResult7 == null) {
                    C3862t.u("layoutResult");
                } else {
                    textLayoutResult = textLayoutResult7;
                }
                iM = textLayoutResult.m();
            }
            return c(iD, i(iM - 1, f23070j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC2016g
    public int[] b(int current) {
        int iQ;
        TextLayoutResult textLayoutResult = null;
        if (d().length() <= 0 || current <= 0) {
            return null;
        }
        try {
            F0.p pVar = this.node;
            if (pVar == null) {
                C3862t.u("node");
                pVar = null;
            }
            int iRound = Math.round(pVar.i().e());
            int iG = Ha.g.g(d().length(), current);
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                C3862t.u("layoutResult");
                textLayoutResult2 = null;
            }
            int iP = textLayoutResult2.p(iG);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                C3862t.u("layoutResult");
                textLayoutResult3 = null;
            }
            float fU = textLayoutResult3.u(iP) - iRound;
            if (fU > 0.0f) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    C3862t.u("layoutResult");
                } else {
                    textLayoutResult = textLayoutResult4;
                }
                iQ = textLayoutResult.q(fU);
            } else {
                iQ = 0;
            }
            if (iG == d().length() && iQ < iP) {
                iQ++;
            }
            return c(i(iQ, f23069i), iG);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void j(String text, TextLayoutResult layoutResult, F0.p node) {
        f(text);
        this.layoutResult = layoutResult;
        this.node = node;
    }

    private C2012e() {
        this.tempRect = new Rect();
    }
}
