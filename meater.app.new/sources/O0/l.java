package O0;

import androidx.emoji2.text.f;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.r1;
import kotlin.x1;

/* compiled from: EmojiCompatStatus.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007¨\u0006\f"}, d2 = {"LO0/l;", "LO0/o;", "<init>", "()V", "LO/x1;", "", "c", "()LO/x1;", "a", "LO/x1;", "loadState", "fontLoaded", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class l implements o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private x1<Boolean> loadState;

    /* compiled from: EmojiCompatStatus.android.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"O0/l$a", "Landroidx/emoji2/text/f$f;", "Loa/F;", "b", "()V", "", "throwable", "a", "(Ljava/lang/Throwable;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends f.AbstractC0355f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1563p0<Boolean> f13097a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f13098b;

        a(InterfaceC1563p0<Boolean> interfaceC1563p0, l lVar) {
            this.f13097a = interfaceC1563p0;
            this.f13098b = lVar;
        }

        @Override // androidx.emoji2.text.f.AbstractC0355f
        public void a(Throwable throwable) {
            this.f13098b.loadState = p.f13103a;
        }

        @Override // androidx.emoji2.text.f.AbstractC0355f
        public void b() {
            this.f13097a.setValue(Boolean.TRUE);
            this.f13098b.loadState = new q(true);
        }
    }

    public l() {
        this.loadState = androidx.emoji2.text.f.i() ? c() : null;
    }

    private final x1<Boolean> c() {
        androidx.emoji2.text.f fVarC = androidx.emoji2.text.f.c();
        if (fVarC.e() == 1) {
            return new q(true);
        }
        InterfaceC1563p0 interfaceC1563p0C = r1.c(Boolean.FALSE, null, 2, null);
        fVarC.t(new a(interfaceC1563p0C, this));
        return interfaceC1563p0C;
    }

    @Override // O0.o
    public x1<Boolean> a() {
        x1<Boolean> x1Var = this.loadState;
        if (x1Var != null) {
            C3862t.d(x1Var);
            return x1Var;
        }
        if (!androidx.emoji2.text.f.i()) {
            return p.f13103a;
        }
        x1<Boolean> x1VarC = c();
        this.loadState = x1VarC;
        C3862t.d(x1VarC);
        return x1VarC;
    }
}
