package M0;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4156a;
import oa.InterfaceC4164i;
import s1.O;

/* compiled from: InputMethodManager.android.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LM0/t;", "LM0/s;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "a", "()Z", "Landroid/view/inputmethod/CursorAnchorInfo;", "cursorAnchorInfo", "Loa/F;", "b", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", "Loa/i;", "d", "()Landroid/view/inputmethod/InputMethodManager;", "imm", "Ls1/O;", "c", "Ls1/O;", "softwareKeyboardControllerCompat", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC4156a
/* loaded from: classes.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i imm = C4165j.b(EnumC4168m.f46628D, new a());

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final O softwareKeyboardControllerCompat;

    /* compiled from: InputMethodManager.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/InputMethodManager;", "a", "()Landroid/view/inputmethod/InputMethodManager;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<InputMethodManager> {
        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = t.this.view.getContext().getSystemService("input_method");
            C3862t.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public t(View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new O(view);
    }

    private final InputMethodManager d() {
        return (InputMethodManager) this.imm.getValue();
    }

    @Override // M0.s
    public boolean a() {
        return d().isActive(this.view);
    }

    @Override // M0.s
    public void b(CursorAnchorInfo cursorAnchorInfo) {
        d().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }
}
