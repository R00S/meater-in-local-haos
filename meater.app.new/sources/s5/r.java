package s5;

import L4.R0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: PairingAdapter.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#R$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Ls5/r;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Ls5/r$a;", "Ljava/util/ArrayList;", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "Lkotlin/collections/ArrayList;", "devices", "<init>", "(Ljava/util/ArrayList;)V", "Landroid/widget/ImageView;", "imageview", "device", "Loa/F;", "O", "(Landroid/widget/ImageView;Lcom/apptionlabs/meater_app/model/MEATERDevice;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "M", "(Landroid/view/ViewGroup;I)Ls5/r$a;", "viewHolder", "position", "K", "(Ls5/r$a;I)V", "h", "()I", "LT4/j;", "itemClickListener", "N", "(LT4/j;)V", "", "i", "(I)J", "J", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;)V", "E", "Ljava/util/ArrayList;", "F", "LT4/j;", "clickListener", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class r extends RecyclerView.h<a> {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<MEATERDevice> devices;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private T4.j clickListener;

    /* compiled from: PairingAdapter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ls5/r$a;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Landroid/view/View;", "v", "LL4/R0;", "adapterBinding", "<init>", "(Landroid/view/View;LL4/R0;)V", "B", "LL4/R0;", "a", "()LL4/R0;", "setAdapterBinding", "(LL4/R0;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends RecyclerView.G {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private R0 adapterBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, R0 adapterBinding) {
            super(view);
            C3862t.g(adapterBinding, "adapterBinding");
            C3862t.d(view);
            this.adapterBinding = adapterBinding;
        }

        /* renamed from: a, reason: from getter */
        public final R0 getAdapterBinding() {
            return this.adapterBinding;
        }
    }

    public r(ArrayList<MEATERDevice> devices) {
        C3862t.g(devices, "devices");
        this.devices = devices;
        F(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(r rVar, int i10, View view) {
        T4.j jVar = rVar.clickListener;
        if (jVar != null) {
            C3862t.d(jVar);
            jVar.L(null, i10);
        }
    }

    private final void O(ImageView imageview, MEATERDevice device) {
        MEATERDeviceType mEATERDeviceType = device.getMEATERDeviceType();
        C3862t.f(mEATERDeviceType, "getMEATERDeviceType(...)");
        if (mEATERDeviceType == MEATERDeviceType.PLUS) {
            imageview.setImageResource(R.drawable.ic_mini_charger_connected);
            return;
        }
        if (mEATERDeviceType == MEATERDeviceType.SECOND_GENERATION_PLUS || mEATERDeviceType == MEATERDeviceType.SECOND_GENERATION_PLUS_PRO) {
            imageview.setImageResource(R.drawable.ic_mini_g2_plus_connected);
            return;
        }
        if (mEATERDeviceType == MEATERDeviceType.BLOCK) {
            imageview.setImageResource(R.drawable.ic_mini_block_connected);
            return;
        }
        if (mEATERDeviceType == MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK) {
            imageview.setImageResource(R.drawable.ic_mini_g2_block_connected);
            return;
        }
        if (mEATERDeviceType == MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK) {
            imageview.setImageResource(R.drawable.ic_medium_g2_duo_connected);
        } else if (device.isMEATERProbe() || device.isBlockProbe()) {
            imageview.setImageResource(R.drawable.ic_small_device_light_connected);
        }
    }

    public final void J(MEATERDevice device) {
        Object next;
        C3862t.g(device, "device");
        Iterator<T> it = this.devices.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((MEATERDevice) next).getDeviceID() == device.getDeviceID()) {
                    break;
                }
            }
        }
        MEATERDevice mEATERDevice = (MEATERDevice) next;
        if (mEATERDevice == null) {
            this.devices.add(device);
            return;
        }
        mEATERDevice.setBleConnection(device.getBleConnection());
        mEATERDevice.setConnectionState(device.getConnectionState());
        mEATERDevice.setConnectionMethod(device.getConnectionMethod());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void w(a viewHolder, final int position) {
        C3862t.g(viewHolder, "viewHolder");
        MEATERDevice mEATERDevice = this.devices.get(position);
        C3862t.f(mEATERDevice, "get(...)");
        MEATERDevice mEATERDevice2 = mEATERDevice;
        if (Config.INSTANCE.getInstance().DEBUG_UI_ENABLED) {
            AppCompatTextView connectedText = viewHolder.getAdapterBinding().f9585b;
            C3862t.f(connectedText, "connectedText");
            Q4.l.g(connectedText);
            viewHolder.getAdapterBinding().f9588e.setText(mEATERDevice2.listName());
            viewHolder.getAdapterBinding().f9585b.setText(mEATERDevice2.getConnectionTextAsString());
        } else {
            AppCompatTextView connectedText2 = viewHolder.getAdapterBinding().f9585b;
            C3862t.f(connectedText2, "connectedText");
            Q4.l.g(connectedText2);
            viewHolder.getAdapterBinding().f9588e.setText(mEATERDevice2.displayName());
        }
        viewHolder.getAdapterBinding().f9586c.setImageResource(mEATERDevice2.getImageResource());
        ImageView deviceImage = viewHolder.getAdapterBinding().f9587d;
        C3862t.f(deviceImage, "deviceImage");
        O(deviceImage, mEATERDevice2);
        viewHolder.getAdapterBinding().f9589f.setOnClickListener(new View.OnClickListener() { // from class: s5.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.L(this.f49282B, position, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public a y(ViewGroup parent, int viewType) {
        C3862t.g(parent, "parent");
        R0 r0C = R0.c(LayoutInflater.from(parent.getContext()), parent, false);
        C3862t.f(r0C, "inflate(...)");
        return new a(r0C.b(), r0C);
    }

    public final void N(T4.j itemClickListener) {
        this.clickListener = itemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h() {
        return this.devices.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long i(int position) {
        return this.devices.get(position).getDeviceID();
    }
}
