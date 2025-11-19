package androidx.compose.ui.layout;

import b0.i;
import kotlin.Metadata;
import y0.H;
import y0.InterfaceC5119y;

/* compiled from: LayoutId.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb0/i;", "", "layoutId", "b", "(Lb0/i;Ljava/lang/Object;)Lb0/i;", "Ly0/H;", "a", "(Ly0/H;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {
    public static final Object a(H h10) {
        Object objB = h10.b();
        InterfaceC5119y interfaceC5119y = objB instanceof InterfaceC5119y ? (InterfaceC5119y) objB : null;
        if (interfaceC5119y != null) {
            return interfaceC5119y.getLayoutId();
        }
        return null;
    }

    public static final i b(i iVar, Object obj) {
        return iVar.e(new LayoutIdElement(obj));
    }
}
