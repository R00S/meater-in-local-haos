package w4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.Content;
import com.apptionlabs.meater_app.data.Help;
import com.apptionlabs.meater_app.views.ThumbnailView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* compiled from: HeaderListAdapter.java */
/* loaded from: classes.dex */
public class t extends BaseAdapter {

    /* renamed from: B, reason: collision with root package name */
    private final Context f51918B;

    /* renamed from: C, reason: collision with root package name */
    private ArrayList<Help> f51919C;

    /* renamed from: D, reason: collision with root package name */
    private ArrayList<Content> f51920D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f51921E;

    /* renamed from: F, reason: collision with root package name */
    private T4.n f51922F;

    public t(Context context, ArrayList<Help> arrayList) {
        this.f51918B = context;
        this.f51919C = arrayList;
    }

    private Drawable d(String str) throws IOException {
        Drawable drawableCreateFromStream = null;
        try {
            InputStream inputStreamOpen = this.f51918B.getAssets().open(str);
            drawableCreateFromStream = Drawable.createFromStream(inputStreamOpen, null);
            inputStreamOpen.close();
            return drawableCreateFromStream;
        } catch (IOException unused) {
            return drawableCreateFromStream;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(int i10, Help help, View view) {
        T4.n nVar = this.f51922F;
        if (nVar != null) {
            nVar.d(i10, 1, help.youTubeID(), help.getTitle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(int i10, Help help, View view) {
        T4.n nVar = this.f51922F;
        if (nVar != null) {
            nVar.d(i10, 2, help.youTubeID2(), help.getTitle2());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i10, Help help, View view) {
        T4.n nVar = this.f51922F;
        if (nVar != null) {
            nVar.i(i10, help);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return (this.f51921E ? this.f51920D : this.f51919C).size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return (this.f51921E ? this.f51920D : this.f51919C).get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(final int i10, View view, ViewGroup viewGroup) {
        View viewInflate;
        TextView textView;
        View viewInflate2;
        TextView textView2;
        LayoutInflater layoutInflater = (LayoutInflater) this.f51918B.getSystemService("layout_inflater");
        if (this.f51921E) {
            Content content = this.f51920D.get(i10);
            if (content.isHeader()) {
                viewInflate = layoutInflater.inflate(R.layout.help_header_list_item, viewGroup, false);
                textView = (TextView) viewInflate.findViewById(R.id.headerTitle);
                View viewFindViewById = viewInflate.findViewById(R.id.top_divider);
                if (i10 > 0) {
                    viewFindViewById.setVisibility(8);
                } else {
                    viewFindViewById.setVisibility(0);
                }
            } else {
                viewInflate = layoutInflater.inflate(R.layout.help_list_item, viewGroup, false);
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.outline);
                TextView textView3 = (TextView) viewInflate.findViewById(R.id.title);
                if (i10 > this.f51920D.size() - 3) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(0);
                    imageView.setImageResource(R.drawable.ic_add_alert);
                }
                textView = textView3;
            }
            textView.setText(content.getContent());
            return viewInflate;
        }
        final Help help = this.f51919C.get(i10);
        if (help.getHelpType() == 0) {
            viewInflate2 = layoutInflater.inflate(R.layout.help_header_list_item, viewGroup, false);
            textView2 = (TextView) viewInflate2.findViewById(R.id.headerTitle);
            viewInflate2.findViewById(R.id.top_divider).setVisibility(8);
        } else if (help.getHelpType() == 1) {
            View viewInflate3 = layoutInflater.inflate(R.layout.help_video_row, viewGroup, false);
            ThumbnailView thumbnailView = (ThumbnailView) viewInflate3.findViewById(R.id.thumbnail_view1);
            ThumbnailView thumbnailView2 = (ThumbnailView) viewInflate3.findViewById(R.id.thumbnail_view2);
            thumbnailView.b(d(help.getThumbnail()), help.getTitle());
            thumbnailView2.b(d(help.getThumbnail2()), help.getTitle2());
            if (help.getContent2().equalsIgnoreCase("how-to-pair-your-probe")) {
                thumbnailView2.setVisibility(8);
            } else {
                thumbnailView2.setVisibility(0);
            }
            thumbnailView.setOnClickListener(new View.OnClickListener() { // from class: w4.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f51909B.e(i10, help, view2);
                }
            });
            thumbnailView2.setOnClickListener(new View.OnClickListener() { // from class: w4.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f51912B.f(i10, help, view2);
                }
            });
            textView2 = null;
            viewInflate2 = viewInflate3;
        } else {
            View viewInflate4 = layoutInflater.inflate(R.layout.help_list_item, viewGroup, false);
            ImageView imageView2 = (ImageView) viewInflate4.findViewById(R.id.outline);
            if (help.getUrlIcon() != null) {
                imageView2.setVisibility(0);
                if (help.getUrlIcon().equalsIgnoreCase("FacebookLogo")) {
                    imageView2.setImageResource(R.drawable.fb_logo);
                } else if (help.getUrlIcon().equalsIgnoreCase("InstagramLogo")) {
                    try {
                        imageView2.setImageResource(R.drawable.ic_instagram_logo_color);
                    } catch (Exception e10) {
                        J5.a.a(e10);
                        imageView2.setImageResource(R.drawable.ic_instagram_logo);
                    }
                } else if (help.getUrlIcon().equalsIgnoreCase("YouTubeLogo")) {
                    imageView2.setImageResource(R.drawable.ic_youtube_logo);
                } else if (help.getUrlIcon().equalsIgnoreCase("TwitterLogo")) {
                    imageView2.setImageResource(R.drawable.ic_twitter_logo);
                }
            } else {
                imageView2.setVisibility(8);
            }
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate4.findViewById(R.id.rowContainer);
            TextView textView4 = (TextView) viewInflate4.findViewById(R.id.title);
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: w4.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f51915B.g(i10, help, view2);
                }
            });
            viewInflate2 = viewInflate4;
            textView2 = textView4;
        }
        if (textView2 != null) {
            textView2.setText(help.getTitle());
        }
        return viewInflate2;
    }

    public void h(T4.n nVar) {
        this.f51922F = nVar;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i10) {
        if (this.f51921E) {
            if (this.f51920D.get(i10).isHeader()) {
                return false;
            }
        } else if (this.f51919C.get(i10).getHelpType() != 0) {
            return false;
        }
        return true;
    }

    public t(Context context, ArrayList<Content> arrayList, boolean z10) {
        this.f51918B = context;
        this.f51920D = arrayList;
        this.f51921E = z10;
    }
}
