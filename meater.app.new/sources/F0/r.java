package F0;

import A0.G;
import kotlin.Metadata;

/* compiled from: SemanticsOwner.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"LF0/r;", "", "LA0/G;", "rootNode", "LF0/f;", "outerSemanticsNode", "<init>", "(LA0/G;LF0/f;)V", "a", "LA0/G;", "b", "LF0/f;", "LF0/p;", "()LF0/p;", "unmergedRootSemanticsNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final G rootNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f outerSemanticsNode;

    public r(G g10, f fVar) {
        this.rootNode = g10;
        this.outerSemanticsNode = fVar;
    }

    public final p a() {
        return new p(this.outerSemanticsNode, false, this.rootNode, new l());
    }
}
