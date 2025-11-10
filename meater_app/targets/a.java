package com.apptionlabs.meater_app.targets;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.apptionlabs.meater_app.meatCutStructure.Meat;
import com.apptionlabs.meater_app.meatCutStructure.MeatModel;

/* compiled from: AbstractItemSelectFragment.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public abstract class a<Item extends MeatModel, Parent extends MeatModel> extends Fragment {

    /* renamed from: t0, reason: collision with root package name */
    private int f10088t0;

    /* renamed from: u0, reason: collision with root package name */
    private int f10089u0 = -1;

    /* renamed from: v0, reason: collision with root package name */
    private InterfaceC0147a f10090v0;

    /* renamed from: w0, reason: collision with root package name */
    Meat f10091w0;

    /* compiled from: AbstractItemSelectFragment.java */
    /* renamed from: com.apptionlabs.meater_app.targets.a$a, reason: collision with other inner class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface InterfaceC0147a {
        void k(a<?, ?> aVar, MeatModel meatModel);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <Parent extends MeatModel> Bundle x2(Parent parent) {
        Bundle bundle = new Bundle();
        if (parent instanceof Meat) {
            bundle.putInt("parentId", ((Meat) parent).category.id.intValue());
            bundle.putInt("meatId", parent.id.intValue());
        } else {
            bundle.putInt("parentId", parent.id.intValue());
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int A2() {
        return this.f10088t0;
    }

    public void B2(Item item) {
        InterfaceC0147a interfaceC0147a = this.f10090v0;
        if (interfaceC0147a != null) {
            interfaceC0147a.k(this, item);
        }
    }

    public void C2(Meat meat) {
        this.f10091w0 = meat;
    }

    public void D2(InterfaceC0147a interfaceC0147a) {
        this.f10090v0 = interfaceC0147a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void X0(Context context) {
        InterfaceC0147a interfaceC0147a;
        super.X0(context);
        Fragment fragment = this;
        while (true) {
            interfaceC0147a = this.f10090v0;
            if (interfaceC0147a != null || fragment == 0) {
                break;
            }
            fragment = fragment.n0();
            if (fragment instanceof InterfaceC0147a) {
                D2((InterfaceC0147a) fragment);
            }
        }
        if (interfaceC0147a == null && (context instanceof InterfaceC0147a)) {
            this.f10090v0 = (InterfaceC0147a) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void a1(Bundle bundle) {
        super.a1(bundle);
        Bundle W = W();
        if (W != null) {
            this.f10089u0 = W.getInt("meatId", -1);
            this.f10088t0 = W.getInt("parentId");
        }
    }

    public Meat y2() {
        return this.f10091w0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int z2() {
        return this.f10089u0;
    }
}
