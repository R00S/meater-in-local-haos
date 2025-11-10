package com.apptionlabs.meater_app.qsg.ui.info.chooseDevice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatImageView;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import kotlin.Metadata;
import wh.m;

/* compiled from: PairedDevicesBottomSheet.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eR\"\u0010\u0017\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/info/chooseDevice/a;", "Lcom/google/android/material/bottomsheet/b;", "", "Y2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "Lih/u;", "x1", "Lcom/apptionlabs/meater_app/qsg/ui/info/chooseDevice/a$a;", "buttonListener", "U2", "K0", "Lcom/apptionlabs/meater_app/qsg/ui/info/chooseDevice/a$a;", "V2", "()Lcom/apptionlabs/meater_app/qsg/ui/info/chooseDevice/a$a;", "Z2", "(Lcom/apptionlabs/meater_app/qsg/ui/info/chooseDevice/a$a;)V", "listener", "<init>", "()V", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class a extends b {

    /* renamed from: K0, reason: from kotlin metadata */
    public InterfaceC0138a listener;

    /* compiled from: PairedDevicesBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/info/chooseDevice/a$a;", "", "Lih/u;", "b", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.a$a, reason: collision with other inner class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface InterfaceC0138a {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(a aVar, View view) {
        m.f(aVar, "this$0");
        aVar.A2();
        aVar.V2().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X2(a aVar, View view) {
        m.f(aVar, "this$0");
        aVar.V2().a();
    }

    private final int Y2() {
        StringBuilder sb = new StringBuilder("qsg");
        for (w6.b bVar : w6.b.y()) {
            if (!FirmwareVersion.sharedInstance().mustUpdateAppBeforeConnectingToQSGDeviceType(bVar) && bVar.G() != -1) {
                sb.append("_");
                sb.append(bVar.getType());
            }
        }
        if (pk.m.L(sb, "603", false, 2, (Object) null)) {
            return 2131231505;
        }
        return 2131231504;
    }

    public final void U2(InterfaceC0138a interfaceC0138a) {
        m.f(interfaceC0138a, "buttonListener");
        Z2(interfaceC0138a);
    }

    public final InterfaceC0138a V2() {
        InterfaceC0138a interfaceC0138a = this.listener;
        if (interfaceC0138a != null) {
            return interfaceC0138a;
        }
        m.t("listener");
        return null;
    }

    public final void Z2(InterfaceC0138a interfaceC0138a) {
        m.f(interfaceC0138a, "<set-?>");
        this.listener = interfaceC0138a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.f(inflater, "inflater");
        View inflate = inflater.inflate(2131558667, container, false);
        m.e(inflate, "inflate(...)");
        K2(false);
        ((AppCompatImageView) inflate.findViewById(2131362646)).setImageResource(Y2());
        Button button = (Button) inflate.findViewById(2131362085);
        Button button2 = (Button) inflate.findViewById(2131362086);
        button.setOnClickListener(new View.OnClickListener() { // from class: h7.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.a.W2(com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.a.this, view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: h7.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.a.X2(com.apptionlabs.meater_app.qsg.ui.info.chooseDevice.a.this, view);
            }
        });
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void x1() {
        super/*androidx.fragment.app.m*/.x1();
        Object parent = f2().getParent();
        m.d(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior q02 = BottomSheetBehavior.q0((View) parent);
        m.e(q02, "from(...)");
        q02.W0(3);
    }
}
