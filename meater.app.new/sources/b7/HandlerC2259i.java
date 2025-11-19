package b7;

import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* renamed from: b7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class HandlerC2259i extends q7.f {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2253c f30656b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC2259i(C2253c c2253c, Looper looper) {
        super(looper);
        this.f30656b = c2253c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C2253c.g(this.f30656b, message);
    }
}
