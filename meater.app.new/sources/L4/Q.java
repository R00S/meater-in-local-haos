package L4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.apptionlabs.meater_app.R;

/* compiled from: ExistingDeviceItemBinding.java */
/* loaded from: classes2.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    private final AppCompatImageView f9572a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f9573b;

    private Q(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f9572a = appCompatImageView;
        this.f9573b = appCompatImageView2;
    }

    public static Q a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view;
        return new Q(appCompatImageView, appCompatImageView);
    }

    public static Q c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.existing_device_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public AppCompatImageView b() {
        return this.f9572a;
    }
}
