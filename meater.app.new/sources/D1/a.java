package D1;

import Ba.l;
import Xb.I;
import Xb.J;
import Xb.R0;
import Xb.Z;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: PreferenceDataStoreDelegate.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00070\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "name", "LC1/b;", "LE1/d;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "LB1/c;", "produceMigrations", "LXb/I;", "scope", "LEa/d;", "LB1/e;", "a", "(Ljava/lang/String;LC1/b;LBa/l;LXb/I;)LEa/d;", "datastore-preferences_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PreferenceDataStoreDelegate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/content/Context;", "it", "", "LB1/c;", "LE1/d;", "<anonymous>", "(Landroid/content/Context;)Ljava/util/List;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: D1.a$a, reason: collision with other inner class name */
    public static final class C0053a extends AbstractC3864v implements l<Context, List<? extends B1.c<E1.d>>> {

        /* renamed from: B, reason: collision with root package name */
        public static final C0053a f3324B = new C0053a();

        C0053a() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<B1.c<E1.d>> invoke(Context it) {
            C3862t.g(it, "it");
            return r.m();
        }
    }

    public static final Ea.d<Context, B1.e<E1.d>> a(String name, C1.b<E1.d> bVar, l<? super Context, ? extends List<? extends B1.c<E1.d>>> produceMigrations, I scope) {
        C3862t.g(name, "name");
        C3862t.g(produceMigrations, "produceMigrations");
        C3862t.g(scope, "scope");
        return new c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ Ea.d b(String str, C1.b bVar, l lVar, I i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bVar = null;
        }
        if ((i11 & 4) != 0) {
            lVar = C0053a.f3324B;
        }
        if ((i11 & 8) != 0) {
            i10 = J.a(Z.b().s(R0.b(null, 1, null)));
        }
        return a(str, bVar, lVar, i10);
    }
}
