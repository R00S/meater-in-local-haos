package p241e.p294g.p295a.p297b.p298a.p299a;

import com.google.android.material.appbar.AppBarLayout;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p457l.AbstractC11247a;

/* compiled from: AppBarLayoutOffsetChangeOnSubscribe.java */
/* renamed from: e.g.a.b.a.a.a */
/* loaded from: classes2.dex */
final class C8959a implements C11234e.a<Integer> {

    /* renamed from: f */
    final AppBarLayout f34492f;

    /* compiled from: AppBarLayoutOffsetChangeOnSubscribe.java */
    /* renamed from: e.g.a.b.a.a.a$a */
    class a implements AppBarLayout.InterfaceC7928e {

        /* renamed from: a */
        final /* synthetic */ AbstractC11245j f34493a;

        a(AbstractC11245j abstractC11245j) {
            this.f34493a = abstractC11245j;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC7926c
        public void onOffsetChanged(AppBarLayout appBarLayout, int i2) {
            if (this.f34493a.isUnsubscribed()) {
                return;
            }
            this.f34493a.onNext(Integer.valueOf(i2));
        }
    }

    /* compiled from: AppBarLayoutOffsetChangeOnSubscribe.java */
    /* renamed from: e.g.a.b.a.a.a$b */
    class b extends AbstractC11247a {

        /* renamed from: f */
        final /* synthetic */ AppBarLayout.InterfaceC7928e f34495f;

        b(AppBarLayout.InterfaceC7928e interfaceC7928e) {
            this.f34495f = interfaceC7928e;
        }

        @Override // p456rx.p457l.AbstractC11247a
        protected void onUnsubscribe() {
            C8959a.this.f34492f.m23718p(this.f34495f);
        }
    }

    C8959a(AppBarLayout appBarLayout) {
        this.f34492f = appBarLayout;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super Integer> abstractC11245j) {
        AbstractC11247a.verifyMainThread();
        a aVar = new a(abstractC11245j);
        abstractC11245j.add(new b(aVar));
        this.f34492f.m23708b(aVar);
    }
}
