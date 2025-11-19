package Y4;

import L4.O0;
import P5.Q;
import Y4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import na.b;
import p4.OfferData;
import x4.g;

/* compiled from: NewsOffersAdapter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LY4/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$G;", "", "Lp4/j;", "offers", "LZ4/a;", "itemListener", "<init>", "(Ljava/util/List;LZ4/a;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "y", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$G;", "viewHolder", "position", "Loa/F;", "w", "(Landroidx/recyclerview/widget/RecyclerView$G;I)V", "h", "()I", "", "i", "(I)J", "E", "Ljava/util/List;", "F", "LZ4/a;", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends RecyclerView.h<RecyclerView.G> {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final List<OfferData> offers;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final Z4.a itemListener;

    /* compiled from: NewsOffersAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LY4/b$a;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Landroid/view/View;", "itemView", "LL4/O0;", "binding", "<init>", "(LY4/b;Landroid/view/View;LL4/O0;)V", "Lp4/j;", "data", "Loa/F;", "b", "(Lp4/j;)V", "B", "LL4/O0;", "getBinding", "()LL4/O0;", "setBinding", "(LL4/O0;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a extends RecyclerView.G {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private O0 binding;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ b f19420C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, View itemView, O0 binding) {
            super(itemView);
            C3862t.g(itemView, "itemView");
            C3862t.g(binding, "binding");
            this.f19420C = bVar;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, OfferData offerData, b bVar, View view) {
            Q.G(aVar.itemView.getContext(), offerData.getOfferUrl());
            bVar.itemListener.a(offerData.getId());
        }

        public final void b(final OfferData data) {
            C3862t.g(data, "data");
            String thumbnailUrl = data.getThumbnailUrl();
            if (thumbnailUrl != null) {
                com.bumptech.glide.b.t(g.h()).v(thumbnailUrl).b(D6.g.t0(new na.b(45, 0, b.EnumC0624b.ALL))).H0(this.binding.f9552b);
            }
            data.getOfferUrl();
            final b bVar = this.f19420C;
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: Y4.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.a.c(this.f19414B, data, bVar, view);
                }
            });
        }
    }

    public b(List<OfferData> offers, Z4.a itemListener) {
        C3862t.g(offers, "offers");
        C3862t.g(itemListener, "itemListener");
        this.offers = offers;
        this.itemListener = itemListener;
        F(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.offers.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long i(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void w(RecyclerView.G viewHolder, int position) {
        C3862t.g(viewHolder, "viewHolder");
        ((a) viewHolder).b(this.offers.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.G y(ViewGroup parent, int viewType) {
        C3862t.g(parent, "parent");
        O0 o0B = O0.b(LayoutInflater.from(parent.getContext()), parent, false);
        C3862t.f(o0B, "inflate(...)");
        ConstraintLayout rootView = o0B.f9553c;
        C3862t.f(rootView, "rootView");
        return new a(this, rootView, o0B);
    }
}
