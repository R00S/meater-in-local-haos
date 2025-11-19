package Xb;

import kotlin.Metadata;

/* compiled from: MainCoroutineDispatcher.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0005¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LXb/G0;", "LXb/E;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "L0", "G0", "()LXb/G0;", "immediate", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class G0 extends E {
    public abstract G0 G0();

    protected final String L0() {
        G0 G02;
        G0 g0C = Z.c();
        if (this == g0C) {
            return "Dispatchers.Main";
        }
        try {
            G02 = g0C.G0();
        } catch (UnsupportedOperationException unused) {
            G02 = null;
        }
        if (this == G02) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // Xb.E
    public String toString() {
        String strL0 = L0();
        if (strL0 != null) {
            return strL0;
        }
        return M.a(this) + '@' + M.b(this);
    }
}
