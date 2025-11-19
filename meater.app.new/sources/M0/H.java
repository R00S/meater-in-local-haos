package M0;

import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4156a;
import oa.InterfaceC4164i;
import u0.InterfaceC4628N;

/* compiled from: TextInputServiceAndroid.android.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR(\u0010'\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0004\u0012\u00020$0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020$0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010&R$\u00100\u001a\u00020*2\u0006\u0010+\u001a\u00020*8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00102R\"\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020605048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b,\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, d2 = {"LM0/H;", "LM0/z;", "Landroid/view/View;", "view", "Lu0/N;", "rootPositionCalculator", "LM0/s;", "inputMethodManager", "Ljava/util/concurrent/Executor;", "inputCommandProcessorExecutor", "<init>", "(Landroid/view/View;Lu0/N;LM0/s;Ljava/util/concurrent/Executor;)V", "positionCalculator", "(Landroid/view/View;Lu0/N;)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "f", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "", "i", "()Z", "a", "Landroid/view/View;", "h", "()Landroid/view/View;", "b", "LM0/s;", "c", "Ljava/util/concurrent/Executor;", "d", "Z", "editorHasFocus", "Lkotlin/Function1;", "", "LM0/n;", "Loa/F;", "e", "LBa/l;", "onEditCommand", "LM0/p;", "onImeActionPerformed", "LM0/E;", "<set-?>", "g", "LM0/E;", "getState$ui_release", "()LM0/E;", "state", "LM0/q;", "LM0/q;", "imeOptions", "", "Ljava/lang/ref/WeakReference;", "LM0/A;", "Ljava/util/List;", "ics", "Landroid/view/inputmethod/BaseInputConnection;", "j", "Loa/i;", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "LM0/k;", "k", "LM0/k;", "cursorAnchorInfoController", "LQ/b;", "LM0/H$a;", "l", "LQ/b;", "textInputCommandQueue", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC4156a
/* loaded from: classes.dex */
public final class H implements z {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s inputMethodManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Executor inputCommandProcessorExecutor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean editorHasFocus;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super List<? extends n>, C4153F> onEditCommand;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super p, C4153F> onImeActionPerformed;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue state;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ImeOptions imeOptions;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private List<WeakReference<A>> ics;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i baseInputConnection;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final C1476k cursorAnchorInfoController;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Q.b<a> textInputCommandQueue;

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LM0/H$a;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "E", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/BaseInputConnection;", "a", "()Landroid/view/inputmethod/BaseInputConnection;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.a<BaseInputConnection> {
        b() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(H.this.getView(), false);
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"M0/H$c", "LM0/r;", "", "LM0/n;", "editCommands", "Loa/F;", "d", "(Ljava/util/List;)V", "LM0/p;", "imeAction", "c", "(I)V", "Landroid/view/KeyEvent;", "event", "a", "(Landroid/view/KeyEvent;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "LM0/A;", "inputConnection", "e", "(LM0/A;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements r {
        c() {
        }

        @Override // M0.r
        public void a(KeyEvent event) {
            H.this.g().sendKeyEvent(event);
        }

        @Override // M0.r
        public void b(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
            H.this.cursorAnchorInfoController.a(immediate, monitor, includeInsertionMarker, includeCharacterBounds, includeEditorBounds, includeLineBounds);
        }

        @Override // M0.r
        public void c(int imeAction) {
            H.this.onImeActionPerformed.invoke(p.i(imeAction));
        }

        @Override // M0.r
        public void d(List<? extends n> editCommands) {
            H.this.onEditCommand.invoke(editCommands);
        }

        @Override // M0.r
        public void e(A inputConnection) {
            int size = H.this.ics.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (C3862t.b(((WeakReference) H.this.ics.get(i10)).get(), inputConnection)) {
                    H.this.ics.remove(i10);
                    return;
                }
            }
        }
    }

    public H(View view, InterfaceC4628N interfaceC4628N, s sVar, Executor executor) {
        this.view = view;
        this.inputMethodManager = sVar;
        this.inputCommandProcessorExecutor = executor;
        this.onEditCommand = d.f11897B;
        this.onImeActionPerformed = e.f11898B;
        this.state = new TextFieldValue("", H0.H.INSTANCE.a(), (H0.H) null, 4, (C3854k) null);
        this.imeOptions = ImeOptions.INSTANCE.a();
        this.ics = new ArrayList();
        this.baseInputConnection = C4165j.b(EnumC4168m.f46628D, new b());
        this.cursorAnchorInfoController = new C1476k(interfaceC4628N, sVar);
        this.textInputCommandQueue = new Q.b<>(new a[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection g() {
        return (BaseInputConnection) this.baseInputConnection.getValue();
    }

    public final InputConnection f(EditorInfo outAttrs) {
        if (!this.editorHasFocus) {
            return null;
        }
        K.h(outAttrs, this.imeOptions, this.state);
        K.i(outAttrs);
        A a10 = new A(this.state, new c(), this.imeOptions.getAutoCorrect());
        this.ics.add(new WeakReference<>(a10));
        return a10;
    }

    /* renamed from: h, reason: from getter */
    public final View getView() {
        return this.view;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getEditorHasFocus() {
        return this.editorHasFocus;
    }

    public /* synthetic */ H(View view, InterfaceC4628N interfaceC4628N, s sVar, Executor executor, int i10, C3854k c3854k) {
        this(view, interfaceC4628N, sVar, (i10 & 8) != 0 ? K.d(Choreographer.getInstance()) : executor);
    }

    public H(View view, InterfaceC4628N interfaceC4628N) {
        this(view, interfaceC4628N, new t(view), null, 8, null);
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LM0/n;", "it", "Loa/F;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.l<List<? extends n>, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f11897B = new d();

        d() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(List<? extends n> list) {
            a(list);
            return C4153F.f46609a;
        }

        public final void a(List<? extends n> list) {
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LM0/p;", "it", "Loa/F;", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements Ba.l<p, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f11898B = new e();

        e() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(p pVar) {
            a(pVar.getValue());
            return C4153F.f46609a;
        }

        public final void a(int i10) {
        }
    }
}
