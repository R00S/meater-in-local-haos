package Xb;

import cc.C2386q;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LXb/B0;", "Lcc/q;", "LXb/s0;", "LXb/b0;", "LXb/q0;", "<init>", "()V", "Loa/F;", "c", "", "toString", "()Ljava/lang/String;", "LXb/C0;", "E", "LXb/C0;", "w", "()LXb/C0;", "x", "(LXb/C0;)V", "job", "", "a", "()Z", "isActive", "LXb/H0;", "d", "()LXb/H0;", "list", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class B0 extends C2386q implements InterfaceC1861s0, InterfaceC1828b0, InterfaceC1858q0 {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public C0 job;

    @Override // Xb.InterfaceC1858q0
    /* renamed from: a */
    public boolean getIsActive() {
        return true;
    }

    @Override // Xb.InterfaceC1828b0
    public void c() {
        w().P0(this);
    }

    @Override // Xb.InterfaceC1858q0
    /* renamed from: d */
    public H0 getList() {
        return null;
    }

    @Override // cc.C2386q
    public String toString() {
        return M.a(this) + '@' + M.b(this) + "[job@" + M.b(w()) + ']';
    }

    public final C0 w() {
        C0 c02 = this.job;
        if (c02 != null) {
            return c02;
        }
        C3862t.u("job");
        return null;
    }

    public final void x(C0 c02) {
        this.job = c02;
    }
}
