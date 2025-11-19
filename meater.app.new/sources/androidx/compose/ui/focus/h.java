package androidx.compose.ui.focus;

import androidx.compose.ui.focus.k;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: FocusProperties.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\"\u0010\u001f\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\"\u0010#\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\"\u0010'\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010\u000e\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012R\"\u0010*\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b)\u0010\u0012R\"\u0010.\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010\u000e\u001a\u0004\b,\u0010\u0010\"\u0004\b-\u0010\u0012R4\u00108\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\f0/8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b1\u00102\u0012\u0004\b7\u0010\u0003\u001a\u0004\b3\u00104\"\u0004\b5\u00106R4\u0010=\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\f0/8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b9\u00102\u0012\u0004\b<\u0010\u0003\u001a\u0004\b:\u00104\"\u0004\b;\u00106¨\u0006>"}, d2 = {"Landroidx/compose/ui/focus/h;", "Landroidx/compose/ui/focus/g;", "<init>", "()V", "", "a", "Z", "q", "()Z", "y", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/k;", "b", "Landroidx/compose/ui/focus/k;", "o", "()Landroidx/compose/ui/focus/k;", "setNext", "(Landroidx/compose/ui/focus/k;)V", "next", "c", "s", "setPrevious", "previous", "d", "t", "setUp", "up", "e", "x", "setDown", "down", "f", "n", "setLeft", "left", "g", "p", "setRight", "right", "h", "setStart", "start", "i", "v", "setEnd", "end", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/b;", "j", "LBa/l;", "z", "()LBa/l;", "r", "(LBa/l;)V", "getEnter$annotations", "enter", "k", "u", "w", "getExit$annotations", "exit", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean canFocus = true;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private k next;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private k previous;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private k up;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private k down;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private k left;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private k right;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private k start;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private k end;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super androidx.compose.ui.focus.b, k> enter;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super androidx.compose.ui.focus.b, k> exit;

    /* compiled from: FocusProperties.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/b;", "it", "Landroidx/compose/ui/focus/k;", "a", "(I)Landroidx/compose/ui/focus/k;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<androidx.compose.ui.focus.b, k> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f22759B = new a();

        a() {
            super(1);
        }

        public final k a(int i10) {
            return k.INSTANCE.b();
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ k invoke(androidx.compose.ui.focus.b bVar) {
            return a(bVar.getValue());
        }
    }

    /* compiled from: FocusProperties.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/b;", "it", "Landroidx/compose/ui/focus/k;", "a", "(I)Landroidx/compose/ui/focus/k;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<androidx.compose.ui.focus.b, k> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f22760B = new b();

        b() {
            super(1);
        }

        public final k a(int i10) {
            return k.INSTANCE.b();
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ k invoke(androidx.compose.ui.focus.b bVar) {
            return a(bVar.getValue());
        }
    }

    public h() {
        k.Companion companion = k.INSTANCE;
        this.next = companion.b();
        this.previous = companion.b();
        this.up = companion.b();
        this.down = companion.b();
        this.left = companion.b();
        this.right = companion.b();
        this.start = companion.b();
        this.end = companion.b();
        this.enter = a.f22759B;
        this.exit = b.f22760B;
    }

    @Override // androidx.compose.ui.focus.g
    /* renamed from: c, reason: from getter */
    public k getStart() {
        return this.start;
    }

    @Override // androidx.compose.ui.focus.g
    /* renamed from: n, reason: from getter */
    public k getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.focus.g
    /* renamed from: o, reason: from getter */
    public k getNext() {
        return this.next;
    }

    @Override // androidx.compose.ui.focus.g
    /* renamed from: p, reason: from getter */
    public k getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.focus.g
    /* renamed from: q, reason: from getter */
    public boolean getCanFocus() {
        return this.canFocus;
    }

    @Override // androidx.compose.ui.focus.g
    public void r(Ba.l<? super androidx.compose.ui.focus.b, k> lVar) {
        this.enter = lVar;
    }

    @Override // androidx.compose.ui.focus.g
    /* renamed from: s, reason: from getter */
    public k getPrevious() {
        return this.previous;
    }

    @Override // androidx.compose.ui.focus.g
    /* renamed from: t, reason: from getter */
    public k getUp() {
        return this.up;
    }

    @Override // androidx.compose.ui.focus.g
    public Ba.l<androidx.compose.ui.focus.b, k> u() {
        return this.exit;
    }

    @Override // androidx.compose.ui.focus.g
    /* renamed from: v, reason: from getter */
    public k getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.focus.g
    public void w(Ba.l<? super androidx.compose.ui.focus.b, k> lVar) {
        this.exit = lVar;
    }

    @Override // androidx.compose.ui.focus.g
    /* renamed from: x, reason: from getter */
    public k getDown() {
        return this.down;
    }

    @Override // androidx.compose.ui.focus.g
    public void y(boolean z10) {
        this.canFocus = z10;
    }

    @Override // androidx.compose.ui.focus.g
    public Ba.l<androidx.compose.ui.focus.b, k> z() {
        return this.enter;
    }
}
