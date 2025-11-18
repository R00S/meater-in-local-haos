package p241e.p294g.p295a.p297b.p298a.p299a;

import com.google.android.material.snackbar.Snackbar;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p457l.AbstractC11247a;

/* compiled from: SnackbarDismissesOnSubscribe.java */
/* renamed from: e.g.a.b.a.a.d */
/* loaded from: classes2.dex */
final class C8962d implements C11234e.a<Integer> {

    /* renamed from: f */
    final Snackbar f34497f;

    /* compiled from: SnackbarDismissesOnSubscribe.java */
    /* renamed from: e.g.a.b.a.a.d$a */
    class a extends Snackbar.C8058b {

        /* renamed from: a */
        final /* synthetic */ AbstractC11245j f34498a;

        a(AbstractC11245j abstractC11245j) {
            this.f34498a = abstractC11245j;
        }

        @Override // com.google.android.material.snackbar.Snackbar.C8058b
        public void onDismissed(Snackbar snackbar, int i2) {
            if (this.f34498a.isUnsubscribed()) {
                return;
            }
            this.f34498a.onNext(Integer.valueOf(i2));
        }
    }

    /* compiled from: SnackbarDismissesOnSubscribe.java */
    /* renamed from: e.g.a.b.a.a.d$b */
    class b extends AbstractC11247a {
        b() {
        }

        @Override // p456rx.p457l.AbstractC11247a
        protected void onUnsubscribe() {
            C8962d.this.f34497f.m24767d0(null);
        }
    }

    C8962d(Snackbar snackbar) {
        this.f34497f = snackbar;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super Integer> abstractC11245j) {
        AbstractC11247a.verifyMainThread();
        a aVar = new a(abstractC11245j);
        abstractC11245j.add(new b());
        this.f34497f.m24767d0(aVar);
    }
}
