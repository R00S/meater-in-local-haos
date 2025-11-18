package p024c.p064l.p065b;

import android.content.Context;
import androidx.datastore.core.InterfaceC0338c;
import androidx.datastore.core.InterfaceC0340e;
import androidx.datastore.core.p006o.C0351b;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import p024c.p064l.p065b.p066i.AbstractC0979d;
import p024c.p064l.p065b.p066i.C0978c;

/* compiled from: PreferenceDataStoreDelegate.kt */
/* renamed from: c.l.b.c */
/* loaded from: classes.dex */
public final class C0970c implements ReadOnlyProperty<Context, InterfaceC0340e<AbstractC0979d>> {

    /* renamed from: a */
    private final String f6461a;

    /* renamed from: b */
    private final C0351b<AbstractC0979d> f6462b;

    /* renamed from: c */
    private final Function1<Context, List<InterfaceC0338c<AbstractC0979d>>> f6463c;

    /* renamed from: d */
    private final CoroutineScope f6464d;

    /* renamed from: e */
    private final Object f6465e;

    /* renamed from: f */
    private volatile InterfaceC0340e<AbstractC0979d> f6466f;

    /* compiled from: PreferenceDataStoreDelegate.kt */
    /* renamed from: c.l.b.c$a */
    static final class a extends Lambda implements Function0<File> {

        /* renamed from: f */
        final /* synthetic */ Context f6467f;

        /* renamed from: g */
        final /* synthetic */ C0970c f6468g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, C0970c c0970c) {
            super(0);
            this.f6467f = context;
            this.f6468g = c0970c;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context context = this.f6467f;
            C9801m.m32345e(context, "applicationContext");
            return C0969b.m6181a(context, this.f6468g.f6461a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0970c(String str, C0351b<AbstractC0979d> c0351b, Function1<? super Context, ? extends List<? extends InterfaceC0338c<AbstractC0979d>>> function1, CoroutineScope coroutineScope) {
        C9801m.m32346f(str, "name");
        C9801m.m32346f(function1, "produceMigrations");
        C9801m.m32346f(coroutineScope, "scope");
        this.f6461a = str;
        this.f6462b = c0351b;
        this.f6463c = function1;
        this.f6464d = coroutineScope;
        this.f6465e = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC0340e<AbstractC0979d> mo6183a(Context context, KProperty<?> kProperty) {
        InterfaceC0340e<AbstractC0979d> interfaceC0340e;
        C9801m.m32346f(context, "thisRef");
        C9801m.m32346f(kProperty, "property");
        InterfaceC0340e<AbstractC0979d> interfaceC0340e2 = this.f6466f;
        if (interfaceC0340e2 != null) {
            return interfaceC0340e2;
        }
        synchronized (this.f6465e) {
            if (this.f6466f == null) {
                Context applicationContext = context.getApplicationContext();
                C0978c c0978c = C0978c.f6489a;
                C0351b<AbstractC0979d> c0351b = this.f6462b;
                Function1<Context, List<InterfaceC0338c<AbstractC0979d>>> function1 = this.f6463c;
                C9801m.m32345e(applicationContext, "applicationContext");
                this.f6466f = c0978c.m6247a(c0351b, function1.invoke(applicationContext), this.f6464d, new a(applicationContext, this));
            }
            interfaceC0340e = this.f6466f;
            C9801m.m32343c(interfaceC0340e);
        }
        return interfaceC0340e;
    }
}
