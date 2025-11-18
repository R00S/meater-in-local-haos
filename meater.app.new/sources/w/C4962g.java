package w;

import A0.C0833l;
import A0.InterfaceC0831j;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import s0.C4418c;
import s0.C4419d;

/* compiled from: Clickable.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u000b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0018\u0010\u000f\u001a\u00020\u0001*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\u0001*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\"\u0018\u0010\u0013\u001a\u00020\u0001*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0014"}, d2 = {"LA0/j;", "", "c", "(LA0/j;)Z", "Landroid/view/View;", "e", "(Landroid/view/View;)Z", "", "a", "J", "()J", "TapIndicationDelay", "Ls0/b;", "f", "(Landroid/view/KeyEvent;)Z", "isPress", "b", "isClick", "d", "isEnter", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: w.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4962g {

    /* renamed from: a, reason: collision with root package name */
    private static final long f51713a = ViewConfiguration.getTapTimeout();

    public static final long a() {
        return f51713a;
    }

    public static final boolean b(KeyEvent keyEvent) {
        return C4418c.e(C4419d.b(keyEvent), C4418c.INSTANCE.b()) && d(keyEvent);
    }

    public static final boolean c(InterfaceC0831j interfaceC0831j) {
        return e(C0833l.a(interfaceC0831j));
    }

    private static final boolean d(KeyEvent keyEvent) {
        int iB = s0.f.b(C4419d.a(keyEvent));
        return iB == 23 || iB == 66 || iB == 160;
    }

    private static final boolean e(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final boolean f(KeyEvent keyEvent) {
        return C4418c.e(C4419d.b(keyEvent), C4418c.INSTANCE.a()) && d(keyEvent);
    }
}
