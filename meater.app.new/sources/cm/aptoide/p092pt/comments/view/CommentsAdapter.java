package cm.aptoide.p092pt.comments.view;

import cm.aptoide.p092pt.view.recycler.BaseAdapter;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;

/* loaded from: classes.dex */
public class CommentsAdapter<T extends Displayable> extends BaseAdapter {
    private final Class<T> clazz;

    public CommentsAdapter() {
        this.clazz = null;
    }

    public int getItemPosition(int i2) {
        if (this.clazz == null) {
            return -1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < getItemCount(); i4++) {
            if (this.clazz.isAssignableFrom(getDisplayable(i4).getClass())) {
                if (i3 == i2) {
                    return i4;
                }
                i3++;
            }
        }
        return -1;
    }

    public CommentsAdapter(Class<T> cls) {
        this.clazz = cls;
    }
}
