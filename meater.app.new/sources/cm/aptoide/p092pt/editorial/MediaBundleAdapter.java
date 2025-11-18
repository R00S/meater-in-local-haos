package cm.aptoide.p092pt.editorial;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import java.util.List;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
class MediaBundleAdapter extends RecyclerView.AbstractC0594g<MediaViewHolder> {
    private List<EditorialMedia> media;
    private C11418b<EditorialEvent> uiEventListener;

    public MediaBundleAdapter(List<EditorialMedia> list, C11418b<EditorialEvent> c11418b) {
        this.media = list;
        this.uiEventListener = c11418b;
    }

    public void add(List<EditorialMedia> list) {
        this.media.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.media.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onBindViewHolder(MediaViewHolder mediaViewHolder, int i2) {
        mediaViewHolder.setVisibility(this.media.get(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public MediaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new MediaViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.media_layout, viewGroup, false), this.uiEventListener);
    }
}
