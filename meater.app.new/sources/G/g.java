package G;

import F.o;
import H.Selection;
import H0.TextLayoutResult;
import kotlin.Metadata;
import kotlin.R0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import u0.C4656v;
import y0.InterfaceC5116v;

/* compiled from: SelectionController.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"LG/g;", "LO/R0;", "", "selectableId", "LH/i;", "selectionRegistrar", "Li0/t0;", "backgroundSelectionColor", "LG/i;", "params", "<init>", "(JLH/i;JLG/i;Lkotlin/jvm/internal/k;)V", "Loa/F;", "d", "()V", "c", "b", "LH0/F;", "textLayoutResult", "h", "(LH0/F;)V", "Ly0/v;", "coordinates", "g", "(Ly0/v;)V", "Lk0/f;", "drawScope", "e", "(Lk0/f;)V", "B", "J", "C", "LH/i;", "D", "E", "LG/i;", "LH/d;", "F", "LH/d;", "selectable", "Lb0/i;", "G", "Lb0/i;", "f", "()Lb0/i;", "modifier", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g implements R0 {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final long selectableId;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final H.i selectionRegistrar;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final long backgroundSelectionColor;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private i params;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private H.d selectable;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final b0.i modifier;

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ly0/v;", "a", "()Ly0/v;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<InterfaceC5116v> {
        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC5116v invoke() {
            return g.this.params.getLayoutCoordinates();
        }
    }

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ly0/v;", "a", "()Ly0/v;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.a<InterfaceC5116v> {
        b() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC5116v invoke() {
            return g.this.params.getLayoutCoordinates();
        }
    }

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LH0/F;", "a", "()LH0/F;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.a<TextLayoutResult> {
        c() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextLayoutResult invoke() {
            return g.this.params.getTextLayoutResult();
        }
    }

    public /* synthetic */ g(long j10, H.i iVar, long j11, i iVar2, C3854k c3854k) {
        this(j10, iVar, j11, iVar2);
    }

    @Override // kotlin.R0
    public void b() {
        H.d dVar = this.selectable;
        if (dVar != null) {
            this.selectionRegistrar.h(dVar);
            this.selectable = null;
        }
    }

    @Override // kotlin.R0
    public void c() {
        H.d dVar = this.selectable;
        if (dVar != null) {
            this.selectionRegistrar.h(dVar);
            this.selectable = null;
        }
    }

    @Override // kotlin.R0
    public void d() {
        this.selectable = this.selectionRegistrar.d(new H.c(this.selectableId, new b(), new c()));
    }

    public final void e(k0.f drawScope) {
        Selection selectionB = this.selectionRegistrar.g().b(this.selectableId);
        if (selectionB == null) {
            return;
        }
        if (selectionB.getHandlesCrossed()) {
            selectionB.a();
            throw null;
        }
        selectionB.c();
        throw null;
    }

    /* renamed from: f, reason: from getter */
    public final b0.i getModifier() {
        return this.modifier;
    }

    public final void g(InterfaceC5116v coordinates) {
        this.params = i.c(this.params, coordinates, null, 2, null);
        this.selectionRegistrar.i(this.selectableId);
    }

    public final void h(TextLayoutResult textLayoutResult) {
        TextLayoutResult textLayoutResult2 = this.params.getTextLayoutResult();
        if (textLayoutResult2 != null && !C3862t.b(textLayoutResult2.getLayoutInput().getText(), textLayoutResult.getLayoutInput().getText())) {
            this.selectionRegistrar.a(this.selectableId);
        }
        this.params = i.c(this.params, null, textLayoutResult, 1, null);
    }

    private g(long j10, H.i iVar, long j11, i iVar2) {
        this.selectableId = j10;
        this.selectionRegistrar = iVar;
        this.backgroundSelectionColor = j11;
        this.params = iVar2;
        this.modifier = C4656v.b(h.b(iVar, j10, new a()), o.a(), false, 2, null);
    }

    public /* synthetic */ g(long j10, H.i iVar, long j11, i iVar2, int i10, C3854k c3854k) {
        this(j10, iVar, j11, (i10 & 8) != 0 ? i.INSTANCE.a() : iVar2, null);
    }
}
