package p241e.p294g.p295a.p297b.p302c.p303a;

import androidx.appcompat.widget.SearchView;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p457l.AbstractC11247a;

/* compiled from: SearchViewQueryTextChangeEventsOnSubscribe.java */
/* renamed from: e.g.a.b.c.a.f */
/* loaded from: classes2.dex */
final class C8972f implements C11234e.a<C8973g> {

    /* renamed from: f */
    final SearchView f34516f;

    /* compiled from: SearchViewQueryTextChangeEventsOnSubscribe.java */
    /* renamed from: e.g.a.b.c.a.f$a */
    class a implements SearchView.InterfaceC0139l {

        /* renamed from: a */
        final /* synthetic */ AbstractC11245j f34517a;

        a(AbstractC11245j abstractC11245j) {
            this.f34517a = abstractC11245j;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0139l
        /* renamed from: a */
        public boolean mo817a(String str) {
            if (this.f34517a.isUnsubscribed()) {
                return false;
            }
            this.f34517a.onNext(C8973g.m28569b(C8972f.this.f34516f, str, false));
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0139l
        /* renamed from: b */
        public boolean mo818b(String str) {
            if (this.f34517a.isUnsubscribed()) {
                return false;
            }
            AbstractC11245j abstractC11245j = this.f34517a;
            SearchView searchView = C8972f.this.f34516f;
            abstractC11245j.onNext(C8973g.m28569b(searchView, searchView.getQuery(), true));
            return true;
        }
    }

    /* compiled from: SearchViewQueryTextChangeEventsOnSubscribe.java */
    /* renamed from: e.g.a.b.c.a.f$b */
    class b extends AbstractC11247a {
        b() {
        }

        @Override // p456rx.p457l.AbstractC11247a
        protected void onUnsubscribe() {
            C8972f.this.f34516f.setOnQueryTextListener(null);
        }
    }

    C8972f(SearchView searchView) {
        this.f34516f = searchView;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super C8973g> abstractC11245j) {
        AbstractC11247a.verifyMainThread();
        a aVar = new a(abstractC11245j);
        abstractC11245j.add(new b());
        this.f34516f.setOnQueryTextListener(aVar);
        SearchView searchView = this.f34516f;
        abstractC11245j.onNext(C8973g.m28569b(searchView, searchView.getQuery(), false));
    }
}
