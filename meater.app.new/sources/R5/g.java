package R5;

import L4.r1;
import Q5.BasicTutorial;
import T4.w;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.V;

/* compiled from: VideoTutorialSummaryAdapter.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001&B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00112\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"LR5/g;", "Landroidx/recyclerview/widget/RecyclerView$h;", "LR5/g$a;", "Ljava/util/ArrayList;", "LQ5/a;", "Lkotlin/collections/ArrayList;", "tutorials", "<init>", "(Ljava/util/ArrayList;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "L", "(Landroid/view/ViewGroup;I)LR5/g$a;", "viewHolder", "position", "Loa/F;", "J", "(LR5/g$a;I)V", "h", "()I", "LT4/w;", "itemClickListener", "M", "(LT4/w;)V", "", "i", "(I)J", "", "isWatched", "N", "(IZ)V", "E", "Ljava/util/ArrayList;", "F", "LT4/w;", "clickListener", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g extends RecyclerView.h<a> {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<BasicTutorial> tutorials;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private w clickListener;

    /* compiled from: VideoTutorialSummaryAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LR5/g$a;", "Landroidx/recyclerview/widget/RecyclerView$G;", "LL4/r1;", "binding", "<init>", "(LR5/g;LL4/r1;)V", "", "res", "", "b", "(I)Ljava/lang/String;", "B", "LL4/r1;", "a", "()LL4/r1;", "setBinding", "(LL4/r1;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a extends RecyclerView.G {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private r1 binding;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ g f15060C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, r1 binding) {
            super(binding.b());
            C3862t.g(binding, "binding");
            this.f15060C = gVar;
            this.binding = binding;
        }

        /* renamed from: a, reason: from getter */
        public final r1 getBinding() {
            return this.binding;
        }

        public final String b(int res) {
            String string = this.binding.b().getContext().getString(res);
            C3862t.f(string, "getString(...)");
            return string;
        }
    }

    public g(ArrayList<BasicTutorial> tutorials) {
        C3862t.g(tutorials, "tutorials");
        this.tutorials = tutorials;
        F(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(g gVar, int i10, View view) {
        w wVar = gVar.clickListener;
        if (wVar != null) {
            C3862t.d(wVar);
            wVar.y(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @SuppressLint({"SetTextI18n"})
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void w(a viewHolder, final int position) {
        C3862t.g(viewHolder, "viewHolder");
        BasicTutorial basicTutorial = this.tutorials.get(position);
        C3862t.f(basicTutorial, "get(...)");
        BasicTutorial basicTutorial2 = basicTutorial;
        if (basicTutorial2.getIsWatched()) {
            viewHolder.getBinding().f10526h.setText("");
            viewHolder.getBinding().f10525g.setBackgroundResource(R.drawable.ic_green_check_white);
        } else {
            viewHolder.getBinding().f10526h.setText(String.valueOf(position + 1));
        }
        viewHolder.getBinding().f10528j.setText(viewHolder.b(basicTutorial2.getTitleRes()));
        viewHolder.getBinding().f10527i.setText(viewHolder.b(basicTutorial2.getSubTitleRes()));
        AppCompatTextView appCompatTextView = viewHolder.getBinding().f10521c;
        V v10 = V.f43983a;
        String str = String.format(viewHolder.b(R.string.seconds_short), Arrays.copyOf(new Object[]{Long.valueOf(basicTutorial2.getDuration())}, 1));
        C3862t.f(str, "format(...)");
        appCompatTextView.setText(str);
        com.bumptech.glide.b.t(viewHolder.getBinding().b().getContext()).u(Integer.valueOf(basicTutorial2.getThumbnailRes())).H0(viewHolder.getBinding().f10524f);
        viewHolder.getBinding().f10520b.setOnClickListener(new View.OnClickListener() { // from class: R5.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.K(this.f15055B, position, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public a y(ViewGroup parent, int viewType) {
        C3862t.g(parent, "parent");
        r1 r1VarC = r1.c(LayoutInflater.from(parent.getContext()), parent, false);
        C3862t.f(r1VarC, "inflate(...)");
        return new a(this, r1VarC);
    }

    public final void M(w itemClickListener) {
        this.clickListener = itemClickListener;
    }

    public final void N(int position, boolean isWatched) {
        this.tutorials.get(position).j(isWatched);
        o(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.tutorials.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long i(int position) {
        return position;
    }
}
