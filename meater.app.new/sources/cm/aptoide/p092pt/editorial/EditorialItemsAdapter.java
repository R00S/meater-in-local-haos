package cm.aptoide.p092pt.editorial;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import java.text.DecimalFormat;
import java.util.List;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
class EditorialItemsAdapter extends RecyclerView.AbstractC0594g<EditorialItemsViewHolder> {
    private final C11418b<EditorialDownloadEvent> downloadEventListener;
    private List<EditorialContent> editorialItemList;
    private final DecimalFormat oneDecimalFormat;
    private boolean shouldHaveAnimation = true;
    private C11418b<EditorialEvent> uiEventListener;

    public EditorialItemsAdapter(List<EditorialContent> list, DecimalFormat decimalFormat, C11418b<EditorialEvent> c11418b, C11418b<EditorialDownloadEvent> c11418b2) {
        this.editorialItemList = list;
        this.oneDecimalFormat = decimalFormat;
        this.uiEventListener = c11418b;
        this.downloadEventListener = c11418b2;
    }

    public void add(List<EditorialContent> list, boolean z) {
        this.editorialItemList.addAll(list);
        this.shouldHaveAnimation = z;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.editorialItemList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onBindViewHolder(EditorialItemsViewHolder editorialItemsViewHolder, int i2) {
        editorialItemsViewHolder.setVisibility(this.editorialItemList.get(i2), i2, Boolean.valueOf(this.shouldHaveAnimation));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public EditorialItemsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new EditorialItemsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.editorial_item_layout, viewGroup, false), this.oneDecimalFormat, this.uiEventListener, this.downloadEventListener);
    }
}
