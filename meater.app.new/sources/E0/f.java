package E0;

import Ba.p;
import Xb.C1841i;
import Xb.I;
import Xb.InterfaceC1867v0;
import android.os.CancellationSignal;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: ComposeScrollCaptureCallback.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LXb/I;", "Landroid/os/CancellationSignal;", "signal", "Lkotlin/Function2;", "Lta/d;", "Loa/F;", "", "block", "LXb/v0;", "c", "(LXb/I;Landroid/os/CancellationSignal;LBa/p;)LXb/v0;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* compiled from: ComposeScrollCaptureCallback.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<Throwable, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f3781B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CancellationSignal cancellationSignal) {
            super(1);
            this.f3781B = cancellationSignal;
        }

        public final void a(Throwable th) {
            if (th != null) {
                this.f3781B.cancel();
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1867v0 c(I i10, CancellationSignal cancellationSignal, p<? super I, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar) {
        final InterfaceC1867v0 interfaceC1867v0D = C1841i.d(i10, null, null, pVar, 3, null);
        interfaceC1867v0D.q(new a(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: E0.e
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                f.d(interfaceC1867v0D);
            }
        });
        return interfaceC1867v0D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC1867v0 interfaceC1867v0) {
        InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
    }
}
