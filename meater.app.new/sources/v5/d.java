package v5;

import L4.Z0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import v5.d;

/* compiled from: LocaleSelectionAdapter.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR&\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\b0\u001fj\b\u0012\u0004\u0012\u00020\b` 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lv5/d;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Lw5/e;", "callback", "<init>", "(Lw5/e;)V", "", "", "list", "currentLocale", "Loa/F;", "K", "(Ljava/util/List;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "y", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$G;", "viewHolder", "position", "w", "(Landroidx/recyclerview/widget/RecyclerView$G;I)V", "h", "()I", "", "i", "(I)J", "E", "Lw5/e;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "F", "Ljava/util/ArrayList;", "localeList", "G", "Ljava/lang/String;", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d extends RecyclerView.h<RecyclerView.G> {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final w5.e callback;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private ArrayList<String> localeList;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private String currentLocale;

    /* compiled from: LocaleSelectionAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lv5/d$a;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Landroid/view/View;", "itemView", "LL4/Z0;", "binding", "<init>", "(Lv5/d;Landroid/view/View;LL4/Z0;)V", "", "data", "Loa/F;", "b", "(Ljava/lang/String;)V", "B", "LL4/Z0;", "getBinding", "()LL4/Z0;", "setBinding", "(LL4/Z0;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a extends RecyclerView.G {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private Z0 binding;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ d f51424C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, View itemView, Z0 binding) {
            super(itemView);
            C3862t.g(itemView, "itemView");
            C3862t.g(binding, "binding");
            this.f51424C = dVar;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(d dVar, String str, View view) {
            dVar.callback.u(str);
        }

        public final void b(final String data) {
            C3862t.g(data, "data");
            this.binding.f9795e.setText(data);
            if (Ub.n.t(this.f51424C.currentLocale, data, true)) {
                AppCompatImageView tickImage = this.binding.f9794d;
                C3862t.f(tickImage, "tickImage");
                Q4.l.j(tickImage);
            } else {
                AppCompatImageView tickImage2 = this.binding.f9794d;
                C3862t.f(tickImage2, "tickImage");
                Q4.l.g(tickImage2);
            }
            if (getAbsoluteAdapterPosition() < this.f51424C.h() - 1) {
                View bottomBar = this.binding.f9792b;
                C3862t.f(bottomBar, "bottomBar");
                Q4.l.g(bottomBar);
            }
            ConstraintLayout constraintLayout = this.binding.f9793c;
            final d dVar = this.f51424C;
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: v5.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.a.c(dVar, data, view);
                }
            });
        }
    }

    public d(w5.e callback) {
        C3862t.g(callback, "callback");
        this.callback = callback;
        this.localeList = new ArrayList<>();
        this.currentLocale = "";
        F(true);
    }

    public final void K(List<String> list, String currentLocale) {
        C3862t.g(list, "list");
        C3862t.g(currentLocale, "currentLocale");
        this.localeList.clear();
        this.localeList = (ArrayList) list;
        this.currentLocale = currentLocale;
        n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.localeList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long i(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void w(RecyclerView.G viewHolder, int position) {
        C3862t.g(viewHolder, "viewHolder");
        String str = this.localeList.get(position);
        C3862t.f(str, "get(...)");
        ((a) viewHolder).b(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.G y(ViewGroup parent, int viewType) {
        C3862t.g(parent, "parent");
        Z0 z0B = Z0.b(LayoutInflater.from(parent.getContext()), parent, false);
        C3862t.f(z0B, "inflate(...)");
        ConstraintLayout rootView = z0B.f9793c;
        C3862t.f(rootView, "rootView");
        return new a(this, rootView, z0B);
    }
}
