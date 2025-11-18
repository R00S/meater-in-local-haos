package E1;

import Xb.I;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import za.C5221b;

/* compiled from: PreferenceDataStoreFactory.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LE1/c;", "", "<init>", "()V", "LC1/b;", "LE1/d;", "corruptionHandler", "", "LB1/c;", "migrations", "LXb/I;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "LB1/e;", "a", "(LC1/b;Ljava/util/List;LXb/I;LBa/a;)LB1/e;", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f3804a = new c();

    /* compiled from: PreferenceDataStoreFactory.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Ljava/io/File;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends AbstractC3864v implements Ba.a<File> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.a<File> f3805B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Ba.a<? extends File> aVar) {
            super(0);
            this.f3805B = aVar;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File fileInvoke = this.f3805B.invoke();
            String strA = C5221b.a(fileInvoke);
            h hVar = h.f3812a;
            if (C3862t.b(strA, hVar.f())) {
                return fileInvoke;
            }
            throw new IllegalStateException(("File extension for file: " + fileInvoke + " does not match required extension for Preferences file: " + hVar.f()).toString());
        }
    }

    private c() {
    }

    public final B1.e<d> a(C1.b<d> corruptionHandler, List<? extends B1.c<d>> migrations, I scope, Ba.a<? extends File> produceFile) {
        C3862t.g(migrations, "migrations");
        C3862t.g(scope, "scope");
        C3862t.g(produceFile, "produceFile");
        return new b(B1.f.f1419a.a(h.f3812a, corruptionHandler, migrations, scope, new a(produceFile)));
    }
}
