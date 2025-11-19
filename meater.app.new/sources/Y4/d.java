package Y4;

import L4.P0;
import P5.I;
import P5.Q;
import Y4.d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.JuicyVideo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import na.b;
import x4.g;

/* compiled from: NewsVideoAdapter.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LY4/d;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Ljava/util/ArrayList;", "Lcom/apptionlabs/meater_app/data/JuicyVideo;", "Lkotlin/collections/ArrayList;", "videos", "<init>", "(Ljava/util/ArrayList;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "y", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$G;", "viewHolder", "position", "Loa/F;", "w", "(Landroidx/recyclerview/widget/RecyclerView$G;I)V", "h", "()I", "", "i", "(I)J", "E", "Ljava/util/ArrayList;", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d extends RecyclerView.h<RecyclerView.G> {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<JuicyVideo> videos;

    /* compiled from: NewsVideoAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LY4/d$a;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Landroid/view/View;", "itemView", "LL4/P0;", "binding", "<init>", "(LY4/d;Landroid/view/View;LL4/P0;)V", "Lcom/apptionlabs/meater_app/data/JuicyVideo;", "data", "Loa/F;", "b", "(Lcom/apptionlabs/meater_app/data/JuicyVideo;)V", "B", "LL4/P0;", "getBinding", "()LL4/P0;", "setBinding", "(LL4/P0;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a extends RecyclerView.G {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private P0 binding;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ d f19425C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, View itemView, P0 binding) {
            super(itemView);
            C3862t.g(itemView, "itemView");
            C3862t.g(binding, "binding");
            this.f19425C = dVar;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, JuicyVideo juicyVideo, View view) {
            Q.G(aVar.itemView.getContext(), juicyVideo.url);
        }

        public final void b(final JuicyVideo data) {
            C3862t.g(data, "data");
            String str = data.title;
            if (str != null) {
                this.binding.f9571e.setText(str);
            }
            int i10 = this.binding.f9570d.getResources().getBoolean(R.bool.is_tablet) ? 20 : 25;
            String str2 = data.thumbnail;
            if (str2 != null) {
                com.bumptech.glide.b.t(g.h()).v(str2).b(D6.g.t0(new na.b(i10, 0, b.EnumC0624b.ALL))).H0(this.binding.f9570d);
            }
            if (data.url != null) {
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: Y4.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        d.a.c(this.f19421B, data, view);
                    }
                });
            }
            this.binding.f9568b.setText(I.c(data.duration));
        }
    }

    public d(ArrayList<JuicyVideo> videos) {
        C3862t.g(videos, "videos");
        this.videos = videos;
        F(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.videos.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long i(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void w(RecyclerView.G viewHolder, int position) {
        C3862t.g(viewHolder, "viewHolder");
        JuicyVideo juicyVideo = this.videos.get(position);
        C3862t.f(juicyVideo, "get(...)");
        ((a) viewHolder).b(juicyVideo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.G y(ViewGroup parent, int viewType) {
        C3862t.g(parent, "parent");
        P0 p0B = P0.b(LayoutInflater.from(parent.getContext()), parent, false);
        C3862t.f(p0B, "inflate(...)");
        ConstraintLayout rootView = p0B.f9569c;
        C3862t.f(rootView, "rootView");
        return new a(this, rootView, p0B);
    }
}
