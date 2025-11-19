package G;

import H0.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import y0.InterfaceC5116v;

/* compiled from: SelectionController.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0010\u0018\u0000 \u00112\u00020\u0001:\u0001\nB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LG/i;", "", "Ly0/v;", "layoutCoordinates", "LH0/F;", "textLayoutResult", "<init>", "(Ly0/v;LH0/F;)V", "b", "(Ly0/v;LH0/F;)LG/i;", "a", "Ly0/v;", "d", "()Ly0/v;", "LH0/F;", "e", "()LH0/F;", "c", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class i {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f4822d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final i f4823e = new i(null, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5116v layoutCoordinates;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextLayoutResult textLayoutResult;

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LG/i$a;", "", "<init>", "()V", "LG/i;", "Empty", "LG/i;", "a", "()LG/i;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: G.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final i a() {
            return i.f4823e;
        }

        private Companion() {
        }
    }

    public i(InterfaceC5116v interfaceC5116v, TextLayoutResult textLayoutResult) {
        this.layoutCoordinates = interfaceC5116v;
        this.textLayoutResult = textLayoutResult;
    }

    public static /* synthetic */ i c(i iVar, InterfaceC5116v interfaceC5116v, TextLayoutResult textLayoutResult, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i10 & 1) != 0) {
            interfaceC5116v = iVar.layoutCoordinates;
        }
        if ((i10 & 2) != 0) {
            textLayoutResult = iVar.textLayoutResult;
        }
        return iVar.b(interfaceC5116v, textLayoutResult);
    }

    public final i b(InterfaceC5116v layoutCoordinates, TextLayoutResult textLayoutResult) {
        return new i(layoutCoordinates, textLayoutResult);
    }

    /* renamed from: d, reason: from getter */
    public final InterfaceC5116v getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    /* renamed from: e, reason: from getter */
    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }
}
