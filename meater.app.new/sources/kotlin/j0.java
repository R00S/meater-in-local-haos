package kotlin;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.M;
import b0.m;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.i0;

/* compiled from: Strings.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"LI/i0;", "string", "", "a", "(ILO/l;I)Ljava/lang/String;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j0 {
    public static final String a(int i10, InterfaceC1554l interfaceC1554l, int i11) {
        if (C1560o.J()) {
            C1560o.S(-726638443, i11, -1, "androidx.compose.material.getString (Strings.android.kt:24)");
        }
        interfaceC1554l.o(M.f());
        Resources resources = ((Context) interfaceC1554l.o(M.g())).getResources();
        i0.Companion companion = i0.INSTANCE;
        String string = i0.i(i10, companion.e()) ? resources.getString(m.f29980h) : i0.i(i10, companion.a()) ? resources.getString(m.f29973a) : i0.i(i10, companion.b()) ? resources.getString(m.f29974b) : i0.i(i10, companion.c()) ? resources.getString(m.f29975c) : i0.i(i10, companion.d()) ? resources.getString(m.f29977e) : i0.i(i10, companion.g()) ? resources.getString(m.f29983k) : i0.i(i10, companion.f()) ? resources.getString(m.f29982j) : "";
        if (C1560o.J()) {
            C1560o.R();
        }
        return string;
    }
}
