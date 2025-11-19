package androidx.compose.ui.platform;

import F0.ScrollAxisRange;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SemanticsUtils.android.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/ui/platform/T0;", "LA0/n0;", "", "semanticsNodeId", "", "allScopes", "", "oldXValue", "oldYValue", "LF0/j;", "horizontalScrollAxisRange", "verticalScrollAxisRange", "<init>", "(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;LF0/j;LF0/j;)V", "B", "I", "d", "()I", "C", "Ljava/util/List;", "getAllScopes", "()Ljava/util/List;", "D", "Ljava/lang/Float;", "b", "()Ljava/lang/Float;", "g", "(Ljava/lang/Float;)V", "E", "c", "h", "F", "LF0/j;", "a", "()LF0/j;", "f", "(LF0/j;)V", "G", "e", "i", "", "b0", "()Z", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class T0 implements A0.n0 {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int semanticsNodeId;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final List<T0> allScopes;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Float oldXValue;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Float oldYValue;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private ScrollAxisRange horizontalScrollAxisRange;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private ScrollAxisRange verticalScrollAxisRange;

    public T0(int i10, List<T0> list, Float f10, Float f11, ScrollAxisRange scrollAxisRange, ScrollAxisRange scrollAxisRange2) {
        this.semanticsNodeId = i10;
        this.allScopes = list;
        this.oldXValue = f10;
        this.oldYValue = f11;
        this.horizontalScrollAxisRange = scrollAxisRange;
        this.verticalScrollAxisRange = scrollAxisRange2;
    }

    /* renamed from: a, reason: from getter */
    public final ScrollAxisRange getHorizontalScrollAxisRange() {
        return this.horizontalScrollAxisRange;
    }

    /* renamed from: b, reason: from getter */
    public final Float getOldXValue() {
        return this.oldXValue;
    }

    @Override // A0.n0
    public boolean b0() {
        return this.allScopes.contains(this);
    }

    /* renamed from: c, reason: from getter */
    public final Float getOldYValue() {
        return this.oldYValue;
    }

    /* renamed from: d, reason: from getter */
    public final int getSemanticsNodeId() {
        return this.semanticsNodeId;
    }

    /* renamed from: e, reason: from getter */
    public final ScrollAxisRange getVerticalScrollAxisRange() {
        return this.verticalScrollAxisRange;
    }

    public final void f(ScrollAxisRange scrollAxisRange) {
        this.horizontalScrollAxisRange = scrollAxisRange;
    }

    public final void g(Float f10) {
        this.oldXValue = f10;
    }

    public final void h(Float f10) {
        this.oldYValue = f10;
    }

    public final void i(ScrollAxisRange scrollAxisRange) {
        this.verticalScrollAxisRange = scrollAxisRange;
    }
}
