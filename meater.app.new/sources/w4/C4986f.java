package w4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.Appliance;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import x4.b;

/* compiled from: CookApplianceAdapter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lw4/f;", "Landroid/widget/ArrayAdapter;", "Lcom/apptionlabs/meater_app/data/Appliance;", "Landroid/content/Context;", "context", "", "layoutId", "", "itemsList", "<init>", "(Landroid/content/Context;ILjava/util/List;)V", "getCount", "()I", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "LT4/d;", "listener", "Loa/F;", "c", "(LT4/d;)V", "B", "I", "C", "Ljava/util/List;", "D", "LT4/d;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: w4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4986f extends ArrayAdapter<Appliance> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private int layoutId;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private List<Appliance> itemsList;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private T4.d listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4986f(Context context, int i10, List<Appliance> itemsList) {
        super(context, i10, itemsList);
        C3862t.g(context, "context");
        C3862t.g(itemsList, "itemsList");
        this.layoutId = i10;
        this.itemsList = itemsList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Appliance appliance, C4986f c4986f, View view) {
        x4.b.j(b.EnumC0768b.f52677T1.title, "", appliance.getName(), null, 8, null);
        T4.d dVar = c4986f.listener;
        if (dVar == null || dVar == null) {
            return;
        }
        dVar.z(true, appliance);
    }

    public final void c(T4.d listener) {
        this.listener = listener;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.itemsList.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        C3862t.g(parent, "parent");
        if (convertView == null) {
            Object systemService = getContext().getSystemService("layout_inflater");
            C3862t.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            convertView = ((LayoutInflater) systemService).inflate(this.layoutId, (ViewGroup) null);
        }
        C3862t.d(convertView);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        TextView textView = (TextView) convertView.findViewById(R.id.textView);
        final Appliance appliance = this.itemsList.get(position);
        imageView.setImageResource(appliance.getImageId());
        textView.setText(appliance.getName());
        ((ConstraintLayout) convertView.findViewById(R.id.cellRootView)).setOnClickListener(new View.OnClickListener() { // from class: w4.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4986f.b(appliance, this, view);
            }
        });
        return convertView;
    }
}
