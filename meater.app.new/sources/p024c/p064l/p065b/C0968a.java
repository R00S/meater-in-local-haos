package p024c.p064l.p065b;

import android.content.Context;
import androidx.datastore.core.InterfaceC0338c;
import androidx.datastore.core.InterfaceC0340e;
import androidx.datastore.core.p006o.C0351b;
import java.util.List;
import kotlin.collections.C10817u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.properties.ReadOnlyProperty;
import kotlinx.coroutines.C11033p0;
import kotlinx.coroutines.C11047s2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p024c.p064l.p065b.p066i.AbstractC0979d;

/* compiled from: PreferenceDataStoreDelegate.kt */
/* renamed from: c.l.b.a */
/* loaded from: classes.dex */
public final class C0968a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PreferenceDataStoreDelegate.kt */
    /* renamed from: c.l.b.a$a */
    public static final class a extends Lambda implements Function1<Context, List<? extends InterfaceC0338c<AbstractC0979d>>> {

        /* renamed from: f */
        public static final a f6460f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List<InterfaceC0338c<AbstractC0979d>> invoke(Context context) {
            C9801m.m32346f(context, "it");
            return C10817u.m38888j();
        }
    }

    /* renamed from: a */
    public static final ReadOnlyProperty<Context, InterfaceC0340e<AbstractC0979d>> m6178a(String str, C0351b<AbstractC0979d> c0351b, Function1<? super Context, ? extends List<? extends InterfaceC0338c<AbstractC0979d>>> function1, CoroutineScope coroutineScope) {
        C9801m.m32346f(str, "name");
        C9801m.m32346f(function1, "produceMigrations");
        C9801m.m32346f(coroutineScope, "scope");
        return new C0970c(str, c0351b, function1, coroutineScope);
    }

    /* renamed from: b */
    public static /* synthetic */ ReadOnlyProperty m6179b(String str, C0351b c0351b, Function1 function1, CoroutineScope coroutineScope, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c0351b = null;
        }
        if ((i2 & 4) != 0) {
            function1 = a.f6460f;
        }
        if ((i2 & 8) != 0) {
            Dispatchers dispatchers = Dispatchers.f41700a;
            coroutineScope = C11033p0.m39668a(Dispatchers.m39301b().plus(C11047s2.m39686b(null, 1, null)));
        }
        return m6178a(str, c0351b, function1, coroutineScope);
    }
}
