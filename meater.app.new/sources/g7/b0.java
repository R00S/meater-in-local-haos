package g7;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import c7.C2333b;
import r7.HandlerC4360e;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
final class b0 extends HandlerC4360e {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC3433d f41973b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(AbstractC3433d abstractC3433d, Looper looper) {
        super(looper);
        this.f41973b = abstractC3433d;
    }

    private static final void a(Message message) {
        c0 c0Var = (c0) message.obj;
        c0Var.b();
        c0Var.e();
    }

    private static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f41973b.f42007d0.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f41973b.t()) || message.what == 5)) && !this.f41973b.d()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            this.f41973b.f42004a0 = new C2333b(message.arg2);
            if (AbstractC3433d.h0(this.f41973b)) {
                AbstractC3433d abstractC3433d = this.f41973b;
                if (!abstractC3433d.f42005b0) {
                    abstractC3433d.i0(3, null);
                    return;
                }
            }
            AbstractC3433d abstractC3433d2 = this.f41973b;
            C2333b c2333b = abstractC3433d2.f42004a0 != null ? abstractC3433d2.f42004a0 : new C2333b(8);
            this.f41973b.f41994Q.c(c2333b);
            this.f41973b.L(c2333b);
            return;
        }
        if (i11 == 5) {
            AbstractC3433d abstractC3433d3 = this.f41973b;
            C2333b c2333b2 = abstractC3433d3.f42004a0 != null ? abstractC3433d3.f42004a0 : new C2333b(8);
            this.f41973b.f41994Q.c(c2333b2);
            this.f41973b.L(c2333b2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            C2333b c2333b3 = new C2333b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f41973b.f41994Q.c(c2333b3);
            this.f41973b.L(c2333b3);
            return;
        }
        if (i11 == 6) {
            this.f41973b.i0(5, null);
            AbstractC3433d abstractC3433d4 = this.f41973b;
            if (abstractC3433d4.f41999V != null) {
                abstractC3433d4.f41999V.g(message.arg2);
            }
            this.f41973b.M(message.arg2);
            AbstractC3433d.g0(this.f41973b, 5, 1, null);
            return;
        }
        if (i11 == 2 && !this.f41973b.h()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((c0) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
