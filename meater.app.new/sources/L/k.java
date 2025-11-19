package L;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.M;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;

/* compiled from: Strings.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"LL/j;", "string", "", "a", "(ILO/l;I)Ljava/lang/String;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {
    public static final String a(int i10, InterfaceC1554l interfaceC1554l, int i11) throws Resources.NotFoundException {
        if (C1560o.J()) {
            C1560o.S(-907677715, i11, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:30)");
        }
        interfaceC1554l.o(M.f());
        String string = ((Context) interfaceC1554l.o(M.g())).getResources().getString(i10);
        if (C1560o.J()) {
            C1560o.R();
        }
        return string;
    }
}
