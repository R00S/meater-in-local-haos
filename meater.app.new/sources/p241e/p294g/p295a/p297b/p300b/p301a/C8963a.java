package p241e.p294g.p295a.p297b.p300b.p301a;

import androidx.core.widget.NestedScrollView;
import p241e.p294g.p295a.p304c.C8980f;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p457l.AbstractC11247a;

/* compiled from: NestedScrollViewScrollChangeEventOnSubscribe.java */
/* renamed from: e.g.a.b.b.a.a */
/* loaded from: classes2.dex */
final class C8963a implements C11234e.a<C8980f> {

    /* renamed from: f */
    final NestedScrollView f34501f;

    /* compiled from: NestedScrollViewScrollChangeEventOnSubscribe.java */
    /* renamed from: e.g.a.b.b.a.a$a */
    class a implements NestedScrollView.InterfaceC0319b {

        /* renamed from: a */
        final /* synthetic */ AbstractC11245j f34502a;

        a(AbstractC11245j abstractC11245j) {
            this.f34502a = abstractC11245j;
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC0319b
        /* renamed from: a */
        public void mo211a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
            if (this.f34502a.isUnsubscribed()) {
                return;
            }
            this.f34502a.onNext(C8980f.m28580b(C8963a.this.f34501f, i2, i3, i4, i5));
        }
    }

    /* compiled from: NestedScrollViewScrollChangeEventOnSubscribe.java */
    /* renamed from: e.g.a.b.b.a.a$b */
    class b extends AbstractC11247a {
        b() {
        }

        @Override // p456rx.p457l.AbstractC11247a
        protected void onUnsubscribe() {
            C8963a.this.f34501f.setOnScrollChangeListener((NestedScrollView.InterfaceC0319b) null);
        }
    }

    C8963a(NestedScrollView nestedScrollView) {
        this.f34501f = nestedScrollView;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super C8980f> abstractC11245j) {
        AbstractC11247a.verifyMainThread();
        a aVar = new a(abstractC11245j);
        abstractC11245j.add(new b());
        this.f34501f.setOnScrollChangeListener(aVar);
    }
}
