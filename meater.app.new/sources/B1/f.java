package B1;

import Xb.I;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: DataStoreFactory.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LB1/f;", "", "<init>", "()V", "T", "LB1/j;", "serializer", "LC1/b;", "corruptionHandler", "", "LB1/c;", "migrations", "LXb/I;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "LB1/e;", "a", "(LB1/j;LC1/b;Ljava/util/List;LXb/I;LBa/a;)LB1/e;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f1419a = new f();

    private f() {
    }

    public final <T> e<T> a(j<T> serializer, C1.b<T> corruptionHandler, List<? extends c<T>> migrations, I scope, Ba.a<? extends File> produceFile) {
        C3862t.g(serializer, "serializer");
        C3862t.g(migrations, "migrations");
        C3862t.g(scope, "scope");
        C3862t.g(produceFile, "produceFile");
        if (corruptionHandler == null) {
            corruptionHandler = (C1.b<T>) new C1.a();
        }
        return new l(produceFile, serializer, r.e(d.INSTANCE.b(migrations)), corruptionHandler, scope);
    }
}
