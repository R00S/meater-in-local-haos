package e7;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import d7.InterfaceC3051e;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class G extends C3230u {

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.api.b f40613c;

    public G(com.google.android.gms.common.api.b bVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f40613c = bVar;
    }

    @Override // com.google.android.gms.common.api.c
    public final <A extends a.b, R extends InterfaceC3051e, T extends com.google.android.gms.common.api.internal.a<R, A>> T a(T t10) {
        return (T) this.f40613c.e(t10);
    }

    @Override // com.google.android.gms.common.api.c
    public final Looper b() {
        return this.f40613c.i();
    }
}
