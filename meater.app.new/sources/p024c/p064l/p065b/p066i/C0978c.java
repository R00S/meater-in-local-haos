package p024c.p064l.p065b.p066i;

import androidx.datastore.core.C0341f;
import androidx.datastore.core.InterfaceC0338c;
import androidx.datastore.core.InterfaceC0340e;
import androidx.datastore.core.p006o.C0351b;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.p429io.C10561f;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PreferenceDataStoreFactory.kt */
/* renamed from: c.l.b.i.c */
/* loaded from: classes.dex */
public final class C0978c {

    /* renamed from: a */
    public static final C0978c f6489a = new C0978c();

    /* compiled from: PreferenceDataStoreFactory.kt */
    /* renamed from: c.l.b.i.c$a */
    static final class a extends Lambda implements Function0<File> {

        /* renamed from: f */
        final /* synthetic */ Function0<File> f6490f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<? extends File> function0) {
            super(0);
            this.f6490f = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File fileInvoke = this.f6490f.invoke();
            String strM37640a = C10561f.m37640a(fileInvoke);
            C0983h c0983h = C0983h.f6497a;
            if (C9801m.m32341a(strM37640a, c0983h.m6268f())) {
                return fileInvoke;
            }
            throw new IllegalStateException(("File extension for file: " + fileInvoke + " does not match required extension for Preferences file: " + c0983h.m6268f()).toString());
        }
    }

    private C0978c() {
    }

    /* renamed from: a */
    public final InterfaceC0340e<AbstractC0979d> m6247a(C0351b<AbstractC0979d> c0351b, List<? extends InterfaceC0338c<AbstractC0979d>> list, CoroutineScope coroutineScope, Function0<? extends File> function0) {
        C9801m.m32346f(list, "migrations");
        C9801m.m32346f(coroutineScope, "scope");
        C9801m.m32346f(function0, "produceFile");
        return new C0977b(C0341f.f2544a.m2360a(C0983h.f6497a, c0351b, list, coroutineScope, new a(function0)));
    }
}
