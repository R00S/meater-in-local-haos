package n2;

import androidx.media3.exoplayer.source.G;
import java.util.List;
import m8.AbstractC4009y;

/* compiled from: DefaultCompositeSequenceableLoaderFactory.java */
/* renamed from: n2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4058f implements InterfaceC4057e {
    @Override // n2.InterfaceC4057e
    public G a(List<? extends G> list, List<List<Integer>> list2) {
        return new C4056d(list, list2);
    }

    @Override // n2.InterfaceC4057e
    public G b() {
        return new C4056d(AbstractC4009y.G(), AbstractC4009y.G());
    }
}
