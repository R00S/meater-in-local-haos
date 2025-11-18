package cm.aptoide.p092pt.view.recycler;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.LifecycleSchim;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import cm.aptoide.p092pt.view.recycler.displayable.Displayables;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import cm.aptoide.p092pt.view.recycler.widget.WidgetFactory;
import java.util.List;

/* loaded from: classes.dex */
public class BaseAdapter extends RecyclerView.AbstractC0594g<Widget> implements LifecycleSchim {
    private final Displayables displayables;

    public BaseAdapter(List<Displayable> list) {
        this();
        this.displayables.add(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$addDisplayable$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8994g(int i2, Displayable displayable) {
        this.displayables.add(i2, displayable);
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$addDisplayable$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8995h(Displayable displayable) {
        this.displayables.add(displayable);
        notifyItemInserted(this.displayables.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$addDisplayables$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8996i(List list) {
        this.displayables.add((List<? extends Displayable>) list);
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$addDisplayables$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8997j(int i2, List list) {
        this.displayables.add(i2, (List<? extends Displayable>) list);
        notifyItemRangeInserted(i2, list.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$clearDisplayables$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8998k() {
        this.displayables.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$removeDisplayable$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8999l(int i2) {
        this.displayables.remove(i2);
        notifyItemRemoved(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$removeDisplayables$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9000m(int i2, int i3) {
        notifyItemRangeRemoved(i2, this.displayables.remove(i2, i3));
    }

    public void addDisplayable(final int i2, final Displayable displayable) {
        AptoideUtils.ThreadU.runOnUiThread(new Runnable() { // from class: cm.aptoide.pt.view.recycler.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f11870f.m8994g(i2, displayable);
            }
        });
    }

    public void addDisplayableWithAnimation(int i2, Displayable displayable) {
        this.displayables.add(i2, displayable);
        notifyItemInserted(i2);
    }

    public void addDisplayables(final List<? extends Displayable> list) {
        AptoideUtils.ThreadU.runOnUiThread(new Runnable() { // from class: cm.aptoide.pt.view.recycler.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f11891f.m8996i(list);
            }
        });
    }

    public void clearDisplayables() {
        AptoideUtils.ThreadU.runOnUiThread(new Runnable() { // from class: cm.aptoide.pt.view.recycler.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f11873f.m8998k();
            }
        });
    }

    public Displayable getDisplayable(int i2) {
        return this.displayables.get(Integer.valueOf(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.displayables.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public long getItemId(int i2) {
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemViewType(int i2) {
        return this.displayables.get(Integer.valueOf(i2)).getViewLayout();
    }

    @Override // cm.aptoide.p092pt.view.LifecycleSchim
    public void onDestroyView() {
        this.displayables.onDestroyView();
    }

    @Override // cm.aptoide.p092pt.view.LifecycleSchim
    public void onPause() {
        this.displayables.onPause();
    }

    @Override // cm.aptoide.p092pt.view.LifecycleSchim
    public void onResume() {
        this.displayables.onResume();
    }

    @Override // cm.aptoide.p092pt.view.LifecycleSchim
    public void onSaveInstanceState(Bundle bundle) {
        this.displayables.onSaveInstanceState(bundle);
    }

    @Override // cm.aptoide.p092pt.view.LifecycleSchim
    public void onViewCreated() {
        this.displayables.onViewCreated();
    }

    @Override // cm.aptoide.p092pt.view.LifecycleSchim
    public void onViewStateRestored(Bundle bundle) {
        this.displayables.onViewStateRestored(bundle);
    }

    public Displayable popDisplayable() {
        Displayable displayablePop = this.displayables.pop();
        notifyItemRemoved(this.displayables.size());
        return displayablePop;
    }

    public void removeDisplayable(final int i2) {
        AptoideUtils.ThreadU.runOnUiThread(new Runnable() { // from class: cm.aptoide.pt.view.recycler.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f11876f.m8999l(i2);
            }
        });
    }

    public void removeDisplayables(final int i2, final int i3) {
        AptoideUtils.ThreadU.runOnUiThread(new Runnable() { // from class: cm.aptoide.pt.view.recycler.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f11893f.m9000m(i2, i3);
            }
        });
    }

    public void addDisplayable(final Displayable displayable) {
        AptoideUtils.ThreadU.runOnUiThread(new Runnable() { // from class: cm.aptoide.pt.view.recycler.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f11874f.m8995h(displayable);
            }
        });
    }

    public void addDisplayables(final int i2, final List<? extends Displayable> list) {
        AptoideUtils.ThreadU.runOnUiThread(new Runnable() { // from class: cm.aptoide.pt.view.recycler.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f11896f.m8997j(i2, list);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onBindViewHolder(Widget widget, int i2) {
        widget.internalBindView(this.displayables.get(Integer.valueOf(i2)), i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public Widget onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return WidgetFactory.newBaseViewHolder(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onViewRecycled(Widget widget) {
        widget.unbindView();
        super.onViewRecycled((BaseAdapter) widget);
    }

    public void removeDisplayable(Displayable displayable) {
        this.displayables.remove(displayable);
        notifyItemRemoved(this.displayables.getPosition(displayable));
    }

    public BaseAdapter() {
        this.displayables = new Displayables();
    }
}
