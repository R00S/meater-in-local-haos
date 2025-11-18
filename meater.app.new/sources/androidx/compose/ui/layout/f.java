package androidx.compose.ui.layout;

import A0.A;
import Ba.l;
import U0.r;
import U0.s;
import b0.i;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: OnRemeasuredModifier.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/layout/f;", "Lb0/i$c;", "LA0/A;", "Lkotlin/Function1;", "LU0/r;", "Loa/F;", "onSizeChanged", "<init>", "(LBa/l;)V", "j2", "size", "q", "(J)V", "O", "LBa/l;", "", "P", "Z", "O1", "()Z", "shouldAutoInvalidate", "Q", "J", "previousSize", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class f extends i.c implements A {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private l<? super r, C4153F> onSizeChanged;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate = true;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private long previousSize = s.a(Integer.MIN_VALUE, Integer.MIN_VALUE);

    public f(l<? super r, C4153F> lVar) {
        this.onSizeChanged = lVar;
    }

    @Override // b0.i.c
    /* renamed from: O1, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final void j2(l<? super r, C4153F> onSizeChanged) {
        this.onSizeChanged = onSizeChanged;
        this.previousSize = s.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // A0.A
    public void q(long size) {
        if (r.e(this.previousSize, size)) {
            return;
        }
        this.onSizeChanged.invoke(r.b(size));
        this.previousSize = size;
    }
}
