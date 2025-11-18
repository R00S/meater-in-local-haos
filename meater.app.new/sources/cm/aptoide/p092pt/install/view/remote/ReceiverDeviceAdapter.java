package cm.aptoide.p092pt.install.view.remote;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.install.remote.ReceiverDevice;
import java.util.List;

/* loaded from: classes.dex */
public class ReceiverDeviceAdapter extends ArrayAdapter<ReceiverDevice> {
    private Context context;
    private List<ReceiverDevice> devices;
    private int resource;

    public ReceiverDeviceAdapter(Context context, int i2, List<ReceiverDevice> list) {
        super(context, i2, list);
        this.context = context;
        this.resource = i2;
        this.devices = list;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        ReceiverDevice item = getItem(i2);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(C1146R.layout.row_remote_install, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(C1146R.id.deviceNameText);
        if (item != null) {
            textView.setText(item.getDeviceName());
        }
        return view;
    }

    @Override // android.widget.ArrayAdapter
    public void add(ReceiverDevice receiverDevice) {
        boolean z = false;
        for (int i2 = 0; i2 < this.devices.size(); i2++) {
            if (this.devices.get(i2).isSameDevice(receiverDevice)) {
                this.devices.set(i2, receiverDevice);
                notifyDataSetChanged();
                z = true;
            }
        }
        if (z) {
            return;
        }
        super.add((ReceiverDeviceAdapter) receiverDevice);
    }
}
