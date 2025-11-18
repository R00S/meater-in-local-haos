package T5;

import Xb.F;
import android.view.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import t4.InterfaceC4554d;
import ta.AbstractC4585a;

/* compiled from: SignInSignUpViewModel.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LT5/q;", "Landroidx/lifecycle/Y;", "Lt4/d;", "getWatchedVideosUseCase", "LG5/a;", "preference", "<init>", "(Lt4/d;LG5/a;)V", "b", "Lt4/d;", "c", "LG5/a;", "LXb/F;", "d", "LXb/F;", "coroutineExceptionHandler", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class q extends Y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4554d getWatchedVideosUseCase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final G5.a preference;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final F coroutineExceptionHandler;

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T5/q$a", "Lta/a;", "LXb/F;", "Lta/g;", "context", "", "exception", "Loa/F;", "y", "(Lta/g;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends AbstractC4585a implements F {
        public a(F.Companion companion) {
            super(companion);
        }

        @Override // Xb.F
        public void y(ta.g context, Throwable exception) {
            U4.b.e("Exception", exception);
        }
    }

    public q(InterfaceC4554d getWatchedVideosUseCase, G5.a preference) {
        C3862t.g(getWatchedVideosUseCase, "getWatchedVideosUseCase");
        C3862t.g(preference, "preference");
        this.getWatchedVideosUseCase = getWatchedVideosUseCase;
        this.preference = preference;
        this.coroutineExceptionHandler = new a(F.INSTANCE);
    }
}
