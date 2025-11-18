package cm.aptoide.p092pt.updates.view.excluded;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.database.room.RoomUpdate;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.view.recycler.widget.Widget;

/* loaded from: classes.dex */
public class ExcludedUpdateWidget extends Widget<ExcludedUpdateDisplayable> {
    private ImageView icon;
    private CheckBox isExcluded;
    private TextView name;
    private TextView packageName;
    private TextView versionCode;

    public ExcludedUpdateWidget(View view) {
        super(view);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.icon = (ImageView) view.findViewById(C1146R.id.icon);
        this.name = (TextView) view.findViewById(C1146R.id.name);
        this.versionCode = (TextView) view.findViewById(C1146R.id.version_code);
        this.packageName = (TextView) view.findViewById(C1146R.id.apk_id);
        this.isExcluded = (CheckBox) view.findViewById(C1146R.id.is_excluded);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(final ExcludedUpdateDisplayable excludedUpdateDisplayable, int i2) {
        RoomUpdate pojo = excludedUpdateDisplayable.getPojo();
        ImageLoader.with(getContext()).load(pojo.getIcon(), this.icon);
        this.name.setText(pojo.getLabel());
        this.versionCode.setText(pojo.getUpdateVersionName());
        this.packageName.setText(pojo.getPackageName());
        this.isExcluded.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cm.aptoide.pt.updates.view.excluded.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                excludedUpdateDisplayable.setSelected(z);
            }
        });
        this.isExcluded.setChecked(excludedUpdateDisplayable.isSelected());
    }
}
