package G6;

import H6.l;
import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import m6.InterfaceC3970e;

/* compiled from: AndroidResourceSignature.java */
/* loaded from: classes2.dex */
public final class a implements InterfaceC3970e {

    /* renamed from: b, reason: collision with root package name */
    private final int f4977b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3970e f4978c;

    private a(int i10, InterfaceC3970e interfaceC3970e) {
        this.f4977b = i10;
        this.f4978c = interfaceC3970e;
    }

    public static InterfaceC3970e c(Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }

    @Override // m6.InterfaceC3970e
    public void b(MessageDigest messageDigest) {
        this.f4978c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f4977b).array());
    }

    @Override // m6.InterfaceC3970e
    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4977b == aVar.f4977b && this.f4978c.equals(aVar.f4978c);
    }

    @Override // m6.InterfaceC3970e
    public int hashCode() {
        return l.o(this.f4978c, this.f4977b);
    }
}
