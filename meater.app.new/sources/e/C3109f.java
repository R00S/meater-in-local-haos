package e;

import f1.C3310c;
import g.AbstractC3371c;
import h.AbstractC3466a;
import kotlin.Metadata;
import kotlin.x1;
import oa.InterfaceC4156a;

/* compiled from: ActivityResultRegistry.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B1\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00028\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Le/f;", "I", "O", "Lg/c;", "Le/a;", "launcher", "LO/x1;", "Lh/a;", "currentContract", "<init>", "(Le/a;LO/x1;)V", "Loa/F;", "c", "()V", "input", "Lf1/c;", "options", "b", "(Ljava/lang/Object;Lf1/c;)V", "a", "Le/a;", "LO/x1;", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: e.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3109f<I, O> extends AbstractC3371c<I> {

    /* renamed from: c, reason: collision with root package name */
    public static final int f39940c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C3104a<I> launcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x1<AbstractC3466a<I, O>> currentContract;

    /* JADX WARN: Multi-variable type inference failed */
    public C3109f(C3104a<I> c3104a, x1<? extends AbstractC3466a<I, O>> x1Var) {
        this.launcher = c3104a;
        this.currentContract = x1Var;
    }

    @Override // g.AbstractC3371c
    public void b(I input, C3310c options) {
        this.launcher.a(input, options);
    }

    @Override // g.AbstractC3371c
    @InterfaceC4156a
    public void c() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
