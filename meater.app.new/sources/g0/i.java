package g0;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusTargetNode;
import h0.C3478i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import w0.RotaryScrollEvent;

/* compiled from: FocusOwner.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ:\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH&ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H&ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000bH&¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020+H&¢\u0006\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006:À\u0006\u0001"}, d2 = {"Lg0/i;", "Lg0/f;", "Landroidx/compose/ui/focus/b;", "focusDirection", "Lh0/i;", "previouslyFocusedRect", "", "j", "(Landroidx/compose/ui/focus/b;Lh0/i;)Z", "focusedRect", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "g", "(ILh0/i;LBa/l;)Ljava/lang/Boolean;", "Loa/F;", "l", "()V", "force", "refreshFocusEvents", "clearOwnerFocus", "d", "(ZZZI)Z", "h", "()Lh0/i;", "Ls0/b;", "keyEvent", "Lkotlin/Function0;", "onFocusedItem", "m", "(Landroid/view/KeyEvent;LBa/a;)Z", "k", "(Landroid/view/KeyEvent;)Z", "Lw0/b;", "event", "i", "(Lw0/b;)Z", "node", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Lg0/c;", "o", "(Lg0/c;)V", "Lg0/j;", "n", "(Lg0/j;)V", "Lb0/i;", "b", "()Lb0/i;", "modifier", "Lg0/t;", "f", "()Lg0/t;", "focusTransactionManager", "Lg0/o;", "e", "()Lg0/o;", "rootState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface i extends f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FocusOwner.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends AbstractC3864v implements Ba.a<Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f41534B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean c(i iVar, KeyEvent keyEvent, Ba.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i10 & 2) != 0) {
            aVar = a.f41534B;
        }
        return iVar.m(keyEvent, aVar);
    }

    void a(FocusTargetNode node);

    b0.i b();

    boolean d(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection);

    o e();

    t f();

    Boolean g(int focusDirection, C3478i focusedRect, Ba.l<? super FocusTargetNode, Boolean> onFound);

    C3478i h();

    boolean i(RotaryScrollEvent event);

    boolean j(androidx.compose.ui.focus.b focusDirection, C3478i previouslyFocusedRect);

    boolean k(KeyEvent keyEvent);

    void l();

    boolean m(KeyEvent keyEvent, Ba.a<Boolean> onFocusedItem);

    void n(j node);

    void o(c node);
}
