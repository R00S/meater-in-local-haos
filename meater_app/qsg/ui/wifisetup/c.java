package com.apptionlabs.meater_app.qsg.ui.wifisetup;

import android.view.q0;
import com.apptionlabs.meater_app.data.WiFiSSID;
import java.util.ArrayList;
import t5.t0;

/* compiled from: WifiSetUpViewModel.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class c extends q0 {

    /* renamed from: d, reason: collision with root package name */
    String f9920d;

    /* renamed from: e, reason: collision with root package name */
    String f9921e;

    /* renamed from: h, reason: collision with root package name */
    String f9924h;

    /* renamed from: l, reason: collision with root package name */
    t0 f9928l;

    /* renamed from: f, reason: collision with root package name */
    String f9922f = null;

    /* renamed from: g, reason: collision with root package name */
    String f9923g = null;

    /* renamed from: i, reason: collision with root package name */
    private WiFiSSID f9925i = new WiFiSSID();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<WiFiSSID> f9926j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private ArrayList<WiFiSSID> f9927k = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    private a f9929m = a.SETUP_CONNECTING_SCREEN;

    /* compiled from: WifiSetUpViewModel.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum a {
        SETUP_CONNECTING_SCREEN(0),
        SING_IN_SCREEN(1),
        NETWORK_CONNECTING_SCREEN(2),
        COMPLETE(3);


        /* renamed from: q, reason: collision with root package name */
        private final int f9935q;

        a(int i10) {
            this.f9935q = i10;
        }
    }

    public WiFiSSID i() {
        return this.f9925i;
    }

    public a j() {
        return this.f9929m;
    }

    public String k() {
        return this.f9923g;
    }

    public String l() {
        return this.f9922f;
    }

    public ArrayList<WiFiSSID> m() {
        return this.f9927k;
    }

    public ArrayList<WiFiSSID> n() {
        return this.f9926j;
    }

    public void o(WiFiSSID wiFiSSID) {
        this.f9925i = wiFiSSID;
    }

    public void p(a aVar) {
        this.f9929m = aVar;
    }

    public void q(ArrayList<WiFiSSID> arrayList) {
        this.f9927k = arrayList;
    }

    public void r(ArrayList<WiFiSSID> arrayList) {
        this.f9926j = arrayList;
    }
}
