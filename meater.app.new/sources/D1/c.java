package D1;

import Ba.l;
import Ia.m;
import Xb.I;
import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: PreferenceDataStoreDelegate.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R,\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LD1/c;", "LEa/d;", "Landroid/content/Context;", "LB1/e;", "LE1/d;", "", "name", "LC1/b;", "corruptionHandler", "Lkotlin/Function1;", "", "LB1/c;", "produceMigrations", "LXb/I;", "scope", "<init>", "(Ljava/lang/String;LC1/b;LBa/l;LXb/I;)V", "thisRef", "LIa/m;", "property", "d", "(Landroid/content/Context;LIa/m;)LB1/e;", "a", "Ljava/lang/String;", "b", "LC1/b;", "c", "LBa/l;", "LXb/I;", "", "e", "Ljava/lang/Object;", "lock", "f", "LB1/e;", "INSTANCE", "datastore-preferences_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class c implements Ea.d<Context, B1.e<E1.d>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C1.b<E1.d> corruptionHandler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l<Context, List<B1.c<E1.d>>> produceMigrations;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final I scope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private volatile B1.e<E1.d> INSTANCE;

    /* compiled from: PreferenceDataStoreDelegate.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Ljava/io/File;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends AbstractC3864v implements Ba.a<File> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Context f3331B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ c f3332C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f3331B = context;
            this.f3332C = cVar;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f3331B;
            C3862t.f(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f3332C.name);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(String name, C1.b<E1.d> bVar, l<? super Context, ? extends List<? extends B1.c<E1.d>>> produceMigrations, I scope) {
        C3862t.g(name, "name");
        C3862t.g(produceMigrations, "produceMigrations");
        C3862t.g(scope, "scope");
        this.name = name;
        this.corruptionHandler = bVar;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // Ea.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public B1.e<E1.d> a(Context thisRef, m<?> property) {
        B1.e<E1.d> eVar;
        C3862t.g(thisRef, "thisRef");
        C3862t.g(property, "property");
        B1.e<E1.d> eVar2 = this.INSTANCE;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    E1.c cVar = E1.c.f3804a;
                    C1.b<E1.d> bVar = this.corruptionHandler;
                    l<Context, List<B1.c<E1.d>>> lVar = this.produceMigrations;
                    C3862t.f(applicationContext, "applicationContext");
                    this.INSTANCE = cVar.a(bVar, lVar.invoke(applicationContext), this.scope, new a(applicationContext, this));
                }
                eVar = this.INSTANCE;
                C3862t.d(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }
}
