package P5;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: DeviceDisconnectionChecker.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0010"}, d2 = {"LP5/j;", "", "<init>", "()V", "LP5/j$a;", "heedHelpEventCallback", "Loa/F;", "b", "(LP5/j$a;)V", "", "a", "I", "FIND_DEVICE_EXPIRY", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: P5.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1602j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int FIND_DEVICE_EXPIRY = 60000;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Handler handler = new Handler();

    /* compiled from: DeviceDisconnectionChecker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LP5/j$a;", "", "Loa/F;", "a", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: P5.j$a */
    public interface a {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a aVar) {
        aVar.a();
    }

    public final void b(final a heedHelpEventCallback) {
        C3862t.g(heedHelpEventCallback, "heedHelpEventCallback");
        U4.b.k("startDisconnectedDeviceCheck", new Object[0]);
        this.handler.removeCallbacksAndMessages(null);
        this.handler.postDelayed(new Runnable() { // from class: P5.i
            @Override // java.lang.Runnable
            public final void run() {
                C1602j.c(heedHelpEventCallback);
            }
        }, this.FIND_DEVICE_EXPIRY);
    }
}
