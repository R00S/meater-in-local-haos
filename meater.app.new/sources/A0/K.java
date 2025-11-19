package A0;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import x0.C5047a;

/* compiled from: LayoutNode.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"LA0/G;", "LA0/m0;", "b", "(LA0/G;)LA0/m0;", "LU0/d;", "a", "LU0/d;", "DefaultDensity", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private static final U0.d f352a = U0.f.b(1.0f, 0.0f, 2, null);

    public static final m0 b(G g10) {
        m0 owner = g10.getOwner();
        if (owner != null) {
            return owner;
        }
        C5047a.c("LayoutNode should be attached to an owner");
        throw new KotlinNothingValueException();
    }
}
