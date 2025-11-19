package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: FocusProperties.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR$\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR$\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR$\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR$\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR$\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rRB\u0010,\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$8W@WX\u0097\u000e¢\u0006\u0012\u0012\u0004\b*\u0010+\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)RB\u00100\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$8W@WX\u0097\u000e¢\u0006\u0012\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010'\"\u0004\b.\u0010)ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00061À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/g;", "", "", "q", "()Z", "y", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/k;", "<anonymous parameter 0>", "o", "()Landroidx/compose/ui/focus/k;", "setNext", "(Landroidx/compose/ui/focus/k;)V", "next", "s", "setPrevious", "previous", "t", "setUp", "up", "x", "setDown", "down", "n", "setLeft", "left", "p", "setRight", "right", "c", "setStart", "start", "v", "setEnd", "end", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/b;", "z", "()LBa/l;", "r", "(LBa/l;)V", "getEnter$annotations", "()V", "enter", "u", "w", "getExit$annotations", "exit", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface g {

    /* compiled from: FocusProperties.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/b;", "it", "Landroidx/compose/ui/focus/k;", "a", "(I)Landroidx/compose/ui/focus/k;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<androidx.compose.ui.focus.b, k> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f22746B = new a();

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
        public static final b f22747B = new b();

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

    default k c() {
        return k.INSTANCE.b();
    }

    default k n() {
        return k.INSTANCE.b();
    }

    default k o() {
        return k.INSTANCE.b();
    }

    default k p() {
        return k.INSTANCE.b();
    }

    boolean q();

    default k s() {
        return k.INSTANCE.b();
    }

    default k t() {
        return k.INSTANCE.b();
    }

    default Ba.l<androidx.compose.ui.focus.b, k> u() {
        return b.f22747B;
    }

    default k v() {
        return k.INSTANCE.b();
    }

    default k x() {
        return k.INSTANCE.b();
    }

    void y(boolean z10);

    default Ba.l<androidx.compose.ui.focus.b, k> z() {
        return a.f22746B;
    }

    default void r(Ba.l<? super androidx.compose.ui.focus.b, k> lVar) {
    }

    default void w(Ba.l<? super androidx.compose.ui.focus.b, k> lVar) {
    }
}
