package E6;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.k;

/* compiled from: PreloadTarget.java */
/* loaded from: classes2.dex */
public final class g<Z> extends c<Z> {

    /* renamed from: F, reason: collision with root package name */
    private static final Handler f3996F = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: E, reason: collision with root package name */
    private final k f3997E;

    /* compiled from: PreloadTarget.java */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((g) message.obj).l();
            return true;
        }
    }

    private g(k kVar, int i10, int i11) {
        super(i10, i11);
        this.f3997E = kVar;
    }

    public static <Z> g<Z> m(k kVar, int i10, int i11) {
        return new g<>(kVar, i10, i11);
    }

    @Override // E6.i
    public void j(Z z10, F6.b<? super Z> bVar) {
        D6.d dVarI = i();
        if (dVarI == null || !dVarI.k()) {
            return;
        }
        f3996F.obtainMessage(1, this).sendToTarget();
    }

    void l() {
        this.f3997E.o(this);
    }

    @Override // E6.i
    public void k(Drawable drawable) {
    }
}
