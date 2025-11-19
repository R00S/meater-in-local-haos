package R4;

import B4.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import z4.C5177g;
import z4.C5181k;

/* compiled from: BottomSheetDialog.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0005¨\u0006\u0019"}, d2 = {"LR4/m;", "Lcom/google/android/material/bottomsheet/b;", "Lcom/apptionlabs/meater_app/model/MEATERBlock;", "block", "<init>", "(Lcom/apptionlabs/meater_app/model/MEATERBlock;)V", "LB4/l$c;", "resetType", "Loa/F;", "Y2", "(Lcom/apptionlabs/meater_app/model/MEATERBlock;LB4/l$c;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "X0", "Lcom/apptionlabs/meater_app/model/MEATERBlock;", "getBlock", "()Lcom/apptionlabs/meater_app/model/MEATERBlock;", "setBlock", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: R4.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1662m extends com.google.android.material.bottomsheet.b {

    /* renamed from: X0, reason: collision with root package name and from kotlin metadata */
    private MEATERBlock block;

    public C1662m(MEATERBlock block) {
        C3862t.g(block, "block");
        this.block = block;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V2(C1662m c1662m, View view) {
        c1662m.Y2(c1662m.block, l.c.MEATERBlockResetTypeStandard);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(C1662m c1662m, View view) {
        c1662m.Y2(c1662m.block, l.c.MEATERBlockResetTypeUnpairProbes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X2(C1662m c1662m, View view) {
        c1662m.A2();
    }

    private final void Y2(MEATERBlock block, l.c resetType) {
        if (block != null && (block.getBleConnection() instanceof C5177g)) {
            if (block.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK && resetType == l.c.MEATERBlockResetTypeUnpairProbes) {
                new X0(block).N2(c2().w0(), "bottomSheetDialog");
            } else {
                C5181k bleConnection = block.getBleConnection();
                C3862t.e(bleConnection, "null cannot be cast to non-null type com.apptionlabs.meater_app.ble.BlockKeepAliveBLEConnection");
                ((C5177g) bleConnection).u0(resetType);
            }
        }
        A2();
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.bottom_sheet_layout, container, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.resetTV);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.unpairedProbes);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.recoveryMode);
        Button button = (Button) viewInflate.findViewById(R.id.course_button);
        textView.setText(B0(R.string.this_will_reset_all_setting, this.block.listName()));
        textView2.setText(B0(R.string.reset_title, this.block.listName()));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: R4.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1662m.V2(this.f14957B, view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: R4.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1662m.W2(this.f14959B, view);
            }
        });
        viewInflate.findViewById(R.id.divider).setVisibility(8);
        textView4.setVisibility(8);
        button.setOnClickListener(new View.OnClickListener() { // from class: R4.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1662m.X2(this.f14961B, view);
            }
        });
        return viewInflate;
    }
}
