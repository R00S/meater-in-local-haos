package F0;

import H0.C1060d;
import H0.TextLayoutResult;
import h0.C3476g;
import java.util.List;
import kotlin.Metadata;
import ta.InterfaceC4588d;

/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R5\u0010\u000e\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR)\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR)\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\rR5\u0010\u001a\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u00160\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR9\u0010\u001f\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00160\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\rR/\u0010#\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\b\"\u0010\rR2\u0010'\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u000b\u001a\u0004\b&\u0010\rR/\u0010)\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b(\u0010\rR;\u0010,\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0*0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b+\u0010\rR/\u0010/\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u000b\u001a\u0004\b.\u0010\rR/\u00101\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b0\u0010\rR/\u00104\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u000b\u001a\u0004\b3\u0010\rR)\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u000b\u001a\u0004\b6\u0010\rR/\u0010:\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\u000b\u001a\u0004\b9\u0010\rR)\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u000b\u001a\u0004\b-\u0010\rR2\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010\u000b\u0012\u0004\b?\u0010\u0003\u001a\u0004\b>\u0010\rR)\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u000b\u001a\u0004\b\u0010\u0010\rR)\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u0018\u0010\rR)\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b=\u0010\rR)\u0010E\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b!\u0010\rR)\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u000b\u001a\u0004\b\n\u0010\rR)\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u000b\u001a\u0004\b\u001d\u0010\rR)\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u000b\u001a\u0004\bA\u0010\rR#\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0I0\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\u000b\u001a\u0004\b\u0013\u0010\rR)\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u000b\u001a\u0004\b;\u0010\rR)\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bM\u0010\u000b\u001a\u0004\b5\u0010\rR)\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bO\u0010\u000b\u001a\u0004\b2\u0010\rR)\u0010R\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010\u000b\u001a\u0004\b8\u0010\rR5\u0010T\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\bS\u0010\u000b\u001a\u0004\b%\u0010\r¨\u0006U"}, d2 = {"LF0/k;", "", "<init>", "()V", "LF0/w;", "LF0/a;", "Lkotlin/Function1;", "", "LH0/F;", "", "b", "LF0/w;", "i", "()LF0/w;", "GetTextLayoutResult", "Lkotlin/Function0;", "c", "j", "OnClick", "d", "l", "OnLongClick", "Lkotlin/Function2;", "", "e", "s", "ScrollBy", "Lh0/g;", "Lta/d;", "f", "t", "ScrollByOffset", "", "g", "u", "ScrollToIndex", "LH0/d;", "h", "getOnAutofillText$ui_release", "OnAutofillText", "v", "SetProgress", "Lkotlin/Function3;", "w", "SetSelection", "k", "x", "SetText", "y", "SetTextSubstitution", "m", "z", "ShowTextSubstitution", "n", "a", "ClearTextSubstitution", "o", "getInsertTextAtCursor", "InsertTextAtCursor", "p", "OnImeAction", "q", "getPerformImeAction", "getPerformImeAction$annotations", "PerformImeAction", "r", "CopyText", "CutText", "PasteText", "Expand", "Collapse", "Dismiss", "RequestFocus", "", "LF0/e;", "CustomActions", "PageUp", "A", "PageLeft", "B", "PageDown", "C", "PageRight", "D", "GetScrollViewportLength", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.a<Boolean>>> PageLeft;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.a<Boolean>>> PageDown;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.a<Boolean>>> PageRight;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.l<List<Float>, Boolean>>> GetScrollViewportLength;

    /* renamed from: E, reason: collision with root package name */
    public static final int f4314E;

    /* renamed from: a, reason: collision with root package name */
    public static final k f4315a = new k();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.l<List<TextLayoutResult>, Boolean>>> GetTextLayoutResult;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.a<Boolean>>> OnClick;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.a<Boolean>>> OnLongClick;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.p<Float, Float, Boolean>>> ScrollBy;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final w<Ba.p<C3476g, InterfaceC4588d<? super C3476g>, Object>> ScrollByOffset;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.l<Integer, Boolean>>> ScrollToIndex;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.l<C1060d, Boolean>>> OnAutofillText;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.l<Float, Boolean>>> SetProgress;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.q<Integer, Integer, Boolean, Boolean>>> SetSelection;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.l<C1060d, Boolean>>> SetText;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.l<C1060d, Boolean>>> SetTextSubstitution;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.l<Boolean, Boolean>>> ShowTextSubstitution;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.a<Boolean>>> ClearTextSubstitution;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.l<C1060d, Boolean>>> InsertTextAtCursor;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.a<Boolean>>> OnImeAction;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.a<Boolean>>> PerformImeAction;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.a<Boolean>>> CopyText;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.a<Boolean>>> CutText;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.a<Boolean>>> PasteText;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.a<Boolean>>> Expand;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.a<Boolean>>> Collapse;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.a<Boolean>>> Dismiss;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.a<Boolean>>> RequestFocus;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final w<List<CustomAccessibilityAction>> CustomActions;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final w<AccessibilityAction<Ba.a<Boolean>>> PageUp;

    static {
        u uVar = u.f4413B;
        GetTextLayoutResult = v.b("GetTextLayoutResult", uVar);
        OnClick = v.b("OnClick", uVar);
        OnLongClick = v.b("OnLongClick", uVar);
        ScrollBy = v.b("ScrollBy", uVar);
        ScrollByOffset = new w<>("ScrollByOffset", null, 2, null);
        ScrollToIndex = v.b("ScrollToIndex", uVar);
        OnAutofillText = v.b("OnAutofillText", uVar);
        SetProgress = v.b("SetProgress", uVar);
        SetSelection = v.b("SetSelection", uVar);
        SetText = v.b("SetText", uVar);
        SetTextSubstitution = v.b("SetTextSubstitution", uVar);
        ShowTextSubstitution = v.b("ShowTextSubstitution", uVar);
        ClearTextSubstitution = v.b("ClearTextSubstitution", uVar);
        InsertTextAtCursor = v.b("InsertTextAtCursor", uVar);
        OnImeAction = v.b("PerformImeAction", uVar);
        PerformImeAction = v.b("PerformImeAction", uVar);
        CopyText = v.b("CopyText", uVar);
        CutText = v.b("CutText", uVar);
        PasteText = v.b("PasteText", uVar);
        Expand = v.b("Expand", uVar);
        Collapse = v.b("Collapse", uVar);
        Dismiss = v.b("Dismiss", uVar);
        RequestFocus = v.b("RequestFocus", uVar);
        CustomActions = v.a("CustomActions");
        PageUp = v.b("PageUp", uVar);
        PageLeft = v.b("PageLeft", uVar);
        PageDown = v.b("PageDown", uVar);
        PageRight = v.b("PageRight", uVar);
        GetScrollViewportLength = v.b("GetScrollViewportLength", uVar);
        f4314E = 8;
    }

    private k() {
    }

    public final w<AccessibilityAction<Ba.a<Boolean>>> a() {
        return ClearTextSubstitution;
    }

    public final w<AccessibilityAction<Ba.a<Boolean>>> b() {
        return Collapse;
    }

    public final w<AccessibilityAction<Ba.a<Boolean>>> c() {
        return CopyText;
    }

    public final w<List<CustomAccessibilityAction>> d() {
        return CustomActions;
    }

    public final w<AccessibilityAction<Ba.a<Boolean>>> e() {
        return CutText;
    }

    public final w<AccessibilityAction<Ba.a<Boolean>>> f() {
        return Dismiss;
    }

    public final w<AccessibilityAction<Ba.a<Boolean>>> g() {
        return Expand;
    }

    public final w<AccessibilityAction<Ba.l<List<Float>, Boolean>>> h() {
        return GetScrollViewportLength;
    }

    public final w<AccessibilityAction<Ba.l<List<TextLayoutResult>, Boolean>>> i() {
        return GetTextLayoutResult;
    }

    public final w<AccessibilityAction<Ba.a<Boolean>>> j() {
        return OnClick;
    }

    public final w<AccessibilityAction<Ba.a<Boolean>>> k() {
        return OnImeAction;
    }

    public final w<AccessibilityAction<Ba.a<Boolean>>> l() {
        return OnLongClick;
    }

    public final w<AccessibilityAction<Ba.a<Boolean>>> m() {
        return PageDown;
    }

    public final w<AccessibilityAction<Ba.a<Boolean>>> n() {
        return PageLeft;
    }

    public final w<AccessibilityAction<Ba.a<Boolean>>> o() {
        return PageRight;
    }

    public final w<AccessibilityAction<Ba.a<Boolean>>> p() {
        return PageUp;
    }

    public final w<AccessibilityAction<Ba.a<Boolean>>> q() {
        return PasteText;
    }

    public final w<AccessibilityAction<Ba.a<Boolean>>> r() {
        return RequestFocus;
    }

    public final w<AccessibilityAction<Ba.p<Float, Float, Boolean>>> s() {
        return ScrollBy;
    }

    public final w<Ba.p<C3476g, InterfaceC4588d<? super C3476g>, Object>> t() {
        return ScrollByOffset;
    }

    public final w<AccessibilityAction<Ba.l<Integer, Boolean>>> u() {
        return ScrollToIndex;
    }

    public final w<AccessibilityAction<Ba.l<Float, Boolean>>> v() {
        return SetProgress;
    }

    public final w<AccessibilityAction<Ba.q<Integer, Integer, Boolean, Boolean>>> w() {
        return SetSelection;
    }

    public final w<AccessibilityAction<Ba.l<C1060d, Boolean>>> x() {
        return SetText;
    }

    public final w<AccessibilityAction<Ba.l<C1060d, Boolean>>> y() {
        return SetTextSubstitution;
    }

    public final w<AccessibilityAction<Ba.l<Boolean, Boolean>>> z() {
        return ShowTextSubstitution;
    }
}
