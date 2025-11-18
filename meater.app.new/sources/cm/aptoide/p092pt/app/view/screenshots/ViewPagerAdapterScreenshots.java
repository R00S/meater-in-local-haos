package cm.aptoide.p092pt.app.view.screenshots;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.AbstractC0694a;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ViewPagerAdapterScreenshots extends AbstractC0694a {
    private final ArrayList<String> uris;

    public ViewPagerAdapterScreenshots(ArrayList<String> arrayList) {
        this.uris = arrayList;
    }

    private int getPlaceholder(Context context) {
        return context.getResources().getConfiguration().orientation == 1 ? C1146R.attr.placeholder_9_16 : C1146R.attr.placeholder_16_9;
    }

    @Override // androidx.viewpager.widget.AbstractC0694a
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.AbstractC0694a
    public int getCount() {
        return this.uris.size();
    }

    @Override // androidx.viewpager.widget.AbstractC0694a
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        Context context = viewGroup.getContext();
        View viewInflate = LayoutInflater.from(context).inflate(C1146R.layout.row_item_screenshots_big, (ViewGroup) null);
        ImageLoader.with(context).load(this.uris.get(i2), getPlaceholder(context), (ImageView) viewInflate.findViewById(C1146R.id.screenshot_image_big));
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    @Override // androidx.viewpager.widget.AbstractC0694a
    public boolean isViewFromObject(View view, Object obj) {
        return view.equals(obj);
    }
}
