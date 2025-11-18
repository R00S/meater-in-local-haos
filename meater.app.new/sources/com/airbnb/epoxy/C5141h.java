package com.airbnb.epoxy;

import com.airbnb.epoxy.C5132c0;

/* compiled from: ControllerModelList.java */
/* renamed from: com.airbnb.epoxy.h */
/* loaded from: classes.dex */
class C5141h extends C5132c0 {

    /* renamed from: h */
    private static final C5132c0.d f12236h = new a();

    /* compiled from: ControllerModelList.java */
    /* renamed from: com.airbnb.epoxy.h$a */
    static class a implements C5132c0.d {
        a() {
        }

        @Override // com.airbnb.epoxy.C5132c0.d
        /* renamed from: a */
        public void mo9251a(int i2, int i3) {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }

        @Override // com.airbnb.epoxy.C5132c0.d
        /* renamed from: b */
        public void mo9252b(int i2, int i3) {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }
    }

    C5141h(int i2) {
        super(i2);
        m9241S();
    }

    /* renamed from: c0 */
    void m9295c0() {
        m9245b0(f12236h);
        m9243V();
    }
}
